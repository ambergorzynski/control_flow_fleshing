; ModuleID = 'llvm-link'
source_filename = "llvm-link"
target datalayout = "e-m:o-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-apple-macosx13.0.0"

%"class.std::__1::locale::id" = type <{ %"struct.std::__1::once_flag", i32, [4 x i8] }>
%"struct.std::__1::once_flag" = type { i64 }
%"class.std::__1::basic_ofstream" = type { %"class.std::__1::basic_ostream.base", %"class.std::__1::basic_filebuf", %"class.std::__1::basic_ios.base" }
%"class.std::__1::basic_ostream.base" = type { ptr }
%"class.std::__1::basic_filebuf" = type <{ %"class.std::__1::basic_streambuf", ptr, ptr, ptr, [8 x i8], i64, ptr, i64, ptr, ptr, %union.__mbstate_t, %union.__mbstate_t, i32, i32, i8, i8, i8, [5 x i8] }>
%"class.std::__1::basic_streambuf" = type { ptr, %"class.std::__1::basic_ostream.base", ptr, ptr, ptr, ptr, ptr, ptr }
%union.__mbstate_t = type { i64, [120 x i8] }
%"class.std::__1::basic_ios.base" = type <{ %"class.std::__1::ios_base", ptr, i32 }>
%"class.std::__1::ios_base" = type { ptr, i32, i64, i64, i32, i32, ptr, ptr, ptr, ptr, i64, i64, ptr, i64, i64, ptr, i64, i64 }
%"class.std::__1::basic_ifstream" = type { %"class.std::__1::basic_istream.base", %"class.std::__1::basic_filebuf", %"class.std::__1::basic_ios.base" }
%"class.std::__1::basic_istream.base" = type { ptr, i64 }
%"class.std::__1::basic_ostream<char>::sentry" = type { i8, ptr }
%"class.std::__1::basic_ios" = type <{ %"class.std::__1::ios_base", ptr, i32, [4 x i8] }>
%"class.std::__1::basic_string" = type { %"class.std::__1::__compressed_pair" }
%"class.std::__1::__compressed_pair" = type { %"struct.std::__1::__compressed_pair_elem" }
%"struct.std::__1::__compressed_pair_elem" = type { %"struct.std::__1::basic_string<char>::__rep" }
%"struct.std::__1::basic_string<char>::__rep" = type { %union.anon }
%union.anon = type { %"struct.std::__1::basic_string<char>::__long" }
%"struct.std::__1::basic_string<char>::__long" = type { i64, i64, ptr }
%"struct.std::__1::basic_string<char>::__short" = type { %union.anon.0, [23 x i8] }
%union.anon.0 = type { i8 }
%"class.std::__1::basic_istream" = type { ptr, i64, %"class.std::__1::basic_ios.base" }

@.str = private unnamed_addr constant [2 x i8] c"\0A\00", align 1
@.str.1 = private unnamed_addr constant [26 x i8] c"Error opening input file\0A\00", align 1
@.str.2 = private unnamed_addr constant [42 x i8] c"\09Results: Expected and actual output are \00", align 1
@.str.3 = private unnamed_addr constant [10 x i8] c"the same\0A\00", align 1
@.str.4 = private unnamed_addr constant [14 x i8] c"not the same\0A\00", align 1
@.str.5 = private unnamed_addr constant [32 x i8] c"expected and actual output are \00", align 1
@.str.6 = private unnamed_addr constant [18 x i8] c"\09Expected output:\00", align 1
@.str.7 = private unnamed_addr constant [17 x i8] c"expected output:\00", align 1
@.str.8 = private unnamed_addr constant [2 x i8] c" \00", align 1
@.str.9 = private unnamed_addr constant [4 x i8] c" %d\00", align 1
@.str.10 = private unnamed_addr constant [19 x i8] c"\0A\09Actual output:  \00", align 1
@.str.11 = private unnamed_addr constant [18 x i8] c"\0Aactual output:  \00", align 1
@_ZTVNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEE = external unnamed_addr constant { [5 x ptr], [5 x ptr] }, align 8
@_ZTTNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEE = external unnamed_addr constant [4 x ptr], align 8
@_ZTVNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE = external unnamed_addr constant { [5 x ptr], [5 x ptr] }, align 8
@_ZTTNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE = external unnamed_addr constant [4 x ptr], align 8
@_ZTVNSt3__19basic_iosIcNS_11char_traitsIcEEEE = external unnamed_addr constant { [4 x ptr] }, align 8
@_ZTVNSt3__18ios_baseE = external unnamed_addr constant { [4 x ptr] }, align 8
@_ZNSt3__15ctypeIcE2idE = external global %"class.std::__1::locale::id", align 8

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
  %condition_0 = icmp eq i32 %dir_0_value, 0
  br i1 %condition_0, label %6, label %1

1:                                                ; preds = %5, %3, %0
  %index_1 = load i32, ptr %counter, align 4
  %output_1 = load ptr, ptr %output, align 8
  %output_1_ptr = getelementptr inbounds i32, ptr %output_1, i32 %index_1
  store i32 1, ptr %output_1_ptr, align 4
  %temp_1_1 = add i32 %index_1, 1
  store i32 %temp_1_1, ptr %counter, align 4
  br label %9

2:                                                ; preds = %4
  %index_2 = load i32, ptr %counter, align 4
  %output_2 = load ptr, ptr %output, align 8
  %output_2_ptr = getelementptr inbounds i32, ptr %output_2, i32 %index_2
  store i32 2, ptr %output_2_ptr, align 4
  %temp_2_1 = add i32 %index_2, 1
  store i32 %temp_2_1, ptr %counter, align 4
  br label %3

3:                                                ; preds = %8, %2
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
  %condition_3 = icmp eq i32 %dir_3_value, 0
  br i1 %condition_3, label %1, label %5

4:                                                ; No predecessors!
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
  %condition_4 = icmp eq i32 %dir_4_value, 0
  br i1 %condition_4, label %5, label %2

5:                                                ; preds = %4, %3
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
  %condition_5 = icmp eq i32 %dir_5_value, 0
  br i1 %condition_5, label %6, label %1

6:                                                ; preds = %5, %0
  %index_6 = load i32, ptr %counter, align 4
  %output_6 = load ptr, ptr %output, align 8
  %output_6_ptr = getelementptr inbounds i32, ptr %output_6, i32 %index_6
  store i32 6, ptr %output_6_ptr, align 4
  %temp_6_1 = add i32 %index_6, 1
  store i32 %temp_6_1, ptr %counter, align 4
  br label %9

7:                                                ; preds = %7
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
  %condition_7 = icmp eq i32 %dir_7_value, 0
  br i1 %condition_7, label %9, label %7

8:                                                ; No predecessors!
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
  %condition_8 = icmp eq i32 %dir_8_value, 0
  br i1 %condition_8, label %9, label %3

9:                                                ; preds = %8, %7, %6, %1
  %index_9 = load i32, ptr %counter, align 4
  %output_9 = load ptr, ptr %output, align 8
  %output_9_ptr = getelementptr inbounds i32, ptr %output_9, i32 %index_9
  store i32 9, ptr %output_9_ptr, align 4
  %temp_9_1 = add i32 %index_9, 1
  store i32 %temp_9_1, ptr %counter, align 4
  ret void
}

; Function Attrs: noinline norecurse optnone ssp uwtable
define i32 @main(i32 %0, ptr %1) #0 personality ptr @__gxx_personality_v0 {
  %3 = alloca i32, align 4
  %4 = alloca i32, align 4
  %5 = alloca ptr, align 8
  %6 = alloca ptr, align 8
  %7 = alloca ptr, align 8
  %8 = alloca ptr, align 8
  %9 = alloca i8, align 1
  %10 = alloca i32, align 4
  %11 = alloca %"class.std::__1::basic_ofstream", align 8
  %12 = alloca %"class.std::__1::basic_ofstream", align 8
  %13 = alloca ptr, align 8
  %14 = alloca i32, align 4
  store i32 0, ptr %3, align 4
  store i32 %0, ptr %4, align 4
  store ptr %1, ptr %5, align 8
  call void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEC1Ev(ptr %11)
  invoke void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEC1Ev(ptr %12)
          to label %15 unwind label %58

15:                                               ; preds = %2
  %16 = load ptr, ptr %5, align 8
  %17 = getelementptr inbounds ptr, ptr %16, i64 1
  %18 = load ptr, ptr %17, align 8
  invoke void @_Z7read_inPKcPPiS2_S2_Ri(ptr %18, ptr %8, ptr %6, ptr %7, ptr nonnull align 4 dereferenceable(4) %10)
          to label %19 unwind label %62

19:                                               ; preds = %15
  %20 = load ptr, ptr %8, align 8
  %21 = load ptr, ptr %7, align 8
  invoke void @_Z7run_cfgPiS_(ptr %20, ptr %21)
          to label %22 unwind label %62

22:                                               ; preds = %19
  %23 = load ptr, ptr %6, align 8
  %24 = load ptr, ptr %7, align 8
  %25 = load i32, ptr %10, align 4
  %26 = invoke zeroext i1 @_Z3cmpPiS_i(ptr %23, ptr %24, i32 %25)
          to label %27 unwind label %62

27:                                               ; preds = %22
  %28 = zext i1 %26 to i8
  store i8 %28, ptr %9, align 1
  %29 = load ptr, ptr %5, align 8
  %30 = getelementptr inbounds ptr, ptr %29, i64 2
  %31 = load ptr, ptr %30, align 8
  invoke void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEE4openEPKcj(ptr %11, ptr %31, i32 1)
          to label %32 unwind label %62

32:                                               ; preds = %27
  %33 = load ptr, ptr %5, align 8
  %34 = getelementptr inbounds ptr, ptr %33, i64 3
  %35 = load ptr, ptr %34, align 8
  invoke void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEE4openEPKcj(ptr %12, ptr %35, i32 1)
          to label %36 unwind label %62

36:                                               ; preds = %32
  %37 = load ptr, ptr %5, align 8
  %38 = getelementptr inbounds ptr, ptr %37, i64 1
  %39 = load ptr, ptr %38, align 8
  %40 = load i8, ptr %9, align 1
  %41 = trunc i8 %40 to i1
  %42 = load ptr, ptr %6, align 8
  %43 = load ptr, ptr %7, align 8
  %44 = load i32, ptr %10, align 4
  invoke void @_Z13record_outputRNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEEPcbPiS6_i(ptr nonnull align 8 dereferenceable(416) %11, ptr %39, i1 zeroext %41, ptr %42, ptr %43, i32 %44)
          to label %45 unwind label %62

45:                                               ; preds = %36
  %46 = load i8, ptr %9, align 1
  %47 = trunc i8 %46 to i1
  br i1 %47, label %66, label %48

48:                                               ; preds = %45
  %49 = load ptr, ptr %5, align 8
  %50 = getelementptr inbounds ptr, ptr %49, i64 1
  %51 = load ptr, ptr %50, align 8
  %52 = load i8, ptr %9, align 1
  %53 = trunc i8 %52 to i1
  %54 = load ptr, ptr %6, align 8
  %55 = load ptr, ptr %7, align 8
  %56 = load i32, ptr %10, align 4
  invoke void @_Z13record_outputRNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEEPcbPiS6_i(ptr nonnull align 8 dereferenceable(416) %12, ptr %51, i1 zeroext %53, ptr %54, ptr %55, i32 %56)
          to label %57 unwind label %62

57:                                               ; preds = %48
  br label %66

58:                                               ; preds = %91, %2
  %59 = landingpad { ptr, i32 }
          cleanup
  %60 = extractvalue { ptr, i32 } %59, 0
  store ptr %60, ptr %13, align 8
  %61 = extractvalue { ptr, i32 } %59, 1
  store i32 %61, ptr %14, align 4
  br label %95

62:                                               ; preds = %75, %74, %71, %69, %66, %48, %36, %32, %27, %22, %19, %15
  %63 = landingpad { ptr, i32 }
          cleanup
  %64 = extractvalue { ptr, i32 } %63, 0
  store ptr %64, ptr %13, align 8
  %65 = extractvalue { ptr, i32 } %63, 1
  store i32 %65, ptr %14, align 4
  invoke void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEED1Ev(ptr %12)
          to label %94 unwind label %102

66:                                               ; preds = %57, %45
  %67 = bitcast ptr %11 to ptr
  %68 = invoke nonnull align 8 dereferenceable(8) ptr @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc(ptr nonnull align 8 dereferenceable(8) %67, ptr @.str)
          to label %69 unwind label %62

69:                                               ; preds = %66
  %70 = invoke i32 (ptr, ...) @printf(ptr @.str)
          to label %71 unwind label %62

71:                                               ; preds = %69
  %72 = bitcast ptr %12 to ptr
  %73 = invoke nonnull align 8 dereferenceable(8) ptr @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc(ptr nonnull align 8 dereferenceable(8) %72, ptr @.str)
          to label %74 unwind label %62

74:                                               ; preds = %71
  invoke void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEE5closeEv(ptr %11)
          to label %75 unwind label %62

75:                                               ; preds = %74
  invoke void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEE5closeEv(ptr %12)
          to label %76 unwind label %62

76:                                               ; preds = %75
  %77 = load ptr, ptr %8, align 8
  %78 = icmp eq ptr %77, null
  br i1 %78, label %81, label %79

79:                                               ; preds = %76
  %80 = bitcast ptr %77 to ptr
  call void @_ZdaPv(ptr %80) #11
  br label %81

81:                                               ; preds = %79, %76
  %82 = load ptr, ptr %7, align 8
  %83 = icmp eq ptr %82, null
  br i1 %83, label %86, label %84

84:                                               ; preds = %81
  %85 = bitcast ptr %82 to ptr
  call void @_ZdaPv(ptr %85) #11
  br label %86

86:                                               ; preds = %84, %81
  %87 = load ptr, ptr %6, align 8
  %88 = icmp eq ptr %87, null
  br i1 %88, label %91, label %89

89:                                               ; preds = %86
  %90 = bitcast ptr %87 to ptr
  call void @_ZdaPv(ptr %90) #11
  br label %91

91:                                               ; preds = %89, %86
  store i32 0, ptr %3, align 4
  invoke void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEED1Ev(ptr %12)
          to label %92 unwind label %58

92:                                               ; preds = %91
  call void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEED1Ev(ptr %11)
  %93 = load i32, ptr %3, align 4
  ret i32 %93

94:                                               ; preds = %62
  br label %95

