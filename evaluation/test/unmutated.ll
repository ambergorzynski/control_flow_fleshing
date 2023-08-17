; ModuleID = '/var/folders/_k/zvfswn1x47bcfzckf5pncck80000gn/T/tmpmkvq6cai/__prog.ll'
source_filename = "/var/folders/_k/zvfswn1x47bcfzckf5pncck80000gn/T/tmpmkvq6cai/__prog.ll"

; Function Attrs: nofree norecurse nosync nounwind memory(argmem: readwrite)
define void @_Z7run_cfgPiS_(ptr nocapture readonly %in_directions, ptr nocapture writeonly %in_output) local_unnamed_addr #0 {
  store i32 0, ptr %in_output, align 4
  %dir_0_value = load i32, ptr %in_directions, align 4
  switch i32 %dir_0_value, label %.preheader34.preheader [
    i32 3, label %23
    i32 1, label %.loopexit24
    i32 2, label %.loopexit
  ]

.loopexit30:                                      ; preds = %.preheader28, %5, %.loopexit25, %.loopexit23, %.loopexit24
  %counter.0 = phi i32 [ %temp_6_1, %.loopexit25 ], [ %temp_2_1, %.loopexit24 ], [ %temp_4_1, %.loopexit23 ], [ %temp_3_1, %5 ], [ %temp_8_1, %.preheader28 ]
  %dir_counter.0 = phi i32 [ %temp_6_2, %.loopexit25 ], [ %temp_2_2, %.loopexit24 ], [ %temp_4_2, %.loopexit23 ], [ %temp_3_2, %5 ], [ %temp_8_2, %.preheader28 ]
  %1 = sext i32 %counter.0 to i64
  %output_1_ptr = getelementptr inbounds i32, ptr %in_output, i64 %1
  store i32 1, ptr %output_1_ptr, align 4
  %temp_1_1 = add i32 %counter.0, 1
  %2 = sext i32 %dir_counter.0 to i64
  %dir_1_ptr = getelementptr inbounds i32, ptr %in_directions, i64 %2
  %dir_1_value = load i32, ptr %dir_1_ptr, align 4
  %temp_1_2 = add i32 %dir_counter.0, 1
  switch i32 %dir_1_value, label %.preheader28.preheader [
    i32 4, label %.loopexit24
    i32 1, label %common.ret
    i32 2, label %.loopexit26
    i32 3, label %.loopexit23
  ]

.loopexit24:                                      ; preds = %.preheader28, %.preheader, %.loopexit30, %5, %0
  %counter.1 = phi i32 [ %temp_3_1, %5 ], [ %temp_1_1, %.loopexit30 ], [ %dir_0_value, %0 ], [ %temp_9_1, %.preheader ], [ %temp_8_1, %.preheader28 ]
  %dir_counter.1 = phi i32 [ %temp_3_2, %5 ], [ %temp_1_2, %.loopexit30 ], [ %dir_0_value, %0 ], [ %temp_9_2, %.preheader ], [ %temp_8_2, %.preheader28 ]
  %3 = sext i32 %counter.1 to i64
  %output_2_ptr = getelementptr inbounds i32, ptr %in_output, i64 %3
  store i32 2, ptr %output_2_ptr, align 4
  %temp_2_1 = add i32 %counter.1, 1
  %4 = sext i32 %dir_counter.1 to i64
  %dir_2_ptr = getelementptr inbounds i32, ptr %in_directions, i64 %4
  %dir_2_value = load i32, ptr %dir_2_ptr, align 4
  %temp_2_2 = add i32 %dir_counter.1, 1
  switch i32 %dir_2_value, label %.loopexit30 [
    i32 3, label %.preheader28.preheader
    i32 1, label %.loopexit26
    i32 2, label %.preheader34.preheader
  ]

.preheader28.preheader:                           ; preds = %.preheader34, %.loopexit30, %.loopexit25, %.loopexit24
  %counter.6.ph = phi i32 [ %temp_1_1, %.loopexit30 ], [ %temp_2_1, %.loopexit24 ], [ %temp_6_1, %.loopexit25 ], [ %temp_10_1, %.preheader34 ]
  %dir_counter.6.ph = phi i32 [ %temp_1_2, %.loopexit30 ], [ %temp_2_2, %.loopexit24 ], [ %temp_6_2, %.loopexit25 ], [ %temp_10_2, %.preheader34 ]
  br label %.preheader28

