; ModuleID = '/var/folders/_k/zvfswn1x47bcfzckf5pncck80000gn/T/tmp2ytu2uaa/__prog.ll'
source_filename = "/var/folders/_k/zvfswn1x47bcfzckf5pncck80000gn/T/tmp2ytu2uaa/__prog.ll"

; Function Attrs: nofree norecurse nosync nounwind memory(argmem: write)
define void @_Z7run_cfgPi(ptr writeonly %in_output) local_unnamed_addr #0 {
  %dirs = alloca [6 x i32], align 4
  store i32 0, ptr %dirs, align 4
  %v1_1 = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 1
  store i32 2, ptr %v1_1, align 4
  %v2_1 = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 2
  store i32 3, ptr %v2_1, align 4
  %v3_1 = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 3
  store i32 0, ptr %v3_1, align 4
  %v4_1 = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 4
  store i32 0, ptr %v4_1, align 4
  %v5_1 = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 5
  store i32 6, ptr %v5_1, align 4
  store i32 0, ptr %in_output, align 4
  br label %132

1:                                                ; preds = %39, %48, %5
  %counter.0 = phi i32 [ %temp_3_1, %5 ], [ %temp_27_1, %48 ], [ %temp_22_1, %39 ]
  %dir_counter.0 = phi i32 [ %temp_3_2, %5 ], [ %temp_27_2, %48 ], [ %temp_22_2, %39 ]
  %2 = sext i32 %counter.0 to i64
  %output_1_ptr = getelementptr inbounds i32, ptr %in_output, i64 %2
  store i32 1, ptr %output_1_ptr, align 4
  %temp_1_1 = add i32 %counter.0, 1
  %dir_1 = sext i32 %dir_counter.0 to i64
  %dir_1_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_1
  %dir_1_value = load i32, ptr %dir_1_ptr, align 4
  %temp_1_2 = add i32 %dir_counter.0, 1
  switch i32 %dir_1_value, label %59 [
    i32 2, label %116
    i32 1, label %28
  ]

3:                                                ; preds = %182, %162, %140, %127, %89
  %counter.1 = phi i32 [ %temp_70_1, %127 ], [ %temp_49_1, %89 ], [ %temp_78_1, %140 ], [ %temp_90_1, %162 ], [ %temp_101_1, %182 ]
  %dir_counter.1 = phi i32 [ %temp_70_2, %127 ], [ %temp_49_2, %89 ], [ %temp_78_2, %140 ], [ %temp_90_2, %162 ], [ %temp_101_2, %182 ]
  %4 = sext i32 %counter.1 to i64
  %output_2_ptr = getelementptr inbounds i32, ptr %in_output, i64 %4
  store i32 2, ptr %output_2_ptr, align 4
  %temp_2_1 = add i32 %counter.1, 1
  %dir_2 = sext i32 %dir_counter.1 to i64
  %dir_2_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_2
  %dir_2_value = load i32, ptr %dir_2_ptr, align 4
  %temp_2_2 = add i32 %dir_counter.1, 1
  switch i32 %dir_2_value, label %.loopexit244 [
    i32 8, label %.preheader249.preheader
    i32 1, label %111
    i32 2, label %.preheader.preheader
    i32 3, label %89
    i32 4, label %182
    i32 5, label %48
    i32 6, label %23
    i32 7, label %.preheader257.preheader
  ]

.preheader249.preheader:                          ; preds = %8, %12, %.loopexit260, %50, %69, %79, %140, %3
  %counter.3.ph = phi i32 [ %temp_28_1, %50 ], [ %temp_7_1, %12 ], [ %temp_38_1, %69 ], [ %temp_5_1, %8 ], [ %temp_78_1, %140 ], [ %temp_2_1, %3 ], [ %temp_18_1, %.loopexit260 ], [ %temp_44_1, %79 ]
  %dir_counter.3.ph = phi i32 [ %temp_28_2, %50 ], [ %temp_7_2, %12 ], [ %temp_38_2, %69 ], [ %temp_5_2, %8 ], [ %temp_78_2, %140 ], [ %temp_2_2, %3 ], [ %temp_18_2, %.loopexit260 ], [ %temp_44_2, %79 ]
  br label %.preheader249

5:                                                ; preds = %158, %.loopexit250, %162, %100, %98, %.loopexit256, %57, %16
  %counter.2 = phi i32 [ %temp_41_1, %.loopexit256 ], [ %temp_32_1, %57 ], [ %temp_88_1, %158 ], [ %temp_55_1, %100 ], [ %temp_90_1, %162 ], [ %temp_54_1, %98 ], [ %temp_9_1, %16 ], [ %temp_103_1, %.loopexit250 ]
  %dir_counter.2 = phi i32 [ %temp_41_2, %.loopexit256 ], [ %temp_32_2, %57 ], [ %temp_88_2, %158 ], [ %temp_55_2, %100 ], [ %temp_90_2, %162 ], [ %temp_54_2, %98 ], [ %temp_9_2, %16 ], [ %temp_103_2, %.loopexit250 ]
  %6 = sext i32 %counter.2 to i64
  %output_3_ptr = getelementptr inbounds i32, ptr %in_output, i64 %6
  store i32 3, ptr %output_3_ptr, align 4
  %temp_3_1 = add i32 %counter.2, 1
  %dir_3 = sext i32 %dir_counter.2 to i64
  %dir_3_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_3
  %dir_3_value = load i32, ptr %dir_3_ptr, align 4
  %temp_3_2 = add i32 %dir_counter.2, 1
  switch i32 %dir_3_value, label %91 [
    i32 8, label %63
    i32 1, label %102
    i32 2, label %140
    i32 3, label %177
    i32 4, label %.loopexit263
    i32 5, label %1
    i32 6, label %162
    i32 7, label %.loopexit244
  ]

.preheader249:                                    ; preds = %.preheader249.preheader, %.preheader249
  %counter.3 = phi i32 [ %temp_4_1, %.preheader249 ], [ %counter.3.ph, %.preheader249.preheader ]
  %dir_counter.3 = phi i32 [ %temp_4_2, %.preheader249 ], [ %dir_counter.3.ph, %.preheader249.preheader ]
  %7 = sext i32 %counter.3 to i64
  %output_4_ptr = getelementptr inbounds i32, ptr %in_output, i64 %7
  store i32 4, ptr %output_4_ptr, align 4
  %temp_4_1 = add i32 %counter.3, 1
  %dir_4 = sext i32 %dir_counter.3 to i64
  %dir_4_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_4
  %dir_4_value = load i32, ptr %dir_4_ptr, align 4
  %temp_4_2 = add i32 %dir_counter.3, 1
  switch i32 %dir_4_value, label %.loopexit250 [
    i32 7, label %.preheader249
    i32 1, label %.loopexit251
    i32 2, label %.loopexit252
    i32 3, label %common.ret
    i32 4, label %.loopexit254
    i32 5, label %.loopexit255
    i32 6, label %.loopexit256
  ]

8:                                                ; preds = %174, %95, %55, %.loopexit254
  %counter.4 = phi i32 [ %temp_96_1, %174 ], [ %temp_14_1, %.loopexit254 ], [ %temp_31_1, %55 ], [ %temp_52_1, %95 ]
  %dir_counter.4 = phi i32 [ %temp_96_2, %174 ], [ %temp_14_2, %.loopexit254 ], [ %temp_31_2, %55 ], [ %temp_52_2, %95 ]
  %9 = sext i32 %counter.4 to i64
  %output_5_ptr = getelementptr inbounds i32, ptr %in_output, i64 %9
  store i32 5, ptr %output_5_ptr, align 4
  %temp_5_1 = add i32 %counter.4, 1
  %dir_5 = sext i32 %dir_counter.4 to i64
  %dir_5_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_5
  %dir_5_value = load i32, ptr %dir_5_ptr, align 4
  %temp_5_2 = add i32 %dir_counter.4, 1
  switch i32 %dir_5_value, label %.preheader249.preheader [
    i32 2, label %127
    i32 1, label %.preheader.preheader
  ]

10:                                               ; preds = %152, %.loopexit262, %125, %107, %.loopexit260
  %counter.5 = phi i32 [ %temp_18_1, %.loopexit260 ], [ %temp_85_1, %152 ], [ %temp_69_1, %125 ], [ %temp_59_1, %107 ], [ %temp_71_1, %.loopexit262 ]
  %dir_counter.5 = phi i32 [ %temp_18_2, %.loopexit260 ], [ %temp_85_2, %152 ], [ %temp_69_2, %125 ], [ %temp_59_2, %107 ], [ %temp_71_2, %.loopexit262 ]
  %11 = sext i32 %counter.5 to i64
  %output_6_ptr = getelementptr inbounds i32, ptr %in_output, i64 %11
  store i32 6, ptr %output_6_ptr, align 4
  %temp_6_1 = add i32 %counter.5, 1
  %dir_6 = sext i32 %dir_counter.5 to i64
  %dir_6_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_6
  %dir_6_value = load i32, ptr %dir_6_ptr, align 4
  %temp_6_2 = add i32 %dir_counter.5, 1
  switch i32 %dir_6_value, label %common.ret [
    i32 2, label %89
    i32 1, label %203
  ]

12:                                               ; preds = %.loopexit255, %197, %177, %83
  %counter.6 = phi i32 [ %temp_116_1, %.loopexit255 ], [ %temp_98_1, %177 ], [ %temp_46_1, %83 ], [ %temp_110_1, %197 ]
  %dir_counter.6 = phi i32 [ %temp_116_2, %.loopexit255 ], [ %temp_98_2, %177 ], [ %temp_46_2, %83 ], [ %temp_110_2, %197 ]
  %13 = sext i32 %counter.6 to i64
  %output_7_ptr = getelementptr inbounds i32, ptr %in_output, i64 %13
  store i32 7, ptr %output_7_ptr, align 4
  %temp_7_1 = add i32 %counter.6, 1
  %dir_7 = sext i32 %dir_counter.6 to i64
  %dir_7_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_7
  %dir_7_value = load i32, ptr %dir_7_ptr, align 4
  %temp_7_2 = add i32 %dir_counter.6, 1
  switch i32 %dir_7_value, label %50 [
    i32 7, label %104
    i32 1, label %100
    i32 2, label %168
    i32 3, label %.preheader249.preheader
    i32 4, label %123
    i32 5, label %52
    i32 6, label %177
  ]

14:                                               ; preds = %.loopexit250, %81
  %counter.7 = phi i32 [ %temp_103_1, %.loopexit250 ], [ %temp_45_1, %81 ]
  %dir_counter.7 = phi i32 [ %temp_103_2, %.loopexit250 ], [ %temp_45_2, %81 ]
  %15 = sext i32 %counter.7 to i64
  %output_8_ptr = getelementptr inbounds i32, ptr %in_output, i64 %15
  store i32 8, ptr %output_8_ptr, align 4
  %temp_8_1 = add i32 %counter.7, 1
  %dir_8 = sext i32 %dir_counter.7 to i64
  %dir_8_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_8
  %dir_8_value = load i32, ptr %dir_8_ptr, align 4
  %temp_8_2 = add i32 %dir_counter.7, 1
  switch i32 %dir_8_value, label %.loopexit262 [
    i32 4, label %52
    i32 1, label %.loopexit251
    i32 2, label %81
    i32 3, label %156
  ]

16:                                               ; preds = %.loopexit263, %144, %107, %63
  %counter.8 = phi i32 [ %temp_35_1, %63 ], [ %temp_99_1, %.loopexit263 ], [ %temp_80_1, %144 ], [ %temp_59_1, %107 ]
  %dir_counter.8 = phi i32 [ %temp_35_2, %63 ], [ %temp_99_2, %.loopexit263 ], [ %temp_80_2, %144 ], [ %temp_59_2, %107 ]
  %17 = sext i32 %counter.8 to i64
  %output_9_ptr = getelementptr inbounds i32, ptr %in_output, i64 %17
  store i32 9, ptr %output_9_ptr, align 4
  %temp_9_1 = add i32 %counter.8, 1
  %dir_9 = sext i32 %dir_counter.8 to i64
  %dir_9_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_9
  %dir_9_value = load i32, ptr %dir_9_ptr, align 4
  %temp_9_2 = add i32 %dir_counter.8, 1
  switch i32 %dir_9_value, label %107 [
    i32 7, label %130
    i32 1, label %69
    i32 2, label %213
    i32 3, label %5
    i32 4, label %98
    i32 5, label %193
    i32 6, label %211
  ]

18:                                               ; preds = %55, %197, %168, %162, %160, %119, %116, %85
  %counter.9 = phi i32 [ %temp_66_1, %119 ], [ %temp_93_1, %168 ], [ %temp_90_1, %162 ], [ %temp_64_1, %116 ], [ %temp_31_1, %55 ], [ %temp_89_1, %160 ], [ %temp_110_1, %197 ], [ %temp_47_1, %85 ]
  %dir_counter.9 = phi i32 [ %temp_66_2, %119 ], [ %temp_93_2, %168 ], [ %temp_90_2, %162 ], [ %temp_64_2, %116 ], [ %temp_31_2, %55 ], [ %temp_89_2, %160 ], [ %temp_110_2, %197 ], [ %temp_47_2, %85 ]
  %19 = sext i32 %counter.9 to i64
  %output_10_ptr = getelementptr inbounds i32, ptr %in_output, i64 %19
  store i32 10, ptr %output_10_ptr, align 4
  %temp_10_1 = add i32 %counter.9, 1
  %dir_10 = sext i32 %dir_counter.9 to i64
  %dir_10_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_10
  %dir_10_value = load i32, ptr %dir_10_ptr, align 4
  %temp_10_2 = add i32 %dir_counter.9, 1
  switch i32 %dir_10_value, label %23 [
    i32 7, label %174
    i32 1, label %43
    i32 2, label %146
    i32 3, label %168
    i32 4, label %199
    i32 5, label %69
    i32 6, label %28
  ]

20:                                               ; preds = %119, %.loopexit258, %.loopexit247, %107
  %counter.10 = phi i32 [ %temp_114_1, %.loopexit258 ], [ %temp_83_1, %.loopexit247 ], [ %temp_59_1, %107 ], [ %temp_66_1, %119 ]
  %dir_counter.10 = phi i32 [ %temp_114_2, %.loopexit258 ], [ %temp_83_2, %.loopexit247 ], [ %temp_59_2, %107 ], [ %temp_66_2, %119 ]
  %21 = sext i32 %counter.10 to i64
  %output_11_ptr = getelementptr inbounds i32, ptr %in_output, i64 %21
  store i32 11, ptr %output_11_ptr, align 4
  %temp_11_1 = add i32 %counter.10, 1
  %dir_11 = sext i32 %dir_counter.10 to i64
  %dir_11_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_11
  %dir_11_value = load i32, ptr %dir_11_ptr, align 4
  %temp_11_2 = add i32 %dir_counter.10, 1
  switch i32 %dir_11_value, label %206 [
    i32 4, label %.loopexit248
    i32 1, label %168
    i32 2, label %166
    i32 3, label %.loopexit269
  ]

.loopexit:                                        ; preds = %.preheader, %127, %211, %.loopexit267, %158, %.loopexit251, %28
  %counter.11 = phi i32 [ %temp_88_1, %158 ], [ %temp_16_1, %28 ], [ %temp_70_1, %127 ], [ %temp_118_1, %211 ], [ %temp_30_1, %.loopexit251 ], [ %temp_105_1, %.loopexit267 ], [ %temp_84_1, %.preheader ]
  %dir_counter.11 = phi i32 [ %temp_88_2, %158 ], [ %temp_16_2, %28 ], [ %temp_70_2, %127 ], [ %temp_118_2, %211 ], [ %temp_30_2, %.loopexit251 ], [ %temp_105_2, %.loopexit267 ], [ %temp_84_2, %.preheader ]
  %22 = sext i32 %counter.11 to i64
  %output_12_ptr = getelementptr inbounds i32, ptr %in_output, i64 %22
  store i32 12, ptr %output_12_ptr, align 4
  %temp_12_1 = add i32 %counter.11, 1
  %dir_12 = sext i32 %dir_counter.11 to i64
  %dir_12_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_12
  %dir_12_value = load i32, ptr %dir_12_ptr, align 4
  %temp_12_2 = add i32 %dir_counter.11, 1
  switch i32 %dir_12_value, label %.loopexit269 [
    i32 5, label %71
    i32 1, label %191
    i32 2, label %209
    i32 3, label %154
    i32 4, label %45
  ]

23:                                               ; preds = %213, %156, %104, %95, %18, %3
  %counter.12 = phi i32 [ %temp_10_1, %18 ], [ %temp_87_1, %156 ], [ %temp_57_1, %104 ], [ %temp_2_1, %3 ], [ %temp_119_1, %213 ], [ %temp_52_1, %95 ]
  %dir_counter.12 = phi i32 [ %temp_10_2, %18 ], [ %temp_87_2, %156 ], [ %temp_57_2, %104 ], [ %temp_2_2, %3 ], [ %temp_119_2, %213 ], [ %temp_52_2, %95 ]
  %24 = sext i32 %counter.12 to i64
  %output_13_ptr = getelementptr inbounds i32, ptr %in_output, i64 %24
  store i32 13, ptr %output_13_ptr, align 4
  %temp_13_1 = add i32 %counter.12, 1
  %dir_13 = sext i32 %dir_counter.12 to i64
  %dir_13_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_13
  %dir_13_value = load i32, ptr %dir_13_ptr, align 4
  %temp_13_2 = add i32 %dir_counter.12, 1
  switch i32 %dir_13_value, label %.loopexit252 [
    i32 4, label %common.ret
    i32 1, label %203
    i32 2, label %116
    i32 3, label %195
  ]

.loopexit254:                                     ; preds = %.preheader257, %.preheader249, %134, %170, %.loopexit270, %71, %28
  %counter.13 = phi i32 [ %temp_53_1, %.loopexit270 ], [ %temp_16_1, %28 ], [ %temp_94_1, %170 ], [ %temp_39_1, %71 ], [ %temp_74_1, %134 ], [ %temp_4_1, %.preheader249 ], [ %temp_63_1, %.preheader257 ]
  %dir_counter.13 = phi i32 [ %temp_53_2, %.loopexit270 ], [ %temp_16_2, %28 ], [ %temp_94_2, %170 ], [ %temp_39_2, %71 ], [ %temp_74_2, %134 ], [ %temp_4_2, %.preheader249 ], [ %temp_63_2, %.preheader257 ]
  %25 = sext i32 %counter.13 to i64
  %output_14_ptr = getelementptr inbounds i32, ptr %in_output, i64 %25
  store i32 14, ptr %output_14_ptr, align 4
  %temp_14_1 = add i32 %counter.13, 1
  %dir_14 = sext i32 %dir_counter.13 to i64
  %dir_14_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_14
  %dir_14_value = load i32, ptr %dir_14_ptr, align 4
  %temp_14_2 = add i32 %dir_counter.13, 1
  switch i32 %dir_14_value, label %93 [
    i32 7, label %.loopexit246
    i32 1, label %.loopexit252
    i32 2, label %197
    i32 3, label %8
    i32 4, label %113
    i32 5, label %57
    i32 6, label %174
  ]

