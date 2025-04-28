

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_35/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_35/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public int iFld1 = -165;
    public short sFld = -7848;
    public long[] lArrFld = new long[N];
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long instanceCount = 7702945110749427338L;
    public static final int N = 400;
    public static volatile int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, -14);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
    }

    public static int iMeth1(int i, int i2) {
        long j = i + i + i2;
        iMeth1_check_sum += j;
        return (int) j;
    }

    public static void vMeth() {
        int i = -1725;
        int i2 = 246;
        int i3 = -1;
        float f = 0.915f;
        boolean z = true;
        double d = 1.59913d;
        int i4 = 13;
        while (256 > i4) {
            int i5 = i;
            int i6 = i - 1;
            i = i5 * ((int) (i6 - ((f * i6) + iMeth1(248, i6))));
            switch ((i4 % 3) + 81) {
                case 81:
                    z = false;
                    i = i;
                    break;
                case 82:
                    f += i;
                    d *= -1.0d;
                    instanceCount += ((i4 * i) + instanceCount) - (-3673);
                case 83:
                    i = i;
                default:
                    int[] iArr = iArrFld;
                    int i7 = i4 - 1;
                    iArr[i7] = iArr[i7] ^ i4;
                    break;
            }
            i2 = 1;
            while (i2 < 7) {
                d += i;
                try {
                    i = i2 % (-42005);
                    int i8 = i % i4;
                    i3 = i / iArrFld[i4 - 1];
                } catch (ArithmeticException e) {
                }
                i2++;
            }
            i4++;
        }
        vMeth_check_sum += (((((i4 + i) + Float.floatToIntBits(f)) + (z ? 1 : 0)) + Double.doubleToLongBits(d)) - 3673) + i2 + i3;
    }

    public static int iMeth(int i, float f, int i2) {
        int i3 = 1;
        int i4 = -17788;
        short s = -15531;
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, -63.803f);
        vMeth();
        iArrFld = iArrFld;
        int i5 = 1;
        do {
            switch (((i2 >>> 1) % 2) + 97) {
                case 97:
                    i *= i;
                    switch ((i5 % 2) + 114) {
                        case 114:
                            fArr[i5] = i2;
                            i3 = 1;
                            while (i3 < 10) {
                                i2 += i3;
                                int[] iArr = iArrFld;
                                int i6 = i3;
                                iArr[i6] = iArr[i6] ^ i2;
                                i4 = (int) f;
                                s = (short) (s + ((short) (i3 | i5)));
                                i3++;
                            }
                            int[] iArr2 = iArrFld;
                            int i7 = i5 - 1;
                            iArr2[i7] = iArr2[i7] + i2;
                            break;
                        case 115:
                            i4 = (int) f;
                        default:
                            i2 -= i4;
                            break;
                    }
                case 98:
                    i4 = i;
                    break;
                default:
                    int[] iArr3 = iArrFld;
                    int i8 = i5;
                    iArr3[i8] = iArr3[i8] * (-239);
                    break;
            }
            i5++;
        } while (i5 < 151);
        long floatToIntBits = i + Float.floatToIntBits(f) + i2 + i5 + i3 + i4 + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public void mainTest(String[] strArr) {
        float f = -23.662f;
        int i = -5347;
        int i2 = 15;
        int i3 = 12;
        int i4 = 32886;
        int i5 = 8938;
        int i6 = -44372;
        long j = 43575;
        long j2 = -8989284726440727520L;
        iArrFld[(this.iFld1 >>> 1) % N] = (int) ((iMeth(this.iFld1, -23.662f, this.iFld1) * instanceCount) - 70);
        int i7 = 1;
        while (true) {
            i7++;
            if (i7 >= 255) {
                break;
            }
            this.iFld1 %= 1;
            this.iFld1 *= (int) instanceCount;
            i = 1;
            do {
                int[] iArr = iArrFld;
                iArr[i7] = iArr[i7] & 87;
                i++;
            } while (i < 99);
            this.iFld1 = i7 / i;
            this.iFld1 = i7 / (-97);
            this.iFld1 = i / i7;
        }
        instanceCount -= this.iFld1;
        int i8 = 1;
        while (true) {
            i8++;
            if (i8 < 272) {
                switch (114) {
                    case 71:
                        i6 = i5;
                        instanceCount = ((float) instanceCount) + i8 + f;
                        i5 -= 87;
                        instanceCount -= 14;
                        break;
                    case 72:
                        f += (float) (((i8 * j2) + j) - j);
                        i4 = 32201;
                        break;
                    case 79:
                        i4 = 32201;
                        break;
                    case 80:
                    case 84:
                        i4 = 13;
                        break;
                    case 104:
                        i2 = 1;
                        while (i2 < 92) {
                            long j3 = 1;
                            while (true) {
                                j = j3;
                                if (j < 2 && 1 == 0) {
                                    i4 -= i8;
                                    i3 = i8 * i8;
                                    instanceCount *= i4;
                                    iArrFld[(int) (j + 1)] = (int) f;
                                    instanceCount -= this.sFld;
                                    this.iFld1 += i4;
                                    j3 = j + 1;
                                }
                            }
                            long j4 = 1;
                            while (true) {
                                j2 = j4;
                                if (j2 < 2) {
                                    instanceCount = i2;
                                    this.lArrFld[i8 + 1] = this.iFld1;
                                    instanceCount += j2;
                                    j4 = j2 + 1;
                                }
                            }
                            int[] iArr2 = iArrFld;
                            iArr2[i8] = iArr2[i8] << (-10615);
                            this.lArrFld[(i4 >>> 1) % N] = i;
                            i2++;
                        }
                        try {
                            this.iFld1 = i2 % i8;
                            int i9 = i4 % i4;
                            i4 = i3 / i6;
                        } catch (ArithmeticException e) {
                        }
                        i5 -= (int) instanceCount;
                        break;
                    case 109:
                        i5 -= 87;
                        instanceCount -= 14;
                        break;
                    case 111:
                        i6 += i8 * i8;
                        this.iFld1 = -1217;
                        break;
                    case 116:
                        instanceCount = ((float) instanceCount) + i8 + f;
                        i5 -= 87;
                        instanceCount -= 14;
                        break;
                    case 117:
                        instanceCount -= 14;
                        break;
                }
            } else {
                FuzzerUtils.out.println("f2 i11 i12 = " + Float.floatToIntBits(f) + "," + i7 + "," + i);
                FuzzerUtils.out.println("by1 i13 i14 = " + 87 + "," + i8 + "," + i2);
                PrintStream printStream = FuzzerUtils.out;
                printStream.println("i15 l i16 = " + i3 + "," + j + "," + printStream);
                PrintStream printStream2 = FuzzerUtils.out;
                printStream2.println("b1 l1 i17 = " + (1 != 0) + "," + j2 + "," + printStream2);
                FuzzerUtils.out.println("i18 = " + i6);
                PrintStream printStream3 = FuzzerUtils.out;
                long j5 = instanceCount;
                int i10 = this.iFld1;
                short s = this.sFld;
                printStream3.println("Test.instanceCount iFld1 sFld = " + j5 + "," + printStream3 + "," + i10);
                PrintStream printStream4 = FuzzerUtils.out;
                long checkSum = FuzzerUtils.checkSum(iArrFld);
                FuzzerUtils.checkSum(this.lArrFld);
                printStream4.println("Test.iArrFld lArrFld = " + checkSum + "," + printStream4);
                FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
                FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
                FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
