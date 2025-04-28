

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_78/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_78/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public volatile int iFld = -35510;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long iMeth_check_sum;
    public static long instanceCount = 13;
    public static double dFld = -51.79858d;
    public static final int N = 400;
    public static short[][] sArrFld = new short[N][N];

    static {
        FuzzerUtils.init(sArrFld, (short) -16302);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static int iMeth(boolean z) {
        int i = -37574;
        int i2 = 1;
        int i3 = 0;
        int[] iArr = new int[N];
        short s = -30958;
        double[] dArr = new double[N];
        FuzzerUtils.init(iArr, 158);
        FuzzerUtils.init(dArr, -30.1411d);
        instanceCount = instanceCount;
        int i4 = 16;
        while (i4 < 281) {
            i = 6;
            while (i > 1) {
                i2 = i2;
                i3 = 1;
                do {
                    i2 -= 10;
                    i3++;
                } while (i3 < 3);
                iArr[311] = (int) instanceCount;
                if (z) {
                }
                i -= 2;
            }
            dArr[i4 - 1] = 109;
            s = (short) (s + 19863);
            int i5 = i2 * ((int) 89.98137d);
            iArr[i4] = i4;
            int i6 = i3;
            i2 = ((int) (i6 + (((i4 * 0.888f) + i6) - i6))) | i;
            i4++;
        }
        long doubleToLongBits = (z ? 1 : 0) + i4 + 109 + i + i2 + i3 + s + Double.doubleToLongBits(89.98137d) + Float.floatToIntBits(0.888f) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth1(int i) {
        int i2 = 9;
        int i3 = -13;
        int i4 = -197;
        int[] iArr = new int[N];
        byte[] bArr = new byte[N];
        FuzzerUtils.init(iArr, -12);
        FuzzerUtils.init(bArr, (byte) 73);
        int i5 = 5;
        while (i5 < 226) {
            i = iMeth(true) - ((int) instanceCount);
            switch ((i5 % 4) + 76) {
                case 76:
                    i = 4;
                    break;
                case 78:
                    i3 = 1;
                    while (7 > i3) {
                        instanceCount -= i2;
                        i4 = (int) (i4 + (((i3 * instanceCount) + i3) - instanceCount));
                        i2 = i4;
                        dFld = i;
                        i3 += 2;
                    }
                    short[] sArr = sArrFld[i5 - 1];
                    int i6 = i5;
                    sArr[i6] = (short) (sArr[i6] << ((short) i2));
                    continue;
                case 79:
                    instanceCount = instanceCount;
                    int i7 = i5 - 1;
                    bArr[i7] = (byte) (bArr[i7] * ((byte) i4));
                    continue;
            }
            iArr[i5 - 1] = i5;
            i -= (int) 0.561f;
            i5++;
        }
        vMeth1_check_sum += i + i5 + i2 + (1 != 0 ? 1 : 0) + Float.floatToIntBits(0.561f) + i3 + i4 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
    }

    public void vMeth(int i, int i2, int i3) {
        int i4 = 63009;
        int[] iArr = new int[N];
        byte b = 101;
        double[] dArr = new double[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(dArr, 1.74753d);
        FuzzerUtils.init(iArr, 5);
        FuzzerUtils.init(jArr, 104L);
        vMeth1(i3);
        float f = 117.72f * i;
        int i5 = 9;
        while (i5 < 309) {
            f -= -4;
            this.iFld *= i5;
            i4 = 1;
            while (i4 < 6) {
                dArr[i5] = dArr[r1] - 4;
                f -= 12.0f;
                iArr[i4 + 1] = -4;
                b = (byte) (b + ((byte) instanceCount));
                instanceCount += ((i4 * instanceCount) - 4) - b;
                i4++;
            }
            instanceCount /= i5 | 1;
            i2 = -20;
            i5++;
        }
        vMeth_check_sum += (((((((((i + i2) + 4968) + Float.floatToIntBits(f)) + i5) - 4) + i4) - 3) + b) - 20) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [int] */
    public void mainTest(String[] strArr) {
        long[] jArr = new long[N];
        int i = -10;
        int i2 = -3;
        int i3 = -11;
        int i4 = 3;
        byte b = 107;
        int i5 = 110;
        int i6 = -26101;
        int[] iArr = new int[N];
        boolean z = false;
        FuzzerUtils.init(jArr, 1878158773807813253L);
        FuzzerUtils.init(iArr, -4);
        byte b2 = (byte) jArr[(this.iFld >>> 1) % N];
        vMeth(-7169, this.iFld, this.iFld);
        long j = 3;
        while (true) {
            long j2 = j;
            if (337 > j2) {
                float f = (-1.868f) - this.iFld;
                instanceCount -= 9;
                i2 = 2;
                boolean z2 = z;
                while (i2 < 75) {
                    i += i2 * i2;
                    i4 = 1;
                    boolean z3 = z2;
                    while (i4 < 2 && !z3) {
                        b = b2;
                        try {
                            this.iFld = (-133) % i2;
                            int i7 = (-510238578) / iArr[i4 - 1];
                            int i8 = (-179) % this.iFld;
                        } catch (ArithmeticException e) {
                        }
                        i3 = i;
                        if (z3) {
                            break;
                        }
                        z3 = z3;
                        int i9 = b - b;
                        b = (i9 ^ i9) == true ? 1 : 0;
                        i4++;
                    }
                    int i10 = (i2 >>> 1) % N;
                    iArr[i10] = iArr[i10] - ((int) j2);
                    instanceCount >>>= (int) instanceCount;
                    this.iFld -= (int) f;
                    f = (float) dFld;
                    i2++;
                    z2 = z3;
                }
                i5 = 75;
                while (true) {
                    i5--;
                    if (i5 > 0) {
                        this.iFld = b;
                        i6 = 1;
                        while (1 > i6) {
                            this.iFld -= this.iFld;
                            b2 = (byte) (b2 ^ ((byte) i3));
                            switch (((i6 % 1) * 5) + 28) {
                                case 29:
                                default:
                                    i6++;
                            }
                        }
                        int i11 = b << (-13);
                        b = -11003;
                        this.iFld *= i;
                    }
                }
                b >>>= -39458;
                j = j2 + 1;
                z = z2;
            } else {
                PrintStream printStream = FuzzerUtils.out;
                printStream.println("by l1 i19 = " + b2 + "," + j2 + "," + printStream);
                FuzzerUtils.out.println("i20 i21 i22 = " + i2 + "," + i3 + "," + i4);
                FuzzerUtils.out.println("i23 b2 i24 = " + b + "," + (z) + "," + i5);
                FuzzerUtils.out.println("i25 i26 s1 = " + i6 + "," + 46322 + "," + (-11003));
                PrintStream printStream2 = FuzzerUtils.out;
                long checkSum = FuzzerUtils.checkSum(jArr);
                FuzzerUtils.checkSum(iArr);
                printStream2.println("lArr iArr3 = " + checkSum + "," + printStream2);
                PrintStream printStream3 = FuzzerUtils.out;
                long j3 = instanceCount;
                int i12 = this.iFld;
                Double.doubleToLongBits(dFld);
                printStream3.println("Test.instanceCount iFld Test.dFld = " + j3 + "," + printStream3 + "," + i12);
                FuzzerUtils.out.println("Test.sArrFld = " + FuzzerUtils.checkSum(sArrFld));
                FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
                FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
                FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
