; ModuleID = 'wrapper.cpp'
source_filename = "wrapper.cpp"
target datalayout = "e-m:o-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-apple-macosx13.0.0"

@.str = private unnamed_addr constant [25 x i8] c"expected_output 0 is %d\0A\00", align 1
@.str.1 = private unnamed_addr constant [25 x i8] c"expected_output 1 is %d\0A\00", align 1
@.str.2 = private unnamed_addr constant [25 x i8] c"expected_output 2 is %d\0A\00", align 1
@.str.3 = private unnamed_addr constant [14 x i8] c"result is %d\0A\00", align 1
@.str.4 = private unnamed_addr constant [14 x i8] c"out %d is %d\0A\00", align 1

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
  store i32 0, i32* %3, align 4
  store i32 %0, i32* %4, align 4
  store i8** %1, i8*** %5, align 8
  %11 = load i8**, i8*** %5, align 8
  %12 = getelementptr inbounds i8*, i8** %11, i64 1
  %13 = load i8*, i8** %12, align 8
  call void @_Z7read_inPKcPPiS2_S2_(i8* %13, i32** %8, i32** %6, i32** %7)
  %14 = load i32*, i32** %6, align 8
  %15 = getelementptr inbounds i32, i32* %14, i64 0
  %16 = load i32, i32* %15, align 4
  %17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([25 x i8], [25 x i8]* @.str, i64 0, i64 0), i32 %16)
  %18 = load i32*, i32** %6, align 8
  %19 = getelementptr inbounds i32, i32* %18, i64 1
  %20 = load i32, i32* %19, align 4
  %21 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([25 x i8], [25 x i8]* @.str.1, i64 0, i64 0), i32 %20)
  %22 = load i32*, i32** %6, align 8
  %23 = getelementptr inbounds i32, i32* %22, i64 2
  %24 = load i32, i32* %23, align 4
  %25 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([25 x i8], [25 x i8]* @.str.2, i64 0, i64 0), i32 %24)
  %26 = load i32*, i32** %8, align 8
  %27 = load i32*, i32** %7, align 8
  call void @_Z7run_cfgPiS_(i32* %26, i32* %27)
  %28 = load i32*, i32** %6, align 8
  %29 = load i32*, i32** %7, align 8
  %30 = call zeroext i1 @_Z3cmpPiS_i(i32* %28, i32* %29, i32 3)
  %31 = zext i1 %30 to i8
  store i8 %31, i8* %9, align 1
  %32 = load i8, i8* %9, align 1
  %33 = trunc i8 %32 to i1
  %34 = zext i1 %33 to i32
  %35 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([14 x i8], [14 x i8]* @.str.3, i64 0, i64 0), i32 %34)
  store i32 0, i32* %10, align 4
  br label %36

36:                                               ; preds = %47, %2
  %37 = load i32, i32* %10, align 4
  %38 = icmp slt i32 %37, 3
  br i1 %38, label %39, label %50

39:                                               ; preds = %36
  %40 = load i32, i32* %10, align 4
  %41 = load i32*, i32** %7, align 8
  %42 = load i32, i32* %10, align 4
  %43 = sext i32 %42 to i64
  %44 = getelementptr inbounds i32, i32* %41, i64 %43
  %45 = load i32, i32* %44, align 4
  %46 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([14 x i8], [14 x i8]* @.str.4, i64 0, i64 0), i32 %40, i32 %45)
  br label %47

47:                                               ; preds = %39
  %48 = load i32, i32* %10, align 4
  %49 = add nsw i32 %48, 1
  store i32 %49, i32* %10, align 4
  br label %36

50:                                               ; preds = %36
  %51 = load i32*, i32** %8, align 8
  %52 = icmp eq i32* %51, null
  br i1 %52, label %55, label %53

53:                                               ; preds = %50
  %54 = bitcast i32* %51 to i8*
  call void @_ZdaPv(i8* %54) #6
  br label %55

55:                                               ; preds = %53, %50
  %56 = load i32*, i32** %7, align 8
  %57 = icmp eq i32* %56, null
  br i1 %57, label %60, label %58

58:                                               ; preds = %55
  %59 = bitcast i32* %56 to i8*
  call void @_ZdaPv(i8* %59) #6
  br label %60

60:                                               ; preds = %58, %55
  %61 = load i32*, i32** %6, align 8
  %62 = icmp eq i32* %61, null
  br i1 %62, label %65, label %63

63:                                               ; preds = %60
  %64 = bitcast i32* %61 to i8*
  call void @_ZdaPv(i8* %64) #6
  br label %65

65:                                               ; preds = %63, %60
  ret i32 0
}