26:                                               ; preds = %146, %.loopexit262, %.loopexit269, %111, %69, %61
  %counter.14 = phi i32 [ %temp_71_1, %.loopexit262 ], [ %temp_81_1, %146 ], [ %temp_38_1, %69 ], [ %temp_61_1, %111 ], [ %temp_65_1, %.loopexit269 ], [ %temp_34_1, %61 ]
  %dir_counter.14 = phi i32 [ %temp_71_2, %.loopexit262 ], [ %temp_81_2, %146 ], [ %temp_38_2, %69 ], [ %temp_61_2, %111 ], [ %temp_65_2, %.loopexit269 ], [ %temp_34_2, %61 ]
  %27 = sext i32 %counter.14 to i64
  %output_15_ptr = getelementptr inbounds i32, ptr %in_output, i64 %27
  store i32 15, ptr %output_15_ptr, align 4
  %temp_15_1 = add i32 %counter.14, 1
  %dir_15 = sext i32 %dir_counter.14 to i64
  %dir_15_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_15
  %dir_15_value = load i32, ptr %dir_15_ptr, align 4
  %temp_15_2 = add i32 %dir_counter.14, 1
  switch i32 %dir_15_value, label %95 [
    i32 9, label %.loopexit246
    i32 1, label %98
    i32 2, label %154
    i32 3, label %41
    i32 4, label %85
    i32 5, label %.loopexit262
    i32 6, label %203
    i32 7, label %162
    i32 8, label %180
  ]

28:                                               ; preds = %.loopexit258, %18, %1
  %counter.15 = phi i32 [ %temp_1_1, %1 ], [ %temp_114_1, %.loopexit258 ], [ %temp_10_1, %18 ]
  %dir_counter.15 = phi i32 [ %temp_1_2, %1 ], [ %temp_114_2, %.loopexit258 ], [ %temp_10_2, %18 ]
  %29 = sext i32 %counter.15 to i64
  %output_16_ptr = getelementptr inbounds i32, ptr %in_output, i64 %29
  store i32 16, ptr %output_16_ptr, align 4
  %temp_16_1 = add i32 %counter.15, 1
  %dir_16 = sext i32 %dir_counter.15 to i64
  %dir_16_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_16
  %dir_16_value = load i32, ptr %dir_16_ptr, align 4
  %temp_16_2 = add i32 %dir_counter.15, 1
  switch i32 %dir_16_value, label %172 [
    i32 7, label %180
    i32 1, label %87
    i32 2, label %.loopexit
    i32 3, label %104
    i32 4, label %152
    i32 5, label %119
    i32 6, label %.loopexit254
  ]

30:                                               ; preds = %186, %172, %.loopexit269, %83, %43
  %counter.16 = phi i32 [ %temp_104_1, %186 ], [ %temp_24_1, %43 ], [ %temp_65_1, %.loopexit269 ], [ %temp_95_1, %172 ], [ %temp_46_1, %83 ]
  %dir_counter.16 = phi i32 [ %temp_104_2, %186 ], [ %temp_24_2, %43 ], [ %temp_65_2, %.loopexit269 ], [ %temp_95_2, %172 ], [ %temp_46_2, %83 ]
  %31 = sext i32 %counter.16 to i64
  %output_17_ptr = getelementptr inbounds i32, ptr %in_output, i64 %31
  store i32 17, ptr %output_17_ptr, align 4
  %temp_17_1 = add i32 %counter.16, 1
  %dir_17 = sext i32 %dir_counter.16 to i64
  %dir_17_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_17
  %dir_17_value = load i32, ptr %dir_17_ptr, align 4
  %temp_17_2 = add i32 %dir_counter.16, 1
  switch i32 %dir_17_value, label %121 [
    i32 3, label %87
    i32 1, label %193
    i32 2, label %93
  ]

.loopexit260:                                     ; preds = %.preheader257, %.loopexit248, %186, %107, %102
  %counter.17 = phi i32 [ %temp_104_1, %186 ], [ %temp_120_1, %.loopexit248 ], [ %temp_56_1, %102 ], [ %temp_59_1, %107 ], [ %temp_63_1, %.preheader257 ]
  %dir_counter.17 = phi i32 [ %temp_104_2, %186 ], [ %temp_120_2, %.loopexit248 ], [ %temp_56_2, %102 ], [ %temp_59_2, %107 ], [ %temp_63_2, %.preheader257 ]
  %32 = sext i32 %counter.17 to i64
  %output_18_ptr = getelementptr inbounds i32, ptr %in_output, i64 %32
  store i32 18, ptr %output_18_ptr, align 4
  %temp_18_1 = add i32 %counter.17, 1
  %dir_18 = sext i32 %dir_counter.17 to i64
  %dir_18_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_18
  %dir_18_value = load i32, ptr %dir_18_ptr, align 4
  %temp_18_2 = add i32 %dir_counter.17, 1
  switch i32 %dir_18_value, label %170 [
    i32 5, label %164
    i32 1, label %.preheader249.preheader
    i32 2, label %111
    i32 3, label %10
    i32 4, label %73
  ]

33:                                               ; preds = %.loopexit256, %172, %170, %.loopexit269
  %counter.18 = phi i32 [ %temp_41_1, %.loopexit256 ], [ %temp_94_1, %170 ], [ %temp_65_1, %.loopexit269 ], [ %temp_95_1, %172 ]
  %dir_counter.18 = phi i32 [ %temp_41_2, %.loopexit256 ], [ %temp_94_2, %170 ], [ %temp_65_2, %.loopexit269 ], [ %temp_95_2, %172 ]
  %34 = sext i32 %counter.18 to i64
  %output_19_ptr = getelementptr inbounds i32, ptr %in_output, i64 %34
  store i32 19, ptr %output_19_ptr, align 4
  %temp_19_1 = add i32 %counter.18, 1
  %dir_19 = sext i32 %dir_counter.18 to i64
  %dir_19_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_19
  %dir_19_value = load i32, ptr %dir_19_ptr, align 4
  %temp_19_2 = add i32 %dir_counter.18, 1
  switch i32 %dir_19_value, label %142 [
    i32 7, label %.loopexit251
    i32 1, label %.loopexit252
    i32 2, label %.loopexit261
    i32 3, label %93
    i32 4, label %.loopexit247
    i32 5, label %39
    i32 6, label %.loopexit269
  ]

35:                                               ; preds = %206, %170, %164
  %counter.19 = phi i32 [ %temp_94_1, %170 ], [ %temp_91_1, %164 ], [ %temp_115_1, %206 ]
  %dir_counter.19 = phi i32 [ %temp_94_2, %170 ], [ %temp_91_2, %164 ], [ %temp_115_2, %206 ]
  %36 = sext i32 %counter.19 to i64
  %output_20_ptr = getelementptr inbounds i32, ptr %in_output, i64 %36
  store i32 20, ptr %output_20_ptr, align 4
  %temp_20_1 = add i32 %counter.19, 1
  %dir_20 = sext i32 %dir_counter.19 to i64
  %dir_20_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_20
  %dir_20_value = load i32, ptr %dir_20_ptr, align 4
  %temp_20_2 = add i32 %dir_counter.19, 1
  switch i32 %dir_20_value, label %.loopexit263 [
    i32 3, label %.loopexit246
    i32 1, label %.preheader265.preheader
    i32 2, label %127
  ]

37:                                               ; preds = %130, %199, %177, %134, %100, %87, %.loopexit259
  %counter.20 = phi i32 [ %temp_74_1, %134 ], [ %temp_72_1, %130 ], [ %temp_98_1, %177 ], [ %temp_55_1, %100 ], [ %temp_48_1, %87 ], [ %temp_42_1, %.loopexit259 ], [ %temp_111_1, %199 ]
  %dir_counter.20 = phi i32 [ %temp_74_2, %134 ], [ %temp_72_2, %130 ], [ %temp_98_2, %177 ], [ %temp_55_2, %100 ], [ %temp_48_2, %87 ], [ %temp_42_2, %.loopexit259 ], [ %temp_111_2, %199 ]
  %38 = sext i32 %counter.20 to i64
  %output_21_ptr = getelementptr inbounds i32, ptr %in_output, i64 %38
  store i32 21, ptr %output_21_ptr, align 4
  %temp_21_1 = add i32 %counter.20, 1
  %dir_21 = sext i32 %dir_counter.20 to i64
  %dir_21_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_21
  %dir_21_value = load i32, ptr %dir_21_ptr, align 4
  %temp_21_2 = add i32 %dir_counter.20, 1
  switch i32 %dir_21_value, label %.loopexit262 [
    i32 8, label %107
    i32 1, label %.loopexit251
    i32 2, label %95
    i32 3, label %119
    i32 4, label %81
    i32 5, label %195
    i32 6, label %134
    i32 7, label %83
  ]

39:                                               ; preds = %107, %63, %209, %203, %182, %132, %93, %65, %33
  %counter.21 = phi i32 [ %temp_101_1, %182 ], [ %temp_113_1, %203 ], [ %temp_117_1, %209 ], [ %temp_19_1, %33 ], [ %temp_51_1, %93 ], [ %temp_59_1, %107 ], [ %temp_35_1, %63 ], [ %temp_36_1, %65 ], [ %temp_73_1, %132 ]
  %dir_counter.21 = phi i32 [ %temp_101_2, %182 ], [ %temp_113_2, %203 ], [ %temp_117_2, %209 ], [ %temp_19_2, %33 ], [ %temp_51_2, %93 ], [ %temp_59_2, %107 ], [ %temp_35_2, %63 ], [ %temp_36_2, %65 ], [ %temp_73_2, %132 ]
  %40 = sext i32 %counter.21 to i64
  %output_22_ptr = getelementptr inbounds i32, ptr %in_output, i64 %40
  store i32 22, ptr %output_22_ptr, align 4
  %temp_22_1 = add i32 %counter.21, 1
  %dir_22 = sext i32 %dir_counter.21 to i64
  %dir_22_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_22
  %dir_22_value = load i32, ptr %dir_22_ptr, align 4
  %temp_22_2 = add i32 %dir_counter.21, 1
  switch i32 %dir_22_value, label %152 [
    i32 4, label %1
    i32 1, label %.loopexit262
    i32 2, label %140
    i32 3, label %170
  ]

41:                                               ; preds = %168, %206, %189, %.loopexit267, %.loopexit243, %52, %26
  %counter.22 = phi i32 [ %temp_115_1, %206 ], [ %temp_106_1, %189 ], [ %temp_93_1, %168 ], [ %temp_105_1, %.loopexit267 ], [ %temp_29_1, %52 ], [ %temp_97_1, %.loopexit243 ], [ %temp_15_1, %26 ]
  %dir_counter.22 = phi i32 [ %temp_115_2, %206 ], [ %temp_106_2, %189 ], [ %temp_93_2, %168 ], [ %temp_105_2, %.loopexit267 ], [ %temp_29_2, %52 ], [ %temp_97_2, %.loopexit243 ], [ %temp_15_2, %26 ]
  %42 = sext i32 %counter.22 to i64
  %output_23_ptr = getelementptr inbounds i32, ptr %in_output, i64 %42
  store i32 23, ptr %output_23_ptr, align 4
  %temp_23_1 = add i32 %counter.22, 1
  %dir_23 = sext i32 %dir_counter.22 to i64
  %dir_23_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_23
  %dir_23_value = load i32, ptr %dir_23_ptr, align 4
  %temp_23_2 = add i32 %dir_counter.22, 1
  switch i32 %dir_23_value, label %182 [
    i32 6, label %.loopexit246
    i32 1, label %197
    i32 2, label %189
    i32 3, label %.loopexit258
    i32 4, label %common.ret
    i32 5, label %172
  ]

43:                                               ; preds = %148, %154, %18
  %counter.23 = phi i32 [ %temp_86_1, %154 ], [ %temp_82_1, %148 ], [ %temp_10_1, %18 ]
  %dir_counter.23 = phi i32 [ %temp_86_2, %154 ], [ %temp_82_2, %148 ], [ %temp_10_2, %18 ]
  %44 = sext i32 %counter.23 to i64
  %output_24_ptr = getelementptr inbounds i32, ptr %in_output, i64 %44
  store i32 24, ptr %output_24_ptr, align 4
  %temp_24_1 = add i32 %counter.23, 1
  %dir_24 = sext i32 %dir_counter.23 to i64
  %dir_24_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_24
  %dir_24_value = load i32, ptr %dir_24_ptr, align 4
  %temp_24_2 = add i32 %dir_counter.23, 1
  switch i32 %dir_24_value, label %186 [
    i32 6, label %100
    i32 1, label %30
    i32 2, label %121
    i32 3, label %180
    i32 4, label %130
    i32 5, label %48
  ]

45:                                               ; preds = %.loopexit262, %.loopexit270, %71, %.loopexit
  %counter.24 = phi i32 [ %temp_12_1, %.loopexit ], [ %temp_53_1, %.loopexit270 ], [ %temp_39_1, %71 ], [ %temp_71_1, %.loopexit262 ]
  %dir_counter.24 = phi i32 [ %temp_12_2, %.loopexit ], [ %temp_53_2, %.loopexit270 ], [ %temp_39_2, %71 ], [ %temp_71_2, %.loopexit262 ]
  %46 = sext i32 %counter.24 to i64
  %output_25_ptr = getelementptr inbounds i32, ptr %in_output, i64 %46
  store i32 25, ptr %output_25_ptr, align 4
  %temp_25_1 = add i32 %counter.24, 1
  %dir_25 = sext i32 %dir_counter.24 to i64
  %dir_25_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_25
  %dir_25_value = load i32, ptr %dir_25_ptr, align 4
  %temp_25_2 = add i32 %dir_counter.24, 1
  switch i32 %dir_25_value, label %113 [
    i32 2, label %85
    i32 1, label %201
  ]

.preheader265:                                    ; preds = %.preheader265.preheader, %.preheader265
  %counter.25 = phi i32 [ %temp_26_1, %.preheader265 ], [ %counter.25.ph, %.preheader265.preheader ]
  %dir_counter.25 = phi i32 [ %temp_26_2, %.preheader265 ], [ %dir_counter.25.ph, %.preheader265.preheader ]
  %47 = sext i32 %counter.25 to i64
  %output_26_ptr = getelementptr inbounds i32, ptr %in_output, i64 %47
  store i32 26, ptr %output_26_ptr, align 4
  %temp_26_1 = add i32 %counter.25, 1
  %dir_26 = sext i32 %dir_counter.25 to i64
  %dir_26_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_26
  %dir_26_value = load i32, ptr %dir_26_ptr, align 4
  %temp_26_2 = add i32 %dir_counter.25, 1
  switch i32 %dir_26_value, label %.loopexit262 [
    i32 6, label %.loopexit267
    i32 1, label %.preheader265
    i32 2, label %common.ret
    i32 3, label %.loopexit269
    i32 4, label %.loopexit270
    i32 5, label %.preheader257.preheader
  ]

48:                                               ; preds = %199, %.loopexit243, %172, %.loopexit247, %138, %95, %73, %43, %3
  %counter.26 = phi i32 [ %temp_83_1, %.loopexit247 ], [ %temp_77_1, %138 ], [ %temp_40_1, %73 ], [ %temp_2_1, %3 ], [ %temp_24_1, %43 ], [ %temp_95_1, %172 ], [ %temp_111_1, %199 ], [ %temp_97_1, %.loopexit243 ], [ %temp_52_1, %95 ]
  %dir_counter.26 = phi i32 [ %temp_83_2, %.loopexit247 ], [ %temp_77_2, %138 ], [ %temp_40_2, %73 ], [ %temp_2_2, %3 ], [ %temp_24_2, %43 ], [ %temp_95_2, %172 ], [ %temp_111_2, %199 ], [ %temp_97_2, %.loopexit243 ], [ %temp_52_2, %95 ]
  %49 = sext i32 %counter.26 to i64
  %output_27_ptr = getelementptr inbounds i32, ptr %in_output, i64 %49
  store i32 27, ptr %output_27_ptr, align 4
  %temp_27_1 = add i32 %counter.26, 1
  %dir_27 = sext i32 %dir_counter.26 to i64
  %dir_27_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_27
  %dir_27_value = load i32, ptr %dir_27_ptr, align 4
  %temp_27_2 = add i32 %dir_counter.26, 1
  switch i32 %dir_27_value, label %98 [
    i32 4, label %127
    i32 1, label %81
    i32 2, label %1
    i32 3, label %125
  ]

50:                                               ; preds = %91, %206, %146, %109, %104, %83, %12
  %counter.27 = phi i32 [ %temp_81_1, %146 ], [ %temp_57_1, %104 ], [ %temp_7_1, %12 ], [ %temp_115_1, %206 ], [ %temp_60_1, %109 ], [ %temp_50_1, %91 ], [ %temp_46_1, %83 ]
  %dir_counter.27 = phi i32 [ %temp_81_2, %146 ], [ %temp_57_2, %104 ], [ %temp_7_2, %12 ], [ %temp_115_2, %206 ], [ %temp_60_2, %109 ], [ %temp_50_2, %91 ], [ %temp_46_2, %83 ]
  %51 = sext i32 %counter.27 to i64
  %output_28_ptr = getelementptr inbounds i32, ptr %in_output, i64 %51
  store i32 28, ptr %output_28_ptr, align 4
  %temp_28_1 = add i32 %counter.27, 1
  %dir_28 = sext i32 %dir_counter.27 to i64
  %dir_28_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_28
  %dir_28_value = load i32, ptr %dir_28_ptr, align 4
  %temp_28_2 = add i32 %dir_counter.27, 1
  switch i32 %dir_28_value, label %182 [
    i32 6, label %.loopexit250
    i32 1, label %142
    i32 2, label %77
    i32 3, label %107
    i32 4, label %138
    i32 5, label %.preheader249.preheader
  ]

52:                                               ; preds = %14, %197, %193, %158, %119, %79, %77, %.loopexit256, %12
  %counter.28 = phi i32 [ %temp_108_1, %193 ], [ %temp_41_1, %.loopexit256 ], [ %temp_88_1, %158 ], [ %temp_7_1, %12 ], [ %temp_43_1, %77 ], [ %temp_110_1, %197 ], [ %temp_44_1, %79 ], [ %temp_66_1, %119 ], [ %temp_8_1, %14 ]
  %dir_counter.28 = phi i32 [ %temp_108_2, %193 ], [ %temp_41_2, %.loopexit256 ], [ %temp_88_2, %158 ], [ %temp_7_2, %12 ], [ %temp_43_2, %77 ], [ %temp_110_2, %197 ], [ %temp_44_2, %79 ], [ %temp_66_2, %119 ], [ %temp_8_2, %14 ]
  %53 = sext i32 %counter.28 to i64
  %output_29_ptr = getelementptr inbounds i32, ptr %in_output, i64 %53
  store i32 29, ptr %output_29_ptr, align 4
  %temp_29_1 = add i32 %counter.28, 1
  %dir_29 = sext i32 %dir_counter.28 to i64
  %dir_29_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_29
  %dir_29_value = load i32, ptr %dir_29_ptr, align 4
  %temp_29_2 = add i32 %dir_counter.28, 1
  switch i32 %dir_29_value, label %148 [
    i32 3, label %.loopexit261
    i32 1, label %41
    i32 2, label %.loopexit262
  ]

.loopexit251:                                     ; preds = %.preheader249, %33, %.loopexit267, %152, %37, %14
  %counter.29 = phi i32 [ %temp_105_1, %.loopexit267 ], [ %temp_19_1, %33 ], [ %temp_85_1, %152 ], [ %temp_21_1, %37 ], [ %temp_8_1, %14 ], [ %temp_4_1, %.preheader249 ]
  %dir_counter.29 = phi i32 [ %temp_105_2, %.loopexit267 ], [ %temp_19_2, %33 ], [ %temp_85_2, %152 ], [ %temp_21_2, %37 ], [ %temp_8_2, %14 ], [ %temp_4_2, %.preheader249 ]
  %54 = sext i32 %counter.29 to i64
  %output_30_ptr = getelementptr inbounds i32, ptr %in_output, i64 %54
  store i32 30, ptr %output_30_ptr, align 4
  %temp_30_1 = add i32 %counter.29, 1
  %dir_30 = sext i32 %dir_counter.29 to i64
  %dir_30_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_30
  %dir_30_value = load i32, ptr %dir_30_ptr, align 4
  %temp_30_2 = add i32 %dir_counter.29, 1
  switch i32 %dir_30_value, label %199 [
    i32 4, label %.loopexit246
    i32 1, label %.loopexit
    i32 2, label %.loopexit250
    i32 3, label %.loopexit262
  ]

