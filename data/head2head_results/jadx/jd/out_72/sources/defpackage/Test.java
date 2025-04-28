

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_72/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_72/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public float fFld = 37.35f;
    public float[] fArrFld = new float[N];
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long lMeth_check_sum;
    public static long instanceCount = 20069;
    public static double dFld = 2.96271d;
    public static boolean bFld = true;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, -12);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
    }

    public static long lMeth() {
        int i = -218;
        int i2 = -53;
        int i3 = 101;
        int i4 = -5967;
        int i5 = -5018;
        byte[] bArr = new byte[N];
        float f = 27.1018f;
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, -15.84402d);
        FuzzerUtils.init(bArr, (byte) -117);
        int i6 = ((-218) >>> 1) % N;
        dArr[i6] = dArr[i6] * (-218);
        bArr[((-218) >>> 1) % N] = 4;
        float f2 = 8.0f;
        while (true) {
            float f3 = f2;
            if (f3 < 249.0f) {
                instanceCount <<= i;
                i3 = 1;
                while (i3 < 13) {
                    f -= 59041.0f;
                    int i7 = i4 >> 1839932890;
                    int i8 = i3;
                    bArr[i8] = (byte) (bArr[i8] + ((byte) i2));
                    i5 = i3;
                    while (i5 < 2) {
                        i2 = 1 - 3;
                        i5++;
                    }
                    try {
                        iArrFld[i3] = i5 / 187200594;
                        i = i7 / i7;
                        i2 = iArrFld[(int) f3] / i;
                    } catch (ArithmeticException e) {
                    }
                    instanceCount += i3 ^ i;
                    i4 = -7685;
                    i3++;
                }
                f2 = f3 + 2.0f;
            } else {
                long floatToIntBits = ((((((((i + 4) + Float.floatToIntBits(f3)) + i2) + i3) + i4) + Float.floatToIntBits(f)) + i5) - 242) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(bArr);
                lMeth_check_sum += floatToIntBits;
                return floatToIntBits;
            }
        }
    }

    public static void vMeth(long j, float f) {
        int i = 4;
        int i2 = -9333;
        int i3 = 1590;
        int i4 = 21;
        int i5 = -5;
        boolean z = true;
        int i6 = (int) (2 + 59);
        long lMeth = j * (((float) (j + 249)) + (((float) lMeth()) - 107.188f));
        int i7 = 2;
        while (i7 < 205) {
            i2 = i7;
            while (8 > i2) {
                i3 = i;
                i4 = 1;
                while (i4 > 1) {
                    int[] iArr = iArrFld;
                    int i8 = i2;
                    iArr[i8] = iArr[i8] + ((int) (-2.127976d));
                    i6 >>= i6;
                    i += ((i4 * i7) + 2) - 14965;
                    z = z;
                    i4--;
                }
                i = i3 + i2;
                i2++;
            }
            i5 = 8;
            while (1 < i5) {
                i = 27131;
                lMeth -= f;
                i5--;
            }
            i7++;
        }
        vMeth_check_sum += lMeth + Float.floatToIntBits(f) + i6 + i7 + i + i2 + i3 + i4 + 2 + Double.doubleToLongBits(-2.127976d) + 14965 + (z ? 1 : 0) + i5 + 24025;
    }

    public static void vSmallMeth(int i) {
        vMeth(9L, 58.466f);
        vSmallMeth_check_sum += (-59) - 59;
    }

    public void mainTest(String[] strArr) {
        int i = -14;
        int i2 = 246;
        int i3 = 84;
        int i4 = -5;
        int i5 = -246;
        int i6 = -8;
        int i7 = 27414;
        int i8 = 25;
        for (int i9 = 0; i9 < 340; i9++) {
            vSmallMeth(62569);
        }
        float[] fArr = this.fArrFld;
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f = fArr[i10];
            i = 2;
            while (63 > i) {
                i2 = 1021;
                try {
                    int i11 = (40333 / iArrFld[i]) % (-1676347533);
                    i2 = (-43865) / i;
                } catch (ArithmeticException e) {
                }
                instanceCount += ((i * i2) + instanceCount) - i2;
                i3 = 1;
                while (i3 < 2) {
                    int i12 = i4 - i2;
                    f -= 4.2775524E9f;
                    i4 = -13998;
                    instanceCount *= (long) dFld;
                    switch ((i3 % 1) + 24) {
                        case 24:
                        default:
                            instanceCount /= 152;
                            i3++;
                    }
                }
                i++;
            }
            i5 = 2;
            while (i5 < 63) {
                i4 += i5;
                f += (float) dFld;
                i2 *= -8;
                instanceCount = -8;
                i5 += 2;
            }
            instanceCount = i3;
        }
        int i13 = i2 ^ 153;
        int i14 = 374;
        while (1 < i14) {
            if (bFld) {
                switch ((((i >>> 1) % 2) * 5) + 89) {
                    case 93:
                    case 95:
                        i4 = i;
                        i6 = ((int) (i6 + (i14 | this.fFld))) + i5;
                        instanceCount = instanceCount;
                        break;
                    default:
                        i7 = 2;
                        while (i7 < 68) {
                            i8 += (int) this.fFld;
                            i13 += i7;
                            i7++;
                        }
                        break;
                }
            } else {
                int[] iArr = iArrFld;
                int i15 = i14 + 1;
                iArr[i15] = iArr[i15] - 75;
            }
            i14--;
        }
        FuzzerUtils.out.println("i17 i18 i19 = " + i + "," + i13 + "," + i3);
        FuzzerUtils.out.println("i20 i21 i22 = " + i4 + "," + i5 + "," + i6);
        FuzzerUtils.out.println("i24 i25 i26 = " + i14 + "," + 6 + "," + i7);
        FuzzerUtils.out.println("i27 by2 = " + i8 + "," + 75);
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        Float.floatToIntBits(this.fFld);
        printStream.println("Test.instanceCount Test.dFld fFld = " + j + "," + printStream + "," + doubleToLongBits);
        PrintStream printStream2 = FuzzerUtils.out;
        boolean z = bFld;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld));
        printStream2.println("Test.bFld Test.iArrFld fArrFld = " + z + "," + checkSum + "," + printStream2);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
