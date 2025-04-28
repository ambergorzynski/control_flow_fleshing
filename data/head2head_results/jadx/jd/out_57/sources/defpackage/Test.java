

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_57/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_57/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public double dFld = -10.119587d;
    public volatile int[] iArrFld = new int[N];
    public short[] sArrFld = new short[N];
    public static long instanceCount = 4121316606801551289L;
    public static boolean bFld = false;
    public static int iFld = -52248;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f, int i, int i2) {
        int i3 = 22299;
        int i4 = -13;
        int i5 = 0;
        int i6 = 12;
        int i7 = -48511;
        int[][][] iArr = new int[N][N][N];
        long[][] jArr = new long[N][N];
        FuzzerUtils.init(jArr, 3L);
        FuzzerUtils.init((Object[][]) iArr, (Object) (-6029));
        long[] jArr2 = jArr[(i2 >>> 1) % N];
        int i8 = (i >>> 1) % N;
        jArr2[i8] = jArr2[i8] - (-21903);
        instanceCount = -123L;
        double d = 9.0d;
        while (true) {
            double d2 = d;
            if (d2 < 391.0d) {
                f /= -50283.0f;
                i3 <<= i2;
                i2 |= i2;
                switch (((i >>> 1) % 2) + 93) {
                    case 93:
                        i2 -= i2;
                        switch ((int) ((d2 % 7.0d) + 125.0d)) {
                            case 125:
                                i4 = 1;
                                while (i4 < 8) {
                                    iArr[i4 - 1][(int) (d2 + 1.0d)][(int) (d2 + 1.0d)] = 36;
                                    i6 = 2;
                                    while (i6 > 1) {
                                        f += ((i6 * f) + i) - i6;
                                        i3 >>= i3;
                                        i2 -= i7;
                                        i6--;
                                    }
                                    i4++;
                                }
                                continue;
                            case 126:
                                instanceCount <<= i3;
                                continue;
                            case 127:
                                i3 %= 13146;
                                break;
                            case 128:
                                break;
                            case 129:
                                i2 *= -43;
                                continue;
                            case 130:
                                f = i;
                                continue;
                            case 131:
                                if (1 != 0) {
                                }
                                continue;
                            default:
                                try {
                                    int i9 = i6 % i3;
                                    i7 = i / (-23382);
                                    i5 = 15027 / i7;
                                    continue;
                                } catch (ArithmeticException e) {
                                    break;
                                }
                        }
                        i7 = i;
                        break;
                }
                d = d2 + 2.0d;
            } else {
                vMeth2_check_sum += (((((((((Float.floatToIntBits(f) + i) + i2) + Double.doubleToLongBits(d2)) + i3) + i4) + i5) + i6) + i7) - 43) + (1 != 0 ? 1 : 0) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum((Object[][]) iArr);
                return;
            }
        }
    }

    public static void vMeth1(double d, int i, int i2) {
        int i3 = -67;
        int i4 = 128;
        int i5 = 13;
        int i6 = -238;
        int i7 = 0;
        short s = -19502;
        boolean[] zArr = new boolean[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(zArr, true);
        FuzzerUtils.init(jArr, 13494L);
        int i8 = 9;
        while (215 > i8) {
            vMeth2(41.96f, i, i2);
            i3 = 1;
            while (i3 < 8) {
                i5 = 2;
                while (i3 < i5) {
                    instanceCount = i5;
                    i >>= i3;
                    i5--;
                }
                s = (short) (s - 11819);
                i6 = (int) instanceCount;
                i4 <<= i3;
                i7 = 1;
                while (i7 < 2) {
                    i = -173;
                    i2 += 6214;
                    zArr[i8] = bFld;
                    instanceCount |= 59857;
                    int i9 = i3;
                    jArr[i9] = jArr[i9] + i3;
                    i7++;
                }
                i3++;
            }
            i8++;
        }
        vMeth1_check_sum += ((((Double.doubleToLongBits(d) + i) + i2) + i8) - 173) + Float.floatToIntBits(41.96f) + i3 + i4 + i5 + i6 + s + i7 + 157 + 59857 + FuzzerUtils.checkSum(zArr) + FuzzerUtils.checkSum(jArr);
    }

    public void vMeth(float f, int i, double d) {
        double d2;
        int i2 = 0;
        int i3 = 247;
        int i4 = -10275;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -767148025840482052L);
        vMeth1(d, i, i);
        int i5 = (int) f;
        int i6 = 2;
        while (i6 < 186) {
            this.iArrFld = this.iArrFld;
            i6++;
        }
        double d3 = 6.0d;
        while (true) {
            d2 = d3;
            if (d2 >= 264.0d) {
                break;
            }
            i3 = 1;
            do {
                i2 = 112;
                int[] iArr = this.iArrFld;
                int i7 = (int) (d2 + 1.0d);
                iArr[i7] = iArr[i7] << 133;
                i3++;
            } while (i3 < 6);
            i5 = 112;
            i2 = 112 * 112;
            d3 = d2 + 1.0d;
        }
        int i8 = 112 - ((int) instanceCount);
        int i9 = 12;
        while (i9 < 315) {
            i4 += (int) instanceCount;
            i5 += ((i9 * i5) - 4213) - i9;
            i9++;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i5 + Double.doubleToLongBits(d) + i6 + i8 + Double.doubleToLongBits(d2) + i2 + i3 + i9 + i4 + FuzzerUtils.checkSum(jArr);
    }

    public void mainTest(String[] strArr) {
        int i = 97;
        int i2 = 24102;
        int i3 = -5;
        int i4 = 22778;
        int i5 = 45436;
        int i6 = 13376;
        int i7 = 0;
        short s = -18705;
        float f = -10.329f;
        float f2 = -76.997f;
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, 4.66226d);
        vMeth(-119.144f, iFld, this.dFld);
        if (bFld) {
            i = 1;
            do {
                i2 = 4;
                while (112 > i2) {
                    iFld <<= i2;
                    if (bFld) {
                        s = (short) iFld;
                        instanceCount %= 5;
                        i3 += (int) (-2.303f);
                    } else if (bFld) {
                        iFld >>>= i2;
                    }
                    i2++;
                }
                i4 = 1;
                while (112 > i4) {
                    int[] iArr = this.iArrFld;
                    int i8 = i;
                    iArr[i8] = iArr[i8] << i3;
                    instanceCount = i;
                    i4++;
                }
                short[] sArr = this.sArrFld;
                int i9 = i - 1;
                sArr[i9] = (short) (sArr[i9] - (-9));
                iFld -= i;
                this.dFld -= i3;
                int[] iArr2 = this.iArrFld;
                int i10 = i + 1;
                iArr2[i10] = iArr2[i10] + ((int) instanceCount);
                float f3 = i;
                while (true) {
                    f = f3;
                    if (112.0f <= f) {
                        break;
                    }
                    f2 -= s;
                    i6 = 1;
                    while (i6 < 1) {
                        int i11 = i + 1;
                        dArr[i11] = dArr[i11] - (-118.0d);
                        i5 = 7113;
                        i3 = ((i3 / (s | 1)) << i4) * (-37);
                        instanceCount = instanceCount;
                        i6++;
                    }
                    i7 = (i7 + ((int) (f - i3))) - 117;
                    instanceCount += f * ((float) instanceCount);
                    i5 -= i7;
                    f3 = f + 1.0f;
                }
                i++;
            } while (i < 225);
        }
        FuzzerUtils.out.println("i25 i26 i27 = " + i + "," + i2 + "," + i3);
        FuzzerUtils.out.println("s2 i28 i29 = " + s + "," + i4 + "," + 29350);
        FuzzerUtils.out.println("by1 f4 i30 = " + (-9) + "," + Float.floatToIntBits(f) + "," + i5);
        FuzzerUtils.out.println("f5 i31 i32 = " + Float.floatToIntBits(f2) + "," + i6 + "," + i7);
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        boolean z = bFld;
        int i12 = iFld;
        printStream.println("Test.instanceCount Test.bFld Test.iFld = " + j + "," + printStream + "," + z);
        PrintStream printStream2 = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(this.dFld);
        long checkSum = FuzzerUtils.checkSum(this.iArrFld);
        FuzzerUtils.checkSum(this.sArrFld);
        printStream2.println("dFld iArrFld sArrFld = " + doubleToLongBits + "," + printStream2 + "," + checkSum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
