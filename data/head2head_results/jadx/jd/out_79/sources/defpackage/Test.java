

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_79/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_79/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long instanceCount = -6;
    public static double dFld = -1.130926d;
    public static volatile byte byFld = 34;
    public static final int N = 400;
    public static float[] fArrFld = new float[N];

    static {
        FuzzerUtils.init(fArrFld, -51.967f);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static int iMeth(int i, int i2) {
        int i3 = 37195;
        int i4 = -6816;
        int i5 = 243;
        int i6 = -7;
        int[] iArr = new int[N];
        float[] fArr = new float[N];
        byte[] bArr = new byte[N];
        long[] jArr = new long[N];
        double[] dArr = new double[N];
        FuzzerUtils.init(bArr, (byte) -90);
        FuzzerUtils.init(jArr, 58027L);
        FuzzerUtils.init(iArr, 23057);
        FuzzerUtils.init(fArr, -125.416f);
        FuzzerUtils.init(dArr, 106.41434d);
        int i7 = 322;
        while (i7 > 3) {
            instanceCount += instanceCount;
            int i8 = i7 - 1;
            bArr[i8] = (byte) (bArr[i8] - ((byte) i2));
            i4 = 1;
            do {
                jArr[i7 - 1] = -2.91f;
                try {
                    int i9 = i7 % 35025;
                    i2 = i3 % 121;
                    i = iArr[i7 + 1] / (-60);
                } catch (ArithmeticException e) {
                }
                i5 = 1;
                do {
                    instanceCount += i5 ^ i7;
                    if (1 == 0) {
                        try {
                            i3 = (-167) % i2;
                            iArr[i7 + 1] = i7 / (-250);
                            i2 %= i3;
                        } catch (ArithmeticException e2) {
                        }
                        switch ((i5 % 10) + 56) {
                            case 56:
                                if (i5 != 0) {
                                }
                                break;
                            case 57:
                                if (1 != 0) {
                                    instanceCount *= i;
                                    instanceCount += i6;
                                }
                            case 58:
                                iArr[i5] = (int) instanceCount;
                                break;
                            case 59:
                                iArr[i5 + 1] = iArr[r1] - 74;
                                break;
                            case 60:
                                int i10 = i4 - 1;
                                fArr[i10] = fArr[i10] * (-7.2264973E18f);
                                break;
                            case 61:
                                int i11 = i4;
                                dArr[i11] = dArr[i11] * i3;
                                break;
                            case 62:
                                i += i6;
                                break;
                            case 63:
                                i6 = i4;
                            case 64:
                                i2 += i5 ^ i6;
                                break;
                            case 65:
                                if (i4 != 0) {
                                }
                            default:
                                if (1 != 0) {
                                }
                                break;
                        }
                    }
                    i5 -= 2;
                } while (i5 > 0);
                i4++;
            } while (i4 < 15);
            i7 -= 3;
        }
        long floatToIntBits = i + i2 + i7 + i3 + i4 + Float.floatToIntBits(-2.91f) + i5 + (1 != 0 ? 1 : 0) + i6 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static void vMeth(int i, int i2) {
        float[] fArr = new float[N];
        int i3 = -2;
        int i4 = -59496;
        int i5 = -39046;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -44467L);
        FuzzerUtils.init(fArr, -8.247f);
        float iMeth = iMeth(i, i) + i2;
        int i6 = i;
        for (long j : jArr) {
            i6 -= i2;
            i3 = 4;
            while (1 < i3 && 1 == 0) {
                switch (((i3 % 2) * 5) + 41) {
                    case 44:
                        i6 -= (int) j;
                        break;
                    case 45:
                        i5 = 1;
                        while (true) {
                            i5++;
                            if (i5 < 2) {
                                byFld = (byte) (byFld + ((byte) ((-10) + (i5 * i5))));
                                fArr[i5] = (float) j;
                                i2 = (i2 - i6) * (-2);
                                if (1 != 0) {
                                    dFld = instanceCount;
                                    i4 += i3;
                                } else if (1 != 0) {
                                    i6 += i5 | i6;
                                } else if (1 != 0) {
                                    dFld *= i3;
                                }
                            }
                        }
                        break;
                    default:
                        i4 = -29864;
                        break;
                }
                i3--;
            }
        }
        vMeth_check_sum += (((((((i6 + i2) + Float.floatToIntBits(iMeth)) + i3) + i4) + (1 != 0 ? 1 : 0)) + i5) - 29864) + FuzzerUtils.checkSum(jArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vSmallMeth(int i) {
        int[][][] iArr = new int[N][N][N];
        FuzzerUtils.init((Object[][]) iArr, (Object) 34872);
        int[] iArr2 = iArr[(i >>> 1) % N][(i >>> 1) % N];
        int i2 = (i >>> 1) % N;
        iArr2[i2] = iArr2[i2] + 1;
        dFld = (-15635) * (r3 + Math.min(i, i));
        vMeth(i, -14);
        vSmallMeth_check_sum += (i - 15635) + FuzzerUtils.checkSum((Object[][]) iArr);
    }

    public void mainTest(String[] strArr) {
        int i = -189;
        int i2 = 0;
        int i3 = -83;
        int i4 = -26657;
        int i5 = 9;
        int i6 = -3;
        int[] iArr = new int[N];
        float f = 1.49f;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -2309178621L);
        FuzzerUtils.init(iArr, -2);
        for (int i7 = 0; i7 < 361; i7++) {
            vSmallMeth(-106);
        }
        int i8 = (-106) - (-106);
        int i9 = 366;
        while (i9 > 5) {
            i2 = 10;
            while (209 > i2) {
                fArrFld[i2 - 1] = i3;
                i4 = 1;
                while (3 > i4) {
                    i5 *= i2;
                    dFld -= 28111.0d;
                    i = i4;
                    i3 |= i4;
                    switch (((i6 >>> 1) % 7) + 45) {
                        case 45:
                            i5 = (int) f;
                            i += 14;
                            break;
                        case 46:
                            i3 += i4;
                            break;
                        case 47:
                            instanceCount += i4;
                            jArr[i2 - 1] = i5;
                            instanceCount = i5;
                            i6 += (int) f;
                            break;
                        case 48:
                            byFld = (byte) (byFld - ((byte) i9));
                            f = -25719.0f;
                            break;
                        case 49:
                            try {
                                i = (-108) / i9;
                                i3 = 49164 % i6;
                                iArr[i4] = i2 % 92;
                            } catch (ArithmeticException e) {
                            }
                            instanceCount -= 179;
                            dFld = i9;
                            iArr[i4] = i3;
                        case 50:
                            if (1 != 0) {
                                int i10 = i2;
                                jArr[i10] = jArr[i10] - i4;
                                instanceCount *= i4;
                                i *= (int) f;
                                i3 += i4;
                            } else if (1 != 0) {
                                instanceCount >>= i8;
                            }
                        case 51:
                            i8 += i4;
                            break;
                        default:
                            i3 += (int) instanceCount;
                            break;
                    }
                    i4 += 2;
                }
                i2 += 2;
            }
            i9 -= 3;
        }
        FuzzerUtils.out.println("i13 i14 i15 = " + i8 + "," + i9 + "," + i);
        FuzzerUtils.out.println("i16 i17 i18 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i19 i20 f2 = " + i5 + "," + i6 + "," + Float.floatToIntBits(f));
        PrintStream printStream = FuzzerUtils.out;
        boolean z = 1 != 0;
        long checkSum = FuzzerUtils.checkSum(jArr);
        FuzzerUtils.checkSum(iArr);
        printStream.println("b2 lArr2 iArr2 = " + z + "," + checkSum + "," + printStream);
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        byte b = byFld;
        printStream2.println("Test.instanceCount Test.dFld Test.byFld = " + j + "," + printStream2 + "," + doubleToLongBits);
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
