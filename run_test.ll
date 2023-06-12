; ModuleID = 'run_test.cpp'
source_filename = "run_test.cpp"
target datalayout = "e-m:o-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-apple-macosx13.0.0"

%"class.std::__1::basic_ifstream" = type { %"class.std::__1::basic_istream.base", %"class.std::__1::basic_filebuf", %"class.std::__1::basic_ios.base" }
%"class.std::__1::basic_istream.base" = type { i32 (...)**, i64 }
%"class.std::__1::basic_filebuf" = type <{ %"class.std::__1::basic_streambuf", i8*, i8*, i8*, [8 x i8], i64, i8*, i64, %struct.__sFILE*, %"class.std::__1::codecvt"*, %union.__mbstate_t, %union.__mbstate_t, i32, i32, i8, i8, i8, [5 x i8] }>
%"class.std::__1::basic_streambuf" = type { i32 (...)**, %"class.std::__1::locale", i8*, i8*, i8*, i8*, i8*, i8* }
%"class.std::__1::locale" = type { %"class.std::__1::locale::__imp"* }
%"class.std::__1::locale::__imp" = type opaque
%struct.__sFILE = type { i8*, i32, i32, i16, i16, %struct.__sbuf, i32, i8*, i32 (i8*)*, i32 (i8*, i8*, i32)*, i64 (i8*, i64, i32)*, i32 (i8*, i8*, i32)*, %struct.__sbuf, %struct.__sFILEX*, i32, [3 x i8], [1 x i8], %struct.__sbuf, i32, i64 }
%struct.__sFILEX = type opaque
%struct.__sbuf = type { i8*, i32 }
%"class.std::__1::codecvt" = type { %"class.std::__1::locale::facet" }
%"class.std::__1::locale::facet" = type { %"class.std::__1::__shared_count" }
%"class.std::__1::__shared_count" = type { i32 (...)**, i64 }
%union.__mbstate_t = type { i64, [120 x i8] }
%"class.std::__1::basic_ios.base" = type <{ %"class.std::__1::ios_base", %"class.std::__1::basic_ostream"*, i32 }>
%"class.std::__1::ios_base" = type { i32 (...)**, i32, i64, i64, i32, i32, i8*, i8*, void (i32, %"class.std::__1::ios_base"*, i32)**, i32*, i64, i64, i64*, i64, i64, i8**, i64, i64 }
%"class.std::__1::basic_ostream" = type { i32 (...)**, %"class.std::__1::basic_ios.base" }
%"class.std::__1::basic_ios" = type <{ %"class.std::__1::ios_base", %"class.std::__1::basic_ostream"*, i32, [4 x i8] }>
%"class.std::__1::basic_istream" = type { i32 (...)**, i64, %"class.std::__1::basic_ios.base" }
%"struct.std::__1::nullptr_t" = type { i8* }

@.str = private unnamed_addr constant [32 x i8] c"expected and actual output are \00", align 1
@.str.1 = private unnamed_addr constant [10 x i8] c"the same\0A\00", align 1
@.str.2 = private unnamed_addr constant [14 x i8] c"not the same\0A\00", align 1
@.str.3 = private unnamed_addr constant [17 x i8] c"expected output:\00", align 1
@.str.4 = private unnamed_addr constant [4 x i8] c" %d\00", align 1
@.str.5 = private unnamed_addr constant [18 x i8] c"\0Aactual output:  \00", align 1
@.str.6 = private unnamed_addr constant [2 x i8] c"\0A\00", align 1
@.str.7 = private unnamed_addr constant [26 x i8] c"Error opening input file\0A\00", align 1
@_ZTVNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE = external unnamed_addr constant { [5 x i8*], [5 x i8*] }, align 8
@_ZTTNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE = external unnamed_addr constant [4 x i8*], align 8
@_ZTVNSt3__19basic_iosIcNS_11char_traitsIcEEEE = external unnamed_addr constant { [4 x i8*] }, align 8
@_ZTVNSt3__18ios_baseE = external unnamed_addr constant { [4 x i8*] }, align 8

; Function Attrs: noinline norecurse optnone ssp uwtable
define i32 @main(i32 %0, i8** %1) #0 {
  %3 = alloca i32, align 4
  %4 = alloca i32, align 4
  %5 = alloca i8**, align 8
  %6 = alloca i32*, align 8
  %7 = alloca i32*, align 8
  %8 = alloca i32*, align 8
  %9 = alloca i8, align 1
  %10 = alloca i32, align 4
  %11 = alloca i32, align 4
  %12 = alloca i32, align 4
  store i32 0, i32* %3, align 4
  store i32 %0, i32* %4, align 4
  store i8** %1, i8*** %5, align 8
  %13 = load i8**, i8*** %5, align 8
  %14 = getelementptr inbounds i8*, i8** %13, i64 1
  %15 = load i8*, i8** %14, align 8
  call void @_Z7read_inPKcPPiS2_S2_Ri(i8* %15, i32** %8, i32** %6, i32** %7, i32* nonnull align 4 dereferenceable(4) %10)
  %16 = load i32*, i32** %8, align 8
  %17 = load i32*, i32** %7, align 8
  call void @_Z7run_cfgPiS_(i32* %16, i32* %17)
  %18 = load i32*, i32** %6, align 8
  %19 = load i32*, i32** %7, align 8
  %20 = load i32, i32* %10, align 4
  %21 = call zeroext i1 @_Z3cmpPiS_i(i32* %18, i32* %19, i32 %20)
  %22 = zext i1 %21 to i8
  store i8 %22, i8* %9, align 1
  %23 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([32 x i8], [32 x i8]* @.str, i64 0, i64 0))
  %24 = load i8, i8* %9, align 1
  %25 = trunc i8 %24 to i1
  br i1 %25, label %26, label %28

26:                                               ; preds = %2
  %27 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([10 x i8], [10 x i8]* @.str.1, i64 0, i64 0))
  br label %30

28:                                               ; preds = %2
  %29 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([14 x i8], [14 x i8]* @.str.2, i64 0, i64 0))
  br label %30

30:                                               ; preds = %28, %26
  %31 = phi i32 [ %27, %26 ], [ %29, %28 ]
  %32 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([17 x i8], [17 x i8]* @.str.3, i64 0, i64 0))
  store i32 0, i32* %11, align 4
  br label %33

33:                                               ; preds = %44, %30
  %34 = load i32, i32* %11, align 4
  %35 = load i32, i32* %10, align 4
  %36 = icmp slt i32 %34, %35
  br i1 %36, label %37, label %47

37:                                               ; preds = %33
  %38 = load i32*, i32** %6, align 8
  %39 = load i32, i32* %11, align 4
  %40 = sext i32 %39 to i64
  %41 = getelementptr inbounds i32, i32* %38, i64 %40
  %42 = load i32, i32* %41, align 4
  %43 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.4, i64 0, i64 0), i32 %42)
  br label %44

