/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 169L;
    public static boolean bFld = true;
    public static int iFld = 139;
    public float fFld = -124.423f;
    public static int[] iArrFld = new int[400];
    public static long[][] lArrFld = new long[400][400];
    public static byte[] byArrFld = new byte[400];
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1() {
        int n = -39;
        byte[] byArray = new byte[400];
        int n2 = -183;
        int n3 = 45704;
        int n4 = -3;
        int n5 = -54287;
        int n6 = -5;
        int n7 = 204;
        int[] nArray = new int[400];
        int n8 = 21329;
        float f = -1.692f;
        double d = -1.115513;
        FuzzerUtils.init(byArray, (byte)17);
        FuzzerUtils.init(nArray, 2);
        n = (byte)(n * (byte)n2);
        try {
            instanceCount -= (long)n2;
            byArray[49] = -93;
        } catch (UserDefinedExceptionTest userDefinedExceptionTest) {
            n8 = (short)instanceCount;
            n3 = (int)instanceCount;
            f += (float)n2;
            n8 = (short)(n8 - (short)instanceCount);
        }
        for (n4 = 3; n4 < 185; ++n4) {
            n2 = (int)d;
            for (n6 = n4; n6 < 9; ++n6) {
                instanceCount *= -4L;
                nArray[n4 + 1] = -1;
            }
            n3 += n4;
        }
        vMeth1_check_sum += (long)(n + n2 + n8 + n3 + Float.floatToIntBits(f) + n4 + n5) + Double.doubleToLongBits(d) + (long)n6 + (long)n7 + FuzzerUtils.checkSum(byArray) + FuzzerUtils.checkSum(nArray);
    }

    public static void vMeth(int n, int n2, long l) {
        int n3 = -96;
        int n4 = 10;
        int n5 = 204;
        int n6 = 14;
        int n7 = -33131;
        int n8 = -128;
        int[] nArray = new int[400];
        int n9 = -66;
        float[] fArray = new float[400];
        FuzzerUtils.init(nArray, -11082);
        FuzzerUtils.init(fArray, 0.87f);
        Test.vMeth1();
        for (n3 = 210; n3 > 11; --n3) {
            for (n5 = n3; n5 < 8; ++n5) {
                n2 &= (int)l;
                for (n7 = 1; n7 < 1; ++n7) {
                    if (n4 != 0) {
                        vMeth_check_sum += (long)(n + n2) + l + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + (long)n9 + FuzzerUtils.checkSum(nArray) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
                        return;
                    }
                    n = -26971;
                    nArray[n3 - 1] = (int)l;
                }
                n6 *= n9;
                n6 -= n6;
                n >>= -16;
                instanceCount = n2;
                int n10 = n5 + 1;
                fArray[n10] = fArray[n10] * 7.29928E17f;
                n6 = n7;
                bFld = true;
            }
        }
        vMeth_check_sum += (long)(n + n2) + l + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + (long)n9 + FuzzerUtils.checkSum(nArray) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
    }

    public static void vSmallMeth(long l, boolean bl, double d) {
        Test.vMeth(9, iFld, l);
        vSmallMeth_check_sum += l + (long)(bl ? 1 : 0) + Double.doubleToLongBits(d);
    }

    public void mainTest(String[] stringArray) {
        int n = 13;
        int n2 = -21131;
        int n3 = -6;
        int n4 = 62447;
        int n5 = -60;
        int n6 = 104;
        int n7 = -49889;
        int n8 = 7;
        int n9 = 38606;
        int n10 = -15978;
        int n11 = 57;
        short s = 25326;
        double d = 125.10623;
        for (int i = 0; i < 198; ++i) {
            Test.vSmallMeth(instanceCount, bFld, 0.72183);
        }
        block17: for (n = 7; n < 302; n += 3) {
            iFld = -65436;
            switch (n % 1 * 5 + 113) {
                case 118: {
                    block18: for (n3 = 256; n3 > 14; --n3) {
                        switch (n % 1 + 108) {
                            default: 
                        }
                        instanceCount = 5225354921002056547L;
                        for (n5 = 1; 2 > n5; ++n5) {
                            n4 += n5;
                        }
                        block20: for (n7 = 2; n7 > 1; --n7) {
                            n6 += n11;
                            n2 = (int)((long)n2 + ((long)n7 ^ (long)this.fFld));
                            switch (n3 % 3 * 5 + 26) {
                                case 28: {
                                    s = (short)(s ^ 0xB2D);
                                    n4 += n7;
                                    s = (short)(s ^ (short)(instanceCount -= (long)iFld));
                                    continue block20;
                                }
                                case 41: {
                                    iFld = n8;
                                    continue block20;
                                }
                                case 29: {
                                    n6 += n7;
                                }
                                default: {
                                    instanceCount += (long)(n7 * n7);
                                    d = this.fFld;
                                    Test.byArrFld[n3 - 1] = (byte)n5;
                                }
                            }
                        }
                        if (bFld) continue block17;
                        switch (n % 5 + 27) {
                            case 27: {
                                n8 = n11;
                                for (n9 = 1; n9 < 2; ++n9) {
                                    n11 = (byte)(n11 - (byte)n2);
                                }
                                continue block18;
                            }
                            case 28: {
                                n10 += (int)instanceCount;
                                continue block18;
                            }
                            case 29: {
                                n10 = -3;
                                continue block18;
                            }
                            case 30: 
                            case 31: {
                                instanceCount += (long)n3;
                                continue block18;
                            }
                            default: {
                                Test.lArrFld[n3 + 1][n + 1] = instanceCount;
                            }
                        }
                    }
                    continue block17;
                }
                default: {
                    n6 *= n9;
                }
            }
        }
        FuzzerUtils.out.println("i14 i15 i16 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i17 i18 i19 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i20 i21 by2 = " + n7 + "," + n8 + "," + (byte)n11);
        FuzzerUtils.out.println("s1 d2 i22 = " + s + "," + Double.doubleToLongBits(d) + "," + n9);
        FuzzerUtils.out.println("i23 = " + n10);
        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.iFld = " + instanceCount + "," + (bFld ? 1 : 0) + "," + iFld);
        FuzzerUtils.out.println("fFld Test.iArrFld Test.lArrFld = " + Float.floatToIntBits(this.fFld) + "," + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test.byArrFld = " + FuzzerUtils.checkSum(byArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 12876);
        FuzzerUtils.init(lArrFld, 3258220990824844133L);
        FuzzerUtils.init(byArrFld, (byte)11);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}
