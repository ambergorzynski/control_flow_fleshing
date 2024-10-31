typedef unsigned char   undefined;

typedef unsigned char    byte;
typedef unsigned char    dwfenc;
typedef unsigned int    dword;
typedef unsigned long    qword;
typedef unsigned char    undefined1;
typedef unsigned short    undefined2;
typedef unsigned int    undefined4;
typedef unsigned long    undefined8;
typedef unsigned short    word;
typedef struct eh_frame_hdr eh_frame_hdr, *Peh_frame_hdr;

struct eh_frame_hdr {
    byte eh_frame_hdr_version; // Exception Handler Frame Header Version
    dwfenc eh_frame_pointer_encoding; // Exception Handler Frame Pointer Encoding
    dwfenc eh_frame_desc_entry_count_encoding; // Encoding of # of Exception Handler FDEs
    dwfenc eh_frame_table_encoding; // Exception Handler Table Encoding
};

typedef struct fde_table_entry fde_table_entry, *Pfde_table_entry;

struct fde_table_entry {
    dword initial_loc; // Initial Location
    dword data_loc; // Data location
};

typedef enum Elf64_DynTag {
    DT_AUDIT=1879047932,
    DT_AUXILIARY=2147483645,
    DT_BIND_NOW=24,
    DT_CHECKSUM=1879047672,
    DT_CONFIG=1879047930,
    DT_DEBUG=21,
    DT_DEPAUDIT=1879047931,
    DT_ENCODING=32,
    DT_FEATURE_1=1879047676,
    DT_FILTER=2147483647,
    DT_FINI=13,
    DT_FINI_ARRAY=26,
    DT_FINI_ARRAYSZ=28,
    DT_FLAGS=30,
    DT_FLAGS_1=1879048187,
    DT_GNU_CONFLICT=1879047928,
    DT_GNU_CONFLICTSZ=1879047670,
    DT_GNU_HASH=1879047925,
    DT_GNU_LIBLIST=1879047929,
    DT_GNU_LIBLISTSZ=1879047671,
    DT_GNU_PRELINKED=1879047669,
    DT_HASH=4,
    DT_INIT=12,
    DT_INIT_ARRAY=25,
    DT_INIT_ARRAYSZ=27,
    DT_JMPREL=23,
    DT_MOVEENT=1879047674,
    DT_MOVESZ=1879047675,
    DT_MOVETAB=1879047934,
    DT_NEEDED=1,
    DT_NULL=0,
    DT_PLTGOT=3,
    DT_PLTPAD=1879047933,
    DT_PLTPADSZ=1879047673,
    DT_PLTREL=20,
    DT_PLTRELSZ=2,
    DT_POSFLAG_1=1879047677,
    DT_PREINIT_ARRAYSZ=33,
    DT_REL=17,
    DT_RELA=7,
    DT_RELACOUNT=1879048185,
    DT_RELAENT=9,
    DT_RELASZ=8,
    DT_RELCOUNT=1879048186,
    DT_RELENT=19,
    DT_RELSZ=18,
    DT_RPATH=15,
    DT_RUNPATH=29,
    DT_SONAME=14,
    DT_STRSZ=10,
    DT_STRTAB=5,
    DT_SYMBOLIC=16,
    DT_SYMENT=11,
    DT_SYMINENT=1879047679,
    DT_SYMINFO=1879047935,
    DT_SYMINSZ=1879047678,
    DT_SYMTAB=6,
    DT_TEXTREL=22,
    DT_TLSDESC_GOT=1879047927,
    DT_TLSDESC_PLT=1879047926,
    DT_VERDEF=1879048188,
    DT_VERDEFNUM=1879048189,
    DT_VERNEED=1879048190,
    DT_VERNEEDNUM=1879048191,
    DT_VERSYM=1879048176
} Elf64_DynTag;

typedef struct Elf64_Sym Elf64_Sym, *PElf64_Sym;

struct Elf64_Sym {
    dword st_name;
    byte st_info;
    byte st_other;
    word st_shndx;
    qword st_value;
    qword st_size;
};

typedef enum Elf_ProgramHeaderType {
    PT_DYNAMIC=2,
    PT_GNU_EH_FRAME=1685382480,
    PT_GNU_RELRO=1685382482,
    PT_GNU_STACK=1685382481,
    PT_INTERP=3,
    PT_LOAD=1,
    PT_NOTE=4,
    PT_NULL=0,
    PT_PHDR=6,
    PT_SHLIB=5,
    PT_TLS=7
} Elf_ProgramHeaderType;

typedef struct Elf64_Dyn Elf64_Dyn, *PElf64_Dyn;

struct Elf64_Dyn {
    enum Elf64_DynTag d_tag;
    qword d_val;
};

typedef struct Elf64_Phdr Elf64_Phdr, *PElf64_Phdr;

struct Elf64_Phdr {
    enum Elf_ProgramHeaderType p_type;
    dword p_flags;
    qword p_offset;
    qword p_vaddr;
    qword p_paddr;
    qword p_filesz;
    qword p_memsz;
    qword p_align;
};

typedef struct Elf64_Shdr Elf64_Shdr, *PElf64_Shdr;

typedef enum Elf_SectionHeaderType {
    SHT_CHECKSUM=1879048184,
    SHT_DYNAMIC=6,
    SHT_DYNSYM=11,
    SHT_FINI_ARRAY=15,
    SHT_GNU_ATTRIBUTES=1879048181,
    SHT_GNU_HASH=1879048182,
    SHT_GNU_LIBLIST=1879048183,
    SHT_GNU_verdef=1879048189,
    SHT_GNU_verneed=1879048190,
    SHT_GNU_versym=1879048191,
    SHT_GROUP=17,
    SHT_HASH=5,
    SHT_INIT_ARRAY=14,
    SHT_NOBITS=8,
    SHT_NOTE=7,
    SHT_NULL=0,
    SHT_PREINIT_ARRAY=16,
    SHT_PROGBITS=1,
    SHT_REL=9,
    SHT_RELA=4,
    SHT_SHLIB=10,
    SHT_STRTAB=3,
    SHT_SUNW_COMDAT=1879048187,
    SHT_SUNW_move=1879048186,
    SHT_SUNW_syminfo=1879048188,
    SHT_SYMTAB=2,
    SHT_SYMTAB_SHNDX=18
} Elf_SectionHeaderType;

