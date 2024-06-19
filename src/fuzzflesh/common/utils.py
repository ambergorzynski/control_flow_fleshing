from enum import Enum

class Lang(Enum):
    JAVABC = 1
    C = 2

class Compiler(Enum):
    CFR = 1
    FERNFLOWER = 2
    PROCYON = 3
    GRAALVM = 4
    HOTSPOT = 5