5:                                                ; preds = %.preheader28
  %6 = sext i32 %temp_8_1 to i64
  %output_3_ptr = getelementptr inbounds i32, ptr %in_output, i64 %6
  store i32 3, ptr %output_3_ptr, align 4
  %temp_3_1 = add i32 %counter.6, 2
  %7 = sext i32 %temp_8_2 to i64
  %dir_3_ptr = getelementptr inbounds i32, ptr %in_directions, i64 %7
  %dir_3_value = load i32, ptr %dir_3_ptr, align 4
  %temp_3_2 = add i32 %dir_counter.6, 2
  switch i32 %dir_3_value, label %.loopexit23 [
    i32 4, label %.loopexit30
    i32 1, label %.preheader34.preheader
    i32 2, label %.loopexit24
    i32 3, label %.loopexit25
  ]

.preheader34.preheader:                           ; preds = %0, %.loopexit24, %5
  %counter.8.ph = phi i32 [ 1, %0 ], [ %temp_2_1, %.loopexit24 ], [ %temp_3_1, %5 ]
  %dir_counter.8.ph = phi i32 [ 1, %0 ], [ %temp_2_2, %.loopexit24 ], [ %temp_3_2, %5 ]
  br label %.preheader34

.loopexit23:                                      ; preds = %.preheader, %.loopexit, %.loopexit26, %.loopexit25, %5, %.loopexit30
  %counter.2 = phi i32 [ %temp_3_1, %5 ], [ %temp_1_1, %.loopexit30 ], [ %temp_6_1, %.loopexit25 ], [ %temp_7_1, %.loopexit26 ], [ %temp_5_1, %.loopexit ], [ %temp_9_1, %.preheader ]
  %dir_counter.2 = phi i32 [ %temp_3_2, %5 ], [ %temp_1_2, %.loopexit30 ], [ %temp_6_2, %.loopexit25 ], [ %temp_7_2, %.loopexit26 ], [ %temp_5_2, %.loopexit ], [ %temp_9_2, %.preheader ]
  %8 = sext i32 %counter.2 to i64
  %output_4_ptr = getelementptr inbounds i32, ptr %in_output, i64 %8
  store i32 4, ptr %output_4_ptr, align 4
  %temp_4_1 = add i32 %counter.2, 1
  %9 = sext i32 %dir_counter.2 to i64
  %dir_4_ptr = getelementptr inbounds i32, ptr %in_directions, i64 %9
  %dir_4_value = load i32, ptr %dir_4_ptr, align 4
  %temp_4_2 = add i32 %dir_counter.2, 1
  switch i32 %dir_4_value, label %.loopexit30 [
    i32 2, label %.preheader.preheader
    i32 1, label %common.ret
  ]

.loopexit:                                        ; preds = %.preheader34, %.preheader28, %.preheader, %0
  %counter.3 = phi i32 [ 1, %0 ], [ %temp_9_1, %.preheader ], [ %temp_8_1, %.preheader28 ], [ %temp_10_1, %.preheader34 ]
  %dir_counter.3 = phi i32 [ 1, %0 ], [ %temp_9_2, %.preheader ], [ %temp_8_2, %.preheader28 ], [ %temp_10_2, %.preheader34 ]
  %10 = sext i32 %counter.3 to i64
  %output_5_ptr = getelementptr inbounds i32, ptr %in_output, i64 %10
  store i32 5, ptr %output_5_ptr, align 4
  %temp_5_1 = add i32 %counter.3, 1
  %11 = sext i32 %dir_counter.3 to i64
  %dir_5_ptr = getelementptr inbounds i32, ptr %in_directions, i64 %11
  %dir_5_value = load i32, ptr %dir_5_ptr, align 4
  %temp_5_2 = add i32 %dir_counter.3, 1
  switch i32 %dir_5_value, label %.loopexit26 [
    i32 2, label %.loopexit23
    i32 1, label %common.ret
  ]