struct Elf64_Shdr {
    dword sh_name;
    enum Elf_SectionHeaderType sh_type;
    qword sh_flags;
    qword sh_addr;
    qword sh_offset;
    qword sh_size;
    dword sh_link;
    dword sh_info;
    qword sh_addralign;
    qword sh_entsize;
};

typedef struct Elf64_Rela Elf64_Rela, *PElf64_Rela;

struct Elf64_Rela {
    qword r_offset; // location to apply the relocation action
    qword r_info; // the symbol table index and the type of relocation
    qword r_addend; // a constant addend used to compute the relocatable field value
};

typedef struct Elf64_Ehdr Elf64_Ehdr, *PElf64_Ehdr;

struct Elf64_Ehdr {
    byte e_ident_magic_num;
    char e_ident_magic_str[3];
    byte e_ident_class;
    byte e_ident_data;
    byte e_ident_version;
    byte e_ident_pad[9];
    word e_type;
    word e_machine;
    dword e_version;
    qword e_entry;
    qword e_phoff;
    qword e_shoff;
    dword e_flags;
    word e_ehsize;
    word e_phentsize;
    word e_phnum;
    word e_shentsize;
    word e_shnum;
    word e_shstrndx;
};

typedef struct evp_pkey_ctx_st evp_pkey_ctx_st, *Pevp_pkey_ctx_st;

struct evp_pkey_ctx_st {
};

typedef struct evp_pkey_ctx_st EVP_PKEY_CTX;




int _init(EVP_PKEY_CTX *ctx)

{
  int iVar1;
  
  iVar1 = __gmon_start__();
  return iVar1;
}



void FUN_00101020(void)

{
                    // WARNING: Treating indirect jump as call
  (*(code *)(undefined *)0x0)();
  return;
}



void __cxa_finalize(void)

{
  __cxa_finalize();
  return;
}



// WARNING: Unknown calling convention yet parameter storage is locked

int printf(char *__format,...)

{
  int iVar1;
  
  iVar1 = printf(__format);
  return iVar1;
}



// WARNING: Unknown calling convention yet parameter storage is locked

int strcmp(char *__s1,char *__s2)

{
  int iVar1;
  
  iVar1 = strcmp(__s1,__s2);
  return iVar1;
}



void _start(undefined8 uParm1,undefined8 uParm2,undefined8 uParm3)

{
  undefined8 in_stack_00000000;
  undefined auStack8 [8];
  
  __libc_start_main(main,in_stack_00000000,&stack0x00000008,0,0,uParm3,auStack8);
  do {
                    // WARNING: Do nothing block with infinite loop
  } while( true );
}



// WARNING: Removing unreachable block (ram,0x001010c3)
// WARNING: Removing unreachable block (ram,0x001010cf)

void deregister_tm_clones(void)

{
  return;
}



// WARNING: Removing unreachable block (ram,0x00101104)
// WARNING: Removing unreachable block (ram,0x00101110)

void register_tm_clones(void)

{
  return;
}



void __do_global_dtors_aux(void)

{
  if (completed_0 != 0) {
    return;
  }
  __cxa_finalize(__dso_handle);
  deregister_tm_clones();
  completed_0 = 1;
  return;
}



void frame_dummy(void)

{
  register_tm_clones();
  return;
}



void platform_main_begin(void)

{
  return;
}



void platform_main_end(uint uParm1)

{
  printf("checksum = %X\n",(ulong)uParm1);
  return;
}



ulong safe_unary_minus_func_int8_t_s(byte bParm1)

{
  return (ulong)-(uint)bParm1;
}



ulong safe_add_func_int8_t_s_s(byte bParm1,byte bParm2)

{
  return (ulong)((uint)bParm2 + (uint)bParm1);
}



ulong safe_sub_func_int8_t_s_s(byte bParm1,byte bParm2)

{
  return (ulong)((uint)bParm1 - (uint)bParm2);
}



ulong safe_mul_func_int8_t_s_s(byte bParm1,byte bParm2)

{
  return (ulong)((uint)bParm1 * (uint)bParm2);
}



ulong safe_mod_func_int8_t_s_s(byte bParm1,char cParm2)

{
  ulong uVar1;
  
  if ((cParm2 == 0) || ((bParm1 == 0x80 && (cParm2 == -1)))) {
    uVar1 = (ulong)bParm1;
  }
  else {
    uVar1 = (long)(int)(char)bParm1 % (long)(int)cParm2 & 0xffffffff;
  }
  return uVar1;
}



ulong safe_div_func_int8_t_s_s(byte bParm1,char cParm2)

{
  ulong uVar1;
  
  if ((cParm2 == 0) || ((bParm1 == 0x80 && (cParm2 == -1)))) {
    uVar1 = (ulong)bParm1;
  }
  else {
    uVar1 = (long)(int)(char)bParm1 / (long)(int)cParm2 & 0xffffffff;
  }
  return uVar1;
}



ulong safe_lshift_func_int8_t_s_s(byte bParm1,int iParm2)

{
  ulong uVar1;
  
  if (((((char)bParm1 < 0) || (iParm2 < 0)) || (0x1f < iParm2)) ||
     (0x7f >> ((byte)iParm2 & 0x1f) < (int)(char)bParm1)) {
    uVar1 = (ulong)bParm1;
  }
  else {
    uVar1 = (ulong)(uint)((int)(char)bParm1 << ((byte)iParm2 & 0x1f));
  }
  return uVar1;
}



