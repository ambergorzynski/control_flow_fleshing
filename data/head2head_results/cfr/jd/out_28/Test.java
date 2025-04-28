/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 172L;
    public static double dFld = 1.33904;
    public int iFld = 157;
    public volatile short[] sArrFld = new short[400];
    public static int[] iArrFld = new int[400];
    public float[] fArrFld = new float[400];
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long lMeth_check_sum;

    public static long lMeth(int n) {
        int n2 = 59471;
        int n3 = 1;
        int n4 = -59344;
        int n5 = 190;
        int[] nArray = new int[400];
        float f = 0.1012f;
        long l = -27287L;
        long[][][] lArray = new long[400][400][400];
        int n6 = 5267;
        double d = -8.62928;
        int n7 = -29;
        FuzzerUtils.init(nArray, 12);
        FuzzerUtils.init((Object[][])lArray, (Object)-164788123L);
        for (n2 = 297; n2 > 17; --n2) {
            f = 1.0f;
            do {
                for (l = 1L; l < 1L; ++l) {
                    n6 = (short)(n6 ^ (short)(n4 ^= n));
                    instanceCount = n4;
                }
                n6 = (short)(n6 + (short)(f * (float)n4 + (float)instanceCount - (float)l));
                nArray[(int)(f - 1.0f)] = n3;
                for (d = 1.0; d < 1.0; d += 1.0) {
                    n4 <<= n2;
                    if (n != 0) {
                        // empty if block
                    }
                    n4 += (int)(d * (double)instanceCount + (double)n7 - (double)n2);
                    lArray[n2 + 1][n2 + 1] = lArray[(int)(d - 1.0)][(int)(f + 1.0f)];
                }
            } while ((f += 1.0f) < 6.0f);
        }
        long l2 = (long)(n + n2 + n3 + Float.floatToIntBits(f)) + l + (long)n4 + (long)n6 + Double.doubleToLongBits(d) + (long)n5 + (long)n7 + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum((Object[][])lArray);
        lMeth_check_sum += l2;
        return l2;
    }

    public static void vMeth(int n, int n2, float f) {
        int n3 = -2409;
        int n4 = 142;
        int n5 = 12;
        int n6 = 131;
        int n7 = 7;
        int n8 = 241;
        int n9 = 61287;
        int[] nArray = new int[400];
        int n10 = -59;
        int n11 = -18595;
        FuzzerUtils.init(nArray, 8);
        try {
            f = (long)n2 - ((long)n * instanceCount - (-54970L + (long)(n * n2)));
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            n2 >>= (int)Test.lMeth(n);
            for (n3 = 5; n3 < 189; ++n3) {
                n4 |= n10;
                n5 = 1;
                while (++n5 < 9) {
                    nArray[n3 - 1] = n6;
                }
                nArray[n3] = 8;
                f += 7.0f;
                for (n7 = 1; n7 < 9; ++n7) {
                    n8 = (int)instanceCount;
                    n9 = 1;
                    while (++n9 < 2) {
                        n11 = (short)n;
                        n10 = (byte)(n10 - (byte)n8);
                        f += (float)((long)n9 | (long)n);
                    }
                }
            }
        }
        vMeth_check_sum += (long)(n + n2 + Float.floatToIntBits(f) + n3 + n4 + n10 + n5 + n6 + n7 + n8 + n9 + n11) + FuzzerUtils.checkSum(nArray);
    }

    public static int iMeth() {
        long l = 3359109783L;
        int n = 237;
        int n2 = -12;
        int n3 = -146;
        int n4 = 22835;
        int n5 = -79;
        int n6 = -205;
        int[] nArray = new int[400];
        float f = -1.738f;
        FuzzerUtils.init(nArray, 58);
        for (l = 5L; l < 193L; ++l) {
            for (n2 = (int)l; n2 < 8; ++n2) {
                instanceCount *= (long)(++n3);
                int n7 = (int)l;
                int n8 = nArray[n7];
                nArray[n7] = n8 - 1;
                instanceCount = n8;
                Test.vMeth(n2, n2, -1.84f);
                n3 = n;
                n4 = 1;
                while (++n4 < 1) {
                    dFld += (double)n2;
                    f = n;
                    instanceCount += (long)n4 * instanceCount;
                }
                n3 >>= n2;
                for (n5 = (int)l; n5 < 1; ++n5) {
                    nArray[n2 + 1] = -201;
                    n3 *= -241;
                }
            }
        }
        long l2 = l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)Float.floatToIntBits(f) + (long)n5 + (long)n6 + FuzzerUtils.checkSum(nArray);
        iMeth_check_sum += l2;
        return (int)l2;
    }

    public void mainTest(String[] stringArray) {
        int n = -21563;
        int n2 = 0;
        int n3 = -41178;
        int n4 = 12;
        int n5 = -8;
        int n6 = -155;
        int n7 = -13;
        float f = -15.264f;
        byte by = -51;
        boolean bl = true;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -53L);
        n = 1;
        while (++n < 301) {
            f += (float)((long)(n * by) + instanceCount - instanceCount);
            by = (byte)(by - (byte)f);
            by = (byte)(-by - Test.iMeth());
            for (n2 = n; 84 > n2; ++n2) {
                n3 *= (int)instanceCount;
                instanceCount = 30524L;
                if (bl) break;
                if (bl) continue;
                instanceCount += (long)(n2 * n3 + by - n3);
            }
            try {
                n3 = -238 % n2;
                n3 = n2 / 161;
                n3 = n2 % -1543850696;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            block4: for (n4 = 4; n4 < 84; ++n4) {
                lArray[n4 - 1] = (long)f;
                this.iFld -= (int)dFld;
                for (n6 = 1; n6 < 2; ++n6) {
                    int n8 = 2204;
                    instanceCount *= (long)n;
                    this.iFld += n6 * n3 + (n5 -= (int)f) - n7;
                    n7 += n6 * n6;
                    if (!bl) continue block4;
                    int n9 = n;
                    lArray[n9] = lArray[n9] + instanceCount;
                    f = -24198.0f;
                }
            }
        }
        FuzzerUtils.out.println("i f by = " + n + "," + Float.floatToIntBits(f) + "," + by);
        FuzzerUtils.out.println("i21 i22 b = " + n2 + "," + n3 + "," + (bl ? 1 : 0));
        FuzzerUtils.out.println("i23 i24 i25 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i26 lArr1 = " + n7 + "," + FuzzerUtils.checkSum(lArray));
        FuzzerUtils.out.println("Test.instanceCount Test.dFld iFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + this.iFld);
        FuzzerUtils.out.println("sArrFld Test.iArrFld fArrFld = " + FuzzerUtils.checkSum(this.sArrFld) + "," + FuzzerUtils.checkSum(iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld)));
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, -29739);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
    }
}