44:                                               ; preds = %37
  %45 = load i32, i32* %11, align 4
  %46 = add nsw i32 %45, 1
  store i32 %46, i32* %11, align 4
  br label %33

47:                                               ; preds = %33
  %48 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([18 x i8], [18 x i8]* @.str.5, i64 0, i64 0))
  store i32 0, i32* %12, align 4
  br label %49

49:                                               ; preds = %61, %47
  %50 = load i32, i32* %12, align 4
  %51 = load i32, i32* %10, align 4
  %52 = mul nsw i32 2, %51
  %53 = icmp slt i32 %50, %52
  br i1 %53, label %54, label %64

54:                                               ; preds = %49
  %55 = load i32*, i32** %7, align 8
  %56 = load i32, i32* %12, align 4
  %57 = sext i32 %56 to i64
  %58 = getelementptr inbounds i32, i32* %55, i64 %57
  %59 = load i32, i32* %58, align 4
  %60 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.4, i64 0, i64 0), i32 %59)
  br label %61

61:                                               ; preds = %54
  %62 = load i32, i32* %12, align 4
  %63 = add nsw i32 %62, 1
  store i32 %63, i32* %12, align 4
  br label %49

64:                                               ; preds = %49
  %65 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @.str.6, i64 0, i64 0))
  %66 = load i32*, i32** %8, align 8
  %67 = icmp eq i32* %66, null
  br i1 %67, label %70, label %68

68:                                               ; preds = %64
  %69 = bitcast i32* %66 to i8*
  call void @_ZdaPv(i8* %69) #9
  br label %70

70:                                               ; preds = %68, %64
  %71 = load i32*, i32** %7, align 8
  %72 = icmp eq i32* %71, null
  br i1 %72, label %75, label %73

73:                                               ; preds = %70
  %74 = bitcast i32* %71 to i8*
  call void @_ZdaPv(i8* %74) #9
  br label %75

75:                                               ; preds = %73, %70
  %76 = load i32*, i32** %6, align 8
  %77 = icmp eq i32* %76, null
  br i1 %77, label %80, label %78

78:                                               ; preds = %75
  %79 = bitcast i32* %76 to i8*
  call void @_ZdaPv(i8* %79) #9
  br label %80

80:                                               ; preds = %78, %75
  ret i32 0
}

; Function Attrs: noinline optnone ssp uwtable
define void @_Z7read_inPKcPPiS2_S2_Ri(i8* %0, i32** %1, i32** %2, i32** %3, i32* nonnull align 4 dereferenceable(4) %4) #1 personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*) {
  %6 = alloca i8*, align 8
  %7 = alloca i32**, align 8
  %8 = alloca i32**, align 8
  %9 = alloca i32**, align 8
  %10 = alloca i32*, align 8
  %11 = alloca %"class.std::__1::basic_ifstream", align 8
  %12 = alloca i32, align 4
  %13 = alloca i8*, align 8
  %14 = alloca i32, align 4
  %15 = alloca i32, align 4
  %16 = alloca i32, align 4
  %17 = alloca i32, align 4
  store i8* %0, i8** %6, align 8
  store i32** %1, i32*** %7, align 8
  store i32** %2, i32*** %8, align 8
  store i32** %3, i32*** %9, align 8
  store i32* %4, i32** %10, align 8
  call void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEC1Ev(%"class.std::__1::basic_ifstream"* %11)
  %18 = load i8*, i8** %6, align 8
  invoke void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEE4openEPKcj(%"class.std::__1::basic_ifstream"* %11, i8* %18, i32 8)
          to label %19 unwind label %34

19:                                               ; preds = %5
  %20 = bitcast %"class.std::__1::basic_ifstream"* %11 to i8**
  %21 = load i8*, i8** %20, align 8
  %22 = getelementptr i8, i8* %21, i64 -24
  %23 = bitcast i8* %22 to i64*
  %24 = load i64, i64* %23, align 8
  %25 = bitcast %"class.std::__1::basic_ifstream"* %11 to i8*
  %26 = getelementptr inbounds i8, i8* %25, i64 %24
  %27 = bitcast i8* %26 to %"class.std::__1::basic_ios"*
  %28 = invoke zeroext i1 @_ZNKSt3__19basic_iosIcNS_11char_traitsIcEEE4failEv(%"class.std::__1::basic_ios"* %27)
          to label %29 unwind label %34

29:                                               ; preds = %19
  br i1 %28, label %30, label %38

30:                                               ; preds = %29
  %31 = invoke i32 (i8*, ...) @printf(i8* getelementptr inbounds ([26 x i8], [26 x i8]* @.str.7, i64 0, i64 0))
          to label %32 unwind label %34

32:                                               ; preds = %30
  invoke void @exit(i32 1) #10
          to label %33 unwind label %34

33:                                               ; preds = %32
  unreachable

34:                                               ; preds = %113, %101, %83, %64, %53, %45, %41, %38, %32, %30, %19, %5
  %35 = landingpad { i8*, i32 }
          cleanup
  %36 = extractvalue { i8*, i32 } %35, 0
  store i8* %36, i8** %13, align 8
  %37 = extractvalue { i8*, i32 } %35, 1
  store i32 %37, i32* %14, align 4
  invoke void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED1Ev(%"class.std::__1::basic_ifstream"* %11)
          to label %131 unwind label %137

38:                                               ; preds = %29
  %39 = bitcast %"class.std::__1::basic_ifstream"* %11 to %"class.std::__1::basic_istream"*
  %40 = invoke nonnull align 8 dereferenceable(16) %"class.std::__1::basic_istream"* @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi(%"class.std::__1::basic_istream"* %39, i32* nonnull align 4 dereferenceable(4) %12)
          to label %41 unwind label %34

41:                                               ; preds = %38
  %42 = bitcast %"class.std::__1::basic_ifstream"* %11 to %"class.std::__1::basic_istream"*
  %43 = load i32*, i32** %10, align 8
  %44 = invoke nonnull align 8 dereferenceable(16) %"class.std::__1::basic_istream"* @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi(%"class.std::__1::basic_istream"* %42, i32* nonnull align 4 dereferenceable(4) %43)
          to label %45 unwind label %34

45:                                               ; preds = %41
  %46 = load i32, i32* %12, align 4
  %47 = sext i32 %46 to i64
  %48 = call { i64, i1 } @llvm.umul.with.overflow.i64(i64 %47, i64 4)
  %49 = extractvalue { i64, i1 } %48, 1
  %50 = extractvalue { i64, i1 } %48, 0
  %51 = select i1 %49, i64 -1, i64 %50
  %52 = invoke noalias nonnull i8* @_Znam(i64 %51) #11
          to label %53 unwind label %34