55:                                               ; preds = %193, %107
  %counter.30 = phi i32 [ %temp_59_1, %107 ], [ %temp_108_1, %193 ]
  %dir_counter.30 = phi i32 [ %temp_59_2, %107 ], [ %temp_108_2, %193 ]
  %56 = sext i32 %counter.30 to i64
  %output_31_ptr = getelementptr inbounds i32, ptr %in_output, i64 %56
  store i32 31, ptr %output_31_ptr, align 4
  %temp_31_1 = add i32 %counter.30, 1
  %dir_31 = sext i32 %dir_counter.30 to i64
  %dir_31_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_31
  %dir_31_value = load i32, ptr %dir_31_ptr, align 4
  %temp_31_2 = add i32 %dir_counter.30, 1
  switch i32 %dir_31_value, label %195 [
    i32 8, label %18
    i32 1, label %.loopexit267
    i32 2, label %.loopexit248
    i32 3, label %59
    i32 4, label %8
    i32 5, label %193
    i32 6, label %common.ret
    i32 7, label %156
  ]

57:                                               ; preds = %158, %156, %.loopexit247, %.loopexit254
  %counter.31 = phi i32 [ %temp_87_1, %156 ], [ %temp_88_1, %158 ], [ %temp_14_1, %.loopexit254 ], [ %temp_83_1, %.loopexit247 ]
  %dir_counter.31 = phi i32 [ %temp_87_2, %156 ], [ %temp_88_2, %158 ], [ %temp_14_2, %.loopexit254 ], [ %temp_83_2, %.loopexit247 ]
  %58 = sext i32 %counter.31 to i64
  %output_32_ptr = getelementptr inbounds i32, ptr %in_output, i64 %58
  store i32 32, ptr %output_32_ptr, align 4
  %temp_32_1 = add i32 %counter.31, 1
  %dir_32 = sext i32 %dir_counter.31 to i64
  %dir_32_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_32
  %dir_32_value = load i32, ptr %dir_32_ptr, align 4
  %temp_32_2 = add i32 %dir_counter.31, 1
  switch i32 %dir_32_value, label %201 [
    i32 2, label %.loopexit244
    i32 1, label %5
  ]

59:                                               ; preds = %87, %206, %180, %.loopexit263, %146, %.loopexit252, %65, %55, %1
  %counter.32 = phi i32 [ %temp_36_1, %65 ], [ %temp_99_1, %.loopexit263 ], [ %temp_81_1, %146 ], [ %temp_48_1, %87 ], [ %temp_1_1, %1 ], [ %temp_100_1, %180 ], [ %temp_115_1, %206 ], [ %temp_31_1, %55 ], [ %temp_76_1, %.loopexit252 ]
  %dir_counter.32 = phi i32 [ %temp_36_2, %65 ], [ %temp_99_2, %.loopexit263 ], [ %temp_81_2, %146 ], [ %temp_48_2, %87 ], [ %temp_1_2, %1 ], [ %temp_100_2, %180 ], [ %temp_115_2, %206 ], [ %temp_31_2, %55 ], [ %temp_76_2, %.loopexit252 ]
  %60 = sext i32 %counter.32 to i64
  %output_33_ptr = getelementptr inbounds i32, ptr %in_output, i64 %60
  store i32 33, ptr %output_33_ptr, align 4
  %temp_33_1 = add i32 %counter.32, 1
  %dir_33 = sext i32 %dir_counter.32 to i64
  %dir_33_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_33
  %dir_33_value = load i32, ptr %dir_33_ptr, align 4
  %temp_33_2 = add i32 %dir_counter.32, 1
  %condition_33 = icmp eq i32 %dir_33_value, 0
  br i1 %condition_33, label %.loopexit243, label %65

61:                                               ; preds = %186, %182, %148, %71
  %counter.33 = phi i32 [ %temp_82_1, %148 ], [ %temp_101_1, %182 ], [ %temp_104_1, %186 ], [ %temp_39_1, %71 ]
  %dir_counter.33 = phi i32 [ %temp_82_2, %148 ], [ %temp_101_2, %182 ], [ %temp_104_2, %186 ], [ %temp_39_2, %71 ]
  %62 = sext i32 %counter.33 to i64
  %output_34_ptr = getelementptr inbounds i32, ptr %in_output, i64 %62
  store i32 34, ptr %output_34_ptr, align 4
  %temp_34_1 = add i32 %counter.33, 1
  %dir_34 = sext i32 %dir_counter.33 to i64
  %dir_34_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_34
  %dir_34_value = load i32, ptr %dir_34_ptr, align 4
  %temp_34_2 = add i32 %dir_counter.33, 1
  switch i32 %dir_34_value, label %63 [
    i32 3, label %144
    i32 1, label %26
    i32 2, label %.loopexit250
  ]

63:                                               ; preds = %5, %213, %160, %109, %104, %61
  %counter.34 = phi i32 [ %temp_34_1, %61 ], [ %temp_57_1, %104 ], [ %temp_3_1, %5 ], [ %temp_60_1, %109 ], [ %temp_119_1, %213 ], [ %temp_89_1, %160 ]
  %dir_counter.34 = phi i32 [ %temp_34_2, %61 ], [ %temp_57_2, %104 ], [ %temp_3_2, %5 ], [ %temp_60_2, %109 ], [ %temp_119_2, %213 ], [ %temp_89_2, %160 ]
  %64 = sext i32 %counter.34 to i64
  %output_35_ptr = getelementptr inbounds i32, ptr %in_output, i64 %64
  store i32 35, ptr %output_35_ptr, align 4
  %temp_35_1 = add i32 %counter.34, 1
  %dir_35 = sext i32 %dir_counter.34 to i64
  %dir_35_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_35
  %dir_35_value = load i32, ptr %dir_35_ptr, align 4
  %temp_35_2 = add i32 %dir_counter.34, 1
  switch i32 %dir_35_value, label %81 [
    i32 3, label %39
    i32 1, label %69
    i32 2, label %16
  ]

65:                                               ; preds = %123, %197, %.loopexit267, %59
  %counter.35 = phi i32 [ %temp_110_1, %197 ], [ %temp_105_1, %.loopexit267 ], [ %temp_68_1, %123 ], [ %temp_33_1, %59 ]
  %dir_counter.35 = phi i32 [ %temp_110_2, %197 ], [ %temp_105_2, %.loopexit267 ], [ %temp_68_2, %123 ], [ %temp_33_2, %59 ]
  %66 = sext i32 %counter.35 to i64
  %output_36_ptr = getelementptr inbounds i32, ptr %in_output, i64 %66
  store i32 36, ptr %output_36_ptr, align 4
  %temp_36_1 = add i32 %counter.35, 1
  %dir_36 = sext i32 %dir_counter.35 to i64
  %dir_36_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_36
  %dir_36_value = load i32, ptr %dir_36_ptr, align 4
  %temp_36_2 = add i32 %dir_counter.35, 1
  switch i32 %dir_36_value, label %59 [
    i32 4, label %.loopexit246
    i32 1, label %123
    i32 2, label %39
    i32 3, label %152
  ]

67:                                               ; preds = %100
  %68 = sext i32 %temp_55_1 to i64
  %output_37_ptr = getelementptr inbounds i32, ptr %in_output, i64 %68
  store i32 37, ptr %output_37_ptr, align 4
  %temp_37_1 = add i32 %counter.53, 2
  %dir_37 = sext i32 %temp_55_2 to i64
  %dir_37_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_37
  %dir_37_value = load i32, ptr %dir_37_ptr, align 4
  %temp_37_2 = add i32 %dir_counter.53, 2
  switch i32 %dir_37_value, label %.loopexit247 [
    i32 4, label %162
    i32 1, label %166
    i32 2, label %69
    i32 3, label %107
  ]

69:                                               ; preds = %111, %172, %162, %121, %98, %67, %63, %18, %16
  %counter.36 = phi i32 [ %temp_90_1, %162 ], [ %temp_37_1, %67 ], [ %temp_61_1, %111 ], [ %temp_95_1, %172 ], [ %temp_54_1, %98 ], [ %temp_9_1, %16 ], [ %temp_35_1, %63 ], [ %temp_67_1, %121 ], [ %temp_10_1, %18 ]
  %dir_counter.36 = phi i32 [ %temp_90_2, %162 ], [ %temp_37_2, %67 ], [ %temp_61_2, %111 ], [ %temp_95_2, %172 ], [ %temp_54_2, %98 ], [ %temp_9_2, %16 ], [ %temp_35_2, %63 ], [ %temp_67_2, %121 ], [ %temp_10_2, %18 ]
  %70 = sext i32 %counter.36 to i64
  %output_38_ptr = getelementptr inbounds i32, ptr %in_output, i64 %70
  store i32 38, ptr %output_38_ptr, align 4
  %temp_38_1 = add i32 %counter.36, 1
  %dir_38 = sext i32 %dir_counter.36 to i64
  %dir_38_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_38
  %dir_38_value = load i32, ptr %dir_38_ptr, align 4
  %temp_38_2 = add i32 %dir_counter.36, 1
  switch i32 %dir_38_value, label %116 [
    i32 4, label %73
    i32 1, label %111
    i32 2, label %26
    i32 3, label %.preheader249.preheader
  ]

71:                                               ; preds = %.loopexit, %201, %.loopexit243
  %counter.37 = phi i32 [ %temp_112_1, %201 ], [ %temp_12_1, %.loopexit ], [ %temp_97_1, %.loopexit243 ]
  %dir_counter.37 = phi i32 [ %temp_112_2, %201 ], [ %temp_12_2, %.loopexit ], [ %temp_97_2, %.loopexit243 ]
  %72 = sext i32 %counter.37 to i64
  %output_39_ptr = getelementptr inbounds i32, ptr %in_output, i64 %72
  store i32 39, ptr %output_39_ptr, align 4
  %temp_39_1 = add i32 %counter.37, 1
  %dir_39 = sext i32 %dir_counter.37 to i64
  %dir_39_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_39
  %dir_39_value = load i32, ptr %dir_39_ptr, align 4
  %temp_39_2 = add i32 %dir_counter.37, 1
  switch i32 %dir_39_value, label %79 [
    i32 6, label %.loopexit246
    i32 1, label %98
    i32 2, label %.preheader245.preheader
    i32 3, label %45
    i32 4, label %61
    i32 5, label %.loopexit254
  ]

73:                                               ; preds = %85, %69, %170, %152, %.loopexit247, %83, %.loopexit260
  %counter.38 = phi i32 [ %temp_38_1, %69 ], [ %temp_94_1, %170 ], [ %temp_18_1, %.loopexit260 ], [ %temp_83_1, %.loopexit247 ], [ %temp_85_1, %152 ], [ %temp_46_1, %83 ], [ %temp_47_1, %85 ]
  %dir_counter.38 = phi i32 [ %temp_38_2, %69 ], [ %temp_94_2, %170 ], [ %temp_18_2, %.loopexit260 ], [ %temp_83_2, %.loopexit247 ], [ %temp_85_2, %152 ], [ %temp_46_2, %83 ], [ %temp_47_2, %85 ]
  %74 = sext i32 %counter.38 to i64
  %output_40_ptr = getelementptr inbounds i32, ptr %in_output, i64 %74
  store i32 40, ptr %output_40_ptr, align 4
  %temp_40_1 = add i32 %counter.38, 1
  %dir_40 = sext i32 %dir_counter.38 to i64
  %dir_40_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_40
  %dir_40_value = load i32, ptr %dir_40_ptr, align 4
  %temp_40_2 = add i32 %dir_counter.38, 1
  switch i32 %dir_40_value, label %.loopexit255 [
    i32 4, label %140
    i32 1, label %170
    i32 2, label %119
    i32 3, label %48
  ]

.loopexit256:                                     ; preds = %.preheader249, %.loopexit252, %189, %138, %193, %174, %170, %154, %144, %142
  %counter.39 = phi i32 [ %temp_106_1, %189 ], [ %temp_80_1, %144 ], [ %temp_77_1, %138 ], [ %temp_96_1, %174 ], [ %temp_94_1, %170 ], [ %temp_86_1, %154 ], [ %temp_79_1, %142 ], [ %temp_108_1, %193 ], [ %temp_76_1, %.loopexit252 ], [ %temp_4_1, %.preheader249 ]
  %dir_counter.39 = phi i32 [ %temp_106_2, %189 ], [ %temp_80_2, %144 ], [ %temp_77_2, %138 ], [ %temp_96_2, %174 ], [ %temp_94_2, %170 ], [ %temp_86_2, %154 ], [ %temp_79_2, %142 ], [ %temp_108_2, %193 ], [ %temp_76_2, %.loopexit252 ], [ %temp_4_2, %.preheader249 ]
  %75 = sext i32 %counter.39 to i64
  %output_41_ptr = getelementptr inbounds i32, ptr %in_output, i64 %75
  store i32 41, ptr %output_41_ptr, align 4
  %temp_41_1 = add i32 %counter.39, 1
  %dir_41 = sext i32 %dir_counter.39 to i64
  %dir_41_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_41
  %dir_41_value = load i32, ptr %dir_41_ptr, align 4
  %temp_41_2 = add i32 %dir_counter.39, 1
  switch i32 %dir_41_value, label %.loopexit267 [
    i32 4, label %33
    i32 1, label %5
    i32 2, label %52
    i32 3, label %93
  ]

.loopexit259:                                     ; preds = %.preheader257, %98, %81
  %counter.40 = phi i32 [ %temp_54_1, %98 ], [ %temp_45_1, %81 ], [ %temp_63_1, %.preheader257 ]
  %dir_counter.40 = phi i32 [ %temp_54_2, %98 ], [ %temp_45_2, %81 ], [ %temp_63_2, %.preheader257 ]
  %76 = sext i32 %counter.40 to i64
  %output_42_ptr = getelementptr inbounds i32, ptr %in_output, i64 %76
  store i32 42, ptr %output_42_ptr, align 4
  %temp_42_1 = add i32 %counter.40, 1
  %dir_42 = sext i32 %dir_counter.40 to i64
  %dir_42_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_42
  %dir_42_value = load i32, ptr %dir_42_ptr, align 4
  %temp_42_2 = add i32 %dir_counter.40, 1
  switch i32 %dir_42_value, label %168 [
    i32 2, label %.loopexit244
    i32 1, label %37
  ]

77:                                               ; preds = %156, %109, %50
  %counter.41 = phi i32 [ %temp_87_1, %156 ], [ %temp_28_1, %50 ], [ %temp_60_1, %109 ]
  %dir_counter.41 = phi i32 [ %temp_87_2, %156 ], [ %temp_28_2, %50 ], [ %temp_60_2, %109 ]
  %78 = sext i32 %counter.41 to i64
  %output_43_ptr = getelementptr inbounds i32, ptr %in_output, i64 %78
  store i32 43, ptr %output_43_ptr, align 4
  %temp_43_1 = add i32 %counter.41, 1
  %dir_43 = sext i32 %dir_counter.41 to i64
  %dir_43_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_43
  %dir_43_value = load i32, ptr %dir_43_ptr, align 4
  %temp_43_2 = add i32 %dir_counter.41, 1
  switch i32 %dir_43_value, label %.loopexit269 [
    i32 7, label %.loopexit250
    i32 1, label %156
    i32 2, label %100
    i32 3, label %127
    i32 4, label %191
    i32 5, label %52
    i32 6, label %146
  ]

79:                                               ; preds = %102, %195, %182, %152, %.loopexit269, %111, %71
  %counter.42 = phi i32 [ %temp_39_1, %71 ], [ %temp_109_1, %195 ], [ %temp_56_1, %102 ], [ %temp_61_1, %111 ], [ %temp_65_1, %.loopexit269 ], [ %temp_85_1, %152 ], [ %temp_101_1, %182 ]
  %dir_counter.42 = phi i32 [ %temp_39_2, %71 ], [ %temp_109_2, %195 ], [ %temp_56_2, %102 ], [ %temp_61_2, %111 ], [ %temp_65_2, %.loopexit269 ], [ %temp_85_2, %152 ], [ %temp_101_2, %182 ]
  %80 = sext i32 %counter.42 to i64
  %output_44_ptr = getelementptr inbounds i32, ptr %in_output, i64 %80
  store i32 44, ptr %output_44_ptr, align 4
  %temp_44_1 = add i32 %counter.42, 1
  %dir_44 = sext i32 %dir_counter.42 to i64
  %dir_44_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_44
  %dir_44_value = load i32, ptr %dir_44_ptr, align 4
  %temp_44_2 = add i32 %dir_counter.42, 1
  switch i32 %dir_44_value, label %121 [
    i32 7, label %156
    i32 1, label %.loopexit244
    i32 2, label %52
    i32 3, label %123
    i32 4, label %.preheader.preheader
    i32 5, label %.preheader249.preheader
    i32 6, label %93
  ]

81:                                               ; preds = %209, %.loopexit244, %95, %63, %48, %37, %14
  %counter.43 = phi i32 [ %temp_58_1, %.loopexit244 ], [ %temp_35_1, %63 ], [ %temp_117_1, %209 ], [ %temp_27_1, %48 ], [ %temp_52_1, %95 ], [ %temp_21_1, %37 ], [ %temp_8_1, %14 ]
  %dir_counter.43 = phi i32 [ %temp_58_2, %.loopexit244 ], [ %temp_35_2, %63 ], [ %temp_117_2, %209 ], [ %temp_27_2, %48 ], [ %temp_52_2, %95 ], [ %temp_21_2, %37 ], [ %temp_8_2, %14 ]
  %82 = sext i32 %counter.43 to i64
  %output_45_ptr = getelementptr inbounds i32, ptr %in_output, i64 %82
  store i32 45, ptr %output_45_ptr, align 4
  %temp_45_1 = add i32 %counter.43, 1
  %dir_45 = sext i32 %dir_counter.43 to i64
  %dir_45_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_45
  %dir_45_value = load i32, ptr %dir_45_ptr, align 4
  %temp_45_2 = add i32 %dir_counter.43, 1
  switch i32 %dir_45_value, label %.loopexit250 [
    i32 6, label %172
    i32 1, label %.loopexit259
    i32 2, label %152
    i32 3, label %146
    i32 4, label %100
    i32 5, label %14
  ]

83:                                               ; preds = %.loopexit250, %148, %37
  %counter.44 = phi i32 [ %temp_82_1, %148 ], [ %temp_21_1, %37 ], [ %temp_103_1, %.loopexit250 ]
  %dir_counter.44 = phi i32 [ %temp_82_2, %148 ], [ %temp_21_2, %37 ], [ %temp_103_2, %.loopexit250 ]
  %84 = sext i32 %counter.44 to i64
  %output_46_ptr = getelementptr inbounds i32, ptr %in_output, i64 %84
  store i32 46, ptr %output_46_ptr, align 4
  %temp_46_1 = add i32 %counter.44, 1
  %dir_46 = sext i32 %dir_counter.44 to i64
  %dir_46_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_46
  %dir_46_value = load i32, ptr %dir_46_ptr, align 4
  %temp_46_2 = add i32 %dir_counter.44, 1
  switch i32 %dir_46_value, label %30 [
    i32 5, label %.loopexit246
    i32 1, label %50
    i32 2, label %203
    i32 3, label %12
    i32 4, label %73
  ]

