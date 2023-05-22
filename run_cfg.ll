
define void @_Z7run_cfgPiS_(i32* %in_directions, i32* %in_output) #0 {

0:
	; create arrays to store directions & output
	%directions = alloca i32*
	%output = alloca i32*

	store i32* %in_directions, i32** %directions
	store i32* %in_output, i32** %output

	%counter = alloca i32
	store i32 0, i32* %counter

	%dir_counter = alloca i32
	store i32 0, i32* %dir_counter

	br label %1

1:
	; store node label in output array
	%index_1 = load i32, i32* %counter
	%output_1 = load i32*, i32** %output
	%output_1_ptr = getelementptr inbounds i32, i32* %output_1, i32 %index_1
	store i32 1, i32* %output_1_ptr
	
	; increment counter
	%temp_1_1 = add i32 %index_1, 1
	store i32 %temp_1_1, i32* %counter
	
	; get directions for node
	%index_dir_1 = load i32, i32* %dir_counter
	%dir_1 = load i32*, i32** %directions
	%dir_1_ptr = getelementptr inbounds i32, i32* %dir_1, i32 %index_dir_1
	%dir_1_value = load i32, i32* %dir_1_ptr

	; increment directions counter
	%temp_1_2 = add i32 %index_dir_1, 1
	store i32 %temp_1_2, i32* %dir_counter

	; branch
	%condition = icmp eq i32 %dir_1_value, 0
	br i1 %condition, label %2, label %3

2:
	%index_2 = load i32, i32* %counter
	%output_2 = load i32*, i32** %output
	%output_2_ptr = getelementptr inbounds i32, i32* %output_2, i32 %index_2
	store i32 2, i32* %output_2_ptr
	; increment counter
	%temp_2_1 = add i32 %index_2, 1
	store i32 %temp_2_1, i32* %counter
	br label %4

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

