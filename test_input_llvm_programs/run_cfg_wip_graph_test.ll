

        ; 

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

            
            ; store node label in output array
            %index_0 = load i32, i32* %counter
            %output_0 = load i32*, i32** %output
            %output_0_ptr = getelementptr inbounds i32, i32* %output_0, i32 %index_0
            store i32 0, i32* %output_0_ptr

            ; increment counter
            %temp_0_1 = add i32 %index_0, 1
            store i32 %temp_0_1, i32* %counter
        
            ; get directions for node
            %index_dir_0 = load i32, i32* %dir_counter
            %dir_0 = load i32*, i32** %directions
            %dir_0_ptr = getelementptr inbounds i32, i32* %dir_0, i32 %index_dir_0
            %dir_0_value = load i32, i32* %dir_0_ptr

            ; increment directions counter
            %temp_0_2 = add i32 %index_dir_0, 1
            store i32 %temp_0_2, i32* %dir_counter

            ; branch
            %condition_0 = icmp eq i32 %dir_0_value, 0
            br i1 %condition_0, label %6, label %1
            

            1: 
            ; store node label in output array
            %index_1 = load i32, i32* %counter
            %output_1 = load i32*, i32** %output
            %output_1_ptr = getelementptr inbounds i32, i32* %output_1, i32 %index_1
            store i32 1, i32* %output_1_ptr

            ; increment counter
            %temp_1_1 = add i32 %index_1, 1
            store i32 %temp_1_1, i32* %counter
        
            br label %9
        

            2: 
            ; store node label in output array
            %index_2 = load i32, i32* %counter
            %output_2 = load i32*, i32** %output
            %output_2_ptr = getelementptr inbounds i32, i32* %output_2, i32 %index_2
            store i32 2, i32* %output_2_ptr

            ; increment counter
            %temp_2_1 = add i32 %index_2, 1
            store i32 %temp_2_1, i32* %counter
        
            br label %3
        

            3: 
            ; store node label in output array
            %index_3 = load i32, i32* %counter
            %output_3 = load i32*, i32** %output
            %output_3_ptr = getelementptr inbounds i32, i32* %output_3, i32 %index_3
            store i32 3, i32* %output_3_ptr

            ; increment counter
            %temp_3_1 = add i32 %index_3, 1
            store i32 %temp_3_1, i32* %counter
        
            ; get directions for node
            %index_dir_3 = load i32, i32* %dir_counter
            %dir_3 = load i32*, i32** %directions
            %dir_3_ptr = getelementptr inbounds i32, i32* %dir_3, i32 %index_dir_3
            %dir_3_value = load i32, i32* %dir_3_ptr

            ; increment directions counter
            %temp_3_2 = add i32 %index_dir_3, 1
            store i32 %temp_3_2, i32* %dir_counter

            ; branch
            %condition_3 = icmp eq i32 %dir_3_value, 0
            br i1 %condition_3, label %1, label %5
            

            4: 
            ; store node label in output array
            %index_4 = load i32, i32* %counter
            %output_4 = load i32*, i32** %output
            %output_4_ptr = getelementptr inbounds i32, i32* %output_4, i32 %index_4
            store i32 4, i32* %output_4_ptr

            ; increment counter
            %temp_4_1 = add i32 %index_4, 1
            store i32 %temp_4_1, i32* %counter
        
            ; get directions for node
            %index_dir_4 = load i32, i32* %dir_counter
            %dir_4 = load i32*, i32** %directions
            %dir_4_ptr = getelementptr inbounds i32, i32* %dir_4, i32 %index_dir_4
            %dir_4_value = load i32, i32* %dir_4_ptr

            ; increment directions counter
            %temp_4_2 = add i32 %index_dir_4, 1
            store i32 %temp_4_2, i32* %dir_counter

            ; branch
            %condition_4 = icmp eq i32 %dir_4_value, 0
            br i1 %condition_4, label %5, label %2
            

            5: 
            ; store node label in output array
            %index_5 = load i32, i32* %counter
            %output_5 = load i32*, i32** %output
            %output_5_ptr = getelementptr inbounds i32, i32* %output_5, i32 %index_5
            store i32 5, i32* %output_5_ptr

            ; increment counter
            %temp_5_1 = add i32 %index_5, 1
            store i32 %temp_5_1, i32* %counter
        
            ; get directions for node
            %index_dir_5 = load i32, i32* %dir_counter
            %dir_5 = load i32*, i32** %directions
            %dir_5_ptr = getelementptr inbounds i32, i32* %dir_5, i32 %index_dir_5
            %dir_5_value = load i32, i32* %dir_5_ptr

            ; increment directions counter
            %temp_5_2 = add i32 %index_dir_5, 1
            store i32 %temp_5_2, i32* %dir_counter

            ; branch
            %condition_5 = icmp eq i32 %dir_5_value, 0
            br i1 %condition_5, label %6, label %1
            

            6: 
            ; store node label in output array
            %index_6 = load i32, i32* %counter
            %output_6 = load i32*, i32** %output
            %output_6_ptr = getelementptr inbounds i32, i32* %output_6, i32 %index_6
            store i32 6, i32* %output_6_ptr

            ; increment counter
            %temp_6_1 = add i32 %index_6, 1
            store i32 %temp_6_1, i32* %counter
        
            br label %9
        

            7: 
            ; store node label in output array
            %index_7 = load i32, i32* %counter
            %output_7 = load i32*, i32** %output
            %output_7_ptr = getelementptr inbounds i32, i32* %output_7, i32 %index_7
            store i32 7, i32* %output_7_ptr

            ; increment counter
            %temp_7_1 = add i32 %index_7, 1
            store i32 %temp_7_1, i32* %counter
        
            ; get directions for node
            %index_dir_7 = load i32, i32* %dir_counter
            %dir_7 = load i32*, i32** %directions
            %dir_7_ptr = getelementptr inbounds i32, i32* %dir_7, i32 %index_dir_7
            %dir_7_value = load i32, i32* %dir_7_ptr

            ; increment directions counter
            %temp_7_2 = add i32 %index_dir_7, 1
            store i32 %temp_7_2, i32* %dir_counter

            ; branch
            %condition_7 = icmp eq i32 %dir_7_value, 0
            br i1 %condition_7, label %9, label %7
            

            8: 
            ; store node label in output array
            %index_8 = load i32, i32* %counter
            %output_8 = load i32*, i32** %output
            %output_8_ptr = getelementptr inbounds i32, i32* %output_8, i32 %index_8
            store i32 8, i32* %output_8_ptr

            ; increment counter
            %temp_8_1 = add i32 %index_8, 1
            store i32 %temp_8_1, i32* %counter
        
            ; get directions for node
            %index_dir_8 = load i32, i32* %dir_counter
            %dir_8 = load i32*, i32** %directions
            %dir_8_ptr = getelementptr inbounds i32, i32* %dir_8, i32 %index_dir_8
            %dir_8_value = load i32, i32* %dir_8_ptr

            ; increment directions counter
            %temp_8_2 = add i32 %index_dir_8, 1
            store i32 %temp_8_2, i32* %dir_counter

            ; branch
            %condition_8 = icmp eq i32 %dir_8_value, 0
            br i1 %condition_8, label %9, label %3
            

            9: 
            ; store node label in output array
            %index_9 = load i32, i32* %counter
            %output_9 = load i32*, i32** %output
            %output_9_ptr = getelementptr inbounds i32, i32* %output_9, i32 %index_9
            store i32 9, i32* %output_9_ptr

            ; increment counter
            %temp_9_1 = add i32 %index_9, 1
            store i32 %temp_9_1, i32* %counter
        
            
        ret void
        }