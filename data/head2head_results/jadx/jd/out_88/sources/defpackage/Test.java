

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_88/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_88/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public byte byFld = -45;
    public double dFld = 0.70946d;
    public static long vSmallMeth_check_sum;
    public static long bMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long instanceCount = -177;
    public static int iFld = -63755;
    public static float fFld = -64.261f;
    public static volatile short sFld = -4165;
    public static int iFld1 = 51;
    public static boolean bFld = true;
    public static boolean bFld1 = false;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(iArrFld, 0);
        FuzzerUtils.init(lArrFld, -9L);
        vSmallMeth_check_sum = 0L;
        bMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }

    public static void vSmallMeth(short s, long j) {
        iFld = iFld + 1;
        vSmallMeth_check_sum += s + j + Float.floatToIntBits(r0);
    }

    public static void vMeth(int i, int i2, int i3) {
        int i4;
        int i5 = 48964;
        float f = 2.627f;
        double[][][] dArr = new double[N][N][N];
        FuzzerUtils.init((Object[][]) dArr, (Object) Double.valueOf(-1.41995d));
        try {
            instanceCount = -19639L;
            i4 = 3;
            while (352 > i4) {
                i2 = sFld;
                f = 1.0f;
                while (true) {
                    float f2 = f + 1.0f;
                    f = f2;
                    if (f2 >= 5.0f) {
                        break;
                    }
                    instanceCount = i;
                    i5 -= i2;
                    i3 += (int) 55.28662d;
                    dArr[i4][(int) (f - 1.0f)][i4] = instanceCount;
                    iFld += i4;
                    if (0 != 0) {
                        break;
                    } else {
                        i5 += (int) (f * i4);
                    }
                }
                int[] iArr = iArrFld;
                int i6 = i4;
                iArr[i6] = iArr[i6] + i2;
                if (0 == 0) {
                    iFld = (int) instanceCount;
                }
                i4++;
            }
        } catch (UserDefinedExceptionTest e) {
            i4 = 3;
            while (352 > i4) {
                i2 = sFld;
                f = 1.0f;
                while (true) {
                    float f3 = f + 1.0f;
                    f = f3;
                    if (f3 >= 5.0f) {
                        break;
                    }
                    instanceCount = i;
                    i5 -= i2;
                    i3 += (int) 55.28662d;
                    dArr[i4][(int) (f - 1.0f)][i4] = instanceCount;
                    iFld += i4;
                    if (0 != 0) {
                        break;
                    } else {
                        i5 += (int) (f * i4);
                    }
                }
                int[] iArr2 = iArrFld;
                int i7 = i4;
                iArr2[i7] = iArr2[i7] + i2;
                if (0 == 0) {
                    iFld = (int) instanceCount;
                }
                i4++;
            }
        } catch (Throwable th) {
            for (int i8 = 3; 352 > i8; i8++) {
                short s = sFld;
                float f4 = 1.0f;
                while (true) {
                    float f5 = f4 + 1.0f;
                    f4 = f5;
                    if (f5 >= 5.0f) {
                        break;
                    }
                    instanceCount = i;
                    i5 -= s;
                    i3 += (int) 55.28662d;
                    dArr[i8][(int) (f4 - 1.0f)][i8] = instanceCount;
                    iFld += i8;
                    if (0 != 0) {
                        break;
                    } else {
                        i5 += (int) (f4 * i8);
                    }
                }
                int[] iArr3 = iArrFld;
                int i9 = i8;
                iArr3[i9] = iArr3[i9] + s;
                if (0 == 0) {
                    iFld = (int) instanceCount;
                }
            }
            throw th;
        }
        vMeth_check_sum += i + i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + Double.doubleToLongBits(55.28662d) + (0 != 0 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum((Object[][]) dArr));
    }

    public static int iMeth(int i, int i2, int i3) {
        int i4 = 42;
        double d = 86.15206d;
        int i5 = 11;
        while (i5 < 332) {
            double d2 = i5;
            while (true) {
                d = d2;
                if (d < 5.0d) {
                    long j = (21956 - instanceCount) - (21956 + i3);
                    int abs = Math.abs(41393);
                    iFld = iFld - 1;
                    instanceCount = j * abs * r2;
                    d2 = d + 1.0d;
                } else {
                    vMeth(21956, 12, iFld1);
                    switch ((i5 % 1) + 36) {
                        case 36:
                            i4 >>= iFld;
                            int i6 = i3 * 10;
                            i3 = (int) instanceCount;
                            break;
                    }
                    i3 *= 5;
                    instanceCount += iFld1;
                    iFld1 <<= i2;
                    if (!bFld) {
                        iArrFld[i5] = (int) instanceCount;
                    }
                    i5++;
                }
            }
        }
        fFld *= (float) instanceCount;
        long doubleToLongBits = i + i2 + i3 + i5 + 21956 + Double.doubleToLongBits(d) + i4 + 10 + Double.doubleToLongBits(2.31837d - d);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static boolean bMeth(boolean z, int i, int i2) {
        int i3 = 43;
        byte b = -71;
        boolean[] zArr = new boolean[N];
        FuzzerUtils.init(zArr, true);
        int i4 = 1;
        while (true) {
            i4++;
            if (i4 >= 374) {
                break;
            }
            i = iArrFld[i4];
            zArr[i4 - 1] = false;
            i2 += (-20063) + (i4 * i4);
            i3 = 1;
            while (i3 < 5) {
                iFld += 0 + (i3 * i3);
                i3++;
            }
            int[] iArr = iArrFld;
            int i5 = iArr[i4];
            float f = fFld;
            fFld = f + 1.0f;
            iArr[i4] = i5 * ((int) f);
            z = true;
            if (1 != 0) {
                long j = (i2 - i) * ((-17292) - (instanceCount << 36));
                short s = (short) (sFld + 1);
                sFld = s;
                int i6 = (int) (j + s);
                int i7 = i6 - ((int) ((-1.77023d) - i6));
                i = i7;
                iFld *= -i7;
            } else if (1 == 0) {
                i2++;
                b = (byte) ((-44749) - Math.min(56619, i2));
            }
            if (bFld1) {
                iFld = (int) (62.43000030517578d - (((-1.77023d) - b) + (fFld - i3)));
                int i8 = iFld + ((int) (-1.77023d));
                iFld = i8;
                instanceCount = (long) (i8 * ((-1.77023d) - i2) * iMeth(-13, iFld, i4));
                i += 57696;
            } else {
                fFld = i;
            }
        }
        long doubleToLongBits = (z ? 1 : 0) + i + i2 + i4 + i3 + 36 + Double.doubleToLongBits(-1.77023d) + b + FuzzerUtils.checkSum(zArr);
        bMeth_check_sum += doubleToLongBits;
        return doubleToLongBits % 2 > 0;
    }

    public void mainTest(String[] strArr) {
        float f = -80.537f;
        int i = 182;
        int i2 = 40700;
        int i3 = 0;
        boolean z = 87;
        int i4 = -1;
        int i5 = -53280;
        int i6 = -13;
        int i7 = -6;
        int i8 = -9;
        int[] iArr = new int[N];
        double d = -57.44107d;
        double[] dArr = new double[N];
        short[] sArr = new short[N];
        FuzzerUtils.init(sArr, (short) 11445);
        FuzzerUtils.init(iArr, 7);
        FuzzerUtils.init(dArr, -112.127712d);
        for (int i9 = 0; i9 < 865; i9++) {
            short s = sArr[(iFld >>> 1) % N];
            int i10 = (iFld >>> 1) % N;
            iArr[i10] = iArr[i10] - 1;
            vSmallMeth(s, (-r3) - (-33661));
        }
        if (bMeth(true, iFld1, iFld)) {
            f = this.byFld;
        } else {
            instanceCount += iFld;
            i = 249;
            while (5 < i) {
                i3 = 3;
                while (i3 < 103) {
                    double d2 = i3;
                    while (true) {
                        d = d2;
                        if (d < 2.0d) {
                            i2 -= 11693;
                            z = 723315989;
                            int[] iArr2 = iArrFld;
                            int i11 = (int) (d - 1.0d);
                            iArr2[i11] = iArr2[i11] - ((int) instanceCount);
                            int[] iArr3 = iArrFld;
                            int i12 = i;
                            iArr3[i12] = iArr3[i12] + iFld;
                            iFld1 -= (int) instanceCount;
                            i4 = i;
                            d2 = d + 1.0d;
                        }
                    }
                    i3++;
                }
                iFld = (int) instanceCount;
                i--;
            }
            i5 = 5;
            while (i5 < 188) {
                i6 = 5;
                while (i6 < 137) {
                    switch ((i5 % 1) * 5) {
                        case 5:
                            fFld += (float) (((i6 * i6) + sFld) - instanceCount);
                            lArrFld = FuzzerUtils.long1array(N, 0L);
                            break;
                    }
                    i7 = 1;
                    while (i7 < 3) {
                        sArr = sArr;
                        fFld += (float) d;
                        i8 += iFld1;
                        i4 += i7;
                        this.dFld -= d;
                        i2 -= iFld1;
                        bFld1 = bFld;
                        i7++;
                    }
                    instanceCount = i;
                    i6 += 2;
                }
                fFld = i7;
                dArr = FuzzerUtils.double1array(N, 0.127794d);
                i5++;
            }
        }
        FuzzerUtils.out.println("f1 i17 i18 = " + Float.floatToIntBits(f) + "," + i + "," + i2);
        FuzzerUtils.out.println("i19 i20 d4 = " + i3 + "," + z + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i21 i22 i23 = " + i4 + "," + i5 + "," + 3);
        FuzzerUtils.out.println("i24 i25 i26 = " + i6 + "," + 2 + "," + i7);
        PrintStream printStream = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(sArr);
        FuzzerUtils.checkSum(iArr);
        printStream.println("i27 sArr iArr = " + i8 + "," + checkSum + "," + printStream);
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        int i13 = iFld;
        byte b = this.byFld;
        printStream2.println("Test.instanceCount Test.iFld byFld = " + j + "," + printStream2 + "," + i13);
        FuzzerUtils.out.println("Test.fFld Test.sFld Test.iFld1 = " + Float.floatToIntBits(fFld) + "," + sFld + "," + iFld1);
        FuzzerUtils.out.println("Test.bFld Test.bFld1 dFld = " + (bFld) + "," + (bFld1) + "," + Double.doubleToLongBits(this.dFld));
        PrintStream printStream3 = FuzzerUtils.out;
        long checkSum2 = FuzzerUtils.checkSum(iArrFld);
        FuzzerUtils.checkSum(lArrFld);
        printStream3.println("Test.iArrFld Test.lArrFld = " + checkSum2 + "," + printStream3);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
