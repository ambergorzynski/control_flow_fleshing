

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_22/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_22/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public int iFld2 = 51275;
    public float[] fArrFld = new float[N];
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long instanceCount = -133;
    public static double dFld = 49.83847d;
    public static boolean bFld = false;
    public static float fFld = 9.36f;
    public static int iFld = -64;
    public static long lFld = 3433240200L;
    public static int iFld1 = -28662;
    public static final int N = 400;
    public static volatile int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, 54441);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
    }

    public static int iMeth1(double d) {
        int i = -149;
        int i2 = 11;
        int i3 = 29364;
        int i4 = 13;
        int i5 = -52351;
        boolean z = true;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 58883L);
        int i6 = 7;
        while (i6 < 245) {
            i2 = 7;
            while (i2 > 1) {
                z = bFld;
                i3 = (int) dFld;
                i4 = i6;
                while (i4 < 2) {
                    instanceCount += i4 + instanceCount;
                    int[] iArr = iArrFld;
                    int i7 = (i2 >>> 1) % N;
                    iArr[i7] = iArr[i7] + 10;
                    instanceCount = i6;
                    fFld += i6;
                    bFld = true;
                    i4++;
                }
                i += i2 - 125;
                i5 -= (int) dFld;
                i2--;
            }
            i6++;
        }
        long doubleToLongBits = Double.doubleToLongBits(d) + i6 + i + i2 + i3 + (z ? 1 : 0) + i4 + i5 + 125 + FuzzerUtils.checkSum(jArr);
        iMeth1_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static int iMeth(int i, long j, float f) {
        int i2 = -106;
        int i3 = -2;
        int i4 = 17998;
        int i5 = 5;
        float max = Math.max(-93, iMeth1(dFld));
        int i6 = 1;
        while (true) {
            i6++;
            if (i6 < 195) {
                i2 = 1;
                while (i2 < 8) {
                    int i7 = i3 + ((int) max);
                    i4 = 1;
                    while (i4 < 2) {
                        int[] iArr = iArrFld;
                        int i8 = i4;
                        iArr[i8] = iArr[i8] - i4;
                        i = (int) (i + (i4 * instanceCount));
                        i4++;
                    }
                    i3 = i7 + (((i2 * i6) + i7) - i4);
                    instanceCount += i2 - i2;
                    i5 = (i5 >> i5) + ((int) instanceCount);
                    i += i2;
                    i2++;
                }
                i5 = ((int) (i5 + (((i6 * max) + i3) - max))) % (-88);
                i = i2;
            } else {
                long floatToIntBits = i + j + Float.floatToIntBits(max) + i6 + i2 + i3 + i4 + i5;
                iMeth_check_sum += floatToIntBits;
                return (int) floatToIntBits;
            }
        }
    }

    public void vMeth() {
        int i = -201;
        int i2 = -96;
        int i3 = 58;
        dFld *= -34098.0d;
        iMeth(iFld, instanceCount, fFld);
        int[] iArr = iArrFld;
        int i4 = (iFld >>> 1) % N;
        iArr[i4] = iArr[i4] & iFld;
        int i5 = 9;
        while (i5 < 218) {
            instanceCount = instanceCount;
            this.fArrFld[i5 + 1] = i5;
            int[] iArr2 = iArrFld;
            int i6 = i5;
            iArr2[i6] = iArr2[i6] * i5;
            lFld = i5;
            i2 = 1;
            while (i2 < 8) {
                i3 = 1;
                while (i3 < 2) {
                    i <<= -5;
                    switch ((((i2 >>> 1) % 1) * 5) + 80) {
                        case 81:
                            i = i5;
                            lFld += i3 - (-5);
                            iFld >>= i2;
                            break;
                    }
                    i3++;
                }
                i2++;
            }
            i5++;
        }
        vMeth_check_sum += ((((i5 + i) + i2) - 5) + i3) - 17527;
    }

    public void mainTest(String[] strArr) {
        int i = 12;
        int i2 = -10;
        int i3 = 13;
        int i4 = 110;
        int i5 = 136;
        int i6 = 13;
        int i7 = -124;
        int i8 = 41822;
        short s = -28317;
        byte[] bArr = new byte[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 38009L);
        FuzzerUtils.init(bArr, (byte) -92);
        int i9 = 1;
        while (167 > i9) {
            i2 = 289;
            while (true) {
                i2--;
                if (i2 <= 0) {
                    break;
                }
                i = (-76) | i9;
                i3 = 1;
                while (i3 < 2) {
                    vMeth();
                    jArr[i3] = i;
                    i3++;
                }
                int i10 = i9 - 1;
                jArr[i10] = jArr[i10] << iFld;
                i5 = i2;
                while (i5 < 2) {
                    i = (int) instanceCount;
                    i4 += (-50730) + (i5 * i5);
                    s = (short) (s + ((short) (((i5 * i) + i) - i6)));
                    i6 += i4;
                    dFld -= fFld;
                    i5++;
                }
                fFld += ((i2 * (-106)) + i4) - iFld;
                i6 -= (int) fFld;
                iFld += i2;
                int[] iArr = iArrFld;
                int i11 = i2 - 1;
                iArr[i11] = iArr[i11] + iFld1;
            }
            i7 = 4;
            while (i7 < 210) {
                try {
                    int i12 = iFld1 / i6;
                    iFld = (-20360) % iArrFld[i7 + 1];
                    i8 = iFld1 % 366847954;
                } catch (ArithmeticException e) {
                }
                i8 -= this.iFld2;
                iFld -= (int) dFld;
                lFld += ((i7 * i7) + i7) - i4;
                this.iFld2 = (int) instanceCount;
                lFld += (long) dFld;
                bArr[i9 + 1] = (byte) 61;
                s = (short) (s + ((short) (i7 * i7)));
                int i13 = i9 - 1;
                jArr[i13] = jArr[i13] * i9;
                i7++;
            }
            dFld = i5;
            i9 += 3;
        }
        FuzzerUtils.out.println("i i1 i2 = " + i9 + "," + i + "," + i2);
        FuzzerUtils.out.println("i3 i4 i23 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("i24 s by1 = " + i6 + "," + s + "," + (-106));
        FuzzerUtils.out.println("i25 i26 i27 = " + i7 + "," + 61 + "," + i8);
        PrintStream printStream = FuzzerUtils.out;
        long checkSum = FuzzerUtils.checkSum(jArr);
        FuzzerUtils.checkSum(bArr);
        printStream.println("lArr1 byArr = " + checkSum + "," + printStream);
        PrintStream printStream2 = FuzzerUtils.out;
        long j = instanceCount;
        long doubleToLongBits = Double.doubleToLongBits(dFld);
        if (bFld) {
        }
        printStream2.println("Test.instanceCount Test.dFld Test.bFld = " + j + "," + printStream2 + "," + doubleToLongBits);
        FuzzerUtils.out.println("Test.fFld Test.iFld Test.lFld = " + Float.floatToIntBits(fFld) + "," + iFld + "," + lFld);
        FuzzerUtils.out.println("Test.iFld1 iFld2 Test.iArrFld = " + iFld1 + "," + this.iFld2 + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld)));
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
