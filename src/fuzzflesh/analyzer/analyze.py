import xml.etree.ElementTree as ET
from xml.etree.ElementTree import ElementTree, Element
import json
import re
import numpy as np

METHOD              = 'method'
TASK_QUEUED         = 'task_queued'
TASK                = 'task'
MAKE_NOT_ENTRANT    = 'make_not_entrant'
NMETHOD             = 'nmethod'
COMPILE_ID          = 'compile_id'
LEVEL               = 'level'
IICOUNT             = 'iicount'
STAMP               = 'stamp' 
UNCOMMON_TRAP       = 'uncommon_trap'
REASON              = 'reason'
FAILURE             = 'failure'
COMPILATION_PATTERN = 'compilation pattern'
COMPILATION         = 'compilation'
INVOCATION_QUEUED   = 'invocations till queued'
TIME_QUEUED         = 'time stamp queued'
INVOCATION_COMPILED = 'invocations till compiled'
TIME_COMPILED       = 'time stamp compiled'
UNCOMMON_TRAPS      = 'uncommon traps'
COMPILATION_DETAILS = 'compilation details'
FAILURE_REASON      = 'failure reason'
TIME_STAMP          = 'time stamp'
NAME                = 'name'
INLINE_SUCCESS      = 'inline_success'
INLINE_FAILURE      = 'inline_fail'
INLINE              = 'inline'
FAILED_INLINE       = 'failed inline'
PARSE               = 'parse'
FRAGMENT            = 'fragment'

MEAN     = 'mean'
MEDIAN   = 'median'
MIN      = 'min'
MAX      = 'max'
STDEV    = 'standard deviation'


class Data:
    def __init__(self):
        self.filepath: str = ''
        self.compiler: str = ''
        self.single_threaded: bool = True
        self.jit_compiled: bool = False
        self.deoptimized: bool = False
        self.number_of_failed_compilation: int = 0
        self.inline_count: int = 0
        self.failed_inline_count: int = 0
        self.compilation_count: dict = {}
        self.compilation_patterns: dict = {}
        self.uncommon_traps_count: dict = {}
        self.invocation_queued_level: dict = {}
        self.invocation_compiled_level: dict  = {}
    
    def to_dict(self) -> dict:
        return {
            'file path': self.filepath,
            'compiler': self.compiler,
            'single threaded': self.single_threaded,
            'deoptimized': self.deoptimized,
            'number of failed compilation': self.number_of_failed_compilation,
            'number of successful inline': self.inline_count,
            'number of failed inline': self.failed_inline_count,
            'frequency of compilation at each level': self.compilation_count,
            'frequency of each compilation pattern': self.compilation_patterns,
            'frequency of each uncommon trap': self.uncommon_traps_count,
            'stats on number of invocation until method gets added to compile queue': self.invocation_queued_level,
            'stats on number of invocation until method gets compiled': self.invocation_compiled_level,

        }
    
class Compilation:
    def __init__(self):
        self.method_name: str = ''
        self.queued_task: Element = None
        self.compiled_task: Element = None
        self.nmethod: Element = None
        self.make_not_entrant: Element = None



