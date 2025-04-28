

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_13/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_13/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -10;
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6 A[LOOP:2: B:24:0x00af->B:26:0x00b6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vMeth1(int r7) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth1(int):void");
    }

    public static void vMeth(int i, double d) {
        float[] fArr = new float[N];
        int i2 = 3;
        int i3 = -12;
        int[] iArr = new int[N];
        short s = -27391;
        FuzzerUtils.init(fArr, 75.466f);
        FuzzerUtils.init(iArr, 11047);
        vMeth1(i);
        instanceCount = 2.555f;
        byte b = (byte) i;
        int i4 = i << i;
        int i5 = 10;
        while (i5 < 275) {
            i2 = 1;
            while (i2 < 6) {
                i3 = 1;
                while (true) {
                    i3++;
                    if (i3 < 2) {
                        d -= 12;
                        switch ((((i3 >>> 1) % 3) * 5) + 88) {
                            case 90:
                                instanceCount += s;
                                break;
                            case 91:
                                iArr[i2 + 1] = 2;
                                instanceCount += s;
                                break;
                            case 101:
                                s = (short) (s - 10);
                                i4 += i3;
                                instanceCount = i3;
                                break;
                            default:
                                i4 = b;
                                break;
                        }
                    }
                }
                i2++;
            }
            i5++;
        }
        vMeth_check_sum += (((((((i4 + Double.doubleToLongBits(d)) + Float.floatToIntBits(2.555f)) + b) + i5) - 21407) + i2) - 5) + i3 + 12 + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth(int i) {
        vMeth(i, 75.98246d);
        vSmallMeth_check_sum += i + Double.doubleToLongBits(75.98246d);
    }

    public void mainTest(String[] strArr) {
        for (int i = 0; i < 349; i++) {
            vSmallMeth(3);
        }
        instanceCount += instanceCount;
        FuzzerUtils.out.println("i14 = " + 3);
        FuzzerUtils.out.println("Test.instanceCount = " + instanceCount);
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
