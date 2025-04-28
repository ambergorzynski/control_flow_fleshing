/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -33821060912372785L;
    public volatile short sFld = (short)30529;
    public static volatile int iFld = 35136;
    public static float[] fArrFld = new float[400];
    public static boolean[] bArrFld = new boolean[400];
    public static double[] dArrFld = new double[400];
    public static long fMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1(long l, int n, long l2) {
        long l3 = -13L;
        long[] lArray = new long[400];
        int n2 = -10;
        int n3 = 10;
        int n4 = -38090;
        int n5 = -194;
        int n6 = -13391;
        int[] nArray = new int[400];
        float f = 2.119f;
        boolean bl = true;
        double d = -2.28646;
        FuzzerUtils.init(nArray, 7);
        FuzzerUtils.init(lArray, 35261L);
        for (l3 = 6L; l3 < 217L; l3 += 2L) {
            try {
                nArray[(int)l3] = nArray[(int)(l3 + 1L)] / n2;
                nArray[(int)l3] = -146 % n;
                nArray[(int)(l3 + 1L)] = 32370143 / n;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            l2 += 13043L;
        }
        vMeth1_check_sum += l + (long)n + l2 + l3 + (long)n2 + (long)Float.floatToIntBits(f) + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)(bl ? 1 : 0) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(lArray);
    }

    public static void vMeth(int n, int n2, float f) {
        int n3 = -3;
        int n4 = 235;
        int n5 = 3;
        int n6 = -14;
        int n7 = 5543;
        int[] nArray = new int[400];
        int n8 = -19052;
        boolean bl = false;
        int n9 = -93;
        FuzzerUtils.init(nArray, 142);
        Test.vMeth1(163L, n, instanceCount);
        Test.bArrFld[(Test.iFld >>> 1) % 400] = false;
        int n10 = (n2 >>> 1) % 400;
        nArray[n10] = nArray[n10] / (iFld | 1);
        iFld = n;
        if (bl) {
            for (n3 = 14; n3 < 262; n3 += 3) {
                for (n5 = 1; n5 < 19; ++n5) {
                    n7 = 1;
                    while (++n7 < 2) {
                        n += n7 * n7;
                        instanceCount *= (long)(iFld += n7);
                        f = n2;
                        instanceCount >>>= n8;
                        int n11 = n3;
                        nArray[n11] = nArray[n11] + iFld;
                    }
                }
            }
        } else {
            n9 = (byte)(n9 >> (byte)instanceCount);
            vMeth_check_sum += (long)(n + n2 + Float.floatToIntBits(f) + n3 + n4 + n5 + n6 + n7 + n8 + (bl ? 1 : 0) + n9) + FuzzerUtils.checkSum(nArray);
            return;
        }
        vMeth_check_sum += (long)(n + n2 + Float.floatToIntBits(f) + n3 + n4 + n5 + n6 + n7 + n8 + (bl ? 1 : 0) + n9) + FuzzerUtils.checkSum(nArray);
    }

    public static float fMeth(int n) {
        float f = -2.851f;
        int n2 = 28547;
        int n3 = -15855;
        int n4 = 196;
        int n5 = -63;
        int n6 = 6;
        int n7 = -200;
        int[] nArray = new int[400];
        double d = 0.118565;
        double d2 = 1.121585;
        int n8 = -29814;
        int n9 = -10;
        FuzzerUtils.init(nArray, 54082);
        Test.vMeth(-89, iFld, f);
        n2 = 1;
        block5: do {
            switch (130) {
                case 127: {
                    iFld -= (int)instanceCount;
                    for (n3 = 1; n3 < 8; ++n3) {
                        int n10 = n2 - 1;
                        nArray[n10] = nArray[n10] >> (int)instanceCount;
                    }
                    for (d = 1.0; d < 8.0; d += 1.0) {
                        for (n6 = 1; n6 < 2; ++n6) {
                            n8 = (short)(n8 + (short)n6);
                            n4 -= n3;
                            n8 = (short)(n8 - n9);
                            d2 -= (double)n6;
                            n4 += n6 * n6;
                            n8 = (short)(n8 + (short)n6);
                        }
                        int n11 = n2 - 1;
                        dArrFld[n11] = dArrFld[n11] - (double)n2;
                    }
                    continue block5;
                }
                case 128: {
                    instanceCount += (long)n5;
                }
                case 129: {
                    n += (int)instanceCount;
                    break;
                }
                default: {
                    instanceCount += (long)n9;
                }
            }
        } while (++n2 < 211);
        long l = (long)(n + Float.floatToIntBits(f) + n2 + n3 + n4) + Double.doubleToLongBits(d) + (long)n5 + (long)n6 + (long)n7 + (long)n8 + (long)n9 + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(nArray);
        fMeth_check_sum += l;
        return l;
    }

    public void mainTest(String[] stringArray) {
        double d = 7.28009;
        int n = 0;
        int n2 = -9;
        int n3 = 68;
        int n4 = -24459;
        int n5 = -67;
        int n6 = -14;
        int n7 = -9;
        int n8 = -159;
        int n9 = 6;
        int[][][] nArray = new int[400][400][400];
        long l = 0L;
        boolean bl = true;
        FuzzerUtils.init((Object[][])nArray, (Object)-14764);
        this.sFld = (short)(this.sFld - (short)Test.fMeth(iFld));
        iFld -= iFld;
        iFld >>= iFld;
        d -= (double)instanceCount;
        for (n = 6; n < 253; ++n) {
            iFld = 206;
            for (n3 = 4; n3 < 102; ++n3) {
                boolean bl2 = true;
                switch (n3 % 3 + 103) {
                    case 103: {
                        n4 = (int)instanceCount;
                        iFld -= 35675;
                        for (n5 = 1; n5 < 2; ++n5) {
                            instanceCount = iFld;
                        }
                        break;
                    }
                    case 104: 
                    case 105: {
                        n2 += n3 * iFld + n5 - n2;
                        nArray[n - 1][n3][n3] = -60674;
                        for (l = 1L; l < 2L; ++l) {
                            switch ((int)(l % 1L + 33L)) {
                                default: 
                            }
                            d += (double)l;
                            instanceCount = iFld;
                            int[] nArray2 = nArray[n3 - 1][(n3 >>> 1) % 400];
                            int n10 = n - 1;
                            nArray2[n10] = nArray2[n10] * (n7 <<= 56179);
                        }
                    }
                    default: {
                        nArray[n3][n3 - 1][n3 - 1] = n2;
                    }
                }
                iFld = n5;
            }
        }
        block16: for (n8 = 7; n8 < 122; ++n8) {
            switch (n8 % 4 + 26) {
                case 26: {
                    instanceCount <<= 37525;
                    continue block16;
                }
                case 27: {
                    instanceCount -= (long)n4;
                    iFld = this.sFld;
                    continue block16;
                }
                case 28: {
                    d -= (double)n;
                }
                case 29: {
                    instanceCount += (long)n2;
                }
            }
        }
        FuzzerUtils.out.println("d3 i20 i21 = " + Double.doubleToLongBits(d) + "," + n + "," + n2);
        FuzzerUtils.out.println("i22 i23 i24 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i25 l3 i26 = " + n6 + "," + l + "," + n7);
        FuzzerUtils.out.println("i27 i28 b3 = " + n8 + "," + n9 + "," + (bl ? 1 : 0));
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum((Object[][])nArray));
        FuzzerUtils.out.println("Test.instanceCount sFld Test.iFld = " + instanceCount + "," + this.sFld + "," + iFld);
        FuzzerUtils.out.println("Test.fArrFld Test.bArrFld Test.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(bArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
        FuzzerUtils.init(fArrFld, -64.259f);
        FuzzerUtils.init(bArrFld, false);
        FuzzerUtils.init(dArrFld, 54.128264);
        fMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}
