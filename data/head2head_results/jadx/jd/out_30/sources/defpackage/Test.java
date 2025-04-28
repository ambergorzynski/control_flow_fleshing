

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_30/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_30/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public int iFld = -6;
    public short sFld = -20811;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long iMeth_check_sum;
    public static volatile long instanceCount = -7945161477086214461L;
    public static double dFld = 1.23809d;
    public static final int N = 400;
    public static volatile double[] dArrFld = new double[N];
    public static long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(dArrFld, 0.83052d);
        FuzzerUtils.init(lArrFld, 1746855379901599385L);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static int iMeth(int i, int i2, int i3) {
        double d;
        int i4 = -236;
        int i5 = -31139;
        int[] iArr = new int[N];
        float f = -65.226f;
        boolean z = true;
        boolean[] zArr = new boolean[N];
        short s = -9949;
        short[] sArr = new short[N];
        FuzzerUtils.init(zArr, true);
        FuzzerUtils.init(iArr, 3);
        FuzzerUtils.init(sArr, (short) -5388);
        double d2 = 7.0d;
        while (true) {
            d = d2;
            if (d >= 191.0d) {
                break;
            }
            dFld -= 109;
            i4 /= -31529;
            f += (float) d;
            z = z;
            i5 = 9;
            while (i5 > 1) {
                zArr[(int) d] = z;
                i3 += (int) f;
                int i6 = (int) (d + 1.0d);
                iArr[i6] = iArr[i6] + 12;
                i2 += i5 * i;
                s = (short) (s - ((short) i4));
                int i7 = i5 - 1;
                sArr[i7] = (short) (sArr[i7] - 13848);
                f = (f * (-64)) - 64;
                i5--;
            }
            try {
                iArr[(int) d] = (-1176967986) % i3;
                int i8 = 9002 % iArr[(int) d];
                i4 = i3 % iArr[(int) (d - 1.0d)];
            } catch (ArithmeticException e) {
            }
            d2 = d + 1.0d;
        }
        long doubleToLongBits = (((((((((i + i2) + i3) + Double.doubleToLongBits(d)) + i4) - 109) + Float.floatToIntBits(f)) + (z ? 1 : 0)) + i5) - 64) + s + FuzzerUtils.checkSum(zArr) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth1(int i) {
        int i2 = 0;
        int i3 = 10;
        int i4 = 57633;
        int i5 = 72;
        int[][][] iArr = new int[N][N][N];
        float f = 0.46f;
        short s = 16450;
        FuzzerUtils.init((Object[][]) iArr, (Object) (-1977));
        int i6 = 7;
        while (i6 < 380) {
            f = (iMeth(i, i, i) + i2) - 2.02893E9f;
            i2 = -117;
            if (0 != 0) {
                break;
            }
            instanceCount += ((i6 * i) + i3) - instanceCount;
            i2 = (-117) << 4425;
            i4 = 5;
            while (i4 > i6) {
                try {
                    iArr[i4 - 1][i6 + 1][i6] = iArr[i6 + 1][i4 - 1][i6] / (-2007784377);
                    i = i6 / (-61856);
                    i3 = iArr[i4 - 1][i4 + 1][i6 + 1] % i4;
                } catch (ArithmeticException e) {
                }
                i5 = 1;
                do {
                    i = i;
                    instanceCount -= 9;
                    instanceCount += f;
                    f = 193;
                    i5++;
                } while (i5 < 1);
                s = (short) (s + ((short) (i4 * i4)));
                i4 -= 2;
            }
            i6++;
        }
        vMeth1_check_sum += i + i6 + i2 + Float.floatToIntBits(f) + i3 + i4 + 193 + i5 + s + FuzzerUtils.checkSum((Object[][]) iArr);
    }

    public void vMeth(float f, int i, float f2) {
        int i2 = 13;
        int i3 = 12444;
        int i4 = 208;
        int[] iArr = new int[N];
        byte b = 115;
        short s = -8653;
        short[] sArr = new short[N];
        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(sArr, (short) -31520);
        vMeth1(i);
        int i5 = 6;
        while (i5 < 173) {
            f2 -= 9.0f;
            int i6 = i5;
            iArr[i6] = iArr[i6] - ((int) f);
            double[] dArr = dArrFld;
            int i7 = i5;
            dArr[i7] = dArr[i7] * i;
            i5++;
        }
        int i8 = 7;
        while (i8 < 215) {
            b = (byte) i8;
            i2 = 14;
            i3 = 1;
            while (i3 < 8) {
                i4 = 1;
                while (true) {
                    i4 += 3;
                    if (i4 < 2) {
                        s = (short) i5;
                        i = ((i - ((int) instanceCount)) ^ this.iFld) - ((int) dFld);
                        b = (byte) (b << ((byte) i4));
                    }
                }
                i3++;
            }
            i8++;
        }
        vMeth_check_sum += (((((((((Float.floatToIntBits(f) + i) + Float.floatToIntBits(f2)) + i5) + i2) + i8) + 52600) + b) + i3) - 4) + i4 + s + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr) {
        int i = 5;
        int i2 = -3;
        int i3 = 136;
        int i4 = 33843;
        int i5 = -136;
        short s = 128;
        int[] iArr = new int[N];
        float f = 127.649f;
        FuzzerUtils.init(iArr, 7);
        instanceCount *= -64559;
        int i6 = (((-64559) - 1) >>> 1) % N;
        int i7 = iArr[i6] - 1;
        iArr[i6] = i7;
        vMeth(127.649f, 28592, 127.649f);
        int i8 = ((-64559) & ((-64559) + i7)) - 1;
        int i9 = 3;
        while (i9 < 300) {
            i8 += i9;
            i9++;
        }
        long[] jArr = lArrFld;
        jArr[38] = jArr[38] + this.iFld;
        this.iFld -= this.iFld;
        dFld /= i9 | 1;
        if (0 != 0) {
            i2 = 1;
            while (true) {
                i2++;
                if (i2 >= 347) {
                    break;
                }
                i8 = ((int) instanceCount) - i;
                i3 = 3;
                while (i3 < 73) {
                    instanceCount <<= i9;
                    int i10 = i8;
                    i *= i3;
                    i5 = 1;
                    while (i5 < 4) {
                        i *= -2;
                        i5++;
                    }
                    i4 += i3 + this.iFld;
                    try {
                        iArr[i2] = (-30089) % i2;
                        iArr[i2] = (-149) % i9;
                        iArr[i2 + 1] = i % (-1273419455);
                    } catch (ArithmeticException e) {
                    }
                    s = this.sFld;
                    int i11 = i10 + i3;
                    i8 = ((int) instanceCount) + (-204) + (i3 * i3);
                    i3 += 3;
                }
                instanceCount = s;
            }
        }
        iArr[(s >>> 1) % N] = i3;
        int i12 = 12;
        while (i12 < 334) {
            f = (float) dFld;
            dFld *= i4;
            i12++;
        }
        FuzzerUtils.out.println("i f4 i22 = " + i8 + "," + Float.floatToIntBits(f) + "," + i9);
        FuzzerUtils.out.println("i23 i24 i25 = " + i + "," + i2 + "," + i3);
        FuzzerUtils.out.println("i26 i27 i28 = " + i4 + "," + i5 + "," + s);
        FuzzerUtils.out.println("b2 i29 i30 = " + (0 != 0) + "," + i12 + "," + 12);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        int i13 = this.iFld;
        printStream.println("Test.instanceCount Test.dFld iFld = " + j + "," + printStream + "," + doubleToLongBits);
        PrintStream printStream2 = FuzzerUtils.out;
        short s2 = this.sFld;
        long doubleToLongBits2 = Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld));
        FuzzerUtils.checkSum(lArrFld);
        printStream2.println("sFld Test.dArrFld Test.lArrFld = " + s2 + "," + doubleToLongBits2 + "," + printStream2);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
