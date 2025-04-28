

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_21/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_21/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public short sFld = 19414;
    public static long byMeth_check_sum;
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long instanceCount = 11;
    public static double dFld = 109.111344d;
    public static float fFld = 2.184f;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(iArrFld, 7359);
        FuzzerUtils.init(lArrFld, -1116910489L);
        byMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static int iMeth(int i, int i2) {
        int i3 = 31341;
        int i4 = -116;
        int i5 = 7386;
        int[] iArr = new int[N];
        long[][] jArr = new long[N][N];
        double[] dArr = new double[N];
        FuzzerUtils.init(iArr, -214);
        FuzzerUtils.init(jArr, 12469L);
        FuzzerUtils.init(dArr, 9.94702d);
        int i6 = 1;
        do {
            try {
                iArr[i6] = 28910 / i2;
                iArr[i6 - 1] = i6 % 1912;
                i = (-1570563024) % i2;
            } catch (ArithmeticException e) {
            }
            iArr[i6 - 1] = (int) 94.675f;
            long[] jArr2 = jArr[i6];
            int i7 = (i6 >>> 1) % N;
            jArr2[i7] = jArr2[i7] >>> 23596;
            i6++;
        } while (i6 < 158);
        int i8 = i2 - i6;
        switch (((i6 >>> 1) % 1) + 69) {
            case 69:
                for (int i9 : iArr) {
                    i3 = 4;
                    while (1 < i3) {
                        i5 = 1;
                        do {
                            int i10 = (int) instanceCount;
                            i8 *= (int) instanceCount;
                            double[] dArr2 = dArr;
                            int i11 = i5 + 1;
                            dArr2[i11] = dArr2[i11] * i10;
                            instanceCount -= (long) dFld;
                            i4 *= i3;
                            dArr = dArr;
                            i5++;
                        } while (i5 < 2);
                        i3--;
                    }
                }
                break;
        }
        long floatToIntBits = i + i8 + i6 + Float.floatToIntBits(94.675f) + i3 + i4 + i5 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static void vMeth(int i, int i2, long j) {
        int i3 = 12060;
        int i4 = -35573;
        int i5 = -5;
        int[][] iArr = new int[N][N];
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, 0.263f);
        FuzzerUtils.init(iArr, 12197);
        iMeth(i2, i2);
        int i6 = i2 * i2;
        instanceCount = fFld;
        int i7 = 5;
        while (i7 < 184) {
            j = 44;
            i4 = 1;
            do {
                int i8 = (i6 >>> 1) % N;
                fArr[i8] = fArr[i8] * 114.0f;
                i4++;
            } while (i4 < 9);
            iArr = FuzzerUtils.int2array(N, -87);
            i7++;
        }
        int[] iArr2 = iArr[(12060 >>> 1) % N];
        int i9 = (i >>> 1) % N;
        iArr2[i9] = iArr2[i9] - (-6870);
        instanceCount += i7;
        int i10 = (int) j;
        int i11 = 6;
        while (i11 < 187) {
            i5 = 1;
            while (true) {
                i5++;
                if (i5 < 9) {
                    try {
                        iArr[i11 + 1][i5 - 1] = (-40010) % i7;
                        i6 = i4 / i4;
                        i3 = i5 / 4590;
                    } catch (ArithmeticException e) {
                    }
                    i10 *= i11;
                }
            }
            i11++;
        }
        vMeth_check_sum += ((((((((i10 + i6) + j) + i7) + i3) + i4) - 6870) + i11) - 42) + i5 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static byte byMeth(int i, int i2, int i3) {
        int i4 = -191;
        int i5 = -13;
        int i6 = 0;
        int abs = i3 >> ((int) ((-13) - ((i3 * 3) * Math.abs(i2))));
        vMeth(i2, 1, 241L);
        int i7 = 10;
        while (i7 < 255) {
            switch ((i7 % 10) + 75) {
                case 75:
                    abs = -5;
                    instanceCount = 44L;
                    i4 = 7;
                    while (i4 > 1) {
                        iArrFld[i7] = (int) dFld;
                        i += i4 - 5;
                        instanceCount += instanceCount;
                        lArrFld = FuzzerUtils.long1array(N, -3644002736018853046L);
                        if (1 != 0) {
                            i6 = 1;
                            do {
                                instanceCount = i4;
                                i5 >>= (int) instanceCount;
                                i6++;
                            } while (i6 < 2);
                        }
                        i4--;
                    }
                    continue;
                case 76:
                    i5 += i7;
                    continue;
                case 77:
                    i <<= i4;
                    break;
                case 79:
                case 80:
                    try {
                        int i8 = i7 / 48;
                        int i9 = i5 / iArrFld[i7 + 1];
                        abs = i % iArrFld[i7];
                        continue;
                    } catch (ArithmeticException e) {
                        break;
                    }
                case 81:
                    i += (int) instanceCount;
                    continue;
                case 82:
                    i += (int) instanceCount;
                    continue;
                case 83:
                    instanceCount -= instanceCount;
                    continue;
                case 84:
                    instanceCount <<= i;
                    continue;
            }
            dFld += i7;
            i7++;
        }
        long j = ((((i + i2) + abs) + i7) - 5) + i4 + i5 + i6 + (1 != 0 ? 1 : 0);
        byMeth_check_sum += j;
        return (byte) j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void mainTest(String[] strArr) {
        int i = -60145;
        int i2 = 17355;
        int i3 = 123;
        int i4 = 23090;
        int i5 = -4;
        int i6 = 224;
        double d = 1.123119d;
        long j = -2980827217L;
        int i7 = 7;
        while (i7 < 397) {
            instanceCount += byMeth(i7, -60145, 14);
            double d2 = 1.0d;
            while (true) {
                d = d2;
                if (d < 65.0d) {
                    i2 = i2;
                    d2 = d + 1.0d;
                }
            }
            i7++;
        }
        byte b = (byte) ((-84) / ((byte) (instanceCount | 1)));
        boolean z = true;
        int i8 = i2 - 60145;
        instanceCount = instanceCount;
        int i9 = 8;
        while (i9 < 229) {
            switch ((i9 % 8) + 36) {
                case 36:
                    i8 += i9;
                case 37:
                    i4 = 114;
                    while (4 < i4) {
                        i6 = 2;
                        do {
                            if (z) {
                                switch (((i4 % 2) * 5) + 63) {
                                    case 69:
                                        fFld += (float) (((i6 * i7) + j) - i4);
                                        i3 = i8;
                                        break;
                                    case 70:
                                        int[] iArr = iArrFld;
                                        int i10 = i6 + 1;
                                        iArr[i10] = iArr[i10] + 7;
                                        if (!z) {
                                            this.sFld = (short) (this.sFld + ((short) (i6 * j)));
                                            break;
                                        }
                                        break;
                                }
                                i6 -= 2;
                            } else if (z) {
                                int i11 = i + (i6 * i6);
                            } else {
                                int i12 = i + (i6 * this.sFld);
                            }
                            i = (int) fFld;
                            i5 = i9;
                            lArrFld[i6 + 1] = 200;
                            instanceCount += ((i6 * i4) + i3) - i;
                            i6 -= 2;
                        } while (i6 > 0);
                        i4--;
                    }
                    break;
                case 38:
                case 39:
                    i8 -= i5;
                    break;
                case 40:
                    z = z;
                    break;
                case 41:
                    i3 *= 6;
                case 42:
                    j -= instanceCount;
                    break;
                case 43:
                    i8 &= i;
                    break;
            }
            i9++;
        }
        FuzzerUtils.out.println("i i1 d = " + i7 + "," + i + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i25 by b1 = " + i8 + "," + b + "," + (z));
        FuzzerUtils.out.println("i26 i27 i28 = " + i9 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i29 i30 l1 = " + i5 + "," + i6 + "," + j);
        PrintStream printStream = FuzzerUtils.out;
        long j2 = instanceCount;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        Float.floatToIntBits(fFld);
        printStream.println("Test.instanceCount Test.dFld Test.fFld = " + j2 + "," + printStream + "," + doubleToLongBits);
        PrintStream printStream2 = FuzzerUtils.out;
        short s = this.sFld;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        FuzzerUtils.checkSum(lArrFld);
        printStream2.println("sFld Test.iArrFld Test.lArrFld = " + s + "," + checkSum + "," + printStream2);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
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