.loopexit25:                                      ; preds = %.preheader, %.loopexit26, %5
  %counter.4 = phi i32 [ %temp_7_1, %.loopexit26 ], [ %temp_3_1, %5 ], [ %temp_9_1, %.preheader ]
  %dir_counter.4 = phi i32 [ %temp_7_2, %.loopexit26 ], [ %temp_3_2, %5 ], [ %temp_9_2, %.preheader ]
  %12 = sext i32 %counter.4 to i64
  %output_6_ptr = getelementptr inbounds i32, ptr %in_output, i64 %12
  store i32 6, ptr %output_6_ptr, align 4
  %temp_6_1 = add i32 %counter.4, 1
  %13 = sext i32 %dir_counter.4 to i64
  %dir_6_ptr = getelementptr inbounds i32, ptr %in_directions, i64 %13
  %dir_6_value = load i32, ptr %dir_6_ptr, align 4
  %temp_6_2 = add i32 %dir_counter.4, 1
  switch i32 %dir_6_value, label %.loopexit30 [
    i32 3, label %.preheader28.preheader
    i32 1, label %.preheader.preheader
    i32 2, label %.loopexit23
  ]

.loopexit26:                                      ; preds = %.preheader34, %.preheader28, %.preheader, %.loopexit, %.loopexit24, %.loopexit30
  %counter.5 = phi i32 [ %temp_5_1, %.loopexit ], [ %temp_2_1, %.loopexit24 ], [ %temp_1_1, %.loopexit30 ], [ %temp_9_1, %.preheader ], [ %temp_8_1, %.preheader28 ], [ %temp_10_1, %.preheader34 ]
  %dir_counter.5 = phi i32 [ %temp_5_2, %.loopexit ], [ %temp_2_2, %.loopexit24 ], [ %temp_1_2, %.loopexit30 ], [ %temp_9_2, %.preheader ], [ %temp_8_2, %.preheader28 ], [ %temp_10_2, %.preheader34 ]
  %14 = sext i32 %counter.5 to i64
  %output_7_ptr = getelementptr inbounds i32, ptr %in_output, i64 %14
  store i32 7, ptr %output_7_ptr, align 4
  %temp_7_1 = add i32 %counter.5, 1
  %15 = sext i32 %dir_counter.5 to i64
  %dir_7_ptr = getelementptr inbounds i32, ptr %in_directions, i64 %15
  %dir_7_value = load i32, ptr %dir_7_ptr, align 4
  %temp_7_2 = add i32 %dir_counter.5, 1
  switch i32 %dir_7_value, label %.loopexit25 [
    i32 3, label %23
    i32 1, label %.loopexit23
    i32 2, label %common.ret
  ]

.preheader28:                                     ; preds = %.preheader28.preheader, %.preheader28
  %counter.6 = phi i32 [ %temp_8_1, %.preheader28 ], [ %counter.6.ph, %.preheader28.preheader ]
  %dir_counter.6 = phi i32 [ %temp_8_2, %.preheader28 ], [ %dir_counter.6.ph, %.preheader28.preheader ]
  %16 = sext i32 %counter.6 to i64
  %output_8_ptr = getelementptr inbounds i32, ptr %in_output, i64 %16
  store i32 8, ptr %output_8_ptr, align 4
  %temp_8_1 = add i32 %counter.6, 1
  %17 = sext i32 %dir_counter.6 to i64
  %dir_8_ptr = getelementptr inbounds i32, ptr %in_directions, i64 %17
  %dir_8_value = load i32, ptr %dir_8_ptr, align 4
  %temp_8_2 = add i32 %dir_counter.6, 1
  switch i32 %dir_8_value, label %.preheader28 [
    i32 7, label %5
    i32 1, label %.loopexit
    i32 2, label %.loopexit30
    i32 3, label %.loopexit26
    i32 4, label %.preheader.preheader
    i32 5, label %common.ret
    i32 6, label %.loopexit24
  ]

