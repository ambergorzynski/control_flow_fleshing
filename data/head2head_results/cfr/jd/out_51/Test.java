/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 212L;
    public static short sFld = (short)-15685;
    public static int iFld = -3606;
    public static byte byFld = (byte)-79;
    public static int iFld1 = 62467;
    public float fFld = 9.735f;
    public static int[] iArrFld = new int[400];
    public byte[] byArrFld = new byte[400];
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long iMeth2_check_sum;

    public static int iMeth2(int n, int n2) {
        int n3 = -4;
        int n4 = -13;
        int n5 = -182;
        int n6 = -5;
        int n7 = 0;
        float f = -127.951f;
        float f2 = 0.282f;
        double d = -1.25537;
        boolean bl = true;
        int n8 = 26;
        short[] sArray = new short[400];
        FuzzerUtils.init(sArray, (short)1984);
        instanceCount <<= n;
        n3 = 1;
        block19: do {
            switch (n3 % 7 * 5 + 109) {
                case 111: {
                    Test.iArrFld[n3 + 1] = n4;
                    break;
                }
                case 141: {
                    for (n5 = n3; n5 < 13; ++n5) {
                        n6 += 101;
                        block21: for (f = 1.0f; f < 1.0f; f += 1.0f) {
                            n6 -= (int)instanceCount;
                            switch ((int)(f % 9.0f * 5.0f + 46.0f)) {
                                case 73: {
                                    d = instanceCount;
                                    n = (int)instanceCount;
                                    instanceCount = (long)((float)instanceCount + (25348.0f + f * f));
                                    n2 += (int)(f * (float)n6 + f - (float)instanceCount);
                                }
                                case 52: {
                                    n2 -= n;
                                    continue block21;
                                }
                                case 60: {
                                    n7 -= n7;
                                    continue block21;
                                }
                                case 76: {
                                    instanceCount >>= n3;
                                }
                                case 80: {
                                    n6 >>= 14740;
                                    continue block21;
                                }
                                case 63: 
                                case 69: {
                                    if (bl) continue block21;
                                }
                                case 81: {
                                    f2 *= (float)n2;
                                }
                                case 47: {
                                    n4 += (int)(f - (float)n3);
                                }
                            }
                        }
                    }
                    continue block19;
                }
                case 138: {
                    n4 = n8;
                    break;
                }
                case 120: {
                    n = (int)((long)n + ((long)n3 | instanceCount));
                    break;
                }
                case 126: {
                    int n9 = n3;
                    sArray[n9] = (short)(sArray[n9] * (short)n5);
                    break;
                }
                case 142: {
                    instanceCount -= instanceCount;
                }
                case 143: {
                    n7 = (int)instanceCount;
                }
            }
        } while (++n3 < 123);
        long l = (long)(n + n2 + n3 + n4 + n5 + n6 + Float.floatToIntBits(f) + n7) + Double.doubleToLongBits(d) + (long)(bl ? 1 : 0) + (long)Float.floatToIntBits(f2) + (long)n8 + FuzzerUtils.checkSum(sArray);
        iMeth2_check_sum += l;
        return (int)l;
    }

    public static int iMeth1(int n) {
        int n2 = -3;
        int n3 = 144;
        int n4 = 44900;
        int n5 = 213;
        float f = 2.958f;
        int n6 = -115;
        double d = -63.82514;
        n2 = 1;
        while ((n2 += 3) < 194) {
            instanceCount = Test.iMeth2(n, n);
            n += n2;
        }
        for (n3 = 12; n3 < 314; ++n3) {
            instanceCount += (long)(n3 * n3) + instanceCount - (long)n4;
            n4 -= n2;
            n = (int)((float)n + ((float)n3 * f + (float)n3 - f));
            n6 = (byte)(n6 ^ (byte)n2);
            d = 1.0;
            while (true) {
                double d2;
                d += 1.0;
                if (!(d2 < 5.0)) break;
                sFld = (short)(sFld >> (short)instanceCount);
            }
            n5 = 1;
            do {
                n4 = (int)instanceCount;
                f -= (float)d;
                n4 >>>= n5;
                n ^= n6;
            } while (++n5 < 5);
        }
        long l = (long)(n + n2 + n3 + n4 + Float.floatToIntBits(f) + n6) + Double.doubleToLongBits(d) + (long)n5;
        iMeth1_check_sum += l;
        return (int)l;
    }

    public static int iMeth(int n, short s, int n2) {
        boolean bl = false;
        boolean bl2 = false;
        int n3 = 30;
        int n4 = 51559;
        int n5 = 109;
        int n6 = -120;
        float f = -2.15f;
        if (bl) {
            Test.iArrFld[(n2 >>> 1) % 400] = Integer.reverseBytes(Test.iMeth1(127)) + n;
            n *= (int)instanceCount;
            n >>= n2;
        } else if (bl) {
            n2 &= (int)instanceCount;
        } else {
            for (n3 = 2; n3 < 286; ++n3) {
                n6 = (byte)(n6 + (byte)(n3 * n3));
                for (f = 1.0f; f < 6.0f; f += 1.0f) {
                    n &= n3;
                    if (bl2) continue;
                    s = (short)(s + (short)f);
                    n5 += n4;
                    instanceCount >>>= (int)instanceCount;
                    n4 += (int)f;
                }
            }
        }
        long l = n + s + n2 + (bl ? 1 : 0) + n3 + n4 + n6 + Float.floatToIntBits(f) + n5 + (bl2 ? 1 : 0);
        iMeth_check_sum += l;
        return (int)l;
    }

    public void mainTest(String[] stringArray) {
        int n = -40493;
        int n2 = 127;
        int n3 = -18;
        int n4 = -11;
        int n5 = 16295;
        int n6 = -37242;
        int n7 = -46959;
        long l = -1491074041L;
        boolean bl = true;
        double d = 2.39916;
        iArrFld[44] = iArrFld[44] ^ Test.iMeth(iFld, sFld, iFld);
        n = 4;
        while (n < 148) {
            n2 = iFld;
            iFld += n | iFld;
            n2 += 46;
            int n8 = n++;
            this.byArrFld[n8] = (byte)(this.byArrFld[n8] >> (byte)(iFld *= 19179));
        }
        for (l = 12L; l < 235L; ++l) {
            n4 = 1;
            block31: do {
                n5 = 1;
                while (n5 < 1) {
                    try {
                        Test.iArrFld[n4] = -1517031157 % n5;
                        n6 /= n;
                        Test.iArrFld[(int)l] = n2 % n4;
                    } catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                    Test.iArrFld[n4] = n5++;
                }
                switch ((int)(l % 9L + 74L)) {
                    case 74: {
                        sFld = (short)1582;
                        n7 = 1;
                        while (++n7 < 1) {
                            switch (n4 % 5 * 5 + 89) {
                                case 114: {
                                    n6 = (int)((long)n6 + ((long)n7 * instanceCount + (long)n2 - (long)n6));
                                    n2 = (int)((long)n2 + ((long)n7 + instanceCount));
                                    switch ((int)(l % 3L + 100L)) {
                                        case 100: {
                                            instanceCount >>= n4;
                                            iFld += n7;
                                            instanceCount += (long)(n7 ^ byFld);
                                            break;
                                        }
                                        case 101: {
                                            n2 += n7 | n5;
                                            break;
                                        }
                                    }
                                    iFld1 -= sFld;
                                    break;
                                }
                                case 99: {
                                    instanceCount *= (long)n2;
                                }
                                case 105: {
                                    n3 >>= n6;
                                    if (bl) break;
                                }
                                case 101: {
                                    try {
                                        n2 = iArrFld[n4 + 1] % 92;
                                        iFld1 = -1473498306 / iArrFld[(int)l];
                                        iFld1 = 67 % n3;
                                    } catch (ArithmeticException arithmeticException) {}
                                    break;
                                }
                                case 108: {
                                    this.fFld += (float)n2;
                                }
                            }
                        }
                        continue block31;
                    }
                    case 75: {
                        byFld = (byte)(byFld + 72);
                        break;
                    }
                    case 76: {
                        Test.iArrFld[n4 + 1] = (int)d;
                        break;
                    }
                    case 77: {
                        try {
                            n3 = n5 % n7;
                            iFld = -36265 % iFld1;
                            n2 = 65472 / n6;
                        } catch (ArithmeticException arithmeticException) {}
                        continue block31;
                    }
                    case 78: {
                        n3 = (int)d;
                        break;
                    }
                    case 79: 
                    case 80: {
                        try {
                            Test.iArrFld[n4 - 1] = n2 % iArrFld[n4];
                            n2 = -30466 / n;
                            n2 = n3 / iArrFld[n4];
                        } catch (ArithmeticException arithmeticException) {
                            // empty catch block
                        }
                    }
                    case 81: {
                        iFld = (int)l;
                        break;
                    }
                    case 82: {
                        n3 -= 31;
                    }
                }
            } while (++n4 < 113);
        }
        FuzzerUtils.out.println("i17 i18 l = " + n + "," + n2 + "," + l);
        FuzzerUtils.out.println("i19 i20 i21 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i22 i23 b3 = " + n6 + "," + n7 + "," + (bl ? 1 : 0));
        FuzzerUtils.out.println("d2 = " + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.iFld = " + instanceCount + "," + sFld + "," + iFld);
        FuzzerUtils.out.println("Test.byFld Test.iFld1 fFld = " + byFld + "," + iFld1 + "," + Float.floatToIntBits(this.fFld));
        FuzzerUtils.out.println("Test.iArrFld byArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(this.byArrFld));
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 80);
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
        iMeth2_check_sum = 0L;
    }
}