ulong safe_lshift_func_int8_t_s_u(byte bParm1,uint uParm2)

{
  ulong uVar1;
  
  if ((((char)bParm1 < 0) || (0x1f < uParm2)) || (0x7f >> ((byte)uParm2 & 0x1f) < (int)(char)bParm1)
     ) {
    uVar1 = (ulong)bParm1;
  }
  else {
    uVar1 = (ulong)(uint)((int)(char)bParm1 << ((byte)uParm2 & 0x1f));
  }
  return uVar1;
}



ulong safe_rshift_func_int8_t_s_s(byte bParm1,int iParm2)

{
  ulong uVar1;
  
  if ((((char)bParm1 < 0) || (iParm2 < 0)) || (0x1f < iParm2)) {
    uVar1 = (ulong)bParm1;
  }
  else {
    uVar1 = (ulong)(uint)((int)(char)bParm1 >> ((byte)iParm2 & 0x1f));
  }
  return uVar1;
}



ulong safe_rshift_func_int8_t_s_u(byte bParm1,uint uParm2)

{
  ulong uVar1;
  
  if (((char)bParm1 < 0) || (0x1f < uParm2)) {
    uVar1 = (ulong)bParm1;
  }
  else {
    uVar1 = (ulong)(uint)((int)(char)bParm1 >> ((byte)uParm2 & 0x1f));
  }
  return uVar1;
}



ulong safe_unary_minus_func_int16_t_s(ushort uParm1)

{
  return (ulong)-(uint)uParm1;
}



ulong safe_add_func_int16_t_s_s(ushort uParm1,ushort uParm2)

{
  return (ulong)((uint)uParm2 + (uint)uParm1);
}



ulong safe_sub_func_int16_t_s_s(ushort uParm1,ushort uParm2)

{
  return (ulong)((uint)uParm1 - (uint)uParm2);
}



ulong safe_mul_func_int16_t_s_s(ushort uParm1,ushort uParm2)

{
  return (ulong)((uint)uParm2 * (uint)uParm1);
}



ulong safe_mod_func_int16_t_s_s(ushort uParm1,short sParm2)

{
  ulong uVar1;
  
  if ((sParm2 == 0) || ((uParm1 == 0x8000 && (sParm2 == -1)))) {
    uVar1 = (ulong)uParm1;
  }
  else {
    uVar1 = (long)(int)(short)uParm1 % (long)(int)sParm2 & 0xffffffff;
  }
  return uVar1;
}



ulong safe_div_func_int16_t_s_s(ushort uParm1,short sParm2)

{
  ulong uVar1;
  
  if ((sParm2 == 0) || ((uParm1 == 0x8000 && (sParm2 == -1)))) {
    uVar1 = (ulong)uParm1;
  }
  else {
    uVar1 = (long)(int)(short)uParm1 / (long)(int)sParm2 & 0xffffffff;
  }
  return uVar1;
}



ulong safe_lshift_func_int16_t_s_s(ushort uParm1,int iParm2)

{
  ulong uVar1;
  
  if (((((short)uParm1 < 0) || (iParm2 < 0)) || (0x1f < iParm2)) ||
     (0x7fff >> ((byte)iParm2 & 0x1f) < (int)(short)uParm1)) {
    uVar1 = (ulong)uParm1;
  }
  else {
    uVar1 = (ulong)(uint)((int)(short)uParm1 << ((byte)iParm2 & 0x1f));
  }
  return uVar1;
}



ulong safe_lshift_func_int16_t_s_u(ushort uParm1,uint uParm2)

{
  ulong uVar1;
  
  if ((((short)uParm1 < 0) || (0x1f < uParm2)) ||
     (0x7fff >> ((byte)uParm2 & 0x1f) < (int)(short)uParm1)) {
    uVar1 = (ulong)uParm1;
  }
  else {
    uVar1 = (ulong)(uint)((int)(short)uParm1 << ((byte)uParm2 & 0x1f));
  }
  return uVar1;
}



ulong safe_rshift_func_int16_t_s_s(ushort uParm1,int iParm2)

{
  ulong uVar1;
  
  if ((((short)uParm1 < 0) || (iParm2 < 0)) || (0x1f < iParm2)) {
    uVar1 = (ulong)uParm1;
  }
  else {
    uVar1 = (ulong)(uint)((int)(short)uParm1 >> ((byte)iParm2 & 0x1f));
  }
  return uVar1;
}



ulong safe_rshift_func_int16_t_s_u(ushort uParm1,uint uParm2)

{
  ulong uVar1;
  
  if (((short)uParm1 < 0) || (0x1f < uParm2)) {
    uVar1 = (ulong)uParm1;
  }
  else {
    uVar1 = (ulong)(uint)((int)(short)uParm1 >> ((byte)uParm2 & 0x1f));
  }
  return uVar1;
}



ulong safe_unary_minus_func_int32_t_s(uint uParm1)

{
  if (uParm1 != 0x80000000) {
    uParm1 = -uParm1;
  }
  return (ulong)uParm1;
}



ulong safe_add_func_int32_t_s_s(uint uParm1,int iParm2)

{
  if (((((int)uParm1 < 1) || (iParm2 < 1)) || ((int)uParm1 <= 0x7fffffff - iParm2)) &&
     (((-1 < (int)uParm1 || (-1 < iParm2)) || (-0x80000000 - iParm2 <= (int)uParm1)))) {
    uParm1 = iParm2 + uParm1;
  }
  return (ulong)uParm1;
}



ulong safe_sub_func_int32_t_s_s(uint uParm1,uint uParm2)

{
  if (-1 < (int)((((uParm1 ^ uParm2) & 0x80000000 ^ uParm1) - uParm2 ^ uParm2) & (uParm1 ^ uParm2)))
  {
    uParm1 = uParm1 - uParm2;
  }
  return (ulong)uParm1;
}



