

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_86/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_86/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public double dFld = 2.37892d;
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long sMeth_check_sum;
    public static long instanceCount = 232;
    public static volatile float fFld = -86.991f;
    public static final int N = 400;
    public static byte[] byArrFld = new byte[N];
    public static short[][] sArrFld = new short[N][N];

    static {
        FuzzerUtils.init(byArrFld, (byte) -97);
        FuzzerUtils.init(sArrFld, (short) 5519);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        sMeth_check_sum = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static short sMeth() {
        int i = 41117;
        int i2 = -104;
        int i3 = 7;
        int i4 = 30252;
        int i5 = -239;
        int i6 = -3245;
        int[] iArr = new int[N];
        long j = -134;
        double d = -123.39129d;
        byte b = -9;
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr, -18910);
        FuzzerUtils.init(fArr, 0.48f);
        int i7 = 1;
        while (i7 < 316) {
            byte[] bArr = byArrFld;
            int i8 = i7;
            bArr[i8] = (byte) (bArr[i8] - ((byte) instanceCount));
            long j2 = i7;
            while (true) {
                j = j2;
                if (j < 5) {
                    d += i;
                    i3 = 1;
                    while (i3 < 1) {
                        i2 = -2;
                        i3++;
                    }
                    i4 += (int) (((((float) j) * fFld) + ((float) j)) - i);
                    i5 = 1;
                    while (1 > i5) {
                        int i9 = i7;
                        iArr[i9] = iArr[i9] - 59423;
                        switch (((i7 % 9) * 5) + 1) {
                            case 14:
                                i2 += (-12) + (i5 * i5);
                                switch ((((i4 >>> 1) % 9) * 5) + 56) {
                                    case 57:
                                        i6 -= 36889;
                                        break;
                                    case 59:
                                        i2 ^= i3;
                                        int i10 = (int) j;
                                        iArr[i10] = iArr[i10] + i4;
                                        i = i2;
                                        break;
                                    case 76:
                                        i4 <<= (int) instanceCount;
                                        break;
                                    case 80:
                                        i2 &= 2699;
                                        break;
                                    case 91:
                                        i6 ^= i3;
                                        i += (-11) + (i5 * i5);
                                        break;
                                    case 92:
                                        i += (-11) + (i5 * i5);
                                        break;
                                    case 100:
                                        fFld *= i2;
                                        break;
                                    case 101:
                                        iArr[i7 - 1] = (int) d;
                                        i2 &= 2699;
                                        break;
                                }
                            case 15:
                                fArr[i7 + 1] = i4;
                                break;
                            case 16:
                                instanceCount -= i;
                                break;
                            case 18:
                                instanceCount += ((i5 * i6) + i) - i;
                                break;
                            case 23:
                                b = (byte) (b >> 23);
                                break;
                            case 25:
                                i += ((i5 * b) + i2) - i2;
                                break;
                            case 27:
                                if (1 != 0) {
                                }
                                break;
                            case 39:
                                instanceCount = i3;
                                break;
                            case 46:
                                i4 += (int) instanceCount;
                                break;
                        }
                        i5++;
                    }
                    j2 = j + 1;
                }
            }
            i7++;
        }
        long doubleToLongBits = i7 + i + j + i2 + Double.doubleToLongBits(d) + i3 + i4 + i5 + 218 + 2699 + i6 + (1 != 0 ? 1 : 0) + b + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        sMeth_check_sum += doubleToLongBits;
        return (short) doubleToLongBits;
    }

    public static void vMeth(int i, int i2) {
        vMeth_check_sum += (2456 + (i2 * ((int) ((fFld + sMeth()) * (-4560))))) - 4560;
    }

    public static void vSmallMeth() {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 13243);
        int i = (16953 >>> 1) % N;
        int i2 = iArr[i] - 1;
        iArr[i] = i2;
        int abs = 16953 * Math.abs(i2);
        vMeth(abs, abs);
        vSmallMeth_check_sum += abs + FuzzerUtils.checkSum(iArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r8) {
        /*
            Method dump skipped, instructions count: 629
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
