

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_89/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_89/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public int iFld = -14479;
    public int[] iArrFld = new int[N];
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long instanceCount = 8091256981805891036L;
    public static short sFld = 28484;
    public static boolean bFld = true;
    public static byte byFld = -28;
    public static final int N = 400;
    public static float[] fArrFld = new float[N];

    static {
        FuzzerUtils.init(fArrFld, 17.494f);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }

    public static void vMeth1(int i, int i2) {
        int i3 = 97;
        int i4 = 10;
        int i5 = 12;
        int[][] iArr = new int[N][N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -3420664041L);
        FuzzerUtils.init(iArr, -8);
        int i6 = (i ^ ((int) instanceCount)) + 4975;
        jArr[(i6 >>> 1) % N] = -38;
        int i7 = i6 >> (-33180);
        instanceCount = 119L;
        int i8 = 12;
        while (i8 < 271) {
            i7 %= 3 | 1;
            i3 = 1;
            while (i3 < 6) {
                int i9 = i7 << i7;
                i5 = 1;
                while (i5 < 2) {
                    iArr = FuzzerUtils.int2array(N, -61173);
                    instanceCount = i5;
                    i5++;
                }
                sFld = (short) (sFld + ((short) (i3 * i2)));
                i7 = i9;
                i4 *= (int) instanceCount;
                i3++;
            }
            i8++;
        }
        vMeth1_check_sum += i7 + i2 + i8 + 3 + i3 + i4 + i5 + 12 + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0180, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x00c0. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vMeth(int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth(int, int, int):void");
    }

    public int iMeth(int i, double d) {
        int i2 = 4;
        int i3 = 9;
        int i4 = -5;
        float f = -2.87f;
        int i5 = 1;
        while (true) {
            i5++;
            if (i5 < 181) {
                this.iFld <<= this.iFld;
                int i6 = i + (i5 * this.iFld);
                vMeth(this.iFld, i5, -108);
                i = 1;
                i2 = 1;
                while (i2 < 9) {
                    i *= 156;
                    i3 = i5;
                    this.iArrFld[i2] = this.iFld;
                    i4 = 1;
                    while (i4 < 2) {
                        this.iArrFld[i4 - 1] = (int) instanceCount;
                        i |= (int) instanceCount;
                        f *= i4;
                        instanceCount <<= (int) instanceCount;
                        i4++;
                    }
                    f += i2 * i2;
                    i2++;
                }
            } else {
                long doubleToLongBits = ((((((i + Double.doubleToLongBits(d)) + i5) + i2) + i3) + i4) - 2027) + Float.floatToIntBits(f);
                iMeth_check_sum += doubleToLongBits;
                return (int) doubleToLongBits;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void mainTest(String[] strArr) {
        int i = 1;
        int i2 = -134;
        int i3 = -81;
        int i4 = 97;
        int i5 = -8;
        int[][] iArr = new int[N][N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -205616215L);
        FuzzerUtils.init(iArr, -17);
        float f = (-29.762f) + 1.0f;
        float f2 = f;
        this.iFld = (int) f;
        int i6 = this.iFld;
        long j = jArr[(this.iFld >>> 1) % N];
        long j2 = instanceCount + 1;
        instanceCount = this;
        this.iFld = i6 - ((int) Math.min(j, j2));
        this.iFld -= (int) (instanceCount + iMeth(this.iFld, -2.69211d));
        sFld = (short) (sFld >>> (-27197));
        if (bFld) {
            i = 4;
            while (134 > i) {
                switch (((i % 2) * 5) + 100) {
                    case 102:
                        this.iFld -= sFld;
                        f2 *= i;
                    case 105:
                        i2 = 1562642782;
                        jArr[i - 1] = instanceCount;
                        this.iFld = (int) instanceCount;
                        switch ((((this.iFld >>> 1) % 6) * 5) + 14) {
                            case 16:
                                f2 += (float) (-2.69211d);
                                continue;
                            case 18:
                                break;
                            case 28:
                                this.iFld = (int) f2;
                                break;
                            case 34:
                                this.iFld = (int) (this.iFld + (i ^ instanceCount));
                                this.iFld += 1562642782;
                                if (bFld) {
                                    break;
                                } else {
                                    this.iFld += i3;
                                    continue;
                                }
                            case 35:
                                i2 = -7;
                                i4 = 1;
                                while (true) {
                                    i4++;
                                    if (i4 < 193) {
                                        i5 = 1;
                                        while (true) {
                                            i5++;
                                            if (i5 < 1) {
                                                this.iArrFld[i4 + 1] = (int) (-2.69211d);
                                                this.iFld += i5;
                                                instanceCount = i2;
                                                iArr = iArr;
                                                bFld = bFld;
                                                i3 = (int) instanceCount;
                                                i2 += i5 | i;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            case 37:
                                float[] fArr = fArrFld;
                                int i7 = i;
                                fArr[i7] = fArr[i7] + this.iFld;
                                this.iArrFld[i - 1] = this.iFld;
                                continue;
                            default:
                                i2 = 1562642782 + (i | i4);
                                continue;
                        }
                        i2 = 1562642782 + i;
                        break;
                }
                i++;
            }
        } else if (bFld) {
            i2 = (int) (-2.69211d);
        } else {
            byFld = (byte) (byFld * ((byte) (-81)));
        }
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("f d2 i21 = " + Float.floatToIntBits(f2) + "," + Double.doubleToLongBits(-2.69211d) + "," + printStream);
        FuzzerUtils.out.println("i22 i23 i24 = " + i2 + "," + i3 + "," + i4);
        PrintStream printStream2 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(jArr);
        FuzzerUtils.checkSum(iArr);
        printStream2.println("i25 lArr iArr2 = " + i5 + "," + checkSum + "," + printStream2);
        PrintStream printStream3 = FuzzerUtils.out;
        long j3 = instanceCount;
        int i8 = this.iFld;
        short s = sFld;
        printStream3.println("Test.instanceCount iFld Test.sFld = " + j3 + "," + printStream3 + "," + i8);
        FuzzerUtils.out.println("Test.bFld Test.byFld iArrFld = " + (bFld) + "," + byFld + "," + FuzzerUtils.checkSum(this.iArrFld));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
