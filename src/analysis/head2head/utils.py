from pathlib import Path 
import subprocess
import os 

# Anonymised commits for review
jadx_commits = {
    'initial' : '87e0e5b',
    'pre_fix1' : '5c83c22', # code still contains issue 2274
    'fix1' : '699ceb1'  # issue 2274 (ff)
}

cfr_commits = {
    'initial' : '68477be',
    'pre_fix1' : 'd6f6758',
    'fix1' : '3d1d0f4'
}

def checkout_cfr(commit):
    get_commit_cmd = ['git', 'checkout', commit]
    result = subprocess.run(get_commit_cmd, cwd=cfr)
    
    if result.returncode != 0:
        print('Checkout fail!')
        return False

def build_cfr(cfr : Path, commit : str, jdtester_location = None, checkout = False):

    if checkout:
        checkout_cfr(commit)

    env = os.environ.copy()
    java = f'/usr/lib/jvm/java-1.11.0-openjdk-amd64'
    env['JAVA_HOME'] = java
    path = os.environ['PATH']
    env['PATH'] = f'{java}/bin:{path}'

    build_cfr_cmd = ['mvn', 'compile']
    result = subprocess.run(build_cfr_cmd, cwd=cfr, env=env)
    
    if result.returncode != 0:
        print('Build fail!')
        return False

    # copy to jdtester location
    if jdtester_location is not None:
        copy_cmd = ['cp', f'{cfr}/target/cfr-0.153-SNAPSHOT.jar', f'{jdtester_location}/cfr.jar']
        result = subprocess.run(copy_cmd)
        if result.returncode != 0:
            print('Copy fail!')
            return False

def build_jadx(jadx : Path, commit : str, jdk : int, jdtester_location = None):
    
    get_commit_cmd = ['git', 'checkout', commit]
    result = subprocess.run(get_commit_cmd, cwd=jadx)
    
    if result.returncode != 0:
        print('Checkout fail!')
        return False

    env = os.environ.copy()
    java = f'/usr/lib/jvm/java-1.{jdk}.0-openjdk-amd64'
    env['JAVA_HOME'] = java
    path = os.environ['PATH']
    env['PATH'] = f'{java}/bin:{path}'
    
    build_jadx_cmd = ['./gradlew', 'dist']
    result = subprocess.run(build_jadx_cmd, cwd=jadx, env=env)
    
    if result.returncode != 0:
        print('Build fail!')
        return False

    # copy to jdtester location
    if jdtester_location is not None:
        copy_cmd = ['cp', '-r', f'{jadx}/build/jadx', f'{jdtester_location}/']
        result = subprocess.run(copy_cmd)
        if result.returncode != 0:
            print('Copy fail!')
            return False

    return True