85:                                               ; preds = %45, %.loopexit247, %121, %26
  %counter.45 = phi i32 [ %temp_67_1, %121 ], [ %temp_25_1, %45 ], [ %temp_83_1, %.loopexit247 ], [ %temp_15_1, %26 ]
  %dir_counter.45 = phi i32 [ %temp_67_2, %121 ], [ %temp_25_2, %45 ], [ %temp_83_2, %.loopexit247 ], [ %temp_15_2, %26 ]
  %86 = sext i32 %counter.45 to i64
  %output_47_ptr = getelementptr inbounds i32, ptr %in_output, i64 %86
  store i32 47, ptr %output_47_ptr, align 4
  %temp_47_1 = add i32 %counter.45, 1
  %dir_47 = sext i32 %dir_counter.45 to i64
  %dir_47_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_47
  %dir_47_value = load i32, ptr %dir_47_ptr, align 4
  %temp_47_2 = add i32 %dir_counter.45, 1
  switch i32 %dir_47_value, label %197 [
    i32 2, label %73
    i32 1, label %18
  ]

87:                                               ; preds = %30, %199, %111, %28
  %counter.46 = phi i32 [ %temp_61_1, %111 ], [ %temp_16_1, %28 ], [ %temp_17_1, %30 ], [ %temp_111_1, %199 ]
  %dir_counter.46 = phi i32 [ %temp_61_2, %111 ], [ %temp_16_2, %28 ], [ %temp_17_2, %30 ], [ %temp_111_2, %199 ]
  %88 = sext i32 %counter.46 to i64
  %output_48_ptr = getelementptr inbounds i32, ptr %in_output, i64 %88
  store i32 48, ptr %output_48_ptr, align 4
  %temp_48_1 = add i32 %counter.46, 1
  %dir_48 = sext i32 %dir_counter.46 to i64
  %dir_48_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_48
  %dir_48_value = load i32, ptr %dir_48_ptr, align 4
  %temp_48_2 = add i32 %dir_counter.46, 1
  switch i32 %dir_48_value, label %174 [
    i32 4, label %59
    i32 1, label %37
    i32 2, label %98
    i32 3, label %.backedge
  ]

.backedge:                                        ; preds = %87, %102, %119, %121, %.loopexit267
  %counter.70.be = phi i32 [ %temp_56_1, %102 ], [ %temp_48_1, %87 ], [ %temp_105_1, %.loopexit267 ], [ %temp_67_1, %121 ], [ %temp_66_1, %119 ]
  %dir_counter.70.be = phi i32 [ %temp_56_2, %102 ], [ %temp_48_2, %87 ], [ %temp_105_2, %.loopexit267 ], [ %temp_67_2, %121 ], [ %temp_66_2, %119 ]
  %dir_73.phi.trans.insert = sext i32 %dir_counter.70.be to i64
  %dir_73_ptr.phi.trans.insert = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_73.phi.trans.insert
  %dir_73_value.pre = load i32, ptr %dir_73_ptr.phi.trans.insert, align 4
  br label %132

89:                                               ; preds = %104, %10, %116, %.loopexit261, %95, %3
  %counter.47 = phi i32 [ %temp_57_1, %104 ], [ %temp_64_1, %116 ], [ %temp_75_1, %.loopexit261 ], [ %temp_2_1, %3 ], [ %temp_6_1, %10 ], [ %temp_52_1, %95 ]
  %dir_counter.47 = phi i32 [ %temp_57_2, %104 ], [ %temp_64_2, %116 ], [ %temp_75_2, %.loopexit261 ], [ %temp_2_2, %3 ], [ %temp_6_2, %10 ], [ %temp_52_2, %95 ]
  %90 = sext i32 %counter.47 to i64
  %output_49_ptr = getelementptr inbounds i32, ptr %in_output, i64 %90
  store i32 49, ptr %output_49_ptr, align 4
  %temp_49_1 = add i32 %counter.47, 1
  %dir_49 = sext i32 %dir_counter.47 to i64
  %dir_49_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_49
  %dir_49_value = load i32, ptr %dir_49_ptr, align 4
  %temp_49_2 = add i32 %dir_counter.47, 1
  switch i32 %dir_49_value, label %3 [
    i32 4, label %.loopexit246
    i32 1, label %130
    i32 2, label %203
    i32 3, label %195
  ]

91:                                               ; preds = %209, %152, %98, %5
  %counter.48 = phi i32 [ %temp_54_1, %98 ], [ %temp_3_1, %5 ], [ %temp_117_1, %209 ], [ %temp_85_1, %152 ]
  %dir_counter.48 = phi i32 [ %temp_54_2, %98 ], [ %temp_3_2, %5 ], [ %temp_117_2, %209 ], [ %temp_85_2, %152 ]
  %92 = sext i32 %counter.48 to i64
  %output_50_ptr = getelementptr inbounds i32, ptr %in_output, i64 %92
  store i32 50, ptr %output_50_ptr, align 4
  %temp_50_1 = add i32 %counter.48, 1
  %dir_50 = sext i32 %dir_counter.48 to i64
  %dir_50_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_50
  %dir_50_value = load i32, ptr %dir_50_ptr, align 4
  %temp_50_2 = add i32 %dir_counter.48, 1
  switch i32 %dir_50_value, label %.loopexit252 [
    i32 2, label %50
    i32 1, label %.loopexit267
  ]

93:                                               ; preds = %.loopexit255, %142, %.loopexit267, %182, %79, %.loopexit256, %33, %30, %.loopexit254
  %counter.49 = phi i32 [ %temp_14_1, %.loopexit254 ], [ %temp_41_1, %.loopexit256 ], [ %temp_116_1, %.loopexit255 ], [ %temp_19_1, %33 ], [ %temp_17_1, %30 ], [ %temp_79_1, %142 ], [ %temp_105_1, %.loopexit267 ], [ %temp_101_1, %182 ], [ %temp_44_1, %79 ]
  %dir_counter.49 = phi i32 [ %temp_14_2, %.loopexit254 ], [ %temp_41_2, %.loopexit256 ], [ %temp_116_2, %.loopexit255 ], [ %temp_19_2, %33 ], [ %temp_17_2, %30 ], [ %temp_79_2, %142 ], [ %temp_105_2, %.loopexit267 ], [ %temp_101_2, %182 ], [ %temp_44_2, %79 ]
  %94 = sext i32 %counter.49 to i64
  %output_51_ptr = getelementptr inbounds i32, ptr %in_output, i64 %94
  store i32 51, ptr %output_51_ptr, align 4
  %temp_51_1 = add i32 %counter.49, 1
  %dir_51 = sext i32 %dir_counter.49 to i64
  %dir_51_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_51
  %dir_51_value = load i32, ptr %dir_51_ptr, align 4
  %temp_51_2 = add i32 %dir_counter.49, 1
  switch i32 %dir_51_value, label %107 [
    i32 5, label %164
    i32 1, label %39
    i32 2, label %189
    i32 3, label %201
    i32 4, label %180
  ]

95:                                               ; preds = %.loopexit267, %160, %144, %37, %26
  %counter.50 = phi i32 [ %temp_15_1, %26 ], [ %temp_80_1, %144 ], [ %temp_105_1, %.loopexit267 ], [ %temp_89_1, %160 ], [ %temp_21_1, %37 ]
  %dir_counter.50 = phi i32 [ %temp_15_2, %26 ], [ %temp_80_2, %144 ], [ %temp_105_2, %.loopexit267 ], [ %temp_89_2, %160 ], [ %temp_21_2, %37 ]
  %96 = sext i32 %counter.50 to i64
  %output_52_ptr = getelementptr inbounds i32, ptr %in_output, i64 %96
  store i32 52, ptr %output_52_ptr, align 4
  %temp_52_1 = add i32 %counter.50, 1
  %dir_52 = sext i32 %dir_counter.50 to i64
  %dir_52_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_52
  %dir_52_value = load i32, ptr %dir_52_ptr, align 4
  %temp_52_2 = add i32 %dir_counter.50, 1
  switch i32 %dir_52_value, label %119 [
    i32 7, label %.loopexit246
    i32 1, label %8
    i32 2, label %89
    i32 3, label %.preheader265.preheader
    i32 4, label %81
    i32 5, label %23
    i32 6, label %48
  ]

.loopexit270:                                     ; preds = %.preheader265, %116
  %counter.51 = phi i32 [ %temp_64_1, %116 ], [ %temp_26_1, %.preheader265 ]
  %dir_counter.51 = phi i32 [ %temp_64_2, %116 ], [ %temp_26_2, %.preheader265 ]
  %97 = sext i32 %counter.51 to i64
  %output_53_ptr = getelementptr inbounds i32, ptr %in_output, i64 %97
  store i32 53, ptr %output_53_ptr, align 4
  %temp_53_1 = add i32 %counter.51, 1
  %dir_53 = sext i32 %dir_counter.51 to i64
  %dir_53_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_53
  %dir_53_value = load i32, ptr %dir_53_ptr, align 4
  %temp_53_2 = add i32 %dir_counter.51, 1
  switch i32 %dir_53_value, label %156 [
    i32 7, label %.loopexit246
    i32 1, label %206
    i32 2, label %102
    i32 3, label %.loopexit252
    i32 4, label %45
    i32 5, label %116
    i32 6, label %.loopexit254
  ]

98:                                               ; preds = %130, %87, %71, %48, %26, %16
  %counter.52 = phi i32 [ %temp_27_1, %48 ], [ %temp_72_1, %130 ], [ %temp_48_1, %87 ], [ %temp_9_1, %16 ], [ %temp_39_1, %71 ], [ %temp_15_1, %26 ]
  %dir_counter.52 = phi i32 [ %temp_27_2, %48 ], [ %temp_72_2, %130 ], [ %temp_48_2, %87 ], [ %temp_9_2, %16 ], [ %temp_39_2, %71 ], [ %temp_15_2, %26 ]
  %99 = sext i32 %counter.52 to i64
  %output_54_ptr = getelementptr inbounds i32, ptr %in_output, i64 %99
  store i32 54, ptr %output_54_ptr, align 4
  %temp_54_1 = add i32 %counter.52, 1
  %dir_54 = sext i32 %dir_counter.52 to i64
  %dir_54_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_54
  %dir_54_value = load i32, ptr %dir_54_ptr, align 4
  %temp_54_2 = add i32 %dir_counter.52, 1
  switch i32 %dir_54_value, label %91 [
    i32 8, label %.loopexit246
    i32 1, label %69
    i32 2, label %.loopexit269
    i32 3, label %116
    i32 4, label %5
    i32 5, label %.loopexit259
    i32 6, label %142
    i32 7, label %201
  ]

100:                                              ; preds = %43, %206, %81, %77, %12
  %counter.53 = phi i32 [ %temp_7_1, %12 ], [ %temp_43_1, %77 ], [ %temp_24_1, %43 ], [ %temp_115_1, %206 ], [ %temp_45_1, %81 ]
  %dir_counter.53 = phi i32 [ %temp_7_2, %12 ], [ %temp_43_2, %77 ], [ %temp_24_2, %43 ], [ %temp_115_2, %206 ], [ %temp_45_2, %81 ]
  %101 = sext i32 %counter.53 to i64
  %output_55_ptr = getelementptr inbounds i32, ptr %in_output, i64 %101
  store i32 55, ptr %output_55_ptr, align 4
  %temp_55_1 = add i32 %counter.53, 1
  %dir_55 = sext i32 %dir_counter.53 to i64
  %dir_55_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_55
  %dir_55_value = load i32, ptr %dir_55_ptr, align 4
  %temp_55_2 = add i32 %dir_counter.53, 1
  switch i32 %dir_55_value, label %.loopexit255 [
    i32 5, label %197
    i32 1, label %67
    i32 2, label %5
    i32 3, label %37
    i32 4, label %.preheader265.preheader
  ]

102:                                              ; preds = %180, %.loopexit270, %5
  %counter.54 = phi i32 [ %temp_53_1, %.loopexit270 ], [ %temp_3_1, %5 ], [ %temp_100_1, %180 ]
  %dir_counter.54 = phi i32 [ %temp_53_2, %.loopexit270 ], [ %temp_3_2, %5 ], [ %temp_100_2, %180 ]
  %103 = sext i32 %counter.54 to i64
  %output_56_ptr = getelementptr inbounds i32, ptr %in_output, i64 %103
  store i32 56, ptr %output_56_ptr, align 4
  %temp_56_1 = add i32 %counter.54, 1
  %dir_56 = sext i32 %dir_counter.54 to i64
  %dir_56_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_56
  %dir_56_value = load i32, ptr %dir_56_ptr, align 4
  %temp_56_2 = add i32 %dir_counter.54, 1
  switch i32 %dir_56_value, label %186 [
    i32 4, label %79
    i32 1, label %.backedge
    i32 2, label %182
    i32 3, label %.loopexit260
  ]

104:                                              ; preds = %12, %180, %191, %28
  %counter.55 = phi i32 [ %temp_107_1, %191 ], [ %temp_7_1, %12 ], [ %temp_16_1, %28 ], [ %temp_100_1, %180 ]
  %dir_counter.55 = phi i32 [ %temp_107_2, %191 ], [ %temp_7_2, %12 ], [ %temp_16_2, %28 ], [ %temp_100_2, %180 ]
  %105 = sext i32 %counter.55 to i64
  %output_57_ptr = getelementptr inbounds i32, ptr %in_output, i64 %105
  store i32 57, ptr %output_57_ptr, align 4
  %temp_57_1 = add i32 %counter.55, 1
  %dir_57 = sext i32 %dir_counter.55 to i64
  %dir_57_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_57
  %dir_57_value = load i32, ptr %dir_57_ptr, align 4
  %temp_57_2 = add i32 %dir_counter.55, 1
  switch i32 %dir_57_value, label %50 [
    i32 5, label %89
    i32 1, label %63
    i32 2, label %156
    i32 3, label %23
    i32 4, label %193
  ]

.loopexit244:                                     ; preds = %.preheader, %.loopexit259, %57, %142, %132, %79, %5, %3
  %counter.56 = phi i32 [ %temp_73_1, %132 ], [ %temp_2_1, %3 ], [ %temp_3_1, %5 ], [ %temp_32_1, %57 ], [ %temp_42_1, %.loopexit259 ], [ %temp_79_1, %142 ], [ %temp_44_1, %79 ], [ %temp_84_1, %.preheader ]
  %dir_counter.56 = phi i32 [ %temp_73_2, %132 ], [ %temp_2_2, %3 ], [ %temp_3_2, %5 ], [ %temp_32_2, %57 ], [ %temp_42_2, %.loopexit259 ], [ %temp_79_2, %142 ], [ %temp_44_2, %79 ], [ %temp_84_2, %.preheader ]
  %106 = sext i32 %counter.56 to i64
  %output_58_ptr = getelementptr inbounds i32, ptr %in_output, i64 %106
  store i32 58, ptr %output_58_ptr, align 4
  %temp_58_1 = add i32 %counter.56, 1
  %dir_58 = sext i32 %dir_counter.56 to i64
  %dir_58_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_58
  %dir_58_value = load i32, ptr %dir_58_ptr, align 4
  %temp_58_2 = add i32 %dir_counter.56, 1
  switch i32 %dir_58_value, label %81 [
    i32 6, label %.preheader257.preheader
    i32 1, label %211
    i32 2, label %203
    i32 3, label %193
    i32 4, label %158
    i32 5, label %125
  ]

107:                                              ; preds = %37, %182, %146, %123, %93, %67, %50, %16
  %counter.57 = phi i32 [ %temp_9_1, %16 ], [ %temp_68_1, %123 ], [ %temp_51_1, %93 ], [ %temp_81_1, %146 ], [ %temp_37_1, %67 ], [ %temp_28_1, %50 ], [ %temp_101_1, %182 ], [ %temp_21_1, %37 ]
  %dir_counter.57 = phi i32 [ %temp_9_2, %16 ], [ %temp_68_2, %123 ], [ %temp_51_2, %93 ], [ %temp_81_2, %146 ], [ %temp_37_2, %67 ], [ %temp_28_2, %50 ], [ %temp_101_2, %182 ], [ %temp_21_2, %37 ]
  %108 = sext i32 %counter.57 to i64
  %output_59_ptr = getelementptr inbounds i32, ptr %in_output, i64 %108
  store i32 59, ptr %output_59_ptr, align 4
  %temp_59_1 = add i32 %counter.57, 1
  %dir_59 = sext i32 %dir_counter.57 to i64
  %dir_59_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_59
  %dir_59_value = load i32, ptr %dir_59_ptr, align 4
  %temp_59_2 = add i32 %dir_counter.57, 1
  switch i32 %dir_59_value, label %125 [
    i32 7, label %39
    i32 1, label %55
    i32 2, label %16
    i32 3, label %168
    i32 4, label %10
    i32 5, label %20
    i32 6, label %.loopexit260
  ]

109:                                              ; preds = %203
  %110 = sext i32 %temp_113_1 to i64
  %output_60_ptr = getelementptr inbounds i32, ptr %in_output, i64 %110
  store i32 60, ptr %output_60_ptr, align 4
  %temp_60_1 = add i32 %counter.110, 2
  %dir_60 = sext i32 %temp_113_2 to i64
  %dir_60_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_60
  %dir_60_value = load i32, ptr %dir_60_ptr, align 4
  %temp_60_2 = add i32 %dir_counter.110, 2
  switch i32 %dir_60_value, label %50 [
    i32 6, label %193
    i32 1, label %63
    i32 2, label %177
    i32 3, label %77
    i32 4, label %138
    i32 5, label %.loopexit269
  ]

111:                                              ; preds = %164, %148, %69, %.loopexit260, %3
  %counter.58 = phi i32 [ %temp_38_1, %69 ], [ %temp_91_1, %164 ], [ %temp_2_1, %3 ], [ %temp_18_1, %.loopexit260 ], [ %temp_82_1, %148 ]
  %dir_counter.58 = phi i32 [ %temp_38_2, %69 ], [ %temp_91_2, %164 ], [ %temp_2_2, %3 ], [ %temp_18_2, %.loopexit260 ], [ %temp_82_2, %148 ]
  %112 = sext i32 %counter.58 to i64
  %output_61_ptr = getelementptr inbounds i32, ptr %in_output, i64 %112
  store i32 61, ptr %output_61_ptr, align 4
  %temp_61_1 = add i32 %counter.58, 1
  %dir_61 = sext i32 %dir_counter.58 to i64
  %dir_61_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_61
  %dir_61_value = load i32, ptr %dir_61_ptr, align 4
  %temp_61_2 = add i32 %dir_counter.58, 1
  switch i32 %dir_61_value, label %87 [
    i32 3, label %69
    i32 1, label %79
    i32 2, label %26
  ]

113:                                              ; preds = %193, %.loopexit252, %45, %.loopexit254
  %counter.59 = phi i32 [ %temp_76_1, %.loopexit252 ], [ %temp_25_1, %45 ], [ %temp_14_1, %.loopexit254 ], [ %temp_108_1, %193 ]
  %dir_counter.59 = phi i32 [ %temp_76_2, %.loopexit252 ], [ %temp_25_2, %45 ], [ %temp_14_2, %.loopexit254 ], [ %temp_108_2, %193 ]
  %114 = sext i32 %counter.59 to i64
  %output_62_ptr = getelementptr inbounds i32, ptr %in_output, i64 %114
  store i32 62, ptr %output_62_ptr, align 4
  %temp_62_1 = add i32 %counter.59, 1
  %dir_62 = sext i32 %dir_counter.59 to i64
  %dir_62_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_62
  %dir_62_value = load i32, ptr %dir_62_ptr, align 4
  %temp_62_2 = add i32 %dir_counter.59, 1
  switch i32 %dir_62_value, label %201 [
    i32 3, label %180
    i32 1, label %common.ret
    i32 2, label %140
  ]

