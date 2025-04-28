

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_27/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_27/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vSmallMeth_check_sum;
    public static long fMeth_check_sum;
    public static long vMeth_check_sum;
    public static long instanceCount = -15253;
    public static float fFld = -119.292f;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, -184);
        vSmallMeth_check_sum = 0L;
        fMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0052. Please report as an issue. */
    public static void vMeth() {
        int i = -222;
        int i2 = -3;
        int i3 = 3973;
        double d = 1.15395d;
        short s = 7729;
        float f = -1.253f;
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, -113.179f);
        int i4 = 3;
        while (214 > i4) {
            int i5 = (i - 2) + i4;
            instanceCount <<= 42505;
            i = 6 + i4;
            switch (((i4 % 9) * 5) + 46) {
                case 48:
                    s = (short) i4;
                    i4++;
                case 53:
                    instanceCount += i4;
                    i3 = i4;
                    i4++;
                case 54:
                    i2 = 1;
                    do {
                        int i6 = i - ((int) d);
                        i = i6 / (i6 | 1);
                        if (i2 != 0) {
                            vMeth_check_sum += i4 + i + i2 + Double.doubleToLongBits(d) + s + i3 + Float.floatToIntBits(f) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                            return;
                        }
                        d *= 233.0d;
                        int i7 = i4 + 1;
                        fArr[i7] = fArr[i7] + i;
                        if (i4 != 0) {
                            vMeth_check_sum += i4 + i + i2 + Double.doubleToLongBits(d) + s + i3 + Float.floatToIntBits(f) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                            return;
                        }
                        i2++;
                    } while (i2 < 8);
                    s = (short) i4;
                    i4++;
                case 56:
                    iArrFld[i4] = 60555;
                    i4++;
                case 67:
                    i3 += i4 + i3;
                    f += (float) (((i4 * instanceCount) + i) - i3);
                    i4++;
                case 69:
                    i3 = (int) instanceCount;
                    int[] iArr = iArrFld;
                    int i8 = i4 - 1;
                    iArr[i8] = iArr[i8] >> ((int) instanceCount);
                    i4++;
                case 78:
                    i3 = i4;
                    i4++;
                case 84:
                    f += (float) (((i4 * instanceCount) + i) - i3);
                    i4++;
                case 88:
                    s = (short) i4;
                    i4++;
                default:
                    int[] iArr2 = iArrFld;
                    int i82 = i4 - 1;
                    iArr2[i82] = iArr2[i82] >> ((int) instanceCount);
                    i4++;
            }
        }
        vMeth_check_sum += i4 + i + i2 + Double.doubleToLongBits(d) + s + i3 + Float.floatToIntBits(f) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static float fMeth(int i, long j) {
        int i2 = -1;
        int i3 = -8;
        int i4 = -38;
        int i5 = -186;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 4670220663119571140L);
        int i6 = 9;
        while (338 > i6) {
            vMeth();
            i2 = i;
            i3 = 1;
            do {
                i += i3 + i6;
                i2 += i;
                j = i6;
                if (i2 != 0) {
                }
                i3 += 2;
            } while (i3 < 5);
            i >>= (int) instanceCount;
            i4 = 1;
            while (i4 < 5) {
                i5 += i4;
                i4++;
            }
            i5 += i6 * i6;
            i6++;
        }
        int i7 = 205;
        while (i7 > 11) {
            int i8 = i7 + 1;
            jArr[i8] = jArr[i8] + j;
            if (5413 != 0) {
            }
            i7--;
        }
        long checkSum = i + j + i6 + i2 + i3 + i4 + i5 + i7 + 5413 + FuzzerUtils.checkSum(jArr);
        fMeth_check_sum += checkSum;
        return (float) checkSum;
    }

    public static void vSmallMeth(double d, int i) {
        instanceCount *= fMeth(68, instanceCount) - i;
        vSmallMeth_check_sum += Double.doubleToLongBits(d) + i;
    }

    public void mainTest(String[] strArr) {
        double[] dArr = new double[N];
        int i = -11;
        int i2 = -126;
        int i3 = -98;
        int i4 = 33135;
        int i5 = -9;
        byte b = -58;
        FuzzerUtils.init(dArr, 1.74877d);
        for (int i6 = 0; i6 < 563; i6++) {
            vSmallMeth(-2.42223d, -13);
        }
        int i7 = 9;
        while (i7 < 170) {
            i = (int) instanceCount;
            i2 = 1;
            while (true) {
                i2++;
                if (i2 < 156) {
                    int i8 = i >> i3;
                    i = 254;
                    instanceCount >>= 116;
                    fFld = 254;
                    i4 = 1;
                    while (i4 < 1) {
                        switch (((i2 >>> 1) % 2) + 98) {
                            case 98:
                                i3 += i4 * i4;
                                switch ((i2 % 7) + 90) {
                                    case 90:
                                        switch (((i7 % 5) * 5) + 68) {
                                            case 70:
                                                int[] iArr = iArrFld;
                                                int i9 = i7;
                                                iArr[i9] = iArr[i9] * i5;
                                                break;
                                            case 72:
                                                instanceCount = i2;
                                                break;
                                            case 81:
                                                int i10 = i5 - 87;
                                                instanceCount = instanceCount;
                                                break;
                                            case 86:
                                                fFld -= i2;
                                                fFld = i2;
                                                i = i5;
                                                break;
                                            case 88:
                                                i <<= i4;
                                                int[] iArr2 = iArrFld;
                                                iArr2[i2] = iArr2[i2] - (-29);
                                                i3 = (int) (42 + (i4 | fFld));
                                                break;
                                            default:
                                                b = (byte) (b % ((byte) (i2 | 1)));
                                                int i11 = i5 + (((i4 * i4) + 42) - 42);
                                                break;
                                        }
                                        iArrFld[i7] = (int) instanceCount;
                                        i5 = (int) (-2.42223d);
                                        break;
                                    case 91:
                                        i3 += (int) (-2.42223d);
                                        break;
                                    case 92:
                                        break;
                                    case 93:
                                        fFld += (-38268) + (i4 * i4);
                                    case 94:
                                        instanceCount = ((float) instanceCount) + (((float) ((i4 * instanceCount) + i3)) - fFld);
                                        break;
                                    case 95:
                                        int[] iArr3 = iArrFld;
                                        int i12 = i4;
                                        iArr3[i12] = iArr3[i12] ^ i;
                                        break;
                                    case 96:
                                        instanceCount = -25362L;
                                        break;
                                    default:
                                        i += i7;
                                        break;
                                }
                            case 99:
                                i3 += 63605;
                                break;
                            default:
                                int i13 = i2 - 1;
                                dArr[i13] = dArr[i13] * instanceCount;
                                break;
                        }
                        i4++;
                    }
                }
            }
            i7++;
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("d2 i13 i14 = " + Double.doubleToLongBits(-2.42223d) + "," + printStream + "," + i7);
        FuzzerUtils.out.println("i16 i17 i18 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i19 by dArr = " + i5 + "," + b + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        int floatToIntBits = Float.floatToIntBits(fFld);
        FuzzerUtils.checkSum(iArrFld);
        printStream2.println("Test.instanceCount Test.fFld Test.iArrFld = " + j + "," + printStream2 + "," + floatToIntBits);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