53:                                               ; preds = %45
  %54 = bitcast i8* %52 to i32*
  %55 = load i32**, i32*** %7, align 8
  store i32* %54, i32** %55, align 8
  %56 = load i32*, i32** %10, align 8
  %57 = load i32, i32* %56, align 4
  %58 = sext i32 %57 to i64
  %59 = call { i64, i1 } @llvm.umul.with.overflow.i64(i64 %58, i64 4)
  %60 = extractvalue { i64, i1 } %59, 1
  %61 = extractvalue { i64, i1 } %59, 0
  %62 = select i1 %60, i64 -1, i64 %61
  %63 = invoke noalias nonnull i8* @_Znam(i64 %62) #11
          to label %64 unwind label %34

64:                                               ; preds = %53
  %65 = bitcast i8* %63 to i32*
  %66 = load i32**, i32*** %8, align 8
  store i32* %65, i32** %66, align 8
  %67 = load i32*, i32** %10, align 8
  %68 = load i32, i32* %67, align 4
  %69 = mul nsw i32 2, %68
  %70 = sext i32 %69 to i64
  %71 = call { i64, i1 } @llvm.umul.with.overflow.i64(i64 %70, i64 4)
  %72 = extractvalue { i64, i1 } %71, 1
  %73 = extractvalue { i64, i1 } %71, 0
  %74 = select i1 %72, i64 -1, i64 %73
  %75 = invoke noalias nonnull i8* @_Znam(i64 %74) #11
          to label %76 unwind label %34

76:                                               ; preds = %64
  %77 = bitcast i8* %75 to i32*
  %78 = load i32**, i32*** %9, align 8
  store i32* %77, i32** %78, align 8
  store i32 0, i32* %15, align 4
  br label %79

79:                                               ; preds = %92, %76
  %80 = load i32, i32* %15, align 4
  %81 = load i32, i32* %12, align 4
  %82 = icmp slt i32 %80, %81
  br i1 %82, label %83, label %95

83:                                               ; preds = %79
  %84 = bitcast %"class.std::__1::basic_ifstream"* %11 to %"class.std::__1::basic_istream"*
  %85 = load i32**, i32*** %7, align 8
  %86 = load i32*, i32** %85, align 8
  %87 = load i32, i32* %15, align 4
  %88 = sext i32 %87 to i64
  %89 = getelementptr inbounds i32, i32* %86, i64 %88
  %90 = invoke nonnull align 8 dereferenceable(16) %"class.std::__1::basic_istream"* @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi(%"class.std::__1::basic_istream"* %84, i32* nonnull align 4 dereferenceable(4) %89)
          to label %91 unwind label %34

91:                                               ; preds = %83
  br label %92

92:                                               ; preds = %91
  %93 = load i32, i32* %15, align 4
  %94 = add nsw i32 %93, 1
  store i32 %94, i32* %15, align 4
  br label %79

95:                                               ; preds = %79
  store i32 0, i32* %16, align 4
  br label %96

96:                                               ; preds = %110, %95
  %97 = load i32, i32* %16, align 4
  %98 = load i32*, i32** %10, align 8
  %99 = load i32, i32* %98, align 4
  %100 = icmp slt i32 %97, %99
  br i1 %100, label %101, label %113

101:                                              ; preds = %96
  %102 = bitcast %"class.std::__1::basic_ifstream"* %11 to %"class.std::__1::basic_istream"*
  %103 = load i32**, i32*** %8, align 8
  %104 = load i32*, i32** %103, align 8
  %105 = load i32, i32* %16, align 4
  %106 = sext i32 %105 to i64
  %107 = getelementptr inbounds i32, i32* %104, i64 %106
  %108 = invoke nonnull align 8 dereferenceable(16) %"class.std::__1::basic_istream"* @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi(%"class.std::__1::basic_istream"* %102, i32* nonnull align 4 dereferenceable(4) %107)
          to label %109 unwind label %34

109:                                              ; preds = %101
  br label %110

110:                                              ; preds = %109
  %111 = load i32, i32* %16, align 4
  %112 = add nsw i32 %111, 1
  store i32 %112, i32* %16, align 4
  br label %96

113:                                              ; preds = %96
  invoke void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEE5closeEv(%"class.std::__1::basic_ifstream"* %11)
          to label %114 unwind label %34

114:                                              ; preds = %113
  store i32 0, i32* %17, align 4
  br label %115

115:                                              ; preds = %127, %114
  %116 = load i32, i32* %17, align 4
  %117 = load i32*, i32** %10, align 8
  %118 = load i32, i32* %117, align 4
  %119 = mul nsw i32 2, %118
  %120 = icmp slt i32 %116, %119
  br i1 %120, label %121, label %130

121:                                              ; preds = %115
  %122 = load i32**, i32*** %9, align 8
  %123 = load i32*, i32** %122, align 8
  %124 = load i32, i32* %17, align 4
  %125 = sext i32 %124 to i64
  %126 = getelementptr inbounds i32, i32* %123, i64 %125
  store i32 -1, i32* %126, align 4
  br label %127

127:                                              ; preds = %121
  %128 = load i32, i32* %17, align 4
  %129 = add nsw i32 %128, 1
  store i32 %129, i32* %17, align 4
  br label %115

130:                                              ; preds = %115
  call void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED1Ev(%"class.std::__1::basic_ifstream"* %11)
  ret void

131:                                              ; preds = %34
  br label %132

132:                                              ; preds = %131
  %133 = load i8*, i8** %13, align 8
  %134 = load i32, i32* %14, align 4
  %135 = insertvalue { i8*, i32 } undef, i8* %133, 0
  %136 = insertvalue { i8*, i32 } %135, i32 %134, 1
  resume { i8*, i32 } %136

137:                                              ; preds = %34
  %138 = landingpad { i8*, i32 }
          catch i8* null
  %139 = extractvalue { i8*, i32 } %138, 0
  call void @__clang_call_terminate(i8* %139) #12
  unreachable
}

declare void @_Z7run_cfgPiS_(i32*, i32*) #2

; Function Attrs: noinline nounwind optnone ssp uwtable
define zeroext i1 @_Z3cmpPiS_i(i32* %0, i32* %1, i32 %2) #3 {
  %4 = alloca i1, align 1
  %5 = alloca i32*, align 8
  %6 = alloca i32*, align 8
  %7 = alloca i32, align 4
  %8 = alloca i32, align 4
  %9 = alloca i32, align 4
  store i32* %0, i32** %5, align 8
  store i32* %1, i32** %6, align 8
  store i32 %2, i32* %7, align 4
  store i32 0, i32* %8, align 4
  br label %10

10:                                               ; preds = %28, %3
  %11 = load i32, i32* %8, align 4
  %12 = load i32, i32* %7, align 4
  %13 = icmp slt i32 %11, %12
  br i1 %13, label %14, label %31

