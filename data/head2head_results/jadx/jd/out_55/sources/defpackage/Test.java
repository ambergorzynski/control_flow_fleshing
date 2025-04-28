

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_55/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_55/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vMeth_check_sum;
    public static long lMeth_check_sum;
    public static long iMeth_check_sum;
    public static long instanceCount = 3;
    public static volatile float fFld = -1.805f;
    public static short sFld = 22185;
    public static byte byFld = -15;
    public static final int N = 400;
    public static int[][] iArrFld = new int[N][N];
    public static long[][] lArrFld = new long[N][N];

    static {
        FuzzerUtils.init(iArrFld, 63);
        FuzzerUtils.init(lArrFld, -420064933L);
        vMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static int iMeth(int i, boolean z) {
        long j;
        double[] dArr = new double[N];
        int i2 = 10;
        int i3 = 0;
        int i4 = 8;
        int i5 = -60;
        short[] sArr = new short[N];
        FuzzerUtils.init(sArr, (short) -6196);
        FuzzerUtils.init(dArr, 1.35667d);
        int i6 = (int) instanceCount;
        instanceCount = i6;
        sArr[(i6 >>> 1) % N] = (short) 53.7468d;
        int i7 = (i6 >>> 1) % N;
        sArr[i7] = (short) (sArr[i7] >> ((short) instanceCount));
        long j2 = 5;
        while (true) {
            j = j2;
            if (261 <= j) {
                break;
            }
            i3 = 1;
            while (6 > i3) {
                fFld *= i3;
                i3++;
            }
            i4 = 1;
            do {
                i5 = 1;
                do {
                    lArrFld[i4][(int) j] = instanceCount;
                    i5++;
                } while (i5 < 2);
                i6 = -62;
                fFld += (float) (i4 ^ i3);
                i2 = 8533;
                i4 += 2;
            } while (i4 < 6);
            sFld = (short) 8533;
            j2 = j + 1;
        }
        long doubleToLongBits = (((((((((i6 + (z ? 1 : 0)) + Double.doubleToLongBits(53.7468d)) + j) + i2) + i3) - 11) + i4) + i5) - 62) + FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public long lMeth(byte b, long j, int i) {
        int i2 = -42164;
        int i3 = -6;
        int i4 = -9845;
        int i5 = -22;
        boolean[] zArr = new boolean[N];
        double d = -101.125158d;
        double[][][] dArr = new double[N][N][N];
        FuzzerUtils.init(zArr, true);
        FuzzerUtils.init((Object[][]) dArr, (Object) Double.valueOf(-2.17656d));
        int i6 = i >>> 60763;
        int i7 = 2;
        while (i7 < 378) {
            if (!zArr[i7 - 1]) {
                i3 = 1;
                while (true) {
                    i3++;
                    if (i3 < 4) {
                        dArr[i7 + 1][i3 + 1][i3] = i2;
                        i2 = (i2 + 1) - ((int) fFld);
                        j = i6 * (iMeth(i2, true) + i6);
                        i4 = i3;
                        while (i4 < 1) {
                            fFld += i6;
                            i4++;
                        }
                        i5 += i3 * i4;
                    } else {
                        try {
                            break;
                        } catch (ArithmeticException e) {
                        }
                    }
                }
                i6 = i3 / (-50838);
                int i8 = i2 % 49;
                int i9 = (-36572) % i7;
                d += 83.0d;
                i2 = i6;
                sFld = (short) (sFld / ((short) (instanceCount | 1)));
                i6 = i5;
            }
            i7++;
        }
        long doubleToLongBits = b + j + i6 + i7 + i2 + i3 + (1 != 0 ? 1 : 0) + i4 + i5 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(zArr) + Double.doubleToLongBits(FuzzerUtils.checkSum((Object[][]) dArr));
        lMeth_check_sum += doubleToLongBits;
        return doubleToLongBits;
    }

    public void vMeth(long j, long j2, long j3) {
        int i = 22010;
        int i2 = -55;
        int i3 = -157;
        int i4 = 19025;
        int i5 = 14482;
        int i6 = -21584;
        double[][] dArr = new double[N][N];
        FuzzerUtils.init(dArr, 0.121567d);
        double[] dArr2 = dArr[(22010 >>> 1) % N];
        int i7 = (22010 >>> 1) % N;
        double d = dArr2[i7];
        int[] iArr = iArrFld[(22010 >>> 1) % N];
        int i8 = (22010 >>> 1) % N;
        int i9 = iArr[i8];
        iArr[i8] = i9 + 1;
        dArr2[i7] = d * i9;
        long j4 = 10;
        while (true) {
            long j5 = j4;
            if (j5 < 209) {
                i3 = 8;
                while (1 < i3) {
                    int i10 = i4 << ((int) (j * i3));
                    i4 = i10;
                    i = (int) (j2 - i10);
                    i5 = 1;
                    while (i5 < 3) {
                        switch ((i3 % 8) + 101) {
                            case 101:
                                i2 = (int) (i2 + i5 + j);
                                int[] iArr2 = iArrFld[i3 + 1];
                                int i11 = i5 - 1;
                                iArr2[i11] = iArr2[i11] >> (-i6);
                                int i12 = i6;
                                i6++;
                                fFld = fFld + 1.0f;
                                lArrFld[i3][i3 - 1] = i12 - r3;
                                break;
                            case 102:
                                j3 *= i5 >> ((int) ((j + i5) - iArrFld[i3 - 1][(int) j5]));
                                instanceCount *= -220;
                            case 103:
                                int i13 = i2 - i3;
                                i2 = i13;
                                i = Math.min((int) (0.99168d + iArrFld[(int) j5][(int) (j5 - 1)]), (int) (i13 * lMeth(byFld, j, 8)));
                                byFld = (byte) (byFld >> ((byte) j));
                                break;
                            case 104:
                            case 105:
                                sFld = (short) (sFld * ((short) i6));
                                i4 += i4;
                                break;
                            case 106:
                            case 107:
                                if (1 != 0) {
                                    break;
                                }
                            case 108:
                                int[] iArr3 = iArrFld[i3 + 1];
                                int i14 = i3;
                                iArr3[i14] = iArr3[i14] * i3;
                            default:
                                fFld += i5;
                                break;
                        }
                        i5++;
                    }
                    i3 -= 2;
                }
                j4 = j5 + 1;
            } else {
                vMeth_check_sum += j + j2 + j3 + i + j5 + i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(0.99168d) + (1 != 0 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
        }
    }

    public void mainTest(String[] strArr) {
        int i = 50979;
        int i2 = -74;
        int i3 = 7764;
        int i4 = 8285;
        int i5 = 11;
        int i6 = 232;
        long j = -1452115045211642065L;
        byte[] bArr = new byte[N];
        FuzzerUtils.init(bArr, (byte) -58);
        vMeth(instanceCount, instanceCount, instanceCount);
        int i7 = (68 >>> 1) % N;
        bArr[i7] = (byte) (bArr[i7] + ((byte) 68));
        double d = 14.113343d + fFld;
        int i8 = (68 | 44246) + ((int) (-1452115045211642065L));
        try {
            d = i8;
            iArrFld[(i8 >>> 1) % N] = iArrFld[(i8 >>> 1) % N];
            i = 1;
            while (i < 337) {
                int[] iArr = iArrFld[i];
                int i9 = i - 1;
                iArr[i9] = iArr[i9] - i8;
                fFld += ((i * i) + i8) - i2;
                fFld = i;
                switch ((((i >>> 1) % 2) * 5) + 14) {
                    case 16:
                        i8 = i8;
                        break;
                    case 24:
                        bArr[i] = (byte) i;
                        break;
                    default:
                        i8 += byFld;
                        i2 = ((int) (i2 + (((i * i2) + instanceCount) - i8))) + i8;
                        break;
                }
                instanceCount -= i;
                i++;
            }
            fFld += (float) instanceCount;
        } catch (NullPointerException e) {
            i3 = 7;
            while (i3 < 378) {
                i4 = 3;
                while (i4 < 68) {
                    fFld = i8;
                    long[] jArr = lArrFld[i3 + 1];
                    int i10 = i4 + 1;
                    jArr[i10] = jArr[i10] >> (-10);
                    fFld = i2;
                    i5 -= 53595;
                    i6 = 1;
                    do {
                        i2 += i6 + i2;
                        j += i6 * i6;
                        iArrFld[i4][i3 - 1] = r0[r1] - 252;
                        i6++;
                    } while (i6 < 2);
                    i4++;
                }
                i3++;
            }
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i18 d3 l6 = " + i8 + "," + Double.doubleToLongBits(d) + "," + printStream);
        FuzzerUtils.out.println("i19 i20 i21 = " + i + "," + i2 + "," + i3);
        FuzzerUtils.out.println("i22 i23 i24 = " + (-10) + "," + i4 + "," + i5);
        FuzzerUtils.out.println("i25 byArr = " + i6 + "," + FuzzerUtils.checkSum(bArr));
        PrintStream printStream2 = FuzzerUtils.out;
        long j2 = instanceCount;
        int floatToIntBits = Float.floatToIntBits(fFld);
        short s = sFld;
        printStream2.println("Test.instanceCount Test.fFld Test.sFld = " + j2 + "," + printStream2 + "," + floatToIntBits);
        PrintStream printStream3 = FuzzerUtils.out;
        byte b = byFld;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        FuzzerUtils.checkSum(lArrFld);
        printStream3.println("Test.byFld Test.iArrFld Test.lArrFld = " + b + "," + checkSum + "," + printStream3);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
