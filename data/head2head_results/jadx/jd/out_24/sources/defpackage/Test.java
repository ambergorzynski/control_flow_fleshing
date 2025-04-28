

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_24/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_24/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;
    public static long instanceCount = 41484;
    public static float fFld = 2.791f;
    public static boolean bFld = true;
    public static byte byFld = 59;
    public static final int N = 400;
    public static int[][] iArrFld = new int[N][N];

    static {
        FuzzerUtils.init(iArrFld, 49883);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }

    public static void vMeth2(long j) {
        int i = -62180;
        int i2 = 50772;
        int i3 = -239;
        int i4 = 8;
        int[] iArr = new int[N];
        byte b = 39;
        FuzzerUtils.init(iArr, 6);
        iArr[((-62180) >>> 1) % N] = iArr[r1] - 62180;
        double d = (-1.48477d) - 62180;
        instanceCount -= 62180;
        iArr[((-62180) >>> 1) % N] = (int) j;
        int i5 = 5;
        while (i5 < 136) {
            instanceCount *= fFld;
            i3 = 1;
            while (true) {
                i3++;
                if (i3 >= 12) {
                    break;
                }
                fFld -= i3;
                b = (byte) (b & ((byte) i));
                instanceCount += i3 ^ i3;
            }
            i4 = i5;
            while (12 > i4) {
                if (bFld) {
                    instanceCount += i4 * i4;
                    i = -39;
                    instanceCount <<= i3;
                } else if (bFld) {
                    i2 /= i3 | 1;
                } else {
                    i2 = (int) fFld;
                }
                i4++;
            }
            i5++;
        }
        vMeth2_check_sum += j + i + Double.doubleToLongBits(d) + i5 + i2 + i3 + b + i4 + 48842 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(boolean z, byte b) {
        int i;
        double[] dArr = new double[N];
        int i2 = -168;
        int i3 = -42;
        int[] iArr = new int[N];
        boolean[] zArr = new boolean[N];
        FuzzerUtils.init(dArr, 2.113453d);
        FuzzerUtils.init(zArr, true);
        FuzzerUtils.init(iArr, 107);
        double d = dArr[((-191) >>> 1) % N] - (-191);
        float f = (-2.913f) - 1.0f;
        float f2 = (-2.913f) % ((float) ((-2.913f) | 1));
        int i4 = (-191) % ((int) (((((-191) * (-1)) - 3532952010L) - ((-191) - 1)) | 1));
        int i5 = 1;
        do {
            instanceCount = i4 - i4;
            vMeth2(instanceCount);
            i4 = (i4 + 1) - ((int) instanceCount);
            i = 1;
            while (true) {
                i++;
                if (i >= 4) {
                    break;
                }
                instanceCount += ((i * i4) + instanceCount) - i5;
                instanceCount = 14L;
                i2 = 1;
                while (i2 < 1) {
                    zArr[i5] = bFld;
                    i3 = -19;
                    iArr[i] = iArr[i] & 63507;
                    i4 += i2 + i5;
                    i2++;
                }
            }
            i5++;
        } while (i5 < 397);
        vMeth1_check_sum += (z ? (byte) 1 : (byte) 0) + b + Double.doubleToLongBits(d) + i4 + Float.floatToIntBits(f2) + i5 + i + i2 + i3 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(zArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(float f, float f2) {
        int i = 1;
        int i2 = -5;
        int i3 = -63821;
        int i4 = 0;
        int i5 = 11;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -1507);
        int i6 = 2;
        while (i6 < 141) {
            i += i6;
            long j = i;
            instanceCount++;
            long j2 = j - (j - (24857 - 3));
            int i7 = i6;
            int i8 = iArr[i7] + 1;
            iArr[i7] = i8;
            if (j2 < i8) {
            }
            i6++;
        }
        vMeth1(bFld, byFld);
        for (int i9 : iArr) {
            i2 = 1;
            while (true) {
                i2++;
                if (i2 < 4) {
                    fFld += i2 + i9;
                    i3 = i2;
                    while (i3 < 1) {
                        i -= i6;
                        f2 += i3;
                        int i10 = i2 - 1;
                        iArr[i10] = iArr[i10] >> i;
                        i3++;
                    }
                    i4 = 1;
                    while (i4 < 1) {
                        i5 <<= (int) instanceCount;
                        i4++;
                    }
                    instanceCount += f;
                    instanceCount *= instanceCount;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f2) + i6 + i + 24857 + i2 + i3 + 52330 + i4 + i5 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        double d;
        int i = -10;
        int i2 = 6;
        int i3 = -8;
        int i4 = -18819;
        int i5 = -14;
        int i6 = -5;
        int i7 = 11;
        double d2 = 0.100147d;
        double d3 = 2.53817d;
        float[] fArr = new float[N];
        long[][] jArr = new long[N][N];
        FuzzerUtils.init(fArr, -88.79f);
        FuzzerUtils.init(jArr, 1L);
        try {
            vMeth(fFld, 29.483f);
            i = (-10) * ((int) instanceCount);
            d2 = 1.0d;
            do {
                int i8 = i * i;
                fFld += (float) (((long) d2) ^ i8);
                instanceCount += (long) (((d2 * i8) + i8) - i8);
                iArrFld[(int) (d2 + 1.0d)][(int) (d2 + 1.0d)] = -640311262;
                i = (i8 | 24997) + ((int) d2);
                instanceCount = i;
                d = d2 + 1.0d;
                d2 = d;
            } while (d < 300.0d);
            i2 = 9;
            while (i2 < 210) {
                i3 = 6;
                while (i3 < 125) {
                    d3 = 1.0d;
                    while (d3 < 2.0d) {
                        bFld = bFld;
                        int i9 = i3 + 1;
                        fArr[i9] = fArr[i9] * i5;
                        d3 += 1.0d;
                    }
                    if (bFld) {
                        fFld += (float) instanceCount;
                    } else {
                        fFld += 5 + (i3 * i3);
                    }
                    i6 = 2;
                    while (1 < i6) {
                        i *= i;
                        fFld *= i3;
                        i7 = -19762;
                        i5 += i6 ^ (-18819);
                        jArr = jArr;
                        iArrFld[i3][i2] = 1;
                        i6--;
                    }
                    instanceCount += i7;
                    instanceCount += i3 * i5;
                    fFld *= 8.0f;
                    instanceCount = i5;
                    i3++;
                }
                i2++;
            }
        } catch (ArithmeticException e) {
            i4 = (-18819) >> ((int) instanceCount);
        } catch (NullPointerException e2) {
            bFld = bFld;
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i19 d2 i20 = " + i + "," + Double.doubleToLongBits(d2) + "," + printStream);
        FuzzerUtils.out.println("i21 i22 i23 = " + 1 + "," + i3 + "," + i4);
        PrintStream printStream2 = FuzzerUtils.out;
        printStream2.println("d3 i24 i25 = " + Double.doubleToLongBits(d3) + "," + printStream2 + "," + i5);
        PrintStream printStream3 = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        FuzzerUtils.checkSum(jArr);
        printStream3.println("i26 fArr lArr = " + i7 + "," + doubleToLongBits + "," + printStream3);
        PrintStream printStream4 = FuzzerUtils.out;
        long j = instanceCount;
        int floatToIntBits = Float.floatToIntBits(fFld);
        if (bFld) {
        }
        printStream4.println("Test.instanceCount Test.fFld Test.bFld = " + j + "," + printStream4 + "," + floatToIntBits);
        FuzzerUtils.out.println("Test.byFld Test.iArrFld = " + byFld + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