95:                                               ; preds = %94, %58
  invoke void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEED1Ev(ptr %11)
          to label %96 unwind label %102

96:                                               ; preds = %95
  br label %97

97:                                               ; preds = %96
  %98 = load ptr, ptr %13, align 8
  %99 = load i32, ptr %14, align 4
  %100 = insertvalue { ptr, i32 } undef, ptr %98, 0
  %101 = insertvalue { ptr, i32 } %100, i32 %99, 1
  resume { ptr, i32 } %101

102:                                              ; preds = %95, %62
  %103 = landingpad { ptr, i32 }
          catch ptr null
  %104 = extractvalue { ptr, i32 } %103, 0
  call void @__clang_call_terminate(ptr %104) #12
  unreachable
}

declare i32 @__gxx_personality_v0(...)

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEC1Ev(ptr %0) unnamed_addr #1 align 2 personality ptr @__gxx_personality_v0 {
  %2 = alloca ptr, align 8
  %3 = alloca ptr, align 8
  %4 = alloca i32, align 4
  store ptr %0, ptr %2, align 8
  %5 = load ptr, ptr %2, align 8
  %6 = bitcast ptr %5 to ptr
  %7 = getelementptr inbounds i8, ptr %6, i64 416
  %8 = bitcast ptr %7 to ptr
  call void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEEC2Ev(ptr %8)
  %9 = bitcast ptr %5 to ptr
  store ptr getelementptr inbounds ({ [5 x ptr], [5 x ptr] }, ptr @_ZTVNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEE, i32 0, inrange i32 0, i32 3), ptr %9, align 8
  %10 = bitcast ptr %5 to ptr
  %11 = getelementptr inbounds i8, ptr %10, i64 416
  %12 = bitcast ptr %11 to ptr
  store ptr getelementptr inbounds ({ [5 x ptr], [5 x ptr] }, ptr @_ZTVNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEE, i32 0, inrange i32 1, i32 3), ptr %12, align 8
  %13 = bitcast ptr %5 to ptr
  %14 = getelementptr inbounds %"class.std::__1::basic_ofstream", ptr %5, i32 0, i32 1
  %15 = bitcast ptr %14 to ptr
  invoke void @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEEC2EPNS_15basic_streambufIcS2_EE(ptr %13, ptr getelementptr inbounds ([4 x ptr], ptr @_ZTTNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEE, i64 0, i64 1), ptr %15)
          to label %16 unwind label %23

16:                                               ; preds = %1
  %17 = bitcast ptr %5 to ptr
  store ptr getelementptr inbounds ({ [5 x ptr], [5 x ptr] }, ptr @_ZTVNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEE, i32 0, inrange i32 0, i32 3), ptr %17, align 8
  %18 = bitcast ptr %5 to ptr
  %19 = getelementptr inbounds i8, ptr %18, i64 416
  %20 = bitcast ptr %19 to ptr
  store ptr getelementptr inbounds ({ [5 x ptr], [5 x ptr] }, ptr @_ZTVNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEE, i32 0, inrange i32 1, i32 3), ptr %20, align 8
  %21 = getelementptr inbounds %"class.std::__1::basic_ofstream", ptr %5, i32 0, i32 1
  invoke void @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEEC1Ev(ptr %21)
          to label %22 unwind label %27

22:                                               ; preds = %16
  ret void

23:                                               ; preds = %1
  %24 = landingpad { ptr, i32 }
          cleanup
  %25 = extractvalue { ptr, i32 } %24, 0
  store ptr %25, ptr %3, align 8
  %26 = extractvalue { ptr, i32 } %24, 1
  store i32 %26, ptr %4, align 4
  br label %33

27:                                               ; preds = %16
  %28 = landingpad { ptr, i32 }
          cleanup
  %29 = extractvalue { ptr, i32 } %28, 0
  store ptr %29, ptr %3, align 8
  %30 = extractvalue { ptr, i32 } %28, 1
  store i32 %30, ptr %4, align 4
  %31 = bitcast ptr %5 to ptr
  invoke void @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(ptr %31, ptr getelementptr inbounds ([4 x ptr], ptr @_ZTTNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEE, i64 0, i64 1))
          to label %32 unwind label %43

32:                                               ; preds = %27
  br label %33

33:                                               ; preds = %32, %23
  %34 = bitcast ptr %5 to ptr
  %35 = getelementptr inbounds i8, ptr %34, i64 416
  %36 = bitcast ptr %35 to ptr
  invoke void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(ptr %36)
          to label %37 unwind label %43

37:                                               ; preds = %33
  br label %38

38:                                               ; preds = %37
  %39 = load ptr, ptr %3, align 8
  %40 = load i32, ptr %4, align 4
  %41 = insertvalue { ptr, i32 } undef, ptr %39, 0
  %42 = insertvalue { ptr, i32 } %41, i32 %40, 1
  resume { ptr, i32 } %42

43:                                               ; preds = %33, %27
  %44 = landingpad { ptr, i32 }
          catch ptr null
  %45 = extractvalue { ptr, i32 } %44, 0
  call void @__clang_call_terminate(ptr %45) #12
  unreachable
}

; Function Attrs: noinline optnone ssp uwtable
define void @_Z7read_inPKcPPiS2_S2_Ri(ptr %0, ptr %1, ptr %2, ptr %3, ptr nonnull align 4 dereferenceable(4) %4) #1 personality ptr @__gxx_personality_v0 {
  %6 = alloca ptr, align 8
  %7 = alloca ptr, align 8
  %8 = alloca ptr, align 8
  %9 = alloca ptr, align 8
  %10 = alloca ptr, align 8
  %11 = alloca %"class.std::__1::basic_ifstream", align 8
  %12 = alloca i32, align 4
  %13 = alloca ptr, align 8
  %14 = alloca i32, align 4
  %15 = alloca i32, align 4
  %16 = alloca i32, align 4
  %17 = alloca i32, align 4
  store ptr %0, ptr %6, align 8
  store ptr %1, ptr %7, align 8
  store ptr %2, ptr %8, align 8
  store ptr %3, ptr %9, align 8
  store ptr %4, ptr %10, align 8
  call void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEC1Ev(ptr %11)
  %18 = load ptr, ptr %6, align 8
  invoke void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEE4openEPKcj(ptr %11, ptr %18, i32 8)
          to label %19 unwind label %34

19:                                               ; preds = %5
  %20 = bitcast ptr %11 to ptr
  %21 = load ptr, ptr %20, align 8
  %22 = getelementptr i8, ptr %21, i64 -24
  %23 = bitcast ptr %22 to ptr
  %24 = load i64, ptr %23, align 8
  %25 = bitcast ptr %11 to ptr
  %26 = getelementptr inbounds i8, ptr %25, i64 %24
  %27 = bitcast ptr %26 to ptr
  %28 = invoke zeroext i1 @_ZNKSt3__19basic_iosIcNS_11char_traitsIcEEE4failEv(ptr %27)
          to label %29 unwind label %34

29:                                               ; preds = %19
  br i1 %28, label %30, label %38

30:                                               ; preds = %29
  %31 = invoke i32 (ptr, ...) @printf(ptr @.str.1)
          to label %32 unwind label %34

32:                                               ; preds = %30
  invoke void @exit(i32 1) #13
          to label %33 unwind label %34

33:                                               ; preds = %32
  unreachable

34:                                               ; preds = %113, %101, %83, %64, %53, %45, %41, %38, %32, %30, %19, %5
  %35 = landingpad { ptr, i32 }
          cleanup
  %36 = extractvalue { ptr, i32 } %35, 0
  store ptr %36, ptr %13, align 8
  %37 = extractvalue { ptr, i32 } %35, 1
  store i32 %37, ptr %14, align 4
  invoke void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED1Ev(ptr %11)
          to label %131 unwind label %137

38:                                               ; preds = %29
  %39 = bitcast ptr %11 to ptr
  %40 = invoke nonnull align 8 dereferenceable(16) ptr @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi(ptr %39, ptr nonnull align 4 dereferenceable(4) %12)
          to label %41 unwind label %34

41:                                               ; preds = %38
  %42 = bitcast ptr %11 to ptr
  %43 = load ptr, ptr %10, align 8
  %44 = invoke nonnull align 8 dereferenceable(16) ptr @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi(ptr %42, ptr nonnull align 4 dereferenceable(4) %43)
          to label %45 unwind label %34

45:                                               ; preds = %41
  %46 = load i32, ptr %12, align 4
  %47 = sext i32 %46 to i64
  %48 = call { i64, i1 } @llvm.umul.with.overflow.i64(i64 %47, i64 4)
  %49 = extractvalue { i64, i1 } %48, 1
  %50 = extractvalue { i64, i1 } %48, 0
  %51 = select i1 %49, i64 -1, i64 %50
  %52 = invoke noalias nonnull ptr @_Znam(i64 %51) #14
          to label %53 unwind label %34

53:                                               ; preds = %45
  %54 = bitcast ptr %52 to ptr
  %55 = load ptr, ptr %7, align 8
  store ptr %54, ptr %55, align 8
  %56 = load ptr, ptr %10, align 8
  %57 = load i32, ptr %56, align 4
  %58 = sext i32 %57 to i64
  %59 = call { i64, i1 } @llvm.umul.with.overflow.i64(i64 %58, i64 4)
  %60 = extractvalue { i64, i1 } %59, 1
  %61 = extractvalue { i64, i1 } %59, 0
  %62 = select i1 %60, i64 -1, i64 %61
  %63 = invoke noalias nonnull ptr @_Znam(i64 %62) #14
          to label %64 unwind label %34

64:                                               ; preds = %53
  %65 = bitcast ptr %63 to ptr
  %66 = load ptr, ptr %8, align 8
  store ptr %65, ptr %66, align 8
  %67 = load ptr, ptr %10, align 8
  %68 = load i32, ptr %67, align 4
  %69 = mul nsw i32 2, %68
  %70 = sext i32 %69 to i64
  %71 = call { i64, i1 } @llvm.umul.with.overflow.i64(i64 %70, i64 4)
  %72 = extractvalue { i64, i1 } %71, 1
  %73 = extractvalue { i64, i1 } %71, 0
  %74 = select i1 %72, i64 -1, i64 %73
  %75 = invoke noalias nonnull ptr @_Znam(i64 %74) #14
          to label %76 unwind label %34

76:                                               ; preds = %64
  %77 = bitcast ptr %75 to ptr
  %78 = load ptr, ptr %9, align 8
  store ptr %77, ptr %78, align 8
  store i32 0, ptr %15, align 4
  br label %79

79:                                               ; preds = %92, %76
  %80 = load i32, ptr %15, align 4
  %81 = load i32, ptr %12, align 4
  %82 = icmp slt i32 %80, %81
  br i1 %82, label %83, label %95

83:                                               ; preds = %79
  %84 = bitcast ptr %11 to ptr
  %85 = load ptr, ptr %7, align 8
  %86 = load ptr, ptr %85, align 8
  %87 = load i32, ptr %15, align 4
  %88 = sext i32 %87 to i64
  %89 = getelementptr inbounds i32, ptr %86, i64 %88
  %90 = invoke nonnull align 8 dereferenceable(16) ptr @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi(ptr %84, ptr nonnull align 4 dereferenceable(4) %89)
          to label %91 unwind label %34

91:                                               ; preds = %83
  br label %92

92:                                               ; preds = %91
  %93 = load i32, ptr %15, align 4
  %94 = add nsw i32 %93, 1
  store i32 %94, ptr %15, align 4
  br label %79

95:                                               ; preds = %79
  store i32 0, ptr %16, align 4
  br label %96

96:                                               ; preds = %110, %95
  %97 = load i32, ptr %16, align 4
  %98 = load ptr, ptr %10, align 8
  %99 = load i32, ptr %98, align 4
  %100 = icmp slt i32 %97, %99
  br i1 %100, label %101, label %113

101:                                              ; preds = %96
  %102 = bitcast ptr %11 to ptr
  %103 = load ptr, ptr %8, align 8
  %104 = load ptr, ptr %103, align 8
  %105 = load i32, ptr %16, align 4
  %106 = sext i32 %105 to i64
  %107 = getelementptr inbounds i32, ptr %104, i64 %106
  %108 = invoke nonnull align 8 dereferenceable(16) ptr @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi(ptr %102, ptr nonnull align 4 dereferenceable(4) %107)
          to label %109 unwind label %34

109:                                              ; preds = %101
  br label %110

110:                                              ; preds = %109
  %111 = load i32, ptr %16, align 4
  %112 = add nsw i32 %111, 1
  store i32 %112, ptr %16, align 4
  br label %96

113:                                              ; preds = %96
  invoke void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEE5closeEv(ptr %11)
          to label %114 unwind label %34

114:                                              ; preds = %113
  store i32 0, ptr %17, align 4
  br label %115

115:                                              ; preds = %127, %114
  %116 = load i32, ptr %17, align 4
  %117 = load ptr, ptr %10, align 8
  %118 = load i32, ptr %117, align 4
  %119 = mul nsw i32 2, %118
  %120 = icmp slt i32 %116, %119
  br i1 %120, label %121, label %130

121:                                              ; preds = %115
  %122 = load ptr, ptr %9, align 8
  %123 = load ptr, ptr %122, align 8
  %124 = load i32, ptr %17, align 4
  %125 = sext i32 %124 to i64
  %126 = getelementptr inbounds i32, ptr %123, i64 %125
  store i32 -1, ptr %126, align 4
  br label %127

127:                                              ; preds = %121
  %128 = load i32, ptr %17, align 4
  %129 = add nsw i32 %128, 1
  store i32 %129, ptr %17, align 4
  br label %115

130:                                              ; preds = %115
  call void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED1Ev(ptr %11)
  ret void

131:                                              ; preds = %34
  br label %132

132:                                              ; preds = %131
  %133 = load ptr, ptr %13, align 8
  %134 = load i32, ptr %14, align 4
  %135 = insertvalue { ptr, i32 } undef, ptr %133, 0
  %136 = insertvalue { ptr, i32 } %135, i32 %134, 1
  resume { ptr, i32 } %136

137:                                              ; preds = %34
  %138 = landingpad { ptr, i32 }
          catch ptr null
  %139 = extractvalue { ptr, i32 } %138, 0
  call void @__clang_call_terminate(ptr %139) #12
  unreachable
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define zeroext i1 @_Z3cmpPiS_i(ptr %0, ptr %1, i32 %2) #2 {
  %4 = alloca i1, align 1
  %5 = alloca ptr, align 8
  %6 = alloca ptr, align 8
  %7 = alloca i32, align 4
  %8 = alloca i32, align 4
  %9 = alloca i32, align 4
  store ptr %0, ptr %5, align 8
  store ptr %1, ptr %6, align 8
  store i32 %2, ptr %7, align 4
  store i32 0, ptr %8, align 4
  br label %10