14:                                               ; preds = %10
  %15 = load i32*, i32** %5, align 8
  %16 = load i32, i32* %8, align 4
  %17 = sext i32 %16 to i64
  %18 = getelementptr inbounds i32, i32* %15, i64 %17
  %19 = load i32, i32* %18, align 4
  %20 = load i32*, i32** %6, align 8
  %21 = load i32, i32* %8, align 4
  %22 = sext i32 %21 to i64
  %23 = getelementptr inbounds i32, i32* %20, i64 %22
  %24 = load i32, i32* %23, align 4
  %25 = icmp ne i32 %19, %24
  br i1 %25, label %26, label %27

26:                                               ; preds = %14
  store i1 false, i1* %4, align 1
  br label %51

27:                                               ; preds = %14
  br label %28

28:                                               ; preds = %27
  %29 = load i32, i32* %8, align 4
  %30 = add nsw i32 %29, 1
  store i32 %30, i32* %8, align 4
  br label %10

31:                                               ; preds = %10
  %32 = load i32, i32* %7, align 4
  store i32 %32, i32* %9, align 4
  br label %33

33:                                               ; preds = %47, %31
  %34 = load i32, i32* %9, align 4
  %35 = load i32, i32* %7, align 4
  %36 = mul nsw i32 2, %35
  %37 = icmp slt i32 %34, %36
  br i1 %37, label %38, label %50

38:                                               ; preds = %33
  %39 = load i32*, i32** %6, align 8
  %40 = load i32, i32* %9, align 4
  %41 = sext i32 %40 to i64
  %42 = getelementptr inbounds i32, i32* %39, i64 %41
  %43 = load i32, i32* %42, align 4
  %44 = icmp ne i32 %43, -1
  br i1 %44, label %45, label %46

45:                                               ; preds = %38
  store i1 false, i1* %4, align 1
  br label %51

46:                                               ; preds = %38
  br label %47

47:                                               ; preds = %46
  %48 = load i32, i32* %9, align 4
  %49 = add nsw i32 %48, 1
  store i32 %49, i32* %9, align 4
  br label %33

50:                                               ; preds = %33
  store i1 true, i1* %4, align 1
  br label %51

51:                                               ; preds = %50, %45, %26
  %52 = load i1, i1* %4, align 1
  ret i1 %52
}

declare i32 @printf(i8*, ...) #2

; Function Attrs: nobuiltin nounwind
declare void @_ZdaPv(i8*) #4

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEC1Ev(%"class.std::__1::basic_ifstream"* %0) unnamed_addr #1 align 2 personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*) {
  %2 = alloca %"class.std::__1::basic_ifstream"*, align 8
  %3 = alloca i8*, align 8
  %4 = alloca i32, align 4
  store %"class.std::__1::basic_ifstream"* %0, %"class.std::__1::basic_ifstream"** %2, align 8
  %5 = load %"class.std::__1::basic_ifstream"*, %"class.std::__1::basic_ifstream"** %2, align 8
  %6 = bitcast %"class.std::__1::basic_ifstream"* %5 to i8*
  %7 = getelementptr inbounds i8, i8* %6, i64 424
  %8 = bitcast i8* %7 to %"class.std::__1::basic_ios"*
  call void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEEC2Ev(%"class.std::__1::basic_ios"* %8)
  %9 = bitcast %"class.std::__1::basic_ifstream"* %5 to i32 (...)***
  store i32 (...)** bitcast (i8** getelementptr inbounds ({ [5 x i8*], [5 x i8*] }, { [5 x i8*], [5 x i8*] }* @_ZTVNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i32 0, inrange i32 0, i32 3) to i32 (...)**), i32 (...)*** %9, align 8
  %10 = bitcast %"class.std::__1::basic_ifstream"* %5 to i8*
  %11 = getelementptr inbounds i8, i8* %10, i64 424
  %12 = bitcast i8* %11 to i32 (...)***
  store i32 (...)** bitcast (i8** getelementptr inbounds ({ [5 x i8*], [5 x i8*] }, { [5 x i8*], [5 x i8*] }* @_ZTVNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i32 0, inrange i32 1, i32 3) to i32 (...)**), i32 (...)*** %12, align 8
  %13 = bitcast %"class.std::__1::basic_ifstream"* %5 to %"class.std::__1::basic_istream"*
  %14 = getelementptr inbounds %"class.std::__1::basic_ifstream", %"class.std::__1::basic_ifstream"* %5, i32 0, i32 1
  %15 = bitcast %"class.std::__1::basic_filebuf"* %14 to %"class.std::__1::basic_streambuf"*
  invoke void @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEEC2EPNS_15basic_streambufIcS2_EE(%"class.std::__1::basic_istream"* %13, i8** getelementptr inbounds ([4 x i8*], [4 x i8*]* @_ZTTNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i64 0, i64 1), %"class.std::__1::basic_streambuf"* %15)
          to label %16 unwind label %23

16:                                               ; preds = %1
  %17 = bitcast %"class.std::__1::basic_ifstream"* %5 to i32 (...)***
  store i32 (...)** bitcast (i8** getelementptr inbounds ({ [5 x i8*], [5 x i8*] }, { [5 x i8*], [5 x i8*] }* @_ZTVNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i32 0, inrange i32 0, i32 3) to i32 (...)**), i32 (...)*** %17, align 8
  %18 = bitcast %"class.std::__1::basic_ifstream"* %5 to i8*
  %19 = getelementptr inbounds i8, i8* %18, i64 424
  %20 = bitcast i8* %19 to i32 (...)***
  store i32 (...)** bitcast (i8** getelementptr inbounds ({ [5 x i8*], [5 x i8*] }, { [5 x i8*], [5 x i8*] }* @_ZTVNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i32 0, inrange i32 1, i32 3) to i32 (...)**), i32 (...)*** %20, align 8
  %21 = getelementptr inbounds %"class.std::__1::basic_ifstream", %"class.std::__1::basic_ifstream"* %5, i32 0, i32 1
  invoke void @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEEC1Ev(%"class.std::__1::basic_filebuf"* %21)
          to label %22 unwind label %27

22:                                               ; preds = %16
  ret void

23:                                               ; preds = %1
  %24 = landingpad { i8*, i32 }
          cleanup
  %25 = extractvalue { i8*, i32 } %24, 0
  store i8* %25, i8** %3, align 8
  %26 = extractvalue { i8*, i32 } %24, 1
  store i32 %26, i32* %4, align 4
  br label %33

27:                                               ; preds = %16
  %28 = landingpad { i8*, i32 }
          cleanup
  %29 = extractvalue { i8*, i32 } %28, 0
  store i8* %29, i8** %3, align 8
  %30 = extractvalue { i8*, i32 } %28, 1
  store i32 %30, i32* %4, align 4
  %31 = bitcast %"class.std::__1::basic_ifstream"* %5 to %"class.std::__1::basic_istream"*
  invoke void @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEED2Ev(%"class.std::__1::basic_istream"* %31, i8** getelementptr inbounds ([4 x i8*], [4 x i8*]* @_ZTTNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i64 0, i64 1))
          to label %32 unwind label %43

