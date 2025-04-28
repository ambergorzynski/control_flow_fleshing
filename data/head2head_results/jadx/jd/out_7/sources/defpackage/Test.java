

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_7/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_7/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public boolean bFld = true;
    public static long vSmallMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long instanceCount = -8273866329805269590L;
    public static int iFld = 0;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, -14318);
        vSmallMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }

    public static void vMeth() {
        int i = 104;
        int i2 = 213;
        int i3 = 60381;
        int i4 = 40248;
        boolean z = false;
        long j = -7;
        iFld += iFld;
        int i5 = 6;
        while (i5 < 358) {
            iFld -= (int) instanceCount;
            z = z;
            iFld = i5;
            switch (((i5 % 6) * 5) + 19) {
                case 21:
                case 43:
                    if (i != 0) {
                        vMeth_check_sum += (((((i5 + i) + (z ? 1 : 0)) + i2) + i3) - 25966) + j + i4;
                        return;
                    }
                    long j2 = i5;
                    while (true) {
                        j = j2;
                        if (5 <= j) {
                            continue;
                            i5++;
                        } else {
                            instanceCount >>>= i3;
                            i4 *= i2;
                            i = i5;
                            j2 = j + 1;
                        }
                    }
                case 24:
                    i2 = 5;
                    while (i2 > i5) {
                        iFld = 94;
                        i3 -= -25966;
                        i2 -= 3;
                    }
                    continue;
                    i5++;
                case 33:
                    break;
                case 34:
                    i4 = i;
                    continue;
                    i5++;
                case 39:
                    i += i5;
                    break;
                default:
                    i5++;
            }
            iFld &= iFld;
            i5++;
        }
        vMeth_check_sum += (((((i5 + i) + (z ? 1 : 0)) + i2) + i3) - 25966) + j + i4;
    }

    public static int iMeth(int i, long j, short s) {
        int i2 = 38300;
        int i3 = -162;
        int i4 = -63;
        int i5 = -1;
        int[][][] iArr = new int[N][N][N];
        float f = -6.66f;
        float f2 = -2.278f;
        boolean z = true;
        double[] dArr = new double[N];
        FuzzerUtils.init((Object[][]) iArr, (Object) (-15912));
        FuzzerUtils.init(dArr, 1.60633d);
        long j2 = 2;
        while (true) {
            long j3 = j2;
            if (j3 < 208) {
                i2 = (int) j3;
                while (i2 < 8) {
                    int[] iArr2 = iArr[(int) j3][(int) j3];
                    int i6 = i2 - 1;
                    long j4 = (-4191601283830594869L) + i3;
                    int i7 = i3 - 1;
                    int[] iArr3 = iArr[i2 + 1][(int) j3];
                    int i8 = i2;
                    iArr3[i8] = iArr3[i8] - 1;
                    f += 1.0f;
                    iArr2[i6] = iArr2[i6] - ((int) ((j4 - i7) >> ((int) (r6 - r5))));
                    long j5 = instanceCount;
                    iFld = iFld + 1;
                    i3 = i7 - 1;
                    instanceCount = j5 * Math.max(r1, i7);
                    vMeth();
                    instanceCount += i2 * i2;
                    switch ((int) ((j3 % 1) + 83)) {
                        case 83:
                            z = z;
                            float f3 = 1.0f;
                            while (true) {
                                f2 = f3;
                                if (f2 < 1.0f) {
                                    s = (short) (s * ((short) 208));
                                    instanceCount += ((f2 * iFld) + i) - ((float) instanceCount);
                                    f3 = f2 + 1.0f;
                                } else {
                                    i4 = 1;
                                    while (1 < i4) {
                                        i3 += ((i4 * i2) + i) - i4;
                                        dArr[i2] = i4;
                                        i5 += 51850 + (i4 * i4);
                                        i4 -= 2;
                                    }
                                    break;
                                }
                            }
                    }
                    i2++;
                }
                j2 = j3 + 1;
            } else {
                long floatToIntBits = i + j + s + j3 + 8360 + i2 + i3 + Float.floatToIntBits(f) + (z ? 1 : 0) + Float.floatToIntBits(f2) + 208 + i4 + i5 + FuzzerUtils.checkSum((Object[][]) iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                iMeth_check_sum += floatToIntBits;
                return (int) floatToIntBits;
            }
        }
    }

    public static void vSmallMeth(short s) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -37781);
        int i = iFld;
        int i2 = (iFld >>> 1) % N;
        int i3 = iArr[i2] + 1;
        iArr[i2] = i3;
        iFld = i * (i3 - iMeth(iFld, instanceCount, (short) 11125));
        instanceCount -= 115;
        vSmallMeth_check_sum += s + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        int i = 28402;
        int i2 = -109;
        int i3 = -61522;
        int i4 = 49058;
        int[] iArr = new int[N];
        float f = -2.822f;
        byte b = 104;
        byte[] bArr = new byte[N];
        long[] jArr = new long[N];
        double[][] dArr = new double[N][N];
        short[] sArr = new short[N];
        FuzzerUtils.init(jArr, -12L);
        FuzzerUtils.init(bArr, (byte) -74);
        FuzzerUtils.init(iArr, -4);
        FuzzerUtils.init(dArr, -2.81576d);
        FuzzerUtils.init(sArr, (short) 22484);
        int i5 = 1;
        while (true) {
            i5++;
            if (i5 < 244) {
                iFld += (int) ((instanceCount - i5) * jArr[i5]);
                i = 6;
                while (i < 103) {
                    i2 += -(bArr[i] - 122);
                    i3 = 1;
                    while (true) {
                        i3++;
                        if (i3 < 2) {
                            int i6 = iFld + ((int) (instanceCount + i2 + iArr[i3]));
                            iFld = i6;
                            i2 >>= i6;
                        } else {
                            double[] dArr2 = dArr[i5];
                            int i7 = i5 - 1;
                            double d = dArr2[i7];
                            dArr2[i7] = d + 1.0d;
                            iFld = (int) d;
                            for (int i8 = 0; i8 < 1; i8++) {
                                vSmallMeth((short) -30051);
                            }
                            float f2 = 2.0f;
                            while (true) {
                                f = f2;
                                if (f > 1.0f) {
                                    b = (byte) i3;
                                    i4 = i3 / (i2 | 1);
                                    switch (((iFld >>> 1) % 6) + 96) {
                                        case 96:
                                            i2 = (int) instanceCount;
                                            iFld |= (int) instanceCount;
                                            break;
                                        case 97:
                                            iFld += (int) f;
                                            instanceCount += ((f * i4) + ((float) instanceCount)) - iFld;
                                            switch ((int) ((f % 1.0f) + 57.0f)) {
                                                case 57:
                                                    i4 *= 283282329;
                                                    break;
                                            }
                                            switch ((int) ((f % 7.0f) + 101.0f)) {
                                                case 101:
                                                    int[] iArr2 = iArrFld;
                                                    int i9 = (int) f;
                                                    iArr2[i9] = iArr2[i9] + i5;
                                                    int[] iArr3 = iArrFld;
                                                    int i10 = i + 1;
                                                    iArr3[i10] = iArr3[i10] * i3;
                                                    break;
                                                case 102:
                                                    i4 = ((i4 * iFld) >> ((int) instanceCount)) >> (-59149);
                                                    break;
                                                case 103:
                                                    instanceCount = iFld;
                                                    break;
                                                case 104:
                                                    iFld <<= i2;
                                                    b = (byte) (b >> ((byte) iFld));
                                                    break;
                                                case 105:
                                                    instanceCount = i;
                                                    break;
                                                case 106:
                                                    sArr[(int) f] = (short) i2;
                                                    break;
                                                case 107:
                                                    iFld += (int) f;
                                                    break;
                                            }
                                        case 98:
                                            iArrFld[(int) f] = i5;
                                        case 99:
                                        case 100:
                                            this.bFld = false;
                                            break;
                                        case 101:
                                            iFld += iFld;
                                        default:
                                            if (this.bFld) {
                                            }
                                            break;
                                    }
                                    f2 = f - 1.0f;
                                }
                            }
                            i++;
                        }
                    }
                }
            } else {
                FuzzerUtils.out.println("i i1 i2 = " + i5 + "," + i + "," + i2);
                FuzzerUtils.out.println("i3 f2 i16 = " + i3 + "," + Float.floatToIntBits(f) + "," + i4);
                PrintStream printStream = FuzzerUtils.out;
                long checkSum = FuzzerUtils.checkSum(jArr);
                FuzzerUtils.checkSum(bArr);
                printStream.println("by lArr byArr = " + b + "," + checkSum + "," + printStream);
                PrintStream printStream2 = FuzzerUtils.out;
                long checkSum2 = FuzzerUtils.checkSum(iArr);
                long doubleToLongBits = Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                FuzzerUtils.checkSum(sArr);
                printStream2.println("iArr dArr sArr = " + checkSum2 + "," + printStream2 + "," + doubleToLongBits);
                PrintStream printStream3 = FuzzerUtils.out;
                long j = instanceCount;
                int i11 = iFld;
                if (this.bFld) {
                }
                printStream3.println("Test.instanceCount Test.iFld bFld = " + j + "," + printStream3 + "," + i11);
                FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
                FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
                FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
                FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
                return;
            }
        }
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