10:                                               ; preds = %28, %3
  %11 = load i32, ptr %8, align 4
  %12 = load i32, ptr %7, align 4
  %13 = icmp slt i32 %11, %12
  br i1 %13, label %14, label %31

14:                                               ; preds = %10
  %15 = load ptr, ptr %5, align 8
  %16 = load i32, ptr %8, align 4
  %17 = sext i32 %16 to i64
  %18 = getelementptr inbounds i32, ptr %15, i64 %17
  %19 = load i32, ptr %18, align 4
  %20 = load ptr, ptr %6, align 8
  %21 = load i32, ptr %8, align 4
  %22 = sext i32 %21 to i64
  %23 = getelementptr inbounds i32, ptr %20, i64 %22
  %24 = load i32, ptr %23, align 4
  %25 = icmp ne i32 %19, %24
  br i1 %25, label %26, label %27

26:                                               ; preds = %14
  store i1 false, ptr %4, align 1
  br label %51

27:                                               ; preds = %14
  br label %28

28:                                               ; preds = %27
  %29 = load i32, ptr %8, align 4
  %30 = add nsw i32 %29, 1
  store i32 %30, ptr %8, align 4
  br label %10

31:                                               ; preds = %10
  %32 = load i32, ptr %7, align 4
  store i32 %32, ptr %9, align 4
  br label %33

33:                                               ; preds = %47, %31
  %34 = load i32, ptr %9, align 4
  %35 = load i32, ptr %7, align 4
  %36 = mul nsw i32 2, %35
  %37 = icmp slt i32 %34, %36
  br i1 %37, label %38, label %50

38:                                               ; preds = %33
  %39 = load ptr, ptr %6, align 8
  %40 = load i32, ptr %9, align 4
  %41 = sext i32 %40 to i64
  %42 = getelementptr inbounds i32, ptr %39, i64 %41
  %43 = load i32, ptr %42, align 4
  %44 = icmp ne i32 %43, -1
  br i1 %44, label %45, label %46

45:                                               ; preds = %38
  store i1 false, ptr %4, align 1
  br label %51

46:                                               ; preds = %38
  br label %47

47:                                               ; preds = %46
  %48 = load i32, ptr %9, align 4
  %49 = add nsw i32 %48, 1
  store i32 %49, ptr %9, align 4
  br label %33

50:                                               ; preds = %33
  store i1 true, ptr %4, align 1
  br label %51

51:                                               ; preds = %50, %45, %26
  %52 = load i1, ptr %4, align 1
  ret i1 %52
}

declare void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEE4openEPKcj(ptr, ptr, i32) #3

; Function Attrs: noinline optnone ssp uwtable
define void @_Z13record_outputRNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEEPcbPiS6_i(ptr nonnull align 8 dereferenceable(416) %0, ptr %1, i1 zeroext %2, ptr %3, ptr %4, i32 %5) #1 {
  %7 = alloca ptr, align 8
  %8 = alloca ptr, align 8
  %9 = alloca i8, align 1
  %10 = alloca ptr, align 8
  %11 = alloca ptr, align 8
  %12 = alloca i32, align 4
  %13 = alloca i32, align 4
  %14 = alloca i32, align 4
  store ptr %0, ptr %7, align 8
  store ptr %1, ptr %8, align 8
  %15 = zext i1 %2 to i8
  store i8 %15, ptr %9, align 1
  store ptr %3, ptr %10, align 8
  store ptr %4, ptr %11, align 8
  store i32 %5, ptr %12, align 4
  %16 = load ptr, ptr %7, align 8
  %17 = bitcast ptr %16 to ptr
  %18 = load ptr, ptr %8, align 8
  %19 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc(ptr nonnull align 8 dereferenceable(8) %17, ptr %18)
  %20 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEPFRS3_S4_E(ptr %19, ptr @_ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_)
  %21 = load ptr, ptr %7, align 8
  %22 = bitcast ptr %21 to ptr
  %23 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc(ptr nonnull align 8 dereferenceable(8) %22, ptr @.str.2)
  %24 = load i8, ptr %9, align 1
  %25 = trunc i8 %24 to i1
  br i1 %25, label %26, label %30

26:                                               ; preds = %6
  %27 = load ptr, ptr %7, align 8
  %28 = bitcast ptr %27 to ptr
  %29 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc(ptr nonnull align 8 dereferenceable(8) %28, ptr @.str.3)
  br label %34

30:                                               ; preds = %6
  %31 = load ptr, ptr %7, align 8
  %32 = bitcast ptr %31 to ptr
  %33 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc(ptr nonnull align 8 dereferenceable(8) %32, ptr @.str.4)
  br label %34

34:                                               ; preds = %30, %26
  %35 = phi ptr [ %29, %26 ], [ %33, %30 ]
  %36 = call i32 (ptr, ...) @printf(ptr @.str.5)
  %37 = load i8, ptr %9, align 1
  %38 = trunc i8 %37 to i1
  br i1 %38, label %39, label %41

39:                                               ; preds = %34
  %40 = call i32 (ptr, ...) @printf(ptr @.str.3)
  br label %43

41:                                               ; preds = %34
  %42 = call i32 (ptr, ...) @printf(ptr @.str.4)
  br label %43

43:                                               ; preds = %41, %39
  %44 = phi i32 [ %40, %39 ], [ %42, %41 ]
  %45 = load ptr, ptr %7, align 8
  %46 = bitcast ptr %45 to ptr
  %47 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc(ptr nonnull align 8 dereferenceable(8) %46, ptr @.str.6)
  %48 = call i32 (ptr, ...) @printf(ptr @.str.7)
  store i32 0, ptr %13, align 4
  br label %49

49:                                               ; preds = %69, %43
  %50 = load i32, ptr %13, align 4
  %51 = load i32, ptr %12, align 4
  %52 = icmp slt i32 %50, %51
  br i1 %52, label %53, label %72

53:                                               ; preds = %49
  %54 = load ptr, ptr %7, align 8
  %55 = bitcast ptr %54 to ptr
  %56 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc(ptr nonnull align 8 dereferenceable(8) %55, ptr @.str.8)
  %57 = load ptr, ptr %10, align 8
  %58 = load i32, ptr %13, align 4
  %59 = sext i32 %58 to i64
  %60 = getelementptr inbounds i32, ptr %57, i64 %59
  %61 = load i32, ptr %60, align 4
  %62 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(ptr %56, i32 %61)
  %63 = load ptr, ptr %10, align 8
  %64 = load i32, ptr %13, align 4
  %65 = sext i32 %64 to i64
  %66 = getelementptr inbounds i32, ptr %63, i64 %65
  %67 = load i32, ptr %66, align 4
  %68 = call i32 (ptr, ...) @printf(ptr @.str.9, i32 %67)
  br label %69

69:                                               ; preds = %53
  %70 = load i32, ptr %13, align 4
  %71 = add nsw i32 %70, 1
  store i32 %71, ptr %13, align 4
  br label %49

72:                                               ; preds = %49
  %73 = load ptr, ptr %7, align 8
  %74 = bitcast ptr %73 to ptr
  %75 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc(ptr nonnull align 8 dereferenceable(8) %74, ptr @.str.10)
  %76 = call i32 (ptr, ...) @printf(ptr @.str.11)
  store i32 0, ptr %14, align 4
  br label %77

77:                                               ; preds = %98, %72
  %78 = load i32, ptr %14, align 4
  %79 = load i32, ptr %12, align 4
  %80 = mul nsw i32 2, %79
  %81 = icmp slt i32 %78, %80
  br i1 %81, label %82, label %101

82:                                               ; preds = %77
  %83 = load ptr, ptr %7, align 8
  %84 = bitcast ptr %83 to ptr
  %85 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc(ptr nonnull align 8 dereferenceable(8) %84, ptr @.str.8)
  %86 = load ptr, ptr %11, align 8
  %87 = load i32, ptr %14, align 4
  %88 = sext i32 %87 to i64
  %89 = getelementptr inbounds i32, ptr %86, i64 %88
  %90 = load i32, ptr %89, align 4
  %91 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(ptr %85, i32 %90)
  %92 = load ptr, ptr %11, align 8
  %93 = load i32, ptr %14, align 4
  %94 = sext i32 %93 to i64
  %95 = getelementptr inbounds i32, ptr %92, i64 %94
  %96 = load i32, ptr %95, align 4
  %97 = call i32 (ptr, ...) @printf(ptr @.str.9, i32 %96)
  br label %98

98:                                               ; preds = %82
  %99 = load i32, ptr %14, align 4
  %100 = add nsw i32 %99, 1
  store i32 %100, ptr %14, align 4
  br label %77

101:                                              ; preds = %77
  %102 = load ptr, ptr %7, align 8
  %103 = bitcast ptr %102 to ptr
  %104 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc(ptr nonnull align 8 dereferenceable(8) %103, ptr @.str)
  %105 = call i32 (ptr, ...) @printf(ptr @.str)
  ret void
}

; Function Attrs: noinline optnone ssp uwtable
define linkonce_odr void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEED1Ev(ptr %0) unnamed_addr #1 align 2 personality ptr @__gxx_personality_v0 {
  %2 = alloca ptr, align 8
  %3 = alloca ptr, align 8
  %4 = alloca i32, align 4
  store ptr %0, ptr %2, align 8
  %5 = load ptr, ptr %2, align 8
  invoke void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEED2Ev(ptr %5, ptr @_ZTTNSt3__114basic_ofstreamIcNS_11char_traitsIcEEEE)
          to label %6 unwind label %10

6:                                                ; preds = %1
  %7 = bitcast ptr %5 to ptr
  %8 = getelementptr inbounds i8, ptr %7, i64 416
  %9 = bitcast ptr %8 to ptr
  call void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(ptr %9)
  ret void

10:                                               ; preds = %1
  %11 = landingpad { ptr, i32 }
          cleanup
  %12 = extractvalue { ptr, i32 } %11, 0
  store ptr %12, ptr %3, align 8
  %13 = extractvalue { ptr, i32 } %11, 1
  store i32 %13, ptr %4, align 4
  %14 = bitcast ptr %5 to ptr
  %15 = getelementptr inbounds i8, ptr %14, i64 416
  %16 = bitcast ptr %15 to ptr
  invoke void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(ptr %16)
          to label %17 unwind label %23

17:                                               ; preds = %10
  br label %18

18:                                               ; preds = %17
  %19 = load ptr, ptr %3, align 8
  %20 = load i32, ptr %4, align 4
  %21 = insertvalue { ptr, i32 } undef, ptr %19, 0
  %22 = insertvalue { ptr, i32 } %21, i32 %20, 1
  resume { ptr, i32 } %22

23:                                               ; preds = %10
  %24 = landingpad { ptr, i32 }
          catch ptr null
  %25 = extractvalue { ptr, i32 } %24, 0
  call void @__clang_call_terminate(ptr %25) #12
  unreachable
}

; Function Attrs: noinline optnone ssp uwtable
define linkonce_odr nonnull align 8 dereferenceable(8) ptr @_ZNSt3__1lsINS_11char_traitsIcEEEERNS_13basic_ostreamIcT_EES6_PKc(ptr nonnull align 8 dereferenceable(8) %0, ptr %1) #1 {
  %3 = alloca ptr, align 8
  %4 = alloca ptr, align 8
  store ptr %0, ptr %3, align 8
  store ptr %1, ptr %4, align 8
  %5 = load ptr, ptr %3, align 8
  %6 = load ptr, ptr %4, align 8
  %7 = load ptr, ptr %4, align 8
  %8 = call i64 @_ZNSt3__111char_traitsIcE6lengthEPKc(ptr %7) #15
  %9 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m(ptr nonnull align 8 dereferenceable(8) %5, ptr %6, i64 %8)
  ret ptr %9
}

declare i32 @printf(ptr, ...) #3

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEE5closeEv(ptr %0) #1 align 2 {
  %2 = alloca ptr, align 8
  %3 = alloca %"class.std::__1::basic_ostream.base", align 8
  store ptr %0, ptr %2, align 8
  %4 = load ptr, ptr %2, align 8
  %5 = getelementptr inbounds %"class.std::__1::basic_ofstream", ptr %4, i32 0, i32 1
  %6 = call ptr @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEE5closeEv(ptr %5)
  %7 = call ptr @_ZNSt3__1L15__get_nullptr_tEv()
  %8 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %3, i32 0, i32 0
  store ptr %7, ptr %8, align 8
  %9 = call ptr @_ZNKSt3__19nullptr_tcvPT_INS_13basic_filebufIcNS_11char_traitsIcEEEEEEv(ptr %3)
  %10 = icmp eq ptr %6, %9
  br i1 %10, label %11, label %20

11:                                               ; preds = %1
  %12 = bitcast ptr %4 to ptr
  %13 = load ptr, ptr %12, align 8
  %14 = getelementptr i8, ptr %13, i64 -24
  %15 = bitcast ptr %14 to ptr
  %16 = load i64, ptr %15, align 8
  %17 = bitcast ptr %4 to ptr
  %18 = getelementptr inbounds i8, ptr %17, i64 %16
  %19 = bitcast ptr %18 to ptr
  call void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEE8setstateEj(ptr %19, i32 4)
  br label %20

20:                                               ; preds = %11, %1
  ret void
}

; Function Attrs: nobuiltin nounwind
declare void @_ZdaPv(ptr) #4

; Function Attrs: noinline noreturn nounwind
define linkonce_odr hidden void @__clang_call_terminate(ptr %0) #5 {
  %2 = call ptr @__cxa_begin_catch(ptr %0) #15
  call void @_ZSt9terminatev() #12
  unreachable
}

declare ptr @__cxa_begin_catch(ptr)

declare void @_ZSt9terminatev()

declare ptr @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEE5closeEv(ptr) #3

