

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_67/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_67/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long lMeth_check_sum;
    public static long vMeth2_check_sum;
    public static long instanceCount = -6;
    public static short sFld = -10842;
    public static byte byFld = -99;
    public static double dFld = -2.128444d;
    public static int iFld = -58315;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static float[] fArrFld = new float[N];
    public static long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(iArrFld, -9);
        FuzzerUtils.init(fArrFld, 36.785f);
        FuzzerUtils.init(lArrFld, -4102120465L);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        lMeth_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }

    public void vMeth1(long j, int i, float f) {
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, -2.1f);
        int i2 = (i >>> 1) % N;
        long j2 = (instanceCount + 3253) - (j - byFld);
        int[] iArr = iArrFld;
        int i3 = (i >>> 1) % N;
        int i4 = iArr[i3] + ((int) dFld);
        iArr[i3] = i4;
        fArr[i2] = (float) (j2 + i4);
        vMeth1_check_sum += j + i + Float.floatToIntBits(f) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void vMeth2(int i, long j, long j2) {
        int i2 = -18870;
        int i3 = 195;
        int i4 = 228;
        byte b = 124;
        switch ((((i >>> 1) % 9) * 5) + 101) {
            case 102:
                b = (byte) i;
                break;
            case 106:
                j -= 195;
                break;
            case 107:
                j2 = i;
                i2 = 19;
                while (i2 < 391 && 0 == 0) {
                    int[] iArr = iArrFld;
                    int i5 = i2 - 1;
                    iArr[i5] = iArr[i5] >> ((int) j);
                    i = (int) (i + (((i2 * 0.852f) + i2) - 0.852f));
                    i2++;
                }
                b = (byte) (124 + 95);
                break;
            case 116:
                int[] iArr2 = iArrFld;
                iArr2[6] = iArr2[6] - i;
                j -= instanceCount;
                break;
            case 119:
                i3 = 195 >> i;
                break;
            case 133:
                i4 = 1;
                do {
                    try {
                        iArrFld[i4 + 1] = (-18870) % i4;
                        i = 103 % (-18870);
                        iArrFld[i4 - 1] = 133 % i4;
                    } catch (ArithmeticException e) {
                    }
                    int[] iArr3 = iArrFld;
                    int i6 = i4;
                    iArr3[i6] = iArr3[i6] + i4;
                    i = (i / (195 | 1)) + (-77) + (i4 * i4);
                    i4++;
                } while (i4 < 368);
                fArrFld[46] = (float) j;
                iArrFld = iArrFld;
                long[] jArr = lArrFld;
                int i7 = (195 >>> 1) % N;
                jArr[i7] = jArr[i7] * instanceCount;
                break;
            case 134:
                iArrFld = iArrFld;
                long[] jArr2 = lArrFld;
                int i72 = (195 >>> 1) % N;
                jArr2[i72] = jArr2[i72] * instanceCount;
                break;
            case 139:
                long[] jArr22 = lArrFld;
                int i722 = (195 >>> 1) % N;
                jArr22[i722] = jArr22[i722] * instanceCount;
                break;
            case 145:
                fArrFld[46] = (float) j;
                iArrFld = iArrFld;
                long[] jArr222 = lArrFld;
                int i7222 = (195 >>> 1) % N;
                jArr222[i7222] = jArr222[i7222] * instanceCount;
                break;
        }
        vMeth2_check_sum += i + j + j2 + i2 + i3 + (0 != 0 ? 1 : 0) + Float.floatToIntBits(0.852f) + b + i4;
    }

    public static long lMeth(byte b, long j) {
        int i = -5;
        int i2 = -11;
        int i3 = -55434;
        float f = -2.297f;
        vMeth2(-5, 3218347585420365933L, instanceCount);
        int i4 = 7;
        while (i4 < 363) {
            switch (((i4 % 2) * 5) + 118) {
                case 122:
                case 124:
                    i2 = i4;
                    i3 = 1;
                    while (i3 < 5) {
                        float f2 = f - i2;
                        sFld = (short) (sFld >> ((short) i3));
                        switch ((i3 % 2) + 43) {
                            case 43:
                                i += (int) instanceCount;
                                break;
                            case 44:
                                i += ((i3 * i3) + i4) - i3;
                            default:
                                i += i3;
                                int i5 = i2 + sFld;
                                i2 = i4;
                                break;
                        }
                        f = f2;
                        j -= f;
                        i3++;
                    }
                    break;
            }
            i4++;
        }
        long floatToIntBits = b + j + i + i4 + i2 + i3 + 12 + Float.floatToIntBits(f);
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public void vMeth(boolean z, int i) {
        double d = 29.55081d;
        int i2 = -64795;
        int i3 = 232;
        float f = -1.623f;
        for (int i4 : iArrFld) {
            short s = (short) (sFld - 1);
            sFld = s;
            instanceCount = s;
            vMeth1(lMeth(byFld, instanceCount), i4, 20.211f);
            dFld -= instanceCount;
            long[] jArr = lArrFld;
            int i5 = (i4 >>> 1) % N;
            jArr[i5] = jArr[i5] + 11;
            int i6 = i4 + i4;
            double d2 = 1.0d;
            while (true) {
                d = d2;
                if (d < 4.0d) {
                    i2 = 1;
                    while (i2 < 2) {
                        byFld = (byte) instanceCount;
                        f += 0 + (i2 * i2);
                        iArrFld = iArrFld;
                        byFld = (byte) (byFld + ((byte) (((i2 * (-7727)) + i2) - instanceCount)));
                        instanceCount = 0L;
                        i3 += i6;
                        i6 <<= i2;
                        i2++;
                    }
                    d2 = d + 1.0d;
                }
            }
        }
        vMeth_check_sum += ((((z ? 1 : 0) + i) + Double.doubleToLongBits(d)) - 7727) + i2 + i3 + Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr) {
        int i = 22322;
        int i2 = -4;
        int i3 = 2;
        long j = -245;
        float f = -16.929f;
        boolean z = false;
        byte[] bArr = new byte[N];
        FuzzerUtils.init(bArr, (byte) -99);
        long j2 = instanceCount + 1;
        instanceCount = j2;
        int i4 = (int) (-j2);
        int i5 = 22;
        while (i5 < 365) {
            long j3 = 1;
            while (true) {
                j = j3;
                if (73 > j) {
                    i3 = 1;
                    do {
                        i4++;
                        f = i4;
                        i = (int) (i + (((i3 * f) + ((float) j)) - ((float) instanceCount)));
                        int i6 = i3 - 1;
                        bArr[i6] = (byte) (bArr[i6] - ((byte) i2));
                        switch (((i >>> 1) % 6) + 65) {
                            case 65:
                                iArrFld = FuzzerUtils.int1array(N, -40);
                                instanceCount += (-5) + (i3 * i3);
                                z = z;
                                break;
                            case 66:
                                i += i3;
                                break;
                            case 67:
                                lArrFld = lArrFld;
                                instanceCount = i2;
                                switch ((int) (((j % 2) * 5) + 84)) {
                                    case 86:
                                        i4 = (int) instanceCount;
                                        i -= i5;
                                        i2 = (int) (i2 + i3 + f);
                                        break;
                                    case 91:
                                        long[] jArr = lArrFld;
                                        int i7 = (int) j;
                                        jArr[i7] = jArr[i7] + sFld;
                                        break;
                                }
                                int i8 = i3 + 1;
                                bArr[i8] = (byte) (bArr[i8] + ((byte) instanceCount));
                                break;
                            case 68:
                                i <<= i5;
                                iFld = (int) (iFld + (((i3 * instanceCount) + j) - instanceCount));
                            case 69:
                                instanceCount += ((i3 * i2) + j) - i3;
                            case 70:
                                iFld = iFld;
                                byFld = (byte) (byFld / ((byte) (i3 | 1)));
                                instanceCount += i3 + instanceCount;
                                break;
                        }
                        i3++;
                    } while (i3 < 2);
                    j3 = j + 1;
                }
            }
            i5++;
        }
        FuzzerUtils.out.println("i i1 i2 = " + i4 + "," + i5 + "," + i);
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("l i3 i4 = " + j + "," + printStream + "," + i2);
        FuzzerUtils.out.println("f b2 byArr = " + Float.floatToIntBits(f) + "," + (z) + "," + FuzzerUtils.checkSum(bArr));
        PrintStream printStream2 = FuzzerUtils.out;
        long j4 = instanceCount;
        short s = sFld;
        byte b = byFld;
        printStream2.println("Test.instanceCount Test.sFld Test.byFld = " + j4 + "," + printStream2 + "," + s);
        PrintStream printStream3 = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        int i9 = iFld;
        FuzzerUtils.checkSum(iArrFld);
        printStream3.println("Test.dFld Test.iFld Test.iArrFld = " + doubleToLongBits + "," + printStream3 + "," + i9);
        PrintStream printStream4 = FuzzerUtils.out;
        long doubleToLongBits2 = Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld));
        FuzzerUtils.checkSum(lArrFld);
        printStream4.println("Test.fArrFld Test.lArrFld = " + doubleToLongBits2 + "," + printStream4);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
