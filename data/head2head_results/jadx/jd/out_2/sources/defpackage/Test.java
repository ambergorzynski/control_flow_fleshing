

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_2/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_2/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 7;
    public static short sFld = -25338;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {
        int i = 0;
        int[] iArr = new int[N];
        int[] iArr2 = new int[N];
        FuzzerUtils.init(iArr, 218);
        FuzzerUtils.init(iArr2, 7);
        int i2 = 2 * ((int) instanceCount);
        int i3 = 15;
        while (i3 < 245) {
            int i4 = i3;
            try {
                int i5 = i2 / (-1495179385);
                iArr[i3 + 1] = 9 / i4;
                i2 = iArr2[i3] / 53150;
            } catch (ArithmeticException e) {
            }
            i2 *= i4;
            i = i4 * (-475873698);
            instanceCount = i2;
            iArr[i3 - 1] = 4988;
            i3++;
        }
        int i6 = i2 - 4988;
        float f = 0.332f / (i | 1);
        int i7 = (i3 >>> 1) % N;
        iArr[i7] = iArr[i7] + 3;
        vMeth1_check_sum += (((1 != 0 ? 1 : 0) + i6) - 61) + i3 + i + 4988 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth(int i, double d, long j) {
        int i2 = 29325;
        int i3 = 16198;
        int i4 = 3;
        int i5 = -3;
        float f = 0.184f;
        int i6 = i - 1;
        long j2 = i6;
        int i7 = i6 - 1;
        int i8 = (int) (j2 - ((j - 3) - i6));
        vMeth1();
        int i9 = 1;
        while (true) {
            i9++;
            if (i9 >= 266) {
                break;
            }
            f = (f + f) * i8;
        }
        int i10 = i8 >>> i9;
        sFld = (short) i9;
        int i11 = ((int) j) + ((int) j);
        int i12 = 6;
        while (i12 < 202) {
            i3 = 1;
            while (i3 < 8) {
                i2 >>= i3;
                i5 = 1;
                while (true) {
                    i5++;
                    if (i5 < 2) {
                        i4 = (i4 + ((int) j)) - 20677;
                    }
                }
                i3++;
            }
            i12++;
        }
        long doubleToLongBits = i11 + Double.doubleToLongBits(d) + j + i9 + Float.floatToIntBits(f) + i12 + i2 + i3 + i4 + i5;
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth() {
        int i = -1740;
        int i2 = -55568;
        int i3 = -7;
        int i4 = -37367;
        int[] iArr = new int[N];
        float f = -8.221f;
        FuzzerUtils.init(iArr, 151);
        int i5 = ((-14) >>> 1) % N;
        int i6 = iArr[i5] - 1;
        iArr[i5] = i6;
        long j = instanceCount - 1;
        instanceCount = j;
        int iMeth = ((-14) - i6) + ((int) ((35.768f * 27291) + ((float) j) + iMeth(r0, 98.84318d, instanceCount)));
        int i7 = 10;
        while (i7 < 212) {
            i = (int) instanceCount;
            i2 = i7;
            while (i2 < 8) {
                f = i;
                i3 = 1;
                while (i3 > 1) {
                    instanceCount += i3 + instanceCount;
                    i = i2;
                    i4 -= i7;
                    i3 -= 2;
                }
                i2 += 2;
            }
            int i8 = i7;
            iArr[i8] = iArr[i8] + i4;
            instanceCount += i7;
            i7++;
        }
        iArr[(i >>> 1) % N] = i;
        vMeth_check_sum += ((((((iMeth + 27291) + Double.doubleToLongBits(98.84318d)) + i7) + i) + i2) - 211) + Float.floatToIntBits(f) + i3 + (i4 - i4) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        int i = 2;
        int i2 = 5;
        int i3 = 167;
        int i4 = -35040;
        int i5 = 6;
        int i6 = -71;
        int[] iArr = new int[N];
        double d = 0.74122d;
        float f = -113.901f;
        FuzzerUtils.init(iArr, 0);
        vMeth();
        int i7 = 10;
        while (i7 < 175) {
            if (1 == 0) {
                sFld = (short) (sFld - ((short) 0.74122d));
                instanceCount += i7;
            } else {
                i += i;
            }
            i7++;
        }
        instanceCount -= i;
        int i8 = (i * ((int) instanceCount)) >> sFld;
        int i9 = 10;
        while (i9 < 244) {
            instanceCount = i8;
            i3 = 107;
            while (i3 > i9) {
                i4 = 1;
                while (true) {
                    i4++;
                    if (i4 >= 1) {
                        break;
                    }
                    i8 = -56703;
                    f += i4 * (-56703);
                }
                d = -194.0d;
                i2 = 12;
                i5 = 1;
                while (i5 < 1) {
                    d = i5;
                    int i10 = 2 + 10;
                    i2 = ((int) f) * i7;
                    int i11 = i3;
                    iArr[i11] = iArr[i11] + i3;
                    i6 = i8;
                    i5++;
                }
                i3--;
            }
            i9++;
        }
        FuzzerUtils.out.println("i18 i19 b1 = " + i7 + "," + i8 + "," + (1 != 0));
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("d2 i20 i21 = " + Double.doubleToLongBits(d) + "," + printStream + "," + i9);
        FuzzerUtils.out.println("i22 i23 i24 = " + i3 + "," + 10 + "," + i4);
        FuzzerUtils.out.println("f3 i25 i26 = " + Float.floatToIntBits(f) + "," + i5 + "," + i6);
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr));
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        short s = sFld;
        printStream2.println("Test.instanceCount Test.sFld = " + j + "," + printStream2);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
