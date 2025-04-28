

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_75/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_75/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long instanceCount = 1123347078;
    public static volatile byte byFld = 70;
    public static float fFld = 0.129f;
    public static int iFld = 216;
    public static final int N = 400;
    public static double[] dArrFld = new double[N];

    static {
        FuzzerUtils.init(dArrFld, 63.108622d);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }

    public static void vMeth1(long j, long j2) {
        int i = 19903;
        int i2 = 0;
        int i3 = -107;
        int i4 = -6;
        int[] iArr = new int[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr, 172);
        FuzzerUtils.init(fArr, 82.79f);
        double d = 2.0d;
        while (true) {
            double d2 = d;
            if (d2 < 127.0d) {
                iArr = FuzzerUtils.int1array(N, 6);
                long j3 = j2 - i;
                int i5 = (int) d2;
                fArr[i5] = fArr[i5] + i;
                byFld = (byte) (byFld + 1);
                i2 = 1;
                while (i2 < 13) {
                    i4 = 1;
                    while (i4 < 2) {
                        i3 = -11;
                        i = (int) instanceCount;
                        i4++;
                    }
                    fFld -= 179;
                    i2++;
                }
                j2 = fFld;
                i3 += (int) d2;
                fFld -= i4;
                d = d2 + 1.0d;
            } else {
                vMeth1_check_sum += j + j2 + Double.doubleToLongBits(d2) + i + i2 + i3 + i4 + 179 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
        }
    }

    public static void vMeth(int i) {
        int i2 = 187;
        int i3 = 235;
        int i4 = 156;
        int i5 = -34629;
        short s = 9685;
        vMeth1(instanceCount, instanceCount);
        int i6 = 5;
        while (331 > i6) {
            i3 = 1;
            while (true) {
                i3++;
                if (i3 < 14) {
                    if (0 == 0) {
                        i <<= i;
                        i4 = 1;
                        while (i4 < 1) {
                            s = (short) (s - 14);
                            i5 = ((i5 + (i4 ^ i2)) * i) + ((int) fFld);
                            int i7 = (int) fFld;
                            int i8 = i2 * ((int) instanceCount);
                            instanceCount += i4 ^ instanceCount;
                            i2 = i8 + (((i4 * (-1)) + i6) - i8);
                            i = i7 + i7;
                            i4++;
                        }
                    }
                }
            }
            i6 += 3;
        }
        vMeth_check_sum += (((((((i + i6) + i2) + i3) + (0 != 0 ? 1 : 0)) + i4) + i5) + s) - 1;
    }

    public static int iMeth(int i) {
        int i2 = 4;
        vMeth(i);
        int i3 = i * i;
        int i4 = 270;
        while (true) {
            i4--;
            if (i4 <= 0) {
                break;
            }
            int i5 = (i3 + (((i4 * i3) + i4) - i4)) >> byFld;
            instanceCount = i5;
            try {
                iFld = i4 % (-33512);
                iFld = i4 % iFld;
                i5 = i4 % (-31781);
            } catch (ArithmeticException e) {
            }
            i3 = i5 + i4;
        }
        instanceCount >>= (int) instanceCount;
        int i6 = i3 - 55;
        int i7 = 6;
        while (371 > i7 && 0 == 0) {
            i2 = 150;
            fFld -= (float) instanceCount;
            i7++;
        }
        long j = i6 + i4 + i7 + i2 + 150;
        iMeth_check_sum += j;
        return (int) j;
    }

    public void mainTest(String[] strArr) {
        int i;
        double d;
        long j;
        int i2 = 45957;
        int i3 = 17317;
        int i4 = -40701;
        int i5 = -48491;
        int i6 = 3;
        int i7 = 52077;
        int i8 = 20666;
        int[] iArr = new int[N];
        long j2 = 195;
        long j3 = -4289381791L;
        short s = 28792;
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr, -86);
        FuzzerUtils.init(fArr, 0.386f);
        double d2 = 1.0d;
        do {
            iMeth(iFld);
            iFld *= iFld;
            iFld *= iFld;
            i = (int) d2;
            while (75 > i) {
                fFld -= fFld;
                i2 -= (int) 195;
                i++;
            }
            d = d2 + 1.0d;
            d2 = d;
        } while (d < 336.0d);
        int i9 = 368;
        while (i9 > 10) {
            instanceCount <<= (int) 195;
            instanceCount += 4 + (i9 * i9);
            i9--;
        }
        iFld = 76022876;
        switch ((((17317 >>> 1) % 4) * 5) + 26) {
            case 27:
                j3 = 1;
                do {
                    i4 = 1;
                    do {
                        iFld -= i4;
                        iFld += (int) ((-113.778f) + (i4 * i4));
                        i4++;
                    } while (i4 < 190);
                    j = j3 + 1;
                    j3 = j;
                } while (j < 132);
                i5 = 11;
                while (i5 < 239) {
                    iFld >>= 14477;
                    switch ((i5 % 5) + 106) {
                        case 106:
                            j2 -= 2;
                            break;
                        case 107:
                            i6 = 3;
                            while (110 > i6) {
                                byFld = (byte) (byFld + ((byte) (((i6 * s) + 5) - i4)));
                                i3 = (int) (i3 + (i6 - fFld));
                                i7 = i6 | ((int) j2);
                                i2 += 5;
                                i8 = 1;
                                while (i8 < 2) {
                                    iArr[i5 + 1] = i2;
                                    s = (short) (s + ((short) (i8 * i8)));
                                    instanceCount += i3;
                                    i8++;
                                }
                                i6++;
                            }
                            break;
                        case 108:
                            break;
                        case 109:
                            i3 = i4;
                            break;
                        case 110:
                            fArr = fArr;
                            break;
                        default:
                            iArr[i5 + 1] = (int) 36;
                            break;
                    }
                    i5++;
                }
                break;
            case 32:
                double[] dArr = dArrFld;
                int i10 = (3 >>> 1) % N;
                dArr[i10] = dArr[i10] * 3;
                break;
            case 35:
                int i11 = (5 >>> 1) % N;
                iArr[i11] = iArr[i11] + ((int) (-4289381791L));
                break;
            case 45:
                i7 = 52077;
                break;
            default:
                int i12 = (i9 >>> 1) % N;
                iArr[i12] = iArr[i12] - 13637;
                break;
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("d i17 i18 = " + Double.doubleToLongBits(d2) + "," + printStream + "," + i);
        PrintStream printStream2 = FuzzerUtils.out;
        printStream2.println("l2 i19 i20 = " + j2 + "," + printStream2 + "," + i9);
        PrintStream printStream3 = FuzzerUtils.out;
        printStream3.println("l3 i21 i22 = " + j3 + "," + printStream3 + "," + i4);
        FuzzerUtils.out.println("i23 i24 i25 = " + (-227) + "," + i6 + "," + i7);
        FuzzerUtils.out.println("s1 i26 i27 = " + s + "," + 5 + "," + i8);
        PrintStream printStream4 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(iArr);
        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        printStream4.println("i28 iArr1 fArr1 = " + (-13) + "," + checkSum + "," + printStream4);
        PrintStream printStream5 = FuzzerUtils.out;
        long j4 = instanceCount;
        byte b = byFld;
        Float.floatToIntBits(fFld);
        printStream5.println("Test.instanceCount Test.byFld Test.fFld = " + j4 + "," + printStream5 + "," + b);
        FuzzerUtils.out.println("Test.iFld Test.dArrFld = " + iFld + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
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
