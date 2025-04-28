

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_4/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_4/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public int[] iArrFld = new int[N];
    public boolean[] bArrFld = new boolean[N];
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long instanceCount = 6995260490916569061L;
    public static byte byFld = 41;
    public static short sFld = 1954;
    public static final int N = 400;
    public static float[] fArrFld = new float[N];

    static {
        FuzzerUtils.init(fArrFld, -1.896f);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
    }

    public static int iMeth1(int i, boolean z, double d) {
        int i2 = 7327;
        int i3 = -54350;
        int i4 = 1;
        int i5 = -48511;
        int[] iArr = new int[N];
        float f = 1.1023f;
        short s = -31219;
        long[][] jArr = new long[N][N];
        FuzzerUtils.init(iArr, -3);
        FuzzerUtils.init(jArr, 8939647224501505164L);
        int i6 = 13;
        while (i6 < 208) {
            i2 += 1701636588;
            i3 = 1;
            while (i3 < 8) {
                iArr = iArr;
                int i7 = i2 + (((i3 * i2) + i2) - i2);
                float f2 = 1.0f;
                while (true) {
                    f = f2;
                    if (f < 2.0f) {
                        s = (short) i7;
                        f2 = f + 1.0f;
                    }
                }
                jArr = jArr;
                i2 = (i7 - 12) >> i3;
                i3++;
            }
            i = (int) instanceCount;
            i4 += 60004;
            i5 = 77;
            i6++;
        }
        iArr[(i5 >>> 1) % N] = (int) f;
        long doubleToLongBits = i + (z ? 1 : 0) + Double.doubleToLongBits(d) + i6 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 + s + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr);
        iMeth1_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth(int i, int i2) {
        double d = 2.68918d;
        int i3 = -13;
        int i4 = -26863;
        int i5 = 12;
        int[] iArr = new int[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr, -32679);
        FuzzerUtils.init(fArr, 121.17f);
        int iMeth1 = i << iMeth1(i, true, 2.68918d);
        int i6 = 5;
        while (i6 < 132) {
            i2 = byFld;
            i6++;
        }
        int i7 = sFld;
        int i8 = 18;
        while (373 > i8) {
            i2 += i8;
            try {
                i2 = (-47) % iMeth1;
                i3 = ((-59946) / iMeth1) % iArr[i8 - 1];
            } catch (ArithmeticException e) {
            }
            d = -7.903014605837669E18d;
            i7 += i8 + i2;
            i8++;
        }
        int i9 = 136;
        while (5 < i9) {
            fArr[i9 + 1] = sFld;
            i4 *= iMeth1;
            i5 = 1;
            while (i5 < 35) {
                i7 = (int) instanceCount;
                instanceCount = i4;
                i5++;
            }
            i9 -= 3;
        }
        vMeth_check_sum += (((((((((((iMeth1 + i2) + (1 != 0 ? 1 : 0)) + Double.doubleToLongBits(d)) + i6) + i7) + i8) + i3) + i9) + i4) + i5) - 13) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public int iMeth(int i) {
        int i2;
        double[] dArr = new double[N];
        int i3 = -12;
        int i4 = 188;
        long[] jArr = new long[N];
        FuzzerUtils.init(dArr, 0.126478d);
        FuzzerUtils.init(jArr, -217L);
        vMeth(i, i);
        double d = 7.0d;
        while (true) {
            double d2 = d;
            if (d2 < 353.0d) {
                sFld = (short) (sFld - 1);
                switch ((int) ((d2 % 1.0d) + 9.0d)) {
                    case 9:
                        sFld = sFld;
                        this.iArrFld[(int) d2] = byFld;
                        jArr[(int) d2] = instanceCount;
                        break;
                }
                d = d2 + 1.0d;
            } else {
                int i5 = (int) instanceCount;
                int i6 = 1;
                do {
                    i2 = i6;
                    while (i2 < 4) {
                        i3 ^= i2;
                        i5 = (int) instanceCount;
                        i4 = 1;
                        while (i4 > 1) {
                            i += (int) ((-2655196376L) + (i4 * i4));
                            jArr[i4 + 1] = -1210732842;
                            i4 -= 3;
                        }
                        i2++;
                    }
                    i6++;
                } while (i6 < 388);
                long doubleToLongBits = (((((((i + Double.doubleToLongBits(d2)) + i5) + i6) + i2) + i3) + i4) - 34986) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(jArr);
                iMeth_check_sum += doubleToLongBits;
                return (int) doubleToLongBits;
            }
        }
    }

    public void mainTest(String[] strArr) {
        int i = -47694;
        int i2 = 212;
        int i3 = -6;
        int i4 = -4630;
        int i5 = -220;
        int i6 = -3;
        boolean z = false;
        double d = -60.100473d;
        float f = 82.467f;
        long[][] jArr = new long[N][N];
        FuzzerUtils.init(jArr, 15395L);
        instanceCount = iMeth(10);
        int i7 = 244;
        while (i7 > 6) {
            i2 = 106;
            while (true) {
                i2 -= 2;
                if (i2 > 0) {
                    z = z;
                    long[] jArr2 = jArr[i2 - 1];
                    int i8 = i7 + 1;
                    jArr2[i8] = jArr2[i8] | instanceCount;
                    this.iArrFld[i7] = i7;
                    this.iArrFld = FuzzerUtils.int1array(N, 47161);
                    instanceCount >>= i2;
                    float[] fArr = fArrFld;
                    int i9 = i7;
                    fArr[i9] = fArr[i9] + i2;
                    i = i2 + ((int) d);
                    i3 = 1;
                    while (2 > i3) {
                        if (!z) {
                            instanceCount += i3 ^ i3;
                            this.bArrFld[i7 + 1] = z;
                            i4 >>= (int) instanceCount;
                        }
                        i3++;
                    }
                    i4 = (int) instanceCount;
                }
            }
            int i10 = i7;
            this.iArrFld[i7 - 1] = sFld;
            d -= i7;
            byFld = (byte) 82.467f;
            instanceCount -= i2;
            i4 = i10 * i10;
            i7--;
        }
        int i11 = 13;
        while (i11 < 354) {
            i -= 33;
            i11++;
        }
        int i12 = 9;
        while (i12 < 321) {
            i6 = 1;
            do {
                f += (float) instanceCount;
                i5 = (i5 >> i11) + 1007079388;
                i6++;
            } while (i6 < 81);
            i12++;
        }
        FuzzerUtils.out.println("i23 i24 i25 = " + i7 + "," + i + "," + i2);
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("b2 d4 i26 = " + (z) + "," + Double.doubleToLongBits(d) + "," + printStream);
        FuzzerUtils.out.println("i27 f1 i29 = " + i4 + "," + Float.floatToIntBits(f) + "," + i11);
        FuzzerUtils.out.println("i30 i31 i32 = " + 1 + "," + i12 + "," + i5);
        FuzzerUtils.out.println("i33 lArr2 = " + i6 + "," + FuzzerUtils.checkSum(jArr));
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        byte b = byFld;
        short s = sFld;
        printStream2.println("Test.instanceCount Test.byFld Test.sFld = " + j + "," + printStream2 + "," + b);
        PrintStream printStream3 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(this.iArrFld);
        long doubleToLongBits = Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld));
        FuzzerUtils.checkSum(this.bArrFld);
        printStream3.println("iArrFld Test.fArrFld bArrFld = " + checkSum + "," + printStream3 + "," + doubleToLongBits);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
