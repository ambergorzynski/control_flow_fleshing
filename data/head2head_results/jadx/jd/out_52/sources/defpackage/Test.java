

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_52/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_52/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public int[][][] iArrFld = new int[N][N][N];
    public static long instanceCount = -7105456895305352589L;
    public static volatile boolean bFld = false;
    public static double dFld = -2.99432d;
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i) {
        int i2 = 8443;
        int i3 = -5;
        int i4 = -41468;
        int i5 = 16995;
        int[] iArr = new int[N];
        float f = -2.554f;
        short s = 6460;
        FuzzerUtils.init(iArr, 14);
        instanceCount *= 10;
        long j = 3 + ((long) 83.35386d);
        int i6 = 8;
        while (i6 < 369) {
            i2 = 1;
            while (i2 < 5) {
                i3 = (int) (i3 + (((i2 * f) + i6) - ((float) j)));
                s = (short) (s >> ((short) instanceCount));
                i = i;
                iArr = iArr;
                i2++;
            }
            long j2 = i3;
            f -= (float) instanceCount;
            j = -41448;
            i4 = 1;
            while (i4 < 5) {
                i5 = 1;
                while (i5 < 2) {
                    j *= i6;
                    f -= (float) 83.35386d;
                    i5++;
                }
                i4++;
            }
            i6++;
        }
        long doubleToLongBits = ((((((((((i + j) + Double.doubleToLongBits(83.35386d)) + i6) - 199) + i2) + i3) + Float.floatToIntBits(f)) + s) + i4) - 8) + i5 + 108 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static double dMeth(int i, int i2) {
        float f = 0.543f;
        int i3 = 34723;
        int i4 = 0;
        int i5 = 9;
        int i6 = -6608;
        short[] sArr = new short[N];
        FuzzerUtils.init(sArr, (short) -6649);
        if (bFld) {
            int i7 = (i >>> 1) % N;
            float f2 = 0.543f - 1.0f;
            f = f2;
            sArr[i7] = (short) (sArr[i7] * ((short) f2));
            i2 -= (int) (Math.max(iMeth(i), i2) + instanceCount);
            i3 = 12;
            while (i3 < 310) {
                i += i;
                int i8 = i4 - ((int) instanceCount);
                i5 = 1;
                while (i5 < 16) {
                    instanceCount = i6;
                    i6 -= 634524287;
                    f = (f * (-1.6947845E18f)) + 152 + (i5 * i5);
                    i2 -= i5;
                    instanceCount = i2;
                    i8 = i6;
                    i5++;
                }
                i4 = i8 - ((int) instanceCount);
                i3 += 3;
            }
        }
        long floatToIntBits = i + i2 + Float.floatToIntBits(f) + i3 + i4 + i5 + i6 + FuzzerUtils.checkSum(sArr);
        dMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public static void vMeth(int i, double d, long j) {
        int i2 = 0;
        int i3 = -11;
        int i4 = -21556;
        int i5 = -10;
        int i6 = 1;
        int i7 = 66;
        int[] iArr = new int[N];
        boolean z = false;
        float f = 2.622f;
        FuzzerUtils.init(iArr, -54178);
        int i8 = 2;
        while (i8 < 139) {
            z = dMeth(-22983, i) != ((double) (-22983));
            i2 = 1;
            while (i2 < 11) {
                i4 = 1;
                while (i4 < 3) {
                    float f2 = f - (-6.79279f);
                    d -= 22983;
                    i5 += 253;
                    f = (float) instanceCount;
                    i3 = 103;
                    i4++;
                }
                i6 = 1;
                while (i6 < 3) {
                    i5 >>>= 0;
                    i -= i7;
                    i7 += ((i6 * i) + i2) - i2;
                    z = z;
                    int i9 = i6;
                    iArr[i9] = iArr[i9] >> ((int) instanceCount);
                    i6++;
                }
                i2 += 2;
            }
            i8++;
        }
        vMeth_check_sum += ((((i + Double.doubleToLongBits(d)) + j) + i8) - 22983) + (z ? 1 : 0) + i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        long j;
        int i = -61530;
        int i2 = 2;
        int i3 = -6;
        int i4 = -9;
        int i5 = 8;
        int i6 = -11;
        int i7 = 9;
        int i8 = 14;
        int i9 = 15218;
        long j2 = -13;
        long[] jArr = new long[N];
        short s = 14670;
        double[] dArr = new double[N];
        FuzzerUtils.init(jArr, 1926585113L);
        FuzzerUtils.init(dArr, 105.101899d);
        vMeth(-61530, dFld, instanceCount);
        long j3 = 15;
        while (true) {
            j = j3;
            if (j >= 386) {
                break;
            }
            i *= i;
            i3 = 4;
            while (68 > i3) {
                instanceCount /= i4 | 1;
                i3++;
            }
            i2 = 56886;
            i4 += (int) j;
            int[] iArr = this.iArrFld[(int) (j - 1)][(int) (j + 1)];
            int i10 = (int) (j - 1);
            iArr[i10] = iArr[i10] * 9;
            i5 = 4;
            while (68 > i5) {
                int i11 = i5;
                jArr[i11] = jArr[i11] / (i | 1);
                i5++;
            }
            j3 = j + 1;
        }
        int i12 = 4;
        while (i12 < 174) {
            int[] iArr2 = this.iArrFld[(i3 >>> 1) % N][i12 + 1];
            int i13 = i12 - 1;
            iArr2[i13] = iArr2[i13] - s;
            i6 = i6 + ((int) ((-302364850467512982L) + (i12 * i12))) + ((int) dFld);
            instanceCount -= instanceCount;
            i7 = 2;
            while (i7 < 148) {
                long j4 = i7;
                while (true) {
                    j2 = j4;
                    if (j2 >= 2) {
                        break;
                    }
                    instanceCount = -7L;
                    s = (short) (s + s);
                    i2 += (int) (j2 * j2);
                    int[] iArr3 = this.iArrFld[i7 - 1][i7];
                    int i14 = (int) j2;
                    iArr3[i14] = iArr3[i14] * 107;
                    i8 >>= -152;
                    j4 = j2 + 1;
                }
                dArr[i12] = 13;
                int[] iArr4 = this.iArrFld[i12 - 1][i7 + 1];
                int i15 = i12;
                iArr4[i15] = iArr4[i15] + ((int) instanceCount);
                instanceCount = -52L;
                i9 = 1;
                while (i9 < 2) {
                    this.iArrFld[i7 - 1][6] = this.iArrFld[i9 - 1][i7 + 1];
                    int[] iArr5 = this.iArrFld[((-13) >>> 1) % N][i12 + 1];
                    int i16 = i12 + 1;
                    iArr5[i16] = iArr5[i16] - (-34);
                    jArr[i7] = instanceCount;
                    i9++;
                }
                i7++;
            }
            i12++;
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i24 l2 i25 = " + i + "," + j + "," + printStream);
        FuzzerUtils.out.println("i26 i27 i28 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("i29 i30 i31 = " + i6 + "," + i12 + "," + (-152));
        FuzzerUtils.out.println("s1 i32 i33 = " + s + "," + i7 + "," + 13);
        PrintStream printStream2 = FuzzerUtils.out;
        printStream2.println("l3 i34 i35 = " + j2 + "," + printStream2 + "," + i8);
        FuzzerUtils.out.println("i36 i37 by = " + 155 + "," + (-13) + "," + (-34));
        PrintStream printStream3 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(jArr);
        Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        printStream3.println("lArr dArr = " + checkSum + "," + printStream3);
        PrintStream printStream4 = FuzzerUtils.out;
        long j5 = instanceCount;
        boolean z = bFld;
        Double.doubleToLongBits(dFld);
        printStream4.println("Test.instanceCount Test.bFld Test.dFld = " + j5 + "," + printStream4 + "," + z);
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum((Object[][]) this.iArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
