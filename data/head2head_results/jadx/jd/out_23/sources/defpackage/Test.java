

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_23/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_23/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public int iFld = -2;
    public double dFld = 11.47497d;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long bMeth_check_sum;
    public static volatile long instanceCount = 65350;
    public static volatile int iFld1 = 7293;
    public static float fFld = 2.342f;
    public static volatile byte byFld = 27;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, 63558);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        bMeth_check_sum = 0L;
    }

    public boolean bMeth(float f, int i) {
        int i2 = -12;
        int i3 = -1;
        int i4 = -8;
        int[][][] iArr = new int[N][N][N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -8L);
        FuzzerUtils.init((Object[][]) iArr, (Object) 139);
        iFld1 -= (int) instanceCount;
        for (long j : jArr) {
            this.iFld <<= -13;
        }
        int i5 = 7;
        while (i5 < 253) {
            i3 = 1;
            while (i3 < 7) {
                i4 = 2;
                while (i4 > 1) {
                    try {
                        i2 = (-10676) / (-60210);
                        i = i2 % i;
                        iArr[i5][i5 - 1][i3 + 1] = (-48358) / iArr[i3 - 1][i3 - 1][i5];
                    } catch (ArithmeticException e) {
                    }
                    this.iFld -= (int) instanceCount;
                    if (i != 0) {
                        return ((int) (((((long) (((((((Float.floatToIntBits(f) + i) + i5) + i2) + i3) + (-60210)) + i4) + (-48358))) + Double.doubleToLongBits(-2.65185d)) + FuzzerUtils.checkSum(jArr)) + FuzzerUtils.checkSum((Object[][]) iArr))) % 2 > 0;
                    }
                    this.iFld += i4 * i4;
                    int i6 = (int) (i2 + (i4 - instanceCount));
                    this.iFld -= (int) (-2.65185d);
                    f = (f - f) + (i4 - iFld1);
                    i2 = i6 + i3;
                    i4--;
                }
                i3++;
            }
            i5++;
        }
        long floatToIntBits = (((((((Float.floatToIntBits(f) + i) + i5) + i2) + i3) - 60210) + i4) - 48358) + Double.doubleToLongBits(-2.65185d) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum((Object[][]) iArr);
        bMeth_check_sum += floatToIntBits;
        return floatToIntBits % 2 > 0;
    }

    public void vMeth1() {
        int i = -56587;
        int i2 = -181;
        int[][] iArr = new int[N][N];
        boolean z = true;
        FuzzerUtils.init(iArr, -72);
        int i3 = 15;
        while (i3 < 375) {
            instanceCount = -(-73.444f);
            this.iFld += ((i3 * iFld1) + iFld1) - this.iFld;
            z = z && bMeth(-73.444f, -168);
            fFld -= -73.444f;
            i = this.iFld;
            iArr[i3][i3 - 1] = this.iFld;
            iFld1 = (int) (iFld1 + (((i3 * (-73.444f)) + iFld1) - (-73.444f)));
            i3++;
        }
        int i4 = 142;
        while (i4 > 7) {
            i2 = 12;
            while (i2 > i4) {
                instanceCount -= 14;
                if (z) {
                    break;
                }
                i = (int) (i + (((i2 * (-18049)) + instanceCount) - (-14)));
                fFld *= -10.0f;
                iFld1 *= this.iFld;
                i2--;
            }
            i4--;
        }
        vMeth1_check_sum += (((((((i3 + i) + (z ? 1 : 0)) + i4) - 14) + i2) - 14) - 18049) + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth() {
        int i = -14;
        int i2 = 69;
        int i3 = -27203;
        int i4 = 8;
        int i5 = -220;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -4);
        vMeth1();
        int i6 = 7;
        while (i6 < 260) {
            i2 = 1;
            while (i2 < 6) {
                if (0 != 0) {
                    if (0 != 0) {
                        break;
                    }
                    this.iFld = (int) instanceCount;
                    i4 = 1;
                    while (i4 < 2) {
                        iArrFld = iArr;
                        instanceCount += i2;
                        int i7 = i + i5;
                        i = i6 + (i4 ^ i5);
                        int i8 = i4 + 1;
                        iArr[i8] = iArr[i8] + ((int) fFld);
                        i3 -= iFld1;
                        i5 /= 1783921225;
                        i4++;
                    }
                } else {
                    iFld1 %= (int) (fFld | 1);
                }
                i2++;
            }
            i6++;
        }
        vMeth_check_sum += i6 + i + i2 + i3 + (0 != 0 ? 1 : 0) + i4 + i5 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        int i = 43256;
        int i2 = -3;
        int i3 = 3609;
        int i4 = 16302;
        int i5 = 189;
        int i6 = -178;
        int i7 = 203;
        long j = -2619759133L;
        long[] jArr = new long[N];
        double[] dArr = new double[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(jArr, -1890164814L);
        FuzzerUtils.init(dArr, 2.44146d);
        FuzzerUtils.init(fArr, -2.686f);
        int i8 = this.iFld;
        this.iFld = i8 - 1;
        this.iFld = i8 * ((this.iFld - (-48)) + (this.iFld * iFld1));
        int i9 = 14;
        while (i9 < 338) {
            int i10 = i9 + 1;
            long j2 = jArr[i10] + 1;
            jArr[i10] = j2;
            double d = j2;
            int i11 = i9;
            double d2 = dArr[i11] - 1.0d;
            dArr[i11] = d2;
            i -= (int) (d - (d2 - (i9 - iFld1)));
            i2 = 2;
            while (78 > i2) {
                long j3 = 1;
                while (true) {
                    j = j3;
                    if (j < 2) {
                        vMeth();
                        i += (int) j;
                        fFld -= (float) j;
                        j3 = j + 1;
                    }
                }
                i3 -= (int) instanceCount;
                i2++;
            }
            iArrFld[i9] = this.iFld;
            fArr[i9 + 1] = (float) this.dFld;
            instanceCount += i3;
            iFld1 *= iFld1;
            int[] iArr = iArrFld;
            int i12 = i9 - 1;
            iArr[i12] = iArr[i12] + i4;
            i4 = iFld1;
            i9++;
        }
        instanceCount = j;
        int i13 = 11;
        while (i13 < 322) {
            i6 = 81;
            while (i6 > i13) {
                int[] iArr2 = iArrFld;
                int i14 = i6;
                iArr2[i14] = iArr2[i14] + ((int) fFld);
                this.iFld = i5;
                instanceCount -= 25;
                i3 += this.iFld;
                i7 = 1;
                do {
                    byFld = (byte) (byFld - ((byte) i9));
                    fFld += (float) (i7 + instanceCount);
                    i7++;
                } while (i7 < 1);
                i5 >>>= i7;
                fFld += i6 * i6;
                int i15 = i13 + 1;
                fArr[i15] = fArr[i15] + iFld1;
                iArrFld = iArrFld;
                fFld += i6;
                i6--;
            }
            i13++;
        }
        FuzzerUtils.out.println("i i1 i2 = " + i9 + "," + i + "," + i2);
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i3 l i4 = " + i3 + "," + j + "," + printStream);
        FuzzerUtils.out.println("i24 i25 i26 = " + i13 + "," + i5 + "," + i6);
        FuzzerUtils.out.println("i27 i28 lArr = " + 28224 + "," + i7 + "," + FuzzerUtils.checkSum(jArr));
        PrintStream printStream2 = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        printStream2.println("dArr fArr = " + doubleToLongBits + "," + printStream2);
        PrintStream printStream3 = FuzzerUtils.out;
        long j4 = instanceCount;
        int i16 = this.iFld;
        int i17 = iFld1;
        printStream3.println("Test.instanceCount iFld Test.iFld1 = " + j4 + "," + printStream3 + "," + i16);
        PrintStream printStream4 = FuzzerUtils.out;
        int floatToIntBits = Float.floatToIntBits(fFld);
        long doubleToLongBits2 = Double.doubleToLongBits(this.dFld);
        byte b = byFld;
        printStream4.println("Test.fFld dFld Test.byFld = " + floatToIntBits + "," + doubleToLongBits2 + "," + printStream4);
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