32:                                               ; preds = %27
  br label %33

33:                                               ; preds = %32, %23
  %34 = bitcast %"class.std::__1::basic_ifstream"* %5 to i8*
  %35 = getelementptr inbounds i8, i8* %34, i64 424
  %36 = bitcast i8* %35 to %"class.std::__1::basic_ios"*
  invoke void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(%"class.std::__1::basic_ios"* %36)
          to label %37 unwind label %43

37:                                               ; preds = %33
  br label %38

38:                                               ; preds = %37
  %39 = load i8*, i8** %3, align 8
  %40 = load i32, i32* %4, align 4
  %41 = insertvalue { i8*, i32 } undef, i8* %39, 0
  %42 = insertvalue { i8*, i32 } %41, i32 %40, 1
  resume { i8*, i32 } %42

43:                                               ; preds = %33, %27
  %44 = landingpad { i8*, i32 }
          catch i8* null
  %45 = extractvalue { i8*, i32 } %44, 0
  call void @__clang_call_terminate(i8* %45) #12
  unreachable
}

declare void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEE4openEPKcj(%"class.std::__1::basic_ifstream"*, i8*, i32) #2

declare i32 @__gxx_personality_v0(...)

; Function Attrs: noinline optnone ssp uwtable
define internal zeroext i1 @_ZNKSt3__19basic_iosIcNS_11char_traitsIcEEE4failEv(%"class.std::__1::basic_ios"* %0) #1 align 2 {
  %2 = alloca %"class.std::__1::basic_ios"*, align 8
  store %"class.std::__1::basic_ios"* %0, %"class.std::__1::basic_ios"** %2, align 8
  %3 = load %"class.std::__1::basic_ios"*, %"class.std::__1::basic_ios"** %2, align 8
  %4 = bitcast %"class.std::__1::basic_ios"* %3 to %"class.std::__1::ios_base"*
  %5 = call zeroext i1 @_ZNKSt3__18ios_base4failEv(%"class.std::__1::ios_base"* %4)
  ret i1 %5
}

; Function Attrs: noreturn
declare void @exit(i32) #5

declare nonnull align 8 dereferenceable(16) %"class.std::__1::basic_istream"* @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi(%"class.std::__1::basic_istream"*, i32* nonnull align 4 dereferenceable(4)) #2

; Function Attrs: nofree nosync nounwind readnone speculatable willreturn
declare { i64, i1 } @llvm.umul.with.overflow.i64(i64, i64) #6

; Function Attrs: nobuiltin allocsize(0)
declare nonnull i8* @_Znam(i64) #7

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEE5closeEv(%"class.std::__1::basic_ifstream"* %0) #1 align 2 {
  %2 = alloca %"class.std::__1::basic_ifstream"*, align 8
  store %"class.std::__1::basic_ifstream"* %0, %"class.std::__1::basic_ifstream"** %2, align 8
  %3 = load %"class.std::__1::basic_ifstream"*, %"class.std::__1::basic_ifstream"** %2, align 8
  %4 = getelementptr inbounds %"class.std::__1::basic_ifstream", %"class.std::__1::basic_ifstream"* %3, i32 0, i32 1
  %5 = call %"class.std::__1::basic_filebuf"* @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEE5closeEv(%"class.std::__1::basic_filebuf"* %4)
  %6 = icmp eq %"class.std::__1::basic_filebuf"* %5, null
  br i1 %6, label %7, label %16

7:                                                ; preds = %1
  %8 = bitcast %"class.std::__1::basic_ifstream"* %3 to i8**
  %9 = load i8*, i8** %8, align 8
  %10 = getelementptr i8, i8* %9, i64 -24
  %11 = bitcast i8* %10 to i64*
  %12 = load i64, i64* %11, align 8
  %13 = bitcast %"class.std::__1::basic_ifstream"* %3 to i8*
  %14 = getelementptr inbounds i8, i8* %13, i64 %12
  %15 = bitcast i8* %14 to %"class.std::__1::basic_ios"*
  call void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEE8setstateEj(%"class.std::__1::basic_ios"* %15, i32 4)
  br label %16

16:                                               ; preds = %7, %1
  ret void
}

; Function Attrs: noinline optnone ssp uwtable
define linkonce_odr void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED1Ev(%"class.std::__1::basic_ifstream"* %0) unnamed_addr #1 align 2 personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*) {
  %2 = alloca %"class.std::__1::basic_ifstream"*, align 8
  %3 = alloca i8*, align 8
  %4 = alloca i32, align 4
  store %"class.std::__1::basic_ifstream"* %0, %"class.std::__1::basic_ifstream"** %2, align 8
  %5 = load %"class.std::__1::basic_ifstream"*, %"class.std::__1::basic_ifstream"** %2, align 8
  invoke void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED2Ev(%"class.std::__1::basic_ifstream"* %5, i8** getelementptr inbounds ([4 x i8*], [4 x i8*]* @_ZTTNSt3__114basic_ifstreamIcNS_11char_traitsIcEEEE, i64 0, i64 0))
          to label %6 unwind label %10

6:                                                ; preds = %1
  %7 = bitcast %"class.std::__1::basic_ifstream"* %5 to i8*
  %8 = getelementptr inbounds i8, i8* %7, i64 424
  %9 = bitcast i8* %8 to %"class.std::__1::basic_ios"*
  call void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(%"class.std::__1::basic_ios"* %9)
  ret void

10:                                               ; preds = %1
  %11 = landingpad { i8*, i32 }
          cleanup
  %12 = extractvalue { i8*, i32 } %11, 0
  store i8* %12, i8** %3, align 8
  %13 = extractvalue { i8*, i32 } %11, 1
  store i32 %13, i32* %4, align 4
  %14 = bitcast %"class.std::__1::basic_ifstream"* %5 to i8*
  %15 = getelementptr inbounds i8, i8* %14, i64 424
  %16 = bitcast i8* %15 to %"class.std::__1::basic_ios"*
  invoke void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(%"class.std::__1::basic_ios"* %16)
          to label %17 unwind label %23

17:                                               ; preds = %10
  br label %18

18:                                               ; preds = %17
  %19 = load i8*, i8** %3, align 8
  %20 = load i32, i32* %4, align 4
  %21 = insertvalue { i8*, i32 } undef, i8* %19, 0
  %22 = insertvalue { i8*, i32 } %21, i32 %20, 1
  resume { i8*, i32 } %22

23:                                               ; preds = %10
  %24 = landingpad { i8*, i32 }
          catch i8* null
  %25 = extractvalue { i8*, i32 } %24, 0
  call void @__clang_call_terminate(i8* %25) #12
  unreachable
}

