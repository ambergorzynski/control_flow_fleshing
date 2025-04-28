package defpackage;

import java.io.PrintStream;
/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/initial_commit/out_5/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/initial_commit/out_5/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* renamed from: Test  reason: default package */
/* loaded from: Test.class */
public class Test {
    public static final int N = 400;
    public int iFld = -179;
    public float fFld = -52.187f;
    public volatile byte[] byArrFld = new byte[400];
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long instanceCount = -2676283149L;
    public static boolean bFld = true;
    public static double dFld = 47.117853d;
    public static byte byFld = 30;
    public static int[] iArrFld = new int[400];

    static {
        FuzzerUtils.init(iArrFld, 10986);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
    }

    public static int iMeth1(int i) {
        int i2 = -9;
        int i3 = 62199;
        int i4 = -243;
        int[] iArr = new int[400];
        byte b = 71;
        float f = 0.743f;
        FuzzerUtils.init(iArr, -15056);
        int i5 = 1;
        do {
            i = i;
            b = (byte) (b >> ((byte) i));
            if (!bFld) {
                i2 = i5;
                while (i2 < 8) {
                    try {
                        int i6 = i5 % 13943;
                        i = iArr[i2 + 1] % 66;
                        iArr[i2 + 1] = iArr[i5 - 1] % i5;
                    } catch (ArithmeticException e) {
                    }
                    i3 = 1;
                    while (i2 < i3) {
                        iArr[i2 + 1] = -83;
                        i4 = (int) dFld;
                        b = (byte) (b * ((byte) f));
                        switch (((i5 >>> 1) % 2) + 51) {
                            case 51:
                                f = 14.0f;
                                break;
                            case 52:
                                if (65 != 0) {
                                }
                                break;
                        }
                        i += i3 - b;
                        try {
                            int i7 = iArr[i5] % (-227);
                            iArr[i2 + 1] = i7 / i7;
                            i = i5 % 8784;
                        } catch (ArithmeticException e2) {
                        }
                        i3 -= 3;
                    }
                    i2++;
                }
            }
            i5++;
        } while (i5 < 201);
        long floatToIntBits = i + i5 + b + i2 + 65 + i3 + i4 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static int iMeth(int i) {
        float f;
        float f2;
        float[] fArr = new float[400];
        int i2 = 39245;
        int i3 = 45;
        int i4 = 39;
        int[] iArr = new int[400];
        long[] jArr = new long[400];
        FuzzerUtils.init(iArr, 8);
        FuzzerUtils.init(jArr, 14L);
        FuzzerUtils.init(fArr, -80.953f);
        float f3 = 0.544f + 1.0f + 1.0f;
        short s = (short) ((-26659) >> ((short) ((f - i) - f)));
        int i5 = 347;
        while (i5 > 12) {
            int abs = Math.abs(i2);
            i2 = abs;
            i = Math.min(abs, (int) ((instanceCount - (-104)) | (188 * (-instanceCount))));
            switch ((i5 % 4) + 113) {
                case 113:
                    i3 = 1;
                    while (i3 < 9) {
                        try {
                            iArr[i3] = i2 % i5;
                            int i6 = i3 / 42321;
                            i2 = i % 229;
                        } catch (ArithmeticException e) {
                        }
                        i4 += i3 * i3;
                        i += i3;
                        int i7 = i3 + 1;
                        long j = jArr[i7];
                        int i8 = i5 + 1;
                        fArr[i8] = fArr[i8] - 1.0f;
                        jArr[i7] = j / ((f2 * (iMeth1(i2) - (-195))) | 1);
                        instanceCount -= i;
                        byFld = (byte) (byFld - ((byte) i3));
                        if (bFld) {
                        }
                        i3++;
                    }
                    i >>>= 101;
                    break;
                case 114:
                    int i9 = i5 - 1;
                    iArr[i9] = iArr[i9] | i2;
                    break;
                case 115:
                    instanceCount += 10;
                    break;
                case 116:
                    f3 -= 159.0f;
                    break;
                default:
                    bFld = bFld;
                    break;
            }
            i5 -= 2;
        }
        long floatToIntBits = i + s + Float.floatToIntBits(f3) + i5 + i2 + i3 + i4 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static void vMeth(int i) {
        int i2 = -218;
        int i3 = 0;
        int i4 = -37592;
        int i5 = -50451;
        int i6 = 6;
        short[] sArr = new short[400];
        byte[] bArr = new byte[400];
        long[][][] jArr = new long[400][400][400];
        FuzzerUtils.init(bArr, (byte) 101);
        FuzzerUtils.init(sArr, (short) -22983);
        FuzzerUtils.init((Object[][]) jArr, (Object) 9L);
        bArr[43] = (byte) (bArr[43] & ((byte) (iMeth(i) % 1)));
        sArr[(i >>> 1) % 400] = (short) i;
        int[] iArr = iArrFld;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = iArr[i7];
            i2 = 1;
            while (i2 < 4) {
                i4 = 1;
                while (i4 < 2) {
                    int[] iArr2 = iArrFld;
                    int i9 = i2;
                    iArr2[i9] = iArr2[i9] >> i2;
                    iArrFld[i2 - 1] = i;
                    jArr[i2 - 1][i2][i2 + 1] = instanceCount;
                    i4++;
                }
                i5 += 19 + (i2 * i2);
                i8 = i8;
                instanceCount <<= 11;
                i3 -= (int) instanceCount;
                i6 = 1;
                do {
                    instanceCount = 48617L;
                    i8 *= -7186;
                    i6++;
                } while (i6 < 2);
                i2++;
            }
        }
        vMeth_check_sum += ((((((i + i2) + i3) + i4) + i5) + i6) - 7186) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum((Object[][]) jArr);
    }

    public void mainTest(String[] strArr) {
        int i = -7;
        int i2 = -61;
        int i3 = 54516;
        int i4 = 10085;
        long j = -1307102327;
        vMeth(this.iFld);
        int i5 = 192;
        while (true) {
            i5--;
            if (i5 <= 0) {
                break;
            }
            i = 1;
            do {
                this.iFld += ((i * i5) + this.iFld) - i5;
                this.fFld = i5;
                this.iFld += i * i;
                dFld += i5;
                instanceCount = i5;
                i++;
            } while (i < 131);
            instanceCount &= this.iFld;
            instanceCount += i5;
            i2 = 131;
            while (i2 > 2) {
                instanceCount = -86L;
                this.iFld = i2;
                dFld = i;
                iArrFld[i2 + 1] = i5;
                instanceCount = i5;
                instanceCount += instanceCount;
                byte[] bArr = this.byArrFld;
                int i6 = i2;
                bArr[i6] = (byte) (bArr[i6] + ((byte) instanceCount));
                long j2 = 1;
                while (true) {
                    j = j2;
                    if (j >= 3) {
                        break;
                    }
                    bFld = bFld;
                    this.iFld -= 8;
                    this.fFld += this.fFld;
                    this.iFld += (int) (j * j);
                    this.fFld *= (float) j;
                    j2 = j + 1;
                }
                instanceCount = (long) dFld;
                i4 = i5;
                while (i4 < 3) {
                    i3 /= (int) (instanceCount | 1);
                    this.iFld = i3;
                    byFld = (byte) -7;
                    i4++;
                }
                i2 -= 2;
            }
        }
        FuzzerUtils.out.println("i19 i20 i21 = " + i5 + "," + i + "," + i2);
        PrintStream printStream = FuzzerUtils.out;
        printStream.println("i22 l i23 = " + i3 + "," + j + "," + printStream);
        FuzzerUtils.out.println("i24 i25 = " + i4 + "," + 148);
        PrintStream printStream2 = FuzzerUtils.out;
        long j3 = instanceCount;
        boolean z = bFld;
        Double.doubleToLongBits(dFld);
        printStream2.println("Test.instanceCount Test.bFld Test.dFld = " + j3 + "," + printStream2 + "," + z);
        FuzzerUtils.out.println("Test.byFld iFld fFld = " + byFld + "," + this.iFld + "," + Float.floatToIntBits(this.fFld));
        PrintStream printStream3 = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(iArrFld);
        FuzzerUtils.checkSum(this.byArrFld);
        printStream3.println("Test.iArrFld byArrFld = " + checkSum + "," + printStream3);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