ulong safe_mul_func_int32_t_s_s(uint uParm1,int iParm2)

{
  if ((((((int)uParm1 < 1) || (iParm2 < 1)) || ((int)uParm1 <= 0x7fffffff / iParm2)) &&
      ((((int)uParm1 < 1 || (0 < iParm2)) || (-0x80000000 / (int)uParm1 <= iParm2)))) &&
     ((((0 < (int)uParm1 || (iParm2 < 1)) || (-0x80000000 / iParm2 <= (int)uParm1)) &&
      ((((0 < (int)uParm1 || (0 < iParm2)) || (uParm1 == 0)) || (0x7fffffff / (int)uParm1 <= iParm2)
       ))))) {
    uParm1 = uParm1 * iParm2;
  }
  return (ulong)uParm1;
}



ulong safe_mod_func_int32_t_s_s(uint uParm1,int iParm2)

{
  if ((iParm2 != 0) && ((uParm1 != 0x80000000 || (iParm2 != -1)))) {
    uParm1 = (int)uParm1 % iParm2;
  }
  return (ulong)uParm1;
}



ulong safe_div_func_int32_t_s_s(uint uParm1,int iParm2)

{
  ulong uVar1;
  
  if ((iParm2 == 0) || ((uParm1 == 0x80000000 && (iParm2 == -1)))) {
    uVar1 = (ulong)uParm1;
  }
  else {
    uVar1 = (long)(int)uParm1 / (long)iParm2 & 0xffffffff;
  }
  return uVar1;
}



ulong safe_lshift_func_int32_t_s_s(uint uParm1,int iParm2)

{
  if ((((-1 < (int)uParm1) && (-1 < iParm2)) && (iParm2 < 0x20)) &&
     ((int)uParm1 <= 0x7fffffff >> ((byte)iParm2 & 0x1f))) {
    uParm1 = uParm1 << ((byte)iParm2 & 0x1f);
  }
  return (ulong)uParm1;
}



ulong safe_lshift_func_int32_t_s_u(uint uParm1,uint uParm2)

{
  if (((-1 < (int)uParm1) && (uParm2 < 0x20)) &&
     ((int)uParm1 <= 0x7fffffff >> ((byte)uParm2 & 0x1f))) {
    uParm1 = uParm1 << ((byte)uParm2 & 0x1f);
  }
  return (ulong)uParm1;
}



ulong safe_rshift_func_int32_t_s_s(uint uParm1,int iParm2)

{
  if (((-1 < (int)uParm1) && (-1 < iParm2)) && (iParm2 < 0x20)) {
    uParm1 = (int)uParm1 >> ((byte)iParm2 & 0x1f);
  }
  return (ulong)uParm1;
}



ulong safe_rshift_func_int32_t_s_u(uint uParm1,uint uParm2)

{
  if ((-1 < (int)uParm1) && (uParm2 < 0x20)) {
    uParm1 = (int)uParm1 >> ((byte)uParm2 & 0x1f);
  }
  return (ulong)uParm1;
}



ulong safe_unary_minus_func_uint8_t_u(byte bParm1)

{
  return (ulong)-(uint)bParm1;
}



ulong safe_add_func_uint8_t_u_u(byte bParm1,byte bParm2)

{
  return (ulong)((uint)bParm2 + (uint)bParm1);
}



ulong safe_sub_func_uint8_t_u_u(char cParm1,char cParm2)

{
  return (ulong)(byte)(cParm1 - cParm2);
}



ulong safe_mul_func_uint8_t_u_u(byte bParm1,byte bParm2)

{
  return (ulong)(ushort)((ushort)bParm1 * (ushort)bParm2);
}



ulong safe_mod_func_uint8_t_u_u(byte bParm1,byte bParm2)

{
  ulong uVar1;
  
  if (bParm2 == 0) {
    uVar1 = (ulong)bParm1;
  }
  else {
    uVar1 = (ulong)(bParm1 % bParm2);
  }
  return uVar1;
}



ulong safe_div_func_uint8_t_u_u(byte bParm1,byte bParm2)

{
  ulong uVar1;
  
  if (bParm2 == 0) {
    uVar1 = (ulong)bParm1;
  }
  else {
    uVar1 = (ulong)(ushort)((ushort)bParm1 / (ushort)bParm2 | (ushort)bParm1 % (ushort)bParm2 << 8);
  }
  return uVar1;
}



ulong safe_lshift_func_uint8_t_u_s(byte bParm1,int iParm2)

{
  ulong uVar1;
  
  if (((iParm2 < 0) || (0x1f < iParm2)) || (0xff >> ((byte)iParm2 & 0x1f) < (int)(uint)bParm1)) {
    uVar1 = (ulong)bParm1;
  }
  else {
    uVar1 = (ulong)((uint)bParm1 << ((byte)iParm2 & 0x1f));
  }
  return uVar1;
}



ulong safe_lshift_func_uint8_t_u_u(byte bParm1,uint uParm2)

{
  ulong uVar1;
  
  if ((uParm2 < 0x20) && ((int)(uint)bParm1 <= 0xff >> ((byte)uParm2 & 0x1f))) {
    uVar1 = (ulong)((uint)bParm1 << ((byte)uParm2 & 0x1f));
  }
  else {
    uVar1 = (ulong)bParm1;
  }
  return uVar1;
}



ulong safe_rshift_func_uint8_t_u_s(byte bParm1,int iParm2)

{
  ulong uVar1;
  
  if ((iParm2 < 0) || (0x1f < iParm2)) {
    uVar1 = (ulong)bParm1;
  }
  else {
    uVar1 = (ulong)(uint)((int)(uint)bParm1 >> ((byte)iParm2 & 0x1f));
  }
  return uVar1;
}



ulong safe_rshift_func_uint8_t_u_u(byte bParm1,uint uParm2)