; Function Attrs: noinline optnone ssp uwtable
define internal ptr @_ZNSt3__1L15__get_nullptr_tEv() #1 {
  %1 = alloca %"class.std::__1::basic_ostream.base", align 8
  call void @_ZNSt3__19nullptr_tC1EMNS0_5__natEi(ptr %1, i64 -1)
  %2 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %1, i32 0, i32 0
  %3 = load ptr, ptr %2, align 8
  ret ptr %3
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal ptr @_ZNKSt3__19nullptr_tcvPT_INS_13basic_filebufIcNS_11char_traitsIcEEEEEEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  ret ptr null
}

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEE8setstateEj(ptr %0, i32 %1) #1 align 2 {
  %3 = alloca ptr, align 8
  %4 = alloca i32, align 4
  store ptr %0, ptr %3, align 8
  store i32 %1, ptr %4, align 4
  %5 = load ptr, ptr %3, align 8
  %6 = bitcast ptr %5 to ptr
  %7 = load i32, ptr %4, align 4
  call void @_ZNSt3__18ios_base8setstateEj(ptr %6, i32 %7)
  ret void
}

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__18ios_base8setstateEj(ptr %0, i32 %1) #1 align 2 {
  %3 = alloca ptr, align 8
  %4 = alloca i32, align 4
  store ptr %0, ptr %3, align 8
  store i32 %1, ptr %4, align 4
  %5 = load ptr, ptr %3, align 8
  %6 = getelementptr inbounds %"class.std::__1::ios_base", ptr %5, i32 0, i32 4
  %7 = load i32, ptr %6, align 8
  %8 = load i32, ptr %4, align 4
  %9 = or i32 %7, %8
  call void @_ZNSt3__18ios_base5clearEj(ptr %5, i32 %9)
  ret void
}

declare void @_ZNSt3__18ios_base5clearEj(ptr, i32) #3

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__19nullptr_tC1EMNS0_5__natEi(ptr %0, i64 %1) unnamed_addr #1 align 2 {
  %3 = alloca ptr, align 8
  %4 = alloca i64, align 8
  store ptr %0, ptr %3, align 8
  store i64 %1, ptr %4, align 8
  %5 = load ptr, ptr %3, align 8
  %6 = load i64, ptr %4, align 8
  call void @_ZNSt3__19nullptr_tC2EMNS0_5__natEi(ptr %5, i64 %6)
  ret void
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal void @_ZNSt3__19nullptr_tC2EMNS0_5__natEi(ptr %0, i64 %1) unnamed_addr #2 align 2 {
  %3 = alloca ptr, align 8
  %4 = alloca i64, align 8
  store ptr %0, ptr %3, align 8
  store i64 %1, ptr %4, align 8
  %5 = load ptr, ptr %3, align 8
  %6 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %5, i32 0, i32 0
  store ptr null, ptr %6, align 8
  ret void
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define linkonce_odr i64 @_ZNSt3__111char_traitsIcE6lengthEPKc(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = call i64 @strlen(ptr %3) #15
  ret i64 %4
}

; Function Attrs: noinline optnone ssp uwtable
define linkonce_odr nonnull align 8 dereferenceable(8) ptr @_ZNSt3__124__put_character_sequenceIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_PKS4_m(ptr nonnull align 8 dereferenceable(8) %0, ptr %1, i64 %2) #1 personality ptr @__gxx_personality_v0 {
  %4 = alloca ptr, align 8
  %5 = alloca ptr, align 8
  %6 = alloca i64, align 8
  %7 = alloca %"class.std::__1::basic_ostream<char>::sentry", align 8
  %8 = alloca ptr, align 8
  %9 = alloca i32, align 4
  %10 = alloca %"class.std::__1::basic_ostream.base", align 8
  %11 = alloca %"class.std::__1::basic_ostream.base", align 8
  store ptr %0, ptr %4, align 8
  store ptr %1, ptr %5, align 8
  store i64 %2, ptr %6, align 8
  %12 = load ptr, ptr %4, align 8
  invoke void @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryC1ERS3_(ptr %7, ptr nonnull align 8 dereferenceable(8) %12)
          to label %13 unwind label %80

13:                                               ; preds = %3
  %14 = invoke zeroext i1 @_ZNKSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentrycvbEv(ptr %7)
          to label %15 unwind label %84

15:                                               ; preds = %13
  br i1 %14, label %16, label %89

16:                                               ; preds = %15
  %17 = load ptr, ptr %4, align 8
  call void @_ZNSt3__119ostreambuf_iteratorIcNS_11char_traitsIcEEEC1ERNS_13basic_ostreamIcS2_EE(ptr %11, ptr nonnull align 8 dereferenceable(8) %17) #15
  %18 = load ptr, ptr %5, align 8
  %19 = load ptr, ptr %4, align 8
  %20 = bitcast ptr %19 to ptr
  %21 = load ptr, ptr %20, align 8
  %22 = getelementptr i8, ptr %21, i64 -24
  %23 = bitcast ptr %22 to ptr
  %24 = load i64, ptr %23, align 8
  %25 = bitcast ptr %19 to ptr
  %26 = getelementptr inbounds i8, ptr %25, i64 %24
  %27 = bitcast ptr %26 to ptr
  %28 = invoke i32 @_ZNKSt3__18ios_base5flagsEv(ptr %27)
          to label %29 unwind label %84

29:                                               ; preds = %16
  %30 = and i32 %28, 176
  %31 = icmp eq i32 %30, 32
  br i1 %31, label %32, label %36

32:                                               ; preds = %29
  %33 = load ptr, ptr %5, align 8
  %34 = load i64, ptr %6, align 8
  %35 = getelementptr inbounds i8, ptr %33, i64 %34
  br label %38

36:                                               ; preds = %29
  %37 = load ptr, ptr %5, align 8
  br label %38

38:                                               ; preds = %36, %32
  %39 = phi ptr [ %35, %32 ], [ %37, %36 ]
  %40 = load ptr, ptr %5, align 8
  %41 = load i64, ptr %6, align 8
  %42 = getelementptr inbounds i8, ptr %40, i64 %41
  %43 = load ptr, ptr %4, align 8
  %44 = bitcast ptr %43 to ptr
  %45 = load ptr, ptr %44, align 8
  %46 = getelementptr i8, ptr %45, i64 -24
  %47 = bitcast ptr %46 to ptr
  %48 = load i64, ptr %47, align 8
  %49 = bitcast ptr %43 to ptr
  %50 = getelementptr inbounds i8, ptr %49, i64 %48
  %51 = bitcast ptr %50 to ptr
  %52 = load ptr, ptr %4, align 8
  %53 = bitcast ptr %52 to ptr
  %54 = load ptr, ptr %53, align 8
  %55 = getelementptr i8, ptr %54, i64 -24
  %56 = bitcast ptr %55 to ptr
  %57 = load i64, ptr %56, align 8
  %58 = bitcast ptr %52 to ptr
  %59 = getelementptr inbounds i8, ptr %58, i64 %57
  %60 = bitcast ptr %59 to ptr
  %61 = invoke signext i8 @_ZNKSt3__19basic_iosIcNS_11char_traitsIcEEE4fillEv(ptr %60)
          to label %62 unwind label %84

62:                                               ; preds = %38
  %63 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %11, i32 0, i32 0
  %64 = load ptr, ptr %63, align 8
  %65 = invoke ptr @_ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_(ptr %64, ptr %18, ptr %39, ptr %42, ptr nonnull align 8 dereferenceable(136) %51, i8 signext %61)
          to label %66 unwind label %84

66:                                               ; preds = %62
  %67 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %10, i32 0, i32 0
  store ptr %65, ptr %67, align 8
  %68 = call zeroext i1 @_ZNKSt3__119ostreambuf_iteratorIcNS_11char_traitsIcEEE6failedEv(ptr %10) #15
  br i1 %68, label %69, label %88

69:                                               ; preds = %66
  %70 = load ptr, ptr %4, align 8
  %71 = bitcast ptr %70 to ptr
  %72 = load ptr, ptr %71, align 8
  %73 = getelementptr i8, ptr %72, i64 -24
  %74 = bitcast ptr %73 to ptr
  %75 = load i64, ptr %74, align 8
  %76 = bitcast ptr %70 to ptr
  %77 = getelementptr inbounds i8, ptr %76, i64 %75
  %78 = bitcast ptr %77 to ptr
  invoke void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEE8setstateEj(ptr %78, i32 5)
          to label %79 unwind label %84

79:                                               ; preds = %69
  br label %88

80:                                               ; preds = %89, %3
  %81 = landingpad { ptr, i32 }
          catch ptr null
  %82 = extractvalue { ptr, i32 } %81, 0
  store ptr %82, ptr %8, align 8
  %83 = extractvalue { ptr, i32 } %81, 1
  store i32 %83, ptr %9, align 4
  br label %92

84:                                               ; preds = %69, %62, %38, %16, %13
  %85 = landingpad { ptr, i32 }
          catch ptr null
  %86 = extractvalue { ptr, i32 } %85, 0
  store ptr %86, ptr %8, align 8
  %87 = extractvalue { ptr, i32 } %85, 1
  store i32 %87, ptr %9, align 4
  invoke void @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryD1Ev(ptr %7)
          to label %91 unwind label %117

88:                                               ; preds = %79, %66
  br label %89

89:                                               ; preds = %88, %15
  invoke void @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryD1Ev(ptr %7)
          to label %90 unwind label %80

90:                                               ; preds = %89
  br label %105

91:                                               ; preds = %84
  br label %92

92:                                               ; preds = %91, %80
  %93 = load ptr, ptr %8, align 8
  %94 = call ptr @__cxa_begin_catch(ptr %93) #15
  %95 = load ptr, ptr %4, align 8
  %96 = bitcast ptr %95 to ptr
  %97 = load ptr, ptr %96, align 8
  %98 = getelementptr i8, ptr %97, i64 -24
  %99 = bitcast ptr %98 to ptr
  %100 = load i64, ptr %99, align 8
  %101 = bitcast ptr %95 to ptr
  %102 = getelementptr inbounds i8, ptr %101, i64 %100
  %103 = bitcast ptr %102 to ptr
  invoke void @_ZNSt3__18ios_base33__set_badbit_and_consider_rethrowEv(ptr %103)
          to label %104 unwind label %107

104:                                              ; preds = %92
  call void @__cxa_end_catch()
  br label %105

105:                                              ; preds = %104, %90
  %106 = load ptr, ptr %4, align 8
  ret ptr %106

107:                                              ; preds = %92
  %108 = landingpad { ptr, i32 }
          cleanup
  %109 = extractvalue { ptr, i32 } %108, 0
  store ptr %109, ptr %8, align 8
  %110 = extractvalue { ptr, i32 } %108, 1
  store i32 %110, ptr %9, align 4
  invoke void @__cxa_end_catch()
          to label %111 unwind label %117

111:                                              ; preds = %107
  br label %112

112:                                              ; preds = %111
  %113 = load ptr, ptr %8, align 8
  %114 = load i32, ptr %9, align 4
  %115 = insertvalue { ptr, i32 } undef, ptr %113, 0
  %116 = insertvalue { ptr, i32 } %115, i32 %114, 1
  resume { ptr, i32 } %116

117:                                              ; preds = %107, %84
  %118 = landingpad { ptr, i32 }
          catch ptr null
  %119 = extractvalue { ptr, i32 } %118, 0
  call void @__clang_call_terminate(ptr %119) #12
  unreachable
}

declare void @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryC1ERS3_(ptr, ptr nonnull align 8 dereferenceable(8)) unnamed_addr #3

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal zeroext i1 @_ZNKSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentrycvbEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = getelementptr inbounds %"class.std::__1::basic_ostream<char>::sentry", ptr %3, i32 0, i32 0
  %5 = load i8, ptr %4, align 8
  %6 = trunc i8 %5 to i1
  ret i1 %6
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal void @_ZNSt3__119ostreambuf_iteratorIcNS_11char_traitsIcEEEC1ERNS_13basic_ostreamIcS2_EE(ptr %0, ptr nonnull align 8 dereferenceable(8) %1) unnamed_addr #2 align 2 {
  %3 = alloca ptr, align 8
  %4 = alloca ptr, align 8
  store ptr %0, ptr %3, align 8
  store ptr %1, ptr %4, align 8
  %5 = load ptr, ptr %3, align 8
  %6 = load ptr, ptr %4, align 8
  call void @_ZNSt3__119ostreambuf_iteratorIcNS_11char_traitsIcEEEC2ERNS_13basic_ostreamIcS2_EE(ptr %5, ptr nonnull align 8 dereferenceable(8) %6) #15
  ret void
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal i32 @_ZNKSt3__18ios_base5flagsEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = getelementptr inbounds %"class.std::__1::ios_base", ptr %3, i32 0, i32 1
  %5 = load i32, ptr %4, align 8
  ret i32 %5
}

; Function Attrs: noinline optnone ssp uwtable
define internal signext i8 @_ZNKSt3__19basic_iosIcNS_11char_traitsIcEEE4fillEv(ptr %0) #1 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = call i32 @_ZNSt3__111char_traitsIcE3eofEv() #15
  %5 = getelementptr inbounds %"class.std::__1::basic_ios", ptr %3, i32 0, i32 2
  %6 = load i32, ptr %5, align 8
  %7 = call zeroext i1 @_ZNSt3__111char_traitsIcE11eq_int_typeEii(i32 %4, i32 %6) #15
  br i1 %7, label %8, label %12

8:                                                ; preds = %1
  %9 = call signext i8 @_ZNKSt3__19basic_iosIcNS_11char_traitsIcEEE5widenEc(ptr %3, i8 signext 32)
  %10 = sext i8 %9 to i32
  %11 = getelementptr inbounds %"class.std::__1::basic_ios", ptr %3, i32 0, i32 2
  store i32 %10, ptr %11, align 8
  br label %12

12:                                               ; preds = %8, %1
  %13 = getelementptr inbounds %"class.std::__1::basic_ios", ptr %3, i32 0, i32 2
  %14 = load i32, ptr %13, align 8
  %15 = trunc i32 %14 to i8
  ret i8 %15
}

