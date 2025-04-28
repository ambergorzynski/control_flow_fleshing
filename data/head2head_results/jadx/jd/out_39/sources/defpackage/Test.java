

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_39/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_39/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long iMeth_check_sum;
    public static long instanceCount = -7211750700865241249L;
    public static int iFld = 148;
    public static volatile float fFld = 100.279f;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, 91);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        iMeth_check_sum = 0L;
    }

    public static int iMeth() {
        int i = 48941;
        int i2 = -47;
        int i3 = 4;
        int i4 = 7;
        int i5 = -5;
        int i6 = -14;
        int i7 = 3;
        int[] iArr = new int[N];
        short s = 32442;
        long j = 3829236259L;
        long[] jArr = new long[N];
        float f = -2.973f;
        float f2 = 13.226f;
        double d = 2.45909d;
        FuzzerUtils.init(iArr, 60);
        FuzzerUtils.init(jArr, 62L);
        int i8 = 11;
        while (323 > i8) {
            s = (short) (s + ((short) i8));
            i8++;
        }
        long j2 = 7;
        while (true) {
            long j3 = j2;
            if (243 > j3) {
                i = i2;
                i3 = 1;
                while (7 > i3) {
                    s = (short) i2;
                    i4 /= i2 | 1;
                    switch ((int) ((j3 % 7) + 35)) {
                        case 35:
                            iArr[i3 - 1] = (int) j;
                            float f3 = 1.0f;
                            while (true) {
                                f = f3;
                                if (f < 2.0f) {
                                    d = d;
                                    f3 = f + 1.0f;
                                } else {
                                    i6 = 1;
                                    do {
                                        i4 = (int) (i4 + (((i6 * f) + i2) - s));
                                        jArr = jArr;
                                        iArr[i3 + 1] = 42244;
                                        i6++;
                                    } while (i6 < 2);
                                }
                            }
                        case 36:
                            i2 -= i5;
                            break;
                        case 37:
                            i -= s;
                            break;
                        case 38:
                            f2 += i3;
                        case 39:
                            i5 += i3;
                        case 40:
                            i7 = (int) d;
                            break;
                        case 41:
                            instanceCount = -9L;
                            break;
                        default:
                            j = i5;
                            break;
                    }
                    i3++;
                }
                j2 = j3 + 1;
            } else {
                long floatToIntBits = i8 + i + s + j3 + i2 + i3 + i4 + j + Float.floatToIntBits(f) + i5 + Double.doubleToLongBits(d) + i6 + Float.floatToIntBits(f2) + i7 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr);
                iMeth_check_sum += floatToIntBits;
                return (int) floatToIntBits;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f2, code lost:
    
        r11 = r11 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vMeth1() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth1():void");
    }

    public static void vMeth(int i, long j, int i2) {
        vMeth1();
        vMeth_check_sum += i + j + i2 + ((-14) >> ((int) instanceCount));
    }

    public void mainTest(String[] strArr) {
        int i = 9;
        int i2 = 1440;
        int i3 = -6;
        int[] iArr = new int[N];
        short s = -263;
        long[] jArr = new long[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr, 5);
        FuzzerUtils.init(jArr, 53L);
        FuzzerUtils.init(fArr, -123.64f);
        vMeth(iFld, -13L, iFld);
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            switch ((((i5 >>> 1) % 4) * 5) + 37) {
                case 46:
                    int i6 = (i5 >>> 1) % N;
                    iArr[i6] = iArr[i6] - (-4855);
                    i = 2;
                    while (i < 63) {
                        iFld >>= i;
                        iFld += iFld;
                        instanceCount += (-95) + (i * i);
                        i5 = (i5 & (-11)) << (-6);
                        iFld <<= 826460940;
                        i++;
                    }
                    if (1 == 0) {
                        if (1 != 0) {
                            i2 += 8;
                            i3 = 2;
                            while (i3 < 63) {
                                iFld = 50211;
                                fArr[i3] = 28412.0f;
                                int i7 = i3 - 1;
                                iArr[i7] = iArr[i7] / ((int) (fFld | 1));
                                i2 = 8;
                                fFld -= 113;
                                iArrFld[i3] = i;
                                i3++;
                            }
                            break;
                        } else {
                            s = (short) iFld;
                            break;
                        }
                    } else {
                        break;
                    }
                case 51:
                    iFld &= -181;
                    break;
                case 53:
                default:
                    int[] iArr2 = iArrFld;
                    iArr2[309] = iArr2[309] * i;
                    break;
                case 56:
                    int i8 = (i >>> 1) % N;
                    fArr[i8] = fArr[i8] + ((float) instanceCount);
                    break;
            }
        }
        FuzzerUtils.out.println("i19 i20 i21 = " + i + "," + (-6) + "," + 10);
        FuzzerUtils.out.println("i22 i23 by = " + (-253) + "," + i2 + "," + 69);
        FuzzerUtils.out.println("s1 i24 i25 = " + s + "," + i3 + "," + 113);
        PrintStream printStream = FuzzerUtils.out;
        boolean z = 1 != 0;
        long checkSum = FuzzerUtils.checkSum(iArr);
        FuzzerUtils.checkSum(jArr);
        printStream.println("b1 iArr1 lArr1 = " + z + "," + checkSum + "," + printStream);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        int i9 = iFld;
        Float.floatToIntBits(fFld);
        printStream2.println("Test.instanceCount Test.iFld Test.fFld = " + j + "," + printStream2 + "," + i9);
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
