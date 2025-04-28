

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_80/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_80/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public float[] fArrFld = new float[N];
    public static long iMeth_check_sum;
    public static long lMeth_check_sum;
    public static long vMeth_check_sum;
    public static long instanceCount = 215246253;
    public static int iFld = -1798;
    public static volatile float fFld = 0.329f;
    public static volatile byte byFld = -16;
    public static final int N = 400;
    public static volatile long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(lArrFld, 7688652982565888386L);
        iMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }

    public static void vMeth(long j) {
        int i;
        float f = -1.836f;
        int i2 = -13;
        int i3 = 33266;
        int[] iArr = new int[N];
        byte b = -86;
        FuzzerUtils.init(iArr, 156);
        iFld = 140;
        iFld *= (int) (-1.836f);
        int i4 = 1;
        do {
            i = 1;
            while (7 > i) {
                iFld >>>= 47414;
                i2 = 1;
                while (i2 < 2) {
                    i3 += i2 * i2;
                    iFld += (int) ((-19) + (i2 * i2));
                    b = (byte) instanceCount;
                    j += ((i2 * 47414) + i) - i3;
                    int i5 = i;
                    iArr[i5] = iArr[i5] + i2;
                    iArr[i2 + 1] = iFld;
                    i2++;
                }
                i++;
            }
            i4++;
        } while (i4 < 234);
        int i6 = 8;
        while (i6 < 142) {
            f += (float) 7.2901d;
            if (0 != 0) {
            }
            i6++;
        }
        vMeth_check_sum += j + Float.floatToIntBits(f) + i4 + i + 47414 + i2 + i3 + b + i6 + 70 + Double.doubleToLongBits(7.2901d) + (0 != 0 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth() {
        int i = 15;
        int i2 = -158;
        int i3 = 3;
        int[] iArr = new int[N];
        float f = -2.108f;
        float f2 = 49.431f;
        byte b = -62;
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, 73.48672d);
        FuzzerUtils.init(iArr, 14);
        iFld = 127;
        vMeth(instanceCount);
        int i4 = 1;
        do {
            switch ((i4 % 10) + 125) {
                case 125:
                    i = 1;
                    while (i < 7) {
                        i2 += i2;
                        i++;
                    }
                    int i5 = i4 - 1;
                    dArr[i5] = dArr[i5] * iFld;
                case 126:
                    i2 = -11;
                    float f3 = 1.0f;
                    while (true) {
                        f = f3;
                        if (f >= 7.0f) {
                            break;
                        } else {
                            i2 *= i4;
                            instanceCount += i2;
                            if (1 != 0) {
                                instanceCount += f * f;
                                i3 >>= i2;
                            } else {
                                long[] jArr = lArrFld;
                                int i6 = i4;
                                jArr[i6] = jArr[i6] >>> i;
                            }
                            f3 = f + 1.0f;
                        }
                    }
                case 127:
                    long[] jArr2 = lArrFld;
                    int i7 = i4;
                    jArr2[i7] = jArr2[i7] >> ((int) instanceCount);
                    break;
                case 128:
                    iFld = iFld;
                    break;
                case 129:
                    f2 += i4 * f;
                    break;
                case 130:
                    int i8 = i4;
                    iArr[i8] = iArr[i8] - 57001;
                    break;
                case 131:
                    i3 <<= i3;
                case 132:
                    i3 = (int) (i3 + (((i4 * instanceCount) + i4) - i4));
                    break;
                case 133:
                    int i9 = i4;
                    iArr[i9] = iArr[i9] >> i4;
                    break;
                case 134:
                    b = (byte) (b + ((byte) i4));
                    break;
            }
            i4++;
        } while (i4 < 218);
        long floatToIntBits = i4 + i + i2 + Float.floatToIntBits(f) + i3 + (1 != 0 ? 1 : 0) + Float.floatToIntBits(f2) + b + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public static int iMeth() {
        long j;
        double d = 75.39982d;
        int i = 61;
        int i2 = -13;
        int i3 = 20;
        int[][] iArr = new int[N][N];
        long j2 = -3518364542L;
        short s = 25274;
        FuzzerUtils.init(iArr, 0);
        double d2 = 338.0d;
        while (true) {
            double d3 = d2;
            if (12.0d < d3) {
                if (0 != 0) {
                    switch ((((i >>> 1) % 2) * 5) + 78) {
                        case 79:
                            i += (int) (d3 * d3);
                            iFld += (int) (((d3 * instanceCount) + instanceCount) - instanceCount);
                            int[] iArr2 = iArr[(int) d3];
                            int i4 = (int) (d3 - 1.0d);
                            iArr2[i4] = iArr2[i4] * ((int) Math.max(lMeth(), instanceCount));
                            continue;
                        case 86:
                            d -= 37.400001525878906d;
                            j2 = 1;
                            do {
                                s = (short) (s * ((short) i));
                                i2 = 1;
                                while (i2 < 1) {
                                    iFld = (int) j2;
                                    iFld = -12;
                                    lArrFld = lArrFld;
                                    i3 = i2;
                                    if (0 != 0) {
                                    }
                                    i2++;
                                }
                                j = j2 + 1;
                                j2 = j;
                            } while (j < 5);
                    }
                    instanceCount = i2;
                } else {
                    i += (int) d3;
                }
                d2 = d3 - 1.0d;
            } else {
                long doubleToLongBits = Double.doubleToLongBits(d3) + i + Double.doubleToLongBits(d) + j2 + s + i2 + i3 + (0 != 0 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
                iMeth_check_sum += doubleToLongBits;
                return (int) doubleToLongBits;
            }
        }
    }

    public void mainTest(String[] strArr) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 24502);
        FuzzerUtils.out.println("i i1 d = " + (-21367) + "," + 213 + "," + Double.doubleToLongBits(20.82036d));
        FuzzerUtils.out.println("i16 i17 i18 = " + 5 + "," + ((-13) - 213) + "," + 48824);
        FuzzerUtils.out.println("i19 s1 iArr = " + 1 + "," + 23154 + "," + FuzzerUtils.checkSum(iArr));
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        int i = iFld;
        Float.floatToIntBits(fFld);
        printStream.println("Test.instanceCount Test.iFld Test.fFld = " + j + "," + printStream + "," + i);
        PrintStream printStream2 = FuzzerUtils.out;
        byte b = byFld;
        long doubleToLongBits = Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld));
        FuzzerUtils.checkSum(lArrFld);
        printStream2.println("Test.byFld fArrFld Test.lArrFld = " + b + "," + doubleToLongBits + "," + printStream2);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