.preheader257:                                    ; preds = %.preheader257.preheader, %.preheader257
  %counter.60 = phi i32 [ %temp_63_1, %.preheader257 ], [ %counter.60.ph, %.preheader257.preheader ]
  %dir_counter.60 = phi i32 [ %temp_63_2, %.preheader257 ], [ %dir_counter.60.ph, %.preheader257.preheader ]
  %115 = sext i32 %counter.60 to i64
  %output_63_ptr = getelementptr inbounds i32, ptr %in_output, i64 %115
  store i32 63, ptr %output_63_ptr, align 4
  %temp_63_1 = add i32 %counter.60, 1
  %dir_63 = sext i32 %dir_counter.60 to i64
  %dir_63_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_63
  %dir_63_value = load i32, ptr %dir_63_ptr, align 4
  %temp_63_2 = add i32 %dir_counter.60, 1
  switch i32 %dir_63_value, label %.loopexit258 [
    i32 7, label %.loopexit259
    i32 1, label %.preheader257
    i32 2, label %.loopexit260
    i32 3, label %.loopexit261
    i32 4, label %.loopexit262
    i32 5, label %.loopexit263
    i32 6, label %.loopexit254
  ]

116:                                              ; preds = %1, %.loopexit255, %193, %164, %98, %.loopexit270, %69, %23
  %counter.61 = phi i32 [ %temp_38_1, %69 ], [ %temp_116_1, %.loopexit255 ], [ %temp_53_1, %.loopexit270 ], [ %temp_1_1, %1 ], [ %temp_91_1, %164 ], [ %temp_54_1, %98 ], [ %temp_108_1, %193 ], [ %temp_13_1, %23 ]
  %dir_counter.61 = phi i32 [ %temp_38_2, %69 ], [ %temp_116_2, %.loopexit255 ], [ %temp_53_2, %.loopexit270 ], [ %temp_1_2, %1 ], [ %temp_91_2, %164 ], [ %temp_54_2, %98 ], [ %temp_108_2, %193 ], [ %temp_13_2, %23 ]
  %117 = sext i32 %counter.61 to i64
  %output_64_ptr = getelementptr inbounds i32, ptr %in_output, i64 %117
  store i32 64, ptr %output_64_ptr, align 4
  %temp_64_1 = add i32 %counter.61, 1
  %dir_64 = sext i32 %dir_counter.61 to i64
  %dir_64_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_64
  %dir_64_value = load i32, ptr %dir_64_ptr, align 4
  %temp_64_2 = add i32 %dir_counter.61, 1
  switch i32 %dir_64_value, label %.loopexit270 [
    i32 2, label %89
    i32 1, label %18
  ]

.loopexit269:                                     ; preds = %.preheader265, %166, %109, %98, %77, %33, %.loopexit, %20
  %counter.62 = phi i32 [ %temp_11_1, %20 ], [ %temp_43_1, %77 ], [ %temp_12_1, %.loopexit ], [ %temp_92_1, %166 ], [ %temp_19_1, %33 ], [ %temp_60_1, %109 ], [ %temp_54_1, %98 ], [ %temp_26_1, %.preheader265 ]
  %dir_counter.62 = phi i32 [ %temp_11_2, %20 ], [ %temp_43_2, %77 ], [ %temp_12_2, %.loopexit ], [ %temp_92_2, %166 ], [ %temp_19_2, %33 ], [ %temp_60_2, %109 ], [ %temp_54_2, %98 ], [ %temp_26_2, %.preheader265 ]
  %118 = sext i32 %counter.62 to i64
  %output_65_ptr = getelementptr inbounds i32, ptr %in_output, i64 %118
  store i32 65, ptr %output_65_ptr, align 4
  %temp_65_1 = add i32 %counter.62, 1
  %dir_65 = sext i32 %dir_counter.62 to i64
  %dir_65_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_65
  %dir_65_value = load i32, ptr %dir_65_ptr, align 4
  %temp_65_2 = add i32 %dir_counter.62, 1
  switch i32 %dir_65_value, label %182 [
    i32 7, label %.loopexit252
    i32 1, label %33
    i32 2, label %191
    i32 3, label %30
    i32 4, label %79
    i32 5, label %26
    i32 6, label %142
  ]

119:                                              ; preds = %170, %209, %.loopexit258, %199, %197, %168, %95, %73, %37, %28
  %counter.63 = phi i32 [ %temp_52_1, %95 ], [ %temp_117_1, %209 ], [ %temp_40_1, %73 ], [ %temp_16_1, %28 ], [ %temp_94_1, %170 ], [ %temp_93_1, %168 ], [ %temp_114_1, %.loopexit258 ], [ %temp_111_1, %199 ], [ %temp_110_1, %197 ], [ %temp_21_1, %37 ]
  %dir_counter.63 = phi i32 [ %temp_52_2, %95 ], [ %temp_117_2, %209 ], [ %temp_40_2, %73 ], [ %temp_16_2, %28 ], [ %temp_94_2, %170 ], [ %temp_93_2, %168 ], [ %temp_114_2, %.loopexit258 ], [ %temp_111_2, %199 ], [ %temp_110_2, %197 ], [ %temp_21_2, %37 ]
  %120 = sext i32 %counter.63 to i64
  %output_66_ptr = getelementptr inbounds i32, ptr %in_output, i64 %120
  store i32 66, ptr %output_66_ptr, align 4
  %temp_66_1 = add i32 %counter.63, 1
  %dir_66 = sext i32 %dir_counter.63 to i64
  %dir_66_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_66
  %dir_66_value = load i32, ptr %dir_66_ptr, align 4
  %temp_66_2 = add i32 %dir_counter.63, 1
  switch i32 %dir_66_value, label %18 [
    i32 5, label %20
    i32 1, label %134
    i32 2, label %.loopexit262
    i32 3, label %52
    i32 4, label %.backedge
  ]

121:                                              ; preds = %79, %43, %30
  %counter.64 = phi i32 [ %temp_44_1, %79 ], [ %temp_17_1, %30 ], [ %temp_24_1, %43 ]
  %dir_counter.64 = phi i32 [ %temp_44_2, %79 ], [ %temp_17_2, %30 ], [ %temp_24_2, %43 ]
  %122 = sext i32 %counter.64 to i64
  %output_67_ptr = getelementptr inbounds i32, ptr %in_output, i64 %122
  store i32 67, ptr %output_67_ptr, align 4
  %temp_67_1 = add i32 %counter.64, 1
  %dir_67 = sext i32 %dir_counter.64 to i64
  %dir_67_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_67
  %dir_67_value = load i32, ptr %dir_67_ptr, align 4
  %temp_67_2 = add i32 %dir_counter.64, 1
  switch i32 %dir_67_value, label %85 [
    i32 4, label %125
    i32 1, label %206
    i32 2, label %69
    i32 3, label %.backedge
  ]

123:                                              ; preds = %211, %189, %79, %65, %12
  %counter.65 = phi i32 [ %temp_118_1, %211 ], [ %temp_106_1, %189 ], [ %temp_7_1, %12 ], [ %temp_36_1, %65 ], [ %temp_44_1, %79 ]
  %dir_counter.65 = phi i32 [ %temp_118_2, %211 ], [ %temp_106_2, %189 ], [ %temp_7_2, %12 ], [ %temp_36_2, %65 ], [ %temp_44_2, %79 ]
  %124 = sext i32 %counter.65 to i64
  %output_68_ptr = getelementptr inbounds i32, ptr %in_output, i64 %124
  store i32 68, ptr %output_68_ptr, align 4
  %temp_68_1 = add i32 %counter.65, 1
  %dir_68 = sext i32 %dir_counter.65 to i64
  %dir_68_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_68
  %dir_68_value = load i32, ptr %dir_68_ptr, align 4
  %temp_68_2 = add i32 %dir_counter.65, 1
  switch i32 %dir_68_value, label %107 [
    i32 2, label %65
    i32 1, label %206
  ]

125:                                              ; preds = %121, %182, %177, %107, %.loopexit244, %48
  %counter.66 = phi i32 [ %temp_59_1, %107 ], [ %temp_101_1, %182 ], [ %temp_98_1, %177 ], [ %temp_27_1, %48 ], [ %temp_67_1, %121 ], [ %temp_58_1, %.loopexit244 ]
  %dir_counter.66 = phi i32 [ %temp_59_2, %107 ], [ %temp_101_2, %182 ], [ %temp_98_2, %177 ], [ %temp_27_2, %48 ], [ %temp_67_2, %121 ], [ %temp_58_2, %.loopexit244 ]
  %126 = sext i32 %counter.66 to i64
  %output_69_ptr = getelementptr inbounds i32, ptr %in_output, i64 %126
  store i32 69, ptr %output_69_ptr, align 4
  %temp_69_1 = add i32 %counter.66, 1
  %dir_69 = sext i32 %dir_counter.66 to i64
  %dir_69_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_69
  %dir_69_value = load i32, ptr %dir_69_ptr, align 4
  %temp_69_2 = add i32 %dir_counter.66, 1
  switch i32 %dir_69_value, label %182 [
    i32 2, label %189
    i32 1, label %10
  ]

127:                                              ; preds = %48, %8, %209, %180, %172, %156, %.loopexit261, %77, %35
  %counter.67 = phi i32 [ %temp_100_1, %180 ], [ %temp_87_1, %156 ], [ %temp_117_1, %209 ], [ %temp_43_1, %77 ], [ %temp_5_1, %8 ], [ %temp_75_1, %.loopexit261 ], [ %temp_20_1, %35 ], [ %temp_95_1, %172 ], [ %temp_27_1, %48 ]
  %dir_counter.67 = phi i32 [ %temp_100_2, %180 ], [ %temp_87_2, %156 ], [ %temp_117_2, %209 ], [ %temp_43_2, %77 ], [ %temp_5_2, %8 ], [ %temp_75_2, %.loopexit261 ], [ %temp_20_2, %35 ], [ %temp_95_2, %172 ], [ %temp_27_2, %48 ]
  %128 = sext i32 %counter.67 to i64
  %output_70_ptr = getelementptr inbounds i32, ptr %in_output, i64 %128
  store i32 70, ptr %output_70_ptr, align 4
  %temp_70_1 = add i32 %counter.67, 1
  %dir_70 = sext i32 %dir_counter.67 to i64
  %dir_70_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_70
  %dir_70_value = load i32, ptr %dir_70_ptr, align 4
  %temp_70_2 = add i32 %dir_counter.67, 1
  switch i32 %dir_70_value, label %3 [
    i32 3, label %.loopexit
    i32 1, label %142
    i32 2, label %154
  ]

.loopexit262:                                     ; preds = %.preheader265, %.preheader257, %160, %201, %180, %.loopexit252, %119, %.loopexit251, %52, %39, %37, %26, %14
  %counter.68 = phi i32 [ %temp_21_1, %37 ], [ %temp_76_1, %.loopexit252 ], [ %temp_100_1, %180 ], [ %temp_30_1, %.loopexit251 ], [ %temp_22_1, %39 ], [ %temp_89_1, %160 ], [ %temp_29_1, %52 ], [ %temp_112_1, %201 ], [ %temp_66_1, %119 ], [ %temp_15_1, %26 ], [ %temp_8_1, %14 ], [ %temp_63_1, %.preheader257 ], [ %temp_26_1, %.preheader265 ]
  %dir_counter.68 = phi i32 [ %temp_21_2, %37 ], [ %temp_76_2, %.loopexit252 ], [ %temp_100_2, %180 ], [ %temp_30_2, %.loopexit251 ], [ %temp_22_2, %39 ], [ %temp_89_2, %160 ], [ %temp_29_2, %52 ], [ %temp_112_2, %201 ], [ %temp_66_2, %119 ], [ %temp_15_2, %26 ], [ %temp_8_2, %14 ], [ %temp_63_2, %.preheader257 ], [ %temp_26_2, %.preheader265 ]
  %129 = sext i32 %counter.68 to i64
  %output_71_ptr = getelementptr inbounds i32, ptr %in_output, i64 %129
  store i32 71, ptr %output_71_ptr, align 4
  %temp_71_1 = add i32 %counter.68, 1
  %dir_71 = sext i32 %dir_counter.68 to i64
  %dir_71_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_71
  %dir_71_value = load i32, ptr %dir_71_ptr, align 4
  %temp_71_2 = add i32 %dir_counter.68, 1
  switch i32 %dir_71_value, label %26 [
    i32 5, label %45
    i32 1, label %189
    i32 2, label %.loopexit258
    i32 3, label %.preheader245.preheader
    i32 4, label %10
  ]

130:                                              ; preds = %16, %195, %89, %43
  %counter.69 = phi i32 [ %temp_109_1, %195 ], [ %temp_49_1, %89 ], [ %temp_24_1, %43 ], [ %temp_9_1, %16 ]
  %dir_counter.69 = phi i32 [ %temp_109_2, %195 ], [ %temp_49_2, %89 ], [ %temp_24_2, %43 ], [ %temp_9_2, %16 ]
  %131 = sext i32 %counter.69 to i64
  %output_72_ptr = getelementptr inbounds i32, ptr %in_output, i64 %131
  store i32 72, ptr %output_72_ptr, align 4
  %temp_72_1 = add i32 %counter.69, 1
  %dir_72 = sext i32 %dir_counter.69 to i64
  %dir_72_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_72
  %dir_72_value = load i32, ptr %dir_72_ptr, align 4
  %temp_72_2 = add i32 %dir_counter.69, 1
  switch i32 %dir_72_value, label %182 [
    i32 3, label %37
    i32 1, label %.loopexit252
    i32 2, label %98
  ]

132:                                              ; preds = %.backedge, %0
  %dir_73_value = phi i32 [ 2, %0 ], [ %dir_73_value.pre, %.backedge ]
  %counter.70 = phi i32 [ 1, %0 ], [ %counter.70.be, %.backedge ]
  %dir_counter.70 = phi i32 [ 1, %0 ], [ %dir_counter.70.be, %.backedge ]
  %133 = sext i32 %counter.70 to i64
  %output_73_ptr = getelementptr inbounds i32, ptr %in_output, i64 %133
  store i32 73, ptr %output_73_ptr, align 4
  %temp_73_1 = add i32 %counter.70, 1
  %temp_73_2 = add i32 %dir_counter.70, 1
  switch i32 %dir_73_value, label %.loopexit244 [
    i32 3, label %.loopexit246
    i32 1, label %39
    i32 2, label %158
  ]

134:                                              ; preds = %.loopexit258, %.loopexit250, %119, %37
  %counter.71 = phi i32 [ %temp_103_1, %.loopexit250 ], [ %temp_114_1, %.loopexit258 ], [ %temp_66_1, %119 ], [ %temp_21_1, %37 ]
  %dir_counter.71 = phi i32 [ %temp_103_2, %.loopexit250 ], [ %temp_114_2, %.loopexit258 ], [ %temp_66_2, %119 ], [ %temp_21_2, %37 ]
  %135 = sext i32 %counter.71 to i64
  %output_74_ptr = getelementptr inbounds i32, ptr %in_output, i64 %135
  store i32 74, ptr %output_74_ptr, align 4
  %temp_74_1 = add i32 %counter.71, 1
  %dir_74 = sext i32 %dir_counter.71 to i64
  %dir_74_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_74
  %dir_74_value = load i32, ptr %dir_74_ptr, align 4
  %temp_74_2 = add i32 %dir_counter.71, 1
  switch i32 %dir_74_value, label %37 [
    i32 3, label %.loopexit254
    i32 1, label %174
    i32 2, label %195
  ]

.loopexit261:                                     ; preds = %.preheader257, %.loopexit250, %154, %52, %33
  %counter.72 = phi i32 [ %temp_19_1, %33 ], [ %temp_86_1, %154 ], [ %temp_29_1, %52 ], [ %temp_103_1, %.loopexit250 ], [ %temp_63_1, %.preheader257 ]
  %dir_counter.72 = phi i32 [ %temp_19_2, %33 ], [ %temp_86_2, %154 ], [ %temp_29_2, %52 ], [ %temp_103_2, %.loopexit250 ], [ %temp_63_2, %.preheader257 ]
  %136 = sext i32 %counter.72 to i64
  %output_75_ptr = getelementptr inbounds i32, ptr %in_output, i64 %136
  store i32 75, ptr %output_75_ptr, align 4
  %temp_75_1 = add i32 %counter.72, 1
  %dir_75 = sext i32 %dir_counter.72 to i64
  %dir_75_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_75
  %dir_75_value = load i32, ptr %dir_75_ptr, align 4
  %temp_75_2 = add i32 %dir_counter.72, 1
  switch i32 %dir_75_value, label %209 [
    i32 4, label %.loopexit267
    i32 1, label %89
    i32 2, label %186
    i32 3, label %127
  ]

.loopexit252:                                     ; preds = %.preheader249, %.loopexit269, %186, %130, %.loopexit270, %91, %33, %.loopexit254, %23
  %counter.73 = phi i32 [ %temp_13_1, %23 ], [ %temp_50_1, %91 ], [ %temp_104_1, %186 ], [ %temp_72_1, %130 ], [ %temp_53_1, %.loopexit270 ], [ %temp_19_1, %33 ], [ %temp_14_1, %.loopexit254 ], [ %temp_65_1, %.loopexit269 ], [ %temp_4_1, %.preheader249 ]
  %dir_counter.73 = phi i32 [ %temp_13_2, %23 ], [ %temp_50_2, %91 ], [ %temp_104_2, %186 ], [ %temp_72_2, %130 ], [ %temp_53_2, %.loopexit270 ], [ %temp_19_2, %33 ], [ %temp_14_2, %.loopexit254 ], [ %temp_65_2, %.loopexit269 ], [ %temp_4_2, %.preheader249 ]
  %137 = sext i32 %counter.73 to i64
  %output_76_ptr = getelementptr inbounds i32, ptr %in_output, i64 %137
  store i32 76, ptr %output_76_ptr, align 4
  %temp_76_1 = add i32 %counter.73, 1
  %dir_76 = sext i32 %dir_counter.73 to i64
  %dir_76_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_76
  %dir_76_value = load i32, ptr %dir_76_ptr, align 4
  %temp_76_2 = add i32 %dir_counter.73, 1
  switch i32 %dir_76_value, label %.loopexit262 [
    i32 4, label %.loopexit256
    i32 1, label %59
    i32 2, label %166
    i32 3, label %113
  ]

138:                                              ; preds = %158, %142, %109, %50
  %counter.74 = phi i32 [ %temp_88_1, %158 ], [ %temp_28_1, %50 ], [ %temp_79_1, %142 ], [ %temp_60_1, %109 ]
  %dir_counter.74 = phi i32 [ %temp_88_2, %158 ], [ %temp_28_2, %50 ], [ %temp_79_2, %142 ], [ %temp_60_2, %109 ]
  %139 = sext i32 %counter.74 to i64
  %output_77_ptr = getelementptr inbounds i32, ptr %in_output, i64 %139
  store i32 77, ptr %output_77_ptr, align 4
  %temp_77_1 = add i32 %counter.74, 1
  %dir_77 = sext i32 %dir_counter.74 to i64
  %dir_77_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_77
  %dir_77_value = load i32, ptr %dir_77_ptr, align 4
  %temp_77_2 = add i32 %dir_counter.74, 1
  switch i32 %dir_77_value, label %48 [
    i32 2, label %.loopexit256
    i32 1, label %.preheader.preheader
  ]

