

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_62/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_62/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public float fFld = 0.951f;
    public long[] lArrFld = new long[N];
    public static volatile long instanceCount = 1404654219;
    public static int iFld = 3126;
    public static boolean bFld = true;
    public static byte byFld = -22;
    public static short sFld = -26070;
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {
        int i = -38742;
        int i2 = 46645;
        int i3 = 2073;
        float f = 50.447f;
        byte b = 112;
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, 72.119607d);
        bFld = bFld;
        iFld -= iFld;
        if (bFld) {
            i = 1;
            while (true) {
                i++;
                if (i >= 255) {
                    break;
                }
                double d = 0.54981d;
                iFld <<= -54762;
                iFld *= (int) 0.54981d;
                iFld = (int) instanceCount;
                i2 = 1;
                while (i2 < 6) {
                    float f2 = f + ((float) ((-5359694630797001131L) + (i2 * i2)));
                    f = -4834;
                    dArr[i + 1] = -175.0d;
                    i3 = 1;
                    while (i3 < 2) {
                        instanceCount = -60L;
                        d += i2;
                        b = (byte) (b & ((byte) i));
                        i3++;
                    }
                    i2++;
                }
            }
        } else {
            iFld *= (int) instanceCount;
        }
        long floatToIntBits = i + i2 + 29678 + Float.floatToIntBits(f) + i3 + 213 + b + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public void vMeth(long j, byte b) {
        int i = -178;
        int[][] iArr = new int[N][N];
        float f = 0.148f;
        double d = 2.12936d;
        FuzzerUtils.init(iArr, -13);
        int[] iArr2 = iArr[96];
        int i2 = (iFld >>> 1) % N;
        iArr2[i2] = iArr2[i2] - ((int) (lMeth() - iFld));
        iFld = iFld;
        bFld = bFld;
        int i3 = 9;
        while (257 > i3) {
            i = (int) j;
            i3++;
        }
        int i4 = 1;
        while (true) {
            i4++;
            if (i4 < 250) {
                f -= 5.497827E18f;
                d = instanceCount;
                int i5 = i << iFld;
                iFld -= i3;
                i = i5 + i4;
                iArr[i4 + 1][i4 - 1] = (int) j;
                iFld >>>= i4;
                j = j + i4 + (i4 | f);
            } else {
                vMeth_check_sum += j + b + i3 + i + i4 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
    }

    public boolean bMeth(double d) {
        float f = -2.503f;
        short s = -13;
        int i = -86;
        int i2 = -66;
        int i3 = -64634;
        int[][] iArr = new int[N][N];
        FuzzerUtils.init(iArr, -106);
        float f2 = 14.0f;
        while (true) {
            float f3 = f2;
            if (f3 < 311.0f) {
                vMeth(instanceCount, byFld);
                iFld = byFld;
                iArr[(int) (f3 + 1.0f)][(int) (f3 + 1.0f)] = -44;
                iFld += (int) f3;
                iArr[(int) (f3 - 1.0f)][(int) f3] = (int) d;
                s = sFld;
                i = 6;
                while (1 < i) {
                    switch ((int) ((f3 % 2.0f) + 87.0f)) {
                        case 87:
                            i2 = 1;
                            while (2 > i2) {
                                iFld = s;
                                int[] iArr2 = iArr[i];
                                int i4 = i2;
                                iArr2[i4] = iArr2[i4] * i2;
                                iFld += (int) instanceCount;
                                f = i;
                                i3 = (int) instanceCount;
                                i2++;
                            }
                            break;
                        case 88:
                            f -= 175.0f;
                        default:
                            sFld = (short) (sFld - 35);
                            break;
                    }
                    i--;
                }
                f2 = f3 + 1.0f;
            } else {
                long doubleToLongBits = ((((Double.doubleToLongBits(d) + Float.floatToIntBits(f3)) + s) + i) - 2826) + i2 + i3 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr);
                bMeth_check_sum += doubleToLongBits;
                return doubleToLongBits % 2 > 0;
            }
        }
    }

    public void mainTest(String[] strArr) {
        float f;
        float[][] fArr = new float[N][N];
        int i = 52873;
        int i2 = 7;
        int i3 = -7;
        int i4 = 6;
        int i5 = 61345;
        int i6 = -132;
        int i7 = 4;
        int i8 = -13;
        int i9 = -237;
        FuzzerUtils.init(fArr, 2.889f);
        iFld = (int) (-(-90.1289d));
        float f2 = 1.0f;
        while (true) {
            f = f2;
            if (f < 273.0f && !bMeth(-90.1289d)) {
                i2 = 184;
                while (f < i2) {
                    switch ((i2 % 10) + 96) {
                        case 96:
                            i4 = 1;
                            do {
                                instanceCount = f;
                                float[] fArr2 = fArr[i2];
                                int i10 = i4;
                                fArr2[i10] = fArr2[i10] - ((float) instanceCount);
                                iFld >>= i3;
                                this.fFld += i4 + i4;
                                i3 += i4 * i4;
                                byFld = (byte) i3;
                                this.fFld -= i3;
                                i4 += 2;
                            } while (i4 < 1);
                            iFld = iFld;
                            instanceCount = i;
                        case 97:
                            iFld >>= i3;
                            break;
                        case 98:
                        case 99:
                            i5 = i2;
                            while (1 > i5) {
                                instanceCount -= sFld;
                                i5++;
                            }
                            bFld = bFld;
                            this.fFld /= (float) (instanceCount | 1);
                            instanceCount += i2 | i3;
                            break;
                        case 100:
                            long[] jArr = this.lArrFld;
                            int i11 = (int) (f - 1.0f);
                            jArr[i11] = jArr[i11] + i6;
                            i7 = 1;
                            while (i7 < 1 && !bFld) {
                                i7++;
                            }
                            i6 = i5;
                            break;
                        case 101:
                            i9 += i2;
                            break;
                        case 102:
                            i = i5;
                            this.fFld += i5;
                            i9 += i2 + i4;
                            i8 += i2;
                            break;
                        case 103:
                            sFld = (short) (sFld + ((short) (i2 | i8)));
                            break;
                        case 104:
                            this.fFld -= i6;
                        case 105:
                            fArr[(int) (f - 1.0f)][(int) f] = i;
                            break;
                    }
                    i2--;
                }
                f2 = f + 2.0f;
            }
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("d f i = " + Double.doubleToLongBits(-90.1289d) + "," + printStream + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i14 i15 i16 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i17 i18 i19 = " + i5 + "," + i6 + "," + i7);
        FuzzerUtils.out.println("i20 i21 fArr = " + i8 + "," + i9 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        int i12 = iFld;
        if (bFld) {
        }
        printStream2.println("Test.instanceCount Test.iFld Test.bFld = " + j + "," + printStream2 + "," + i12);
        FuzzerUtils.out.println("Test.byFld Test.sFld fFld = " + byFld + "," + sFld + "," + Float.floatToIntBits(this.fFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(this.lArrFld));
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
