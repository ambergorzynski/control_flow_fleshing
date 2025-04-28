

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_73/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_73/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public double dFld = 8.83933d;
    public int iFld = 44292;
    public int iFld1 = 1;
    public double[] dArrFld = new double[N];
    public static long instanceCount = 167;
    public static float fFld = 40.638f;
    public static byte byFld = 43;
    public static boolean bFld = false;
    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d) {
        int i;
        int i2 = 161;
        int i3 = 9;
        int i4 = -10;
        int[] iArr = new int[N];
        boolean z = false;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -6806402445794829225L);
        FuzzerUtils.init(iArr, -5);
        int i5 = 1;
        do {
            i = 1;
            while (5 > i) {
                int i6 = i5;
                jArr[i6] = jArr[i6] - 4889710303079700949L;
                i3 = 2;
                while (i3 > 1) {
                    i4 <<= i4;
                    fFld += i3 * i3;
                    int i7 = i2 - 52039;
                    z = z;
                    instanceCount += i3;
                    switch (((i5 >>> 1) % 3) + 110) {
                        case 110:
                            i2 = 12;
                            int i8 = i3 - 1;
                            iArr[i8] = iArr[i8] >> 12;
                            break;
                        case 111:
                            instanceCount += i7;
                            instanceCount += i3 | i;
                            fFld += ((i3 * (-2299)) + fFld) - (-2299);
                        case 112:
                            i2 = i;
                            break;
                        default:
                            i2 = (int) instanceCount;
                            break;
                    }
                    i3--;
                }
                i++;
            }
            i5++;
        } while (i5 < 306);
        vMeth1_check_sum += (((((((Double.doubleToLongBits(d) + i5) + i) + i2) + i3) + i4) + (z ? 1 : 0)) - 2299) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr);
    }

    public static short sMeth() {
        int i = 4;
        int i2 = 39;
        int i3 = -236;
        byte[] bArr = new byte[N];
        FuzzerUtils.init(bArr, (byte) 44);
        int i4 = 59673 - 1;
        double d = 59673;
        vMeth1(d);
        int i5 = (i4 >>> 1) % N;
        bArr[i5] = (byte) (bArr[i5] >> ((byte) instanceCount));
        int i6 = (i4 ^ i4) * 2125877792;
        int i7 = 14;
        while (i7 < 238) {
            fFld += (float) d;
            if (bFld) {
                i6 = i6;
                byFld = (byte) (byFld + ((byte) i));
                i2 = 1;
                while (7 > i2) {
                    byFld = (byte) (byFld + ((byte) i));
                    i3 = 1;
                    i -= i;
                    i2++;
                }
            }
            i7++;
        }
        long doubleToLongBits = Double.doubleToLongBits(d) + i6 + i7 + i + i2 + i3 + FuzzerUtils.checkSum(bArr);
        sMeth_check_sum += doubleToLongBits;
        return (short) doubleToLongBits;
    }

    public void vMeth(int i) {
        int i2 = -13;
        int i3 = -128;
        int i4 = -71;
        int i5 = 42880;
        int[][][] iArr = new int[N][N][N];
        FuzzerUtils.init((Object[][]) iArr, (Object) (-146));
        int[] iArr2 = iArr[33][(i >>> 1) % N];
        int i6 = (i >>> 1) % N;
        iArr2[i6] = iArr2[i6] * 1;
        int i7 = i + 1;
        this.dFld -= i7;
        long sMeth = instanceCount + sMeth() + 97.845f;
        instanceCount = sMeth;
        int i8 = i7 | ((int) sMeth);
        int i9 = 5;
        while (i9 < 306) {
            i3 = 1;
            while (i3 < 5 && !bFld) {
                i2 += (int) instanceCount;
                fFld += i3 * i3;
                i5 = 1;
                while (2 > i5) {
                    this.iFld += this.iFld;
                    instanceCount = -12L;
                    i4 -= i3;
                    instanceCount = ((float) instanceCount) + (((i5 * i8) + i3) - fFld);
                    i8 = (int) (i8 + i5 + instanceCount);
                    fFld += 159.0f;
                    i5++;
                }
                i3++;
            }
            i9++;
        }
        vMeth_check_sum += i8 + i9 + i2 + i3 + i4 + i5 + 42 + FuzzerUtils.checkSum((Object[][]) iArr);
    }

    public void mainTest(String[] strArr) {
        int i = -10;
        int i2 = 36;
        int i3 = 14;
        int i4 = -59;
        int i5 = -10;
        int[] iArr = new int[N];
        double d = -1.4597d;
        short s = 28474;
        long[] jArr = new long[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(jArr, 0L);
        FuzzerUtils.init(fArr, 1.334f);
        FuzzerUtils.init(iArr, -38462);
        vMeth(5);
        int i6 = 11;
        while (i6 < 231) {
            this.dArrFld[i6] = this.iFld;
            this.iFld = 2104919056;
            jArr[i6 + 1] = this.iFld;
            i2 = 2;
            while (i2 < 343) {
                i += i2;
                this.dFld += instanceCount;
                instanceCount <<= byFld;
                i2++;
            }
            i4 = i6;
            while (343 > i4) {
                fArr = fArr;
                i = 206;
                instanceCount = i3;
                i5 = 1;
                while (i5 < 1) {
                    int i7 = i5;
                    iArr[i7] = iArr[i7] >> i3;
                    iArr[i5 - 1] = (int) fFld;
                    byFld = (byte) (-54743);
                    iArr[i5] = (int) instanceCount;
                    this.iFld += i5;
                    if (bFld) {
                        break;
                    }
                    int i8 = i5 + 1;
                    jArr[i8] = jArr[i8] * ((long) d);
                    switch ((i4 % 6) + 97) {
                        case 97:
                            instanceCount *= -37245;
                            s = (short) (s + ((short) (0 + (i5 * i5))));
                            try {
                                this.iFld1 = (-218309733) / i2;
                                iArr[i5] = i2 % (-14893);
                                this.iFld1 = (-17434640) % iArr[i4 + 1];
                            } catch (ArithmeticException e) {
                            }
                            instanceCount = ((float) instanceCount) + (((i5 * i3) + fFld) - (-54743));
                            break;
                        case 98:
                            fFld -= 149.0f;
                            d += i5;
                            i += (-244) + (i5 * i5);
                            this.iFld = -2098505100;
                            break;
                        case 99:
                            instanceCount += i5 * i5;
                            break;
                        case 100:
                            s = (short) (s - ((short) i4));
                            break;
                        case 101:
                            i3 = (int) instanceCount;
                            break;
                    }
                    i5++;
                }
                i4++;
            }
            i6 += 3;
        }
        FuzzerUtils.out.println("i17 i18 i19 = " + i6 + "," + i + "," + i2);
        FuzzerUtils.out.println("i20 i21 i22 = " + i3 + "," + i4 + "," + 206);
        FuzzerUtils.out.println("i23 i24 d2 = " + i5 + "," + (-54743) + "," + Double.doubleToLongBits(d));
        PrintStream printStream = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(jArr);
        Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        printStream.println("s1 lArr1 fArr = " + s + "," + checkSum + "," + printStream);
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr));
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        long doubleToLongBits = Double.doubleToLongBits(this.dFld);
        Float.floatToIntBits(fFld);
        printStream2.println("Test.instanceCount dFld Test.fFld = " + j + "," + printStream2 + "," + doubleToLongBits);
        FuzzerUtils.out.println("Test.byFld Test.bFld iFld = " + byFld + "," + (bFld) + "," + this.iFld);
        FuzzerUtils.out.println("iFld1 dArrFld = " + this.iFld1 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(this.dArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
