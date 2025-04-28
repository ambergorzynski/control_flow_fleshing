

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_76/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_76/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long lMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static volatile long instanceCount = -3;
    public static double dFld = 98.95974d;
    public static boolean bFld = false;
    public static short sFld = -29133;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static double[] dArrFld = new double[N];
    public static byte[] byArrFld = new byte[N];

    static {
        FuzzerUtils.init(iArrFld, 231);
        FuzzerUtils.init(dArrFld, 0.83597d);
        FuzzerUtils.init(byArrFld, (byte) -67);
        lMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }

    public static void vMeth1(int i, int i2, int i3) {
        int i4 = -230;
        int i5 = -14;
        int i6 = 14;
        int[] iArr = new int[N];
        long j = 215;
        float f = 1.653f;
        FuzzerUtils.init(iArr, 62480);
        double d = (-6.42056d) - i3;
        int i7 = 7;
        while (i7 < 385) {
            j = 1;
            while (true) {
                long j2 = j + 1;
                j = j2;
                if (j2 < 4) {
                    i2 += i3;
                    i5 = 1;
                    while (i5 < 1) {
                        int i8 = i5 + 1;
                        iArr[i8] = iArr[i8] ^ i5;
                        f += (float) j;
                        instanceCount += ((i5 * instanceCount) + instanceCount) - i2;
                        instanceCount <<= i4;
                        instanceCount -= 5032;
                        i4 = (int) ((i4 - 719202029) + i5 + 192);
                        i6 = (i6 - ((int) j)) + i5;
                        i5++;
                    }
                }
            }
            i7++;
        }
        vMeth1_check_sum += i + i2 + i3 + Double.doubleToLongBits(d) + i7 + i4 + j + i5 + i6 + Float.floatToIntBits(f * ((float) j)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {
        int i = 12;
        int i2 = 19050;
        int i3 = -69;
        long[][] jArr = new long[N][N];
        FuzzerUtils.init(jArr, -177L);
        int i4 = 1;
        while (true) {
            i4++;
            if (i4 >= 300) {
                break;
            }
            vMeth1(i4, 6827, i4);
        }
        dFld += i4;
        for (int i5 : iArrFld) {
            i = 1;
            while (true) {
                i++;
                if (i < 4 && !bFld) {
                    jArr[i] = jArr[i];
                    if (bFld) {
                        i2 = i;
                        while (i2 < 1) {
                            iArrFld[i2 + 1] = (int) instanceCount;
                            sFld = sFld;
                            i5 = (int) (i5 + (i2 * i2) + (((i2 * instanceCount) + instanceCount) - i2));
                            instanceCount = ((float) instanceCount) + i2 + 1.268f;
                            i2++;
                        }
                    } else {
                        i3 = -1;
                    }
                }
            }
        }
        vMeth_check_sum += i4 + i + i2 + i3 + Float.floatToIntBits(1.268f) + FuzzerUtils.checkSum(jArr);
    }

    public static long lMeth(float f) {
        int i = 0;
        int i2 = 2;
        long[] jArr = new long[N];
        long[][] jArr2 = new long[N][N];
        float[] fArr = new float[N];
        FuzzerUtils.init(jArr, 1931863716L);
        FuzzerUtils.init(fArr, -43.369f);
        FuzzerUtils.init(jArr2, 1170304343L);
        vMeth();
        instanceCount += instanceCount;
        int i3 = (-27) - ((int) f);
        int i4 = 14;
        while (i4 < 284) {
            i2 = 1;
            while (true) {
                i2++;
                if (i2 < 6) {
                    i += i3;
                    iArrFld[i4 + 1] = -705950624;
                    i3 = (int) (i3 + (((i2 * i) + i4) - f));
                    dArrFld[i4 - 1] = i2;
                    iArrFld = iArrFld;
                    bFld = false;
                    switch ((i2 % 9) + 65) {
                        case 65:
                            int i5 = i3 + 51571;
                            i3 = i5 + (((i2 * i5) + i4) - i);
                            int i6 = i4 - 1;
                            jArr[i6] = jArr[i6] * i2;
                            break;
                        case 66:
                            f = i4;
                            i3 <<= -201;
                            fArr[i4] = 2.358f;
                            break;
                        case 67:
                            i3 <<= -201;
                            fArr[i4] = 2.358f;
                            break;
                        case 68:
                            fArr[i4] = 2.358f;
                            break;
                        case 69:
                            i += 0;
                            break;
                        case 70:
                            f += (float) (((i2 * instanceCount) + instanceCount) - instanceCount);
                            break;
                        case 71:
                            int[] iArr = iArrFld;
                            int i7 = i4;
                            iArr[i7] = iArr[i7] >>> i;
                            break;
                        case 72:
                            i3 -= (int) instanceCount;
                            break;
                        case 73:
                            jArr2 = FuzzerUtils.long2array(N, -143L);
                            break;
                        default:
                            i = 101;
                            break;
                    }
                }
            }
            i4++;
        }
        long floatToIntBits = Float.floatToIntBits(f) + i3 + i4 + i + i2 + FuzzerUtils.checkSum(jArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(jArr2);
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public void mainTest(String[] strArr) {
        int i = 26593;
        int i2 = -250;
        int i3 = -1642;
        int i4 = -3897;
        int i5 = 42261;
        float lMeth = (-26.928f) + ((float) (lMeth(-26.928f) - 61724));
        int i6 = ((-210) >> (-210)) >> 330239241;
        int i7 = 19;
        while (i7 < 360) {
            if (bFld) {
                i6 *= (int) instanceCount;
                dFld *= dFld;
                byArrFld = FuzzerUtils.byte1array(N, (byte) -30);
                i2 = 1;
                do {
                    i3 = 1;
                    while (i3 < 1) {
                        i |= 1204144239;
                        i6 -= (int) instanceCount;
                        i3++;
                    }
                    i5 = 1;
                    while (true) {
                        i5++;
                        if (i5 >= 1) {
                            break;
                        }
                        iArrFld[i2 + 1] = sFld;
                        i4 *= i;
                        sFld = (short) (sFld + ((short) i5));
                        instanceCount += i5;
                    }
                    i6 += i2;
                    int i8 = i4 + (i2 * i2);
                    lMeth = i2;
                    instanceCount >>>= i7;
                    int[] iArr = iArrFld;
                    int i9 = i7 + 1;
                    iArr[i9] = iArr[i9] * i3;
                    i4 <<= i2;
                    i = i8 * i7;
                    i2++;
                } while (i2 < 74);
            } else if (bFld) {
                i6 *= (int) instanceCount;
            } else if (bFld) {
                i = (int) instanceCount;
                lMeth = (float) instanceCount;
            }
            try {
                iArrFld[i7] = i5 / 20189;
                i = i7 % i3;
                i4 = iArrFld[i7 + 1] % 139;
            } catch (ArithmeticException e) {
            }
            i7++;
        }
        FuzzerUtils.out.println("f i16 i17 = " + Float.floatToIntBits(lMeth) + "," + i6 + "," + i7);
        FuzzerUtils.out.println("i18 i19 i20 = " + i + "," + i2 + "," + i3);
        FuzzerUtils.out.println("i21 i22 = " + i4 + "," + i5);
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        if (bFld) {
        }
        printStream.println("Test.instanceCount Test.dFld Test.bFld = " + j + "," + printStream + "," + doubleToLongBits);
        PrintStream printStream2 = FuzzerUtils.out;
        short s = sFld;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld));
        printStream2.println("Test.sFld Test.iArrFld Test.dArrFld = " + s + "," + checkSum + "," + printStream2);
        FuzzerUtils.out.println("Test.byArrFld = " + FuzzerUtils.checkSum(byArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
