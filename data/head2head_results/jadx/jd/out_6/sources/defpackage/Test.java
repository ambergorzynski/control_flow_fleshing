

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_6/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_6/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public int[][] iArrFld = new int[N][N];
    public static long instanceCount = 3;
    public static boolean bFld = true;
    public static int iFld = -13;
    public static volatile byte byFld = 44;
    public static float fFld = 1.982f;
    public static volatile double dFld = 67.128121d;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(short s, float f) {
        int[][][] iArr = new int[N][N][N];
        float[] fArr = new float[N];
        double[] dArr = new double[N];
        FuzzerUtils.init((Object[][]) iArr, (Object) 46595);
        FuzzerUtils.init(fArr, -100.246f);
        FuzzerUtils.init(dArr, 0.6493d);
        instanceCount <<= -5;
        vMeth2_check_sum += ((((s + Float.floatToIntBits(f)) - 5) - 18) - 14) + (1 != 0 ? 1 : 0) + FuzzerUtils.checkSum((Object[][]) iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1(int i) {
        float[] fArr = new float[N];
        int i2 = 64561;
        int i3 = -14;
        int i4 = 10;
        int[] iArr = new int[N];
        double d = 1.9954d;
        double d2 = -2.5635d;
        FuzzerUtils.init(fArr, 8.778f);
        FuzzerUtils.init(iArr, -219);
        vMeth2((short) 28492, -1.948f);
        float f = 22.0f;
        while (true) {
            float f2 = f;
            if (f2 < 385.0f) {
                int i5 = (int) (f2 - 1.0f);
                fArr[i5] = fArr[i5] + ((float) instanceCount);
                iArr[(int) (f2 + 1.0f)] = 28492;
                instanceCount /= -54693;
                i3 = 1;
                while (i3 < 5) {
                    if (bFld) {
                    }
                    i3++;
                }
                int i6 = (int) (f2 + 1.0f);
                iArr[i6] = iArr[i6] | i3;
                d -= 8.0d;
                i2 -= i;
                bFld = bFld;
                double d3 = 1.0d;
                while (true) {
                    d2 = d3;
                    if (5.0d > d2) {
                        i4 += 28492;
                        d = instanceCount;
                        d3 = d2 + 1.0d;
                    }
                }
                f = f2 + 1.0f;
            } else {
                vMeth1_check_sum += i + 28492 + Float.floatToIntBits(f2) + i2 + i3 + i4 + Double.doubleToLongBits(d) + Double.doubleToLongBits(d2) + 11 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
    }

    public static void vMeth(long j) {
        int i = -172;
        int i2 = -243;
        int i3 = -24004;
        int[] iArr = new int[N];
        float f = -2.35f;
        double[] dArr = new double[N];
        FuzzerUtils.init(iArr, 13);
        FuzzerUtils.init(dArr, -1.70413d);
        vMeth1(iFld);
        int i4 = 202;
        while (i4 > 1) {
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] - byFld;
            switch (((i4 % 7) * 5) + 84) {
                case 98:
                    iFld += i;
                case 86:
                case 102:
                    i3 = -4;
                    break;
                case 106:
                    int i6 = i4;
                    dArr[i6] = dArr[i6] - iFld;
                case 103:
                    i3 = (int) f;
                    break;
                case 107:
                    iFld += (int) j;
                    break;
                case 111:
                    if (bFld) {
                        i = (int) (i + (i4 ^ fFld));
                        iArr[i4 + 1] = byFld;
                        iFld = (int) 83.409f;
                        dFld %= i | 1;
                    }
                    f = 1.0f;
                    while (true) {
                        float f2 = f + 1.0f;
                        f = f2;
                        if (f2 < 8.0f) {
                            i2 = 1;
                            while (i2 < 1) {
                                fFld -= i2;
                                j += i2;
                                byFld = (byte) (byFld * 67);
                                i2++;
                            }
                            iFld += (int) (f * f);
                        }
                    }
                    break;
            }
            i4--;
        }
        vMeth_check_sum += j + i4 + i + Float.floatToIntBits(f) + i2 + i3 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr) {
        int i = 14;
        int i2 = 18652;
        int i3 = -190;
        int i4 = -34693;
        int i5 = 1;
        int i6 = 63776;
        int i7 = -2948;
        int i8 = 38201;
        short s = 23722;
        double d = 114.10959d;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 13L);
        vMeth(instanceCount);
        iFld -= (int) instanceCount;
        int i9 = 8;
        while (i9 < 139) {
            instanceCount = i;
            i2 = 2;
            while (i2 < 191) {
                byFld = (byte) (byFld + ((byte) i2));
                instanceCount = ((float) instanceCount) + (((i2 * i2) + fFld) - iFld);
                byFld = (byte) (byFld ^ 76);
                s = (short) (s + ((short) ((-11) + (i2 * i2))));
                instanceCount >>= i;
                i4 = i9;
                while (i4 < 2) {
                    i3 = (int) instanceCount;
                    fFld -= -3.064818E9f;
                    instanceCount = i3;
                    dFld -= instanceCount;
                    instanceCount = i5;
                    s = (short) (s + s);
                    i4++;
                }
                i2++;
            }
            i6 = 8;
            while (i6 < 191) {
                i7 = 1;
                while (i7 < 2) {
                    int i10 = i9 + 1;
                    jArr[i10] = jArr[i10] - 2273;
                    i5 >>= 25125;
                    i7++;
                }
                this.iArrFld = this.iArrFld;
                i -= iFld;
                instanceCount = i;
                if (!bFld) {
                    double d2 = 1.0d;
                    while (true) {
                        d = d2;
                        if (d >= 2.0d) {
                            break;
                        }
                        i8 = i5;
                        iFld += (int) d;
                        i = i8;
                        d2 = d + 1.0d;
                    }
                    fFld += i6 * i6;
                }
                i6++;
            }
            i9++;
        }
        FuzzerUtils.out.println("i12 i13 i14 = " + i9 + "," + i + "," + i2);
        FuzzerUtils.out.println("i15 s2 i16 = " + i3 + "," + s + "," + i4);
        FuzzerUtils.out.println("i17 i18 i19 = " + i5 + "," + i6 + "," + 148);
        FuzzerUtils.out.println("i20 i21 d2 = " + i7 + "," + i8 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i22 lArr = " + (-99) + "," + FuzzerUtils.checkSum(jArr));
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        boolean z = bFld;
        int i11 = iFld;
        printStream.println("Test.instanceCount Test.bFld Test.iFld = " + j + "," + printStream + "," + z);
        FuzzerUtils.out.println("Test.byFld Test.fFld Test.dFld = " + byFld + "," + Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(this.iArrFld));
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