{
  ulong uVar1;
  
  if (uParm2 < 0x20) {
    uVar1 = (ulong)(uint)((int)(uint)bParm1 >> ((byte)uParm2 & 0x1f));
  }
  else {
    uVar1 = (ulong)bParm1;
  }
  return uVar1;
}



ulong safe_unary_minus_func_uint16_t_u(ushort uParm1)

{
  return (ulong)-(uint)uParm1;
}



ulong safe_add_func_uint16_t_u_u(ushort uParm1,ushort uParm2)

{
  return (ulong)((uint)uParm2 + (uint)uParm1);
}



ulong safe_sub_func_uint16_t_u_u(short sParm1,short sParm2)

{
  return (ulong)(ushort)(sParm1 - sParm2);
}



ulong safe_mul_func_uint16_t_u_u(short sParm1,short sParm2)

{
  return (ulong)(ushort)(sParm1 * sParm2);
}



ulong safe_mod_func_uint16_t_u_u(ushort uParm1,ushort uParm2)

{
  if (uParm2 != 0) {
    uParm1 = uParm1 % uParm2;
  }
  return (ulong)uParm1;
}



ulong safe_div_func_uint16_t_u_u(ushort uParm1,ushort uParm2)

{
  if (uParm2 != 0) {
    uParm1 = uParm1 / uParm2;
  }
  return (ulong)uParm1;
}



ulong safe_lshift_func_uint16_t_u_s(ushort uParm1,int iParm2)

{
  ulong uVar1;
  
  if (((iParm2 < 0) || (0x1f < iParm2)) || (0xffff >> ((byte)iParm2 & 0x1f) < (int)(uint)uParm1)) {
    uVar1 = (ulong)uParm1;
  }
  else {
    uVar1 = (ulong)((uint)uParm1 << ((byte)iParm2 & 0x1f));
  }
  return uVar1;
}



ulong safe_lshift_func_uint16_t_u_u(ushort uParm1,uint uParm2)

{
  ulong uVar1;
  
  if ((uParm2 < 0x20) && ((int)(uint)uParm1 <= 0xffff >> ((byte)uParm2 & 0x1f))) {
    uVar1 = (ulong)((uint)uParm1 << ((byte)uParm2 & 0x1f));
  }
  else {
    uVar1 = (ulong)uParm1;
  }
  return uVar1;
}



ulong safe_rshift_func_uint16_t_u_s(ushort uParm1,int iParm2)

{
  ulong uVar1;
  
  if ((iParm2 < 0) || (0x1f < iParm2)) {
    uVar1 = (ulong)uParm1;
  }
  else {
    uVar1 = (ulong)(uint)((int)(uint)uParm1 >> ((byte)iParm2 & 0x1f));
  }
  return uVar1;
}



ulong safe_rshift_func_uint16_t_u_u(ushort uParm1,uint uParm2)

{
  ulong uVar1;
  
  if (uParm2 < 0x20) {
    uVar1 = (ulong)(uint)((int)(uint)uParm1 >> ((byte)uParm2 & 0x1f));
  }
  else {
    uVar1 = (ulong)uParm1;
  }
  return uVar1;
}



ulong safe_unary_minus_func_uint32_t_u(int iParm1)

{
  return (ulong)(uint)-iParm1;
}



ulong safe_add_func_uint32_t_u_u(int iParm1,int iParm2)

{
  return (ulong)(uint)(iParm2 + iParm1);
}



ulong safe_sub_func_uint32_t_u_u(int iParm1,int iParm2)

{
  return (ulong)(uint)(iParm1 - iParm2);
}



ulong safe_mul_func_uint32_t_u_u(int iParm1,int iParm2)

{
  return (ulong)(uint)(iParm1 * iParm2);
}



ulong safe_mod_func_uint32_t_u_u(uint uParm1,uint uParm2)

{
  ulong uVar1;
  
  if (uParm2 == 0) {
    uVar1 = (ulong)uParm1;
  }
  else {
    uVar1 = (ulong)uParm1 % (ulong)uParm2;
  }
  return uVar1;
}



ulong safe_div_func_uint32_t_u_u(uint uParm1,uint uParm2)

{
  ulong uVar1;
  
  if (uParm2 == 0) {
    uVar1 = (ulong)uParm1;
  }
  else {
    uVar1 = (ulong)uParm1 / (ulong)uParm2;
  }
  return uVar1;
}



ulong safe_lshift_func_uint32_t_u_s(uint uParm1,int iParm2)

{
  if (((-1 < iParm2) && (iParm2 < 0x20)) && (uParm1 <= 0xffffffffU >> ((byte)iParm2 & 0x1f))) {
    uParm1 = uParm1 << ((byte)iParm2 & 0x1f);
  }
  return (ulong)uParm1;
}



ulong safe_lshift_func_uint32_t_u_u(uint uParm1,uint uParm2)

{
  if ((uParm2 < 0x20) && (uParm1 <= 0xffffffffU >> ((byte)uParm2 & 0x1f))) {
    uParm1 = uParm1 << ((byte)uParm2 & 0x1f);
  }
  return (ulong)uParm1;
}



ulong safe_rshift_func_uint32_t_u_s(uint uParm1,int iParm2)

{
  if ((-1 < iParm2) && (iParm2 < 0x20)) {
    uParm1 = uParm1 >> ((byte)iParm2 & 0x1f);
  }
  return (ulong)uParm1;
}



ulong safe_rshift_func_uint32_t_u_u(uint uParm1,uint uParm2)

{
  if (uParm2 < 0x20) {
    uParm1 = uParm1 >> ((byte)uParm2 & 0x1f);
  }
  return (ulong)uParm1;
}



undefined  [16] safe_add_func_float_f_f(float fParm1,float fParm2)

{
  if ((float)((uint)(fParm2 * 0.50000000 + fParm1 * 0.50000000) & 0x7fffffff) <=
      170141173319264429905852091742258462720.00000000) {
    fParm1 = fParm1 + fParm2;
  }
  return ZEXT416((uint)fParm1);
}



