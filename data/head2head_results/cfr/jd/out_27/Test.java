/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -848163433L;
    public static boolean bFld = false;
    public byte byFld = (byte)80;
    public double dFld = 2.44007;
    public float fFld = 0.586f;
    public static volatile int[][] iArrFld = new int[400][400];
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1() {
        float f = 1.31f;
        float f2 = -112.436f;
        int n = 5;
        int n2 = -4;
        int n3 = 2;
        int n4 = -13626;
        int n5 = 14;
        int n6 = -22709;
        int n7 = 18294;
        int n8 = 98;
        int n9 = 109;
        long[][][] lArray = new long[400][400][400];
        FuzzerUtils.init((Object[][])lArray, (Object)-5L);
        for (f = 7.0f; f < 143.0f; f += 1.0f) {
            f2 -= 231.0f;
            if (bFld) continue;
            n -= n7;
        }
        long[] lArray2 = lArray[(n >>> 1) % 400][(n >>> 1) % 400];
        int n10 = (n >>> 1) % 400;
        lArray2[n10] = lArray2[n10] - (long)f;
        n2 = 1;
        while (++n2 < 208) {
            n |= n;
            Test.iArrFld[n2 + 1][n2 - 1] = n8;
            block13: for (n3 = 1; n3 < 8 && !bFld; ++n3) {
                switch (n3 % 9 + 71) {
                    case 71: {
                        n5 = 1;
                        while (++n5 < 2) {
                            lArray[n3 - 1][n5] = FuzzerUtils.long1array(400, -159L);
                            instanceCount += (long)(n5 * n) + instanceCount - (long)n3;
                            n4 = -37389;
                        }
                        continue block13;
                    }
                    case 72: {
                        n >>= n;
                    }
                    case 73: {
                        n6 -= 168;
                        continue block13;
                    }
                    case 74: {
                        n += n5;
                        continue block13;
                    }
                    case 75: {
                        n6 <<= n3;
                        continue block13;
                    }
                    case 76: {
                        instanceCount = n;
                        continue block13;
                    }
                    case 77: {
                        n4 -= n6;
                        continue block13;
                    }
                    case 78: {
                        continue block13;
                    }
                    case 79: {
                        n4 ^= n9;
                        continue block13;
                    }
                    default: {
                        n += n3 * n3;
                    }
                }
            }
        }
        vMeth1_check_sum += (long)(Float.floatToIntBits(f) + n + Float.floatToIntBits(f2) + n7 + n2 + n8 + n3 + n4 + n5 + n6 + n9) + FuzzerUtils.checkSum((Object[][])lArray);
    }

    public static int iMeth(int n, int n2) {
        int n3 = 11;
        int n4 = -32923;
        int n5 = 70;
        int n6 = 16079;
        int n7 = -10;
        int n8 = -121;
        int n9 = 188;
        double d = -119.36305;
        int n10 = 28811;
        float f = 1.13f;
        int n11 = -119;
        for (n3 = 365; n3 > 20; n3 -= 3) {
            for (n5 = 1; n5 < 14; ++n5) {
                Test.vMeth1();
                d -= (double)n5;
                n2 -= n10;
                n4 *= (int)(f -= (float)(instanceCount += -7L + (long)(n5 * n5)));
                for (n7 = 1; n7 < 2; ++n7) {
                    n6 = (int)((float)n6 + ((float)(n7 * n11) + f - (float)n6));
                    n8 *= (int)instanceCount;
                }
                Test.iArrFld[n3] = iArrFld[n5];
                n4 = (int)((long)n4 + ((long)n5 ^ (long)f));
            }
            try {
                n9 = n7 / n6;
                n8 = -51241 % n2;
                n9 = 141 % n8;
                continue;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
        }
        long l = (long)(n + n2 + n3 + n4 + n5 + n6) + Double.doubleToLongBits(d) + (long)n10 + (long)Float.floatToIntBits(f) + (long)n7 + (long)n8 + (long)n11 + (long)n9;
        iMeth_check_sum += l;
        return (int)l;
    }

    public static void vMeth(byte by, long l) {
        int n = -2362;
        int n2 = 199;
        int n3 = -8;
        int n4 = -238;
        int n5 = 155;
        float f = -82.245f;
        float[] fArray = new float[400];
        long[][] lArray = new long[400][400];
        FuzzerUtils.init(fArray, 41.571f);
        FuzzerUtils.init(lArray, -8630256416136232191L);
        long l2 = instanceCount;
        f -= (float)(n %= (int)(l2 << (int)((float)instanceCount++ - -1.341f) | 1L));
        for (n2 = 1; n2 < 215; ++n2) {
            n = Test.iMeth(n3, n3);
            n3 = n2;
            by = (byte)(by + (byte)((long)n2 + instanceCount));
            n3 >>= n;
            fArray[n2] = l;
            if (bFld) {
                n = -1091308919;
                for (n4 = 1; n4 < 8; n4 += 3) {
                    instanceCount += (long)n5;
                    n = (int)((long)n + ((long)(n4 * n5) + l - (long)n4));
                }
                continue;
            }
            Test.iArrFld[n2 - 1] = iArrFld[n2];
        }
        vMeth_check_sum += (long)by + l + (long)n + (long)Float.floatToIntBits(f) + (long)n2 + (long)n3 + (long)n4 + (long)n5 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(lArray);
    }

    public void mainTest(String[] stringArray) {
        int n = -37312;
        int n2 = 92;
        int n3 = 9;
        int n4 = 8;
        int n5 = 30;
        int n6 = -2;
        int n7 = 27788;
        int n8 = 124;
        int n9 = -7987;
        int n10 = -57;
        int n11 = -48765;
        int n12 = 10;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -59005L);
        for (n = 2; n < 286; ++n) {
            Test.vMeth(this.byFld, instanceCount);
            for (n3 = 4; n3 < 89; ++n3) {
                n4 = (int)instanceCount;
                this.byFld = (byte)(this.byFld >> (byte)n3);
                this.byFld = (byte)(this.byFld + (byte)n4);
                n4 = (int)this.dFld;
                for (n5 = 1; n5 < 2; ++n5) {
                    this.byFld = (byte)instanceCount;
                    try {
                        n6 = 52926 / n6;
                        n6 = n5 / n;
                        n6 /= -218;
                    } catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                    n4 = n6 = (int)((long)n6 + ((long)n5 * instanceCount + (long)n2 - (long)n));
                    this.fFld -= this.fFld;
                    instanceCount = n3;
                    instanceCount -= 29403L;
                    n2 += n5 - n4;
                }
            }
            n4 = (int)this.dFld;
            for (n7 = 1; n7 < 89; ++n7) {
                --instanceCount;
            }
            this.fFld += (float)this.byFld;
            try {
                n6 = n5 / 4;
                Test.iArrFld[n][n - 1] = -12753 % n7;
                n2 = 55656 % n8;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            instanceCount += (long)(n * n);
            this.fFld += (float)(n * n);
        }
        for (n9 = 9; n9 < 263; ++n9) {
            n10 += n9 - n7;
        }
        n8 += 2;
        n4 = 47099;
        for (n11 = 2; n11 < 337; ++n11) {
            lArray[n11 + 1] = instanceCount;
            n10 -= 1045132290;
        }
        FuzzerUtils.out.println("i i1 i22 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i23 i24 i25 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i26 i27 i28 = " + n7 + "," + n8 + "," + n9);
        FuzzerUtils.out.println("i29 i30 i31 = " + n10 + "," + n11 + "," + n12);
        FuzzerUtils.out.println("lArr2 = " + FuzzerUtils.checkSum(lArray));
        FuzzerUtils.out.println("Test.instanceCount Test.bFld byFld = " + instanceCount + "," + (bFld ? 1 : 0) + "," + this.byFld);
        FuzzerUtils.out.println("dFld fFld Test.iArrFld = " + Double.doubleToLongBits(this.dFld) + "," + Float.floatToIntBits(this.fFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, -156);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}
