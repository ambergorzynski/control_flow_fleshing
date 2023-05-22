
; Function Attrs: noinline nounwind optnone ssp uwtable
define void @_Z7run_cfgPiS_(i32* %0, i32* %1) #0 {

  ;%3 = alloca i32*, align 8
  ;%4 = alloca i32*, align 8
  ;store i32* %0, i32** %3, align 8
  ;store i32* %1, i32** %4, align 8
  
  ;%5 = load i32*, i32** %4, align 8
  ;%6 = getelementptr inbounds i32, i32* %5, i64 0
  ;store i32 0, i32* %6, align 4
  
  ;%7 = load i32*, i32** %4, align 8
  ;%8 = getelementptr inbounds i32, i32* %7, i64 1
  ;store i32 1, i32* %8, align 4
  
  ;%9 = load i32*, i32** %4, align 8
  ;%10 = getelementptr inbounds i32, i32* %9, i64 2
  ;store i32 2, i32* %10, align 4
  
  ;%11 = load i32*, i32** %4, align 8
  ;%12 = getelementptr inbounds i32, i32* %11, i64 3
  ;store i32 7, i32* %12, align 4

2:
	; create arrays to store directions and output
	%directions = alloca i32*
	%output = alloca i32*

	store i32* %0, i32** %directions
	store i32* %1, i32** %output

	%counter = alloca i32
	store i32 0, i32* %counter

	br label %3

3:
	%output_1 = load i32*, i32** %output
	%output_1_ptr = getelementptr inbounds i32, i32* %output_1, i64 0
	store i32 5, i32* %output_1_ptr


  ret void
}

attributes #0 = { noinline nounwind optnone ssp uwtable "darwin-stkchk-strong-link" "frame-pointer"="all" "min-legal-vector-width"="0" "no-trapping-math"="true" "probe-stack"="___chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="penryn" "target-features"="+cx16,+cx8,+fxsr,+mmx,+sahf,+sse,+sse2,+sse3,+sse4.1,+ssse3,+x87" "tune-cpu"="generic" }

!llvm.module.flags = !{!0, !1, !2, !3, !4}
!llvm.ident = !{!5}

!0 = !{i32 2, !"SDK Version", [2 x i32] [i32 13, i32 1]}
!1 = !{i32 1, !"wchar_size", i32 4}
!2 = !{i32 7, !"PIC Level", i32 2}
!3 = !{i32 7, !"uwtable", i32 1}
!4 = !{i32 7, !"frame-pointer", i32 2}
!5 = !{!"Apple clang version 14.0.0 (clang-1400.0.29.202)"}
