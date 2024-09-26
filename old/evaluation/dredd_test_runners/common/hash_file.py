import hashlib


def hash_file(filename: str) -> str:
    md5_hash = hashlib.md5()
    md5_hash.update(open(filename, 'rb').read())
    return md5_hash.hexdigest()
