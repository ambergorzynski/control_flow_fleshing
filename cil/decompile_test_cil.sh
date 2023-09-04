testing=$1
test_name=$2

#TODO: pass ilspy path as parameter instead of hardcoding
ilspy_path='/Users/ambergorzynski/.dotnet/tools'

${ilspy_path}/ilspycmd ${testing}/${test_name}.exe -o ${testing}/${test_name}_decomp
