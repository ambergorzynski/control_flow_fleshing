; ModuleID = 'wrapper.cpp'
source_filename = "wrapper.cpp"
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

49:                                               ; preds = %60, %47
  %50 = load i32, i32* %12, align 4
  %51 = load i32, i32* %10, align 4
  %52 = icmp slt i32 %50, %51
  br i1 %52, label %53, label %63

53:                                               ; preds = %49
  %54 = load i32*, i32** %7, align 8
  %55 = load i32, i32* %12, align 4
  %56 = sext i32 %55 to i64
  %57 = getelementptr inbounds i32, i32* %54, i64 %56
  %58 = load i32, i32* %57, align 4
  %59 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.4, i64 0, i64 0), i32 %58)
  br label %60

60:                                               ; preds = %53
  %61 = load i32, i32* %12, align 4
  %62 = add nsw i32 %61, 1
  store i32 %62, i32* %12, align 4
  br label %49

63:                                               ; preds = %49
  %64 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @.str.6, i64 0, i64 0))
  %65 = load i32*, i32** %8, align 8
  %66 = icmp eq i32* %65, null
  br i1 %66, label %69, label %67

67:                                               ; preds = %63
  %68 = bitcast i32* %65 to i8*
  call void @_ZdaPv(i8* %68) #9
  br label %69

69:                                               ; preds = %67, %63
  %70 = load i32*, i32** %7, align 8
  %71 = icmp eq i32* %70, null
  br i1 %71, label %74, label %72

72:                                               ; preds = %69
  %73 = bitcast i32* %70 to i8*
  call void @_ZdaPv(i8* %73) #9
  br label %74

74:                                               ; preds = %72, %69
  %75 = load i32*, i32** %6, align 8
  %76 = icmp eq i32* %75, null
  br i1 %76, label %79, label %77

77:                                               ; preds = %74
  %78 = bitcast i32* %75 to i8*
  call void @_ZdaPv(i8* %78) #9
  br label %79

79:                                               ; preds = %77, %74
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

34:                                               ; preds = %112, %100, %82, %64, %53, %45, %41, %38, %32, %30, %19, %5
  %35 = landingpad { i8*, i32 }
          cleanup
  %36 = extractvalue { i8*, i32 } %35, 0
  store i8* %36, i8** %13, align 8
  %37 = extractvalue { i8*, i32 } %35, 1
  store i32 %37, i32* %14, align 4
  invoke void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED1Ev(%"class.std::__1::basic_ifstream"* %11)
          to label %129 unwind label %135

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
  %69 = sext i32 %68 to i64
  %70 = call { i64, i1 } @llvm.umul.with.overflow.i64(i64 %69, i64 4)
  %71 = extractvalue { i64, i1 } %70, 1
  %72 = extractvalue { i64, i1 } %70, 0
  %73 = select i1 %71, i64 -1, i64 %72
  %74 = invoke noalias nonnull i8* @_Znam(i64 %73) #11
          to label %75 unwind label %34

75:                                               ; preds = %64
  %76 = bitcast i8* %74 to i32*
  %77 = load i32**, i32*** %9, align 8
  store i32* %76, i32** %77, align 8
  store i32 0, i32* %15, align 4
  br label %78

78:                                               ; preds = %91, %75
  %79 = load i32, i32* %15, align 4
  %80 = load i32, i32* %12, align 4
  %81 = icmp slt i32 %79, %80
  br i1 %81, label %82, label %94

82:                                               ; preds = %78
  %83 = bitcast %"class.std::__1::basic_ifstream"* %11 to %"class.std::__1::basic_istream"*
  %84 = load i32**, i32*** %7, align 8
  %85 = load i32*, i32** %84, align 8
  %86 = load i32, i32* %15, align 4
  %87 = sext i32 %86 to i64
  %88 = getelementptr inbounds i32, i32* %85, i64 %87
  %89 = invoke nonnull align 8 dereferenceable(16) %"class.std::__1::basic_istream"* @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi(%"class.std::__1::basic_istream"* %83, i32* nonnull align 4 dereferenceable(4) %88)
          to label %90 unwind label %34

90:                                               ; preds = %82
  br label %91

91:                                               ; preds = %90
  %92 = load i32, i32* %15, align 4
  %93 = add nsw i32 %92, 1
  store i32 %93, i32* %15, align 4
  br label %78

94:                                               ; preds = %78
  store i32 0, i32* %16, align 4
  br label %95

95:                                               ; preds = %109, %94
  %96 = load i32, i32* %16, align 4
  %97 = load i32*, i32** %10, align 8
  %98 = load i32, i32* %97, align 4
  %99 = icmp slt i32 %96, %98
  br i1 %99, label %100, label %112

