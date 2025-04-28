

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_48/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_48/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public volatile double dFld = 68.47631d;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long iMeth_check_sum;
    public static long fMeth_check_sum;
    public static long instanceCount = 3252565105746521324L;
    public static volatile byte byFld = 68;
    public static short sFld = 8656;
    public static final int N = 400;
    public static double[] dArrFld = new double[N];
    public static int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(dArrFld, 113.2054d);
        FuzzerUtils.init(iArrFld, 59574);
        FuzzerUtils.init(lArrFld, 8258553528917043290L);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        iMeth_check_sum = 0L;
        fMeth_check_sum = 0L;
    }

    public static void vMeth1() {
        int i;
        int i2;
        int i3 = 17;
        int i4 = -19613;
        int[] iArr = new int[N];
        boolean z = true;
        double d = 90.53936d;
        FuzzerUtils.init(iArr, -22);
        int i5 = 1;
        do {
            i = 1;
            while (i < 5) {
                boolean z2 = !z;
                z = z2;
                if (z2) {
                    int i6 = i3 + 5 + (i * i);
                    int i7 = i6 - 1;
                    i2 = i6 >>> i6;
                } else {
                    int i8 = i;
                    int i9 = i3 + 1;
                    iArr[i8] = iArr[i8] - i9;
                    i2 = i9 + (i * i9);
                }
                int max = Math.max(i2 + 1, iArr[i - 1]) - 1;
                instanceCount += ((i * i) + instanceCount) - instanceCount;
                double[] dArr = dArrFld;
                int i10 = i5;
                double d2 = dArr[i10] + 1.0d;
                dArr[i10] = d2;
                byte b = (byte) (byFld + 1);
                byFld = b;
                int i11 = max + 1;
                i3 = (int) ((d2 + b) - ((d - i) - max));
                i4 = 1;
                while (5 > i4) {
                    double d3 = d - 1.0d;
                    d = d3;
                    byFld = (byte) d3;
                    long j = instanceCount;
                    long j2 = instanceCount;
                    instanceCount = j2 + 1;
                    instanceCount = j - j2;
                    i4++;
                }
                i += 3;
            }
            i5++;
        } while (i5 < 311);
        vMeth1_check_sum += i5 + i + i3 + (z ? 1 : 0) + Double.doubleToLongBits(d) + i4 + 225 + FuzzerUtils.checkSum(iArr);
    }

    public static float fMeth(byte b, double d, float f) {
        int i;
        int i2 = 2;
        int i3 = 254;
        int i4 = -35337;
        int i5 = 158;
        do {
            i = 1;
            while (i < 19) {
                int i6 = i2 + i;
                int i7 = 4224 - 14395;
                int[] iArr = iArrFld;
                int i8 = i;
                iArr[i8] = iArr[i8] >> (-129);
                i3 = 1;
                while (i3 < 2) {
                    d += f;
                    instanceCount += i3 * i3;
                    instanceCount <<= (int) instanceCount;
                    f = f + (((i3 * i7) + i4) - f) + ((float) (i3 | (-3725063011L)));
                    i3++;
                }
                i2 = i7 + i;
                i4 *= i2;
                i++;
            }
            i5 -= 2;
        } while (i5 > 0);
        long doubleToLongBits = b + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i5 + i + i2 + i3 + i4;
        fMeth_check_sum += doubleToLongBits;
        return (float) doubleToLongBits;
    }

    public static int iMeth(float f) {
        int i = -27629;
        int i2 = 3;
        while (i2 < 218) {
            int fMeth = ((int) (i + (((i2 * instanceCount) + i) - instanceCount))) - ((int) (dArrFld[i2] - (i2 % (fMeth(byFld, 2.5384d, f) | 1))));
            i = (-386417288) - 386417288;
            i2++;
        }
        long floatToIntBits = Float.floatToIntBits(f) + i2 + (i * ((int) f)) + Double.doubleToLongBits(2.5384d);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static void vMeth(double d) {
        int i = -57098;
        int i2 = 0;
        int i3 = -3;
        int i4 = -100;
        int[] iArr = new int[N];
        float f = -53.246f;
        FuzzerUtils.init(iArr, 5);
        int i5 = 8;
        while (i5 < 137) {
            long j = instanceCount;
            instanceCount = j - 1;
            int reverseBytes = (int) (Long.reverseBytes(j) + ((-42471) - (i5 + i5)));
            float f2 = f + (i5 * i5);
            f = f2 + 1.0f;
            int i6 = reverseBytes + 1;
            i = (int) ((-f2) * (reverseBytes - (-reverseBytes)));
            vMeth1();
            iArr = iArr;
            i5++;
        }
        int i7 = 4;
        while (i7 < 184) {
            int[] iArr2 = iArr;
            int i8 = i7;
            int i9 = iArr2[i8] - 1;
            iArr2[i8] = i9;
            i2 -= i9;
            i3 = 1;
            while (true) {
                i3++;
                if (i3 < 9) {
                    i4 = 1;
                    do {
                        int[] iArr3 = iArr;
                        int i10 = i4;
                        int i11 = iArr3[i10];
                        iArr3[i10] = i11 - 1;
                        instanceCount = i11;
                        int i12 = i - 1;
                        if (i12 == iMeth(f)) {
                        }
                        vMeth1();
                        i = i12 + 1;
                        i2 -= (int) (((i5 + f) - ((-23998) * (-23998))) - (i - (i2 + 1)));
                        f += i4 * i4;
                        i4++;
                    } while (i4 < 1);
                }
            }
            i7++;
        }
        vMeth_check_sum += ((((((((Double.doubleToLongBits(d) + i5) + i) + Float.floatToIntBits(f)) + i7) + i2) + i3) + i4) - 23998) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        int i = 234;
        int i2 = 187;
        int i3 = 11;
        int i4 = 59;
        int i5 = 59168;
        int i6 = -5;
        int i7 = -4;
        int i8 = 39;
        boolean z = false;
        boolean[] zArr = new boolean[N];
        FuzzerUtils.init(zArr, true);
        vMeth(this.dFld);
        int i9 = 269;
        while (i9 > 5) {
            iArrFld = FuzzerUtils.int1array(N, 48480);
            i2 = 5;
            while (95 > i2) {
                switch ((i9 % 1) + 63) {
                    case 63:
                        sFld = (short) i;
                        break;
                    default:
                        switch ((i9 % 6) + 44) {
                            case 44:
                                i += (-58850) + (i2 * i2);
                                i4 = 1;
                                while (i4 < 2) {
                                    i3 += ((i4 * i3) + i2) - i3;
                                    instanceCount += i4;
                                    zArr[i2] = z;
                                    instanceCount = i9;
                                    sFld = (short) i9;
                                    z = z;
                                    this.dFld = i2;
                                    i4++;
                                }
                                break;
                            case 45:
                            case 46:
                                switch ((i9 % 7) + 124) {
                                    case 124:
                                        lArrFld[i9 - 1] = instanceCount;
                                        i6 = 1;
                                        do {
                                            int i10 = i3 | i2;
                                            instanceCount += i6;
                                            sFld = (short) (sFld + ((short) (((i6 * instanceCount) + i5) - instanceCount)));
                                            int i11 = i5 & i10;
                                            i7 -= i;
                                            i3 = i10 & i9;
                                            i5 = i9;
                                            i6++;
                                        } while (i6 < 2);
                                        i7 += i2;
                                        i3 += i2 * i2;
                                        break;
                                    case 125:
                                        instanceCount += (long) this.dFld;
                                        break;
                                    case 126:
                                        i = i4;
                                        break;
                                    case 127:
                                        i8 -= i9;
                                        break;
                                    case 128:
                                        instanceCount += i2;
                                        break;
                                    case 129:
                                    case 130:
                                        i7 += i7;
                                        break;
                                    default:
                                        i3 *= (int) instanceCount;
                                        break;
                                }
                            case 47:
                                i8 += 11 + (i2 * i2);
                                break;
                            case 48:
                                instanceCount = instanceCount;
                                break;
                            case 49:
                                i5 += (int) (10 + (i2 * i2));
                                break;
                        }
                }
                i2++;
            }
            i9--;
        }
        FuzzerUtils.out.println("i18 i19 i20 = " + i9 + "," + i + "," + i2);
        FuzzerUtils.out.println("i21 i22 i23 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("b2 i24 i25 = " + (z) + "," + i6 + "," + i7);
        FuzzerUtils.out.println("i26 bArr = " + i8 + "," + FuzzerUtils.checkSum(zArr));
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        byte b = byFld;
        Double.doubleToLongBits(this.dFld);
        printStream.println("Test.instanceCount Test.byFld dFld = " + j + "," + printStream + "," + b);
        PrintStream printStream2 = FuzzerUtils.out;
        short s = sFld;
        long doubleToLongBits = Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld));
        FuzzerUtils.checkSum(iArrFld);
        printStream2.println("Test.sFld Test.dArrFld Test.iArrFld = " + s + "," + doubleToLongBits + "," + printStream2);
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
