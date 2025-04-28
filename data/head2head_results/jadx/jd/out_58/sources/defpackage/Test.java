

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_58/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_58/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public float fFld = 1.17f;
    public static long lMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long instanceCount = -27869840979981097L;
    public static byte byFld = -46;
    public static final int N = 400;
    public static long[][] lArrFld = new long[N][N];
    public static byte[] byArrFld = new byte[N];
    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(lArrFld, -190L);
        FuzzerUtils.init(byArrFld, (byte) -80);
        FuzzerUtils.init(iArrFld, -2);
        lMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }

    public static void vMeth1(int i, int i2, int i3) {
        int i4 = 238;
        int i5 = -4851;
        int i6 = -185;
        int i7 = -3;
        int i8 = 64720;
        int i9 = -1;
        double d = -125.8967d;
        boolean z = true;
        long[][][] jArr = new long[N][N][N];
        FuzzerUtils.init((Object[][]) jArr, (Object) (-326364552744312529L));
        int i10 = 8;
        while (212 > i10) {
            jArr = jArr;
            i3 = i3;
            d = -86;
            i5 = 1;
            while (i5 < 8) {
                i6 = 4;
                while (i6 > 1) {
                    jArr[i5 - 1][i6] = jArr[i5 - 1][i5 - 1];
                    i7 += i6 | (-86);
                    i6--;
                }
                i += i5;
                i8 = i10;
                while (i8 < 4) {
                    i4 ^= (int) instanceCount;
                    i8++;
                }
                i4 = 6;
                i9 = i10;
                while (i9 < 4) {
                    float f = 95.573f * ((float) instanceCount);
                    z = false;
                    i9++;
                }
                i5 += 3;
            }
            i10++;
        }
        vMeth1_check_sum += ((((((((((((((i + i2) + i3) + i10) + i4) + Double.doubleToLongBits(d)) - 86) + i5) - 248) + i6) + i7) + i8) + 21866) + i9) - 77) + (z ? 1 : 0) + FuzzerUtils.checkSum((Object[][]) jArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void vMeth() {
        int i = -58966;
        int i2 = -52521;
        int i3 = 235;
        int[] iArr = new int[N];
        float f = -56.33f;
        float f2 = 33.953f;
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, 48.227f);
        FuzzerUtils.init(iArr, 152);
        vMeth1(4, -46955, -58348);
        int i4 = 4 - 4;
        double d = 1.0d;
        while (true) {
            double d2 = d;
            if (d2 < 126.0d) {
                i2 = 1;
                do {
                    float f3 = 1.0f;
                    while (true) {
                        f = f3;
                        if (1.0f > f) {
                            fArr[i2 + 1] = (float) instanceCount;
                            instanceCount *= -8;
                            i3 = i4;
                            iArr = FuzzerUtils.int1array(N, -2);
                            i4 >>= 358039554;
                            i += (int) f;
                            switch ((int) (((d2 % 4.0d) * 5.0d) + 31.0d)) {
                                case 37:
                                    i <<= i4;
                                    break;
                                case 43:
                                    if (0 != 0) {
                                        break;
                                    }
                                    int i5 = (int) d2;
                                    iArr[i5] = iArr[i5] * ((int) f);
                                    break;
                                case 46:
                                    f2 += ((f * ((float) instanceCount)) + byFld) - byFld;
                                    break;
                                case 48:
                                    instanceCount = 56536L;
                                    f2 += ((f * ((float) instanceCount)) + byFld) - byFld;
                                    break;
                                default:
                                    int i52 = (int) d2;
                                    iArr[i52] = iArr[i52] * ((int) f);
                                    break;
                            }
                            f3 = f + 1.0f;
                        } else {
                            i2++;
                        }
                    }
                } while (i2 < 13);
                d = d2 + 1.0d;
            } else {
                vMeth_check_sum += i4 + Double.doubleToLongBits(d2) + i + i2 + Float.floatToIntBits(f) + i3 + Float.floatToIntBits(f2) + (0 != 0 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
    }

    public static long lMeth(double d) {
        int[] iArr = new int[N];
        float f = 122.29f;
        FuzzerUtils.init(iArr, 220);
        vMeth();
        instanceCount ^= -1;
        int i = (-1) & ((int) instanceCount);
        int i2 = i * i;
        int i3 = i2 | i2;
        int i4 = 7;
        while (i4 < 171) {
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] - i3;
            i3 += 123;
            f -= i3;
            switch (((i3 >>> 1) % 1) + 26) {
                case 26:
                    instanceCount *= instanceCount;
                    lArrFld[i4 - 1][i4 - 1] = f;
                    byArrFld[i4 - 1] = (byte) 0.67f;
                    i3 /= 9341;
                    break;
            }
            i4++;
        }
        long doubleToLongBits = Double.doubleToLongBits(d) + i3 + i4 + 53199 + Float.floatToIntBits(f) + Float.floatToIntBits(0.67f) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += doubleToLongBits;
        return doubleToLongBits;
    }

    public void mainTest(String[] strArr) {
        int i = 111;
        int i2 = 205;
        int i3 = -9;
        int i4 = -32;
        int i5 = 1;
        int i6 = 0;
        double d = 2.54214d;
        short s = 8638;
        int i7 = 6;
        while (i7 < 146) {
            i2 = 2;
            while (i2 < 179) {
                int lMeth = i * ((int) lMeth(-2.256d));
                i4 = i7;
                while (i4 < 2) {
                    int i8 = lMeth + (i4 * i7);
                    instanceCount += i4 * i3;
                    int i9 = i8 + (i4 - i8);
                    try {
                        i3 = i2 % i2;
                        int i10 = 28096 % iArrFld[i4];
                        i5 = i2 % (-833932605);
                    } catch (ArithmeticException e) {
                    }
                    instanceCount *= i5;
                    lMeth = -12;
                    instanceCount += i4;
                    if (0 == 0) {
                        i3 >>= (int) instanceCount;
                    }
                    i4++;
                }
                instanceCount += i2 * i5;
                i = (int) instanceCount;
                i5 += i;
                i6 = 1;
                while (true) {
                    i6++;
                    if (i6 < 2) {
                        try {
                            i3 = iArrFld[i6] % i3;
                            iArrFld[i7] = (-223) % i;
                            iArrFld[i7] = i5 / 53307;
                        } catch (ArithmeticException e2) {
                        }
                    } else {
                        double d2 = 1.0d;
                        while (true) {
                            d = d2;
                            if (d < 2.0d) {
                                int[] iArr = iArrFld;
                                int i11 = i7 + 1;
                                iArr[i11] = iArr[i11] * 8;
                                instanceCount += (long) (d * d);
                                instanceCount >>>= i;
                                switch (((i7 % 5) * 5) + 56) {
                                    case 57:
                                        s = (short) (s - ((short) i3));
                                        break;
                                    case 60:
                                        this.fFld = -82.0f;
                                    case 59:
                                        this.fFld = (float) instanceCount;
                                        break;
                                    case 61:
                                        s = (short) (s + ((short) (d * d)));
                                        int[] iArr2 = iArrFld;
                                        int i12 = i7;
                                        iArr2[i12] = iArr2[i12] - 79;
                                        break;
                                    case 73:
                                        if (0 == 0) {
                                            byte[] bArr = byArrFld;
                                            int i13 = (int) (d + 1.0d);
                                            bArr[i13] = (byte) (bArr[i13] >> ((byte) i5));
                                            instanceCount &= i;
                                            byFld = (byte) 8;
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                                d2 = d + 1.0d;
                            }
                        }
                        i2++;
                    }
                }
            }
            i7++;
        }
        FuzzerUtils.out.println("i i1 i2 = " + i7 + "," + i + "," + i2);
        FuzzerUtils.out.println("i3 i24 i25 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("b2 i26 d3 = " + (0 != 0) + "," + i6 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i27 s = " + 8 + "," + s);
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        byte b = byFld;
        Float.floatToIntBits(this.fFld);
        printStream.println("Test.instanceCount Test.byFld fFld = " + j + "," + printStream + "," + b);
        PrintStream printStream2 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(lArrFld);
        long checkSum2 = FuzzerUtils.checkSum(byArrFld);
        FuzzerUtils.checkSum(iArrFld);
        printStream2.println("Test.lArrFld Test.byArrFld Test.iArrFld = " + checkSum + "," + printStream2 + "," + checkSum2);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
