

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_50/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_50/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public int iFld = -112;
    public static long instanceCount = -62448;
    public static long fMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(double d, float f, short s) {
        int i = -29179;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 1);
        int i2 = 17061 / (17061 | 1);
        instanceCount -= i2;
        instanceCount <<= (int) instanceCount;
        switch (((i2 >>> 1) % 1) + 15) {
            case 15:
                iArr[(i2 >>> 1) % N] = (int) d;
                break;
        }
        int i3 = 1;
        while (true) {
            i3++;
            if (i3 < 195) {
                i2 = (i2 + i3) >> ((int) instanceCount);
                i = 1;
                while (i < 8) {
                    instanceCount <<= 57;
                    instanceCount += i;
                    instanceCount += ((i * instanceCount) + i2) - instanceCount;
                    if (1 != 0) {
                        break;
                    }
                    instanceCount = instanceCount;
                    d -= i;
                    i++;
                }
            } else {
                vMeth_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f) + s + i2 + i3 + i + 51657 + 57 + (1 != 0 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
    }

    public static long lMeth(float f, int i, float f2) {
        long j;
        short s = 21071;
        int i2 = 32;
        int i3 = -207;
        int i4 = 57396;
        int i5 = -5;
        int[] iArr = new int[N];
        byte b = 70;
        FuzzerUtils.init(iArr, 62300);
        vMeth(-83.1227d, 0.287f, (short) 21071);
        long j2 = 23;
        while (true) {
            j = j2;
            if (j >= 372) {
                break;
            }
            f = -2920.0f;
            s = (short) j;
            j2 = j + 1;
        }
        switch (25) {
            case 24:
                i2 = -48;
                if (0 != 0) {
                    instanceCount >>= -48;
                    f2 += 75.0f;
                    break;
                } else if (0 != 0) {
                    i3 = 13;
                    while (i3 < 390) {
                        i4 = 4;
                        while (1 < i4) {
                            try {
                                int i6 = i2 / (-42150);
                                iArr[i3 - 1] = 8 % 1;
                                iArr[i3 - 1] = 717506544 % iArr[i3];
                            } catch (ArithmeticException e) {
                            }
                            i2 = -46;
                            try {
                                int i7 = (-46) / (-88);
                                i /= -46;
                                i2 = iArr[i3 - 1] % (-224);
                            } catch (ArithmeticException e2) {
                            }
                            i5 = i4;
                            i4--;
                        }
                        i3++;
                    }
                    break;
                } else {
                    f = 1;
                    break;
                }
            case 25:
                b = (byte) (-5);
                break;
            default:
                instanceCount -= 57396;
                break;
        }
        long floatToIntBits = Float.floatToIntBits(f) + i + Float.floatToIntBits(f2) + Double.doubleToLongBits(-83.1227d) + s + j + i2 + i3 + 1 + i4 + i5 + 8 + (0 != 0 ? 1 : 0) + b + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public static float fMeth() {
        float f;
        int i = -10;
        int i2 = 73;
        float f2 = 2.69f;
        int i3 = 8;
        while (i3 < 183) {
            i += (int) lMeth(62.199f, -14540, 0.102f);
            i2 = 1;
            while (i2 < 9) {
                f2 = 1.0f;
                do {
                    i &= i;
                    instanceCount -= instanceCount;
                    f = f2 + 1.0f;
                    f2 = f;
                } while (f < 2.0f);
                i2++;
            }
            i3++;
        }
        int i4 = i - 2;
        short s = (short) ((-18895) * ((short) instanceCount));
        double d = 0.63118d - 4.683863603794755E18d;
        int i5 = 15;
        while (i5 < 306) {
            i4 <<= 217;
            i5++;
        }
        long floatToIntBits = i3 + (i4 / (i3 | 1)) + Float.floatToIntBits(0.102f) + i2 + 45 + Float.floatToIntBits(f2) + s + Double.doubleToLongBits(d) + i5 + 0;
        fMeth_check_sum += floatToIntBits;
        return (float) floatToIntBits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [int] */
    /* JADX WARN: Type inference failed for: r0v67, types: [int] */
    public void mainTest(String[] strArr) {
        int i = -13;
        int i2 = 38723;
        short s = 214;
        int[] iArr = new int[N];
        float[][] fArr = new float[N][N];
        double d = -1.48842d;
        short s2 = 29283;
        FuzzerUtils.init(iArr, -13);
        FuzzerUtils.init(fArr, 95.215f);
        int i3 = 61 + ((int) (instanceCount * instanceCount));
        int i4 = 233;
        while (true) {
            i4 -= 2;
            if (i4 > 0) {
                i = 1;
                while (true) {
                    i++;
                    if (i < 214) {
                        i3--;
                        i2 = 1;
                        while (1 > i2) {
                            int i5 = i3;
                            int i6 = i3 - 1;
                            instanceCount *= i5;
                            switch ((i4 % 3) + 124) {
                                case 124:
                                    s -= (int) fMeth();
                                    instanceCount += 51.36f;
                                    d += i;
                                    this.iFld += this.iFld;
                                    break;
                                case 125:
                                    int i7 = i2 + 1;
                                    iArr[i7] = iArr[i7] + ((int) d);
                                    this.iFld += i2 * i;
                                    break;
                                case 126:
                                    fArr = FuzzerUtils.float2array(N, 0.946f);
                                    i6 = (int) d;
                                default:
                                    this.iFld += (int) d;
                                    int i8 = i2 - 1;
                                    iArr[i8] = iArr[i8] + this.iFld;
                                    break;
                            }
                            this.iFld = (int) 51.36f;
                            s -= s2;
                            instanceCount >>= i2;
                            this.iFld = -63102;
                            this.iFld += i;
                            instanceCount += i2 * i2;
                            i3 = i6 >> (-80);
                            int i9 = i2 - 1;
                            iArr[i9] = iArr[i9] - this.iFld;
                            i2++;
                        }
                        instanceCount += i;
                    } else if (0 != 0) {
                        int i10 = i4 + 1;
                        iArr[i10] = iArr[i10] + ((int) 51.36f);
                        s2 = (short) i2;
                    } else if (0 != 0) {
                        int i11 = i4 + 1;
                        iArr[i11] = iArr[i11] - ((int) instanceCount);
                    } else {
                        iArr[i4] = -19364;
                    }
                }
            } else {
                FuzzerUtils.out.println("i i1 i2 = " + i3 + "," + i4 + "," + i);
                FuzzerUtils.out.println("i3 i4 f5 = " + i2 + "," + s + "," + Float.floatToIntBits(51.36f));
                PrintStream printStream = FuzzerUtils.out;
                long doubleToLongBits = Double.doubleToLongBits(d);
                short s3 = s2;
                if (0 != 0) {
                }
                printStream.println("d3 s3 b2 = " + doubleToLongBits + "," + printStream + "," + s3);
                PrintStream printStream2 = FuzzerUtils.out;
                long checkSum = FuzzerUtils.checkSum(iArr);
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                printStream2.println("iArr2 fArr = " + checkSum + "," + printStream2);
                PrintStream printStream3 = FuzzerUtils.out;
                long j = instanceCount;
                int i12 = this.iFld;
                printStream3.println("Test.instanceCount iFld = " + j + "," + printStream3);
                FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
                FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
                FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
                return;
            }
        }
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