; Function Attrs: noinline noreturn nounwind
define linkonce_odr hidden void @__clang_call_terminate(i8* %0) #8 {
  %2 = call i8* @__cxa_begin_catch(i8* %0) #13
  call void @_ZSt9terminatev() #12
  unreachable
}

declare i8* @__cxa_begin_catch(i8*)

declare void @_ZSt9terminatev()

; Function Attrs: noinline optnone ssp uwtable
define linkonce_odr void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED2Ev(%"class.std::__1::basic_ifstream"* %0, i8** %1) unnamed_addr #1 align 2 personality i8* bitcast (i32 (...)* @__gxx_personality_v0 to i8*) {
  %3 = alloca %"class.std::__1::basic_ifstream"*, align 8
  %4 = alloca i8**, align 8
  %5 = alloca i8*, align 8
  %6 = alloca i32, align 4
  store %"class.std::__1::basic_ifstream"* %0, %"class.std::__1::basic_ifstream"** %3, align 8
  store i8** %1, i8*** %4, align 8
  %7 = load %"class.std::__1::basic_ifstream"*, %"class.std::__1::basic_ifstream"** %3, align 8
  %8 = load i8**, i8*** %4, align 8
  %9 = load i8*, i8** %8, align 8
  %10 = bitcast %"class.std::__1::basic_ifstream"* %7 to i32 (...)***
  %11 = bitcast i8* %9 to i32 (...)**
  store i32 (...)** %11, i32 (...)*** %10, align 8
  %12 = getelementptr inbounds i8*, i8** %8, i64 3
  %13 = load i8*, i8** %12, align 8
  %14 = bitcast %"class.std::__1::basic_ifstream"* %7 to i8**
  %15 = load i8*, i8** %14, align 8
  %16 = getelementptr i8, i8* %15, i64 -24
  %17 = bitcast i8* %16 to i64*
  %18 = load i64, i64* %17, align 8
  %19 = bitcast %"class.std::__1::basic_ifstream"* %7 to i8*
  %20 = getelementptr inbounds i8, i8* %19, i64 %18
  %21 = bitcast i8* %20 to i32 (...)***
  %22 = bitcast i8* %13 to i32 (...)**
  store i32 (...)** %22, i32 (...)*** %21, align 8
  %23 = getelementptr inbounds %"class.std::__1::basic_ifstream", %"class.std::__1::basic_ifstream"* %7, i32 0, i32 1
  invoke void @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEED1Ev(%"class.std::__1::basic_filebuf"* %23)
          to label %24 unwind label %27

24:                                               ; preds = %2
  %25 = bitcast %"class.std::__1::basic_ifstream"* %7 to %"class.std::__1::basic_istream"*
  %26 = getelementptr inbounds i8*, i8** %8, i64 1
  call void @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEED2Ev(%"class.std::__1::basic_istream"* %25, i8** %26)
  ret void

27:                                               ; preds = %2
  %28 = landingpad { i8*, i32 }
          cleanup
  %29 = extractvalue { i8*, i32 } %28, 0
  store i8* %29, i8** %5, align 8
  %30 = extractvalue { i8*, i32 } %28, 1
  store i32 %30, i32* %6, align 4
  %31 = bitcast %"class.std::__1::basic_ifstream"* %7 to %"class.std::__1::basic_istream"*
  %32 = getelementptr inbounds i8*, i8** %8, i64 1
  invoke void @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEED2Ev(%"class.std::__1::basic_istream"* %31, i8** %32)
          to label %33 unwind label %39

33:                                               ; preds = %27
  br label %34

34:                                               ; preds = %33
  %35 = load i8*, i8** %5, align 8
  %36 = load i32, i32* %6, align 4
  %37 = insertvalue { i8*, i32 } undef, i8* %35, 0
  %38 = insertvalue { i8*, i32 } %37, i32 %36, 1
  resume { i8*, i32 } %38

39:                                               ; preds = %27
  %40 = landingpad { i8*, i32 }
          catch i8* null
  %41 = extractvalue { i8*, i32 } %40, 0
  call void @__clang_call_terminate(i8* %41) #12
  unreachable
}

declare void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(%"class.std::__1::basic_ios"*) unnamed_addr #2

; Function Attrs: noinline optnone ssp uwtable
define linkonce_odr void @_ZTv0_n24_NSt3__114basic_ifstreamIcNS_11char_traitsIcEEED1Ev(%"class.std::__1::basic_ifstream"* %0) unnamed_addr #1 align 2 {
  %2 = alloca %"class.std::__1::basic_ifstream"*, align 8
  store %"class.std::__1::basic_ifstream"* %0, %"class.std::__1::basic_ifstream"** %2, align 8
  %3 = load %"class.std::__1::basic_ifstream"*, %"class.std::__1::basic_ifstream"** %2, align 8
  %4 = bitcast %"class.std::__1::basic_ifstream"* %3 to i8*
  %5 = bitcast i8* %4 to i8**
  %6 = load i8*, i8** %5, align 8
  %7 = getelementptr inbounds i8, i8* %6, i64 -24
  %8 = bitcast i8* %7 to i64*
  %9 = load i64, i64* %8, align 8
  %10 = getelementptr inbounds i8, i8* %4, i64 %9
  %11 = bitcast i8* %10 to %"class.std::__1::basic_ifstream"*
  tail call void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED1Ev(%"class.std::__1::basic_ifstream"* %11)
  ret void
}

declare void @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEED1Ev(%"class.std::__1::basic_filebuf"*) unnamed_addr #2

