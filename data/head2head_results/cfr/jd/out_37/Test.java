/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -8550543026173098039L;
    public boolean bFld = true;
    public static double dFld = -1.100735;
    public static float fFld = 2.413f;
    public static volatile int iFld = 0;
    public static float fFld1 = 0.707f;
    public int iFld1 = 19513;
    public static long vMeth_check_sum = 0L;
    public static long lMeth_check_sum = 0L;
    public static long vMeth1_check_sum = 0L;
    public static long vMeth2_check_sum = 0L;

    public void vMeth(boolean bl, int n) {
        int n2 = 128;
        n = n++ >>> Math.max(n2, n);
        vMeth_check_sum += (long)((bl ? 1 : 0) + n + n2);
    }

    public static void vMeth2(int n, int n2, int n3) {
        int n4 = 48164;
        int n5 = 31453;
        int n6 = -34559;
        int n7 = 11;
        int n8 = -3;
        int n9 = -62346;
        int[] nArray = new int[400];
        int n10 = 3455;
        long l = 1860364795L;
        long[] lArray = new long[400];
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, 6.789f);
        FuzzerUtils.init(lArray, 1L);
        FuzzerUtils.init(nArray, -20171);
        for (n4 = 214; n4 > 12; n4 -= 2) {
            n += n4 * n4;
            n10 = (short)(n10 * (short)n5);
        }
        n6 = 1;
        do {
            for (n7 = n6; n7 < 5; n7 += 3) {
                n8 -= n3;
                for (l = 1L; l < 1L; ++l) {
                    dFld = n9;
                    int n11 = n7;
                    fArray[n11] = fArray[n11] * (float)n8;
                    fFld += (float)(l * l);
                    switch ((int)(l % 1L * 5L + 13L)) {
                        case 18: {
                            int n12 = n6 + 1;
                            lArray[n12] = lArray[n12] + (long)n3;
                            instanceCount = n5;
                            nArray[n6] = n8;
                        }
                    }
                }
            }
        } while (++n6 < 314);
        vMeth2_check_sum += (long)(n + n2 + n3 + n4 + n5 + n10 + n6 + n7 + n8) + l + (long)n9 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(nArray);
    }

    public static void vMeth1() {
        int n = 219;
        int n2 = -12;
        int n3 = 14;
        int n4 = -226;
        int n5 = 22215;
        int[] nArray = new int[400];
        int n6 = -19496;
        boolean bl = true;
        boolean[] blArray = new boolean[400];
        byte[] byArray = new byte[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(nArray, 46020);
        FuzzerUtils.init(byArray, (byte)-81);
        FuzzerUtils.init(lArray, 1082473437693247773L);
        FuzzerUtils.init(blArray, false);
        Test.vMeth2(iFld, iFld, iFld);
        for (n = 15; n < 384; ++n) {
            fFld1 = n6;
            int n7 = n + 1;
            nArray[n7] = nArray[n7] * iFld;
            dFld = instanceCount;
        }
        vMeth1_check_sum += (long)(n + n2 + n6 + n3 + n4 + n5 + (bl ? 1 : 0)) + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(byArray) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(blArray);
    }

    public long lMeth() {
        int n = 17654;
        int n2 = -3;
        int n3 = 38803;
        int n4 = -14;
        int n5 = 13;
        int n6 = -7;
        int n7 = -13;
        int n8 = 87;
        float[] fArray = new float[400];
        long[] lArray = new long[400];
        boolean[] blArray = new boolean[400];
        double[][][] dArray = new double[400][400][400];
        FuzzerUtils.init(fArray, -1.11f);
        FuzzerUtils.init(lArray, -9L);
        FuzzerUtils.init(blArray, false);
        FuzzerUtils.init((Object[][])dArray, (Object)2.29133);
        n = 1;
        while ((n += 3) < 199) {
            fArray[n - 1] = lArray[n - 1];
        }
        this.vMeth(false == (blArray[(n >>> 1) % 400] || this.bFld), 12842);
        instanceCount = n;
        n2 = 1;
        do {
            int n9 = n3--;
            double[] dArray2 = dArray[n2][n2 + 1];
            int n10 = n2 - 1;
            double d = dArray2[n10];
            dArray2[n10] = d + 1.0;
            lArray[n2 - 1] = (long)((double)(n2 - n2 - n9) * ((double)Float.intBitsToFloat(-12) - d));
        } while (++n2 < 319);
        Test.vMeth1();
        iFld -= n2;
        for (n4 = 232; 10 < n4; n4 -= 3) {
            int n11 = n4 + 1;
            lArray[n11] = lArray[n11] * (long)dFld;
            for (n6 = 1; n6 < 21; ++n6) {
                n3 = n7;
                n8 = (byte)n5;
                fFld1 -= (float)instanceCount;
                dFld += 12.0;
            }
        }
        long l = (long)(n + n2 + n3 + n4 + n5 + n6 + n7 + n8) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(blArray) + Double.doubleToLongBits(FuzzerUtils.checkSum((Object[][])dArray));
        lMeth_check_sum += l;
        return l;
    }

    public void mainTest(String[] stringArray) {
        boolean bl = true;
        long l = -4360805900809191341L;
        int n = -26256;
        int n2 = 0;
        int n3 = 0;
        int n4 = 7;
        int n5 = 47;
        int n6 = -103;
        int n7 = -238;
        int[][][] nArray = new int[400][400][400];
        int n8 = 9105;
        FuzzerUtils.init((Object[][])nArray, (Object)-13);
        this.vMeth(bl, (int)(instanceCount + (124L - this.lMeth() + (long)iFld)));
        switch ((iFld >>> 1) % 4 + 76) {
            case 76: {
                instanceCount += (long)fFld;
                for (l = 166L; l > 4L; --l) {
                    instanceCount += l;
                    iFld = n8;
                    n &= (int)l;
                    iFld -= 7;
                    for (n2 = 4; 155 > n2; ++n2) {
                        n3 += n2 - iFld;
                        nArray[n2][(int)l][n2 + 1] = iFld;
                        iFld *= (int)instanceCount;
                        iFld += (int)fFld1;
                        int[] nArray2 = nArray[(int)(l + 1L)][(int)l];
                        int n9 = (int)(l + 1L);
                        nArray2[n9] = nArray2[n9] << (int)instanceCount;
                        int[] nArray3 = nArray[(int)(l - 1L)][(int)l];
                        int n10 = n2 - 1;
                        nArray3[n10] = nArray3[n10] * 1564968384;
                        n3 = iFld;
                    }
                    iFld += (int)(l * (long)this.iFld1 + (long)iFld - (long)iFld);
                    n3 -= iFld;
                    n4 = 155;
                    while ((n4 -= 2) > 0) {
                        n3 = 63573;
                        for (n5 = 1; n5 < 2; ++n5) {
                            n3 = (int)instanceCount;
                        }
                        n6 = (int)l;
                        iFld = n;
                        iFld += n4;
                    }
                    instanceCount ^= (long)this.iFld1;
                    n7 = 1;
                    while (++n7 < 155) {
                        nArray[n7 - 1][n7] = nArray[(int)l][(int)(l + 1L)];
                        dFld = n;
                        instanceCount = iFld;
                    }
                }
                break;
            }
            case 77: {
                n3 >>= (int)l;
                break;
            }
            case 78: {
                int[] nArray4 = nArray[(n4 >>> 1) % 400][(n5 >>> 1) % 400];
                int n11 = (n5 >>> 1) % 400;
                nArray4[n11] = nArray4[n11] - iFld;
                break;
            }
            case 79: {
                n6 = n4;
                break;
            }
            default: {
                fFld1 -= (float)dFld;
            }
        }
        FuzzerUtils.out.println("b1 l1 i23 = " + (bl ? 1 : 0) + "," + l + "," + n);
        FuzzerUtils.out.println("s2 i24 i25 = " + (short)n8 + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i26 i27 i28 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i29 iArr2 = " + n7 + "," + FuzzerUtils.checkSum((Object[][])nArray));
        FuzzerUtils.out.println("Test.instanceCount bFld Test.dFld = " + instanceCount + "," + (this.bFld ? 1 : 0) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.fFld Test.iFld Test.fFld1 = " + Float.floatToIntBits(fFld) + "," + iFld + "," + Float.floatToIntBits(fFld1));
        FuzzerUtils.out.println("iFld1 = " + this.iFld1);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
