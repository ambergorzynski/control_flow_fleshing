

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_41/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_41/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vSmallMeth_check_sum;
    public static long sMeth_check_sum;
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long instanceCount = 11;
    public static short sFld = 7695;
    public static boolean bFld = false;
    public static final int N = 400;
    public static byte[] byArrFld = new byte[N];
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(byArrFld, (byte) -9);
        FuzzerUtils.init(iArrFld, -5);
        FuzzerUtils.init(lArrFld, -12L);
        vSmallMeth_check_sum = 0L;
        sMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
    }

    public static void vSmallMeth(int i, int i2, boolean z) {
        byArrFld[(i >>> 1) % N] = (byte) (2.91f + (((float) (i * instanceCount)) * (((float) instanceCount) - 2.91f)));
        vSmallMeth_check_sum += i + i2 + (z ? 1 : 0) + Float.floatToIntBits(2.91f);
    }

    public static int iMeth1() {
        long floatToIntBits = Float.floatToIntBits((-2.548f) - ((float) (-60.117033d))) + Double.doubleToLongBits(-60.117033d) + ((-6) % ((int) (instanceCount | 1)));
        iMeth1_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static int iMeth(float f, long j) {
        short reverseBytes = Short.reverseBytes(sFld);
        int i = reverseBytes - (-(reverseBytes - 1));
        int min = i * Math.min(i, 60823);
        int i2 = min;
        sFld = (short) (min - i2);
        int i3 = 8;
        while (i3 < 185) {
            i2 += iMeth1();
            i3++;
        }
        iArrFld[327] = (int) j;
        long floatToIntBits = Float.floatToIntBits(f) + j + i2 + i3 + 5;
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public short sMeth(boolean z) {
        int i;
        int i2 = 11;
        int i3 = -33197;
        int i4 = 4;
        int i5 = (-11) >> ((int) ((iArrFld[((-11) >>> 1) % N] - instanceCount) - (-11)));
        int i6 = 1;
        do {
            int i7 = i5;
            int i8 = i5 - 1;
            i5 = i7;
            int[] iArr = iArrFld;
            int i9 = i6;
            iArr[i9] = iArr[i9] * iMeth(89.48f, instanceCount) * i6 * i6;
            i = 1;
            while (i < 5) {
                i3 = 1;
                while (i3 < 2) {
                    i5 *= i3;
                    i4 = 12;
                    switch ((i6 % 3) + 15) {
                        case 15:
                            if (!z) {
                                i2 += (-11) + (i3 * i3);
                                instanceCount += i5;
                                instanceCount = 12;
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            i5 = i5;
                            i4 = 12 - i6;
                            break;
                        case 17:
                            i5 -= (int) instanceCount;
                            break;
                        default:
                            i4 = i2;
                            break;
                    }
                    i3++;
                }
                i++;
            }
            i6++;
        } while (i6 < 325);
        long floatToIntBits = (z ? 1 : 0) + i5 + i6 + Float.floatToIntBits(89.48f) + i + i2 + i3 + i4;
        sMeth_check_sum += floatToIntBits;
        return (short) floatToIntBits;
    }

    public void mainTest(String[] strArr) {
        int i = 63580;
        int i2 = 25277;
        int i3 = 8;
        int i4 = 47861;
        int i5 = 49124;
        int i6 = 114;
        int i7 = 60302;
        double d = -84.23626d;
        float f = 108.983f;
        float[] fArr = new float[N];
        short[] sArr = new short[N];
        FuzzerUtils.init(fArr, -65.418f);
        FuzzerUtils.init(sArr, (short) 11492);
        for (int i8 = 0; i8 < 792; i8++) {
            i--;
            vSmallMeth(i, (int) (sMeth(bFld) - (-84.23626d)), bFld);
        }
        float f2 = 6.0f;
        while (true) {
            float f3 = f2;
            if (f3 < 297.0f) {
                i3 = 1;
                while (true) {
                    i3++;
                    if (i3 < 86) {
                        d = i2;
                        i4 = 1;
                        while (i4 < 1) {
                            i2 = i2;
                            i4++;
                        }
                        if (bFld) {
                            break;
                        }
                        try {
                            iArrFld[(int) (f3 - 1.0f)] = 44867 / iArrFld[i3 - 1];
                            iArrFld[(int) (f3 + 1.0f)] = i2 % iArrFld[(int) (f3 - 1.0f)];
                            i5 %= -157412944;
                        } catch (ArithmeticException e) {
                        }
                        switch ((int) (((f3 % 9.0f) * 5.0f) + 112.0f)) {
                            case 116:
                                f = i7;
                                i = -32;
                                break;
                            case 130:
                                instanceCount = instanceCount;
                                break;
                            case 134:
                                i -= 12145;
                                break;
                            case 136:
                                i5 *= 250;
                                i >>= i6;
                                bFld = bFld;
                                break;
                            case 148:
                                int[] iArr = iArrFld;
                                int i9 = (int) (f3 - 1.0f);
                                iArr[i9] = iArr[i9] >>> i;
                                break;
                            case 150:
                                i = -32;
                                break;
                            case 151:
                                i -= 17024;
                                break;
                            case 153:
                                instanceCount -= 5685173887424391563L;
                                long[] jArr = lArrFld;
                                int i10 = (int) (f3 - 1.0f);
                                jArr[i10] = jArr[i10] + i3;
                                i6 = 1;
                                while (i6 < 1) {
                                    switch ((i6 % 1) + 125) {
                                        case 125:
                                            instanceCount <<= i3;
                                            int i11 = i7 + 14;
                                            i7 = i6;
                                            break;
                                    }
                                    i5 = (int) (i5 + (i6 | instanceCount));
                                    int i12 = i3 + 1;
                                    fArr[i12] = fArr[i12] + ((float) instanceCount);
                                    int[] iArr2 = iArrFld;
                                    int i13 = (int) f3;
                                    iArr2[i13] = iArr2[i13] - (-94);
                                    f = f + i6 + i6;
                                    i2 += 13554;
                                    if (!bFld) {
                                        instanceCount |= i3;
                                        i2 *= (int) instanceCount;
                                        i6++;
                                    } else {
                                        i7 = (int) f;
                                        i5 *= 250;
                                        i >>= i6;
                                        bFld = bFld;
                                        break;
                                    }
                                }
                                i7 = (int) f;
                                i5 *= 250;
                                i >>= i6;
                                bFld = bFld;
                            case 155:
                                i5 = i3;
                                break;
                            default:
                                sArr[(int) (f3 + 1.0f)] = (short) i4;
                                break;
                        }
                    }
                }
                f2 = f3 + 1.0f;
            } else {
                PrintStream printStream = FuzzerUtils.out;
                long doubleToLongBits = Double.doubleToLongBits(d);
                Float.floatToIntBits(f3);
                printStream.println("i2 d1 f4 = " + i + "," + doubleToLongBits + "," + printStream);
                FuzzerUtils.out.println("i13 i14 i15 = " + i2 + "," + i3 + "," + i4);
                FuzzerUtils.out.println("i16 i17 i18 = " + i5 + "," + i6 + "," + i7);
                FuzzerUtils.out.println("by f5 fArr = " + (-94) + "," + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
                FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));
                PrintStream printStream2 = FuzzerUtils.out;
                long j = instanceCount;
                short s = sFld;
                if (bFld) {
                }
                printStream2.println("Test.instanceCount Test.sFld Test.bFld = " + j + "," + printStream2 + "," + s);
                PrintStream printStream3 = FuzzerUtils.out;
                long checkSum = FuzzerUtils.checkSum(byArrFld);
                long checkSum2 = FuzzerUtils.checkSum(iArrFld);
                FuzzerUtils.checkSum(lArrFld);
                printStream3.println("Test.byArrFld Test.iArrFld Test.lArrFld = " + checkSum + "," + printStream3 + "," + checkSum2);
                FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
                FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
                FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
                FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