; Function Attrs: noinline optnone ssp uwtable
define void @_Z7read_inPKcPPiS2_S2_(i8* %0, i32** %1, i32** %2, i32** %3) #1 {
  %5 = alloca i8*, align 8
  %6 = alloca i32**, align 8
  %7 = alloca i32**, align 8
  %8 = alloca i32**, align 8
  %9 = alloca i32, align 4
  store i8* %0, i8** %5, align 8
  store i32** %1, i32*** %6, align 8
  store i32** %2, i32*** %7, align 8
  store i32** %3, i32*** %8, align 8
  %10 = call noalias nonnull i8* @_Znam(i64 4) #7
  %11 = bitcast i8* %10 to i32*
  %12 = load i32**, i32*** %6, align 8
  store i32* %11, i32** %12, align 8
  %13 = call noalias nonnull i8* @_Znam(i64 12) #7
  %14 = bitcast i8* %13 to i32*
  %15 = load i32**, i32*** %7, align 8
  store i32* %14, i32** %15, align 8
  %16 = call noalias nonnull i8* @_Znam(i64 12) #7
  %17 = bitcast i8* %16 to i32*
  %18 = load i32**, i32*** %8, align 8
  store i32* %17, i32** %18, align 8
  store i32 0, i32* %9, align 4
  br label %19

19:                                               ; preds = %28, %4
  %20 = load i32, i32* %9, align 4
  %21 = icmp slt i32 %20, 3
  br i1 %21, label %22, label %31

22:                                               ; preds = %19
  %23 = load i32**, i32*** %8, align 8
  %24 = load i32*, i32** %23, align 8
  %25 = load i32, i32* %9, align 4
  %26 = sext i32 %25 to i64
  %27 = getelementptr inbounds i32, i32* %24, i64 %26
  store i32 -1, i32* %27, align 4
  br label %28

28:                                               ; preds = %22
  %29 = load i32, i32* %9, align 4
  %30 = add nsw i32 %29, 1
  store i32 %30, i32* %9, align 4
  br label %19

31:                                               ; preds = %19
  %32 = load i32**, i32*** %6, align 8
  %33 = load i32*, i32** %32, align 8
  %34 = getelementptr inbounds i32, i32* %33, i64 0
  store i32 0, i32* %34, align 4
  %35 = load i32**, i32*** %7, align 8
  %36 = load i32*, i32** %35, align 8
  %37 = getelementptr inbounds i32, i32* %36, i64 0
  store i32 1, i32* %37, align 4
  %38 = load i32**, i32*** %7, align 8
  %39 = load i32*, i32** %38, align 8
  %40 = getelementptr inbounds i32, i32* %39, i64 1
  store i32 2, i32* %40, align 4
  %41 = load i32**, i32*** %7, align 8
  %42 = load i32*, i32** %41, align 8
  %43 = getelementptr inbounds i32, i32* %42, i64 2
  store i32 4, i32* %43, align 4
  ret void
}

declare i32 @printf(i8*, ...) #2

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

; Function Attrs: nobuiltin nounwind
declare void @_ZdaPv(i8*) #4

; Function Attrs: nobuiltin allocsize(0)
declare nonnull i8* @_Znam(i64) #5

attributes #0 = { noinline norecurse optnone ssp uwtable "darwin-stkchk-strong-link" "frame-pointer"="all" "min-legal-vector-width"="0" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #1 = { noinline optnone ssp uwtable "darwin-stkchk-strong-link" "frame-pointer"="all" "min-legal-vector-width"="0" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #2 = { "darwin-stkchk-strong-link" "frame-pointer"="all" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #3 = { noinline nounwind optnone ssp uwtable "darwin-stkchk-strong-link" "frame-pointer"="all" "min-legal-vector-width"="0" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #4 = { nobuiltin nounwind "darwin-stkchk-strong-link" "frame-pointer"="all" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #5 = { nobuiltin allocsize(0) "darwin-stkchk-strong-link" "frame-pointer"="all" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }
attributes #6 = { builtin nounwind }
attributes #7 = { builtin allocsize(0) }

!llvm.module.flags = !{!0, !1, !2, !3, !4}
!llvm.ident = !{!5}

!0 = !{i32 2, !"SDK Version", [2 x i32] [i32 13, i32 1]}
!1 = !{i32 1, !"wchar_size", i32 4}
!2 = !{i32 7, !"PIC Level", i32 2}
!3 = !{i32 7, !"uwtable", i32 1}
!4 = !{i32 7, !"frame-pointer", i32 2}
!5 = !{!"Apple clang version 14.0.0 (clang-1400.0.29.202)"}
