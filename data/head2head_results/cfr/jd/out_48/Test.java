/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -3955370601843608013L;
    public static float fFld = 2.306f;
    public static byte byFld = (byte)41;
    public static volatile int iFld = 139;
    public static boolean bFld = true;
    public static double dFld = 0.37068;
    public static int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth1_check_sum;

    /*
     * Unable to fully structure code
     */
    public static void vMeth1(int var0) {
        var1_1 = -15;
        var2_2 = 7;
        var3_3 = 32058;
        var4_4 = -1.503f;
        var5_5 = -115.752f;
        var6_6 = 5503;
        var7_7 = false;
        var8_8 = -1.47812;
        var10_9 = new long[400];
        FuzzerUtils.init(var10_9, -847000388L);
        var0 = (int)Test.fFld;
        var1_1 = 1;
        while (++var1_1 < 220) {
            if (var7_7) {
                var0 <<= Test.byFld;
                var4_4 = 7.0f;
                do {
                    var0 = var1_1;
                    var6_6 = (short)(var6_6 * (short)var1_1);
                    block14: for (var2_2 = 1; var2_2 < 1; ++var2_2) {
                        Test.fFld = var2_2;
                        var5_5 = var2_2;
                        switch (var1_1 % 10 + 65) {
                            case 65: {
                                var0 -= 2;
                                var10_9[var2_2 + 1] = var1_1;
                                continue block14;
                            }
                            ** case 66:
lbl29:
                            // 2 sources

                            case 67: {
                                var3_3 += var2_2 * var2_2;
                            }
                            case 68: {
                                var0 += (int)Test.instanceCount;
                                continue block14;
                            }
                            case 69: {
                                Test.instanceCount -= -2L;
                                continue block14;
                            }
                            case 70: {
                                Test.instanceCount = -766573961L;
                                continue block14;
                            }
                            case 71: {
                                Test.iFld += var2_2;
                            }
                            case 72: {
                                var0 -= var0;
                                continue block14;
                            }
                            case 73: {
                                var0 = Test.byFld;
                                continue block14;
                            }
                            case 74: {
                                var8_8 += (double)var1_1;
                            }
                        }
                    }
                } while ((var4_4 -= 1.0f) > 0.0f);
                continue;
            }
            Test.instanceCount = Test.iFld;
        }
        Test.vMeth1_check_sum += (long)(var0 + var1_1 + Float.floatToIntBits(var4_4) + var6_6 + var2_2 + var3_3 + Float.floatToIntBits(var5_5) + (var7_7 != false ? 1 : 0)) + Double.doubleToLongBits(var8_8) + FuzzerUtils.checkSum(var10_9);
    }

    public static int iMeth(int n, float f) {
        int n2 = -37685;
        int n3 = -138;
        int n4 = -23116;
        int[] nArray = new int[400];
        double d = 26.11879;
        long[] lArray = new long[400];
        byte[][][] byArray = new byte[400][400][400];
        FuzzerUtils.init(nArray, 5);
        FuzzerUtils.init(lArray, 5447992071724836928L);
        FuzzerUtils.init((Object[][])byArray, (Object)59);
        for (n2 = 14; n2 < 285; ++n2) {
            switch (n2 % 2 * 5 + 118) {
                case 121: {
                    d -= (double)((float)n + -93.527f * (float)n++ + (float)((long)(n2 + n2) + (instanceCount + -9L)));
                    Test.vMeth1(n);
                    n3 += n3;
                    break;
                }
                case 128: {
                    instanceCount += (long)d;
                    lArray[n2 - 1] = n3 += n2;
                    instanceCount = -6L;
                }
            }
            n4 = 1;
            while (++n4 < 6) {
                byArray[n2 - 1][n4][n4] = (byte)instanceCount;
                f = byFld;
                lArray[n2 - 1] = -1L;
                f += (float)instanceCount;
            }
        }
        long l = (long)(n + Float.floatToIntBits(f) + n2 + n3) + Double.doubleToLongBits(d) + (long)n4 + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum((Object[][])byArray);
        iMeth_check_sum += l;
        return (int)l;
    }

    public static void vMeth() {
        int n = -111;
        int n2 = -53443;
        int n3 = -42623;
        int n4 = -52262;
        int n5 = 47682;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, 6467573336990630849L);
        for (n = 13; n < 326; n += 2) {
            n2 >>= Test.iMeth(n, fFld);
            n3 = 1;
            do {
                n2 = (int)((long)n2 + ((long)n3 * instanceCount + (long)n - instanceCount));
                n2 *= iFld;
                int n6 = n3 + 1;
                iArrFld[n6] = iArrFld[n6] + n;
                for (n4 = 1; n4 > 1; n4 -= 2) {
                    n2 *= (int)fFld;
                    n2 += n4;
                    iFld -= n;
                    n5 += n4 * n3 + n5 - n4;
                    lArray[(n3 >>> 1) % 400] = n3;
                    n5 -= (int)dFld;
                    instanceCount += (long)byFld;
                }
            } while (++n3 < 10);
        }
        vMeth_check_sum += (long)(n + n2 + n3 + n4 + n5) + FuzzerUtils.checkSum(lArray);
    }

    public void mainTest(String[] stringArray) {
        Test.vMeth();
        iFld += iFld;
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + byFld);
        FuzzerUtils.out.println("Test.iFld Test.bFld Test.dFld = " + iFld + "," + (bFld ? 1 : 0) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
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
        FuzzerUtils.init(iArrFld, 6);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}
