/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -7485L;
    public static float fFld = 2.885f;
    public static float fFld1 = -54.197f;
    public static short sFld = (short)-17373;
    public static int[] iArrFld = new int[400];
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long vMeth_check_sum;

    public static void vMeth(int n, int n2, long l) {
        boolean bl = false;
        boolean[] blArray = new boolean[400];
        double d = -1.16516;
        double d2 = 2.111952;
        int n3 = -33;
        int n4 = -35617;
        int n5 = -2611;
        int n6 = -21012;
        FuzzerUtils.init(blArray, false);
        blArray[((n -= (int)Test.instanceCount) >>> 1) % 400] = bl;
        fFld += fFld;
        int n7 = (n >>> 1) % 400;
        iArrFld[n7] = iArrFld[n7] - 0;
        for (d = 4.0; d < 390.0; d += 1.0) {
            Test.iArrFld[(int)(d - 1.0)] = (int)fFld1;
            for (d2 = 1.0; d2 < 4.0; d2 += 1.0) {
                l >>= n6;
                n5 = 1;
                do {
                    n3 = n;
                    if (bl) {
                        instanceCount = -7L;
                        l >>= n5;
                        continue;
                    }
                    if (!bl) continue;
                    int n8 = (int)(d + 1.0);
                    iArrFld[n8] = iArrFld[n8] + (int)instanceCount;
                    vMeth_check_sum += (long)((n += n4) + n2) + l + (long)(bl ? 1 : 0) + Double.doubleToLongBits(d) + (long)n3 + Double.doubleToLongBits(d2) + (long)n4 + (long)n6 + (long)n5 + FuzzerUtils.checkSum(blArray);
                    return;
                } while (++n5 < 2);
            }
        }
        vMeth_check_sum += (long)(n + n2) + l + (long)(bl ? 1 : 0) + Double.doubleToLongBits(d) + (long)n3 + Double.doubleToLongBits(d2) + (long)n4 + (long)n6 + (long)n5 + FuzzerUtils.checkSum(blArray);
    }

    public static int iMeth1(int n) {
        int n2 = 10;
        int n3 = -19962;
        int n4 = 3783;
        int n5 = -28;
        int n6 = -34858;
        int[][] nArray = new int[400][400];
        double d = -51.5599;
        int n7 = -16862;
        int n8 = 118;
        FuzzerUtils.init(nArray, -49469);
        n = n - (int)Math.abs((long)n-- + instanceCount++);
        int[] nArray2 = iArrFld;
        iArrFld = nArray2;
        iArrFld = nArray2;
        iArrFld = nArray2;
        n2 = 1;
        do {
            for (n3 = n2; n3 < 9; ++n3) {
                block11: for (n5 = 1; n5 < 1; ++n5) {
                    if (n2 != 0) {
                        // empty if block
                    }
                    Test.vMeth(n5, n3, instanceCount);
                    Test.iArrFld[n5] = (int)instanceCount;
                    d -= (double)n7;
                    switch ((n3 >>> 1) % 7 + 32) {
                        case 32: {
                            n8 = (byte)n5;
                            n = -34783;
                            n4 *= 90;
                            continue block11;
                        }
                        case 33: {
                            n4 *= 61;
                            try {
                                Test.iArrFld[n5] = iArrFld[n3 + 1] % -8749;
                                Test.iArrFld[n3] = n2 % -63168;
                                n6 %= 31439;
                            } catch (ArithmeticException arithmeticException) {}
                            continue block11;
                        }
                        case 34: 
                        case 35: 
                        case 36: {
                            nArray = FuzzerUtils.int2array(400, 49672);
                            continue block11;
                        }
                        case 37: {
                            n += n5 * n5;
                            continue block11;
                        }
                        case 38: {
                            n <<= 29566;
                        }
                        default: {
                            n |= n3;
                        }
                    }
                }
            }
        } while (++n2 < 185);
        long l = (long)(n + n2 + n3 + n4 + n5 + n6) + Double.doubleToLongBits(d) + (long)n7 + (long)n8 + FuzzerUtils.checkSum(nArray);
        iMeth1_check_sum += l;
        return (int)l;
    }

    public int iMeth(double d, int n, int n2) {
        float f = 111.498f;
        float f2 = 24.62f;
        int n3 = -164;
        int n4 = -19;
        f = 1.0f;
        do {
            instanceCount = Test.iMeth1(n2);
            n2 += (int)((long)f ^ (long)n2);
            int n5 = (int)(f - 1.0f);
            iArrFld[n5] = iArrFld[n5] * (int)fFld;
            for (f2 = 1.0f; f2 < 13.0f; f2 += 1.0f) {
                instanceCount = n4;
                n += n3;
                n2 += (n += (int)d);
                n4 = (byte)(n4 + (byte)(f2 * (float)(n -= n2) + (float)n3 - (float)instanceCount));
            }
            n = n2;
            fFld = n3;
        } while ((f += 1.0f) < 121.0f);
        long l = Double.doubleToLongBits(d) + (long)n + (long)n2 + (long)Float.floatToIntBits(f) + (long)Float.floatToIntBits(f2) + (long)n3 + (long)n4;
        iMeth_check_sum += l;
        return (int)l;
    }

    public void mainTest(String[] stringArray) {
        int n = 140;
        int n2 = -5;
        int n3 = -21792;
        int n4 = -141;
        int n5 = 25223;
        int n6 = 18885;
        int n7 = -237;
        int n8 = -249;
        int n9 = -14;
        int n10 = 214;
        int n11 = 190;
        double d = -59.62433;
        float[] fArray = new float[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(fArray, 99.603f);
        FuzzerUtils.init(lArray, 3478L);
        instanceCount -= (long)n;
        float[] fArray2 = fArray;
        int n12 = fArray2.length;
        for (int i = 0; i < n12; ++i) {
            float f;
            float f2 = f = fArray2[i];
            f = f2 + 1.0f;
            instanceCount = (long)(f2 * (float)(n - n));
            n = this.iMeth(-31.92253, n, n);
            for (n2 = 63; n2 > 3; --n2) {
                for (n4 = 1; n4 < 2; ++n4) {
                    int n13 = 716;
                    n = n13 = (int)((short)(n13 + (short)n5));
                    n3 += n4;
                }
                n3 += n2 - n;
                n3 >>= n5;
                for (n6 = 1; n6 < 2; ++n6) {
                    f += (float)((long)n6 * instanceCount + (long)n - (long)n8);
                }
                for (n9 = 1; n9 < 2; ++n9) {
                    fFld = -4.0f;
                    n3 += 56;
                    int n14 = n9 + 1;
                    iArrFld[n14] = iArrFld[n14] << -14;
                    n7 = 193;
                    int n15 = n2 + 1;
                    iArrFld[n15] = iArrFld[n15] * (int)f;
                    n -= sFld;
                    sFld = (short)fFld1;
                    Test.iArrFld[n2 + 1] = 186;
                    n3 = (int)instanceCount;
                    d *= (double)n10;
                }
                int n16 = n2 - 1;
                lArray[n16] = lArray[n16] << -12;
                f += (float)d;
            }
            n11 = 1;
            do {
                n5 &= sFld;
                fFld -= (float)n10;
            } while (++n11 < 63);
        }
        FuzzerUtils.out.println("i i15 i16 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i17 i18 i19 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i20 i21 i22 = " + n7 + "," + n8 + "," + n9);
        FuzzerUtils.out.println("i23 d4 i24 = " + n10 + "," + Double.doubleToLongBits(d) + "," + n11);
        FuzzerUtils.out.println("fArr lArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + "," + FuzzerUtils.checkSum(lArray));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.fFld1 = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + Float.floatToIntBits(fFld1));
        FuzzerUtils.out.println("Test.sFld Test.iArrFld = " + sFld + "," + FuzzerUtils.checkSum(iArrFld));
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

    static {
        FuzzerUtils.init(iArrFld, 12);
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}