undefined  [16] safe_sub_func_float_f_f(float fParm1,float fParm2)

{
  if ((float)((uint)(fParm1 * 0.50000000 - fParm2 * 0.50000000) & 0x7fffffff) <=
      170141173319264429905852091742258462720.00000000) {
    fParm1 = fParm1 - fParm2;
  }
  return ZEXT416((uint)fParm1);
}



undefined  [16] safe_mul_func_float_f_f(float fParm1,float fParm2)

{
  if ((float)((uint)(fParm2 * 0.00000000 * fParm1 * 0.00000000) & 0x7fffffff) <= 0.99999994) {
    fParm1 = fParm1 * fParm2;
  }
  return ZEXT416((uint)fParm1);
}



undefined  [16] safe_div_func_float_f_f(float fParm1,float fParm2)

{
  undefined auVar1 [16];
  
  if ((1.00000000 <= (float)((uint)fParm2 & 0x7fffffff)) ||
     ((fParm2 != 0.00000000 &&
      ((float)((uint)((fParm1 * 0.00000000) / (fParm2 * 1267650600228229401496703205376.00000000)) &
              0x7fffffff) <= 0.00000048)))) {
    auVar1 = ZEXT416((uint)(fParm1 / fParm2)) & (undefined  [16])0xffffffffffffffff;
  }
  else {
    auVar1 = ZEXT416((uint)fParm1);
  }
  return auVar1;
}



undefined  [16] safe_add_func_double_f_f(undefined auParm1 [16],undefined auParm2 [16])

{
  double dVar1;
  
  dVar1 = SUB168(auParm1,0);
  if ((double)((ulong)(SUB168(auParm2,0) * 0.50000000 + dVar1 * 0.50000000) & 0x7fffffffffffffff) <=
            
      89884656743115785407263711865852178399035283762922498299458738401578630390014269380294779316383439085770229476757191232117160663444732091384233773351768758493024955288275641038122745045194664472037934254227566971152291618451611474082904279666061674137398913102072361584369088590459649940625202013092062429184.00000000
     ) {
    dVar1 = dVar1 + SUB168(auParm2,0);
  }
  return ZEXT816((ulong)dVar1);
}



undefined  [16] safe_sub_func_double_f_f(undefined auParm1 [16],undefined auParm2 [16])

{
  double dVar1;
  
  dVar1 = SUB168(auParm1,0);
  if ((double)((ulong)(dVar1 * 0.50000000 - SUB168(auParm2,0) * 0.50000000) & 0x7fffffffffffffff) <=
            
      89884656743115785407263711865852178399035283762922498299458738401578630390014269380294779316383439085770229476757191232117160663444732091384233773351768758493024955288275641038122745045194664472037934254227566971152291618451611474082904279666061674137398913102072361584369088590459649940625202013092062429184.00000000
     ) {
    dVar1 = dVar1 - SUB168(auParm2,0);
  }
  return ZEXT816((ulong)dVar1);
}



undefined  [16] safe_mul_func_double_f_f(undefined auParm1 [16],undefined auParm2 [16])

{
  double dVar1;
  
  dVar1 = SUB168(auParm1,0);
  if ((double)((ulong)(SUB168(auParm2,0) * 0.00000000 * dVar1 * 0.00000000) & 0x7fffffffffffffff) <=
      1.00000000) {
    dVar1 = dVar1 * SUB168(auParm2,0);
  }
  return ZEXT816((ulong)dVar1);
}



undefined  [16] safe_div_func_double_f_f(undefined auParm1 [16],undefined auParm2 [16])

{
  double dVar1;
  double dVar2;
  
  dVar1 = SUB168(auParm1,0);
  dVar2 = SUB168(auParm2,0);
  if ((1.00000000 <= (double)((ulong)dVar2 & 0x7fffffffffffffff)) ||
     ((dVar2 != 0.00000000 &&
      ((double)((ulong)((dVar1 * 0.00000000) / (dVar2 * 1267650600228229401496703205376.00000000)) &
               0x7fffffffffffffff) <= 0.00000000)))) {
    dVar1 = dVar1 / dVar2;
  }
  return ZEXT816((ulong)dVar1);
}



ulong safe_convert_func_float_to_int32_t(float fParm1)

{
  ulong uVar1;
  
  if ((fParm1 <= -2147483648.00000000) || (2147483648.00000000 <= fParm1)) {
    uVar1 = 0x7fffffff;
  }
  else {
    uVar1 = (ulong)(uint)(int)fParm1;
  }
  return uVar1;
}



void crc32_gentab(void)

{
  uint local_18;
  uint local_14;
  int local_10;
  
  local_14 = 0;
  while ((int)local_14 < 0x100) {
    local_18 = local_14;
    local_10 = 8;
    while (0 < local_10) {
      if ((local_18 & 1) == 0) {
        local_18 = local_18 >> 1;
      }
      else {
        local_18 = local_18 >> 1 ^ 0xedb88320;
      }
      local_10 = local_10 + -1;
    }
    *(uint *)(crc32_tab + (long)(int)local_14 * 4) = local_18;
    local_14 = local_14 + 1;
  }
  return;
}



void crc32_byte(byte bParm1)

{
  crc32_context =
       *(uint *)(crc32_tab + (ulong)((crc32_context ^ (uint)bParm1) & 0xff) * 4) ^
       crc32_context >> 8;
  return;
}



void crc32_8bytes(uint uParm1)

{
  crc32_byte((ulong)(uParm1 & 0xff));
  crc32_byte((ulong)(uParm1 >> 8 & 0xff));
  crc32_byte((ulong)(uParm1 >> 0x10 & 0xff));
  crc32_byte((ulong)(uParm1 >> 0x18));
  return;
}



void transparent_crc(uint uParm1,undefined8 uParm2,int iParm3)

