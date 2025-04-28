/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -1550666006374924126L;
    public static float fFld = -52.57f;
    public static byte byFld = (byte)-101;
    public static short sFld = (short)16356;
    public static double dFld = -57.118032;
    public static volatile int[] iArrFld = new int[400];
    public static long[] lArrFld = new long[400];
    public float[] fArrFld = new float[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long lMeth_check_sum;

    public static long lMeth(int n, int n2, int n3) {
        double d = -77.29056;
        int n4 = -41860;
        int n5 = 27;
        int n6 = -5;
        int n7 = -9;
        int n8 = -49671;
        int n9 = 14;
        int n10 = -10;
        float f = 91.22f;
        boolean bl = true;
        int n11 = 39;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -13L);
        for (d = 9.0; 282.0 > d; d += 1.0) {
            Test.iArrFld[(int)(d - 1.0)] = n2;
        }
        n5 = 1;
        while (++n5 < 206) {
            int n12 = n5 + 1;
            iArrFld[n12] = iArrFld[n12] + n4;
            for (f = (float)n5; 8.0f > f; f += 1.0f) {
                for (n7 = 1; 1 > n7; ++n7) {
                    lArray = FuzzerUtils.long1array(400, 43L);
                    if (bl) continue;
                    instanceCount += instanceCount;
                }
            }
            Test.iArrFld[n5] = 24234;
        }
        for (n9 = 10; n9 < 249; ++n9) {
            n11 = (byte)(n11 - (byte)n7);
            Test.iArrFld[n9 - 1] = n5;
        }
        fFld -= (float)n3;
        long l = (long)(n + n2 + n3) + Double.doubleToLongBits(d) + (long)n4 + (long)n5 + (long)Float.floatToIntBits(f) + (long)n6 + (long)n7 + (long)n8 + (long)(bl ? 1 : 0) + (long)n9 + (long)n10 + (long)n11 + FuzzerUtils.checkSum(lArray);
        lMeth_check_sum += l;
        return l;
    }

    public static void vMeth1(short s, int n) {
        int n2 = 62556;
        int n3 = 34697;
        int n4 = -3;
        int n5 = 36;
        byte[][][] byArray = new byte[400][400][400];
        FuzzerUtils.init((Object[][])byArray, (Object)-126);
        n = (int)((long)(-(n + n)) + Test.lMeth(n, n, n));
        fFld += (float)n;
        n2 = 1;
        while (++n2 < 301) {
            byArray[n2 + 1][n2][(n2 >>> 1) % 400] = n5;
            n += n2;
        }
        n = (int)instanceCount;
        n3 = 1;
        do {
            fFld -= (float)instanceCount;
            n5 = (byte)(n5 * (byte)n3);
            n4 = 1;
            do {
                n = n5;
                n += 30376;
                instanceCount += -54119L;
            } while (++n4 < 8);
            fFld = n;
            int n6 = n3++;
            iArrFld[n6] = iArrFld[n6] * n2;
        } while (n3 < 199);
        vMeth1_check_sum += (long)(s + n + n2 + n5 + n3 + n4) + FuzzerUtils.checkSum((Object[][])byArray);
    }

    public static void vMeth(int n) {
        int n2 = 1;
        int n3 = -176;
        boolean bl = true;
        long l = 0L;
        double d = -50.74617;
        Test.vMeth1((short)-7274, n);
        block13: for (n2 = 1; n2 < 214; ++n2) {
            n = (int)instanceCount;
            n3 += (int)(-32L + (long)(n2 * n2));
            switch (n2 % 7 + 47) {
                case 47: {
                    n -= (int)instanceCount;
                    l = 1L;
                    do {
                        block9 : switch (n2 % 2 + 124) {
                            case 124: {
                                n3 -= n;
                                d = 1.0;
                                while (true) {
                                    double d2;
                                    d += 1.0;
                                    if (!(d2 < 1.0)) break block9;
                                    byFld = (byte)(byFld + (byte)(n *= (int)l));
                                }
                            }
                            case 125: {
                                sFld = (short)(sFld & 0x6916);
                            }
                        }
                    } while (++l < 8L);
                    continue block13;
                }
                case 48: {
                    Test.iArrFld[n2 + 1] = 1;
                    continue block13;
                }
                case 49: {
                    instanceCount += (long)(n2 - n);
                }
                case 50: {
                    n += n2 - n3;
                }
                case 51: {
                    fFld -= (float)instanceCount;
                }
                case 52: {
                    fFld += (float)n3;
                    continue block13;
                }
                case 53: {
                    n = n3;
                    continue block13;
                }
                default: {
                    int n4 = n2;
                    iArrFld[n4] = iArrFld[n4] | n2;
                }
            }
        }
        vMeth_check_sum += (long)(n + n2 + n3 + (bl ? 1 : 0)) + l + Double.doubleToLongBits(d);
    }

    public void mainTest(String[] stringArray) {
        int n = -53078;
        int n2 = 22580;
        int n3 = 59055;
        int n4 = -2;
        int n5 = -11;
        int n6 = -4;
        int n7 = -6;
        int n8 = -34244;
        int n9 = -97;
        int n10 = -20068;
        boolean bl = false;
        long l = 36503L;
        Test.vMeth(n);
        block8: for (n2 = 8; 355 > n2 && !bl; ++n2) {
            try {
                n = n2 % 1388904309;
                n3 = -325074275 % n2;
                n3 = -54232 % n;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            n += n2;
            lArrFld = FuzzerUtils.long1array(400, -4964354021288993891L);
            switch (n2 % 2 + 9) {
                case 9: {
                    n3 = 117;
                    instanceCount += (long)n2;
                    instanceCount += (long)n3;
                    break;
                }
                default: {
                    instanceCount = n;
                }
            }
            for (n4 = 3; n4 < 73; ++n4) {
                this.fArrFld[n4 - 1] = (float)dFld;
                n5 += n4 * n4;
                fFld = n3;
            }
            for (n6 = 2; n6 < 73; ++n6) {
                int n11 = n2;
                iArrFld[n11] = iArrFld[n11] << n3;
            }
            block11: for (l = 3L; l < 73L; ++l) {
                fFld = (float)dFld;
                if (bl) continue block8;
                fFld -= (float)instanceCount;
                switch (n2 % 2 + 40) {
                    case 40: {
                        n7 *= (int)l;
                        n7 += (int)(l * (long)n8 + (long)n6 - (long)n4);
                        n3 += (int)(l * (long)byFld + (long)n4 - instanceCount);
                        for (n9 = 1; n9 < 2; ++n9) {
                            instanceCount += (long)n5;
                            n5 = (int)((long)n5 + ((long)n9 * l + l - (long)n5));
                        }
                        continue block11;
                    }
                }
            }
        }
        FuzzerUtils.out.println("i18 i19 i20 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("b2 i21 i22 = " + (bl ? 1 : 0) + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i23 i24 l1 = " + n6 + "," + n7 + "," + l);
        FuzzerUtils.out.println("i25 i26 i27 = " + n8 + "," + n9 + "," + n10);
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + byFld);
        FuzzerUtils.out.println("Test.sFld Test.dFld Test.iArrFld = " + sFld + "," + Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.lArrFld fArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld)));
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, -6);
        FuzzerUtils.init(lArrFld, 444L);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        lMeth_check_sum = 0L;
    }
}
