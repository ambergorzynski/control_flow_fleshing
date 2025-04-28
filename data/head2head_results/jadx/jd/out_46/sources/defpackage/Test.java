

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_46/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_46/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public boolean bFld = true;
    public double[] dArrFld = new double[N];
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long vMeth_check_sum;
    public static long instanceCount = -5282731952868115069L;
    public static float fFld = -35.322f;
    public static long lFld = 1339813621;
    public static short sFld = 10181;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static volatile short[] sArrFld = new short[N];
    public static volatile byte[] byArrFld = new byte[N];

    static {
        FuzzerUtils.init(iArrFld, 55128);
        FuzzerUtils.init(sArrFld, (short) 29345);
        FuzzerUtils.init(byArrFld, (byte) -10);
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
        vMeth_check_sum = 0L;
    }

    public static void vMeth(long j, long j2, double d) {
        int i = 6;
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        float[][] fArr = new float[N][N];
        FuzzerUtils.init(jArr, -5938807188903259100L);
        FuzzerUtils.init(fArr, 0.604f);
        FuzzerUtils.init(iArr, -124);
        instanceCount += fFld;
        int i2 = 1;
        while (i2 < 387) {
            jArr[i2 + 1] = 127;
            fArr[i2 + 1][i2] = (float) j2;
            d += 34554.0d;
            j = j + i2 + (i2 * i2) + i2;
            if (1 != 0) {
                i = (i - 152) + i2;
            }
            i += i2 * i2;
            i2++;
        }
        float[] fArr2 = fArr[(i >>> 1) % N];
        int i3 = (i2 >>> 1) % N;
        fArr2[i3] = fArr2[i3] * i;
        vMeth_check_sum += j + j2 + Double.doubleToLongBits(d) + i2 + (i >> i) + FuzzerUtils.checkSum(jArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1() {
        int i = 35;
        int i2 = -4;
        int i3 = -59085;
        int i4 = 132;
        int i5 = -60836;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -2L);
        vMeth(instanceCount, instanceCount, -127.85523d);
        iArrFld = iArrFld;
        int i6 = 6;
        while (i6 < 224) {
            i2 = 1;
            while (7 > i2) {
                i3 = (int) instanceCount;
                i4 = 1;
                while (i4 < 2) {
                    int i7 = i3 & (-1478975991);
                    i5 = (int) (i5 + (((i4 * fFld) + 9) - 9));
                    i3 = i2 + ((int) fFld);
                    i4++;
                }
                lFld <<= -2;
                int i8 = i6;
                jArr[i8] = jArr[i8] - lFld;
                i5 += i2 * i2;
                i2++;
            }
            i3 *= -2;
            i += i6 * i6;
            i6++;
        }
        long doubleToLongBits = Double.doubleToLongBits(-127.85523d) + i6 + i + i2 + i3 + i4 + i5 + 9 + FuzzerUtils.checkSum(jArr);
        iMeth1_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public int iMeth(int i, long j, double d) {
        int i2 = -146;
        int i3 = 176;
        int i4 = -173;
        int i5 = 64611;
        int i6 = -67;
        byte b = 92;
        instanceCount <<= iMeth1();
        int i7 = 174;
        while (i7 > 1) {
            i3 = 1;
            do {
                fFld -= fFld;
                i3++;
            } while (i3 < 9);
            lFld *= -1;
            this.dArrFld[i7 + 1] = i2;
            try {
                i /= iArrFld[i7 - 1];
                iArrFld[i7] = (-56) / i7;
                i2 = (-916338267) % iArrFld[i7 + 1];
            } catch (ArithmeticException e) {
            }
            i4 = 1;
            while (i4 < 9) {
                j -= (long) d;
                i5 -= i2;
                i4++;
            }
            b = (byte) (b - ((byte) i));
            i7--;
        }
        for (short s : sArrFld) {
            i6 = 1;
            while (i6 < 4) {
                fFld -= i5;
                instanceCount = i7;
                i6++;
            }
        }
        long doubleToLongBits = i + j + Double.doubleToLongBits(d) + i7 + i2 + i3 + i4 + i5 + b + i6 + 198;
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public void mainTest(String[] strArr) {
        int i = -38097;
        int i2 = 25773;
        int i3 = -145;
        int i4 = -50966;
        int i5 = -49034;
        int i6 = 49193;
        int i7 = 0;
        int i8 = 46206;
        int i9 = -64721;
        long[] jArr = new long[N];
        boolean[] zArr = new boolean[N];
        FuzzerUtils.init(jArr, 4682269006106612412L);
        FuzzerUtils.init(zArr, false);
        jArr[((-38097) >>> 1) % N] = iMeth(-38097, instanceCount, -2.93149d);
        for (int i10 = 14; i10 < 229; i10++) {
            i2++;
            i3 = 7;
            while (i3 < 117) {
                i <<= i10;
                int i11 = 13;
                i5 = 2;
                while (i5 > 1) {
                    this.bFld = this.bFld;
                    fFld -= i2;
                    i11 += i5 * i5;
                    lFld -= 32;
                    zArr[i3 - 1] = this.bFld;
                    sFld = (short) (sFld << 43);
                    i5--;
                }
                fFld += (float) instanceCount;
                byArrFld = byArrFld;
                i4 = i;
                instanceCount -= sFld;
                i3++;
            }
            i4 >>= i3;
            i7 = 3;
            while (i7 < 117) {
                lFld |= 28080;
                i8 <<= (int) instanceCount;
                i4 -= i4;
                try {
                    i = ((-49864) % i4) % (-32168);
                    i6 = i7 / i5;
                } catch (ArithmeticException e) {
                }
                sFld = (short) i10;
                int[] iArr = iArrFld;
                int i12 = i10 + 1;
                iArr[i12] = iArr[i12] + ((int) fFld);
                i9 = 1;
                while (2 > i9) {
                    i6 = -9;
                    i8 = 0;
                    short[] sArr = sArrFld;
                    int i13 = i10 - 1;
                    sArr[i13] = (short) (sArr[i13] * ((short) lFld));
                    i9++;
                }
                i7++;
            }
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i d3 i18 = " + i + "," + Double.doubleToLongBits(-2.93149d) + "," + printStream);
        FuzzerUtils.out.println("i19 i20 i21 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i22 i23 by3 = " + i5 + "," + i6 + "," + 32);
        FuzzerUtils.out.println("i24 i25 i26 = " + i7 + "," + i8 + "," + i9);
        PrintStream printStream2 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(jArr);
        FuzzerUtils.checkSum(zArr);
        printStream2.println("i27 lArr bArr = " + 9 + "," + checkSum + "," + printStream2);
        PrintStream printStream3 = FuzzerUtils.out;
        long j = instanceCount;
        int floatToIntBits = Float.floatToIntBits(fFld);
        long j2 = lFld;
        printStream3.println("Test.instanceCount Test.fFld Test.lFld = " + j + "," + printStream3 + "," + floatToIntBits);
        FuzzerUtils.out.println("bFld Test.sFld Test.iArrFld = " + (this.bFld) + "," + sFld + "," + FuzzerUtils.checkSum(iArrFld));
        PrintStream printStream4 = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(FuzzerUtils.checkSum(this.dArrFld));
        long checkSum2 = FuzzerUtils.checkSum(sArrFld);
        FuzzerUtils.checkSum(byArrFld);
        printStream4.println("dArrFld Test.sArrFld Test.byArrFld = " + doubleToLongBits + "," + printStream4 + "," + checkSum2);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
