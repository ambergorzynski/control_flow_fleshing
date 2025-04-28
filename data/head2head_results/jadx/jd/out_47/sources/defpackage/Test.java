

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_47/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_47/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public int[] iArrFld = new int[N];
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long iMeth2_check_sum;
    public static long instanceCount = -5914141721094050167L;
    public static int iFld = -7;
    public static byte byFld = -127;
    public static float fFld = 41.168f;
    public static final int N = 400;
    public static long[] lArrFld = new long[N];
    public static byte[] byArrFld = new byte[N];

    static {
        FuzzerUtils.init(lArrFld, -13149L);
        FuzzerUtils.init(byArrFld, (byte) 82);
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
        iMeth2_check_sum = 0L;
    }

    public int iMeth2(int i) {
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -116139824L);
        int i2 = (iFld >>> 1) % N;
        jArr[i2] = jArr[i2] - iFld;
        long checkSum = i + FuzzerUtils.checkSum(jArr);
        iMeth2_check_sum += checkSum;
        return (int) checkSum;
    }

    public int iMeth1(long j, int i, double d) {
        int i2 = 12;
        int i3 = 5766;
        int i4 = -29002;
        int i5 = -207;
        int i6 = 61737;
        float f = -1.863f;
        int i7 = 8;
        while (i7 < 158) {
            float f2 = (f * ((float) (((j << ((int) instanceCount)) * (instanceCount - iFld)) % (8 | 1)))) - 11;
            byte b = (byte) (byFld - 1);
            byFld = b;
            iFld = b;
            iFld = (int) ((-11) - ((8 - f2) + (8 + 1)));
            f = f2 - 14521.0f;
            i2 = 11;
            while (true) {
                i2--;
                if (i2 <= 0) {
                    break;
                }
                i3 = 1;
                while (true) {
                    i3++;
                    if (i3 < 1) {
                        i4 -= iMeth2(i7) * 14884;
                        iFld /= iFld | 1;
                    }
                }
            }
            instanceCount = j;
            i5 = 1;
            while (i5 < 11) {
                j -= 3;
                iFld += (int) d;
                i6 += i5;
                i5++;
            }
            i7++;
        }
        long doubleToLongBits = ((((j + i) + Double.doubleToLongBits(d)) + i7) - 11) + Float.floatToIntBits(f) + i2 + i3 + i4 + i5 + i6;
        iMeth1_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public int iMeth(boolean z) {
        double d;
        double d2 = 1.24112d;
        int i = 3;
        int i2 = iFld;
        int i3 = iFld - 1;
        iFld = i3;
        int i4 = iFld - 1;
        iFld = i4;
        iFld = i2 - (i3 * i4);
        long j = instanceCount;
        int i5 = iFld;
        int i6 = iFld;
        iFld = i6 - 1;
        int i7 = i5 ^ i6;
        iFld = i7;
        long j2 = instanceCount - 1;
        instanceCount = j;
        instanceCount = j + (i7 - j2);
        double d3 = 58889;
        double iMeth1 = 79.266d + iMeth1(instanceCount, 58889, 79.266d);
        int i8 = 1;
        do {
            switch ((i8 % 3) + 105) {
                case 105:
                    d2 = 5.0d;
                    do {
                        fFld *= (float) d2;
                        iFld = (int) instanceCount;
                        d = d2 - 1.0d;
                        d2 = d3;
                    } while (d > 0.0d);
                    if (z) {
                        d3 = i8;
                        instanceCount += (-1303) + (i8 * (d3 == true ? 1 : 0));
                        i = 5;
                        do {
                            switch ((i8 % 4) + 1) {
                                case 1:
                                    iFld *= i;
                                    d3 = d3;
                                    break;
                                case 2:
                                    iFld = (int) (iFld + (((i * fFld) + fFld) - iFld));
                                    iFld -= i;
                                    d3 = d3;
                                    break;
                                case 3:
                                    instanceCount += iFld;
                                    d3 = d3;
                                    break;
                                case 4:
                                    iFld = i;
                                    d3 = d3;
                                    break;
                                default:
                                    int i9 = i;
                                    iFld += 40 + (i * (i9 == true ? 1 : 0));
                                    d3 = i9;
                                    break;
                            }
                            i--;
                        } while (i > 0);
                    } else if (0 != 0) {
                        iFld += i8;
                        break;
                    } else {
                        this.iArrFld[(i8 >>> 1) % N] = i8;
                        break;
                    }
                case 106:
                    instanceCount = i8;
                    break;
                case 107:
                    iFld += i8 * i8;
                    break;
                default:
                    d3 = -160;
                    lArrFld[i8 - 1] = r0[r1] - 160;
                    break;
            }
            i8++;
        } while (i8 < 374);
        long doubleToLongBits = (z ? 1 : 0) + Double.doubleToLongBits(iMeth1) + i8 + Double.doubleToLongBits(d2) + i + (0 != 0 ? 1 : 0);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public void mainTest(String[] strArr) {
        int i = 10;
        int i2 = -63907;
        int i3 = 6;
        int i4 = 3445;
        int i5 = -15851;
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, -97.728f);
        int i6 = iFld;
        iFld = i6 - 1;
        iFld = i6;
        int i7 = iFld;
        long j = instanceCount + 1;
        instanceCount = i7;
        iFld = i7 - ((int) (((4237937842L * j) + iMeth(true)) + instanceCount));
        int i8 = 6;
        while (i8 < 298) {
            int[] iArr = this.iArrFld;
            int i9 = i8;
            iArr[i9] = iArr[i9] | (-3);
            instanceCount *= fFld;
            i = 2;
            while (86 > i) {
                i3 = 1;
                while (i3 < 2) {
                    i2 <<= i;
                    byFld = (byte) (byFld * ((byte) i4));
                    int[] iArr2 = this.iArrFld;
                    int i10 = i8 + 1;
                    iArr2[i10] = iArr2[i10] >> ((int) instanceCount);
                    instanceCount += i3 + i;
                    instanceCount = i2;
                    switch ((i3 % 7) + 125) {
                        case 125:
                            i2 = i2 + i3 + i8 + (i3 - i4);
                            i5 += i3 * i2;
                            i4 = i3;
                            break;
                        case 126:
                            instanceCount += i3 * i8;
                            instanceCount -= i5;
                            break;
                        case 127:
                            i4 += i3;
                        case 128:
                            instanceCount = ((float) instanceCount) + (i3 * fFld);
                            instanceCount += iFld;
                            iFld *= i5;
                            break;
                        case 129:
                        case 130:
                            byArrFld[i3 + 1] = (byte) i5;
                            this.iArrFld[i3] = (int) instanceCount;
                        case 131:
                            int i11 = i3 + 1;
                            fArr[i11] = fArr[i11] + ((float) instanceCount);
                            iFld += i3;
                            instanceCount = 219L;
                            break;
                    }
                    this.iArrFld[i3 + 1] = (int) instanceCount;
                    instanceCount = instanceCount;
                    i3++;
                }
                i++;
            }
            i8++;
        }
        FuzzerUtils.out.println("b2 i12 i13 = " + (1 != 0) + "," + i8 + "," + (-3));
        FuzzerUtils.out.println("i14 i15 i16 = " + i + "," + i2 + "," + i3);
        FuzzerUtils.out.println("i17 i18 fArr = " + i4 + "," + i5 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        PrintStream printStream = FuzzerUtils.out;
        long j2 = instanceCount;
        int i12 = iFld;
        byte b = byFld;
        printStream.println("Test.instanceCount Test.iFld Test.byFld = " + j2 + "," + printStream + "," + i12);
        PrintStream printStream2 = FuzzerUtils.out;
        int floatToIntBits = Float.floatToIntBits(fFld);
        long checkSum = FuzzerUtils.checkSum(this.iArrFld);
        FuzzerUtils.checkSum(lArrFld);
        printStream2.println("Test.fFld iArrFld Test.lArrFld = " + floatToIntBits + "," + checkSum + "," + printStream2);
        FuzzerUtils.out.println("Test.byArrFld = " + FuzzerUtils.checkSum(byArrFld));
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
