/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 6798738198315415854L;
    public volatile float fFld = 75.14f;
    public static float fFld1 = 0.319f;
    public static boolean bFld = true;
    public static double dFld = 2.51473;
    public static int iFld = -20389;
    public static byte[] byArrFld = new byte[400];
    public static float[] fArrFld = new float[400];
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1(long l) {
        int n = -10;
        int n2 = 63109;
        int n3 = -85;
        int n4 = -216;
        int n5 = -117;
        int n6 = -4;
        int[][] nArray = new int[400][400];
        boolean bl = false;
        int n7 = -117;
        short[] sArray = new short[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(nArray, -25);
        FuzzerUtils.init(sArray, (short)-22352);
        FuzzerUtils.init(lArray, 1L);
        for (n = 6; n < 205; ++n) {
            for (n3 = 1; n3 < 8; ++n3) {
                for (n5 = 1; n5 < 2; ++n5) {
                    if (bl) {
                        l += (long)(n5 | n);
                        nArray[n3 + 1][n - 1] = -1204965505;
                        int n8 = n - 1;
                        sArray[n8] = (short)(sArray[n8] + (short)n6);
                    } else if (bl) {
                        instanceCount = n4;
                        n2 = n;
                    } else {
                        int[] nArray2 = nArray[n3];
                        int n9 = n;
                        nArray2[n9] = nArray2[n9] >> n7;
                    }
                    nArray[n5 + 1][n - 1] = -13;
                }
            }
        }
        vMeth1_check_sum += l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)(bl ? 1 : 0) + (long)n7 + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(sArray) + FuzzerUtils.checkSum(lArray);
    }

    public static int iMeth() {
        int n = 33719;
        int n2 = -18342;
        int n3 = 127;
        int n4 = 7946;
        int n5 = -13;
        int n6 = 11;
        int n7 = -2;
        int n8 = -6;
        float f = -23.611f;
        float[] fArray = new float[400];
        boolean[] blArray = new boolean[400];
        FuzzerUtils.init(fArray, 2.31f);
        FuzzerUtils.init(blArray, false);
        Test.vMeth1(-3178335730L);
        for (n = 6; 123 > n; ++n) {
            if (bFld) continue;
            n2 += n2;
        }
        instanceCount += (long)n;
        n2 = (int)f;
        try {
            fFld1 = n2;
            for (n3 = 226; 14 < n3; n3 -= 2) {
                for (n5 = 15; n5 > n3; --n5) {
                    fArray = FuzzerUtils.float1array(400, -2.225f);
                    for (n7 = 1; 1 > n7; ++n7) {
                        dFld -= (double)n2;
                        int n9 = n3 - 1;
                        fArray[n9] = fArray[n9] * (float)n4;
                        fFld1 -= (float)n3;
                    }
                }
            }
        } catch (NegativeArraySizeException negativeArraySizeException) {
            blArray[(n2 >>> 1) % 400] = bFld;
        }
        long l = (long)(n + n2 + Float.floatToIntBits(f) + n3 + n4 + n5 + n6 + n7 + n8) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(blArray);
        iMeth_check_sum += l;
        return (int)l;
    }

    public static void vMeth() {
        int n = -7412;
        int n2 = 162;
        int n3 = 0;
        int n4 = 23942;
        int n5 = -13118;
        int n6 = 167;
        int n7 = 2;
        int n8 = -8;
        int n9 = 115;
        int[] nArray = new int[400];
        FuzzerUtils.init(nArray, 0);
        n -= Test.iMeth();
        for (n2 = 8; n2 < 187; ++n2) {
            n -= n2;
        }
        fFld1 += (float)instanceCount;
        for (n4 = 10; 206 > n4; ++n4) {
            for (n6 = 1; n6 < 8; ++n6) {
                n8 = n6;
                while (n8 < 2) {
                    int n10 = n4 + 1;
                    nArray[n10] = nArray[n10] - -23703;
                    n3 *= (int)fFld1;
                    n3 >>= iFld;
                    n7 = n8++;
                    fFld1 = n4;
                    instanceCount = n9;
                    n5 = -72;
                }
            }
        }
        vMeth_check_sum += (long)(n + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9) + FuzzerUtils.checkSum(nArray);
    }

    /*
     * Unable to fully structure code
     */
    public void mainTest(String[] var1_1) {
        var2_2 = 215;
        var3_3 = 106;
        var4_4 = -175;
        var5_5 = 7;
        var6_6 = -31;
        var7_7 = -147;
        var8_8 = 6;
        var9_9 = 1;
        var10_10 = new int[400];
        var11_11 = new int[400][400];
        var12_12 = -911;
        var13_13 = -4.37316;
        var15_14 = -28;
        FuzzerUtils.init(var10_10, 196);
        FuzzerUtils.init(var11_11, 240);
        for (var2_2 = 17; var2_2 < 277; ++var2_2) {
            block17: for (var4_4 = 6; var4_4 < 97; ++var4_4) {
                v0 = (int)(this.fFld + (float)var5_5);
                var10_10[var4_4 - 1] = v0;
                var3_3 >>= Math.abs(v0);
                switch (((int)(Test.instanceCount % ((long)this.fFld | 1L)) >>> 1) % 2 + 56) {
                    case 56: {
                        var5_5 += (int)(1L + (long)(var4_4 * var4_4));
                        Test.instanceCount += (long)(var4_4 * var4_4);
                        continue block17;
                    }
                    case 57: {
                        for (var6_6 = 1; var6_6 < 2; ++var6_6) {
                            var3_3 = (int)this.fFld;
                            var12_12 = (short)(-var13_13 - (double)(var4_4 / (var2_2 | 1) * (var5_5 * var5_5)));
                            Test.vMeth();
                            switch ((var2_2 >>> 1) % 1 + 110) {
                                case 110: {
                                    var10_10[var4_4 + 1] = var3_3;
                                }
                            }
                        }
                        switch (var4_4 % 8 * 5 + 96) {
                            case 110: {
                                var5_5 = var4_4;
                                var3_3 += var12_12;
                                var11_11[var4_4 - 1][var2_2 + 1] = var4_4;
                            }
                            case 112: 
                            case 133: {
                                var8_8 = 1;
                                do {
                                    var11_11[var2_2 + 1] = var11_11[var4_4 + 1];
                                    v1 = var4_4;
                                    Test.byArrFld[v1] = (byte)(Test.byArrFld[v1] - (byte)Test.iFld);
                                    var9_9 *= 1;
                                    var3_3 = (int)this.fFld;
                                    var9_9 += var8_8 * (var7_7 *= var3_3) + var4_4 - var12_12;
                                } while (++var8_8 < 2);
                                Test.instanceCount *= (long)var12_12;
                            }
                            case 115: {
                                Test.instanceCount = var15_14;
                                var3_3 = (int)((long)var3_3 + ((long)var4_4 * Test.instanceCount + (long)var9_9 - (long)var15_14));
                            }
                            case 127: {
                                var3_3 |= var2_2;
                                continue block17;
                            }
                            ** case 120:
lbl58:
                            // 2 sources

                            case 100: {
                                if (Test.bFld) continue block17;
                            }
                            case 121: {
                                Test.fFld1 += (float)var8_8;
                            }
                            default: {
                                var3_3 <<= var7_7;
                            }
                        }
                    }
                }
            }
        }
        FuzzerUtils.out.println("i i1 i2 = " + var2_2 + "," + var3_3 + "," + var4_4);
        FuzzerUtils.out.println("i3 i4 i5 = " + var5_5 + "," + var6_6 + "," + var7_7);
        FuzzerUtils.out.println("s d i29 = " + var12_12 + "," + Double.doubleToLongBits(var13_13) + "," + var8_8);
        FuzzerUtils.out.println("i30 by1 iArr = " + var9_9 + "," + var15_14 + "," + FuzzerUtils.checkSum(var10_10));
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(var11_11));
        FuzzerUtils.out.println("Test.instanceCount fFld Test.fFld1 = " + Test.instanceCount + "," + Float.floatToIntBits(this.fFld) + "," + Float.floatToIntBits(Test.fFld1));
        FuzzerUtils.out.println("Test.bFld Test.dFld Test.iFld = " + (Test.bFld != false ? 1 : 0) + "," + Double.doubleToLongBits(Test.dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.byArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.byArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + Test.vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + Test.iMeth_check_sum);
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
        FuzzerUtils.init(byArrFld, (byte)-116);
        FuzzerUtils.init(fArrFld, 38.811f);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}
