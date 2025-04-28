/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 7949407344421112972L;
    public short sFld = (short)-14927;
    public static volatile boolean bFld = false;
    public float fFld = -1.965f;
    public static int[] iArrFld = new int[400];
    public long[] lArrFld = new long[400];
    public static long vMeth_check_sum;
    public static long lMeth_check_sum;
    public static long iMeth_check_sum;

    public static int iMeth(int n) {
        int n2 = -14;
        int n3 = -166;
        int n4 = -7;
        int n5 = -8;
        int n6 = 0;
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, 9.654f);
        for (n2 = 9; n2 < 165; ++n2) {
            n -= n;
            for (n4 = 1; n4 < 10; ++n4) {
                n5 *= n4;
                try {
                    n5 = 73 / n;
                    n = 200 / n;
                    Test.iArrFld[n2 + 1] = n % n;
                } catch (ArithmeticException arithmeticException) {
                    // empty catch block
                }
                n = 84;
                n6 = (byte)(n6 + (byte)((long)(n4 * n2) + instanceCount - (long)n5));
            }
            n3 = (int)instanceCount;
        }
        long l = (long)(n + n2 + n3 + n4 + n5 + n6) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
        iMeth_check_sum += l;
        return (int)l;
    }

    public static long lMeth(double d) {
        int n = 213;
        int n2 = 167;
        int n3 = -7;
        int n4 = 4;
        int n5 = 6;
        int n6 = 11;
        int n7 = 83;
        int n8 = 64;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, 10L);
        n = 1;
        do {
            n2 = (int)((double)((long)n2 - ((long)n2 - instanceCount)) + ((double)n - (d + (double)n2)));
            d += (double)instanceCount--;
            n2 = Test.iMeth(n) + n2 >> n;
            for (n3 = 1; n3 < 11; ++n3) {
                n4 = n3;
                for (n5 = 1; 2 > n5; ++n5) {
                    n4 += n5 * n5;
                    int n9 = n3;
                    lArray[n9] = lArray[n9] | 0xA2D856498F216A07L;
                    if (bFld) break;
                    try {
                        n2 = n3 / -23;
                        n4 /= -26546;
                        n4 = 1543567387 / iArrFld[n + 1];
                        continue;
                    } catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                }
                n7 = 1;
                while (++n7 < 2) {
                    int n10 = n;
                    iArrFld[n10] = iArrFld[n10] - n6;
                    n8 = (byte)n5;
                }
            }
        } while (++n < 148);
        long l = Double.doubleToLongBits(d) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + FuzzerUtils.checkSum(lArray);
        lMeth_check_sum += l;
        return l;
    }

    public void vMeth() {
        double d = -55.95068;
        int n = 11980;
        int n2 = 5;
        int n3 = -41868;
        int n4 = 60770;
        int n5 = -59673;
        int n6 = 57;
        int n7 = 76;
        instanceCount += (long)(-(-(d - (double)n)));
        n *= (int)this.fFld;
        n += (int)Test.lMeth(d);
        for (n2 = 271; n2 > 16; n2 -= 3) {
            n4 = 1;
            do {
                d = -1.0;
            } while (++n4 < 18);
            for (n5 = n2; n5 < 18; ++n5) {
                this.lArrFld[n2 - 1] = instanceCount;
                instanceCount -= (long)n5;
                instanceCount >>= n;
                n6 >>= n7;
                Test.iArrFld[n2 - 1] = 136;
                instanceCount = n2;
                n6 = n3;
                n6 -= 242;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7;
    }

    public void mainTest(String[] stringArray) {
        int n = 214;
        int n2 = 210;
        int n3 = -52;
        int n4 = 20535;
        int n5 = -27656;
        int n6 = -3;
        int n7 = -6;
        double d = -44.105857;
        double[] dArray = new double[400];
        int n8 = -3308;
        float f = 112.646f;
        int n9 = 22;
        FuzzerUtils.init(dArray, -17.120203);
        this.sFld = (short)(this.sFld * (short)n);
        for (n2 = 5; n2 < 142; ++n2) {
            this.fFld = this.sFld;
            bFld = (float)((31600 + n * -33) * ++n3) != (float)Math.abs(-190) - this.fFld;
            block11: for (n4 = 2; n4 < 183; ++n4) {
                n5 += (int)(859163902L + (long)(n4 * n4));
                this.vMeth();
                switch ((n >>> 1) % 6 + 75) {
                    case 75: {
                        n5 = n4;
                        d *= (double)n4;
                        n8 = 11;
                        n5 <<= n3;
                    }
                    case 76: {
                        d = instanceCount;
                        for (f = 1.0f; f < 2.0f; f += 1.0f) {
                            Test.iArrFld[n2 - 1] = -85;
                            instanceCount *= (long)n3;
                            n = n5;
                            n3 += (int)f;
                            n = (int)f;
                            n3 += (int)(f * (float)n3);
                            n = n9;
                            n3 *= n2;
                        }
                        instanceCount -= (long)n9;
                        instanceCount += (long)n4;
                        continue block11;
                    }
                    case 77: {
                        n += 157;
                        n7 = 1;
                        while (++n7 < 2) {
                            n3 = n2;
                            n5 += n7 + n5;
                            n8 = (short)(n8 - (short)n3);
                        }
                        continue block11;
                    }
                    case 78: {
                        continue block11;
                    }
                    case 79: {
                        n3 += n4;
                    }
                    case 80: {
                        try {
                            n = iArrFld[n4] % n5;
                            n = n5 % 37706;
                            n3 = n4 % n5;
                        } catch (ArithmeticException arithmeticException) {}
                        continue block11;
                    }
                    default: {
                        n += n4;
                    }
                }
            }
        }
        FuzzerUtils.out.println("i i1 i2 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i3 i4 d2 = " + n4 + "," + n5 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("s f i23 = " + (short)n8 + "," + Float.floatToIntBits(f) + "," + n6);
        FuzzerUtils.out.println("by3 i24 dArr = " + (byte)n9 + "," + n7 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray)));
        FuzzerUtils.out.println("Test.instanceCount sFld Test.bFld = " + instanceCount + "," + this.sFld + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("fFld Test.iArrFld lArrFld = " + Float.floatToIntBits(this.fFld) + "," + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(this.lArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 11);
        vMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }
}
