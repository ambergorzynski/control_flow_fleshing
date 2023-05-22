
define void @_Z7run_cfgPiS_(i32* %in_directions, i32* %in_output) #0 {

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

0:
	; create arrays to store directions & output
	%directions = alloca i32*
	%output = alloca i32*

	store i32* %in_directions, i32** %directions
	store i32* %in_output, i32** %output

	%counter = alloca i32
	store i32 0, i32* %counter

	br label %1

1:
	%index_1 = load i32, i32* %counter
	%output_1 = load i32*, i32** %output
	%output_1_ptr = getelementptr inbounds i32, i32* %output_1, i32 %index_1
	store i32 1, i32* %output_1_ptr
	; increment counter
	%temp_1_1 = add i32 %index_1, 1
	store i32 %temp_1_1, i32* %counter
	br label %2

2:
	%index_2 = load i32, i32* %counter
	%output_2 = load i32*, i32** %output
	%output_2_ptr = getelementptr inbounds i32, i32* %output_2, i32 %index_2
	store i32 2, i32* %output_2_ptr
	; increment counter
	%temp_2_1 = add i32 %index_2, 1
	store i32 %temp_2_1, i32* %counter
	br label %3

3:
	%index_3 = load i32, i32* %counter
	%output_3 = load i32*, i32** %output
	%output_3_ptr = getelementptr inbounds i32, i32* %output_3, i32 %index_3
	store i32 3, i32* %output_3_ptr
	; increment counter
	%temp_3_1 = add i32 %index_3, 1
	store i32 %temp_3_1, i32* %counter
	br label %4

4:
	%index_4 = load i32, i32* %counter
	%output_4 = load i32*, i32** %output
	%output_4_ptr = getelementptr inbounds i32, i32* %output_4, i32 %index_4
	store i32 4, i32* %output_4_ptr
	; increment counter
	%temp_4_1 = add i32 %index_4, 1
	store i32 %temp_4_1, i32* %counter





  ret void
}

