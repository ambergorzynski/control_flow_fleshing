import subprocess
import os
import signal
from datetime import datetime, timedelta

def run_process(cmd):
        
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

def javabc():

    cmd = './run_javabc_lab.sh throughput'

    run_process(cmd)


def llvm():
    cmd = './run_llvm.sh'
    run_process(cmd)

def cil():
    pass

def c():
    cmd = './run_c_clang.sh'
    run_process(cmd)

def main():
    c()

if __name__=="__main__":
    main()