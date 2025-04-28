

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_1/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_1/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public byte byFld = -112;
    public static long vMeth_check_sum;
    public static long fMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long instanceCount = -12;
    public static float fFld = -2.773f;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static float[] fArrFld = new float[N];

    static {
        FuzzerUtils.init(iArrFld, 50031);
        FuzzerUtils.init(fArrFld, -31.34f);
        vMeth_check_sum = 0L;
        fMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }

    public static void vMeth1(int i) {
        int i2 = -3;
        int i3 = -177;
        int i4 = -25069;
        int[] iArr = new int[N];
        double d = -61.10718d;
        FuzzerUtils.init(iArr, 0);
        for (int i5 : iArr) {
            i2 = 1;
            while (i2 < 4) {
                i += i2;
                d *= -5.0d;
                iArr[i2] = 12356;
                i2++;
            }
            if (1 != 0) {
                break;
            }
            instanceCount = i;
        }
        instanceCount <<= i2;
        int i6 = 16;
        while (i6 < 263) {
            i3 = 1;
            while (i3 < 7) {
                instanceCount >>= -14124;
                i3++;
            }
            i4 = i6;
            while (i4 < 7) {
                instanceCount += i6;
                instanceCount = instanceCount;
                if (1 != 0) {
                }
                i4++;
            }
            i6++;
        }
        vMeth1_check_sum += (((((((((i + i2) - 21383) + Double.doubleToLongBits(d)) + (1 != 0 ? 1 : 0)) + i6) + 5) + i3) - 20095) - 14124) + i4 + 5 + FuzzerUtils.checkSum(iArr);
    }

    public static float fMeth() {
        int i = 53348;
        int i2 = -2;
        int i3 = 9;
        int i4 = -109;
        int i5 = -131;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -9);
        vMeth1(-142);
        fFld = (float) instanceCount;
        int i6 = 4;
        while (i6 < 384) {
            if (0 == 0) {
                iArr[i6 - 1] = i6;
                i2 = 1;
                while (true) {
                    i2++;
                    if (i2 < 4) {
                        instanceCount += (-201) + (i2 * i2);
                        i3 = 1;
                        while (i3 < 1) {
                            instanceCount += i3 + instanceCount;
                            instanceCount += i3 ^ instanceCount;
                            i3 += 2;
                        }
                        i4 -= i;
                        i5 = i6;
                        while (i5 < 1) {
                            instanceCount += (long) (-1.51357d);
                            instanceCount >>= (int) instanceCount;
                            i = i4;
                            i5++;
                        }
                    }
                }
            }
            i6++;
        }
        long doubleToLongBits = ((((((((-142) + i6) + i) + i2) + i3) + i4) + i5) - 38) + Double.doubleToLongBits(-1.51357d) + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += doubleToLongBits;
        return (float) doubleToLongBits;
    }

    public static void vMeth() {
        int i = -34876;
        int i2 = -41010;
        int i3 = -95;
        int i4 = -9772;
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -41712L);
        FuzzerUtils.init(iArr, 11729);
        fMeth();
        int i5 = 16;
        while (i5 < 274) {
            instanceCount = 95L;
            i2 = 6;
            while (true) {
                i2--;
                if (i2 > 0) {
                    i += i;
                    jArr[i2] = jArr[i2] + 31136;
                    short s = (short) (31136 - ((short) i2));
                    i3 = 1;
                    while (1 > i3) {
                        int i6 = i4 + (i3 - i4);
                        iArr = iArr;
                        instanceCount ^= i6;
                        i -= i5;
                        i4 = (int) (i6 + i3 + (((i3 * s) + r0) - fFld));
                        i3 += 3;
                    }
                }
            }
            i5++;
        }
        vMeth_check_sum += i5 + i + i2 + i3 + i4 + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        int i = -14;
        int i2 = -38;
        int i3 = 62;
        int i4 = 3;
        int i5 = -98;
        int i6 = 20099;
        int i7 = -15504;
        int i8 = -235;
        int i9 = 129;
        int i10 = 17261;
        boolean z = true;
        vMeth();
        for (int i11 : iArrFld) {
            int i12 = i11 << this.byFld;
            int[] iArr = iArrFld;
            iArr[21] = iArr[21] * (-5);
            i = 1;
            while (63 > i) {
                i3 = 1;
                while (i3 < 2) {
                    fArrFld[i3 + 1] = this.byFld;
                    instanceCount -= instanceCount;
                    iArrFld[i - 1] = i;
                    i3++;
                }
                z = z;
                fFld -= 3;
                i++;
            }
            i2 = ((int) fFld) + this.byFld + 41;
        }
        int i13 = 392;
        while (i13 > 22) {
            i6 = i13;
            while (i6 < 68) {
                instanceCount -= -93;
                i6++;
            }
            i7 = 68;
            while (i7 > i13) {
                i5 = i5;
                i7 -= 3;
            }
            i4 -= this.byFld;
            i8 *= i8;
            i9 = 1;
            do {
                if (z) {
                    i10 = 1;
                    while (i10 < 1 && !z) {
                        i2 = i13;
                        fFld *= 3.7123986E9f;
                        i5 += i10 - i8;
                        i10++;
                    }
                } else {
                    instanceCount = (long) (-35.99299d);
                }
                i9++;
            } while (i9 < 68);
            i13--;
        }
        FuzzerUtils.out.println("i24 i25 i26 = " + i + "," + i2 + "," + i3);
        FuzzerUtils.out.println("i27 b2 i28 = " + i4 + "," + (z) + "," + i13);
        FuzzerUtils.out.println("i29 i30 i31 = " + i5 + "," + i6 + "," + (-18707));
        FuzzerUtils.out.println("i32 i33 i34 = " + i7 + "," + i8 + "," + i9);
        FuzzerUtils.out.println("i35 i36 d2 = " + i10 + "," + (-26) + "," + Double.doubleToLongBits(-35.99299d));
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        int floatToIntBits = Float.floatToIntBits(fFld);
        byte b = this.byFld;
        printStream.println("Test.instanceCount Test.fFld byFld = " + j + "," + printStream + "," + floatToIntBits);
        PrintStream printStream2 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld));
        printStream2.println("Test.iArrFld Test.fArrFld = " + checkSum + "," + printStream2);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