100:                                              ; preds = %95
  %101 = bitcast %"class.std::__1::basic_ifstream"* %11 to %"class.std::__1::basic_istream"*
  %102 = load i32**, i32*** %8, align 8
  %103 = load i32*, i32** %102, align 8
  %104 = load i32, i32* %16, align 4
  %105 = sext i32 %104 to i64
  %106 = getelementptr inbounds i32, i32* %103, i64 %105
  %107 = invoke nonnull align 8 dereferenceable(16) %"class.std::__1::basic_istream"* @_ZNSt3__113basic_istreamIcNS_11char_traitsIcEEErsERi(%"class.std::__1::basic_istream"* %101, i32* nonnull align 4 dereferenceable(4) %106)
          to label %108 unwind label %34

108:                                              ; preds = %100
  br label %109

109:                                              ; preds = %108
  %110 = load i32, i32* %16, align 4
  %111 = add nsw i32 %110, 1
  store i32 %111, i32* %16, align 4
  br label %95

112:                                              ; preds = %95
  invoke void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEE5closeEv(%"class.std::__1::basic_ifstream"* %11)
          to label %113 unwind label %34

113:                                              ; preds = %112
  store i32 0, i32* %17, align 4
  br label %114

114:                                              ; preds = %125, %113
  %115 = load i32, i32* %17, align 4
  %116 = load i32*, i32** %10, align 8
  %117 = load i32, i32* %116, align 4
  %118 = icmp slt i32 %115, %117
  br i1 %118, label %119, label %128

119:                                              ; preds = %114
  %120 = load i32**, i32*** %9, align 8
  %121 = load i32*, i32** %120, align 8
  %122 = load i32, i32* %17, align 4
  %123 = sext i32 %122 to i64
  %124 = getelementptr inbounds i32, i32* %121, i64 %123
  store i32 -1, i32* %124, align 4
  br label %125

125:                                              ; preds = %119
  %126 = load i32, i32* %17, align 4
  %127 = add nsw i32 %126, 1
  store i32 %127, i32* %17, align 4
  br label %114

128:                                              ; preds = %114
  call void @_ZNSt3__114basic_ifstreamIcNS_11char_traitsIcEEED1Ev(%"class.std::__1::basic_ifstream"* %11)
  ret void

129:                                              ; preds = %34
  br label %130

130:                                              ; preds = %129
  %131 = load i8*, i8** %13, align 8
  %132 = load i32, i32* %14, align 4
  %133 = insertvalue { i8*, i32 } undef, i8* %131, 0
  %134 = insertvalue { i8*, i32 } %133, i32 %132, 1
  resume { i8*, i32 } %134

135:                                              ; preds = %34
  %136 = landingpad { i8*, i32 }
          catch i8* null
  %137 = extractvalue { i8*, i32 } %136, 0
  call void @__clang_call_terminate(i8* %137) #12
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
  store i32* %0, i32** %5, align 8
  store i32* %1, i32** %6, align 8
  store i32 %2, i32* %7, align 4
  store i32 0, i32* %8, align 4
  br label %9

9:                                                ; preds = %27, %3
  %10 = load i32, i32* %8, align 4
  %11 = load i32, i32* %7, align 4
  %12 = icmp slt i32 %10, %11
  br i1 %12, label %13, label %30

13:                                               ; preds = %9
  %14 = load i32*, i32** %5, align 8
  %15 = load i32, i32* %8, align 4
  %16 = sext i32 %15 to i64
  %17 = getelementptr inbounds i32, i32* %14, i64 %16
  %18 = load i32, i32* %17, align 4
  %19 = load i32*, i32** %6, align 8
  %20 = load i32, i32* %8, align 4
  %21 = sext i32 %20 to i64
  %22 = getelementptr inbounds i32, i32* %19, i64 %21
  %23 = load i32, i32* %22, align 4
  %24 = icmp ne i32 %18, %23
  br i1 %24, label %25, label %26

25:                                               ; preds = %13
  store i1 false, i1* %4, align 1
  br label %31

26:                                               ; preds = %13
  br label %27

27:                                               ; preds = %26
  %28 = load i32, i32* %8, align 4
  %29 = add nsw i32 %28, 1
  store i32 %29, i32* %8, align 4
  br label %9

30:                                               ; preds = %9
  store i1 true, i1* %4, align 1
  br label %31

31:                                               ; preds = %30, %25
  %32 = load i1, i1* %4, align 1
  ret i1 %32
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