{
  crc32_8bytes((ulong)uParm1);
  if (iParm3 != 0) {
    printf("...checksum after hashing %s : %X\n",uParm2,(ulong)~crc32_context);
  }
  return;
}



void transparent_crc_bytes(long lParm1,int iParm2,undefined8 uParm3,int iParm4)

{
  int local_c;
  
  local_c = 0;
  while (local_c < iParm2) {
    crc32_byte((ulong)*(byte *)(lParm1 + (long)local_c));
    local_c = local_c + 1;
  }
  if (iParm4 != 0) {
    printf("...checksum after hashing %s : %lX\n",uParm3,(ulong)~crc32_context);
  }
  return;
}



undefined8
set_var(undefined2 param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4,
       undefined4 param_5,undefined param_6,undefined4 param_7,undefined4 param_8,undefined2 param_9
       ,undefined4 param_10,undefined4 param_11,undefined param_12,undefined4 param_13,
       undefined param_14,undefined4 param_15,undefined4 param_16,undefined4 param_17,
       undefined4 param_18,undefined4 param_19,undefined4 param_20,undefined4 param_21,
       undefined4 param_22,undefined param_23,undefined4 param_24,undefined2 param_25,
       undefined param_26,undefined4 param_27,undefined param_28)

{
  g_6 = param_1;
  g_9 = param_2;
  g_10 = param_3;
  g_26 = param_4;
  g_57 = param_5;
  g_82 = param_8;
  g_102 = param_9;
  g_105 = param_10;
  g_106 = param_11;
  g_107 = param_12;
  g_127 = param_13;
  g_159 = param_14;
  g_229 = param_16;
  g_236 = param_17;
  g_237 = param_18;
  g_262 = param_19;
  g_271 = param_20;
  g_272 = param_21;
  g_276 = param_22;
  g_348 = param_23;
  g_391 = param_24;
  g_392 = param_25;
  g_393 = param_26;
  g_394 = param_27;
  g_396 = param_28;
  g_58 = param_6;
  g_74 = param_7;
  g_181 = param_15;
  return 0;
}



// WARNING: Removing unreachable block (ram,0x0010330d)
// WARNING: Removing unreachable block (ram,0x0010333a)
// WARNING: Removing unreachable block (ram,0x00103367)
// WARNING: Removing unreachable block (ram,0x0010336e)
// WARNING: Removing unreachable block (ram,0x00103499)
// WARNING: Removing unreachable block (ram,0x00103694)
// WARNING: Removing unreachable block (ram,0x001034a7)
// WARNING: Removing unreachable block (ram,0x001034e3)
// WARNING: Removing unreachable block (ram,0x001034f4)
// WARNING: Removing unreachable block (ram,0x001034ed)
// WARNING: Removing unreachable block (ram,0x001034f9)
// WARNING: Removing unreachable block (ram,0x00103525)
// WARNING: Removing unreachable block (ram,0x00103538)
// WARNING: Removing unreachable block (ram,0x0010360a)
// WARNING: Removing unreachable block (ram,0x00103625)
// WARNING: Removing unreachable block (ram,0x0010362c)
// WARNING: Removing unreachable block (ram,0x00103631)
// WARNING: Removing unreachable block (ram,0x00103669)
// WARNING: Removing unreachable block (ram,0x00103662)
// WARNING: Removing unreachable block (ram,0x00103679)
// WARNING: Removing unreachable block (ram,0x001037b5)
// WARNING: Removing unreachable block (ram,0x0010379d)
// WARNING: Removing unreachable block (ram,0x001037bf)
// WARNING: Removing unreachable block (ram,0x00102b3b)
// WARNING: Removing unreachable block (ram,0x00102770)
// WARNING: Removing unreachable block (ram,0x0010279f)
// WARNING: Removing unreachable block (ram,0x001025ec)
// WARNING: Removing unreachable block (ram,0x00102664)
// WARNING: Removing unreachable block (ram,0x00102a0a)
// WARNING: Removing unreachable block (ram,0x001028b5)
// WARNING: Removing unreachable block (ram,0x001028f5)
// WARNING: Removing unreachable block (ram,0x00102aba)
// WARNING: Removing unreachable block (ram,0x00102ac1)
// WARNING: Removing unreachable block (ram,0x00102a9f)
// WARNING: Removing unreachable block (ram,0x00102aca)
// WARNING: Removing unreachable block (ram,0x00102acd)
// WARNING: Removing unreachable block (ram,0x00102ad4)
// WARNING: Removing unreachable block (ram,0x00102939)
// WARNING: Removing unreachable block (ram,0x00102a73)
// WARNING: Removing unreachable block (ram,0x00102a86)
// WARNING: Removing unreachable block (ram,0x00102a93)
// WARNING: Removing unreachable block (ram,0x001029f4)
// WARNING: Removing unreachable block (ram,0x00102ae4)
// WARNING: Removing unreachable block (ram,0x00102ae1)
// WARNING: Removing unreachable block (ram,0x00102ae7)
// WARNING: Removing unreachable block (ram,0x00102aef)
// WARNING: Removing unreachable block (ram,0x00102920)
// WARNING: Removing unreachable block (ram,0x00102afd)
// WARNING: Removing unreachable block (ram,0x00102b2d)
// WARNING: Removing unreachable block (ram,0x00102b15)
// WARNING: Removing unreachable block (ram,0x00102b36)
// WARNING: Removing unreachable block (ram,0x00102b55)
// WARNING: Removing unreachable block (ram,0x00102b8e)
// WARNING: Removing unreachable block (ram,0x00102efb)
// WARNING: Removing unreachable block (ram,0x00102f45)
// WARNING: Removing unreachable block (ram,0x00102f50)
// WARNING: Removing unreachable block (ram,0x00102f63)
// WARNING: Removing unreachable block (ram,0x00102f74)
// WARNING: Removing unreachable block (ram,0x00102f6d)
// WARNING: Removing unreachable block (ram,0x00102f79)
// WARNING: Removing unreachable block (ram,0x001030af)
// WARNING: Removing unreachable block (ram,0x00102f8e)
// WARNING: Removing unreachable block (ram,0x00102fa5)
// WARNING: Removing unreachable block (ram,0x00102fbf)
// WARNING: Removing unreachable block (ram,0x00102fc6)
// WARNING: Removing unreachable block (ram,0x00102fcb)
// WARNING: Removing unreachable block (ram,0x00103048)
// WARNING: Removing unreachable block (ram,0x00103041)
// WARNING: Removing unreachable block (ram,0x0010304d)
// WARNING: Removing unreachable block (ram,0x001030bc)
// WARNING: Removing unreachable block (ram,0x00102c78)
// WARNING: Removing unreachable block (ram,0x00102e2b)
// WARNING: Removing unreachable block (ram,0x00102e01)
// WARNING: Removing unreachable block (ram,0x0010324e)
// WARNING: Removing unreachable block (ram,0x00103277)
// WARNING: Removing unreachable block (ram,0x00103270)
// WARNING: Removing unreachable block (ram,0x0010327c)
// WARNING: Removing unreachable block (ram,0x001037cf)
// WARNING: Removing unreachable block (ram,0x001037d8)
// WARNING: Removing unreachable block (ram,0x00103871)

