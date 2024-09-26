testing=$1
test_name=$2
ilspy_path=$3

${ilspy_path}/ilspycmd ${testing}/${test_name}.exe -o ${testing}/${test_name}_decomp
