/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 57186L;
    public float fFld = -78.97f;
    public float fFld1 = -1.326f;
    public static short sFld = (short)29941;
    public static int[] iArrFld = new int[400];
    public long[] lArrFld = new long[400];
    public byte[] byArrFld = new byte[400];
    public static volatile long[] lArrFld1 = new long[400];
    public static long dMeth_check_sum;
    public static long lMeth_check_sum;
    public static long vMeth_check_sum;

    public static void vMeth(float f) {
        int n = 10640;
        int n2 = -254;
        int n3 = -57758;
        int n4 = -12;
        int n5 = 1;
        int n6 = -49303;
        int n7 = 6;
        int n8 = -11808;
        for (n = 2; n < 294; ++n) {
            n2 = (int)((float)n2 + ((float)((long)n * instanceCount) + f - (float)n3));
            n3 += (int)instanceCount;
            instanceCount += (long)(n * n8 + n2 - n);
            n2 <<= n2;
            for (n4 = 1; 6 > n4; ++n4) {
                for (n6 = 1; n6 < 2; ++n6) {
                    int n9 = n;
                    lArrFld1[n9] = lArrFld1[n9] + (long)n5;
                    if (n4 != 0) {
                        vMeth_check_sum += (long)(Float.floatToIntBits(f) + n + n2 + n3 + n8 + n4 + n5 + n6 + n7);
                        return;
                    }
                    if (n4 != 0) {
                        vMeth_check_sum += (long)(Float.floatToIntBits(f) + n + n2 + n3 + n8 + n4 + n5 + n6 + n7);
                        return;
                    }
                    n7 = 16234;
                }
            }
            int n10 = n + 1;
            iArrFld[n10] = iArrFld[n10] >> (n3 += n);
        }
        vMeth_check_sum += (long)(Float.floatToIntBits(f) + n + n2 + n3 + n8 + n4 + n5 + n6 + n7);
    }

    public static long lMeth(int n, int n2, int n3) {
        float f = 0.581f;
        int n4 = -142;
        int n5 = -45523;
        int n6 = -40917;
        int n7 = 0;
        int n8 = -15;
        int n9 = 246;
        int n10 = -60358;
        int n11 = 553;
        double d = 1.42807;
        Test.vMeth(f);
        for (n4 = 2; 122 > n4; ++n4) {
            for (n6 = 1; n6 < 13; n6 += 3) {
                d = f;
            }
            for (n8 = n4; 13 > n8; ++n8) {
                n2 += (int)d;
                for (n10 = 1; 1 < n10; --n10) {
                    switch (n8 % 1 + 125) {
                        case 125: {
                            n = n10;
                            break;
                        }
                        default: {
                            n7 = n2;
                        }
                    }
                    n5 -= 87;
                    n <<= -9;
                    n += (int)(-2933263681L + (long)(n10 * n10));
                    int n12 = n10 + 1;
                    iArrFld[n12] = iArrFld[n12] >> -37229;
                    f *= f;
                }
            }
        }
        long l = (long)(n + n2 + n3 + Float.floatToIntBits(f) + n4 + n5 + n6 + n7) + Double.doubleToLongBits(d) + (long)n8 + (long)n9 + (long)n10 + (long)n11;
        lMeth_check_sum += l;
        return l;
    }

    public double dMeth(int n, short s, int n2) {
        int n3 = 13841;
        int n4 = -1405;
        int n5 = -85;
        int n6 = 213;
        int n7 = -17696;
        int n8 = -36822;
        double d = -86.45905;
        for (n3 = 4; 356 > n3; n3 += 3) {
            int n9 = 22;
            int n10 = n3 - 1;
            this.byArrFld[n10] = (byte)(this.byArrFld[n10] * (byte)(n += (n2 >>>= n4)));
            n2 = (int)(instanceCount * (long)n4);
            n9 = (byte)(n9 - 1);
            this.fFld *= (float)Math.min(n2, n4 += n9);
            switch (n3 % 1 + 79) {
                case 79: {
                    n2 |= (int)(Test.lMeth(17, -19848, n) - (long)n4);
                    n2 /= -7;
                    if (n3 == 0) break;
                }
            }
            for (n5 = n3; n5 < 13; ++n5) {
                block14: for (n7 = 1; n7 < 1; ++n7) {
                    switch (n3 % 8 + 100) {
                        case 100: {
                            this.fFld1 *= (float)n4;
                            s = (short)(s + (short)((float)n7 * this.fFld + (float)n3 - (float)n6));
                            continue block14;
                        }
                        case 101: {
                            n6 += -76 + n7 * n7;
                            continue block14;
                        }
                        case 102: {
                            instanceCount >>>= n2;
                            n8 >>= n7;
                            continue block14;
                        }
                        case 103: {
                            Test.iArrFld[n5 + 1] = n5;
                            continue block14;
                        }
                        case 104: {
                            n8 *= n8;
                            continue block14;
                        }
                        case 105: {
                            this.fFld = (float)d;
                        }
                        case 106: 
                        case 107: {
                            this.fFld = instanceCount;
                        }
                    }
                }
            }
        }
        long l = (long)(n + s + n2 + n3 + n4 + n5 + n6 + n7 + n8) + Double.doubleToLongBits(d);
        dMeth_check_sum += l;
        return l;
    }

    /*
     * Unable to fully structure code
     */
    public void mainTest(String[] var1_1) {
        var2_2 = 5;
        var3_3 = -2;
        var4_4 = 4;
        var5_5 = -29556;
        var6_6 = -75;
        var7_7 = -44651;
        var8_8 = 34142;
        var9_9 = -53849;
        var10_10 = 7;
        var11_11 = new int[400];
        var12_12 = 2.44f;
        var13_13 = false;
        var14_14 = new boolean[400];
        var15_15 = 0.69221;
        var17_16 = 15599L;
        FuzzerUtils.init(var14_14, true);
        FuzzerUtils.init(var11_11, 0);
        Test.iArrFld[(var2_2 >>> 1) % 400] = -732009017;
        var3_3 = 347;
        do {
            var12_12 += (float)var3_3;
            var13_13 = true;
            var2_2 -= (int)Test.instanceCount;
            switch (var3_3 % 2 + 6) {
                case 6: {
                    var12_12 %= (float)(Test.iArrFld[var3_3 - 1] | 1);
                    break;
                }
                case 7: {
                    v0 = var3_3;
                    this.lArrFld[v0] = this.lArrFld[v0] - (long)this.dMeth(var3_3, Test.sFld, var3_3);
                    var2_2 = var3_3;
                    break;
                }
                default: {
                    var2_2 += var3_3 * var2_2 + var2_2 - var2_2;
                    var15_15 *= (double)var3_3;
                    Test.sFld = (short)(Test.sFld + (short)(var3_3 * var3_3));
                }
            }
            var14_14[var3_3 - 1] = true;
            var17_16 += (long)(var3_3 - var3_3);
            var2_2 -= 577;
        } while (--var3_3 > 0);
        try {
            Test.instanceCount = var3_3;
            for (var4_4 = 2; var4_4 < 251; ++var4_4) {
                var5_5 >>= 12;
                Test.instanceCount = var17_16;
                block17: for (var6_6 = 6; 101 > var6_6; ++var6_6) {
                    var17_16 >>= var2_2;
                    if (var13_13) continue;
                    switch ((var7_7 >>> 1) % 7 + 96) {
                        case 96: {
                            v1 = var6_6 - 1;
                            Test.iArrFld[v1] = Test.iArrFld[v1] + (int)this.fFld1;
                            continue block17;
                        }
                        case 97: {
                            for (var8_8 = var4_4; var8_8 < 2; ++var8_8) {
                                var9_9 += var8_8;
                                v2 = var6_6;
                                Test.lArrFld1[v2] = Test.lArrFld1[v2] << var7_7;
                                var7_7 += var7_7;
                            }
                            continue block17;
                        }
                        case 98: {
                            var10_10 += var6_6;
                            continue block17;
                        }
                        case 99: {
                            v3 = var4_4 - 1;
                            var11_11[v3] = var11_11[v3] | -14;
                            continue block17;
                        }
                        ** case 100:
lbl70:
                        // 2 sources

                        case 101: {
                            v4 = var4_4;
                            Test.iArrFld[v4] = Test.iArrFld[v4] + var4_4;
                            continue block17;
                        }
                        case 102: {
                            var9_9 &= var5_5;
                        }
                    }
                }
            }
        } catch (UserDefinedExceptionTest var19_17) {
            var5_5 >>= var10_10;
        }
        FuzzerUtils.out.println("i i1 f = " + var2_2 + "," + var3_3 + "," + Float.floatToIntBits(var12_12));
        FuzzerUtils.out.println("b d2 l = " + (var13_13 != false ? 1 : 0) + "," + Double.doubleToLongBits(var15_15) + "," + var17_16);
        FuzzerUtils.out.println("i28 i29 i30 = " + var4_4 + "," + var5_5 + "," + var6_6);
        FuzzerUtils.out.println("i31 i32 i33 = " + var7_7 + "," + var8_8 + "," + var9_9);
        FuzzerUtils.out.println("i34 bArr iArr = " + var10_10 + "," + FuzzerUtils.checkSum(var14_14) + "," + FuzzerUtils.checkSum(var11_11));
        FuzzerUtils.out.println("Test.instanceCount fFld fFld1 = " + Test.instanceCount + "," + Float.floatToIntBits(this.fFld) + "," + Float.floatToIntBits(this.fFld1));
        FuzzerUtils.out.println("Test.sFld Test.iArrFld lArrFld = " + Test.sFld + "," + FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(this.lArrFld));
        FuzzerUtils.out.println("byArrFld Test.lArrFld1 = " + FuzzerUtils.checkSum(this.byArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld1));
        FuzzerUtils.out.println("vMeth_check_sum: " + Test.vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + Test.lMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + Test.dMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 127);
        FuzzerUtils.init(lArrFld1, 3461047690L);
        dMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}