undefined8 func_1(void)

{
  char local_15e;
  byte local_15c;
  ushort local_14c;
  uint local_12c;
  int local_128;
  uint local_10c;
  int local_e0;
  
  local_15e = -0x2a;
  local_10c = 0xcbdebe9;
  local_15c = 0x34;
  local_12c = 0xffffffff;
  local_14c = 4;
  local_128 = -0x1c;
  while (local_128 != 0x2d) {
    local_15e = 1;
    local_14c = 0x85;
    local_12c = 1;
    local_128 = local_128 + 1;
  }
  local_e0 = 0;
  while (-0x1e < local_e0) {
    local_10c = 0x2000;
    local_15c = local_15c + 1;
    local_e0 = local_e0 + -1;
  }
  set_var((ulong)local_14c,0x5f70,0x8a835a27,0x1d4595a2,0xd7fccea5,0,0x2d,(ulong)local_12c,0x7962,1,
          9,0xf7,0x617cc220,(ulong)(uint)(int)local_15e,0,0x340ca8d4,(ulong)local_10c,0xffffffff,
          0xbbe48de7,0x67052121,0xffffffff,0x6eeb3931,0xff,5,1,9,2,(ulong)local_15c);
  return 2;
}



undefined8 main(int iParm1,long lParm2)

{
  int iVar1;
  uint local_c;
  
  local_c = 0;
  if (iParm1 == 2) {
    iVar1 = strcmp(*(char **)(lParm2 + 8),"1");
    if (iVar1 == 0) {
      local_c = 1;
    }
  }
  platform_main_begin();
  crc32_gentab();
  func_1();
  transparent_crc((ulong)g_6,&DAT_0010406e,(ulong)local_c,&DAT_0010406e);
  transparent_crc((ulong)g_9,&DAT_00104072,(ulong)local_c,&DAT_00104072);
  transparent_crc((ulong)g_10,&DAT_00104076,(ulong)local_c,&DAT_00104076);
  transparent_crc((ulong)g_26,&DAT_0010407b,(ulong)local_c,(ulong)g_26);
  transparent_crc((ulong)g_57,&DAT_00104080,(ulong)local_c,&DAT_00104080);
  transparent_crc((ulong)g_58,&DAT_00104085,(ulong)local_c,&DAT_00104085);
  transparent_crc((ulong)g_74,&DAT_0010408a,(ulong)local_c,&DAT_0010408a);
  transparent_crc((ulong)g_82,&DAT_0010408f,(ulong)local_c,(ulong)g_82);
  transparent_crc((ulong)g_102,"g_102",(ulong)local_c,"g_102");
  transparent_crc((ulong)g_105,"g_105",(ulong)local_c,(ulong)g_105);
  transparent_crc((ulong)g_106,"g_106",(ulong)local_c,(ulong)g_106);
  transparent_crc((ulong)g_107,"g_107",(ulong)local_c,"g_107");
  transparent_crc((ulong)g_127,"g_127",(ulong)local_c,(ulong)g_127);
  transparent_crc((ulong)(uint)(int)g_159,"g_159",(ulong)local_c,"g_159");
  transparent_crc((ulong)g_181,"g_181",(ulong)local_c,"g_181");
  transparent_crc((ulong)g_229,"g_229",(ulong)local_c,"g_229");
  transparent_crc((ulong)g_236,"g_236",(ulong)local_c,(ulong)g_236);
  transparent_crc((ulong)g_237,"g_237",(ulong)local_c,"g_237");
  transparent_crc((ulong)g_262,"g_262",(ulong)local_c,(ulong)g_262);
  transparent_crc((ulong)g_271,"g_271",(ulong)local_c,(ulong)g_271);
  transparent_crc((ulong)g_272,"g_272",(ulong)local_c,"g_272");
  transparent_crc((ulong)g_276,"g_276",(ulong)local_c,"g_276");
  transparent_crc((ulong)g_348,"g_348",(ulong)local_c,"g_348");
  transparent_crc((ulong)g_391,"g_391",(ulong)local_c,(ulong)g_391);
  transparent_crc((ulong)(uint)(int)g_392,"g_392",(ulong)local_c,"g_392");
  transparent_crc((ulong)(uint)(int)g_393,"g_393",(ulong)local_c,"g_393");
  transparent_crc((ulong)g_394,"g_394",(ulong)local_c,(ulong)g_394);
  transparent_crc((ulong)g_396,"g_396",(ulong)local_c,"g_396");
  platform_main_end((ulong)~crc32_context,(ulong)local_c,(ulong)~crc32_context);
  return 0;
}



void _fini(void)

{
  return;
}


