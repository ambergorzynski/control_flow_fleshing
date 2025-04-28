/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -222L;
    public static double dFld = 0.1006;
    public static byte byFld = (byte)-56;
    public static float fFld = 0.574f;
    public boolean bFld = true;
    public static float[] fArrFld = new float[400];
    public static int[] iArrFld = new int[400];
    public static double[] dArrFld = new double[400];
    public long[] lArrFld = new long[400];
    public static long vSmallMeth_check_sum;
    public static long lMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;

    public static void vSmallMeth(int n, long l, int n2) {
        int n3 = -227;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, 95L);
        lArray[(n2 >>> 1) % 400] = n3 -= (int)(dFld - dFld * (double)byFld);
        vSmallMeth_check_sum += (long)n + l + (long)n2 + (long)n3 + FuzzerUtils.checkSum(lArray);
    }

    public static void vMeth(int n) {
        long l = 6811679157590651669L;
        int n2 = -239;
        int n3 = -15181;
        int n4 = 5;
        boolean bl = true;
        byte[] byArray = new byte[400];
        FuzzerUtils.init(byArray, (byte)17);
        for (double d : dArrFld) {
            block18: for (l = 1L; l < 4L; ++l) {
                n2 += (int)l;
                switch ((int)(l % 1L + 127L)) {
                    case 127: {
                        block19: for (n3 = 1; n3 < 2; ++n3) {
                            byArray[(int)l] = (byte)n2;
                            try {
                                n2 = 210 % n2;
                                n2 = 181 / n2;
                                n2 = 38878 / n3;
                            } catch (ArithmeticException arithmeticException) {
                                // empty catch block
                            }
                            if (bl) continue block18;
                            switch (((n2 >>= n) >>> 1) % 10 * 5 + 42) {
                                case 69: {
                                    int n5 = (int)l;
                                    fArrFld[n5] = fArrFld[n5] * (float)n;
                                    continue block19;
                                }
                                case 68: {
                                    n4 = n3;
                                    instanceCount += (long)n3;
                                    instanceCount += (long)n3;
                                    continue block19;
                                }
                                case 83: {
                                    n2 -= 44977;
                                    continue block19;
                                }
                                case 60: {
                                    byArray[n3 - 1] = 28;
                                    continue block19;
                                }
                                case 75: {
                                    n4 = (int)l;
                                    continue block19;
                                }
                                case 74: {
                                    continue block19;
                                }
                                case 81: {
                                    n = (int)instanceCount;
                                    continue block19;
                                }
                                case 50: {
                                    instanceCount += l;
                                }
                                case 44: {
                                    instanceCount += (long)(n3 * n3);
                                    continue block19;
                                }
                                case 70: {
                                    dFld = n2;
                                    continue block19;
                                }
                                default: {
                                    if (n2 == 0) continue block19;
                                    vMeth_check_sum += (long)n + l + (long)n2 + (long)n3 + (long)n4 + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(byArray);
                                    return;
                                }
                            }
                        }
                        continue block18;
                    }
                }
            }
        }
        vMeth_check_sum += (long)n + l + (long)n2 + (long)n3 + (long)n4 + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(byArray);
    }

    public static int iMeth(byte by, long l, int n) {
        int n2 = -9322;
        int n3 = 11458;
        int n4 = -13;
        int n5 = 52;
        int n6 = 6;
        int n7 = 24328;
        boolean bl = false;
        long[][][] lArray = new long[400][400][400];
        FuzzerUtils.init((Object[][])lArray, (Object)-5179L);
        for (n2 = 7; 123 > n2; ++n2) {
            n4 = 1;
            while (++n4 < 13) {
                long[][][] lArray2 = lArray;
                lArray = lArray2;
                lArray = lArray2;
                lArray = lArray2;
                long[] lArray3 = lArray[n4][n4];
                int n8 = n4;
                long l2 = lArray3[n8];
                lArray3[n8] = l2 + 1L;
                n7 = (short)(n7 * (short)(Math.max(instanceCount--, (long)(fFld + (float)n2)) - l2));
                if (bl) continue;
                n *= (int)fFld;
                for (n5 = 1; n5 < 1; ++n5) {
                    Test.vMeth(n);
                    by = (byte)n2;
                    n6 += 39;
                }
                if (!bl) continue;
                n += n;
                n3 = n2;
                dFld = n6;
                byFld = (byte)(byFld + (byte)n4);
            }
        }
        long l3 = (long)by + l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n7 + (long)(bl ? 1 : 0) + (long)n5 + (long)n6 + FuzzerUtils.checkSum((Object[][])lArray);
        iMeth_check_sum += l3;
        return (int)l3;
    }

    public static long lMeth() {
        long l;
        int n = -136;
        int n2 = 0;
        int n3 = -166;
        int n4 = 144;
        int n5 = -33693;
        int n6 = 8;
        int n7 = 11;
        float f = 2.509f;
        int n8 = 29049;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -7214657139746594802L);
        for (n = 22; n < 385; ++n) {
            l = 9778L;
            byFld = (byte)(byFld - (byte)f);
            int n9 = n;
            int n10 = iArrFld[n9];
            iArrFld[n9] = n10 + 1;
            Test.vSmallMeth(8, (long)(fArrFld[n] * (float)byFld * (float)(instanceCount -= (long)(--n2))), (n + n3) * n2 + n10);
            n2 = (int)(instanceCount-- + (long)(n3 &= (int)(0.0 + Double.longBitsToDouble(instanceCount))));
            switch (((int)((long)n + l) >>> 1) % 1 * 5 + 29) {
                case 33: {
                    Test.vSmallMeth(Integer.reverseBytes(Test.iMeth((byte)-53, instanceCount, n2)), instanceCount, n3);
                    dFld -= (double)f;
                }
            }
            n4 = 1;
            while (++n4 < 5) {
                n2 <<= byFld;
                for (n5 = 1; n5 < 1; ++n5) {
                    instanceCount += 2L;
                    l += (long)n5;
                }
                switch (n % 5 * 5 + 114) {
                    case 131: {
                        n3 %= 2106751523;
                        lArray[n4] = n2;
                        instanceCount += (long)(n4 * n7);
                    }
                    case 120: {
                        n2 = -5;
                        break;
                    }
                    case 136: {
                        n6 += n4 * n8 + n4 - byFld;
                        break;
                    }
                    case 116: 
                    case 126: {
                        int n11 = n + 1;
                        iArrFld[n11] = iArrFld[n11] - n2;
                    }
                }
            }
        }
        l = (long)(n + n2 + Float.floatToIntBits(f) + n3 + n4 + n5 + n6 + n7 + n8) + FuzzerUtils.checkSum(lArray);
        lMeth_check_sum += l;
        return l;
    }

    public void mainTest(String[] stringArray) {
        int n = -77;
        int n2 = 8;
        int n3 = -58680;
        int n4 = 34411;
        int n5 = -44071;
        int n6 = 247;
        int n7 = 12;
        int n8 = -18;
        int n9 = 172;
        int n10 = 0;
        for (int i = 0; i < 721; ++i) {
            Test.vSmallMeth((int)((long)(++n) + Test.lMeth()), instanceCount, n);
        }
        instanceCount = n;
        n2 = 1;
        while (++n2 < 199) {
            block13: for (n3 = n2; n3 < 126; ++n3) {
                n += (int)(31.51f + (float)(n3 * n3));
                for (n5 = 1; n5 < 1; ++n5) {
                    switch ((n >>> 1) % 2 * 5 + 90) {
                        case 95: {
                            n4 *= -190;
                            n -= 156;
                            break;
                        }
                        case 99: {
                            n += n;
                        }
                    }
                    int n11 = n2;
                    this.lArrFld[n11] = this.lArrFld[n11] * (long)n2;
                    n4 *= n5;
                    n4 = n3;
                    n4 = -84038442;
                    n6 = n2;
                    dFld += dFld;
                }
                this.lArrFld[n2 - 1] = instanceCount;
                n4 |= n;
                for (n7 = 1; n7 < 1 && !this.bFld; ++n7) {
                    int n12 = n2;
                    iArrFld[n12] = iArrFld[n12] & (int)instanceCount;
                    if (this.bFld) break;
                    n8 -= (int)fFld;
                    n6 += n;
                }
                switch (n2 % 7 + 61) {
                    case 61: {
                        this.bFld = this.bFld;
                    }
                    case 62: {
                        for (n9 = 1; n9 < 1; n9 += 3) {
                            if (this.bFld) {
                                if (!this.bFld) continue;
                                continue block13;
                            }
                            if (this.bFld) {
                                n10 *= -39693;
                                continue;
                            }
                            if (!this.bFld) continue;
                            fFld -= (float)n7;
                        }
                        continue block13;
                    }
                    case 63: 
                    case 64: {
                        int n13 = n2 - 1;
                        fArrFld[n13] = fArrFld[n13] * fFld;
                    }
                    case 65: 
                    case 66: {
                        fFld += (float)n3;
                    }
                    case 67: {
                        instanceCount += (long)(n3 * n3 + n7 - n8);
                        continue block13;
                    }
                    default: {
                        this.bFld = this.bFld;
                    }
                }
            }
        }
        FuzzerUtils.out.println("i3 i21 i22 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i23 i24 i25 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i26 i27 i28 = " + n7 + "," + n8 + "," + n9);
        FuzzerUtils.out.println("i29 = " + n10);
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.byFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + byFld);
        FuzzerUtils.out.println("Test.fFld bFld Test.fArrFld = " + Float.floatToIntBits(fFld) + "," + (this.bFld ? 1 : 0) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("Test.iArrFld Test.dArrFld lArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(this.lArrFld));
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
        FuzzerUtils.init(fArrFld, 55.606f);
        FuzzerUtils.init(iArrFld, 5);
        FuzzerUtils.init(dArrFld, 2.23233);
        vSmallMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}
