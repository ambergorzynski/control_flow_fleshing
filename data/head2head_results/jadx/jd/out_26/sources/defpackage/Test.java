

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_26/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_26/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long fMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long instanceCount = -39077;
    public static int iFld = 135;
    public static int iFld1 = 14623;
    public static float fFld = 0.997f;
    public static int iFld2 = 8;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static long[][] lArrFld = new long[N][N];

    static {
        FuzzerUtils.init(iArrFld, 8);
        FuzzerUtils.init(lArrFld, 3510373190503364430L);
        fMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }

    public static void vMeth(boolean z) {
        float f = 1.54f;
        byte b = -77;
        for (int i : iArrFld) {
            lArrFld[(i >>> 1) % N][(i >>> 1) % N] = 185;
            f = 1.0f;
            while (true) {
                float f2 = f + 1.0f;
                f = f2;
                if (f2 < 4.0f) {
                    b = (byte) (b + ((byte) f));
                    lArrFld[(int) f][(int) (f - 1.0f)] = i;
                }
            }
        }
        vMeth_check_sum += (z ? 1 : 0) + Float.floatToIntBits(f) + b;
    }

    public static int iMeth(int i, long j) {
        int i2 = -32363;
        int i3 = 8;
        double d = 78.45499d;
        double[] dArr = new double[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, 96.676f);
        FuzzerUtils.init(dArr, -83.111089d);
        vMeth(true);
        int i4 = 1;
        do {
            if (1 != 0) {
                i2 = 1;
                while (true) {
                    i2++;
                    if (i2 >= 5) {
                        break;
                    }
                    try {
                        iFld = iArrFld[i4] / (-944698204);
                        iFld = i % 545156714;
                        int i5 = i2 % i2;
                    } catch (ArithmeticException e) {
                    }
                    i = iFld;
                    fArr[i2] = fArr[i2] - 17794;
                    iFld ^= i2;
                    iFld *= 0;
                }
            } else if (1 != 0) {
                instanceCount *= iFld1;
                fFld = i;
                double d2 = i4;
                while (true) {
                    d = d2;
                    if (d >= 5.0d) {
                        break;
                    }
                    dArr[i4 + 1] = iFld;
                    try {
                        iFld1 = i % 91;
                        i3 = 1885125952 % i;
                        i = i3 % iArrFld[i4];
                    } catch (ArithmeticException e2) {
                    }
                    d2 = d + 1.0d;
                }
            } else {
                iFld1 <<= -3561;
            }
            i4++;
        } while (i4 < 325);
        long doubleToLongBits = (((((i + j) + (1 != 0 ? 1 : 0)) + i4) + i2) - 17794) + Double.doubleToLongBits(d) + i3 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static float fMeth(int i, double d, short s) {
        int i2 = -205;
        int i3 = 6;
        int i4 = -61034;
        int i5 = 14;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 0);
        int i6 = 7;
        while (i6 < 126) {
            i3 = 13;
            while (true) {
                i3--;
                if (i3 <= 0) {
                    break;
                }
                int i7 = i3 - 1;
                int i8 = iArr[i7] + 1;
                iArr[i7] = i8;
                i += i8;
                i4 = 1;
                while (i4 > i6) {
                    int iMeth = i2 >>> (iMeth(i3, instanceCount) % (i | 1));
                    i2 = iMeth;
                    iFld = iMeth;
                    s = (short) (s + ((short) (((i4 * instanceCount) + iFld) - i5)));
                    i4--;
                }
                if (1 == 0) {
                    instanceCount = instanceCount;
                    iFld -= -1;
                }
            }
            if (1 != 0) {
                break;
            }
            if (1 != 0) {
                iArrFld = iArr;
            } else {
                if (i5 != 0) {
                }
                fFld += i6;
                i5 = iFld;
            }
            i6++;
        }
        long doubleToLongBits = i + Double.doubleToLongBits(d) + s + i6 + i2 + i3 + i4 + i5 + (1 != 0 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += doubleToLongBits;
        return (float) doubleToLongBits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    public void mainTest(String[] strArr) {
        int i;
        long j;
        short s = 3870;
        long j2 = -4005793888L;
        int i2 = -11;
        int i3 = 49437;
        int i4 = 21431;
        int i5 = -14410;
        int i6 = 152;
        int i7 = 48784;
        boolean[] zArr = new boolean[N];
        FuzzerUtils.init(zArr, true);
        char c = 3870;
        iFld *= (int) fMeth(iFld1, 0.59363d, (short) 3870);
        long j3 = 1;
        do {
            i = 5;
            c = c;
            while (i < 82) {
                try {
                    c = 227;
                    c = 227;
                    iArrFld[i] = iFld / 227;
                    iFld = 35562 / i;
                    i2 = 92 % iFld;
                } catch (ArithmeticException e) {
                }
                iFld1 -= iFld1;
                fFld -= i2;
                i3 = 1;
                ?? r3 = c;
                while (i3 < 2) {
                    int i8 = iFld;
                    try {
                        iFld = i / iFld1;
                        i8 = iFld1 % i3;
                        r3 = 1;
                        r3 = 1;
                        iFld = i3 / iArrFld[(int) (j3 - 1)];
                    } catch (ArithmeticException e2) {
                    }
                    i4 = i8 - ((int) fFld);
                    fFld = iFld2;
                    j2 = (j2 - fFld) - fFld;
                    iFld *= 2;
                    instanceCount = iFld1;
                    i3++;
                    r3 = r3;
                }
                i++;
                c = r3;
            }
            j = j3 + 1;
            j3 = c;
        } while (j < 307);
        iFld2 = iFld;
        iFld1 = i2;
        for (int i9 = 7; i9 < 133; i9++) {
            i2 *= iFld1;
            int[] iArr = iArrFld;
            int i10 = i9 + 1;
            iArr[i10] = iArr[i10] << iFld1;
            i6 = 1;
            while (true) {
                i6++;
                if (i6 < 199) {
                    iArrFld[i6] = -39027;
                    i7 = 1;
                    while (i7 < 1) {
                        iFld2 += (int) instanceCount;
                        s = (short) iFld2;
                        i5 = i7;
                        j2 &= i5;
                        i4 <<= i4;
                        zArr[i9 + 1] = true;
                        i7++;
                    }
                }
            }
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("d2 s2 l1 = " + Double.doubleToLongBits(0.59363d) + "," + printStream + "," + s);
        FuzzerUtils.out.println("i11 i12 i13 = " + i + "," + i2 + "," + i3);
        PrintStream printStream2 = FuzzerUtils.out;
        printStream2.println("i14 l2 i15 = " + i4 + "," + j2 + "," + printStream2);
        FuzzerUtils.out.println("i16 i17 i18 = " + i5 + "," + i6 + "," + i7);
        FuzzerUtils.out.println("i19 b3 bArr = " + (-166) + "," + (1 != 0) + "," + FuzzerUtils.checkSum(zArr));
        PrintStream printStream3 = FuzzerUtils.out;
        long j4 = instanceCount;
        int i11 = iFld;
        int i12 = iFld1;
        printStream3.println("Test.instanceCount Test.iFld Test.iFld1 = " + j4 + "," + printStream3 + "," + i11);
        FuzzerUtils.out.println("Test.fFld Test.iFld2 Test.iArrFld = " + Float.floatToIntBits(fFld) + "," + iFld2 + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
