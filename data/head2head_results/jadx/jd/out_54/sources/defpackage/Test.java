

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_54/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_54/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public byte[] byArrFld = new byte[N];
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long instanceCount = -4165452013L;
    public static short sFld = 31609;
    public static double dFld = 2.13063d;
    public static final int N = 400;
    public static float[] fArrFld = new float[N];
    public static volatile int[][] iArrFld = new int[N][N];

    static {
        FuzzerUtils.init(fArrFld, 0.609f);
        FuzzerUtils.init(iArrFld, -21773);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }

    public static void vMeth1(int i) {
        int i2;
        int i3 = -38892;
        int i4 = 5;
        int i5 = -214;
        int[] iArr = new int[N];
        double d = -2.126621d;
        FuzzerUtils.init(iArr, -38168);
        int i6 = i - ((int) (-22.53f));
        int i7 = 1;
        do {
            instanceCount = ((float) instanceCount) + (((i7 * i7) - 22.53f) - i7);
            i2 = 1;
            while (i2 < 8) {
                i6 += i2 * i2;
                i4 = i2;
                while (i4 < 2) {
                    iArr = iArr;
                    i6 += i4 ^ i2;
                    i3 |= i4;
                    i5 = (i5 << 61) - i4;
                    d += i5;
                    i4++;
                }
                if (0 == 0 && 0 == 0) {
                    iArr[i7 - 1] = (int) (-22.53f);
                }
                i2++;
            }
            i7++;
        } while (i7 < 214);
        vMeth1_check_sum += i6 + Float.floatToIntBits(-22.53f) + i7 + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d) + (0 != 0 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i) {
        float f = -59.547f;
        float f2 = 0.231f;
        int i2 = 11;
        int i3 = 13;
        int i4 = 5;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 4752);
        float f3 = 391.0f;
        while (true) {
            float f4 = f3;
            if (f4 > 19.0f) {
                i3 = 9;
                while (true) {
                    i3--;
                    if (i3 <= 0) {
                        break;
                    }
                    vMeth1(-4);
                    i2 *= 61490;
                    int i5 = i + i2;
                    i = (int) f4;
                }
                i += (int) instanceCount;
                i2 = i3;
                i4 = 1;
                do {
                    f += (float) (((i4 * instanceCount) + instanceCount) - i4);
                    float f5 = 1.0f;
                    while (true) {
                        f2 = f5;
                        if (f2 >= 1.0f) {
                            break;
                        }
                        iArr[5] = iArr[5] + i4;
                        i2 <<= 14;
                        sFld = (short) (sFld + ((short) dFld));
                        fArrFld[(int) f2] = 195;
                        f5 = f2 + 1.0f;
                    }
                    i4++;
                } while (i4 < 9);
                f3 = f4 - 2.0f;
            } else {
                long floatToIntBits = i + Float.floatToIntBits(f4) + i2 + i3 + i4 + Float.floatToIntBits(f) + Float.floatToIntBits(f2) + 195 + FuzzerUtils.checkSum(iArr);
                iMeth_check_sum += floatToIntBits;
                return (int) floatToIntBits;
            }
        }
    }

    public static void vMeth() {
        int i = 4;
        int i2 = -172;
        int i3 = -27565;
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, 0.94074d);
        iMeth(4);
        float f = 157.0f;
        dArr[42] = dArr[42] * 11.0d;
        int i4 = 155;
        while (i4 > 9) {
            if (1 != 0) {
                instanceCount -= i4;
                vMeth_check_sum += i + Float.floatToIntBits(f) + i4 + 3 + 98 + i2 + i3 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
            i = 3;
            sFld = (short) (sFld + ((short) i4));
            i2 = 1;
            while (i2 < 11) {
                i3 -= i3;
                i *= (int) instanceCount;
                if (1 != 0) {
                    i += i4;
                    f *= i4;
                } else {
                    i3 -= (int) f;
                }
                i2++;
            }
            i4--;
        }
        vMeth_check_sum += ((((i + Float.floatToIntBits(f)) + i4) + 3) - 56) + i2 + i3 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr) {
        int i = 7257;
        int i2 = -36040;
        int i3 = -14;
        int i4 = 191;
        float f = -1.726f;
        short[] sArr = new short[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(sArr, (short) 20895);
        FuzzerUtils.init(jArr, -2519876697L);
        vMeth();
        int i5 = (-35) - (-35);
        int i6 = 18;
        while (i6 < 303) {
            instanceCount += i6;
            switch (39) {
                case 38:
                    sFld = (short) (sFld - ((short) i6));
                    break;
                case 39:
                    i5 = (int) f;
                    sArr[i6 + 1] = (short) instanceCount;
                default:
                    i *= (int) f;
                    break;
            }
            if (1 != 0) {
                i = (int) (i + (((i6 * instanceCount) + i6) - i));
                i2 = 1;
                while (true) {
                    i2++;
                    if (i2 < 88) {
                        i3 = 1;
                        while (true) {
                            i3++;
                            if (i3 < 1) {
                                jArr[i2] = jArr[i2] * (i >> i3);
                                i = (((int) instanceCount) << (-59903)) + i3 + i6;
                                f -= i2;
                                int[] iArr = iArrFld[i2 - 1];
                                int i7 = i6;
                                iArr[i7] = iArr[i7] * i6;
                            }
                        }
                        int i8 = i6;
                        jArr[i8] = jArr[i8] + ((long) dFld);
                    } else {
                        dFld *= i2;
                        byte[] bArr = this.byArrFld;
                        int i9 = i6 + 1;
                        bArr[i9] = (byte) (bArr[i9] + ((byte) instanceCount));
                    }
                }
            }
            i6++;
        }
        instanceCount *= i5;
        if (1 != 0) {
            instanceCount = i5;
            i4 = 9;
            while (i4 < 276) {
                int i10 = i4;
                jArr[i10] = jArr[i10] - f;
                i = -1;
                i5 <<= (int) instanceCount;
                i4++;
            }
        }
        FuzzerUtils.out.println("i16 i17 i18 = " + i5 + "," + i6 + "," + i);
        FuzzerUtils.out.println("f5 i19 i20 = " + Float.floatToIntBits(f) + "," + i2 + "," + i3);
        FuzzerUtils.out.println("b2 i21 i22 = " + (1 != 0) + "," + i4 + "," + (-7));
        PrintStream printStream = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(sArr);
        FuzzerUtils.checkSum(jArr);
        printStream.println("sArr lArr = " + checkSum + "," + printStream);
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        short s = sFld;
        Double.doubleToLongBits(dFld);
        printStream2.println("Test.instanceCount Test.sFld Test.dFld = " + j + "," + printStream2 + "," + s);
        PrintStream printStream3 = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld));
        long checkSum2 = FuzzerUtils.checkSum(iArrFld);
        FuzzerUtils.checkSum(this.byArrFld);
        printStream3.println("Test.fArrFld Test.iArrFld byArrFld = " + doubleToLongBits + "," + printStream3 + "," + checkSum2);
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
