/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -1937430437L;
    public static short sFld = (short)-6504;
    public static int iFld = 183;
    public float fFld = 5.441f;
    public boolean bFld = true;
    public static float[] fArrFld = new float[400];
    public static int[] iArrFld = new int[400];
    public static long[] lArrFld = new long[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;

    public static void vMeth2() {
        int n = -33065;
        int n2 = -12;
        int n3 = 30396;
        int n4 = -1;
        int n5 = 11;
        int n6 = -151;
        double d = -114.50572;
        int n7 = -39;
        for (n = 2; n < 158; ++n) {
            instanceCount = n2;
            n2 = (int)instanceCount;
            int n8 = (n2 >>> 1) % 400;
            iArrFld[n8] = iArrFld[n8] - (int)instanceCount;
            for (n3 = 1; n3 < 10; ++n3) {
                d += (double)n4;
            }
        }
        n4 = (int)d;
        try {
            for (n5 = 13; n5 < 241; ++n5) {
                instanceCount += (long)n5 * instanceCount + (long)n6 - (long)n5;
                instanceCount /= (long)(n6 | 1);
                n7 = (byte)(n7 | (byte)n3);
            }
            n4 >>= n;
            n6 += (int)instanceCount;
            n2 >>= n;
        } catch (UserDefinedExceptionTest userDefinedExceptionTest) {
            n2 += n6;
        }
        vMeth2_check_sum += (long)(n + n2 + n3 + n4) + Double.doubleToLongBits(d) + (long)n5 + (long)n6 + (long)n7;
    }

    public static void vMeth1(float f, int n) {
        int n2 = -63162;
        int n3 = -7;
        int n4 = 7;
        int n5 = -233;
        double d = 1.101244;
        int n6 = -67;
        boolean bl = true;
        short[] sArray = new short[400];
        FuzzerUtils.init(sArray, (short)-4592);
        for (n2 = 13; n2 < 296; ++n2) {
            n |= (int)((double)n2 * d);
            Test.vMeth2();
        }
        n3 = sFld;
        n = (int)instanceCount;
        n6 = (byte)(n6 + (byte)f);
        sArray[(n >>> 1) % 400] = (short)(n3 += n2);
        instanceCount = n2;
        Test.lArrFld[(n3 >>> 1) % 400] = n3;
        for (long l : lArrFld) {
            for (n4 = 1; n4 < 4; ++n4) {
                Test.iArrFld[n4 + 1] = (int)instanceCount;
                n |= n3;
            }
        }
        vMeth1_check_sum += (long)(Float.floatToIntBits(f) + n + n2 + n3) + Double.doubleToLongBits(d) + (long)n6 + (long)(bl ? 1 : 0) + (long)n4 + (long)n5 + FuzzerUtils.checkSum(sArray);
    }

    public void vMeth() {
        float f = 0.153f;
        Test.vMeth1(f, iFld);
        vMeth_check_sum += (long)Float.floatToIntBits(f);
    }

    public void mainTest(String[] stringArray) {
        int n = -5;
        int n2 = -15541;
        int n3 = -139;
        int n4 = 29;
        int n5 = -3;
        int n6 = -10;
        int n7 = -91;
        int n8 = -247;
        int n9 = -5652;
        int n10 = -62959;
        byte by = -45;
        instanceCount = (long)fArrFld[(n >>> 1) % 400];
        this.vMeth();
        int n11 = (iFld >>> 1) % 400;
        iArrFld[n11] = iArrFld[n11] - (int)this.fFld;
        instanceCount -= (long)iFld;
        int n12 = (n >>> 1) % 400;
        iArrFld[n12] = iArrFld[n12] << iFld;
        for (int n13 : iArrFld) {
            if (this.bFld) continue;
            block6: for (n2 = 3; n2 < 63; ++n2) {
                n13 &= (int)instanceCount;
                int n14 = n2 - 1;
                iArrFld[n14] = iArrFld[n14] + n;
                iFld >>= n;
                switch (n2 % 3 + 12) {
                    case 12: {
                        n3 = (int)this.fFld;
                        continue block6;
                    }
                    case 13: {
                        for (n4 = 1; n4 < 2; ++n4) {
                            instanceCount *= (long)n2;
                            n6 = (int)((float)n6 + ((float)n4 * this.fFld + (float)iFld - (float)n));
                            int n15 = n2;
                            iArrFld[n15] = iArrFld[n15] * n13;
                            sFld = (short)n6;
                            iFld += n4 * n2 + n6 - n5;
                            n *= (int)this.fFld;
                        }
                        n5 = (int)this.fFld;
                        iFld -= (int)this.fFld;
                        for (n7 = 1; n7 < 2; ++n7) {
                            n3 = (int)((float)n3 + ((float)n7 * this.fFld + (float)n7 - (float)n2));
                            n3 = 22790;
                            by = (byte)n7;
                            n3 *= sFld;
                        }
                        continue block6;
                    }
                    case 14: {
                        for (n9 = 1; n9 < 2; ++n9) {
                            n = (int)this.fFld;
                            n8 = 10;
                        }
                    }
                    default: {
                        this.bFld = this.bFld;
                    }
                }
            }
        }
        FuzzerUtils.out.println("i i14 i15 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i16 i17 i18 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i19 i20 by2 = " + n7 + "," + n8 + "," + by);
        FuzzerUtils.out.println("i21 i22 = " + n9 + "," + n10);
        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.iFld = " + instanceCount + "," + sFld + "," + iFld);
        FuzzerUtils.out.println("fFld bFld Test.fArrFld = " + Float.floatToIntBits(this.fFld) + "," + (this.bFld ? 1 : 0) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(lArrFld));
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
        FuzzerUtils.init(fArrFld, 0.89f);
        FuzzerUtils.init(iArrFld, 228);
        FuzzerUtils.init(lArrFld, -10L);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }
}
