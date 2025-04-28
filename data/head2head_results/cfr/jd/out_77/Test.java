/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -2830229289L;
    public static volatile short sFld = (short)21759;
    public static int iFld = -11;
    public volatile float fFld = 109.764f;
    public static double dFld = -1.4369;
    public long[] lArrFld = new long[400];
    public static long vSmallMeth_check_sum = 0L;
    public static long vMeth_check_sum = 0L;
    public static long sMeth_check_sum = 0L;

    public static short sMeth(long l) {
        int n = -25826;
        int n2 = 51;
        int n3 = -210;
        int n4 = -245;
        int[] nArray = new int[400];
        float f = 1.457f;
        boolean bl = false;
        double d = 0.4015;
        int n5 = 27584;
        long[] lArray = new long[400];
        FuzzerUtils.init(nArray, 11194);
        FuzzerUtils.init(lArray, -3237353332532347678L);
        n = 1;
        while (++n < 133) {
            n2 = 1;
            while (++n2 < 12) {
                l = (long)((float)l + ((float)n2 * f + (float)n2 - (float)n2));
                n3 += n3;
                if (n4 != 0) {
                    // empty if block
                }
                int n6 = n;
                nArray[n6] = nArray[n6] + -27228;
                n3 <<= n;
                n4 = n2;
                d *= (double)l;
            }
        }
        n5 = (short)(n5 + 201);
        int n7 = (n >>> 1) % 400;
        nArray[n7] = nArray[n7] + n3;
        long l2 = l + (long)n + (long)n2 + (long)Float.floatToIntBits(f) + (long)n3 + (long)n4 + (long)(bl ? 1 : 0) + Double.doubleToLongBits(d) + (long)n5 + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(lArray);
        sMeth_check_sum += l2;
        return (short)l2;
    }

    public static void vMeth(float f, int n, int n2) {
        int n3 = 3;
        int n4 = -3;
        int n5 = -63981;
        int n6 = 6;
        int n7 = -13565;
        boolean bl = true;
        int n8 = -126;
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, -126.588f);
        for (n3 = 2; n3 < 126; ++n3) {
            n += n3 * n3 + n4 - n3;
            n &= Test.sMeth(instanceCount);
            instanceCount += (long)(n3 * n2 + n3) - instanceCount;
            block1: for (n5 = 1; n5 < 13; ++n5) {
                sFld = (short)(sFld * (short)n4);
                n7 = 1;
                do {
                    n6 = n2;
                    f += (float)n2;
                    if (bl) continue;
                    f -= (float)instanceCount;
                    if (bl) continue block1;
                    instanceCount += (long)n8;
                    n = -21;
                    int n9 = n3;
                    fArray[n9] = fArray[n9] / (float)(n7 | 1);
                } while (++n7 < 2);
            }
        }
        vMeth_check_sum += (long)(Float.floatToIntBits(f) + n + n2 + n3 + n4 + n5 + n6 + n7 + (bl ? 1 : 0) + n8) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
    }

    public static void vSmallMeth(int n, int n2, int n3) {
        float f = 0.136f;
        Test.vMeth(f, n2, n3);
        vSmallMeth_check_sum += (long)(n + n2 + (n3 *= iFld) + Float.floatToIntBits(f));
    }

    public void mainTest(String[] stringArray) {
        int n = -60778;
        int n2 = -4;
        int n3 = -4;
        int n4 = 3;
        int n5 = -13729;
        int n6 = -120;
        int n7 = -13;
        int n8 = -10;
        int[] nArray = new int[400];
        boolean bl = false;
        byte by = -28;
        FuzzerUtils.init(nArray, 41980);
        for (n = 4; n < 291; ++n) {
            for (int i = 0; i < 62; ++i) {
                Test.vSmallMeth(iFld, n, n);
            }
            if (bl) {
                iFld += n * n;
            } else {
                iFld %= 194;
                n2 -= (int)instanceCount;
                n2 = (int)this.fFld;
            }
            this.fFld = n2;
            n2 ^= n;
            for (n3 = 1; n3 < 88; ++n3) {
                instanceCount -= (long)dFld;
                nArray[n3] = n4 += (int)(-115L + (long)(n3 * n3));
                n4 >>>= n3;
                n2 -= n;
                n4 += n3 * n3 + by - n4;
                iFld >>= n4;
            }
            dFld = n;
            instanceCount += (long)(n * n);
        }
        this.fFld = -154.0f;
        for (n5 = 197; n5 > 4; --n5) {
            this.fFld = 31.0f;
            instanceCount += (long)n2;
            for (n7 = n5; n7 < 130; n7 += 3) {
                int n9 = n5 - 1;
                this.lArrFld[n9] = this.lArrFld[n9] + -3767158793L;
                n6 = sFld;
            }
        }
        instanceCount = n7;
        by = (byte)n7;
        FuzzerUtils.out.println("i i1 b2 = " + n + "," + n2 + "," + (bl ? 1 : 0));
        FuzzerUtils.out.println("i16 i17 by1 = " + n3 + "," + n4 + "," + by);
        FuzzerUtils.out.println("i18 i19 i20 = " + n5 + "," + n6 + "," + n7);
        FuzzerUtils.out.println("i21 iArr1 = " + n8 + "," + FuzzerUtils.checkSum(nArray));
        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.iFld = " + instanceCount + "," + sFld + "," + iFld);
        FuzzerUtils.out.println("fFld Test.dFld lArrFld = " + Float.floatToIntBits(this.fFld) + "," + Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(this.lArrFld));
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
}
