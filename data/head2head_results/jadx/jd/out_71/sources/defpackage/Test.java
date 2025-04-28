

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_71/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_71/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public short sFld = 16992;
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long vMeth_check_sum;
    public static long instanceCount = 2506500517712289440L;
    public static int iFld = 61434;
    public static final int N = 400;
    public static int[][] iArrFld = new int[N][N];

    static {
        FuzzerUtils.init(iArrFld, -70);
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
        vMeth_check_sum = 0L;
    }

    public static void vMeth(int i, int i2, float f) {
        int i3 = 0;
        int i4 = 7;
        int i5 = 45785;
        int i6 = 65108;
        int i7 = 40513;
        int[] iArr = new int[N];
        boolean z = true;
        short s = -7477;
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr, -53763);
        FuzzerUtils.init(fArr, 117.343f);
        int i8 = 2;
        while (i8 < 153) {
            i4 = 1;
            while (i4 < 10) {
                if (!z) {
                    i3 += i4;
                    s = (short) (s + s);
                    instanceCount *= 1;
                    i6 = 1;
                    while (i6 < 2) {
                        i3 = (int) instanceCount;
                        i6++;
                    }
                }
                i4++;
            }
            fArr[i8] = (float) (-125.88441d);
            i = (int) (i + (i8 | f));
            int i9 = i8;
            iArr[i9] = iArr[i9] * (-39407);
            i7 = 10;
            while (i7 > 1) {
                f -= (float) instanceCount;
                i5 *= i2;
                i7 -= 3;
            }
            z = z;
            i8++;
        }
        vMeth_check_sum += ((((((((((((((i + i2) + Float.floatToIntBits(f)) + i8) + i3) + i4) + i5) + (z ? 1 : 0)) + s) + i6) - 5) + Double.doubleToLongBits(-125.88441d)) - 39407) + i7) - 96) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth1(int i, double d, int i2) {
        int i3;
        float f = 80.735f;
        int i4 = -52784;
        short s = -134;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 4L);
        vMeth(i, i, -2.221f);
        int i5 = -5;
        float f2 = (-2.221f) + ((float) instanceCount);
        int i6 = (i >>> 1) % N;
        jArr[i6] = jArr[i6] - instanceCount;
        int i7 = 4;
        while (i7 < 188) {
            i4 = i;
            i7++;
        }
        int i8 = i4 | ((int) instanceCount);
        int i9 = 219;
        do {
            instanceCount = -48880L;
            i3 = 1;
            while (i3 < 7) {
                float f3 = 1.0f;
                while (true) {
                    f = f3;
                    if (2.0f > f) {
                        switch (((i3 % 2) * 5) + 120) {
                            case 129:
                                s = (short) (s | s);
                                break;
                            case 130:
                                if (i5 != 0) {
                                }
                                i5 += (int) f;
                                break;
                        }
                        f3 = f + 1.0f;
                    }
                }
                i3++;
            }
            i9--;
        } while (i9 > 0);
        long doubleToLongBits = i + Double.doubleToLongBits(d) + i5 + Float.floatToIntBits(f2) + i7 + i8 + i9 + i3 + 21840 + Float.floatToIntBits(f) + 105 + s + FuzzerUtils.checkSum(jArr);
        iMeth1_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public int iMeth(int i, long j, int i2) {
        short[][][] sArr = new short[N][N][N];
        FuzzerUtils.init((Object[][]) sArr, (Object) (short) -11315);
        instanceCount -= sArr[6][(i2 >>> 1) % N][(i2 >>> 1) % N];
        int i3 = 180;
        while (i3 > 2) {
            if (i != 0) {
            }
            i3--;
        }
        float iMeth1 = iMeth1(i2, 79.66008d, i3) - (-7.667f);
        instanceCount += i;
        long floatToIntBits = i + j + i2 + i3 + 15504 + Float.floatToIntBits(iMeth1) + Double.doubleToLongBits(79.66008d) + FuzzerUtils.checkSum((Object[][]) sArr);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public void mainTest(String[] strArr) {
        boolean z = -1;
        int i = 39431;
        int i2 = -9;
        int i3 = 36153;
        int i4 = -16036;
        int i5 = 44776;
        int i6 = -30564;
        double[] dArr = new double[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 8006460232895040125L);
        FuzzerUtils.init(dArr, 0.3355d);
        int iMeth = iMeth(49, 145L, 49);
        int i7 = iMeth + iMeth;
        float f = 252.0f * ((float) instanceCount);
        int[] iArr = iArrFld[(i7 >>> 1) % N];
        int i8 = (i7 >>> 1) % N;
        iArr[i8] = iArr[i8] ^ ((int) instanceCount);
        int i9 = i7 ^ iFld;
        int i10 = 1;
        while (206 > i10) {
            f += ((i10 * (-1)) + this.sFld) - i10;
            if (1 != 0) {
                i = 6;
                while (i < 122) {
                    i2 = (int) (i2 + (((i * instanceCount) + i2) - i2));
                    iFld = (int) 66.4266d;
                    f *= f;
                    iFld = -1;
                    i++;
                }
                instanceCount += i10 * i10;
                instanceCount = 7L;
                switch ((((i >>> 1) % 6) * 5) + 4) {
                    case 7:
                        z = -13393;
                        continue;
                    case 18:
                        i3 = 1;
                        while (i3 < 122) {
                            i5 = 1;
                            while (i5 < 2) {
                                instanceCount += instanceCount;
                                instanceCount = ((float) instanceCount) + (((float) ((i5 * i5) + instanceCount)) - f);
                                i5++;
                            }
                            float f2 = f - 63133.0f;
                            float f3 = i10;
                            jArr[i10] = instanceCount;
                            i6 += i3;
                            i4 += i;
                            int i11 = i3;
                            dArr[i11] = dArr[i11] / (instanceCount | 1);
                            int[] iArr2 = iArrFld[i10];
                            int i12 = i10;
                            iArr2[i12] = iArr2[i12] & i10;
                            f = 8.3571E8f;
                            i3++;
                        }
                        break;
                    case 22:
                        i4 += i6;
                        continue;
                    case 25:
                        iArrFld[i10 - 1] = FuzzerUtils.int1array(N, -5);
                        continue;
                    case 30:
                        break;
                    case 33:
                        i9 = 23;
                        continue;
                }
                f -= i5;
            } else if (1 != 0) {
                try {
                    i2 = i6 / i3;
                    int i13 = i2 % (-196);
                    i4 = (-2044066754) / i;
                } catch (ArithmeticException e) {
                }
            }
            i10++;
        }
        FuzzerUtils.out.println("i f4 b1 = " + i9 + "," + Float.floatToIntBits(f) + "," + (1 != 0));
        FuzzerUtils.out.println("i25 i26 by = " + i10 + "," + z + "," + (-1));
        FuzzerUtils.out.println("i27 i28 d3 = " + i + "," + i2 + "," + Double.doubleToLongBits(66.4266d));
        FuzzerUtils.out.println("i29 i30 i31 = " + i3 + "," + i4 + "," + i5);
        PrintStream printStream = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(jArr);
        Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        printStream.println("i32 lArr1 dArr = " + i6 + "," + checkSum + "," + printStream);
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        int i14 = iFld;
        short s = this.sFld;
        printStream2.println("Test.instanceCount Test.iFld sFld = " + j + "," + printStream2 + "," + i14);
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
