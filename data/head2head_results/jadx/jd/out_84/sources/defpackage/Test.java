

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_84/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_84/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long lMeth_check_sum;
    public static long instanceCount = -41322;
    public static double dFld = 71.56315d;
    public static volatile float fFld = 1.755f;
    public static boolean bFld = false;
    public static volatile byte byFld = -23;
    public static final int N = 400;
    public static int[][] iArrFld = new int[N][N];

    static {
        FuzzerUtils.init(iArrFld, 75);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
    }

    public static long lMeth(double d, boolean z) {
        int i = -34465;
        int i2 = 58;
        int i3 = 24635;
        int i4 = 32597;
        int i5 = -4;
        int i6 = -3;
        int[] iArr = new int[N];
        long j = -50086;
        byte[] bArr = new byte[N];
        FuzzerUtils.init(bArr, (byte) 14);
        FuzzerUtils.init(iArr, 9);
        int i7 = 14;
        while (i7 < 279) {
            int i8 = (int) instanceCount;
            i2 = 1;
            while (i2 < 6) {
                instanceCount >>= (int) instanceCount;
                i8 >>= (int) j;
                i2++;
            }
            i = i8 + (((i7 * i7) + i8) - i2);
            i4 = 6;
            while (i4 > 1) {
                int i9 = i4;
                bArr[i9] = (byte) (bArr[i9] << ((byte) i5));
                i3 = -923607282;
                iArr[i7 - 1] = iArr[r1] - 25740;
                int i10 = i4 - 1;
                iArr[i10] = iArr[i10] >> (-923607282);
                i6 = 1;
                do {
                    i5 = i3;
                    i3 *= i3;
                    i6++;
                } while (i6 < 2);
                j = ((float) j) + (((i4 * (-78.807f)) + i3) - (-78.807f));
                i4--;
            }
            i7++;
        }
        long doubleToLongBits = Double.doubleToLongBits(d) + (z ? 1 : 0) + i7 + i + i2 + i3 + j + i4 + i5 + i6 + Float.floatToIntBits(-78.807f) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += doubleToLongBits;
        return doubleToLongBits;
    }

    public static void vMeth(int i, short s) {
        int i2 = 5;
        boolean z = false;
        int i3 = 152;
        while (i3 > 9) {
            z = lMeth(dFld, true) + (-221) != ((long) s);
            i2 >>>= (int) instanceCount;
            i3--;
        }
        instanceCount &= i;
        vMeth_check_sum += i + s + i3 + ((int) 55.394f) + (z ? 1 : 0) + Float.floatToIntBits(55.394f);
    }

    public static int iMeth() {
        int i = -5;
        long j = -26203;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -12L);
        int i2 = 13 << ((int) (13 + instanceCount));
        vMeth(i2, (short) 16320);
        int i3 = 1;
        while (true) {
            i3++;
            if (i3 < 258) {
                jArr[i3] = i3;
                if (bFld) {
                    fFld = i2;
                } else {
                    instanceCount -= i3;
                }
                int[] iArr = iArrFld[i3 + 1];
                int i4 = i3 - 1;
                iArr[i4] = iArr[i4] + ((int) j);
                bFld = bFld;
                int[] iArr2 = iArrFld[i3 + 1];
                int i5 = i3 + 1;
                iArr2[i5] = iArr2[i5] << i2;
                j = i2;
                i = 1;
                while (i < 6) {
                    instanceCount = i3;
                    iArrFld[i3][i3] = byFld;
                    i++;
                }
            } else {
                long checkSum = i2 + i3 + j + i + 4 + FuzzerUtils.checkSum(jArr);
                iMeth_check_sum += checkSum;
                return (int) checkSum;
            }
        }
    }

    public void mainTest(String[] strArr) {
        int i = 156;
        int i2 = 234;
        int i3 = 0;
        int i4 = -32028;
        int i5 = 3345;
        int i6 = -49109;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -2L);
        int i7 = 1;
        while (i7 < 128) {
            i2 = 8;
            while (i2 < 197) {
                i4 = 1;
                while (2 > i4) {
                    instanceCount = iMeth() >>> i4;
                    int i8 = i3 + 58;
                    i5 = byFld;
                    try {
                        iArrFld[i4][i2] = i6 % (-91);
                        iArrFld[i7][i7 + 1] = i7 / 168;
                        iArrFld[i2 - 1][i7 - 1] = i / (-22050);
                    } catch (ArithmeticException e) {
                    }
                    i3 = -7216;
                    iArrFld[i4][i4 + 1] = (int) instanceCount;
                    switch (120) {
                        case 119:
                            i = i4;
                            i3 = (-7216) >> (-7216);
                            instanceCount += i4 - instanceCount;
                            i6 ^= i5;
                            break;
                        case 120:
                            instanceCount += ((i4 * (-7216)) + i4) - (-7216);
                            break;
                        case 121:
                            i = i4;
                            i5 = i7;
                            instanceCount |= instanceCount;
                            fFld = byFld;
                        case 122:
                            i -= i4;
                        case 123:
                            i6 = (int) instanceCount;
                            break;
                        case 124:
                            int i9 = i6 + i4;
                            i += i4 - (-7216);
                            iArrFld[i2 - 1][i4 - 1] = -7216;
                        case 125:
                            instanceCount += i4;
                            i5 = (int) fFld;
                            jArr = jArr;
                            i6 = -7216;
                            break;
                    }
                    i >>= (int) instanceCount;
                    i4++;
                }
                i2++;
            }
            i7++;
        }
        FuzzerUtils.out.println("i i1 i2 = " + i7 + "," + i + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("i20 s1 lArr1 = " + i6 + "," + (-7216) + "," + FuzzerUtils.checkSum(jArr));
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        Float.floatToIntBits(fFld);
        printStream.println("Test.instanceCount Test.dFld Test.fFld = " + j + "," + printStream + "," + doubleToLongBits);
        FuzzerUtils.out.println("Test.bFld Test.byFld Test.iArrFld = " + (bFld) + "," + byFld + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
