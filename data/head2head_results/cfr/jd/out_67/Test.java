/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static volatile long instanceCount = 9074857311583770698L;
    public static float fFld = -109.6f;
    public static short sFld = (short)9981;
    public static volatile byte byFld = (byte)-12;
    public static int[] iArrFld = new int[400];
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;

    public static int iMeth(int n, int n2, long l) {
        int n3 = -78;
        int n4 = -13;
        int n5 = 14;
        int n6 = -2;
        int n7 = 44231;
        long[] lArray = new long[400];
        double[][][] dArray = new double[400][400][400];
        FuzzerUtils.init(lArray, -2120058395L);
        FuzzerUtils.init((Object[][])dArray, (Object)42.10731);
        lArray[(n >>> 1) % 400] = 17982L;
        n2 = (int)fFld;
        fFld = n;
        dArray[(n2 >>> 1) % 400][349][(n2 >>> 1) % 400] = instanceCount *= -26928L;
        iArrFld[303] = iArrFld[303] >> n;
        n3 = (byte)n;
        int n8 = (n >>> 1) % 400;
        lArray[n8] = lArray[n8] >> n2;
        for (n4 = 1; n4 < 130; ++n4) {
            instanceCount >>= (int)l;
            int n9 = n4;
            iArrFld[n9] = iArrFld[n9] + sFld;
            for (n6 = n4; 12 > n6; n6 += 2) {
                try {
                    Test.iArrFld[n6] = n7 % 11881;
                    n7 = n / n2;
                    Test.iArrFld[n4 - 1] = iArrFld[n4 + 1] / -232;
                } catch (ArithmeticException arithmeticException) {
                    // empty catch block
                }
                int n10 = n4 - 1;
                iArrFld[n10] = iArrFld[n10] >> (int)l;
                Test.iArrFld[n6 - 1] = n5;
            }
        }
        long l2 = (long)(n + n2) + l + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + FuzzerUtils.checkSum(lArray) + Double.doubleToLongBits(FuzzerUtils.checkSum((Object[][])dArray));
        iMeth_check_sum += l2;
        return (int)l2;
    }

    public static void vMeth(float f) {
        float f2 = -84.188f;
        int n = 52;
        int n2 = 13;
        int n3 = -9;
        int n4 = 0;
        int[] nArray = new int[400];
        int n5 = -11872;
        double d = 25.19242;
        boolean bl = true;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -18934L);
        FuzzerUtils.init(nArray, 0);
        for (f2 = 6.0f; 297.0f > f2; f2 += 1.0f) {
            n = (int)instanceCount;
            int n6 = (int)(f2 - 1.0f);
            lArray[n6] = lArray[n6] - -instanceCount;
            int[] nArray2 = nArray;
            nArray = nArray2;
            nArray = nArray2;
            nArray = nArray2;
            instanceCount += (long)(f2 * (float)n + (float)n - (float)instanceCount);
            n2 = 1;
            block16: do {
                switch ((int)(f2 % 10.0f + 83.0f)) {
                    case 83: {
                        for (n3 = 1; n3 < 1; ++n3) {
                            int n7 = n2 + 1;
                            int n8 = nArray[n7] + 1;
                            nArray[n7] = n8;
                            instanceCount = (long)n8 * ((long)n5 + instanceCount + (long)Test.iMeth(-29973, -2, instanceCount));
                            d = n;
                            try {
                                n = n2 % n4;
                                n = n3 % iArrFld[n3 + 1];
                                Test.iArrFld[n2] = n2 % n;
                            } catch (ArithmeticException arithmeticException) {
                                // empty catch block
                            }
                            n4 = n3;
                            n5 = (short)(n5 ^ (short)(n /= n4 | 1));
                            sFld = (short)(sFld + (short)(n3 * n3));
                        }
                        continue block16;
                    }
                    case 84: {
                        instanceCount *= (long)n;
                        break;
                    }
                    case 85: {
                        try {
                            n = nArray[(int)(f2 + 1.0f)] % iArrFld[n2 - 1];
                            n4 = -92 / n4;
                            n = nArray[(int)(f2 - 1.0f)] % n4;
                        } catch (ArithmeticException arithmeticException) {}
                        continue block16;
                    }
                    case 86: {
                        n += n2;
                        break;
                    }
                    case 87: {
                        f -= 0.0f;
                        break;
                    }
                    case 88: {
                        d = n2;
                        break;
                    }
                    case 89: {
                        fFld -= f;
                    }
                    case 90: 
                    case 91: {
                        if (!bl) continue block16;
                        break;
                    }
                    case 92: {
                        n4 += n2 * n4 + n3 - byFld;
                        break;
                    }
                    default: {
                        if (n == 0) continue block16;
                        vMeth_check_sum += (long)(Float.floatToIntBits(f) + Float.floatToIntBits(f2) + n + n2 + n3 + n4 + n5) + Double.doubleToLongBits(d) + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(nArray);
                        return;
                    }
                }
            } while (++n2 < 6);
        }
        vMeth_check_sum += (long)(Float.floatToIntBits(f) + Float.floatToIntBits(f2) + n + n2 + n3 + n4 + n5) + Double.doubleToLongBits(d) + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(nArray);
    }

    public static void vSmallMeth(byte by, int n, int n2) {
        Test.vMeth(fFld);
        vSmallMeth_check_sum += (long)(by + n + n2);
    }

    public void mainTest(String[] stringArray) {
        int n = 6798;
        int n2 = 49962;
        int n3 = 10;
        int n4 = 39237;
        int n5 = -203;
        int n6 = -6;
        int n7 = -5;
        float f = 2.188f;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -5L);
        for (long l : lArray) {
            for (int i = 0; i < 62; ++i) {
                Test.vSmallMeth(byFld, n, n);
            }
        }
        iArrFld[243] = iArrFld[243] + byFld;
        f = 1.0f;
        block21: while (true) {
            float f2;
            f += 1.0f;
            if (!(f2 < 283.0f)) break;
            n >>>= n;
            n2 = 5;
            while (true) {
                if (n2 >= 89) continue block21;
                fFld += 9.0f;
                for (n4 = 1; 2 > n4; ++n4) {
                    n5 >>= n4;
                }
                Test.iArrFld[n2 - 1] = n;
                instanceCount = 17241L;
                block24: for (n6 = 2; n6 > n2; n6 -= 3) {
                    instanceCount += (long)(n6 + n4);
                    n7 <<= sFld;
                    switch ((int)(f % 7.0f + 13.0f)) {
                        case 13: {
                            switch ((n6 >>> 1) % 9 + 106) {
                                case 106: {
                                    int n8 = n2;
                                    iArrFld[n8] = iArrFld[n8] - n2;
                                }
                                case 107: {
                                    n7 >>= -34679;
                                    instanceCount = n5;
                                    n7 -= 2;
                                }
                                case 108: {
                                    instanceCount -= (long)n7;
                                    n = -19631;
                                    n7 += n6 * n6;
                                    --n3;
                                    break;
                                }
                                case 109: 
                                case 110: {
                                    sFld = (short)n5;
                                    int n9 = (int)f;
                                    iArrFld[n9] = iArrFld[n9] << 8;
                                    break;
                                }
                                case 111: {
                                    n7 = (int)((float)n7 + ((float)(n6 * n + n4) - fFld));
                                    break;
                                }
                                case 112: {
                                    Test.iArrFld[(int)f] = n7;
                                    n3 <<= (n >>= n4);
                                }
                                case 113: {
                                    fFld += (float)instanceCount;
                                    break;
                                }
                                case 114: {
                                    instanceCount >>= -8;
                                }
                            }
                        }
                        case 14: {
                            n5 += n7;
                            continue block24;
                        }
                        case 15: {
                            byFld = (byte)(byFld | (byte)n7);
                            continue block24;
                        }
                        case 16: {
                            n7 = n6;
                            continue block24;
                        }
                        case 17: {
                            sFld = (short)(sFld - (short)n6);
                            continue block24;
                        }
                        case 18: {
                            n += n3;
                            continue block24;
                        }
                        case 19: {
                            fFld += (float)(-192 + n6 * n6);
                        }
                    }
                }
                ++n2;
            }
            break;
        }
        FuzzerUtils.out.println("i12 f2 i13 = " + n + "," + Float.floatToIntBits(f) + "," + n2);
        FuzzerUtils.out.println("i14 i15 i16 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i17 i18 lArr = " + n6 + "," + n7 + "," + FuzzerUtils.checkSum(lArray));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.sFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + sFld);
        FuzzerUtils.out.println("Test.byFld Test.iArrFld = " + byFld + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 8);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }
}
