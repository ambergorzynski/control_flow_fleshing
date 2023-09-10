import subprocess
import os
import signal
from datetime import datetime, timedelta

def run_process(cmd, outname):
        
    counter = 0

    stop_time = datetime.now().timestamp() + (60*30)

    print(stop_time)

    while(datetime.now().timestamp() < stop_time):
        
        timeout_seconds = stop_time - datetime.now().timestamp()
        print(timeout_seconds)

        try:
            process = subprocess.Popen(cmd, shell=True)
            process_stdout, process_stderr = process.communicate(timeout=timeout_seconds)

            counter += 1
            print(f'throughput counter: {counter}')
        except subprocess.TimeoutExpired:
            print(f'FINAL number of executions of {outname} 1 graph and 100 paths is: {counter}')
            
            with open(f'{outname}.txt', 'w') as f:
                f.write(f'FINAL number of executions of {outname} 1 graph and 100 paths is: {counter}')

            os.killpg(os.getpgid(process.pid), signal.SIGTERM)
        
        print(f'total number of executions of {outname} 1 graph and 100 paths is: {counter}')

    print(f'FINAL number of executions of 1 graph and 100 paths is: {counter}')
    with open(f'{outname}.txt', 'w') as f:
        f.write(f'FINAL number of executions of {outname} 1 graph and 100 paths is: {counter}')


def javabc():

    cmd = './run_javabc_lab.sh throughput'
    outname = 'javabc'

    run_process(cmd, outname)

def javabc_unknown():

    cmd = './run_javabc_lab_unknown.sh throughput_unknown'
    outname = 'javabc_unknown'

    run_process(cmd, outname)

def javabc_cfr():

    cmd = './run_javabc_decomp_lab.sh throughput'
    outname = 'javabc_cfr'

    run_process(cmd, outname)

def javabc_fernflower():

    cmd = './run_java_fernflower.sh'
    outname = 'javabc_fernflower'

    run_process(cmd, outname)

def llvm():
    cmd = './run_llvm.sh'
    outname = 'llvm'

    run_process(cmd, outname)

def llvm_unknown():
    cmd = './llvm_unknown.sh'
    outname = 'llvm_unknown'

    run_process(cmd, outname)

def graalvmllvm():

    cmd = './run_llvm_graalvm_mac.sh throughput'
    outname = 'graalvmllvm'

    run_process(cmd, outname)

def java_graalvm():

    cmd = './run_javabc_lab_graalvm.sh throughput_graalbc'
    outname = 'graalvm_javabc'

    run_process(cmd, outname)

def cil():
    cmd = './run_cil_mac.sh'
    outname = 'cil'

    run_process(cmd, outname)


def c_clang():
    cmd = './run_c_clang.sh'
    outname = 'c_clang'

    run_process(cmd, outname)

def c_gcc():
    cmd = './run_c_gcc.sh'
    outname = 'c_gcc'

    run_process(cmd, outname)

def main():
    c_gcc()

if __name__=="__main__":
    main()