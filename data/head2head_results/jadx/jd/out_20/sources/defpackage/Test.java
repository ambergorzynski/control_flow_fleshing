

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_20/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_20/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public double dFld = -1.93431d;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long lMeth_check_sum;
    public static long instanceCount = 13;
    public static int iFld = 4;
    public static float fFld = 31.93f;
    public static final int N = 400;
    public static boolean[] bArrFld = new boolean[N];
    public static double[] dArrFld = new double[N];

    static {
        FuzzerUtils.init(bArrFld, false);
        FuzzerUtils.init(dArrFld, 0.27282d);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        lMeth_check_sum = 0L;
    }

    public static long lMeth(int i) {
        int i2 = -20;
        int i3 = -14;
        int i4 = 6;
        int[] iArr = new int[N];
        int[][] iArr2 = new int[N][N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 7L);
        FuzzerUtils.init(iArr, -8);
        FuzzerUtils.init(iArr2, 24364);
        int i5 = 144;
        while (true) {
            i5--;
            if (i5 <= 0) {
                break;
            }
            i2 = 1;
            while (i2 < 11) {
                i3 >>= i;
                i2++;
            }
            iFld += i3;
        }
        fFld = iFld;
        iFld = i;
        jArr[(i3 >>> 1) % N] = instanceCount;
        int i6 = (i2 >>> 1) % N;
        iArr[i6] = iArr[i6] - 12;
        int i7 = 1;
        while (true) {
            i7++;
            if (i7 < 230) {
                i4 = 1;
                while (i4 < 7) {
                    int i8 = i4 + 1;
                    iArr[i8] = iArr[i8] * (-126);
                    instanceCount = iFld;
                    iFld = i2;
                    int i9 = i7 + 1;
                    iArr[i9] = iArr[i9] & i5;
                    iArr2 = FuzzerUtils.int2array(N, -228);
                    i4++;
                }
            } else {
                long checkSum = ((((((i + i5) + i2) + i3) + i7) + i4) - 187) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr2);
                lMeth_check_sum += checkSum;
                return checkSum;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016d A[EDGE_INSN: B:37:0x016d->B:38:0x016d BREAK  A[LOOP:0: B:2:0x0046->B:36:0x0167], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean[], long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vMeth1(int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth1(int, int, int):void");
    }

    public static void vMeth() {
        int i;
        long j;
        int i2 = -10;
        boolean z = true;
        double d = -2.110635d;
        long j2 = 1;
        do {
            iFld += (int) (j2 ^ iFld);
            fFld -= -2.38888f;
            i = (int) j2;
            while (i < 10) {
                d += 1.0d;
                i2++;
                z = ((-27.0d) * (-27.0d)) * ((double) i2) != ((double) (iFld << (iFld * iFld)));
                i++;
            }
            vMeth1(i, -8, i2);
            j = j2 + 1;
            j2 = j;
        } while (j < 164);
        if (z) {
            instanceCount -= i2;
            i2 *= 79;
        }
        int i3 = 16;
        while (i3 < 269) {
            iFld = i3;
            d += i3;
            i3 += 3;
        }
        double d2 = instanceCount;
        int i4 = 35558 >> iFld;
        fFld += 50;
        vMeth_check_sum += j2 + i + i2 + (z ? 1 : 0) + Double.doubleToLongBits(d2) + i3 + i4 + 50;
    }

    public void mainTest(String[] strArr) {
        int i = -161;
        int i2 = 64098;
        int i3 = 24674;
        int i4 = 4;
        int i5 = -5;
        int i6 = -10;
        int i7 = -10;
        int i8 = 55652;
        boolean z = 20795;
        int i9 = 6;
        int[][][] iArr = new int[N][N][N];
        boolean z2 = 11388;
        byte[] bArr = new byte[N];
        FuzzerUtils.init((Object[][]) iArr, (Object) (-6));
        FuzzerUtils.init(bArr, (byte) 105);
        vMeth();
        iFld *= iFld;
        int i10 = 273;
        while (i10 > 14) {
            try {
                iArr[i10 - 1][i10][i10 + 1] = (-1094208255) / i10;
                iFld = (-161) / i10;
                iArr[i10 + 1][i10 + 1][i10] = (-228) / i10;
            } catch (ArithmeticException e) {
            }
            instanceCount = i10;
            iArr[i10 - 1][i10 + 1] = FuzzerUtils.int1array(N, 9);
            i10--;
        }
        fFld -= -41976.0f;
        iFld *= i10;
        int i11 = 3;
        while (i11 < 154) {
            iFld -= i11;
            i *= i;
            i3 = 2;
            while (i3 < 166) {
                i5 = i3;
                while (i5 < 2) {
                    i4 *= i4;
                    i2 += (int) ((-250463933) + (i5 * i5));
                    bArr[i3 + 1] = (byte) fFld;
                    i5++;
                }
                fFld = i3;
                i7 = 1;
                while (2 > i7) {
                    z2 = z2;
                    instanceCount = 15;
                    i6 = (int) instanceCount;
                    i7 += 2;
                }
                iFld *= (int) instanceCount;
                this.dFld = i4;
                i8 = 1;
                while (i8 < 2) {
                    instanceCount >>= i8;
                    z = z2;
                    if (0 != 0) {
                        break;
                    }
                    i9 |= iFld;
                    fFld += fFld;
                    i8++;
                }
                i3++;
            }
            i11++;
        }
        FuzzerUtils.out.println("i21 i22 i23 = " + i10 + "," + i + "," + i11);
        FuzzerUtils.out.println("i24 i25 i26 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i27 i28 i29 = " + i5 + "," + i6 + "," + i7);
        FuzzerUtils.out.println("i30 s i31 = " + 15 + "," + z2 + "," + i8);
        FuzzerUtils.out.println("i32 b2 i33 = " + z + "," + (0 != 0) + "," + i9);
        PrintStream printStream = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum((Object[][]) iArr);
        FuzzerUtils.checkSum(bArr);
        printStream.println("iArr3 byArr = " + checkSum + "," + printStream);
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        int i12 = iFld;
        Float.floatToIntBits(fFld);
        printStream2.println("Test.instanceCount Test.iFld Test.fFld = " + j + "," + printStream2 + "," + i12);
        PrintStream printStream3 = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(this.dFld);
        long checkSum2 = FuzzerUtils.checkSum(bArrFld);
        Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld));
        printStream3.println("dFld Test.bArrFld Test.dArrFld = " + doubleToLongBits + "," + printStream3 + "," + checkSum2);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
