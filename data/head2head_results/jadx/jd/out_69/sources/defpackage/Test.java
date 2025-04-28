

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_69/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_69/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public float fFld = -1.808f;
    public double dFld = 67.8746d;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;
    public static long instanceCount = -12;
    public static short sFld = 18099;
    public static final int N = 400;
    public static long[] lArrFld = new long[N];

    static {
        FuzzerUtils.init(lArrFld, 3477296346L);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }

    public static void vMeth2() {
        int i = -56323;
        int i2 = 208;
        int[] iArr = new int[N];
        double d = 18.4885d;
        double[] dArr = new double[N];
        short[] sArr = new short[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, 0.177f);
        FuzzerUtils.init(sArr, (short) 26452);
        FuzzerUtils.init(dArr, 60.53056d);
        FuzzerUtils.init(iArr, -249);
        int i3 = 1;
        while (true) {
            i3++;
            if (i3 < 328) {
                switch (((i3 % 7) * 5) + 4) {
                    case 5:
                        int i4 = i3 + 1;
                        dArr[i4] = dArr[i4] + i3;
                        i2 = 1;
                        while (true) {
                            if (5 > i2) {
                                instanceCount -= -1;
                                i = 16573 + ((int) ((-198) + (i2 * i2)));
                                if (0 != 0) {
                                    break;
                                }
                                iArr[i3 + 1] = -2;
                                i2++;
                            } else {
                                continue;
                            }
                        }
                        break;
                    case 8:
                        d = i3;
                        continue;
                    case 20:
                        break;
                    case 21:
                        i = i;
                        continue;
                    case 28:
                        instanceCount = i2;
                        break;
                    case 34:
                        i += (int) instanceCount;
                        continue;
                    case 35:
                        i *= (int) instanceCount;
                        fArr[i3 + 1] = i3;
                        instanceCount -= (long) d;
                        continue;
                }
                int i5 = i3 + 1;
                iArr[i5] = iArr[i5] ^ i2;
            } else {
                vMeth2_check_sum += ((((i3 + i) + Double.doubleToLongBits(d)) + i2) - 2) + 16573 + (0 != 0 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
    }

    public static void vMeth1(short s, int i, float f) {
        int i2 = -11;
        int i3 = 15620;
        byte b = 71;
        boolean z = true;
        long[] jArr = new long[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(jArr, 2063L);
        FuzzerUtils.init(fArr, -29.482f);
        vMeth2();
        int i4 = 4;
        while (i4 < 331) {
            b = (byte) instanceCount;
            i *= i;
            switch ((i4 % 4) + 102) {
                case 102:
                case 103:
                    jArr[i4] = i2;
                    continue;
                case 104:
                    i++;
                    i2 = -31595;
                    s = (short) instanceCount;
                    jArr[i4] = jArr[r1] - 31595;
                    break;
                case 105:
                    break;
                default:
                    i2 -= s;
                    continue;
            }
            i3 = 1;
            do {
                z = z;
                int i5 = i3 - 1;
                fArr[i5] = fArr[i5] + 6.0f;
                f -= i4;
                instanceCount += i2;
                i3++;
            } while (i3 < 5);
            i4++;
        }
        vMeth1_check_sum += s + i + Float.floatToIntBits(f) + i4 + i2 + b + i3 + (z ? 1 : 0) + FuzzerUtils.checkSum(jArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i) {
        int i2 = 10;
        int i3 = 14;
        int i4 = -117;
        int i5 = 10;
        int i6 = -25;
        int i7 = -219;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -164);
        int i8 = 1;
        while (i8 < 227) {
            vMeth1(sFld, i, 0.717f);
            i3 = 1;
            while (i3 < 7) {
                instanceCount = i4;
                int i9 = i3;
                iArr[i9] = iArr[i9] - ((int) 0.717f);
                i3++;
            }
            i *= 25702;
            i2 <<= i3;
            i5 = i8;
            while (i5 < 7) {
                i6 = (int) (i6 + i5 + instanceCount);
                i2 &= i4;
                long[] jArr = lArrFld;
                int i10 = i8 + 1;
                jArr[i10] = jArr[i10] + 90;
                i7 = 1;
                while (true) {
                    i7--;
                    if (i7 > 0) {
                        i2 = (int) (i2 + (((i7 * instanceCount) + sFld) - instanceCount));
                        lArrFld[i5] = r0[r1] - 11;
                        i4 *= 90;
                    }
                }
                i5++;
            }
            i8++;
        }
        vMeth_check_sum += ((((((((((i + i8) + i2) + Float.floatToIntBits(0.717f)) + i3) + i4) + i5) + 90) + i6) + i7) - 11) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        int i = -110;
        int i2 = -59417;
        int i3 = -63;
        int i4 = -9484;
        int i5 = -62;
        int[] iArr = new int[N];
        double d = -1.5766d;
        byte b = -51;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -171L);
        FuzzerUtils.init(iArr, 10);
        for (long j : jArr) {
            long j2 = j >> (-110);
        }
        for (long j3 : jArr) {
            vMeth(i);
            i *= i;
            sFld = (short) i;
            double d2 = 3.0d;
            while (true) {
                d = d2;
                if (63.0d > d) {
                    try {
                        i = i2 / i;
                        i2 = ((-10) / i) % i;
                    } catch (ArithmeticException e) {
                    }
                    i3 = 1;
                    while (i3 < 2) {
                        j3 -= 1190479912;
                        i2++;
                        this.fFld *= i2;
                        i += i3;
                        switch ((i3 % 3) + 32) {
                            case 32:
                                i -= i2;
                                break;
                            case 33:
                            case 34:
                                this.dFld -= i4;
                                i4 += 14;
                                i2 = i3;
                                break;
                        }
                        i3++;
                    }
                    instanceCount += (long) d;
                    i5 = 1;
                    while (i5 < 2) {
                        i = -196;
                        this.fFld *= (float) this.dFld;
                        iArr[i5 + 1] = iArr[r1] - 8;
                        this.fFld *= i2;
                        this.fFld = -196;
                        b = (byte) (b + ((byte) ((-135) + (i5 * i5))));
                        i4 += i5;
                        i5 += 2;
                    }
                    d2 = d + 1.0d;
                }
            }
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i d1 i18 = " + i + "," + Double.doubleToLongBits(d) + "," + printStream);
        FuzzerUtils.out.println("i19 i20 i21 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("i22 i23 by2 = " + 13922 + "," + (-196) + "," + b);
        PrintStream printStream2 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(jArr);
        FuzzerUtils.checkSum(iArr);
        printStream2.println("lArr iArr2 = " + checkSum + "," + printStream2);
        PrintStream printStream3 = FuzzerUtils.out;
        long j4 = instanceCount;
        short s = sFld;
        Float.floatToIntBits(this.fFld);
        printStream3.println("Test.instanceCount Test.sFld fFld = " + j4 + "," + printStream3 + "," + s);
        PrintStream printStream4 = FuzzerUtils.out;
        long doubleToLongBits = Double.doubleToLongBits(this.dFld);
        FuzzerUtils.checkSum(lArrFld);
        printStream4.println("dFld Test.lArrFld = " + doubleToLongBits + "," + printStream4);
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
