

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_5/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_5/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public int iFld = 3;
    public long[] lArrFld = new long[N];
    public static long instanceCount = -72;
    public static byte byFld = -47;
    public static boolean bFld = true;
    public static double dFld = 1.51139d;
    public static float fFld = 0.338f;
    public static volatile short sFld = -16313;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {
        int i = -9;
        int i2 = 3;
        int i3 = 52;
        int i4 = -4;
        int[][][] iArr = new int[N][N][N];
        long j = 1984157282;
        float f = -72.144f;
        FuzzerUtils.init((Object[][]) iArr, (Object) 63069);
        int i5 = 9;
        while (191 > i5) {
            long j2 = 9;
            while (true) {
                j = j2;
                if (j > 1) {
                    int[] iArr2 = iArr[(int) j][(int) (j - 1)];
                    int i6 = i5 + 1;
                    iArr2[i6] = iArr2[i6] + i5;
                    i3 = 1;
                    while (i3 < 5) {
                        i -= i3;
                        i4 = -64035858;
                        if (bFld) {
                            int i7 = (int) (i2 + (i3 - f));
                            f += byFld;
                            int[] iArr3 = iArr[i5 - 1][i5 + 1];
                            int i8 = i3 + 1;
                            iArr3[i8] = iArr3[i8] + i;
                            i2 = i7 + i3;
                        } else if (bFld) {
                            i4 = (-64035858) + (i3 - i3);
                            i += i3;
                            instanceCount += i3 * i3;
                            i2 = i;
                        } else if (bFld) {
                        }
                        i3++;
                    }
                    j2 = j - 3;
                }
            }
            i5++;
        }
        long floatToIntBits = i5 + i + j + i2 + i3 + i4 + Float.floatToIntBits(f) + FuzzerUtils.checkSum((Object[][]) iArr);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void vMeth1(int i) {
        long j;
        long j2 = 7732065335955848916L;
        long[] jArr = new long[N];
        short s = -16795;
        float f = 0.702f;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 40156);
        FuzzerUtils.init(jArr, 43597L);
        long j3 = instanceCount - 6;
        int i2 = (i >>> 1) % N;
        int i3 = iArr[i2] - 1;
        iArr[i2] = i3;
        int max = i + ((int) ((j3 * i3) - (Math.max(instanceCount, instanceCount) * (i - i))));
        switch ((((iMeth() >>> 1) % 10) * 5) + 111) {
            case 114:
            case 121:
                max >>= max;
                break;
            case 123:
                j2 = 1;
                do {
                    switch ((int) (((j2 % 3) * 5) + 60)) {
                        case 65:
                            s = (short) (s + ((short) j2));
                            instanceCount -= (long) dFld;
                            if (!bFld) {
                                max += (int) dFld;
                                break;
                            }
                            break;
                        case 68:
                        case 74:
                            max += (int) (((((float) j2) * 0.702f) + max) - ((float) j2));
                            bFld = true;
                        default:
                            if (bFld) {
                                int i4 = (int) j2;
                                iArr[i4] = iArr[i4] - max;
                                break;
                            } else {
                                instanceCount += s;
                                s = (short) max;
                                max = -29015;
                                break;
                            }
                    }
                    j = j2 + 1;
                    j2 = j;
                } while (j < 351);
            case 134:
                s = (short) ((-16795) - ((short) max));
                f = 0.702f - 0.0f;
                max *= 1264072781;
                break;
            case 135:
                max -= 2009277388;
                break;
            case 142:
                max *= 1264072781;
                break;
            case 143:
                jArr[(max >>> 1) % N] = jArr[r1] - 16795;
                break;
            case 145:
                instanceCount <<= 35294;
                break;
            case 152:
                iArr[(max >>> 1) % N] = max;
                break;
            case 160:
                f = 0.702f - 0.0f;
                max *= 1264072781;
                break;
            default:
                max += max;
                break;
        }
        vMeth1_check_sum += max + j2 + s + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr);
    }

    public static void vMeth(int i) {
        int i2 = 62313;
        int i3 = -14;
        int i4 = 12;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -12127);
        for (int i5 : iArr) {
            vMeth1(i5);
            instanceCount = i;
            int i6 = i5 * i;
            if (!bFld) {
                instanceCount >>>= -71;
                i = (i - 8) - ((int) fFld);
                iArr = iArr;
            }
            i2 = 1;
            do {
                i3 = 1;
                while (i3 < 1) {
                    iArr = iArr;
                    i4 <<= (int) instanceCount;
                    fFld -= i;
                    i3++;
                }
                i2++;
            } while (i2 < 4);
        }
        vMeth_check_sum += i + i2 + i3 + i4 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        int i = -118;
        int i2 = 168;
        int i3 = 13;
        int i4 = -6911;
        int i5 = -11;
        int[] iArr = new int[N];
        float f = 55.404f;
        FuzzerUtils.init(iArr, -181);
        this.iFld = this.iFld;
        int i6 = 8;
        while (i6 < 135) {
            float f2 = 6.0f;
            while (true) {
                f = f2;
                if (197.0f > f) {
                    int i7 = i;
                    i--;
                    instanceCount <<= i7 - iArr[(int) f];
                    vMeth(i6);
                    f2 = f + 1.0f;
                }
            }
            i6++;
        }
        int i8 = 0 >> ((int) instanceCount);
        int i9 = this.iFld;
        fFld *= i8;
        int i10 = 4;
        while (129 > i10) {
            i8 = (int) (i8 + (i10 | instanceCount));
            i3 = 1;
            while (true) {
                i3++;
                if (i3 < 201) {
                    i9 = -14;
                    this.iFld = i2;
                    i4 = 1;
                    while (true) {
                        i4++;
                        if (i4 < 1) {
                            sFld = (short) i10;
                            instanceCount += i4 * i4;
                            i8 = i9;
                            this.iFld += sFld;
                            this.lArrFld[i10 - 1] = instanceCount;
                            switch (((i3 % 9) * 5) + 40) {
                                case 48:
                                    dFld += byFld;
                                    i8 -= (int) fFld;
                                    instanceCount += ((i4 * this.iFld) + i6) - i10;
                                    i9 = i10 * i10;
                                    break;
                                case 57:
                                    fFld += (float) (((i4 * i3) + instanceCount) - i6);
                                    break;
                                case 60:
                                    instanceCount += ((i4 * this.iFld) + i6) - i10;
                                    i9 = i10 * i10;
                                    break;
                                case 64:
                                    switch ((((i3 >>> 1) % 1) * 5) + 67) {
                                        case 69:
                                            int i11 = i4 - 1;
                                            iArr[i11] = iArr[i11] + this.iFld;
                                            dFld *= this.iFld;
                                            break;
                                    }
                                    instanceCount = this.iFld;
                                    break;
                                case 68:
                                    i8 = i9;
                                    break;
                                case 71:
                                    this.iFld >>>= (int) instanceCount;
                                    fFld += (float) (((i4 * i3) + instanceCount) - i6);
                                    break;
                                case 74:
                                    long[] jArr = this.lArrFld;
                                    int i12 = i3 + 1;
                                    jArr[i12] = jArr[i12] * this.iFld;
                                    break;
                                case 77:
                                    i9 = byFld;
                                    break;
                                case 85:
                                    i2 *= (int) fFld;
                                    break;
                                default:
                                    i5 += i4;
                                    break;
                            }
                        }
                    }
                }
            }
            i10++;
        }
        FuzzerUtils.out.println("i i1 f = " + i6 + "," + i9 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i2 i15 i16 = " + i8 + "," + i10 + "," + i2);
        FuzzerUtils.out.println("i17 i18 i19 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));
        PrintStream printStream = FuzzerUtils.out;
        long j = instanceCount;
        int i13 = this.iFld;
        byte b = byFld;
        printStream.println("Test.instanceCount iFld Test.byFld = " + j + "," + printStream + "," + i13);
        PrintStream printStream2 = FuzzerUtils.out;
        boolean z = bFld;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        Float.floatToIntBits(fFld);
        printStream2.println("Test.bFld Test.dFld Test.fFld = " + z + "," + doubleToLongBits + "," + printStream2);
        FuzzerUtils.out.println("Test.sFld lArrFld = " + sFld + "," + FuzzerUtils.checkSum(this.lArrFld));
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
