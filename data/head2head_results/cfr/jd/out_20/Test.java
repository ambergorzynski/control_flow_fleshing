/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -246L;
    public static int iFld = -109;
    public byte byFld = (byte)-125;
    public float fFld = -1.899f;
    public static long iMeth_check_sum = 0L;
    public static long iMeth1_check_sum = 0L;
    public static long vMeth_check_sum = 0L;

    public static void vMeth() {
        iFld <<= -195615086;
        vMeth_check_sum += 0L;
    }

    public static int iMeth1(long l, byte by, int n) {
        float f = -20.263f;
        float f2 = 0.238f;
        float[][][] fArray = new float[400][400][400];
        int n2 = 4;
        int n3 = 0;
        int n4 = 7871;
        int[] nArray = new int[400];
        int n5 = 10662;
        FuzzerUtils.init(nArray, -6);
        FuzzerUtils.init((Object[][])fArray, (Object)Float.valueOf(1.182f));
        for (f = 8.0f; 215.0f > f; f += 1.0f) {
            block0 : switch (65) {
                case 65: {
                    int n6 = (int)f;
                    n5 = (short)(n5 + 1);
                    nArray[n6] = nArray[n6] << n5;
                    n2 = (int)(-84.844f - f - (float)(n & 0xFFFFA70E) + (float)n);
                    break;
                }
                case 66: {
                    Test.vMeth();
                    f2 = 1.0f;
                    while (true) {
                        float f3;
                        f2 += 1.0f;
                        if (!(f3 < 8.0f)) break block0;
                        for (n3 = (int)f2; n3 < 1; ++n3) {
                            iFld = (int)instanceCount;
                            iFld %= by | 1;
                        }
                        fArray[(int)(f2 + 1.0f)][(int)(f2 - 1.0f)][(int)(f - 1.0f)] = n4;
                        n2 >>= (n4 += (int)((long)f2 | l));
                    }
                }
            }
            instanceCount = -4L;
        }
        n = (int)f2;
        long l2 = l + (long)by + (long)n + (long)Float.floatToIntBits(f) + (long)(n2 -= iFld) + (long)n5 + (long)Float.floatToIntBits(f2) + (long)n3 + (long)n4 + FuzzerUtils.checkSum(nArray) + Double.doubleToLongBits(FuzzerUtils.checkSum((Object[][])fArray));
        iMeth1_check_sum += l2;
        return (int)l2;
    }

    public static int iMeth(long l, int n, int n2) {
        int n3 = 560;
        int n4 = 85;
        int n5 = -54;
        int n6 = 58017;
        int n7 = -242;
        int n8 = -121;
        int n9 = -144;
        int[] nArray = new int[400];
        double d = 1.77025;
        double d2 = 32.52959;
        byte by = -95;
        long l2 = 908118352L;
        long[] lArray = new long[400];
        FuzzerUtils.init(nArray, 7);
        FuzzerUtils.init(lArray, -16L);
        nArray[(n >>> 1) % 400] = ++n3;
        for (n4 = 232; n4 > 10; n4 -= 3) {
            for (d = (double)n4; d < 21.0; d += 1.0) {
                for (n7 = (int)d; n7 < 1; ++n7) {
                    n6 = --n3 * (n4 + n4) - n;
                    int n10 = n4;
                    long l3 = lArray[n10];
                    lArray[n10] = l3 - 1L;
                    nArray[n4 - 1] = (int)l3;
                    int n11 = n4 + 1;
                    int n12 = n4;
                    int n13 = nArray[n12];
                    nArray[n12] = n13 - 1;
                    nArray[n11] = nArray[n11] - n13;
                    l = -Math.min(n7, n5);
                }
                nArray[n4] = Math.max(Test.iMeth1(59069L, by, n2), n2);
                int n14 = n4 + 1;
                nArray[n14] = nArray[n14] + n8;
            }
            nArray[n4 - 1] = iFld;
            n8 = (int)d;
            n9 = 1;
            do {
                d2 += (double)n8;
                n6 = (int)l2;
            } while (++n9 < 21);
        }
        long l4 = l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + Double.doubleToLongBits(d) + (long)n6 + (long)n7 + (long)n8 + (long)by + (long)n9 + Double.doubleToLongBits(d2) + l2 + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(lArray);
        iMeth_check_sum += l4;
        return (int)l4;
    }

    public void mainTest(String[] stringArray) {
        short s = 658;
        int n = 13;
        int n2 = 10;
        int n3 = 138;
        int n4 = 13;
        int n5 = 248;
        int n6 = 105;
        int n7 = 12;
        int n8 = 242;
        int n9 = -5;
        int n10 = -36794;
        int n11 = -86;
        int n12 = 0;
        int[] nArray = new int[400];
        boolean bl = true;
        double d = 105.34045;
        float f = 22.168f;
        FuzzerUtils.init(nArray, -38617);
        s = (short)(s * (short)Test.iMeth(instanceCount, iFld, iFld));
        iFld += -227;
        for (n = 157; n > 2; --n) {
            this.byFld = (byte)(this.byFld - (byte)n2);
            iFld *= n;
            if (!bl) continue;
        }
        for (n3 = 5; n3 < 277; ++n3) {
            this.fFld -= (float)instanceCount;
            try {
                nArray[n3 - 1] = n3 / nArray[n3 - 1];
                n2 = nArray[(n4 >>> 1) % 400] % n;
                nArray[n3 + 1] = n % -46856;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            iFld *= (int)instanceCount;
            for (n5 = 2; n5 < 92; ++n5) {
                instanceCount += (long)(n5 - n3);
                n2 = (int)d;
                for (n7 = n3; n7 < 2; ++n7) {
                    instanceCount -= (long)n9;
                    nArray[n7 + 1] = n;
                    instanceCount += (long)n7;
                    instanceCount = n4;
                    instanceCount = n9;
                    if (bl) break;
                    iFld *= n9;
                }
                for (f = 1.0f; f < 2.0f; f += 2.0f) {
                    iFld &= (int)instanceCount;
                }
                n6 += n5;
                for (n11 = 1; n11 < 2; ++n11) {
                    nArray[n5 + 1] = iFld;
                    this.byFld = (byte)(this.byFld + (byte)n11);
                }
                d -= (double)instanceCount;
                this.fFld *= (float)n2;
                n6 = n11;
            }
        }
        FuzzerUtils.out.println("s i13 i14 = " + s + "," + n + "," + n2);
        FuzzerUtils.out.println("b i15 i16 = " + (bl ? 1 : 0) + "," + n3 + "," + n4);
        FuzzerUtils.out.println("i17 i18 d2 = " + n5 + "," + n6 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i19 i20 i21 = " + n7 + "," + n8 + "," + n9);
        FuzzerUtils.out.println("f2 i22 i23 = " + Float.floatToIntBits(f) + "," + n10 + "," + n11);
        FuzzerUtils.out.println("i24 iArr2 = " + n12 + "," + FuzzerUtils.checkSum(nArray));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld byFld = " + instanceCount + "," + iFld + "," + this.byFld);
        FuzzerUtils.out.println("fFld = " + Float.floatToIntBits(this.fFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
}
