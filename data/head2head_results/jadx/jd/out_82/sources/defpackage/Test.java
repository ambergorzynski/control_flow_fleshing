

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_82/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_82/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public long[] lArrFld = new long[N];
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long instanceCount = -6154815280945900337L;
    public static int iFld = 2;
    public static float fFld = 0.608f;
    public static final int N = 400;
    public static byte[] byArrFld = new byte[N];
    public static float[] fArrFld = new float[N];

    static {
        FuzzerUtils.init(byArrFld, (byte) -86);
        FuzzerUtils.init(fArrFld, 0.856f);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static int iMeth(long j, float f, boolean z) {
        int i = -20002;
        int i2 = 223;
        int[] iArr = new int[N];
        double d = 48.50419d;
        double[] dArr = new double[N];
        FuzzerUtils.init(iArr, -173);
        FuzzerUtils.init(dArr, 124.57537d);
        iArr[(iFld >>> 1) % N] = iFld;
        iFld *= (int) f;
        iFld -= -96;
        int i3 = 13;
        while (i3 < 250) {
            double d2 = 1.0d;
            while (true) {
                d = d2;
                if (d >= 7.0d) {
                    break;
                }
                i += (int) d;
                d2 = d + 1.0d;
            }
            z = z;
            instanceCount += ((i3 * (-22)) + iFld) - i3;
            i += (int) instanceCount;
            i2 = 1;
            while (true) {
                i2++;
                if (i2 < 7) {
                    dArr[i2 - 1] = instanceCount;
                    i -= 41594;
                    j += i;
                    instanceCount -= 203;
                }
            }
            i3++;
        }
        long floatToIntBits = (((((((j + Float.floatToIntBits(f)) + (z ? 1 : 0)) + i3) + i) + Double.doubleToLongBits(d)) + (15165 - i3)) - 22) + i2 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static void vMeth(long j) {
        int i = 47159;
        int i2 = 241;
        int[] iArr = new int[N];
        float f = 24.86f;
        FuzzerUtils.init(iArr, -4);
        int iMeth = (-11) * iMeth(instanceCount, fFld, true);
        int i3 = 267;
        while (7 < i3) {
            float[] fArr = fArrFld;
            fArr[41] = fArr[41] + iFld;
            i3--;
        }
        int i4 = 1;
        while (230 > i4) {
            int i5 = i4 + 1;
            iArr[i5] = iArr[i5] * ((int) fFld);
            i4++;
        }
        byArrFld[(i4 >>> 1) % N] = (byte) (r0[r1] - 33);
        iArr[(iMeth >>> 1) % N] = (int) fFld;
        switch ((((-7) >>> 1) % 2) + 42) {
            case 42:
                i = 1;
                while (true) {
                    i++;
                    if (i < 137) {
                        i2 = 11;
                        while (i2 > 1) {
                            float f2 = 1.0f;
                            while (true) {
                                f = f2;
                                if (f < 2.0f) {
                                    byArrFld = byArrFld;
                                    iFld += (int) f;
                                    int i6 = (int) (f - 1.0f);
                                    iArr[i6] = iArr[i6] * (-43512);
                                    fFld += ((f * i) + iFld) - 1;
                                    f2 = f + 1.0f;
                                }
                            }
                            i2--;
                        }
                    }
                }
                break;
            case 43:
                iFld += i2;
                break;
        }
        vMeth_check_sum += ((((((j + iMeth) + (1 != 0 ? 1 : 0)) + i3) - 51) + i4) - 7) + i + i2 + 1 + Float.floatToIntBits(f) + 18 + FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth(int i, int i2) {
        vMeth(instanceCount);
        vSmallMeth_check_sum += i + i2;
    }

    public void mainTest(String[] strArr) {
        double d;
        int i = 87;
        int i2 = -252;
        int i3 = -12;
        int i4 = 10;
        int i5 = 64580;
        int i6 = -14205;
        int i7 = -44732;
        int i8 = 18683;
        int[][] iArr = new int[N][N];
        int[] iArr2 = new int[N];
        short s = 7359;
        boolean z = false;
        long j = -232269950720414539L;
        FuzzerUtils.init(iArr, 2);
        FuzzerUtils.init(iArr2, -39784);
        long j2 = instanceCount;
        int[] iArr3 = iArr[(87 >>> 1) % N];
        int i9 = (87 >>> 1) % N;
        iArr3[i9] = iArr3[i9] - 1;
        instanceCount = j2 + (-(87 + 87 + r4));
        double d2 = 6.0d;
        while (true) {
            d = d2;
            if (d >= 300.0d) {
                break;
            }
            for (int i10 = 0; i10 < 62; i10++) {
                vSmallMeth(i2, i);
            }
            i3 = 1;
            while (86 > i3) {
                i4 += (int) (2746857203L + (i3 * i3));
                s = (short) (s + 41);
                i3++;
            }
            int[] iArr4 = iArr[(int) (d - 1.0d)];
            int i11 = (int) d;
            iArr4[i11] = iArr4[i11] & i3;
            i += i2;
            z = z;
            instanceCount = -12L;
            i2 = iFld;
            d2 = d + 1.0d;
        }
        iFld -= -181;
        for (int i12 : iArr2) {
            i2 = -219;
        }
        int i13 = 4;
        while (i13 < 177) {
            long j3 = i13;
            while (true) {
                j = j3;
                if (j < 145) {
                    i6 = i5;
                    double d3 = (-2.125993d) * 7.0d;
                    iArr[i13][(int) j] = 9;
                    instanceCount = s;
                    i7 = 1;
                    while (i7 > 1) {
                        s = (short) (s + ((short) (((i7 * i13) + fFld) - i4)));
                        i5 -= i13;
                        i += i7;
                        long[] jArr = this.lArrFld;
                        int i14 = i13 + 1;
                        jArr[i14] = jArr[i14] << i7;
                        i8 = iFld;
                        switch (((i5 >>> 1) % 9) + 99) {
                            case 99:
                                iFld = i5;
                                i2 >>= i13;
                                break;
                            case 100:
                                iArr[(int) (j - 1)][(int) (j + 1)] = -203;
                                break;
                            case 101:
                                i += i2;
                                break;
                            case 102:
                                int[] iArr5 = iArr[(int) j];
                                int i15 = i13 + 1;
                                iArr5[i15] = iArr5[i15] << (-80);
                            case 103:
                                z = false;
                            case 104:
                                d3 += i7;
                                break;
                            case 105:
                                i = i13;
                            case 106:
                                iFld += (int) fFld;
                                break;
                            case 107:
                                fFld = -27266.0f;
                                break;
                            default:
                                int[] iArr6 = iArr[i7 + 1];
                                int i16 = i7 - 1;
                                iArr6[i16] = iArr6[i16] - i3;
                                break;
                        }
                        i7 -= 3;
                    }
                    j3 = j + 1;
                }
            }
            i13++;
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i d i1 = " + i + "," + Double.doubleToLongBits(d) + "," + printStream);
        FuzzerUtils.out.println("i17 i18 s = " + i3 + "," + i4 + "," + s);
        FuzzerUtils.out.println("b2 i20 i21 = " + (z) + "," + i13 + "," + i5);
        PrintStream printStream2 = FuzzerUtils.out;
        printStream2.println("l2 i22 i23 = " + j + "," + printStream2 + "," + i6);
        PrintStream printStream3 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(iArr);
        FuzzerUtils.checkSum(iArr2);
        printStream3.println("i24 iArr iArr3 = " + i8 + "," + checkSum + "," + printStream3);
        PrintStream printStream4 = FuzzerUtils.out;
        long j4 = instanceCount;
        int i17 = iFld;
        Float.floatToIntBits(fFld);
        printStream4.println("Test.instanceCount Test.iFld Test.fFld = " + j4 + "," + printStream4 + "," + i17);
        PrintStream printStream5 = FuzzerUtils.out;
        long checkSum2 = FuzzerUtils.checkSum(byArrFld);
        long doubleToLongBits = Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld));
        FuzzerUtils.checkSum(this.lArrFld);
        printStream5.println("Test.byArrFld Test.fArrFld lArrFld = " + checkSum2 + "," + printStream5 + "," + doubleToLongBits);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            Test test = new Test();
            for (int i = 0; i < 10; i++) {
                test.mainTest(strArr);
            }
        } catch (Exception e) {
            FuzzerUtils.out.println(e.getClass().getCanonicalName());
        }
    }
}
