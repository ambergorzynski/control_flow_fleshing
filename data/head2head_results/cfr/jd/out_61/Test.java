/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static volatile long instanceCount = -3396L;
    public float fFld = 0.89f;
    public int iFld = 33327;
    public static float[] fArrFld = new float[400];
    public static long vMeth_check_sum;
    public static long fMeth_check_sum;
    public static long iMeth_check_sum;

    public static int iMeth(int n, double d, double d2) {
        int n2 = 24617;
        float f = 1.835f;
        float f2 = 1.106f;
        int n3 = 11;
        int n4 = 8970;
        int n5 = 158;
        int n6 = 249;
        int n7 = 3;
        f += (float)(n += n2);
        block4: for (n3 = 331; n3 > 16; --n3) {
            if (n4 != 0) {
                // empty if block
            }
            f -= (float)instanceCount;
            n5 >>= n3;
            n4 = -138;
            n >>= n;
            f2 = 1.0f;
            block5: while (true) {
                float f3;
                f2 += 1.0f;
                if (!(f3 < 5.0f)) continue block4;
                n4 += (int)f2;
                n6 = (int)f2;
                while (true) {
                    if (n6 >= 1) continue block5;
                    switch ((n6 >>> 1) % 2 * 5 + 80) {
                        case 83: {
                            n5 -= n7;
                            n7 >>= n6;
                            n5 >>>= -81;
                            break;
                        }
                        case 84: {
                            f = n;
                            break;
                        }
                        default: {
                            n4 >>= (int)instanceCount;
                        }
                    }
                    ++n6;
                }
                break;
            }
        }
        long l = (long)n + Double.doubleToLongBits(d) + Double.doubleToLongBits(d2) + (long)n2 + (long)Float.floatToIntBits(f) + (long)n3 + (long)n4 + (long)n5 + (long)Float.floatToIntBits(f2) + (long)n6 + (long)n7;
        iMeth_check_sum += l;
        return (int)l;
    }

    public static float fMeth(int n) {
        int n2 = -6;
        int n3 = -11;
        int n4 = 4;
        int n5 = 5;
        int[] nArray = new int[400];
        double d = 36.75124;
        float f = 0.638f;
        float f2 = 2.28f;
        int n6 = 48;
        long[] lArray = new long[400];
        FuzzerUtils.init(nArray, 22975);
        FuzzerUtils.init(lArray, -1937015749792344166L);
        for (int n7 : nArray) {
            n2 = 1;
            do {
                int n8 = n2 + 1;
                lArray[n8] = lArray[n8] << Test.iMeth(n7, d, d);
                n = (int)((long)n + ((long)n2 | (long)f));
                int n9 = n2;
                fArrFld[n9] = fArrFld[n9] + (float)n2;
            } while (++n2 < 4);
            int n10 = (n >>> 1) % 400;
            nArray[n10] = nArray[n10] * 70;
            for (f2 = 1.0f; f2 < 4.0f; f2 += 1.0f) {
                instanceCount = n2;
                f = 5.0f;
                for (n4 = (int)f2; n4 < 2; ++n4) {
                    n6 = (byte)n7;
                    n += n;
                    n5 = (int)f;
                    nArray[n4] = n;
                }
            }
        }
        long l = (long)(n + n2) + Double.doubleToLongBits(d) + (long)Float.floatToIntBits(f) + (long)Float.floatToIntBits(f2) + (long)n3 + (long)n4 + (long)n5 + (long)n6 + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(lArray);
        fMeth_check_sum += l;
        return l;
    }

    public void vMeth() {
        double d = 2.95908;
        this.iFld = (int)instanceCount++;
        instanceCount = (long)(Test.fMeth(this.iFld) + (float)instanceCount);
        vMeth_check_sum += Double.doubleToLongBits(d -= -127.0);
    }

    public void mainTest(String[] stringArray) {
        int n = 191;
        int n2 = 35;
        int n3 = -6;
        int n4 = 38;
        int n5 = 110;
        int n6 = 13;
        int n7 = -12;
        int[] nArray = new int[400];
        boolean bl = false;
        long l = 9182703184387995653L;
        FuzzerUtils.init(nArray, -14);
        nArray[6] = nArray[6] >>> (int)(++instanceCount);
        n += (int)(this.fFld + (this.fFld += 1.0f));
        this.vMeth();
        for (l = 14L; l < 329L; ++l) {
            n3 = 80;
            while ((n3 -= 2) > 0) {
                for (n4 = 2; n4 > 1; --n4) {
                    instanceCount >>= (int)l;
                    this.fFld = 17.93257f;
                    nArray[(int)l] = n4;
                    instanceCount = (long)((float)instanceCount + ((float)(n4 * n5) + this.fFld - (float)n2));
                    n2 += 7764 + n4 * n4;
                    instanceCount <<= -4;
                    n2 = 7;
                }
                n2 += n3;
                instanceCount -= 106L;
            }
            this.iFld <<= 63;
        }
        n5 += 3;
        this.fFld *= (float)l;
        n = n5 -= 24762;
        instanceCount += (long)n;
        int n8 = (n4 >>> 1) % 400;
        nArray[n8] = nArray[n8] - n5;
        this.iFld *= n4;
        for (n6 = 2; n6 < 168; ++n6) {
            int n9 = n6;
            nArray[n9] = nArray[n9] * 38;
            this.fFld -= (float)n5;
            Test.fArrFld[n6 - 1] = n2;
            n7 += n6;
            n5 += (int)this.fFld;
        }
        FuzzerUtils.out.println("i b l = " + n + "," + (bl ? 1 : 0) + "," + l);
        FuzzerUtils.out.println("i13 i14 i15 = " + n2 + "," + n3 + "," + n4);
        FuzzerUtils.out.println("i16 i17 i18 = " + n5 + "," + n6 + "," + n7);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(nArray));
        FuzzerUtils.out.println("Test.instanceCount fFld iFld = " + instanceCount + "," + Float.floatToIntBits(this.fFld) + "," + this.iFld);
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
        FuzzerUtils.init(fArrFld, -77.8f);
        vMeth_check_sum = 0L;
        fMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }
}
