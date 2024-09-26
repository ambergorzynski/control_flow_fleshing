# FuzzFlesh
Compiler testing using control flow graph fleshing

# Pre-requisites 
- Python 3.10
- JVM (tested with openjdk 19.0.2 2023-01-17)
- Jasmin 2.4, which you can download here: https://jasmin.sourceforge.net/
- json-simple-1.1.1, which you can download here: https://code.google.com/archive/p/json-simple/downloads
- rapidjson, which you can find here: https://rapidjson.org/

# Install
Run the following commands from the root directory to set up a Python virtual environment and install the necessary packages:
```
cd $FUZZFLESH/src
python -m venv venv
source venv/bin/activate
pip install -e .
```

# Run
- Create an output directory, ideally somewhere outside of the repo
- Edit the template `run_template.sh' to point to the relevant filepaths on your machine
- Run the shell script 



# UROP
Things I have worked on:
- Switching paths after hotspot JIT compiled with one path to trigger deoptimization
- Created a fuzzer that produces Java code where each function represents nodes, to prevent everything being jammed in one method like in Java bytecode
- Tested the fuzzer on OpenJDK and GraalVM
- Running multiple paths concurrently to test the Thread-Safeness of the JIT compiler
- Created a hotspot log analyzer that summarizes compilation patterns, inlines, number of invocations etc.

Potential areas to look into:
- GraalVM - Less mature JVM compared to OpenJDK so higher chance of finding bugs. Uncommon traps are not being set unlike OpenJDK probably because they use different optimizations so creating a fuzzer to target GraalVM optimizations could be interesting.
    - Javabc - the compilation fails completely because of an irreducible loop when the graph size is too big. It does compile on small graphs and setting the MaxDuplicationFactor can increase that bounds.
    - Java - all the inlining is failing for small and large graphs; it could be causing an error and is getting aborted(?)
- Generating semi-complex graphs - javabc is producing an irreducible loop that is not optimizable and in the Java fuzzer, each function is too simple to cause any bugs. Creating a fuzzer that does something in between the two might exercise the JIT compiler more.
- Concurrency - I've only tested running multiple paths concurrently. If the deoptimization is dealing with values in the registers real-time during deoptimization instead of only falling back to lower tiered code, it may be complex enough to be a source of bugs
- Dynamic dispatch - having an interface and calling different child class methods should trigger optimization/deoptimization which isn't tested in the current fuzzer. 


Notes:
- Running the fuzzer with switching paths can be specified with ACTION='fuzz_with_changing_paths' in the argument
- I've renewed the wrapper to accept single or multiple paths. The normal one and multithread one are both in the root directory so copy-pasting it to the wrapper folder should switch the wrapper.
- JIT-related flags that I've used are in the java/javabc runner which is commented/uncommented to toggle
- Analyzer
    - The logs can be specified in the setup_logs function under analyze.py
    - It parses the xml and looks for tags task_queued, nmethod and task with method names that start with "TestCase"
    - The tags are linked by compile_id to gather the statistics
    - Occasionally, the hotspot log emits data in the <![CDATA[ ]]> under fragment tag and if important information is emitted there, the parser fails to find it and crashes sometimes. The information inside these tags is sometimes incomplete as well so I didn't know how to handle it so I just reran the fuzzer in case that happened.
