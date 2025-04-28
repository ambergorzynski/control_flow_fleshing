

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_9/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_9/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public float[][] fArrFld = new float[N][N];
    public static volatile long instanceCount = -7040061827462761291L;
    public static double dFld = -105.71119d;
    public static int iFld = -2;
    public static short sFld = 1561;
    public static int iFld1 = -189;
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f, int i, int i2) {
        int i3;
        int i4 = 7;
        int i5 = 8;
        int[] iArr = new int[N];
        long j = 11;
        FuzzerUtils.init(iArr, -11);
        int i6 = i + 4022;
        instanceCount += i2 - 2;
        int i7 = 1;
        do {
            int i8 = i7;
            iArr[i8] = iArr[i8] - ((int) instanceCount);
            f += i7;
            iArr[i7] = 38;
            i6 >>= (int) instanceCount;
            i3 = 1;
            while (i3 < 6) {
                switch ((i3 % 2) + 26) {
                    case 26:
                    case 27:
                        instanceCount <<= 33424;
                        i4 = 1;
                        while (i4 < 2) {
                            dFld = instanceCount;
                            i5 = (int) instanceCount;
                            i4++;
                        }
                        break;
                    default:
                        j *= i6;
                        break;
                }
                i3++;
            }
            i7++;
        } while (i7 < 263);
        vMeth1_check_sum += ((((((Float.floatToIntBits(f) + i6) + r9) + 4022) + i7) + i3) - 30) + i4 + i5 + j + FuzzerUtils.checkSum(iArr);
    }

    public static double dMeth(byte b) {
        int i = -119;
        int i2 = 194;
        int i3 = 6873;
        double[] dArr = new double[N];
        byte[] bArr = new byte[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(dArr, 1.11744d);
        FuzzerUtils.init(bArr, (byte) 107);
        FuzzerUtils.init(jArr, 3L);
        instanceCount <<= 162;
        int length = dArr.length;
        int i4 = 0;
        while (i4 < length) {
            double d = dArr[i4];
            int i5 = 1;
            do {
                vMeth1(61.226f, i5, i5);
                i2 = (int) instanceCount;
                if (0 != 0) {
                    break;
                }
                switch ((i5 % 6) + 9) {
                    case 9:
                        i3 = (short) (i3 - ((short) 2.945f));
                        instanceCount += i5 - instanceCount;
                    case 10:
                        iFld = 2;
                        b = (byte) iFld;
                        i2 += iFld;
                    case 11:
                        iFld = (int) (iFld + (((i5 * instanceCount) + instanceCount) - instanceCount));
                        iFld /= (int) (((long) d) | 1);
                        instanceCount = b;
                        break;
                    case 12:
                        bArr[i5 + 1] = 99;
                        break;
                    case 13:
                        iFld -= i2;
                        break;
                    case 14:
                        int i6 = i5;
                        jArr[i6] = jArr[i6] ^ i2;
                        break;
                }
                i5++;
                i4++;
                i = i5;
            } while (i5 < 4);
            i4++;
            i = i5;
        }
        long floatToIntBits = b + i + i2 + (0 != 0 ? 1 : 0) + i3 + Float.floatToIntBits(2.945f) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(jArr);
        dMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x008a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0179 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vMeth() {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth():void");
    }

    public void mainTest(String[] strArr) {
        int i = -43980;
        int i2 = -113;
        int i3 = 91;
        int i4 = 51444;
        int i5 = -181;
        int i6 = 27;
        int i7 = 57;
        int[] iArr = new int[N];
        float f = 0.564f;
        FuzzerUtils.init(iArr, 5418);
        int i8 = 800506545 >> (800506545 + 1);
        vMeth();
        int i9 = 8;
        while (i9 < 360) {
            this.fArrFld = this.fArrFld;
            i2 = 1;
            while (i2 < 72) {
                dFld -= iFld;
                i -= iFld;
                try {
                    int i10 = iFld % 23250;
                    i3 = i % i;
                    i8 = i2 / 1554321748;
                } catch (ArithmeticException e) {
                }
                int[] iArr2 = iArr;
                int i11 = i9;
                iArr2[i11] = iArr2[i11] - 43;
                i2++;
            }
            instanceCount -= i2;
            instanceCount -= 13;
            float f2 = 3.0f;
            while (true) {
                f = f2;
                if (f < 72.0f) {
                    instanceCount >>= -25;
                    iFld <<= i8;
                    iArr = iArr;
                    dFld += 8.0d;
                    iFld &= -10393;
                    f2 = f + 1.0f;
                }
            }
            iFld = 209;
            iFld += i9 ^ i;
            i3 -= (int) instanceCount;
            iFld = i3;
            i9++;
        }
        int i12 = 1;
        while (true) {
            i12++;
            if (i12 < 392) {
                switch ((((i8 >>> 1) % 6) * 5) + 40) {
                    case 43:
                        i5 = 3;
                        while (i5 < 64) {
                            i6 += i5 * i5;
                            instanceCount *= instanceCount;
                            i7 = 1;
                            while (i7 < 2) {
                                i += i7 * i;
                                instanceCount *= i2;
                                i7++;
                            }
                            i5++;
                        }
                    case 45:
                        i6 <<= i4;
                        continue;
                    case 60:
                        i4 *= i6;
                        continue;
                    case 62:
                    default:
                        instanceCount = f;
                        continue;
                    case 65:
                        break;
                    case 69:
                        instanceCount = sFld;
                        continue;
                }
                try {
                    iFld = (-7) / i9;
                    i4 = i3 % i2;
                    i = (-1011711896) % iFld1;
                } catch (ArithmeticException e2) {
                }
            } else {
                FuzzerUtils.out.println("i i15 i16 = " + i8 + "," + i9 + "," + i);
                FuzzerUtils.out.println("i17 i18 f4 = " + i2 + "," + i3 + "," + Float.floatToIntBits(f));
                FuzzerUtils.out.println("i19 by2 i20 = " + i4 + "," + (-25) + "," + i12);
                FuzzerUtils.out.println("i21 i22 i23 = " + i5 + "," + i6 + "," + i7);
                FuzzerUtils.out.println("i24 iArr2 = " + (-7) + "," + FuzzerUtils.checkSum(iArr));
                PrintStream printStream = FuzzerUtils.out;
                long j = instanceCount;
                long doubleToLongBits = Double.doubleToLongBits(dFld);
                int i13 = iFld;
                printStream.println("Test.instanceCount Test.dFld Test.iFld = " + j + "," + printStream + "," + doubleToLongBits);
                FuzzerUtils.out.println("Test.sFld Test.iFld1 fArrFld = " + sFld + "," + iFld1 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld)));
                FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
                FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
