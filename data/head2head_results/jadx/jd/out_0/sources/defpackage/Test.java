

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_0/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_0/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public int iFld1 = 4;
    public int[][][] iArrFld = new int[N][N][N];
    public volatile double[] dArrFld = new double[N];
    public static long fMeth_check_sum;
    public static long vMeth_check_sum;
    public static long lMeth_check_sum;
    public static long instanceCount = -2864363349718374362L;
    public static byte byFld = -46;
    public static float fFld = 0.427f;
    public static int iFld = -13;
    public static volatile double dFld = -93.14442d;
    public static short sFld = -16082;
    public static final int N = 400;
    public static int[] iArrFld1 = new int[N];

    static {
        FuzzerUtils.init(iArrFld1, -5);
        fMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
    }

    public static long lMeth(int i, long j, int i2) {
        long[] jArr = new long[N];
        boolean z = false;
        short s = -25069;
        int i3 = 209;
        int i4 = 14;
        int i5 = 165;
        FuzzerUtils.init(jArr, -934915742991891276L);
        long j2 = 1;
        while (true) {
            long j3 = j2 + 1;
            j2 = j3;
            if (j3 >= 237) {
                break;
            }
            z = z;
            j += ((j2 * i) + i) - i;
            s = (short) (s + ((short) instanceCount));
            i3 = 1;
            while (true) {
                i3++;
                if (i3 < 7) {
                    jArr[i3] = jArr[i3] + j;
                    i4 = 1;
                    while (i4 < 1) {
                        i += i4;
                        instanceCount &= i3;
                        i4++;
                    }
                    j = ((j - i4) + (i3 ^ fFld)) << (-5568);
                    int[] iArr = iArrFld1;
                    int i6 = i3 - 1;
                    iArr[i6] = iArr[i6] + 3;
                    i5 *= (int) j;
                }
            }
            fFld += (float) j2;
        }
        long checkSum = i + j + i2 + j2 + (z ? 1 : 0) + s + i3 + i4 + i5 + FuzzerUtils.checkSum(jArr);
        lMeth_check_sum += checkSum;
        return checkSum;
    }

    public static void vMeth() {
        int i = 53688;
        int i2 = -10;
        int i3 = 244;
        int i4 = -12;
        int i5 = 142;
        int i6 = 27184;
        int[] iArr = new int[N];
        double d = 0.14547d;
        short[][][] sArr = new short[N][N][N];
        FuzzerUtils.init(iArr, -94);
        FuzzerUtils.init((Object[][]) sArr, (Object) (short) -9076);
        int i7 = (53688 >>> 1) % N;
        int i8 = (53688 >>> 1) % N;
        int i9 = iArr[i8] + 1;
        iArr[i8] = i9;
        iArr[i7] = i9;
        int i10 = 24;
        while (i10 < 397) {
            i3 = 1;
            while (i3 < 5) {
                long j = instanceCount;
                i -= (int) lMeth(-11, instanceCount, i10);
                instanceCount = j + r1 + 2;
                i2 += ((i3 * i3) + i) - i2;
                d = iFld;
                fFld *= -6;
                i3++;
            }
            iFld *= -6;
            i = i10;
            i4 = 1;
            while (i4 < 5) {
                i6 = 1;
                while (true) {
                    i6++;
                    if (i6 < 2) {
                        instanceCount = (long) d;
                        i2 *= byFld;
                        short[] sArr2 = sArr[i4 - 1][i10 + 1];
                        int i11 = i6 + 1;
                        sArr2[i11] = (short) (sArr2[i11] - 75);
                        i5 &= 127;
                    }
                }
                i4++;
            }
            i10++;
        }
        vMeth_check_sum += ((((i + i10) + i2) + i3) - 6) + Double.doubleToLongBits(d) + i4 + i5 + i6 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum((Object[][]) sArr);
    }

    public static float fMeth(int i, int i2, float f) {
        int i3 = 119;
        int i4 = -4;
        int i5 = 126;
        long[] jArr = new long[N];
        byte[] bArr = new byte[N];
        FuzzerUtils.init(jArr, -1831778103L);
        FuzzerUtils.init(bArr, (byte) -11);
        int i6 = 8;
        while (194 > i6) {
            int i7 = i6;
            long j = jArr[i7];
            jArr[i7] = j + 1;
            byFld = (byte) j;
            vMeth();
            fFld += (float) (((i6 * byFld) + i3) - instanceCount);
            bArr[i6] = (byte) i2;
            int i8 = iFld;
            i3 = (int) f;
            i2 = (int) instanceCount;
            switch (((i6 % 3) * 5) + 32) {
                case 41:
                    instanceCount = 63L;
                    continue;
                case 42:
                    break;
                case 47:
                    i4 = 1;
                    while (i4 < 9) {
                        i5 = (i5 - i3) << i6;
                        i2 *= 538092779;
                        iFld += i4;
                        i4++;
                    }
                    break;
            }
            iFld += (int) dFld;
            i6++;
        }
        long floatToIntBits = i + i2 + Float.floatToIntBits(f) + i6 + i3 + i4 + i5 + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(bArr);
        fMeth_check_sum += floatToIntBits;
        return (float) floatToIntBits;
    }

    public void mainTest(String[] strArr) {
        float f = 84.867f;
        float[] fArr = new float[N];
        int i = 26944;
        int i2 = -6184;
        int i3 = -85;
        int i4 = 15129;
        int i5 = 144;
        int i6 = -12324;
        int i7 = 11397;
        boolean[] zArr = new boolean[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -1081556649L);
        FuzzerUtils.init(fArr, 0.258f);
        FuzzerUtils.init(zArr, false);
        if (1 != 0) {
            float f2 = 15.0f;
            while (true) {
                f = f2;
                if (f >= 253.0f) {
                    break;
                }
                i <<= Math.abs((int) (this.iArrFld[(int) f][(int) (f + 1.0f)][(int) (f + 1.0f)] * fMeth(-9, iFld, fFld)));
                int i8 = (int) f;
                jArr[i8] = jArr[i8] - f;
                i2 = 1;
                do {
                    iArrFld1[i2 + 1] = iFld;
                    iFld += i2 | sFld;
                    if (1 != 0) {
                        double[] dArr = this.dArrFld;
                        int i9 = (int) (f + 1.0f);
                        dArr[i9] = dArr[i9] - iFld;
                        int i10 = (int) f;
                        jArr[i10] = jArr[i10] >> i;
                    } else if (1 != 0) {
                        i3 = 1;
                        while (i3 > 1) {
                            if (1 != 0) {
                            }
                            i3--;
                        }
                        int i11 = i2;
                        fArr[i11] = fArr[i11] * ((float) instanceCount);
                        i5 = 1;
                        while (i5 < 1) {
                            instanceCount *= i3;
                            iFld += (int) instanceCount;
                            i5++;
                        }
                        instanceCount += i2 * i3;
                    } else if (1 != 0) {
                        sFld = (short) (sFld + ((short) (i2 + i2)));
                        instanceCount >>= i4;
                        instanceCount -= i6;
                    } else {
                        try {
                            this.iArrFld[i2 - 1][(int) (f - 1.0f)][i2 + 1] = i5 / this.iArrFld[(int) f][(int) f][(int) (f + 1.0f)];
                            this.iArrFld[(int) (f - 1.0f)][i2][i2] = this.iFld1 / this.iArrFld[(int) (f - 1.0f)][(int) f][(int) f];
                            i4 = this.iFld1 / (-42);
                        } catch (ArithmeticException e) {
                        }
                        zArr[(int) (f - 1.0f)] = true;
                        i = i2;
                    }
                    int[] iArr = iArrFld1;
                    int i12 = i2 + 1;
                    iArr[i12] = iArr[i12] - byFld;
                    try {
                        iFld = i5 / iArrFld1[(int) f];
                        iFld %= iFld;
                        i6 = (-157) % i;
                    } catch (ArithmeticException e2) {
                    }
                    i7 = 1;
                    do {
                        int i13 = i2 - 1;
                        jArr[i13] = jArr[i13] - iFld;
                        i7++;
                    } while (i7 < 1);
                    i4 = iArrFld1[(int) f] / 702747640;
                    i = this.iArrFld[i2 - 1][i2][i2 + 1] / 38744;
                    this.iFld1 = i2 / i;
                    fFld += i6;
                    fFld += i2 + byFld;
                    i2++;
                } while (i2 < 106);
                f2 = f + 1.0f;
            }
        } else {
            iFld = 15129;
        }
        FuzzerUtils.out.println("f i i20 = " + Float.floatToIntBits(f) + "," + i + "," + i2);
        FuzzerUtils.out.println("i21 i22 b1 = " + i3 + "," + i4 + "," + (1 != 0));
        FuzzerUtils.out.println("i23 i24 i25 = " + i5 + "," + i6 + "," + i7);
        PrintStream printStream = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(jArr);
        long doubleToLongBits = Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        FuzzerUtils.checkSum(zArr);
        printStream.println("lArr2 fArr bArr = " + checkSum + "," + printStream + "," + doubleToLongBits);
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        byte b = byFld;
        Float.floatToIntBits(fFld);
        printStream2.println("Test.instanceCount Test.byFld Test.fFld = " + j + "," + printStream2 + "," + b);
        PrintStream printStream3 = FuzzerUtils.out;
        int i14 = iFld;
        long doubleToLongBits2 = Double.doubleToLongBits(dFld);
        short s = sFld;
        printStream3.println("Test.iFld Test.dFld Test.sFld = " + i14 + "," + doubleToLongBits2 + "," + printStream3);
        PrintStream printStream4 = FuzzerUtils.out;
        int i15 = this.iFld1;
        long checkSum2 = FuzzerUtils.checkSum((Object[][]) this.iArrFld);
        FuzzerUtils.checkSum(iArrFld1);
        printStream4.println("iFld1 iArrFld Test.iArrFld1 = " + i15 + "," + checkSum2 + "," + printStream4);
        FuzzerUtils.out.println("dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(this.dArrFld)));
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