; Function Attrs: noinline optnone ssp uwtable
define linkonce_odr hidden ptr @_ZNSt3__116__pad_and_outputIcNS_11char_traitsIcEEEENS_19ostreambuf_iteratorIT_T0_EES6_PKS4_S8_S8_RNS_8ios_baseES4_(ptr %0, ptr %1, ptr %2, ptr %3, ptr nonnull align 8 dereferenceable(136) %4, i8 signext %5) #1 personality ptr @__gxx_personality_v0 {
  %7 = alloca %"class.std::__1::basic_ostream.base", align 8
  %8 = alloca %"class.std::__1::basic_ostream.base", align 8
  %9 = alloca ptr, align 8
  %10 = alloca ptr, align 8
  %11 = alloca ptr, align 8
  %12 = alloca ptr, align 8
  %13 = alloca i8, align 1
  %14 = alloca %"class.std::__1::basic_ostream.base", align 8
  %15 = alloca i64, align 8
  %16 = alloca i64, align 8
  %17 = alloca i64, align 8
  %18 = alloca %"class.std::__1::basic_ostream.base", align 8
  %19 = alloca %"class.std::__1::basic_string", align 8
  %20 = alloca ptr, align 8
  %21 = alloca i32, align 4
  %22 = alloca %"class.std::__1::basic_ostream.base", align 8
  %23 = alloca i32, align 4
  %24 = alloca %"class.std::__1::basic_ostream.base", align 8
  %25 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %8, i32 0, i32 0
  store ptr %0, ptr %25, align 8
  store ptr %1, ptr %9, align 8
  store ptr %2, ptr %10, align 8
  store ptr %3, ptr %11, align 8
  store ptr %4, ptr %12, align 8
  store i8 %5, ptr %13, align 1
  %26 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %8, i32 0, i32 0
  %27 = load ptr, ptr %26, align 8
  %28 = call ptr @_ZNSt3__1L15__get_nullptr_tEv()
  %29 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %14, i32 0, i32 0
  store ptr %28, ptr %29, align 8
  %30 = call ptr @_ZNKSt3__19nullptr_tcvPT_INS_15basic_streambufIcNS_11char_traitsIcEEEEEEv(ptr %14)
  %31 = icmp eq ptr %27, %30
  br i1 %31, label %32, label %35

32:                                               ; preds = %6
  %33 = bitcast ptr %7 to ptr
  %34 = bitcast ptr %8 to ptr
  call void @llvm.memcpy.p0.p0.i64(ptr align 8 %33, ptr align 8 %34, i64 8, i1 false)
  br label %136

35:                                               ; preds = %6
  %36 = load ptr, ptr %11, align 8
  %37 = load ptr, ptr %9, align 8
  %38 = ptrtoint ptr %36 to i64
  %39 = ptrtoint ptr %37 to i64
  %40 = sub i64 %38, %39
  store i64 %40, ptr %15, align 8
  %41 = load ptr, ptr %12, align 8
  %42 = call i64 @_ZNKSt3__18ios_base5widthEv(ptr %41)
  store i64 %42, ptr %16, align 8
  %43 = load i64, ptr %16, align 8
  %44 = load i64, ptr %15, align 8
  %45 = icmp sgt i64 %43, %44
  br i1 %45, label %46, label %50

46:                                               ; preds = %35
  %47 = load i64, ptr %15, align 8
  %48 = load i64, ptr %16, align 8
  %49 = sub nsw i64 %48, %47
  store i64 %49, ptr %16, align 8
  br label %51

50:                                               ; preds = %35
  store i64 0, ptr %16, align 8
  br label %51

51:                                               ; preds = %50, %46
  %52 = load ptr, ptr %10, align 8
  %53 = load ptr, ptr %9, align 8
  %54 = ptrtoint ptr %52 to i64
  %55 = ptrtoint ptr %53 to i64
  %56 = sub i64 %54, %55
  store i64 %56, ptr %17, align 8
  %57 = load i64, ptr %17, align 8
  %58 = icmp sgt i64 %57, 0
  br i1 %58, label %59, label %75

59:                                               ; preds = %51
  %60 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %8, i32 0, i32 0
  %61 = load ptr, ptr %60, align 8
  %62 = load ptr, ptr %9, align 8
  %63 = load i64, ptr %17, align 8
  %64 = call i64 @_ZNSt3__115basic_streambufIcNS_11char_traitsIcEEE5sputnEPKcl(ptr %61, ptr %62, i64 %63)
  %65 = load i64, ptr %17, align 8
  %66 = icmp ne i64 %64, %65
  br i1 %66, label %67, label %74

67:                                               ; preds = %59
  %68 = call ptr @_ZNSt3__1L15__get_nullptr_tEv()
  %69 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %18, i32 0, i32 0
  store ptr %68, ptr %69, align 8
  %70 = call ptr @_ZNKSt3__19nullptr_tcvPT_INS_15basic_streambufIcNS_11char_traitsIcEEEEEEv(ptr %18)
  %71 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %8, i32 0, i32 0
  store ptr %70, ptr %71, align 8
  %72 = bitcast ptr %7 to ptr
  %73 = bitcast ptr %8 to ptr
  call void @llvm.memcpy.p0.p0.i64(ptr align 8 %72, ptr align 8 %73, i64 8, i1 false)
  br label %136

74:                                               ; preds = %59
  br label %75

75:                                               ; preds = %74, %51
  %76 = load i64, ptr %16, align 8
  %77 = icmp sgt i64 %76, 0
  br i1 %77, label %78, label %107

78:                                               ; preds = %75
  %79 = load i64, ptr %16, align 8
  %80 = load i8, ptr %13, align 1
  call void @_ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC1Emc(ptr %19, i64 %79, i8 signext %80)
  %81 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %8, i32 0, i32 0
  %82 = load ptr, ptr %81, align 8
  %83 = call ptr @_ZNKSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE4dataEv(ptr %19) #15
  %84 = load i64, ptr %16, align 8
  %85 = invoke i64 @_ZNSt3__115basic_streambufIcNS_11char_traitsIcEEE5sputnEPKcl(ptr %82, ptr %83, i64 %84)
          to label %86 unwind label %98

86:                                               ; preds = %78
  %87 = load i64, ptr %16, align 8
  %88 = icmp ne i64 %85, %87
  br i1 %88, label %89, label %102

89:                                               ; preds = %86
  %90 = invoke ptr @_ZNSt3__1L15__get_nullptr_tEv()
          to label %91 unwind label %98

91:                                               ; preds = %89
  %92 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %22, i32 0, i32 0
  store ptr %90, ptr %92, align 8
  %93 = invoke ptr @_ZNKSt3__19nullptr_tcvPT_INS_15basic_streambufIcNS_11char_traitsIcEEEEEEv(ptr %22)
          to label %94 unwind label %98

94:                                               ; preds = %91
  %95 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %8, i32 0, i32 0
  store ptr %93, ptr %95, align 8
  %96 = bitcast ptr %7 to ptr
  %97 = bitcast ptr %8 to ptr
  call void @llvm.memcpy.p0.p0.i64(ptr align 8 %96, ptr align 8 %97, i64 8, i1 false)
  store i32 1, ptr %23, align 4
  br label %103

98:                                               ; preds = %91, %89, %78
  %99 = landingpad { ptr, i32 }
          cleanup
  %100 = extractvalue { ptr, i32 } %99, 0
  store ptr %100, ptr %20, align 8
  %101 = extractvalue { ptr, i32 } %99, 1
  store i32 %101, ptr %21, align 4
  invoke void @_ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev(ptr %19)
          to label %106 unwind label %144

102:                                              ; preds = %86
  store i32 0, ptr %23, align 4
  br label %103

103:                                              ; preds = %102, %94
  call void @_ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev(ptr %19)
  %104 = load i32, ptr %23, align 4
  switch i32 %104, label %147 [
    i32 0, label %105
    i32 1, label %136
  ]

105:                                              ; preds = %103
  br label %107

106:                                              ; preds = %98
  br label %139

107:                                              ; preds = %105, %75
  %108 = load ptr, ptr %11, align 8
  %109 = load ptr, ptr %10, align 8
  %110 = ptrtoint ptr %108 to i64
  %111 = ptrtoint ptr %109 to i64
  %112 = sub i64 %110, %111
  store i64 %112, ptr %17, align 8
  %113 = load i64, ptr %17, align 8
  %114 = icmp sgt i64 %113, 0
  br i1 %114, label %115, label %131

115:                                              ; preds = %107
  %116 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %8, i32 0, i32 0
  %117 = load ptr, ptr %116, align 8
  %118 = load ptr, ptr %10, align 8
  %119 = load i64, ptr %17, align 8
  %120 = call i64 @_ZNSt3__115basic_streambufIcNS_11char_traitsIcEEE5sputnEPKcl(ptr %117, ptr %118, i64 %119)
  %121 = load i64, ptr %17, align 8
  %122 = icmp ne i64 %120, %121
  br i1 %122, label %123, label %130

123:                                              ; preds = %115
  %124 = call ptr @_ZNSt3__1L15__get_nullptr_tEv()
  %125 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %24, i32 0, i32 0
  store ptr %124, ptr %125, align 8
  %126 = call ptr @_ZNKSt3__19nullptr_tcvPT_INS_15basic_streambufIcNS_11char_traitsIcEEEEEEv(ptr %24)
  %127 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %8, i32 0, i32 0
  store ptr %126, ptr %127, align 8
  %128 = bitcast ptr %7 to ptr
  %129 = bitcast ptr %8 to ptr
  call void @llvm.memcpy.p0.p0.i64(ptr align 8 %128, ptr align 8 %129, i64 8, i1 false)
  br label %136

130:                                              ; preds = %115
  br label %131

131:                                              ; preds = %130, %107
  %132 = load ptr, ptr %12, align 8
  %133 = call i64 @_ZNSt3__18ios_base5widthEl(ptr %132, i64 0)
  %134 = bitcast ptr %7 to ptr
  %135 = bitcast ptr %8 to ptr
  call void @llvm.memcpy.p0.p0.i64(ptr align 8 %134, ptr align 8 %135, i64 8, i1 false)
  br label %136

136:                                              ; preds = %131, %123, %103, %67, %32
  %137 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %7, i32 0, i32 0
  %138 = load ptr, ptr %137, align 8
  ret ptr %138

139:                                              ; preds = %106
  %140 = load ptr, ptr %20, align 8
  %141 = load i32, ptr %21, align 4
  %142 = insertvalue { ptr, i32 } undef, ptr %140, 0
  %143 = insertvalue { ptr, i32 } %142, i32 %141, 1
  resume { ptr, i32 } %143

144:                                              ; preds = %98
  %145 = landingpad { ptr, i32 }
          catch ptr null
  %146 = extractvalue { ptr, i32 } %145, 0
  call void @__clang_call_terminate(ptr %146) #12
  unreachable

147:                                              ; preds = %103
  unreachable
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal zeroext i1 @_ZNKSt3__119ostreambuf_iteratorIcNS_11char_traitsIcEEE6failedEv(ptr %0) #2 align 2 personality ptr @__gxx_personality_v0 {
  %2 = alloca ptr, align 8
  %3 = alloca %"class.std::__1::basic_ostream.base", align 8
  %4 = alloca ptr, align 8
  %5 = alloca i32, align 4
  store ptr %0, ptr %2, align 8
  %6 = load ptr, ptr %2, align 8
  %7 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %6, i32 0, i32 0
  %8 = load ptr, ptr %7, align 8
  %9 = invoke ptr @_ZNSt3__1L15__get_nullptr_tEv()
          to label %10 unwind label %14

10:                                               ; preds = %1
  %11 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %3, i32 0, i32 0
  store ptr %9, ptr %11, align 8
  %12 = call ptr @_ZNKSt3__19nullptr_tcvPT_INS_15basic_streambufIcNS_11char_traitsIcEEEEEEv(ptr %3)
  %13 = icmp eq ptr %8, %12
  ret i1 %13

14:                                               ; preds = %1
  %15 = landingpad { ptr, i32 }
          filter [0 x ptr] zeroinitializer
  %16 = extractvalue { ptr, i32 } %15, 0
  store ptr %16, ptr %4, align 8
  %17 = extractvalue { ptr, i32 } %15, 1
  store i32 %17, ptr %5, align 4
  br label %18

18:                                               ; preds = %14
  %19 = load ptr, ptr %4, align 8
  call void @__cxa_call_unexpected(ptr %19) #13
  unreachable
}

declare void @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryD1Ev(ptr) unnamed_addr #3

declare void @_ZNSt3__18ios_base33__set_badbit_and_consider_rethrowEv(ptr) #3

declare void @__cxa_end_catch()

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal ptr @_ZNKSt3__19nullptr_tcvPT_INS_15basic_streambufIcNS_11char_traitsIcEEEEEEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  ret ptr null
}

declare void @__cxa_call_unexpected(ptr)

; Function Attrs: nocallback nofree nounwind willreturn memory(argmem: readwrite)
declare void @llvm.memcpy.p0.p0.i64(ptr noalias nocapture writeonly, ptr noalias nocapture readonly, i64, i1 immarg) #6

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal i64 @_ZNKSt3__18ios_base5widthEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = getelementptr inbounds %"class.std::__1::ios_base", ptr %3, i32 0, i32 3
  %5 = load i64, ptr %4, align 8
  ret i64 %5
}

; Function Attrs: noinline optnone ssp uwtable
define internal i64 @_ZNSt3__115basic_streambufIcNS_11char_traitsIcEEE5sputnEPKcl(ptr %0, ptr %1, i64 %2) #1 align 2 {
  %4 = alloca ptr, align 8
  %5 = alloca ptr, align 8
  %6 = alloca i64, align 8
  store ptr %0, ptr %4, align 8
  store ptr %1, ptr %5, align 8
  store i64 %2, ptr %6, align 8
  %7 = load ptr, ptr %4, align 8
  %8 = load ptr, ptr %5, align 8
  %9 = load i64, ptr %6, align 8
  %10 = bitcast ptr %7 to ptr
  %11 = load ptr, ptr %10, align 8
  %12 = getelementptr inbounds ptr, ptr %11, i64 12
  %13 = load ptr, ptr %12, align 8
  %14 = call i64 %13(ptr %7, ptr %8, i64 %9)
  ret i64 %14
}

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC1Emc(ptr %0, i64 %1, i8 signext %2) unnamed_addr #1 align 2 {
  %4 = alloca ptr, align 8
  %5 = alloca i64, align 8
  %6 = alloca i8, align 1
  store ptr %0, ptr %4, align 8
  store i64 %1, ptr %5, align 8
  store i8 %2, ptr %6, align 1
  %7 = load ptr, ptr %4, align 8
  %8 = load i64, ptr %5, align 8
  %9 = load i8, ptr %6, align 1
  call void @_ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2Emc(ptr %7, i64 %8, i8 signext %9)
  ret void
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal ptr @_ZNKSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE4dataEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = call ptr @_ZNKSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE13__get_pointerEv(ptr %3) #15
  %5 = call ptr @_ZNSt3__1L12__to_addressIKcEEPT_S3_(ptr %4) #15
  ret ptr %5
}

