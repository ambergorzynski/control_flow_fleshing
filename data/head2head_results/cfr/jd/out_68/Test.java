/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 10L;
    public static volatile boolean bFld = true;
    public static int iFld = -96;
    public long[] lArrFld = new long[400];
    public static double[] dArrFld = new double[400];
    public static long iMeth_check_sum;
    public static long bMeth_check_sum;
    public static long vMeth_check_sum;

    public static void vMeth(int n, long l) {
        int n2 = -57;
        int n3 = 55993;
        int n4 = 14;
        int n5 = 104;
        int n6 = -242;
        int[] nArray = new int[400];
        double d = -26.49648;
        float f = 0.889f;
        FuzzerUtils.init(nArray, 3);
        n >>= 51;
        try {
            n2 = 1;
            do {
                d += -58.0;
                n = n2;
                n += n2 * n2;
                n = (int)((float)n + ((float)(n2 * n) + f - (float)n));
                n <<= n;
                n = n2;
                for (n3 = 1; 408 > n3; ++n3) {
                    int n7 = n2 - 1;
                    nArray[n7] = nArray[n7] - (int)f;
                    for (n5 = 1; 401 > n5; ++n5) {
                        f = n2;
                        n6 += 42897 + n5 * n5;
                    }
                    n4 = n6;
                }
            } while (++n2 < 190);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            int n8 = (n2 >>> 1) % 400;
            nArray[n8] = nArray[n8] * n;
        }
        vMeth_check_sum += (long)n + l + (long)n2 + Double.doubleToLongBits(d) + (long)Float.floatToIntBits(f) + (long)n3 + (long)n4 + (long)n5 + (long)n6 + FuzzerUtils.checkSum(nArray);
    }

    public static boolean bMeth(boolean bl, float f, int n) {
        Test.vMeth(n, instanceCount);
        long l = (bl ? 1 : 0) + Float.floatToIntBits(f) + n;
        bMeth_check_sum += l;
        return l % 2L > 0L;
    }

    public int iMeth(int n, long l, int n2) {
        int n3 = -39692;
        int n4 = 17183;
        n3 = 1;
        do {
            float f;
            bFld = Test.bMeth(false, f = 2.165f, n2) && bFld;
            int n5 = n3 - 1;
            dArrFld[n5] = dArrFld[n5] + -18584.0;
            n *= n4;
            n4 >>= (int)instanceCount;
            n = 13;
        } while (++n3 < 352);
        long l2 = (long)n + l + (long)n2 + (long)n3 + (long)n4;
        iMeth_check_sum += l2;
        return (int)l2;
    }

    public void mainTest(String[] stringArray) {
        byte by = -81;
        byte[][][] byArray = new byte[400][400][400];
        long l = -1917885993L;
        int n = 41;
        int n2 = -6020;
        int n3 = 54278;
        int n4 = 6;
        int n5 = 240;
        int[] nArray = new int[400];
        float f = -90.53f;
        short s = -32408;
        FuzzerUtils.init(nArray, 28025);
        FuzzerUtils.init((Object[][])byArray, (Object)-93);
        for (int n6 : nArray) {
            float f2 = 2.529f;
            if (((long)((float)n6 - f2) >> (int)this.lArrFld[(n6 >>> 1) % 400]) * (long)(n6 * n6 << n6) >= (long)this.iMeth(n6, instanceCount, n6)) {
                bFld = (double)nArray[(n6 >>> 1) % 400] >= -35.2608 + (double)byArray[(n6 >>> 1) % 400][(n6 >>> 1) % 400][(n6 >>> 1) % 400];
                bFld = bFld;
            } else {
                n6 -= (int)f2;
            }
            int n7 = (n6 >>> 1) % 400;
            this.lArrFld[n7] = this.lArrFld[n7] << n6;
            n6 /= by | 1;
        }
        iFld += iFld;
        l = 1L;
        do {
            n = 1;
            while (++n < 86) {
                iFld >>>= iFld;
                for (n2 = 1; 1 > n2; ++n2) {
                    instanceCount = (long)((float)instanceCount + ((float)(n2 * n2 + n) - f));
                    s = (short)(s + (short)(n2 + n3));
                }
                for (n4 = 1; n4 < 1; n4 += 3) {
                    double d = 118.73775;
                    iFld -= n5;
                    by = (byte)(by + (byte)((float)(n4 * n) + f - (float)n));
                    n5 += (int)d;
                    instanceCount = -35982L;
                    d += (double)n3;
                    int n8 = n + 1;
                    this.lArrFld[n8] = this.lArrFld[n8] ^ (long)n5;
                    if (bFld) {
                        int n9 = (int)l;
                        nArray[n9] = nArray[n9] * (int)l;
                        instanceCount = l;
                    }
                    instanceCount |= 0xAEL;
                    instanceCount -= (long)f;
                    nArray = FuzzerUtils.int1array(400, 14);
                }
                iFld *= (int)instanceCount;
            }
            f = l;
        } while (++l < 294L);
        this.lArrFld = FuzzerUtils.long1array(400, 8169646952887047170L);
        FuzzerUtils.out.println("by l2 i12 = " + by + "," + l + "," + n);
        FuzzerUtils.out.println("i13 i14 f4 = " + n2 + "," + n3 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("s i15 i16 = " + s + "," + n4 + "," + n5);
        FuzzerUtils.out.println("iArr byArr = " + FuzzerUtils.checkSum(nArray) + "," + FuzzerUtils.checkSum((Object[][])byArray));
        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.iFld = " + instanceCount + "," + (bFld ? 1 : 0) + "," + iFld);
        FuzzerUtils.out.println("lArrFld Test.dArrFld = " + FuzzerUtils.checkSum(this.lArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
        FuzzerUtils.init(dArrFld, 116.59864);
        iMeth_check_sum = 0L;
        bMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}
