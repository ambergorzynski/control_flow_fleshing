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
            %dirs = alloca [35 x i32]
            %directions = alloca [35 x i32]

            ; point directions ptr at directions
            store i32 0, i32* %index_a
            %var_0_0 = getelementptr inbounds [35 x i32], [35 x i32]* %dirs, i64 0, i64 0
            store i32* %var_0_0, i32** %directions

        
            %v0_1 = load i32*, i32** %directions
            %v0_2 = getelementptr inbounds i32, i32* %v0_1, i64 0
            store i32 1, i32* %v0_2
        
            %v1_1 = load i32*, i32** %directions
            %v1_2 = getelementptr inbounds i32, i32* %v1_1, i64 1
            store i32 6, i32* %v1_2
        
            %v2_1 = load i32*, i32** %directions
            %v2_2 = getelementptr inbounds i32, i32* %v2_1, i64 2
            store i32 5, i32* %v2_2
        
            %v3_1 = load i32*, i32** %directions
            %v3_2 = getelementptr inbounds i32, i32* %v3_1, i64 3
            store i32 4, i32* %v3_2
        
            %v4_1 = load i32*, i32** %directions
            %v4_2 = getelementptr inbounds i32, i32* %v4_1, i64 4
            store i32 0, i32* %v4_2
        
            %v5_1 = load i32*, i32** %directions
            %v5_2 = getelementptr inbounds i32, i32* %v5_1, i64 5
            store i32 1, i32* %v5_2
        
            %v6_1 = load i32*, i32** %directions
            %v6_2 = getelementptr inbounds i32, i32* %v6_1, i64 6
            store i32 7, i32* %v6_2
        
            %v7_1 = load i32*, i32** %directions
            %v7_2 = getelementptr inbounds i32, i32* %v7_1, i64 7
            store i32 2, i32* %v7_2
        
            %v8_1 = load i32*, i32** %directions
            %v8_2 = getelementptr inbounds i32, i32* %v8_1, i64 8
            store i32 2, i32* %v8_2
        
            %v9_1 = load i32*, i32** %directions
            %v9_2 = getelementptr inbounds i32, i32* %v9_1, i64 9
            store i32 5, i32* %v9_2
        
            %v10_1 = load i32*, i32** %directions
            %v10_2 = getelementptr inbounds i32, i32* %v10_1, i64 10
            store i32 0, i32* %v10_2
        
            %v11_1 = load i32*, i32** %directions
            %v11_2 = getelementptr inbounds i32, i32* %v11_1, i64 11
            store i32 5, i32* %v11_2
        
            %v12_1 = load i32*, i32** %directions
            %v12_2 = getelementptr inbounds i32, i32* %v12_1, i64 12
            store i32 2, i32* %v12_2
        
            %v13_1 = load i32*, i32** %directions
            %v13_2 = getelementptr inbounds i32, i32* %v13_1, i64 13
            store i32 4, i32* %v13_2
        
            %v14_1 = load i32*, i32** %directions
            %v14_2 = getelementptr inbounds i32, i32* %v14_1, i64 14
            store i32 6, i32* %v14_2
        
            %v15_1 = load i32*, i32** %directions
            %v15_2 = getelementptr inbounds i32, i32* %v15_1, i64 15
            store i32 1, i32* %v15_2
        
            %v16_1 = load i32*, i32** %directions
            %v16_2 = getelementptr inbounds i32, i32* %v16_1, i64 16
            store i32 4, i32* %v16_2
        
            %v17_1 = load i32*, i32** %directions
            %v17_2 = getelementptr inbounds i32, i32* %v17_1, i64 17
            store i32 1, i32* %v17_2
        
            %v18_1 = load i32*, i32** %directions
            %v18_2 = getelementptr inbounds i32, i32* %v18_1, i64 18
            store i32 3, i32* %v18_2
        
            %v19_1 = load i32*, i32** %directions
            %v19_2 = getelementptr inbounds i32, i32* %v19_1, i64 19
            store i32 6, i32* %v19_2
        
            %v20_1 = load i32*, i32** %directions
            %v20_2 = getelementptr inbounds i32, i32* %v20_1, i64 20
            store i32 1, i32* %v20_2
        
            %v21_1 = load i32*, i32** %directions
            %v21_2 = getelementptr inbounds i32, i32* %v21_1, i64 21
            store i32 3, i32* %v21_2
        
            %v22_1 = load i32*, i32** %directions
            %v22_2 = getelementptr inbounds i32, i32* %v22_1, i64 22
            store i32 2, i32* %v22_2
        
            %v23_1 = load i32*, i32** %directions
            %v23_2 = getelementptr inbounds i32, i32* %v23_1, i64 23
            store i32 4, i32* %v23_2
        
            %v24_1 = load i32*, i32** %directions
            %v24_2 = getelementptr inbounds i32, i32* %v24_1, i64 24
            store i32 4, i32* %v24_2
        
            %v25_1 = load i32*, i32** %directions
            %v25_2 = getelementptr inbounds i32, i32* %v25_1, i64 25
            store i32 1, i32* %v25_2
        
            %v26_1 = load i32*, i32** %directions
            %v26_2 = getelementptr inbounds i32, i32* %v26_1, i64 26
            store i32 0, i32* %v26_2
        
            %v27_1 = load i32*, i32** %directions
            %v27_2 = getelementptr inbounds i32, i32* %v27_1, i64 27
            store i32 1, i32* %v27_2
        
            %v28_1 = load i32*, i32** %directions
            %v28_2 = getelementptr inbounds i32, i32* %v28_1, i64 28
            store i32 4, i32* %v28_2
        
            %v29_1 = load i32*, i32** %directions
            %v29_2 = getelementptr inbounds i32, i32* %v29_1, i64 29
            store i32 0, i32* %v29_2
        
            %v30_1 = load i32*, i32** %directions
            %v30_2 = getelementptr inbounds i32, i32* %v30_1, i64 30
            store i32 3, i32* %v30_2
        
            %v31_1 = load i32*, i32** %directions
            %v31_2 = getelementptr inbounds i32, i32* %v31_1, i64 31
            store i32 2, i32* %v31_2
        
            %v32_1 = load i32*, i32** %directions
            %v32_2 = getelementptr inbounds i32, i32* %v32_1, i64 32
            store i32 3, i32* %v32_2
        
            %v33_1 = load i32*, i32** %directions
            %v33_2 = getelementptr inbounds i32, i32* %v33_1, i64 33
            store i32 2, i32* %v33_2
        
            %v34_1 = load i32*, i32** %directions
            %v34_2 = getelementptr inbounds i32, i32* %v34_1, i64 34
            store i32 2, i32* %v34_2
        
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
            switch i32 %dir_0_value, label %146 [ 
             i32 0, label %146
             i32 1, label %217
             i32 2, label %206
             i32 3, label %196
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
            switch i32 %dir_1_value, label %66 [ 
             i32 0, label %66
             i32 1, label %31
             i32 2, label %127
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
            switch i32 %dir_2_value, label %116 [ 
             i32 0, label %116
             i32 1, label %121
             i32 2, label %167
             i32 3, label %98
             i32 4, label %202
             i32 5, label %54
             i32 6, label %25
             i32 7, label %125
             i32 8, label %8
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
            switch i32 %dir_3_value, label %100 [ 
             i32 0, label %100
             i32 1, label %111
             i32 2, label %156
             i32 3, label %196
             i32 4, label %197
             i32 5, label %1
             i32 6, label %179
             i32 7, label %115
             i32 8, label %69
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
            switch i32 %dir_4_value, label %206 [ 
             i32 0, label %206
             i32 1, label %59
             i32 2, label %152
             i32 3, label %27
             i32 4, label %82
             i32 5, label %8
             i32 6, label %6
             i32 7, label %7
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
            switch i32 %dir_5_value, label %139 [ 
             i32 0, label %139
             i32 1, label %3
             i32 2, label %226
             i32 3, label %98
             i32 4, label %176
             i32 5, label %56
             i32 6, label %109
             i32 7, label %186
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
            switch i32 %dir_6_value, label %136 [ 
             i32 0, label %136
             i32 1, label %57
             i32 2, label %196
             i32 3, label %230
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
            switch i32 %dir_7_value, label %127 [ 
             i32 0, label %127
             i32 1, label %142
             i32 2, label %60
             i32 3, label %89
             i32 4, label %174
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
            switch i32 %dir_8_value, label %195 [ 
             i32 0, label %195
             i32 1, label %118
             i32 2, label %75
             i32 3, label %6
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
            switch i32 %dir_9_value, label %215 [ 
             i32 0, label %215
             i32 1, label %143
             i32 2, label %165
             i32 3, label %26
             i32 4, label %48
             i32 5, label %162
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
            switch i32 %dir_10_value, label %221 [ 
             i32 0, label %221
             i32 1, label %76
             i32 2, label %31
             i32 3, label %191
             i32 4, label %86
             i32 5, label %185
             i32 6, label %183
             i32 7, label %129
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
            switch i32 %dir_11_value, label %130 [ 
             i32 0, label %130
             i32 1, label %213
             i32 2, label %172
             i32 3, label %49
             i32 4, label %78
             i32 5, label %73
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
            switch i32 %dir_12_value, label %226 [ 
             i32 0, label %226
             i32 1, label %128
             i32 2, label %217
             i32 3, label %130
             i32 4, label %101
             i32 5, label %151
             i32 6, label %219
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
        
            ; get directions for node
            %index_dir_13 = load i32, i32* %dir_counter
            %dir_13 = load i32*, i32** %directions
            %dir_13_ptr = getelementptr inbounds i32, i32* %dir_13, i32 %index_dir_13
            %dir_13_value = load i32, i32* %dir_13_ptr

            ; increment directions counter
            %temp_13_2 = add i32 %index_dir_13, 1
            store i32 %temp_13_2, i32* %dir_counter

            ; switch
            switch i32 %dir_13_value, label %123 [ 
             i32 0, label %123
             i32 1, label %63
             i32 2, label %191
            ]

            14: 
            ; store node label in output array
            %index_14 = load i32, i32* %counter
            %output_14 = load i32*, i32** %output
            %output_14_ptr = getelementptr inbounds i32, i32* %output_14, i32 %index_14
            store i32 14, i32* %output_14_ptr

            ; increment counter
            %temp_14_1 = add i32 %index_14, 1
            store i32 %temp_14_1, i32* %counter
        
            ; get directions for node
            %index_dir_14 = load i32, i32* %dir_counter
            %dir_14 = load i32*, i32** %directions
            %dir_14_ptr = getelementptr inbounds i32, i32* %dir_14, i32 %index_dir_14
            %dir_14_value = load i32, i32* %dir_14_ptr

            ; increment directions counter
            %temp_14_2 = add i32 %index_dir_14, 1
            store i32 %temp_14_2, i32* %dir_counter

            ; switch
            switch i32 %dir_14_value, label %104 [ 
             i32 0, label %104
             i32 1, label %107
             i32 2, label %171
             i32 3, label %45
             i32 4, label %94
             i32 5, label %141
             i32 6, label %226
             i32 7, label %180
             i32 8, label %199
            ]

            15: 
            ; store node label in output array
            %index_15 = load i32, i32* %counter
            %output_15 = load i32*, i32** %output
            %output_15_ptr = getelementptr inbounds i32, i32* %output_15, i32 %index_15
            store i32 15, i32* %output_15_ptr

            ; increment counter
            %temp_15_1 = add i32 %index_15, 1
            store i32 %temp_15_1, i32* %counter
        
            ; get directions for node
            %index_dir_15 = load i32, i32* %dir_counter
            %dir_15 = load i32*, i32** %directions
            %dir_15_ptr = getelementptr inbounds i32, i32* %dir_15, i32 %index_dir_15
            %dir_15_value = load i32, i32* %dir_15_ptr

            ; increment directions counter
            %temp_15_2 = add i32 %index_dir_15, 1
            store i32 %temp_15_2, i32* %dir_counter

            ; switch
            switch i32 %dir_15_value, label %189 [ 
             i32 0, label %189
             i32 1, label %96
             i32 2, label %23
             i32 3, label %113
             i32 4, label %170
             i32 5, label %131
             i32 6, label %28
             i32 7, label %200
            ]

            16: 
            ; store node label in output array
            %index_16 = load i32, i32* %counter
            %output_16 = load i32*, i32** %output
            %output_16_ptr = getelementptr inbounds i32, i32* %output_16, i32 %index_16
            store i32 16, i32* %output_16_ptr

            ; increment counter
            %temp_16_1 = add i32 %index_16, 1
            store i32 %temp_16_1, i32* %counter
        
            ; get directions for node
            %index_dir_16 = load i32, i32* %dir_counter
            %dir_16 = load i32*, i32** %directions
            %dir_16_ptr = getelementptr inbounds i32, i32* %dir_16, i32 %index_dir_16
            %dir_16_value = load i32, i32* %dir_16_ptr

            ; increment directions counter
            %temp_16_2 = add i32 %index_dir_16, 1
            store i32 %temp_16_2, i32* %dir_counter

            ; switch
            switch i32 %dir_16_value, label %134 [ 
             i32 0, label %134
             i32 1, label %216
             i32 2, label %101
             i32 3, label %95
            ]

            17: 
            ; store node label in output array
            %index_17 = load i32, i32* %counter
            %output_17 = load i32*, i32** %output
            %output_17_ptr = getelementptr inbounds i32, i32* %output_17, i32 %index_17
            store i32 17, i32* %output_17_ptr

            ; increment counter
            %temp_17_1 = add i32 %index_17, 1
            store i32 %temp_17_1, i32* %counter
        
            ; get directions for node
            %index_dir_17 = load i32, i32* %dir_counter
            %dir_17 = load i32*, i32** %directions
            %dir_17_ptr = getelementptr inbounds i32, i32* %dir_17, i32 %index_dir_17
            %dir_17_value = load i32, i32* %dir_17_ptr

            ; increment directions counter
            %temp_17_2 = add i32 %index_dir_17, 1
            store i32 %temp_17_2, i32* %dir_counter

            ; switch
            switch i32 %dir_17_value, label %188 [ 
             i32 0, label %188
             i32 1, label %8
             i32 2, label %121
             i32 3, label %12
             i32 4, label %79
             i32 5, label %181
            ]

            18: 
            ; store node label in output array
            %index_18 = load i32, i32* %counter
            %output_18 = load i32*, i32** %output
            %output_18_ptr = getelementptr inbounds i32, i32* %output_18, i32 %index_18
            store i32 18, i32* %output_18_ptr

            ; increment counter
            %temp_18_1 = add i32 %index_18, 1
            store i32 %temp_18_1, i32* %counter
        
            ; get directions for node
            %index_dir_18 = load i32, i32* %dir_counter
            %dir_18 = load i32*, i32** %directions
            %dir_18_ptr = getelementptr inbounds i32, i32* %dir_18, i32 %index_dir_18
            %dir_18_value = load i32, i32* %dir_18_ptr

            ; increment directions counter
            %temp_18_2 = add i32 %index_dir_18, 1
            store i32 %temp_18_2, i32* %dir_counter

            ; switch
            switch i32 %dir_18_value, label %158 [ 
             i32 0, label %158
             i32 1, label %152
             i32 2, label %149
             i32 3, label %101
             i32 4, label %166
             i32 5, label %44
             i32 6, label %129
             i32 7, label %59
            ]

            19: 
            ; store node label in output array
            %index_19 = load i32, i32* %counter
            %output_19 = load i32*, i32** %output
            %output_19_ptr = getelementptr inbounds i32, i32* %output_19, i32 %index_19
            store i32 19, i32* %output_19_ptr

            ; increment counter
            %temp_19_1 = add i32 %index_19, 1
            store i32 %temp_19_1, i32* %counter
        
            ; get directions for node
            %index_dir_19 = load i32, i32* %dir_counter
            %dir_19 = load i32*, i32** %directions
            %dir_19_ptr = getelementptr inbounds i32, i32* %dir_19, i32 %index_dir_19
            %dir_19_value = load i32, i32* %dir_19_ptr

            ; increment directions counter
            %temp_19_2 = add i32 %index_dir_19, 1
            store i32 %temp_19_2, i32* %dir_counter

            ; switch
            switch i32 %dir_19_value, label %198 [ 
             i32 0, label %198
             i32 1, label %52
             i32 2, label %139
            ]

            20: 
            ; store node label in output array
            %index_20 = load i32, i32* %counter
            %output_20 = load i32*, i32** %output
            %output_20_ptr = getelementptr inbounds i32, i32* %output_20, i32 %index_20
            store i32 20, i32* %output_20_ptr

            ; increment counter
            %temp_20_1 = add i32 %index_20, 1
            store i32 %temp_20_1, i32* %counter
        
            ; get directions for node
            %index_dir_20 = load i32, i32* %dir_counter
            %dir_20 = load i32*, i32** %directions
            %dir_20_ptr = getelementptr inbounds i32, i32* %dir_20, i32 %index_dir_20
            %dir_20_value = load i32, i32* %dir_20_ptr

            ; increment directions counter
            %temp_20_2 = add i32 %index_dir_20, 1
            store i32 %temp_20_2, i32* %dir_counter

            ; switch
            switch i32 %dir_20_value, label %141 [ 
             i32 0, label %141
             i32 1, label %60
             i32 2, label %104
             i32 3, label %132
             i32 4, label %89
             i32 5, label %217
             i32 6, label %148
             i32 7, label %91
             i32 8, label %118
             i32 9, label %230
            ]

            21: 
            ; store node label in output array
            %index_21 = load i32, i32* %counter
            %output_21 = load i32*, i32** %output
            %output_21_ptr = getelementptr inbounds i32, i32* %output_21, i32 %index_21
            store i32 21, i32* %output_21_ptr

            ; increment counter
            %temp_21_1 = add i32 %index_21, 1
            store i32 %temp_21_1, i32* %counter
        
            ; get directions for node
            %index_dir_21 = load i32, i32* %dir_counter
            %dir_21 = load i32*, i32** %directions
            %dir_21_ptr = getelementptr inbounds i32, i32* %dir_21, i32 %index_dir_21
            %dir_21_value = load i32, i32* %dir_21_ptr

            ; increment directions counter
            %temp_21_2 = add i32 %index_dir_21, 1
            store i32 %temp_21_2, i32* %dir_counter

            ; switch
            switch i32 %dir_21_value, label %169 [ 
             i32 0, label %169
             i32 1, label %141
             i32 2, label %156
             i32 3, label %187
             i32 4, label %2
             i32 5, label %230
            ]

            22: 
            ; store node label in output array
            %index_22 = load i32, i32* %counter
            %output_22 = load i32*, i32** %output
            %output_22_ptr = getelementptr inbounds i32, i32* %output_22, i32 %index_22
            store i32 22, i32* %output_22_ptr

            ; increment counter
            %temp_22_1 = add i32 %index_22, 1
            store i32 %temp_22_1, i32* %counter
        
            ; get directions for node
            %index_dir_22 = load i32, i32* %dir_counter
            %dir_22 = load i32*, i32** %directions
            %dir_22_ptr = getelementptr inbounds i32, i32* %dir_22, i32 %index_dir_22
            %dir_22_value = load i32, i32* %dir_22_ptr

            ; increment directions counter
            %temp_22_2 = add i32 %index_dir_22, 1
            store i32 %temp_22_2, i32* %dir_counter

            ; switch
            switch i32 %dir_22_value, label %201 [ 
             i32 0, label %201
             i32 1, label %220
             i32 2, label %211
             i32 3, label %227
             i32 4, label %190
             i32 5, label %132
            ]

            23: 
            ; store node label in output array
            %index_23 = load i32, i32* %counter
            %output_23 = load i32*, i32** %output
            %output_23_ptr = getelementptr inbounds i32, i32* %output_23, i32 %index_23
            store i32 23, i32* %output_23_ptr

            ; increment counter
            %temp_23_1 = add i32 %index_23, 1
            store i32 %temp_23_1, i32* %counter
        
            ; get directions for node
            %index_dir_23 = load i32, i32* %dir_counter
            %dir_23 = load i32*, i32** %directions
            %dir_23_ptr = getelementptr inbounds i32, i32* %dir_23, i32 %index_dir_23
            %dir_23_value = load i32, i32* %dir_23_ptr

            ; increment directions counter
            %temp_23_2 = add i32 %index_dir_23, 1
            store i32 %temp_23_2, i32* %dir_counter

            ; switch
            switch i32 %dir_23_value, label %34 [ 
             i32 0, label %34
             i32 1, label %133
             i32 2, label %200
             i32 3, label %144
             i32 4, label %53
             i32 5, label %110
             i32 6, label %15
             i32 7, label %124
             i32 8, label %223
             i32 9, label %230
            ]

            24: 
            ; store node label in output array
            %index_24 = load i32, i32* %counter
            %output_24 = load i32*, i32** %output
            %output_24_ptr = getelementptr inbounds i32, i32* %output_24, i32 %index_24
            store i32 24, i32* %output_24_ptr

            ; increment counter
            %temp_24_1 = add i32 %index_24, 1
            store i32 %temp_24_1, i32* %counter
        
            ; get directions for node
            %index_dir_24 = load i32, i32* %dir_counter
            %dir_24 = load i32*, i32** %directions
            %dir_24_ptr = getelementptr inbounds i32, i32* %dir_24, i32 %index_dir_24
            %dir_24_value = load i32, i32* %dir_24_ptr

            ; increment directions counter
            %temp_24_2 = add i32 %index_dir_24, 1
            store i32 %temp_24_2, i32* %dir_counter

            ; switch
            switch i32 %dir_24_value, label %146 [ 
             i32 0, label %146
             i32 1, label %142
             i32 2, label %52
             i32 3, label %130
             i32 4, label %106
             i32 5, label %230
            ]

            25: 
            ; store node label in output array
            %index_25 = load i32, i32* %counter
            %output_25 = load i32*, i32** %output
            %output_25_ptr = getelementptr inbounds i32, i32* %output_25, i32 %index_25
            store i32 25, i32* %output_25_ptr

            ; increment counter
            %temp_25_1 = add i32 %index_25, 1
            store i32 %temp_25_1, i32* %counter
        
            ; get directions for node
            %index_dir_25 = load i32, i32* %dir_counter
            %dir_25 = load i32*, i32** %directions
            %dir_25_ptr = getelementptr inbounds i32, i32* %dir_25, i32 %index_dir_25
            %dir_25_value = load i32, i32* %dir_25_ptr

            ; increment directions counter
            %temp_25_2 = add i32 %index_dir_25, 1
            store i32 %temp_25_2, i32* %dir_counter

            ; switch
            switch i32 %dir_25_value, label %209 [ 
             i32 0, label %209
             i32 1, label %92
             i32 2, label %107
             i32 3, label %89
             i32 4, label %1
             i32 5, label %138
            ]

            26: 
            ; store node label in output array
            %index_26 = load i32, i32* %counter
            %output_26 = load i32*, i32** %output
            %output_26_ptr = getelementptr inbounds i32, i32* %output_26, i32 %index_26
            store i32 26, i32* %output_26_ptr

            ; increment counter
            %temp_26_1 = add i32 %index_26, 1
            store i32 %temp_26_1, i32* %counter
        
            ; get directions for node
            %index_dir_26 = load i32, i32* %dir_counter
            %dir_26 = load i32*, i32** %directions
            %dir_26_ptr = getelementptr inbounds i32, i32* %dir_26, i32 %index_dir_26
            %dir_26_value = load i32, i32* %dir_26_ptr

            ; increment directions counter
            %temp_26_2 = add i32 %index_dir_26, 1
            store i32 %temp_26_2, i32* %dir_counter

            ; switch
            switch i32 %dir_26_value, label %160 [ 
             i32 0, label %160
             i32 1, label %202
             i32 2, label %157
             i32 3, label %85
             i32 4, label %118
             i32 5, label %154
             i32 6, label %8
             i32 7, label %230
            ]

            27: 
            ; store node label in output array
            %index_27 = load i32, i32* %counter
            %output_27 = load i32*, i32** %output
            %output_27_ptr = getelementptr inbounds i32, i32* %output_27, i32 %index_27
            store i32 27, i32* %output_27_ptr

            ; increment counter
            %temp_27_1 = add i32 %index_27, 1
            store i32 %temp_27_1, i32* %counter
        
            ; get directions for node
            %index_dir_27 = load i32, i32* %dir_counter
            %dir_27 = load i32*, i32** %directions
            %dir_27_ptr = getelementptr inbounds i32, i32* %dir_27, i32 %index_dir_27
            %dir_27_value = load i32, i32* %dir_27_ptr

            ; increment directions counter
            %temp_27_2 = add i32 %index_dir_27, 1
            store i32 %temp_27_2, i32* %dir_counter

            ; switch
            switch i32 %dir_27_value, label %59 [ 
             i32 0, label %59
             i32 1, label %163
             i32 2, label %46
             i32 3, label %141
             i32 4, label %150
             i32 5, label %47
             i32 6, label %221
             i32 7, label %24
             i32 8, label %205
             i32 9, label %230
            ]

            28: 
            ; store node label in output array
            %index_28 = load i32, i32* %counter
            %output_28 = load i32*, i32** %output
            %output_28_ptr = getelementptr inbounds i32, i32* %output_28, i32 %index_28
            store i32 28, i32* %output_28_ptr

            ; increment counter
            %temp_28_1 = add i32 %index_28, 1
            store i32 %temp_28_1, i32* %counter
        
            ; get directions for node
            %index_dir_28 = load i32, i32* %dir_counter
            %dir_28 = load i32*, i32** %directions
            %dir_28_ptr = getelementptr inbounds i32, i32* %dir_28, i32 %index_dir_28
            %dir_28_value = load i32, i32* %dir_28_ptr

            ; increment directions counter
            %temp_28_2 = add i32 %index_dir_28, 1
            store i32 %temp_28_2, i32* %dir_counter

            ; switch
            switch i32 %dir_28_value, label %205 [ 
             i32 0, label %205
             i32 1, label %218
             i32 2, label %210
             i32 3, label %66
             i32 4, label %9
             i32 5, label %216
             i32 6, label %173
            ]

            29: 
            ; store node label in output array
            %index_29 = load i32, i32* %counter
            %output_29 = load i32*, i32** %output
            %output_29_ptr = getelementptr inbounds i32, i32* %output_29, i32 %index_29
            store i32 29, i32* %output_29_ptr

            ; increment counter
            %temp_29_1 = add i32 %index_29, 1
            store i32 %temp_29_1, i32* %counter
        
            ; get directions for node
            %index_dir_29 = load i32, i32* %dir_counter
            %dir_29 = load i32*, i32** %directions
            %dir_29_ptr = getelementptr inbounds i32, i32* %dir_29, i32 %index_dir_29
            %dir_29_value = load i32, i32* %dir_29_ptr

            ; increment directions counter
            %temp_29_2 = add i32 %index_dir_29, 1
            store i32 %temp_29_2, i32* %dir_counter

            ; switch
            switch i32 %dir_29_value, label %22 [ 
             i32 0, label %22
             i32 1, label %223
             i32 2, label %5
             i32 3, label %230
            ]

            30: 
            ; store node label in output array
            %index_30 = load i32, i32* %counter
            %output_30 = load i32*, i32** %output
            %output_30_ptr = getelementptr inbounds i32, i32* %output_30, i32 %index_30
            store i32 30, i32* %output_30_ptr

            ; increment counter
            %temp_30_1 = add i32 %index_30, 1
            store i32 %temp_30_1, i32* %counter
        
            ; get directions for node
            %index_dir_30 = load i32, i32* %dir_counter
            %dir_30 = load i32*, i32** %directions
            %dir_30_ptr = getelementptr inbounds i32, i32* %dir_30, i32 %index_dir_30
            %dir_30_value = load i32, i32* %dir_30_ptr

            ; increment directions counter
            %temp_30_2 = add i32 %index_dir_30, 1
            store i32 %temp_30_2, i32* %dir_counter

            ; switch
            switch i32 %dir_30_value, label %4 [ 
             i32 0, label %4
             i32 1, label %194
             i32 2, label %72
             i32 3, label %64
             i32 4, label %69
            ]

            31: 
            ; store node label in output array
            %index_31 = load i32, i32* %counter
            %output_31 = load i32*, i32** %output
            %output_31_ptr = getelementptr inbounds i32, i32* %output_31, i32 %index_31
            store i32 31, i32* %output_31_ptr

            ; increment counter
            %temp_31_1 = add i32 %index_31, 1
            store i32 %temp_31_1, i32* %counter
        
            ; get directions for node
            %index_dir_31 = load i32, i32* %dir_counter
            %dir_31 = load i32*, i32** %directions
            %dir_31_ptr = getelementptr inbounds i32, i32* %dir_31, i32 %index_dir_31
            %dir_31_value = load i32, i32* %dir_31_ptr

            ; increment directions counter
            %temp_31_2 = add i32 %index_dir_31, 1
            store i32 %temp_31_2, i32* %dir_counter

            ; switch
            switch i32 %dir_31_value, label %205 [ 
             i32 0, label %205
             i32 1, label %160
             i32 2, label %48
            ]

            32: 
            ; store node label in output array
            %index_32 = load i32, i32* %counter
            %output_32 = load i32*, i32** %output
            %output_32_ptr = getelementptr inbounds i32, i32* %output_32, i32 %index_32
            store i32 32, i32* %output_32_ptr

            ; increment counter
            %temp_32_1 = add i32 %index_32, 1
            store i32 %temp_32_1, i32* %counter
        
            ; get directions for node
            %index_dir_32 = load i32, i32* %dir_counter
            %dir_32 = load i32*, i32** %directions
            %dir_32_ptr = getelementptr inbounds i32, i32* %dir_32, i32 %index_dir_32
            %dir_32_value = load i32, i32* %dir_32_ptr

            ; increment directions counter
            %temp_32_2 = add i32 %index_dir_32, 1
            store i32 %temp_32_2, i32* %dir_counter

            ; switch
            switch i32 %dir_32_value, label %75 [ 
             i32 0, label %75
             i32 1, label %18
             i32 2, label %43
             i32 3, label %41
             i32 4, label %66
            ]

            33: 
            ; store node label in output array
            %index_33 = load i32, i32* %counter
            %output_33 = load i32*, i32** %output
            %output_33_ptr = getelementptr inbounds i32, i32* %output_33, i32 %index_33
            store i32 33, i32* %output_33_ptr

            ; increment counter
            %temp_33_1 = add i32 %index_33, 1
            store i32 %temp_33_1, i32* %counter
        
            ; get directions for node
            %index_dir_33 = load i32, i32* %dir_counter
            %dir_33 = load i32*, i32** %directions
            %dir_33_ptr = getelementptr inbounds i32, i32* %dir_33, i32 %index_dir_33
            %dir_33_value = load i32, i32* %dir_33_ptr

            ; increment directions counter
            %temp_33_2 = add i32 %index_dir_33, 1
            store i32 %temp_33_2, i32* %dir_counter

            ; switch
            switch i32 %dir_33_value, label %44 [ 
             i32 0, label %44
             i32 1, label %169
             i32 2, label %70
             i32 3, label %166
             i32 4, label %183
             i32 5, label %76
             i32 6, label %117
            ]

            34: 
            ; store node label in output array
            %index_34 = load i32, i32* %counter
            %output_34 = load i32*, i32** %output
            %output_34_ptr = getelementptr inbounds i32, i32* %output_34, i32 %index_34
            store i32 34, i32* %output_34_ptr

            ; increment counter
            %temp_34_1 = add i32 %index_34, 1
            store i32 %temp_34_1, i32* %counter
        
            ; get directions for node
            %index_dir_34 = load i32, i32* %dir_counter
            %dir_34 = load i32*, i32** %directions
            %dir_34_ptr = getelementptr inbounds i32, i32* %dir_34, i32 %index_dir_34
            %dir_34_value = load i32, i32* %dir_34_ptr

            ; increment directions counter
            %temp_34_2 = add i32 %index_dir_34, 1
            store i32 %temp_34_2, i32* %dir_counter

            ; switch
            switch i32 %dir_34_value, label %83 [ 
             i32 0, label %83
             i32 1, label %128
             i32 2, label %122
             i32 3, label %30
             i32 4, label %7
             i32 5, label %80
             i32 6, label %99
             i32 7, label %88
            ]

            35: 
            ; store node label in output array
            %index_35 = load i32, i32* %counter
            %output_35 = load i32*, i32** %output
            %output_35_ptr = getelementptr inbounds i32, i32* %output_35, i32 %index_35
            store i32 35, i32* %output_35_ptr

            ; increment counter
            %temp_35_1 = add i32 %index_35, 1
            store i32 %temp_35_1, i32* %counter
        
            ; get directions for node
            %index_dir_35 = load i32, i32* %dir_counter
            %dir_35 = load i32*, i32** %directions
            %dir_35_ptr = getelementptr inbounds i32, i32* %dir_35, i32 %index_dir_35
            %dir_35_value = load i32, i32* %dir_35_ptr

            ; increment directions counter
            %temp_35_2 = add i32 %index_dir_35, 1
            store i32 %temp_35_2, i32* %dir_counter

            ; switch
            switch i32 %dir_35_value, label %204 [ 
             i32 0, label %204
             i32 1, label %49
             i32 2, label %67
             i32 3, label %28
             i32 4, label %65
             i32 5, label %187
            ]

            36: 
            ; store node label in output array
            %index_36 = load i32, i32* %counter
            %output_36 = load i32*, i32** %output
            %output_36_ptr = getelementptr inbounds i32, i32* %output_36, i32 %index_36
            store i32 36, i32* %output_36_ptr

            ; increment counter
            %temp_36_1 = add i32 %index_36, 1
            store i32 %temp_36_1, i32* %counter
        
            ; get directions for node
            %index_dir_36 = load i32, i32* %dir_counter
            %dir_36 = load i32*, i32** %directions
            %dir_36_ptr = getelementptr inbounds i32, i32* %dir_36, i32 %index_dir_36
            %dir_36_value = load i32, i32* %dir_36_ptr

            ; increment directions counter
            %temp_36_2 = add i32 %index_dir_36, 1
            store i32 %temp_36_2, i32* %dir_counter

            ; switch
            switch i32 %dir_36_value, label %54 [ 
             i32 0, label %54
             i32 1, label %156
             i32 2, label %111
             i32 3, label %210
             i32 4, label %6
             i32 5, label %58
             i32 6, label %5
            ]

            37: 
            ; store node label in output array
            %index_37 = load i32, i32* %counter
            %output_37 = load i32*, i32** %output
            %output_37_ptr = getelementptr inbounds i32, i32* %output_37, i32 %index_37
            store i32 37, i32* %output_37_ptr

            ; increment counter
            %temp_37_1 = add i32 %index_37, 1
            store i32 %temp_37_1, i32* %counter
        
            ; get directions for node
            %index_dir_37 = load i32, i32* %dir_counter
            %dir_37 = load i32*, i32** %directions
            %dir_37_ptr = getelementptr inbounds i32, i32* %dir_37, i32 %index_dir_37
            %dir_37_value = load i32, i32* %dir_37_ptr

            ; increment directions counter
            %temp_37_2 = add i32 %index_dir_37, 1
            store i32 %temp_37_2, i32* %dir_counter

            ; switch
            switch i32 %dir_37_value, label %38 [ 
             i32 0, label %38
             i32 1, label %10
             i32 2, label %185
             i32 3, label %42
             i32 4, label %115
             i32 5, label %181
            ]

            38: 
            ; store node label in output array
            %index_38 = load i32, i32* %counter
            %output_38 = load i32*, i32** %output
            %output_38_ptr = getelementptr inbounds i32, i32* %output_38, i32 %index_38
            store i32 38, i32* %output_38_ptr

            ; increment counter
            %temp_38_1 = add i32 %index_38, 1
            store i32 %temp_38_1, i32* %counter
        
            ; get directions for node
            %index_dir_38 = load i32, i32* %dir_counter
            %dir_38 = load i32*, i32** %directions
            %dir_38_ptr = getelementptr inbounds i32, i32* %dir_38, i32 %index_dir_38
            %dir_38_value = load i32, i32* %dir_38_ptr

            ; increment directions counter
            %temp_38_2 = add i32 %index_dir_38, 1
            store i32 %temp_38_2, i32* %dir_counter

            ; switch
            switch i32 %dir_38_value, label %174 [ 
             i32 0, label %174
             i32 1, label %110
             i32 2, label %140
             i32 3, label %214
             i32 4, label %57
             i32 5, label %162
             i32 6, label %205
            ]

            39: 
            ; store node label in output array
            %index_39 = load i32, i32* %counter
            %output_39 = load i32*, i32** %output
            %output_39_ptr = getelementptr inbounds i32, i32* %output_39, i32 %index_39
            store i32 39, i32* %output_39_ptr

            ; increment counter
            %temp_39_1 = add i32 %index_39, 1
            store i32 %temp_39_1, i32* %counter
        
            ; get directions for node
            %index_dir_39 = load i32, i32* %dir_counter
            %dir_39 = load i32*, i32** %directions
            %dir_39_ptr = getelementptr inbounds i32, i32* %dir_39, i32 %index_dir_39
            %dir_39_value = load i32, i32* %dir_39_ptr

            ; increment directions counter
            %temp_39_2 = add i32 %index_dir_39, 1
            store i32 %temp_39_2, i32* %dir_counter

            ; switch
            switch i32 %dir_39_value, label %133 [ 
             i32 0, label %133
             i32 1, label %116
             i32 2, label %58
             i32 3, label %135
             i32 4, label %167
             i32 5, label %8
             i32 6, label %102
             i32 7, label %173
            ]

            40: 
            ; store node label in output array
            %index_40 = load i32, i32* %counter
            %output_40 = load i32*, i32** %output
            %output_40_ptr = getelementptr inbounds i32, i32* %output_40, i32 %index_40
            store i32 40, i32* %output_40_ptr

            ; increment counter
            %temp_40_1 = add i32 %index_40, 1
            store i32 %temp_40_1, i32* %counter
        
            ; get directions for node
            %index_dir_40 = load i32, i32* %dir_counter
            %dir_40 = load i32*, i32** %directions
            %dir_40_ptr = getelementptr inbounds i32, i32* %dir_40, i32 %index_dir_40
            %dir_40_value = load i32, i32* %dir_40_ptr

            ; increment directions counter
            %temp_40_2 = add i32 %index_dir_40, 1
            store i32 %temp_40_2, i32* %dir_counter

            ; switch
            switch i32 %dir_40_value, label %206 [ 
             i32 0, label %206
             i32 1, label %83
             i32 2, label %169
             i32 3, label %162
             i32 4, label %110
             i32 5, label %16
             i32 6, label %189
            ]

            41: 
            ; store node label in output array
            %index_41 = load i32, i32* %counter
            %output_41 = load i32*, i32** %output
            %output_41_ptr = getelementptr inbounds i32, i32* %output_41, i32 %index_41
            store i32 41, i32* %output_41_ptr

            ; increment counter
            %temp_41_1 = add i32 %index_41, 1
            store i32 %temp_41_1, i32* %counter
        
            ; get directions for node
            %index_dir_41 = load i32, i32* %dir_counter
            %dir_41 = load i32*, i32** %directions
            %dir_41_ptr = getelementptr inbounds i32, i32* %dir_41, i32 %index_dir_41
            %dir_41_value = load i32, i32* %dir_41_ptr

            ; increment directions counter
            %temp_41_2 = add i32 %index_dir_41, 1
            store i32 %temp_41_2, i32* %dir_counter

            ; switch
            switch i32 %dir_41_value, label %33 [ 
             i32 0, label %33
             i32 1, label %55
             i32 2, label %225
             i32 3, label %13
             i32 4, label %79
            ]

            42: 
            ; store node label in output array
            %index_42 = load i32, i32* %counter
            %output_42 = load i32*, i32** %output
            %output_42_ptr = getelementptr inbounds i32, i32* %output_42, i32 %index_42
            store i32 42, i32* %output_42_ptr

            ; increment counter
            %temp_42_1 = add i32 %index_42, 1
            store i32 %temp_42_1, i32* %counter
        
            ; get directions for node
            %index_dir_42 = load i32, i32* %dir_counter
            %dir_42 = load i32*, i32** %directions
            %dir_42_ptr = getelementptr inbounds i32, i32* %dir_42, i32 %index_dir_42
            %dir_42_value = load i32, i32* %dir_42_ptr

            ; increment directions counter
            %temp_42_2 = add i32 %index_dir_42, 1
            store i32 %temp_42_2, i32* %dir_counter

            ; switch
            switch i32 %dir_42_value, label %220 [ 
             i32 0, label %220
             i32 1, label %20
             i32 2, label %80
            ]

            43: 
            ; store node label in output array
            %index_43 = load i32, i32* %counter
            %output_43 = load i32*, i32** %output
            %output_43_ptr = getelementptr inbounds i32, i32* %output_43, i32 %index_43
            store i32 43, i32* %output_43_ptr

            ; increment counter
            %temp_43_1 = add i32 %index_43, 1
            store i32 %temp_43_1, i32* %counter
        
            ; get directions for node
            %index_dir_43 = load i32, i32* %dir_counter
            %dir_43 = load i32*, i32** %directions
            %dir_43_ptr = getelementptr inbounds i32, i32* %dir_43, i32 %index_dir_43
            %dir_43_value = load i32, i32* %dir_43_ptr

            ; increment directions counter
            %temp_43_2 = add i32 %index_dir_43, 1
            store i32 %temp_43_2, i32* %dir_counter

            ; switch
            switch i32 %dir_43_value, label %191 [ 
             i32 0, label %191
             i32 1, label %41
             i32 2, label %107
             i32 3, label %145
             i32 4, label %65
            ]

            44: 
            ; store node label in output array
            %index_44 = load i32, i32* %counter
            %output_44 = load i32*, i32** %output
            %output_44_ptr = getelementptr inbounds i32, i32* %output_44, i32 %index_44
            store i32 44, i32* %output_44_ptr

            ; increment counter
            %temp_44_1 = add i32 %index_44, 1
            store i32 %temp_44_1, i32* %counter
        
            ; get directions for node
            %index_dir_44 = load i32, i32* %dir_counter
            %dir_44 = load i32*, i32** %directions
            %dir_44_ptr = getelementptr inbounds i32, i32* %dir_44, i32 %index_dir_44
            %dir_44_value = load i32, i32* %dir_44_ptr

            ; increment directions counter
            %temp_44_2 = add i32 %index_dir_44, 1
            store i32 %temp_44_2, i32* %dir_counter

            ; switch
            switch i32 %dir_44_value, label %3 [ 
             i32 0, label %3
             i32 1, label %144
             i32 2, label %225
             i32 3, label %218
            ]

            45: 
            ; store node label in output array
            %index_45 = load i32, i32* %counter
            %output_45 = load i32*, i32** %output
            %output_45_ptr = getelementptr inbounds i32, i32* %output_45, i32 %index_45
            store i32 45, i32* %output_45_ptr

            ; increment counter
            %temp_45_1 = add i32 %index_45, 1
            store i32 %temp_45_1, i32* %counter
        
            ; get directions for node
            %index_dir_45 = load i32, i32* %dir_counter
            %dir_45 = load i32*, i32** %directions
            %dir_45_ptr = getelementptr inbounds i32, i32* %dir_45, i32 %index_dir_45
            %dir_45_value = load i32, i32* %dir_45_ptr

            ; increment directions counter
            %temp_45_2 = add i32 %index_dir_45, 1
            store i32 %temp_45_2, i32* %dir_counter

            ; switch
            switch i32 %dir_45_value, label %152 [ 
             i32 0, label %152
             i32 1, label %210
             i32 2, label %56
            ]

            46: 
            ; store node label in output array
            %index_46 = load i32, i32* %counter
            %output_46 = load i32*, i32** %output
            %output_46_ptr = getelementptr inbounds i32, i32* %output_46, i32 %index_46
            store i32 46, i32* %output_46_ptr

            ; increment counter
            %temp_46_1 = add i32 %index_46, 1
            store i32 %temp_46_1, i32* %counter
        
            ; get directions for node
            %index_dir_46 = load i32, i32* %dir_counter
            %dir_46 = load i32*, i32** %directions
            %dir_46_ptr = getelementptr inbounds i32, i32* %dir_46, i32 %index_dir_46
            %dir_46_value = load i32, i32* %dir_46_ptr

            ; increment directions counter
            %temp_46_2 = add i32 %index_dir_46, 1
            store i32 %temp_46_2, i32* %dir_counter

            ; switch
            switch i32 %dir_46_value, label %118 [ 
             i32 0, label %118
             i32 1, label %44
             i32 2, label %212
             i32 3, label %223
             i32 4, label %200
             i32 5, label %181
             i32 6, label %230
            ]

            47: 
            ; store node label in output array
            %index_47 = load i32, i32* %counter
            %output_47 = load i32*, i32** %output
            %output_47_ptr = getelementptr inbounds i32, i32* %output_47, i32 %index_47
            store i32 47, i32* %output_47_ptr

            ; increment counter
            %temp_47_1 = add i32 %index_47, 1
            store i32 %temp_47_1, i32* %counter
        
            ; get directions for node
            %index_dir_47 = load i32, i32* %dir_counter
            %dir_47 = load i32*, i32** %directions
            %dir_47_ptr = getelementptr inbounds i32, i32* %dir_47, i32 %index_dir_47
            %dir_47_value = load i32, i32* %dir_47_ptr

            ; increment directions counter
            %temp_47_2 = add i32 %index_dir_47, 1
            store i32 %temp_47_2, i32* %dir_counter

            ; switch
            switch i32 %dir_47_value, label %131 [ 
             i32 0, label %131
             i32 1, label %10
             i32 2, label %97
             i32 3, label %52
             i32 4, label %89
             i32 5, label %26
             i32 6, label %53
            ]

            48: 
            ; store node label in output array
            %index_48 = load i32, i32* %counter
            %output_48 = load i32*, i32** %output
            %output_48_ptr = getelementptr inbounds i32, i32* %output_48, i32 %index_48
            store i32 48, i32* %output_48_ptr

            ; increment counter
            %temp_48_1 = add i32 %index_48, 1
            store i32 %temp_48_1, i32* %counter
        
            ; get directions for node
            %index_dir_48 = load i32, i32* %dir_counter
            %dir_48 = load i32*, i32** %directions
            %dir_48_ptr = getelementptr inbounds i32, i32* %dir_48, i32 %index_dir_48
            %dir_48_value = load i32, i32* %dir_48_ptr

            ; increment directions counter
            %temp_48_2 = add i32 %index_dir_48, 1
            store i32 %temp_48_2, i32* %dir_counter

            ; switch
            switch i32 %dir_48_value, label %173 [ 
             i32 0, label %173
             i32 1, label %111
             i32 2, label %152
             i32 3, label %50
             i32 4, label %127
             i32 5, label %27
             i32 6, label %171
            ]

            49: 
            ; store node label in output array
            %index_49 = load i32, i32* %counter
            %output_49 = load i32*, i32** %output
            %output_49_ptr = getelementptr inbounds i32, i32* %output_49, i32 %index_49
            store i32 49, i32* %output_49_ptr

            ; increment counter
            %temp_49_1 = add i32 %index_49, 1
            store i32 %temp_49_1, i32* %counter
        
            ; get directions for node
            %index_dir_49 = load i32, i32* %dir_counter
            %dir_49 = load i32*, i32** %directions
            %dir_49_ptr = getelementptr inbounds i32, i32* %dir_49, i32 %index_dir_49
            %dir_49_value = load i32, i32* %dir_49_ptr

            ; increment directions counter
            %temp_49_2 = add i32 %index_dir_49, 1
            store i32 %temp_49_2, i32* %dir_counter

            ; switch
            switch i32 %dir_49_value, label %76 [ 
             i32 0, label %76
             i32 1, label %130
             i32 2, label %128
             i32 3, label %5
             i32 4, label %84
             i32 5, label %157
            ]

            50: 
            ; store node label in output array
            %index_50 = load i32, i32* %counter
            %output_50 = load i32*, i32** %output
            %output_50_ptr = getelementptr inbounds i32, i32* %output_50, i32 %index_50
            store i32 50, i32* %output_50_ptr

            ; increment counter
            %temp_50_1 = add i32 %index_50, 1
            store i32 %temp_50_1, i32* %counter
        
            ; get directions for node
            %index_dir_50 = load i32, i32* %dir_counter
            %dir_50 = load i32*, i32** %directions
            %dir_50_ptr = getelementptr inbounds i32, i32* %dir_50, i32 %index_dir_50
            %dir_50_value = load i32, i32* %dir_50_ptr

            ; increment directions counter
            %temp_50_2 = add i32 %index_dir_50, 1
            store i32 %temp_50_2, i32* %dir_counter

            ; switch
            switch i32 %dir_50_value, label %103 [ 
             i32 0, label %103
             i32 1, label %73
             i32 2, label %5
             i32 3, label %41
             i32 4, label %52
             i32 5, label %220
             i32 6, label %84
             i32 7, label %208
             i32 8, label %145
            ]

            51: 
            ; store node label in output array
            %index_51 = load i32, i32* %counter
            %output_51 = load i32*, i32** %output
            %output_51_ptr = getelementptr inbounds i32, i32* %output_51, i32 %index_51
            store i32 51, i32* %output_51_ptr

            ; increment counter
            %temp_51_1 = add i32 %index_51, 1
            store i32 %temp_51_1, i32* %counter
        
            ; get directions for node
            %index_dir_51 = load i32, i32* %dir_counter
            %dir_51 = load i32*, i32** %directions
            %dir_51_ptr = getelementptr inbounds i32, i32* %dir_51, i32 %index_dir_51
            %dir_51_value = load i32, i32* %dir_51_ptr

            ; increment directions counter
            %temp_51_2 = add i32 %index_dir_51, 1
            store i32 %temp_51_2, i32* %dir_counter

            ; switch
            switch i32 %dir_51_value, label %35 [ 
             i32 0, label %35
             i32 1, label %87
             i32 2, label %110
             i32 3, label %55
             i32 4, label %69
             i32 5, label %173
             i32 6, label %25
             i32 7, label %215
             i32 8, label %98
            ]

            52: 
            ; store node label in output array
            %index_52 = load i32, i32* %counter
            %output_52 = load i32*, i32** %output
            %output_52_ptr = getelementptr inbounds i32, i32* %output_52, i32 %index_52
            store i32 52, i32* %output_52_ptr

            ; increment counter
            %temp_52_1 = add i32 %index_52, 1
            store i32 %temp_52_1, i32* %counter
        
            ; get directions for node
            %index_dir_52 = load i32, i32* %dir_counter
            %dir_52 = load i32*, i32** %directions
            %dir_52_ptr = getelementptr inbounds i32, i32* %dir_52, i32 %index_dir_52
            %dir_52_value = load i32, i32* %dir_52_ptr

            ; increment directions counter
            %temp_52_2 = add i32 %index_dir_52, 1
            store i32 %temp_52_2, i32* %dir_counter

            ; switch
            switch i32 %dir_52_value, label %89 [ 
             i32 0, label %89
             i32 1, label %226
             i32 2, label %215
             i32 3, label %176
             i32 4, label %137
             i32 5, label %125
             i32 6, label %197
             i32 7, label %230
            ]

            53: 
            ; store node label in output array
            %index_53 = load i32, i32* %counter
            %output_53 = load i32*, i32** %output
            %output_53_ptr = getelementptr inbounds i32, i32* %output_53, i32 %index_53
            store i32 53, i32* %output_53_ptr

            ; increment counter
            %temp_53_1 = add i32 %index_53, 1
            store i32 %temp_53_1, i32* %counter
        
            ; get directions for node
            %index_dir_53 = load i32, i32* %dir_counter
            %dir_53 = load i32*, i32** %directions
            %dir_53_ptr = getelementptr inbounds i32, i32* %dir_53, i32 %index_dir_53
            %dir_53_value = load i32, i32* %dir_53_ptr

            ; increment directions counter
            %temp_53_2 = add i32 %index_dir_53, 1
            store i32 %temp_53_2, i32* %dir_counter

            ; switch
            switch i32 %dir_53_value, label %61 [ 
             i32 0, label %61
             i32 1, label %17
             i32 2, label %186
             i32 3, label %11
             i32 4, label %22
             i32 5, label %35
             i32 6, label %44
            ]

            54: 
            ; store node label in output array
            %index_54 = load i32, i32* %counter
            %output_54 = load i32*, i32** %output
            %output_54_ptr = getelementptr inbounds i32, i32* %output_54, i32 %index_54
            store i32 54, i32* %output_54_ptr

            ; increment counter
            %temp_54_1 = add i32 %index_54, 1
            store i32 %temp_54_1, i32* %counter
        
            ; get directions for node
            %index_dir_54 = load i32, i32* %dir_counter
            %dir_54 = load i32*, i32** %directions
            %dir_54_ptr = getelementptr inbounds i32, i32* %dir_54, i32 %index_dir_54
            %dir_54_value = load i32, i32* %dir_54_ptr

            ; increment directions counter
            %temp_54_2 = add i32 %index_dir_54, 1
            store i32 %temp_54_2, i32* %dir_counter

            ; switch
            switch i32 %dir_54_value, label %138 [ 
             i32 0, label %138
             i32 1, label %55
             i32 2, label %69
             i32 3, label %195
            ]

            55: 
            ; store node label in output array
            %index_55 = load i32, i32* %counter
            %output_55 = load i32*, i32** %output
            %output_55_ptr = getelementptr inbounds i32, i32* %output_55, i32 %index_55
            store i32 55, i32* %output_55_ptr

            ; increment counter
            %temp_55_1 = add i32 %index_55, 1
            store i32 %temp_55_1, i32* %counter
        
            ; get directions for node
            %index_dir_55 = load i32, i32* %dir_counter
            %dir_55 = load i32*, i32** %directions
            %dir_55_ptr = getelementptr inbounds i32, i32* %dir_55, i32 %index_dir_55
            %dir_55_value = load i32, i32* %dir_55_ptr

            ; increment directions counter
            %temp_55_2 = add i32 %index_dir_55, 1
            store i32 %temp_55_2, i32* %dir_counter

            ; switch
            switch i32 %dir_55_value, label %154 [ 
             i32 0, label %154
             i32 1, label %130
             i32 2, label %216
             i32 3, label %66
             i32 4, label %95
            ]

            56: 
            ; store node label in output array
            %index_56 = load i32, i32* %counter
            %output_56 = load i32*, i32** %output
            %output_56_ptr = getelementptr inbounds i32, i32* %output_56, i32 %index_56
            store i32 56, i32* %output_56_ptr

            ; increment counter
            %temp_56_1 = add i32 %index_56, 1
            store i32 %temp_56_1, i32* %counter
        
            ; get directions for node
            %index_dir_56 = load i32, i32* %dir_counter
            %dir_56 = load i32*, i32** %directions
            %dir_56_ptr = getelementptr inbounds i32, i32* %dir_56, i32 %index_dir_56
            %dir_56_value = load i32, i32* %dir_56_ptr

            ; increment directions counter
            %temp_56_2 = add i32 %index_dir_56, 1
            store i32 %temp_56_2, i32* %dir_counter

            ; switch
            switch i32 %dir_56_value, label %88 [ 
             i32 0, label %88
             i32 1, label %30
             i32 2, label %75
             i32 3, label %61
             i32 4, label %223
            ]

            57: 
            ; store node label in output array
            %index_57 = load i32, i32* %counter
            %output_57 = load i32*, i32** %output
            %output_57_ptr = getelementptr inbounds i32, i32* %output_57, i32 %index_57
            store i32 57, i32* %output_57_ptr

            ; increment counter
            %temp_57_1 = add i32 %index_57, 1
            store i32 %temp_57_1, i32* %counter
        
            ; get directions for node
            %index_dir_57 = load i32, i32* %dir_counter
            %dir_57 = load i32*, i32** %directions
            %dir_57_ptr = getelementptr inbounds i32, i32* %dir_57, i32 %index_dir_57
            %dir_57_value = load i32, i32* %dir_57_ptr

            ; increment directions counter
            %temp_57_2 = add i32 %index_dir_57, 1
            store i32 %temp_57_2, i32* %dir_counter

            ; switch
            switch i32 %dir_57_value, label %200 [ 
             i32 0, label %200
             i32 1, label %184
             i32 2, label %228
             i32 3, label %126
             i32 4, label %35
             i32 5, label %149
             i32 6, label %142
            ]

            58: 
            ; store node label in output array
            %index_58 = load i32, i32* %counter
            %output_58 = load i32*, i32** %output
            %output_58_ptr = getelementptr inbounds i32, i32* %output_58, i32 %index_58
            store i32 58, i32* %output_58_ptr

            ; increment counter
            %temp_58_1 = add i32 %index_58, 1
            store i32 %temp_58_1, i32* %counter
        
            ; get directions for node
            %index_dir_58 = load i32, i32* %dir_counter
            %dir_58 = load i32*, i32** %directions
            %dir_58_ptr = getelementptr inbounds i32, i32* %dir_58, i32 %index_dir_58
            %dir_58_value = load i32, i32* %dir_58_ptr

            ; increment directions counter
            %temp_58_2 = add i32 %index_dir_58, 1
            store i32 %temp_58_2, i32* %dir_counter

            ; switch
            switch i32 %dir_58_value, label %27 [ 
             i32 0, label %27
             i32 1, label %83
             i32 2, label %11
             i32 3, label %105
             i32 4, label %19
             i32 5, label %98
             i32 6, label %222
             i32 7, label %202
             i32 8, label %38
             i32 9, label %230
            ]

            59: 
            ; store node label in output array
            %index_59 = load i32, i32* %counter
            %output_59 = load i32*, i32** %output
            %output_59_ptr = getelementptr inbounds i32, i32* %output_59, i32 %index_59
            store i32 59, i32* %output_59_ptr

            ; increment counter
            %temp_59_1 = add i32 %index_59, 1
            store i32 %temp_59_1, i32* %counter
        
            ; get directions for node
            %index_dir_59 = load i32, i32* %dir_counter
            %dir_59 = load i32*, i32** %directions
            %dir_59_ptr = getelementptr inbounds i32, i32* %dir_59, i32 %index_dir_59
            %dir_59_value = load i32, i32* %dir_59_ptr

            ; increment directions counter
            %temp_59_2 = add i32 %index_dir_59, 1
            store i32 %temp_59_2, i32* %dir_counter

            ; switch
            switch i32 %dir_59_value, label %33 [ 
             i32 0, label %33
             i32 1, label %88
             i32 2, label %30
             i32 3, label %158
             i32 4, label %151
             i32 5, label %201
             i32 6, label %97
             i32 7, label %20
             i32 8, label %147
            ]

            60: 
            ; store node label in output array
            %index_60 = load i32, i32* %counter
            %output_60 = load i32*, i32** %output
            %output_60_ptr = getelementptr inbounds i32, i32* %output_60, i32 %index_60
            store i32 60, i32* %output_60_ptr

            ; increment counter
            %temp_60_1 = add i32 %index_60, 1
            store i32 %temp_60_1, i32* %counter
        
            ; get directions for node
            %index_dir_60 = load i32, i32* %dir_counter
            %dir_60 = load i32*, i32** %directions
            %dir_60_ptr = getelementptr inbounds i32, i32* %dir_60, i32 %index_dir_60
            %dir_60_value = load i32, i32* %dir_60_ptr

            ; increment directions counter
            %temp_60_2 = add i32 %index_dir_60, 1
            store i32 %temp_60_2, i32* %dir_counter

            ; switch
            switch i32 %dir_60_value, label %58 [ 
             i32 0, label %58
             i32 1, label %145
             i32 2, label %21
             i32 3, label %69
             i32 4, label %94
             i32 5, label %229
             i32 6, label %76
            ]

            61: 
            ; store node label in output array
            %index_61 = load i32, i32* %counter
            %output_61 = load i32*, i32** %output
            %output_61_ptr = getelementptr inbounds i32, i32* %output_61, i32 %index_61
            store i32 61, i32* %output_61_ptr

            ; increment counter
            %temp_61_1 = add i32 %index_61, 1
            store i32 %temp_61_1, i32* %counter
        
            ; get directions for node
            %index_dir_61 = load i32, i32* %dir_counter
            %dir_61 = load i32*, i32** %directions
            %dir_61_ptr = getelementptr inbounds i32, i32* %dir_61, i32 %index_dir_61
            %dir_61_value = load i32, i32* %dir_61_ptr

            ; increment directions counter
            %temp_61_2 = add i32 %index_dir_61, 1
            store i32 %temp_61_2, i32* %dir_counter

            ; switch
            switch i32 %dir_61_value, label %137 [ 
             i32 0, label %137
             i32 1, label %30
             i32 2, label %118
             i32 3, label %71
             i32 4, label %28
             i32 5, label %202
             i32 6, label %12
             i32 7, label %230
            ]

            62: 
            ; store node label in output array
            %index_62 = load i32, i32* %counter
            %output_62 = load i32*, i32** %output
            %output_62_ptr = getelementptr inbounds i32, i32* %output_62, i32 %index_62
            store i32 62, i32* %output_62_ptr

            ; increment counter
            %temp_62_1 = add i32 %index_62, 1
            store i32 %temp_62_1, i32* %counter
        
            ; get directions for node
            %index_dir_62 = load i32, i32* %dir_counter
            %dir_62 = load i32*, i32** %directions
            %dir_62_ptr = getelementptr inbounds i32, i32* %dir_62, i32 %index_dir_62
            %dir_62_value = load i32, i32* %dir_62_ptr

            ; increment directions counter
            %temp_62_2 = add i32 %index_dir_62, 1
            store i32 %temp_62_2, i32* %dir_counter

            ; switch
            switch i32 %dir_62_value, label %76 [ 
             i32 0, label %76
             i32 1, label %4
             i32 2, label %158
             i32 3, label %172
             i32 4, label %24
             i32 5, label %106
             i32 6, label %30
             i32 7, label %212
            ]

            63: 
            ; store node label in output array
            %index_63 = load i32, i32* %counter
            %output_63 = load i32*, i32** %output
            %output_63_ptr = getelementptr inbounds i32, i32* %output_63, i32 %index_63
            store i32 63, i32* %output_63_ptr

            ; increment counter
            %temp_63_1 = add i32 %index_63, 1
            store i32 %temp_63_1, i32* %counter
        
            ; get directions for node
            %index_dir_63 = load i32, i32* %dir_counter
            %dir_63 = load i32*, i32** %directions
            %dir_63_ptr = getelementptr inbounds i32, i32* %dir_63, i32 %index_dir_63
            %dir_63_value = load i32, i32* %dir_63_ptr

            ; increment directions counter
            %temp_63_2 = add i32 %index_dir_63, 1
            store i32 %temp_63_2, i32* %dir_counter

            ; switch
            switch i32 %dir_63_value, label %11 [ 
             i32 0, label %11
             i32 1, label %49
             i32 2, label %62
             i32 3, label %202
             i32 4, label %151
             i32 5, label %108
             i32 6, label %42
             i32 7, label %30
             i32 8, label %116
            ]

            64: 
            ; store node label in output array
            %index_64 = load i32, i32* %counter
            %output_64 = load i32*, i32** %output
            %output_64_ptr = getelementptr inbounds i32, i32* %output_64, i32 %index_64
            store i32 64, i32* %output_64_ptr

            ; increment counter
            %temp_64_1 = add i32 %index_64, 1
            store i32 %temp_64_1, i32* %counter
        
            ; get directions for node
            %index_dir_64 = load i32, i32* %dir_counter
            %dir_64 = load i32*, i32** %directions
            %dir_64_ptr = getelementptr inbounds i32, i32* %dir_64, i32 %index_dir_64
            %dir_64_value = load i32, i32* %dir_64_ptr

            ; increment directions counter
            %temp_64_2 = add i32 %index_dir_64, 1
            store i32 %temp_64_2, i32* %dir_counter

            ; switch
            switch i32 %dir_64_value, label %175 [ 
             i32 0, label %175
             i32 1, label %62
             i32 2, label %41
             i32 3, label %191
             i32 4, label %230
            ]

            65: 
            ; store node label in output array
            %index_65 = load i32, i32* %counter
            %output_65 = load i32*, i32** %output
            %output_65_ptr = getelementptr inbounds i32, i32* %output_65, i32 %index_65
            store i32 65, i32* %output_65_ptr

            ; increment counter
            %temp_65_1 = add i32 %index_65, 1
            store i32 %temp_65_1, i32* %counter
        
            ; get directions for node
            %index_dir_65 = load i32, i32* %dir_counter
            %dir_65 = load i32*, i32** %directions
            %dir_65_ptr = getelementptr inbounds i32, i32* %dir_65, i32 %index_dir_65
            %dir_65_value = load i32, i32* %dir_65_ptr

            ; increment directions counter
            %temp_65_2 = add i32 %index_dir_65, 1
            store i32 %temp_65_2, i32* %dir_counter

            ; switch
            switch i32 %dir_65_value, label %27 [ 
             i32 0, label %27
             i32 1, label %112
             i32 2, label %97
             i32 3, label %207
             i32 4, label %139
             i32 5, label %210
             i32 6, label %76
             i32 7, label %141
             i32 8, label %65
            ]

            66: 
            ; store node label in output array
            %index_66 = load i32, i32* %counter
            %output_66 = load i32*, i32** %output
            %output_66_ptr = getelementptr inbounds i32, i32* %output_66, i32 %index_66
            store i32 66, i32* %output_66_ptr

            ; increment counter
            %temp_66_1 = add i32 %index_66, 1
            store i32 %temp_66_1, i32* %counter
        
            ; get directions for node
            %index_dir_66 = load i32, i32* %dir_counter
            %dir_66 = load i32*, i32** %directions
            %dir_66_ptr = getelementptr inbounds i32, i32* %dir_66, i32 %index_dir_66
            %dir_66_value = load i32, i32* %dir_66_ptr

            ; increment directions counter
            %temp_66_2 = add i32 %index_dir_66, 1
            store i32 %temp_66_2, i32* %dir_counter

            ; switch
            switch i32 %dir_66_value, label %123 [ 
             i32 0, label %123
             i32 1, label %81
             i32 2, label %26
             i32 3, label %54
             i32 4, label %167
             i32 5, label %82
             i32 6, label %11
             i32 7, label %7
            ]

            67: 
            ; store node label in output array
            %index_67 = load i32, i32* %counter
            %output_67 = load i32*, i32** %output
            %output_67_ptr = getelementptr inbounds i32, i32* %output_67, i32 %index_67
            store i32 67, i32* %output_67_ptr

            ; increment counter
            %temp_67_1 = add i32 %index_67, 1
            store i32 %temp_67_1, i32* %counter
        
            ; get directions for node
            %index_dir_67 = load i32, i32* %dir_counter
            %dir_67 = load i32*, i32** %directions
            %dir_67_ptr = getelementptr inbounds i32, i32* %dir_67, i32 %index_dir_67
            %dir_67_value = load i32, i32* %dir_67_ptr

            ; increment directions counter
            %temp_67_2 = add i32 %index_dir_67, 1
            store i32 %temp_67_2, i32* %dir_counter

            ; switch
            switch i32 %dir_67_value, label %202 [ 
             i32 0, label %202
             i32 1, label %76
             i32 2, label %186
             i32 3, label %230
            ]

            68: 
            ; store node label in output array
            %index_68 = load i32, i32* %counter
            %output_68 = load i32*, i32** %output
            %output_68_ptr = getelementptr inbounds i32, i32* %output_68, i32 %index_68
            store i32 68, i32* %output_68_ptr

            ; increment counter
            %temp_68_1 = add i32 %index_68, 1
            store i32 %temp_68_1, i32* %counter
        
            ; get directions for node
            %index_dir_68 = load i32, i32* %dir_counter
            %dir_68 = load i32*, i32** %directions
            %dir_68_ptr = getelementptr inbounds i32, i32* %dir_68, i32 %index_dir_68
            %dir_68_value = load i32, i32* %dir_68_ptr

            ; increment directions counter
            %temp_68_2 = add i32 %index_dir_68, 1
            store i32 %temp_68_2, i32* %dir_counter

            ; switch
            switch i32 %dir_68_value, label %82 [ 
             i32 0, label %82
             i32 1, label %116
             i32 2, label %101
             i32 3, label %81
             i32 4, label %103
             i32 5, label %17
            ]

            69: 
            ; store node label in output array
            %index_69 = load i32, i32* %counter
            %output_69 = load i32*, i32** %output
            %output_69_ptr = getelementptr inbounds i32, i32* %output_69, i32 %index_69
            store i32 69, i32* %output_69_ptr

            ; increment counter
            %temp_69_1 = add i32 %index_69, 1
            store i32 %temp_69_1, i32* %counter
        
            ; get directions for node
            %index_dir_69 = load i32, i32* %dir_counter
            %dir_69 = load i32*, i32** %directions
            %dir_69_ptr = getelementptr inbounds i32, i32* %dir_69, i32 %index_dir_69
            %dir_69_value = load i32, i32* %dir_69_ptr

            ; increment directions counter
            %temp_69_2 = add i32 %index_dir_69, 1
            store i32 %temp_69_2, i32* %dir_counter

            ; switch
            switch i32 %dir_69_value, label %154 [ 
             i32 0, label %154
             i32 1, label %117
             i32 2, label %29
             i32 3, label %65
             i32 4, label %56
            ]

            70: 
            ; store node label in output array
            %index_70 = load i32, i32* %counter
            %output_70 = load i32*, i32** %output
            %output_70_ptr = getelementptr inbounds i32, i32* %output_70, i32 %index_70
            store i32 70, i32* %output_70_ptr

            ; increment counter
            %temp_70_1 = add i32 %index_70, 1
            store i32 %temp_70_1, i32* %counter
        
            ; get directions for node
            %index_dir_70 = load i32, i32* %dir_counter
            %dir_70 = load i32*, i32** %directions
            %dir_70_ptr = getelementptr inbounds i32, i32* %dir_70, i32 %index_dir_70
            %dir_70_value = load i32, i32* %dir_70_ptr

            ; increment directions counter
            %temp_70_2 = add i32 %index_dir_70, 1
            store i32 %temp_70_2, i32* %dir_counter

            ; switch
            switch i32 %dir_70_value, label %159 [ 
             i32 0, label %159
             i32 1, label %200
             i32 2, label %229
             i32 3, label %139
             i32 4, label %223
             i32 5, label %177
             i32 6, label %121
             i32 7, label %170
             i32 8, label %92
            ]

            71: 
            ; store node label in output array
            %index_71 = load i32, i32* %counter
            %output_71 = load i32*, i32** %output
            %output_71_ptr = getelementptr inbounds i32, i32* %output_71, i32 %index_71
            store i32 71, i32* %output_71_ptr

            ; increment counter
            %temp_71_1 = add i32 %index_71, 1
            store i32 %temp_71_1, i32* %counter
        
            ; get directions for node
            %index_dir_71 = load i32, i32* %dir_counter
            %dir_71 = load i32*, i32** %directions
            %dir_71_ptr = getelementptr inbounds i32, i32* %dir_71, i32 %index_dir_71
            %dir_71_value = load i32, i32* %dir_71_ptr

            ; increment directions counter
            %temp_71_2 = add i32 %index_dir_71, 1
            store i32 %temp_71_2, i32* %dir_counter

            ; switch
            switch i32 %dir_71_value, label %47 [ 
             i32 0, label %47
             i32 1, label %139
             i32 2, label %54
             i32 3, label %79
             i32 4, label %51
            ]

            72: 
            ; store node label in output array
            %index_72 = load i32, i32* %counter
            %output_72 = load i32*, i32** %output
            %output_72_ptr = getelementptr inbounds i32, i32* %output_72, i32 %index_72
            store i32 72, i32* %output_72_ptr

            ; increment counter
            %temp_72_1 = add i32 %index_72, 1
            store i32 %temp_72_1, i32* %counter
        
            ; get directions for node
            %index_dir_72 = load i32, i32* %dir_counter
            %dir_72 = load i32*, i32** %directions
            %dir_72_ptr = getelementptr inbounds i32, i32* %dir_72, i32 %index_dir_72
            %dir_72_value = load i32, i32* %dir_72_ptr

            ; increment directions counter
            %temp_72_2 = add i32 %index_dir_72, 1
            store i32 %temp_72_2, i32* %dir_counter

            ; switch
            switch i32 %dir_72_value, label %93 [ 
             i32 0, label %93
             i32 1, label %21
             i32 2, label %210
             i32 3, label %72
            ]

            73: 
            ; store node label in output array
            %index_73 = load i32, i32* %counter
            %output_73 = load i32*, i32** %output
            %output_73_ptr = getelementptr inbounds i32, i32* %output_73, i32 %index_73
            store i32 73, i32* %output_73_ptr

            ; increment counter
            %temp_73_1 = add i32 %index_73, 1
            store i32 %temp_73_1, i32* %counter
        
            ; get directions for node
            %index_dir_73 = load i32, i32* %dir_counter
            %dir_73 = load i32*, i32** %directions
            %dir_73_ptr = getelementptr inbounds i32, i32* %dir_73, i32 %index_dir_73
            %dir_73_value = load i32, i32* %dir_73_ptr

            ; increment directions counter
            %temp_73_2 = add i32 %index_dir_73, 1
            store i32 %temp_73_2, i32* %dir_counter

            ; switch
            switch i32 %dir_73_value, label %193 [ 
             i32 0, label %193
             i32 1, label %115
             i32 2, label %24
            ]

            74: 
            ; store node label in output array
            %index_74 = load i32, i32* %counter
            %output_74 = load i32*, i32** %output
            %output_74_ptr = getelementptr inbounds i32, i32* %output_74, i32 %index_74
            store i32 74, i32* %output_74_ptr

            ; increment counter
            %temp_74_1 = add i32 %index_74, 1
            store i32 %temp_74_1, i32* %counter
        
            ; get directions for node
            %index_dir_74 = load i32, i32* %dir_counter
            %dir_74 = load i32*, i32** %directions
            %dir_74_ptr = getelementptr inbounds i32, i32* %dir_74, i32 %index_dir_74
            %dir_74_value = load i32, i32* %dir_74_ptr

            ; increment directions counter
            %temp_74_2 = add i32 %index_dir_74, 1
            store i32 %temp_74_2, i32* %dir_counter

            ; switch
            switch i32 %dir_74_value, label %148 [ 
             i32 0, label %148
             i32 1, label %165
             i32 2, label %87
             i32 3, label %59
             i32 4, label %100
             i32 5, label %79
             i32 6, label %11
             i32 7, label %84
            ]

            75: 
            ; store node label in output array
            %index_75 = load i32, i32* %counter
            %output_75 = load i32*, i32** %output
            %output_75_ptr = getelementptr inbounds i32, i32* %output_75, i32 %index_75
            store i32 75, i32* %output_75_ptr

            ; increment counter
            %temp_75_1 = add i32 %index_75, 1
            store i32 %temp_75_1, i32* %counter
        
            ; get directions for node
            %index_dir_75 = load i32, i32* %dir_counter
            %dir_75 = load i32*, i32** %directions
            %dir_75_ptr = getelementptr inbounds i32, i32* %dir_75, i32 %index_dir_75
            %dir_75_value = load i32, i32* %dir_75_ptr

            ; increment directions counter
            %temp_75_2 = add i32 %index_dir_75, 1
            store i32 %temp_75_2, i32* %dir_counter

            ; switch
            switch i32 %dir_75_value, label %82 [ 
             i32 0, label %82
             i32 1, label %203
             i32 2, label %217
             i32 3, label %149
            ]

            76: 
            ; store node label in output array
            %index_76 = load i32, i32* %counter
            %output_76 = load i32*, i32** %output
            %output_76_ptr = getelementptr inbounds i32, i32* %output_76, i32 %index_76
            store i32 76, i32* %output_76_ptr

            ; increment counter
            %temp_76_1 = add i32 %index_76, 1
            store i32 %temp_76_1, i32* %counter
        
            ; get directions for node
            %index_dir_76 = load i32, i32* %dir_counter
            %dir_76 = load i32*, i32** %directions
            %dir_76_ptr = getelementptr inbounds i32, i32* %dir_76, i32 %index_dir_76
            %dir_76_value = load i32, i32* %dir_76_ptr

            ; increment directions counter
            %temp_76_2 = add i32 %index_dir_76, 1
            store i32 %temp_76_2, i32* %dir_counter

            ; switch
            switch i32 %dir_76_value, label %63 [ 
             i32 0, label %63
             i32 1, label %86
             i32 2, label %26
             i32 3, label %140
             i32 4, label %157
            ]

            77: 
            ; store node label in output array
            %index_77 = load i32, i32* %counter
            %output_77 = load i32*, i32** %output
            %output_77_ptr = getelementptr inbounds i32, i32* %output_77, i32 %index_77
            store i32 77, i32* %output_77_ptr

            ; increment counter
            %temp_77_1 = add i32 %index_77, 1
            store i32 %temp_77_1, i32* %counter
        
            ; get directions for node
            %index_dir_77 = load i32, i32* %dir_counter
            %dir_77 = load i32*, i32** %directions
            %dir_77_ptr = getelementptr inbounds i32, i32* %dir_77, i32 %index_dir_77
            %dir_77_value = load i32, i32* %dir_77_ptr

            ; increment directions counter
            %temp_77_2 = add i32 %index_dir_77, 1
            store i32 %temp_77_2, i32* %dir_counter

            ; switch
            switch i32 %dir_77_value, label %207 [ 
             i32 0, label %207
             i32 1, label %153
             i32 2, label %24
             i32 3, label %63
             i32 4, label %57
             i32 5, label %6
            ]

            78: 
            ; store node label in output array
            %index_78 = load i32, i32* %counter
            %output_78 = load i32*, i32** %output
            %output_78_ptr = getelementptr inbounds i32, i32* %output_78, i32 %index_78
            store i32 78, i32* %output_78_ptr

            ; increment counter
            %temp_78_1 = add i32 %index_78, 1
            store i32 %temp_78_1, i32* %counter
        
            ; get directions for node
            %index_dir_78 = load i32, i32* %dir_counter
            %dir_78 = load i32*, i32** %directions
            %dir_78_ptr = getelementptr inbounds i32, i32* %dir_78, i32 %index_dir_78
            %dir_78_value = load i32, i32* %dir_78_ptr

            ; increment directions counter
            %temp_78_2 = add i32 %index_dir_78, 1
            store i32 %temp_78_2, i32* %dir_counter

            ; switch
            switch i32 %dir_78_value, label %103 [ 
             i32 0, label %103
             i32 1, label %19
             i32 2, label %69
             i32 3, label %142
            ]

            79: 
            ; store node label in output array
            %index_79 = load i32, i32* %counter
            %output_79 = load i32*, i32** %output
            %output_79_ptr = getelementptr inbounds i32, i32* %output_79, i32 %index_79
            store i32 79, i32* %output_79_ptr

            ; increment counter
            %temp_79_1 = add i32 %index_79, 1
            store i32 %temp_79_1, i32* %counter
        
            ; get directions for node
            %index_dir_79 = load i32, i32* %dir_counter
            %dir_79 = load i32*, i32** %directions
            %dir_79_ptr = getelementptr inbounds i32, i32* %dir_79, i32 %index_dir_79
            %dir_79_value = load i32, i32* %dir_79_ptr

            ; increment directions counter
            %temp_79_2 = add i32 %index_dir_79, 1
            store i32 %temp_79_2, i32* %dir_counter

            ; switch
            switch i32 %dir_79_value, label %19 [ 
             i32 0, label %19
             i32 1, label %187
             i32 2, label %20
             i32 3, label %6
             i32 4, label %163
             i32 5, label %3
             i32 6, label %75
             i32 7, label %193
             i32 8, label %203
             i32 9, label %230
            ]

            80: 
            ; store node label in output array
            %index_80 = load i32, i32* %counter
            %output_80 = load i32*, i32** %output
            %output_80_ptr = getelementptr inbounds i32, i32* %output_80, i32 %index_80
            store i32 80, i32* %output_80_ptr

            ; increment counter
            %temp_80_1 = add i32 %index_80, 1
            store i32 %temp_80_1, i32* %counter
        
            ; get directions for node
            %index_dir_80 = load i32, i32* %dir_counter
            %dir_80 = load i32*, i32** %directions
            %dir_80_ptr = getelementptr inbounds i32, i32* %dir_80, i32 %index_dir_80
            %dir_80_value = load i32, i32* %dir_80_ptr

            ; increment directions counter
            %temp_80_2 = add i32 %index_dir_80, 1
            store i32 %temp_80_2, i32* %dir_counter

            ; switch
            switch i32 %dir_80_value, label %127 [ 
             i32 0, label %127
             i32 1, label %121
             i32 2, label %221
             i32 3, label %220
             i32 4, label %40
            ]

            81: 
            ; store node label in output array
            %index_81 = load i32, i32* %counter
            %output_81 = load i32*, i32** %output
            %output_81_ptr = getelementptr inbounds i32, i32* %output_81, i32 %index_81
            store i32 81, i32* %output_81_ptr

            ; increment counter
            %temp_81_1 = add i32 %index_81, 1
            store i32 %temp_81_1, i32* %counter
        
            ; get directions for node
            %index_dir_81 = load i32, i32* %dir_counter
            %dir_81 = load i32*, i32** %directions
            %dir_81_ptr = getelementptr inbounds i32, i32* %dir_81, i32 %index_dir_81
            %dir_81_value = load i32, i32* %dir_81_ptr

            ; increment directions counter
            %temp_81_2 = add i32 %index_dir_81, 1
            store i32 %temp_81_2, i32* %dir_counter

            ; switch
            switch i32 %dir_81_value, label %129 [ 
             i32 0, label %129
             i32 1, label %200
             i32 2, label %204
            ]

            82: 
            ; store node label in output array
            %index_82 = load i32, i32* %counter
            %output_82 = load i32*, i32** %output
            %output_82_ptr = getelementptr inbounds i32, i32* %output_82, i32 %index_82
            store i32 82, i32* %output_82_ptr

            ; increment counter
            %temp_82_1 = add i32 %index_82, 1
            store i32 %temp_82_1, i32* %counter
        
            ; get directions for node
            %index_dir_82 = load i32, i32* %dir_counter
            %dir_82 = load i32*, i32** %directions
            %dir_82_ptr = getelementptr inbounds i32, i32* %dir_82, i32 %index_dir_82
            %dir_82_value = load i32, i32* %dir_82_ptr

            ; increment directions counter
            %temp_82_2 = add i32 %index_dir_82, 1
            store i32 %temp_82_2, i32* %dir_counter

            ; switch
            switch i32 %dir_82_value, label %20 [ 
             i32 0, label %20
             i32 1, label %131
             i32 2, label %171
             i32 3, label %45
             i32 4, label %46
            ]

            83: 
            ; store node label in output array
            %index_83 = load i32, i32* %counter
            %output_83 = load i32*, i32** %output
            %output_83_ptr = getelementptr inbounds i32, i32* %output_83, i32 %index_83
            store i32 83, i32* %output_83_ptr

            ; increment counter
            %temp_83_1 = add i32 %index_83, 1
            store i32 %temp_83_1, i32* %counter
        
            ; get directions for node
            %index_dir_83 = load i32, i32* %dir_counter
            %dir_83 = load i32*, i32** %directions
            %dir_83_ptr = getelementptr inbounds i32, i32* %dir_83, i32 %index_dir_83
            %dir_83_value = load i32, i32* %dir_83_ptr

            ; increment directions counter
            %temp_83_2 = add i32 %index_dir_83, 1
            store i32 %temp_83_2, i32* %dir_counter

            ; switch
            switch i32 %dir_83_value, label %39 [ 
             i32 0, label %39
             i32 1, label %37
             i32 2, label %211
             i32 3, label %222
             i32 4, label %82
             i32 5, label %79
             i32 6, label %28
             i32 7, label %182
             i32 8, label %132
            ]

            84: 
            ; store node label in output array
            %index_84 = load i32, i32* %counter
            %output_84 = load i32*, i32** %output
            %output_84_ptr = getelementptr inbounds i32, i32* %output_84, i32 %index_84
            store i32 84, i32* %output_84_ptr

            ; increment counter
            %temp_84_1 = add i32 %index_84, 1
            store i32 %temp_84_1, i32* %counter
        
            ; get directions for node
            %index_dir_84 = load i32, i32* %dir_counter
            %dir_84 = load i32*, i32** %directions
            %dir_84_ptr = getelementptr inbounds i32, i32* %dir_84, i32 %index_dir_84
            %dir_84_value = load i32, i32* %dir_84_ptr

            ; increment directions counter
            %temp_84_2 = add i32 %index_dir_84, 1
            store i32 %temp_84_2, i32* %dir_counter

            ; switch
            switch i32 %dir_84_value, label %155 [ 
             i32 0, label %155
             i32 1, label %76
             i32 2, label %33
             i32 3, label %229
             i32 4, label %53
             i32 5, label %37
             i32 6, label %140
             i32 7, label %185
             i32 8, label %9
            ]

            85: 
            ; store node label in output array
            %index_85 = load i32, i32* %counter
            %output_85 = load i32*, i32** %output
            %output_85_ptr = getelementptr inbounds i32, i32* %output_85, i32 %index_85
            store i32 85, i32* %output_85_ptr

            ; increment counter
            %temp_85_1 = add i32 %index_85, 1
            store i32 %temp_85_1, i32* %counter
        
            ; get directions for node
            %index_dir_85 = load i32, i32* %dir_counter
            %dir_85 = load i32*, i32** %directions
            %dir_85_ptr = getelementptr inbounds i32, i32* %dir_85, i32 %index_dir_85
            %dir_85_value = load i32, i32* %dir_85_ptr

            ; increment directions counter
            %temp_85_2 = add i32 %index_dir_85, 1
            store i32 %temp_85_2, i32* %dir_counter

            ; switch
            switch i32 %dir_85_value, label %81 [ 
             i32 0, label %81
             i32 1, label %211
             i32 2, label %160
             i32 3, label %206
             i32 4, label %173
             i32 5, label %142
             i32 6, label %216
             i32 7, label %192
             i32 8, label %177
            ]

            86: 
            ; store node label in output array
            %index_86 = load i32, i32* %counter
            %output_86 = load i32*, i32** %output
            %output_86_ptr = getelementptr inbounds i32, i32* %output_86, i32 %index_86
            store i32 86, i32* %output_86_ptr

            ; increment counter
            %temp_86_1 = add i32 %index_86, 1
            store i32 %temp_86_1, i32* %counter
        
            ; get directions for node
            %index_dir_86 = load i32, i32* %dir_counter
            %dir_86 = load i32*, i32** %directions
            %dir_86_ptr = getelementptr inbounds i32, i32* %dir_86, i32 %index_dir_86
            %dir_86_value = load i32, i32* %dir_86_ptr

            ; increment directions counter
            %temp_86_2 = add i32 %index_dir_86, 1
            store i32 %temp_86_2, i32* %dir_counter

            ; switch
            switch i32 %dir_86_value, label %46 [ 
             i32 0, label %46
             i32 1, label %77
             i32 2, label %111
             i32 3, label %138
            ]

            87: 
            ; store node label in output array
            %index_87 = load i32, i32* %counter
            %output_87 = load i32*, i32** %output
            %output_87_ptr = getelementptr inbounds i32, i32* %output_87, i32 %index_87
            store i32 87, i32* %output_87_ptr

            ; increment counter
            %temp_87_1 = add i32 %index_87, 1
            store i32 %temp_87_1, i32* %counter
        
            ; get directions for node
            %index_dir_87 = load i32, i32* %dir_counter
            %dir_87 = load i32*, i32** %directions
            %dir_87_ptr = getelementptr inbounds i32, i32* %dir_87, i32 %index_dir_87
            %dir_87_value = load i32, i32* %dir_87_ptr

            ; increment directions counter
            %temp_87_2 = add i32 %index_dir_87, 1
            store i32 %temp_87_2, i32* %dir_counter

            ; switch
            switch i32 %dir_87_value, label %13 [ 
             i32 0, label %13
             i32 1, label %183
             i32 2, label %221
             i32 3, label %171
            ]

            88: 
            ; store node label in output array
            %index_88 = load i32, i32* %counter
            %output_88 = load i32*, i32** %output
            %output_88_ptr = getelementptr inbounds i32, i32* %output_88, i32 %index_88
            store i32 88, i32* %output_88_ptr

            ; increment counter
            %temp_88_1 = add i32 %index_88, 1
            store i32 %temp_88_1, i32* %counter
        
            ; get directions for node
            %index_dir_88 = load i32, i32* %dir_counter
            %dir_88 = load i32*, i32** %directions
            %dir_88_ptr = getelementptr inbounds i32, i32* %dir_88, i32 %index_dir_88
            %dir_88_value = load i32, i32* %dir_88_ptr

            ; increment directions counter
            %temp_88_2 = add i32 %index_dir_88, 1
            store i32 %temp_88_2, i32* %dir_counter

            ; switch
            switch i32 %dir_88_value, label %65 [ 
             i32 0, label %65
             i32 1, label %200
             i32 2, label %17
             i32 3, label %175
             i32 4, label %230
            ]

            89: 
            ; store node label in output array
            %index_89 = load i32, i32* %counter
            %output_89 = load i32*, i32** %output
            %output_89_ptr = getelementptr inbounds i32, i32* %output_89, i32 %index_89
            store i32 89, i32* %output_89_ptr

            ; increment counter
            %temp_89_1 = add i32 %index_89, 1
            store i32 %temp_89_1, i32* %counter
        
            ; get directions for node
            %index_dir_89 = load i32, i32* %dir_counter
            %dir_89 = load i32*, i32** %directions
            %dir_89_ptr = getelementptr inbounds i32, i32* %dir_89, i32 %index_dir_89
            %dir_89_value = load i32, i32* %dir_89_ptr

            ; increment directions counter
            %temp_89_2 = add i32 %index_dir_89, 1
            store i32 %temp_89_2, i32* %dir_counter

            ; switch
            switch i32 %dir_89_value, label %207 [ 
             i32 0, label %207
             i32 1, label %111
             i32 2, label %141
             i32 3, label %65
             i32 4, label %139
             i32 5, label %113
             i32 6, label %230
            ]

            90: 
            ; store node label in output array
            %index_90 = load i32, i32* %counter
            %output_90 = load i32*, i32** %output
            %output_90_ptr = getelementptr inbounds i32, i32* %output_90, i32 %index_90
            store i32 90, i32* %output_90_ptr

            ; increment counter
            %temp_90_1 = add i32 %index_90, 1
            store i32 %temp_90_1, i32* %counter
        
            ; get directions for node
            %index_dir_90 = load i32, i32* %dir_counter
            %dir_90 = load i32*, i32** %directions
            %dir_90_ptr = getelementptr inbounds i32, i32* %dir_90, i32 %index_dir_90
            %dir_90_value = load i32, i32* %dir_90_ptr

            ; increment directions counter
            %temp_90_2 = add i32 %index_dir_90, 1
            store i32 %temp_90_2, i32* %dir_counter

            ; switch
            switch i32 %dir_90_value, label %138 [ 
             i32 0, label %138
             i32 1, label %117
             i32 2, label %3
             i32 3, label %102
             i32 4, label %215
             i32 5, label %87
             i32 6, label %44
             i32 7, label %67
             i32 8, label %125
            ]

            91: 
            ; store node label in output array
            %index_91 = load i32, i32* %counter
            %output_91 = load i32*, i32** %output
            %output_91_ptr = getelementptr inbounds i32, i32* %output_91, i32 %index_91
            store i32 91, i32* %output_91_ptr

            ; increment counter
            %temp_91_1 = add i32 %index_91, 1
            store i32 %temp_91_1, i32* %counter
        
            ; get directions for node
            %index_dir_91 = load i32, i32* %dir_counter
            %dir_91 = load i32*, i32** %directions
            %dir_91_ptr = getelementptr inbounds i32, i32* %dir_91, i32 %index_dir_91
            %dir_91_value = load i32, i32* %dir_91_ptr

            ; increment directions counter
            %temp_91_2 = add i32 %index_dir_91, 1
            store i32 %temp_91_2, i32* %dir_counter

            ; switch
            switch i32 %dir_91_value, label %204 [ 
             i32 0, label %204
             i32 1, label %166
             i32 2, label %107
             i32 3, label %230
            ]

            92: 
            ; store node label in output array
            %index_92 = load i32, i32* %counter
            %output_92 = load i32*, i32** %output
            %output_92_ptr = getelementptr inbounds i32, i32* %output_92, i32 %index_92
            store i32 92, i32* %output_92_ptr

            ; increment counter
            %temp_92_1 = add i32 %index_92, 1
            store i32 %temp_92_1, i32* %counter
        
            ; get directions for node
            %index_dir_92 = load i32, i32* %dir_counter
            %dir_92 = load i32*, i32** %directions
            %dir_92_ptr = getelementptr inbounds i32, i32* %dir_92, i32 %index_dir_92
            %dir_92_value = load i32, i32* %dir_92_ptr

            ; increment directions counter
            %temp_92_2 = add i32 %index_dir_92, 1
            store i32 %temp_92_2, i32* %dir_counter

            ; switch
            switch i32 %dir_92_value, label %5 [ 
             i32 0, label %5
             i32 1, label %16
             i32 2, label %178
             i32 3, label %91
             i32 4, label %149
             i32 5, label %36
             i32 6, label %152
            ]

            93: 
            ; store node label in output array
            %index_93 = load i32, i32* %counter
            %output_93 = load i32*, i32** %output
            %output_93_ptr = getelementptr inbounds i32, i32* %output_93, i32 %index_93
            store i32 93, i32* %output_93_ptr

            ; increment counter
            %temp_93_1 = add i32 %index_93, 1
            store i32 %temp_93_1, i32* %counter
        
            ; get directions for node
            %index_dir_93 = load i32, i32* %dir_counter
            %dir_93 = load i32*, i32** %directions
            %dir_93_ptr = getelementptr inbounds i32, i32* %dir_93, i32 %index_dir_93
            %dir_93_value = load i32, i32* %dir_93_ptr

            ; increment directions counter
            %temp_93_2 = add i32 %index_dir_93, 1
            store i32 %temp_93_2, i32* %dir_counter

            ; switch
            switch i32 %dir_93_value, label %36 [ 
             i32 0, label %36
             i32 1, label %67
             i32 2, label %213
             i32 3, label %71
            ]

            94: 
            ; store node label in output array
            %index_94 = load i32, i32* %counter
            %output_94 = load i32*, i32** %output
            %output_94_ptr = getelementptr inbounds i32, i32* %output_94, i32 %index_94
            store i32 94, i32* %output_94_ptr

            ; increment counter
            %temp_94_1 = add i32 %index_94, 1
            store i32 %temp_94_1, i32* %counter
        
            ; get directions for node
            %index_dir_94 = load i32, i32* %dir_counter
            %dir_94 = load i32*, i32** %directions
            %dir_94_ptr = getelementptr inbounds i32, i32* %dir_94, i32 %index_dir_94
            %dir_94_value = load i32, i32* %dir_94_ptr

            ; increment directions counter
            %temp_94_2 = add i32 %index_dir_94, 1
            store i32 %temp_94_2, i32* %dir_counter

            ; switch
            switch i32 %dir_94_value, label %145 [ 
             i32 0, label %145
             i32 1, label %103
             i32 2, label %45
             i32 3, label %157
             i32 4, label %23
             i32 5, label %60
            ]

            95: 
            ; store node label in output array
            %index_95 = load i32, i32* %counter
            %output_95 = load i32*, i32** %output
            %output_95_ptr = getelementptr inbounds i32, i32* %output_95, i32 %index_95
            store i32 95, i32* %output_95_ptr

            ; increment counter
            %temp_95_1 = add i32 %index_95, 1
            store i32 %temp_95_1, i32* %counter
        
            ; get directions for node
            %index_dir_95 = load i32, i32* %dir_counter
            %dir_95 = load i32*, i32** %directions
            %dir_95_ptr = getelementptr inbounds i32, i32* %dir_95, i32 %index_dir_95
            %dir_95_value = load i32, i32* %dir_95_ptr

            ; increment directions counter
            %temp_95_2 = add i32 %index_dir_95, 1
            store i32 %temp_95_2, i32* %dir_counter

            ; switch
            switch i32 %dir_95_value, label %2 [ 
             i32 0, label %2
             i32 1, label %46
             i32 2, label %136
             i32 3, label %82
             i32 4, label %129
             i32 5, label %229
             i32 6, label %230
            ]

            96: 
            ; store node label in output array
            %index_96 = load i32, i32* %counter
            %output_96 = load i32*, i32** %output
            %output_96_ptr = getelementptr inbounds i32, i32* %output_96, i32 %index_96
            store i32 96, i32* %output_96_ptr

            ; increment counter
            %temp_96_1 = add i32 %index_96, 1
            store i32 %temp_96_1, i32* %counter
        
            ; get directions for node
            %index_dir_96 = load i32, i32* %dir_counter
            %dir_96 = load i32*, i32** %directions
            %dir_96_ptr = getelementptr inbounds i32, i32* %dir_96, i32 %index_dir_96
            %dir_96_value = load i32, i32* %dir_96_ptr

            ; increment directions counter
            %temp_96_2 = add i32 %index_dir_96, 1
            store i32 %temp_96_2, i32* %dir_counter

            ; switch
            switch i32 %dir_96_value, label %113 [ 
             i32 0, label %113
             i32 1, label %176
             i32 2, label %164
             i32 3, label %188
             i32 4, label %58
             i32 5, label %62
             i32 6, label %81
             i32 7, label %127
             i32 8, label %230
            ]

            97: 
            ; store node label in output array
            %index_97 = load i32, i32* %counter
            %output_97 = load i32*, i32** %output
            %output_97_ptr = getelementptr inbounds i32, i32* %output_97, i32 %index_97
            store i32 97, i32* %output_97_ptr

            ; increment counter
            %temp_97_1 = add i32 %index_97, 1
            store i32 %temp_97_1, i32* %counter
        
            ; get directions for node
            %index_dir_97 = load i32, i32* %dir_counter
            %dir_97 = load i32*, i32** %directions
            %dir_97_ptr = getelementptr inbounds i32, i32* %dir_97, i32 %index_dir_97
            %dir_97_value = load i32, i32* %dir_97_ptr

            ; increment directions counter
            %temp_97_2 = add i32 %index_dir_97, 1
            store i32 %temp_97_2, i32* %dir_counter

            ; switch
            switch i32 %dir_97_value, label %123 [ 
             i32 0, label %123
             i32 1, label %58
             i32 2, label %183
             i32 3, label %106
             i32 4, label %87
             i32 5, label %144
             i32 6, label %157
             i32 7, label %187
            ]

            98: 
            ; store node label in output array
            %index_98 = load i32, i32* %counter
            %output_98 = load i32*, i32** %output
            %output_98_ptr = getelementptr inbounds i32, i32* %output_98, i32 %index_98
            store i32 98, i32* %output_98_ptr

            ; increment counter
            %temp_98_1 = add i32 %index_98, 1
            store i32 %temp_98_1, i32* %counter
        
            ; get directions for node
            %index_dir_98 = load i32, i32* %dir_counter
            %dir_98 = load i32*, i32** %directions
            %dir_98_ptr = getelementptr inbounds i32, i32* %dir_98, i32 %index_dir_98
            %dir_98_value = load i32, i32* %dir_98_ptr

            ; increment directions counter
            %temp_98_2 = add i32 %index_dir_98, 1
            store i32 %temp_98_2, i32* %dir_counter

            ; switch
            switch i32 %dir_98_value, label %71 [ 
             i32 0, label %71
             i32 1, label %166
             i32 2, label %57
             i32 3, label %13
             i32 4, label %19
             i32 5, label %196
             i32 6, label %131
            ]

            99: 
            ; store node label in output array
            %index_99 = load i32, i32* %counter
            %output_99 = load i32*, i32** %output
            %output_99_ptr = getelementptr inbounds i32, i32* %output_99, i32 %index_99
            store i32 99, i32* %output_99_ptr

            ; increment counter
            %temp_99_1 = add i32 %index_99, 1
            store i32 %temp_99_1, i32* %counter
        
            ; get directions for node
            %index_dir_99 = load i32, i32* %dir_counter
            %dir_99 = load i32*, i32** %directions
            %dir_99_ptr = getelementptr inbounds i32, i32* %dir_99, i32 %index_dir_99
            %dir_99_value = load i32, i32* %dir_99_ptr

            ; increment directions counter
            %temp_99_2 = add i32 %index_dir_99, 1
            store i32 %temp_99_2, i32* %dir_counter

            ; switch
            switch i32 %dir_99_value, label %41 [ 
             i32 0, label %41
             i32 1, label %131
             i32 2, label %197
             i32 3, label %203
             i32 4, label %227
            ]

            100: 
            ; store node label in output array
            %index_100 = load i32, i32* %counter
            %output_100 = load i32*, i32** %output
            %output_100_ptr = getelementptr inbounds i32, i32* %output_100, i32 %index_100
            store i32 100, i32* %output_100_ptr

            ; increment counter
            %temp_100_1 = add i32 %index_100, 1
            store i32 %temp_100_1, i32* %counter
        
            ; get directions for node
            %index_dir_100 = load i32, i32* %dir_counter
            %dir_100 = load i32*, i32** %directions
            %dir_100_ptr = getelementptr inbounds i32, i32* %dir_100, i32 %index_dir_100
            %dir_100_value = load i32, i32* %dir_100_ptr

            ; increment directions counter
            %temp_100_2 = add i32 %index_dir_100, 1
            store i32 %temp_100_2, i32* %dir_counter

            ; switch
            switch i32 %dir_100_value, label %80 [ 
             i32 0, label %80
             i32 1, label %77
             i32 2, label %178
            ]

            101: 
            ; store node label in output array
            %index_101 = load i32, i32* %counter
            %output_101 = load i32*, i32** %output
            %output_101_ptr = getelementptr inbounds i32, i32* %output_101, i32 %index_101
            store i32 101, i32* %output_101_ptr

            ; increment counter
            %temp_101_1 = add i32 %index_101, 1
            store i32 %temp_101_1, i32* %counter
        
            ; get directions for node
            %index_dir_101 = load i32, i32* %dir_counter
            %dir_101 = load i32*, i32** %directions
            %dir_101_ptr = getelementptr inbounds i32, i32* %dir_101, i32 %index_dir_101
            %dir_101_value = load i32, i32* %dir_101_ptr

            ; increment directions counter
            %temp_101_2 = add i32 %index_dir_101, 1
            store i32 %temp_101_2, i32* %dir_counter

            ; switch
            switch i32 %dir_101_value, label %142 [ 
             i32 0, label %142
             i32 1, label %96
             i32 2, label %43
             i32 3, label %180
             i32 4, label %189
             i32 5, label %119
             i32 6, label %153
             i32 7, label %22
            ]

            102: 
            ; store node label in output array
            %index_102 = load i32, i32* %counter
            %output_102 = load i32*, i32** %output
            %output_102_ptr = getelementptr inbounds i32, i32* %output_102, i32 %index_102
            store i32 102, i32* %output_102_ptr

            ; increment counter
            %temp_102_1 = add i32 %index_102, 1
            store i32 %temp_102_1, i32* %counter
        
            ; get directions for node
            %index_dir_102 = load i32, i32* %dir_counter
            %dir_102 = load i32*, i32** %directions
            %dir_102_ptr = getelementptr inbounds i32, i32* %dir_102, i32 %index_dir_102
            %dir_102_value = load i32, i32* %dir_102_ptr

            ; increment directions counter
            %temp_102_2 = add i32 %index_dir_102, 1
            store i32 %temp_102_2, i32* %dir_counter

            ; switch
            switch i32 %dir_102_value, label %32 [ 
             i32 0, label %32
             i32 1, label %156
             i32 2, label %132
             i32 3, label %147
             i32 4, label %97
             i32 5, label %46
             i32 6, label %40
             i32 7, label %65
             i32 8, label %110
            ]

            103: 
            ; store node label in output array
            %index_103 = load i32, i32* %counter
            %output_103 = load i32*, i32** %output
            %output_103_ptr = getelementptr inbounds i32, i32* %output_103, i32 %index_103
            store i32 103, i32* %output_103_ptr

            ; increment counter
            %temp_103_1 = add i32 %index_103, 1
            store i32 %temp_103_1, i32* %counter
        
            ; get directions for node
            %index_dir_103 = load i32, i32* %dir_counter
            %dir_103 = load i32*, i32** %directions
            %dir_103_ptr = getelementptr inbounds i32, i32* %dir_103, i32 %index_dir_103
            %dir_103_value = load i32, i32* %dir_103_ptr

            ; increment directions counter
            %temp_103_2 = add i32 %index_dir_103, 1
            store i32 %temp_103_2, i32* %dir_counter

            ; switch
            switch i32 %dir_103_value, label %146 [ 
             i32 0, label %146
             i32 1, label %185
             i32 2, label %194
             i32 3, label %201
            ]

            104: 
            ; store node label in output array
            %index_104 = load i32, i32* %counter
            %output_104 = load i32*, i32** %output
            %output_104_ptr = getelementptr inbounds i32, i32* %output_104, i32 %index_104
            store i32 104, i32* %output_104_ptr

            ; increment counter
            %temp_104_1 = add i32 %index_104, 1
            store i32 %temp_104_1, i32* %counter
        
            ; get directions for node
            %index_dir_104 = load i32, i32* %dir_counter
            %dir_104 = load i32*, i32** %directions
            %dir_104_ptr = getelementptr inbounds i32, i32* %dir_104, i32 %index_dir_104
            %dir_104_value = load i32, i32* %dir_104_ptr

            ; increment directions counter
            %temp_104_2 = add i32 %index_dir_104, 1
            store i32 %temp_104_2, i32* %dir_counter

            ; switch
            switch i32 %dir_104_value, label %127 [ 
             i32 0, label %127
             i32 1, label %175
             i32 2, label %101
            ]

            105: 
            ; store node label in output array
            %index_105 = load i32, i32* %counter
            %output_105 = load i32*, i32** %output
            %output_105_ptr = getelementptr inbounds i32, i32* %output_105, i32 %index_105
            store i32 105, i32* %output_105_ptr

            ; increment counter
            %temp_105_1 = add i32 %index_105, 1
            store i32 %temp_105_1, i32* %counter
        
            ; get directions for node
            %index_dir_105 = load i32, i32* %dir_counter
            %dir_105 = load i32*, i32** %directions
            %dir_105_ptr = getelementptr inbounds i32, i32* %dir_105, i32 %index_dir_105
            %dir_105_value = load i32, i32* %dir_105_ptr

            ; increment directions counter
            %temp_105_2 = add i32 %index_dir_105, 1
            store i32 %temp_105_2, i32* %dir_counter

            ; switch
            switch i32 %dir_105_value, label %164 [ 
             i32 0, label %164
             i32 1, label %90
             i32 2, label %99
             i32 3, label %132
             i32 4, label %217
             i32 5, label %43
             i32 6, label %140
             i32 7, label %187
            ]

            106: 
            ; store node label in output array
            %index_106 = load i32, i32* %counter
            %output_106 = load i32*, i32** %output
            %output_106_ptr = getelementptr inbounds i32, i32* %output_106, i32 %index_106
            store i32 106, i32* %output_106_ptr

            ; increment counter
            %temp_106_1 = add i32 %index_106, 1
            store i32 %temp_106_1, i32* %counter
        
            ; get directions for node
            %index_dir_106 = load i32, i32* %dir_counter
            %dir_106 = load i32*, i32** %directions
            %dir_106_ptr = getelementptr inbounds i32, i32* %dir_106, i32 %index_dir_106
            %dir_106_value = load i32, i32* %dir_106_ptr

            ; increment directions counter
            %temp_106_2 = add i32 %index_dir_106, 1
            store i32 %temp_106_2, i32* %dir_counter

            ; switch
            switch i32 %dir_106_value, label %135 [ 
             i32 0, label %135
             i32 1, label %24
             i32 2, label %207
            ]

            107: 
            ; store node label in output array
            %index_107 = load i32, i32* %counter
            %output_107 = load i32*, i32** %output
            %output_107_ptr = getelementptr inbounds i32, i32* %output_107, i32 %index_107
            store i32 107, i32* %output_107_ptr

            ; increment counter
            %temp_107_1 = add i32 %index_107, 1
            store i32 %temp_107_1, i32* %counter
        
            ; get directions for node
            %index_dir_107 = load i32, i32* %dir_counter
            %dir_107 = load i32*, i32** %directions
            %dir_107_ptr = getelementptr inbounds i32, i32* %dir_107, i32 %index_dir_107
            %dir_107_value = load i32, i32* %dir_107_ptr

            ; increment directions counter
            %temp_107_2 = add i32 %index_dir_107, 1
            store i32 %temp_107_2, i32* %dir_counter

            ; switch
            switch i32 %dir_107_value, label %161 [ 
             i32 0, label %161
             i32 1, label %26
             i32 2, label %69
             i32 3, label %189
             i32 4, label %22
            ]

            108: 
            ; store node label in output array
            %index_108 = load i32, i32* %counter
            %output_108 = load i32*, i32** %output
            %output_108_ptr = getelementptr inbounds i32, i32* %output_108, i32 %index_108
            store i32 108, i32* %output_108_ptr

            ; increment counter
            %temp_108_1 = add i32 %index_108, 1
            store i32 %temp_108_1, i32* %counter
        
            ; get directions for node
            %index_dir_108 = load i32, i32* %dir_counter
            %dir_108 = load i32*, i32** %directions
            %dir_108_ptr = getelementptr inbounds i32, i32* %dir_108, i32 %index_dir_108
            %dir_108_value = load i32, i32* %dir_108_ptr

            ; increment directions counter
            %temp_108_2 = add i32 %index_dir_108, 1
            store i32 %temp_108_2, i32* %dir_counter

            ; switch
            switch i32 %dir_108_value, label %199 [ 
             i32 0, label %199
             i32 1, label %158
             i32 2, label %216
             i32 3, label %169
            ]

            109: 
            ; store node label in output array
            %index_109 = load i32, i32* %counter
            %output_109 = load i32*, i32** %output
            %output_109_ptr = getelementptr inbounds i32, i32* %output_109, i32 %index_109
            store i32 109, i32* %output_109_ptr

            ; increment counter
            %temp_109_1 = add i32 %index_109, 1
            store i32 %temp_109_1, i32* %counter
        
            ; get directions for node
            %index_dir_109 = load i32, i32* %dir_counter
            %dir_109 = load i32*, i32** %directions
            %dir_109_ptr = getelementptr inbounds i32, i32* %dir_109, i32 %index_dir_109
            %dir_109_value = load i32, i32* %dir_109_ptr

            ; increment directions counter
            %temp_109_2 = add i32 %index_dir_109, 1
            store i32 %temp_109_2, i32* %dir_counter

            ; switch
            switch i32 %dir_109_value, label %180 [ 
             i32 0, label %180
             i32 1, label %21
             i32 2, label %114
             i32 3, label %218
             i32 4, label %62
             i32 5, label %98
             i32 6, label %206
            ]

            110: 
            ; store node label in output array
            %index_110 = load i32, i32* %counter
            %output_110 = load i32*, i32** %output
            %output_110_ptr = getelementptr inbounds i32, i32* %output_110, i32 %index_110
            store i32 110, i32* %output_110_ptr

            ; increment counter
            %temp_110_1 = add i32 %index_110, 1
            store i32 %temp_110_1, i32* %counter
        
            ; get directions for node
            %index_dir_110 = load i32, i32* %dir_counter
            %dir_110 = load i32*, i32** %directions
            %dir_110_ptr = getelementptr inbounds i32, i32* %dir_110, i32 %index_dir_110
            %dir_110_value = load i32, i32* %dir_110_ptr

            ; increment directions counter
            %temp_110_2 = add i32 %index_dir_110, 1
            store i32 %temp_110_2, i32* %dir_counter

            ; switch
            switch i32 %dir_110_value, label %102 [ 
             i32 0, label %102
             i32 1, label %43
             i32 2, label %84
             i32 3, label %113
             i32 4, label %33
             i32 5, label %160
             i32 6, label %230
            ]

            111: 
            ; store node label in output array
            %index_111 = load i32, i32* %counter
            %output_111 = load i32*, i32** %output
            %output_111_ptr = getelementptr inbounds i32, i32* %output_111, i32 %index_111
            store i32 111, i32* %output_111_ptr

            ; increment counter
            %temp_111_1 = add i32 %index_111, 1
            store i32 %temp_111_1, i32* %counter
        
            ; get directions for node
            %index_dir_111 = load i32, i32* %dir_counter
            %dir_111 = load i32*, i32** %directions
            %dir_111_ptr = getelementptr inbounds i32, i32* %dir_111, i32 %index_dir_111
            %dir_111_value = load i32, i32* %dir_111_ptr

            ; increment directions counter
            %temp_111_2 = add i32 %index_dir_111, 1
            store i32 %temp_111_2, i32* %dir_counter

            ; switch
            switch i32 %dir_111_value, label %55 [ 
             i32 0, label %55
             i32 1, label %31
             i32 2, label %111
             i32 3, label %154
             i32 4, label %137
             i32 5, label %105
            ]

            112: 
            ; store node label in output array
            %index_112 = load i32, i32* %counter
            %output_112 = load i32*, i32** %output
            %output_112_ptr = getelementptr inbounds i32, i32* %output_112, i32 %index_112
            store i32 112, i32* %output_112_ptr

            ; increment counter
            %temp_112_1 = add i32 %index_112, 1
            store i32 %temp_112_1, i32* %counter
        
            ; get directions for node
            %index_dir_112 = load i32, i32* %dir_counter
            %dir_112 = load i32*, i32** %directions
            %dir_112_ptr = getelementptr inbounds i32, i32* %dir_112, i32 %index_dir_112
            %dir_112_value = load i32, i32* %dir_112_ptr

            ; increment directions counter
            %temp_112_2 = add i32 %index_dir_112, 1
            store i32 %temp_112_2, i32* %dir_counter

            ; switch
            switch i32 %dir_112_value, label %170 [ 
             i32 0, label %170
             i32 1, label %76
             i32 2, label %72
            ]

            113: 
            ; store node label in output array
            %index_113 = load i32, i32* %counter
            %output_113 = load i32*, i32** %output
            %output_113_ptr = getelementptr inbounds i32, i32* %output_113, i32 %index_113
            store i32 113, i32* %output_113_ptr

            ; increment counter
            %temp_113_1 = add i32 %index_113, 1
            store i32 %temp_113_1, i32* %counter
        
            ; get directions for node
            %index_dir_113 = load i32, i32* %dir_counter
            %dir_113 = load i32*, i32** %directions
            %dir_113_ptr = getelementptr inbounds i32, i32* %dir_113, i32 %index_dir_113
            %dir_113_value = load i32, i32* %dir_113_ptr

            ; increment directions counter
            %temp_113_2 = add i32 %index_dir_113, 1
            store i32 %temp_113_2, i32* %dir_counter

            ; switch
            switch i32 %dir_113_value, label %97 [ 
             i32 0, label %97
             i32 1, label %192
             i32 2, label %144
             i32 3, label %2
            ]

            114: 
            ; store node label in output array
            %index_114 = load i32, i32* %counter
            %output_114 = load i32*, i32** %output
            %output_114_ptr = getelementptr inbounds i32, i32* %output_114, i32 %index_114
            store i32 114, i32* %output_114_ptr

            ; increment counter
            %temp_114_1 = add i32 %index_114, 1
            store i32 %temp_114_1, i32* %counter
        
            ; get directions for node
            %index_dir_114 = load i32, i32* %dir_counter
            %dir_114 = load i32*, i32** %directions
            %dir_114_ptr = getelementptr inbounds i32, i32* %dir_114, i32 %index_dir_114
            %dir_114_value = load i32, i32* %dir_114_ptr

            ; increment directions counter
            %temp_114_2 = add i32 %index_dir_114, 1
            store i32 %temp_114_2, i32* %dir_counter

            ; switch
            switch i32 %dir_114_value, label %136 [ 
             i32 0, label %136
             i32 1, label %113
             i32 2, label %149
             i32 3, label %6
            ]

            115: 
            ; store node label in output array
            %index_115 = load i32, i32* %counter
            %output_115 = load i32*, i32** %output
            %output_115_ptr = getelementptr inbounds i32, i32* %output_115, i32 %index_115
            store i32 115, i32* %output_115_ptr

            ; increment counter
            %temp_115_1 = add i32 %index_115, 1
            store i32 %temp_115_1, i32* %counter
        
            ; get directions for node
            %index_dir_115 = load i32, i32* %dir_counter
            %dir_115 = load i32*, i32** %directions
            %dir_115_ptr = getelementptr inbounds i32, i32* %dir_115, i32 %index_dir_115
            %dir_115_value = load i32, i32* %dir_115_ptr

            ; increment directions counter
            %temp_115_2 = add i32 %index_dir_115, 1
            store i32 %temp_115_2, i32* %dir_counter

            ; switch
            switch i32 %dir_115_value, label %161 [ 
             i32 0, label %161
             i32 1, label %156
             i32 2, label %63
            ]

            116: 
            ; store node label in output array
            %index_116 = load i32, i32* %counter
            %output_116 = load i32*, i32** %output
            %output_116_ptr = getelementptr inbounds i32, i32* %output_116, i32 %index_116
            store i32 116, i32* %output_116_ptr

            ; increment counter
            %temp_116_1 = add i32 %index_116, 1
            store i32 %temp_116_1, i32* %counter
        
            ; get directions for node
            %index_dir_116 = load i32, i32* %dir_counter
            %dir_116 = load i32*, i32** %directions
            %dir_116_ptr = getelementptr inbounds i32, i32* %dir_116, i32 %index_dir_116
            %dir_116_value = load i32, i32* %dir_116_ptr

            ; increment directions counter
            %temp_116_2 = add i32 %index_dir_116, 1
            store i32 %temp_116_2, i32* %dir_counter

            ; switch
            switch i32 %dir_116_value, label %67 [ 
             i32 0, label %67
             i32 1, label %53
             i32 2, label %45
             i32 3, label %73
             i32 4, label %38
             i32 5, label %139
             i32 6, label %52
             i32 7, label %70
             i32 8, label %80
             i32 9, label %230
            ]

            117: 
            ; store node label in output array
            %index_117 = load i32, i32* %counter
            %output_117 = load i32*, i32** %output
            %output_117_ptr = getelementptr inbounds i32, i32* %output_117, i32 %index_117
            store i32 117, i32* %output_117_ptr

            ; increment counter
            %temp_117_1 = add i32 %index_117, 1
            store i32 %temp_117_1, i32* %counter
        
            ; get directions for node
            %index_dir_117 = load i32, i32* %dir_counter
            %dir_117 = load i32*, i32** %directions
            %dir_117_ptr = getelementptr inbounds i32, i32* %dir_117, i32 %index_dir_117
            %dir_117_value = load i32, i32* %dir_117_ptr

            ; increment directions counter
            %temp_117_2 = add i32 %index_dir_117, 1
            store i32 %temp_117_2, i32* %dir_counter

            ; switch
            switch i32 %dir_117_value, label %194 [ 
             i32 0, label %194
             i32 1, label %65
             i32 2, label %214
             i32 3, label %175
             i32 4, label %115
             i32 5, label %203
             i32 6, label %221
            ]

            118: 
            ; store node label in output array
            %index_118 = load i32, i32* %counter
            %output_118 = load i32*, i32** %output
            %output_118_ptr = getelementptr inbounds i32, i32* %output_118, i32 %index_118
            store i32 118, i32* %output_118_ptr

            ; increment counter
            %temp_118_1 = add i32 %index_118, 1
            store i32 %temp_118_1, i32* %counter
        
            ; get directions for node
            %index_dir_118 = load i32, i32* %dir_counter
            %dir_118 = load i32*, i32** %directions
            %dir_118_ptr = getelementptr inbounds i32, i32* %dir_118, i32 %index_dir_118
            %dir_118_value = load i32, i32* %dir_118_ptr

            ; increment directions counter
            %temp_118_2 = add i32 %index_dir_118, 1
            store i32 %temp_118_2, i32* %dir_counter

            ; switch
            switch i32 %dir_118_value, label %219 [ 
             i32 0, label %219
             i32 1, label %44
             i32 2, label %140
             i32 3, label %92
             i32 4, label %126
             i32 5, label %108
             i32 6, label %220
             i32 7, label %32
             i32 8, label %197
            ]

            119: 
            ; store node label in output array
            %index_119 = load i32, i32* %counter
            %output_119 = load i32*, i32** %output
            %output_119_ptr = getelementptr inbounds i32, i32* %output_119, i32 %index_119
            store i32 119, i32* %output_119_ptr

            ; increment counter
            %temp_119_1 = add i32 %index_119, 1
            store i32 %temp_119_1, i32* %counter
        
            ; get directions for node
            %index_dir_119 = load i32, i32* %dir_counter
            %dir_119 = load i32*, i32** %directions
            %dir_119_ptr = getelementptr inbounds i32, i32* %dir_119, i32 %index_dir_119
            %dir_119_value = load i32, i32* %dir_119_ptr

            ; increment directions counter
            %temp_119_2 = add i32 %index_dir_119, 1
            store i32 %temp_119_2, i32* %dir_counter

            ; switch
            switch i32 %dir_119_value, label %147 [ 
             i32 0, label %147
             i32 1, label %226
             i32 2, label %99
             i32 3, label %53
             i32 4, label %230
            ]

            120: 
            ; store node label in output array
            %index_120 = load i32, i32* %counter
            %output_120 = load i32*, i32** %output
            %output_120_ptr = getelementptr inbounds i32, i32* %output_120, i32 %index_120
            store i32 120, i32* %output_120_ptr

            ; increment counter
            %temp_120_1 = add i32 %index_120, 1
            store i32 %temp_120_1, i32* %counter
        
            ; get directions for node
            %index_dir_120 = load i32, i32* %dir_counter
            %dir_120 = load i32*, i32** %directions
            %dir_120_ptr = getelementptr inbounds i32, i32* %dir_120, i32 %index_dir_120
            %dir_120_value = load i32, i32* %dir_120_ptr

            ; increment directions counter
            %temp_120_2 = add i32 %index_dir_120, 1
            store i32 %temp_120_2, i32* %dir_counter

            ; switch
            switch i32 %dir_120_value, label %208 [ 
             i32 0, label %208
             i32 1, label %28
             i32 2, label %207
             i32 3, label %7
             i32 4, label %31
            ]

            121: 
            ; store node label in output array
            %index_121 = load i32, i32* %counter
            %output_121 = load i32*, i32** %output
            %output_121_ptr = getelementptr inbounds i32, i32* %output_121, i32 %index_121
            store i32 121, i32* %output_121_ptr

            ; increment counter
            %temp_121_1 = add i32 %index_121, 1
            store i32 %temp_121_1, i32* %counter
        
            ; get directions for node
            %index_dir_121 = load i32, i32* %dir_counter
            %dir_121 = load i32*, i32** %directions
            %dir_121_ptr = getelementptr inbounds i32, i32* %dir_121, i32 %index_dir_121
            %dir_121_value = load i32, i32* %dir_121_ptr

            ; increment directions counter
            %temp_121_2 = add i32 %index_dir_121, 1
            store i32 %temp_121_2, i32* %dir_counter

            ; switch
            switch i32 %dir_121_value, label %192 [ 
             i32 0, label %192
             i32 1, label %4
             i32 2, label %140
             i32 3, label %76
             i32 4, label %173
             i32 5, label %195
             i32 6, label %186
            ]

            122: 
            ; store node label in output array
            %index_122 = load i32, i32* %counter
            %output_122 = load i32*, i32** %output
            %output_122_ptr = getelementptr inbounds i32, i32* %output_122, i32 %index_122
            store i32 122, i32* %output_122_ptr

            ; increment counter
            %temp_122_1 = add i32 %index_122, 1
            store i32 %temp_122_1, i32* %counter
        
            ; get directions for node
            %index_dir_122 = load i32, i32* %dir_counter
            %dir_122 = load i32*, i32** %directions
            %dir_122_ptr = getelementptr inbounds i32, i32* %dir_122, i32 %index_dir_122
            %dir_122_value = load i32, i32* %dir_122_ptr

            ; increment directions counter
            %temp_122_2 = add i32 %index_dir_122, 1
            store i32 %temp_122_2, i32* %dir_counter

            ; switch
            switch i32 %dir_122_value, label %35 [ 
             i32 0, label %35
             i32 1, label %20
             i32 2, label %129
             i32 3, label %96
             i32 4, label %147
             i32 5, label %207
             i32 6, label %80
             i32 7, label %112
             i32 8, label %230
            ]

            123: 
            ; store node label in output array
            %index_123 = load i32, i32* %counter
            %output_123 = load i32*, i32** %output
            %output_123_ptr = getelementptr inbounds i32, i32* %output_123, i32 %index_123
            store i32 123, i32* %output_123_ptr

            ; increment counter
            %temp_123_1 = add i32 %index_123, 1
            store i32 %temp_123_1, i32* %counter
        
            ; get directions for node
            %index_dir_123 = load i32, i32* %dir_counter
            %dir_123 = load i32*, i32** %directions
            %dir_123_ptr = getelementptr inbounds i32, i32* %dir_123, i32 %index_dir_123
            %dir_123_value = load i32, i32* %dir_123_ptr

            ; increment directions counter
            %temp_123_2 = add i32 %index_dir_123, 1
            store i32 %temp_123_2, i32* %dir_counter

            ; switch
            switch i32 %dir_123_value, label %174 [ 
             i32 0, label %174
             i32 1, label %92
             i32 2, label %195
             i32 3, label %136
             i32 4, label %83
             i32 5, label %1
             i32 6, label %32
            ]

            124: 
            ; store node label in output array
            %index_124 = load i32, i32* %counter
            %output_124 = load i32*, i32** %output
            %output_124_ptr = getelementptr inbounds i32, i32* %output_124, i32 %index_124
            store i32 124, i32* %output_124_ptr

            ; increment counter
            %temp_124_1 = add i32 %index_124, 1
            store i32 %temp_124_1, i32* %counter
        
            ; get directions for node
            %index_dir_124 = load i32, i32* %dir_counter
            %dir_124 = load i32*, i32** %directions
            %dir_124_ptr = getelementptr inbounds i32, i32* %dir_124, i32 %index_dir_124
            %dir_124_value = load i32, i32* %dir_124_ptr

            ; increment directions counter
            %temp_124_2 = add i32 %index_dir_124, 1
            store i32 %temp_124_2, i32* %dir_counter

            ; switch
            switch i32 %dir_124_value, label %184 [ 
             i32 0, label %184
             i32 1, label %116
             i32 2, label %90
             i32 3, label %79
             i32 4, label %139
             i32 5, label %103
            ]

            125: 
            ; store node label in output array
            %index_125 = load i32, i32* %counter
            %output_125 = load i32*, i32** %output
            %output_125_ptr = getelementptr inbounds i32, i32* %output_125, i32 %index_125
            store i32 125, i32* %output_125_ptr

            ; increment counter
            %temp_125_1 = add i32 %index_125, 1
            store i32 %temp_125_1, i32* %counter
        
            ; get directions for node
            %index_dir_125 = load i32, i32* %dir_counter
            %dir_125 = load i32*, i32** %directions
            %dir_125_ptr = getelementptr inbounds i32, i32* %dir_125, i32 %index_dir_125
            %dir_125_value = load i32, i32* %dir_125_ptr

            ; increment directions counter
            %temp_125_2 = add i32 %index_dir_125, 1
            store i32 %temp_125_2, i32* %dir_counter

            ; switch
            switch i32 %dir_125_value, label %201 [ 
             i32 0, label %201
             i32 1, label %188
             i32 2, label %175
             i32 3, label %147
             i32 4, label %127
            ]

            126: 
            ; store node label in output array
            %index_126 = load i32, i32* %counter
            %output_126 = load i32*, i32** %output
            %output_126_ptr = getelementptr inbounds i32, i32* %output_126, i32 %index_126
            store i32 126, i32* %output_126_ptr

            ; increment counter
            %temp_126_1 = add i32 %index_126, 1
            store i32 %temp_126_1, i32* %counter
        
            ; get directions for node
            %index_dir_126 = load i32, i32* %dir_counter
            %dir_126 = load i32*, i32** %directions
            %dir_126_ptr = getelementptr inbounds i32, i32* %dir_126, i32 %index_dir_126
            %dir_126_value = load i32, i32* %dir_126_ptr

            ; increment directions counter
            %temp_126_2 = add i32 %index_dir_126, 1
            store i32 %temp_126_2, i32* %dir_counter

            ; switch
            switch i32 %dir_126_value, label %166 [ 
             i32 0, label %166
             i32 1, label %97
             i32 2, label %98
             i32 3, label %230
            ]

            127: 
            ; store node label in output array
            %index_127 = load i32, i32* %counter
            %output_127 = load i32*, i32** %output
            %output_127_ptr = getelementptr inbounds i32, i32* %output_127, i32 %index_127
            store i32 127, i32* %output_127_ptr

            ; increment counter
            %temp_127_1 = add i32 %index_127, 1
            store i32 %temp_127_1, i32* %counter
        
            ; get directions for node
            %index_dir_127 = load i32, i32* %dir_counter
            %dir_127 = load i32*, i32** %directions
            %dir_127_ptr = getelementptr inbounds i32, i32* %dir_127, i32 %index_dir_127
            %dir_127_value = load i32, i32* %dir_127_ptr

            ; increment directions counter
            %temp_127_2 = add i32 %index_dir_127, 1
            store i32 %temp_127_2, i32* %dir_counter

            ; switch
            switch i32 %dir_127_value, label %143 [ 
             i32 0, label %143
             i32 1, label %1
             i32 2, label %72
             i32 3, label %163
             i32 4, label %230
            ]

            128: 
            ; store node label in output array
            %index_128 = load i32, i32* %counter
            %output_128 = load i32*, i32** %output
            %output_128_ptr = getelementptr inbounds i32, i32* %output_128, i32 %index_128
            store i32 128, i32* %output_128_ptr

            ; increment counter
            %temp_128_1 = add i32 %index_128, 1
            store i32 %temp_128_1, i32* %counter
        
            ; get directions for node
            %index_dir_128 = load i32, i32* %dir_counter
            %dir_128 = load i32*, i32** %directions
            %dir_128_ptr = getelementptr inbounds i32, i32* %dir_128, i32 %index_dir_128
            %dir_128_value = load i32, i32* %dir_128_ptr

            ; increment directions counter
            %temp_128_2 = add i32 %index_dir_128, 1
            store i32 %temp_128_2, i32* %dir_counter

            ; switch
            switch i32 %dir_128_value, label %185 [ 
             i32 0, label %185
             i32 1, label %226
             i32 2, label %190
             i32 3, label %213
             i32 4, label %187
             i32 5, label %131
             i32 6, label %51
            ]

            129: 
            ; store node label in output array
            %index_129 = load i32, i32* %counter
            %output_129 = load i32*, i32** %output
            %output_129_ptr = getelementptr inbounds i32, i32* %output_129, i32 %index_129
            store i32 129, i32* %output_129_ptr

            ; increment counter
            %temp_129_1 = add i32 %index_129, 1
            store i32 %temp_129_1, i32* %counter
        
            ; get directions for node
            %index_dir_129 = load i32, i32* %dir_counter
            %dir_129 = load i32*, i32** %directions
            %dir_129_ptr = getelementptr inbounds i32, i32* %dir_129, i32 %index_dir_129
            %dir_129_value = load i32, i32* %dir_129_ptr

            ; increment directions counter
            %temp_129_2 = add i32 %index_dir_129, 1
            store i32 %temp_129_2, i32* %dir_counter

            ; switch
            switch i32 %dir_129_value, label %154 [ 
             i32 0, label %154
             i32 1, label %214
             i32 2, label %133
             i32 3, label %105
             i32 4, label %191
             i32 5, label %183
            ]

            130: 
            ; store node label in output array
            %index_130 = load i32, i32* %counter
            %output_130 = load i32*, i32** %output
            %output_130_ptr = getelementptr inbounds i32, i32* %output_130, i32 %index_130
            store i32 130, i32* %output_130_ptr

            ; increment counter
            %temp_130_1 = add i32 %index_130, 1
            store i32 %temp_130_1, i32* %counter
        
            ; get directions for node
            %index_dir_130 = load i32, i32* %dir_counter
            %dir_130 = load i32*, i32** %directions
            %dir_130_ptr = getelementptr inbounds i32, i32* %dir_130, i32 %index_dir_130
            %dir_130_value = load i32, i32* %dir_130_ptr

            ; increment directions counter
            %temp_130_2 = add i32 %index_dir_130, 1
            store i32 %temp_130_2, i32* %dir_counter

            ; switch
            switch i32 %dir_130_value, label %180 [ 
             i32 0, label %180
             i32 1, label %44
             i32 2, label %116
             i32 3, label %159
             i32 4, label %172
            ]

            131: 
            ; store node label in output array
            %index_131 = load i32, i32* %counter
            %output_131 = load i32*, i32** %output
            %output_131_ptr = getelementptr inbounds i32, i32* %output_131, i32 %index_131
            store i32 131, i32* %output_131_ptr

            ; increment counter
            %temp_131_1 = add i32 %index_131, 1
            store i32 %temp_131_1, i32* %counter
        
            ; get directions for node
            %index_dir_131 = load i32, i32* %dir_counter
            %dir_131 = load i32*, i32** %directions
            %dir_131_ptr = getelementptr inbounds i32, i32* %dir_131, i32 %index_dir_131
            %dir_131_value = load i32, i32* %dir_131_ptr

            ; increment directions counter
            %temp_131_2 = add i32 %index_dir_131, 1
            store i32 %temp_131_2, i32* %dir_counter

            ; switch
            switch i32 %dir_131_value, label %51 [ 
             i32 0, label %51
             i32 1, label %93
             i32 2, label %135
             i32 3, label %1
             i32 4, label %174
             i32 5, label %100
             i32 6, label %149
            ]

            132: 
            ; store node label in output array
            %index_132 = load i32, i32* %counter
            %output_132 = load i32*, i32** %output
            %output_132_ptr = getelementptr inbounds i32, i32* %output_132, i32 %index_132
            store i32 132, i32* %output_132_ptr

            ; increment counter
            %temp_132_1 = add i32 %index_132, 1
            store i32 %temp_132_1, i32* %counter
        
            ; get directions for node
            %index_dir_132 = load i32, i32* %dir_counter
            %dir_132 = load i32*, i32** %directions
            %dir_132_ptr = getelementptr inbounds i32, i32* %dir_132, i32 %index_dir_132
            %dir_132_value = load i32, i32* %dir_132_ptr

            ; increment directions counter
            %temp_132_2 = add i32 %index_dir_132, 1
            store i32 %temp_132_2, i32* %dir_counter

            ; switch
            switch i32 %dir_132_value, label %104 [ 
             i32 0, label %104
             i32 1, label %87
             i32 2, label %221
             i32 3, label %160
             i32 4, label %150
             i32 5, label %188
            ]

            133: 
            ; store node label in output array
            %index_133 = load i32, i32* %counter
            %output_133 = load i32*, i32** %output
            %output_133_ptr = getelementptr inbounds i32, i32* %output_133, i32 %index_133
            store i32 133, i32* %output_133_ptr

            ; increment counter
            %temp_133_1 = add i32 %index_133, 1
            store i32 %temp_133_1, i32* %counter
        
            ; get directions for node
            %index_dir_133 = load i32, i32* %dir_counter
            %dir_133 = load i32*, i32** %directions
            %dir_133_ptr = getelementptr inbounds i32, i32* %dir_133, i32 %index_dir_133
            %dir_133_value = load i32, i32* %dir_133_ptr

            ; increment directions counter
            %temp_133_2 = add i32 %index_dir_133, 1
            store i32 %temp_133_2, i32* %dir_counter

            ; switch
            switch i32 %dir_133_value, label %192 [ 
             i32 0, label %192
             i32 1, label %18
             i32 2, label %127
             i32 3, label %191
             i32 4, label %64
             i32 5, label %164
             i32 6, label %167
             i32 7, label %75
            ]

            134: 
            ; store node label in output array
            %index_134 = load i32, i32* %counter
            %output_134 = load i32*, i32** %output
            %output_134_ptr = getelementptr inbounds i32, i32* %output_134, i32 %index_134
            store i32 134, i32* %output_134_ptr

            ; increment counter
            %temp_134_1 = add i32 %index_134, 1
            store i32 %temp_134_1, i32* %counter
        
            ; get directions for node
            %index_dir_134 = load i32, i32* %dir_counter
            %dir_134 = load i32*, i32** %directions
            %dir_134_ptr = getelementptr inbounds i32, i32* %dir_134, i32 %index_dir_134
            %dir_134_value = load i32, i32* %dir_134_ptr

            ; increment directions counter
            %temp_134_2 = add i32 %index_dir_134, 1
            store i32 %temp_134_2, i32* %dir_counter

            ; switch
            switch i32 %dir_134_value, label %6 [ 
             i32 0, label %6
             i32 1, label %105
             i32 2, label %185
             i32 3, label %162
             i32 4, label %40
             i32 5, label %163
             i32 6, label %200
             i32 7, label %102
            ]

            135: 
            ; store node label in output array
            %index_135 = load i32, i32* %counter
            %output_135 = load i32*, i32** %output
            %output_135_ptr = getelementptr inbounds i32, i32* %output_135, i32 %index_135
            store i32 135, i32* %output_135_ptr

            ; increment counter
            %temp_135_1 = add i32 %index_135, 1
            store i32 %temp_135_1, i32* %counter
        
            ; get directions for node
            %index_dir_135 = load i32, i32* %dir_counter
            %dir_135 = load i32*, i32** %directions
            %dir_135_ptr = getelementptr inbounds i32, i32* %dir_135, i32 %index_dir_135
            %dir_135_value = load i32, i32* %dir_135_ptr

            ; increment directions counter
            %temp_135_2 = add i32 %index_dir_135, 1
            store i32 %temp_135_2, i32* %dir_counter

            ; switch
            switch i32 %dir_135_value, label %70 [ 
             i32 0, label %70
             i32 1, label %217
             i32 2, label %46
             i32 3, label %197
             i32 4, label %19
             i32 5, label %209
             i32 6, label %199
             i32 7, label %155
             i32 8, label %3
            ]

            136: 
            ; store node label in output array
            %index_136 = load i32, i32* %counter
            %output_136 = load i32*, i32** %output
            %output_136_ptr = getelementptr inbounds i32, i32* %output_136, i32 %index_136
            store i32 136, i32* %output_136_ptr

            ; increment counter
            %temp_136_1 = add i32 %index_136, 1
            store i32 %temp_136_1, i32* %counter
        
            ; get directions for node
            %index_dir_136 = load i32, i32* %dir_counter
            %dir_136 = load i32*, i32** %directions
            %dir_136_ptr = getelementptr inbounds i32, i32* %dir_136, i32 %index_dir_136
            %dir_136_value = load i32, i32* %dir_136_ptr

            ; increment directions counter
            %temp_136_2 = add i32 %index_dir_136, 1
            store i32 %temp_136_2, i32* %dir_counter

            ; switch
            switch i32 %dir_136_value, label %68 [ 
             i32 0, label %68
             i32 1, label %205
             i32 2, label %182
             i32 3, label %106
             i32 4, label %224
            ]

            137: 
            ; store node label in output array
            %index_137 = load i32, i32* %counter
            %output_137 = load i32*, i32** %output
            %output_137_ptr = getelementptr inbounds i32, i32* %output_137, i32 %index_137
            store i32 137, i32* %output_137_ptr

            ; increment counter
            %temp_137_1 = add i32 %index_137, 1
            store i32 %temp_137_1, i32* %counter
        
            ; get directions for node
            %index_dir_137 = load i32, i32* %dir_counter
            %dir_137 = load i32*, i32** %directions
            %dir_137_ptr = getelementptr inbounds i32, i32* %dir_137, i32 %index_dir_137
            %dir_137_value = load i32, i32* %dir_137_ptr

            ; increment directions counter
            %temp_137_2 = add i32 %index_dir_137, 1
            store i32 %temp_137_2, i32* %dir_counter

            ; switch
            switch i32 %dir_137_value, label %140 [ 
             i32 0, label %140
             i32 1, label %78
             i32 2, label %39
             i32 3, label %119
             i32 4, label %214
             i32 5, label %67
             i32 6, label %125
             i32 7, label %44
            ]

            138: 
            ; store node label in output array
            %index_138 = load i32, i32* %counter
            %output_138 = load i32*, i32** %output
            %output_138_ptr = getelementptr inbounds i32, i32* %output_138, i32 %index_138
            store i32 138, i32* %output_138_ptr

            ; increment counter
            %temp_138_1 = add i32 %index_138, 1
            store i32 %temp_138_1, i32* %counter
        
            ; get directions for node
            %index_dir_138 = load i32, i32* %dir_counter
            %dir_138 = load i32*, i32** %directions
            %dir_138_ptr = getelementptr inbounds i32, i32* %dir_138, i32 %index_dir_138
            %dir_138_value = load i32, i32* %dir_138_ptr

            ; increment directions counter
            %temp_138_2 = add i32 %index_dir_138, 1
            store i32 %temp_138_2, i32* %dir_counter

            ; switch
            switch i32 %dir_138_value, label %131 [ 
             i32 0, label %131
             i32 1, label %12
             i32 2, label %70
             i32 3, label %26
             i32 4, label %191
            ]

            139: 
            ; store node label in output array
            %index_139 = load i32, i32* %counter
            %output_139 = load i32*, i32** %output
            %output_139_ptr = getelementptr inbounds i32, i32* %output_139, i32 %index_139
            store i32 139, i32* %output_139_ptr

            ; increment counter
            %temp_139_1 = add i32 %index_139, 1
            store i32 %temp_139_1, i32* %counter
        
            ; get directions for node
            %index_dir_139 = load i32, i32* %dir_counter
            %dir_139 = load i32*, i32** %directions
            %dir_139_ptr = getelementptr inbounds i32, i32* %dir_139, i32 %index_dir_139
            %dir_139_value = load i32, i32* %dir_139_ptr

            ; increment directions counter
            %temp_139_2 = add i32 %index_dir_139, 1
            store i32 %temp_139_2, i32* %dir_counter

            ; switch
            switch i32 %dir_139_value, label %109 [ 
             i32 0, label %109
             i32 1, label %18
             i32 2, label %91
             i32 3, label %169
             i32 4, label %114
             i32 5, label %6
            ]

            140: 
            ; store node label in output array
            %index_140 = load i32, i32* %counter
            %output_140 = load i32*, i32** %output
            %output_140_ptr = getelementptr inbounds i32, i32* %output_140, i32 %index_140
            store i32 140, i32* %output_140_ptr

            ; increment counter
            %temp_140_1 = add i32 %index_140, 1
            store i32 %temp_140_1, i32* %counter
        
            ; get directions for node
            %index_dir_140 = load i32, i32* %dir_counter
            %dir_140 = load i32*, i32** %directions
            %dir_140_ptr = getelementptr inbounds i32, i32* %dir_140, i32 %index_dir_140
            %dir_140_value = load i32, i32* %dir_140_ptr

            ; increment directions counter
            %temp_140_2 = add i32 %index_dir_140, 1
            store i32 %temp_140_2, i32* %dir_counter

            ; switch
            switch i32 %dir_140_value, label %130 [ 
             i32 0, label %130
             i32 1, label %182
             i32 2, label %42
             i32 3, label %177
             i32 4, label %230
            ]

            141: 
            ; store node label in output array
            %index_141 = load i32, i32* %counter
            %output_141 = load i32*, i32** %output
            %output_141_ptr = getelementptr inbounds i32, i32* %output_141, i32 %index_141
            store i32 141, i32* %output_141_ptr

            ; increment counter
            %temp_141_1 = add i32 %index_141, 1
            store i32 %temp_141_1, i32* %counter
        
            ; get directions for node
            %index_dir_141 = load i32, i32* %dir_counter
            %dir_141 = load i32*, i32** %directions
            %dir_141_ptr = getelementptr inbounds i32, i32* %dir_141, i32 %index_dir_141
            %dir_141_value = load i32, i32* %dir_141_ptr

            ; increment directions counter
            %temp_141_2 = add i32 %index_dir_141, 1
            store i32 %temp_141_2, i32* %dir_counter

            ; switch
            switch i32 %dir_141_value, label %103 [ 
             i32 0, label %103
             i32 1, label %163
             i32 2, label %177
            ]

            142: 
            ; store node label in output array
            %index_142 = load i32, i32* %counter
            %output_142 = load i32*, i32** %output
            %output_142_ptr = getelementptr inbounds i32, i32* %output_142, i32 %index_142
            store i32 142, i32* %output_142_ptr

            ; increment counter
            %temp_142_1 = add i32 %index_142, 1
            store i32 %temp_142_1, i32* %counter
        
            ; get directions for node
            %index_dir_142 = load i32, i32* %dir_counter
            %dir_142 = load i32*, i32** %directions
            %dir_142_ptr = getelementptr inbounds i32, i32* %dir_142, i32 %index_dir_142
            %dir_142_value = load i32, i32* %dir_142_ptr

            ; increment directions counter
            %temp_142_2 = add i32 %index_dir_142, 1
            store i32 %temp_142_2, i32* %dir_counter

            ; switch
            switch i32 %dir_142_value, label %155 [ 
             i32 0, label %155
             i32 1, label %78
             i32 2, label %54
             i32 3, label %136
            ]

            143: 
            ; store node label in output array
            %index_143 = load i32, i32* %counter
            %output_143 = load i32*, i32** %output
            %output_143_ptr = getelementptr inbounds i32, i32* %output_143, i32 %index_143
            store i32 143, i32* %output_143_ptr

            ; increment counter
            %temp_143_1 = add i32 %index_143, 1
            store i32 %temp_143_1, i32* %counter
        
            ; get directions for node
            %index_dir_143 = load i32, i32* %dir_counter
            %dir_143 = load i32*, i32** %directions
            %dir_143_ptr = getelementptr inbounds i32, i32* %dir_143, i32 %index_dir_143
            %dir_143_value = load i32, i32* %dir_143_ptr

            ; increment directions counter
            %temp_143_2 = add i32 %index_dir_143, 1
            store i32 %temp_143_2, i32* %dir_counter

            ; switch
            switch i32 %dir_143_value, label %227 [ 
             i32 0, label %227
             i32 1, label %86
             i32 2, label %69
             i32 3, label %18
            ]

            144: 
            ; store node label in output array
            %index_144 = load i32, i32* %counter
            %output_144 = load i32*, i32** %output
            %output_144_ptr = getelementptr inbounds i32, i32* %output_144, i32 %index_144
            store i32 144, i32* %output_144_ptr

            ; increment counter
            %temp_144_1 = add i32 %index_144, 1
            store i32 %temp_144_1, i32* %counter
        
            ; get directions for node
            %index_dir_144 = load i32, i32* %dir_counter
            %dir_144 = load i32*, i32** %directions
            %dir_144_ptr = getelementptr inbounds i32, i32* %dir_144, i32 %index_dir_144
            %dir_144_value = load i32, i32* %dir_144_ptr

            ; increment directions counter
            %temp_144_2 = add i32 %index_dir_144, 1
            store i32 %temp_144_2, i32* %dir_counter

            ; switch
            switch i32 %dir_144_value, label %179 [ 
             i32 0, label %179
             i32 1, label %213
             i32 2, label %134
            ]

            145: 
            ; store node label in output array
            %index_145 = load i32, i32* %counter
            %output_145 = load i32*, i32** %output
            %output_145_ptr = getelementptr inbounds i32, i32* %output_145, i32 %index_145
            store i32 145, i32* %output_145_ptr

            ; increment counter
            %temp_145_1 = add i32 %index_145, 1
            store i32 %temp_145_1, i32* %counter
        
            ; get directions for node
            %index_dir_145 = load i32, i32* %dir_counter
            %dir_145 = load i32*, i32** %directions
            %dir_145_ptr = getelementptr inbounds i32, i32* %dir_145, i32 %index_dir_145
            %dir_145_value = load i32, i32* %dir_145_ptr

            ; increment directions counter
            %temp_145_2 = add i32 %index_dir_145, 1
            store i32 %temp_145_2, i32* %dir_counter

            ; switch
            switch i32 %dir_145_value, label %95 [ 
             i32 0, label %95
             i32 1, label %120
             i32 2, label %131
             i32 3, label %143
             i32 4, label %189
             i32 5, label %13
             i32 6, label %44
             i32 7, label %77
            ]

            146: 
            ; store node label in output array
            %index_146 = load i32, i32* %counter
            %output_146 = load i32*, i32** %output
            %output_146_ptr = getelementptr inbounds i32, i32* %output_146, i32 %index_146
            store i32 146, i32* %output_146_ptr

            ; increment counter
            %temp_146_1 = add i32 %index_146, 1
            store i32 %temp_146_1, i32* %counter
        
            ; get directions for node
            %index_dir_146 = load i32, i32* %dir_counter
            %dir_146 = load i32*, i32** %directions
            %dir_146_ptr = getelementptr inbounds i32, i32* %dir_146, i32 %index_dir_146
            %dir_146_value = load i32, i32* %dir_146_ptr

            ; increment directions counter
            %temp_146_2 = add i32 %index_dir_146, 1
            store i32 %temp_146_2, i32* %dir_counter

            ; switch
            switch i32 %dir_146_value, label %189 [ 
             i32 0, label %189
             i32 1, label %183
             i32 2, label %209
             i32 3, label %143
             i32 4, label %70
             i32 5, label %92
             i32 6, label %157
             i32 7, label %190
            ]

            147: 
            ; store node label in output array
            %index_147 = load i32, i32* %counter
            %output_147 = load i32*, i32** %output
            %output_147_ptr = getelementptr inbounds i32, i32* %output_147, i32 %index_147
            store i32 147, i32* %output_147_ptr

            ; increment counter
            %temp_147_1 = add i32 %index_147, 1
            store i32 %temp_147_1, i32* %counter
        
            ; get directions for node
            %index_dir_147 = load i32, i32* %dir_counter
            %dir_147 = load i32*, i32** %directions
            %dir_147_ptr = getelementptr inbounds i32, i32* %dir_147, i32 %index_dir_147
            %dir_147_value = load i32, i32* %dir_147_ptr

            ; increment directions counter
            %temp_147_2 = add i32 %index_dir_147, 1
            store i32 %temp_147_2, i32* %dir_counter

            ; switch
            switch i32 %dir_147_value, label %101 [ 
             i32 0, label %101
             i32 1, label %144
             i32 2, label %103
             i32 3, label %45
            ]

            148: 
            ; store node label in output array
            %index_148 = load i32, i32* %counter
            %output_148 = load i32*, i32** %output
            %output_148_ptr = getelementptr inbounds i32, i32* %output_148, i32 %index_148
            store i32 148, i32* %output_148_ptr

            ; increment counter
            %temp_148_1 = add i32 %index_148, 1
            store i32 %temp_148_1, i32* %counter
        
            ; get directions for node
            %index_dir_148 = load i32, i32* %dir_counter
            %dir_148 = load i32*, i32** %directions
            %dir_148_ptr = getelementptr inbounds i32, i32* %dir_148, i32 %index_dir_148
            %dir_148_value = load i32, i32* %dir_148_ptr

            ; increment directions counter
            %temp_148_2 = add i32 %index_dir_148, 1
            store i32 %temp_148_2, i32* %dir_counter

            ; switch
            switch i32 %dir_148_value, label %203 [ 
             i32 0, label %203
             i32 1, label %67
             i32 2, label %222
             i32 3, label %157
             i32 4, label %85
             i32 5, label %184
            ]

            149: 
            ; store node label in output array
            %index_149 = load i32, i32* %counter
            %output_149 = load i32*, i32** %output
            %output_149_ptr = getelementptr inbounds i32, i32* %output_149, i32 %index_149
            store i32 149, i32* %output_149_ptr

            ; increment counter
            %temp_149_1 = add i32 %index_149, 1
            store i32 %temp_149_1, i32* %counter
        
            ; get directions for node
            %index_dir_149 = load i32, i32* %dir_counter
            %dir_149 = load i32*, i32** %directions
            %dir_149_ptr = getelementptr inbounds i32, i32* %dir_149, i32 %index_dir_149
            %dir_149_value = load i32, i32* %dir_149_ptr

            ; increment directions counter
            %temp_149_2 = add i32 %index_dir_149, 1
            store i32 %temp_149_2, i32* %dir_counter

            ; switch
            switch i32 %dir_149_value, label %67 [ 
             i32 0, label %67
             i32 1, label %157
             i32 2, label %181
             i32 3, label %63
            ]

            150: 
            ; store node label in output array
            %index_150 = load i32, i32* %counter
            %output_150 = load i32*, i32** %output
            %output_150_ptr = getelementptr inbounds i32, i32* %output_150, i32 %index_150
            store i32 150, i32* %output_150_ptr

            ; increment counter
            %temp_150_1 = add i32 %index_150, 1
            store i32 %temp_150_1, i32* %counter
        
            ; get directions for node
            %index_dir_150 = load i32, i32* %dir_counter
            %dir_150 = load i32*, i32** %directions
            %dir_150_ptr = getelementptr inbounds i32, i32* %dir_150, i32 %index_dir_150
            %dir_150_value = load i32, i32* %dir_150_ptr

            ; increment directions counter
            %temp_150_2 = add i32 %index_dir_150, 1
            store i32 %temp_150_2, i32* %dir_counter

            ; switch
            switch i32 %dir_150_value, label %170 [ 
             i32 0, label %170
             i32 1, label %8
             i32 2, label %219
             i32 3, label %223
             i32 4, label %160
             i32 5, label %104
             i32 6, label %82
             i32 7, label %111
             i32 8, label %195
            ]

            151: 
            ; store node label in output array
            %index_151 = load i32, i32* %counter
            %output_151 = load i32*, i32** %output
            %output_151_ptr = getelementptr inbounds i32, i32* %output_151, i32 %index_151
            store i32 151, i32* %output_151_ptr

            ; increment counter
            %temp_151_1 = add i32 %index_151, 1
            store i32 %temp_151_1, i32* %counter
        
            ; get directions for node
            %index_dir_151 = load i32, i32* %dir_counter
            %dir_151 = load i32*, i32** %directions
            %dir_151_ptr = getelementptr inbounds i32, i32* %dir_151, i32 %index_dir_151
            %dir_151_value = load i32, i32* %dir_151_ptr

            ; increment directions counter
            %temp_151_2 = add i32 %index_dir_151, 1
            store i32 %temp_151_2, i32* %dir_counter

            ; switch
            switch i32 %dir_151_value, label %202 [ 
             i32 0, label %202
             i32 1, label %69
             i32 2, label %49
             i32 3, label %19
            ]

            152: 
            ; store node label in output array
            %index_152 = load i32, i32* %counter
            %output_152 = load i32*, i32** %output
            %output_152_ptr = getelementptr inbounds i32, i32* %output_152, i32 %index_152
            store i32 152, i32* %output_152_ptr

            ; increment counter
            %temp_152_1 = add i32 %index_152, 1
            store i32 %temp_152_1, i32* %counter
        
            ; get directions for node
            %index_dir_152 = load i32, i32* %dir_counter
            %dir_152 = load i32*, i32** %directions
            %dir_152_ptr = getelementptr inbounds i32, i32* %dir_152, i32 %index_dir_152
            %dir_152_value = load i32, i32* %dir_152_ptr

            ; increment directions counter
            %temp_152_2 = add i32 %index_dir_152, 1
            store i32 %temp_152_2, i32* %dir_counter

            ; switch
            switch i32 %dir_152_value, label %188 [ 
             i32 0, label %188
             i32 1, label %43
             i32 2, label %223
             i32 3, label %149
             i32 4, label %114
             i32 5, label %187
             i32 6, label %38
            ]

            153: 
            ; store node label in output array
            %index_153 = load i32, i32* %counter
            %output_153 = load i32*, i32** %output
            %output_153_ptr = getelementptr inbounds i32, i32* %output_153, i32 %index_153
            store i32 153, i32* %output_153_ptr

            ; increment counter
            %temp_153_1 = add i32 %index_153, 1
            store i32 %temp_153_1, i32* %counter
        
            ; get directions for node
            %index_dir_153 = load i32, i32* %dir_counter
            %dir_153 = load i32*, i32** %directions
            %dir_153_ptr = getelementptr inbounds i32, i32* %dir_153, i32 %index_dir_153
            %dir_153_value = load i32, i32* %dir_153_ptr

            ; increment directions counter
            %temp_153_2 = add i32 %index_dir_153, 1
            store i32 %temp_153_2, i32* %dir_counter

            ; switch
            switch i32 %dir_153_value, label %68 [ 
             i32 0, label %68
             i32 1, label %118
             i32 2, label %135
             i32 3, label %42
             i32 4, label %36
             i32 5, label %200
             i32 6, label %230
            ]

            154: 
            ; store node label in output array
            %index_154 = load i32, i32* %counter
            %output_154 = load i32*, i32** %output
            %output_154_ptr = getelementptr inbounds i32, i32* %output_154, i32 %index_154
            store i32 154, i32* %output_154_ptr

            ; increment counter
            %temp_154_1 = add i32 %index_154, 1
            store i32 %temp_154_1, i32* %counter
        
            ; get directions for node
            %index_dir_154 = load i32, i32* %dir_counter
            %dir_154 = load i32*, i32** %directions
            %dir_154_ptr = getelementptr inbounds i32, i32* %dir_154, i32 %index_dir_154
            %dir_154_value = load i32, i32* %dir_154_ptr

            ; increment directions counter
            %temp_154_2 = add i32 %index_dir_154, 1
            store i32 %temp_154_2, i32* %dir_counter

            ; switch
            switch i32 %dir_154_value, label %113 [ 
             i32 0, label %113
             i32 1, label %93
             i32 2, label %80
             i32 3, label %193
             i32 4, label %103
             i32 5, label %62
             i32 6, label %30
             i32 7, label %184
             i32 8, label %230
            ]

            155: 
            ; store node label in output array
            %index_155 = load i32, i32* %counter
            %output_155 = load i32*, i32** %output
            %output_155_ptr = getelementptr inbounds i32, i32* %output_155, i32 %index_155
            store i32 155, i32* %output_155_ptr

            ; increment counter
            %temp_155_1 = add i32 %index_155, 1
            store i32 %temp_155_1, i32* %counter
        
            ; get directions for node
            %index_dir_155 = load i32, i32* %dir_counter
            %dir_155 = load i32*, i32** %directions
            %dir_155_ptr = getelementptr inbounds i32, i32* %dir_155, i32 %index_dir_155
            %dir_155_value = load i32, i32* %dir_155_ptr

            ; increment directions counter
            %temp_155_2 = add i32 %index_dir_155, 1
            store i32 %temp_155_2, i32* %dir_counter

            ; switch
            switch i32 %dir_155_value, label %184 [ 
             i32 0, label %184
             i32 1, label %175
             i32 2, label %79
             i32 3, label %18
             i32 4, label %230
            ]

            156: 
            ; store node label in output array
            %index_156 = load i32, i32* %counter
            %output_156 = load i32*, i32** %output
            %output_156_ptr = getelementptr inbounds i32, i32* %output_156, i32 %index_156
            store i32 156, i32* %output_156_ptr

            ; increment counter
            %temp_156_1 = add i32 %index_156, 1
            store i32 %temp_156_1, i32* %counter
        
            ; get directions for node
            %index_dir_156 = load i32, i32* %dir_counter
            %dir_156 = load i32*, i32** %directions
            %dir_156_ptr = getelementptr inbounds i32, i32* %dir_156, i32 %index_dir_156
            %dir_156_value = load i32, i32* %dir_156_ptr

            ; increment directions counter
            %temp_156_2 = add i32 %index_dir_156, 1
            store i32 %temp_156_2, i32* %dir_counter

            ; switch
            switch i32 %dir_156_value, label %59 [ 
             i32 0, label %59
             i32 1, label %102
             i32 2, label %83
            ]

            157: 
            ; store node label in output array
            %index_157 = load i32, i32* %counter
            %output_157 = load i32*, i32** %output
            %output_157_ptr = getelementptr inbounds i32, i32* %output_157, i32 %index_157
            store i32 157, i32* %output_157_ptr

            ; increment counter
            %temp_157_1 = add i32 %index_157, 1
            store i32 %temp_157_1, i32* %counter
        
            ; get directions for node
            %index_dir_157 = load i32, i32* %dir_counter
            %dir_157 = load i32*, i32** %directions
            %dir_157_ptr = getelementptr inbounds i32, i32* %dir_157, i32 %index_dir_157
            %dir_157_value = load i32, i32* %dir_157_ptr

            ; increment directions counter
            %temp_157_2 = add i32 %index_dir_157, 1
            store i32 %temp_157_2, i32* %dir_counter

            ; switch
            switch i32 %dir_157_value, label %26 [ 
             i32 0, label %26
             i32 1, label %48
             i32 2, label %12
             i32 3, label %15
             i32 4, label %208
             i32 5, label %153
            ]

            158: 
            ; store node label in output array
            %index_158 = load i32, i32* %counter
            %output_158 = load i32*, i32** %output
            %output_158_ptr = getelementptr inbounds i32, i32* %output_158, i32 %index_158
            store i32 158, i32* %output_158_ptr

            ; increment counter
            %temp_158_1 = add i32 %index_158, 1
            store i32 %temp_158_1, i32* %counter
        
            ; get directions for node
            %index_dir_158 = load i32, i32* %dir_counter
            %dir_158 = load i32*, i32** %directions
            %dir_158_ptr = getelementptr inbounds i32, i32* %dir_158, i32 %index_dir_158
            %dir_158_value = load i32, i32* %dir_158_ptr

            ; increment directions counter
            %temp_158_2 = add i32 %index_dir_158, 1
            store i32 %temp_158_2, i32* %dir_counter

            ; switch
            switch i32 %dir_158_value, label %228 [ 
             i32 0, label %228
             i32 1, label %193
             i32 2, label %56
            ]

            159: 
            ; store node label in output array
            %index_159 = load i32, i32* %counter
            %output_159 = load i32*, i32** %output
            %output_159_ptr = getelementptr inbounds i32, i32* %output_159, i32 %index_159
            store i32 159, i32* %output_159_ptr

            ; increment counter
            %temp_159_1 = add i32 %index_159, 1
            store i32 %temp_159_1, i32* %counter
        
            ; get directions for node
            %index_dir_159 = load i32, i32* %dir_counter
            %dir_159 = load i32*, i32** %directions
            %dir_159_ptr = getelementptr inbounds i32, i32* %dir_159, i32 %index_dir_159
            %dir_159_value = load i32, i32* %dir_159_ptr

            ; increment directions counter
            %temp_159_2 = add i32 %index_dir_159, 1
            store i32 %temp_159_2, i32* %dir_counter

            ; switch
            switch i32 %dir_159_value, label %9 [ 
             i32 0, label %9
             i32 1, label %127
             i32 2, label %181
             i32 3, label %136
             i32 4, label %209
             i32 5, label %186
             i32 6, label %228
             i32 7, label %157
            ]

            160: 
            ; store node label in output array
            %index_160 = load i32, i32* %counter
            %output_160 = load i32*, i32** %output
            %output_160_ptr = getelementptr inbounds i32, i32* %output_160, i32 %index_160
            store i32 160, i32* %output_160_ptr

            ; increment counter
            %temp_160_1 = add i32 %index_160, 1
            store i32 %temp_160_1, i32* %counter
        
            ; get directions for node
            %index_dir_160 = load i32, i32* %dir_counter
            %dir_160 = load i32*, i32** %directions
            %dir_160_ptr = getelementptr inbounds i32, i32* %dir_160, i32 %index_dir_160
            %dir_160_value = load i32, i32* %dir_160_ptr

            ; increment directions counter
            %temp_160_2 = add i32 %index_dir_160, 1
            store i32 %temp_160_2, i32* %dir_counter

            ; switch
            switch i32 %dir_160_value, label %88 [ 
             i32 0, label %88
             i32 1, label %170
             i32 2, label %215
             i32 3, label %71
             i32 4, label %31
             i32 5, label %157
            ]

            161: 
            ; store node label in output array
            %index_161 = load i32, i32* %counter
            %output_161 = load i32*, i32** %output
            %output_161_ptr = getelementptr inbounds i32, i32* %output_161, i32 %index_161
            store i32 161, i32* %output_161_ptr

            ; increment counter
            %temp_161_1 = add i32 %index_161, 1
            store i32 %temp_161_1, i32* %counter
        
            ; get directions for node
            %index_dir_161 = load i32, i32* %dir_counter
            %dir_161 = load i32*, i32** %directions
            %dir_161_ptr = getelementptr inbounds i32, i32* %dir_161, i32 %index_dir_161
            %dir_161_value = load i32, i32* %dir_161_ptr

            ; increment directions counter
            %temp_161_2 = add i32 %index_dir_161, 1
            store i32 %temp_161_2, i32* %dir_counter

            ; switch
            switch i32 %dir_161_value, label %45 [ 
             i32 0, label %45
             i32 1, label %25
             i32 2, label %57
             i32 3, label %103
             i32 4, label %60
             i32 5, label %127
             i32 6, label %116
             i32 7, label %97
            ]

            162: 
            ; store node label in output array
            %index_162 = load i32, i32* %counter
            %output_162 = load i32*, i32** %output
            %output_162_ptr = getelementptr inbounds i32, i32* %output_162, i32 %index_162
            store i32 162, i32* %output_162_ptr

            ; increment counter
            %temp_162_1 = add i32 %index_162, 1
            store i32 %temp_162_1, i32* %counter
        
            ; get directions for node
            %index_dir_162 = load i32, i32* %dir_counter
            %dir_162 = load i32*, i32** %directions
            %dir_162_ptr = getelementptr inbounds i32, i32* %dir_162, i32 %index_dir_162
            %dir_162_value = load i32, i32* %dir_162_ptr

            ; increment directions counter
            %temp_162_2 = add i32 %index_dir_162, 1
            store i32 %temp_162_2, i32* %dir_counter

            ; switch
            switch i32 %dir_162_value, label %44 [ 
             i32 0, label %44
             i32 1, label %60
             i32 2, label %61
             i32 3, label %210
             i32 4, label %73
             i32 5, label %119
             i32 6, label %141
             i32 7, label %149
             i32 8, label %100
            ]

            163: 
            ; store node label in output array
            %index_163 = load i32, i32* %counter
            %output_163 = load i32*, i32** %output
            %output_163_ptr = getelementptr inbounds i32, i32* %output_163, i32 %index_163
            store i32 163, i32* %output_163_ptr

            ; increment counter
            %temp_163_1 = add i32 %index_163, 1
            store i32 %temp_163_1, i32* %counter
        
            ; get directions for node
            %index_dir_163 = load i32, i32* %dir_counter
            %dir_163 = load i32*, i32** %directions
            %dir_163_ptr = getelementptr inbounds i32, i32* %dir_163, i32 %index_dir_163
            %dir_163_value = load i32, i32* %dir_163_ptr

            ; increment directions counter
            %temp_163_2 = add i32 %index_dir_163, 1
            store i32 %temp_163_2, i32* %dir_counter

            ; switch
            switch i32 %dir_163_value, label %116 [ 
             i32 0, label %116
             i32 1, label %184
             i32 2, label %67
             i32 3, label %85
            ]

            164: 
            ; store node label in output array
            %index_164 = load i32, i32* %counter
            %output_164 = load i32*, i32** %output
            %output_164_ptr = getelementptr inbounds i32, i32* %output_164, i32 %index_164
            store i32 164, i32* %output_164_ptr

            ; increment counter
            %temp_164_1 = add i32 %index_164, 1
            store i32 %temp_164_1, i32* %counter
        
            ; get directions for node
            %index_dir_164 = load i32, i32* %dir_counter
            %dir_164 = load i32*, i32** %directions
            %dir_164_ptr = getelementptr inbounds i32, i32* %dir_164, i32 %index_dir_164
            %dir_164_value = load i32, i32* %dir_164_ptr

            ; increment directions counter
            %temp_164_2 = add i32 %index_dir_164, 1
            store i32 %temp_164_2, i32* %dir_counter

            ; switch
            switch i32 %dir_164_value, label %152 [ 
             i32 0, label %152
             i32 1, label %29
             i32 2, label %55
             i32 3, label %21
             i32 4, label %12
             i32 5, label %4
             i32 6, label %230
            ]

            165: 
            ; store node label in output array
            %index_165 = load i32, i32* %counter
            %output_165 = load i32*, i32** %output
            %output_165_ptr = getelementptr inbounds i32, i32* %output_165, i32 %index_165
            store i32 165, i32* %output_165_ptr

            ; increment counter
            %temp_165_1 = add i32 %index_165, 1
            store i32 %temp_165_1, i32* %counter
        
            ; get directions for node
            %index_dir_165 = load i32, i32* %dir_counter
            %dir_165 = load i32*, i32** %directions
            %dir_165_ptr = getelementptr inbounds i32, i32* %dir_165, i32 %index_dir_165
            %dir_165_value = load i32, i32* %dir_165_ptr

            ; increment directions counter
            %temp_165_2 = add i32 %index_dir_165, 1
            store i32 %temp_165_2, i32* %dir_counter

            ; switch
            switch i32 %dir_165_value, label %2 [ 
             i32 0, label %2
             i32 1, label %220
             i32 2, label %123
             i32 3, label %82
             i32 4, label %228
             i32 5, label %99
             i32 6, label %218
             i32 7, label %149
             i32 8, label %74
            ]

            166: 
            ; store node label in output array
            %index_166 = load i32, i32* %counter
            %output_166 = load i32*, i32** %output
            %output_166_ptr = getelementptr inbounds i32, i32* %output_166, i32 %index_166
            store i32 166, i32* %output_166_ptr

            ; increment counter
            %temp_166_1 = add i32 %index_166, 1
            store i32 %temp_166_1, i32* %counter
        
            ; get directions for node
            %index_dir_166 = load i32, i32* %dir_counter
            %dir_166 = load i32*, i32** %directions
            %dir_166_ptr = getelementptr inbounds i32, i32* %dir_166, i32 %index_dir_166
            %dir_166_value = load i32, i32* %dir_166_ptr

            ; increment directions counter
            %temp_166_2 = add i32 %index_dir_166, 1
            store i32 %temp_166_2, i32* %dir_counter

            ; switch
            switch i32 %dir_166_value, label %103 [ 
             i32 0, label %103
             i32 1, label %41
             i32 2, label %226
             i32 3, label %212
             i32 4, label %230
            ]

            167: 
            ; store node label in output array
            %index_167 = load i32, i32* %counter
            %output_167 = load i32*, i32** %output
            %output_167_ptr = getelementptr inbounds i32, i32* %output_167, i32 %index_167
            store i32 167, i32* %output_167_ptr

            ; increment counter
            %temp_167_1 = add i32 %index_167, 1
            store i32 %temp_167_1, i32* %counter
        
            ; get directions for node
            %index_dir_167 = load i32, i32* %dir_counter
            %dir_167 = load i32*, i32** %directions
            %dir_167_ptr = getelementptr inbounds i32, i32* %dir_167, i32 %index_dir_167
            %dir_167_value = load i32, i32* %dir_167_ptr

            ; increment directions counter
            %temp_167_2 = add i32 %index_dir_167, 1
            store i32 %temp_167_2, i32* %dir_counter

            ; switch
            switch i32 %dir_167_value, label %166 [ 
             i32 0, label %166
             i32 1, label %39
             i32 2, label %204
             i32 3, label %8
             i32 4, label %4
             i32 5, label %100
             i32 6, label %38
             i32 7, label %225
             i32 8, label %171
            ]

            168: 
            ; store node label in output array
            %index_168 = load i32, i32* %counter
            %output_168 = load i32*, i32** %output
            %output_168_ptr = getelementptr inbounds i32, i32* %output_168, i32 %index_168
            store i32 168, i32* %output_168_ptr

            ; increment counter
            %temp_168_1 = add i32 %index_168, 1
            store i32 %temp_168_1, i32* %counter
        
            ; get directions for node
            %index_dir_168 = load i32, i32* %dir_counter
            %dir_168 = load i32*, i32** %directions
            %dir_168_ptr = getelementptr inbounds i32, i32* %dir_168, i32 %index_dir_168
            %dir_168_value = load i32, i32* %dir_168_ptr

            ; increment directions counter
            %temp_168_2 = add i32 %index_dir_168, 1
            store i32 %temp_168_2, i32* %dir_counter

            ; switch
            switch i32 %dir_168_value, label %15 [ 
             i32 0, label %15
             i32 1, label %145
             i32 2, label %98
             i32 3, label %66
             i32 4, label %34
             i32 5, label %21
             i32 6, label %119
            ]

            169: 
            ; store node label in output array
            %index_169 = load i32, i32* %counter
            %output_169 = load i32*, i32** %output
            %output_169_ptr = getelementptr inbounds i32, i32* %output_169, i32 %index_169
            store i32 169, i32* %output_169_ptr

            ; increment counter
            %temp_169_1 = add i32 %index_169, 1
            store i32 %temp_169_1, i32* %counter
        
            ; get directions for node
            %index_dir_169 = load i32, i32* %dir_counter
            %dir_169 = load i32*, i32** %directions
            %dir_169_ptr = getelementptr inbounds i32, i32* %dir_169, i32 %index_dir_169
            %dir_169_value = load i32, i32* %dir_169_ptr

            ; increment directions counter
            %temp_169_2 = add i32 %index_dir_169, 1
            store i32 %temp_169_2, i32* %dir_counter

            ; switch
            switch i32 %dir_169_value, label %216 [ 
             i32 0, label %216
             i32 1, label %78
             i32 2, label %4
             i32 3, label %10
             i32 4, label %138
             i32 5, label %16
             i32 6, label %135
            ]

            170: 
            ; store node label in output array
            %index_170 = load i32, i32* %counter
            %output_170 = load i32*, i32** %output
            %output_170_ptr = getelementptr inbounds i32, i32* %output_170, i32 %index_170
            store i32 170, i32* %output_170_ptr

            ; increment counter
            %temp_170_1 = add i32 %index_170, 1
            store i32 %temp_170_1, i32* %counter
        
            ; get directions for node
            %index_dir_170 = load i32, i32* %dir_counter
            %dir_170 = load i32*, i32** %directions
            %dir_170_ptr = getelementptr inbounds i32, i32* %dir_170, i32 %index_dir_170
            %dir_170_value = load i32, i32* %dir_170_ptr

            ; increment directions counter
            %temp_170_2 = add i32 %index_dir_170, 1
            store i32 %temp_170_2, i32* %dir_counter

            ; switch
            switch i32 %dir_170_value, label %11 [ 
             i32 0, label %11
             i32 1, label %71
             i32 2, label %200
             i32 3, label %31
            ]

            171: 
            ; store node label in output array
            %index_171 = load i32, i32* %counter
            %output_171 = load i32*, i32** %output
            %output_171_ptr = getelementptr inbounds i32, i32* %output_171, i32 %index_171
            store i32 171, i32* %output_171_ptr

            ; increment counter
            %temp_171_1 = add i32 %index_171, 1
            store i32 %temp_171_1, i32* %counter
        
            ; get directions for node
            %index_dir_171 = load i32, i32* %dir_counter
            %dir_171 = load i32*, i32** %directions
            %dir_171_ptr = getelementptr inbounds i32, i32* %dir_171, i32 %index_dir_171
            %dir_171_value = load i32, i32* %dir_171_ptr

            ; increment directions counter
            %temp_171_2 = add i32 %index_dir_171, 1
            store i32 %temp_171_2, i32* %dir_counter

            ; switch
            switch i32 %dir_171_value, label %24 [ 
             i32 0, label %24
             i32 1, label %49
             i32 2, label %8
             i32 3, label %128
             i32 4, label %164
             i32 5, label %34
            ]

            172: 
            ; store node label in output array
            %index_172 = load i32, i32* %counter
            %output_172 = load i32*, i32** %output
            %output_172_ptr = getelementptr inbounds i32, i32* %output_172, i32 %index_172
            store i32 172, i32* %output_172_ptr

            ; increment counter
            %temp_172_1 = add i32 %index_172, 1
            store i32 %temp_172_1, i32* %counter
        
            ; get directions for node
            %index_dir_172 = load i32, i32* %dir_counter
            %dir_172 = load i32*, i32** %directions
            %dir_172_ptr = getelementptr inbounds i32, i32* %dir_172, i32 %index_dir_172
            %dir_172_value = load i32, i32* %dir_172_ptr

            ; increment directions counter
            %temp_172_2 = add i32 %index_dir_172, 1
            store i32 %temp_172_2, i32* %dir_counter

            ; switch
            switch i32 %dir_172_value, label %72 [ 
             i32 0, label %72
             i32 1, label %176
             i32 2, label %210
             i32 3, label %217
             i32 4, label %50
             i32 5, label %170
             i32 6, label %115
             i32 7, label %100
            ]

            173: 
            ; store node label in output array
            %index_173 = load i32, i32* %counter
            %output_173 = load i32*, i32** %output
            %output_173_ptr = getelementptr inbounds i32, i32* %output_173, i32 %index_173
            store i32 173, i32* %output_173_ptr

            ; increment counter
            %temp_173_1 = add i32 %index_173, 1
            store i32 %temp_173_1, i32* %counter
        
            ; get directions for node
            %index_dir_173 = load i32, i32* %dir_counter
            %dir_173 = load i32*, i32** %directions
            %dir_173_ptr = getelementptr inbounds i32, i32* %dir_173, i32 %index_dir_173
            %dir_173_value = load i32, i32* %dir_173_ptr

            ; increment directions counter
            %temp_173_2 = add i32 %index_dir_173, 1
            store i32 %temp_173_2, i32* %dir_counter

            ; switch
            switch i32 %dir_173_value, label %162 [ 
             i32 0, label %162
             i32 1, label %69
             i32 2, label %67
             i32 3, label %165
             i32 4, label %163
            ]

            174: 
            ; store node label in output array
            %index_174 = load i32, i32* %counter
            %output_174 = load i32*, i32** %output
            %output_174_ptr = getelementptr inbounds i32, i32* %output_174, i32 %index_174
            store i32 174, i32* %output_174_ptr

            ; increment counter
            %temp_174_1 = add i32 %index_174, 1
            store i32 %temp_174_1, i32* %counter
        
            ; get directions for node
            %index_dir_174 = load i32, i32* %dir_counter
            %dir_174 = load i32*, i32** %directions
            %dir_174_ptr = getelementptr inbounds i32, i32* %dir_174, i32 %index_dir_174
            %dir_174_value = load i32, i32* %dir_174_ptr

            ; increment directions counter
            %temp_174_2 = add i32 %index_dir_174, 1
            store i32 %temp_174_2, i32* %dir_counter

            ; switch
            switch i32 %dir_174_value, label %63 [ 
             i32 0, label %63
             i32 1, label %16
             i32 2, label %151
             i32 3, label %202
            ]

            175: 
            ; store node label in output array
            %index_175 = load i32, i32* %counter
            %output_175 = load i32*, i32** %output
            %output_175_ptr = getelementptr inbounds i32, i32* %output_175, i32 %index_175
            store i32 175, i32* %output_175_ptr

            ; increment counter
            %temp_175_1 = add i32 %index_175, 1
            store i32 %temp_175_1, i32* %counter
        
            ; get directions for node
            %index_dir_175 = load i32, i32* %dir_counter
            %dir_175 = load i32*, i32** %directions
            %dir_175_ptr = getelementptr inbounds i32, i32* %dir_175, i32 %index_dir_175
            %dir_175_value = load i32, i32* %dir_175_ptr

            ; increment directions counter
            %temp_175_2 = add i32 %index_dir_175, 1
            store i32 %temp_175_2, i32* %dir_counter

            ; switch
            switch i32 %dir_175_value, label %45 [ 
             i32 0, label %45
             i32 1, label %90
             i32 2, label %110
             i32 3, label %155
             i32 4, label %179
             i32 5, label %144
             i32 6, label %164
            ]

            176: 
            ; store node label in output array
            %index_176 = load i32, i32* %counter
            %output_176 = load i32*, i32** %output
            %output_176_ptr = getelementptr inbounds i32, i32* %output_176, i32 %index_176
            store i32 176, i32* %output_176_ptr

            ; increment counter
            %temp_176_1 = add i32 %index_176, 1
            store i32 %temp_176_1, i32* %counter
        
            ; get directions for node
            %index_dir_176 = load i32, i32* %dir_counter
            %dir_176 = load i32*, i32** %directions
            %dir_176_ptr = getelementptr inbounds i32, i32* %dir_176, i32 %index_dir_176
            %dir_176_value = load i32, i32* %dir_176_ptr

            ; increment directions counter
            %temp_176_2 = add i32 %index_dir_176, 1
            store i32 %temp_176_2, i32* %dir_counter

            ; switch
            switch i32 %dir_176_value, label %16 [ 
             i32 0, label %16
             i32 1, label %91
             i32 2, label %141
             i32 3, label %106
             i32 4, label %138
             i32 5, label %52
             i32 6, label %183
            ]

            177: 
            ; store node label in output array
            %index_177 = load i32, i32* %counter
            %output_177 = load i32*, i32** %output
            %output_177_ptr = getelementptr inbounds i32, i32* %output_177, i32 %index_177
            store i32 177, i32* %output_177_ptr

            ; increment counter
            %temp_177_1 = add i32 %index_177, 1
            store i32 %temp_177_1, i32* %counter
        
            ; get directions for node
            %index_dir_177 = load i32, i32* %dir_counter
            %dir_177 = load i32*, i32** %directions
            %dir_177_ptr = getelementptr inbounds i32, i32* %dir_177, i32 %index_dir_177
            %dir_177_value = load i32, i32* %dir_177_ptr

            ; increment directions counter
            %temp_177_2 = add i32 %index_dir_177, 1
            store i32 %temp_177_2, i32* %dir_counter

            ; switch
            switch i32 %dir_177_value, label %109 [ 
             i32 0, label %109
             i32 1, label %170
             i32 2, label %18
             i32 3, label %183
             i32 4, label %69
             i32 5, label %191
             i32 6, label %157
            ]

            178: 
            ; store node label in output array
            %index_178 = load i32, i32* %counter
            %output_178 = load i32*, i32** %output
            %output_178_ptr = getelementptr inbounds i32, i32* %output_178, i32 %index_178
            store i32 178, i32* %output_178_ptr

            ; increment counter
            %temp_178_1 = add i32 %index_178, 1
            store i32 %temp_178_1, i32* %counter
        
            ; get directions for node
            %index_dir_178 = load i32, i32* %dir_counter
            %dir_178 = load i32*, i32** %directions
            %dir_178_ptr = getelementptr inbounds i32, i32* %dir_178, i32 %index_dir_178
            %dir_178_value = load i32, i32* %dir_178_ptr

            ; increment directions counter
            %temp_178_2 = add i32 %index_dir_178, 1
            store i32 %temp_178_2, i32* %dir_counter

            ; switch
            switch i32 %dir_178_value, label %193 [ 
             i32 0, label %193
             i32 1, label %19
             i32 2, label %65
             i32 3, label %46
             i32 4, label %25
             i32 5, label %39
             i32 6, label %16
             i32 7, label %53
            ]

            179: 
            ; store node label in output array
            %index_179 = load i32, i32* %counter
            %output_179 = load i32*, i32** %output
            %output_179_ptr = getelementptr inbounds i32, i32* %output_179, i32 %index_179
            store i32 179, i32* %output_179_ptr

            ; increment counter
            %temp_179_1 = add i32 %index_179, 1
            store i32 %temp_179_1, i32* %counter
        
            ; get directions for node
            %index_dir_179 = load i32, i32* %dir_counter
            %dir_179 = load i32*, i32** %directions
            %dir_179_ptr = getelementptr inbounds i32, i32* %dir_179, i32 %index_dir_179
            %dir_179_value = load i32, i32* %dir_179_ptr

            ; increment directions counter
            %temp_179_2 = add i32 %index_dir_179, 1
            store i32 %temp_179_2, i32* %dir_counter

            ; switch
            switch i32 %dir_179_value, label %110 [ 
             i32 0, label %110
             i32 1, label %219
             i32 2, label %12
             i32 3, label %14
             i32 4, label %164
             i32 5, label %24
             i32 6, label %209
             i32 7, label %132
             i32 8, label %121
            ]

            180: 
            ; store node label in output array
            %index_180 = load i32, i32* %counter
            %output_180 = load i32*, i32** %output
            %output_180_ptr = getelementptr inbounds i32, i32* %output_180, i32 %index_180
            store i32 180, i32* %output_180_ptr

            ; increment counter
            %temp_180_1 = add i32 %index_180, 1
            store i32 %temp_180_1, i32* %counter
        
            ; get directions for node
            %index_dir_180 = load i32, i32* %dir_counter
            %dir_180 = load i32*, i32** %directions
            %dir_180_ptr = getelementptr inbounds i32, i32* %dir_180, i32 %index_dir_180
            %dir_180_value = load i32, i32* %dir_180_ptr

            ; increment directions counter
            %temp_180_2 = add i32 %index_dir_180, 1
            store i32 %temp_180_2, i32* %dir_counter

            ; switch
            switch i32 %dir_180_value, label %95 [ 
             i32 0, label %95
             i32 1, label %26
             i32 2, label %81
             i32 3, label %11
             i32 4, label %33
             i32 5, label %137
             i32 6, label %9
             i32 7, label %230
            ]

            181: 
            ; store node label in output array
            %index_181 = load i32, i32* %counter
            %output_181 = load i32*, i32** %output
            %output_181_ptr = getelementptr inbounds i32, i32* %output_181, i32 %index_181
            store i32 181, i32* %output_181_ptr

            ; increment counter
            %temp_181_1 = add i32 %index_181, 1
            store i32 %temp_181_1, i32* %counter
        
            ; get directions for node
            %index_dir_181 = load i32, i32* %dir_counter
            %dir_181 = load i32*, i32** %directions
            %dir_181_ptr = getelementptr inbounds i32, i32* %dir_181, i32 %index_dir_181
            %dir_181_value = load i32, i32* %dir_181_ptr

            ; increment directions counter
            %temp_181_2 = add i32 %index_dir_181, 1
            store i32 %temp_181_2, i32* %dir_counter

            ; switch
            switch i32 %dir_181_value, label %171 [ 
             i32 0, label %171
             i32 1, label %33
             i32 2, label %102
             i32 3, label %196
             i32 4, label %182
             i32 5, label %226
            ]

            182: 
            ; store node label in output array
            %index_182 = load i32, i32* %counter
            %output_182 = load i32*, i32** %output
            %output_182_ptr = getelementptr inbounds i32, i32* %output_182, i32 %index_182
            store i32 182, i32* %output_182_ptr

            ; increment counter
            %temp_182_1 = add i32 %index_182, 1
            store i32 %temp_182_1, i32* %counter
        
            ; get directions for node
            %index_dir_182 = load i32, i32* %dir_counter
            %dir_182 = load i32*, i32** %directions
            %dir_182_ptr = getelementptr inbounds i32, i32* %dir_182, i32 %index_dir_182
            %dir_182_value = load i32, i32* %dir_182_ptr

            ; increment directions counter
            %temp_182_2 = add i32 %index_dir_182, 1
            store i32 %temp_182_2, i32* %dir_counter

            ; switch
            switch i32 %dir_182_value, label %7 [ 
             i32 0, label %7
             i32 1, label %189
             i32 2, label %135
             i32 3, label %70
             i32 4, label %24
             i32 5, label %65
             i32 6, label %230
            ]

            183: 
            ; store node label in output array
            %index_183 = load i32, i32* %counter
            %output_183 = load i32*, i32** %output
            %output_183_ptr = getelementptr inbounds i32, i32* %output_183, i32 %index_183
            store i32 183, i32* %output_183_ptr

            ; increment counter
            %temp_183_1 = add i32 %index_183, 1
            store i32 %temp_183_1, i32* %counter
        
            ; get directions for node
            %index_dir_183 = load i32, i32* %dir_counter
            %dir_183 = load i32*, i32** %directions
            %dir_183_ptr = getelementptr inbounds i32, i32* %dir_183, i32 %index_dir_183
            %dir_183_value = load i32, i32* %dir_183_ptr

            ; increment directions counter
            %temp_183_2 = add i32 %index_dir_183, 1
            store i32 %temp_183_2, i32* %dir_counter

            ; switch
            switch i32 %dir_183_value, label %84 [ 
             i32 0, label %84
             i32 1, label %22
             i32 2, label %78
             i32 3, label %9
             i32 4, label %221
             i32 5, label %99
             i32 6, label %15
             i32 7, label %188
             i32 8, label %67
            ]

            184: 
            ; store node label in output array
            %index_184 = load i32, i32* %counter
            %output_184 = load i32*, i32** %output
            %output_184_ptr = getelementptr inbounds i32, i32* %output_184, i32 %index_184
            store i32 184, i32* %output_184_ptr

            ; increment counter
            %temp_184_1 = add i32 %index_184, 1
            store i32 %temp_184_1, i32* %counter
        
            ; get directions for node
            %index_dir_184 = load i32, i32* %dir_counter
            %dir_184 = load i32*, i32** %directions
            %dir_184_ptr = getelementptr inbounds i32, i32* %dir_184, i32 %index_dir_184
            %dir_184_value = load i32, i32* %dir_184_ptr

            ; increment directions counter
            %temp_184_2 = add i32 %index_dir_184, 1
            store i32 %temp_184_2, i32* %dir_counter

            ; switch
            switch i32 %dir_184_value, label %189 [ 
             i32 0, label %189
             i32 1, label %34
             i32 2, label %67
             i32 3, label %204
             i32 4, label %98
            ]

            185: 
            ; store node label in output array
            %index_185 = load i32, i32* %counter
            %output_185 = load i32*, i32** %output
            %output_185_ptr = getelementptr inbounds i32, i32* %output_185, i32 %index_185
            store i32 185, i32* %output_185_ptr

            ; increment counter
            %temp_185_1 = add i32 %index_185, 1
            store i32 %temp_185_1, i32* %counter
        
            ; get directions for node
            %index_dir_185 = load i32, i32* %dir_counter
            %dir_185 = load i32*, i32** %directions
            %dir_185_ptr = getelementptr inbounds i32, i32* %dir_185, i32 %index_dir_185
            %dir_185_value = load i32, i32* %dir_185_ptr

            ; increment directions counter
            %temp_185_2 = add i32 %index_dir_185, 1
            store i32 %temp_185_2, i32* %dir_counter

            ; switch
            switch i32 %dir_185_value, label %30 [ 
             i32 0, label %30
             i32 1, label %220
             i32 2, label %174
             i32 3, label %78
             i32 4, label %25
             i32 5, label %109
             i32 6, label %216
             i32 7, label %63
             i32 8, label %129
            ]

            186: 
            ; store node label in output array
            %index_186 = load i32, i32* %counter
            %output_186 = load i32*, i32** %output
            %output_186_ptr = getelementptr inbounds i32, i32* %output_186, i32 %index_186
            store i32 186, i32* %output_186_ptr

            ; increment counter
            %temp_186_1 = add i32 %index_186, 1
            store i32 %temp_186_1, i32* %counter
        
            ; get directions for node
            %index_dir_186 = load i32, i32* %dir_counter
            %dir_186 = load i32*, i32** %directions
            %dir_186_ptr = getelementptr inbounds i32, i32* %dir_186, i32 %index_dir_186
            %dir_186_value = load i32, i32* %dir_186_ptr

            ; increment directions counter
            %temp_186_2 = add i32 %index_dir_186, 1
            store i32 %temp_186_2, i32* %dir_counter

            ; switch
            switch i32 %dir_186_value, label %53 [ 
             i32 0, label %53
             i32 1, label %85
             i32 2, label %87
             i32 3, label %131
             i32 4, label %201
             i32 5, label %101
             i32 6, label %150
            ]

            187: 
            ; store node label in output array
            %index_187 = load i32, i32* %counter
            %output_187 = load i32*, i32** %output
            %output_187_ptr = getelementptr inbounds i32, i32* %output_187, i32 %index_187
            store i32 187, i32* %output_187_ptr

            ; increment counter
            %temp_187_1 = add i32 %index_187, 1
            store i32 %temp_187_1, i32* %counter
        
            ; get directions for node
            %index_dir_187 = load i32, i32* %dir_counter
            %dir_187 = load i32*, i32** %directions
            %dir_187_ptr = getelementptr inbounds i32, i32* %dir_187, i32 %index_dir_187
            %dir_187_value = load i32, i32* %dir_187_ptr

            ; increment directions counter
            %temp_187_2 = add i32 %index_dir_187, 1
            store i32 %temp_187_2, i32* %dir_counter

            ; switch
            switch i32 %dir_187_value, label %27 [ 
             i32 0, label %27
             i32 1, label %34
             i32 2, label %168
             i32 3, label %209
             i32 4, label %115
             i32 5, label %135
            ]

            188: 
            ; store node label in output array
            %index_188 = load i32, i32* %counter
            %output_188 = load i32*, i32** %output
            %output_188_ptr = getelementptr inbounds i32, i32* %output_188, i32 %index_188
            store i32 188, i32* %output_188_ptr

            ; increment counter
            %temp_188_1 = add i32 %index_188, 1
            store i32 %temp_188_1, i32* %counter
        
            ; get directions for node
            %index_dir_188 = load i32, i32* %dir_counter
            %dir_188 = load i32*, i32** %directions
            %dir_188_ptr = getelementptr inbounds i32, i32* %dir_188, i32 %index_dir_188
            %dir_188_value = load i32, i32* %dir_188_ptr

            ; increment directions counter
            %temp_188_2 = add i32 %index_dir_188, 1
            store i32 %temp_188_2, i32* %dir_counter

            ; switch
            switch i32 %dir_188_value, label %185 [ 
             i32 0, label %185
             i32 1, label %217
             i32 2, label %214
             i32 3, label %149
             i32 4, label %180
             i32 5, label %134
             i32 6, label %138
            ]

            189: 
            ; store node label in output array
            %index_189 = load i32, i32* %counter
            %output_189 = load i32*, i32** %output
            %output_189_ptr = getelementptr inbounds i32, i32* %output_189, i32 %index_189
            store i32 189, i32* %output_189_ptr

            ; increment counter
            %temp_189_1 = add i32 %index_189, 1
            store i32 %temp_189_1, i32* %counter
        
            ; get directions for node
            %index_dir_189 = load i32, i32* %dir_counter
            %dir_189 = load i32*, i32** %directions
            %dir_189_ptr = getelementptr inbounds i32, i32* %dir_189, i32 %index_dir_189
            %dir_189_value = load i32, i32* %dir_189_ptr

            ; increment directions counter
            %temp_189_2 = add i32 %index_dir_189, 1
            store i32 %temp_189_2, i32* %dir_counter

            ; switch
            switch i32 %dir_189_value, label %213 [ 
             i32 0, label %213
             i32 1, label %75
             i32 2, label %191
            ]

            190: 
            ; store node label in output array
            %index_190 = load i32, i32* %counter
            %output_190 = load i32*, i32** %output
            %output_190_ptr = getelementptr inbounds i32, i32* %output_190, i32 %index_190
            store i32 190, i32* %output_190_ptr

            ; increment counter
            %temp_190_1 = add i32 %index_190, 1
            store i32 %temp_190_1, i32* %counter
        
            ; get directions for node
            %index_dir_190 = load i32, i32* %dir_counter
            %dir_190 = load i32*, i32** %directions
            %dir_190_ptr = getelementptr inbounds i32, i32* %dir_190, i32 %index_dir_190
            %dir_190_value = load i32, i32* %dir_190_ptr

            ; increment directions counter
            %temp_190_2 = add i32 %index_dir_190, 1
            store i32 %temp_190_2, i32* %dir_counter

            ; switch
            switch i32 %dir_190_value, label %52 [ 
             i32 0, label %52
             i32 1, label %95
             i32 2, label %100
             i32 3, label %134
            ]

            191: 
            ; store node label in output array
            %index_191 = load i32, i32* %counter
            %output_191 = load i32*, i32** %output
            %output_191_ptr = getelementptr inbounds i32, i32* %output_191, i32 %index_191
            store i32 191, i32* %output_191_ptr

            ; increment counter
            %temp_191_1 = add i32 %index_191, 1
            store i32 %temp_191_1, i32* %counter
        
            ; get directions for node
            %index_dir_191 = load i32, i32* %dir_counter
            %dir_191 = load i32*, i32** %directions
            %dir_191_ptr = getelementptr inbounds i32, i32* %dir_191, i32 %index_dir_191
            %dir_191_value = load i32, i32* %dir_191_ptr

            ; increment directions counter
            %temp_191_2 = add i32 %index_dir_191, 1
            store i32 %temp_191_2, i32* %dir_counter

            ; switch
            switch i32 %dir_191_value, label %25 [ 
             i32 0, label %25
             i32 1, label %105
             i32 2, label %89
             i32 3, label %33
             i32 4, label %148
             i32 5, label %230
            ]

            192: 
            ; store node label in output array
            %index_192 = load i32, i32* %counter
            %output_192 = load i32*, i32** %output
            %output_192_ptr = getelementptr inbounds i32, i32* %output_192, i32 %index_192
            store i32 192, i32* %output_192_ptr

            ; increment counter
            %temp_192_1 = add i32 %index_192, 1
            store i32 %temp_192_1, i32* %counter
        
            ; get directions for node
            %index_dir_192 = load i32, i32* %dir_counter
            %dir_192 = load i32*, i32** %directions
            %dir_192_ptr = getelementptr inbounds i32, i32* %dir_192, i32 %index_dir_192
            %dir_192_value = load i32, i32* %dir_192_ptr

            ; increment directions counter
            %temp_192_2 = add i32 %index_dir_192, 1
            store i32 %temp_192_2, i32* %dir_counter

            ; switch
            switch i32 %dir_192_value, label %12 [ 
             i32 0, label %12
             i32 1, label %77
             i32 2, label %209
            ]

            193: 
            ; store node label in output array
            %index_193 = load i32, i32* %counter
            %output_193 = load i32*, i32** %output
            %output_193_ptr = getelementptr inbounds i32, i32* %output_193, i32 %index_193
            store i32 193, i32* %output_193_ptr

            ; increment counter
            %temp_193_1 = add i32 %index_193, 1
            store i32 %temp_193_1, i32* %counter
        
            ; get directions for node
            %index_dir_193 = load i32, i32* %dir_counter
            %dir_193 = load i32*, i32** %directions
            %dir_193_ptr = getelementptr inbounds i32, i32* %dir_193, i32 %index_dir_193
            %dir_193_value = load i32, i32* %dir_193_ptr

            ; increment directions counter
            %temp_193_2 = add i32 %index_dir_193, 1
            store i32 %temp_193_2, i32* %dir_counter

            ; switch
            switch i32 %dir_193_value, label %167 [ 
             i32 0, label %167
             i32 1, label %137
             i32 2, label %81
             i32 3, label %107
             i32 4, label %77
             i32 5, label %82
             i32 6, label %91
             i32 7, label %70
             i32 8, label %84
            ]

            194: 
            ; store node label in output array
            %index_194 = load i32, i32* %counter
            %output_194 = load i32*, i32** %output
            %output_194_ptr = getelementptr inbounds i32, i32* %output_194, i32 %index_194
            store i32 194, i32* %output_194_ptr

            ; increment counter
            %temp_194_1 = add i32 %index_194, 1
            store i32 %temp_194_1, i32* %counter
        
            ; get directions for node
            %index_dir_194 = load i32, i32* %dir_counter
            %dir_194 = load i32*, i32** %directions
            %dir_194_ptr = getelementptr inbounds i32, i32* %dir_194, i32 %index_dir_194
            %dir_194_value = load i32, i32* %dir_194_ptr

            ; increment directions counter
            %temp_194_2 = add i32 %index_dir_194, 1
            store i32 %temp_194_2, i32* %dir_counter

            ; switch
            switch i32 %dir_194_value, label %192 [ 
             i32 0, label %192
             i32 1, label %134
             i32 2, label %129
             i32 3, label %3
             i32 4, label %135
             i32 5, label %32
             i32 6, label %39
             i32 7, label %82
            ]

            195: 
            ; store node label in output array
            %index_195 = load i32, i32* %counter
            %output_195 = load i32*, i32** %output
            %output_195_ptr = getelementptr inbounds i32, i32* %output_195, i32 %index_195
            store i32 195, i32* %output_195_ptr

            ; increment counter
            %temp_195_1 = add i32 %index_195, 1
            store i32 %temp_195_1, i32* %counter
        
            ; get directions for node
            %index_dir_195 = load i32, i32* %dir_counter
            %dir_195 = load i32*, i32** %directions
            %dir_195_ptr = getelementptr inbounds i32, i32* %dir_195, i32 %index_dir_195
            %dir_195_value = load i32, i32* %dir_195_ptr

            ; increment directions counter
            %temp_195_2 = add i32 %index_dir_195, 1
            store i32 %temp_195_2, i32* %dir_counter

            ; switch
            switch i32 %dir_195_value, label %84 [ 
             i32 0, label %84
             i32 1, label %201
             i32 2, label %147
             i32 3, label %18
             i32 4, label %116
             i32 5, label %72
             i32 6, label %123
            ]

            196: 
            ; store node label in output array
            %index_196 = load i32, i32* %counter
            %output_196 = load i32*, i32** %output
            %output_196_ptr = getelementptr inbounds i32, i32* %output_196, i32 %index_196
            store i32 196, i32* %output_196_ptr

            ; increment counter
            %temp_196_1 = add i32 %index_196, 1
            store i32 %temp_196_1, i32* %counter
        
            ; get directions for node
            %index_dir_196 = load i32, i32* %dir_counter
            %dir_196 = load i32*, i32** %directions
            %dir_196_ptr = getelementptr inbounds i32, i32* %dir_196, i32 %index_dir_196
            %dir_196_value = load i32, i32* %dir_196_ptr

            ; increment directions counter
            %temp_196_2 = add i32 %index_dir_196, 1
            store i32 %temp_196_2, i32* %dir_counter

            ; switch
            switch i32 %dir_196_value, label %94 [ 
             i32 0, label %94
             i32 1, label %190
             i32 2, label %98
             i32 3, label %209
             i32 4, label %228
             i32 5, label %21
             i32 6, label %230
            ]

            197: 
            ; store node label in output array
            %index_197 = load i32, i32* %counter
            %output_197 = load i32*, i32** %output
            %output_197_ptr = getelementptr inbounds i32, i32* %output_197, i32 %index_197
            store i32 197, i32* %output_197_ptr

            ; increment counter
            %temp_197_1 = add i32 %index_197, 1
            store i32 %temp_197_1, i32* %counter
        
            ; get directions for node
            %index_dir_197 = load i32, i32* %dir_counter
            %dir_197 = load i32*, i32** %directions
            %dir_197_ptr = getelementptr inbounds i32, i32* %dir_197, i32 %index_dir_197
            %dir_197_value = load i32, i32* %dir_197_ptr

            ; increment directions counter
            %temp_197_2 = add i32 %index_dir_197, 1
            store i32 %temp_197_2, i32* %dir_counter

            ; switch
            switch i32 %dir_197_value, label %206 [ 
             i32 0, label %206
             i32 1, label %15
             i32 2, label %35
             i32 3, label %13
             i32 4, label %135
             i32 5, label %126
             i32 6, label %148
             i32 7, label %230
            ]

            198: 
            ; store node label in output array
            %index_198 = load i32, i32* %counter
            %output_198 = load i32*, i32** %output
            %output_198_ptr = getelementptr inbounds i32, i32* %output_198, i32 %index_198
            store i32 198, i32* %output_198_ptr

            ; increment counter
            %temp_198_1 = add i32 %index_198, 1
            store i32 %temp_198_1, i32* %counter
        
            ; get directions for node
            %index_dir_198 = load i32, i32* %dir_counter
            %dir_198 = load i32*, i32** %directions
            %dir_198_ptr = getelementptr inbounds i32, i32* %dir_198, i32 %index_dir_198
            %dir_198_value = load i32, i32* %dir_198_ptr

            ; increment directions counter
            %temp_198_2 = add i32 %index_dir_198, 1
            store i32 %temp_198_2, i32* %dir_counter

            ; switch
            switch i32 %dir_198_value, label %65 [ 
             i32 0, label %65
             i32 1, label %201
             i32 2, label %63
             i32 3, label %180
             i32 4, label %147
             i32 5, label %192
             i32 6, label %87
             i32 7, label %93
             i32 8, label %205
            ]

            199: 
            ; store node label in output array
            %index_199 = load i32, i32* %counter
            %output_199 = load i32*, i32** %output
            %output_199_ptr = getelementptr inbounds i32, i32* %output_199, i32 %index_199
            store i32 199, i32* %output_199_ptr

            ; increment counter
            %temp_199_1 = add i32 %index_199, 1
            store i32 %temp_199_1, i32* %counter
        
            ; get directions for node
            %index_dir_199 = load i32, i32* %dir_counter
            %dir_199 = load i32*, i32** %directions
            %dir_199_ptr = getelementptr inbounds i32, i32* %dir_199, i32 %index_dir_199
            %dir_199_value = load i32, i32* %dir_199_ptr

            ; increment directions counter
            %temp_199_2 = add i32 %index_dir_199, 1
            store i32 %temp_199_2, i32* %dir_counter

            ; switch
            switch i32 %dir_199_value, label %95 [ 
             i32 0, label %95
             i32 1, label %104
             i32 2, label %79
             i32 3, label %119
             i32 4, label %154
             i32 5, label %88
             i32 6, label %137
             i32 7, label %130
            ]

            200: 
            ; store node label in output array
            %index_200 = load i32, i32* %counter
            %output_200 = load i32*, i32** %output
            %output_200_ptr = getelementptr inbounds i32, i32* %output_200, i32 %index_200
            store i32 200, i32* %output_200_ptr

            ; increment counter
            %temp_200_1 = add i32 %index_200, 1
            store i32 %temp_200_1, i32* %counter
        
            ; get directions for node
            %index_dir_200 = load i32, i32* %dir_counter
            %dir_200 = load i32*, i32** %directions
            %dir_200_ptr = getelementptr inbounds i32, i32* %dir_200, i32 %index_dir_200
            %dir_200_value = load i32, i32* %dir_200_ptr

            ; increment directions counter
            %temp_200_2 = add i32 %index_dir_200, 1
            store i32 %temp_200_2, i32* %dir_counter

            ; switch
            switch i32 %dir_200_value, label %8 [ 
             i32 0, label %8
             i32 1, label %38
             i32 2, label %65
             i32 3, label %176
            ]

            201: 
            ; store node label in output array
            %index_201 = load i32, i32* %counter
            %output_201 = load i32*, i32** %output
            %output_201_ptr = getelementptr inbounds i32, i32* %output_201, i32 %index_201
            store i32 201, i32* %output_201_ptr

            ; increment counter
            %temp_201_1 = add i32 %index_201, 1
            store i32 %temp_201_1, i32* %counter
        
            ; get directions for node
            %index_dir_201 = load i32, i32* %dir_counter
            %dir_201 = load i32*, i32** %directions
            %dir_201_ptr = getelementptr inbounds i32, i32* %dir_201, i32 %index_dir_201
            %dir_201_value = load i32, i32* %dir_201_ptr

            ; increment directions counter
            %temp_201_2 = add i32 %index_dir_201, 1
            store i32 %temp_201_2, i32* %dir_counter

            ; switch
            switch i32 %dir_201_value, label %145 [ 
             i32 0, label %145
             i32 1, label %35
             i32 2, label %29
             i32 3, label %48
            ]

            202: 
            ; store node label in output array
            %index_202 = load i32, i32* %counter
            %output_202 = load i32*, i32** %output
            %output_202_ptr = getelementptr inbounds i32, i32* %output_202, i32 %index_202
            store i32 202, i32* %output_202_ptr

            ; increment counter
            %temp_202_1 = add i32 %index_202, 1
            store i32 %temp_202_1, i32* %counter
        
            ; get directions for node
            %index_dir_202 = load i32, i32* %dir_counter
            %dir_202 = load i32*, i32** %directions
            %dir_202_ptr = getelementptr inbounds i32, i32* %dir_202, i32 %index_dir_202
            %dir_202_value = load i32, i32* %dir_202_ptr

            ; increment directions counter
            %temp_202_2 = add i32 %index_dir_202, 1
            store i32 %temp_202_2, i32* %dir_counter

            ; switch
            switch i32 %dir_202_value, label %106 [ 
             i32 0, label %106
             i32 1, label %187
             i32 2, label %159
             i32 3, label %13
             i32 4, label %208
             i32 5, label %26
             i32 6, label %140
             i32 7, label %175
             i32 8, label %69
            ]

            203: 
            ; store node label in output array
            %index_203 = load i32, i32* %counter
            %output_203 = load i32*, i32** %output
            %output_203_ptr = getelementptr inbounds i32, i32* %output_203, i32 %index_203
            store i32 203, i32* %output_203_ptr

            ; increment counter
            %temp_203_1 = add i32 %index_203, 1
            store i32 %temp_203_1, i32* %counter
        
            ; get directions for node
            %index_dir_203 = load i32, i32* %dir_counter
            %dir_203 = load i32*, i32** %directions
            %dir_203_ptr = getelementptr inbounds i32, i32* %dir_203, i32 %index_dir_203
            %dir_203_value = load i32, i32* %dir_203_ptr

            ; increment directions counter
            %temp_203_2 = add i32 %index_dir_203, 1
            store i32 %temp_203_2, i32* %dir_counter

            ; switch
            switch i32 %dir_203_value, label %28 [ 
             i32 0, label %28
             i32 1, label %53
             i32 2, label %67
             i32 3, label %18
             i32 4, label %162
             i32 5, label %147
             i32 6, label %135
             i32 7, label %165
            ]

            204: 
            ; store node label in output array
            %index_204 = load i32, i32* %counter
            %output_204 = load i32*, i32** %output
            %output_204_ptr = getelementptr inbounds i32, i32* %output_204, i32 %index_204
            store i32 204, i32* %output_204_ptr

            ; increment counter
            %temp_204_1 = add i32 %index_204, 1
            store i32 %temp_204_1, i32* %counter
        
            ; get directions for node
            %index_dir_204 = load i32, i32* %dir_counter
            %dir_204 = load i32*, i32** %directions
            %dir_204_ptr = getelementptr inbounds i32, i32* %dir_204, i32 %index_dir_204
            %dir_204_value = load i32, i32* %dir_204_ptr

            ; increment directions counter
            %temp_204_2 = add i32 %index_dir_204, 1
            store i32 %temp_204_2, i32* %dir_counter

            ; switch
            switch i32 %dir_204_value, label %219 [ 
             i32 0, label %219
             i32 1, label %19
             i32 2, label %204
            ]

            205: 
            ; store node label in output array
            %index_205 = load i32, i32* %counter
            %output_205 = load i32*, i32** %output
            %output_205_ptr = getelementptr inbounds i32, i32* %output_205, i32 %index_205
            store i32 205, i32* %output_205_ptr

            ; increment counter
            %temp_205_1 = add i32 %index_205, 1
            store i32 %temp_205_1, i32* %counter
        
            ; get directions for node
            %index_dir_205 = load i32, i32* %dir_counter
            %dir_205 = load i32*, i32** %directions
            %dir_205_ptr = getelementptr inbounds i32, i32* %dir_205, i32 %index_dir_205
            %dir_205_value = load i32, i32* %dir_205_ptr

            ; increment directions counter
            %temp_205_2 = add i32 %index_dir_205, 1
            store i32 %temp_205_2, i32* %dir_counter

            ; switch
            switch i32 %dir_205_value, label %56 [ 
             i32 0, label %56
             i32 1, label %165
             i32 2, label %215
             i32 3, label %45
             i32 4, label %131
             i32 5, label %221
             i32 6, label %111
             i32 7, label %6
             i32 8, label %152
            ]

            206: 
            ; store node label in output array
            %index_206 = load i32, i32* %counter
            %output_206 = load i32*, i32** %output
            %output_206_ptr = getelementptr inbounds i32, i32* %output_206, i32 %index_206
            store i32 206, i32* %output_206_ptr

            ; increment counter
            %temp_206_1 = add i32 %index_206, 1
            store i32 %temp_206_1, i32* %counter
        
            ; get directions for node
            %index_dir_206 = load i32, i32* %dir_counter
            %dir_206 = load i32*, i32** %directions
            %dir_206_ptr = getelementptr inbounds i32, i32* %dir_206, i32 %index_dir_206
            %dir_206_value = load i32, i32* %dir_206_ptr

            ; increment directions counter
            %temp_206_2 = add i32 %index_dir_206, 1
            store i32 %temp_206_2, i32* %dir_counter

            ; switch
            switch i32 %dir_206_value, label %217 [ 
             i32 0, label %217
             i32 1, label %125
             i32 2, label %182
             i32 3, label %207
             i32 4, label %73
            ]

            207: 
            ; store node label in output array
            %index_207 = load i32, i32* %counter
            %output_207 = load i32*, i32** %output
            %output_207_ptr = getelementptr inbounds i32, i32* %output_207, i32 %index_207
            store i32 207, i32* %output_207_ptr

            ; increment counter
            %temp_207_1 = add i32 %index_207, 1
            store i32 %temp_207_1, i32* %counter
        
            ; get directions for node
            %index_dir_207 = load i32, i32* %dir_counter
            %dir_207 = load i32*, i32** %directions
            %dir_207_ptr = getelementptr inbounds i32, i32* %dir_207, i32 %index_dir_207
            %dir_207_value = load i32, i32* %dir_207_ptr

            ; increment directions counter
            %temp_207_2 = add i32 %index_dir_207, 1
            store i32 %temp_207_2, i32* %dir_counter

            ; switch
            switch i32 %dir_207_value, label %229 [ 
             i32 0, label %229
             i32 1, label %52
             i32 2, label %154
             i32 3, label %127
            ]

            208: 
            ; store node label in output array
            %index_208 = load i32, i32* %counter
            %output_208 = load i32*, i32** %output
            %output_208_ptr = getelementptr inbounds i32, i32* %output_208, i32 %index_208
            store i32 208, i32* %output_208_ptr

            ; increment counter
            %temp_208_1 = add i32 %index_208, 1
            store i32 %temp_208_1, i32* %counter
        
            ; get directions for node
            %index_dir_208 = load i32, i32* %dir_counter
            %dir_208 = load i32*, i32** %directions
            %dir_208_ptr = getelementptr inbounds i32, i32* %dir_208, i32 %index_dir_208
            %dir_208_value = load i32, i32* %dir_208_ptr

            ; increment directions counter
            %temp_208_2 = add i32 %index_dir_208, 1
            store i32 %temp_208_2, i32* %dir_counter

            ; switch
            switch i32 %dir_208_value, label %229 [ 
             i32 0, label %229
             i32 1, label %61
             i32 2, label %109
             i32 3, label %116
             i32 4, label %173
             i32 5, label %94
             i32 6, label %140
             i32 7, label %49
             i32 8, label %205
             i32 9, label %230
            ]

            209: 
            ; store node label in output array
            %index_209 = load i32, i32* %counter
            %output_209 = load i32*, i32** %output
            %output_209_ptr = getelementptr inbounds i32, i32* %output_209, i32 %index_209
            store i32 209, i32* %output_209_ptr

            ; increment counter
            %temp_209_1 = add i32 %index_209, 1
            store i32 %temp_209_1, i32* %counter
        
            ; get directions for node
            %index_dir_209 = load i32, i32* %dir_counter
            %dir_209 = load i32*, i32** %directions
            %dir_209_ptr = getelementptr inbounds i32, i32* %dir_209, i32 %index_dir_209
            %dir_209_value = load i32, i32* %dir_209_ptr

            ; increment directions counter
            %temp_209_2 = add i32 %index_dir_209, 1
            store i32 %temp_209_2, i32* %dir_counter

            ; switch
            switch i32 %dir_209_value, label %186 [ 
             i32 0, label %186
             i32 1, label %19
             i32 2, label %209
             i32 3, label %216
             i32 4, label %66
             i32 5, label %105
            ]

            210: 
            ; store node label in output array
            %index_210 = load i32, i32* %counter
            %output_210 = load i32*, i32** %output
            %output_210_ptr = getelementptr inbounds i32, i32* %output_210, i32 %index_210
            store i32 210, i32* %output_210_ptr

            ; increment counter
            %temp_210_1 = add i32 %index_210, 1
            store i32 %temp_210_1, i32* %counter
        
            ; get directions for node
            %index_dir_210 = load i32, i32* %dir_counter
            %dir_210 = load i32*, i32** %directions
            %dir_210_ptr = getelementptr inbounds i32, i32* %dir_210, i32 %index_dir_210
            %dir_210_value = load i32, i32* %dir_210_ptr

            ; increment directions counter
            %temp_210_2 = add i32 %index_dir_210, 1
            store i32 %temp_210_2, i32* %dir_counter

            ; switch
            switch i32 %dir_210_value, label %3 [ 
             i32 0, label %3
             i32 1, label %192
             i32 2, label %137
             i32 3, label %198
            ]

            211: 
            ; store node label in output array
            %index_211 = load i32, i32* %counter
            %output_211 = load i32*, i32** %output
            %output_211_ptr = getelementptr inbounds i32, i32* %output_211, i32 %index_211
            store i32 211, i32* %output_211_ptr

            ; increment counter
            %temp_211_1 = add i32 %index_211, 1
            store i32 %temp_211_1, i32* %counter
        
            ; get directions for node
            %index_dir_211 = load i32, i32* %dir_counter
            %dir_211 = load i32*, i32** %directions
            %dir_211_ptr = getelementptr inbounds i32, i32* %dir_211, i32 %index_dir_211
            %dir_211_value = load i32, i32* %dir_211_ptr

            ; increment directions counter
            %temp_211_2 = add i32 %index_dir_211, 1
            store i32 %temp_211_2, i32* %dir_counter

            ; switch
            switch i32 %dir_211_value, label %132 [ 
             i32 0, label %132
             i32 1, label %225
             i32 2, label %125
             i32 3, label %20
             i32 4, label %104
             i32 5, label %158
            ]

            212: 
            ; store node label in output array
            %index_212 = load i32, i32* %counter
            %output_212 = load i32*, i32** %output
            %output_212_ptr = getelementptr inbounds i32, i32* %output_212, i32 %index_212
            store i32 212, i32* %output_212_ptr

            ; increment counter
            %temp_212_1 = add i32 %index_212, 1
            store i32 %temp_212_1, i32* %counter
        
            ; get directions for node
            %index_dir_212 = load i32, i32* %dir_counter
            %dir_212 = load i32*, i32** %directions
            %dir_212_ptr = getelementptr inbounds i32, i32* %dir_212, i32 %index_dir_212
            %dir_212_value = load i32, i32* %dir_212_ptr

            ; increment directions counter
            %temp_212_2 = add i32 %index_dir_212, 1
            store i32 %temp_212_2, i32* %dir_counter

            ; switch
            switch i32 %dir_212_value, label %204 [ 
             i32 0, label %204
             i32 1, label %149
             i32 2, label %150
             i32 3, label %109
             i32 4, label %11
             i32 5, label %91
             i32 6, label %218
            ]

            213: 
            ; store node label in output array
            %index_213 = load i32, i32* %counter
            %output_213 = load i32*, i32** %output
            %output_213_ptr = getelementptr inbounds i32, i32* %output_213, i32 %index_213
            store i32 213, i32* %output_213_ptr

            ; increment counter
            %temp_213_1 = add i32 %index_213, 1
            store i32 %temp_213_1, i32* %counter
        
            ; get directions for node
            %index_dir_213 = load i32, i32* %dir_counter
            %dir_213 = load i32*, i32** %directions
            %dir_213_ptr = getelementptr inbounds i32, i32* %dir_213, i32 %index_dir_213
            %dir_213_value = load i32, i32* %dir_213_ptr

            ; increment directions counter
            %temp_213_2 = add i32 %index_dir_213, 1
            store i32 %temp_213_2, i32* %dir_counter

            ; switch
            switch i32 %dir_213_value, label %2 [ 
             i32 0, label %2
             i32 1, label %49
             i32 2, label %77
             i32 3, label %179
             i32 4, label %177
             i32 5, label %165
            ]

            214: 
            ; store node label in output array
            %index_214 = load i32, i32* %counter
            %output_214 = load i32*, i32** %output
            %output_214_ptr = getelementptr inbounds i32, i32* %output_214, i32 %index_214
            store i32 214, i32* %output_214_ptr

            ; increment counter
            %temp_214_1 = add i32 %index_214, 1
            store i32 %temp_214_1, i32* %counter
        
            ; get directions for node
            %index_dir_214 = load i32, i32* %dir_counter
            %dir_214 = load i32*, i32** %directions
            %dir_214_ptr = getelementptr inbounds i32, i32* %dir_214, i32 %index_dir_214
            %dir_214_value = load i32, i32* %dir_214_ptr

            ; increment directions counter
            %temp_214_2 = add i32 %index_dir_214, 1
            store i32 %temp_214_2, i32* %dir_counter

            ; switch
            switch i32 %dir_214_value, label %139 [ 
             i32 0, label %139
             i32 1, label %31
             i32 2, label %211
            ]

            215: 
            ; store node label in output array
            %index_215 = load i32, i32* %counter
            %output_215 = load i32*, i32** %output
            %output_215_ptr = getelementptr inbounds i32, i32* %output_215, i32 %index_215
            store i32 215, i32* %output_215_ptr

            ; increment counter
            %temp_215_1 = add i32 %index_215, 1
            store i32 %temp_215_1, i32* %counter
        
            ; get directions for node
            %index_dir_215 = load i32, i32* %dir_counter
            %dir_215 = load i32*, i32** %directions
            %dir_215_ptr = getelementptr inbounds i32, i32* %dir_215, i32 %index_dir_215
            %dir_215_value = load i32, i32* %dir_215_ptr

            ; increment directions counter
            %temp_215_2 = add i32 %index_dir_215, 1
            store i32 %temp_215_2, i32* %dir_counter

            ; switch
            switch i32 %dir_215_value, label %132 [ 
             i32 0, label %132
             i32 1, label %228
             i32 2, label %192
             i32 3, label %81
             i32 4, label %199
            ]

            216: 
            ; store node label in output array
            %index_216 = load i32, i32* %counter
            %output_216 = load i32*, i32** %output
            %output_216_ptr = getelementptr inbounds i32, i32* %output_216, i32 %index_216
            store i32 216, i32* %output_216_ptr

            ; increment counter
            %temp_216_1 = add i32 %index_216, 1
            store i32 %temp_216_1, i32* %counter
        
            ; get directions for node
            %index_dir_216 = load i32, i32* %dir_counter
            %dir_216 = load i32*, i32** %directions
            %dir_216_ptr = getelementptr inbounds i32, i32* %dir_216, i32 %index_dir_216
            %dir_216_value = load i32, i32* %dir_216_ptr

            ; increment directions counter
            %temp_216_2 = add i32 %index_dir_216, 1
            store i32 %temp_216_2, i32* %dir_counter

            ; switch
            switch i32 %dir_216_value, label %166 [ 
             i32 0, label %166
             i32 1, label %147
             i32 2, label %142
             i32 3, label %73
             i32 4, label %135
             i32 5, label %106
             i32 6, label %139
            ]

            217: 
            ; store node label in output array
            %index_217 = load i32, i32* %counter
            %output_217 = load i32*, i32** %output
            %output_217_ptr = getelementptr inbounds i32, i32* %output_217, i32 %index_217
            store i32 217, i32* %output_217_ptr

            ; increment counter
            %temp_217_1 = add i32 %index_217, 1
            store i32 %temp_217_1, i32* %counter
        
            ; get directions for node
            %index_dir_217 = load i32, i32* %dir_counter
            %dir_217 = load i32*, i32** %directions
            %dir_217_ptr = getelementptr inbounds i32, i32* %dir_217, i32 %index_dir_217
            %dir_217_value = load i32, i32* %dir_217_ptr

            ; increment directions counter
            %temp_217_2 = add i32 %index_dir_217, 1
            store i32 %temp_217_2, i32* %dir_counter

            ; switch
            switch i32 %dir_217_value, label %133 [ 
             i32 0, label %133
             i32 1, label %105
             i32 2, label %155
             i32 3, label %162
             i32 4, label %149
             i32 5, label %79
             i32 6, label %116
             i32 7, label %78
             i32 8, label %34
             i32 9, label %230
            ]

            218: 
            ; store node label in output array
            %index_218 = load i32, i32* %counter
            %output_218 = load i32*, i32** %output
            %output_218_ptr = getelementptr inbounds i32, i32* %output_218, i32 %index_218
            store i32 218, i32* %output_218_ptr

            ; increment counter
            %temp_218_1 = add i32 %index_218, 1
            store i32 %temp_218_1, i32* %counter
        
            ; get directions for node
            %index_dir_218 = load i32, i32* %dir_counter
            %dir_218 = load i32*, i32** %directions
            %dir_218_ptr = getelementptr inbounds i32, i32* %dir_218, i32 %index_dir_218
            %dir_218_value = load i32, i32* %dir_218_ptr

            ; increment directions counter
            %temp_218_2 = add i32 %index_dir_218, 1
            store i32 %temp_218_2, i32* %dir_counter

            ; switch
            switch i32 %dir_218_value, label %114 [ 
             i32 0, label %114
             i32 1, label %151
             i32 2, label %36
             i32 3, label %141
             i32 4, label %198
             i32 5, label %42
             i32 6, label %65
             i32 7, label %230
            ]

            219: 
            ; store node label in output array
            %index_219 = load i32, i32* %counter
            %output_219 = load i32*, i32** %output
            %output_219_ptr = getelementptr inbounds i32, i32* %output_219, i32 %index_219
            store i32 219, i32* %output_219_ptr

            ; increment counter
            %temp_219_1 = add i32 %index_219, 1
            store i32 %temp_219_1, i32* %counter
        
            ; get directions for node
            %index_dir_219 = load i32, i32* %dir_counter
            %dir_219 = load i32*, i32** %directions
            %dir_219_ptr = getelementptr inbounds i32, i32* %dir_219, i32 %index_dir_219
            %dir_219_value = load i32, i32* %dir_219_ptr

            ; increment directions counter
            %temp_219_2 = add i32 %index_dir_219, 1
            store i32 %temp_219_2, i32* %dir_counter

            ; switch
            switch i32 %dir_219_value, label %3 [ 
             i32 0, label %3
             i32 1, label %109
             i32 2, label %189
             i32 3, label %170
             i32 4, label %145
             i32 5, label %10
             i32 6, label %95
             i32 7, label %108
            ]

            220: 
            ; store node label in output array
            %index_220 = load i32, i32* %counter
            %output_220 = load i32*, i32** %output
            %output_220_ptr = getelementptr inbounds i32, i32* %output_220, i32 %index_220
            store i32 220, i32* %output_220_ptr

            ; increment counter
            %temp_220_1 = add i32 %index_220, 1
            store i32 %temp_220_1, i32* %counter
        
            ; get directions for node
            %index_dir_220 = load i32, i32* %dir_counter
            %dir_220 = load i32*, i32** %directions
            %dir_220_ptr = getelementptr inbounds i32, i32* %dir_220, i32 %index_dir_220
            %dir_220_value = load i32, i32* %dir_220_ptr

            ; increment directions counter
            %temp_220_2 = add i32 %index_dir_220, 1
            store i32 %temp_220_2, i32* %dir_counter

            ; switch
            switch i32 %dir_220_value, label %73 [ 
             i32 0, label %73
             i32 1, label %169
             i32 2, label %193
             i32 3, label %172
             i32 4, label %5
             i32 5, label %24
            ]

            221: 
            ; store node label in output array
            %index_221 = load i32, i32* %counter
            %output_221 = load i32*, i32** %output
            %output_221_ptr = getelementptr inbounds i32, i32* %output_221, i32 %index_221
            store i32 221, i32* %output_221_ptr

            ; increment counter
            %temp_221_1 = add i32 %index_221, 1
            store i32 %temp_221_1, i32* %counter
        
            ; get directions for node
            %index_dir_221 = load i32, i32* %dir_counter
            %dir_221 = load i32*, i32** %directions
            %dir_221_ptr = getelementptr inbounds i32, i32* %dir_221, i32 %index_dir_221
            %dir_221_value = load i32, i32* %dir_221_ptr

            ; increment directions counter
            %temp_221_2 = add i32 %index_dir_221, 1
            store i32 %temp_221_2, i32* %dir_counter

            ; switch
            switch i32 %dir_221_value, label %217 [ 
             i32 0, label %217
             i32 1, label %2
             i32 2, label %99
            ]

            222: 
            ; store node label in output array
            %index_222 = load i32, i32* %counter
            %output_222 = load i32*, i32** %output
            %output_222_ptr = getelementptr inbounds i32, i32* %output_222, i32 %index_222
            store i32 222, i32* %output_222_ptr

            ; increment counter
            %temp_222_1 = add i32 %index_222, 1
            store i32 %temp_222_1, i32* %counter
        
            ; get directions for node
            %index_dir_222 = load i32, i32* %dir_counter
            %dir_222 = load i32*, i32** %directions
            %dir_222_ptr = getelementptr inbounds i32, i32* %dir_222, i32 %index_dir_222
            %dir_222_value = load i32, i32* %dir_222_ptr

            ; increment directions counter
            %temp_222_2 = add i32 %index_dir_222, 1
            store i32 %temp_222_2, i32* %dir_counter

            ; switch
            switch i32 %dir_222_value, label %119 [ 
             i32 0, label %119
             i32 1, label %70
             i32 2, label %204
             i32 3, label %201
             i32 4, label %96
             i32 5, label %230
            ]

            223: 
            ; store node label in output array
            %index_223 = load i32, i32* %counter
            %output_223 = load i32*, i32** %output
            %output_223_ptr = getelementptr inbounds i32, i32* %output_223, i32 %index_223
            store i32 223, i32* %output_223_ptr

            ; increment counter
            %temp_223_1 = add i32 %index_223, 1
            store i32 %temp_223_1, i32* %counter
        
            ; get directions for node
            %index_dir_223 = load i32, i32* %dir_counter
            %dir_223 = load i32*, i32** %directions
            %dir_223_ptr = getelementptr inbounds i32, i32* %dir_223, i32 %index_dir_223
            %dir_223_value = load i32, i32* %dir_223_ptr

            ; increment directions counter
            %temp_223_2 = add i32 %index_dir_223, 1
            store i32 %temp_223_2, i32* %dir_counter

            ; switch
            switch i32 %dir_223_value, label %192 [ 
             i32 0, label %192
             i32 1, label %219
             i32 2, label %124
             i32 3, label %197
             i32 4, label %87
             i32 5, label %100
             i32 6, label %117
             i32 7, label %206
             i32 8, label %230
            ]

            224: 
            ; store node label in output array
            %index_224 = load i32, i32* %counter
            %output_224 = load i32*, i32** %output
            %output_224_ptr = getelementptr inbounds i32, i32* %output_224, i32 %index_224
            store i32 224, i32* %output_224_ptr

            ; increment counter
            %temp_224_1 = add i32 %index_224, 1
            store i32 %temp_224_1, i32* %counter
        
            ; get directions for node
            %index_dir_224 = load i32, i32* %dir_counter
            %dir_224 = load i32*, i32** %directions
            %dir_224_ptr = getelementptr inbounds i32, i32* %dir_224, i32 %index_dir_224
            %dir_224_value = load i32, i32* %dir_224_ptr

            ; increment directions counter
            %temp_224_2 = add i32 %index_dir_224, 1
            store i32 %temp_224_2, i32* %dir_counter

            ; switch
            switch i32 %dir_224_value, label %124 [ 
             i32 0, label %124
             i32 1, label %91
             i32 2, label %38
            ]

            225: 
            ; store node label in output array
            %index_225 = load i32, i32* %counter
            %output_225 = load i32*, i32** %output
            %output_225_ptr = getelementptr inbounds i32, i32* %output_225, i32 %index_225
            store i32 225, i32* %output_225_ptr

            ; increment counter
            %temp_225_1 = add i32 %index_225, 1
            store i32 %temp_225_1, i32* %counter
        
            ; get directions for node
            %index_dir_225 = load i32, i32* %dir_counter
            %dir_225 = load i32*, i32** %directions
            %dir_225_ptr = getelementptr inbounds i32, i32* %dir_225, i32 %index_dir_225
            %dir_225_value = load i32, i32* %dir_225_ptr

            ; increment directions counter
            %temp_225_2 = add i32 %index_dir_225, 1
            store i32 %temp_225_2, i32* %dir_counter

            ; switch
            switch i32 %dir_225_value, label %38 [ 
             i32 0, label %38
             i32 1, label %5
             i32 2, label %45
             i32 3, label %209
             i32 4, label %67
             i32 5, label %95
            ]

            226: 
            ; store node label in output array
            %index_226 = load i32, i32* %counter
            %output_226 = load i32*, i32** %output
            %output_226_ptr = getelementptr inbounds i32, i32* %output_226, i32 %index_226
            store i32 226, i32* %output_226_ptr

            ; increment counter
            %temp_226_1 = add i32 %index_226, 1
            store i32 %temp_226_1, i32* %counter
        
            ; get directions for node
            %index_dir_226 = load i32, i32* %dir_counter
            %dir_226 = load i32*, i32** %directions
            %dir_226_ptr = getelementptr inbounds i32, i32* %dir_226, i32 %index_dir_226
            %dir_226_value = load i32, i32* %dir_226_ptr

            ; increment directions counter
            %temp_226_2 = add i32 %index_dir_226, 1
            store i32 %temp_226_2, i32* %dir_counter

            ; switch
            switch i32 %dir_226_value, label %33 [ 
             i32 0, label %33
             i32 1, label %151
             i32 2, label %202
             i32 3, label %74
             i32 4, label %106
             i32 5, label %67
             i32 6, label %132
             i32 7, label %190
            ]

            227: 
            ; store node label in output array
            %index_227 = load i32, i32* %counter
            %output_227 = load i32*, i32** %output
            %output_227_ptr = getelementptr inbounds i32, i32* %output_227, i32 %index_227
            store i32 227, i32* %output_227_ptr

            ; increment counter
            %temp_227_1 = add i32 %index_227, 1
            store i32 %temp_227_1, i32* %counter
        
            ; get directions for node
            %index_dir_227 = load i32, i32* %dir_counter
            %dir_227 = load i32*, i32** %directions
            %dir_227_ptr = getelementptr inbounds i32, i32* %dir_227, i32 %index_dir_227
            %dir_227_value = load i32, i32* %dir_227_ptr

            ; increment directions counter
            %temp_227_2 = add i32 %index_dir_227, 1
            store i32 %temp_227_2, i32* %dir_counter

            ; switch
            switch i32 %dir_227_value, label %177 [ 
             i32 0, label %177
             i32 1, label %71
             i32 2, label %111
             i32 3, label %86
             i32 4, label %199
             i32 5, label %125
            ]

            228: 
            ; store node label in output array
            %index_228 = load i32, i32* %counter
            %output_228 = load i32*, i32** %output
            %output_228_ptr = getelementptr inbounds i32, i32* %output_228, i32 %index_228
            store i32 228, i32* %output_228_ptr

            ; increment counter
            %temp_228_1 = add i32 %index_228, 1
            store i32 %temp_228_1, i32* %counter
        
            ; get directions for node
            %index_dir_228 = load i32, i32* %dir_counter
            %dir_228 = load i32*, i32** %directions
            %dir_228_ptr = getelementptr inbounds i32, i32* %dir_228, i32 %index_dir_228
            %dir_228_value = load i32, i32* %dir_228_ptr

            ; increment directions counter
            %temp_228_2 = add i32 %index_dir_228, 1
            store i32 %temp_228_2, i32* %dir_counter

            ; switch
            switch i32 %dir_228_value, label %184 [ 
             i32 0, label %184
             i32 1, label %213
             i32 2, label %126
             i32 3, label %103
            ]

            229: 
            ; store node label in output array
            %index_229 = load i32, i32* %counter
            %output_229 = load i32*, i32** %output
            %output_229_ptr = getelementptr inbounds i32, i32* %output_229, i32 %index_229
            store i32 229, i32* %output_229_ptr

            ; increment counter
            %temp_229_1 = add i32 %index_229, 1
            store i32 %temp_229_1, i32* %counter
        
            br label %230
        

            230: 
            ; store node label in output array
            %index_230 = load i32, i32* %counter
            %output_230 = load i32*, i32** %output
            %output_230_ptr = getelementptr inbounds i32, i32* %output_230, i32 %index_230
            store i32 230, i32* %output_230_ptr

            ; increment counter
            %temp_230_1 = add i32 %index_230, 1
            store i32 %temp_230_1, i32* %counter
        
            ret void
        
        }