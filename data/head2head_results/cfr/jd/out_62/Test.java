/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -4959357261705364514L;
    public static byte byFld = (byte)45;
    public static int iFld = -110;
    public static double dFld = 2.121308;
    public float fFld = 0.14f;
    public static boolean bFld = true;
    public short sFld = (short)-4509;
    public long[] lArrFld = new long[400];
    public static long vMeth_check_sum = 0L;
    public static long vMeth1_check_sum = 0L;
    public static long lMeth_check_sum = 0L;

    public static long lMeth(long l, long l2) {
        int n = 194;
        int n2 = 6;
        int n3 = -112;
        int n4 = -14004;
        int[] nArray = new int[400];
        float f = 0.531f;
        boolean bl = true;
        FuzzerUtils.init(nArray, -237);
        iFld = n;
        try {
            n *= (int)f;
            dFld = 0.936f;
            for (int n5 : nArray) {
                iFld += n;
                int n6 = (n5 >>> 1) % 400;
                nArray[n6] = nArray[n6] - 2;
                n2 = 1;
                while (++n2 < 4) {
                    int n7 = 0;
                    bl = true;
                    for (n3 = 1; n3 < 1; ++n3) {
                        n5 = (int)((float)n5 + ((float)n3 + f));
                        if (iFld == 0) continue;
                    }
                    n7 += iFld;
                    n5 += (int)l2;
                    n4 *= iFld;
                }
            }
        } catch (ArithmeticException arithmeticException) {
            f = iFld;
        }
        long l3 = l + l2 + (long)n + (long)Float.floatToIntBits(f) + (long)n2 + (long)(bl ? 1 : 0) + (long)n3 + (long)n4 + FuzzerUtils.checkSum(nArray);
        lMeth_check_sum += l3;
        return l3;
    }

    public static void vMeth1(int n, long l) {
        float f = 88.709f;
        float[] fArray = new float[400];
        double d = -85.53449;
        int n2 = -2;
        int n3 = 106;
        int n4 = -172;
        int n5 = 132;
        int[] nArray = new int[400];
        int n6 = -7884;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -8235033672043856478L);
        FuzzerUtils.init(nArray, 2928);
        FuzzerUtils.init(fArray, -31.908f);
        f = (float)((double)byFld + (d -= 1.0));
        lArray[91] = lArray[91] * lArray[(n >>> 1) % 400];
        n = (int)f;
        for (n2 = 17; 376 > n2; ++n2) {
            l >>>= (int)((float)n2 * f + (float)(l + instanceCount) + (float)(126L * ((long)n + l) * Test.lMeth(151L, l)));
            iFld -= n;
            try {
                n = -83 / n;
                n = iFld % nArray[n2];
                iFld = n / -1130574552;
                continue;
            } catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
        }
        block1 : switch ((n >>> 1) % 9 * 5 + 57) {
            case 65: {
                switch ((n3 >>> 1) % 3 + 35) {
                    case 35: {
                        n3 >>= -40922;
                        for (n4 = 1; n4 < 376; ++n4) {
                            nArray[n4 + 1] = n2;
                            n <<= 10580;
                            iFld -= n2;
                            n6 = byFld;
                        }
                        break block1;
                    }
                    case 36: {
                        l = n5;
                    }
                    case 37: {
                        n6 = (short)(n6 - (short)iFld);
                    }
                }
                f = l;
                break;
            }
            case 77: {
                n |= n4;
                break;
            }
            case 60: {
                n5 = n4;
            }
            case 83: {
                n3 >>= n5;
            }
            case 96: {
                n5 |= n4;
            }
            case 86: {
                f = -53.0f;
            }
            case 99: {
                n5 >>>= iFld;
                break;
            }
            case 95: {
                byFld = (byte)(byFld + (byte)n2);
                break;
            }
            case 81: {
                n5 ^= n3;
            }
        }
        vMeth1_check_sum += (long)n + l + (long)Float.floatToIntBits(f) + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(nArray) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
    }

    public static void vMeth(long l) {
        long l2 = -5L;
        int n = 10863;
        int[] nArray = new int[400];
        boolean bl = true;
        float f = 51.447f;
        short[] sArray = new short[400];
        FuzzerUtils.init(sArray, (short)-24816);
        FuzzerUtils.init(nArray, -37680);
        Test.vMeth1(iFld, l);
        for (short s : sArray) {
            for (l2 = 1L; l2 < 4L; ++l2) {
                nArray[(int)l2] = 93;
                bl = false;
                dFld = instanceCount;
                instanceCount += l2;
                int n2 = (int)(l2 - 1L);
                nArray[n2] = nArray[n2] - (int)l;
                instanceCount *= (long)f;
                n *= n;
                iFld *= n;
            }
            nArray[7] = n;
            l += (long)n;
        }
        vMeth_check_sum += l + l2 + (long)n + (long)(bl ? 1 : 0) + (long)Float.floatToIntBits(f) + FuzzerUtils.checkSum(sArray) + FuzzerUtils.checkSum(nArray);
    }

    public void mainTest(String[] stringArray) {
        int n = 29851;
        int n2 = -244;
        int n3 = -10;
        int n4 = -32123;
        int n5 = 141;
        int n6 = 6;
        Test.vMeth(instanceCount);
        for (n = 23; n < 391; ++n) {
            for (n3 = n; n3 < 68; ++n3) {
                dFld = -9.0;
                block11: for (n5 = 1; n5 < 1; ++n5) {
                    this.fFld -= (float)(n2 += n5);
                    n2 += -16006 + n5 * n5;
                    this.fFld += (float)(n5 + n5);
                    int n7 = n5;
                    this.lArrFld[n7] = this.lArrFld[n7] + instanceCount;
                    n6 += n5 * n5;
                    switch (n5 % 7 + 59) {
                        case 59: {
                            this.fFld = n4;
                            instanceCount += (long)n5;
                        }
                        case 60: {
                            int n8 = n5 - 1;
                            this.lArrFld[n8] = this.lArrFld[n8] - (long)n2;
                            if (bFld || bFld) continue block11;
                            this.sFld = (short)(this.sFld - (short)n2);
                        }
                        case 61: {
                            instanceCount >>= (int)instanceCount;
                            iFld = (int)instanceCount;
                            continue block11;
                        }
                        case 62: {
                            n6 += n5 | n3;
                            continue block11;
                        }
                        case 63: {
                            n2 += n5 - (n6 += -37 + n5 * n5);
                        }
                        case 64: {
                            n4 -= (int)this.fFld;
                            instanceCount += instanceCount;
                            continue block11;
                        }
                        case 65: {
                            this.fFld = -26.823f;
                            n2 |= n2;
                            n4 += n5 * n5;
                        }
                    }
                }
            }
        }
        FuzzerUtils.out.println("i12 i13 i14 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i15 i16 i17 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.iFld = " + instanceCount + "," + byFld + "," + iFld);
        FuzzerUtils.out.println("Test.dFld fFld Test.bFld = " + Double.doubleToLongBits(dFld) + "," + Float.floatToIntBits(this.fFld) + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("sFld lArrFld = " + this.sFld + "," + FuzzerUtils.checkSum(this.lArrFld));
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
}
