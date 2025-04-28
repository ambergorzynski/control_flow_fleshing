/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -8124L;
    public static volatile float fFld = 2.257f;
    public static volatile boolean bFld = false;
    public static long[] lArrFld = new long[400];
    public static int[][] iArrFld = new int[400][400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long iMeth_check_sum;

    public static int iMeth() {
        int n = 0;
        int n2 = 15466;
        int n3 = -63763;
        int n4 = 7;
        int n5 = 17444;
        int n6 = -62784;
        int[] nArray = new int[400];
        double d = -23.15034;
        double d2 = 1.101989;
        double[] dArray = new double[400];
        FuzzerUtils.init(dArray, 74.46258);
        FuzzerUtils.init(nArray, 4);
        int n7 = (n >>> 1) % 400;
        dArray[n7] = dArray[n7] - (double)n;
        n2 = 1;
        do {
            n3 = 1;
            block5: do {
                nArray[n3] = -78;
                switch (n3 % 2 + 5) {
                    case 5: {
                        int n8 = n3 + 1;
                        lArrFld[n8] = lArrFld[n8] * 7806L;
                        for (n4 = 1; n4 > 1; --n4) {
                            n *= n3;
                        }
                        continue block5;
                    }
                    case 6: {
                        fFld = n5;
                        fFld = n5;
                        for (d = 1.0; d < 1.0; d += 1.0) {
                            n = n3;
                            if (bFld) continue;
                            int n9 = n3 - 1;
                            lArrFld[n9] = lArrFld[n9] - instanceCount;
                            d2 *= (double)fFld;
                        }
                    }
                }
            } while (++n3 < 6);
        } while (++n2 < 267);
        long l = (long)(n + n2 + n3 + n4 + n5) + Double.doubleToLongBits(d) + (long)n6 + Double.doubleToLongBits(d2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray)) + FuzzerUtils.checkSum(nArray);
        iMeth_check_sum += l;
        return (int)l;
    }

    public static void vMeth1(int n, int n2) {
        int n3 = -59923;
        Test.iMeth();
        n3 = 1;
        do {
            n *= n3;
        } while (++n3 < 222);
        n2 = n3;
        fFld = instanceCount;
        vMeth1_check_sum += (long)(n + n2 + n3);
    }

    public static void vMeth(long l, int n) {
        double d = -118.61263;
        int n2 = -27991;
        float f = -101.971f;
        int n3 = 51777;
        int n4 = 55289;
        int n5 = -17;
        int n6 = -65273;
        int[] nArray = new int[400];
        boolean[] blArray = new boolean[400];
        long[][][] lArray = new long[400][400][400];
        FuzzerUtils.init(blArray, true);
        FuzzerUtils.init((Object[][])lArray, (Object)-3149553671L);
        FuzzerUtils.init(nArray, -9722);
        blArray[(n >>> 1) % 400] = d == (double)((float)((long)n2 + instanceCount) + f);
        for (n3 = 16; n3 < 360; ++n3) {
            long[] lArray2 = lArray[n3][n3 - 1];
            int n7 = n3 - 1;
            lArray2[n7] = lArray2[n7] + (long)((float)l + (float)(l *= 1L) * ((f *= (float)Integer.reverseBytes(--n)) * (float)n));
            n = (int)((double)n-- - (d - d + (double)l));
            Test.vMeth1(-110, n);
            for (n5 = n3; 5 > n5; ++n5) {
                n -= n;
                if (bFld) continue;
                n >>= n2;
                n = 34290;
                n6 = (int)f;
                n6 += n5 * n3 + n4 - n3;
                l = n4;
            }
        }
        vMeth_check_sum += l + (long)n + Double.doubleToLongBits(d) + (long)n2 + (long)Float.floatToIntBits(f) + (long)n3 + (long)n4 + (long)n5 + (long)n6 + FuzzerUtils.checkSum(blArray) + FuzzerUtils.checkSum((Object[][])lArray) + FuzzerUtils.checkSum(nArray);
    }

    public void mainTest(String[] stringArray) {
        int n = 0;
        int n2 = -8;
        int n3 = -234;
        int n4 = 12;
        int n5 = 9;
        int n6 = -10;
        int n7 = -167;
        int n8 = -19700;
        int[] nArray = new int[400];
        double d = -49.65758;
        double d2 = -2.8471;
        short s = -1047;
        long l = -792899021L;
        FuzzerUtils.init(nArray, -18681);
        Test.vMeth(instanceCount, n);
        for (n2 = 2; 192 > n2; ++n2) {
            for (d = 2.0; d < 132.0; d += 1.0) {
                n4 *= n3;
                instanceCount = s;
                nArray[n2 - 1] = n;
                Test.iArrFld[n2 - 1][n2 + 1] = n2;
                n4 ^= n3;
                d2 -= 14801.0;
                n -= (n4 *= s);
            }
            for (n5 = 2; 132 > n5; ++n5) {
                fFld *= (float)instanceCount;
                for (l = (long)n5; l < 2L; ++l) {
                    try {
                        n4 = 145363827 % n3;
                        n3 /= 7650;
                        n = n5 / n6;
                    } catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                    n3 = 6;
                    n7 -= n3;
                    d2 -= (double)n6;
                    instanceCount += 88L;
                    if (bFld) {
                        // empty if block
                    }
                    n6 = n7;
                }
                n8 = 1;
                do {
                    int n9 = n2 + 1;
                    lArrFld[n9] = lArrFld[n9] - (long)n3;
                    int n10 = n2 + 1;
                    nArray[n10] = nArray[n10] * (int)d2;
                } while (++n8 < 2);
                n4 += n5;
                n4 += n6;
            }
        }
        FuzzerUtils.out.println("i14 i15 i16 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("d3 i17 s1 = " + Double.doubleToLongBits(d) + "," + n4 + "," + s);
        FuzzerUtils.out.println("d4 i18 i19 = " + Double.doubleToLongBits(d2) + "," + n5 + "," + n6);
        FuzzerUtils.out.println("l1 i20 i21 = " + l + "," + n7 + "," + n8);
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(nArray));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.lArrFld Test.iArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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

    static {
        FuzzerUtils.init(lArrFld, 29993846378912797L);
        FuzzerUtils.init(iArrFld, 11487);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        iMeth_check_sum = 0L;
    }
}