declare void @_ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev(ptr) unnamed_addr #3

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal i64 @_ZNSt3__18ios_base5widthEl(ptr %0, i64 %1) #2 align 2 {
  %3 = alloca ptr, align 8
  %4 = alloca i64, align 8
  %5 = alloca i64, align 8
  store ptr %0, ptr %3, align 8
  store i64 %1, ptr %4, align 8
  %6 = load ptr, ptr %3, align 8
  %7 = getelementptr inbounds %"class.std::__1::ios_base", ptr %6, i32 0, i32 3
  %8 = load i64, ptr %7, align 8
  store i64 %8, ptr %5, align 8
  %9 = load i64, ptr %4, align 8
  %10 = getelementptr inbounds %"class.std::__1::ios_base", ptr %6, i32 0, i32 3
  store i64 %9, ptr %10, align 8
  %11 = load i64, ptr %5, align 8
  ret i64 %11
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal ptr @_ZNKSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE13__get_pointerEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = call zeroext i1 @_ZNKSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9__is_longEv(ptr %3) #15
  br i1 %4, label %5, label %7

5:                                                ; preds = %1
  %6 = call ptr @_ZNKSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE18__get_long_pointerEv(ptr %3) #15
  br label %9

7:                                                ; preds = %1
  %8 = call ptr @_ZNKSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE19__get_short_pointerEv(ptr %3) #15
  br label %9

9:                                                ; preds = %7, %5
  %10 = phi ptr [ %6, %5 ], [ %8, %7 ]
  ret ptr %10
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal ptr @_ZNSt3__1L12__to_addressIKcEEPT_S3_(ptr %0) #2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  ret ptr %3
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal zeroext i1 @_ZNKSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9__is_longEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = getelementptr inbounds %"class.std::__1::basic_string", ptr %3, i32 0, i32 0
  %5 = call nonnull align 8 dereferenceable(24) ptr @_ZNKSt3__117__compressed_pairINS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5__repES5_E5firstEv(ptr %4) #15
  %6 = getelementptr inbounds %"struct.std::__1::basic_string<char>::__rep", ptr %5, i32 0, i32 0
  %7 = bitcast ptr %6 to ptr
  %8 = getelementptr inbounds %"struct.std::__1::basic_string<char>::__short", ptr %7, i32 0, i32 0
  %9 = bitcast ptr %8 to ptr
  %10 = load i8, ptr %9, align 8
  %11 = zext i8 %10 to i64
  %12 = and i64 %11, 1
  %13 = icmp ne i64 %12, 0
  ret i1 %13
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal ptr @_ZNKSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE18__get_long_pointerEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = getelementptr inbounds %"class.std::__1::basic_string", ptr %3, i32 0, i32 0
  %5 = call nonnull align 8 dereferenceable(24) ptr @_ZNKSt3__117__compressed_pairINS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5__repES5_E5firstEv(ptr %4) #15
  %6 = getelementptr inbounds %"struct.std::__1::basic_string<char>::__rep", ptr %5, i32 0, i32 0
  %7 = bitcast ptr %6 to ptr
  %8 = getelementptr inbounds %"struct.std::__1::basic_string<char>::__long", ptr %7, i32 0, i32 2
  %9 = load ptr, ptr %8, align 8
  ret ptr %9
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal ptr @_ZNKSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE19__get_short_pointerEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = getelementptr inbounds %"class.std::__1::basic_string", ptr %3, i32 0, i32 0
  %5 = call nonnull align 8 dereferenceable(24) ptr @_ZNKSt3__117__compressed_pairINS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5__repES5_E5firstEv(ptr %4) #15
  %6 = getelementptr inbounds %"struct.std::__1::basic_string<char>::__rep", ptr %5, i32 0, i32 0
  %7 = bitcast ptr %6 to ptr
  %8 = getelementptr inbounds %"struct.std::__1::basic_string<char>::__short", ptr %7, i32 0, i32 1
  %9 = getelementptr inbounds [23 x i8], ptr %8, i64 0, i64 0
  %10 = call ptr @_ZNSt3__114pointer_traitsIPKcE10pointer_toERS1_(ptr nonnull align 1 dereferenceable(1) %9) #15
  ret ptr %10
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal nonnull align 8 dereferenceable(24) ptr @_ZNKSt3__117__compressed_pairINS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5__repES5_E5firstEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = bitcast ptr %3 to ptr
  %5 = call nonnull align 8 dereferenceable(24) ptr @_ZNKSt3__122__compressed_pair_elemINS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5__repELi0ELb0EE5__getEv(ptr %4) #15
  ret ptr %5
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal ptr @_ZNSt3__114pointer_traitsIPKcE10pointer_toERS1_(ptr nonnull align 1 dereferenceable(1) %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = call ptr @_ZNSt3__1L9addressofIKcEEPT_RS2_(ptr nonnull align 1 dereferenceable(1) %3) #15
  ret ptr %4
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal ptr @_ZNSt3__1L9addressofIKcEEPT_RS2_(ptr nonnull align 1 dereferenceable(1) %0) #2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  ret ptr %3
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal nonnull align 8 dereferenceable(24) ptr @_ZNKSt3__122__compressed_pair_elemINS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5__repELi0ELb0EE5__getEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = getelementptr inbounds %"struct.std::__1::__compressed_pair_elem", ptr %3, i32 0, i32 0
  ret ptr %4
}

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2Emc(ptr %0, i64 %1, i8 signext %2) unnamed_addr #1 align 2 {
  %4 = alloca ptr, align 8
  %5 = alloca i64, align 8
  %6 = alloca i8, align 1
  %7 = alloca %union.anon.0, align 1
  %8 = alloca %union.anon.0, align 1
  store ptr %0, ptr %4, align 8
  store i64 %1, ptr %5, align 8
  store i8 %2, ptr %6, align 1
  %9 = load ptr, ptr %4, align 8
  %10 = bitcast ptr %9 to ptr
  %11 = getelementptr inbounds %"class.std::__1::basic_string", ptr %9, i32 0, i32 0
  call void @_ZNSt3__117__compressed_pairINS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5__repES5_EC1INS_18__default_init_tagESA_EEOT_OT0_(ptr %11, ptr nonnull align 1 dereferenceable(1) %7, ptr nonnull align 1 dereferenceable(1) %8)
  %12 = load i64, ptr %5, align 8
  %13 = load i8, ptr %6, align 1
  call void @_ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEmc(ptr %9, i64 %12, i8 signext %13)
  ret void
}

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__117__compressed_pairINS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5__repES5_EC1INS_18__default_init_tagESA_EEOT_OT0_(ptr %0, ptr nonnull align 1 dereferenceable(1) %1, ptr nonnull align 1 dereferenceable(1) %2) unnamed_addr #1 align 2 {
  %4 = alloca ptr, align 8
  %5 = alloca ptr, align 8
  %6 = alloca ptr, align 8
  store ptr %0, ptr %4, align 8
  store ptr %1, ptr %5, align 8
  store ptr %2, ptr %6, align 8
  %7 = load ptr, ptr %4, align 8
  %8 = load ptr, ptr %5, align 8
  %9 = load ptr, ptr %6, align 8
  call void @_ZNSt3__117__compressed_pairINS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5__repES5_EC2INS_18__default_init_tagESA_EEOT_OT0_(ptr %7, ptr nonnull align 1 dereferenceable(1) %8, ptr nonnull align 1 dereferenceable(1) %9)
  ret void
}

declare void @_ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEmc(ptr, i64, i8 signext) #3

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__117__compressed_pairINS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5__repES5_EC2INS_18__default_init_tagESA_EEOT_OT0_(ptr %0, ptr nonnull align 1 dereferenceable(1) %1, ptr nonnull align 1 dereferenceable(1) %2) unnamed_addr #1 align 2 {
  %4 = alloca ptr, align 8
  %5 = alloca ptr, align 8
  %6 = alloca ptr, align 8
  %7 = alloca %union.anon.0, align 1
  %8 = alloca %union.anon.0, align 1
  store ptr %0, ptr %4, align 8
  store ptr %1, ptr %5, align 8
  store ptr %2, ptr %6, align 8
  %9 = load ptr, ptr %4, align 8
  %10 = bitcast ptr %9 to ptr
  %11 = load ptr, ptr %5, align 8
  %12 = call nonnull align 1 dereferenceable(1) ptr @_ZNSt3__1L7forwardINS_18__default_init_tagEEEOT_RNS_16remove_referenceIS2_E4typeE(ptr nonnull align 1 dereferenceable(1) %11) #15
  call void @_ZNSt3__122__compressed_pair_elemINS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5__repELi0ELb0EEC2ENS_18__default_init_tagE(ptr %10)
  %13 = bitcast ptr %9 to ptr
  %14 = load ptr, ptr %6, align 8
  %15 = call nonnull align 1 dereferenceable(1) ptr @_ZNSt3__1L7forwardINS_18__default_init_tagEEEOT_RNS_16remove_referenceIS2_E4typeE(ptr nonnull align 1 dereferenceable(1) %14) #15
  call void @_ZNSt3__122__compressed_pair_elemINS_9allocatorIcEELi1ELb1EEC2ENS_18__default_init_tagE(ptr %13)
  ret void
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal nonnull align 1 dereferenceable(1) ptr @_ZNSt3__1L7forwardINS_18__default_init_tagEEEOT_RNS_16remove_referenceIS2_E4typeE(ptr nonnull align 1 dereferenceable(1) %0) #2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  ret ptr %3
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal void @_ZNSt3__122__compressed_pair_elemINS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5__repELi0ELb0EEC2ENS_18__default_init_tagE(ptr %0) unnamed_addr #2 align 2 {
  %2 = alloca %union.anon.0, align 1
  %3 = alloca ptr, align 8
  store ptr %0, ptr %3, align 8
  %4 = load ptr, ptr %3, align 8
  %5 = getelementptr inbounds %"struct.std::__1::__compressed_pair_elem", ptr %4, i32 0, i32 0
  ret void
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal void @_ZNSt3__122__compressed_pair_elemINS_9allocatorIcEELi1ELb1EEC2ENS_18__default_init_tagE(ptr %0) unnamed_addr #2 align 2 {
  %2 = alloca %union.anon.0, align 1
  %3 = alloca ptr, align 8
  store ptr %0, ptr %3, align 8
  %4 = load ptr, ptr %3, align 8
  %5 = bitcast ptr %4 to ptr
  call void @_ZNSt3__19allocatorIcEC2Ev(ptr %5) #15
  ret void
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal void @_ZNSt3__19allocatorIcEC2Ev(ptr %0) unnamed_addr #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = bitcast ptr %3 to ptr
  call void @_ZNSt3__116__non_trivial_ifILb1ENS_9allocatorIcEEEC2Ev(ptr %4) #15
  ret void
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal void @_ZNSt3__116__non_trivial_ifILb1ENS_9allocatorIcEEEC2Ev(ptr %0) unnamed_addr #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  ret void
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define linkonce_odr i32 @_ZNSt3__111char_traitsIcE3eofEv() #2 align 2 {
  ret i32 -1
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define linkonce_odr zeroext i1 @_ZNSt3__111char_traitsIcE11eq_int_typeEii(i32 %0, i32 %1) #2 align 2 {
  %3 = alloca i32, align 4
  %4 = alloca i32, align 4
  store i32 %0, ptr %3, align 4
  store i32 %1, ptr %4, align 4
  %5 = load i32, ptr %3, align 4
  %6 = load i32, ptr %4, align 4
  %7 = icmp eq i32 %5, %6
  ret i1 %7
}

; Function Attrs: noinline optnone ssp uwtable
define internal signext i8 @_ZNKSt3__19basic_iosIcNS_11char_traitsIcEEE5widenEc(ptr %0, i8 signext %1) #1 align 2 personality ptr @__gxx_personality_v0 {
  %3 = alloca ptr, align 8
  %4 = alloca i8, align 1
  %5 = alloca %"class.std::__1::basic_ostream.base", align 8
  %6 = alloca ptr, align 8
  %7 = alloca i32, align 4
  store ptr %0, ptr %3, align 8
  store i8 %1, ptr %4, align 1
  %8 = load ptr, ptr %3, align 8
  %9 = bitcast ptr %8 to ptr
  call void @_ZNKSt3__18ios_base6getlocEv(ptr sret(%"class.std::__1::basic_ostream.base") align 8 %5, ptr %9)
  %10 = invoke nonnull align 8 dereferenceable(25) ptr @_ZNSt3__1L9use_facetINS_5ctypeIcEEEERKT_RKNS_6localeE(ptr nonnull align 8 dereferenceable(8) %5)
          to label %11 unwind label %15

11:                                               ; preds = %2
  %12 = load i8, ptr %4, align 1
  %13 = invoke signext i8 @_ZNKSt3__15ctypeIcE5widenEc(ptr %10, i8 signext %12)
          to label %14 unwind label %15

14:                                               ; preds = %11
  call void @_ZNSt3__16localeD1Ev(ptr %5)
  ret i8 %13

15:                                               ; preds = %11, %2
  %16 = landingpad { ptr, i32 }
          cleanup
  %17 = extractvalue { ptr, i32 } %16, 0
  store ptr %17, ptr %6, align 8
  %18 = extractvalue { ptr, i32 } %16, 1
  store i32 %18, ptr %7, align 4
  invoke void @_ZNSt3__16localeD1Ev(ptr %5)
          to label %19 unwind label %25

19:                                               ; preds = %15
  br label %20

20:                                               ; preds = %19
  %21 = load ptr, ptr %6, align 8
  %22 = load i32, ptr %7, align 4
  %23 = insertvalue { ptr, i32 } undef, ptr %21, 0
  %24 = insertvalue { ptr, i32 } %23, i32 %22, 1
  resume { ptr, i32 } %24

25:                                               ; preds = %15
  %26 = landingpad { ptr, i32 }
          catch ptr null
  %27 = extractvalue { ptr, i32 } %26, 0
  call void @__clang_call_terminate(ptr %27) #12
  unreachable
}

declare void @_ZNKSt3__18ios_base6getlocEv(ptr sret(%"class.std::__1::basic_ostream.base") align 8, ptr) #3

; Function Attrs: noinline optnone ssp uwtable
define internal nonnull align 8 dereferenceable(25) ptr @_ZNSt3__1L9use_facetINS_5ctypeIcEEEERKT_RKNS_6localeE(ptr nonnull align 8 dereferenceable(8) %0) #1 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = call ptr @_ZNKSt3__16locale9use_facetERNS0_2idE(ptr %3, ptr nonnull align 8 dereferenceable(12) @_ZNSt3__15ctypeIcE2idE)
  %5 = bitcast ptr %4 to ptr
  ret ptr %5
}

