
.class public testing.TestCase
.super java/lang/Object

; default constructor
.method public <init>()V
    aload_0
    invokespecial java/lang/Object/<init>()V
    return
.end method

.method public static testCase([I[I)V
    .limit stack 5
    .limit locals 4

block_0:
    ; set up counter in local variable 2
    iconst_0
    istore_2

    ; set up directions counter in local variable 3
    iconst_0
    istore_3    

    ; store node label in output array
    aload_1
    iload_2
    bipush 0
    iastore

    ; increment counter
    iinc 2 1

    goto block_1
        

block_1: 
    ; store node label in output array
    aload_1
    iload_2
    bipush 1
    iastore

    ; increment counter
    iinc 2 1

    ; get directions for node
    aload_0
    iload_3
    iaload

    ; increment directions counter
    iinc 3 1

    ; switch
    lookupswitch
        0: block_2
        1: block_3
        2: block_4
        default : block_2

block_2: 
    ; store node label in output array
    aload_1
    iload_2
    bipush 2
    iastore

    ; increment counter
    iinc 2 1

    goto block_5
        

block_3: 
    ; store node label in output array
    aload_1
    iload_2
    bipush 3
    iastore

    ; increment counter
    iinc 2 1

    goto block_5
        

block_4: 
    ; store node label in output array
    aload_1
    iload_2
    bipush 4
    iastore

    ; increment counter
    iinc 2 1

    goto block_5
        

block_5: 
    ; store node label in output array
    aload_1
    iload_2
    bipush 5
    iastore

    ; increment counter
    iinc 2 1

    return
        
.end method