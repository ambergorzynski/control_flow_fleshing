# FuzzFlesh
FuzzFlesh implements Control Flow Graph-based program generation to test decompiler toolchains in multiple languages. So far, we offer support for:
- Java decompilers CFR, JADX, and Fernflower
- Binary decompiler Ghidra
- C\# decompiler ILSpy

# Pre-requisites 
- Python 3.10

## To test Java decompilers
- JVM (tested with openjdk 19.0.2 2023-01-17)
- Jasmin 2.4, which you can download here: https://jasmin.sourceforge.net/
- json-simple-1.1.1, which you can download here: https://code.google.com/archive/p/json-simple/downloads
- rapidjson, which you can find here: https://rapidjson.org/
- Json.NET, which you can find here: https://www.newtonsoft.com/json
- CFR: https://github.com/leibnitz27/cfr
- FernFlower: https://github.com/JetBrains/intellij-community
- JADX: https://github.com/skylot/jadx

## To test binary decompilers
- Ghidra: https://github.com/NationalSecurityAgency/ghidra

## To test C# decompilers
- .NET SDK
- ILSpy: https://github.com/icsharpcode/ILSpy


# Install
Run the following commands from the root directory to set up a Python virtual environment and install the necessary packages:
```
cd $FUZZFLESH/src
python -m venv venv
source venv/bin/activate
pip install -e .
```

# Run FuzzFlesh
- Create an output directory, ideally somewhere outside of the repo
- Edit the template `scripts/run_template.sh` to point to the relevant filepaths on your machine
- Run the shell script 

# Coverage analysis
Navigate to `src/analysis/coverage`. The scripts to gather coverage for each testing tool - decompiler combination can be found within the `cpp` and `java` folders. Note that this requires a significant amount of setup and running time and the scripts are unlikely to work without adjustment on your machine. The overall coverage analysis is run as follows:
- First, activate the virtual environment `/path/to/src venv/bin/activate`
- Scripts for running each tool with coverage are found within the respective language, tool, and decompiler folders. Jacoco is used for Java coverage, while gcovr is used for C/C++ coverag.
- Once the raw coverage results are complete, analyse the results by adjusting the filepaths to your own locations as necessary and run `python coverage.py` 
- To gather unique coverage: `python diff_coverage.py`

# Bug-finding analysis
To run the bug-finding analysis you must install the JD-Tester tool from https://github.com/AIRTEspresso/DecompilerStudy 

Next, navigate to `src/analysis/head2head` and run `python head2head_jdtester.py --cfr` or `python head2head_jdtester.py --jadx`. It may be necessary to run the shell scripts manually depending on your JD-Tester installation location.
