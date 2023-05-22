
define void @_Z7run_cfgPiS_(i32* %0, i32* %1) #0 {

  ;%3 = alloca i32*, align 8
  ;%4 = alloca i32*, align 8
  ;store i32* %0, i32** %3, align 8
  ;store i32* %1, i32** %4, align 8
  
  ;%5 = load i32*, i32** %4, align 8
  ;%6 = getelementptr inbounds i32, i32* %5, i64 0
  ;store i32 0, i32* %6, align 4
  
  ;%7 = load i32*, i32** %4, align 8
  ;%8 = getelementptr inbounds i32, i32* %7, i64 1
  ;store i32 1, i32* %8, align 4
  
  ;%9 = load i32*, i32** %4, align 8
  ;%10 = getelementptr inbounds i32, i32* %9, i64 2
  ;store i32 2, i32* %10, align 4
  
  ;%11 = load i32*, i32** %4, align 8
  ;%12 = getelementptr inbounds i32, i32* %11, i64 3
  ;store i32 7, i32* %12, align 4

2:
	; create arrays to store directions and output
	%directions = alloca i32*
	%output = alloca i32*

	store i32* %0, i32** %directions
	store i32* %1, i32** %output

	%counter = alloca i32
	store i32 0, i32* %counter

	br label %3

3:
	%output_1 = load i32*, i32** %output
	%output_1_ptr = getelementptr inbounds i32, i32* %output_1, i64 0
	store i32 5, i32* %output_1_ptr


  ret void
}