class Log:
    def __init__(self, 
            _filepath: str,
            _compiler_name: str,
            _single_threaded: bool):
    
        self.filepath: str = _filepath
        self.compiler_name: str = _compiler_name
        self.single_threaded: bool = _single_threaded
    
    def analyze(self, index: int, output_dir: str) -> dict:
        tree = ET.parse(self.filepath)

        is_method_in_test_case = lambda task: task.attrib[METHOD].startswith('TestCase')

        # Get a list of elements with tag task_queued and is a meber function of TestCase class
        queued_tasks = list(filter(is_method_in_test_case, tree.iter(TASK_QUEUED)))

        # Get a list of elements with tag task and is a meber function of TestCase class
        compiled_tasks = list(filter(is_method_in_test_case, tree.iter(TASK)))

        # Get a list of elements with tag nmethod and is a meber function of TestCase class
        nmethods = list(filter(is_method_in_test_case, tree.iter(NMETHOD)))

        # Dictionary of compile_id to compilation object which stores queued_task, compiled_task, etc.
        compilation_dict = {}

        # Set up compile id to method dictionary
        for task in queued_tasks:
            match = re.search(r"TestCase (.*?) .*", task.attrib[METHOD])
            method_name = match.group(1)
            compile_id = task.attrib[COMPILE_ID]
            
            level = Compilation()
            level.method_name = method_name
            level.queued_task = task

            compilation_dict[compile_id] = level

        for task in compiled_tasks:
            compile_id = task.attrib[COMPILE_ID]
            compilation_dict[compile_id].compiled_task = task
        
        for task in nmethods:
            compile_id = task.attrib[COMPILE_ID]
            compilation_dict[compile_id].nmethod = task

        make_not_entrants = list(filter(lambda task: task.attrib[COMPILE_ID] in compilation_dict, tree.iter(MAKE_NOT_ENTRANT)))
        
        for task in make_not_entrants:
            compile_id = task.attrib[COMPILE_ID]
            compilation_dict[compile_id].make_not_entrant = task


        # Store processed log
        intermediate = {}

        for id, compilation in compilation_dict.items():
            method = intermediate.setdefault(compilation.method_name, {})
            if compilation.nmethod is not None:
                level = compilation.nmethod.attrib[LEVEL]
                method.setdefault(COMPILATION_PATTERN, []).append(level)

                compilation_details = {
                    COMPILATION: level,
                    INVOCATION_QUEUED: int(compilation.queued_task.attrib[IICOUNT]),
                    TIME_QUEUED: float(compilation.queued_task.attrib[STAMP]),
                    INVOCATION_COMPILED: int(compilation.compiled_task.attrib[IICOUNT]),
                    TIME_COMPILED: float(compilation.compiled_task.attrib[STAMP])
                }

                # Handle uncommon traps
                traps = list(compilation.compiled_task.iter(UNCOMMON_TRAP))

                if traps:
                    traps_dict = {}

                    for trap in traps:
                        trap_name = trap.attrib[REASON]
                        traps_dict.setdefault(trap_name, 0)
                        traps_dict[trap_name] += 1
                    
                    compilation_details[UNCOMMON_TRAPS] = traps_dict
                
                # Handle inlining
                iter = compilation.compiled_task.iter()

                for element in iter: 
                    if element.tag == PARSE:
                        break

                for element in iter:
                    if element.tag == METHOD:
                        method_name = element.attrib[NAME]
                        while element.tag not in [INLINE_SUCCESS, INLINE_FAILURE]:
                            element = next(iter)
                        
                        if element.tag == INLINE_SUCCESS:
                            compilation_details.setdefault(INLINE, []).append(method_name)
                        else:
                            compilation_details.setdefault(FAILED_INLINE, []).append(method_name)


                method.setdefault(COMPILATION_DETAILS, []).append(compilation_details)
            else:
                level = (compilation.compiled_task.attrib[LEVEL] if LEVEL in compilation.compiled_task.attrib else '4') + ' (failed)'
                method.setdefault(COMPILATION_PATTERN, []).append(level)

                compilation_details = {
                    COMPILATION: level
                }
                compilation_details[FAILURE_REASON] = compilation.compiled_task.find(FAILURE).attrib[REASON]
                compilation_details[TIME_STAMP] = float(compilation.compiled_task.attrib[STAMP])

                method.setdefault(COMPILATION_DETAILS, []).append(compilation_details)
            
            if compilation.make_not_entrant is not None:
                level = compilation.make_not_entrant.attrib[LEVEL] + " (made not entrant)"
                method.setdefault(COMPILATION_PATTERN, []).append(level)

                compilation_details = {
                    COMPILATION: level
                }
                compilation_details[TIME_STAMP] = float(compilation.make_not_entrant.attrib[STAMP])

                method.setdefault(COMPILATION_DETAILS, []).append(compilation_details)


        
        # for key, val in data.items():
        #     print(key + ": " +str(val))

        intermediate_file = output_dir + f'/intermediate_{index}.json'
        with open(intermediate_file, 'w') as file:
            json.dump(intermediate, file, indent = 4)



        # Calculate statistics based on the processed log
        data = Data()
        data.filepath = self.filepath
        data.compiler = self.compiler_name
        data.single_threaded = self.single_threaded
        data.jit_compiled = len(queued_tasks) != 0
        data.deoptimized = len(make_not_entrants) != 0
        data.number_of_failed_compilation = 0

        invocation_queued_dict = {}
        invocation_compiled_dict = {}

        for _, method in intermediate.items():
            for compilation_details in method[COMPILATION_DETAILS]:
                compilation = compilation_details[COMPILATION]

                data.compilation_count.setdefault(compilation, 0)
                data.compilation_count[compilation] += 1

                if compilation.endswith("(failed)"):
                    data.number_of_failed_compilation += 1

                if INVOCATION_QUEUED in compilation_details:
                    invocation_queued_dict.setdefault(compilation, []).append(compilation_details[INVOCATION_QUEUED])
                if INVOCATION_COMPILED in compilation_details:
                    invocation_compiled_dict.setdefault(compilation, []).append(compilation_details[INVOCATION_COMPILED])
                
                if UNCOMMON_TRAPS in compilation_details:
                    for uncommon_trap, count in compilation_details[UNCOMMON_TRAPS].items():
                        data.uncommon_traps_count.setdefault(uncommon_trap, 0)
                        data.uncommon_traps_count[uncommon_trap] += count
                
                if INLINE in compilation_details:
                    data.inline_count += len(compilation_details[INLINE])
                if FAILED_INLINE in compilation_details:
                    data.failed_inline_count += len(compilation_details[FAILED_INLINE])

            compilation_pattern = ', '.join(method[COMPILATION_PATTERN])
            data.compilation_patterns.setdefault(compilation_pattern, 0)
            data.compilation_patterns[compilation_pattern] += 1

        for compilation, invocation_queued in invocation_queued_dict.items():
            stats = {
                MEAN: np.average(invocation_queued),
                MEDIAN: np.median(invocation_queued),
                MIN: int(np.min(invocation_queued)),
                MAX: int(np.max(invocation_queued)),
                STDEV: np.std(invocation_queued)
            }

            data.invocation_queued_level[compilation] = stats

        for compilation, invocation_compiled in invocation_compiled_dict.items():
            stats = {
                MEAN: np.average(invocation_compiled),
                MEDIAN: np.median(invocation_compiled),
                MIN: int(np.min(invocation_compiled)),
                MAX: int(np.max(invocation_compiled)),
                STDEV: np.std(invocation_compiled)
            }

            data.invocation_compiled_level[compilation] = stats

        return data.to_dict()


