

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_34/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_34/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public int iFld = 7;
    public int[][] iArrFld = new int[N][N];
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long instanceCount = 2096967976490354578L;
    public static float fFld = -86.392f;
    public static byte byFld = -109;
    public static final int N = 400;
    public static volatile long[] lArrFld = new long[N];
    public static float[] fArrFld = new float[N];

    static {
        FuzzerUtils.init(lArrFld, -6L);
        FuzzerUtils.init(fArrFld, 0.274f);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
    }

    public int iMeth1(float f) {
        int i = -9;
        int i2 = 96;
        int i3 = -11560;
        int[] iArr = new int[N];
        short s = 26004;
        double d = 17.4084d;
        FuzzerUtils.init(iArr, -1);
        int i4 = 358;
        while (true) {
            i4--;
            if (i4 <= 0) {
                break;
            }
            s = (short) (s + ((short) fFld));
            this.iFld <<= i4;
            instanceCount += (-11708) + (i4 * i4);
            i = 1;
            while (i < 5) {
                d = -58236.0d;
                i2 *= (int) f;
                long[] jArr = lArrFld;
                int i5 = i - 1;
                jArr[i5] = jArr[i5] << i2;
                this.iFld >>>= i2;
                i++;
            }
        }
        fFld = f;
        int[] iArr2 = this.iArrFld[(i2 >>> 1) % N];
        int i6 = (i >>> 1) % N;
        iArr2[i6] = iArr2[i6] * i4;
        for (int i7 : iArr) {
            i3 = 4;
            while (true) {
                i3--;
                if (i3 > 0) {
                    instanceCount = byFld;
                }
            }
        }
        this.iFld += 44295;
        long floatToIntBits = Float.floatToIntBits(f) + i4 + s + i + i2 + Double.doubleToLongBits(d) + i3 + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public int iMeth(int i, boolean z) {
        int i2 = 8445;
        int i3 = 14;
        double d = 85.30178d;
        long j = instanceCount + (i * (-202));
        int[] iArr = this.iArrFld[(i >>> 1) % N];
        int i4 = iArr[45] + 1;
        iArr[45] = i4;
        boolean z2 = j != ((long) i4);
        int i5 = 3;
        while (i5 < 363) {
            i3 = 5;
            while (true) {
                i3--;
                if (i3 > 0) {
                    i |= (int) (0.80901d + 1.0d + (iMeth1(-12.242f) << (-1834406545)));
                    this.iArrFld[i3 + 1] = this.iArrFld[i5 + 1];
                    double d2 = i3;
                    while (true) {
                        d = d2;
                        if (d < 1.0d) {
                            instanceCount -= 29034;
                            this.iArrFld[(int) (d - 1.0d)] = this.iArrFld[i5 + 1];
                            fFld = this.iFld;
                            this.iArrFld[i3 - 1][i5 + 1] = i3;
                            i2 = (i2 - (-64)) << 6;
                            int i6 = i ^ i5;
                            i = 206;
                            this.iFld += 81;
                            d2 = d + 3.0d;
                        }
                    }
                }
            }
            i5++;
        }
        long doubleToLongBits = ((((((i + (z2 ? 1 : 0)) + i5) + i2) + i3) + Double.doubleToLongBits(d)) - 64) + 29034;
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public void vMeth() {
        int i = -254;
        int i2 = 4;
        int i3 = -62766;
        int[][][] iArr = new int[N][N][N];
        short[][][] sArr = new short[N][N][N];
        boolean z = false;
        double d = 72.2678d;
        float f = 0.526f;
        FuzzerUtils.init((Object[][]) iArr, (Object) 138);
        FuzzerUtils.init((Object[][]) sArr, (Object) (short) -6811);
        int i4 = 8;
        while (173 > i4) {
            long j = instanceCount;
            float f2 = fFld;
            int[] iArr2 = iArr[i4][i4 + 1];
            int i5 = i4 - 1;
            iArr2[i5] = iArr2[i5] - (-17219);
            instanceCount = j - ((f2 - (-r4)) + ((i / (i | 1)) + (13363 - i4)));
            long[] jArr = lArrFld;
            int i6 = i4 - 1;
            i--;
            jArr[i6] = jArr[i6] + (i4 - i);
            i2 = 1;
            do {
                switch ((i4 % 6) + 77) {
                    case 77:
                        long[] jArr2 = lArrFld;
                        int i7 = i2 + 1;
                        long j2 = jArr2[i7];
                        short[] sArr2 = sArr[i2][i4 + 1];
                        int i8 = i4 - 1;
                        short s = (short) (sArr2[i8] + 1);
                        sArr2[i8] = s;
                        int[] iArr3 = iArr[i2][i4];
                        int i9 = i2 - 1;
                        int i10 = iArr3[i9] + 1;
                        iArr3[i9] = i10;
                        jArr2[i7] = j2 >> (s + i10);
                        iMeth(i, z);
                        d /= (-17219) | 1;
                        break;
                    case 78:
                        this.iFld -= this.iFld;
                        this.iFld = 25834;
                        this.iFld = (int) fFld;
                        break;
                    case 79:
                        float f3 = 1.0f;
                        while (true) {
                            f = f3;
                            if (f < 1.0f) {
                                z = z;
                                instanceCount *= (long) d;
                                i = 61753;
                                f3 = f + 1.0f;
                            }
                        }
                    case 80:
                        int[] iArr4 = iArr[i2 - 1][i2 + 1];
                        int i11 = i2 - 1;
                        iArr4[i11] = iArr4[i11] >>> i;
                    case 81:
                        this.iFld = (int) (this.iFld + i2 + instanceCount);
                    case 82:
                        i3 <<= i;
                    default:
                        this.iFld += 13;
                        break;
                }
                i2++;
            } while (i2 < 10);
            i4++;
        }
        vMeth_check_sum += ((i4 + i) - 17219) + i2 + (z ? 1 : 0) + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i3 + FuzzerUtils.checkSum((Object[][]) iArr) + FuzzerUtils.checkSum((Object[][]) sArr);
    }

    public void mainTest(String[] strArr) {
        int i = 118;
        int i2 = -137;
        int i3 = 7;
        int i4 = 6;
        int i5 = -22430;
        int i6 = 97;
        int i7 = -39676;
        int i8 = -11;
        int[] iArr = new int[N];
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, -57.11637d);
        FuzzerUtils.init(iArr, 113);
        int i9 = 19;
        while (i9 < 388) {
            i += (-12) + (i9 * i9);
            i9 += 3;
        }
        int i10 = i;
        int i11 = i - 1;
        instanceCount -= i10;
        vMeth();
        long[] jArr = lArrFld;
        int i12 = (i9 >>> 1) % N;
        jArr[i12] = jArr[i12] + 20203;
        int i13 = 378;
        while (i13 > 2) {
            i3 = 8;
            while (i3 < 133) {
                instanceCount += i3 + instanceCount;
                i11 += (int) (1.33f + (i3 * i3));
                int[] iArr2 = this.iArrFld[i3 - 1];
                int i14 = i13;
                iArr2[i14] = iArr2[i14] - this.iFld;
                i4 = 1;
                while (true) {
                    i4++;
                    if (i4 < 2) {
                        int[] iArr3 = this.iArrFld[i13 + 1];
                        int i15 = i3;
                        iArr3[i15] = iArr3[i15] + i5;
                        int i16 = i3;
                        this.iFld = -25471;
                        fFld -= 10.0f;
                        i2 = (i16 - i16) + i4;
                        i11 += ((i4 * 6) + this.iFld) - i5;
                    } else {
                        instanceCount = instanceCount;
                        float[] fArr = fArrFld;
                        int i17 = i3 + 1;
                        fArr[i17] = fArr[i17] + i4;
                        int i18 = i13 + 1;
                        dArr[i18] = dArr[i18] + 40706.0d;
                        i6 = 1;
                        while (true) {
                            i6++;
                            if (i6 < 2) {
                                i5 = i11;
                                i11 = (int) (i11 + (((i6 * instanceCount) + 6) - this.iFld));
                            } else {
                                switch ((i13 % 2) + 112) {
                                    case 112:
                                        i7 = 1;
                                        while (2 > i7) {
                                            switch ((i13 % 5) + 20) {
                                                case 20:
                                                    fArrFld[i3] = r0[r1] - 12.0f;
                                                    instanceCount ^= instanceCount;
                                                    i5 += i7 + this.iFld;
                                                    break;
                                                case 21:
                                                    instanceCount += i8;
                                                case 22:
                                                    i8 -= i2;
                                                    break;
                                                case 23:
                                                    this.iFld = (int) instanceCount;
                                                    break;
                                                case 24:
                                                    iArr[i3 + 1] = i4;
                                                    break;
                                                default:
                                                    int[] iArr4 = this.iArrFld[i13 + 1];
                                                    int i19 = (this.iFld >>> 1) % N;
                                                    iArr4[i19] = iArr4[i19] + i11;
                                                    break;
                                            }
                                            i7++;
                                        }
                                        break;
                                    case 113:
                                        i11 |= (int) instanceCount;
                                    default:
                                        i5 += i3;
                                        break;
                                }
                                i3++;
                            }
                        }
                    }
                }
            }
            i13 -= 2;
        }
        FuzzerUtils.out.println("i i1 i16 = " + i9 + "," + i11 + "," + i13);
        FuzzerUtils.out.println("i17 i18 i19 = " + i2 + "," + i3 + "," + 5);
        FuzzerUtils.out.println("i20 i21 i22 = " + i4 + "," + i5 + "," + 6);
        FuzzerUtils.out.println("i23 i24 i25 = " + i6 + "," + i7 + "," + i8);
        PrintStream printStream = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        FuzzerUtils.checkSum(iArr);
        printStream.println("dArr iArr2 = " + doubleToLongBits + "," + printStream);
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        int floatToIntBits = Float.floatToIntBits(fFld);
        int i20 = this.iFld;
        printStream2.println("Test.instanceCount Test.fFld iFld = " + j + "," + printStream2 + "," + floatToIntBits);
        PrintStream printStream3 = FuzzerUtils.out;
        byte b = byFld;
        long checkSum = FuzzerUtils.checkSum(lArrFld);
        FuzzerUtils.checkSum(this.iArrFld);
        printStream3.println("Test.byFld Test.lArrFld iArrFld = " + b + "," + checkSum + "," + printStream3);
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
