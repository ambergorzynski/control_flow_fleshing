/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 8L;
    public static int iFld = 8491;
    public static double dFld = 121.11435;
    public static float fFld = -87.306f;
    public static long lFld = -1L;
    public byte byFld = (byte)-52;
    public static int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;

    public static void vMeth2(long l, int n) {
        int n2 = 10;
        int n3 = 52805;
        int n4 = 4;
        int n5 = 21;
        int n6 = -64145;
        int n7 = -13998;
        int n8 = -2;
        int[][][] nArray = new int[400][400][400];
        boolean bl = true;
        boolean[] blArray = new boolean[400];
        double d = 1.71522;
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, -16.377f);
        FuzzerUtils.init(blArray, true);
        FuzzerUtils.init((Object[][])nArray, (Object)7);
        n += iFld;
        block6: for (n2 = 12; n2 < 289; ++n2) {
            n += n2 * n2;
            switch ((n2 >>> 1) % 2 + 101) {
                case 101: {
                    for (n4 = n2; n4 < 6; ++n4) {
                        l += (long)n4 | (instanceCount += (long)n4);
                        n6 = 1;
                        do {
                            bl = false;
                            n = n5;
                            int n9 = n4 + 1;
                            fArray[n9] = fArray[n9] + (float)n5;
                            blArray[n6] = bl;
                        } while (++n6 < 1);
                        n7 = 1;
                        while (n7 < 1) {
                            nArray[n2 + 1][n7 - 1][n4 + 1] = 8;
                            int n10 = n7++;
                            fArray[n10] = fArray[n10] / (float)((long)d | 1L);
                        }
                    }
                }
                case 102: {
                    nArray[n2 - 1][n2 + 1][n2] = (int)l;
                    continue block6;
                }
                default: {
                    try {
                        nArray[n2][n2 - 1][n2 + 1] = -167 / n;
                        nArray[(n >>> 1) % 400][n2 - 1][n2 - 1] = n7 / iFld;
                        iFld = 1627766836 / nArray[n2 - 1][n2 + 1][n2 + 1];
                        continue block6;
                    } catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                }
            }
        }
        vMeth2_check_sum += l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)(bl ? 1 : 0) + (long)n7 + (long)n8 + Double.doubleToLongBits(d) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(blArray) + FuzzerUtils.checkSum((Object[][])nArray);
    }

    public static void vMeth1() {
        float f = 35.921f;
        int n = 1;
        int n2 = -4019;
        int n3 = 77;
        int n4 = 39754;
        boolean bl = true;
        Test.vMeth2(instanceCount, iFld);
        iFld <<= (int)instanceCount;
        f = 40518.0f;
        for (n = 356; n > 9; --n) {
            try {
                n2 = 164 % n2;
                n2 = 34237 % n;
                n2 %= -96;
                continue;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
        }
        n3 = 1;
        do {
            int n5 = n3;
            iArrFld[n5] = iArrFld[n5] | n2;
            if (bl) break;
            iFld -= n;
            n4 += n3 * n3;
            dFld = n2 -= 12033;
            int n6 = n3 + 1;
            iArrFld[n6] = iArrFld[n6] | 0x36;
        } while (++n3 < 209);
        vMeth1_check_sum += (long)(Float.floatToIntBits(f) + n + n2 + n3 + (bl ? 1 : 0) + n4);
    }

    public void vMeth(float f, int n, float f2) {
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, 1574065845L);
        Test.vMeth1();
        vMeth_check_sum += (long)(Float.floatToIntBits(f) + n + Float.floatToIntBits(f2)) + FuzzerUtils.checkSum(lArray);
    }

    public void mainTest(String[] stringArray) {
        int n = 51435;
        int n2 = -20119;
        int n3 = -5;
        int n4 = 223;
        int n5 = -4;
        int n6 = -31;
        int[][] nArray = new int[400][400];
        int[] nArray2 = new int[400];
        float f = -2.978f;
        float f2 = 1.153f;
        short s = -15131;
        long[][][] lArray = new long[400][400][400];
        double[][][] dArray = new double[400][400][400];
        FuzzerUtils.init(nArray, -61406);
        FuzzerUtils.init((Object[][])lArray, (Object)-6243254243313191976L);
        FuzzerUtils.init((Object[][])dArray, (Object)-103.117358);
        FuzzerUtils.init(nArray2, 7);
        int[] nArray3 = nArray[(iFld >>> 1) % 400];
        int n7 = (iFld >>> 1) % 400;
        int n8 = nArray3[n7];
        nArray3[n7] = n8 + 1;
        iFld = n8;
        this.vMeth(fFld, iFld, fFld);
        switch ((iFld >>> 1) % 10 + 55) {
            case 55: {
                n = 1;
                do {
                    double[] dArray2 = dArray[n][n + 1];
                    int n9 = n;
                    dArray2[n9] = dArray2[n9] % (double)(iFld | 1);
                    dFld *= (double)iFld;
                    block22: for (f = 3.0f; f < 106.0f; f += 1.0f) {
                        iFld = 6661;
                        try {
                            nArray2[n] = -31 % nArray[n][(int)(f + 1.0f)];
                            iFld = -37048 % n;
                            iFld %= n2;
                        } catch (ArithmeticException arithmeticException) {
                            // empty catch block
                        }
                        n2 += (int)(f * (float)n2);
                        switch ((int)(f % 4.0f * 5.0f + 108.0f)) {
                            case 124: {
                                for (n3 = 1; n3 < 2; ++n3) {
                                    s = (short)(s - (short)n2);
                                    int[] nArray4 = nArray[(int)(f - 1.0f)];
                                    int n10 = (int)f;
                                    nArray4[n10] = nArray4[n10] - n3;
                                    fFld += (float)(n3 * n3);
                                    Test.iArrFld[(int)f] = (int)lFld;
                                    this.byFld = (byte)86;
                                }
                                n2 *= -122;
                                try {
                                    iFld = -2847 / n4;
                                    nArray[n - 1][n] = n3 % n3;
                                    n4 = 7312 % n2;
                                } catch (ArithmeticException arithmeticException) {
                                    // empty catch block
                                }
                                n4 += 60;
                                continue block22;
                            }
                            case 121: {
                                n4 = n2;
                                continue block22;
                            }
                            case 111: {
                                instanceCount += (long)f2;
                            }
                            case 110: {
                                iFld += n;
                                for (n5 = 2; n5 > 1; --n5) {
                                    nArray[n5 + 1][(int)(f - 1.0f)] = (int)instanceCount;
                                    lFld -= (long)this.byFld;
                                }
                                continue block22;
                            }
                        }
                    }
                } while (++n < 236);
                break;
            }
            case 56: {
                iFld &= n2;
            }
            case 57: {
                f2 = f;
                break;
            }
            case 58: {
                lArray[(n5 >>> 1) % 400][(n3 >>> 1) % 400] = lArray[(n4 >>> 1) % 400][(n3 >>> 1) % 400];
                break;
            }
            case 59: {
                instanceCount -= (long)iFld;
                break;
            }
            case 60: {
                f2 *= (float)dFld;
                break;
            }
            case 61: {
                n2 -= n3;
            }
            case 62: 
            case 63: {
                lFld >>= n5;
                break;
            }
            case 64: {
                lFld = n3;
                break;
            }
            default: {
                n6 = -123;
            }
        }
        FuzzerUtils.out.println("i13 f3 i14 = " + n + "," + Float.floatToIntBits(f) + "," + n2);
        FuzzerUtils.out.println("i15 i16 s = " + n3 + "," + n4 + "," + s);
        FuzzerUtils.out.println("f4 i17 i18 = " + Float.floatToIntBits(f2) + "," + n5 + "," + n6);
        FuzzerUtils.out.println("iArr lArr1 dArr = " + FuzzerUtils.checkSum(nArray) + "," + FuzzerUtils.checkSum((Object[][])lArray) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum((Object[][])dArray)));
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(nArray2));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dFld = " + instanceCount + "," + iFld + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.fFld Test.lFld byFld = " + Float.floatToIntBits(fFld) + "," + lFld + "," + this.byFld);
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
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
        FuzzerUtils.init(iArrFld, 121);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }
}
