import argparse 
import os

def main():
    parser = argparse.ArgumentParser()
    subparsers = parser.add_subparsers(dest='command',
                        help='Commands to run',
                        required=True)

    # Common parser args
    parser.add_argument("action", choices=['gen', 'run'])

    parser.add_argument("-path",
                        type = str,
                        default = os.getcwd(),
                        help = 'Base path for output.')
    parser.add_argument("-graphs", 
                        type=int,
                        default = 1,
                        help = 'Number of graphs.')
    parser.add_argument("-paths", 
                        type=int,
                        default = 1,
                        help = 'Number of paths.')  
    parser.add_argument("-size", 
                        type=int,
                        default = 500,
                        help = 'Maximum graph size.')    
    parser.add_argument("-graph_gen", 
                        choices=['e-r','grow'],
                        default = 'e-r',
                        help = 'Graph generation approach: Erdős–Rényi (e-r) or growing.')
    parser.add_argument("-successors", 
                        type=int, 
                        default=3,
                        help="max successor nodes added during graph generation")
    arser.add_argument("-no_annotations", 
                        action = BooleanOptionalAction,
                        help = 'Do not add annotated edges to the graph.')
    parser.add_argument("-dirs", 
                        action=argparse.BooleanOptionalAction,
                        help = 'Directions are known at compile time.')
    parser.add_argument("--no_tidy",action=argparse.BooleanOptionalAction,
                        help="specifies whether to remove files if test passes")


    # Java bytecode parser args
    javabc_parser = subparsers.add_parser('javabc',
                    help='Java bytecode help')
    javabc_parser.add_argument("(de)compiler",
                        choices=['cfr','fernflower','procyon','hotspot','graalvm'],
                        help='Compiler / decompiler toolchain under test.')
    javabc_parser.add_argument("jvm", 
                        type=str,
                        help="Path to JVM to be used")
    parser.add_argument("jasmin", 
                        type=str,
                        help="Path to Jasmin to be used")
    parser.add_argument("path", 
                        type=str, 
                        help="Path to the (de)compiler")  
    parser.add_argument("-reflection", 
                        action=argparse.BooleanOptionalAction,
                        help='Use reflection instead of static compilation.')
    
    args = parser.parse_args()

    
    
