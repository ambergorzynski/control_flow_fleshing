/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 3L;
    public static float fFld = 99.258f;
    public static int iFld = 19015;
    public static boolean bFld = false;
    public static long iMeth_check_sum = 0L;
    public static long vMeth_check_sum = 0L;
    public static long fMeth_check_sum = 0L;

    public static float fMeth(int n) {
        int n2 = -7;
        int n3 = -75;
        int n4 = -4839;
        int n5 = 37147;
        int[] nArray = new int[400];
        long l = -8L;
        long l2 = 42494L;
        float f = 2.919f;
        double d = -1.97873;
        FuzzerUtils.init(nArray, 14314);
        for (n2 = 10; n2 < 203; ++n2) {
            try {
                n3 = 46659 / n2;
                n = n3 % n;
                n3 = -60 / n3;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            n *= (int)instanceCount;
            n4 = 8;
            block10: while (--n4 > 0) {
                for (l = 1L; (long)n2 < l; --l) {
                    n3 *= (int)fFld;
                    n -= (int)instanceCount;
                    fFld += (float)n5;
                    n -= (int)l2;
                }
                switch (n4 % 6 * 5 + 22) {
                    case 35: {
                        fFld += (float)(n4 + n);
                        f = 1.0f;
                        while (true) {
                            float f2;
                            f += 1.0f;
                            if (!(f2 < 1.0f)) continue block10;
                            iFld = -3073;
                            d %= (double)((long)f | 1L);
                        }
                    }
                    case 44: {
                        iFld >>= n5;
                        continue block10;
                    }
                    case 32: {
                        iFld += n4 * n4;
                        continue block10;
                    }
                    case 40: {
                        iFld -= -110630602;
                        continue block10;
                    }
                    case 24: 
                    case 49: {
                        n3 = (int)d;
                        continue block10;
                    }
                }
                d *= (double)f;
            }
        }
        long l3 = (long)(n + n2 + n3 + n4) + l + (long)n5 + l2 + (long)Float.floatToIntBits(f) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(nArray);
        fMeth_check_sum += l3;
        return l3;
    }

    public static void vMeth() {
        int n = 14;
        int n2 = 79;
        int n3 = 16660;
        int n4 = 20;
        float f = -46.686f;
        int n5 = -83;
        long[] lArray = new long[400];
        double[][] dArray = new double[400][400];
        FuzzerUtils.init(lArray, -4L);
        FuzzerUtils.init(dArray, -1.106268);
        for (n = 17; n < 384; ++n) {
            n2 = n2++ >> n2;
            n2 = (int)((long)((float)n5 - f) >>> (int)(107L * lArray[n]));
            f *= (float)n2;
            dArray[n][n + 1] = Test.fMeth(-45421) + -217.0f;
            iFld = n2 = (int)instanceCount;
            for (n3 = 1; 5 > n3; ++n3) {
                n2 = n;
                n2 += n3;
                iFld += n3 - iFld;
                iFld += n5;
                n2 = (int)instanceCount;
                double[] dArray2 = dArray[n3];
                int n6 = n3 - 1;
                dArray2[n6] = dArray2[n6] + (double)instanceCount;
                n4 += n2;
            }
        }
        vMeth_check_sum += (long)(n + n2 + Float.floatToIntBits(f) + n5 + n3 + n4) + FuzzerUtils.checkSum(lArray) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray));
    }

    public static int iMeth(int n) {
        int n2 = -19826;
        int n3 = -72;
        byte[] byArray = new byte[400];
        FuzzerUtils.init(byArray, (byte)7);
        n2 = (short)(--n);
        n2 = (short)(n2 << (short)(--n));
        byArray[207] = (byte)(byArray[207] * -57);
        instanceCount += (long)byArray[207];
        Test.vMeth();
        n = n3;
        long l = (long)(n + n2 + n3) + FuzzerUtils.checkSum(byArray);
        iMeth_check_sum += l;
        return (int)l;
    }

    public void mainTest(String[] stringArray) {
        int n = 17146;
        int n2 = -41160;
        int n3 = 7;
        int n4 = 185;
        int n5 = -15;
        int n6 = -29925;
        int[] nArray = new int[400];
        long l = 33799L;
        double d = -1.129021;
        short s = -25746;
        FuzzerUtils.init(nArray, 38239);
        n *= (int)(-2304L - (long)Test.iMeth(n) - instanceCount - l);
        n *= iFld;
        for (n2 = 9; n2 < 322; ++n2) {
            n4 = 1;
            block5: do {
                if (bFld = false) continue;
                for (d = 1.0; d < 1.0; d += 1.0) {
                    s = -5;
                    l += (long)(d + (double)l);
                    n3 = 1691;
                }
                n5 += n4 * n4;
                l += -27200L;
                switch ((n2 >>> 1) % 2 + 114) {
                    case 114: {
                        if (!bFld) continue block5;
                        break;
                    }
                    case 115: {
                        iFld -= (int)fFld;
                        nArray[n2] = (int)d;
                        break;
                    }
                    default: {
                        if (bFld) {
                            instanceCount += (long)(n4 | iFld);
                            iFld = n;
                            n6 = 1;
                            do {
                                if (!bFld) continue;
                            } while (++n6 < 1);
                            if (!bFld) continue block5;
                            break;
                        }
                        int n7 = n4 + 1;
                        nArray[n7] = nArray[n7] - n4;
                        if (bFld || !bFld) continue block5;
                        n3 += (int)l;
                    }
                }
            } while (++n4 < 80);
        }
        FuzzerUtils.out.println("i l2 i11 = " + n + "," + l + "," + n2);
        FuzzerUtils.out.println("i12 i13 d1 = " + n3 + "," + n4 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i14 s1 i15 = " + n5 + "," + s + "," + n6);
        FuzzerUtils.out.println("iArr1 = " + FuzzerUtils.checkSum(nArray));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + iFld);
        FuzzerUtils.out.println("Test.bFld = " + (bFld ? 1 : 0));
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }

    public static void main(String[] stringArray) {
        try {
            Test test = new Test();
            for (int i = 0; i < 10; ++i) {
                test.mainTest(stringArray);
            }
        } catch (Exception exception) {
            FuzzerUtils.out.println(exception.getClass().getCanonicalName());
        }
    }
}
