import os
import signal
import subprocess

from typing import AnyStr, Dict, List, Optional


class ProcessResult:
    def __init__(self, returncode: int, stdout: bytes, stderr: bytes):
        self.returncode: int = returncode
        self.stdout: bytes = stdout
        self.stderr: bytes = stderr


def run_process_with_timeout(cmd: List[str], timeout_seconds: int, env: Optional[Dict[AnyStr, AnyStr]] = None) ->\
        Optional[ProcessResult]:
    process = None
    try:
        process = subprocess.Popen(cmd, start_new_session=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, env=env)
        process_stdout, process_stderr = process.communicate(timeout=timeout_seconds)
        return ProcessResult(returncode=process.returncode, stdout=process_stdout, stderr=process_stderr)
    except subprocess.TimeoutExpired:
        os.killpg(os.getpgid(process.pid), signal.SIGTERM)
        return None
