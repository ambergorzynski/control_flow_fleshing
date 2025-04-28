

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_37/eposide-1/1/original-1/Test.dex
  /data/dev/jdtester_backup/results/jadx_pre_ff_fix_commit/out_37/eposide-1/1/original-1/classes.dex
  Test.jar:Test.class
 */
/* loaded from: Test.class */
public class Test {
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long lMeth_check_sum;
    public static long instanceCount = 59861;
    public static double dFld = 33.95048d;
    public static short sFld = -3797;
    public static byte byFld = -109;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];

    static {
        FuzzerUtils.init(iArrFld, -9);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        lMeth_check_sum = 0L;
    }

    public static long lMeth() {
        int i = 39035;
        int i2 = -14;
        int i3 = 0;
        boolean z = false;
        boolean[] zArr = new boolean[N];
        FuzzerUtils.init(zArr, false);
        int i4 = 1;
        while (i4 < 193) {
            float f = -97.186f;
            int i5 = i >>> i4;
            int i6 = i4;
            if (z) {
                i6 = (int) instanceCount;
            } else if (z) {
                dFld = i6;
                z = false;
                f = (-97.186f) * i4;
                if (i4 != 0) {
                }
            }
            i = i6 - ((int) dFld);
            instanceCount -= f;
            i2 = 1;
            while (i2 < 8) {
                zArr[i4] = z;
                i3 = i2;
                i2++;
            }
            i4++;
        }
        long checkSum = i4 + i + (z ? 1 : 0) + i2 + i3 + 12067 + FuzzerUtils.checkSum(zArr);
        lMeth_check_sum += checkSum;
        return checkSum;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:944)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:807)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:851)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:810)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:851)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:810)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:263)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:263)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void vMeth1() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth1():void");
    }

    public static void vMeth(float f, float f2) {
        double d = 0.121701d;
        int i = -65;
        int i2 = -12;
        int i3 = 0;
        byte[] bArr = new byte[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(bArr, (byte) 125);
        FuzzerUtils.init(jArr, 1408872462L);
        if (1 != 0) {
            double d2 = 8.0d;
            while (true) {
                d = d2;
                if (d >= 193.0d) {
                    break;
                }
                int i4 = (int) d;
                byte b = bArr[i4];
                bArr[i4] = (byte) (b - 1);
                int[] iArr = iArrFld;
                int i5 = (int) (d - 1.0d);
                int i6 = iArr[i5] - 1;
                iArr[i5] = i6;
                i += b + i6;
                if (1 != 0) {
                    vMeth1();
                    i2 = (int) d;
                    while (i2 < 9) {
                        instanceCount += i2 * i2;
                        int[] iArr2 = iArrFld;
                        int i7 = (int) (d - 1.0d);
                        iArr2[i7] = iArr2[i7] - ((int) dFld);
                        sFld = (short) dFld;
                        int i8 = (int) (d - 1.0d);
                        jArr[i8] = jArr[i8] >> i3;
                        int i9 = i - sFld;
                        instanceCount += instanceCount;
                        instanceCount &= byFld;
                        i = i9 + i9;
                        i2++;
                    }
                } else if (1 != 0) {
                    f2 += i;
                } else {
                    i3 >>>= i;
                }
                d2 = d + 1.0d;
            }
        } else if (1 != 0) {
            dFld -= 13.0d;
        } else if (1 != 0) {
            i3 = 0 >> sFld;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f2) + Double.doubleToLongBits(d) + i + i2 + i3 + (1 != 0 ? 1 : 0) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(jArr);
    }

    public void mainTest(String[] strArr) {
        int i = 16101;
        int i2 = -38936;
        int i3 = 58;
        int i4 = 4;
        int i5 = -11302;
        short s = -20376;
        float f = 2.55f;
        byte[] bArr = new byte[N];
        boolean[] zArr = new boolean[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(bArr, (byte) -55);
        FuzzerUtils.init(zArr, true);
        FuzzerUtils.init(jArr, -4683597909419822601L);
        int i6 = (int) ((31792 - instanceCount) + (152 << (31792 - (-20376))));
        vMeth(2.55f, 2.55f);
        int[] iArr = iArrFld;
        int i7 = (i6 >>> 1) % N;
        iArr[i7] = iArr[i7] << (-8);
        int i8 = 1;
        while (true) {
            i8++;
            if (i8 < 204) {
                i = 1;
                do {
                    i6 = -40471;
                    instanceCount -= 40471;
                    switch ((i8 % 2) + 70) {
                        case 70:
                            i6 = (-40471) + i;
                            switch ((i8 % 9) + 100) {
                                case 100:
                                    instanceCount = ((float) instanceCount) + (((i * f) + i8) - f);
                                    i2 = i2 + (((i * i8) + i) - i2) + i;
                                    break;
                                case 101:
                                    i2 >>= i8;
                                case 102:
                                    instanceCount -= 8686;
                                    break;
                                case 103:
                                    i3 = 1;
                                    while (i3 < 1) {
                                        iArrFld[i3 + 1] = (int) f;
                                        instanceCount += i3;
                                        i3++;
                                    }
                                    break;
                                case 104:
                                    int i9 = i2 >> i8;
                                    i2 = 148;
                                    bArr[i] = (byte) instanceCount;
                                    i5 = 1;
                                    while (i5 < 1) {
                                        byFld = (byte) (byFld >> ((byte) i4));
                                        f = (f + i) * i3;
                                        i2 ^= (int) instanceCount;
                                        zArr = zArr;
                                        int i10 = (11 >>> 1) % N;
                                        jArr[i10] = jArr[i10] * i2;
                                        i5++;
                                    }
                                    break;
                                case 105:
                                    s = (short) (s + ((short) i));
                                    f += i2;
                                    break;
                                case 106:
                                    dFld -= i;
                                case 107:
                                    int[] iArr2 = iArrFld;
                                    int i11 = i + 1;
                                    iArr2[i11] = iArr2[i11] - i5;
                                    break;
                                case 108:
                                    i4 += ((i * 11) + i3) - i;
                                    break;
                            }
                            break;
                        case 71:
                            f -= (float) instanceCount;
                            break;
                    }
                    i++;
                } while (i < 123);
            } else {
                FuzzerUtils.out.println("i s f4 = " + i6 + "," + s + "," + Float.floatToIntBits(f));
                FuzzerUtils.out.println("i14 i15 i16 = " + i8 + "," + i + "," + i2);
                FuzzerUtils.out.println("i17 i18 i19 = " + i3 + "," + i4 + "," + i5);
                PrintStream printStream = FuzzerUtils.out;
                long checkSum = FuzzerUtils.checkSum(bArr);
                FuzzerUtils.checkSum(zArr);
                printStream.println("i20 byArr1 bArr1 = " + 11 + "," + checkSum + "," + printStream);
                FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(jArr));
                PrintStream printStream2 = FuzzerUtils.out;
                long j = instanceCount;
                long doubleToLongBits = Double.doubleToLongBits(dFld);
                short s2 = sFld;
                printStream2.println("Test.instanceCount Test.dFld Test.sFld = " + j + "," + printStream2 + "," + doubleToLongBits);
                FuzzerUtils.out.println("Test.byFld Test.iArrFld = " + byFld + "," + FuzzerUtils.checkSum(iArrFld));
                FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
                FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
                FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
