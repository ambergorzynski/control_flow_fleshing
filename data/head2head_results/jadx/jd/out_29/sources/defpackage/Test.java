

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_29/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_29/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public float fFld = -52.179f;
    public boolean[] bArrFld = new boolean[N];
    public static long dMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long instanceCount = -86;
    public static volatile double dFld = 2.6143d;
    public static byte byFld = -7;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, 50);
        dMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }

    public static void vMeth(int i, int i2) {
        float f;
        float f2;
        long j;
        int i3 = -37801;
        int i4 = 49755;
        int i5 = 42798;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -57356);
        float f3 = 137.0f;
        while (true) {
            f = f3;
            if (f <= 2.0f) {
                break;
            }
            i3 = i3;
            f3 = f - 1.0f;
        }
        long j2 = 208;
        do {
            iArr[(int) j2] = 22;
            i -= (int) dFld;
            float f4 = 8.0f;
            while (true) {
                f2 = f4;
                if (f2 <= 1.0f) {
                    break;
                }
                i3 = i4;
                i5 = 1;
                while (i5 < 2) {
                    i = -2;
                    iArr = FuzzerUtils.int1array(N, 8492);
                    i4 = (i4 * ((int) f)) >> i3;
                    i5++;
                }
                f4 = f2 - 1.0f;
            }
            j = j2 - 1;
            j2 = j;
        } while (j > 0);
        vMeth_check_sum += ((((((((i + 11) + Float.floatToIntBits(f)) + i3) + j2) + Float.floatToIntBits(f2)) + i4) + i5) - 20495) + FuzzerUtils.checkSum(iArr);
    }

    public int iMeth(int i, int i2, int i3) {
        int i4 = -250;
        int i5 = 0;
        int i6 = -37114;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -28);
        vMeth(i3, i3);
        short s = (short) (7427 * ((short) i3));
        int i7 = 1;
        while (i7 < 197) {
            i5 = 1;
            do {
                i >>>= i3;
                dFld = 173.0d;
                instanceCount = 26758L;
                i6 = 1;
                while (i6 < 1) {
                    switch (((i6 % 2) * 5) + 105) {
                        case 109:
                            i4 += 167;
                            s = (short) (s << (-23720));
                            int i8 = i7;
                            iArr[i8] = iArr[i8] % ((int) (this.fFld | 1));
                            break;
                    }
                    if (i7 != 0) {
                    }
                    i = 167;
                    i4 = (int) (i4 + (i6 - this.fFld));
                    i6++;
                }
                i5++;
            } while (i5 < 8);
            i7++;
        }
        long checkSum = i + i2 + i3 + s + i7 + i4 + i5 + i6 + 167 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += checkSum;
        return (int) checkSum;
    }

    public double dMeth(int i, byte b) {
        int i2 = 14880;
        int i3 = -189;
        int i4 = -39468;
        int i5 = -36928;
        boolean z = true;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 7835966092896054966L);
        int i6 = 1;
        while (true) {
            i6++;
            if (i6 >= 175) {
                break;
            }
            int iMeth = i >> iMeth(200, i6, i);
            instanceCount &= instanceCount;
            i = iMeth >>> iMeth;
            i2 = i6;
            while (i2 < 9) {
                int i7 = i + i6;
                iArrFld[i6 + 1] = -50269;
                i4 = 1;
                while (i4 < 1) {
                    jArr[i6] = jArr[i6] - b;
                    dFld = i3;
                    z = z;
                    i4++;
                }
                i = i7 >>> i2;
                i5 = (int) dFld;
                i3 = i6;
                i2++;
            }
        }
        long checkSum = i + b + i6 + i2 + i3 + i4 + i5 + (z ? 1 : 0) + FuzzerUtils.checkSum(jArr);
        dMeth_check_sum += checkSum;
        return checkSum;
    }

    public void mainTest(String[] strArr) {
        int i = 30888;
        int i2 = 102;
        int i3 = 11;
        int i4 = -4;
        boolean z = 14;
        int[] iArr = new int[N];
        double[] dArr = new double[N];
        boolean z2 = false;
        long j = 3547325499L;
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr, -10);
        FuzzerUtils.init(dArr, -1.9122d);
        FuzzerUtils.init(fArr, 1.672f);
        int[] int1array = FuzzerUtils.int1array(N, -8);
        int i5 = (-141) + 1;
        int abs = (-141) * (((-141) - i5) - Math.abs(Math.max(i5, 4)));
        int i6 = abs + 1;
        double d = (-16.33351d) - abs;
        dMeth(i6, byFld);
        int i7 = i6 + i6;
        dArr[(i7 >>> 1) % N] = 108.83915d;
        for (int i8 = 17; i8 < 354; i8++) {
            z2 = z2;
            try {
                i = int1array[i8 - 1] % (i % i8);
                i7 = iArrFld[i8 + 1] % 117;
            } catch (ArithmeticException e) {
            }
            int[] iArr2 = iArrFld;
            int i9 = i8;
            iArr2[i9] = iArr2[i9] & ((int) instanceCount);
            if (!z2) {
                i *= (int) instanceCount;
                long j2 = 2;
                while (true) {
                    j = j2;
                    if (j < 75) {
                        int i10 = i7 - i2;
                        i2 -= 47264;
                        try {
                            int i11 = i2 / 2103681232;
                            i10 = i8 / i2;
                            i = iArrFld[i8 + 1] % iArrFld[i8];
                        } catch (ArithmeticException e2) {
                        }
                        this.bArrFld[i8] = false;
                        z2 = z2;
                        i7 = (int) (i10 + 248 + (j * j));
                        this.fFld = this.fFld;
                        i3 = 1;
                        while (i3 < 2) {
                            i4 += 57;
                            switch ((int) ((j % 9) + 37)) {
                                case 37:
                                    instanceCount = ((float) instanceCount) + (((i3 * this.fFld) + ((float) j)) - byFld);
                                    instanceCount -= (long) dFld;
                                    if (z2) {
                                    }
                                    break;
                                case 38:
                                    i7 += i;
                                    if (z2) {
                                        break;
                                    } else {
                                        i4 = (int) this.fFld;
                                        break;
                                    }
                                case 39:
                                    if (z2) {
                                    }
                                    break;
                                case 40:
                                    i7 = -14;
                                    break;
                                case 41:
                                case 42:
                                    i7 = (int) j;
                                    break;
                                case 43:
                                    z = -249;
                                    break;
                                case 44:
                                    this.fFld *= this.fFld;
                                    break;
                                case 45:
                                    instanceCount = -2101959090L;
                                default:
                                    fArr[i3] = (float) dFld;
                                    break;
                            }
                            i3++;
                        }
                        j2 = j + 1;
                    }
                }
            }
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i d i21 = " + i7 + "," + Double.doubleToLongBits(d) + "," + printStream);
        FuzzerUtils.out.println("i22 b1 l1 = " + i + "," + (z2) + "," + j);
        FuzzerUtils.out.println("i23 i24 i25 = " + i2 + "," + i3 + "," + i4);
        PrintStream printStream2 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(int1array);
        Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        printStream2.println("i26 iArr dArr = " + z + "," + checkSum + "," + printStream2);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        PrintStream printStream3 = FuzzerUtils.out;
        long j3 = instanceCount;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        Float.floatToIntBits(this.fFld);
        printStream3.println("Test.instanceCount Test.dFld fFld = " + j3 + "," + printStream3 + "," + doubleToLongBits);
        PrintStream printStream4 = FuzzerUtils.out;
        byte b = byFld;
        long checkSum2 = FuzzerUtils.checkSum(iArrFld);
        FuzzerUtils.checkSum(this.bArrFld);
        printStream4.println("Test.byFld Test.iArrFld bArrFld = " + b + "," + checkSum2 + "," + printStream4);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
