/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 932640876L;
    public volatile double dFld = -112.100224;
    public static int iFld = -13;
    public static volatile short sFld = (short)-10508;
    public static long iMeth_check_sum = 0L;
    public static long vMeth_check_sum = 0L;
    public static long vMeth1_check_sum = 0L;

    public static void vMeth1(int n) {
        int n2 = 5;
        int n3 = 60511;
        int n4 = -78;
        int n5 = -109;
        int n6 = -23;
        int n7 = 15;
        float f = -64.241f;
        double d = -21.123365;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -249L);
        lArray[(Test.iFld >>> 1) % 400] = iFld;
        for (n2 = 7; n2 < 307; ++n2) {
            for (n4 = 6; n4 > n2; --n4) {
                switch (n4 % 2 + 126) {
                    case 126: {
                        n5 = -181;
                        f *= 14.0f;
                        break;
                    }
                    case 127: {
                        n5 = -742775475;
                        iFld += n4;
                    }
                }
                for (n6 = 1; 1 > n6; ++n6) {
                    f = n;
                    n7 += (int)instanceCount;
                    instanceCount = (long)((float)instanceCount + ((float)n6 * f + (float)n6 - (float)n7));
                    instanceCount = (long)d;
                    n7 += n6 * sFld;
                    n = (int)((long)n + ((long)(n6 * n3) + instanceCount - (long)n3));
                }
            }
        }
        vMeth1_check_sum += (long)(n + n2 + n3 + n4 + n5 + Float.floatToIntBits(f) + n6 + n7) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArray);
    }

    public static void vMeth(long l) {
        int n = 6;
        int n2 = -10;
        int n3 = -34110;
        int n4 = 56966;
        int n5 = 26583;
        int n6 = -44220;
        int[] nArray = new int[400];
        int n7 = -107;
        boolean bl = false;
        float f = 0.544f;
        double[] dArray = new double[400];
        FuzzerUtils.init(dArray, 32.62877);
        FuzzerUtils.init(nArray, 65130);
        for (n = 357; n > 15; n -= 2) {
            n3 = 1;
            do {
                ++n2;
                Test.vMeth1(n2);
            } while (++n3 < 9);
            if (bl) {
                for (n4 = 1; n4 < 9; ++n4) {
                    n5 += n4 * n + n2 - n;
                    l += instanceCount;
                    n2 += n4 * n7 + n4 - (n5 -= 9);
                    if (bl) break;
                }
                n6 = 1;
                do {
                    int n8 = n6 - 1;
                    dArray[n8] = dArray[n8] / -37786.0;
                } while (++n6 < 9);
                nArray[n] = (int)f;
                n5 >>>= iFld;
                continue;
            }
            vMeth_check_sum += l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n7 + (long)(bl ? 1 : 0) + (long)n6 + (long)Float.floatToIntBits(f -= -2.4354184E9f) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray)) + FuzzerUtils.checkSum(nArray);
            return;
        }
        vMeth_check_sum += l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n7 + (long)(bl ? 1 : 0) + (long)n6 + (long)Float.floatToIntBits(f) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray)) + FuzzerUtils.checkSum(nArray);
    }

    public static int iMeth(int n) {
        int n2 = 37;
        int n3 = -12;
        int n4 = 31399;
        int n5 = -2;
        int n6 = 169;
        int n7 = -1;
        int n8 = -11914;
        int n9 = -39991;
        int[] nArray = new int[400];
        float f = 2.685f;
        FuzzerUtils.init(nArray, -34527);
        for (n2 = 5; 395 > n2; ++n2) {
            Test.vMeth(instanceCount);
            for (n4 = 1; n4 < 4; ++n4) {
                for (n6 = 1; 2 > n6; ++n6) {
                    n5 <<= -29344;
                    instanceCount >>= (int)instanceCount;
                    n3 = 121;
                    instanceCount %= (long)(iFld | 1);
                    n3 -= n;
                }
                n3 += n4;
                for (n8 = n4; n8 < 2; ++n8) {
                    int n10 = n2;
                    nArray[n10] = nArray[n10] / (n5 | 1);
                    n5 = (int)f;
                }
            }
        }
        long l = (long)(n + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + Float.floatToIntBits(f)) + FuzzerUtils.checkSum(nArray);
        iMeth_check_sum += l;
        return (int)l;
    }

    public void mainTest(String[] stringArray) {
        int n = -9;
        int n2 = -5;
        int n3 = -59;
        int n4 = 2803;
        int n5 = 28805;
        int n6 = 4;
        int n7 = -35829;
        int n8 = -169;
        int n9 = 222;
        int n10 = -11;
        int[][][] nArray = new int[400][400][400];
        byte by = 44;
        float f = -78.169f;
        float[] fArray = new float[400];
        boolean bl = false;
        long[] lArray = new long[400];
        FuzzerUtils.init((Object[][])nArray, (Object)-27183);
        FuzzerUtils.init(fArray, 1.464f);
        FuzzerUtils.init(lArray, -8531988344785739218L);
        n = 4627;
        this.dFld = n * Test.iMeth(iFld);
        n -= iFld;
        n2 = 1;
        do {
            iFld += (int)(9100215466541868173L + (long)(n2 * n2));
            iFld = n2;
            for (n3 = 4; n3 < 305; ++n3) {
                n4 += -48586 + n3 * n3;
                this.dFld -= (double)iFld;
                by = 0;
                n4 <<= n3;
                try {
                    n4 = n / n3;
                    iFld = n4 % -67;
                    iFld = nArray[n3 + 1][n2 + 1][n3 - 1] / iFld;
                } catch (ArithmeticException arithmeticException) {
                    // empty catch block
                }
                iFld += n2;
            }
            n5 = 1;
            do {
                n += n2;
                iFld -= n4;
                n4 = n2;
                for (n6 = n5; n6 < 1; ++n6) {
                    sFld = (short)(sFld & (short)n6);
                    instanceCount = 185L;
                    iFld += n6;
                }
            } while (++n5 < 305);
        } while ((n2 += 3) < 248);
        FuzzerUtils.out.println("i i23 i24 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i25 by1 i26 = " + n4 + "," + by + "," + n5);
        FuzzerUtils.out.println("i27 i28 f3 = " + n6 + "," + n7 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i29 i30 i31 = " + n8 + "," + n9 + "," + n10);
        FuzzerUtils.out.println("b1 iArr2 fArr = " + (bl ? 1 : 0) + "," + FuzzerUtils.checkSum((Object[][])nArray) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)));
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArray));
        FuzzerUtils.out.println("Test.instanceCount dFld Test.iFld = " + instanceCount + "," + Double.doubleToLongBits(this.dFld) + "," + iFld);
        FuzzerUtils.out.println("Test.sFld = " + sFld);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
}
