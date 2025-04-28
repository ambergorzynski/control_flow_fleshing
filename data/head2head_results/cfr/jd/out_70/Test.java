/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -4L;
    public static byte byFld = (byte)112;
    public static double dFld = 1.59633;
    public static volatile short sFld = (short)-28449;
    public static long[] lArrFld = new long[400];
    public static volatile int[] iArrFld = new int[400];
    public static long[] lArrFld1 = new long[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;

    public static void vMeth2(long l) {
        long l2 = 14L;
        int n = -254;
        int n2 = -2;
        int n3 = 51;
        int n4 = -10;
        int n5 = -63609;
        float f = 2.788f;
        for (l2 = 3L; l2 < 173L; ++l2) {
            int n6 = (int)l2;
            lArrFld[n6] = lArrFld[n6] >> n;
            n = (int)((long)n + (62109L + l2 * l2));
            for (n2 = 1; n2 < 9; ++n2) {
                n *= (int)l2;
                instanceCount -= (long)f;
                n = (int)l2;
                n3 += n2;
                for (n4 = 1; 2 > n4; ++n4) {
                    dFld = l2;
                    Test.iArrFld[n4 - 1] = (int)instanceCount;
                    f = -203.0f;
                    Test.iArrFld[n2] = n2;
                    l *= (long)n3;
                }
                if (n == 0) continue;
                vMeth2_check_sum += l + l2 + (long)n + (long)n2 + (long)n3 + (long)Float.floatToIntBits(f) + (long)n4 + (long)n5;
                return;
            }
        }
        vMeth2_check_sum += l + l2 + (long)n + (long)n2 + (long)n3 + (long)Float.floatToIntBits(f) + (long)n4 + (long)n5;
    }

    public static void vMeth1() {
        int n = -10;
        int n2 = 51014;
        int n3 = -41988;
        double d = -2.52084;
        float f = -88.13f;
        int n4 = -25648;
        for (n = 1; n < 162; n += 3) {
            n3 = 1;
            block8: do {
                boolean bl = true;
                Test.vMeth2(-7142471460394991424L);
                block0 : switch ((n3 >>> 1) % 2 + 109) {
                    case 109: {
                        n2 = 151;
                        int n5 = n;
                        iArrFld[n5] = iArrFld[n5] ^ (int)instanceCount;
                        instanceCount = n;
                        instanceCount -= 7L;
                    }
                    case 110: {
                        d = 1.0;
                        while (true) {
                            double d2;
                            d += 1.0;
                            if (!(d2 < 1.0)) break;
                            int n6 = n3 - 1;
                            lArrFld[n6] = lArrFld[n6] + (long)f;
                        }
                        switch ((n2 >>> 1) % 1 * 5 + 113) {
                            case 117: {
                                if (bl) continue block8;
                                instanceCount <<= n4;
                                n2 <<= n;
                                break block0;
                            }
                            default: {
                                n2 >>= n;
                            }
                        }
                    }
                }
            } while (++n3 < 29);
        }
        vMeth1_check_sum += (long)(n + n2 + n3) + Double.doubleToLongBits(d) + (long)Float.floatToIntBits(f) + (long)n4;
    }

    public static void vMeth(int n, long l, int n2) {
        int n3 = -162;
        int n4 = 27;
        int n5 = 109;
        int n6 = -10;
        int n7 = -34711;
        float f = -2.798f;
        boolean bl = false;
        for (n3 = 16; n3 < 351; ++n3) {
            Test.vMeth1();
            instanceCount = 18158L;
            n5 = 5;
            do {
                l /= (long)(n4 | 1);
                iArrFld = FuzzerUtils.int1array(400, 2);
                if (bl) {
                    block8: for (f = 1.0f; f < 3.0f; f += 1.0f) {
                        n4 += (int)instanceCount;
                        n4 += (int)(f * f);
                        switch ((int)(f % 5.0f + 4.0f)) {
                            case 4: {
                                n2 -= 1187644932;
                                n2 -= sFld;
                                n2 *= (int)f;
                                if (bl) continue block8;
                            }
                            case 5: {
                                n = -154459746;
                                continue block8;
                            }
                            case 6: {
                                n2 = n;
                                continue block8;
                            }
                            case 7: 
                            case 8: {
                                n4 -= 44399;
                                continue block8;
                            }
                            default: {
                                if (!bl) continue block8;
                            }
                        }
                    }
                } else {
                    n6 += n7;
                }
            } while ((n5 -= 3) > 0);
        }
        vMeth_check_sum += (long)n + l + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)Float.floatToIntBits(f) + (long)n6 + (long)(bl ? 1 : 0) + (long)n7;
    }

    public void mainTest(String[] stringArray) {
        int n = -48418;
        int n2 = 0;
        int n3 = 40782;
        int n4 = 5;
        int n5 = -12376;
        int n6 = 17699;
        int n7 = 123;
        int n8 = 18328;
        double d = 2.49346;
        float f = -1.725f;
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, 2.918f);
        double d2 = d;
        d = d2 + 1.0;
        byFld = (byte)(((long)n - instanceCount + (long)(232 + (n - n))) / ((long)d2 | 1L));
        Test.vMeth(n, instanceCount, n);
        n -= n;
        n2 = 1;
        while (++n2 < 269) {
            for (n3 = 2; n3 < 93; ++n3) {
                int n9 = n2 + 1;
                lArrFld1[n9] = lArrFld1[n9] & (long)n2;
                Test.iArrFld[n3 - 1] = n2;
                n5 = 1;
                while (++n5 < 2) {
                    Test.iArrFld[n2] = n;
                    n4 += n5;
                    int n10 = n5 - 1;
                    fArray[n10] = fArray[n10] * (float)sFld;
                    n4 = -11;
                }
            }
            instanceCount = n5;
            n4 += n2;
            instanceCount += instanceCount;
            n4 = n;
            dFld = n5;
            n6 = 1;
            if (93 > n6) {
                n += n6 * n6 + n6 - n6;
                n = (int)f;
                n8 = 2;
                do {
                    n4 += (int)instanceCount;
                    n7 <<= n7;
                } while (--n8 > 0);
                f = -14208.0f;
            }
            switch (n2 % 9 + 75) {
                case 75: {
                    fArray[n2 + 1] = f;
                }
                case 76: {
                    int n11 = n2 + 1;
                    iArrFld[n11] = iArrFld[n11] << (int)instanceCount;
                    instanceCount = (long)f;
                    break;
                }
                case 77: {
                    n += n2 * n2;
                    break;
                }
                case 78: {
                    f = n7;
                    break;
                }
                case 79: {
                    instanceCount >>>= -62822;
                    break;
                }
                case 80: {
                    byFld = (byte)(byFld + (byte)n8);
                    break;
                }
                case 81: {
                    n <<= n5;
                    break;
                }
                case 82: {
                    break;
                }
                case 83: {
                    n4 = n7;
                }
            }
        }
        FuzzerUtils.out.println("i d i16 = " + n + "," + Double.doubleToLongBits(d) + "," + n2);
        FuzzerUtils.out.println("i17 i18 i19 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i20 i21 f3 = " + n6 + "," + n7 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i22 fArr = " + n8 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)));
        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.dFld = " + instanceCount + "," + byFld + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.sFld Test.lArrFld Test.iArrFld = " + sFld + "," + FuzzerUtils.checkSum(lArrFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.lArrFld1 = " + FuzzerUtils.checkSum(lArrFld1));
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
        FuzzerUtils.init(lArrFld, -61017L);
        FuzzerUtils.init(iArrFld, 11);
        FuzzerUtils.init(lArrFld1, 6696L);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }
}
