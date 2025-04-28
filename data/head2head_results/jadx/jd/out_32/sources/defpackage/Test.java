

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_32/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_32/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long instanceCount = 12;
    public static float fFld = 59.163f;
    public static int iFld = -3333;
    public static int iFld1 = 144;
    public static final int N = 400;
    public static float[] fArrFld = new float[N];
    public static volatile double[] dArrFld = new double[N];

    static {
        FuzzerUtils.init(fArrFld, 5.732f);
        FuzzerUtils.init(dArrFld, 109.56779d);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static int iMeth(int i) {
        int i2 = -49804;
        int i3 = -21783;
        int[] iArr = new int[N];
        long[][][] jArr = new long[N][N][N];
        FuzzerUtils.init((Object[][]) jArr, (Object) 91L);
        FuzzerUtils.init(iArr, -2);
        int i4 = 7;
        while (123 > i4) {
            i2 = (int) fFld;
            i3 = 13;
            do {
                i2 -= 225;
                i -= 991961511;
                instanceCount = i3;
                switch ((i4 % 8) + 27) {
                    case 27:
                    case 28:
                        i += i3 * i3;
                        jArr[i3 - 1][i3 + 1][i3 + 1] = i3;
                        break;
                    case 29:
                        i2 *= 3;
                        i += ((i3 * i3) + i2) - i2;
                        break;
                    case 30:
                        int i5 = i3;
                        iArr[i5] = iArr[i5] + 208;
                        float[] fArr = fArrFld;
                        int i6 = i3;
                        fArr[i6] = fArr[i6] + ((float) 56.59635d);
                        break;
                    case 31:
                    case 32:
                        if (i4 != 0) {
                        }
                    case 33:
                        instanceCount >>= -14748;
                        break;
                    case 34:
                        fFld -= (float) instanceCount;
                        break;
                    default:
                        iArr[i3 - 1] = -14701;
                        break;
                }
                i3--;
            } while (i3 > 0);
            i4++;
        }
        long doubleToLongBits = ((((((i + i4) + i2) + i3) + Double.doubleToLongBits(56.59635d)) - 14748) - 14701) + FuzzerUtils.checkSum((Object[][]) jArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth(int i) {
        int i2 = -8;
        int[] iArr = new int[N];
        short s = 32524;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -2634646219810193193L);
        FuzzerUtils.init(iArr, -23390);
        int i3 = 376;
        while (13 < i3) {
            switch ((((((int) (i3 * fFld)) >>> 1) % 5) * 5) + 34) {
                case 50:
                    break;
                case 51:
                    i = s - ((int) instanceCount);
                    continue;
                case 52:
                    switch (((i3 % 2) * 5) + 59) {
                        case 63:
                            fFld -= (float) instanceCount;
                            continue;
                        case 67:
                            instanceCount -= instanceCount;
                            s = (short) instanceCount;
                            break;
                    }
                case 53:
                case 54:
                case 55:
                case 57:
                case 58:
                default:
                    fFld = fFld;
                    continue;
                case 56:
                    i2 += (int) instanceCount;
                    continue;
                case 59:
                    int i4 = i3;
                    long j = jArr[i4];
                    instanceCount = i4;
                    jArr[i4] = j << ((int) (((long) (i - (-74.109155d))) - (i3 + (151 * ((-129) - i2)))));
                    float[] fArr = fArrFld;
                    int i5 = i3 - 1;
                    float f = fArr[i5];
                    fArr[i5] = f + 1.0f;
                    i = (int) ((f - ((float) (instanceCount - 13))) + iMeth(i2));
                    fFld = 58.0f;
                    instanceCount = i2;
                    break;
            }
            instanceCount = -22813L;
            i -= i2;
            i3--;
        }
        vMeth_check_sum += i + i3 + i2 + s + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth(long j, float f) {
        vMeth(-64926);
        iFld *= iFld;
        vSmallMeth_check_sum += j + Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr) {
        int i = -52858;
        int i2 = -57651;
        int i3 = 36401;
        int i4 = 62932;
        int i5 = 0;
        int[] iArr = new int[N];
        long j = 3307735646808791403L;
        long[] jArr = new long[N];
        short s = -29675;
        boolean z = false;
        double d = 0.45279d;
        FuzzerUtils.init(iArr, 7);
        FuzzerUtils.init(jArr, -2456531478691009509L);
        int i6 = 20 / (20 | 1);
        for (int i7 = 0; i7 < 401; i7++) {
            vSmallMeth(instanceCount, fFld);
        }
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = iArr[i8];
            j = iFld;
            i6 = i9;
            byte b = (byte) i9;
            try {
                iFld = iArr[(i6 >>> 1) % N] / iArr[(i9 >>> 1) % N];
                iArr[(iFld1 >>> 1) % N] = i9 / 762361316;
                iFld1 = (-154) / iArr[(i9 >>> 1) % N];
            } catch (ArithmeticException e) {
            }
            switch (((i6 >>> 1) % 2) + 106) {
                case 106:
                    i = i6;
                    break;
                case 107:
                    i2 = 1;
                    while (i2 < 63) {
                        i4 = 1;
                        while (i4 < 2) {
                            double[] dArr = dArrFld;
                            int i10 = i2;
                            dArr[i10] = dArr[i10] + s;
                            switch ((((i4 >>> 1) % 2) * 5) + 52) {
                                case 54:
                                    try {
                                        iFld1 = i / (-142);
                                        i = 128 / i3;
                                        i3 = iArr[i4 + 1] / 1995789820;
                                    } catch (ArithmeticException e2) {
                                    }
                                    s = (short) (s << 95);
                                    instanceCount = fFld;
                                    switch ((i4 % 8) + 29) {
                                        case 29:
                                            b = (byte) (b + ((byte) (i4 ^ iFld)));
                                            break;
                                        case 30:
                                            switch (((iFld1 >>> 1) % 7) + 113) {
                                                case 113:
                                                    z = z;
                                                    i9 -= s;
                                                    switch ((i2 % 9) + 42) {
                                                        case 42:
                                                            iArr[i2 - 1] = (int) instanceCount;
                                                            iFld1 = i9;
                                                            switch (((i4 % 7) * 5) + 98) {
                                                                case 100:
                                                                    j -= i2;
                                                                    i5 |= (int) instanceCount;
                                                                case 117:
                                                                    jArr[i4 - 1] = i3;
                                                                case 121:
                                                                    iFld1 &= (int) j;
                                                                case 119:
                                                                    d *= j;
                                                                case 125:
                                                                    d = i6;
                                                                case 128:
                                                                    b = (byte) (b ^ ((byte) iFld));
                                                                case 129:
                                                                    i3 += i4 | i5;
                                                                default:
                                                                    j *= iFld;
                                                            }
                                                        case 43:
                                                            iFld += i4;
                                                        case 44:
                                                        case 45:
                                                            i5 -= (int) d;
                                                        case 46:
                                                            i += iFld1;
                                                        case 47:
                                                            iArr = iArr;
                                                        case 48:
                                                            i6 -= 63922;
                                                        case 49:
                                                            i *= -3;
                                                        case 50:
                                                            fFld -= fFld;
                                                    }
                                                case 114:
                                                    instanceCount >>= 9;
                                                case 115:
                                                    iFld1 += i4;
                                                case 116:
                                                    i ^= iFld1;
                                                case 117:
                                                    iFld = (int) d;
                                                case 118:
                                                    instanceCount += ((i4 * i9) + i5) - instanceCount;
                                                case 119:
                                                    double[] dArr2 = dArrFld;
                                                    int i11 = i2 + 1;
                                                    dArr2[i11] = dArr2[i11] * 97.7101d;
                                                default:
                                                    b = (byte) (b * ((byte) i4));
                                            }
                                        case 31:
                                            try {
                                                i5 = 59435 / iFld1;
                                                i = iArr[i4] % (-24191);
                                                iArr[i4 + 1] = iFld1 / iArr[i4];
                                                break;
                                            } catch (ArithmeticException e3) {
                                                break;
                                            }
                                        case 32:
                                            fFld = (float) instanceCount;
                                            break;
                                        case 33:
                                            j += (-13) + (i4 * i4);
                                            break;
                                        case 34:
                                            i5 = (int) (i5 + (((i4 * fFld) + 11) - i4));
                                            break;
                                        case 35:
                                            i6 = (int) (i6 + (((i4 * iFld) + i5) - fFld));
                                            break;
                                        case 36:
                                            i = 0;
                                        default:
                                            i <<= -5;
                                            break;
                                    }
                                case 57:
                                    fFld += ((float) ((i4 * j) + i5)) - fFld;
                                    break;
                            }
                            i4++;
                        }
                        i2++;
                    }
                    break;
            }
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i l1 i11 = " + i6 + "," + j + "," + printStream);
        FuzzerUtils.out.println("i12 i13 i14 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i15 s2 b = " + i5 + "," + s + "," + (z));
        PrintStream printStream2 = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(d);
        FuzzerUtils.checkSum(iArr);
        printStream2.println("d2 i16 iArr2 = " + doubleToLongBits + "," + printStream2 + "," + 11);
        FuzzerUtils.out.println("lArr2 = " + FuzzerUtils.checkSum(jArr));
        PrintStream printStream3 = FuzzerUtils.out;
        long j2 = instanceCount;
        int floatToIntBits = Float.floatToIntBits(fFld);
        int i12 = iFld;
        printStream3.println("Test.instanceCount Test.fFld Test.iFld = " + j2 + "," + printStream3 + "," + floatToIntBits);
        PrintStream printStream4 = FuzzerUtils.out;
        int i13 = iFld1;
        long doubleToLongBits2 = Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld));
        Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld));
        printStream4.println("Test.iFld1 Test.fArrFld Test.dArrFld = " + i13 + "," + doubleToLongBits2 + "," + printStream4);
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
