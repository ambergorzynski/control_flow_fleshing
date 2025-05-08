# FuzzFlesh ECOOP 2025 Artifact
FuzzFlesh implements Control Flow Graph-based program generation to test decompiler toolchains in multiple languages. 

# Quick-start

A built image based on `docker/Dockerfile` is available. Use the following to run the container in interactive mode:
```
docker pull agg22/fuzzflesh-ecoop-2025
docker run -it agg22/fuzzflesh-ecoop-2025 bash
```

We provide the following options for reproducing our results based on your available resources:

## *Fast* Reproduce results from data gathered during our experiments 
```
cd /data/dev/fuzzflesh
/data/dev/fuzzflesh/scripts/evaluation/00_run_results_reproduction.sh
```

## *Slow* Run experiments from scratch
Replicating the coverage analysis from scratch requires a significant amount of time to run. The Java decompiler code coverage requires a total of 96 hours which comprises 8 hours for each of the following: FuzzFlesh in two configurations to test three decompilers (so 6 sets of 8 hour-runs) and JD-Tester in two configurations to test three decompilers (an additional 6 sets of 8 hour-runs). The C decompiler code coverage requires a total of 18 hours for FuzzFlesh (two configurations) and DecFuzzer to test Ghidra. We provide the specification for the machine used for our 8 hour runs above.

It is possible to set an alternative time limit for a reduced version of the FuzzFlesh coverage analysis. We provide scripts to do so in the following locations (not included in the push-button evaluation so that you can set your preferred time budget based on your resources). The default time limit within the top-level script is set to 1 minute to allow for a quick start-up check, but this can be changed to run a longer analysis. Note that even with a 1 minute fuzzer time limit, the full evaluation script takes in the region of 30 minutes to run due to the results analysis and re-building of software required for this.

```
/data/dev/fuzzflesh/scripts/evaluation/01_run_full_evaluation.sh
```
# Use FuzzFlesh
We provide some examples of how to use FuzzFlesh in the following overall script:
```
/data/dev/fuzzflesh/scripts/evaluation/02_run_fuzzflesh.sh
```

The component scripts contain user-configurable parameters. For example, to run FuzzFlesh in fuzzing mode on the binary-to-C decompiler Ghidra:
```
cd /data/dev/fuzzflesh
./scripts/run_ghidra.sh
```

To run FuzzFlesh in fuzzing mode on the Java decompiler CFR:
```
cd /data/dev/fuzzflesh
./scripts/run_cfr.sh
```

# Extend FuzzFlesh to a new language
Extending FuzzFlesh to an additional language is straightforward. Implement the following:
- Add a new language directory to `src/fuzzflesh/program_generator`
- Implement the abstract class `ProgramFlesher` which is in `src/fuzzflesh/program_generator/flesher.py`
- Add your language to `src/fuzzflesh/__main__.py`. It should only be necessary to add the language to the subparser arguments (following the format of the existing languages), and to the `Lang` class in `src/fuzzflesh/common/utils.py`

You should now be able to use FuzzFlesh in 'gen' mode to produce programs in your target language. To fuzz a decompiler in your language, you should implement the following:
- Add a new language directory to `src/fuzzflesh/harness`
- Implement the abstract class `Runner` which is in `src/fuzzflesh/harness/runner.py`
- Add the filepaths required for your decompiler to the relevant argument subparser in `src/fuzzflesh/__main__.py`, and add the decompiler to the `Compiler` class in `src/fuzzflesh/common/utils.py`

# License
Copyright 2025 Amber Gorzynski

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.