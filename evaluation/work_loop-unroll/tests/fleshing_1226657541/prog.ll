 ; 


        define void @_Z7run_cfgPi(i32* %in_output) #0 {

        0:
            ; create array to store output
            %output = alloca i32*
            store i32* %in_output, i32** %output

            %counter = alloca i32
            store i32 0, i32* %counter

            %dir_counter = alloca i32
            store i32 0, i32* %dir_counter;

            ; set up direction array and pointer
            %index_a = alloca i32
            %dirs = alloca [2 x i32]
            %directions = alloca [2 x i32]

            ; point directions ptr at directions
            store i32 0, i32* %index_a
            %var_0_0 = getelementptr inbounds [2 x i32], [2 x i32]* %dirs, i64 0, i64 0
            store i32* %var_0_0, i32** %directions

        
            %v0_1 = load i32*, i32** %directions
            %v0_2 = getelementptr inbounds i32, i32* %v0_1, i64 0
            store i32 2, i32* %v0_2
        
            %v1_1 = load i32*, i32** %directions
            %v1_2 = getelementptr inbounds i32, i32* %v1_1, i64 1
            store i32 1, i32* %v1_2
        
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

            ; switch
            switch i32 %dir_0_value, label %10 [ 
             i32 0, label %10
             i32 1, label %13
             i32 2, label %2
            ]

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

            ; switch
            switch i32 %dir_1_value, label %2 [ 
             i32 0, label %2
             i32 1, label %8
             i32 2, label %13
            ]

            2: 
            ; store node label in output array
            %index_2 = load i32, i32* %counter
            %output_2 = load i32*, i32** %output
            %output_2_ptr = getelementptr inbounds i32, i32* %output_2, i32 %index_2
            store i32 2, i32* %output_2_ptr

            ; increment counter
            %temp_2_1 = add i32 %index_2, 1
            store i32 %temp_2_1, i32* %counter
        
            ; get directions for node
            %index_dir_2 = load i32, i32* %dir_counter
            %dir_2 = load i32*, i32** %directions
            %dir_2_ptr = getelementptr inbounds i32, i32* %dir_2, i32 %index_dir_2
            %dir_2_value = load i32, i32* %dir_2_ptr

            ; increment directions counter
            %temp_2_2 = add i32 %index_dir_2, 1
            store i32 %temp_2_2, i32* %dir_counter

            ; switch
            switch i32 %dir_2_value, label %7 [ 
             i32 0, label %7
             i32 1, label %13
             i32 2, label %4
             i32 3, label %2
             i32 4, label %8
             i32 5, label %1
            ]

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

            ; switch
            switch i32 %dir_3_value, label %13 [ 
             i32 0, label %13
             i32 1, label %1
             i32 2, label %12
             i32 3, label %8
             i32 4, label %5
            ]

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

            ; switch
            switch i32 %dir_4_value, label %4 [ 
             i32 0, label %4
             i32 1, label %10
             i32 2, label %2
             i32 3, label %6
             i32 4, label %1
             i32 5, label %11
             i32 6, label %9
            ]

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

            ; switch
            switch i32 %dir_5_value, label %7 [ 
             i32 0, label %7
             i32 1, label %11
             i32 2, label %4
            ]

            6: 
            ; store node label in output array
            %index_6 = load i32, i32* %counter
            %output_6 = load i32*, i32** %output
            %output_6_ptr = getelementptr inbounds i32, i32* %output_6, i32 %index_6
            store i32 6, i32* %output_6_ptr

            ; increment counter
            %temp_6_1 = add i32 %index_6, 1
            store i32 %temp_6_1, i32* %counter
        
            ; get directions for node
            %index_dir_6 = load i32, i32* %dir_counter
            %dir_6 = load i32*, i32** %directions
            %dir_6_ptr = getelementptr inbounds i32, i32* %dir_6, i32 %index_dir_6
            %dir_6_value = load i32, i32* %dir_6_ptr

            ; increment directions counter
            %temp_6_2 = add i32 %index_dir_6, 1
            store i32 %temp_6_2, i32* %dir_counter

            ; switch
            switch i32 %dir_6_value, label %12 [ 
             i32 0, label %12
             i32 1, label %1
             i32 2, label %9
             i32 3, label %4
             i32 4, label %13
             i32 5, label %8
            ]

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

            ; switch
            switch i32 %dir_7_value, label %9 [ 
             i32 0, label %9
             i32 1, label %4
             i32 2, label %6
             i32 3, label %11
            ]

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

            ; switch
            switch i32 %dir_8_value, label %8 [ 
             i32 0, label %8
             i32 1, label %5
             i32 2, label %1
             i32 3, label %7
             i32 4, label %9
             i32 5, label %11
             i32 6, label %2
             i32 7, label %3
            ]

            9: 
            ; store node label in output array
            %index_9 = load i32, i32* %counter
            %output_9 = load i32*, i32** %output
            %output_9_ptr = getelementptr inbounds i32, i32* %output_9, i32 %index_9
            store i32 9, i32* %output_9_ptr

            ; increment counter
            %temp_9_1 = add i32 %index_9, 1
            store i32 %temp_9_1, i32* %counter
        
            ; get directions for node
            %index_dir_9 = load i32, i32* %dir_counter
            %dir_9 = load i32*, i32** %directions
            %dir_9_ptr = getelementptr inbounds i32, i32* %dir_9, i32 %index_dir_9
            %dir_9_value = load i32, i32* %dir_9_ptr

            ; increment directions counter
            %temp_9_2 = add i32 %index_dir_9, 1
            store i32 %temp_9_2, i32* %dir_counter

            ; switch
            switch i32 %dir_9_value, label %5 [ 
             i32 0, label %5
             i32 1, label %2
             i32 2, label %12
             i32 3, label %6
             i32 4, label %9
             i32 5, label %7
            ]

            10: 
            ; store node label in output array
            %index_10 = load i32, i32* %counter
            %output_10 = load i32*, i32** %output
            %output_10_ptr = getelementptr inbounds i32, i32* %output_10, i32 %index_10
            store i32 10, i32* %output_10_ptr

            ; increment counter
            %temp_10_1 = add i32 %index_10, 1
            store i32 %temp_10_1, i32* %counter
        
            ; get directions for node
            %index_dir_10 = load i32, i32* %dir_counter
            %dir_10 = load i32*, i32** %directions
            %dir_10_ptr = getelementptr inbounds i32, i32* %dir_10, i32 %index_dir_10
            %dir_10_value = load i32, i32* %dir_10_ptr

            ; increment directions counter
            %temp_10_2 = add i32 %index_dir_10, 1
            store i32 %temp_10_2, i32* %dir_counter

            ; switch
            switch i32 %dir_10_value, label %11 [ 
             i32 0, label %11
             i32 1, label %4
             i32 2, label %5
             i32 3, label %10
             i32 4, label %8
             i32 5, label %9
             i32 6, label %14
            ]

            11: 
            ; store node label in output array
            %index_11 = load i32, i32* %counter
            %output_11 = load i32*, i32** %output
            %output_11_ptr = getelementptr inbounds i32, i32* %output_11, i32 %index_11
            store i32 11, i32* %output_11_ptr

            ; increment counter
            %temp_11_1 = add i32 %index_11, 1
            store i32 %temp_11_1, i32* %counter
        
            ; get directions for node
            %index_dir_11 = load i32, i32* %dir_counter
            %dir_11 = load i32*, i32** %directions
            %dir_11_ptr = getelementptr inbounds i32, i32* %dir_11, i32 %index_dir_11
            %dir_11_value = load i32, i32* %dir_11_ptr

            ; increment directions counter
            %temp_11_2 = add i32 %index_dir_11, 1
            store i32 %temp_11_2, i32* %dir_counter

            ; switch
            switch i32 %dir_11_value, label %10 [ 
             i32 0, label %10
             i32 1, label %1
             i32 2, label %8
             i32 3, label %4
             i32 4, label %12
             i32 5, label %13
            ]

            12: 
            ; store node label in output array
            %index_12 = load i32, i32* %counter
            %output_12 = load i32*, i32** %output
            %output_12_ptr = getelementptr inbounds i32, i32* %output_12, i32 %index_12
            store i32 12, i32* %output_12_ptr

            ; increment counter
            %temp_12_1 = add i32 %index_12, 1
            store i32 %temp_12_1, i32* %counter
        
            ; get directions for node
            %index_dir_12 = load i32, i32* %dir_counter
            %dir_12 = load i32*, i32** %directions
            %dir_12_ptr = getelementptr inbounds i32, i32* %dir_12, i32 %index_dir_12
            %dir_12_value = load i32, i32* %dir_12_ptr

            ; increment directions counter
            %temp_12_2 = add i32 %index_dir_12, 1
            store i32 %temp_12_2, i32* %dir_counter

            ; switch
            switch i32 %dir_12_value, label %7 [ 
             i32 0, label %7
             i32 1, label %11
             i32 2, label %3
             i32 3, label %6
             i32 4, label %9
             i32 5, label %12
            ]

            13: 
            ; store node label in output array
            %index_13 = load i32, i32* %counter
            %output_13 = load i32*, i32** %output
            %output_13_ptr = getelementptr inbounds i32, i32* %output_13, i32 %index_13
            store i32 13, i32* %output_13_ptr

            ; increment counter
            %temp_13_1 = add i32 %index_13, 1
            store i32 %temp_13_1, i32* %counter
        
            ret void
        

            14: 
            ; store node label in output array
            %index_14 = load i32, i32* %counter
            %output_14 = load i32*, i32** %output
            %output_14_ptr = getelementptr inbounds i32, i32* %output_14, i32 %index_14
            store i32 14, i32* %output_14_ptr

            ; increment counter
            %temp_14_1 = add i32 %index_14, 1
            store i32 %temp_14_1, i32* %counter
        
            ret void
        
        }