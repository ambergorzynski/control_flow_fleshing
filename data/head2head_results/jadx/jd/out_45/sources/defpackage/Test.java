

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_45/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_45/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public long lFld = -4226959853L;
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long instanceCount = -1886613931;
    public static boolean bFld = true;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, 0);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }

    public static void vMeth1(long j) {
        int i;
        int i2;
        int i3 = -171;
        int i4 = -207;
        float f = 33.339f;
        byte b = -119;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 14L);
        int i5 = 13476 - ((int) instanceCount);
        int[] iArr = iArrFld;
        iArr[41] = iArr[41] - ((int) 2.36561d);
        int i6 = 1;
        do {
            i = 1;
            do {
                int i7 = i5 - i;
                f += (float) (i - instanceCount);
                i5 = 2;
                i++;
            } while (i < 7);
            i2 = i6;
            while (7 > i2) {
                int[] iArr2 = iArrFld;
                int i8 = i6 - 1;
                iArr2[i8] = iArr2[i8] << i6;
                i3 -= i;
                i2++;
            }
            f -= i3;
            if (2 != 0) {
                vMeth1_check_sum += (((((((((((j + 2) + Double.doubleToLongBits(2.36561d)) + i6) + i) + Float.floatToIntBits(f)) + i2) + i3) + i4) + 60910) + b) - 6444) + FuzzerUtils.checkSum(jArr);
                return;
            }
            i4 = 1;
            while (i4 < 7) {
                b = (byte) (b >> ((byte) (-6444)));
                int i9 = i4;
                jArr[i9] = jArr[i9] - j;
                i4++;
            }
            i6++;
        } while (i6 < 228);
        vMeth1_check_sum += (((((((((((j + 2) + Double.doubleToLongBits(2.36561d)) + i6) + i) + Float.floatToIntBits(f)) + i2) + i3) + i4) + 60910) + b) - 6444) + FuzzerUtils.checkSum(jArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
    
        r17 = r17 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vMeth(int r7) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth(int):void");
    }

    public static int iMeth(int i) {
        int i2 = 5;
        int[][][] iArr = new int[N][N][N];
        long j = -13;
        short s = -32206;
        FuzzerUtils.init((Object[][]) iArr, (Object) (-14));
        vMeth(i);
        int i3 = i - i;
        int i4 = 11;
        while (i4 < 236) {
            j = 1;
            if (1 < 7) {
                i2 = 1;
                while (true) {
                    i2++;
                    if (i2 < 2) {
                        iArr = iArr;
                        int[] iArr2 = iArrFld;
                        iArr2[i2] = iArr2[i2] - 36983;
                    }
                }
            }
            s = (short) (s + ((short) (((i4 * 54451) + 1) - instanceCount)));
            instanceCount *= 54451;
            i3 += (int) 0.75468d;
            double d = 0.75468d - (-11446.0d);
            iArrFld[i4] = 49775;
            i4++;
        }
        long checkSum = i3 + i4 + 54451 + j + 36983 + i2 + s + FuzzerUtils.checkSum((Object[][]) iArr);
        iMeth_check_sum += checkSum;
        return (int) checkSum;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void mainTest(String[] strArr) {
        int i = -153;
        int i2 = 8;
        int i3 = 9;
        int i4 = 43794;
        int i5 = -32829;
        int i6 = -3;
        boolean z = -210;
        int i7 = 207;
        boolean z2 = -7;
        int[][][] iArr = new int[N][N][N];
        short s = 1240;
        float f = 0.135f;
        FuzzerUtils.init((Object[][]) iArr, (Object) (-1));
        int i8 = 1;
        while (true) {
            i8++;
            if (i8 < 228) {
                i = 110;
                z = z;
                z2 = z2;
                while (5 < i) {
                    i3 = 1;
                    while (true) {
                        i3++;
                        if (i3 < 3) {
                            i2 += i3 * i3;
                            short s2 = s;
                            s = (short) (s + 1);
                            float abs = Math.abs(-1.388f) / (s2 | 1);
                            long j = instanceCount;
                            instanceCount = j + 1;
                            if (abs + ((float) j) == ((float) (iMeth(i3) + instanceCount))) {
                                iArrFld[i3] = 40718;
                            }
                        } else {
                            switch (((i8 % 5) * 5) + 104) {
                                case 106:
                                case 128:
                                    int i9 = i2 / (i2 | 1);
                                    i2 = 25312;
                                    break;
                                case 108:
                                    i5 += i * i;
                                    break;
                                case 120:
                                    instanceCount = i;
                                    if (bFld) {
                                        this.lFld >>= (int) this.lFld;
                                        i2 -= 120;
                                        i6 = i;
                                        while (i6 < 3) {
                                            this.lFld += i6 + this.lFld;
                                            i6++;
                                        }
                                    } else if (bFld) {
                                        i5 = i;
                                    } else {
                                        i7 = 1;
                                        z = z;
                                        z2 = z2;
                                        while (i7 < 3) {
                                            bFld = bFld;
                                            z2 = -14545;
                                            z = ((z ? 1 : 0) & 13) == true ? 1 : 0;
                                            f = -49761.0f;
                                            iArr = iArr;
                                            i7++;
                                        }
                                    }
                                    i5 += i * i;
                                    break;
                                case 125:
                                    i4 = 3;
                                    while (i4 > i8) {
                                        instanceCount = i5;
                                        s = (short) (s >> (-38));
                                        i5 = i8;
                                        instanceCount = i4;
                                        i4--;
                                    }
                                    i5 >>>= i3;
                                    int i92 = i2 / (i2 | 1);
                                    i2 = 25312;
                                    break;
                            }
                            i -= 2;
                            z = z;
                            z2 = z2;
                        }
                    }
                }
            } else {
                FuzzerUtils.out.println("i i1 i2 = " + i8 + "," + i + "," + i2);
                FuzzerUtils.out.println("i3 s i21 = " + i3 + "," + s + "," + i4);
                FuzzerUtils.out.println("i22 i23 i24 = " + i5 + "," + i6 + "," + z);
                FuzzerUtils.out.println("i25 i26 f3 = " + i7 + "," + z2 + "," + Float.floatToIntBits(f));
                FuzzerUtils.out.println("iArr1 = " + FuzzerUtils.checkSum((Object[][]) iArr));
                PrintStream printStream = FuzzerUtils.out;
                long j2 = instanceCount;
                long j3 = this.lFld;
                if (bFld) {
                }
                printStream.println("Test.instanceCount lFld Test.bFld = " + j2 + "," + printStream + "," + j3);
                FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
                FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
                FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
                FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
                return;
            }
        }
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
