

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_40/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_40/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public float fFld = 117.493f;
    public volatile long lFld = 2416172527L;
    public static long vMeth_check_sum;
    public static long lMeth_check_sum;
    public static long iMeth_check_sum;
    public static long instanceCount = 4806054886177115960L;
    public static int iFld = -9418;
    public static final int N = 400;
    public static volatile int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, -1);
        vMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static int iMeth(int i) {
        int i2 = -20696;
        int i3 = 62058;
        int i4 = 8;
        int i5 = 70;
        int i6 = 1;
        int i7 = 41169;
        float f = 0.39f;
        int i8 = 5;
        while (i8 < 278) {
            i3 = i8;
            while (i3 < 6) {
                f = i;
                i2 -= i8;
                iArrFld[i3 - 1] = (int) instanceCount;
                i4 = 1;
                while (i4 > 1) {
                    i4--;
                }
                instanceCount ^= instanceCount;
                i6 = 1;
                while (i6 < 1) {
                    i5 = -7;
                    i6++;
                }
                i |= i2;
                i3++;
            }
            i7 = i8;
            while (i7 < 6) {
                iFld = 5177;
                f -= (float) (-2.96498d);
                i7++;
            }
            f += f;
            i8++;
        }
        long floatToIntBits = (((((((((((i + i8) + i2) + i3) - 225) + Float.floatToIntBits(f)) + i4) + i5) + i6) - 166) + i7) - 76) + Double.doubleToLongBits(-2.96498d);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static long lMeth(byte b) {
        int i = -22983;
        int i2 = -8;
        int[][] iArr = new int[N][N];
        boolean z = true;
        long[] jArr = new long[N];
        FuzzerUtils.init(iArr, 2);
        FuzzerUtils.init(jArr, 4L);
        float f = 176.0f;
        while (true) {
            float f2 = f - 2.0f;
            f = f2;
            if (f2 <= 0.0f) {
                break;
            }
            int i3 = iFld;
            iFld = i3 + 1;
            long j = i3;
            long j2 = instanceCount - 1;
            instanceCount = j;
            instanceCount = j + (j2 | instanceCount);
            int i4 = iFld;
            int i5 = iFld;
            iFld = i5 - 1;
            iFld = i4 * i5;
            i = 1;
            while (true) {
                i++;
                if (i < 18) {
                    z = true;
                    iFld = (int) (iFld + (((i * f) + ((float) instanceCount)) - iFld));
                    try {
                        iArr[(int) f][i + 1] = i / iFld;
                        iFld = iArr[i + 1][(int) (f + 1.0f)] % iFld;
                        iFld = i / i;
                    } catch (ArithmeticException e) {
                    }
                    i2 = 1;
                    do {
                        if (1 != 0) {
                            iFld = (int) 57.51107d;
                        } else if (1 != 0) {
                            instanceCount += 0.38f + (i2 * i2);
                        } else {
                            iArr[i2][(int) f] = b;
                        }
                        i2++;
                    } while (i2 < 1);
                }
            }
        }
        long floatToIntBits = b + Float.floatToIntBits(f) + i + (z ? 1 : 0) + i2 + Double.doubleToLongBits(57.51107d) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr);
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public void vMeth(int i, short s, int i2) {
        int i3 = 14;
        int i4 = 33240;
        int i5 = 120;
        lMeth((byte) 91);
        iFld <<= i2;
        int i6 = iFld;
        instanceCount -= iFld;
        int i7 = 1;
        while (true) {
            i7 += 2;
            if (i7 >= 176) {
                break;
            }
            i3 = 1;
            while (true) {
                i3++;
                if (i3 < 18) {
                    i4 = 1;
                    while (i4 < 1) {
                        instanceCount *= (long) (-2.60086d);
                        this.fFld += i2;
                        i4++;
                    }
                    i5 = 1;
                    while (i5 < 1) {
                        int i8 = i2 * 244;
                        instanceCount %= 61 | 1;
                        instanceCount = this.lFld;
                        i2 = (int) instanceCount;
                        i5 += 2;
                    }
                }
            }
        }
        vMeth_check_sum += i6 + s + i2 + 91 + (1 != 0 ? 1 : 0) + i7 + i3 + i4 + 81 + Double.doubleToLongBits(-2.60086d) + i5 + 61;
    }

    public void mainTest(String[] strArr) {
        int i = -2319;
        int i2 = -39455;
        int i3 = 12;
        int i4 = -17;
        int i5 = -9;
        int i6 = 51629;
        int i7 = 0;
        int i8 = -145;
        short s = -15372;
        double[][] dArr = new double[N][N];
        FuzzerUtils.init(dArr, 1.114414d);
        int i9 = ((-2319) >>> 1) % N;
        int i10 = ((-2319) >>> 1) % N;
        double[] dArr2 = dArr[((-2319) >>> 1) % N];
        dArr[6] = dArr2;
        dArr[2] = dArr2;
        dArr[i10] = dArr2;
        dArr[i9] = dArr2;
        int i11 = 281;
        while (true) {
            i11--;
            if (i11 > 0) {
                vMeth(i, s, 30100);
                switch ((i11 % 3) + 16) {
                    case 16:
                    case 17:
                        instanceCount = -12509L;
                        i2 = 3;
                        while (i2 < 89) {
                            iFld = (int) instanceCount;
                            instanceCount = i2;
                            i += iFld;
                            i2++;
                        }
                    case 18:
                        i3 = 5;
                        while (i3 < 89) {
                            int i12 = i4 - 84;
                            i5 = 1;
                            do {
                                iArrFld[i11 + 1] = i11;
                                i12 <<= (int) instanceCount;
                                iFld = (int) (iFld + (((i5 * i3) + i12) - this.lFld));
                                i5++;
                            } while (i5 < 2);
                            i4 = i12 ^ 1726015176;
                            this.lFld = i3;
                            i3++;
                        }
                        iArrFld = FuzzerUtils.int1array(N, 240);
                        break;
                }
                i4 -= i11;
                i6 = 4;
                while (i6 < 89) {
                    i8 = 1;
                    while (i8 < 2 && 1 == 0) {
                        i7 += i3;
                        int[] iArr = iArrFld;
                        int i13 = i6 - 1;
                        iArr[i13] = iArr[i13] * ((int) this.lFld);
                        instanceCount = this.lFld;
                        this.fFld = i6;
                        i8++;
                    }
                    i6++;
                }
                s = (short) (s * ((short) i8));
            } else {
                FuzzerUtils.out.println("i i1 s1 = " + i + "," + i11 + "," + s);
                FuzzerUtils.out.println("i24 i25 i26 = " + i2 + "," + (-84) + "," + i3);
                FuzzerUtils.out.println("i27 i28 i29 = " + i4 + "," + i5 + "," + i6);
                FuzzerUtils.out.println("i30 i31 i32 = " + i7 + "," + i8 + "," + 0);
                FuzzerUtils.out.println("b2 dArr = " + (1 != 0) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
                PrintStream printStream = FuzzerUtils.out;
                long j = instanceCount;
                int i14 = iFld;
                Float.floatToIntBits(this.fFld);
                printStream.println("Test.instanceCount Test.iFld fFld = " + j + "," + printStream + "," + i14);
                PrintStream printStream2 = FuzzerUtils.out;
                long j2 = this.lFld;
                FuzzerUtils.checkSum(iArrFld);
                printStream2.println("lFld Test.iArrFld = " + j2 + "," + printStream2);
                FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
                FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
                FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
                return;
            }
        }
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