140:                                              ; preds = %73, %.loopexit258, %172, %113, %39, %5
  %counter.75 = phi i32 [ %temp_40_1, %73 ], [ %temp_3_1, %5 ], [ %temp_114_1, %.loopexit258 ], [ %temp_95_1, %172 ], [ %temp_22_1, %39 ], [ %temp_62_1, %113 ]
  %dir_counter.75 = phi i32 [ %temp_40_2, %73 ], [ %temp_3_2, %5 ], [ %temp_114_2, %.loopexit258 ], [ %temp_95_2, %172 ], [ %temp_22_2, %39 ], [ %temp_62_2, %113 ]
  %141 = sext i32 %counter.75 to i64
  %output_78_ptr = getelementptr inbounds i32, ptr %in_output, i64 %141
  store i32 78, ptr %output_78_ptr, align 4
  %temp_78_1 = add i32 %counter.75, 1
  %dir_78 = sext i32 %dir_counter.75 to i64
  %dir_78_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_78
  %dir_78_value = load i32, ptr %dir_78_ptr, align 4
  %temp_78_2 = add i32 %dir_counter.75, 1
  switch i32 %dir_78_value, label %.preheader249.preheader [
    i32 2, label %182
    i32 1, label %3
  ]

142:                                              ; preds = %156, %.loopexit248, %195, %.loopexit267, %127, %.loopexit269, %98, %50, %33
  %counter.76 = phi i32 [ %temp_65_1, %.loopexit269 ], [ %temp_109_1, %195 ], [ %temp_120_1, %.loopexit248 ], [ %temp_28_1, %50 ], [ %temp_87_1, %156 ], [ %temp_19_1, %33 ], [ %temp_70_1, %127 ], [ %temp_105_1, %.loopexit267 ], [ %temp_54_1, %98 ]
  %dir_counter.76 = phi i32 [ %temp_65_2, %.loopexit269 ], [ %temp_109_2, %195 ], [ %temp_120_2, %.loopexit248 ], [ %temp_28_2, %50 ], [ %temp_87_2, %156 ], [ %temp_19_2, %33 ], [ %temp_70_2, %127 ], [ %temp_105_2, %.loopexit267 ], [ %temp_54_2, %98 ]
  %143 = sext i32 %counter.76 to i64
  %output_79_ptr = getelementptr inbounds i32, ptr %in_output, i64 %143
  store i32 79, ptr %output_79_ptr, align 4
  %temp_79_1 = add i32 %counter.76, 1
  %dir_79 = sext i32 %dir_counter.76 to i64
  %dir_79_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_79
  %dir_79_value = load i32, ptr %dir_79_ptr, align 4
  %temp_79_2 = add i32 %dir_counter.76, 1
  switch i32 %dir_79_value, label %168 [
    i32 4, label %93
    i32 1, label %138
    i32 2, label %.loopexit256
    i32 3, label %.loopexit244
  ]

144:                                              ; preds = %61, %174, %146
  %counter.77 = phi i32 [ %temp_81_1, %146 ], [ %temp_96_1, %174 ], [ %temp_34_1, %61 ]
  %dir_counter.77 = phi i32 [ %temp_81_2, %146 ], [ %temp_96_2, %174 ], [ %temp_34_2, %61 ]
  %145 = sext i32 %counter.77 to i64
  %output_80_ptr = getelementptr inbounds i32, ptr %in_output, i64 %145
  store i32 80, ptr %output_80_ptr, align 4
  %temp_80_1 = add i32 %counter.77, 1
  %dir_80 = sext i32 %dir_counter.77 to i64
  %dir_80_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_80
  %dir_80_value = load i32, ptr %dir_80_ptr, align 4
  %temp_80_2 = add i32 %dir_counter.77, 1
  switch i32 %dir_80_value, label %95 [
    i32 4, label %.loopexit246
    i32 1, label %16
    i32 2, label %209
    i32 3, label %.loopexit256
  ]

146:                                              ; preds = %213, %81, %77, %18
  %counter.78 = phi i32 [ %temp_43_1, %77 ], [ %temp_119_1, %213 ], [ %temp_10_1, %18 ], [ %temp_45_1, %81 ]
  %dir_counter.78 = phi i32 [ %temp_43_2, %77 ], [ %temp_119_2, %213 ], [ %temp_10_2, %18 ], [ %temp_45_2, %81 ]
  %147 = sext i32 %counter.78 to i64
  %output_81_ptr = getelementptr inbounds i32, ptr %in_output, i64 %147
  store i32 81, ptr %output_81_ptr, align 4
  %temp_81_1 = add i32 %counter.78, 1
  %dir_81 = sext i32 %dir_counter.78 to i64
  %dir_81_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_81
  %dir_81_value = load i32, ptr %dir_81_ptr, align 4
  %temp_81_2 = add i32 %dir_counter.78, 1
  switch i32 %dir_81_value, label %107 [
    i32 6, label %180
    i32 1, label %26
    i32 2, label %59
    i32 3, label %50
    i32 4, label %182
    i32 5, label %144
  ]

148:                                              ; preds = %191, %209, %162, %52
  %counter.79 = phi i32 [ %temp_29_1, %52 ], [ %temp_117_1, %209 ], [ %temp_107_1, %191 ], [ %temp_90_1, %162 ]
  %dir_counter.79 = phi i32 [ %temp_29_2, %52 ], [ %temp_117_2, %209 ], [ %temp_107_2, %191 ], [ %temp_90_2, %162 ]
  %149 = sext i32 %counter.79 to i64
  %output_82_ptr = getelementptr inbounds i32, ptr %in_output, i64 %149
  store i32 82, ptr %output_82_ptr, align 4
  %temp_82_1 = add i32 %counter.79, 1
  %dir_82 = sext i32 %dir_counter.79 to i64
  %dir_82_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_82
  %dir_82_value = load i32, ptr %dir_82_ptr, align 4
  %temp_82_2 = add i32 %dir_counter.79, 1
  switch i32 %dir_82_value, label %201 [
    i32 6, label %43
    i32 1, label %160
    i32 2, label %111
    i32 3, label %152
    i32 4, label %83
    i32 5, label %61
  ]

.loopexit247:                                     ; preds = %.preheader245, %197, %152, %67, %33
  %counter.80 = phi i32 [ %temp_85_1, %152 ], [ %temp_37_1, %67 ], [ %temp_19_1, %33 ], [ %temp_110_1, %197 ], [ %temp_102_1, %.preheader245 ]
  %dir_counter.80 = phi i32 [ %temp_85_2, %152 ], [ %temp_37_2, %67 ], [ %temp_19_2, %33 ], [ %temp_110_2, %197 ], [ %temp_102_2, %.preheader245 ]
  %150 = sext i32 %counter.80 to i64
  %output_83_ptr = getelementptr inbounds i32, ptr %in_output, i64 %150
  store i32 83, ptr %output_83_ptr, align 4
  %temp_83_1 = add i32 %counter.80, 1
  %dir_83 = sext i32 %dir_counter.80 to i64
  %dir_83_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_83
  %dir_83_value = load i32, ptr %dir_83_ptr, align 4
  %temp_83_2 = add i32 %dir_counter.80, 1
  switch i32 %dir_83_value, label %48 [
    i32 6, label %.loopexit267
    i32 1, label %73
    i32 2, label %.preheader265.preheader
    i32 3, label %57
    i32 4, label %85
    i32 5, label %20
  ]

.preheader265.preheader:                          ; preds = %35, %95, %100, %.loopexit247
  %counter.25.ph = phi i32 [ %temp_55_1, %100 ], [ %temp_20_1, %35 ], [ %temp_83_1, %.loopexit247 ], [ %temp_52_1, %95 ]
  %dir_counter.25.ph = phi i32 [ %temp_55_2, %100 ], [ %temp_20_2, %35 ], [ %temp_83_2, %.loopexit247 ], [ %temp_52_2, %95 ]
  br label %.preheader265

.preheader:                                       ; preds = %.preheader.preheader, %.preheader
  %counter.81 = phi i32 [ %temp_84_1, %.preheader ], [ %counter.81.ph, %.preheader.preheader ]
  %dir_counter.81 = phi i32 [ %temp_84_2, %.preheader ], [ %dir_counter.81.ph, %.preheader.preheader ]
  %151 = sext i32 %counter.81 to i64
  %output_84_ptr = getelementptr inbounds i32, ptr %in_output, i64 %151
  store i32 84, ptr %output_84_ptr, align 4
  %temp_84_1 = add i32 %counter.81, 1
  %dir_84 = sext i32 %dir_counter.81 to i64
  %dir_84_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_84
  %dir_84_value = load i32, ptr %dir_84_ptr, align 4
  %temp_84_2 = add i32 %dir_counter.81, 1
  switch i32 %dir_84_value, label %.loopexit [
    i32 3, label %.preheader
    i32 1, label %.loopexit243
    i32 2, label %.loopexit244
  ]

152:                                              ; preds = %148, %81, %65, %39, %28
  %counter.82 = phi i32 [ %temp_22_1, %39 ], [ %temp_16_1, %28 ], [ %temp_82_1, %148 ], [ %temp_36_1, %65 ], [ %temp_45_1, %81 ]
  %dir_counter.82 = phi i32 [ %temp_22_2, %39 ], [ %temp_16_2, %28 ], [ %temp_82_2, %148 ], [ %temp_36_2, %65 ], [ %temp_45_2, %81 ]
  %153 = sext i32 %counter.82 to i64
  %output_85_ptr = getelementptr inbounds i32, ptr %in_output, i64 %153
  store i32 85, ptr %output_85_ptr, align 4
  %temp_85_1 = add i32 %counter.82, 1
  %dir_85 = sext i32 %dir_counter.82 to i64
  %dir_85_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_85
  %dir_85_value = load i32, ptr %dir_85_ptr, align 4
  %temp_85_2 = add i32 %dir_counter.82, 1
  switch i32 %dir_85_value, label %.loopexit247 [
    i32 7, label %.loopexit246
    i32 1, label %79
    i32 2, label %common.ret
    i32 3, label %.loopexit251
    i32 4, label %91
    i32 5, label %73
    i32 6, label %10
  ]

154:                                              ; preds = %177, %168, %127, %26, %.loopexit
  %counter.83 = phi i32 [ %temp_93_1, %168 ], [ %temp_12_1, %.loopexit ], [ %temp_98_1, %177 ], [ %temp_70_1, %127 ], [ %temp_15_1, %26 ]
  %dir_counter.83 = phi i32 [ %temp_93_2, %168 ], [ %temp_12_2, %.loopexit ], [ %temp_98_2, %177 ], [ %temp_70_2, %127 ], [ %temp_15_2, %26 ]
  %155 = sext i32 %counter.83 to i64
  %output_86_ptr = getelementptr inbounds i32, ptr %in_output, i64 %155
  store i32 86, ptr %output_86_ptr, align 4
  %temp_86_1 = add i32 %counter.83, 1
  %dir_86 = sext i32 %dir_counter.83 to i64
  %dir_86_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_86
  %dir_86_value = load i32, ptr %dir_86_ptr, align 4
  %temp_86_2 = add i32 %dir_counter.83, 1
  switch i32 %dir_86_value, label %43 [
    i32 4, label %.loopexit261
    i32 1, label %.loopexit256
    i32 2, label %.preheader245.preheader
    i32 3, label %195
  ]

156:                                              ; preds = %79, %174, %104, %.loopexit270, %77, %55, %14
  %counter.84 = phi i32 [ %temp_53_1, %.loopexit270 ], [ %temp_57_1, %104 ], [ %temp_43_1, %77 ], [ %temp_96_1, %174 ], [ %temp_31_1, %55 ], [ %temp_44_1, %79 ], [ %temp_8_1, %14 ]
  %dir_counter.84 = phi i32 [ %temp_53_2, %.loopexit270 ], [ %temp_57_2, %104 ], [ %temp_43_2, %77 ], [ %temp_96_2, %174 ], [ %temp_31_2, %55 ], [ %temp_44_2, %79 ], [ %temp_8_2, %14 ]
  %157 = sext i32 %counter.84 to i64
  %output_87_ptr = getelementptr inbounds i32, ptr %in_output, i64 %157
  store i32 87, ptr %output_87_ptr, align 4
  %temp_87_1 = add i32 %counter.84, 1
  %dir_87 = sext i32 %dir_counter.84 to i64
  %dir_87_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_87
  %dir_87_value = load i32, ptr %dir_87_ptr, align 4
  %temp_87_2 = add i32 %dir_counter.84, 1
  switch i32 %dir_87_value, label %57 [
    i32 4, label %142
    i32 1, label %77
    i32 2, label %23
    i32 3, label %127
  ]

158:                                              ; preds = %.loopexit263, %.loopexit255, %193, %191, %132, %.loopexit244
  %counter.85 = phi i32 [ %temp_116_1, %.loopexit255 ], [ %temp_107_1, %191 ], [ %temp_99_1, %.loopexit263 ], [ %temp_108_1, %193 ], [ %temp_58_1, %.loopexit244 ], [ %temp_73_1, %132 ]
  %dir_counter.85 = phi i32 [ %temp_116_2, %.loopexit255 ], [ %temp_107_2, %191 ], [ %temp_99_2, %.loopexit263 ], [ %temp_108_2, %193 ], [ %temp_58_2, %.loopexit244 ], [ %temp_73_2, %132 ]
  %159 = sext i32 %counter.85 to i64
  %output_88_ptr = getelementptr inbounds i32, ptr %in_output, i64 %159
  store i32 88, ptr %output_88_ptr, align 4
  %temp_88_1 = add i32 %counter.85, 1
  %dir_88 = sext i32 %dir_counter.85 to i64
  %dir_88_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_88
  %dir_88_value = load i32, ptr %dir_88_ptr, align 4
  %temp_88_2 = add i32 %dir_counter.85, 1
  switch i32 %dir_88_value, label %186 [
    i32 5, label %5
    i32 1, label %138
    i32 2, label %.loopexit
    i32 3, label %57
    i32 4, label %52
  ]

160:                                              ; preds = %201, %.loopexit250, %.loopexit243, %148
  %counter.86 = phi i32 [ %temp_82_1, %148 ], [ %temp_97_1, %.loopexit243 ], [ %temp_112_1, %201 ], [ %temp_103_1, %.loopexit250 ]
  %dir_counter.86 = phi i32 [ %temp_82_2, %148 ], [ %temp_97_2, %.loopexit243 ], [ %temp_112_2, %201 ], [ %temp_103_2, %.loopexit250 ]
  %161 = sext i32 %counter.86 to i64
  %output_89_ptr = getelementptr inbounds i32, ptr %in_output, i64 %161
  store i32 89, ptr %output_89_ptr, align 4
  %temp_89_1 = add i32 %counter.86, 1
  %dir_89 = sext i32 %dir_counter.86 to i64
  %dir_89_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_89
  %dir_89_value = load i32, ptr %dir_89_ptr, align 4
  %temp_89_2 = add i32 %dir_counter.86, 1
  switch i32 %dir_89_value, label %95 [
    i32 3, label %.loopexit262
    i32 1, label %18
    i32 2, label %63
  ]

162:                                              ; preds = %67, %203, %26, %5
  %counter.87 = phi i32 [ %temp_3_1, %5 ], [ %temp_37_1, %67 ], [ %temp_113_1, %203 ], [ %temp_15_1, %26 ]
  %dir_counter.87 = phi i32 [ %temp_3_2, %5 ], [ %temp_37_2, %67 ], [ %temp_113_2, %203 ], [ %temp_15_2, %26 ]
  %163 = sext i32 %counter.87 to i64
  %output_90_ptr = getelementptr inbounds i32, ptr %in_output, i64 %163
  store i32 90, ptr %output_90_ptr, align 4
  %temp_90_1 = add i32 %counter.87, 1
  %dir_90 = sext i32 %dir_counter.87 to i64
  %dir_90_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_90
  %dir_90_value = load i32, ptr %dir_90_ptr, align 4
  %temp_90_2 = add i32 %dir_counter.87, 1
  switch i32 %dir_90_value, label %18 [
    i32 7, label %.preheader245.preheader
    i32 1, label %170
    i32 2, label %5
    i32 3, label %148
    i32 4, label %3
    i32 5, label %69
    i32 6, label %.loopexit243
  ]

164:                                              ; preds = %.loopexit260, %93, %170
  %counter.88 = phi i32 [ %temp_51_1, %93 ], [ %temp_94_1, %170 ], [ %temp_18_1, %.loopexit260 ]
  %dir_counter.88 = phi i32 [ %temp_51_2, %93 ], [ %temp_94_2, %170 ], [ %temp_18_2, %.loopexit260 ]
  %165 = sext i32 %counter.88 to i64
  %output_91_ptr = getelementptr inbounds i32, ptr %in_output, i64 %165
  store i32 91, ptr %output_91_ptr, align 4
  %temp_91_1 = add i32 %counter.88, 1
  %dir_91 = sext i32 %dir_counter.88 to i64
  %dir_91_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_91
  %dir_91_value = load i32, ptr %dir_91_ptr, align 4
  %temp_91_2 = add i32 %dir_counter.88, 1
  switch i32 %dir_91_value, label %116 [
    i32 5, label %.loopexit246
    i32 1, label %111
    i32 2, label %199
    i32 3, label %197
    i32 4, label %35
  ]

166:                                              ; preds = %193, %177, %.loopexit252, %67, %20
  %counter.89 = phi i32 [ %temp_98_1, %177 ], [ %temp_37_1, %67 ], [ %temp_11_1, %20 ], [ %temp_108_1, %193 ], [ %temp_76_1, %.loopexit252 ]
  %dir_counter.89 = phi i32 [ %temp_98_2, %177 ], [ %temp_37_2, %67 ], [ %temp_11_2, %20 ], [ %temp_108_2, %193 ], [ %temp_76_2, %.loopexit252 ]
  %167 = sext i32 %counter.89 to i64
  %output_92_ptr = getelementptr inbounds i32, ptr %in_output, i64 %167
  store i32 92, ptr %output_92_ptr, align 4
  %temp_92_1 = add i32 %counter.89, 1
  %dir_92 = sext i32 %dir_counter.89 to i64
  %dir_92_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_92
  %dir_92_value = load i32, ptr %dir_92_ptr, align 4
  %temp_92_2 = add i32 %dir_counter.89, 1
  switch i32 %dir_92_value, label %.loopexit269 [
    i32 2, label %.preheader245.preheader
    i32 1, label %180
  ]

.preheader245.preheader:                          ; preds = %71, %.loopexit262, %154, %199, %162, %166
  %counter.99.ph = phi i32 [ %temp_92_1, %166 ], [ %temp_90_1, %162 ], [ %temp_86_1, %154 ], [ %temp_111_1, %199 ], [ %temp_39_1, %71 ], [ %temp_71_1, %.loopexit262 ]
  %dir_counter.99.ph = phi i32 [ %temp_92_2, %166 ], [ %temp_90_2, %162 ], [ %temp_86_2, %154 ], [ %temp_111_2, %199 ], [ %temp_39_2, %71 ], [ %temp_71_2, %.loopexit262 ]
  br label %.preheader245

