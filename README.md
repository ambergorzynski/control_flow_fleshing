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

