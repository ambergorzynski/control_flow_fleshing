

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_42/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_42/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public volatile long[][] lArrFld = new long[N][N];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;
    public static long instanceCount = 9;
    public static volatile byte byFld = -94;
    public static float fFld = -109.974f;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static short[][] sArrFld = new short[N][N];

    static {
        FuzzerUtils.init(iArrFld, 226);
        FuzzerUtils.init(sArrFld, (short) -10630);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }

    public static void vMeth2(long j) {
        int i = 8;
        int i2 = 14;
        int i3 = 44304;
        short s = -3397;
        int i4 = 14;
        while (287 > i4) {
            i = -119;
            i2 = 1;
            do {
                s = (short) (s - 10);
                byFld = (byte) (byFld + ((byte) i4));
                i3 = 1;
                do {
                    int i5 = i + i3;
                    i = (int) 0.101776d;
                    switch ((((i3 >>> 1) % 2) * 5) + 76) {
                        case 77:
                            i <<= (int) instanceCount;
                            break;
                        case 86:
                            i = i2;
                            byFld = (byte) (byFld + ((byte) (((i3 * 2.227f) + ((float) j)) - ((float) j))));
                            byFld = (byte) (byFld - (-28));
                            instanceCount >>= (int) j;
                            break;
                    }
                    i3++;
                } while (i3 < 1);
                i2++;
            } while (i2 < 6);
            i4++;
        }
        vMeth2_check_sum += j + i4 + i + i2 + s + i3 + Double.doubleToLongBits(0.101776d);
    }

    public static void vMeth1() {
        int i = -5;
        int i2 = 39263;
        int i3 = -9;
        int i4 = 5;
        int i5 = -106;
        int[][] iArr = new int[N][N];
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr, -13);
        FuzzerUtils.init(fArr, 75.508f);
        long j = instanceCount;
        int[] iArr2 = iArr[((-5) >>> 1) % N];
        int i6 = ((-5) >>> 1) % N;
        iArr2[i6] = iArr2[i6] + 1;
        instanceCount = j % (r3 | 1);
        vMeth2(instanceCount);
        double d = 0.941d - (-5);
        if (1 != 0) {
            i2 = 228;
            while (i2 > 7) {
                switch (((i3 >>> 1) % 4) * 5) {
                    case 7:
                        i4 = 7;
                        while (i4 > i2) {
                            i5 += i;
                            if (i != 0) {
                                vMeth1_check_sum += i + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + (1 != 0 ? 1 : 0) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                                return;
                            }
                            iArr[i2 - 1][i4 - 1] = i;
                            i3 *= (int) instanceCount;
                            int i7 = i4;
                            fArr[i7] = fArr[i7] - 39335.0f;
                            i4 -= 2;
                        }
                        break;
                    case 8:
                        i3 += (int) instanceCount;
                        break;
                    case 16:
                        i = ((i >> i2) + ((-50957) + (i2 * i2))) << byFld;
                        break;
                    case 17:
                        fFld += i2 * i3;
                        break;
                }
                i2--;
            }
        }
        vMeth1_check_sum += i + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + (1 != 0 ? 1 : 0) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void vMeth(int i, float f) {
        int i2 = 24;
        int i3 = -151;
        int i4 = 18551;
        int i5 = -31176;
        int i6 = 200;
        int[] iArr = new int[N];
        double d = 27.54717d;
        long[][][] jArr = new long[N][N][N];
        FuzzerUtils.init((Object[][]) jArr, (Object) 3L);
        FuzzerUtils.init(iArr, 13);
        int i7 = 16;
        while (i7 < 297) {
            f -= (float) Long.reverseBytes(jArr[i7][i7][i7]);
            vMeth1();
            switch ((i7 % 5) + 97) {
                case 97:
                case 98:
                    i3 = 1;
                    while (i3 < 6) {
                        int i8 = i3 + 1;
                        iArr[i8] = iArr[i8] - i2;
                        i *= (int) fFld;
                        f = (float) d;
                        i2 = i7;
                        i4 = i7;
                        i3++;
                    }
                    i5 = 6;
                    while (i5 > 1) {
                        instanceCount = i2;
                        i4 = (i4 + i5) - ((int) f);
                        long[] jArr2 = jArr[i5 - 1][i5 - 1];
                        int i9 = i5;
                        jArr2[i9] = jArr2[i9] >> i4;
                        i5--;
                    }
                    break;
                case 99:
                    try {
                        i4 = iArr[i7 - 1] / i;
                        i = 251 % i4;
                        iArr[i7 + 1] = i2 / (-42);
                    } catch (ArithmeticException e) {
                    }
                case 100:
                    i6 <<= i6;
                case 101:
                    d = i7;
                    break;
                default:
                    if (0 != 0) {
                    }
                    break;
            }
            i7++;
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + i7 + i2 + i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 + (0 != 0 ? 1 : 0) + FuzzerUtils.checkSum((Object[][]) jArr) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        int i = 243;
        int i2 = -169;
        int i3 = -34047;
        int i4 = -144;
        float f = 1.656f;
        long j = -250;
        int i5 = 8;
        while (324 > i5) {
            int i6 = (int) (((int) (i + (((i5 * f) + i) - i))) + (((i5 * instanceCount) + instanceCount) - 26526));
            byFld = (byte) (byFld + ((byte) i5));
            i = i6 + (((i5 * i5) + i6) - i6);
            i2 = 2;
            while (i2 < 80) {
                f += (float) ((-instanceCount) + Long.reverseBytes(instanceCount) + 31);
                i += (int) ((i5 + instanceCount) * ((i5 + instanceCount) - i2));
                i2++;
            }
            vMeth(i5, fFld);
            fFld -= i2;
            long j2 = 4;
            while (true) {
                j = j2;
                if (j < 80) {
                    i3 = 1;
                    while (2 > i3) {
                        i4 -= (int) (-46.76134d);
                        i3++;
                    }
                    j2 = j + 1;
                }
            }
            i5++;
        }
        FuzzerUtils.out.println("i i1 f = " + i5 + "," + i + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("s i2 i3 = " + 26526 + "," + i2 + "," + (-1));
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("l1 i20 i21 = " + j + "," + printStream + "," + 14);
        FuzzerUtils.out.println("i22 i23 d3 = " + (-20998) + "," + i4 + "," + Double.doubleToLongBits(-46.76134d));
        FuzzerUtils.out.println("i24 = " + 7);
        PrintStream printStream2 = FuzzerUtils.out;
        long j3 = instanceCount;
        byte b = byFld;
        Float.floatToIntBits(fFld);
        printStream2.println("Test.instanceCount Test.byFld Test.fFld = " + j3 + "," + printStream2 + "," + b);
        PrintStream printStream3 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        long checkSum2 = FuzzerUtils.checkSum(sArrFld);
        FuzzerUtils.checkSum(this.lArrFld);
        printStream3.println("Test.iArrFld Test.sArrFld lArrFld = " + checkSum + "," + printStream3 + "," + checkSum2);
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