168:                                              ; preds = %.loopexit255, %142, %107, %.loopexit259, %20, %18, %12
  %counter.90 = phi i32 [ %temp_79_1, %142 ], [ %temp_116_1, %.loopexit255 ], [ %temp_7_1, %12 ], [ %temp_42_1, %.loopexit259 ], [ %temp_11_1, %20 ], [ %temp_59_1, %107 ], [ %temp_10_1, %18 ]
  %dir_counter.90 = phi i32 [ %temp_79_2, %142 ], [ %temp_116_2, %.loopexit255 ], [ %temp_7_2, %12 ], [ %temp_42_2, %.loopexit259 ], [ %temp_11_2, %20 ], [ %temp_59_2, %107 ], [ %temp_10_2, %18 ]
  %169 = sext i32 %counter.90 to i64
  %output_93_ptr = getelementptr inbounds i32, ptr %in_output, i64 %169
  store i32 93, ptr %output_93_ptr, align 4
  %temp_93_1 = add i32 %counter.90, 1
  %dir_93 = sext i32 %dir_counter.90 to i64
  %dir_93_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_93
  %dir_93_value = load i32, ptr %dir_93_ptr, align 4
  %temp_93_2 = add i32 %dir_counter.90, 1
  switch i32 %dir_93_value, label %18 [
    i32 3, label %41
    i32 1, label %119
    i32 2, label %154
  ]

170:                                              ; preds = %209, %195, %162, %73, %39, %.loopexit260
  %counter.91 = phi i32 [ %temp_18_1, %.loopexit260 ], [ %temp_117_1, %209 ], [ %temp_109_1, %195 ], [ %temp_40_1, %73 ], [ %temp_90_1, %162 ], [ %temp_22_1, %39 ]
  %dir_counter.91 = phi i32 [ %temp_18_2, %.loopexit260 ], [ %temp_117_2, %209 ], [ %temp_109_2, %195 ], [ %temp_40_2, %73 ], [ %temp_90_2, %162 ], [ %temp_22_2, %39 ]
  %171 = sext i32 %counter.91 to i64
  %output_94_ptr = getelementptr inbounds i32, ptr %in_output, i64 %171
  store i32 94, ptr %output_94_ptr, align 4
  %temp_94_1 = add i32 %counter.91, 1
  %dir_94 = sext i32 %dir_counter.91 to i64
  %dir_94_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_94
  %dir_94_value = load i32, ptr %dir_94_ptr, align 4
  %temp_94_2 = add i32 %dir_counter.91, 1
  switch i32 %dir_94_value, label %35 [
    i32 8, label %119
    i32 1, label %33
    i32 2, label %189
    i32 3, label %199
    i32 4, label %.loopexit256
    i32 5, label %73
    i32 6, label %.loopexit254
    i32 7, label %164
  ]

172:                                              ; preds = %81, %213, %203, %41, %28
  %counter.92 = phi i32 [ %temp_113_1, %203 ], [ %temp_23_1, %41 ], [ %temp_16_1, %28 ], [ %temp_119_1, %213 ], [ %temp_45_1, %81 ]
  %dir_counter.92 = phi i32 [ %temp_113_2, %203 ], [ %temp_23_2, %41 ], [ %temp_16_2, %28 ], [ %temp_119_2, %213 ], [ %temp_45_2, %81 ]
  %173 = sext i32 %counter.92 to i64
  %output_95_ptr = getelementptr inbounds i32, ptr %in_output, i64 %173
  store i32 95, ptr %output_95_ptr, align 4
  %temp_95_1 = add i32 %counter.92, 1
  %dir_95 = sext i32 %dir_counter.92 to i64
  %dir_95_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_95
  %dir_95_value = load i32, ptr %dir_95_ptr, align 4
  %temp_95_2 = add i32 %dir_counter.92, 1
  switch i32 %dir_95_value, label %211 [
    i32 8, label %209
    i32 1, label %140
    i32 2, label %69
    i32 3, label %30
    i32 4, label %206
    i32 5, label %48
    i32 6, label %33
    i32 7, label %127
  ]

174:                                              ; preds = %18, %.loopexit243, %134, %87, %.loopexit254
  %counter.93 = phi i32 [ %temp_48_1, %87 ], [ %temp_14_1, %.loopexit254 ], [ %temp_97_1, %.loopexit243 ], [ %temp_10_1, %18 ], [ %temp_74_1, %134 ]
  %dir_counter.93 = phi i32 [ %temp_48_2, %87 ], [ %temp_14_2, %.loopexit254 ], [ %temp_97_2, %.loopexit243 ], [ %temp_10_2, %18 ], [ %temp_74_2, %134 ]
  %175 = sext i32 %counter.93 to i64
  %output_96_ptr = getelementptr inbounds i32, ptr %in_output, i64 %175
  store i32 96, ptr %output_96_ptr, align 4
  %temp_96_1 = add i32 %counter.93, 1
  %dir_96 = sext i32 %dir_counter.93 to i64
  %dir_96_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_96
  %dir_96_value = load i32, ptr %dir_96_ptr, align 4
  %temp_96_2 = add i32 %dir_counter.93, 1
  switch i32 %dir_96_value, label %8 [
    i32 7, label %156
    i32 1, label %180
    i32 2, label %.loopexit256
    i32 3, label %189
    i32 4, label %.loopexit255
    i32 5, label %144
    i32 6, label %.loopexit250
  ]

.loopexit243:                                     ; preds = %.preheader, %.loopexit255, %162, %59
  %counter.94 = phi i32 [ %temp_33_1, %59 ], [ %temp_90_1, %162 ], [ %temp_116_1, %.loopexit255 ], [ %temp_84_1, %.preheader ]
  %dir_counter.94 = phi i32 [ %temp_33_2, %59 ], [ %temp_90_2, %162 ], [ %temp_116_2, %.loopexit255 ], [ %temp_84_2, %.preheader ]
  %176 = sext i32 %counter.94 to i64
  %output_97_ptr = getelementptr inbounds i32, ptr %in_output, i64 %176
  store i32 97, ptr %output_97_ptr, align 4
  %temp_97_1 = add i32 %counter.94, 1
  %dir_97 = sext i32 %dir_counter.94 to i64
  %dir_97_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_97
  %dir_97_value = load i32, ptr %dir_97_ptr, align 4
  %temp_97_2 = add i32 %dir_counter.94, 1
  switch i32 %dir_97_value, label %193 [
    i32 7, label %.loopexit246
    i32 1, label %common.ret
    i32 2, label %174
    i32 3, label %160
    i32 4, label %48
    i32 5, label %41
    i32 6, label %71
  ]

177:                                              ; preds = %197, %109, %12, %5
  %counter.95 = phi i32 [ %temp_7_1, %12 ], [ %temp_3_1, %5 ], [ %temp_60_1, %109 ], [ %temp_110_1, %197 ]
  %dir_counter.95 = phi i32 [ %temp_7_2, %12 ], [ %temp_3_2, %5 ], [ %temp_60_2, %109 ], [ %temp_110_2, %197 ]
  %178 = sext i32 %counter.95 to i64
  %output_98_ptr = getelementptr inbounds i32, ptr %in_output, i64 %178
  store i32 98, ptr %output_98_ptr, align 4
  %temp_98_1 = add i32 %counter.95, 1
  %dir_98 = sext i32 %dir_counter.95 to i64
  %dir_98_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_98
  %dir_98_value = load i32, ptr %dir_98_ptr, align 4
  %temp_98_2 = add i32 %dir_counter.95, 1
  switch i32 %dir_98_value, label %125 [
    i32 5, label %154
    i32 1, label %37
    i32 2, label %12
    i32 3, label %166
    i32 4, label %199
  ]

.loopexit263:                                     ; preds = %.preheader257, %199, %35, %5
  %counter.96 = phi i32 [ %temp_20_1, %35 ], [ %temp_3_1, %5 ], [ %temp_111_1, %199 ], [ %temp_63_1, %.preheader257 ]
  %dir_counter.96 = phi i32 [ %temp_20_2, %35 ], [ %temp_3_2, %5 ], [ %temp_111_2, %199 ], [ %temp_63_2, %.preheader257 ]
  %179 = sext i32 %counter.96 to i64
  %output_99_ptr = getelementptr inbounds i32, ptr %in_output, i64 %179
  store i32 99, ptr %output_99_ptr, align 4
  %temp_99_1 = add i32 %counter.96, 1
  %dir_99 = sext i32 %dir_counter.96 to i64
  %dir_99_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_99
  %dir_99_value = load i32, ptr %dir_99_ptr, align 4
  %temp_99_2 = add i32 %dir_counter.96, 1
  switch i32 %dir_99_value, label %59 [
    i32 3, label %158
    i32 1, label %180
    i32 2, label %16
  ]

180:                                              ; preds = %28, %113, %146, %.loopexit248, %.loopexit263, %174, %166, %93, %43, %26
  %counter.97 = phi i32 [ %temp_99_1, %.loopexit263 ], [ %temp_51_1, %93 ], [ %temp_120_1, %.loopexit248 ], [ %temp_92_1, %166 ], [ %temp_81_1, %146 ], [ %temp_96_1, %174 ], [ %temp_16_1, %28 ], [ %temp_24_1, %43 ], [ %temp_62_1, %113 ], [ %temp_15_1, %26 ]
  %dir_counter.97 = phi i32 [ %temp_99_2, %.loopexit263 ], [ %temp_51_2, %93 ], [ %temp_120_2, %.loopexit248 ], [ %temp_92_2, %166 ], [ %temp_81_2, %146 ], [ %temp_96_2, %174 ], [ %temp_16_2, %28 ], [ %temp_24_2, %43 ], [ %temp_62_2, %113 ], [ %temp_15_2, %26 ]
  %181 = sext i32 %counter.97 to i64
  %output_100_ptr = getelementptr inbounds i32, ptr %in_output, i64 %181
  store i32 100, ptr %output_100_ptr, align 4
  %temp_100_1 = add i32 %counter.97, 1
  %dir_100 = sext i32 %dir_counter.97 to i64
  %dir_100_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_100
  %dir_100_value = load i32, ptr %dir_100_ptr, align 4
  %temp_100_2 = add i32 %dir_counter.97, 1
  switch i32 %dir_100_value, label %186 [
    i32 5, label %104
    i32 1, label %102
    i32 2, label %.loopexit262
    i32 3, label %59
    i32 4, label %127
  ]

182:                                              ; preds = %140, %.loopexit255, %146, %130, %125, %.loopexit269, %102, %50, %41, %3
  %counter.98 = phi i32 [ %temp_69_1, %125 ], [ %temp_23_1, %41 ], [ %temp_65_1, %.loopexit269 ], [ %temp_72_1, %130 ], [ %temp_81_1, %146 ], [ %temp_28_1, %50 ], [ %temp_116_1, %.loopexit255 ], [ %temp_56_1, %102 ], [ %temp_78_1, %140 ], [ %temp_2_1, %3 ]
  %dir_counter.98 = phi i32 [ %temp_69_2, %125 ], [ %temp_23_2, %41 ], [ %temp_65_2, %.loopexit269 ], [ %temp_72_2, %130 ], [ %temp_81_2, %146 ], [ %temp_28_2, %50 ], [ %temp_116_2, %.loopexit255 ], [ %temp_56_2, %102 ], [ %temp_78_2, %140 ], [ %temp_2_2, %3 ]
  %183 = sext i32 %counter.98 to i64
  %output_101_ptr = getelementptr inbounds i32, ptr %in_output, i64 %183
  store i32 101, ptr %output_101_ptr, align 4
  %temp_101_1 = add i32 %counter.98, 1
  %dir_101 = sext i32 %dir_counter.98 to i64
  %dir_101_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_101
  %dir_101_value = load i32, ptr %dir_101_ptr, align 4
  %temp_101_2 = add i32 %dir_counter.98, 1
  switch i32 %dir_101_value, label %125 [
    i32 8, label %.preheader257.preheader
    i32 1, label %107
    i32 2, label %3
    i32 3, label %93
    i32 4, label %193
    i32 5, label %79
    i32 6, label %39
    i32 7, label %61
  ]

.preheader257.preheader:                          ; preds = %.preheader265, %3, %.loopexit267, %.loopexit244, %182
  %counter.60.ph = phi i32 [ %temp_2_1, %3 ], [ %temp_105_1, %.loopexit267 ], [ %temp_101_1, %182 ], [ %temp_58_1, %.loopexit244 ], [ %temp_26_1, %.preheader265 ]
  %dir_counter.60.ph = phi i32 [ %temp_2_2, %3 ], [ %temp_105_2, %.loopexit267 ], [ %temp_101_2, %182 ], [ %temp_58_2, %.loopexit244 ], [ %temp_26_2, %.preheader265 ]
  br label %.preheader257

.preheader245:                                    ; preds = %.preheader245.preheader, %.preheader245
  %counter.99 = phi i32 [ %temp_102_1, %.preheader245 ], [ %counter.99.ph, %.preheader245.preheader ]
  %dir_counter.99 = phi i32 [ %temp_102_2, %.preheader245 ], [ %dir_counter.99.ph, %.preheader245.preheader ]
  %184 = sext i32 %counter.99 to i64
  %output_102_ptr = getelementptr inbounds i32, ptr %in_output, i64 %184
  store i32 102, ptr %output_102_ptr, align 4
  %temp_102_1 = add i32 %counter.99, 1
  %dir_102 = sext i32 %dir_counter.99 to i64
  %dir_102_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_102
  %dir_102_value = load i32, ptr %dir_102_ptr, align 4
  %temp_102_2 = add i32 %dir_counter.99, 1
  switch i32 %dir_102_value, label %.preheader245 [
    i32 3, label %.loopexit246
    i32 1, label %.loopexit247
    i32 2, label %.loopexit248
  ]

.loopexit250:                                     ; preds = %.preheader249, %77, %50, %174, %81, %61, %.loopexit251
  %counter.100 = phi i32 [ %temp_45_1, %81 ], [ %temp_28_1, %50 ], [ %temp_43_1, %77 ], [ %temp_96_1, %174 ], [ %temp_30_1, %.loopexit251 ], [ %temp_34_1, %61 ], [ %temp_4_1, %.preheader249 ]
  %dir_counter.100 = phi i32 [ %temp_45_2, %81 ], [ %temp_28_2, %50 ], [ %temp_43_2, %77 ], [ %temp_96_2, %174 ], [ %temp_30_2, %.loopexit251 ], [ %temp_34_2, %61 ], [ %temp_4_2, %.preheader249 ]
  %185 = sext i32 %counter.100 to i64
  %output_103_ptr = getelementptr inbounds i32, ptr %in_output, i64 %185
  store i32 103, ptr %output_103_ptr, align 4
  %temp_103_1 = add i32 %counter.100, 1
  %dir_103 = sext i32 %dir_counter.100 to i64
  %dir_103_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_103
  %dir_103_value = load i32, ptr %dir_103_ptr, align 4
  %temp_103_2 = add i32 %dir_counter.100, 1
  switch i32 %dir_103_value, label %134 [
    i32 5, label %.loopexit261
    i32 1, label %5
    i32 2, label %14
    i32 3, label %160
    i32 4, label %83
  ]

186:                                              ; preds = %211, %180, %158, %.loopexit261, %102, %43
  %counter.101 = phi i32 [ %temp_24_1, %43 ], [ %temp_100_1, %180 ], [ %temp_88_1, %158 ], [ %temp_56_1, %102 ], [ %temp_75_1, %.loopexit261 ], [ %temp_118_1, %211 ]
  %dir_counter.101 = phi i32 [ %temp_24_2, %43 ], [ %temp_100_2, %180 ], [ %temp_88_2, %158 ], [ %temp_56_2, %102 ], [ %temp_75_2, %.loopexit261 ], [ %temp_118_2, %211 ]
  %187 = sext i32 %counter.101 to i64
  %output_104_ptr = getelementptr inbounds i32, ptr %in_output, i64 %187
  store i32 104, ptr %output_104_ptr, align 4
  %temp_104_1 = add i32 %counter.101, 1
  %dir_104 = sext i32 %dir_counter.101 to i64
  %dir_104_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_104
  %dir_104_value = load i32, ptr %dir_104_ptr, align 4
  %temp_104_2 = add i32 %dir_counter.101, 1
  switch i32 %dir_104_value, label %.loopexit252 [
    i32 3, label %61
    i32 1, label %30
    i32 2, label %.loopexit260
  ]

.loopexit267:                                     ; preds = %.preheader265, %.loopexit261, %.loopexit247, %91, %.loopexit256, %55
  %counter.102 = phi i32 [ %temp_50_1, %91 ], [ %temp_41_1, %.loopexit256 ], [ %temp_75_1, %.loopexit261 ], [ %temp_83_1, %.loopexit247 ], [ %temp_31_1, %55 ], [ %temp_26_1, %.preheader265 ]
  %dir_counter.102 = phi i32 [ %temp_50_2, %91 ], [ %temp_41_2, %.loopexit256 ], [ %temp_75_2, %.loopexit261 ], [ %temp_83_2, %.loopexit247 ], [ %temp_31_2, %55 ], [ %temp_26_2, %.preheader265 ]
  %188 = sext i32 %counter.102 to i64
  %output_105_ptr = getelementptr inbounds i32, ptr %in_output, i64 %188
  store i32 105, ptr %output_105_ptr, align 4
  %temp_105_1 = add i32 %counter.102, 1
  %dir_105 = sext i32 %dir_counter.102 to i64
  %dir_105_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_105
  %dir_105_value = load i32, ptr %dir_105_ptr, align 4
  %temp_105_2 = add i32 %dir_counter.102, 1
  switch i32 %dir_105_value, label %65 [
    i32 8, label %.preheader257.preheader
    i32 1, label %93
    i32 2, label %.backedge
    i32 3, label %95
    i32 4, label %41
    i32 5, label %142
    i32 6, label %.loopexit
    i32 7, label %.loopexit251
  ]

189:                                              ; preds = %125, %174, %170, %.loopexit262, %93, %41
  %counter.103 = phi i32 [ %temp_51_1, %93 ], [ %temp_96_1, %174 ], [ %temp_94_1, %170 ], [ %temp_23_1, %41 ], [ %temp_69_1, %125 ], [ %temp_71_1, %.loopexit262 ]
  %dir_counter.103 = phi i32 [ %temp_51_2, %93 ], [ %temp_96_2, %174 ], [ %temp_94_2, %170 ], [ %temp_23_2, %41 ], [ %temp_69_2, %125 ], [ %temp_71_2, %.loopexit262 ]
  %190 = sext i32 %counter.103 to i64
  %output_106_ptr = getelementptr inbounds i32, ptr %in_output, i64 %190
  store i32 106, ptr %output_106_ptr, align 4
  %temp_106_1 = add i32 %counter.103, 1
  %dir_106 = sext i32 %dir_counter.103 to i64
  %dir_106_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_106
  %dir_106_value = load i32, ptr %dir_106_ptr, align 4
  %temp_106_2 = add i32 %dir_counter.103, 1
  switch i32 %dir_106_value, label %41 [
    i32 2, label %.loopexit256
    i32 1, label %123
  ]

191:                                              ; preds = %.loopexit269, %77, %.loopexit
  %counter.104 = phi i32 [ %temp_12_1, %.loopexit ], [ %temp_43_1, %77 ], [ %temp_65_1, %.loopexit269 ]
  %dir_counter.104 = phi i32 [ %temp_12_2, %.loopexit ], [ %temp_43_2, %77 ], [ %temp_65_2, %.loopexit269 ]
  %192 = sext i32 %counter.104 to i64
  %output_107_ptr = getelementptr inbounds i32, ptr %in_output, i64 %192
  store i32 107, ptr %output_107_ptr, align 4
  %temp_107_1 = add i32 %counter.104, 1
  %dir_107 = sext i32 %dir_counter.104 to i64
  %dir_107_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_107
  %dir_107_value = load i32, ptr %dir_107_ptr, align 4
  %temp_107_2 = add i32 %dir_counter.104, 1
  switch i32 %dir_107_value, label %206 [
    i32 6, label %148
    i32 1, label %.preheader.preheader
    i32 2, label %211
    i32 3, label %104
    i32 4, label %.loopexit248
    i32 5, label %158
  ]

