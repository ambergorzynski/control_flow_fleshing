

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_66/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_66/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public long[] lArrFld = new long[N];
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long instanceCount = -149;
    public static float fFld = 0.553f;
    public static byte byFld = -74;
    public static double dFld = 71.116644d;
    public static boolean bFld = false;
    public static final int N = 400;
    public static volatile int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, 13);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
    }

    public static int iMeth1() {
        int i = -31117;
        int i2 = -109;
        int i3 = 42060;
        int i4 = -11106;
        int i5 = -13980;
        int[] iArr = new int[N];
        long j = 2942650806L;
        byte[] bArr = new byte[N];
        FuzzerUtils.init(bArr, (byte) -30);
        FuzzerUtils.init(iArr, -42549);
        int i6 = 1;
        while (true) {
            i6++;
            if (i6 >= 388) {
                break;
            }
            i = (int) (i + i6 + instanceCount);
            bArr[i6] = (byte) j;
            i2 = 1;
            do {
                i3 = 1;
                while (1 > i3) {
                    if (0 == 0) {
                        j ^= 9;
                        i = ((int) j) + ((int) (2346180623888272987L + (i3 * i3)));
                    }
                    i3++;
                }
                i4 = i2;
                iArr[i2 - 1] = byFld;
                i5 = 1;
                while (i5 < 1) {
                    i4 = i5;
                    instanceCount = i6;
                    i5++;
                }
                i2++;
            } while (i2 < 4);
        }
        long doubleToLongBits = i6 + i + j + i2 + i3 + i4 + (0 != 0 ? 1 : 0) + Double.doubleToLongBits(62.43747d) + i5 + 2 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static int iMeth(double d, byte b, long j) {
        int i = -13401;
        int i2 = 109;
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(iArr, -1);
        FuzzerUtils.init(jArr, 130L);
        fFld = fFld + 1.0f;
        int iMeth1 = ((-15452) + ((int) (((-15452) - r2) - 15452))) | iMeth1();
        instanceCount *= 19;
        int i3 = (iMeth1 - 9) * ((int) instanceCount);
        int i4 = 312;
        while (i4 > 13) {
            iArr[i4 - 1] = i4;
            i2 = 1;
            while (i2 < 6) {
                fFld = (float) j;
                i = i3 - ((int) d);
                iArr[i4 + 1] = -38;
                i2++;
            }
            i4--;
        }
        double d2 = 21.0d;
        while (true) {
            double d3 = d2;
            if (d3 < 398.0d) {
                fFld += (float) j;
                d2 = d3 + 1.0d;
            } else {
                int i5 = (i2 >>> 1) % N;
                jArr[i5] = jArr[i5] - i4;
                long doubleToLongBits = Double.doubleToLongBits(d) + b + j + i3 + i4 + i + i2 + 0 + Double.doubleToLongBits(d3) + 82 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr);
                iMeth_check_sum += doubleToLongBits;
                return (int) doubleToLongBits;
            }
        }
    }

    public static void vMeth() {
        int i;
        int i2 = -11668;
        int i3 = 12;
        int i4 = -27067;
        int[] iArr = new int[N];
        short s = -23002;
        FuzzerUtils.init(iArr, 231);
        int i5 = (int) instanceCount;
        int i6 = 314;
        while (i6 > 3) {
            short s2 = s;
            s = (short) (s - 1);
            i2 += s2 * iMeth(0.69251d, byFld, instanceCount);
            i6--;
        }
        int i7 = 1;
        do {
            instanceCount += i7;
            iArr[i7] = i6;
            i = 1;
            while (i < 4) {
                i3 <<= (int) instanceCount;
                i4 = 2;
                while (true) {
                    i4 -= 3;
                    if (i4 > 0) {
                        i2 <<= -2011531939;
                        iArr = iArrFld;
                        iArr[i4 + 1] = 224;
                        i5 += i7;
                        byFld = (byte) (byFld + ((byte) i));
                        s = (short) (s - ((short) i));
                    }
                }
                i++;
            }
            i7++;
        } while (i7 < 391);
        vMeth_check_sum += i5 + i6 + i2 + s + Double.doubleToLongBits(0.69251d) + i7 + i + i3 + i4 + FuzzerUtils.checkSum(iArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r8) {
        /*
            Method dump skipped, instructions count: 561
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
