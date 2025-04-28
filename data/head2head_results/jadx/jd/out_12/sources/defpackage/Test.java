

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_12/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_12/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long dMeth_check_sum;
    public static volatile long instanceCount = -8;
    public static float fFld = 0.673f;
    public static short sFld = 14997;
    public static final int N = 400;
    public static volatile int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, -13);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        dMeth_check_sum = 0L;
    }

    public static void vSmallMeth() {
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, 81.137f);
        fArr[((-209) >>> 1) % N] = 73;
        vSmallMeth_check_sum += ((1 != 0 ? 1 : 0) - 209) + 73 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static double dMeth(int i) {
        int i2 = 71;
        int i3 = 251;
        int i4 = 95;
        int i5 = 8;
        int i6 = 1;
        int i7 = -140;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 80);
        int i8 = 206;
        while (i8 > 7) {
            i3 = 1;
            while (i3 < 16) {
                i5 = 1;
                while (i5 < 2 && 0 == 0) {
                    int i9 = i4 >> 34;
                    try {
                        i = i2 / 2119186547;
                        i9 = i8 % 109;
                        i6 = (-38964) / i9;
                    } catch (ArithmeticException e) {
                    }
                    fFld += ((i5 * i3) + i9) - 22346;
                    instanceCount |= instanceCount;
                    try {
                        i2 = 55235 / i9;
                        i6 = (-191) / iArr[i5];
                        i = i3 % i9;
                    } catch (ArithmeticException e2) {
                    }
                    i4 = i9 + i5;
                    instanceCount = i2;
                    i5++;
                }
                i7 = i3;
                while (i7 < 2 && 0 == 0) {
                    iArr[i3 - 1] = i3;
                    double d = 25.60626d - 22346;
                    i7++;
                }
                i3++;
            }
            i8 -= 2;
        }
        long checkSum = ((((((((((i + i8) + i2) + i3) + i4) + i5) + i6) + (0 != 0 ? 1 : 0)) + 22346) + i7) - 6) + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += checkSum;
        return checkSum;
    }

    public static int iMeth(int i, int i2, int i3) {
        int i4 = -30452;
        int i5 = 157;
        int i6 = -6;
        double d = 0.43876d;
        boolean z = true;
        int i7 = 12;
        while (i7 < 234) {
            dMeth(-190);
            instanceCount = instanceCount;
            i4 = 1;
            while (i4 < 7) {
                instanceCount = 8;
                i -= i2;
                d *= i3;
                instanceCount = fFld;
                i4++;
            }
            iArrFld[i7 + 1] = 8;
            if (8 != 0) {
            }
            i2 *= (int) fFld;
            i6 = i7;
            while (i6 < 7) {
                z = z;
                i5 /= (-173) | 1;
                iArrFld[i7] = -1145699105;
                i6++;
            }
            i7++;
        }
        long doubleToLongBits = (((((((((i + i2) + i3) + i7) + 8) + i4) + i5) + Double.doubleToLongBits(d)) + i6) - 173) + (z ? 1 : 0);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth(long j, int i) {
        double d = 41.48848d;
        int i2 = 22765;
        int i3 = -3;
        byte[] bArr = new byte[N];
        long[][] jArr = new long[N][N];
        FuzzerUtils.init(bArr, (byte) -113);
        FuzzerUtils.init(jArr, -3006684251L);
        int iMeth = i - ((int) ((iMeth(i, i, -36517) - i) - 41.48848d));
        int i4 = 1;
        while (true) {
            i4++;
            if (i4 < 212) {
                i2 = 1;
                while (8 > i2) {
                    iMeth = i4 - ((int) d);
                    i3 = iMeth;
                    d *= sFld;
                    bArr[i4 - 1] = (byte) iMeth;
                    sFld = (short) (sFld - ((short) i4));
                    switch (((i4 % 2) * 5) + 126) {
                        case 131:
                            i3 = (int) d;
                            long[] jArr2 = jArr[i4];
                            int i5 = i4 - 1;
                            jArr2[i5] = jArr2[i5] * iMeth;
                            d = i2;
                            iArrFld[i4] = i3;
                            break;
                        case 133:
                            i3 += (int) fFld;
                            break;
                    }
                    i2++;
                }
            } else {
                vMeth_check_sum += j + iMeth + Double.doubleToLongBits(d) + i4 + i2 + i3 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(jArr);
                return;
            }
        }
    }

    public void mainTest(String[] strArr) {
        int i = -5;
        int i2 = 11;
        int i3 = 1;
        int i4 = 8;
        byte b = 1;
        double d = 1.59892d;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 154L);
        int i5 = 6 + 1;
        short s = (short) (1230 * ((short) i5));
        for (int i6 = 0; i6 < 940; i6++) {
            vSmallMeth();
        }
        vMeth(instanceCount, i5);
        iArrFld[(i5 >>> 1) % N] = i5;
        int i7 = i5 - i5;
        int i8 = 8;
        while (298 > i8) {
            int i9 = i8 + 1;
            jArr[i9] = jArr[i9] << i7;
            i2 = 5;
            while (i2 < 87) {
                i4 = 1;
                while (i4 < 2) {
                    if (0 == 0) {
                        instanceCount = i4;
                        fFld = -179.0f;
                        b = (byte) (b + ((byte) d));
                        switch (((i8 >>> 1) % 9) + 29) {
                            case 29:
                                if (0 != 0) {
                                    instanceCount &= instanceCount;
                                    i3 = (int) (i3 + (((i4 * fFld) + i4) - i4));
                                    i = (i * i8) + ((int) fFld);
                                }
                                int[] iArr = iArrFld;
                                int i10 = i2 + 1;
                                iArr[i10] = iArr[i10] << i2;
                                break;
                            case 30:
                                i7 = i8;
                            case 31:
                                i3 -= (int) instanceCount;
                                int i11 = i7 + ((int) instanceCount);
                                i7 = i4;
                                break;
                            case 32:
                                instanceCount = instanceCount;
                                i7 = (int) fFld;
                                try {
                                    iArrFld[i4 - 1] = iArrFld[i4 - 1] % 210;
                                    i7 = 150 / i;
                                    iArrFld[i4 + 1] = (-176) / i7;
                                    break;
                                } catch (ArithmeticException e) {
                                    break;
                                }
                            case 33:
                                instanceCount += i4 | i8;
                                iArrFld[i8 - 1] = sFld;
                                s = (short) (s + ((short) ((-161) + (i4 * i4))));
                                break;
                            case 34:
                                instanceCount += b;
                            case 35:
                                i -= 98;
                                break;
                            case 36:
                                i7 = i;
                                break;
                            case 37:
                                i3 -= i4;
                            default:
                                d = i2;
                                break;
                        }
                    }
                    i4++;
                }
                i2++;
            }
            i8++;
        }
        FuzzerUtils.out.println("s i i24 = " + s + "," + i7 + "," + i8);
        FuzzerUtils.out.println("i25 i26 i27 = " + i + "," + i2 + "," + i3);
        FuzzerUtils.out.println("i28 i29 b3 = " + i4 + "," + 10 + "," + (0 != 0));
        PrintStream printStream = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(d);
        FuzzerUtils.checkSum(jArr);
        printStream.println("by1 d3 lArr1 = " + b + "," + doubleToLongBits + "," + printStream);
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        int floatToIntBits = Float.floatToIntBits(fFld);
        short s2 = sFld;
        printStream2.println("Test.instanceCount Test.fFld Test.sFld = " + j + "," + printStream2 + "," + floatToIntBits);
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
