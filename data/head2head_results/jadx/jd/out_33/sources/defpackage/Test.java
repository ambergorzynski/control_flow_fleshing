

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_33/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_33/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public int iFld = 14;
    public byte byFld = 33;
    public float fFld = 2.696f;
    public static long bMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static volatile long instanceCount = -248;
    public static boolean bFld = false;
    public static double dFld = 52.91308d;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static double[][] dArrFld = new double[N][N];

    static {
        FuzzerUtils.init(iArrFld, -77);
        FuzzerUtils.init(dArrFld, -1.6862d);
        bMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }

    public static void vMeth1(int i, int i2) {
        int i3 = 192;
        int i4 = 185;
        int i5 = 64559;
        int i6 = -9;
        int i7 = -13;
        int i8 = 28487;
        double d = 3.0d;
        while (true) {
            double d2 = d;
            if (194.0d <= d2) {
                vMeth1_check_sum += ((((i + i2) + Double.doubleToLongBits(d2)) + i3) - 4) + i4 + i5 + i6 + i7 + i8;
                return;
            }
            i2 = -4;
            i += (int) (d2 * d2);
            i4 = 1;
            while (i4 < 8) {
                i6 = 1;
                while (2 > i6) {
                    try {
                        i = i5 % (-762226749);
                        iArrFld[i6 - 1] = 132 / i6;
                        i5 = i7 % 1287395606;
                    } catch (ArithmeticException e) {
                    }
                    instanceCount <<= -4;
                    i6++;
                }
                instanceCount += 0.65f;
                float f = 0.65f + i6;
                i8 = 1;
                while (true) {
                    i8++;
                    if (i8 < 2) {
                        i3 = i4;
                        i += i8;
                        instanceCount += i8 - i;
                        i7 = i8;
                        bFld = true;
                    }
                }
                i4++;
            }
            d = d2 + 1.0d;
        }
    }

    public static void vMeth() {
        int i = -190;
        int i2 = -142;
        int i3 = 7218;
        int i4 = -42753;
        double d = 120.1274d;
        long j = instanceCount;
        int[] iArr = iArrFld;
        int i5 = (50 >>> 1) % N;
        int i6 = iArr[i5];
        iArr[i5] = i6 - 1;
        instanceCount = j - i6;
        vMeth1(50, -96);
        int i7 = 50 >>> 582592610;
        int i8 = 1;
        while (true) {
            i8 += 2;
            if (i8 >= 197 || bFld) {
                break;
            }
            d -= d;
            i = 1;
            while (i < 16) {
                i2 = i8;
                while (i2 < 2) {
                    instanceCount = i3;
                    i4 += i2 * i2;
                    i2++;
                }
                i3 = i;
                int[] iArr2 = iArrFld;
                iArr2[i8] = iArr2[i8] - i;
                double[] dArr = dArrFld[i8];
                int i9 = i;
                dArr[i9] = dArr[i9] + 6;
                i++;
            }
        }
        vMeth_check_sum += 65 + i8 + Double.doubleToLongBits(d) + i + 6 + i2 + i3 + i4;
    }

    public static boolean bMeth(boolean z, byte b) {
        int i = -11;
        double d = -57.123535d;
        int i2 = 20;
        while (i2 < 344) {
            instanceCount += i2 * i2;
            vMeth();
            if (z) {
                instanceCount += i2 * i2;
                if (i2 != 0) {
                    return ((int) ((((((long) ((((z ? (byte) 1 : (byte) 0) + b) + i2) + i)) + Double.doubleToLongBits(d)) + ((long) 5330)) + ((long) (-8))) + ((long) (-32435)))) % 2 > 0;
                }
                i += i2 - i;
                d -= 5330;
            } else if (bFld) {
                int[] iArr = iArrFld;
                int i3 = i2 + 1;
                iArr[i3] = iArr[i3] * 4580;
            }
            instanceCount += 12 + (i2 * i2);
            i2++;
        }
        long doubleToLongBits = (((((((z ? (byte) 1 : (byte) 0) + b) + i2) + i) + Double.doubleToLongBits(d)) + 5330) - 8) - 32435;
        bMeth_check_sum += doubleToLongBits;
        return doubleToLongBits % 2 > 0;
    }

    public void mainTest(String[] strArr) {
        int i = -173;
        int i2 = -31;
        int i3 = -163;
        int i4 = 14;
        int i5 = -12;
        int i6 = -11;
        int i7 = -19223;
        int i8 = -3;
        long j = 0;
        double d = 0.17361d;
        this.iFld = this.iFld;
        bFld = bMeth(bFld, this.byFld);
        int i9 = 6;
        while (i9 < 130) {
            i = 84;
            i2 = 8;
            while (i2 < 202) {
                long j2 = 1;
                while (true) {
                    j = j2;
                    if (j < 2) {
                        switch (((i2 % 2) * 5) + 104) {
                            case 107:
                            case 111:
                                i5 >>>= -62115;
                                int[] iArr = iArrFld;
                                int i10 = i2;
                                iArr[i10] = iArr[i10] << i5;
                                i3 += i9;
                                break;
                        }
                        iArrFld[i9] = 146;
                        this.fFld -= (float) instanceCount;
                        j2 = j + 1;
                    }
                }
                i4 = i3;
                i2++;
            }
            i4 = (i4 * ((int) dFld)) >> (-61);
            i9++;
        }
        instanceCount >>= i;
        this.fFld -= i4;
        this.iFld = i5;
        int i11 = 16;
        while (i11 < 321) {
            try {
                i6 = 99 % i9;
                i3 = iArrFld[i11 - 1] / (-37528);
                i %= 90;
            } catch (ArithmeticException e) {
            }
            int[] iArr2 = iArrFld;
            int i12 = i11 - 1;
            iArr2[i12] = iArr2[i12] - i11;
            i11 += 2;
        }
        iArrFld[(i6 >>> 1) % N] = i4;
        switch ((((i2 >>> 1) % 8) * 5) + 46) {
            case 52:
                i6 |= (int) instanceCount;
                break;
            case 57:
                i5 -= i3;
                break;
            case 71:
                i7 = 1;
                do {
                    this.fFld += i3;
                    i7++;
                } while (i7 < 272);
                i5 <<= i2;
                double d2 = 1.0d;
                while (true) {
                    d = d2;
                    if (d >= 148.0d) {
                        break;
                    } else {
                        this.fFld = -106.0f;
                        this.iFld -= -159;
                        d2 = d + 1.0d;
                    }
                }
            case 73:
                instanceCount *= this.byFld;
                break;
            case 76:
                iArrFld[(i5 >>> 1) % N] = this.iFld;
                break;
            case 81:
                this.byFld = (byte) i6;
                break;
            case 82:
                i8 = (-3) - i2;
                break;
            case 85:
                i5 *= 2;
                break;
        }
        FuzzerUtils.out.println("i19 i20 i21 = " + i9 + "," + i + "," + i2);
        FuzzerUtils.out.println("i22 i23 l = " + i3 + "," + i4 + "," + j);
        FuzzerUtils.out.println("i24 i25 i26 = " + i5 + "," + i11 + "," + i6);
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i27 d3 i28 = " + i7 + "," + Double.doubleToLongBits(d) + "," + printStream);
        PrintStream printStream2 = FuzzerUtils.out;
        long j3 = instanceCount;
        int i13 = this.iFld;
        if (bFld) {
        }
        printStream2.println("Test.instanceCount iFld Test.bFld = " + j3 + "," + printStream2 + "," + i13);
        FuzzerUtils.out.println("byFld fFld Test.dFld = " + this.byFld + "," + Float.floatToIntBits(this.fFld) + "," + Double.doubleToLongBits(dFld));
        PrintStream printStream3 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld));
        printStream3.println("Test.iArrFld Test.dArrFld = " + checkSum + "," + printStream3);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