.preheader.preheader:                             ; preds = %.preheader34, %.preheader28, %.loopexit25, %.loopexit23
  %counter.7.ph = phi i32 [ %temp_4_1, %.loopexit23 ], [ %temp_6_1, %.loopexit25 ], [ %temp_8_1, %.preheader28 ], [ %temp_10_1, %.preheader34 ]
  %dir_counter.7.ph = phi i32 [ %temp_4_2, %.loopexit23 ], [ %temp_6_2, %.loopexit25 ], [ %temp_8_2, %.preheader28 ], [ %temp_10_2, %.preheader34 ]
  br label %.preheader

.preheader:                                       ; preds = %.preheader.preheader, %.preheader
  %counter.7 = phi i32 [ %temp_9_1, %.preheader ], [ %counter.7.ph, %.preheader.preheader ]
  %dir_counter.7 = phi i32 [ %temp_9_2, %.preheader ], [ %dir_counter.7.ph, %.preheader.preheader ]
  %18 = sext i32 %counter.7 to i64
  %output_9_ptr = getelementptr inbounds i32, ptr %in_output, i64 %18
  store i32 9, ptr %output_9_ptr, align 4
  %temp_9_1 = add i32 %counter.7, 1
  %19 = sext i32 %dir_counter.7 to i64
  %dir_9_ptr = getelementptr inbounds i32, ptr %in_directions, i64 %19
  %dir_9_value = load i32, ptr %dir_9_ptr, align 4
  %temp_9_2 = add i32 %dir_counter.7, 1
  switch i32 %dir_9_value, label %.loopexit [
    i32 6, label %.loopexit23
    i32 1, label %.loopexit24
    i32 2, label %.loopexit25
    i32 3, label %.preheader
    i32 4, label %.loopexit26
    i32 5, label %common.ret
  ]

.preheader34:                                     ; preds = %.preheader34.preheader, %.preheader34
  %counter.8 = phi i32 [ %temp_10_1, %.preheader34 ], [ %counter.8.ph, %.preheader34.preheader ]
  %dir_counter.8 = phi i32 [ %temp_10_2, %.preheader34 ], [ %dir_counter.8.ph, %.preheader34.preheader ]
  %20 = sext i32 %counter.8 to i64
  %output_10_ptr = getelementptr inbounds i32, ptr %in_output, i64 %20
  store i32 10, ptr %output_10_ptr, align 4
  %temp_10_1 = add i32 %counter.8, 1
  %21 = sext i32 %dir_counter.8 to i64
  %dir_10_ptr = getelementptr inbounds i32, ptr %in_directions, i64 %21
  %dir_10_value = load i32, ptr %dir_10_ptr, align 4
  %temp_10_2 = add i32 %dir_counter.8, 1
  switch i32 %dir_10_value, label %.loopexit [
    i32 4, label %.loopexit26
    i32 1, label %.preheader34
    i32 2, label %.preheader28.preheader
    i32 3, label %.preheader.preheader
  ]

common.ret:                                       ; preds = %.preheader28, %.preheader, %.loopexit30, %.loopexit23, %.loopexit, %.loopexit26, %23
  %counter.10.sink = phi i32 [ %counter.10, %23 ], [ %temp_4_1, %.loopexit23 ], [ %temp_1_1, %.loopexit30 ], [ %temp_7_1, %.loopexit26 ], [ %temp_5_1, %.loopexit ], [ %temp_9_1, %.preheader ], [ %temp_8_1, %.preheader28 ]
  %.sink = phi i32 [ 12, %23 ], [ 11, %.loopexit23 ], [ 11, %.loopexit30 ], [ 11, %.loopexit26 ], [ 11, %.loopexit ], [ 11, %.preheader ], [ 11, %.preheader28 ]
  %22 = sext i32 %counter.10.sink to i64
  %output_12_ptr = getelementptr inbounds i32, ptr %in_output, i64 %22
  store i32 %.sink, ptr %output_12_ptr, align 4
  ret void

23:                                               ; preds = %.loopexit26, %0
  %counter.10 = phi i32 [ %temp_7_1, %.loopexit26 ], [ 1, %0 ]
  br label %common.ret
}

attributes #0 = { nofree norecurse nosync nounwind memory(argmem: readwrite) }