.preheader.preheader:                             ; preds = %3, %8, %79, %138, %191
  %counter.81.ph = phi i32 [ %temp_107_1, %191 ], [ %temp_77_1, %138 ], [ %temp_5_1, %8 ], [ %temp_2_1, %3 ], [ %temp_44_1, %79 ]
  %dir_counter.81.ph = phi i32 [ %temp_107_2, %191 ], [ %temp_77_2, %138 ], [ %temp_5_2, %8 ], [ %temp_2_2, %3 ], [ %temp_44_2, %79 ]
  br label %.preheader

193:                                              ; preds = %109, %182, %.loopexit243, %.loopexit244, %104, %55, %30, %16
  %counter.105 = phi i32 [ %temp_97_1, %.loopexit243 ], [ %temp_57_1, %104 ], [ %temp_17_1, %30 ], [ %temp_60_1, %109 ], [ %temp_101_1, %182 ], [ %temp_31_1, %55 ], [ %temp_9_1, %16 ], [ %temp_58_1, %.loopexit244 ]
  %dir_counter.105 = phi i32 [ %temp_97_2, %.loopexit243 ], [ %temp_57_2, %104 ], [ %temp_17_2, %30 ], [ %temp_60_2, %109 ], [ %temp_101_2, %182 ], [ %temp_31_2, %55 ], [ %temp_9_2, %16 ], [ %temp_58_2, %.loopexit244 ]
  %194 = sext i32 %counter.105 to i64
  %output_108_ptr = getelementptr inbounds i32, ptr %in_output, i64 %194
  store i32 108, ptr %output_108_ptr, align 4
  %temp_108_1 = add i32 %counter.105, 1
  %dir_108 = sext i32 %dir_counter.105 to i64
  %dir_108_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_108
  %dir_108_value = load i32, ptr %dir_108_ptr, align 4
  %temp_108_2 = add i32 %dir_counter.105, 1
  switch i32 %dir_108_value, label %52 [
    i32 6, label %166
    i32 1, label %55
    i32 2, label %.loopexit256
    i32 3, label %116
    i32 4, label %158
    i32 5, label %113
  ]

195:                                              ; preds = %209, %201, %154, %134, %89, %55, %37, %23
  %counter.106 = phi i32 [ %temp_117_1, %209 ], [ %temp_49_1, %89 ], [ %temp_86_1, %154 ], [ %temp_31_1, %55 ], [ %temp_112_1, %201 ], [ %temp_13_1, %23 ], [ %temp_21_1, %37 ], [ %temp_74_1, %134 ]
  %dir_counter.106 = phi i32 [ %temp_117_2, %209 ], [ %temp_49_2, %89 ], [ %temp_86_2, %154 ], [ %temp_31_2, %55 ], [ %temp_112_2, %201 ], [ %temp_13_2, %23 ], [ %temp_21_2, %37 ], [ %temp_74_2, %134 ]
  %196 = sext i32 %counter.106 to i64
  %output_109_ptr = getelementptr inbounds i32, ptr %in_output, i64 %196
  store i32 109, ptr %output_109_ptr, align 4
  %temp_109_1 = add i32 %counter.106, 1
  %dir_109 = sext i32 %dir_counter.106 to i64
  %dir_109_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_109
  %dir_109_value = load i32, ptr %dir_109_ptr, align 4
  %temp_109_2 = add i32 %dir_counter.106, 1
  switch i32 %dir_109_value, label %79 [
    i32 5, label %211
    i32 1, label %130
    i32 2, label %142
    i32 3, label %209
    i32 4, label %170
  ]

197:                                              ; preds = %100, %.loopexit258, %164, %85, %41, %.loopexit254
  %counter.107 = phi i32 [ %temp_47_1, %85 ], [ %temp_55_1, %100 ], [ %temp_91_1, %164 ], [ %temp_14_1, %.loopexit254 ], [ %temp_114_1, %.loopexit258 ], [ %temp_23_1, %41 ]
  %dir_counter.107 = phi i32 [ %temp_47_2, %85 ], [ %temp_55_2, %100 ], [ %temp_91_2, %164 ], [ %temp_14_2, %.loopexit254 ], [ %temp_114_2, %.loopexit258 ], [ %temp_23_2, %41 ]
  %198 = sext i32 %counter.107 to i64
  %output_110_ptr = getelementptr inbounds i32, ptr %in_output, i64 %198
  store i32 110, ptr %output_110_ptr, align 4
  %temp_110_1 = add i32 %counter.107, 1
  %dir_110 = sext i32 %dir_counter.107 to i64
  %dir_110_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_110
  %dir_110_value = load i32, ptr %dir_110_ptr, align 4
  %temp_110_2 = add i32 %dir_counter.107, 1
  switch i32 %dir_110_value, label %65 [
    i32 8, label %.loopexit246
    i32 1, label %.loopexit247
    i32 2, label %52
    i32 3, label %12
    i32 4, label %211
    i32 5, label %18
    i32 6, label %177
    i32 7, label %119
  ]

199:                                              ; preds = %177, %170, %164, %.loopexit251, %18
  %counter.108 = phi i32 [ %temp_30_1, %.loopexit251 ], [ %temp_98_1, %177 ], [ %temp_91_1, %164 ], [ %temp_94_1, %170 ], [ %temp_10_1, %18 ]
  %dir_counter.108 = phi i32 [ %temp_30_2, %.loopexit251 ], [ %temp_98_2, %177 ], [ %temp_91_2, %164 ], [ %temp_94_2, %170 ], [ %temp_10_2, %18 ]
  %200 = sext i32 %counter.108 to i64
  %output_111_ptr = getelementptr inbounds i32, ptr %in_output, i64 %200
  store i32 111, ptr %output_111_ptr, align 4
  %temp_111_1 = add i32 %counter.108, 1
  %dir_111 = sext i32 %dir_counter.108 to i64
  %dir_111_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_111
  %dir_111_value = load i32, ptr %dir_111_ptr, align 4
  %temp_111_2 = add i32 %dir_counter.108, 1
  switch i32 %dir_111_value, label %203 [
    i32 7, label %48
    i32 1, label %87
    i32 2, label %37
    i32 3, label %119
    i32 4, label %.loopexit263
    i32 5, label %.preheader245.preheader
    i32 6, label %.loopexit258
  ]

201:                                              ; preds = %148, %113, %98, %93, %57, %45
  %counter.109 = phi i32 [ %temp_62_1, %113 ], [ %temp_82_1, %148 ], [ %temp_51_1, %93 ], [ %temp_32_1, %57 ], [ %temp_25_1, %45 ], [ %temp_54_1, %98 ]
  %dir_counter.109 = phi i32 [ %temp_62_2, %113 ], [ %temp_82_2, %148 ], [ %temp_51_2, %93 ], [ %temp_32_2, %57 ], [ %temp_25_2, %45 ], [ %temp_54_2, %98 ]
  %202 = sext i32 %counter.109 to i64
  %output_112_ptr = getelementptr inbounds i32, ptr %in_output, i64 %202
  store i32 112, ptr %output_112_ptr, align 4
  %temp_112_1 = add i32 %counter.109, 1
  %dir_112 = sext i32 %dir_counter.109 to i64
  %dir_112_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_112
  %dir_112_value = load i32, ptr %dir_112_ptr, align 4
  %temp_112_2 = add i32 %dir_counter.109, 1
  switch i32 %dir_112_value, label %71 [
    i32 4, label %.loopexit246
    i32 1, label %160
    i32 2, label %195
    i32 3, label %.loopexit262
  ]

203:                                              ; preds = %199, %.loopexit244, %89, %83, %26, %23, %10
  %counter.110 = phi i32 [ %temp_111_1, %199 ], [ %temp_49_1, %89 ], [ %temp_6_1, %10 ], [ %temp_46_1, %83 ], [ %temp_13_1, %23 ], [ %temp_15_1, %26 ], [ %temp_58_1, %.loopexit244 ]
  %dir_counter.110 = phi i32 [ %temp_111_2, %199 ], [ %temp_49_2, %89 ], [ %temp_6_2, %10 ], [ %temp_46_2, %83 ], [ %temp_13_2, %23 ], [ %temp_15_2, %26 ], [ %temp_58_2, %.loopexit244 ]
  %204 = sext i32 %counter.110 to i64
  %output_113_ptr = getelementptr inbounds i32, ptr %in_output, i64 %204
  store i32 113, ptr %output_113_ptr, align 4
  %temp_113_1 = add i32 %counter.110, 1
  %dir_113 = sext i32 %dir_counter.110 to i64
  %dir_113_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_113
  %dir_113_value = load i32, ptr %dir_113_ptr, align 4
  %temp_113_2 = add i32 %dir_counter.110, 1
  switch i32 %dir_113_value, label %39 [
    i32 3, label %109
    i32 1, label %162
    i32 2, label %172
  ]

.loopexit258:                                     ; preds = %.preheader257, %199, %.loopexit262, %41
  %counter.111 = phi i32 [ %temp_23_1, %41 ], [ %temp_111_1, %199 ], [ %temp_71_1, %.loopexit262 ], [ %temp_63_1, %.preheader257 ]
  %dir_counter.111 = phi i32 [ %temp_23_2, %41 ], [ %temp_111_2, %199 ], [ %temp_71_2, %.loopexit262 ], [ %temp_63_2, %.preheader257 ]
  %205 = sext i32 %counter.111 to i64
  %output_114_ptr = getelementptr inbounds i32, ptr %in_output, i64 %205
  store i32 114, ptr %output_114_ptr, align 4
  %temp_114_1 = add i32 %counter.111, 1
  %dir_114 = sext i32 %dir_counter.111 to i64
  %dir_114_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_114
  %dir_114_value = load i32, ptr %dir_114_ptr, align 4
  %temp_114_2 = add i32 %dir_counter.111, 1
  switch i32 %dir_114_value, label %20 [
    i32 6, label %134
    i32 1, label %197
    i32 2, label %28
    i32 3, label %206
    i32 4, label %140
    i32 5, label %119
  ]

206:                                              ; preds = %.loopexit258, %191, %172, %123, %121, %.loopexit270, %20
  %counter.112 = phi i32 [ %temp_68_1, %123 ], [ %temp_11_1, %20 ], [ %temp_107_1, %191 ], [ %temp_53_1, %.loopexit270 ], [ %temp_114_1, %.loopexit258 ], [ %temp_95_1, %172 ], [ %temp_67_1, %121 ]
  %dir_counter.112 = phi i32 [ %temp_68_2, %123 ], [ %temp_11_2, %20 ], [ %temp_107_2, %191 ], [ %temp_53_2, %.loopexit270 ], [ %temp_114_2, %.loopexit258 ], [ %temp_95_2, %172 ], [ %temp_67_2, %121 ]
  %207 = sext i32 %counter.112 to i64
  %output_115_ptr = getelementptr inbounds i32, ptr %in_output, i64 %207
  store i32 115, ptr %output_115_ptr, align 4
  %temp_115_1 = add i32 %counter.112, 1
  %dir_115 = sext i32 %dir_counter.112 to i64
  %dir_115_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_115
  %dir_115_value = load i32, ptr %dir_115_ptr, align 4
  %temp_115_2 = add i32 %dir_counter.112, 1
  switch i32 %dir_115_value, label %41 [
    i32 5, label %common.ret
    i32 1, label %35
    i32 2, label %59
    i32 3, label %100
    i32 4, label %50
  ]

.loopexit255:                                     ; preds = %.preheader249, %174, %100, %73
  %counter.113 = phi i32 [ %temp_55_1, %100 ], [ %temp_96_1, %174 ], [ %temp_40_1, %73 ], [ %temp_4_1, %.preheader249 ]
  %dir_counter.113 = phi i32 [ %temp_55_2, %100 ], [ %temp_96_2, %174 ], [ %temp_40_2, %73 ], [ %temp_4_2, %.preheader249 ]
  %208 = sext i32 %counter.113 to i64
  %output_116_ptr = getelementptr inbounds i32, ptr %in_output, i64 %208
  store i32 116, ptr %output_116_ptr, align 4
  %temp_116_1 = add i32 %counter.113, 1
  %dir_116 = sext i32 %dir_counter.113 to i64
  %dir_116_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_116
  %dir_116_value = load i32, ptr %dir_116_ptr, align 4
  %temp_116_2 = add i32 %dir_counter.113, 1
  switch i32 %dir_116_value, label %168 [
    i32 6, label %93
    i32 1, label %.loopexit243
    i32 2, label %182
    i32 3, label %12
    i32 4, label %116
    i32 5, label %158
  ]

209:                                              ; preds = %213, %172, %195, %144, %.loopexit261, %.loopexit
  %counter.114 = phi i32 [ %temp_80_1, %144 ], [ %temp_109_1, %195 ], [ %temp_12_1, %.loopexit ], [ %temp_75_1, %.loopexit261 ], [ %temp_95_1, %172 ], [ %temp_119_1, %213 ]
  %dir_counter.114 = phi i32 [ %temp_80_2, %144 ], [ %temp_109_2, %195 ], [ %temp_12_2, %.loopexit ], [ %temp_75_2, %.loopexit261 ], [ %temp_95_2, %172 ], [ %temp_119_2, %213 ]
  %210 = sext i32 %counter.114 to i64
  %output_117_ptr = getelementptr inbounds i32, ptr %in_output, i64 %210
  store i32 117, ptr %output_117_ptr, align 4
  %temp_117_1 = add i32 %counter.114, 1
  %dir_117 = sext i32 %dir_counter.114 to i64
  %dir_117_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_117
  %dir_117_value = load i32, ptr %dir_117_ptr, align 4
  %temp_117_2 = add i32 %dir_counter.114, 1
  switch i32 %dir_117_value, label %148 [
    i32 8, label %.loopexit246
    i32 1, label %81
    i32 2, label %91
    i32 3, label %119
    i32 4, label %195
    i32 5, label %39
    i32 6, label %127
    i32 7, label %170
  ]

211:                                              ; preds = %195, %197, %191, %172, %.loopexit244, %16
  %counter.115 = phi i32 [ %temp_95_1, %172 ], [ %temp_109_1, %195 ], [ %temp_107_1, %191 ], [ %temp_9_1, %16 ], [ %temp_110_1, %197 ], [ %temp_58_1, %.loopexit244 ]
  %dir_counter.115 = phi i32 [ %temp_95_2, %172 ], [ %temp_109_2, %195 ], [ %temp_107_2, %191 ], [ %temp_9_2, %16 ], [ %temp_110_2, %197 ], [ %temp_58_2, %.loopexit244 ]
  %212 = sext i32 %counter.115 to i64
  %output_118_ptr = getelementptr inbounds i32, ptr %in_output, i64 %212
  store i32 118, ptr %output_118_ptr, align 4
  %temp_118_1 = add i32 %counter.115, 1
  %dir_118 = sext i32 %dir_counter.115 to i64
  %dir_118_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_118
  %dir_118_value = load i32, ptr %dir_118_ptr, align 4
  %temp_118_2 = add i32 %dir_counter.115, 1
  switch i32 %dir_118_value, label %123 [
    i32 3, label %.loopexit246
    i32 1, label %.loopexit
    i32 2, label %186
  ]

213:                                              ; preds = %16
  %214 = sext i32 %temp_9_1 to i64
  %output_119_ptr = getelementptr inbounds i32, ptr %in_output, i64 %214
  store i32 119, ptr %output_119_ptr, align 4
  %temp_119_1 = add i32 %counter.8, 2
  %dir_119 = sext i32 %temp_9_2 to i64
  %dir_119_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_119
  %dir_119_value = load i32, ptr %dir_119_ptr, align 4
  %temp_119_2 = add i32 %dir_counter.8, 2
  switch i32 %dir_119_value, label %146 [
    i32 4, label %209
    i32 1, label %23
    i32 2, label %63
    i32 3, label %172
  ]

.loopexit248:                                     ; preds = %.preheader245, %20, %191, %55
  %counter.116 = phi i32 [ %temp_107_1, %191 ], [ %temp_11_1, %20 ], [ %temp_31_1, %55 ], [ %temp_102_1, %.preheader245 ]
  %dir_counter.116 = phi i32 [ %temp_107_2, %191 ], [ %temp_11_2, %20 ], [ %temp_31_2, %55 ], [ %temp_102_2, %.preheader245 ]
  %215 = sext i32 %counter.116 to i64
  %output_120_ptr = getelementptr inbounds i32, ptr %in_output, i64 %215
  store i32 120, ptr %output_120_ptr, align 4
  %temp_120_1 = add i32 %counter.116, 1
  %dir_120 = sext i32 %dir_counter.116 to i64
  %dir_120_ptr = getelementptr inbounds [6 x i32], ptr %dirs, i64 0, i64 %dir_120
  %dir_120_value = load i32, ptr %dir_120_ptr, align 4
  %temp_120_2 = add i32 %dir_counter.116, 1
  switch i32 %dir_120_value, label %.loopexit260 [
    i32 2, label %142
    i32 1, label %180
  ]

common.ret:                                       ; preds = %10, %41, %55, %113, %152, %.loopexit243, %23, %206, %.preheader265, %.preheader249, %.loopexit246
  %counter.118.sink = phi i32 [ %counter.118, %.loopexit246 ], [ %temp_4_1, %.preheader249 ], [ %temp_26_1, %.preheader265 ], [ %temp_13_1, %23 ], [ %temp_62_1, %113 ], [ %temp_97_1, %.loopexit243 ], [ %temp_31_1, %55 ], [ %temp_85_1, %152 ], [ %temp_115_1, %206 ], [ %temp_6_1, %10 ], [ %temp_23_1, %41 ]
  %.sink = phi i32 [ 122, %.loopexit246 ], [ 121, %.preheader249 ], [ 121, %.preheader265 ], [ 121, %206 ], [ 121, %23 ], [ 121, %.loopexit243 ], [ 121, %152 ], [ 121, %113 ], [ 121, %55 ], [ 121, %41 ], [ 121, %10 ]
  %216 = sext i32 %counter.118.sink to i64
  %output_122_ptr = getelementptr inbounds i32, ptr %in_output, i64 %216
  store i32 %.sink, ptr %output_122_ptr, align 4
  ret void

.loopexit246:                                     ; preds = %132, %197, %89, %95, %83, %35, %.loopexit270, %98, %41, %211, %.loopexit251, %152, %65, %201, %71, %.loopexit243, %26, %164, %209, %144, %.loopexit254, %.preheader245
  %counter.118 = phi i32 [ %temp_102_1, %.preheader245 ], [ %temp_73_1, %132 ], [ %temp_15_1, %26 ], [ %temp_52_1, %95 ], [ %temp_112_1, %201 ], [ %temp_39_1, %71 ], [ %temp_110_1, %197 ], [ %temp_36_1, %65 ], [ %temp_97_1, %.loopexit243 ], [ %temp_46_1, %83 ], [ %temp_85_1, %152 ], [ %temp_54_1, %98 ], [ %temp_30_1, %.loopexit251 ], [ %temp_118_1, %211 ], [ %temp_23_1, %41 ], [ %temp_20_1, %35 ], [ %temp_14_1, %.loopexit254 ], [ %temp_91_1, %164 ], [ %temp_53_1, %.loopexit270 ], [ %temp_49_1, %89 ], [ %temp_80_1, %144 ], [ %temp_117_1, %209 ]
  br label %common.ret
}

attributes #0 = { nofree norecurse nosync nounwind memory(argmem: write) }
