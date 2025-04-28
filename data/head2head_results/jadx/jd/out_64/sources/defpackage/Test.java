

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_64/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_64/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long instanceCount = 194;
    public static boolean bFld = false;
    public static volatile byte byFld = 50;
    public static int iFld = -62197;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static volatile double[] dArrFld = new double[N];

    static {
        FuzzerUtils.init(iArrFld, -29936);
        FuzzerUtils.init(dArrFld, 0.31411d);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }

    public static void vMeth1() {
        int i = 52543;
        int i2 = 152;
        int i3 = -4;
        int i4 = 9;
        float f = 2.355f;
        double d = 2.99655d;
        double d2 = -1.124659d;
        long[][] jArr = new long[N][N];
        FuzzerUtils.init(jArr, -127L);
        int i5 = (-54) * (-54);
        long[] jArr2 = jArr[(i5 >>> 1) % N];
        jArr2[136] = jArr2[136] - i5;
        iArrFld[(52543 >>> 1) % N] = 52543;
        int i6 = i5 + i5;
        int i7 = 15;
        while (i7 < 282) {
            i += i7;
            float f2 = i7;
            while (true) {
                f = f2;
                if (6.0f <= f) {
                    break;
                }
                i2 += (int) (((f * (-158)) + i2) - ((float) instanceCount));
                instanceCount = i2;
                f2 = f + 1.0f;
            }
            double d3 = 6.0d;
            while (true) {
                d = d3;
                if (i7 < d) {
                    i2 *= 441693264;
                    i3 = ((int) instanceCount) - i2;
                    try {
                        i = iArrFld[(int) (d - 1.0d)] / (-170);
                        i4 = (-723445758) % i4;
                        i3 = i4 % i6;
                    } catch (ArithmeticException e) {
                    }
                    d2 += i7;
                    d3 = d - 1.0d;
                }
            }
            i7++;
        }
        vMeth1_check_sum += (((i6 + i) + i7) - 158) + Float.floatToIntBits(f) + i2 + Double.doubleToLongBits(d) + i3 + i4 + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(jArr);
    }

    public static int iMeth(int i, short s) {
        long j;
        int i2 = -116;
        int i3 = -196;
        long j2 = -6;
        int i4 = iArrFld[(i >>> 1) % N];
        int i5 = i | (-3);
        int i6 = i5;
        short s2 = (short) (s - ((short) (i4 & i5)));
        vMeth1();
        int i7 = 4;
        while (i7 < 135) {
            i6 >>= 27;
            instanceCount -= i6;
            if (!bFld) {
                i2 /= (int) (((long) 0.108869d) | 1);
            } else {
                int i8 = i6 + i7;
                j2 = 12;
                do {
                    i2 += (int) 2.125f;
                    i6 = ((int) j2) - ((int) 2.125f);
                    i3 = 1;
                    while (2 > i3 && !bFld) {
                        i2 += (int) (0.333f + (i3 * i3));
                        if (bFld) {
                        }
                        i3++;
                    }
                    j = j2 - 2;
                    j2 = j;
                } while (j > 0);
            }
            i7++;
        }
        long floatToIntBits = ((((((((i6 + s2) + i7) + 27) + j2) + i2) + Float.floatToIntBits(2.125f)) + i3) - 7) + Double.doubleToLongBits(0.108869d);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static void vMeth(int i, int i2, boolean z) {
        double d;
        double d2 = 62.126301d;
        int i3 = -13;
        int i4 = -195;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -81);
        for (int i5 : iArr) {
            d2 = 1.0d;
            do {
                iMeth(i2, (short) 15707);
                i3 = (int) d2;
                while (i3 < 1) {
                    if (i != 0) {
                        vMeth_check_sum += (((((i + i2) + (z ? 1 : 0)) + Double.doubleToLongBits(d2)) + i3) - 10) + i4 + FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    i *= i;
                    instanceCount = i4;
                    i5 = (int) (i5 + (((i3 * (-10)) - 10) - instanceCount));
                    dArrFld[i3 - 1] = 32250;
                    i4 = 32250 * 54;
                    instanceCount += i3;
                    i3++;
                }
                dArrFld[(int) (d2 - 1.0d)] = byFld;
                d = d2 + 1.0d;
                d2 = d;
            } while (d < 4.0d);
            i4 = (int) instanceCount;
            i2 -= 6;
        }
        vMeth_check_sum += (((((i + i2) + (z ? 1 : 0)) + Double.doubleToLongBits(d2)) + i3) - 10) + i4 + FuzzerUtils.checkSum(iArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void mainTest(String[] strArr) {
        int i = -5214;
        int i2 = 58919;
        int i3 = 6;
        int i4 = 52258;
        int i5 = -5571;
        float f = -2.14f;
        float f2 = -1.134f;
        vMeth(0, 0, bFld);
        int i6 = 0 >>> 2;
        int i7 = 8;
        while (i7 < 157) {
            byFld = (byte) (byFld + ((byte) (((i7 * f) + i6) - i)));
            i2 = 1;
            while (i2 < 168) {
                double[] dArr = dArrFld;
                int i8 = i7 + 1;
                dArr[i8] = dArr[i8] * instanceCount;
                float f3 = 1.0f + 1.0f;
                f2 = f3;
                if (f3 < 2.0f) {
                    instanceCount = instanceCount;
                    iArrFld[i7 - 1] = i6;
                    i3 = i7;
                    instanceCount += i2;
                    instanceCount = i2;
                    instanceCount <<= i;
                    int[] iArr = iArrFld;
                    int i9 = i7;
                    iArr[i9] = iArr[i9] << ((int) instanceCount);
                }
                i4 = 2;
                while (i4 > i2) {
                    instanceCount += i4 * i4;
                    f += (float) (462733926 + (i4 * i4));
                    i6 >>= i7;
                    i3 = i2 * (-10);
                    i = -25804;
                    switch (((i4 % 3) * 5) + 118) {
                        case 120:
                            i6 = (int) (i6 + (((i4 * i5) + instanceCount) - i5));
                            break;
                        case 131:
                            i5 -= i5;
                            break;
                        case 133:
                            dArrFld[i7] = instanceCount;
                            i6 += iFld;
                            bFld = true;
                            instanceCount = i5;
                            i6 = (int) (i6 + (((i4 * i5) + instanceCount) - i5));
                            break;
                    }
                    i4--;
                }
                i2++;
            }
            i7++;
        }
        FuzzerUtils.out.println("i19 i20 i21 = " + i6 + "," + i7 + "," + i);
        FuzzerUtils.out.println("f2 i22 i23 = " + Float.floatToIntBits(f) + "," + i2 + "," + i3);
        FuzzerUtils.out.println("f3 i24 i25 = " + Float.floatToIntBits(f2) + "," + i4 + "," + i5);
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        boolean z = bFld;
        byte b = byFld;
        printStream.println("Test.instanceCount Test.bFld Test.byFld = " + j + "," + printStream + "," + z);
        PrintStream printStream2 = FuzzerUtils.out;
        int i10 = iFld;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld));
        printStream2.println("Test.iFld Test.iArrFld Test.dArrFld = " + i10 + "," + checkSum + "," + printStream2);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
