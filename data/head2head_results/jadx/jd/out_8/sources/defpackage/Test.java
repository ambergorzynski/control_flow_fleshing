

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_8/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_8/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long iMeth1_check_sum;
    public static long instanceCount = -3639986684759510532L;
    public static boolean bFld = false;
    public static volatile double dFld = -2.4342d;
    public static volatile byte byFld = -62;
    public static short sFld = 9354;
    public static final int N = 400;
    public static float[] fArrFld = new float[N];
    public static double[] dArrFld = new double[N];
    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(fArrFld, -2.872f);
        FuzzerUtils.init(dArrFld, 0.79412d);
        FuzzerUtils.init(iArrFld, 49699);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        iMeth1_check_sum = 0L;
    }

    public void vMeth(int i, short s) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 9860);
        vMeth_check_sum += (Integer.reverseBytes(i) * iArr[(i >>> 1) % N]) + s + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1(int i, double d, short s) {
        int i2 = 32513;
        int i3 = -6;
        int i4 = -1;
        int i5 = -168;
        int[] iArr = new int[N];
        long j = -12;
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, -23.30395d);
        FuzzerUtils.init(iArr, 3);
        int i6 = 17;
        while (i6 < 390) {
            i3 = 1;
            while (i3 < 5) {
                i4 %= i4 | 1;
                long j2 = 2;
                while (true) {
                    j = j2;
                    if (j > 1) {
                        dArr[i6] = i6;
                        j2 = j - 1;
                    } else {
                        switch (((i3 % 1) * 5) + 101) {
                            case 105:
                                i4 = 14469;
                                i2 = -13;
                                if (bFld) {
                                }
                                break;
                            default:
                                int i7 = i3 - 1;
                                iArr[i7] = iArr[i7] | i3;
                                i += i4;
                                break;
                        }
                        byFld = (byte) j;
                        i5 = 2;
                        instanceCount += 2 * 2;
                        i3++;
                    }
                }
            }
            i6++;
        }
        long doubleToLongBits = ((((((((i + Double.doubleToLongBits(d)) + s) + i6) + i2) + i3) + i4) + j) - 13) + i5 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth1(float f) {
        int i = 1477;
        int i2 = -5;
        int i3 = 36;
        int i4 = 206;
        int i5 = 40;
        int[] iArr = new int[N];
        byte b = -117;
        long[][][] jArr = new long[N][N][N];
        FuzzerUtils.init((Object[][]) jArr, (Object) 7441971514106604820L);
        FuzzerUtils.init(iArr, 2126);
        int i6 = 253;
        while (2 < i6) {
            double d = dFld;
            dFld = d + 1.0d;
            int i7 = i + ((int) d);
            long j = instanceCount - 1;
            instanceCount = j;
            byte b2 = b;
            b = (byte) (b - 1);
            int i8 = i7 + ((int) (j * b2));
            int i9 = i8 - 1;
            i = i8 + iMeth1(i6, dFld, (short) -31049);
            i6 -= 3;
        }
        long[] jArr2 = jArr[(i6 >>> 1) % N][(i >>> 1) % N];
        int i10 = (i6 >>> 1) % N;
        jArr2[i10] = jArr2[i10] + i;
        double[] dArr = dArrFld;
        int i11 = (i >>> 1) % N;
        dArr[i11] = dArr[i11] * i6;
        float f2 = 1.0f;
        while (true) {
            float f3 = f2;
            if (f3 < 382.0f) {
                switch ((int) ((f3 % 1.0f) + 40.0f)) {
                    case 40:
                        switch ((int) ((f3 % 9.0f) + 38.0f)) {
                            case 38:
                            case 39:
                                i3 = 1;
                                while (i3 < 12) {
                                    iArr[i3] = 79290671;
                                    i += ((i3 * i6) + i) - (-82);
                                    i4 = 1;
                                    while (i4 < 2 && !bFld) {
                                        i4++;
                                    }
                                    dFld -= i;
                                    i3++;
                                }
                                continue;
                            case 40:
                                f = -82;
                                continue;
                            case 41:
                                i += (int) f3;
                                continue;
                            case 42:
                                if (bFld) {
                                    break;
                                }
                                break;
                            case 43:
                                break;
                            case 44:
                                if (bFld) {
                                }
                                continue;
                            case 45:
                                if (bFld) {
                                }
                                continue;
                            case 46:
                            default:
                                i2 = (int) instanceCount;
                                continue;
                        }
                        i5 = (int) instanceCount;
                        break;
                    default:
                        int i12 = (int) f3;
                        iArr[i12] = iArr[i12] * i;
                        break;
                }
                f2 = f3 + 3.0f;
            } else {
                vMeth1_check_sum += ((((((((Float.floatToIntBits(f) + i6) + i) + b) - 31049) + Float.floatToIntBits(f3)) + i2) + i3) - 82) + i4 + i5 + FuzzerUtils.checkSum((Object[][]) jArr) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
    }

    public static int iMeth() {
        int i = -10;
        int i2 = 106;
        int i3 = -23648;
        int i4 = -11;
        int[] iArr = new int[N];
        double d = 1.1346d;
        long j = 7;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 0L);
        FuzzerUtils.init(iArr, -145);
        int i5 = 14;
        while (i5 < 272) {
            int i6 = ((int) (i + (((i5 * instanceCount) + i5) - i))) + i5;
            int i7 = i5;
            long j2 = jArr[i7] - 1;
            jArr[i7] = j2;
            i = i6 + (-i6) + (i6 ^ ((int) j2));
            if (!bFld) {
                i += (int) fArrFld[(i >>> 1) % N];
                i2 = 1;
                while (i2 < 12) {
                    d += i3;
                    i2++;
                }
                if (i != 0) {
                }
                vMeth1(116.715f);
                switch (50) {
                    case 49:
                        long j3 = 1;
                        while (true) {
                            j = j3;
                            if (j < 12) {
                                i4 += 20516;
                                i = -9;
                                try {
                                    i3 = iArr[i5] % (-224);
                                    int i8 = iArr[(int) (j - 1)] % (-63427);
                                    i4 = i5 % (-9);
                                } catch (ArithmeticException e) {
                                }
                                j3 = j + 1;
                            }
                        }
                        break;
                    case 50:
                        i4 *= (int) instanceCount;
                    case 51:
                        i += i4;
                    case 52:
                        if (bFld) {
                            break;
                        }
                    default:
                        bFld = bFld;
                        break;
                }
            }
            i5 += 2;
        }
        long doubleToLongBits = i5 + i + i2 + i3 + Double.doubleToLongBits(d) + Float.floatToIntBits(116.715f) + j + i4 + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r8) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.mainTest(java.lang.String[]):void");
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