; Function Attrs: noinline optnone ssp uwtable
define internal signext i8 @_ZNKSt3__15ctypeIcE5widenEc(ptr %0, i8 signext %1) #1 align 2 {
  %3 = alloca ptr, align 8
  %4 = alloca i8, align 1
  store ptr %0, ptr %3, align 8
  store i8 %1, ptr %4, align 1
  %5 = load ptr, ptr %3, align 8
  %6 = load i8, ptr %4, align 1
  %7 = bitcast ptr %5 to ptr
  %8 = load ptr, ptr %7, align 8
  %9 = getelementptr inbounds ptr, ptr %8, i64 7
  %10 = load ptr, ptr %9, align 8
  %11 = call signext i8 %10(ptr %5, i8 signext %6)
  ret i8 %11
}

declare void @_ZNSt3__16localeD1Ev(ptr) unnamed_addr #3

declare ptr @_ZNKSt3__16locale9use_facetERNS0_2idE(ptr, ptr nonnull align 8 dereferenceable(12)) #3

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal void @_ZNSt3__119ostreambuf_iteratorIcNS_11char_traitsIcEEEC2ERNS_13basic_ostreamIcS2_EE(ptr %0, ptr nonnull align 8 dereferenceable(8) %1) unnamed_addr #2 align 2 personality ptr @__gxx_personality_v0 {
  %3 = alloca ptr, align 8
  %4 = alloca ptr, align 8
  %5 = alloca ptr, align 8
  %6 = alloca i32, align 4
  store ptr %0, ptr %3, align 8
  store ptr %1, ptr %4, align 8
  %7 = load ptr, ptr %3, align 8
  %8 = bitcast ptr %7 to ptr
  %9 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %7, i32 0, i32 0
  %10 = load ptr, ptr %4, align 8
  %11 = bitcast ptr %10 to ptr
  %12 = load ptr, ptr %11, align 8
  %13 = getelementptr i8, ptr %12, i64 -24
  %14 = bitcast ptr %13 to ptr
  %15 = load i64, ptr %14, align 8
  %16 = bitcast ptr %10 to ptr
  %17 = getelementptr inbounds i8, ptr %16, i64 %15
  %18 = bitcast ptr %17 to ptr
  %19 = invoke ptr @_ZNKSt3__19basic_iosIcNS_11char_traitsIcEEE5rdbufEv(ptr %18)
          to label %20 unwind label %21

20:                                               ; preds = %2
  store ptr %19, ptr %9, align 8
  ret void

21:                                               ; preds = %2
  %22 = landingpad { ptr, i32 }
          filter [0 x ptr] zeroinitializer
  %23 = extractvalue { ptr, i32 } %22, 0
  store ptr %23, ptr %5, align 8
  %24 = extractvalue { ptr, i32 } %22, 1
  store i32 %24, ptr %6, align 4
  br label %25

25:                                               ; preds = %21
  %26 = load ptr, ptr %5, align 8
  call void @__cxa_call_unexpected(ptr %26) #13
  unreachable
}

; Function Attrs: noinline optnone ssp uwtable
define internal ptr @_ZNKSt3__19basic_iosIcNS_11char_traitsIcEEE5rdbufEv(ptr %0) #1 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = bitcast ptr %3 to ptr
  %5 = call ptr @_ZNKSt3__18ios_base5rdbufEv(ptr %4)
  %6 = bitcast ptr %5 to ptr
  ret ptr %6
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal ptr @_ZNKSt3__18ios_base5rdbufEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = getelementptr inbounds %"class.std::__1::ios_base", ptr %3, i32 0, i32 6
  %5 = load ptr, ptr %4, align 8
  ret ptr %5
}

; Function Attrs: nounwind
declare i64 @strlen(ptr) #7

; Function Attrs: noinline optnone ssp uwtable
define linkonce_odr void @_ZNSt3__114basic_ofstreamIcNS_11char_traitsIcEEED2Ev(ptr %0, ptr %1) unnamed_addr #1 align 2 personality ptr @__gxx_personality_v0 {
  %3 = alloca ptr, align 8
  %4 = alloca ptr, align 8
  %5 = alloca ptr, align 8
  %6 = alloca i32, align 4
  store ptr %0, ptr %3, align 8
  store ptr %1, ptr %4, align 8
  %7 = load ptr, ptr %3, align 8
  %8 = load ptr, ptr %4, align 8
  %9 = load ptr, ptr %8, align 8
  %10 = bitcast ptr %7 to ptr
  %11 = bitcast ptr %9 to ptr
  store ptr %11, ptr %10, align 8
  %12 = getelementptr inbounds ptr, ptr %8, i64 3
  %13 = load ptr, ptr %12, align 8
  %14 = bitcast ptr %7 to ptr
  %15 = load ptr, ptr %14, align 8
  %16 = getelementptr i8, ptr %15, i64 -24
  %17 = bitcast ptr %16 to ptr
  %18 = load i64, ptr %17, align 8
  %19 = bitcast ptr %7 to ptr
  %20 = getelementptr inbounds i8, ptr %19, i64 %18
  %21 = bitcast ptr %20 to ptr
  %22 = bitcast ptr %13 to ptr
  store ptr %22, ptr %21, align 8
  %23 = getelementptr inbounds %"class.std::__1::basic_ofstream", ptr %7, i32 0, i32 1
  invoke void @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEED1Ev(ptr %23)
          to label %24 unwind label %27

24:                                               ; preds = %2
  %25 = bitcast ptr %7 to ptr
  %26 = getelementptr inbounds ptr, ptr %8, i64 1
  call void @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(ptr %25, ptr %26)
  ret void

27:                                               ; preds = %2
  %28 = landingpad { ptr, i32 }
          cleanup
  %29 = extractvalue { ptr, i32 } %28, 0
  store ptr %29, ptr %5, align 8
  %30 = extractvalue { ptr, i32 } %28, 1
  store i32 %30, ptr %6, align 4
  %31 = bitcast ptr %7 to ptr
  %32 = getelementptr inbounds ptr, ptr %8, i64 1
  invoke void @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(ptr %31, ptr %32)
          to label %33 unwind label %39

33:                                               ; preds = %27
  br label %34

34:                                               ; preds = %33
  %35 = load ptr, ptr %5, align 8
  %36 = load i32, ptr %6, align 4
  %37 = insertvalue { ptr, i32 } undef, ptr %35, 0
  %38 = insertvalue { ptr, i32 } %37, i32 %36, 1
  resume { ptr, i32 } %38

39:                                               ; preds = %27
  %40 = landingpad { ptr, i32 }
          catch ptr null
  %41 = extractvalue { ptr, i32 } %40, 0
  call void @__clang_call_terminate(ptr %41) #12
  unreachable
}

declare void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(ptr) unnamed_addr #3

declare void @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEED1Ev(ptr) unnamed_addr #3

declare void @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(ptr, ptr) unnamed_addr #3

; Function Attrs: noinline optnone ssp uwtable
define linkonce_odr nonnull align 8 dereferenceable(8) ptr @_ZNSt3__14endlIcNS_11char_traitsIcEEEERNS_13basic_ostreamIT_T0_EES7_(ptr nonnull align 8 dereferenceable(8) %0) #1 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = load ptr, ptr %2, align 8
  %5 = bitcast ptr %4 to ptr
  %6 = load ptr, ptr %5, align 8
  %7 = getelementptr i8, ptr %6, i64 -24
  %8 = bitcast ptr %7 to ptr
  %9 = load i64, ptr %8, align 8
  %10 = bitcast ptr %4 to ptr
  %11 = getelementptr inbounds i8, ptr %10, i64 %9
  %12 = bitcast ptr %11 to ptr
  %13 = call signext i8 @_ZNKSt3__19basic_iosIcNS_11char_traitsIcEEE5widenEc(ptr %12, i8 signext 10)
  %14 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(ptr %3, i8 signext %13)
  %15 = load ptr, ptr %2, align 8
  %16 = call nonnull align 8 dereferenceable(8) ptr @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(ptr %15)
  %17 = load ptr, ptr %2, align 8
  ret ptr %17
}

; Function Attrs: noinline optnone ssp uwtable
define internal nonnull align 8 dereferenceable(8) ptr @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEPFRS3_S4_E(ptr %0, ptr %1) #1 align 2 {
  %3 = alloca ptr, align 8
  %4 = alloca ptr, align 8
  store ptr %0, ptr %3, align 8
  store ptr %1, ptr %4, align 8
  %5 = load ptr, ptr %3, align 8
  %6 = load ptr, ptr %4, align 8
  %7 = call nonnull align 8 dereferenceable(8) ptr %6(ptr nonnull align 8 dereferenceable(8) %5)
  ret ptr %7
}

declare nonnull align 8 dereferenceable(8) ptr @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(ptr, i32) #3

declare nonnull align 8 dereferenceable(8) ptr @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(ptr, i8 signext) #3

declare nonnull align 8 dereferenceable(8) ptr @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(ptr) #3

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEC1Ev(ptr %0) unnamed_addr #1 align 2 personality ptr @__gxx_personality_v0 {
  %2 = alloca ptr, align 8
  %3 = alloca ptr, align 8
  %4 = alloca i32, align 4
  store ptr %0, ptr %2, align 8
  %5 = load ptr, ptr %2, align 8
  %6 = bitcast ptr %5 to ptr
  %7 = getelementptr inbounds i8, ptr %6, i64 424
  %8 = bitcast ptr %7 to ptr
  call void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEEC2Ev(ptr %8)
  %9 = bitcast ptr %5 to ptr
  store ptr getelementptr inbounds ({ [5 x ptr], [5 x ptr] }, ptr @_ZTVNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i32 0, inrange i32 0, i32 3), ptr %9, align 8
  %10 = bitcast ptr %5 to ptr
  %11 = getelementptr inbounds i8, ptr %10, i64 424
  %12 = bitcast ptr %11 to ptr
  store ptr getelementptr inbounds ({ [5 x ptr], [5 x ptr] }, ptr @_ZTVNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i32 0, inrange i32 1, i32 3), ptr %12, align 8
  %13 = bitcast ptr %5 to ptr
  %14 = getelementptr inbounds %"class.std::__1::basic_ifstream", ptr %5, i32 0, i32 1
  %15 = bitcast ptr %14 to ptr
  invoke void @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEEC2EPNS_15basic_streambufIcS2_EE(ptr %13, ptr getelementptr inbounds ([4 x ptr], ptr @_ZTTNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i64 0, i64 1), ptr %15)
          to label %16 unwind label %23

16:                                               ; preds = %1
  %17 = bitcast ptr %5 to ptr
  store ptr getelementptr inbounds ({ [5 x ptr], [5 x ptr] }, ptr @_ZTVNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i32 0, inrange i32 0, i32 3), ptr %17, align 8
  %18 = bitcast ptr %5 to ptr
  %19 = getelementptr inbounds i8, ptr %18, i64 424
  %20 = bitcast ptr %19 to ptr
  store ptr getelementptr inbounds ({ [5 x ptr], [5 x ptr] }, ptr @_ZTVNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i32 0, inrange i32 1, i32 3), ptr %20, align 8
  %21 = getelementptr inbounds %"class.std::__1::basic_ifstream", ptr %5, i32 0, i32 1
  invoke void @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEEC1Ev(ptr %21)
          to label %22 unwind label %27

22:                                               ; preds = %16
  ret void

23:                                               ; preds = %1
  %24 = landingpad { ptr, i32 }
          cleanup
  %25 = extractvalue { ptr, i32 } %24, 0
  store ptr %25, ptr %3, align 8
  %26 = extractvalue { ptr, i32 } %24, 1
  store i32 %26, ptr %4, align 4
  br label %33

27:                                               ; preds = %16
  %28 = landingpad { ptr, i32 }
          cleanup
  %29 = extractvalue { ptr, i32 } %28, 0
  store ptr %29, ptr %3, align 8
  %30 = extractvalue { ptr, i32 } %28, 1
  store i32 %30, ptr %4, align 4
  %31 = bitcast ptr %5 to ptr
  invoke void @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEED2Ev(ptr %31, ptr getelementptr inbounds ([4 x ptr], ptr @_ZTTNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i64 0, i64 1))
          to label %32 unwind label %43

32:                                               ; preds = %27
  br label %33

33:                                               ; preds = %32, %23
  %34 = bitcast ptr %5 to ptr
  %35 = getelementptr inbounds i8, ptr %34, i64 424
  %36 = bitcast ptr %35 to ptr
  invoke void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(ptr %36)
          to label %37 unwind label %43

37:                                               ; preds = %33
  br label %38

38:                                               ; preds = %37
  %39 = load ptr, ptr %3, align 8
  %40 = load i32, ptr %4, align 4
  %41 = insertvalue { ptr, i32 } undef, ptr %39, 0
  %42 = insertvalue { ptr, i32 } %41, i32 %40, 1
  resume { ptr, i32 } %42

43:                                               ; preds = %33, %27
  %44 = landingpad { ptr, i32 }
          catch ptr null
  %45 = extractvalue { ptr, i32 } %44, 0
  call void @__clang_call_terminate(ptr %45) #12
  unreachable
}

declare void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEE4openEPKcj(ptr, ptr, i32) #3

; Function Attrs: noinline optnone ssp uwtable
define internal zeroext i1 @_ZNKSt3__19basic_iosIcNS_11char_traitsIcEEE4failEv(ptr %0) #1 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = bitcast ptr %3 to ptr
  %5 = call zeroext i1 @_ZNKSt3__18ios_base4failEv(ptr %4)
  ret i1 %5
}

; Function Attrs: noreturn
declare void @exit(i32) #8

; Function Attrs: noinline optnone ssp uwtable
define linkonce_odr void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED1Ev(ptr %0) unnamed_addr #1 align 2 personality ptr @__gxx_personality_v0 {
  %2 = alloca ptr, align 8
  %3 = alloca ptr, align 8
  %4 = alloca i32, align 4
  store ptr %0, ptr %2, align 8
  %5 = load ptr, ptr %2, align 8
  invoke void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED2Ev(ptr %5, ptr @_ZTTNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE)
          to label %6 unwind label %10

6:                                                ; preds = %1
  %7 = bitcast ptr %5 to ptr
  %8 = getelementptr inbounds i8, ptr %7, i64 424
  %9 = bitcast ptr %8 to ptr
  call void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(ptr %9)
  ret void

