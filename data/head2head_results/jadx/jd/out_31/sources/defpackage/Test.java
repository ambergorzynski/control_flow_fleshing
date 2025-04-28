

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_31/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_31/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long iMeth_check_sum;
    public static long instanceCount = 137;
    public static int iFld = -95;
    public static int iFld1 = 40107;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(iArrFld, 0);
        FuzzerUtils.init(lArrFld, 44848L);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static void vMeth1(int i) {
        instanceCount = (long) 6.5522d;
        vMeth1_check_sum += i + Double.doubleToLongBits(6.5522d);
    }

    public static int iMeth(double d, int i) {
        int i2 = 13329;
        int i3 = -9441;
        int i4 = -27921;
        int i5 = -14;
        int[] iArr = new int[N];
        long j = -14;
        FuzzerUtils.init(iArr, 63525);
        vMeth1(i);
        int i6 = 7;
        while (i6 < 223) {
            long j2 = 7;
            while (true) {
                j = j2;
                if (i6 >= j) {
                    break;
                }
                double d2 = d - 2.108f;
                d = i;
                if ((i3 ^ i2) != 0) {
                }
                i = (int) instanceCount;
                i3 = (int) instanceCount;
                int i7 = i6 + 1;
                iArr[i7] = iArr[i7] + ((int) (-2.108f));
                i2 &= iFld;
                j2 = j - 1;
            }
            i4 = 1;
            while (7 > i4) {
                i5 = (int) j;
                if (1 != 0) {
                    break;
                }
                i3 = i3;
                i4++;
            }
            i6++;
        }
        long doubleToLongBits = Double.doubleToLongBits(d) + i + i6 + i2 + j + i3 + Float.floatToIntBits(-2.108f) + i4 + i5 + (1 != 0 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth(float f) {
        int i = 7;
        int i2 = 3;
        int i3 = 5;
        int i4 = -15060;
        int i5 = 8;
        while (i5 < 324) {
            vMeth1(iMeth(0.120648d, iFld));
            switch ((((iFld >>> 1) % 1) * 5) + 88) {
                case 93:
                    instanceCount *= -21;
                    iArrFld[i5] = r0[r1] - 22742;
                    try {
                        i = iFld % iFld;
                        iArrFld[i5 + 1] = i5 / iArrFld[i5 - 1];
                        iFld %= i5;
                        break;
                    } catch (ArithmeticException e) {
                        break;
                    }
                default:
                    i2 = 1;
                    while (i2 < 5) {
                        i = (int) (i + (((i2 * f) + iFld) - i));
                        i3 += i2 * i2;
                        f -= f;
                        i4 = 1;
                        while (i4 < 2) {
                            i *= (int) 0.120648d;
                            lArrFld[i4] = instanceCount;
                            f = i2 - ((float) instanceCount);
                            i4++;
                        }
                        i2++;
                    }
                    break;
            }
            i5++;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i5 + i + Double.doubleToLongBits(0.120648d) + i2 + i3 + i4 + 57;
    }

    public void mainTest(String[] strArr) {
        int i = -90;
        int i2 = -122;
        int i3 = 172;
        int i4 = -215;
        int i5 = 13637;
        int i6 = 9;
        int i7 = 12;
        int i8 = -11;
        float f = 2.41f;
        double d = 102.212d;
        boolean[] zArr = new boolean[N];
        byte b = -127;
        FuzzerUtils.init(zArr, true);
        int i9 = 8;
        while (i9 < 133) {
            i2 = 7;
            while (201 > i2) {
                vMeth(f);
                i2++;
            }
            i4 = 5;
            while (i4 < 201) {
                i3 = -32118;
                f = f;
                d -= 10.0d;
                i = i + i4 + (i4 | (-8778));
                iFld += i4 * iFld1;
                iArrFld[i4 - 1] = (int) f;
                i4++;
            }
            i = 10955;
            int[] iArr = iArrFld;
            int i10 = i9;
            iArr[i10] = iArr[i10] << 11;
            instanceCount += f;
            instanceCount >>= -54927;
            zArr[i9] = true;
            i5 = 9;
            while (201 > i5) {
                switch ((i5 % 1) + 38) {
                    case 38:
                        i6 = (int) instanceCount;
                        i7 = i9;
                        while (2 > i7) {
                            d = f;
                            i3 >>>= iFld;
                            i8 = iFld1;
                            i7++;
                        }
                        i = (int) d;
                        break;
                }
                b = (byte) (b / ((byte) (instanceCount | 1)));
                i5++;
            }
            i9++;
        }
        long[] jArr = lArrFld;
        int i11 = (i7 >>> 1) % N;
        jArr[i11] = jArr[i11] + instanceCount;
        int[] iArr2 = iArrFld;
        iArr2[125] = iArr2[125] << ((int) instanceCount);
        long[] jArr2 = lArrFld;
        int i12 = (i8 >>> 1) % N;
        jArr2[i12] = jArr2[i12] >> i;
        float f2 = (float) instanceCount;
        FuzzerUtils.out.println("i i1 i2 = " + i9 + "," + (i ^ i9) + "," + i2);
        FuzzerUtils.out.println("i3 f2 i17 = " + i3 + "," + Float.floatToIntBits(f2) + "," + i4);
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i18 d3 s = " + (-7) + "," + Double.doubleToLongBits(d) + "," + printStream);
        FuzzerUtils.out.println("b1 i20 i21 = " + (1 != 0) + "," + i5 + "," + i6);
        FuzzerUtils.out.println("i22 i23 by = " + i7 + "," + i8 + "," + b);
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(zArr));
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        int i13 = iFld;
        int i14 = iFld1;
        printStream2.println("Test.instanceCount Test.iFld Test.iFld1 = " + j + "," + printStream2 + "," + i13);
        PrintStream printStream3 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        FuzzerUtils.checkSum(lArrFld);
        printStream3.println("Test.iArrFld Test.lArrFld = " + checkSum + "," + printStream3);
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
