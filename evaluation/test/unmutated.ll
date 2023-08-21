; ModuleID = '/var/folders/_k/zvfswn1x47bcfzckf5pncck80000gn/T/tmpifpbm9yw/__prog.ll'
source_filename = "/var/folders/_k/zvfswn1x47bcfzckf5pncck80000gn/T/tmpifpbm9yw/__prog.ll"

define void @_Z7run_cfgPi(ptr %in_output) {
  %output = alloca ptr, align 8
  store ptr %in_output, ptr %output, align 8
  %counter = alloca i32, align 4
  store i32 0, ptr %counter, align 4
  %dir_counter = alloca i32, align 4
  store i32 0, ptr %dir_counter, align 4
  %index_a = alloca i32, align 4
  %dirs = alloca [2 x i32], align 4
  %directions = alloca [2 x i32], align 4
  store i32 0, ptr %index_a, align 4
  %var_0_0 = getelementptr inbounds [2 x i32], ptr %dirs, i64 0, i64 0
  store ptr %var_0_0, ptr %directions, align 8
  %v0_1 = load ptr, ptr %directions, align 8
  %v0_2 = getelementptr inbounds i32, ptr %v0_1, i64 0
  store i32 2, ptr %v0_2, align 4
  %v1_1 = load ptr, ptr %directions, align 8
  %v1_2 = getelementptr inbounds i32, ptr %v1_1, i64 1
  store i32 1, ptr %v1_2, align 4
  %index_0 = load i32, ptr %counter, align 4
  %output_0 = load ptr, ptr %output, align 8
  %output_0_ptr = getelementptr inbounds i32, ptr %output_0, i32 %index_0
  store i32 0, ptr %output_0_ptr, align 4
  %temp_0_1 = add i32 %index_0, 1
  store i32 %temp_0_1, ptr %counter, align 4
  %index_dir_0 = load i32, ptr %dir_counter, align 4
  %dir_0 = load ptr, ptr %directions, align 8
  %dir_0_ptr = getelementptr inbounds i32, ptr %dir_0, i32 %index_dir_0
  %dir_0_value = load i32, ptr %dir_0_ptr, align 4
  %temp_0_2 = add i32 %index_dir_0, 1
  store i32 %temp_0_2, ptr %dir_counter, align 4
  switch i32 %dir_0_value, label %.preheader30 [
    i32 0, label %.preheader30
    i32 1, label %13
    i32 2, label %.preheader26
  ]

.loopexit1:                                       ; preds = %8
  br label %1

.loopexit17:                                      ; preds = %4
  br label %1

.loopexit29:                                      ; preds = %2
  br label %1

1:                                                ; preds = %.loopexit29, %.loopexit17, %.loopexit1, %11, %6, %3
  %index_1 = load i32, ptr %counter, align 4
  %output_1 = load ptr, ptr %output, align 8
  %output_1_ptr = getelementptr inbounds i32, ptr %output_1, i32 %index_1
  store i32 1, ptr %output_1_ptr, align 4
  %temp_1_1 = add i32 %index_1, 1
  store i32 %temp_1_1, ptr %counter, align 4
  %index_dir_1 = load i32, ptr %dir_counter, align 4
  %dir_1 = load ptr, ptr %directions, align 8
  %dir_1_ptr = getelementptr inbounds i32, ptr %dir_1, i32 %index_dir_1
  %dir_1_value = load i32, ptr %dir_1_ptr, align 4
  %temp_1_2 = add i32 %index_dir_1, 1
  store i32 %temp_1_2, ptr %dir_counter, align 4
  switch i32 %dir_1_value, label %.preheader26 [
    i32 0, label %.preheader26
    i32 1, label %.preheader
    i32 2, label %13
  ]

.loopexit5:                                       ; preds = %8
  br label %.preheader26

.loopexit15:                                      ; preds = %4
  br label %.preheader26

.loopexit23:                                      ; preds = %9
  br label %.preheader26

.preheader26:                                     ; preds = %0, %1, %1, %.loopexit5, %.loopexit15, %.loopexit23
  br label %2

2:                                                ; preds = %.preheader26, %2
  %index_2 = load i32, ptr %counter, align 4
  %output_2 = load ptr, ptr %output, align 8
  %output_2_ptr = getelementptr inbounds i32, ptr %output_2, i32 %index_2
  store i32 2, ptr %output_2_ptr, align 4
  %temp_2_1 = add i32 %index_2, 1
  store i32 %temp_2_1, ptr %counter, align 4
  %index_dir_2 = load i32, ptr %dir_counter, align 4
  %dir_2 = load ptr, ptr %directions, align 8
  %dir_2_ptr = getelementptr inbounds i32, ptr %dir_2, i32 %index_dir_2
  %dir_2_value = load i32, ptr %dir_2_ptr, align 4
  %temp_2_2 = add i32 %index_dir_2, 1
  store i32 %temp_2_2, ptr %dir_counter, align 4
  switch i32 %dir_2_value, label %.loopexit27 [
    i32 0, label %.loopexit27
    i32 1, label %.loopexit28
    i32 2, label %.preheader13.loopexit
    i32 3, label %2
    i32 4, label %.preheader.loopexit
    i32 5, label %.loopexit29
  ]

.loopexit6:                                       ; preds = %8
  br label %3

.loopexit10:                                      ; preds = %12
  br label %3

3:                                                ; preds = %.loopexit10, %.loopexit6
  %index_3 = load i32, ptr %counter, align 4
  %output_3 = load ptr, ptr %output, align 8
  %output_3_ptr = getelementptr inbounds i32, ptr %output_3, i32 %index_3
  store i32 3, ptr %output_3_ptr, align 4
  %temp_3_1 = add i32 %index_3, 1
  store i32 %temp_3_1, ptr %counter, align 4
  %index_dir_3 = load i32, ptr %dir_counter, align 4
  %dir_3 = load ptr, ptr %directions, align 8
  %dir_3_ptr = getelementptr inbounds i32, ptr %dir_3, i32 %index_dir_3
  %dir_3_value = load i32, ptr %dir_3_ptr, align 4
  %temp_3_2 = add i32 %index_dir_3, 1
  store i32 %temp_3_2, ptr %dir_counter, align 4
  switch i32 %dir_3_value, label %13 [
    i32 0, label %13
    i32 1, label %1
    i32 2, label %.preheader7
    i32 3, label %.preheader
    i32 4, label %5
  ]

4:                                                ; preds = %.backedge20, %.preheader13
  %index_4 = load i32, ptr %counter, align 4
  %output_4 = load ptr, ptr %output, align 8
  %output_4_ptr = getelementptr inbounds i32, ptr %output_4, i32 %index_4
  store i32 4, ptr %output_4_ptr, align 4
  %temp_4_1 = add i32 %index_4, 1
  store i32 %temp_4_1, ptr %counter, align 4
  %index_dir_4 = load i32, ptr %dir_counter, align 4
  %dir_4 = load ptr, ptr %directions, align 8
  %dir_4_ptr = getelementptr inbounds i32, ptr %dir_4, i32 %index_dir_4
  %dir_4_value = load i32, ptr %dir_4_ptr, align 4
  %temp_4_2 = add i32 %index_dir_4, 1
  store i32 %temp_4_2, ptr %dir_counter, align 4
  switch i32 %dir_4_value, label %.backedge20 [
    i32 0, label %.backedge20
    i32 1, label %.loopexit14
    i32 2, label %.loopexit15
    i32 3, label %.loopexit16
    i32 4, label %.loopexit17
    i32 5, label %.loopexit18
    i32 6, label %.loopexit19
  ]

.backedge20:                                      ; preds = %4, %4
  br label %4

.loopexit:                                        ; preds = %8
  br label %5

.loopexit22:                                      ; preds = %9, %9
  br label %5

.loopexit33:                                      ; preds = %10
  br label %5

5:                                                ; preds = %.loopexit33, %.loopexit22, %.loopexit, %3
  %index_5 = load i32, ptr %counter, align 4
  %output_5 = load ptr, ptr %output, align 8
  %output_5_ptr = getelementptr inbounds i32, ptr %output_5, i32 %index_5
  store i32 5, ptr %output_5_ptr, align 4
  %temp_5_1 = add i32 %index_5, 1
  store i32 %temp_5_1, ptr %counter, align 4
  %index_dir_5 = load i32, ptr %dir_counter, align 4
  %dir_5 = load ptr, ptr %directions, align 8
  %dir_5_ptr = getelementptr inbounds i32, ptr %dir_5, i32 %index_dir_5
  %dir_5_value = load i32, ptr %dir_5_ptr, align 4
  %temp_5_2 = add i32 %index_dir_5, 1
  store i32 %temp_5_2, ptr %dir_counter, align 4
  switch i32 %dir_5_value, label %7 [
    i32 0, label %7
    i32 1, label %11
    i32 2, label %.preheader13
  ]

.loopexit11:                                      ; preds = %12
  br label %6

.loopexit16:                                      ; preds = %4
  br label %6

.loopexit24:                                      ; preds = %9
  br label %6

6:                                                ; preds = %.loopexit24, %.loopexit16, %.loopexit11, %7
  %index_6 = load i32, ptr %counter, align 4
  %output_6 = load ptr, ptr %output, align 8
  %output_6_ptr = getelementptr inbounds i32, ptr %output_6, i32 %index_6
  store i32 6, ptr %output_6_ptr, align 4
  %temp_6_1 = add i32 %index_6, 1
  store i32 %temp_6_1, ptr %counter, align 4
  %index_dir_6 = load i32, ptr %dir_counter, align 4
  %dir_6 = load ptr, ptr %directions, align 8
  %dir_6_ptr = getelementptr inbounds i32, ptr %dir_6, i32 %index_dir_6
  %dir_6_value = load i32, ptr %dir_6_ptr, align 4
  %temp_6_2 = add i32 %index_dir_6, 1
  store i32 %temp_6_2, ptr %dir_counter, align 4
  switch i32 %dir_6_value, label %.preheader7 [
    i32 0, label %.preheader7
    i32 1, label %1
    i32 2, label %.preheader21
    i32 3, label %.preheader13
    i32 4, label %13
    i32 5, label %.preheader
  ]

.loopexit2:                                       ; preds = %8
  br label %7

.loopexit8:                                       ; preds = %12, %12
  br label %7

.loopexit25:                                      ; preds = %9
  br label %7

.loopexit27:                                      ; preds = %2, %2
  br label %7

7:                                                ; preds = %.loopexit27, %.loopexit25, %.loopexit8, %.loopexit2, %5, %5
  %index_7 = load i32, ptr %counter, align 4
  %output_7 = load ptr, ptr %output, align 8
  %output_7_ptr = getelementptr inbounds i32, ptr %output_7, i32 %index_7
  store i32 7, ptr %output_7_ptr, align 4
  %temp_7_1 = add i32 %index_7, 1
  store i32 %temp_7_1, ptr %counter, align 4
  %index_dir_7 = load i32, ptr %dir_counter, align 4
  %dir_7 = load ptr, ptr %directions, align 8
  %dir_7_ptr = getelementptr inbounds i32, ptr %dir_7, i32 %index_dir_7
  %dir_7_value = load i32, ptr %dir_7_ptr, align 4
  %temp_7_2 = add i32 %index_dir_7, 1
  store i32 %temp_7_2, ptr %dir_counter, align 4
  switch i32 %dir_7_value, label %.preheader21 [
    i32 0, label %.preheader21
    i32 1, label %.preheader13
    i32 2, label %6
    i32 3, label %11
  ]

8:                                                ; preds = %.backedge, %.preheader
  %index_8 = load i32, ptr %counter, align 4
  %output_8 = load ptr, ptr %output, align 8
  %output_8_ptr = getelementptr inbounds i32, ptr %output_8, i32 %index_8
  store i32 8, ptr %output_8_ptr, align 4
  %temp_8_1 = add i32 %index_8, 1
  store i32 %temp_8_1, ptr %counter, align 4
  %index_dir_8 = load i32, ptr %dir_counter, align 4
  %dir_8 = load ptr, ptr %directions, align 8
  %dir_8_ptr = getelementptr inbounds i32, ptr %dir_8, i32 %index_dir_8
  %dir_8_value = load i32, ptr %dir_8_ptr, align 4
  %temp_8_2 = add i32 %index_dir_8, 1
  store i32 %temp_8_2, ptr %dir_counter, align 4
  switch i32 %dir_8_value, label %.backedge [
    i32 0, label %.backedge
    i32 1, label %.loopexit
    i32 2, label %.loopexit1
    i32 3, label %.loopexit2
    i32 4, label %.loopexit3
    i32 5, label %.loopexit4
    i32 6, label %.loopexit5
    i32 7, label %.loopexit6
  ]

.backedge:                                        ; preds = %8, %8
  br label %8

.loopexit3:                                       ; preds = %8
  br label %.preheader21

.loopexit12:                                      ; preds = %12
  br label %.preheader21

.loopexit19:                                      ; preds = %4
  br label %.preheader21

.preheader21.loopexit:                            ; preds = %10
  br label %.preheader21

.preheader21:                                     ; preds = %.preheader21.loopexit, %6, %7, %7, %.loopexit3, %.loopexit12, %.loopexit19
  br label %9

9:                                                ; preds = %.preheader21, %9
  %index_9 = load i32, ptr %counter, align 4
  %output_9 = load ptr, ptr %output, align 8
  %output_9_ptr = getelementptr inbounds i32, ptr %output_9, i32 %index_9
  store i32 9, ptr %output_9_ptr, align 4
  %temp_9_1 = add i32 %index_9, 1
  store i32 %temp_9_1, ptr %counter, align 4
  %index_dir_9 = load i32, ptr %dir_counter, align 4
  %dir_9 = load ptr, ptr %directions, align 8
  %dir_9_ptr = getelementptr inbounds i32, ptr %dir_9, i32 %index_dir_9
  %dir_9_value = load i32, ptr %dir_9_ptr, align 4
  %temp_9_2 = add i32 %index_dir_9, 1
  store i32 %temp_9_2, ptr %dir_counter, align 4
  switch i32 %dir_9_value, label %.loopexit22 [
    i32 0, label %.loopexit22
    i32 1, label %.loopexit23
    i32 2, label %.preheader7.loopexit
    i32 3, label %.loopexit24
    i32 4, label %9
    i32 5, label %.loopexit25
  ]

.loopexit14:                                      ; preds = %4
  br label %.preheader30

.preheader30:                                     ; preds = %0, %0, %11, %11, %.loopexit14
  br label %10

10:                                               ; preds = %.preheader30, %10
  %index_10 = load i32, ptr %counter, align 4
  %output_10 = load ptr, ptr %output, align 8
  %output_10_ptr = getelementptr inbounds i32, ptr %output_10, i32 %index_10
  store i32 10, ptr %output_10_ptr, align 4
  %temp_10_1 = add i32 %index_10, 1
  store i32 %temp_10_1, ptr %counter, align 4
  %index_dir_10 = load i32, ptr %dir_counter, align 4
  %dir_10 = load ptr, ptr %directions, align 8
  %dir_10_ptr = getelementptr inbounds i32, ptr %dir_10, i32 %index_dir_10
  %dir_10_value = load i32, ptr %dir_10_ptr, align 4
  %temp_10_2 = add i32 %index_dir_10, 1
  store i32 %temp_10_2, ptr %dir_counter, align 4
  switch i32 %dir_10_value, label %.loopexit31 [
    i32 0, label %.loopexit31
    i32 1, label %.preheader13.loopexit32
    i32 2, label %.loopexit33
    i32 3, label %10
    i32 4, label %.preheader.loopexit34
    i32 5, label %.preheader21.loopexit
    i32 6, label %14
  ]

.loopexit4:                                       ; preds = %8
  br label %11

.loopexit9:                                       ; preds = %12
  br label %11

.loopexit18:                                      ; preds = %4
  br label %11

.loopexit31:                                      ; preds = %10, %10
  br label %11

11:                                               ; preds = %.loopexit31, %.loopexit18, %.loopexit9, %.loopexit4, %7, %5
  %index_11 = load i32, ptr %counter, align 4
  %output_11 = load ptr, ptr %output, align 8
  %output_11_ptr = getelementptr inbounds i32, ptr %output_11, i32 %index_11
  store i32 11, ptr %output_11_ptr, align 4
  %temp_11_1 = add i32 %index_11, 1
  store i32 %temp_11_1, ptr %counter, align 4
  %index_dir_11 = load i32, ptr %dir_counter, align 4
  %dir_11 = load ptr, ptr %directions, align 8
  %dir_11_ptr = getelementptr inbounds i32, ptr %dir_11, i32 %index_dir_11
  %dir_11_value = load i32, ptr %dir_11_ptr, align 4
  %temp_11_2 = add i32 %index_dir_11, 1
  store i32 %temp_11_2, ptr %dir_counter, align 4
  switch i32 %dir_11_value, label %.preheader30 [
    i32 0, label %.preheader30
    i32 1, label %1
    i32 2, label %.preheader
    i32 3, label %.preheader13
    i32 4, label %.preheader7
    i32 5, label %13
  ]

.preheader13.loopexit:                            ; preds = %2
  br label %.preheader13

.preheader13.loopexit32:                          ; preds = %10
  br label %.preheader13

.preheader13:                                     ; preds = %.preheader13.loopexit32, %.preheader13.loopexit, %5, %6, %7, %11
  br label %4

.preheader7.loopexit:                             ; preds = %9
  br label %.preheader7

.preheader7:                                      ; preds = %.preheader7.loopexit, %3, %6, %6, %11
  br label %12

.preheader.loopexit:                              ; preds = %2
  br label %.preheader

.preheader.loopexit34:                            ; preds = %10
  br label %.preheader

.preheader:                                       ; preds = %.preheader.loopexit34, %.preheader.loopexit, %1, %3, %6, %11
  br label %8

12:                                               ; preds = %.preheader7, %12
  %index_12 = load i32, ptr %counter, align 4
  %output_12 = load ptr, ptr %output, align 8
  %output_12_ptr = getelementptr inbounds i32, ptr %output_12, i32 %index_12
  store i32 12, ptr %output_12_ptr, align 4
  %temp_12_1 = add i32 %index_12, 1
  store i32 %temp_12_1, ptr %counter, align 4
  %index_dir_12 = load i32, ptr %dir_counter, align 4
  %dir_12 = load ptr, ptr %directions, align 8
  %dir_12_ptr = getelementptr inbounds i32, ptr %dir_12, i32 %index_dir_12
  %dir_12_value = load i32, ptr %dir_12_ptr, align 4
  %temp_12_2 = add i32 %index_dir_12, 1
  store i32 %temp_12_2, ptr %dir_counter, align 4
  switch i32 %dir_12_value, label %.loopexit8 [
    i32 0, label %.loopexit8
    i32 1, label %.loopexit9
    i32 2, label %.loopexit10
    i32 3, label %.loopexit11
    i32 4, label %.loopexit12
    i32 5, label %12
  ]

.loopexit28:                                      ; preds = %2
  br label %13

13:                                               ; preds = %.loopexit28, %11, %6, %3, %3, %1, %0
  %index_13 = load i32, ptr %counter, align 4
  %output_13 = load ptr, ptr %output, align 8
  %output_13_ptr = getelementptr inbounds i32, ptr %output_13, i32 %index_13
  store i32 13, ptr %output_13_ptr, align 4
  %temp_13_1 = add i32 %index_13, 1
  store i32 %temp_13_1, ptr %counter, align 4
  ret void

14:                                               ; preds = %10
  %index_14 = load i32, ptr %counter, align 4
  %output_14 = load ptr, ptr %output, align 8
  %output_14_ptr = getelementptr inbounds i32, ptr %output_14, i32 %index_14
  store i32 14, ptr %output_14_ptr, align 4
  %temp_14_1 = add i32 %index_14, 1
  store i32 %temp_14_1, ptr %counter, align 4
  ret void
}
