.class public Greeter
.super java/lang/Object

; default constructor
.method public <init>()V
   aload_0 ; push this
   invokespecial java/lang/Object/<init>()V ; call super
   return
.end method

.method public static main([Ljava/lang/String;)V

   ; allocate stack big enough to hold 2 items
   .limit stack 2
   
   ; push java.lang.System.out (type PrintStream)
   getstatic java/lang/System/out Ljava/io/PrintStream;
   
   ; push string to be printed
   ldc "Hello World"
   
   ; invoke println
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   
   ; terminate main
   return

.end method
