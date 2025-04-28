

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_70/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_70/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long fMeth_check_sum;
    public static long instanceCount = 81994945733705874L;
    public static byte byFld = 76;
    public static float fFld = -114.63f;
    public static short sFld = -3279;
    public static volatile boolean bFld = true;
    public static double dFld = 1.23986d;
    public static final int N = 400;
    public static volatile long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(lArrFld, -12056L);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        fMeth_check_sum = 0L;
    }

    public static float fMeth(short s, int i, int i2) {
        long j;
        int i3 = 8;
        int i4 = -61;
        int[] iArr = new int[N];
        int[] iArr2 = new int[N];
        long j2 = 12933;
        FuzzerUtils.init(iArr, -6);
        FuzzerUtils.init(iArr2, 8);
        float f = 172.0f;
        while (true) {
            float f2 = f;
            if (f2 > 6.0f) {
                int i5 = i3 | s;
                int i6 = (int) (f2 + 1.0f);
                iArr[i6] = iArr[i6] >> i5;
                fFld += i5;
                i3 = (int) instanceCount;
                instanceCount /= instanceCount | 1;
                j2 = 1;
                do {
                    i3 -= (int) j2;
                    i += i;
                    i4 = 1;
                    while (true) {
                        i4++;
                        if (i4 < 1) {
                            switch ((i4 % 6) + 96) {
                                case 96:
                                    iArr[i4] = iArr[i4] + i4;
                                    i3 = (int) fFld;
                                    i += (int) instanceCount;
                                    break;
                                case 97:
                                    iArr2[(i4 >>> 1) % N] = i3;
                                    break;
                                case 98:
                                    i2 = (int) (i2 + (((i4 * j2) + i4) - i));
                                    break;
                                case 99:
                                    byFld = (byte) (byFld * ((byte) i2));
                                    break;
                                case 100:
                                case 101:
                                    i2 += ((i4 * i) + i4) - i3;
                                    break;
                            }
                        } else {
                            j = j2 + 1;
                            j2 = j;
                        }
                    }
                } while (j < 10);
                f = f2 - 1.0f;
            } else {
                long floatToIntBits = s + i + i2 + Float.floatToIntBits(f2) + i3 + j2 + i4 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr2);
                fMeth_check_sum += floatToIntBits;
                return (float) floatToIntBits;
            }
        }
    }

    public static void vMeth1(long j, int i, double d) {
        double d2;
        int i2 = 69;
        int i3 = -120;
        int i4 = -19354;
        int[] iArr = new int[N];
        double d3 = 2.114438d;
        FuzzerUtils.init(iArr, -8);
        float f = iArr[(i >>> 1) % N];
        int i5 = 169;
        while (i5 > 7) {
            f += i5 * i5;
            iArr[i5 + 1] = (int) f;
            i2 |= byFld;
            i5--;
        }
        int i6 = 5;
        while (i6 < 184) {
            fMeth(sFld, -109, i5);
            i3 += i6;
            d3 = 9.0d;
            do {
                lArrFld[(int) d3] = fFld;
                if (bFld) {
                    break;
                }
                i = i2;
                d2 = d3 - 3.0d;
                d3 = d2;
            } while (d2 > 0.0d);
            i4 = 1;
            while (9 > i4) {
                i3 = (int) (i3 + (((i4 * byFld) + instanceCount) - instanceCount));
                iArr[i4 + 1] = i;
                i4++;
            }
            i6++;
        }
        vMeth1_check_sum += j + i + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i5 + i2 + i6 + i3 + Double.doubleToLongBits(d3) + i4 + 8 + FuzzerUtils.checkSum(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [long, long[]] */
    public static void vMeth() {
        int i = 127;
        int[] iArr = new int[N];
        ?? r0 = new long[N];
        FuzzerUtils.init((long[]) r0, 12L);
        FuzzerUtils.init(iArr, 41);
        int i2 = (127 >>> 1) % N;
        long j = instanceCount + 1;
        instanceCount = r0;
        r0[i2] = j;
        vMeth1(instanceCount, 127, dFld);
        instanceCount -= 127;
        int i3 = 1;
        while (true) {
            i3++;
            if (i3 < 259) {
                i = i3;
                if (!bFld) {
                    dFld = i;
                }
            } else {
                fFld = i;
                int i4 = (i >>> 1) % N;
                iArr[i4] = iArr[i4] - ((int) fFld);
                iArr[(i >>> 1) % N] = 39900;
                r0[6] = r0[6] - i3;
                instanceCount = i3;
                int i5 = (int) instanceCount;
                vMeth_check_sum += (i5 - i5) + i3 + FuzzerUtils.checkSum((long[]) r0) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
    }

    public void mainTest(String[] strArr) {
        long j;
        int i = 14;
        int i2 = -212;
        int i3 = -15563;
        int i4 = -146;
        int i5 = 14;
        int i6 = 56965;
        int i7 = 7;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -4);
        vMeth();
        int i8 = 45371 + 21829;
        int i9 = i8 + i8;
        long j2 = 309;
        while (true) {
            j = j2;
            if (j <= 2) {
                break;
            }
            fFld *= (float) instanceCount;
            byFld = (byte) (byFld * ((byte) i9));
            i2 = (int) j;
            while (i2 < 246) {
                dFld = 2.0d;
                iArr[(int) j] = sFld;
                i3 = -21;
                byFld = (byte) (byFld + ((byte) i2));
                instanceCount += ((i2 * i) + r0) - j;
                fFld = 1.6431724E18f;
                i = -21;
                i4 = 1;
                while (1 > i4) {
                    i6 *= (int) instanceCount;
                    i3 |= (int) instanceCount;
                    i5 = (int) fFld;
                    i -= 59;
                    i4++;
                }
                i2++;
            }
            dFld -= i3;
            i3 += (int) (j * j);
            i9 = i3;
            i7 = 246;
            while (i7 > 6) {
                i5 -= byFld;
                i3 = (int) j;
                i7--;
            }
            i = -76;
            instanceCount |= j;
            j2 = j - 3;
        }
        int i10 = (i3 >>> 1) % N;
        iArr[i10] = iArr[i10] * i9;
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i13 l2 i14 = " + i5 + "," + j + "," + printStream);
        FuzzerUtils.out.println("i15 i16 i17 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i18 i19 i20 = " + i5 + "," + i6 + "," + i7);
        FuzzerUtils.out.println("i21 iArr4 = " + (-76) + "," + FuzzerUtils.checkSum(iArr));
        PrintStream printStream2 = FuzzerUtils.out;
        long j3 = instanceCount;
        byte b = byFld;
        Float.floatToIntBits(fFld);
        printStream2.println("Test.instanceCount Test.byFld Test.fFld = " + j3 + "," + printStream2 + "," + b);
        FuzzerUtils.out.println("Test.sFld Test.bFld Test.dFld = " + sFld + "," + (bFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
