/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -48L;
    public static int iFld = -46;
    public static short sFld = (short)-5987;
    public boolean bFld = true;
    public static float fFld = -56.206f;
    public static int[] iArrFld = new int[400];
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long bMeth_check_sum;

    public static boolean bMeth(int n, double d) {
        int n2 = -109;
        int n3 = -7;
        int n4 = 245;
        int n5 = 8;
        int n6 = -12875;
        int n7 = 7;
        int n8 = 16;
        int n9 = -164;
        int[] nArray = new int[400];
        float[] fArray = new float[400];
        FuzzerUtils.init(nArray, 14);
        FuzzerUtils.init(fArray, 0.899f);
        nArray[(n >>> 1) % 400] = (int)instanceCount;
        for (n2 = 1; n2 < 199; ++n2) {
            d -= -2.068310043E9;
            instanceCount += (long)n;
        }
        sFld = (short)instanceCount;
        n3 = iFld;
        long l = (long)n + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + (long)n9 + FuzzerUtils.checkSum(nArray) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
        bMeth_check_sum += l;
        return l % 2L > 0L;
    }

    public static void vMeth(short s) {
        int n = -1;
        int n2 = -12;
        int n3 = 178;
        int n4 = 13;
        int n5 = -22904;
        double d = -2.106598;
        double d2 = 2.111481;
        boolean bl = false;
        float f = 2.354f;
        block6: for (n = 349; n > 4 && !Test.bMeth(iFld, d) && !bl; n -= 3) {
            int n6 = n - 1;
            iArrFld[n6] = iArrFld[n6] + -247;
            n2 += sFld;
            int n7 = n + 1;
            iArrFld[n7] = iArrFld[n7] - (int)d;
            d2 = 1.0;
            block7: while (true) {
                double d3;
                d2 += 1.0;
                if (!(d3 < 14.0)) continue block6;
                if (bl) continue;
                switch ((int)(d2 % 5.0 * 5.0 + 122.0)) {
                    case 146: 
                    case 147: {
                        iFld -= 115;
                        n3 = 1;
                        do {
                            n2 += n3 * n + n - iFld;
                            n2 = n;
                            f -= (float)iFld;
                            n4 |= 6;
                            iFld = 249;
                        } while (++n3 < 1);
                        continue block7;
                    }
                    case 136: {
                        iFld += (int)d;
                        continue block7;
                    }
                    case 145: {
                        n2 = n4;
                        continue block7;
                    }
                    case 124: {
                        n5 = (int)instanceCount;
                        continue block7;
                    }
                }
                n4 -= iFld;
            }
        }
        vMeth_check_sum += (long)(s + n + n2) + Double.doubleToLongBits(d) + (long)(bl ? 1 : 0) + Double.doubleToLongBits(d2) + (long)n3 + (long)Float.floatToIntBits(f) + (long)n4 + (long)n5;
    }

    public static void vSmallMeth(boolean bl) {
        Test.vMeth(sFld);
        vSmallMeth_check_sum += (long)(bl ? 1 : 0);
    }

    public void mainTest(String[] stringArray) {
        int n = -44802;
        int n2 = 111;
        int n3 = -251;
        int n4 = -40203;
        int n5 = 5;
        int n6 = 2;
        int n7 = 11;
        int[] nArray = new int[400];
        byte by = 20;
        FuzzerUtils.init(nArray, -8027);
        ++iFld;
        for (n = 353; 8 < n; n -= 3) {
            int n8 = 1;
            int n9 = -115;
            int n10 = n2;
            iFld = n10;
            instanceCount += (long)iFld--;
            instanceCount = (long)(nArray[n + 1] - n10) % (instanceCount | 1L);
            n3 = 218;
            do {
                iFld >>= (int)instanceCount++;
                for (int i = 0; i < 1; ++i) {
                    Test.vSmallMeth(this.bFld);
                }
            } while ((n3 -= 2) > 0);
            iFld += n + iFld;
            try {
                iFld = n3 % iFld;
                Test.iArrFld[n] = n3 % 11536;
                n2 = n8 % n;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            n2 = n9;
        }
        iFld ^= n;
        iFld = n2;
        instanceCount *= (long)iFld;
        n4 = 1;
        do {
            int n11 = n4;
            nArray[n11] = nArray[n11] - n2;
            iFld *= (int)fFld;
            fFld -= (float)sFld;
            n5 = 1;
            do {
                nArray = FuzzerUtils.int1array(400, 6);
                nArray[n5 + 1] = n2;
                fFld += (float)n4;
                n2 += -27 + n5 * n5;
                for (n6 = n4; n6 < 1; ++n6) {
                    iFld = n2;
                    instanceCount += (long)by;
                    if (this.bFld) break;
                    n2 -= (int)instanceCount;
                    n7 = (int)((float)n7 + (float)n6 * fFld);
                    iFld += iFld;
                }
                instanceCount = 2L;
            } while (++n5 < 76);
        } while (++n4 < 331);
        FuzzerUtils.out.println("i i1 i3 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i19 i20 i21 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i22 by1 iArr = " + n7 + "," + by + "," + FuzzerUtils.checkSum(nArray));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.sFld = " + instanceCount + "," + iFld + "," + sFld);
        FuzzerUtils.out.println("bFld Test.fFld Test.iArrFld = " + (this.bFld ? 1 : 0) + "," + Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 9276);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        bMeth_check_sum = 0L;
    }
}