declare void @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEED2Ev(%"class.std::__1::basic_istream"*, i8**) unnamed_addr #2

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEEC2Ev(%"class.std::__1::basic_ios"* %0) unnamed_addr #1 align 2 {
  %2 = alloca %"class.std::__1::basic_ios"*, align 8
  store %"class.std::__1::basic_ios"* %0, %"class.std::__1::basic_ios"** %2, align 8
  %3 = load %"class.std::__1::basic_ios"*, %"class.std::__1::basic_ios"** %2, align 8
  %4 = bitcast %"class.std::__1::basic_ios"* %3 to %"class.std::__1::ios_base"*
  call void @_ZNSt3__18ios_baseC2Ev(%"class.std::__1::ios_base"* %4)
  %5 = bitcast %"class.std::__1::basic_ios"* %3 to i32 (...)***
  store i32 (...)** bitcast (i8** getelementptr inbounds ({ [4 x i8*] }, { [4 x i8*] }* @_ZTVNSt3__19basic_iosIcNS_11char_traitsIcEEEE, i32 0, inrange i32 0, i32 2) to i32 (...)**), i32 (...)*** %5, align 8
  ret void
}

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEEC2EPNS_15basic_streambufIcS2_EE(%"class.std::__1::basic_istream"* %0, i8** %1, %"class.std::__1::basic_streambuf"* %2) unnamed_addr #1 align 2 {
  %4 = alloca %"class.std::__1::basic_istream"*, align 8
  %5 = alloca i8**, align 8
  %6 = alloca %"class.std::__1::basic_streambuf"*, align 8
  store %"class.std::__1::basic_istream"* %0, %"class.std::__1::basic_istream"** %4, align 8
  store i8** %1, i8*** %5, align 8
  store %"class.std::__1::basic_streambuf"* %2, %"class.std::__1::basic_streambuf"** %6, align 8
  %7 = load %"class.std::__1::basic_istream"*, %"class.std::__1::basic_istream"** %4, align 8
  %8 = load i8**, i8*** %5, align 8
  %9 = load i8*, i8** %8, align 8
  %10 = bitcast %"class.std::__1::basic_istream"* %7 to i32 (...)***
  %11 = bitcast i8* %9 to i32 (...)**
  store i32 (...)** %11, i32 (...)*** %10, align 8
  %12 = getelementptr inbounds i8*, i8** %8, i64 1
  %13 = load i8*, i8** %12, align 8
  %14 = bitcast %"class.std::__1::basic_istream"* %7 to i8**
  %15 = load i8*, i8** %14, align 8
  %16 = getelementptr i8, i8* %15, i64 -24
  %17 = bitcast i8* %16 to i64*
  %18 = load i64, i64* %17, align 8
  %19 = bitcast %"class.std::__1::basic_istream"* %7 to i8*
  %20 = getelementptr inbounds i8, i8* %19, i64 %18
  %21 = bitcast i8* %20 to i32 (...)***
  %22 = bitcast i8* %13 to i32 (...)**
  store i32 (...)** %22, i32 (...)*** %21, align 8
  %23 = getelementptr inbounds %"class.std::__1::basic_istream", %"class.std::__1::basic_istream"* %7, i32 0, i32 1
  store i64 0, i64* %23, align 8
  %24 = bitcast %"class.std::__1::basic_istream"* %7 to i8**
  %25 = load i8*, i8** %24, align 8
  %26 = getelementptr i8, i8* %25, i64 -24
  %27 = bitcast i8* %26 to i64*
  %28 = load i64, i64* %27, align 8
  %29 = bitcast %"class.std::__1::basic_istream"* %7 to i8*
  %30 = getelementptr inbounds i8, i8* %29, i64 %28
  %31 = bitcast i8* %30 to %"class.std::__1::basic_ios"*
  %32 = load %"class.std::__1::basic_streambuf"*, %"class.std::__1::basic_streambuf"** %6, align 8
  call void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEE4initEPNS_15basic_streambufIcS2_EE(%"class.std::__1::basic_ios"* %31, %"class.std::__1::basic_streambuf"* %32)
  ret void
}

declare void @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEEC1Ev(%"class.std::__1::basic_filebuf"*) unnamed_addr #2

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal void @_ZNSt3__18ios_baseC2Ev(%"class.std::__1::ios_base"* %0) unnamed_addr #3 align 2 {
  %2 = alloca %"class.std::__1::ios_base"*, align 8
  store %"class.std::__1::ios_base"* %0, %"class.std::__1::ios_base"** %2, align 8
  %3 = load %"class.std::__1::ios_base"*, %"class.std::__1::ios_base"** %2, align 8
  %4 = bitcast %"class.std::__1::ios_base"* %3 to i32 (...)***
  store i32 (...)** bitcast (i8** getelementptr inbounds ({ [4 x i8*] }, { [4 x i8*] }* @_ZTVNSt3__18ios_baseE, i32 0, inrange i32 0, i32 2) to i32 (...)**), i32 (...)*** %4, align 8
  ret void
}

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEE4initEPNS_15basic_streambufIcS2_EE(%"class.std::__1::basic_ios"* %0, %"class.std::__1::basic_streambuf"* %1) #1 align 2 {
  %3 = alloca %"class.std::__1::basic_ios"*, align 8
  %4 = alloca %"class.std::__1::basic_streambuf"*, align 8
  %5 = alloca %"struct.std::__1::nullptr_t", align 8
  store %"class.std::__1::basic_ios"* %0, %"class.std::__1::basic_ios"** %3, align 8
  store %"class.std::__1::basic_streambuf"* %1, %"class.std::__1::basic_streambuf"** %4, align 8
  %6 = load %"class.std::__1::basic_ios"*, %"class.std::__1::basic_ios"** %3, align 8
  %7 = bitcast %"class.std::__1::basic_ios"* %6 to %"class.std::__1::ios_base"*
  %8 = load %"class.std::__1::basic_streambuf"*, %"class.std::__1::basic_streambuf"** %4, align 8
  %9 = bitcast %"class.std::__1::basic_streambuf"* %8 to i8*
  call void @_ZNSt3__18ios_base4initEPv(%"class.std::__1::ios_base"* %7, i8* %9)
  %10 = call i8* @_ZNSt3__1L15__get_nullptr_tEv()
  %11 = getelementptr inbounds %"struct.std::__1::nullptr_t", %"struct.std::__1::nullptr_t"* %5, i32 0, i32 0
  store i8* %10, i8** %11, align 8
  %12 = call %"class.std::__1::basic_ostream"* @_ZNKSt3__19nullptr_tcvPT_INS_13basic_ostreamIcNS_11char_traitsIcEEEEEEv(%"struct.std::__1::nullptr_t"* %5)
  %13 = getelementptr inbounds %"class.std::__1::basic_ios", %"class.std::__1::basic_ios"* %6, i32 0, i32 1
  store %"class.std::__1::basic_ostream"* %12, %"class.std::__1::basic_ostream"** %13, align 8
  %14 = call i32 @_ZNSt3__111char_traitsIcE3eofEv() #13
  %15 = getelementptr inbounds %"class.std::__1::basic_ios", %"class.std::__1::basic_ios"* %6, i32 0, i32 2
  store i32 %14, i32* %15, align 8
  ret void
}

declare void @_ZNSt3__18ios_base4initEPv(%"class.std::__1::ios_base"*, i8*) #2

