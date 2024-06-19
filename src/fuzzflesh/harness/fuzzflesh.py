import argparse 
import os
import subprocess

from enum import Enum
from pathlib import Path

class Lang(Enum):
    JAVABC = 1
    C = 2

class Compiler(Enum):
    CFR = 1
    FERNFLOWER = 2
    PROCYON = 3
    GRAALVM = 4
    HOTSPOT = 5

def main():
    parser = argparse.ArgumentParser()

    # Common parser args
    parser.add_argument("action", choices=['gen', 'run'])

    parser.add_argument("-base",
                        type = str,
                        default = os.getcwd(),
                        help = 'Base path for output.')
    parser.add_argument("-graphs", 
                        type=int,
                        default = 1,
                        help = 'Number of graphs.')
    parser.add_argument("-paths", 
                        type=int,
                        default = 1,
                        help = 'Number of paths.')  
    parser.add_argument("-size", 
                        type=int,
                        default = 500,
                        help = 'Maximum graph size.')    
    parser.add_argument("-graph_gen", 
                        choices=['e-r','grow'],
                        default = 'e-r',
                        help = 'Graph generation approach: Erdős–Rényi (e-r) or growing.')
    parser.add_argument("-successors", 
                        type=int, 
                        default=3,
                        help="max successor nodes added during graph generation")
    parser.add_argument("-no_annotations", 
                        action=argparse.BooleanOptionalAction,
                        help = 'Do not add annotated edges to the graph.')
    parser.add_argument("-dirs", 
                        action=argparse.BooleanOptionalAction,
                        help = 'Directions are known at compile time.')
    parser.add_argument("--no_tidy",action=argparse.BooleanOptionalAction,
                        help="specifies whether to remove files if test passes")

    # Subparser for language-specific arguments
    subparsers = parser.add_subparsers(dest='language',
                        help='Language to run',
                        required=True)

    # Java bytecode parser args
    javabc_parser = subparsers.add_parser('javabc',
                    help='Java bytecode help')
    javabc_parser.add_argument("compiler",
                        choices=['cfr','fernflower','procyon','hotspot','graalvm'],
                        help='Compiler / decompiler toolchain under test.')
    javabc_parser.add_argument("jvm", 
                        type=str,
                        help="Path to JVM to be used")
    parser.add_argument("jasmin", 
                        type=str,
                        help="Path to Jasmin to be used")
    parser.add_argument("compiler_path", 
                        type=str, 
                        help="Path to the (de)compiler")  
    parser.add_argument("-reflection", 
                        action=argparse.BooleanOptionalAction,
                        help='Use reflection instead of static compilation.')
    
    args = parser.parse_args()

    language : Lang = Lang[args.language.upper()]
    compiler : Compiler = Compiler[args.compiler.upper()]
    base_dir : Path = Path(args.base)

    # Create structs

    # Create folders
    if not create_folders(base_dir, language):
        return(1)

    # Generate graph

    # Generate path

    # Flesh graphs

    # Run tests

    # Cleanup
    
def create_folders(base_dir : Path, language : Lang) -> bool:

    print('Setting up folders...')

    match language:
        case Lang.JAVABC:
            return create_javabc_folders(base_dir)
        case Lang.C:
            return create_c_folders(base_dir)
    
    return False

def create_javabc_folders(base_dir : Path) -> bool:

    base_dir.mkdir(exist_ok=True)
    Path(base_dir,'out').mkdir(exist_ok=True)
    Path(base_dir,'out/graphs').mkdir(exist_ok=True)
    Path(base_dir,'out/output').mkdir(exist_ok=True)
    Path(base_dir,'out/paths').mkdir(exist_ok=True)
    Path(base_dir,'out/testing').mkdir(exist_ok=True)

    # Put the wrapper in the relevant folder
    wrapper_dir = Path(__file__).parent.parent.resolve() / 'wrappers'
    cmd = ['cp',
        f'{wrapper_dir}/WrapperNoReflection.java',
        f'{base_dir}/out/WrapperNoReflection.java']
    
    result = subprocess.run(cmd)

    return True if result.returncode != 0 else False
    
if __name__ == "__main__":
    main()