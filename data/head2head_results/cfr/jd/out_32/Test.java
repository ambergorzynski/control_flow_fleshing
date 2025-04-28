/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -1127780107L;
    public static byte byFld = (byte)-84;
    public static int iFld = -82;
    public double dFld = -119.49838;
    public int[][] iArrFld = new int[400][400];
    public float[] fArrFld = new float[400];
    public volatile short[] sArrFld = new short[400];
    public long[] lArrFld = new long[400];
    public static long vMeth_check_sum = 0L;
    public static long vMeth1_check_sum = 0L;
    public static long fMeth_check_sum = 0L;

    public static float fMeth(int n) {
        int n2 = 36579;
        int n3 = 189;
        int n4 = 38;
        int n5 = 45204;
        int n6 = -11832;
        int[] nArray = new int[400];
        float f = -1.672f;
        long[] lArray = new long[400];
        FuzzerUtils.init(nArray, -36922);
        FuzzerUtils.init(lArray, 244L);
        n2 = 315;
        do {
            instanceCount ^= 0xFFFFFFFFFFFFFFB9L;
            f += (float)(18627 + n2 * n2);
            int n7 = n2;
            nArray[n7] = nArray[n7] >> n2;
            for (n3 = 1; n3 < 5; ++n3) {
                for (n5 = 1; n5 < 2; ++n5) {
                    int n8 = n2 + 1;
                    lArray[n8] = lArray[n8] - (long)n2;
                    n += 11 + n5 * n5;
                    n6 *= 22512;
                    switch (n2 % 1 + 125) {
                        case 125: {
                            int n9 = n3;
                            nArray[n9] = nArray[n9] ^ n5;
                            n6 = n5;
                            n4 = -2;
                            instanceCount -= 2L;
                        }
                    }
                    f += -27.10441f;
                }
            }
        } while (--n2 > 0);
        long l = (long)(n + n2 + Float.floatToIntBits(f) + n3 + n4 + n5 + n6) + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(lArray);
        fMeth_check_sum += l;
        return l;
    }

    /*
     * Unable to fully structure code
     */
    public static void vMeth1() {
        var0 = 37526;
        var1_1 = 3;
        var2_2 = -61871;
        var3_3 = 3;
        var4_4 = -8;
        var5_5 = 11301;
        var6_6 = 172;
        var7_7 = new int[400];
        var8_8 = 1.657f;
        var9_9 = new float[400];
        var10_10 = -108.25435;
        var12_11 = 23994;
        var13_12 = new long[400];
        var14_13 = new boolean[400];
        FuzzerUtils.init(var13_12, -40619L);
        FuzzerUtils.init(var7_7, -171);
        FuzzerUtils.init(var9_9, -119.639f);
        FuzzerUtils.init(var14_13, true);
        for (var0 = 202; var0 > 8; --var0) {
            var1_1 += (int)(var8_8 -= 1.0f);
            for (var2_2 = 8; var2_2 > 1; --var2_2) {
                var15_14 = false;
                v0 = (float)((long)(var3_3 + var2_2) - (Test.instanceCount + (long)var1_1)) > var8_8;
                if (!var15_14) ** GOTO lbl-1000
                v1 = var0 - 1;
                v2 = var13_12[v1];
                var13_12[v1] = v2 + 1L;
                if ((long)(++var1_1) == v2) {
                    v3 = true;
                } else lbl-1000:
                // 2 sources

                {
                    v3 = false;
                }
                if (v0 != v3) continue;
                var8_8 *= (float)var10_10;
                block13: for (var4_4 = 1; 2 > var4_4; ++var4_4) {
                    v4 = var2_2 - 1;
                    v5 = var2_2 + 1;
                    v6 = var13_12[v5] + 1L;
                    var13_12[v5] = v6;
                    var13_12[v4] = var13_12[v4] * (long)(var10_10 * (double)Test.instanceCount + (var10_10 - 22.0) - (double)(v6 - (long)var6_6++));
                    Test.instanceCount <<= var7_7[var4_4 - 1];
                    var12_11 = (short)(var12_11 * (short)Integer.reverseBytes(var5_5));
                    Test.instanceCount -= (long)var8_8;
                    switch ((-227 * var6_6 >>> 1) % 7 * 5 + 118) {
                        case 150: {
                            var13_12[var4_4 + 1] = var1_1;
                            v7 = var0 - 1;
                            var9_9[v7] = var9_9[v7] - ((float)((long)Integer.reverseBytes(var6_6) + Long.reverseBytes(Test.instanceCount)) - (Test.fMeth(-46463) - 28.0f));
                            Test.byFld = (byte)-70;
                            continue block13;
                        }
                        case 149: {
                            var10_10 -= (double)var6_6;
                            continue block13;
                        }
                        case 133: {
                            Test.instanceCount += (long)(11 + var4_4 * var4_4);
                        }
                        case 121: {
                            try {
                                var7_7[var4_4] = var0 % -45;
                                var1_1 = var5_5 / 77;
                                var6_6 = var1_1 % var1_1;
                            } catch (ArithmeticException var16_15) {}
                            continue block13;
                        }
                        case 120: {
                            var14_13[var4_4 - 1] = var15_14;
                            continue block13;
                        }
                        case 145: {
                            var5_5 = (int)Test.instanceCount;
                            continue block13;
                        }
                        case 140: {
                            var12_11 = (short)(var12_11 + (short)var4_4);
                            continue block13;
                        }
                        default: {
                            var5_5 &= var2_2;
                        }
                    }
                }
            }
        }
        Test.vMeth1_check_sum += (long)(var0 + var1_1 + Float.floatToIntBits(var8_8) + var2_2 + var3_3) + Double.doubleToLongBits(var10_10) + (long)var4_4 + (long)var5_5 + (long)var6_6 + (long)var12_11 + FuzzerUtils.checkSum(var13_12) + FuzzerUtils.checkSum(var7_7) + Double.doubleToLongBits(FuzzerUtils.checkSum(var9_9)) + FuzzerUtils.checkSum(var14_13);
    }

    public void vMeth(long l, int n) {
        Test.vMeth1();
        vMeth_check_sum += l + (long)n;
    }

    /*
     * Unable to fully structure code
     */
    public void mainTest(String[] var1_1) {
        var2_2 = -106;
        var3_3 = 39443;
        var4_4 = 45;
        var5_5 = 132;
        var6_6 = 60510;
        var7_7 = 36950;
        var8_8 = -11;
        var9_9 = new int[400];
        var10_10 = 0.917f;
        var11_11 = -28904;
        var12_12 = false;
        var13_13 = new boolean[400];
        var14_14 = -64;
        FuzzerUtils.init(var9_9, -228);
        FuzzerUtils.init(var13_13, true);
        this.vMeth(Test.instanceCount, Test.iFld);
        var2_2 = 1;
        while (++var2_2 < 236) {
            this.iArrFld = this.iArrFld;
            for (var3_3 = 1; var3_3 < 106; ++var3_3) {
                var10_10 += (float)(var3_3 * var3_3) + var10_10 - (float)var11_11;
                Test.iFld += var3_3 ^ var4_4;
                Test.iFld >>= Test.iFld;
            }
            for (var5_5 = 106; var5_5 > 5; var5_5 -= 2) {
                block89: for (var7_7 = 1; var7_7 < 3; ++var7_7) {
                    var15_15 = false;
                    v0 = var7_7;
                    this.fArrFld[v0] = this.fArrFld[v0] * (float)Test.byFld;
                    this.iArrFld[var5_5][var2_2] = var4_4;
                    switch (var2_2 + 19) {
                        case 19: {
                            var8_8 <<= (int)Test.instanceCount;
                            try {
                                var6_6 = var2_2 % -19;
                                var8_8 = var7_7 % 277178766;
                                var8_8 = this.iArrFld[var7_7 - 1][var2_2] % this.iArrFld[var5_5][var5_5 - 1];
                            } catch (ArithmeticException var16_17) {
                                // empty catch block
                            }
                            var4_4 *= var5_5;
                            continue block89;
                        }
                        case 20: {
                            switch (var2_2 % 9 * 5 + 73) {
                                case 98: 
                                case 115: {
                                    var4_4 += Test.iFld;
                                    break;
                                }
                                case 94: {
                                    var8_8 -= (int)var10_10;
                                    var4_4 = 200;
                                    break;
                                }
                                case 81: {
                                    var10_10 -= (float)var8_8;
                                    var11_11 = (short)var6_6;
                                    Test.instanceCount <<= (int)Test.instanceCount;
                                    break;
                                }
                                case 79: {
                                    Test.iFld = (int)Test.instanceCount;
                                    try {
                                        var6_6 = -29052 % var8_8;
                                        var8_8 = var3_3 / var7_7;
                                        var4_4 = var5_5 / this.iArrFld[var5_5 + 1][var7_7 + 1];
                                    } catch (ArithmeticException var16_18) {
                                        // empty catch block
                                    }
                                }
                                case 117: {
                                    var8_8 <<= var7_7;
                                    Test.byFld = (byte)(Test.byFld - (byte)var5_5);
                                    this.dFld = -1.1031;
                                    if (!var12_12) break;
                                    break;
                                }
                                case 80: {
                                    var8_8 |= (int)Test.instanceCount;
                                }
                                case 105: {
                                    var4_4 = var6_6;
                                    break;
                                }
                                case 118: {
                                    var12_12 = false;
                                }
                            }
                        }
                        case 21: {
                            var8_8 %= var3_3 | 1;
                            continue block89;
                        }
                        case 22: {
                            var6_6 = var5_5;
                        }
                        case 23: {
                            this.sArrFld[var2_2 - 1] = (short)var8_8;
                            continue block89;
                        }
                        case 24: {
                            Test.instanceCount &= Test.instanceCount;
                            continue block89;
                        }
                        case 25: {
                            var4_4 = var11_11;
                        }
                        case 26: {
                            Test.iFld -= Test.iFld;
                            continue block89;
                        }
                        case 27: {
                            var10_10 -= -22.829f;
                            continue block89;
                        }
                        case 28: {
                            Test.instanceCount -= (long)var8_8;
                            continue block89;
                        }
                        case 29: {
                            var4_4 = Test.iFld;
                            continue block89;
                        }
                        case 30: {
                            var10_10 -= (float)var2_2;
                        }
                        case 31: {
                            var6_6 += 6 + var7_7 * var7_7;
                            continue block89;
                        }
                        case 32: {
                            var8_8 += var7_7 * var6_6;
                        }
                        case 33: {
                            Test.iFld = (int)this.dFld;
                            continue block89;
                        }
                        case 34: {
                            var4_4 += (int)(-125.163f + (float)(var7_7 * var7_7));
                            continue block89;
                        }
                        case 35: {
                            var10_10 += (float)(var7_7 * var5_5);
                            continue block89;
                        }
                        case 36: {
                            var6_6 = (int)Test.instanceCount;
                            continue block89;
                        }
                        case 37: {
                            var8_8 &= (int)Test.instanceCount;
                            continue block89;
                        }
                        case 38: {
                            var8_8 = Test.iFld;
                            continue block89;
                        }
                        case 39: {
                            var6_6 = (int)((float)var6_6 + ((float)var7_7 * var10_10 + (float)Test.iFld - (float)Test.instanceCount));
                            continue block89;
                        }
                        case 40: {
                            this.iArrFld[var7_7 - 1] = this.iArrFld[var5_5];
                            continue block89;
                        }
                        case 41: {
                            this.dFld = var8_8;
                        }
                        case 42: {
                            Test.instanceCount *= Test.instanceCount;
                            continue block89;
                        }
                        case 43: {
                            this.dFld = Test.instanceCount;
                            continue block89;
                        }
                        case 44: {
                            var10_10 = var2_2;
                            continue block89;
                        }
                        case 45: 
                        case 46: 
                        case 47: {
                            Test.byFld = (byte)(Test.byFld + (byte)(43436 + var7_7 * var7_7));
                            continue block89;
                        }
                        case 48: {
                            Test.instanceCount = var6_6;
                            continue block89;
                        }
                        case 49: {
                            Test.instanceCount = var6_6;
                            continue block89;
                        }
                        case 50: {
                            var6_6 = (int)((long)var6_6 + ((long)(var7_7 * var5_5) + Test.instanceCount - Test.instanceCount));
                        }
                        case 51: {
                            var4_4 += var7_7 * var7_7;
                        }
                        case 52: {
                            this.iArrFld[var2_2] = this.iArrFld[var5_5];
                            continue block89;
                        }
                        case 53: {
                            var6_6 += var7_7;
                            continue block89;
                        }
                        case 54: {
                            var8_8 <<= var4_4;
                        }
                        case 55: {
                            Test.iFld = (int)Test.instanceCount;
                            continue block89;
                        }
                        case 56: {
                            var8_8 <<= var3_3;
                            continue block89;
                        }
                        case 57: {
                            try {
                                var6_6 = Test.iFld % Test.iFld;
                                var6_6 = var4_4 % var9_9[var5_5];
                                var4_4 = var7_7 / 111;
                            } catch (ArithmeticException var16_19) {
                                // empty catch block
                            }
                        }
                        case 58: {
                            var12_12 = var15_15;
                        }
                        case 59: {
                            v1 = var5_5 + 1;
                            this.lArrFld[v1] = this.lArrFld[v1] - Test.instanceCount;
                            continue block89;
                        }
                        case 60: {
                            Test.instanceCount -= 115L;
                            continue block89;
                        }
                        case 61: {
                            var4_4 ^= var11_11;
                            continue block89;
                        }
                        case 62: {
                            var11_11 = (short)var8_8;
                        }
                        case 63: {
                            var8_8 ^= (int)Test.instanceCount;
                            continue block89;
                        }
                        case 64: {
                            var10_10 = var3_3;
                            continue block89;
                        }
                        case 65: {
                            Test.instanceCount -= (long)var3_3;
                        }
                        case 66: {
                            if (var15_15) continue block89;
                        }
                        case 67: {
                            this.fArrFld = this.fArrFld;
                        }
                        case 68: {
                            var8_8 = (int)Test.instanceCount;
                            continue block89;
                        }
                        case 69: {
                            v2 = this.iArrFld[var2_2];
                            v3 = var5_5;
                            v2[v3] = v2[v3] - var7_7;
                            continue block89;
                        }
                        case 70: {
                            var9_9[5] = (int)this.dFld;
                            continue block89;
                        }
                        case 71: {
                            v4 = this.iArrFld[var5_5 + 1];
                            v5 = var7_7;
                            v4[v5] = v4[v5] >>> 2024311780;
                        }
                        case 72: {
                            Test.instanceCount += Test.instanceCount;
                            continue block89;
                        }
                        case 73: {
                            Test.instanceCount = var7_7;
                            continue block89;
                        }
                        case 74: {
                            var10_10 -= -19778.0f;
                            continue block89;
                        }
                        case 75: {
                            var4_4 += var7_7 - var4_4;
                            continue block89;
                        }
                        case 76: {
                            Test.iFld = (int)((long)Test.iFld + ((long)(var7_7 * var14_14 + var8_8) - Test.instanceCount));
                            continue block89;
                        }
                        case 77: {
                            Test.instanceCount *= (long)this.dFld;
                            continue block89;
                        }
                        case 78: {
                            var6_6 += var7_7;
                            continue block89;
                        }
                        case 79: {
                            Test.iFld &= var4_4;
                            continue block89;
                        }
                        case 80: {
                            var8_8 += var7_7 | Test.iFld;
                        }
                        case 81: {
                            if (var12_12) continue block89;
                        }
                        case 82: {
                            v6 = var5_5 + 1;
                            this.lArrFld[v6] = this.lArrFld[v6] - -3765302777871967965L;
                            continue block89;
                        }
                        case 83: {
                            var4_4 = var5_5;
                        }
                        case 84: {
                            var13_13[var2_2 - 1] = false;
                            continue block89;
                        }
                        ** case 85:
lbl260:
                        // 2 sources

                        case 86: {
                            v7 = var2_2 + 1;
                            var9_9[v7] = var9_9[v7] - -74;
                            continue block89;
                        }
                        case 87: {
                            if (var15_15) continue block89;
                        }
                        case 88: 
                    }
                }
            }
        }
        FuzzerUtils.out.println("i14 i15 i16 = " + var2_2 + "," + var3_3 + "," + var4_4);
        FuzzerUtils.out.println("f2 s1 i17 = " + Float.floatToIntBits(var10_10) + "," + (short)var11_11 + "," + var5_5);
        FuzzerUtils.out.println("i18 i19 i20 = " + var6_6 + "," + var7_7 + "," + var8_8);
        FuzzerUtils.out.println("b1 by iArr2 = " + (var12_12 != false ? 1 : 0) + "," + var14_14 + "," + FuzzerUtils.checkSum(var9_9));
        FuzzerUtils.out.println("bArr1 = " + FuzzerUtils.checkSum(var13_13));
        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.iFld = " + Test.instanceCount + "," + Test.byFld + "," + Test.iFld);
        FuzzerUtils.out.println("dFld iArrFld fArrFld = " + Double.doubleToLongBits(this.dFld) + "," + FuzzerUtils.checkSum(this.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld)));
        FuzzerUtils.out.println("sArrFld lArrFld = " + FuzzerUtils.checkSum(this.sArrFld) + "," + FuzzerUtils.checkSum(this.lArrFld));
        FuzzerUtils.out.println("fMeth_check_sum: " + Test.fMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + Test.vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + Test.vMeth_check_sum);
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
