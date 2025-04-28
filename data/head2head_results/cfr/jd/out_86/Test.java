/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -7L;
    public volatile int iFld = 118;
    public static boolean bFld = false;
    public static int[] iArrFld = new int[400];
    public static int[] iArrFld1 = new int[400];
    public static double[] dArrFld = new double[400];
    public static boolean[][] bArrFld = new boolean[400][400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;

    /*
     * Unable to fully structure code
     */
    public static void vMeth2() {
        var0 = -16893;
        var1_1 = -119;
        var2_2 = 7;
        var3_3 = -78;
        var4_4 = -6;
        var5_5 = 1.50025;
        var7_6 = -2.244f;
        var8_7 = new short[400][400][400];
        FuzzerUtils.init((Object[][])var8_7, (Object)((short)10850));
        switch ((var0 >>> 1) % 6 + 89) {
            case 89: {
                var0 %= -175;
                for (var1_1 = 5; var1_1 < 244; ++var1_1) {
                    var2_2 *= (int)Test.instanceCount;
                    var3_3 = 1;
                    while (++var3_3 < 7) {
                        var2_2 ^= var3_3;
                        var5_5 += (double)var1_1;
                        var4_4 = 1;
                        while (++var4_4 < 1) {
                            var0 += (int)Test.instanceCount;
                        }
                    }
                }
                break;
            }
            case 90: {
                var2_2 = var0;
                break;
            }
            case 91: {
                var8_7[385][(var4_4 >>> 1) % 400][46] = (short)var3_3;
                break;
            }
            ** case 92:
lbl33:
            // 2 sources

            case 93: {
                var2_2 -= var3_3;
                break;
            }
            case 94: {
                var7_6 *= var7_6;
                break;
            }
            default: {
                var0 += 21702;
            }
        }
        Test.vMeth2_check_sum += (long)(var0 + var1_1 + var2_2 + var3_3) + Double.doubleToLongBits(var5_5) + (long)var4_4 + (long)Float.floatToIntBits(var7_6) + FuzzerUtils.checkSum((Object[][])var8_7);
    }

    public static void vMeth1() {
        int n = -6;
        int n2 = -252;
        int n3 = -10774;
        int n4 = 223;
        int n5 = -18;
        int n6 = 98;
        int n7 = -49050;
        float f = 123.896f;
        float[] fArray = new float[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(fArray, 0.35f);
        FuzzerUtils.init(lArray, -4848541570267074991L);
        for (n = 386; n > 3; --n) {
            Test.vMeth2();
            n2 >>= 0;
        }
        n2 = 0;
        for (n3 = 3; n3 < 132; ++n3) {
            for (n5 = n3; n5 < 12; ++n5) {
                instanceCount *= (long)n5;
                f = n5;
            }
            if (bFld) {
                n6 = (int)instanceCount;
                int n8 = n3;
                fArray[n8] = fArray[n8] - (float)instanceCount;
                n4 = n6;
                continue;
            }
            n6 |= 0xD091;
        }
        vMeth1_check_sum += (long)(n + n2 + n3 + n4 + n5 + n6 + Float.floatToIntBits(f) + n7) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(lArray);
    }

    /*
     * Unable to fully structure code
     */
    public static void vMeth(int var0, long var1_1) {
        var3_2 = 59732;
        var4_3 = 38;
        var5_4 = 13;
        var6_5 = 13;
        var7_6 = -10;
        var8_7 = -16405;
        var9_8 = 0.47728;
        var11_9 = 28.323f;
        var12_10 = new long[400];
        FuzzerUtils.init(var12_10, 7L);
        block8: for (var3_2 = 341; var3_2 > 6; var3_2 -= 2) {
            Test.vMeth1();
            Test.instanceCount = var3_2;
            var0 += -19343 + var3_2 * var3_2;
            for (var5_4 = 1; var5_4 < 9; ++var5_4) {
                var8_7 = (short)(var8_7 - (short)var9_8);
            }
            switch (var3_2 % 7 + 21) {
                case 21: {
                    v0 = var3_2 + 1;
                    Test.iArrFld1[v0] = Test.iArrFld1[v0] | var3_2;
                    for (var11_9 = 1.0f; var11_9 < 9.0f; var11_9 += 1.0f) {
                        var12_10[var3_2 - 1] = var6_5;
                        var4_3 *= var8_7;
                        var0 += 42;
                        var1_1 += (long)(var11_9 * (float)var5_4 + (float)var1_1 - (float)var8_7);
                        v1 = (int)var11_9;
                        Test.iArrFld[v1] = Test.iArrFld[v1] - var3_2;
                        var7_6 = (int)var1_1;
                    }
                    continue block8;
                }
                case 22: {
                    var1_1 += (long)(var3_2 * var3_2);
                    continue block8;
                }
                ** case 23:
                ** case 24:
lbl36:
                // 2 sources

                case 25: {
                    var9_8 *= (double)var5_4;
                    continue block8;
                }
                case 26: {
                    continue block8;
                }
                case 27: {
                    v2 = var3_2 - 1;
                    Test.iArrFld1[v2] = Test.iArrFld1[v2] * (int)var1_1;
                }
            }
        }
        Test.vMeth_check_sum += (long)var0 + var1_1 + (long)var3_2 + (long)var4_3 + (long)var5_4 + (long)var6_5 + (long)var8_7 + Double.doubleToLongBits(var9_8) + (long)Float.floatToIntBits(var11_9) + (long)var7_6 + FuzzerUtils.checkSum(var12_10);
    }

    public void mainTest(String[] stringArray) {
        int n = 176;
        int n2 = -50;
        int n3 = -11491;
        int[] nArray = new int[400];
        double d = 18.3947;
        short s = 28510;
        short[] sArray = new short[400];
        int n4 = -81;
        float f = 88.252f;
        FuzzerUtils.init(sArray, (short)-5991);
        FuzzerUtils.init(nArray, 55852);
        int n5 = (this.iFld >>> 1) % 400;
        short s2 = sArray[n5];
        sArray[n5] = (short)(s2 - 1);
        this.iFld /= s2 | 1;
        Test.vMeth(51469, -4L);
        this.iFld = this.iFld;
        this.iFld &= (int)instanceCount;
        for (n = 17; n < 385; ++n) {
            int n6 = n + 1;
            iArrFld1[n6] = iArrFld1[n6] + (int)instanceCount;
            d = 1.0;
            do {
                instanceCount += (long)d;
                this.iFld = (int)d;
                n2 *= (int)d;
                n2 = this.iFld;
                n2 = -131159937;
                instanceCount &= instanceCount;
                this.iFld = n2;
                s = (short)(s >> (short)n);
                n3 = 1;
                while (++n3 < 1) {
                    n2 >>>= -28414;
                    instanceCount = n;
                    instanceCount *= (long)n4;
                    Test.bArrFld[n3][(int)(d - 1.0)] = bFld;
                    n2 += n3 * n3;
                    Test.iArrFld[(int)d] = n4;
                    f -= (float)n2;
                }
            } while ((d += 1.0) < 68.0);
            n2 = (int)((float)n2 + ((float)n * f + (float)instanceCount - (float)instanceCount));
            int n7 = ((n2 -= n) >>> 1) % 400;
            iArrFld[n7] = iArrFld[n7] + (int)d;
            try {
                this.iFld = -195 % n2;
                n2 = n3 / n3;
                n2 = nArray[n] / n2;
                continue;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
        }
        FuzzerUtils.out.println("i19 i20 d2 = " + n + "," + n2 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("s1 i21 by = " + s + "," + n3 + "," + (byte)n4);
        FuzzerUtils.out.println("f3 sArr iArr = " + Float.floatToIntBits(f) + "," + FuzzerUtils.checkSum(sArray) + "," + FuzzerUtils.checkSum(nArray));
        FuzzerUtils.out.println("Test.instanceCount iFld Test.bFld = " + instanceCount + "," + this.iFld + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld Test.iArrFld1 Test.dArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(iArrFld1) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(bArrFld));
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
        FuzzerUtils.init(iArrFld, 2619);
        FuzzerUtils.init(iArrFld1, 114);
        FuzzerUtils.init(dArrFld, -127.45229);
        FuzzerUtils.init(bArrFld, true);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }
}