10:                                               ; preds = %1
  %11 = landingpad { ptr, i32 }
          cleanup
  %12 = extractvalue { ptr, i32 } %11, 0
  store ptr %12, ptr %3, align 8
  %13 = extractvalue { ptr, i32 } %11, 1
  store i32 %13, ptr %4, align 4
  %14 = bitcast ptr %5 to ptr
  %15 = getelementptr inbounds i8, ptr %14, i64 424
  %16 = bitcast ptr %15 to ptr
  invoke void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(ptr %16)
          to label %17 unwind label %23

17:                                               ; preds = %10
  br label %18

18:                                               ; preds = %17
  %19 = load ptr, ptr %3, align 8
  %20 = load i32, ptr %4, align 4
  %21 = insertvalue { ptr, i32 } undef, ptr %19, 0
  %22 = insertvalue { ptr, i32 } %21, i32 %20, 1
  resume { ptr, i32 } %22

23:                                               ; preds = %10
  %24 = landingpad { ptr, i32 }
          catch ptr null
  %25 = extractvalue { ptr, i32 } %24, 0
  call void @__clang_call_terminate(ptr %25) #12
  unreachable
}

declare nonnull align 8 dereferenceable(16) ptr @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi(ptr, ptr nonnull align 4 dereferenceable(4)) #3

; Function Attrs: nocallback nofree nosync nounwind speculatable willreturn memory(none)
declare { i64, i1 } @llvm.umul.with.overflow.i64(i64, i64) #9

; Function Attrs: nobuiltin allocsize(0)
declare nonnull ptr @_Znam(i64) #10

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEE5closeEv(ptr %0) #1 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = getelementptr inbounds %"class.std::__1::basic_ifstream", ptr %3, i32 0, i32 1
  %5 = call ptr @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEE5closeEv(ptr %4)
  %6 = icmp eq ptr %5, null
  br i1 %6, label %7, label %16

7:                                                ; preds = %1
  %8 = bitcast ptr %3 to ptr
  %9 = load ptr, ptr %8, align 8
  %10 = getelementptr i8, ptr %9, i64 -24
  %11 = bitcast ptr %10 to ptr
  %12 = load i64, ptr %11, align 8
  %13 = bitcast ptr %3 to ptr
  %14 = getelementptr inbounds i8, ptr %13, i64 %12
  %15 = bitcast ptr %14 to ptr
  call void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEE8setstateEj(ptr %15, i32 4)
  br label %16

16:                                               ; preds = %7, %1
  ret void
}

; Function Attrs: noinline optnone ssp uwtable
define linkonce_odr void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED2Ev(ptr %0, ptr %1) unnamed_addr #1 align 2 personality ptr @__gxx_personality_v0 {
  %3 = alloca ptr, align 8
  %4 = alloca ptr, align 8
  %5 = alloca ptr, align 8
  %6 = alloca i32, align 4
  store ptr %0, ptr %3, align 8
  store ptr %1, ptr %4, align 8
  %7 = load ptr, ptr %3, align 8
  %8 = load ptr, ptr %4, align 8
  %9 = load ptr, ptr %8, align 8
  %10 = bitcast ptr %7 to ptr
  %11 = bitcast ptr %9 to ptr
  store ptr %11, ptr %10, align 8
  %12 = getelementptr inbounds ptr, ptr %8, i64 3
  %13 = load ptr, ptr %12, align 8
  %14 = bitcast ptr %7 to ptr
  %15 = load ptr, ptr %14, align 8
  %16 = getelementptr i8, ptr %15, i64 -24
  %17 = bitcast ptr %16 to ptr
  %18 = load i64, ptr %17, align 8
  %19 = bitcast ptr %7 to ptr
  %20 = getelementptr inbounds i8, ptr %19, i64 %18
  %21 = bitcast ptr %20 to ptr
  %22 = bitcast ptr %13 to ptr
  store ptr %22, ptr %21, align 8
  %23 = getelementptr inbounds %"class.std::__1::basic_ifstream", ptr %7, i32 0, i32 1
  invoke void @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEED1Ev(ptr %23)
          to label %24 unwind label %27

24:                                               ; preds = %2
  %25 = bitcast ptr %7 to ptr
  %26 = getelementptr inbounds ptr, ptr %8, i64 1
  call void @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEED2Ev(ptr %25, ptr %26)
  ret void

27:                                               ; preds = %2
  %28 = landingpad { ptr, i32 }
          cleanup
  %29 = extractvalue { ptr, i32 } %28, 0
  store ptr %29, ptr %5, align 8
  %30 = extractvalue { ptr, i32 } %28, 1
  store i32 %30, ptr %6, align 4
  %31 = bitcast ptr %7 to ptr
  %32 = getelementptr inbounds ptr, ptr %8, i64 1
  invoke void @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEED2Ev(ptr %31, ptr %32)
          to label %33 unwind label %39

33:                                               ; preds = %27
  br label %34

34:                                               ; preds = %33
  %35 = load ptr, ptr %5, align 8
  %36 = load i32, ptr %6, align 4
  %37 = insertvalue { ptr, i32 } undef, ptr %35, 0
  %38 = insertvalue { ptr, i32 } %37, i32 %36, 1
  resume { ptr, i32 } %38

39:                                               ; preds = %27
  %40 = landingpad { ptr, i32 }
          catch ptr null
  %41 = extractvalue { ptr, i32 } %40, 0
  call void @__clang_call_terminate(ptr %41) #12
  unreachable
}

declare void @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEED2Ev(ptr, ptr) unnamed_addr #3

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal zeroext i1 @_ZNKSt3__18ios_base4failEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = getelementptr inbounds %"class.std::__1::ios_base", ptr %3, i32 0, i32 4
  %5 = load i32, ptr %4, align 8
  %6 = and i32 %5, 5
  %7 = icmp ne i32 %6, 0
  ret i1 %7
}

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEEC2Ev(ptr %0) unnamed_addr #1 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = bitcast ptr %3 to ptr
  call void @_ZNSt3__18ios_baseC2Ev(ptr %4)
  %5 = bitcast ptr %3 to ptr
  store ptr getelementptr inbounds ({ [4 x ptr] }, ptr @_ZTVNSt3__19basic_iosIcNS_11char_traitsIcEEEE, i32 0, inrange i32 0, i32 2), ptr %5, align 8
  ret void
}

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEEC2EPNS_15basic_streambufIcS2_EE(ptr %0, ptr %1, ptr %2) unnamed_addr #1 align 2 {
  %4 = alloca ptr, align 8
  %5 = alloca ptr, align 8
  %6 = alloca ptr, align 8
  store ptr %0, ptr %4, align 8
  store ptr %1, ptr %5, align 8
  store ptr %2, ptr %6, align 8
  %7 = load ptr, ptr %4, align 8
  %8 = load ptr, ptr %5, align 8
  %9 = load ptr, ptr %8, align 8
  %10 = bitcast ptr %7 to ptr
  %11 = bitcast ptr %9 to ptr
  store ptr %11, ptr %10, align 8
  %12 = getelementptr inbounds ptr, ptr %8, i64 1
  %13 = load ptr, ptr %12, align 8
  %14 = bitcast ptr %7 to ptr
  %15 = load ptr, ptr %14, align 8
  %16 = getelementptr i8, ptr %15, i64 -24
  %17 = bitcast ptr %16 to ptr
  %18 = load i64, ptr %17, align 8
  %19 = bitcast ptr %7 to ptr
  %20 = getelementptr inbounds i8, ptr %19, i64 %18
  %21 = bitcast ptr %20 to ptr
  %22 = bitcast ptr %13 to ptr
  store ptr %22, ptr %21, align 8
  %23 = getelementptr inbounds %"class.std::__1::basic_istream", ptr %7, i32 0, i32 1
  store i64 0, ptr %23, align 8
  %24 = bitcast ptr %7 to ptr
  %25 = load ptr, ptr %24, align 8
  %26 = getelementptr i8, ptr %25, i64 -24
  %27 = bitcast ptr %26 to ptr
  %28 = load i64, ptr %27, align 8
  %29 = bitcast ptr %7 to ptr
  %30 = getelementptr inbounds i8, ptr %29, i64 %28
  %31 = bitcast ptr %30 to ptr
  %32 = load ptr, ptr %6, align 8
  call void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEE4initEPNS_15basic_streambufIcS2_EE(ptr %31, ptr %32)
  ret void
}

declare void @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEEC1Ev(ptr) unnamed_addr #3

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEE4initEPNS_15basic_streambufIcS2_EE(ptr %0, ptr %1) #1 align 2 {
  %3 = alloca ptr, align 8
  %4 = alloca ptr, align 8
  %5 = alloca %"class.std::__1::basic_ostream.base", align 8
  store ptr %0, ptr %3, align 8
  store ptr %1, ptr %4, align 8
  %6 = load ptr, ptr %3, align 8
  %7 = bitcast ptr %6 to ptr
  %8 = load ptr, ptr %4, align 8
  %9 = bitcast ptr %8 to ptr
  call void @_ZNSt3__18ios_base4initEPv(ptr %7, ptr %9)
  %10 = call ptr @_ZNSt3__1L15__get_nullptr_tEv()
  %11 = getelementptr inbounds %"class.std::__1::basic_ostream.base", ptr %5, i32 0, i32 0
  store ptr %10, ptr %11, align 8
  %12 = call ptr @_ZNKSt3__19nullptr_tcvPT_INS_13basic_ostreamIcNS_11char_traitsIcEEEEEEv(ptr %5)
  %13 = getelementptr inbounds %"class.std::__1::basic_ios", ptr %6, i32 0, i32 1
  store ptr %12, ptr %13, align 8
  %14 = call i32 @_ZNSt3__111char_traitsIcE3eofEv() #15
  %15 = getelementptr inbounds %"class.std::__1::basic_ios", ptr %6, i32 0, i32 2
  store i32 %14, ptr %15, align 8
  ret void
}

declare void @_ZNSt3__18ios_base4initEPv(ptr, ptr) #3

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal ptr @_ZNKSt3__19nullptr_tcvPT_INS_13basic_ostreamIcNS_11char_traitsIcEEEEEEv(ptr %0) #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  ret ptr null
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal void @_ZNSt3__18ios_baseC2Ev(ptr %0) unnamed_addr #2 align 2 {
  %2 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %3 = load ptr, ptr %2, align 8
  %4 = bitcast ptr %3 to ptr
  store ptr getelementptr inbounds ({ [4 x ptr] }, ptr @_ZTVNSt3__18ios_baseE, i32 0, inrange i32 0, i32 2), ptr %4, align 8
  ret void
}

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEEC2EPNS_15basic_streambufIcS2_EE(ptr %0, ptr %1, ptr %2) unnamed_addr #1 align 2 {
  %4 = alloca ptr, align 8
  %5 = alloca ptr, align 8
  %6 = alloca ptr, align 8
  store ptr %0, ptr %4, align 8
  store ptr %1, ptr %5, align 8
  store ptr %2, ptr %6, align 8
  %7 = load ptr, ptr %4, align 8
  %8 = load ptr, ptr %5, align 8
  %9 = load ptr, ptr %8, align 8
  %10 = bitcast ptr %7 to ptr
  %11 = bitcast ptr %9 to ptr
  store ptr %11, ptr %10, align 8
  %12 = getelementptr inbounds ptr, ptr %8, i64 1
  %13 = load ptr, ptr %12, align 8
  %14 = bitcast ptr %7 to ptr
  %15 = load ptr, ptr %14, align 8
  %16 = getelementptr i8, ptr %15, i64 -24
  %17 = bitcast ptr %16 to ptr
  %18 = load i64, ptr %17, align 8
  %19 = bitcast ptr %7 to ptr
  %20 = getelementptr inbounds i8, ptr %19, i64 %18
  %21 = bitcast ptr %20 to ptr
  %22 = bitcast ptr %13 to ptr
  store ptr %22, ptr %21, align 8
  %23 = bitcast ptr %7 to ptr
  %24 = load ptr, ptr %23, align 8
  %25 = getelementptr i8, ptr %24, i64 -24
  %26 = bitcast ptr %25 to ptr
  %27 = load i64, ptr %26, align 8
  %28 = bitcast ptr %7 to ptr
  %29 = getelementptr inbounds i8, ptr %28, i64 %27
  %30 = bitcast ptr %29 to ptr
  %31 = load ptr, ptr %6, align 8
  call void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEE4initEPNS_15basic_streambufIcS2_EE(ptr %30, ptr %31)
  ret void
}

attributes #0 = { noinline norecurse optnone ssp uwtable "darwin-stkchk-strong-link" "frame-pointer"="all" "min-legal-vector-width"="0" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #1 = { noinline optnone ssp uwtable "darwin-stkchk-strong-link" "frame-pointer"="all" "min-legal-vector-width"="0" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #2 = { noinline nounwind optnone ssp uwtable "darwin-stkchk-strong-link" "frame-pointer"="all" "min-legal-vector-width"="0" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #3 = { "darwin-stkchk-strong-link" "frame-pointer"="all" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #4 = { nobuiltin nounwind "darwin-stkchk-strong-link" "frame-pointer"="all" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #5 = { noinline noreturn nounwind }
attributes #6 = { nocallback nofree nounwind willreturn memory(argmem: readwrite) }
attributes #7 = { nounwind "darwin-stkchk-strong-link" "frame-pointer"="all" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #8 = { noreturn "darwin-stkchk-strong-link" "frame-pointer"="all" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #9 = { nocallback nofree nosync nounwind speculatable willreturn memory(none) }
attributes #10 = { nobuiltin allocsize(0) "darwin-stkchk-strong-link" "frame-pointer"="all" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #11 = { builtin nounwind }
attributes #12 = { noreturn nounwind }
attributes #13 = { noreturn }
attributes #14 = { builtin allocsize(0) }
attributes #15 = { nounwind }

!llvm.ident = !{!0}
!llvm.module.flags = !{!1, !2, !3, !4, !5}

!0 = !{!"Apple clang version 14.0.0 (clang-1400.0.29.202)"}
!1 = !{i32 2, !"SDK Version", [2 x i32] [i32 13, i32 1]}
!2 = !{i32 1, !"wchar_size", i32 4}
!3 = !{i32 8, !"PIC Level", i32 2}
!4 = !{i32 7, !"uwtable", i32 1}
!5 = !{i32 7, !"frame-pointer", i32 2}
