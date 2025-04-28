

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_44/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_44/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public short[] sArrFld = new short[N];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long iMeth_check_sum;
    public static long instanceCount = 6938988444429917649L;
    public static int iFld = 5;
    public static short sFld = -19361;
    public static final int N = 400;
    public static int[][] iArrFld = new int[N][N];

    static {
        FuzzerUtils.init(iArrFld, -23795);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static int iMeth() {
        int i = -8;
        int i2 = 5;
        int[] iArr = new int[N];
        short s = 6242;
        byte b = -118;
        FuzzerUtils.init(iArr, -227);
        iArrFld[(iFld >>> 1) % N][46] = iFld;
        long j = 1;
        while (true) {
            long j2 = j;
            if (j2 >= 236) {
                long floatToIntBits = j2 + i + i2 + s + Float.floatToIntBits(0.272f) + b + FuzzerUtils.checkSum(iArr);
                iMeth_check_sum += floatToIntBits;
                return (int) floatToIntBits;
            }
            i2 = 1;
            do {
                instanceCount /= instanceCount | 1;
                try {
                    int i3 = (-1763133889) / i;
                    i = i3 % i3;
                    iFld = i / i2;
                } catch (ArithmeticException e) {
                }
                iFld = (int) instanceCount;
                iFld += i2;
                switch ((i2 % 9) + 24) {
                    case 24:
                        instanceCount -= j2;
                        iFld <<= s;
                        break;
                    case 25:
                        iArr = iArr;
                        i = ((int) (i + (((i2 * 0.272f) + iFld) - iFld))) * iFld;
                        break;
                    case 26:
                        int[] iArr2 = iArr;
                        int i4 = (int) (j2 - 1);
                        iArr2[i4] = iArr2[i4] - ((int) instanceCount);
                        iFld = i;
                    case 27:
                        iArr = iArrFld[i2];
                    case 28:
                        iArr[i2] = (int) j2;
                        break;
                    case 29:
                        b = (byte) (b + ((byte) i2));
                        break;
                    case 30:
                        iFld += i2 * i2;
                        break;
                    case 31:
                        i = (int) j2;
                    case 32:
                        s = (short) (s + ((short) i));
                    default:
                        s = (short) (s - 66);
                        break;
                }
                i2++;
            } while (i2 < 7);
            j = j2 + 1;
        }
    }

    public static void vMeth1(long j, long j2) {
        int[][] iArr = new int[N][N];
        FuzzerUtils.init(iArr, 3);
        int i = (iFld >>> 1) % N;
        int[][] iArr2 = iArrFld;
        int i2 = (iFld >>> 1) % N;
        int[] iArr3 = iArrFld[(iFld >>> 1) % N];
        iArr2[i2] = iArr3;
        iArr[i] = iArr3;
        iFld = iFld + 1;
        vMeth1_check_sum += (((55956 + j2) + Double.doubleToLongBits((-((-18.61242d) - (-12))) - (r1 * iMeth()))) - 12) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i) {
        int i2;
        int i3 = -45393;
        int i4 = -27;
        int i5 = 63531;
        float f = 1.667f;
        int[][] iArr = iArrFld;
        int i6 = (i >>> 1) % N;
        int[][] iArr2 = iArrFld;
        int i7 = (i >>> 1) % N;
        int[][] iArr3 = iArrFld;
        int i8 = (i >>> 1) % N;
        int[][] iArr4 = iArrFld;
        int i9 = (i >>> 1) % N;
        int[] iArr5 = iArrFld[(i >>> 1) % N];
        iArr4[i9] = iArr5;
        iArr3[i8] = iArr5;
        iArr2[i7] = iArr5;
        iArr[i6] = iArr5;
        int i10 = 1;
        do {
            i2 = 1;
            while (i2 < 5) {
                vMeth1(instanceCount, instanceCount);
                i4 = i10;
                while (i4 < 2) {
                    instanceCount = i;
                    instanceCount -= -174;
                    i4++;
                }
                if (i4 != 0) {
                    vMeth_check_sum += (((((((i + i10) + i2) + i3) + i4) + 14) + Float.floatToIntBits(f)) + i5) - 11542;
                    return;
                }
                try {
                    iFld = 12458 / i3;
                    iArrFld[i2 - 1][i2] = iArrFld[i10][i2 - 1] / 19133;
                    i3 = i / (-68);
                } catch (ArithmeticException e) {
                }
                instanceCount >>= i10;
                f = iFld;
                i5 = 1;
                while (i5 < 2) {
                    i3 = sFld;
                    i += i5 * i5;
                    i5++;
                }
                i2++;
            }
            i10++;
        } while (i10 < 327);
        vMeth_check_sum += (((((((i + i10) + i2) + i3) + i4) + 14) + Float.floatToIntBits(f)) + i5) - 11542;
    }

    public void mainTest(String[] strArr) {
        int i = -118;
        int i2 = 0;
        int i3 = 33463;
        int i4 = 95;
        int i5 = 22845;
        int i6 = -13967;
        int i7 = -36175;
        int i8 = -2;
        int[] iArr = new int[N];
        byte b = 36;
        FuzzerUtils.init(iArr, 63937);
        vMeth(iFld);
        float f = 122.578f - 122.578f;
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = iArr[i9];
            i = 3;
            while (i < 63) {
                b = (byte) (b * ((byte) i));
                i++;
            }
            int i11 = (iFld >>> 1) % N;
            iArr[i11] = iArr[i11] * iFld;
            i3 = 2;
            while (i3 < 63) {
                i2 = 135;
                i3++;
            }
            switch (((i4 >>> 1) % 8) + 90) {
                case 90:
                    try {
                        i5 = (-203) % iArrFld[375][(i10 >>> 1) % N];
                        i4 = i5 / (-62077);
                        iFld = 12357 / i10;
                    } catch (ArithmeticException e) {
                    }
                    instanceCount *= 166;
                    break;
                case 91:
                    i6 = 3;
                    while (63 > i6) {
                        i5 += (int) instanceCount;
                        iFld += i2;
                        i7 = 1;
                        while (i7 < 2) {
                            int i12 = i5 >> i8;
                            instanceCount -= -4268;
                            f += (float) instanceCount;
                            i8 = -10;
                            this.sArrFld[i6] = (short) (-4);
                            i2 = i2;
                            i10 >>= (int) instanceCount;
                            instanceCount = i6;
                            instanceCount = 13959L;
                            i5 = i12 - ((int) f);
                            i7++;
                        }
                        instanceCount += ((i6 * i7) + i8) - b;
                        instanceCount %= i4 | 1;
                        i6++;
                    }
                    instanceCount += sFld;
                    i5 -= i8;
                    break;
                case 92:
                    iArr[(i10 >>> 1) % N] = i2;
                    break;
                case 93:
                    try {
                        int i13 = (-11581) % i5;
                        i2 = iFld % (-136);
                        iArr[(i5 >>> 1) % N] = (-11) % (-33782);
                        break;
                    } catch (ArithmeticException e2) {
                        break;
                    }
                case 94:
                    i2 = (int) instanceCount;
                    break;
                case 95:
                    iArrFld[(i2 >>> 1) % N][390] = b;
                    break;
                case 96:
                    instanceCount += i7;
                    break;
                case 97:
                    int[] iArr2 = iArrFld[(i6 >>> 1) % N];
                    int i14 = (i7 >>> 1) % N;
                    iArr2[i14] = iArr2[i14] >> i7;
                    break;
            }
        }
        FuzzerUtils.out.println("f2 i12 i13 = " + Float.floatToIntBits(f) + "," + i + "," + i2);
        FuzzerUtils.out.println("by1 i14 i15 = " + b + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i16 i17 i18 = " + i5 + "," + i6 + "," + (-4));
        FuzzerUtils.out.println("i19 i20 i21 = " + i7 + "," + i8 + "," + (-11));
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr));
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        int i15 = iFld;
        short s = sFld;
        printStream.println("Test.instanceCount Test.iFld Test.sFld = " + j + "," + printStream + "," + i15);
        PrintStream printStream2 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        FuzzerUtils.checkSum(this.sArrFld);
        printStream2.println("Test.iArrFld sArrFld = " + checkSum + "," + printStream2);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
