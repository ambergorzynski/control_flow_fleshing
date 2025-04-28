/*
 * Decompiled with CFR 0.153-SNAPSHOT (3d1d0f4).
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -4077546024940872360L;
    public static boolean bFld = true;
    public static short sFld = (short)-3052;
    public static volatile int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long fMeth_check_sum;

    public static float fMeth() {
        int n = 54183;
        int n2 = -10215;
        int n3 = 4;
        int n4 = -2;
        int n5 = -8;
        int n6 = -29414;
        double d = -110.799;
        boolean[] blArray = new boolean[400];
        long[] lArray = new long[400];
        float[] fArray = new float[400];
        FuzzerUtils.init(blArray, true);
        FuzzerUtils.init(lArray, -3796674004989386953L);
        FuzzerUtils.init(fArray, 0.121f);
        instanceCount = n;
        blArray[(n >>> 1) % 400] = bFld;
        n6 = (short)(n6 << (short)instanceCount);
        for (long l : lArray) {
            l = 168L;
            for (n2 = 1; n2 < 4; ++n2) {
                int n7 = (n >>> 1) % 400;
                fArray[n7] = fArray[n7] + 2.817f;
                int n8 = n2 - 1;
                iArrFld[n8] = iArrFld[n8] + n2;
                for (n4 = 1; 2 > n4; ++n4) {
                    n3 = n;
                    n += (int)l;
                    if (!bFld) continue;
                    lArray[n2] = n2;
                    n5 *= n2;
                }
            }
        }
        long l = (long)(n + n6 + n2 + n3 + n4 + n5) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(blArray) + FuzzerUtils.checkSum(lArray) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
        fMeth_check_sum += l;
        return l;
    }

    public static void vMeth1(int n, int n2) {
        int n3 = -7;
        int n4 = 0;
        int n5 = 155;
        int n6 = -217;
        int n7 = -2316;
        long l = 5530296145737095821L;
        int n8 = 104;
        int n9 = 28763;
        float f = -2.36f;
        block0 : switch ((iArrFld[(n2 >>> 1) % 400] >>> 1) % 1 * 5 + 54) {
            case 57: {
                n2 = (int)((float)n2 + ((float)(n2 - n2) + Test.fMeth()));
                for (n3 = 6; 171 > n3; ++n3) {
                    n += n3 + n3;
                    if (bFld) {
                        if (bFld) break block0;
                        n -= n;
                        for (l = 1L; 10L > l; ++l) {
                            switch ((n3 >>> 1) % 1 * 5 + 18) {
                                case 23: {
                                    n = n8;
                                    break;
                                }
                                default: {
                                    for (n6 = 1; 2 > n6; ++n6) {
                                        n9 = (short)l;
                                        n = (int)f;
                                        instanceCount <<= n;
                                    }
                                }
                            }
                            int n10 = n3;
                            iArrFld[n10] = iArrFld[n10] * -79;
                        }
                        continue;
                    }
                    n4 = (int)((long)n4 + ((long)n3 - instanceCount));
                }
                break;
            }
            default: {
                n5 <<= (int)instanceCount;
            }
        }
        vMeth1_check_sum += (long)(n + n2 + n3 + n4) + l + (long)n5 + (long)n8 + (long)n6 + (long)n7 + (long)n9 + (long)Float.floatToIntBits(f);
    }

    public static void vMeth() {
        int n = -12;
        int n2 = -234;
        int n3 = 12;
        int n4 = 222;
        int n5 = 9042;
        int n6 = -113;
        int n7 = 114;
        float f = -2.618f;
        int n8 = -30372;
        double d = 70.61752;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -7081063463532352545L);
        Test.vMeth1(n, n);
        n += (int)instanceCount;
        for (n2 = 1; n2 < 397; ++n2) {
            n7 = (byte)(n7 + (byte)n4);
            n3 <<= n3;
        }
        n = n2;
        n5 = 1;
        while (++n5 < 176) {
            n4 <<= n2;
            for (f = 1.0f; f < 9.0f; f += 1.0f) {
            }
            n8 = (short)(n8 << (short)n);
            lArray[n5] = n;
            instanceCount += (long)n;
            instanceCount += (long)n4;
            d = 8.0;
        }
        vMeth_check_sum += (long)(n + n2 + n3 + n7 + n4 + n5 + Float.floatToIntBits(f) + n6 + n8) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArray);
    }

    public void mainTest(String[] stringArray) {
        int n = 6;
        int n2 = 13;
        int n3 = 49332;
        int n4 = -18325;
        int n5 = -8;
        int n6 = 6;
        int n7 = -129;
        int n8 = 17367;
        int n9 = -23;
        int n10 = 32869;
        int[][] nArray = new int[400][400];
        float f = -1.536f;
        double d = 2.45324;
        byte by = 63;
        boolean[] blArray = new boolean[400];
        short[][] sArray = new short[400][400];
        FuzzerUtils.init(blArray, false);
        FuzzerUtils.init(sArray, (short)-1090);
        FuzzerUtils.init(nArray, -7);
        Test.vMeth();
        blArray[(n >>> 1) % 400] = bFld;
        n2 = 1;
        while (++n2 < 168) {
            int n11 = n2 + 1;
            iArrFld[n11] = iArrFld[n11] * n;
            n = n2;
            short[] sArray2 = sArray[n2 - 1];
            int n12 = n2 - 1;
            sArray2[n12] = (short)(sArray2[n12] << (short)(instanceCount += (long)n));
            f = n2;
            for (n3 = 3; n3 < 149; ++n3) {
                n4 = (int)((float)n4 + ((float)((long)n3 * instanceCount + (long)n) - f));
                for (n5 = n3; 2 > n5; ++n5) {
                    sFld = (short)(sFld / (short)(instanceCount | 1L));
                }
                for (n7 = 1; n7 < 2; ++n7) {
                    instanceCount -= 12L;
                    n4 -= 2;
                    n4 -= n6;
                    n8 += n;
                    n8 = n6;
                    if (!bFld) continue;
                }
                d = 1.0;
                while (true) {
                    double d2;
                    d += 1.0;
                    if (!(d2 < 2.0)) break;
                    n8 -= n4;
                    n6 = (int)d;
                    n4 = n5;
                    n6 += (int)((long)d ^ (long)n3);
                }
                n9 = 1;
                while (n9 < 2) {
                    n8 *= by;
                    nArray[n2] = nArray[n9 - 1];
                    Test.iArrFld[n9 - 1] = n9;
                    int n13 = n9++;
                    iArrFld[n13] = iArrFld[n13] + (int)f;
                }
            }
        }
        FuzzerUtils.out.println("i18 i19 f2 = " + n + "," + n2 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i20 i21 i22 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i23 i24 i25 = " + n6 + "," + n7 + "," + n8);
        FuzzerUtils.out.println("d2 i26 i27 = " + Double.doubleToLongBits(d) + "," + n9 + "," + n10);
        FuzzerUtils.out.println("by2 bArr1 sArr = " + by + "," + FuzzerUtils.checkSum(blArray) + "," + FuzzerUtils.checkSum(sArray));
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(nArray));
        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.sFld = " + instanceCount + "," + (bFld ? 1 : 0) + "," + sFld);
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, -9);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        fMeth_check_sum = 0L;
    }
}
