testing=$1
test_name=$2

# recompile the decompiled .cs code
csc ${testing}/${test_name}_decomp/${test_name}.decompiled.cs

# rename so that reflection works
mv ${testing}/${test_name}_decomp/${test_name}.decompiled.exe ${testing}/${test_name}_decomp/${test_name}.exe

