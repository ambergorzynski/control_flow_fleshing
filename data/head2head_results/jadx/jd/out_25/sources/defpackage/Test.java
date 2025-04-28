

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_25/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_25/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public double dFld = -114.66431d;
    public int iFld1 = 5;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;
    public static long instanceCount = -13253;
    public static int iFld = -2585;
    public static volatile short sFld = 25230;
    public static volatile byte byFld = 58;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static int[][] iArrFld1 = new int[N][N];

    static {
        FuzzerUtils.init(iArrFld, -8);
        FuzzerUtils.init(iArrFld1, -240);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }

    public static void vMeth2() {
        int i;
        float f;
        float f2 = -109.736f;
        float[] fArr = new float[N];
        int i2 = -197;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 5);
        FuzzerUtils.init(fArr, 27.519f);
        iArr[(iFld >>> 1) % N] = (int) instanceCount;
        instanceCount = 101L;
        sFld = (short) (sFld + sFld);
        float f3 = 1.0f;
        do {
            i = 14;
            while (i > 1) {
                i2 = i2;
                iFld = (int) (-2.125023d);
                f2 = (f2 - ((float) instanceCount)) + 39893.0f;
                i--;
            }
            instanceCount += f3 | iFld;
            f = f3 + 3.0f;
            f3 = f;
        } while (f < 331.0f);
        iArr[(i >>> 1) % N] = (int) f3;
        int i3 = (i >>> 1) % N;
        iArr[i3] = iArr[i3] + 45694;
        iFld = i2;
        int i4 = (i2 >>> 1) % N;
        iArr[i4] = iArr[i4] * ((int) f3);
        int i5 = (i >>> 1) % N;
        fArr[i5] = fArr[i5] - ((float) (-2.125023d));
        vMeth2_check_sum += Float.floatToIntBits(f3) + i + i2 + Double.doubleToLongBits(-2.125023d) + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(int i) {
        float f = -3.932f;
        int i2 = 10;
        int i3 = 14;
        int i4 = -72;
        int i5 = 98;
        int i6 = -11;
        double d = 103.101107d;
        vMeth2();
        instanceCount >>= sFld;
        instanceCount -= -3.932f;
        int i7 = 6;
        while (245 > i7) {
            i3 = 1;
            while (i3 < 7) {
                f += i3;
                i5 = i7;
                while (2 > i5) {
                    instanceCount -= f;
                    i5++;
                }
                i4 = (int) instanceCount;
                i6 = 1;
                while (i6 < 2) {
                    instanceCount = byFld;
                    instanceCount += i6;
                    instanceCount += f;
                    d -= -34488.0d;
                    i2 += i6 * i6;
                    i6++;
                }
                i3++;
            }
            i7++;
        }
        vMeth1_check_sum += (((((((((i + Float.floatToIntBits(f)) + i7) + i2) + i3) + i4) + i5) - 21) + i6) - 75) + Double.doubleToLongBits(d);
    }

    public static void vMeth(int i) {
        int i2 = 60373;
        int i3 = -169;
        int i4 = -9;
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, -77.110192d);
        vMeth1(iFld);
        int i5 = (int) instanceCount;
        int i6 = (i5 >>> 1) % N;
        dArr[i6] = dArr[i6] - iFld;
        int i7 = 3;
        while (i7 < 301) {
            i2 += i7;
            i5 -= i2;
            i7++;
        }
        iFld |= -24529;
        int i8 = 15;
        while (270 > i8) {
            float f = (-13.185f) - i2;
            i8++;
        }
        for (int i9 : iArrFld) {
            i3 = 1;
            while (i3 < 4) {
                int[] iArr = iArrFld;
                int i10 = i3 + 1;
                iArr[i10] = iArr[i10] - ((int) instanceCount);
                iFld = i4;
                iArrFld1 = iArrFld1;
                i4 -= i9;
                i3++;
            }
        }
        vMeth_check_sum += ((((i5 + i7) + i2) + i8) - 62637) + i3 + i4 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr) {
        int i = 168;
        int i2 = 14;
        int i3 = -96;
        int i4 = 14;
        int i5 = 29756;
        int i6 = 52224;
        long j = 1087475071600411524L;
        float f = -2.394f;
        double d = -10.111871d;
        iFld >>= 168;
        vMeth(iFld);
        int i7 = 7;
        while (i7 < 312) {
            iFld += i7 * i7;
            i7++;
        }
        int i8 = 2;
        while (i8 < 289) {
            long j2 = 4;
            while (true) {
                j = j2;
                if (88 > j) {
                    i4 = i8;
                    while (i4 < 2) {
                        iFld = (int) j;
                        i3 -= 6414;
                        int[] iArr = iArrFld;
                        int i9 = i4;
                        iArr[i9] = iArr[i9] + 251;
                        i5 *= sFld;
                        instanceCount += i4 | j;
                        switch ((int) ((j % 2) + 66)) {
                            case 66:
                                i3 -= 4;
                                i5 -= (int) f;
                                i2 = i;
                                break;
                            case 67:
                                i5 = (int) this.dFld;
                                if (1 == 0) {
                                    i >>= i3;
                                    break;
                                } else {
                                    break;
                                }
                        }
                        i4++;
                    }
                    d = 2.0d;
                    while (true) {
                        double d2 = d - 2.0d;
                        d = d2;
                        if (d2 > 0.0d) {
                            f = this.iFld1;
                        } else {
                            f = (f - i2) + ((float) ((-13) + (j * j)));
                            i2 = i2;
                            i6 = 1;
                            while (i6 < 2) {
                                iArrFld1[i6 - 1][i8 - 1] = (int) d;
                                i3 = -230;
                                this.dFld -= f;
                                instanceCount >>= iFld;
                                this.dFld -= f;
                                i6++;
                            }
                            j2 = j + 1;
                        }
                    }
                }
            }
            i8++;
        }
        FuzzerUtils.out.println("i i20 i21 = " + i + "," + i7 + "," + i2);
        FuzzerUtils.out.println("i22 i23 l = " + i8 + "," + 4 + "," + j);
        FuzzerUtils.out.println("i24 i25 i26 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("f4 b d2 = " + Float.floatToIntBits(f) + "," + (1 != 0) + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i27 i28 = " + i6 + "," + (-140));
        PrintStream printStream = FuzzerUtils.out;
        long j3 = instanceCount;
        int i10 = iFld;
        short s = sFld;
        printStream.println("Test.instanceCount Test.iFld Test.sFld = " + j3 + "," + printStream + "," + i10);
        PrintStream printStream2 = FuzzerUtils.out;
        byte b = byFld;
        long doubleToLongBits = Double.doubleToLongBits(this.dFld);
        int i11 = this.iFld1;
        printStream2.println("Test.byFld dFld iFld1 = " + b + "," + doubleToLongBits + "," + printStream2);
        PrintStream printStream3 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        FuzzerUtils.checkSum(iArrFld1);
        printStream3.println("Test.iArrFld Test.iArrFld1 = " + checkSum + "," + printStream3);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
