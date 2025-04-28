

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_3/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_3/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vMeth_check_sum;
    public static long lMeth_check_sum;
    public static long iMeth_check_sum;
    public static long instanceCount = -2296936133024613144L;
    public static int iFld = 13869;
    public static long lFld = -4003616719L;
    public static final int N = 400;
    public static volatile int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(iArrFld, -13);
        FuzzerUtils.init(lArrFld, 1307677492188439752L);
        vMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static int iMeth(int i, int i2) {
        int i3 = 8712;
        float f = 0.604f;
        float[][][] fArr = new float[N][N][N];
        FuzzerUtils.init((Object[][]) fArr, (Object) Float.valueOf(-49.804f));
        int i4 = i2 + i2;
        fArr[(i4 >>> 1) % N][(i4 >>> 1) % N] = fArr[(i4 >>> 1) % N][(i4 >>> 1) % N];
        double d = 0.107158d + i2;
        int i5 = 378;
        while (i5 > 18) {
            lArrFld[i5 - 1] = f;
            i3 = 1;
            while (i3 < 13) {
                if (i4 != 0) {
                }
                instanceCount += i3 * instanceCount;
                i2 -= (int) instanceCount;
                instanceCount %= 174 | 1;
                d -= 1.2599999904632568d;
                iFld += i3 * i3;
                f += 25.698f;
                lFld = instanceCount;
                i3++;
            }
            i5 -= 3;
        }
        long doubleToLongBits = (((((((i4 + i2) + Double.doubleToLongBits(d)) + i5) + 174) + Float.floatToIntBits(f)) + i3) - 165) + Double.doubleToLongBits(FuzzerUtils.checkSum((Object[][]) fArr));
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static long lMeth(long j) {
        long j2;
        int i = 232;
        long j3 = 4;
        while (true) {
            j2 = j3;
            if (j2 >= 206) {
                break;
            }
            long j4 = i;
            long j5 = j - 1;
            j = j4;
            i = (int) ((j4 - j5) + iMeth(iFld, i - 1));
            iFld += iFld;
            j3 = j2 + 1;
        }
        for (int i2 : iArrFld) {
            iFld &= 50476;
        }
        instanceCount = 8L;
        iFld -= i;
        long j6 = j + j2 + i;
        lMeth_check_sum += j6;
        return j6;
    }

    public static void vMeth(float f, int i) {
        int[] iArr = iArrFld;
        int i2 = (i >>> 1) % N;
        iArr[i2] = iArr[i2] * ((int) (68 - (Math.min(instanceCount, 2205506403L) - lMeth(-6L))));
        vMeth_check_sum += Float.floatToIntBits(f) + i;
    }

    public void mainTest(String[] strArr) {
        int i = -39769;
        int i2 = 16107;
        int i3 = 3;
        int i4 = -51;
        int i5 = -6;
        int i6 = -183;
        int[] iArr = new int[N];
        boolean z = true;
        float f = -1.785f;
        double d = 0.2671d;
        short[] sArr = new short[N];
        FuzzerUtils.init(iArr, -7);
        FuzzerUtils.init(sArr, (short) -8941);
        int i7 = 365;
        while (i7 > 19) {
            boolean z2 = instanceCount <= ((long) i7);
            z = z2 & (((((float) instanceCount) > f ? 1 : (((float) instanceCount) == f ? 0 : -1)) != 0) != (!z2));
            if (z) {
                vMeth(f, i);
            } else {
                i2 = 1;
                while (i2 < 73) {
                    iArrFld[i7 + 1] = 7;
                    lArrFld[i2] = i3 >> ((int) lFld);
                    i3 = (int) instanceCount;
                    lFld *= i7;
                    int[] iArr2 = iArrFld;
                    int i8 = i2 + 1;
                    iArr2[i8] = iArr2[i8] - iFld;
                    d *= i7;
                    lFld += 2;
                    iArrFld = iArrFld;
                    i2++;
                }
                instanceCount = instanceCount;
                f = (float) instanceCount;
                try {
                    i = 4055 / iArrFld[i7 - 1];
                    iArr[i7 - 1] = 2496 / i7;
                    iFld = i2 % i3;
                } catch (ArithmeticException e) {
                }
            }
            i7--;
        }
        int i9 = i7 - ((int) f);
        double d2 = d * i7;
        long j = 226;
        while (true) {
            long j2 = j;
            if (7 < j2) {
                i4 = 115;
                while (i4 > 7) {
                    switch ((int) ((j2 % 2) + 36)) {
                        case 36:
                            i5 = 1;
                            while (true) {
                                i5++;
                                if (i5 < 2) {
                                    f += f;
                                } else {
                                    sArr = FuzzerUtils.short1array(N, (short) -16247);
                                    i9 = (int) (i9 + (((i4 * f) - 53) - iFld));
                                    i6 = 1;
                                    do {
                                        lFld = -93;
                                        i9 += ((i6 * i4) + i2) - i5;
                                        i6++;
                                    } while (i6 < 2);
                                }
                            }
                        case 37:
                            i -= (int) f;
                            break;
                    }
                    i4--;
                }
                j = j2 - 1;
            } else {
                FuzzerUtils.out.println("i i1 b = " + i7 + "," + i + "," + (z));
                FuzzerUtils.out.println("f i11 i12 = " + Float.floatToIntBits(f) + "," + i2 + "," + i9);
                PrintStream printStream = FuzzerUtils.out;
                printStream.println("d1 l2 i13 = " + Double.doubleToLongBits(d2) + "," + printStream + "," + j2);
                FuzzerUtils.out.println("i14 i15 i16 = " + i4 + "," + (-61) + "," + i5);
                FuzzerUtils.out.println("i17 by iArr = " + i6 + "," + (-93) + "," + FuzzerUtils.checkSum(iArr));
                FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));
                PrintStream printStream2 = FuzzerUtils.out;
                long j3 = instanceCount;
                int i10 = iFld;
                long j4 = lFld;
                printStream2.println("Test.instanceCount Test.iFld Test.lFld = " + j3 + "," + printStream2 + "," + i10);
                PrintStream printStream3 = FuzzerUtils.out;
                long checkSum = FuzzerUtils.checkSum(iArrFld);
                FuzzerUtils.checkSum(lArrFld);
                printStream3.println("Test.iArrFld Test.lArrFld = " + checkSum + "," + printStream3);
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
