; ModuleID = '/var/folders/_k/zvfswn1x47bcfzckf5pncck80000gn/T/tmphvkgzw1f/__prog.ll'
source_filename = "/var/folders/_k/zvfswn1x47bcfzckf5pncck80000gn/T/tmphvkgzw1f/__prog.ll"

define void @_Z7run_cfgPiS_(ptr %in_directions, ptr %in_output) {
  %directions = alloca ptr, align 8
  %output = alloca ptr, align 8
  store ptr %in_directions, ptr %directions, align 8
  store ptr %in_output, ptr %output, align 8
  %counter = alloca i32, align 4
  store i32 0, ptr %counter, align 4
  %dir_counter = alloca i32, align 4
  store i32 0, ptr %dir_counter, align 4
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
  switch i32 %dir_0_value, label %.preheader [
    i32 0, label %.preheader
    i32 1, label %2
  ]

.preheader:                                       ; preds = %0, %0
  br label %1

1:                                                ; preds = %.preheader, %1
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
  %condition_1 = icmp eq i32 %dir_1_value, 0
  br i1 %condition_1, label %1, label %.loopexit

2:                                                ; preds = %0
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
  br label %3

.loopexit:                                        ; preds = %1
  br label %3

3:                                                ; preds = %.loopexit, %2
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
  ret void
}
