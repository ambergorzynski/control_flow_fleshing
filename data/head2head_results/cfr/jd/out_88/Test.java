/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 223L;
    public static short sFld = (short)30376;
    public static boolean bFld = false;
    public float fFld = 2.904f;
    public static int[] iArrFld = new int[400];
    public static int[][] iArrFld1 = new int[400][400];
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long vMeth_check_sum;

    public static void vMeth(int n, int n2, long l) {
        float f = 40.358f;
        int n3 = 19752;
        int n4 = -45862;
        int n5 = 208;
        int n6 = 13;
        int n7 = -7804;
        int n8 = 17;
        int n9 = -6779;
        int[] nArray = new int[400];
        double d = -118.57468;
        int n10 = -77;
        FuzzerUtils.init(nArray, -28319);
        n = (int)f;
        Test.iArrFld[(n2 >>> 1) % 400] = 20061;
        n2 -= n2;
        for (n3 = 4; 148 > n3; ++n3) {
            int n11 = n3 + 1;
            nArray[n11] = nArray[n11] + -181;
        }
        for (n5 = 8; n5 < 386; ++n5) {
            n7 = 1;
            while (++n7 < 4) {
                int n12 = n7 + 1;
                iArrFld[n12] = iArrFld[n12] - (int)l;
                for (n8 = n7; n8 < 1; ++n8) {
                    n6 += n8 * n6 + n - n8;
                    n4 = n;
                }
                n6 += (int)instanceCount;
                d *= (double)n10;
                n4 += n7 ^ n7;
                n4 ^= 0x61;
            }
        }
        vMeth_check_sum += (long)(n + n2) + l + (long)Float.floatToIntBits(f) + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + (long)n9 + Double.doubleToLongBits(d) + (long)n10 + FuzzerUtils.checkSum(nArray);
    }

    public static int iMeth1(int n, float f, int n2) {
        int n3 = -14834;
        int n4 = 54;
        int n5 = 62887;
        int n6 = 28760;
        double d = 122.11139;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -4L);
        n3 = 1;
        do {
            n += (int)f;
        } while ((n3 += 3) < 214);
        n = 2;
        for (d = 2.0; d < 253.0; d += 1.0) {
            Test.vMeth(n += Math.min(n2++, n4), 31740, instanceCount);
            Test.iArrFld[(int)(d - 1.0)] = -157;
            n5 = 6;
            while (d < (double)n5) {
                int n7 = (int)(d + 1.0);
                lArray[n7] = lArray[n7] >> n5;
                n6 += n5;
                n6 |= sFld;
                --n5;
            }
        }
        long l = (long)(n + Float.floatToIntBits(f) + n2 + n3) + Double.doubleToLongBits(d) + (long)n4 + (long)n5 + (long)n6 + FuzzerUtils.checkSum(lArray);
        iMeth1_check_sum += l;
        return (int)l;
    }

    public static int iMeth(int n) {
        int n2 = 15341;
        int n3 = 47;
        float f = -2.768f;
        n = (int)((float)Math.abs(n + n) + (float)(n + -70) * ((float)n + 2.103f));
        n2 = 1;
        while (++n2 < 339) {
            n ^= n2 * Test.iMeth1(n, f, -7) + -32566;
            n3 = 1;
            do {
                n -= n3;
            } while (++n3 < 5);
            if (bFld) break;
            try {
                n = n2 / 42;
                n = n2 % 35143;
                n = n3 / 3720;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            instanceCount = n3;
            Test.iArrFld[n2 - 1] = n3;
        }
        n = (int)instanceCount;
        long l = n + n2 + Float.floatToIntBits(f) + n3;
        iMeth_check_sum += l;
        return (int)l;
    }

    /*
     * Unable to fully structure code
     */
    public void mainTest(String[] var1_1) {
        var2_2 = -12;
        var3_3 = 3;
        var4_4 = -23;
        var5_5 = -12744;
        var6_6 = -11;
        var7_7 = -9;
        var8_8 = -27;
        var9_9 = 62481;
        var10_10 = 15144;
        var11_11 = -254;
        var12_12 = -49544;
        var13_13 = 70;
        var14_14 = 6;
        var15_15 = 91;
        var16_16 = 0.123593;
        var18_17 = -100.31237;
        var20_18 = -124;
        var21_19 = new long[400];
        FuzzerUtils.init(var21_19, 3361L);
        v0 = (var2_2 >>> 1) % 400;
        v1 = Test.iArrFld[v0];
        Test.iArrFld[v0] = v1 + 1;
        Test.instanceCount += (long)(-v1);
        for (var16_16 = 16.0; var16_16 < 263.0; var16_16 += 1.0) {
            Test.iMeth(var2_2);
        }
        switch ((var3_3 >>> 1) % 9 * 5 + 112) {
            case 125: {
                Test.instanceCount -= -58L;
                var18_17 = 1.0;
                while (true) {
                    var18_17 += 1.0;
                    if (!(v2 < 216.0)) break;
                    var3_3 += (int)(var18_17 * var18_17);
                    for (var4_4 = 6; var4_4 < 116; ++var4_4) {
                        var5_5 = var2_2;
                    }
                    var5_5 = Test.sFld;
                }
                var5_5 += var3_3;
                var2_2 -= var3_3;
                break;
            }
            case 149: {
                for (var6_6 = 8; 224 > var6_6; ++var6_6) {
                    for (var8_8 = 5; var8_8 < 116; ++var8_8) {
                        try {
                            var7_7 = Test.iArrFld[(var3_3 >>> 1) % 400] % var6_6;
                            var2_2 = var3_3 % -675686514;
                            var3_3 = var7_7 / -2121015539;
                            continue;
                        } catch (ArithmeticException var22_21) {
                            // empty catch block
                        }
                    }
                    block32: for (var10_10 = 2; var10_10 < 116; ++var10_10) {
                        for (var12_12 = 1; var12_12 < 2; ++var12_12) {
                            try {
                                var7_7 = 50260 / var14_14;
                                var5_5 = var9_9 % -54481;
                                var13_13 = -2062419085 % var15_15;
                            } catch (ArithmeticException var22_22) {
                                // empty catch block
                            }
                            Test.iArrFld[var12_12] = -8658;
                            v3 = var12_12 + 1;
                            Test.iArrFld[v3] = Test.iArrFld[v3] | var9_9;
                            var5_5 *= (int)var16_16;
                            var13_13 >>= var2_2;
                            var11_11 *= var10_10;
                            this.fFld += (float)var14_14;
                            Test.sFld = (short)(Test.sFld + (short)var12_12);
                            var14_14 = 115;
                        }
                        switch (var6_6 % 10 * 5 + 122) {
                            case 136: {
                                var3_3 = (int)Test.instanceCount;
                                if (Test.bFld) continue block32;
                                var15_15 *= var7_7;
                            }
                            case 143: {
                                continue block32;
                            }
                            case 144: {
                                Test.iArrFld[var10_10 - 1] = -23;
                                continue block32;
                            }
                            case 156: {
                                this.fFld *= 30980.0f;
                            }
                            case 168: {
                                v4 = var10_10 - 1;
                                Test.iArrFld[v4] = Test.iArrFld[v4] + -12;
                                continue block32;
                            }
                            case 138: {
                                var9_9 >>= (int)Test.instanceCount;
                                continue block32;
                            }
                            case 164: {
                                Test.instanceCount = var4_4;
                                continue block32;
                            }
                            case 169: {
                                this.fFld += this.fFld;
                                continue block32;
                            }
                            case 150: {
                                Test.iArrFld1 = FuzzerUtils.int2array(400, -13);
                                continue block32;
                            }
                            case 148: {
                                Test.sFld = (short)(Test.sFld + (short)(var10_10 | var15_15));
                            }
                            default: {
                                var5_5 <<= -3030;
                            }
                        }
                    }
                }
                break;
            }
            case 154: {
                var2_2 = var9_9;
                break;
            }
            case 129: {
                var3_3 = (int)Test.instanceCount;
            }
            case 113: {
                v5 = (var2_2 >>> 1) % 400;
                var21_19[v5] = var21_19[v5] - 0L;
                break;
            }
            ** case 151:
lbl119:
            // 2 sources

            case 117: {
                Test.instanceCount = var20_18;
                break;
            }
            case 147: {
                var15_15 = var8_8;
                break;
            }
            case 119: 
        }
        FuzzerUtils.out.println("i d i1 = " + var2_2 + "," + Double.doubleToLongBits(var16_16) + "," + var3_3);
        FuzzerUtils.out.println("d3 i20 i21 = " + Double.doubleToLongBits(var18_17) + "," + var4_4 + "," + var5_5);
        FuzzerUtils.out.println("i22 i23 i24 = " + var6_6 + "," + var7_7 + "," + var8_8);
        FuzzerUtils.out.println("i25 i26 i27 = " + var9_9 + "," + var10_10 + "," + var11_11);
        FuzzerUtils.out.println("i28 i29 i30 = " + var12_12 + "," + var13_13 + "," + var14_14);
        FuzzerUtils.out.println("i31 by1 lArr1 = " + var15_15 + "," + var20_18 + "," + FuzzerUtils.checkSum(var21_19));
        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.bFld = " + Test.instanceCount + "," + Test.sFld + "," + (Test.bFld != false ? 1 : 0));
        FuzzerUtils.out.println("fFld Test.iArrFld Test.iArrFld1 = " + Float.floatToIntBits(this.fFld) + "," + FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld1));
        FuzzerUtils.out.println("vMeth_check_sum: " + Test.vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + Test.iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + Test.iMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 37770);
        FuzzerUtils.init(iArrFld1, 238);
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}
