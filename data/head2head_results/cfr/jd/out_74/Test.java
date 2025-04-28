/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static volatile long instanceCount = 7L;
    public static boolean bFld = true;
    public static float fFld = 37.651f;
    public static int[][] iArrFld = new int[400][400];
    public static double[] dArrFld = new double[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long iMeth_check_sum;

    public static int iMeth(int n, long l, float f) {
        int n2 = 13;
        int n3 = -70;
        int n4 = -3;
        int n5 = 10;
        int n6 = -29;
        int[][][] nArray = new int[400][400][400];
        int n7 = 102;
        long l2 = -4127484865L;
        double d = -124.30663;
        FuzzerUtils.init((Object[][])nArray, (Object)172);
        n += 225;
        for (n2 = 6; n2 < 123; ++n2) {
            n7 = (byte)(n7 * (byte)f);
            n3 *= 41087;
        }
        n3 = 0;
        f += -140.0f;
        l2 = 1L;
        while (++l2 < 256L) {
            n3 += n2;
            n3 += n3;
            for (d = 1.0; d < 6.0; d += 1.0) {
                instanceCount += (long)(d * (double)n4 + (double)l2 - (double)n4);
                for (n5 = 1; n5 < 2; ++n5) {
                    n6 <<= n5;
                }
            }
        }
        long l3 = (long)n + l + (long)Float.floatToIntBits(f) + (long)n2 + (long)n3 + (long)n7 + l2 + Double.doubleToLongBits(d) + (long)n4 + (long)n5 + (long)n6 + FuzzerUtils.checkSum((Object[][])nArray);
        iMeth_check_sum += l3;
        return (int)l3;
    }

    public static void vMeth1(int n, boolean bl, int n2) {
        int n3 = -22286;
        int n4 = -18931;
        int n5 = 47882;
        int n6 = -12;
        int n7 = 48026;
        int n8 = -208;
        int[] nArray = new int[400];
        int n9 = 89;
        double d = -2.108474;
        float[] fArray = new float[400];
        FuzzerUtils.init(nArray, 6);
        FuzzerUtils.init(fArray, -32.538f);
        n2 = n2++;
        nArray[72] = (int)fArray[(n2 >>> 1) % 400];
        for (n3 = 2; 231 > n3; ++n3) {
            n2 = Math.min(Test.iMeth(n2, instanceCount, fFld), n3);
            for (n5 = 1; n5 < 7 && !bl; ++n5) {
                for (n7 = 1; 2 > n7; n7 += 3) {
                    n8 &= n9;
                    if (bl) {
                        instanceCount += (long)(n7 * n7);
                    } else {
                        d *= (double)fFld;
                        n6 += n7;
                        int n10 = n5 - 1;
                        nArray[n10] = nArray[n10] + 1;
                        int n11 = n3;
                        nArray[n11] = nArray[n11] >> (int)instanceCount;
                    }
                    fFld = n2;
                }
            }
        }
        vMeth1_check_sum += (long)(n + (bl ? 1 : 0) + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(nArray) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
    }

    public static void vMeth(int n, int n2) {
        int n3 = -56710;
        int n4 = 5;
        int n5 = -10;
        long l = -2281029232L;
        long l2 = 1L;
        double d = 2.56273;
        int n6 = -20034;
        switch ((n2++ >>> 1) % 8 * 5 + 10) {
            case 13: {
                Test.vMeth1(10, false, n);
                break;
            }
            case 19: {
                n += n2;
                n3 = 217;
                while ((n3 -= 2) > 0) {
                    l = 1L;
                    do {
                        n <<= (int)instanceCount;
                    } while (++l < 14L);
                    fFld -= (float)instanceCount;
                    for (l2 = 1L; l2 < 14L; ++l2) {
                        n2 += (int)(l2 * (long)n2 + (long)n - l);
                        instanceCount += (long)n;
                        n5 = 1;
                        while (++n5 < 2) {
                            instanceCount -= (long)d;
                            int[] nArray = iArrFld[n3];
                            int n7 = n5;
                            nArray[n7] = nArray[n7] ^ 9;
                            n2 |= n;
                            n4 -= 8124;
                        }
                    }
                }
                break;
            }
            case 32: {
                n6 = (short)(n6 << (short)l2);
                break;
            }
            case 28: {
                d *= (double)n;
                break;
            }
            case 49: {
                instanceCount -= (long)n;
            }
            case 26: {
                int[] nArray = iArrFld[(n4 >>> 1) % 400];
                nArray[4] = nArray[4] / (n2 | 1);
                break;
            }
            case 50: {
                n4 += (int)l;
            }
            case 11: {
                int[] nArray = iArrFld[(n5 >>> 1) % 400];
                nArray[75] = nArray[75] + n5;
            }
        }
        vMeth_check_sum += (long)(n + n2 + n3) + l + l2 + (long)n4 + (long)n5 + Double.doubleToLongBits(d) + (long)n6;
    }

    /*
     * Unable to fully structure code
     */
    public void mainTest(String[] var1_1) {
        var2_2 = -16968;
        var3_3 = 196;
        var4_4 = -45829;
        var5_5 = 6;
        var6_6 = 62932;
        var7_7 = 12;
        var8_8 = -184;
        var9_9 = -59214;
        var10_10 = -119;
        var11_11 = new int[400][400][400];
        var12_12 = -13766;
        var13_13 = 1.25589;
        var15_14 = 10.120155;
        var17_15 = new long[400][400][400];
        FuzzerUtils.init((Object[][])var17_15, (Object)51188L);
        FuzzerUtils.init((Object[][])var11_11, (Object)7);
        Test.vMeth(var2_2, var2_2);
        var2_2 ^= var2_2;
        block14: for (var3_3 = 6; var3_3 < 138; ++var3_3) {
            var18_16 = 105;
            var2_2 += var3_3;
            switch (var3_3 % 7 + 13) {
                case 13: 
                case 14: {
                    var12_12 = (short)(var12_12 + (short)var3_3);
                    continue block14;
                }
                case 15: {
                    var13_13 *= (double)var2_2;
                    var18_16 = (byte)(var18_16 + (byte)(38894L + (long)(var3_3 * var3_3)));
                    Test.fFld *= (float)var2_2;
                    continue block14;
                }
                case 16: {
                    for (var5_5 = 190; var5_5 > 2 && !Test.bFld; --var5_5) {
                        var4_4 = (int)var13_13;
                        var6_6 += var2_2;
                        var2_2 = var18_16;
                        Test.instanceCount >>= 60549;
                        var7_7 = var5_5;
                        while (var7_7 < 2) {
                            Test.iArrFld[var5_5 + 1][var5_5] = var7_7++;
                            var15_14 -= (double)var4_4;
                            var2_2 <<= var2_2;
                            var4_4 <<= var5_5;
                        }
                        block17: for (var9_9 = var5_5; var9_9 < 2; ++var9_9) {
                            switch (var5_5 % 2 + 70) {
                                case 70: {
                                    var2_2 = var8_8;
                                    var18_16 = (byte)(var18_16 + (byte)var13_13);
                                    if (Test.bFld) {
                                        continue block17;
                                    }
                                    ** GOTO lbl60
                                }
                                case 71: {
                                    try {
                                        Test.iArrFld[var5_5 + 1][var3_3 - 1] = var7_7 / 56;
                                        var6_6 = 70 % var2_2;
                                        Test.iArrFld[var9_9 - 1][(var5_5 >>> 1) % 400] = -35394 % Test.iArrFld[var9_9][var9_9 - 1];
                                    } catch (ArithmeticException var19_17) {
                                        // empty catch block
                                    }
                                }
lbl60:
                                // 4 sources

                                default: {
                                    var2_2 -= var3_3;
                                }
                            }
                        }
                        Test.dArrFld[var5_5] = Test.instanceCount;
                    }
                    v0 = var17_15[var3_3 + 1][var3_3 - 1];
                    v1 = var3_3 + 1;
                    v0[v1] = v0[v1] & 179L;
                    continue block14;
                }
                case 17: {
                    var8_8 ^= var6_6;
                    continue block14;
                }
                case 18: {
                    continue block14;
                }
                case 19: {
                    var6_6 ^= -165;
                }
            }
        }
        FuzzerUtils.out.println("i19 i20 i21 = " + var2_2 + "," + var3_3 + "," + var4_4);
        FuzzerUtils.out.println("s1 d3 i22 = " + var12_12 + "," + Double.doubleToLongBits(var13_13) + "," + var5_5);
        FuzzerUtils.out.println("i23 i24 i25 = " + var6_6 + "," + var7_7 + "," + var8_8);
        FuzzerUtils.out.println("d4 i26 i27 = " + Double.doubleToLongBits(var15_14) + "," + var9_9 + "," + var10_10);
        FuzzerUtils.out.println("lArr iArr2 = " + FuzzerUtils.checkSum((Object[][])var17_15) + "," + FuzzerUtils.checkSum((Object[][])var11_11));
        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + Test.instanceCount + "," + (Test.bFld != false ? 1 : 0) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("iMeth_check_sum: " + Test.iMeth_check_sum);
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

    static {
        FuzzerUtils.init(iArrFld, -20166);
        FuzzerUtils.init(dArrFld, -2.70807);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        iMeth_check_sum = 0L;
    }
}