; Function Attrs: noinline optnone ssp uwtable
define internal i8* @_ZNSt3__1L15__get_nullptr_tEv() #1 {
  %1 = alloca %"struct.std::__1::nullptr_t", align 8
  call void @_ZNSt3__19nullptr_tC1EMNS0_5__natEi(%"struct.std::__1::nullptr_t"* %1, i64 -1)
  %2 = getelementptr inbounds %"struct.std::__1::nullptr_t", %"struct.std::__1::nullptr_t"* %1, i32 0, i32 0
  %3 = load i8*, i8** %2, align 8
  ret i8* %3
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal %"class.std::__1::basic_ostream"* @_ZNKSt3__19nullptr_tcvPT_INS_13basic_ostreamIcNS_11char_traitsIcEEEEEEv(%"struct.std::__1::nullptr_t"* %0) #3 align 2 {
  %2 = alloca %"struct.std::__1::nullptr_t"*, align 8
  store %"struct.std::__1::nullptr_t"* %0, %"struct.std::__1::nullptr_t"** %2, align 8
  %3 = load %"struct.std::__1::nullptr_t"*, %"struct.std::__1::nullptr_t"** %2, align 8
  ret %"class.std::__1::basic_ostream"* null
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define linkonce_odr i32 @_ZNSt3__111char_traitsIcE3eofEv() #3 align 2 {
  ret i32 -1
}

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__19nullptr_tC1EMNS0_5__natEi(%"struct.std::__1::nullptr_t"* %0, i64 %1) unnamed_addr #1 align 2 {
  %3 = alloca %"struct.std::__1::nullptr_t"*, align 8
  %4 = alloca i64, align 8
  store %"struct.std::__1::nullptr_t"* %0, %"struct.std::__1::nullptr_t"** %3, align 8
  store i64 %1, i64* %4, align 8
  %5 = load %"struct.std::__1::nullptr_t"*, %"struct.std::__1::nullptr_t"** %3, align 8
  %6 = load i64, i64* %4, align 8
  call void @_ZNSt3__19nullptr_tC2EMNS0_5__natEi(%"struct.std::__1::nullptr_t"* %5, i64 %6)
  ret void
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal void @_ZNSt3__19nullptr_tC2EMNS0_5__natEi(%"struct.std::__1::nullptr_t"* %0, i64 %1) unnamed_addr #3 align 2 {
  %3 = alloca %"struct.std::__1::nullptr_t"*, align 8
  %4 = alloca i64, align 8
  store %"struct.std::__1::nullptr_t"* %0, %"struct.std::__1::nullptr_t"** %3, align 8
  store i64 %1, i64* %4, align 8
  %5 = load %"struct.std::__1::nullptr_t"*, %"struct.std::__1::nullptr_t"** %3, align 8
  %6 = getelementptr inbounds %"struct.std::__1::nullptr_t", %"struct.std::__1::nullptr_t"* %5, i32 0, i32 0
  store i8* null, i8** %6, align 8
  ret void
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define internal zeroext i1 @_ZNKSt3__18ios_base4failEv(%"class.std::__1::ios_base"* %0) #3 align 2 {
  %2 = alloca %"class.std::__1::ios_base"*, align 8
  store %"class.std::__1::ios_base"* %0, %"class.std::__1::ios_base"** %2, align 8
  %3 = load %"class.std::__1::ios_base"*, %"class.std::__1::ios_base"** %2, align 8
  %4 = getelementptr inbounds %"class.std::__1::ios_base", %"class.std::__1::ios_base"* %3, i32 0, i32 4
  %5 = load i32, i32* %4, align 8
  %6 = and i32 %5, 5
  %7 = icmp ne i32 %6, 0
  ret i1 %7
}

declare %"class.std::__1::basic_filebuf"* @_ZNSt3__113basic_filebufIcNS_11char_traitsIcEEE5closeEv(%"class.std::__1::basic_filebuf"*) #2

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__19basic_iosIcNS_11char_traitsIcEEE8setstateEj(%"class.std::__1::basic_ios"* %0, i32 %1) #1 align 2 {
  %3 = alloca %"class.std::__1::basic_ios"*, align 8
  %4 = alloca i32, align 4
  store %"class.std::__1::basic_ios"* %0, %"class.std::__1::basic_ios"** %3, align 8
  store i32 %1, i32* %4, align 4
  %5 = load %"class.std::__1::basic_ios"*, %"class.std::__1::basic_ios"** %3, align 8
  %6 = bitcast %"class.std::__1::basic_ios"* %5 to %"class.std::__1::ios_base"*
  %7 = load i32, i32* %4, align 4
  call void @_ZNSt3__18ios_base8setstateEj(%"class.std::__1::ios_base"* %6, i32 %7)
  ret void
}

; Function Attrs: noinline optnone ssp uwtable
define internal void @_ZNSt3__18ios_base8setstateEj(%"class.std::__1::ios_base"* %0, i32 %1) #1 align 2 {
  %3 = alloca %"class.std::__1::ios_base"*, align 8
  %4 = alloca i32, align 4
  store %"class.std::__1::ios_base"* %0, %"class.std::__1::ios_base"** %3, align 8
  store i32 %1, i32* %4, align 4
  %5 = load %"class.std::__1::ios_base"*, %"class.std::__1::ios_base"** %3, align 8
  %6 = getelementptr inbounds %"class.std::__1::ios_base", %"class.std::__1::ios_base"* %5, i32 0, i32 4
  %7 = load i32, i32* %6, align 8
  %8 = load i32, i32* %4, align 4
  %9 = or i32 %7, %8
  call void @_ZNSt3__18ios_base5clearEj(%"class.std::__1::ios_base"* %5, i32 %9)
  ret void
}

declare void @_ZNSt3__18ios_base5clearEj(%"class.std::__1::ios_base"*, i32) #2

attributes #0 = { noinline norecurse optnone ssp uwtable "darwin-stkchk-strong-link" "frame-pointer"="all" "min-legal-vector-width"="0" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #1 = { noinline optnone ssp uwtable "darwin-stkchk-strong-link" "frame-pointer"="all" "min-legal-vector-width"="0" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #2 = { "darwin-stkchk-strong-link" "frame-pointer"="all" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #3 = { noinline nounwind optnone ssp uwtable "darwin-stkchk-strong-link" "frame-pointer"="all" "min-legal-vector-width"="0" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #4 = { nobuiltin nounwind "darwin-stkchk-strong-link" "frame-pointer"="all" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #5 = { noreturn "darwin-stkchk-strong-link" "frame-pointer"="all" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #6 = { nofree nosync nounwind readnone speculatable willreturn }
attributes #7 = { nobuiltin allocsize(0) "darwin-stkchk-strong-link" "frame-pointer"="all" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #8 = { noinline noreturn nounwind }
attributes #9 = { builtin nounwind }
attributes #10 = { noreturn }
attributes #11 = { builtin allocsize(0) }
attributes #12 = { noreturn nounwind }
attributes #13 = { nounwind }

!llvm.module.flags = !{!0, !1, !2, !3, !4}
!llvm.ident = !{!5}

!0 = !{i32 2, !"SDK Version", [2 x i32] [i32 13, i32 1]}
!1 = !{i32 1, !"wchar_size", i32 4}
!2 = !{i32 7, !"PIC Level", i32 2}
!3 = !{i32 7, !"uwtable", i32 1}
!4 = !{i32 7, !"frame-pointer", i32 2}
!5 = !{!"Apple clang version 14.0.0 (clang-1400.0.29.202)"}
