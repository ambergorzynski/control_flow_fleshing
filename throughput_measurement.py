import subprocess
import os
import signal
from datetime import datetime, timedelta

def run_process(cmd, outname):
        
    counter = 0

    stop_time = datetime.now().timestamp() + (60*60)

    print(stop_time)

    while(datetime.now().timestamp() < stop_time):
        
        timeout_seconds = stop_time - datetime.now().timestamp()
        print(timeout_seconds)

        try:
            process = subprocess.Popen(cmd, shell=True)
            process_stdout, process_stderr = process.communicate(timeout=timeout_seconds)

            counter += 1
        except subprocess.TimeoutExpired:
            os.killpg(os.getpgid(process.pid), signal.SIGTERM)
        
        print(f'total number of executions of 1 graph and 100 paths is: {counter}')

    print(f'FINAL number of executions of 1 graph and 100 paths is: {counter}')
    with open('{outname}.txt', 'w') as f:
        f.write('readme')


def javabc():

    cmd = './run_javabc_lab.sh throughput'
    outname = 'javabc'

    run_process(cmd, outname)


def llvm():
    cmd = './run_llvm.sh'
    outname = 'llvm'

    run_process(cmd, outname)

def cil():
    pass

def c():
    cmd = './run_c_clang.sh'
    outname = 'c'

    run_process(cmd, outname)

def main():
    c()

if __name__=="__main__":
    main()