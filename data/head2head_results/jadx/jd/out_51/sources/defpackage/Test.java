

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_51/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_51/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long instanceCount = -699333489;
    public static short sFld = 17154;
    public static long lFld = 9;
    public static final int N = 400;
    public static float[] fArrFld = new float[N];

    static {
        FuzzerUtils.init(fArrFld, 0.953f);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        r18 = r18 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vMeth1(int r7, int r8, long r9) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth1(int, int, long):void");
    }

    public static void vMeth(double d) {
        int i = 1;
        int i2 = 3;
        int i3 = 47757;
        int i4 = 38;
        int i5 = -26223;
        int i6 = -4725;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 207208703L);
        int i7 = 6;
        while (i7 < 332) {
            i = 1;
            while (i < 5) {
                i2 += ((i * 2) - 6) - i;
                i++;
            }
            vMeth1(i, i, instanceCount);
            i3 = 1;
            while (i3 < 5) {
                int i8 = i2 >>> 32;
                i4 = 1;
                while (true) {
                    i4++;
                    if (i4 >= 2) {
                        break;
                    } else {
                        jArr[i3] = i7;
                    }
                }
                i2 = i8 % 1;
                i5 = 1;
                while (i5 < 2) {
                    instanceCount += i3;
                    instanceCount += i5;
                    i2 = (i2 + ((-40201) + (i5 * i5))) ^ ((int) instanceCount);
                    i5++;
                }
                i6 -= i6;
                i3++;
            }
            i7++;
        }
        vMeth_check_sum += (((((((Double.doubleToLongBits(d) + i7) + 2) + i) + i2) - 6) + i3) - 9) + i4 + i5 + i6 + FuzzerUtils.checkSum(jArr);
    }

    public static void vSmallMeth(int i) {
        vMeth(97.77378d);
        vSmallMeth_check_sum += (i - ((int) instanceCount)) + Double.doubleToLongBits(97.77378d);
    }

    public void mainTest(String[] strArr) {
        int i = 6170;
        int i2 = -1;
        int i3 = 47629;
        int i4 = -9;
        int i5 = 48817;
        int i6 = 11420;
        int i7 = -151;
        int i8 = -15479;
        int[][][] iArr = new int[N][N][N];
        float f = 91.427f;
        double d = 32.40625d;
        long[] jArr = new long[N];
        long[] jArr2 = new long[N];
        FuzzerUtils.init((Object[][]) iArr, (Object) (-245));
        FuzzerUtils.init(jArr, -637209366L);
        FuzzerUtils.init(jArr2, -12L);
        for (int i9 = 0; i9 < 376; i9++) {
            vSmallMeth(182);
        }
        int i10 = 182 - 182;
        int[] iArr2 = iArr[(i10 >>> 1) % N][(i10 >>> 1) % N];
        int i11 = (i10 >>> 1) % N;
        iArr2[i11] = iArr2[i11] ^ i10;
        int i12 = 9;
        while (i12 < 194) {
            i2 = 1;
            do {
                jArr[i2] = instanceCount;
                long[] jArr3 = jArr;
                int i13 = i2;
                jArr3[i13] = jArr3[i13] - i;
                f = (f + ((float) (((i2 * instanceCount) + i2) - i10))) - (-5.619944E18f);
                i = i2;
                i3 = 1;
                while (i3 < 1 && 0 == 0) {
                    i4 = (int) instanceCount;
                    i3++;
                }
                int[] iArr3 = iArr[i12 - 1][i12];
                int i14 = i2 + 1;
                iArr3[i14] = iArr3[i14] + ((int) lFld);
                i4 -= (int) instanceCount;
                i2++;
            } while (i2 < 136);
            i5 = 136;
            while (i5 > 2) {
                double d2 = 1.0d;
                while (true) {
                    d = d2;
                    if (d < 2.0d) {
                        int i15 = i6 + ((int) (((d * i5) + lFld) - instanceCount));
                        jArr = jArr2;
                        lFld <<= (int) instanceCount;
                        i6 = (int) instanceCount;
                        i7 >>>= i;
                        instanceCount += (long) (((d * i2) + i4) - i7);
                        d2 = d + 1.0d;
                    } else {
                        long[] jArr4 = jArr;
                        int i16 = i5;
                        jArr4[i16] = jArr4[i16] / (f | 1);
                        switch ((i12 % 1) + 38) {
                            case 38:
                                i8 = 1;
                                while (i8 < 2) {
                                    i10 = 11 & i7;
                                    i6 *= (int) instanceCount;
                                    i8++;
                                }
                                break;
                        }
                        i10 -= i3;
                        i5--;
                    }
                }
            }
            i12++;
        }
        FuzzerUtils.out.println("i14 i15 i16 = " + i10 + "," + i12 + "," + i);
        FuzzerUtils.out.println("i17 f1 i18 = " + i2 + "," + Float.floatToIntBits(f) + "," + i3);
        FuzzerUtils.out.println("i19 i20 i21 = " + i4 + "," + i5 + "," + i6);
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("d3 i22 i23 = " + Double.doubleToLongBits(d) + "," + printStream + "," + i7);
        PrintStream printStream2 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum((Object[][]) iArr);
        FuzzerUtils.checkSum(jArr);
        printStream2.println("i24 iArr lArr1 = " + 8 + "," + checkSum + "," + printStream2);
        FuzzerUtils.out.println("lArr2 = " + FuzzerUtils.checkSum(jArr2));
        PrintStream printStream3 = FuzzerUtils.out;
        long j = instanceCount;
        short s = sFld;
        long j2 = lFld;
        printStream3.println("Test.instanceCount Test.sFld Test.lFld = " + j + "," + printStream3 + "," + s);
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
