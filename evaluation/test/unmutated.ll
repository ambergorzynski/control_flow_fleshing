; ModuleID = '/var/folders/_k/zvfswn1x47bcfzckf5pncck80000gn/T/tmpa795ezry/__prog.ll'
source_filename = "/var/folders/_k/zvfswn1x47bcfzckf5pncck80000gn/T/tmpa795ezry/__prog.ll"

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define void @_Z7run_cfgPi(ptr nocapture writeonly %in_output) local_unnamed_addr #0 {
common.ret:
  store i32 0, ptr %in_output, align 4
  %output_2_ptr = getelementptr inbounds i32, ptr %in_output, i64 1
  store i32 2, ptr %output_2_ptr, align 4
  %output_13_ptr = getelementptr inbounds i32, ptr %in_output, i64 2
  store i32 13, ptr %output_13_ptr, align 4
  ret void
}

attributes #0 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write) }
