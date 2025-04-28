

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_19/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_19/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public int iFld = -3;
    public boolean bFld = true;
    public float fFld = 2.191f;
    public float[] fArrFld = new float[N];
    public volatile double[] dArrFld = new double[N];
    public static long iMeth_check_sum;
    public static long dMeth_check_sum;
    public static long lMeth_check_sum;
    public static long instanceCount = 7013341965226609775L;
    public static int iFld1 = 44528;
    public static short sFld = -28773;
    public static double dFld = -2.101387d;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, -22063);
        iMeth_check_sum = 0L;
        dMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
    }

    public static long lMeth(int i, short s) {
        long j = i + s + i;
        lMeth_check_sum += j;
        return j;
    }

    public static double dMeth(int i, int i2) {
        int i3 = 13;
        int i4 = -5;
        int i5 = -38623;
        int i6 = -54;
        int[][] iArr = new int[N][N];
        short s = -9593;
        float f = 1.674f;
        boolean[] zArr = new boolean[N];
        FuzzerUtils.init(iArr, 8);
        FuzzerUtils.init(zArr, true);
        int i7 = 295;
        while (i7 > 13) {
            i4 = 6;
            while (i4 > 1) {
                int[] iArr2 = iArrFld;
                int i8 = i7;
                iArr2[i8] = iArr2[i8] - iFld1;
                i2 = iArr[i4 - 1][i7];
                instanceCount *= lMeth(i5, s);
                try {
                    i5 = iFld1 % (-912903211);
                    i /= -136;
                    i3 = i5 % i2;
                } catch (ArithmeticException e) {
                }
                s = (short) (s - ((short) (-1.122462d)));
                i *= 1842;
                i3 <<= i4;
                instanceCount = i6;
                f = i5;
                zArr[i4 - 1] = true;
                i4--;
            }
            double d = i5;
            instanceCount -= -8;
            i6 -= 38976;
            i7--;
        }
        long floatToIntBits = i + i2 + i7 + i3 + i4 + i5 + s + i6 + Float.floatToIntBits(f) + (1 != 0 ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(zArr);
        dMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public static int iMeth(int i) {
        int i2 = 1;
        int[][][] iArr = new int[N][N][N];
        long j = 7;
        long[] jArr = new long[N];
        boolean z = false;
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, 1.568f);
        FuzzerUtils.init(jArr, 4L);
        FuzzerUtils.init((Object[][]) iArr, (Object) (-4));
        long j2 = instanceCount + 1;
        instanceCount = 400L;
        int i3 = (i >>> 1) % N;
        float f = fArr[i3];
        fArr[i3] = f + 1.0f;
        int i4 = (int) (((float) (j2 * (i - (-42)))) * f);
        int[] iArr2 = iArrFld;
        iArr2[43] = iArr2[43] - ((int) ((jArr[(i4 >>> 1) % N] + (instanceCount * (-226))) * (dMeth(i4, iFld1) - (-4.309000015258789d))));
        for (float f2 : fArr) {
            iArr = iArr;
            i4 = sFld;
        }
        iArrFld[(i4 >>> 1) % N] = (int) instanceCount;
        int i5 = 1;
        while (true) {
            i5++;
            if (i5 >= 164) {
                break;
            }
            long j3 = 1;
            while (true) {
                j = j3;
                if (j < 10) {
                    i2 <<= iFld1;
                    instanceCount += ((j * j) + j) - iFld1;
                    j3 = j + 1;
                }
            }
            z = z;
            instanceCount += instanceCount;
            iFld1 <<= i2;
            iArrFld[i5 + 1] = iFld1;
            i2 += i5 - i2;
        }
        long doubleToLongBits = i4 + i5 + j + i2 + (z ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum((Object[][]) iArr);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0150, code lost:
    
        defpackage.Test.instanceCount *= r10;
        r8.fFld = r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r9) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.mainTest(java.lang.String[]):void");
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