def setup_logs():    
    logs: list[Log] = [
        Log('/homes/rk1923/control_flow_fleshing/java_change_dir/out/graph_0/prog_0/hotspot.log', 'OpenJDK', True),
        Log('/homes/rk1923/control_flow_fleshing/java_change_dir_concurrent/out/graph_0/prog_0/hotspot.log', 'OpenJDK', False),
        Log('/homes/rk1923/control_flow_fleshing/java_change_dir_graal/out/graph_0/prog_0/hotspot.log', 'graalVM', True),
        Log('/homes/rk1923/control_flow_fleshing/java_change_dir_graal_concurrent/out/graph_0/prog_0/hotspot.log', 'graalVM', False),
        Log('/homes/rk1923/control_flow_fleshing/java_change_dir_graal_small/out/graph_0/prog_0/hotspot.log', 'graalVM', True),
        Log('/homes/rk1923/control_flow_fleshing/javabc_change_dir/out/graph_0/prog_0/hotspot.log', 'OpenJDK', True),
        Log('/homes/rk1923/control_flow_fleshing/javabc_change_dir_graal/out/graph_0/prog_0/hotspot.log', 'graalVM', True),
        Log('/homes/rk1923/control_flow_fleshing/javabc_change_dir_graal_small/out/graph_0/prog_0/hotspot.log', 'graalVM', True),
    ]


    output_dir = '/homes/rk1923/control_flow_fleshing/analysis'
    
    analyses = []
    for index, log in enumerate(logs):
        analyses.append(log.analyze(index, output_dir))

    output_file = output_dir + '/analysis.json'
    with open(output_file, 'w') as file:
        json.dump(analyses, file, indent = 4)

if __name__ == "__main__":
    setup_logs()