/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -149L;
    public static float fFld = -30.18f;
    public static int iFld = -49477;
    public static short sFld = (short)-1395;
    public static volatile double dFld = -1.104216;
    public static short[] sArrFld = new short[400];
    public static int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long iMeth_check_sum;

    /*
     * Unable to fully structure code
     */
    public static int iMeth(int var0, double var1_1) {
        var3_2 = -13L;
        var5_3 = -1430L;
        var7_4 = new long[400];
        var8_5 = -34300;
        var9_6 = -14;
        var10_7 = -36864;
        var11_8 = 3;
        var12_9 = -3;
        var13_10 = -15917;
        var14_11 = new int[400];
        var15_12 = true;
        var16_13 = 40;
        FuzzerUtils.init(var7_4, 3085452776862007644L);
        FuzzerUtils.init(var14_11, 14);
        var0 -= var0;
        var3_2 = 1L;
        block85: do {
            switch ((int)(var3_2 % 5L + 36L)) {
                case 36: {
                    for (var8_5 = 1; var8_5 < 11; ++var8_5) {
                        var0 = 997406888;
                        Test.instanceCount = var8_5;
                        Test.instanceCount += (long)var1_1;
                        block87: for (var10_7 = 1; var10_7 < 2; ++var10_7) {
                            switch (var10_7 * 5 + 77) {
                                case 91: {
                                    var9_6 = 1141489942;
                                    var7_4[var8_5 - 1] = Test.instanceCount;
                                    var0 <<= -8;
                                    continue block87;
                                }
                                case 272: {
                                    var7_4[(int)(var3_2 + 1L)] = Test.instanceCount;
                                    var0 += var10_7 ^ (var9_6 += (int)var3_2);
                                    continue block87;
                                }
                                case 131: {
                                    var11_8 = (int)((float)var11_8 + ((float)(var10_7 * var11_8) + Test.fFld - (float)var8_5));
                                }
                                case 329: {
                                    var1_1 = var5_3;
                                    continue block87;
                                }
                                case 226: {
                                    try {
                                        var0 = var9_6 / 49934;
                                        var9_6 = 45424 % var0;
                                        var9_6 = 118 / var8_5;
                                    } catch (ArithmeticException var17_15) {}
                                    continue block87;
                                }
                                case 362: {
                                    if (!var15_12) continue block87;
                                    continue block87;
                                }
                                case 220: {
                                    Test.fFld = var3_2;
                                    continue block87;
                                }
                                case 356: 
                                case 381: {
                                    var5_3 -= var5_3;
                                    continue block87;
                                }
                                case 427: {
                                    var0 -= var10_7;
                                    continue block87;
                                }
                                case 236: {
                                    Test.iFld = var8_5;
                                    continue block87;
                                }
                                case 274: {
                                    try {
                                        Test.iFld = -1959 / var10_7;
                                        var9_6 = var8_5 / -49;
                                        var11_8 = 158 / Test.iFld;
                                    } catch (ArithmeticException var17_16) {}
                                    continue block87;
                                }
                                case 185: {
                                    var9_6 += var10_7 * var10_7;
                                }
                                case 117: {
                                    var0 -= var10_7;
                                    continue block87;
                                }
                                case 210: {
                                    var0 = -10;
                                }
                                case 142: 
                                case 171: {
                                    try {
                                        Test.iFld = -78 % var8_5;
                                        var11_8 = var0 / 211;
                                        var0 = Test.iFld % var14_11[var8_5];
                                    } catch (ArithmeticException var17_17) {}
                                    continue block87;
                                }
                                case 80: {
                                    Test.iFld -= var10_7;
                                    continue block87;
                                }
                                case 278: {
                                    var11_8 = var0;
                                }
                                case 186: {
                                    var9_6 = 4732;
                                    continue block87;
                                }
                                case 230: {
                                    var0 = var10_7;
                                    continue block87;
                                }
                                case 301: {
                                    var0 %= Test.iFld | 1;
                                    continue block87;
                                }
                                case 85: {
                                    var9_6 >>= var9_6;
                                    continue block87;
                                }
                                case 367: {
                                    var11_8 >>>= var9_6;
                                }
                                case 129: {
                                    Test.iFld = (int)((float)Test.iFld + ((float)((long)var10_7 * var5_3) + Test.fFld - Test.fFld));
                                    continue block87;
                                }
                                case 399: 
                                case 402: {
                                    var7_4 = FuzzerUtils.long1array(400, 6254430256355949277L);
                                }
                                case 279: {
                                    try {
                                        var9_6 = 137 % var11_8;
                                        var11_8 = -1568550860 / var9_6;
                                        var14_11[var10_7 + 1] = var11_8 / -15;
                                    } catch (ArithmeticException var17_18) {}
                                    continue block87;
                                }
                                case 178: {
                                    var9_6 += var10_7 | Test.sFld;
                                    continue block87;
                                }
                                case 321: {
                                    Test.instanceCount <<= var0;
                                    continue block87;
                                }
                                case 322: {
                                    var11_8 += var10_7 * var10_7;
                                }
                                case 411: {
                                    var0 = var12_9;
                                    continue block87;
                                }
                                case 198: {
                                    var12_9 = var11_8;
                                    continue block87;
                                }
                                case 379: {
                                    var5_3 += (long)var11_8;
                                }
                                case 266: {
                                    var1_1 = 0.0;
                                    continue block87;
                                }
                                case 308: {
                                    try {
                                        var0 = Test.iFld % -40785;
                                        var11_8 = 212 % Test.iFld;
                                        var11_8 /= -48735;
                                    } catch (ArithmeticException var17_19) {}
                                    continue block87;
                                }
                                case 218: {
                                    var5_3 += (long)var12_9;
                                }
                                case 242: {
                                    var15_12 = true;
                                }
                                case 419: {
                                    var13_10 += var8_5;
                                }
                                case 363: {
                                    var11_8 = (int)Test.instanceCount;
                                    continue block87;
                                }
                                case 88: {
                                    var9_6 *= (int)Test.fFld;
                                    continue block87;
                                }
                                case 318: {
                                    var11_8 >>= 1855970582;
                                    continue block87;
                                }
                                case 396: {
                                    var14_11[(int)(var3_2 - 1L)] = -4;
                                    continue block87;
                                }
                                case 219: {
                                    var12_9 *= var8_5;
                                }
                                case 160: {
                                    Test.iFld += var10_7;
                                    continue block87;
                                }
                                case 108: {
                                    var9_6 += var10_7;
                                    continue block87;
                                }
                                case 116: {
                                    var0 += (int)var1_1;
                                    continue block87;
                                }
                                case 368: {
                                    v0 = var10_7;
                                    var14_11[v0] = var14_11[v0] + var8_5;
                                }
                                ** case 388:
lbl178:
                                // 2 sources

                                case 344: {
                                    Test.instanceCount -= (long)var13_10;
                                    continue block87;
                                }
                                case 215: 
                                case 311: {
                                    Test.fFld *= (float)var12_9;
                                    continue block87;
                                }
                                case 225: {
                                    var13_10 &= var12_9;
                                    continue block87;
                                }
                                case 227: {
                                    var9_6 += var10_7 * var0 + var12_9 - Test.iFld;
                                }
                                case 395: {
                                    continue block87;
                                }
                                case 299: {
                                    v1 = var10_7;
                                    var14_11[v1] = var14_11[v1] + var0;
                                    continue block87;
                                }
                                case 424: {
                                    Test.fFld -= (float)Test.instanceCount;
                                    continue block87;
                                }
                                case 107: {
                                    var12_9 += var10_7;
                                }
                                case 189: {
                                    if (!var15_12) continue block87;
                                    continue block87;
                                }
                                case 204: {
                                    v2 = var10_7 + 1;
                                    var14_11[v2] = var14_11[v2] << -41934;
                                }
                                case 167: {
                                    var11_8 %= (int)((long)var1_1 | 1L);
                                    continue block87;
                                }
                                case 306: {
                                    v3 = var8_5 - 1;
                                    var14_11[v3] = var14_11[v3] * -10;
                                    continue block87;
                                }
                                case 86: {
                                    Test.instanceCount += var5_3;
                                    continue block87;
                                }
                                case 353: {
                                    var5_3 += (long)Test.iFld;
                                    continue block87;
                                }
                                case 290: {
                                    var12_9 = var13_10;
                                }
                                case 292: {
                                    var5_3 += (long)var10_7;
                                    continue block87;
                                }
                                case 315: {
                                    var5_3 += 252L;
                                    continue block87;
                                }
                                case 352: {
                                    Test.iFld = var12_9;
                                    continue block87;
                                }
                                case 410: {
                                    var5_3 = Test.instanceCount;
                                }
                                case 343: {
                                    var9_6 += var10_7 - var8_5;
                                }
                                default: {
                                    Test.fFld = var13_10;
                                }
                            }
                        }
                    }
                    continue block85;
                }
                case 37: {
                    var12_9 += 2;
                    break;
                }
                case 38: {
                    var13_10 += var10_7;
                    break;
                }
                case 39: {
                    var16_13 = (byte)var0;
                    break;
                }
                case 40: {
                    Test.instanceCount -= -37084L;
                }
                default: {
                    var5_3 += Test.instanceCount;
                }
            }
        } while (++var3_2 < 140L);
        var17_20 = (long)var0 + Double.doubleToLongBits(var1_1) + var3_2 + (long)var8_5 + (long)var9_6 + (long)var10_7 + (long)var11_8 + var5_3 + (long)(var15_12 != false ? 1 : 0) + (long)var12_9 + (long)var13_10 + (long)var16_13 + FuzzerUtils.checkSum(var7_4) + FuzzerUtils.checkSum(var14_11);
        Test.iMeth_check_sum += var17_20;
        return (int)var17_20;
    }

    public static void vMeth1(byte by) {
        float f = 2.48f;
        int n = 8202;
        int[] nArray = new int[400];
        double d = 42.77235;
        boolean bl = false;
        FuzzerUtils.init(nArray, 11);
        for (int n2 : nArray) {
            if (bl) {
                for (f = 1.0f; 4.0f > f; f += 1.0f) {
                    n -= Test.iMeth(n2, d);
                    if (n2 != 0) {
                        vMeth1_check_sum += (long)(by + Float.floatToIntBits(f) + n) + Double.doubleToLongBits(d) + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(nArray);
                        return;
                    }
                    instanceCount >>= (iFld += n2);
                    instanceCount = n;
                    int n3 = (int)(f - 1.0f);
                    nArray[n3] = nArray[n3] * 14;
                }
            }
            fFld = n;
            d += d;
        }
        if (bl) {
            n *= -2;
            nArray[(n >>> 1) % 400] = n = iFld;
        } else {
            instanceCount = iFld;
        }
        vMeth1_check_sum += (long)(by + Float.floatToIntBits(f) + n) + Double.doubleToLongBits(d) + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(nArray);
    }

    public static void vMeth(int n) {
        int n2 = -33683;
        int n3 = 11283;
        int n4 = -8;
        int n5 = 56672;
        int n6 = -2;
        int n7 = -23029;
        int n8 = -25440;
        int n9 = -77;
        int[] nArray = new int[400];
        byte by = -27;
        double d = 1.61539;
        long[] lArray = new long[400];
        float[] fArray = new float[400];
        FuzzerUtils.init(lArray, 1802186L);
        FuzzerUtils.init(fArray, -1.365f);
        FuzzerUtils.init(nArray, 14);
        n &= n;
        for (n2 = 329; n2 > 9; --n2) {
            Test.vMeth1(by);
        }
        for (n4 = 10; n4 < 169; ++n4) {
            n -= n2;
            fFld += (float)iFld;
        }
        int n10 = (n2 >>> 1) % 400;
        lArray[n10] = lArray[n10] - (long)d;
        for (n6 = 8; n6 < 327; ++n6) {
            iFld = n2;
            for (n8 = 1; n8 < 5; ++n8) {
                n9 ^= n6;
            }
        }
        sArrFld[1] = (short)(sArrFld[1] + by);
        for (float f : fArray) {
            n3 = sFld;
            try {
                n9 = nArray[(n4 >>> 1) % 400] / 31147;
                n9 = -537128491 / n8;
                n7 = -33389 % n3;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
        }
        vMeth_check_sum += (long)(n + n2 + n3 + by + n4 + n5) + Double.doubleToLongBits(d) + (long)n6 + (long)n7 + (long)n8 + (long)n9 + FuzzerUtils.checkSum(lArray) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(nArray);
    }

    public void mainTest(String[] stringArray) {
        boolean bl = true;
        int n = -152;
        int n2 = 3;
        int n3 = 155;
        int n4 = 9327;
        int n5 = 29;
        int n6 = 231;
        int n7 = 50081;
        int n8 = 21310;
        int n9 = -167;
        int n10 = 1;
        int n11 = 16040;
        long l = -9086630096603221023L;
        long[] lArray = new long[400];
        float[][][] fArray = new float[400][400][400];
        FuzzerUtils.init(lArray, 54382L);
        FuzzerUtils.init((Object[][])fArray, (Object)Float.valueOf(-86.662f));
        if (bl) {
            Test.vMeth(iFld);
        }
        dFld = -2.592816552E9;
        switch (87) {
            case 86: {
                iFld -= iFld;
                for (n = 10; n < 182; ++n) {
                    iFld += n * iFld + iFld - n2;
                    Test.iArrFld[n + 1] = -1526899589;
                    if (bl) {
                        for (n3 = 1; n3 < 146; ++n3) {
                            try {
                                n4 = iFld / n4;
                                Test.iArrFld[n + 1] = 242 % n4;
                                n2 = -94 % n4;
                            } catch (ArithmeticException arithmeticException) {
                                // empty catch block
                            }
                            n5 += n;
                            for (n6 = n; n6 < 2; ++n6) {
                                lArray[n] = n3;
                                int n12 = n;
                                iArrFld[n12] = iArrFld[n12] << (n7 &= sFld);
                                fFld += fFld;
                                fFld += (float)n4;
                                dFld -= (double)instanceCount;
                            }
                            dFld += 3.083761671E9;
                            for (n8 = 1; n8 < 2; ++n8) {
                                n5 /= n2 | 1;
                                int n13 = n8;
                                lArray[n13] = lArray[n13] & instanceCount;
                                instanceCount += (long)(n8 * n + sFld) - l;
                            }
                        }
                        continue;
                    }
                    try {
                        n9 = iFld / 44854;
                        n9 %= iFld;
                        n2 = -181 % n7;
                    } catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                    for (n10 = n; n10 < 146; ++n10) {
                        float[] fArray2 = fArray[n][n];
                        int n14 = n10 - 1;
                        fArray2[n14] = fArray2[n14] + (float)n11;
                        n4 = (int)l;
                    }
                    fFld += (float)dFld;
                }
            }
            case 87: {
                n11 = (int)l;
                break;
            }
            case 88: {
                iFld = (int)l;
            }
        }
        FuzzerUtils.out.println("b2 i18 i19 = " + (bl ? 1 : 0) + "," + n + "," + n2);
        FuzzerUtils.out.println("i20 i21 i22 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i23 i24 i25 = " + n6 + "," + n7 + "," + n8);
        FuzzerUtils.out.println("i26 l2 i27 = " + n9 + "," + l + "," + n10);
        FuzzerUtils.out.println("i28 lArr2 fArr1 = " + n11 + "," + FuzzerUtils.checkSum(lArray) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum((Object[][])fArray)));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + iFld);
        FuzzerUtils.out.println("Test.sFld Test.dFld Test.sArrFld = " + sFld + "," + Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(sArrFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
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
        FuzzerUtils.init(sArrFld, (short)-25730);
        FuzzerUtils.init(iArrFld, 7);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        iMeth_check_sum = 0L;
    }
}
