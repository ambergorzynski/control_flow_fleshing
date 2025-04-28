

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_59/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_59/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public int iFld1 = -32582;
    public short sFld = 10016;
    public float[] fArrFld = new float[N];
    public static long instanceCount = -4598101244947970670L;
    public static double dFld = 2.117003d;
    public static int iFld = 4;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i, int i2) {
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        double[] dArr = new double[N];
        FuzzerUtils.init(iArr, 114);
        FuzzerUtils.init(jArr, -8668846350062243565L);
        FuzzerUtils.init(dArr, 16.12102d);
        float f = 48.104f * i;
        int i3 = 13;
        while (i3 < 269) {
            int i4 = i3;
            iArr[i4] = iArr[i4] * (-130);
            iArr[i3] = 25490;
            dArr[i3 - 1] = -130;
            i3++;
        }
        vMeth1_check_sum += ((((((((i + i2) + Float.floatToIntBits(f)) + i3) - 130) + 6) + 138) + 32034) - 225) + 68 + 11 + (1 != 0 ? 1 : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(byte b, double d, double d2) {
        int i = 26;
        int i2 = -31197;
        int i3 = 7;
        int i4 = 55645;
        int i5 = 242;
        int[] iArr = new int[N];
        float f = 94.1f;
        FuzzerUtils.init(iArr, 118);
        int i6 = 9;
        while (i6 < 148) {
            i = 1;
            while (11 > i) {
                d2 = (-1780) + (i * 11) + ((-45623) * (instanceCount - 25041));
                i++;
            }
            i3 = 11;
            while (i3 > 1) {
                i4 |= i6;
                vMeth1(i4, 31);
                f *= i;
                i2 = i3;
                int i7 = i3;
                iArr[i7] = iArr[i7] - ((int) instanceCount);
                if (1 == 0) {
                    f += i;
                    i5 = i2;
                    i4 += i3;
                    instanceCount &= i;
                }
                i3--;
            }
            f *= -64.0f;
            i6++;
        }
        long doubleToLongBits = b + Double.doubleToLongBits(d) + Double.doubleToLongBits(d2) + i6 + 25041 + i + i2 + i3 + i4 + Float.floatToIntBits(f) + (1 != 0 ? 1 : 0) + i5 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth(long j) {
        byte b = -8;
        double[] dArr = new double[N];
        int i = 13;
        int i2 = -19776;
        int i3 = 59577;
        short s = -26798;
        FuzzerUtils.init(dArr, 1.90288d);
        float f = (-20.454f) - iFld;
        int i4 = iFld;
        iFld = i4 + 1;
        instanceCount = i4 + j + iMeth((byte) -8, 1.123075d, 1.123075d);
        iFld = -3632;
        dArr[(iFld >>> 1) % N] = f;
        long j2 = j + iFld;
        long j3 = iFld;
        int i5 = 11;
        while (i5 < 257) {
            iFld = (int) j3;
            i2 = 1;
            while (true) {
                i2++;
                if (i2 < 7) {
                    i = (int) instanceCount;
                    i3 = i2;
                    while (i3 < 1) {
                        f -= (float) instanceCount;
                        b = (byte) i2;
                        i = i;
                        s = (short) instanceCount;
                        i3 += 3;
                    }
                }
            }
            i5++;
        }
        vMeth_check_sum += ((((((((j3 + Float.floatToIntBits(f)) + b) + Double.doubleToLongBits(1.123075d)) + i5) + i) + i2) + i3) - 45748) + s + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr) {
        int i;
        int i2 = 12;
        int i3 = -63168;
        int i4 = 62212;
        int i5 = -35442;
        int i6 = -113;
        int i7 = -7376;
        int i8 = -10;
        int[] iArr = new int[N];
        byte b = -124;
        float f = -2.63f;
        FuzzerUtils.init(iArr, -10);
        int i9 = 1;
        do {
            int i10 = i9 + 1;
            iArr[i10] = iArr[i10] - Math.abs(-78);
            i = 6;
            while (i < 112) {
                i3 = i9;
                while (i3 < 2) {
                    double d = dFld + 1.0d;
                    dFld = d;
                    int i11 = (int) ((-d) * iArr[i9]);
                    i2 = i11;
                    i4 -= i11;
                    int i12 = i9 + 1;
                    iArr[i12] = iArr[i12] + 193;
                    float f2 = 99.754f + ((float) (((-2) * r4) + (-(13 - (-(i9 >> i)))))) + 1.0f;
                    b = (byte) (b | ((byte) (iArr[i3] - (r0 + b))));
                    vMeth(-12L);
                    int i13 = i - 1;
                    iArr[i13] = iArr[i13] + iFld;
                    i3++;
                }
                i5 = 1;
                while (i5 < 2) {
                    iFld -= (int) dFld;
                    dFld -= dFld;
                    i2 += i3;
                    instanceCount = i2;
                    int i14 = i5;
                    iArr[i14] = iArr[i14] + 2354;
                    instanceCount = f;
                    f -= i6;
                    dFld -= i6;
                    i5++;
                }
                float f3 = f * ((float) instanceCount);
                instanceCount += (-3) + (i * i);
                f = f3 * 18172.0f;
                i7 = i9;
                while (2 > i7) {
                    f += (float) (i7 ^ this.iFld1);
                    iArr[i9] = 158;
                    this.fArrFld = this.fArrFld;
                    switch (130) {
                        case 127:
                            int i15 = i8 + 34;
                            f += ((i7 * iFld) + i7) - f;
                            i8 = (int) instanceCount;
                            break;
                        case 128:
                            this.iFld1 -= (int) f;
                        case 129:
                            instanceCount = i8;
                            break;
                        case 130:
                            this.sFld = (short) (this.sFld * ((short) i4));
                            break;
                        default:
                            i6 = i4;
                            break;
                    }
                    i7++;
                }
                i++;
            }
            i9++;
        } while (i9 < 224);
        FuzzerUtils.out.println("i i1 i2 = " + i9 + "," + i + "," + i2);
        FuzzerUtils.out.println("i3 i4 by = " + i3 + "," + i4 + "," + b);
        FuzzerUtils.out.println("i28 i29 f4 = " + i5 + "," + i6 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i30 i31 iArr = " + i7 + "," + i8 + "," + FuzzerUtils.checkSum(iArr));
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        int i16 = iFld;
        printStream.println("Test.instanceCount Test.dFld Test.iFld = " + j + "," + printStream + "," + doubleToLongBits);
        FuzzerUtils.out.println("iFld1 sFld fArrFld = " + this.iFld1 + "," + this.sFld + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
