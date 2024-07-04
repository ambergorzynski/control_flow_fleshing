testing=$1
test_name=$2

# recompile the decompiled .cs code
csc ${testing}/${test_name}_decomp/${test_name}.decompiled.cs -out:${testing}/${test_name}_decomp/${test_name}.exe
