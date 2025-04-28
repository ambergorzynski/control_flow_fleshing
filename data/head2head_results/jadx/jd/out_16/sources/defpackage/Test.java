

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_16/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_16/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public boolean bFld = true;
    public long[] lArrFld = new long[N];
    public static long instanceCount = 3;
    public static float fFld = -109.268f;
    public static volatile int iFld = 26579;
    public static byte byFld = 21;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {
        double d;
        int i = 159;
        int i2 = 5;
        int i3 = 226;
        int i4 = -18972;
        int i5 = 63138;
        int i6 = -155;
        int i7 = -13;
        int[] iArr = new int[N];
        byte[] bArr = new byte[N];
        FuzzerUtils.init(bArr, (byte) -77);
        FuzzerUtils.init(iArr, -55642);
        double d2 = 18.0d;
        while (true) {
            d = d2;
            if (d >= 315.0d) {
                break;
            }
            i2 = (int) d;
            while (i2 < 6) {
                int i8 = (int) (d - 1.0d);
                bArr[i8] = (byte) (bArr[i8] * (-52));
                i2++;
            }
            i = -126;
            d2 = d + 1.0d;
        }
        if (1 != 0) {
            i4 = 1;
            while (true) {
                i4++;
                if (i4 >= 336) {
                    break;
                }
                i5 = 1;
                while (i5 < 5) {
                    int i9 = i3 + i6;
                    i6 += (int) fFld;
                    i += i6;
                    i3 = -1003069736;
                    instanceCount += instanceCount;
                    i5++;
                }
                i7 = 5;
                while (i7 > i4) {
                    int i10 = i7 + 1;
                    iArr[i10] = iArr[i10] / ((int) (instanceCount | 1));
                    i ^= i2;
                    i7--;
                }
            }
        } else {
            fFld -= 13;
        }
        vMeth1_check_sum += ((((Double.doubleToLongBits(d) + i) + i2) + i3) - 126) + i4 + i5 + i6 + i7 + 47 + (1 != 0 ? 1 : 0) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i, float f) {
        int i2 = 62383;
        int[][] iArr = new int[N][N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 3306712452L);
        FuzzerUtils.init(iArr, -14589);
        int i3 = i - 1;
        jArr[330] = i;
        vMeth1();
        byte b = (byte) i3;
        instanceCount = i3;
        iFld ^= iFld;
        int i4 = i3 + i3;
        int[] iArr2 = iArr[(i4 >>> 1) % N];
        int i5 = (iFld >>> 1) % N;
        iArr2[i5] = iArr2[i5] << b;
        int i6 = 12;
        while (i6 < 358) {
            i4 += iFld;
            iArr[i6][i6 - 1] = i6;
            switch ((i6 % 2) + 108) {
                case 108:
                    int i7 = i4 * ((int) instanceCount);
                    i2 ^= -179712700;
                    instanceCount = instanceCount;
                    break;
                case 109:
                    break;
                default:
                    i2 += i2;
                    continue;
            }
            i4 = iFld;
            i6++;
        }
        long floatToIntBits = i4 + Float.floatToIntBits(f) + b + i6 + i2 + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static void vMeth(int i) {
        iMeth(-6, -85.115f);
        vMeth_check_sum += i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017a A[PHI: r16
      0x017a: PHI (r16v7 long) = (r16v4 long), (r16v10 long) binds: [B:31:0x0122, B:34:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d6 A[PHI: r16
      0x01d6: PHI (r16v5 long) = (r16v4 long), (r16v6 long) binds: [B:31:0x0122, B:44:0x01ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r7) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.mainTest(java.lang.String[]):void");
    }

    public static void main(String[] strArr) {
        try {
            Test test = new Test();
            for (int i = 0; i < 10; i++) {
                test.mainTest(strArr);
            }
        } catch (Exception e) {
            FuzzerUtils.out.println(e.getClass().getCanonicalName());
        }
    }
}
