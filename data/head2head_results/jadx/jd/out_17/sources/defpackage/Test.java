

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_17/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_17/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public short sFld = 15369;
    public int iFld1 = 9;
    public double dFld1 = -115.5534d;
    public byte byFld = -124;
    public int[] iArrFld = new int[N];
    public float[] fArrFld = new float[N];
    public static long lMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static volatile long instanceCount = 79;
    public static int iFld = 124;
    public static double dFld = -115.6292d;
    public static short sFld1 = 29388;
    public static boolean bFld = false;
    public static volatile int iFld2 = -145;
    public static final int N = 400;
    public static long[] lArrFld = new long[N];
    public static double[] dArrFld = new double[N];

    static {
        FuzzerUtils.init(lArrFld, -5779320234873997146L);
        FuzzerUtils.init(dArrFld, 58.88823d);
        lMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }

    public void vMeth(int i, long j, int i2) {
        int i3 = -39;
        int i4 = -3;
        int i5 = 10;
        while (i5 < 194) {
            instanceCount = iFld;
            i3 *= i2;
            j += i3;
            instanceCount += i5;
            iFld += (int) instanceCount;
            this.iFld1 <<= iFld;
            switch (65) {
                case 64:
                    long[] jArr = lArrFld;
                    int i6 = i5;
                    jArr[i6] = jArr[i6] & j;
                    i2 = (int) j;
                    continue;
                case 65:
                    i4 = 1;
                    while (9 > i4) {
                        i2 *= 25;
                        i4++;
                    }
                    instanceCount *= -2.528f;
                    break;
            }
            float[] fArr = this.fArrFld;
            int i7 = i5 + 1;
            fArr[i7] = fArr[i7] - iFld;
            long[] jArr2 = lArrFld;
            int i8 = i5;
            jArr2[i8] = jArr2[i8] - (-2.528f);
            i5++;
        }
        vMeth_check_sum += i + j + i2 + i5 + i3 + i4 + 0 + Float.floatToIntBits(-2.528f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int iMeth(long j) {
        int i = 655;
        int i2 = 164;
        int i3 = -35942;
        double d = 12.58768d;
        int i4 = this.iFld1;
        int i5 = iFld + ((int) (iFld - 0.837f));
        iFld = i5;
        long j2 = instanceCount + 1;
        instanceCount = this;
        this.iFld1 = i4 >>> ((int) (i5 + j2));
        int i6 = 378;
        while (i6 > 4) {
            double d2 = 9.0d;
            while (true) {
                d = d2;
                if (d > 1.0d) {
                    int[] iArr = this.iArrFld;
                    int i7 = (int) (d + 1.0d);
                    int i8 = iArr[i7];
                    short max = (short) Math.max(iFld, 50);
                    this.sFld = max;
                    iArr[i7] = i8 - (i - max);
                    d2 = d - 3.0d;
                } else {
                    i2 = 9;
                    while (i2 > 1) {
                        instanceCount = this.byFld;
                        iFld += (int) 0.837f;
                        switch (((((int) (iFld + instanceCount)) >>> 1) % 4) + 40) {
                            case 40:
                                vMeth(i, -54719L, 198);
                                i *= i;
                                break;
                            case 41:
                            case 42:
                                i += i2;
                                try {
                                    i = 50 % this.iArrFld[i6];
                                    iFld = 50 / (-2);
                                    iFld = i6 % (-762048616);
                                } catch (ArithmeticException e) {
                                }
                                i3 = i6;
                                while (i3 < 2) {
                                    int[] iArr2 = this.iArrFld;
                                    int i9 = i3;
                                    iArr2[i9] = iArr2[i9] >> (-144);
                                    sFld1 = (short) (-147);
                                    i3++;
                                }
                                break;
                            case 43:
                                this.sFld = (short) (this.sFld - (-54));
                                break;
                            default:
                                i -= i3;
                                break;
                        }
                        i2--;
                    }
                    i6 -= 2;
                }
            }
        }
        long floatToIntBits = (((((((j + Float.floatToIntBits(0.837f)) + i6) + 50) + Double.doubleToLongBits(d)) + i) + i2) - 147) + i3 + 207;
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public long lMeth(byte b, int i, int i2) {
        int i3;
        int i4 = -234;
        int i5 = -49083;
        int i6 = i + 1;
        float f = i2 - (i * this.iArrFld[(i6 >>> 1) % N]);
        int i7 = 1;
        do {
            iFld = (int) (i6 * (i2 - (i6 + instanceCount)));
            iFld += i7;
            iFld *= -i7;
            int[] iArr = this.iArrFld;
            int i8 = i7 + 1;
            iArr[i8] = iArr[i8] * i7;
            i3 = 1;
            while (i3 < 6) {
                short s = (short) (this.sFld - 1);
                this.sFld = s;
                if (s >= iMeth(instanceCount)) {
                    i4 = i3;
                    while (i4 < 2) {
                        int[] iArr2 = this.iArrFld;
                        int i9 = i7;
                        int i10 = iArr2[i9];
                        this.sFld = (short) (this.sFld + 1);
                        iArr2[i9] = i10 >> ((int) ((r4 + (this.iFld1 + i7)) * ((i3 - instanceCount) - (0.52325d + f))));
                        this.iFld1 += 729;
                        int i11 = i5;
                        i5++;
                        iFld = i11;
                        i2 -= i7 * Math.max(Math.min(-3, i2), (int) (instanceCount + b));
                        this.iArrFld[i7 + 1] = (int) dFld;
                        i4++;
                    }
                } else if (bFld) {
                    instanceCount |= (long) (this.dFld1 * this.sFld);
                } else if (bFld) {
                    int[] iArr3 = this.iArrFld;
                    this.iArrFld = iArr3;
                    this.iArrFld = iArr3;
                }
                i3++;
            }
            i7++;
        } while (i7 < 260);
        long floatToIntBits = b + i6 + i2 + Float.floatToIntBits(f) + i7 + i3 + 193 + i4 + i5;
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public void mainTest(String[] strArr) {
        int i = 46854;
        int i2 = 8;
        int i3 = -64309;
        int i4 = 34340;
        int i5 = -9200;
        int i6 = -37568;
        int i7 = -6844;
        int i8 = -2;
        float f = -50.389f;
        long[] jArr = lArrFld;
        int i9 = (iFld >>> 1) % N;
        jArr[i9] = jArr[i9] * ((lMeth((byte) -18, -15656, iFld) - this.iFld1) - this.iFld1);
        this.iFld1 |= 1260029097;
        this.iFld1 |= this.iFld1;
        instanceCount -= -28519;
        iFld = -2;
        this.dFld1 = 145.0d;
        int i10 = 248;
        while (i10 > 7) {
            if (bFld) {
                i2 = 3;
                while (104 > i2) {
                    this.iFld1 *= (int) dFld;
                    i3 *= i;
                    i2++;
                }
                i4 = i10;
                while (104 > i4) {
                    i6 = 1;
                    while (true) {
                        i6++;
                        if (i6 < 1) {
                            this.iFld1 |= i10;
                            iFld2 <<= i;
                            instanceCount = ((float) instanceCount) + (((i6 * i4) + f) - i6);
                        } else {
                            iFld2 += i4;
                            try {
                                i = this.iArrFld[(i4 >>> 1) % N] % (-26660);
                                int i11 = (-1347803591) % this.iArrFld[i4];
                                int i12 = this.iArrFld[i10 - 1] % 43404;
                            } catch (ArithmeticException e) {
                            }
                            i3 = i6;
                            instanceCount ^= -10457;
                            this.byFld = (byte) (this.byFld * ((byte) this.iFld1));
                            switch (((i4 % 2) * 5) + 57) {
                                case 62:
                                    this.byFld = (byte) (this.byFld - ((byte) i8));
                                    break;
                                case 67:
                                    i7 = 1;
                                    while (i7 < 1) {
                                        switch ((i4 % 9) + 42) {
                                            case 42:
                                                i8 |= i5;
                                                long[] jArr2 = lArrFld;
                                                int i13 = i4 - 1;
                                                jArr2[i13] = jArr2[i13] * i;
                                                iFld2 -= (int) instanceCount;
                                                if (bFld) {
                                                }
                                                break;
                                            case 43:
                                                i3 += i7;
                                                break;
                                            case 44:
                                                instanceCount = instanceCount;
                                                break;
                                            case 45:
                                                i3 += i7 ^ i3;
                                                break;
                                            case 46:
                                                try {
                                                    i3 = (-203) % this.iArrFld[i7];
                                                    this.iFld1 = (-42918) % iFld2;
                                                    iFld = (-20938) / i8;
                                                    break;
                                                } catch (ArithmeticException e2) {
                                                    break;
                                                }
                                            case 47:
                                                i += i7;
                                                break;
                                            case 48:
                                                f += i7 * i7;
                                                break;
                                            case 49:
                                            case 50:
                                                i5 += i7 | i5;
                                                break;
                                        }
                                        i7++;
                                    }
                                    break;
                                default:
                                    f += (((float) (i4 * instanceCount)) + f) - i2;
                                    break;
                            }
                            i4++;
                        }
                    }
                }
            } else if (bFld) {
                dArrFld[i10 + 1] = -53033.0d;
            } else if (bFld) {
                i5 >>= 64;
            }
            i10--;
        }
        FuzzerUtils.out.println("i20 i21 i22 = " + i10 + "," + i + "," + i2);
        FuzzerUtils.out.println("i23 i24 i25 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("i26 f3 i27 = " + i6 + "," + Float.floatToIntBits(f) + "," + i7);
        FuzzerUtils.out.println("i28 = " + i8);
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        int i14 = iFld;
        short s = this.sFld;
        printStream.println("Test.instanceCount Test.iFld sFld = " + j + "," + printStream + "," + i14);
        PrintStream printStream2 = FuzzerUtils.out;
        int i15 = this.iFld1;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        Double.doubleToLongBits(this.dFld1);
        printStream2.println("iFld1 Test.dFld dFld1 = " + i15 + "," + doubleToLongBits + "," + printStream2);
        FuzzerUtils.out.println("byFld Test.sFld1 Test.bFld = " + this.byFld + "," + sFld1 + "," + (bFld));
        PrintStream printStream3 = FuzzerUtils.out;
        int i16 = iFld2;
        long checkSum = FuzzerUtils.checkSum(lArrFld);
        FuzzerUtils.checkSum(this.iArrFld);
        printStream3.println("Test.iFld2 Test.lArrFld iArrFld = " + i16 + "," + checkSum + "," + printStream3);
        PrintStream printStream4 = FuzzerUtils.out;
        long doubleToLongBits2 = Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld));
        Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld));
        printStream4.println("fArrFld Test.dArrFld = " + doubleToLongBits2 + "," + printStream4);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
