

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_65/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_65/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public long lFld = -177;
    public static long lMeth_check_sum;
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long instanceCount = -833413353;
    public static int iFld = 13;
    public static int iFld1 = -7;
    public static boolean bFld = true;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, -9);
        lMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static int iMeth(int i, long j) {
        int i2 = -6423;
        int i3 = 17;
        int i4 = -66;
        int[] iArr = new int[N];
        float f = 1.653f;
        double d = 0.121151d;
        double d2 = -1.26119d;
        short s = -2982;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 2L);
        FuzzerUtils.init(iArr, -250);
        int i5 = 6;
        while (348 > i5) {
            i3 = 5;
            while (true) {
                i3--;
                if (i3 > 0) {
                    int i6 = i5;
                    jArr[i6] = jArr[i6] >> (-6);
                    j += i3;
                    switch (((i5 % 8) * 5) + 50) {
                        case 55:
                            i4 -= (int) instanceCount;
                            break;
                        case 57:
                            d2 = i2;
                            break;
                        case 71:
                            int i7 = i5 - 1;
                            jArr[i7] = jArr[i7] - (-45);
                            break;
                        case 72:
                            int i8 = (i3 >>> 1) % N;
                            jArr[i8] = jArr[i8] + i3;
                            break;
                        case 73:
                            int i9 = i5 - 1;
                            iArr[i9] = iArr[i9] | i4;
                            break;
                        case 75:
                            i2 += i3 * i3;
                            break;
                        case 86:
                            s = (short) (s * 6);
                            break;
                        case 87:
                            iFld = (int) (iFld + (i3 | f));
                            d = 1.0d;
                            while (true) {
                                double d3 = d + 1.0d;
                                d = d3;
                                if (d3 < 1.0d) {
                                    long j2 = j << 12;
                                    if (i2 != 0) {
                                    }
                                    int i10 = i5 - 1;
                                    jArr[i10] = jArr[i10] - iFld;
                                    iArr[i5] = -7964;
                                    iFld -= i5;
                                    j = (long) d;
                                } else {
                                    f += i3;
                                    int i82 = (i3 >>> 1) % N;
                                    jArr[i82] = jArr[i82] + i3;
                                    break;
                                }
                            }
                    }
                }
            }
            i5++;
        }
        long floatToIntBits = ((((((((((i + j) + i5) + i2) + i3) + Float.floatToIntBits(f)) + Double.doubleToLongBits(d)) + i4) + Double.doubleToLongBits(d2)) + s) - 45) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static void vMeth(byte b, float f, long j) {
        int i = -8305;
        int i2 = 3996;
        int i3 = -54175;
        long j2 = -8527375566115542874L;
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, -20.934f);
        int iMeth = ((-5) - ((int) (37.307f + ((float) j)))) | ((int) (iMeth(r0, -8527375566115542874L) + f));
        double d = iMeth;
        float f2 = 1.0f;
        while (true) {
            float f3 = f2;
            if (f3 < 184.0f) {
                int i4 = (int) (f3 - 1.0f);
                fArr[i4] = fArr[i4] - 2.92f;
                f *= iMeth;
                if (i != 0) {
                    vMeth_check_sum += (((((((((b + Float.floatToIntBits(f)) + j) + iMeth) + Double.doubleToLongBits(d)) + j2) + Float.floatToIntBits(f3)) + i) + i2) - 2) + i3 + 14 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                    return;
                }
                i2 = 1;
                while (9 > i2) {
                    i = (i & ((int) j2)) + (i2 * iFld);
                    j2 *= iMeth;
                    i3 = 1;
                    while (2 > i3) {
                        if (i3 != 0) {
                            vMeth_check_sum += (((((((((b + Float.floatToIntBits(f)) + j) + iMeth) + Double.doubleToLongBits(d)) + j2) + Float.floatToIntBits(f3)) + i) + i2) - 2) + i3 + 14 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                            return;
                        }
                        iFld = -101;
                        d += iMeth;
                        iArrFld[i3 + 1] = 50013;
                        i3++;
                    }
                    i2++;
                }
                f2 = f3 + 1.0f;
            } else {
                vMeth_check_sum += (((((((((b + Float.floatToIntBits(f)) + j) + iMeth) + Double.doubleToLongBits(d)) + j2) + Float.floatToIntBits(f3)) + i) + i2) - 2) + i3 + 14 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
        }
    }

    public static long lMeth(int i, long j, float f) {
        double d;
        int i2 = -46;
        int i3 = 185;
        boolean[][] zArr = new boolean[N][N];
        short s = 14104;
        FuzzerUtils.init(zArr, false);
        vMeth((byte) -94, f, 1196943289L);
        iFld &= i;
        long j2 = iFld;
        int i4 = i;
        double d2 = 10.0d;
        while (true) {
            d = d2;
            if (d >= 228.0d) {
                break;
            }
            i2 = 1;
            while (i2 < 7) {
                if (1 == 0) {
                    i3 = 2;
                    while (i3 > 1) {
                        s = (short) (s - ((short) 62922));
                        long j3 = j2 + (i3 * i2);
                        i4 = (i4 * iFld) + ((int) j3);
                        j2 = j3 + i3;
                        i3--;
                    }
                }
                i2++;
            }
            d2 = d + 1.0d;
        }
        long floatToIntBits = ((((((((((i4 + j2) + Float.floatToIntBits(f)) - 94) + Double.doubleToLongBits(d)) - 40925) + i2) + 62922) + (1 != 0 ? 1 : 0)) + i3) - 4) + s + FuzzerUtils.checkSum(zArr);
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public void mainTest(String[] strArr) {
        double d = 0.113864d;
        float f = 0.607f;
        int i = -8;
        int i2 = 48465;
        int i3 = -9;
        int i4 = 29739;
        int i5 = 193;
        int i6 = 53;
        int i7 = 55;
        long[][] jArr = new long[N][N];
        FuzzerUtils.init(jArr, 470742557182377984L);
        double lMeth = 0.13591d - (((-233) - (-Math.max(instanceCount, instanceCount))) - (lMeth(iFld, 1L, 0.607f) + instanceCount));
        if (bFld) {
            double d2 = 7.0d;
            while (true) {
                d = d2;
                if (156.0d <= d) {
                    break;
                }
                instanceCount <<= iFld;
                instanceCount = -8;
                d2 = d + 1.0d;
            }
            i2 = 1;
            while (true) {
                i2++;
                if (i2 < 292) {
                    i3 = 86;
                    while (i3 > 2) {
                        i4 = (int) (i4 + i3 + instanceCount);
                        i *= i;
                        i3 -= 2;
                    }
                    i = (int) (i + (((i2 * 16284) + instanceCount) - i4));
                    i5 = 5;
                    while (i5 < 86) {
                        instanceCount = iFld1;
                        i4 += i5;
                        switch ((i5 % 10) + 24) {
                            case 24:
                                switch (((iFld >>> 1) % 8) + 82) {
                                    case 82:
                                        i7 = 1;
                                        while (true) {
                                            i7++;
                                            if (i7 < 2) {
                                                i6 >>= 16284;
                                                instanceCount += 16284;
                                                this.lFld = ((float) this.lFld) + ((((float) (i7 * instanceCount)) + 0.607f) - i);
                                                switch ((i5 % 5) + 46) {
                                                    case 46:
                                                        int[] iArr = iArrFld;
                                                        int i8 = i5;
                                                        iArr[i8] = iArr[i8] - ((int) d);
                                                        instanceCount = -221L;
                                                        int[] iArr2 = iArrFld;
                                                        iArr2[i2] = iArr2[i2] & 0;
                                                        break;
                                                    case 47:
                                                        i >>= i5;
                                                        lMeth -= 74.68800354003906d;
                                                        instanceCount &= i7;
                                                        i4 += ((i7 * i2) + iFld) - i5;
                                                        break;
                                                    case 48:
                                                        i = i + (i7 - i5) + (i7 * i7);
                                                        break;
                                                    case 50:
                                                        this.lFld ^= i7;
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case 83:
                                        this.lFld = iFld1;
                                        break;
                                    case 84:
                                        iFld1 = (int) (iFld1 + i5 + this.lFld);
                                        break;
                                    case 85:
                                        iFld *= i4;
                                        break;
                                    case 86:
                                        i4 += i4;
                                        break;
                                    case 87:
                                        i4 = -25653;
                                        break;
                                    case 88:
                                        int[] iArr3 = iArrFld;
                                        int i9 = i5 - 1;
                                        iArr3[i9] = iArr3[i9] * i3;
                                        break;
                                    case 89:
                                        if (bFld) {
                                        }
                                        break;
                                    default:
                                        i4 += i5 * i5;
                                        break;
                                }
                            case 25:
                                jArr[i2][i2 - 1] = this.lFld;
                                break;
                            case 26:
                                lMeth *= instanceCount;
                            case 27:
                                i4 = iFld;
                                break;
                            case 28:
                                this.lFld *= i;
                                break;
                            case 29:
                            case 30:
                                i += 13;
                                break;
                            case 31:
                                iArrFld[i5] = (int) this.lFld;
                                break;
                            case 32:
                                i6 += i5 * i6;
                                break;
                            case 33:
                                iFld1 = (int) instanceCount;
                                break;
                            default:
                                i *= (int) lMeth;
                                break;
                        }
                        i5++;
                    }
                }
            }
        } else if (bFld) {
            lMeth -= 150;
        } else {
            f = 0.607f + iFld;
        }
        PrintStream printStream = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(lMeth);
        int floatToIntBits = Float.floatToIntBits(f);
        Double.doubleToLongBits(d);
        printStream.println("d f4 d5 = " + doubleToLongBits + "," + printStream + "," + floatToIntBits);
        FuzzerUtils.out.println("i18 i19 i20 = " + i + "," + i2 + "," + i3);
        FuzzerUtils.out.println("i21 s3 i22 = " + i4 + "," + 16284 + "," + i5);
        FuzzerUtils.out.println("i23 i24 i25 = " + i6 + "," + i7 + "," + (-150));
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(jArr));
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        int i10 = iFld;
        int i11 = iFld1;
        printStream2.println("Test.instanceCount Test.iFld Test.iFld1 = " + j + "," + printStream2 + "," + i10);
        PrintStream printStream3 = FuzzerUtils.out;
        long j2 = this.lFld;
        boolean z = bFld;
        FuzzerUtils.checkSum(iArrFld);
        printStream3.println("lFld Test.bFld Test.iArrFld = " + j2 + "," + printStream3 + "," + z);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
