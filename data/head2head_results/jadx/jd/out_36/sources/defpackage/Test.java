

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_36/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_36/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public int iFld = 62254;
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long instanceCount = 5585222879345510373L;
    public static float fFld = -107.854f;
    public static double dFld = 2.118922d;
    public static boolean bFld = true;
    public static int iFld1 = 6;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static byte[][] byArrFld = new byte[N][N];

    static {
        FuzzerUtils.init(iArrFld, -14);
        FuzzerUtils.init(lArrFld, -14L);
        FuzzerUtils.init(byArrFld, (byte) 22);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }

    public static void vMeth1(int i, long j, long j2) {
        int i2 = 11;
        int i3 = -27729;
        int i4 = -9;
        int i5 = -208;
        float f = 1.425f;
        boolean z = true;
        long j3 = i;
        int i6 = 1;
        while (true) {
            i6++;
            if (i6 < 312) {
                j3 += i6;
                switch (((i6 % 2) * 5) + 100) {
                    case 102:
                        i2 = i6;
                        while (i2 < 5) {
                            i4 = 1;
                            while (i4 > i2) {
                                i5 += i4;
                                i3 = (int) j;
                                i = -4;
                                i4--;
                            }
                            instanceCount = i4;
                            i5 = -6;
                            i2 += 2;
                        }
                        break;
                    case 103:
                        z = z;
                        f %= 1.63243f;
                        break;
                    default:
                        i3 += 27;
                        break;
                }
            } else {
                vMeth1_check_sum += i + j + j3 + (z ? 1 : 0) + i6 + Float.floatToIntBits(f) + i2 + i3 + i4 + i5;
                return;
            }
        }
    }

    public static void vMeth(long j, int i) {
        int i2;
        int i3;
        int i4 = 36;
        long[][][] jArr = new long[N][N][N];
        FuzzerUtils.init((Object[][]) jArr, (Object) 0L);
        int i5 = i + ((int) j);
        long j2 = instanceCount;
        int[] iArr = iArrFld;
        int i6 = (i5 >>> 1) % N;
        int i7 = iArr[i6] - 1;
        iArr[i6] = i7;
        instanceCount = j2 << (i5 - ((i5 - i5) - i7));
        vMeth1(i5, j, instanceCount);
        int i8 = i5;
        int i9 = 1;
        do {
            i2 = 12;
            do {
                i3 = 1;
                while (true) {
                    i3++;
                    if (i3 >= 2) {
                        break;
                    }
                    i8 -= i2;
                    j -= 120;
                }
                fFld += ((i2 * i4) + i9) - fFld;
                i4 = i2;
                int i10 = i8 * 6;
                long[] jArr2 = jArr[i2 + 1][i9 + 1];
                int i11 = i2;
                jArr2[i11] = jArr2[i11] * (-8);
                if (i2 != 0) {
                    vMeth_check_sum += j + i10 + i9 + i2 + i3 + i4 + FuzzerUtils.checkSum((Object[][]) jArr);
                    return;
                } else {
                    i8 = i3;
                    i2 -= 2;
                }
            } while (i2 > 0);
            i9++;
        } while (i9 < 131);
        vMeth_check_sum += j + i8 + i9 + i2 + i3 + i4 + FuzzerUtils.checkSum((Object[][]) jArr);
    }

    public static int iMeth() {
        int i = 53413;
        int i2 = 54865;
        int i3 = 7;
        while (i3 < 283) {
            vMeth(instanceCount, i3);
            dFld -= i3;
            i = (i & (-44829)) + ((int) instanceCount);
            i3++;
        }
        int i4 = 6;
        while (i4 < 311) {
            long[] jArr = lArrFld;
            int i5 = i4 - 1;
            jArr[i5] = jArr[i5] / (instanceCount | 1);
            byArrFld[i4][i4 + 1] = (byte) i3;
            i4++;
        }
        int i6 = i << 91;
        int i7 = 22;
        while (i7 < 352) {
            i2 = 1;
            do {
                fFld *= i3;
                byArrFld[i2 - 1][i2 - 1] = -90;
                iArrFld[i7 + 1] = (int) instanceCount;
                i6 += i2 + i3;
                i2 += 3;
            } while (i2 < 5);
            i7++;
        }
        long j = (((i3 + i6) + i4) - 11) + 91 + i7 + 21151 + i2;
        iMeth_check_sum += j;
        return (int) j;
    }

    public void mainTest(String[] strArr) {
        int i = 14;
        int i2 = -66;
        int i3 = -167;
        int i4 = 95;
        int i5 = 111;
        int i6 = 12;
        int i7 = -22836;
        int i8 = -206;
        int i9 = -125;
        long j = 46427;
        long j2 = -834965808;
        boolean[] zArr = new boolean[N];
        FuzzerUtils.init(zArr, false);
        switch (((this.iFld >>> 1) % 3) + 107) {
            case 107:
                instanceCount = iMeth();
                break;
            case 108:
                this.iFld += this.iFld;
                i = 4;
                while (i < 158) {
                    i2 += i;
                    i++;
                }
                i3 = 4;
                while (i3 < 267) {
                    j = 4018892783215375499L;
                    switch ((i3 % 8) + 92) {
                        case 92:
                            int[] iArr = iArrFld;
                            int i10 = i3 - 1;
                            iArr[i10] = iArr[i10] * 228;
                            i4 = 6;
                            while (i4 < 191) {
                                int i11 = i5 + i4;
                                long j3 = 1;
                                while (true) {
                                    j2 = j3;
                                    if (2 > j2) {
                                        i11 = 5063;
                                        zArr[i4] = bFld;
                                        j3 = j2 + 1;
                                    } else {
                                        i7 = 1;
                                        while (i7 < 2) {
                                            j <<= i4;
                                            try {
                                                this.iFld = 7617 / i3;
                                                int i12 = iArrFld[i7] % 51266;
                                                i6 = i7 % i11;
                                            } catch (ArithmeticException e) {
                                            }
                                            if (bFld) {
                                            }
                                            i7++;
                                        }
                                        i5 = i11 << ((int) instanceCount);
                                        i9 = 1;
                                        while (i9 < 2) {
                                            zArr[i3] = false;
                                            i8 -= (int) instanceCount;
                                            instanceCount += 3 + (i9 * i9);
                                            switch (((i4 % 4) * 5) + 86) {
                                                case 95:
                                                    int[] iArr2 = iArrFld;
                                                    int i13 = i9 - 1;
                                                    iArr2[i13] = iArr2[i13] & i6;
                                                    break;
                                                case 99:
                                                    this.iFld = 1096595504;
                                                    i2 <<= 2;
                                                    break;
                                                case 100:
                                                    i5 |= (int) j;
                                                    break;
                                                case 104:
                                                    int[] iArr3 = iArrFld;
                                                    int i14 = i9 + 1;
                                                    iArr3[i14] = iArr3[i14] * i4;
                                                    i5 = i3;
                                                    i2 |= (int) j;
                                                    this.iFld = 2947;
                                                    break;
                                            }
                                            i9++;
                                        }
                                        i4++;
                                    }
                                }
                            }
                            break;
                        case 93:
                            int[] iArr4 = iArrFld;
                            int i15 = i3 + 1;
                            iArr4[i15] = iArr4[i15] + ((int) dFld);
                            break;
                        case 94:
                            dFld *= -2.0d;
                            break;
                        case 95:
                            i5 *= i9;
                        case 96:
                            fFld += i5;
                            break;
                        case 97:
                            j = 4018892783215375499L ^ (-29790);
                        case 98:
                            i2 = -141;
                            break;
                        case 99:
                            i6 += (-4936) + (i3 * i3);
                        default:
                            i2 = i6;
                            break;
                    }
                    i3 += 2;
                }
                break;
            case 109:
                lArrFld[((-66) >>> 1) % N] = r0[r1] - 206;
                break;
            default:
                iFld1 |= 6429;
                break;
        }
        FuzzerUtils.out.println("i18 i19 i20 = " + i + "," + i2 + "," + i3);
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i21 l3 i22 = " + 228 + "," + j + "," + printStream);
        PrintStream printStream2 = FuzzerUtils.out;
        printStream2.println("i23 l4 i24 = " + i5 + "," + j2 + "," + printStream2);
        FuzzerUtils.out.println("i25 i26 i27 = " + i7 + "," + i8 + "," + i9);
        FuzzerUtils.out.println("i28 bArr = " + (-141) + "," + FuzzerUtils.checkSum(zArr));
        PrintStream printStream3 = FuzzerUtils.out;
        long j4 = instanceCount;
        int i16 = this.iFld;
        Float.floatToIntBits(fFld);
        printStream3.println("Test.instanceCount iFld Test.fFld = " + j4 + "," + printStream3 + "," + i16);
        PrintStream printStream4 = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        boolean z = bFld;
        int i17 = iFld1;
        printStream4.println("Test.dFld Test.bFld Test.iFld1 = " + doubleToLongBits + "," + printStream4 + "," + z);
        PrintStream printStream5 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        long checkSum2 = FuzzerUtils.checkSum(lArrFld);
        FuzzerUtils.checkSum(byArrFld);
        printStream5.println("Test.iArrFld Test.lArrFld Test.byArrFld = " + checkSum + "," + printStream5 + "," + checkSum2);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
