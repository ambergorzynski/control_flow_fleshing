/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static volatile long instanceCount = 2971546135277825206L;
    public static int iFld = -4;
    public static byte byFld = (byte)-11;
    public static double dFld = 0.52899;
    public static volatile float fFld = 2.583f;
    public static boolean bFld = true;
    public static short sFld = (short)-10242;
    public int iFld1 = 11;
    public int[][] iArrFld = new int[400][400];
    public static short[] sArrFld = new short[400];
    public static long fMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1() {
        int n = -12;
        int n2 = -3;
        int n3 = 145;
        int n4 = 146;
        int n5 = -13;
        int n6 = -4;
        int[] nArray = new int[400];
        float f = -2.597f;
        float f2 = 15.845f;
        double d = -2.4612;
        int n7 = 25778;
        FuzzerUtils.init(nArray, 5);
        instanceCount = -127L;
        switch ((iFld >>> 1) % 9 * 5 + 61) {
            case 84: {
                n = 271;
                do {
                    f -= (float)n;
                } while (--n > 0);
                break;
            }
            case 93: {
                for (f2 = 167.0f; f2 > 9.0f; f2 -= 1.0f) {
                    for (n3 = 1; n3 < 10; ++n3) {
                        n5 = 1;
                        if (n5 >= 2) continue;
                        n2 <<= n3;
                        f *= (float)instanceCount;
                        f += (float)(n2 -= 46786);
                        n6 = n4;
                        int n8 = n3 + 1;
                        nArray[n8] = nArray[n8] + 12775;
                    }
                }
                break;
            }
            case 69: {
                nArray = FuzzerUtils.int1array(400, -246);
                break;
            }
            case 104: {
                d %= -12.0;
            }
            case 90: {
                instanceCount = 1L;
            }
            case 82: {
                n6 &= n4;
                break;
            }
            case 85: {
                int n9 = (n4 >>> 1) % 400;
                nArray[n9] = nArray[n9] + 113;
                break;
            }
            case 86: {
                n6 += n4;
                break;
            }
            case 73: {
                nArray[(n >>> 1) % 400] = n7;
            }
        }
        vMeth1_check_sum += (long)(n + Float.floatToIntBits(f) + Float.floatToIntBits(f2) + n2 + n3 + n4 + n5 + n6) + Double.doubleToLongBits(d) + (long)n7 + FuzzerUtils.checkSum(nArray);
    }

    public static void vMeth() {
        int n = 11;
        int n2 = 170;
        int n3 = 58;
        int n4 = 82;
        int n5 = -13;
        int n6 = 13;
        int[][] nArray = new int[400][400];
        float f = -120.101f;
        int n7 = -22496;
        byte[] byArray = new byte[400];
        FuzzerUtils.init(byArray, (byte)41);
        FuzzerUtils.init(nArray, -180);
        Test.vMeth1();
        n = 1;
        do {
            instanceCount -= (long)iFld;
            iFld += n * n;
            for (n2 = 1; n2 < 9; ++n2) {
                dFld += (double)instanceCount;
            }
            iFld += n;
            f = -5415.0f;
            n3 = 53031;
        } while (++n < 187);
        for (n4 = 7; n4 < 148; ++n4) {
            n6 = 11;
            do {
                switch (n6 % 2 * 5 + 46) {
                    case 53: {
                        n3 += (int)f;
                        n3 = (int)((float)n3 + ((float)(n6 * n3 + n7) - f));
                        n5 = n7;
                    }
                    case 52: {
                        byFld = (byte)(byFld ^ 0x56);
                    }
                }
                int[] nArray2 = nArray[n6];
                int n8 = n6 + 1;
                nArray2[n8] = nArray2[n8] + n5;
            } while (--n6 > 0);
        }
        vMeth_check_sum += (long)(n + n2 + n3 + Float.floatToIntBits(f) + n4 + n5 + n6 + n7) + FuzzerUtils.checkSum(byArray) + FuzzerUtils.checkSum(nArray);
    }

    public static float fMeth(int n, boolean bl, long l) {
        int n2 = -12938;
        int n3 = -64;
        int n4 = -62;
        int n5 = 15881;
        int n6 = 56187;
        int n7 = 77;
        int[][][] nArray = new int[400][400][400];
        long l2 = 4282L;
        long[] lArray = new long[400];
        FuzzerUtils.init((Object[][])nArray, (Object)-1);
        FuzzerUtils.init(lArray, 1L);
        Test.vMeth();
        fFld = iFld;
        if (bl) {
            iFld = n;
            n2 = 1;
            do {
                for (n3 = 1; n3 < 4; ++n3) {
                    n -= n2;
                }
                try {
                    n = nArray[n2 - 1][n2 - 1][n2] / n2;
                    nArray[n2][n2][n2] = -43417 % n;
                    n5 = nArray[n2 - 1][n2 - 1][n2 + 1] % -7;
                } catch (ArithmeticException arithmeticException) {
                    // empty catch block
                }
                int n8 = n2 + 1;
                lArray[n8] = lArray[n8] - (long)n2;
                if (!bl) continue;
                if (bl) {
                    n6 = 1;
                    do {
                        n5 += iFld;
                    } while (++n6 < 4);
                    n <<= (int)l;
                    l2 += (long)n2;
                    continue;
                }
                if (bl) {
                    instanceCount = n5;
                    continue;
                }
                iFld = n2;
            } while (++n2 < 378);
        } else if (bl) {
            nArray[(n2 >>> 1) % 400][(n >>> 1) % 400][(n7 >>> 1) % 400] = 13617;
        } else if (bl) {
            int n9 = (n >>> 1) % 400;
            lArray[n9] = lArray[n9] | (long)iFld;
        } else {
            dFld = fFld;
        }
        long l3 = (long)(n + (bl ? 1 : 0)) + l + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + l2 + (long)n7 + FuzzerUtils.checkSum((Object[][])nArray) + FuzzerUtils.checkSum(lArray);
        fMeth_check_sum += l3;
        return l3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void mainTest(String[] stringArray) {
        int n = -43744;
        int n2 = 168;
        int n3 = 97;
        int n4 = -166;
        int n5 = -3;
        int n6 = -51471;
        int n7 = -9;
        int n8 = 49198;
        int n9 = 22678;
        float f = 11.481f;
        double[] dArray = new double[400];
        FuzzerUtils.init(dArray, -1.37998);
        try {
            n *= (int)(Test.fMeth(n, bFld, instanceCount) + fFld);
            for (n2 = 1; n2 < 330; ++n2) {
                for (f = (float)n2; f < 76.0f; f += 1.0f) {
                    n3 >>= n4;
                    fFld -= (float)n4;
                    int n10 = n2 + 1;
                    dArray[n10] = dArray[n10] + (double)(n += (int)(f * (float)n2 + (float)iFld - (float)byFld));
                    this.iArrFld = this.iArrFld;
                }
                n4 += n2;
                try {
                    iFld = n4 % 6851;
                    n3 %= this.iArrFld[n2][n2];
                    n3 /= -122;
                } catch (ArithmeticException arithmeticException) {
                    // empty catch block
                }
                int[] nArray = this.iArrFld[n2 - 1];
                int n11 = n2 + 1;
                nArray[n11] = nArray[n11] * (int)dFld;
            }
        } catch (ArithmeticException arithmeticException) {
            block27: for (n5 = 381; 10 < n5; n5 -= 3) {
                switch ((n >>> 1) % 6 + 86) {
                    case 86: {
                        if (bFld) continue block27;
                        for (n7 = 5; n7 < 204; ++n7) {
                            if (bFld) continue;
                            iFld = -66;
                            n += (int)instanceCount;
                            n9 = 1;
                            do {
                                switch (n9 % 8 * 5 + 27) {
                                    case 43: 
                                    case 45: 
                                    case 67: {
                                        instanceCount = 2L;
                                        fFld = n6;
                                        n = (int)((long)n + ((long)n9 - instanceCount));
                                        byFld = (byte)(byFld << 9);
                                        break;
                                    }
                                    case 34: {
                                        sFld = (short)n6;
                                        break;
                                    }
                                    case 37: {
                                        n += n5;
                                        instanceCount = n2;
                                        n *= n5;
                                        break;
                                    }
                                    case 58: {
                                        instanceCount = n9;
                                        break;
                                    }
                                    case 53: {
                                        iFld -= n5;
                                        break;
                                    }
                                    case 38: {
                                        instanceCount = n;
                                        break;
                                    }
                                    default: {
                                        instanceCount <<= (int)instanceCount;
                                    }
                                }
                            } while (++n9 < 2);
                        }
                        continue block27;
                    }
                    case 87: {
                        n4 >>= n2;
                        continue block27;
                    }
                    case 88: {
                        instanceCount = n4;
                        continue block27;
                    }
                    case 89: {
                        int n12 = n5;
                        sArrFld[n12] = (short)(sArrFld[n12] - byFld);
                        continue block27;
                    }
                    case 90: {
                        try {
                            n = 874204483 / iFld;
                            this.iArrFld[n5][n5 - 1] = this.iFld1 % n6;
                            iFld = 94 / n9;
                        } catch (ArithmeticException arithmeticException2) {}
                        continue block27;
                    }
                    case 91: {
                        this.iArrFld[n5 + 1][n5] = (int)instanceCount;
                    }
                }
            }
        } finally {
            instanceCount ^= (long)this.iFld1;
        }
        FuzzerUtils.out.println("i i20 i21 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("f3 i22 i23 = " + Float.floatToIntBits(f) + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i24 i25 i26 = " + n6 + "," + n7 + "," + n8);
        FuzzerUtils.out.println("i27 dArr = " + n9 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray)));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.byFld = " + instanceCount + "," + iFld + "," + byFld);
        FuzzerUtils.out.println("Test.dFld Test.fFld Test.bFld = " + Double.doubleToLongBits(dFld) + "," + Float.floatToIntBits(fFld) + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.sFld iFld1 iArrFld = " + sFld + "," + this.iFld1 + "," + FuzzerUtils.checkSum(this.iArrFld));
        FuzzerUtils.out.println("Test.sArrFld = " + FuzzerUtils.checkSum(sArrFld));
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
        FuzzerUtils.init(sArrFld, (short)-10064);
        fMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}
