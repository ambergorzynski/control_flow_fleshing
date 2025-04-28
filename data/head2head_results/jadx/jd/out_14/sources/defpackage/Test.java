

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_14/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_14/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public volatile short sFld = -9595;
    public byte byFld = 116;
    public int[] iArrFld = new int[N];
    public static long vMeth_check_sum;
    public static long lMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long instanceCount = 46610;
    public static double dFld = 0.39593d;
    public static int iFld = 204;
    public static final int N = 400;
    public static int[] iArrFld1 = new int[N];

    static {
        FuzzerUtils.init(iArrFld1, 2);
        vMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }

    public static void vMeth1(int i, int i2, int i3) {
        float f = 2.895f;
        int i4 = -9;
        int i5 = -6;
        int i6 = 7;
        double d = 2.129491d;
        int i7 = i2 - i3;
        float f2 = 8.0f;
        while (true) {
            float f3 = f2;
            if (f3 < 325.0f) {
                instanceCount >>= 28;
                double d2 = 1.0d;
                while (true) {
                    d = d2;
                    if (d < 5.0d) {
                        i5 = 2;
                        while (i5 > 1) {
                            dFld = f3;
                            f -= 5.0f;
                            i3 += i5;
                            i4 += ((i5 * i3) + i4) - 28;
                            try {
                                int i8 = (-156) % i5;
                                i7 = 42850 / i7;
                                i3 = i5 % iArrFld1[(int) d];
                            } catch (ArithmeticException e) {
                            }
                            i5--;
                        }
                        int[] iArr = iArrFld1;
                        int i9 = (int) (d - 1.0d);
                        iArr[i9] = iArr[i9] ^ ((int) instanceCount);
                        if (-129 != 0) {
                            vMeth1_check_sum += ((((((((((((i + i7) + i3) + Float.floatToIntBits(f3)) + 28) + Double.doubleToLongBits(d)) + i4) + i5) - 13719) + Float.floatToIntBits(f)) - 129) + i6) + 15996) - 24;
                            return;
                        }
                        i6 = 1;
                        while (i6 < 2) {
                            instanceCount = -24;
                            instanceCount ^= -8;
                            i6++;
                        }
                        d2 = d + 1.0d;
                    }
                }
            } else {
                vMeth1_check_sum += ((((((((((((i + i7) + i3) + Float.floatToIntBits(f3)) + 28) + Double.doubleToLongBits(d)) + i4) + i5) - 13719) + Float.floatToIntBits(f)) - 129) + i6) + 15996) - 24;
                return;
            }
            f2 = f3 + 1.0f;
        }
    }

    public static long lMeth(int i) {
        long j;
        int i2 = -11;
        byte b = -64;
        long j2 = 6;
        double d = -112.62639d;
        double[] dArr = new double[N];
        boolean[] zArr = new boolean[N];
        FuzzerUtils.init(zArr, false);
        FuzzerUtils.init(dArr, 0.62971d);
        float f = 1.901f + 1.0f;
        int reverseBytes = i / ((int) (((Integer.reverseBytes(i) - r2) - i) | 1));
        int i3 = 241;
        while (i3 > 15) {
            zArr[i3] = b * reverseBytes == iArrFld1[i3];
            dArr = dArr;
            vMeth1(reverseBytes, reverseBytes, i2);
            j2 = 7;
            do {
                int i4 = (int) instanceCount;
                if (i3 != 0) {
                }
                reverseBytes = i4 - ((int) f);
                double d2 = 1.0d;
                while (true) {
                    d = d2;
                    if (d >= 2.0d) {
                        break;
                    }
                    i2 -= i3;
                    instanceCount ^= i3;
                    d2 = d + 1.0d;
                }
                f = -3;
                i2 *= (int) instanceCount;
                b = (byte) d;
                j = j2 - 2;
                j2 = j;
            } while (j > 0);
            i3--;
        }
        long floatToIntBits = (((((((reverseBytes + Float.floatToIntBits(f)) + i3) + i2) + b) + j2) + Double.doubleToLongBits(d)) - 3) + FuzzerUtils.checkSum(zArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public static void vMeth() {
        int i = 47407;
        int i2 = -7;
        int i3 = 5;
        double d = -19.3636d;
        long j = 16658;
        int i4 = 3;
        while (i4 < 194) {
            int lMeth = i - ((int) (((float) instanceCount) + ((i - 0.285f) - ((float) lMeth(i4)))));
            dFld += 84.0d;
            i2 = 1;
            do {
                instanceCount -= i4;
                instanceCount &= 11;
                instanceCount >>= 120;
                i = i4;
                instanceCount -= 0.285f;
                i2++;
            } while (i2 < 8);
            switch ((((i >>> 1) % 5) * 5) + 106) {
                case 115:
                    i += i4;
                    continue;
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 125:
                case 126:
                case 127:
                default:
                    i3 <<= (int) instanceCount;
                    continue;
                case 123:
                    i += i4 - i;
                    double d2 = i4;
                    while (true) {
                        d = d2;
                        if (d < 8.0d) {
                            long j2 = 1;
                            while (true) {
                                j = j2;
                                if (j > 1) {
                                    i3 >>= 15666;
                                    instanceCount = ((float) instanceCount) + ((((float) (j * i)) + 0.285f) - ((float) instanceCount));
                                    j2 = j - 2;
                                }
                            }
                            d2 = d + 1.0d;
                        } else {
                            continue;
                        }
                    }
                    break;
                case 124:
                    break;
                case 128:
                    i3 += (int) dFld;
                    continue;
                case 129:
                    i += i4;
                    break;
            }
            int[] iArr = iArrFld1;
            int i5 = i4 + 1;
            iArr[i5] = iArr[i5] - ((int) 0.285f);
            i4++;
        }
        vMeth_check_sum += i4 + i + Float.floatToIntBits(0.285f) + i2 + Double.doubleToLongBits(d) + i3 + j + 15666;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void mainTest(String[] strArr) {
        int i = -13;
        int i2 = 1;
        int i3 = -13;
        int i4 = 1187;
        int i5 = 38;
        int i6 = -49;
        int i7 = 179;
        int[][] iArr = new int[N][N];
        float f = 2.188f;
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, 86.101f);
        FuzzerUtils.init(iArr, -9);
        int i8 = 1;
        do {
            this.sFld = (short) (this.sFld + ((short) (i8 * (2.188f + (this.byFld * (-12))))));
            short s = this.sFld;
            int[] iArr2 = this.iArrFld;
            int i9 = i8;
            int i10 = iArr2[i9];
            iArr2[i9] = i10 + 1;
            this.sFld = (short) (s + ((short) i10));
            i8 += 3;
        } while (i8 < 213);
        int i11 = 4;
        while (i11 < 129) {
            i2 = 2;
            while (i2 < 201) {
                vMeth();
                i <<= i3;
                i4 = 2;
                while (i4 > 1 && 1 == 0) {
                    iFld -= 157;
                    dFld *= i3;
                    f = i5;
                    this.sFld = (short) (this.sFld - ((short) iFld));
                    instanceCount = 101L;
                    i++;
                    i4--;
                }
                i2++;
            }
            float f2 = f - i3;
            int i12 = i11 + 1;
            fArr[i12] = fArr[i12] + 37700.0f;
            int[] iArr3 = this.iArrFld;
            int i13 = i11 - 1;
            iArr3[i13] = iArr3[i13] + i5;
            i6 = 1;
            do {
                f = -152.0f;
                i7 = 1;
                do {
                    switch ((i7 % 8) + 49) {
                        case 49:
                            i3 = (int) (i3 + (((i7 * instanceCount) + i3) - i5));
                            switch (((i7 % 5) * 5) + 64) {
                                case 69:
                                    this.sFld = (short) (this.sFld + ((short) 20282));
                                    f -= (float) dFld;
                                    break;
                                case 75:
                                    f -= (float) dFld;
                                    break;
                                case 82:
                                    instanceCount += i7 ^ 20282;
                                    iFld -= -63;
                                    instanceCount = -61193L;
                                    this.sFld = (short) (this.sFld + ((short) 20282));
                                    f -= (float) dFld;
                                    break;
                                case 87:
                                    iArr = iArr;
                                    int[] iArr4 = iArr[i6 - 1];
                                    int i14 = i7 + 1;
                                    iArr4[i14] = iArr4[i14] & i5;
                                    break;
                                case 89:
                                    i5 += i7 - i8;
                                    break;
                            }
                        case 50:
                            int i15 = i6 - 1;
                            fArr[i15] = fArr[i15] + ((float) instanceCount);
                            break;
                        case 51:
                            instanceCount <<= i4;
                        case 52:
                            fArr[i6 + 1] = 20282;
                        case 53:
                            i3 -= i4;
                            break;
                        case 54:
                            iArr[i7][i7] = (int) instanceCount;
                        case 55:
                            instanceCount <<= i6;
                            break;
                        case 56:
                            i3 += i7 - i7;
                            break;
                    }
                    i7++;
                } while (i7 < 3);
                i6 += 2;
            } while (i6 < 201);
            i11++;
        }
        FuzzerUtils.out.println("i f i1 = " + i8 + "," + Float.floatToIntBits(f) + "," + i11);
        FuzzerUtils.out.println("i2 i3 i4 = " + i + "," + i2 + "," + 20282);
        FuzzerUtils.out.println("i24 i25 i26 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("b i27 i28 = " + (1 != 0) + "," + i6 + "," + i7);
        PrintStream printStream = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        FuzzerUtils.checkSum(iArr);
        printStream.println("fArr iArr = " + doubleToLongBits + "," + printStream);
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        short s2 = this.sFld;
        byte b = this.byFld;
        printStream2.println("Test.instanceCount sFld byFld = " + j + "," + printStream2 + "," + s2);
        PrintStream printStream3 = FuzzerUtils.out;
        long doubleToLongBits2 = Double.doubleToLongBits(dFld);
        int i16 = iFld;
        FuzzerUtils.checkSum(this.iArrFld);
        printStream3.println("Test.dFld Test.iFld iArrFld = " + doubleToLongBits2 + "," + printStream3 + "," + i16);
        FuzzerUtils.out.println("Test.iArrFld1 = " + FuzzerUtils.checkSum(iArrFld1));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
