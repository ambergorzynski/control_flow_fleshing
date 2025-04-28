

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_63/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_63/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public byte byFld = 92;
    public static long dMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long instanceCount = -179;
    public static boolean bFld = true;
    public static double dFld = -95.25769d;
    public static final int N = 400;
    public static long[] lArrFld = new long[N];
    public static int[][] iArrFld = new int[N][N];

    static {
        FuzzerUtils.init(lArrFld, 48732L);
        FuzzerUtils.init(iArrFld, 236);
        dMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }

    public static void vMeth(short s, int i, double d) {
        int i2;
        int i3 = 5117;
        byte b = 39;
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, 103.355d);
        int i4 = i + i;
        int i5 = 382;
        do {
            instanceCount |= 1;
            i4 = (int) (i4 + (i5 | (-1.665f)));
            bFld = bFld;
            i2 = 1;
            while (i2 < 4) {
                instanceCount += (-7553) + (i2 * i2);
                i4 += i3;
                if (!bFld) {
                    int i6 = i5;
                    dArr[i6] = dArr[i6] * i5;
                    i4 += i2 * i2;
                    d = -1.0d;
                    b = (byte) (b - ((byte) instanceCount));
                    i3 = s;
                    if (bFld) {
                        break;
                    }
                }
                i2++;
            }
            i5--;
        } while (i5 > 0);
        vMeth_check_sum += s + i4 + Double.doubleToLongBits(d) + i5 + Float.floatToIntBits(-1.665f) + i2 + i3 + b + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(long j, int i, double d) {
        vMeth((short) -18043, 214, d);
        instanceCount |= i;
        long doubleToLongBits = ((j + i) + Double.doubleToLongBits(d)) - 18043;
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public double dMeth(long j, int i) {
        int i2 = 199;
        int i3 = -27726;
        int i4 = -16656;
        int[] iArr = new int[N];
        double d = 62.12403d;
        FuzzerUtils.init(iArr, 12817);
        int i5 = 301;
        while (i5 > 6) {
            i2 = i - iMeth(instanceCount, i, dFld);
            i += ((i5 * this.byFld) + i) - i2;
            iArr[i5 + 1] = 48085;
            switch (((i5 % 5) * 5) + 121) {
                case 128:
                    i3 = (int) (i3 + (i5 ^ j));
                    continue;
                case 131:
                    if (bFld) {
                    }
                    continue;
                case 134:
                    double d2 = 1.0d;
                    while (true) {
                        d = d2;
                        if (d < 6.0d) {
                            i4 = 1;
                            do {
                                i3 += 9 + (i4 * i4);
                                i4 += 2;
                            } while (i4 < 2);
                            i3 = ((i3 - ((int) instanceCount)) >> i5) + i5;
                            d2 = d + 1.0d;
                        } else {
                            i3 += ((i5 * i2) + i4) - i5;
                            break;
                        }
                    }
                case 142:
                    break;
                case 146:
                    j *= (long) d;
                    continue;
            }
            instanceCount *= i5;
            this.byFld = (byte) (this.byFld & ((byte) i2));
            i5--;
        }
        long doubleToLongBits = j + i + i5 + i2 + Double.doubleToLongBits(d) + i3 + i4 + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += doubleToLongBits;
        return doubleToLongBits;
    }

    public void mainTest(String[] strArr) {
        int i = -24;
        int i2 = -13;
        int i3 = -37637;
        int i4 = 54690;
        int i5 = -129;
        int i6 = 207;
        float f = 0.929f;
        dMeth(instanceCount, -24);
        int i7 = 1;
        while (i7 < 137) {
            i2 = i7;
            instanceCount &= instanceCount;
            i3 = 9;
            while (i3 < 184) {
                int[] iArr = iArrFld[i7 - 1];
                int i8 = i3;
                iArr[i8] = iArr[i8] >> i2;
                i5 = 1;
                while (i5 < 2) {
                    int i9 = i2 >>> i;
                    switch ((i7 % 4) + 126) {
                        case 126:
                            iArrFld[i3 + 1] = iArrFld[i5];
                            float f2 = i6;
                            int i10 = i4 + i3;
                            i9 += (int) f2;
                            dFld = instanceCount;
                            f = f2 + 39262.0f;
                            break;
                        case 127:
                            i4 = i4 + (i5 * i5) + (i5 * i5);
                            instanceCount = i6;
                            i6 *= i7;
                        case 128:
                            int i11 = i4 + i5;
                            break;
                    }
                    i2 = i9 >>> i5;
                    i4 = 44450;
                    int[] iArr2 = iArrFld[i3];
                    int i12 = i7 - 1;
                    iArr2[i12] = iArr2[i12] << ((int) instanceCount);
                    i5++;
                }
                instanceCount *= i2;
                i6 = 35;
                instanceCount = this.byFld;
                i += (int) instanceCount;
                i2 = 27;
                i3++;
            }
            i7++;
        }
        FuzzerUtils.out.println("i10 i11 i12 = " + i + "," + i7 + "," + i2);
        FuzzerUtils.out.println("i13 i14 i15 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("i16 f1 = " + i6 + "," + Float.floatToIntBits(f));
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        boolean z = bFld;
        Double.doubleToLongBits(dFld);
        printStream.println("Test.instanceCount Test.bFld Test.dFld = " + j + "," + printStream + "," + z);
        PrintStream printStream2 = FuzzerUtils.out;
        byte b = this.byFld;
        long checkSum = FuzzerUtils.checkSum(lArrFld);
        FuzzerUtils.checkSum(iArrFld);
        printStream2.println("byFld Test.lArrFld Test.iArrFld = " + b + "," + checkSum + "," + printStream2);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
