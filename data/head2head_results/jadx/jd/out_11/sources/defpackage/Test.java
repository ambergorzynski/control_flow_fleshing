

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_11/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_11/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public boolean bFld = true;
    public int[] iArrFld = new int[N];
    public static long instanceCount = 56410;
    public static int iFld = 1984;
    public static short sFld = 982;
    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public int iMeth() {
        int i = 199;
        int i2 = -14;
        int i3 = -67;
        int i4 = 11;
        int i5 = 18;
        while (i5 < 392) {
            instanceCount = 153L;
            i5++;
        }
        double d = 4.0d;
        while (396.0d > d) {
            try {
                instanceCount += i5;
                instanceCount *= sFld;
                i = (i * (-55741)) + ((int) (d * d));
                i2 = 1;
                while (i2 < 404) {
                    if (this.bFld) {
                        i3 = 1;
                        while (i3 < 1) {
                            i4 <<= i2;
                            i3++;
                        }
                        if (i != 0) {
                        }
                        iFld -= iFld;
                        iFld += (int) d;
                    } else if (this.bFld) {
                        instanceCount = instanceCount;
                    } else if (this.bFld) {
                        i4 -= i3;
                    }
                    i2++;
                }
                d += 1.0d;
            } catch (ArrayIndexOutOfBoundsException e) {
                iFld <<= i2;
            }
        }
        long doubleToLongBits = (((((i5 - 55741) + Double.doubleToLongBits(d)) + i) + i2) - 21) + i3 + i4;
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public void vMeth(byte b, int i, long j) {
        int i2 = -28745;
        int i3 = 38258;
        int i4 = -13;
        int i5 = 3;
        int i6 = -59454;
        int i7 = -22689;
        int[] iArr = new int[N];
        double d = 0.107812d;
        double d2 = 0.3734d;
        double[] dArr = new double[N];
        float f = -63.389f;
        FuzzerUtils.init(iArr, 205);
        FuzzerUtils.init(dArr, 0.119067d);
        int i8 = 11;
        while (389 > i8) {
            double d3 = d;
            d = d3 + 1.0d;
            i2 = (int) d3;
            switch ((i8 % 9) + 48) {
                case 48:
                    iFld += i8 * i2;
                    break;
                case 50:
                    i7 = (int) d;
                    continue;
                case 51:
                case 52:
                    int i9 = i8 - 1;
                    dArr[i9] = dArr[i9] + i4;
                    continue;
                case 53:
                    i5 = -2;
                    continue;
                case 54:
                    i5 = iFld;
                    continue;
                case 55:
                    b = (byte) (b + ((byte) (((i8 * f) + i2) - ((float) instanceCount))));
                    continue;
            }
            i3 = 4;
            while (i3 > 1) {
                i--;
                i2 -= (i - iMeth()) - iFld;
                iFld ^= i;
                double d4 = 2.0d;
                while (true) {
                    d2 = d4;
                    if (d2 > 1.0d) {
                        j = 45380;
                        i += (int) (((long) d2) | i8);
                        iArr[(int) d2] = sFld;
                        i4 *= (int) f;
                        d4 = d2 - 1.0d;
                    } else {
                        i6 = 1;
                        while (i6 < 2) {
                            iArr[i3] = 237;
                            f = i;
                            i6++;
                        }
                        i3--;
                    }
                }
            }
            i8++;
        }
        vMeth_check_sum += b + i + j + i8 + i2 + Double.doubleToLongBits(d) + i3 + i4 + Double.doubleToLongBits(d2) + i5 + Float.floatToIntBits(f) + i6 + i7 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public short sMeth() {
        vMeth((byte) 91, iFld, -209L);
        iFld += iFld;
        long j = 91 - 209;
        sMeth_check_sum += j;
        return (short) j;
    }

    public void mainTest(String[] strArr) {
        int i = -4;
        int i2 = -124;
        int i3 = 4;
        int i4 = -3;
        int i5 = -8;
        int i6 = -2;
        int i7 = -15563;
        float f = -35.753f;
        short[] sArr = new short[N];
        FuzzerUtils.init(sArr, (short) -29914);
        int i8 = 7;
        while (340 > i8) {
            i += i8;
            float sMeth = sMeth();
            this.iArrFld[i8] = i8;
            instanceCount += i8 + i8;
            f = sMeth + ((float) instanceCount);
            i2 = 2;
            while (i2 < 76) {
                instanceCount -= 14117;
                i4 = 1;
                while (i4 < 2) {
                    if (this.bFld) {
                        this.bFld = this.bFld;
                    }
                    this.iArrFld = FuzzerUtils.int1array(N, -114);
                    switch (23) {
                        case 22:
                            iFld |= i8;
                            switch (((i8 % 3) * 5) + 119) {
                                case 128:
                                    i6 = (int) instanceCount;
                                    i3 = 8 + i4;
                                    break;
                                case 130:
                                    int[] iArr = this.iArrFld;
                                    int i9 = i4;
                                    iArr[i9] = iArr[i9] ^ i6;
                                    i6 = i5;
                                    i5 += i4;
                                    instanceCount += i5;
                                    break;
                                case 134:
                                    i5 = i8;
                                    f += (float) (((i4 * instanceCount) + i6) - i7);
                                    i7 &= 60037;
                                    break;
                                default:
                                    int[] iArr2 = this.iArrFld;
                                    int i10 = i4 + 1;
                                    iArr2[i10] = iArr2[i10] + sFld;
                                    i3 = (int) (i3 + (((i4 * i6) + i3) - instanceCount));
                                    i |= i6;
                                    int[] iArr3 = this.iArrFld;
                                    int i11 = i2 - 1;
                                    iArr3[i11] = iArr3[i11] | iFld;
                                    break;
                            }
                        case 23:
                            instanceCount += ((i4 * i3) + i4) - instanceCount;
                        default:
                            int i12 = i2;
                            sArr[i12] = (short) (sArr[i12] + ((short) iFld));
                            break;
                    }
                    i4++;
                }
                i2++;
            }
            i8++;
        }
        FuzzerUtils.out.println("i i1 f = " + i8 + "," + i + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i18 i19 i20 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i21 i22 i23 = " + i5 + "," + i6 + "," + i7);
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        int i13 = iFld;
        short s = sFld;
        printStream.println("Test.instanceCount Test.iFld Test.sFld = " + j + "," + printStream + "," + i13);
        FuzzerUtils.out.println("bFld iArrFld = " + (this.bFld) + "," + FuzzerUtils.checkSum(this.iArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
