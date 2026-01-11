package android.support.v4.media;

import aa.a;
import android.graphics.Path;
import android.graphics.Typeface;
import ca.d;
import ca.e;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.Set;
import net.jpountz.lz4.LZ4FrameOutputStream;
import s7.c;
import xg.f;
import xg.q;
import xg.s;

public abstract class b implements d, e, c {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f728a = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};

    /* renamed from: b  reason: collision with root package name */
    public static a.C0001a f729b;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f730c = {13, 41, 121, 337, 897, 2305};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f731s = new byte[0];

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f732t = new int[0];

    /* renamed from: u  reason: collision with root package name */
    public static final f[] f733u = new f[0];

    public static int A(int[] iArr, int[] iArr2) {
        long j10 = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L) + 0;
        int i = (int) j10;
        iArr[8] = i;
        iArr2[16] = i;
        long j11 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[17]) & 4294967295L) + (j10 >>> 32);
        int i10 = (int) j11;
        iArr[9] = i10;
        iArr2[17] = i10;
        long j12 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[18]) & 4294967295L) + (j11 >>> 32);
        int i11 = (int) j12;
        iArr[10] = i11;
        iArr2[18] = i11;
        long j13 = (((long) iArr[11]) & 4294967295L) + (((long) iArr2[19]) & 4294967295L) + (j12 >>> 32);
        int i12 = (int) j13;
        iArr[11] = i12;
        iArr2[19] = i12;
        long j14 = (((long) iArr[12]) & 4294967295L) + (((long) iArr2[20]) & 4294967295L) + (j13 >>> 32);
        int i13 = (int) j14;
        iArr[12] = i13;
        iArr2[20] = i13;
        long j15 = (((long) iArr[13]) & 4294967295L) + (((long) iArr2[21]) & 4294967295L) + (j14 >>> 32);
        int i14 = (int) j15;
        iArr[13] = i14;
        iArr2[21] = i14;
        long j16 = (((long) iArr[14]) & 4294967295L) + (((long) iArr2[22]) & 4294967295L) + (j15 >>> 32);
        int i15 = (int) j16;
        iArr[14] = i15;
        iArr2[22] = i15;
        long j17 = (((long) iArr[15]) & 4294967295L) + (4294967295L & ((long) iArr2[23])) + (j16 >>> 32);
        int i16 = (int) j17;
        iArr[15] = i16;
        iArr2[23] = i16;
        return (int) (j17 >>> 32);
    }

    public static boolean A0(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            int i10 = iArr[i] ^ LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            int i11 = Integer.MIN_VALUE ^ iArr2[i];
            if (i10 < i11) {
                return false;
            }
            if (i10 > i11) {
                return true;
            }
        }
        return true;
    }

    public static int B(int i, int i10, int[] iArr, int i11) {
        long j10 = (((long) i10) & 4294967295L) + (4294967295L & ((long) iArr[i11]));
        iArr[i11] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return G0(i, iArr, i11 + 1);
    }

    public static boolean B0(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            int i10 = iArr[i] ^ LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            int i11 = Integer.MIN_VALUE ^ iArr2[i];
            if (i10 < i11) {
                return false;
            }
            if (i10 > i11) {
                return true;
            }
        }
        return true;
    }

    public static void B1(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static int C(int i, int i10, int[] iArr) {
        long j10 = (((long) i10) & 4294967295L) + (4294967295L & ((long) iArr[0]));
        iArr[0] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return G0(i, iArr, 1);
    }

    public static boolean C0(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            int i10 = iArr[i] ^ LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            int i11 = Integer.MIN_VALUE ^ iArr2[i];
            if (i10 < i11) {
                return false;
            }
            if (i10 > i11) {
                return true;
            }
        }
        return true;
    }

    public static void C1(int[] iArr, int[] iArr2, int[] iArr3) {
        K1(iArr, iArr2);
        r1(iArr, iArr2, iArr2);
        int[] iArr4 = new int[10];
        K1(iArr2, iArr4);
        r1(iArr, iArr4, iArr4);
        J1(iArr4, 2, iArr4);
        r1(iArr2, iArr4, iArr4);
        int[] iArr5 = new int[10];
        J1(iArr4, 5, iArr5);
        r1(iArr4, iArr5, iArr5);
        int[] iArr6 = new int[10];
        J1(iArr5, 5, iArr6);
        r1(iArr4, iArr6, iArr6);
        J1(iArr6, 10, iArr4);
        r1(iArr5, iArr4, iArr4);
        J1(iArr4, 25, iArr5);
        r1(iArr4, iArr5, iArr5);
        J1(iArr5, 25, iArr6);
        r1(iArr4, iArr6, iArr6);
        J1(iArr6, 50, iArr4);
        r1(iArr5, iArr4, iArr4);
        J1(iArr4, 125, iArr5);
        r1(iArr4, iArr5, iArr5);
        J1(iArr5, 2, iArr4);
        r1(iArr4, iArr, iArr3);
    }

    public static void D(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i10 = iArr[i];
            int i11 = iArr2[i];
            iArr3[i] = i10 + i11;
            iArr4[i] = i10 - i11;
        }
    }

    public static boolean D0(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            int i10 = iArr[i] ^ LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            int i11 = Integer.MIN_VALUE ^ iArr2[i];
            if (i10 < i11) {
                return false;
            }
            if (i10 > i11) {
                return true;
            }
        }
        return true;
    }

    public static q D1(f fVar, int i) {
        xg.d dVar = fVar.f13245a;
        return (q) dVar.o(fVar, "bc_wnaf", new s(i, fVar, dVar));
    }

    public static int E0(int i, int[] iArr, int[] iArr2) {
        int i10 = 0;
        while (i10 < i) {
            int i11 = iArr[i10] + 1;
            iArr2[i10] = i11;
            i10++;
            if (i11 != 0) {
                while (i10 < i) {
                    iArr2[i10] = iArr[i10];
                    i10++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static void E1(int[] iArr, int i) {
        int i10 = iArr[9];
        long j10 = ((long) (((i10 >> 24) + i) * 19)) + ((long) iArr[0]);
        iArr[0] = ((int) j10) & 67108863;
        long j11 = (j10 >> 26) + ((long) iArr[1]);
        iArr[1] = ((int) j11) & 67108863;
        long j12 = (j11 >> 26) + ((long) iArr[2]);
        iArr[2] = ((int) j12) & 33554431;
        long j13 = (j12 >> 25) + ((long) iArr[3]);
        iArr[3] = ((int) j13) & 67108863;
        long j14 = (j13 >> 26) + ((long) iArr[4]);
        iArr[4] = ((int) j14) & 33554431;
        long j15 = (j14 >> 25) + ((long) iArr[5]);
        iArr[5] = ((int) j15) & 67108863;
        long j16 = (j15 >> 26) + ((long) iArr[6]);
        iArr[6] = ((int) j16) & 67108863;
        long j17 = (j16 >> 26) + ((long) iArr[7]);
        iArr[7] = 33554431 & ((int) j17);
        long j18 = (j17 >> 25) + ((long) iArr[8]);
        iArr[8] = 67108863 & ((int) j18);
        iArr[9] = (16777215 & i10) + ((int) (j18 >> 26));
    }

    public static int F(byte[] bArr, int i) {
        int i10 = i + 1;
        int i11 = i10 + 1;
        return (bArr[i11 + 1] & 255) | (bArr[i] << 24) | ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
    }

    public static int F0(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            int i10 = iArr[i] + 1;
            iArr[i] = i10;
            if (i10 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int F1(int i, int[] iArr, int i10, int[] iArr2) {
        int i11 = 0;
        while (i11 < i) {
            int i12 = iArr[i11];
            iArr2[i11] = (i10 >>> 31) | (i12 << 1);
            i11++;
            i10 = i12;
        }
        return i10 >>> 31;
    }

    public static BigInteger G(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i - 1);
        BigInteger shiftRight = multiply.shiftRight(i);
        if (testBit) {
            shiftRight = shiftRight.add(xg.b.f13229b);
        }
        return z ? shiftRight.negate() : shiftRight;
    }

    public static int G0(int i, int[] iArr, int i10) {
        while (i10 < i) {
            int i11 = iArr[i10] + 1;
            iArr[i10] = i11;
            if (i11 != 0) {
                return 0;
            }
            i10++;
        }
        return 1;
    }

    public static int G1(int i, int[] iArr) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            int i12 = iArr[i10];
            iArr[i10] = (i11 >>> -2) | (i12 << 2);
            i10++;
            i11 = i12;
        }
        return i11 >>> -2;
    }

    public static void H(int[] iArr) {
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int i17 = iArr[8];
        int i18 = i11 + (i10 >> 26);
        int i19 = i13 + (i12 >> 26);
        int i20 = i16 + (i15 >> 26);
        int i21 = iArr[9] + (i17 >> 26);
        int i22 = (i12 & 67108863) + (i18 >> 25);
        int i23 = i14 + (i19 >> 25);
        int i24 = (i17 & 67108863) + (i20 >> 25);
        int i25 = ((i21 >> 25) * 38) + i;
        int i26 = (i10 & 67108863) + (i25 >> 26);
        int i27 = (i15 & 67108863) + (i23 >> 26);
        iArr[0] = i25 & 67108863;
        iArr[1] = i26 & 67108863;
        iArr[2] = (i18 & 33554431) + (i26 >> 26);
        iArr[3] = i22 & 67108863;
        iArr[4] = (i19 & 33554431) + (i22 >> 26);
        iArr[5] = i23 & 67108863;
        iArr[6] = i27 & 67108863;
        iArr[7] = (i20 & 33554431) + (i27 >> 26);
        iArr[8] = i24 & 67108863;
        iArr[9] = (i21 & 33554431) + (i24 >> 26);
    }

    public static int H0(int i, int[] iArr, int i10) {
        while (i10 < i) {
            int i11 = 0 + i10;
            int i12 = iArr[i11] + 1;
            iArr[i11] = i12;
            if (i12 != 0) {
                return 0;
            }
            i10++;
        }
        return 1;
    }

    public static int H1(int i, int[] iArr, int[] iArr2) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            int i12 = iArr[i10];
            iArr2[i10] = (i11 >>> -3) | (i12 << 3);
            i10++;
            i11 = i12;
        }
        return i11 >>> -3;
    }

    public static void I(int i, int[] iArr, int i10, int[] iArr2) {
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = 0 + i11;
            int i13 = iArr2[i12];
            iArr2[i12] = i13 ^ ((iArr[i10 + i11] ^ i13) & i);
        }
    }

    public static void I0(int i, byte[] bArr, int i10) {
        bArr[i10] = (byte) (i >>> 24);
        int i11 = i10 + 1;
        bArr[i11] = (byte) (i >>> 16);
        int i12 = i11 + 1;
        bArr[i12] = (byte) (i >>> 8);
        bArr[i12 + 1] = (byte) i;
    }

    public static long I1(int i, long[] jArr) {
        long j10 = 0;
        int i10 = 0;
        while (i10 < i) {
            int i11 = 0 + i10;
            long j11 = jArr[i11];
            jArr[i11] = (j10 >>> -8) | (j11 << 8);
            i10++;
            j10 = j11;
        }
        return j10 >>> -8;
    }

    public static void J0(int i, byte[] bArr, int i10) {
        bArr[i10] = (byte) i;
        int i11 = i10 + 1;
        bArr[i11] = (byte) (i >>> 8);
        int i12 = i11 + 1;
        bArr[i12] = (byte) (i >>> 16);
        bArr[i12 + 1] = (byte) (i >>> 24);
    }

    public static void J1(int[] iArr, int i, int[] iArr2) {
        K1(iArr, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                K1(iArr2, iArr2);
            } else {
                return;
            }
        }
    }

    public static void K(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static void K0(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        if (i < 0) {
            i(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    public static void K1(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int i17 = iArr[8];
        int i18 = iArr[9];
        long j10 = (long) i;
        long j11 = j10 * j10;
        int i19 = i17;
        long j12 = (long) (i10 * 2);
        long j13 = j10 * j12;
        long j14 = (long) (i11 * 2);
        int i20 = i14;
        int i21 = i15;
        long j15 = (long) i10;
        long j16 = (j15 * j15) + (j10 * j14);
        int i22 = i;
        long j17 = (long) (i12 * 2);
        long j18 = (j10 * j17) + (j12 * j14);
        int i23 = i13;
        int i24 = i12;
        long j19 = (long) (i13 * 2);
        long j20 = j15 * j17;
        long j21 = j20 + (j10 * j19) + (((long) i11) * j14);
        long j22 = (j17 * j14) + (j12 * j19);
        int i25 = i24;
        long j23 = (long) i25;
        long j24 = (j23 * j23) + (j14 * j19);
        int i26 = i11;
        int i27 = i20;
        int i28 = i25;
        long j25 = (long) i27;
        long j26 = j25 * j25;
        long j27 = ((long) i23) * j19;
        long j28 = (long) (i21 * 2);
        long j29 = j25 * j28;
        long j30 = (long) (i16 * 2);
        long j31 = j23 * j19;
        int i29 = i27;
        int i30 = i21;
        long j32 = (long) i30;
        long j33 = (j32 * j32) + (j25 * j30);
        long j34 = j24;
        long j35 = (long) (i19 * 2);
        long j36 = (j25 * j35) + (j28 * j30);
        long j37 = j22;
        long j38 = (long) (i18 * 2);
        long j39 = j32 * j35;
        long j40 = j39 + (j25 * j38) + (((long) i16) * j30);
        long j41 = (j35 * j30) + (j28 * j38);
        int i31 = i19;
        long j42 = (long) i31;
        int i32 = i18;
        long j43 = j11 - (j41 * 38);
        long j44 = j13 - (((j42 * j42) + (j30 * j38)) * 38);
        long j45 = j16 - ((j42 * j38) * 38);
        long j46 = j18 - ((((long) i32) * j38) * 38);
        long j47 = j27 - j36;
        int i33 = i22 + i29;
        int i34 = i10 + i30;
        int i35 = i26 + i16;
        int i36 = i28 + i31;
        int i37 = i23 + i32;
        long j48 = j31 - j33;
        long j49 = j34 - j29;
        long j50 = j37 - j26;
        long j51 = (long) i33;
        long j52 = j51 * j51;
        long j53 = (long) (i34 * 2);
        long j54 = j51 * j53;
        long j55 = (long) (i35 * 2);
        long j56 = j40;
        long j57 = (long) i34;
        long j58 = (j57 * j57) + (j51 * j55);
        long j59 = j47;
        long j60 = (long) (i36 * 2);
        long j61 = j55;
        long j62 = (long) (i37 * 2);
        long j63 = j57 * j60;
        long j64 = (long) i36;
        long j65 = j64 * j64;
        long j66 = (((j51 * j60) + (j53 * j55)) - j46) + j59;
        long j67 = (((j63 + ((j51 * j62) + (((long) i35) * j55))) - j21) - j56) + (j66 >> 26);
        long j68 = j67 >> 25;
        long j69 = (((j68 + ((j60 * j61) + (j53 * j62))) - j50) * 38) + j43;
        iArr2[0] = ((int) j69) & 67108863;
        long j70 = (((j65 + (j61 * j62)) - j49) * 38) + j44 + (j69 >> 26);
        iArr2[1] = ((int) j70) & 67108863;
        long j71 = (((j64 * j62) - j48) * 38) + j45 + (j70 >> 26);
        iArr2[2] = ((int) j71) & 33554431;
        long j72 = (((((long) i37) * j62) - j59) * 38) + j46 + (j71 >> 25);
        iArr2[3] = ((int) j72) & 67108863;
        long a10 = a.a(j56, 38, j21, j72 >> 26);
        iArr2[4] = ((int) a10) & 33554431;
        long j73 = (j52 - j43) + j50 + (a10 >> 25);
        iArr2[5] = ((int) j73) & 67108863;
        long j74 = (j54 - j44) + j49 + (j73 >> 26);
        iArr2[6] = ((int) j74) & 67108863;
        long j75 = (j58 - j45) + j48 + (j74 >> 26);
        iArr2[7] = ((int) j75) & 33554431;
        long j76 = (j75 >> 25) + ((long) (((int) j66) & 67108863));
        iArr2[8] = ((int) j76) & 67108863;
        iArr2[9] = (((int) j67) & 33554431) + ((int) (j76 >> 26));
    }

    public static void L(int[] iArr, int[] iArr2, int i) {
        iArr2[i + 0] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
    }

    public static int L0(int[] iArr, int[] iArr2, int i, int[] iArr3, int i10) {
        int length = iArr.length;
        int i11 = 0;
        while (iArr2[0] == 0) {
            int i12 = i;
            int i13 = 0;
            while (true) {
                i12--;
                if (i12 < 0) {
                    break;
                }
                int i14 = iArr2[i12];
                iArr2[i12] = i13;
                i13 = i14;
            }
            i11 += 32;
        }
        int i15 = iArr2[0];
        int i16 = 0;
        while ((i15 & 1) == 0) {
            i15 >>>= 1;
            i16++;
        }
        if (i16 > 0) {
            int i17 = 0;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i18 = iArr2[i];
                iArr2[i] = (i17 << (-i16)) | (i18 >>> i16);
                i17 = i18;
            }
            i11 += i16;
        }
        for (int i19 = 0; i19 < i11; i19++) {
            if ((iArr3[0] & 1) != 0) {
                i10 = (i10 < 0 ? v(length, iArr, iArr3) : b2(length, iArr, iArr3)) + i10;
            }
            int i20 = i10;
            int i21 = length;
            while (true) {
                i21--;
                if (i21 < 0) {
                    break;
                }
                int i22 = iArr3[i21];
                iArr3[i21] = (i20 << 31) | (i22 >>> 1);
                i20 = i22;
            }
        }
        return i10;
    }

    public static void L1(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[0]) & 4294967295L;
        int i = 8;
        int i10 = 0;
        int i11 = 3;
        while (true) {
            int i12 = i11 - 1;
            long j11 = ((long) iArr[i11]) & 4294967295L;
            long j12 = j11 * j11;
            int i13 = i - 1;
            iArr2[i13] = (i10 << 31) | ((int) (j12 >>> 33));
            i = i13 - 1;
            iArr2[i] = (int) (j12 >>> 1);
            int i14 = (int) j12;
            if (i12 <= 0) {
                long j13 = j10 * j10;
                long j14 = (((long) (i14 << 31)) & 4294967295L) | (j13 >>> 33);
                iArr2[0] = (int) j13;
                long j15 = ((long) iArr[1]) & 4294967295L;
                long j16 = j14 + (j15 * j10);
                int i15 = (int) j16;
                iArr2[1] = (i15 << 1) | (((int) (j13 >>> 32)) & 1);
                long j17 = (((long) iArr2[2]) & 4294967295L) + (j16 >>> 32);
                long j18 = ((long) iArr[2]) & 4294967295L;
                long j19 = j10;
                long j20 = ((long) iArr2[3]) & 4294967295L;
                long j21 = (j18 * j19) + j17;
                int i16 = (int) j21;
                iArr2[2] = (i15 >>> 31) | (i16 << 1);
                long a10 = a.a(j18, j15, j21 >>> 32, j20);
                long j22 = (((long) iArr2[4]) & 4294967295L) + (a10 >>> 32);
                long j23 = ((long) iArr[3]) & 4294967295L;
                long j24 = (((long) iArr2[5]) & 4294967295L) + (j22 >>> 32);
                long j25 = j22 & 4294967295L;
                long j26 = (((long) iArr2[6]) & 4294967295L) + (j24 >>> 32);
                long j27 = (j19 * j23) + (a10 & 4294967295L);
                int i17 = (int) j27;
                iArr2[3] = (i17 << 1) | (i16 >>> 31);
                long a11 = a.a(j15, j23, j27 >>> 32, j25);
                long a12 = a.a(j23, j18, a11 >>> 32, j24 & 4294967295L);
                long j28 = j26 + (a12 >>> 32);
                int i18 = (int) a11;
                iArr2[4] = (i17 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) (4294967295L & a12);
                iArr2[5] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j28;
                iArr2[6] = i21 | (i22 << 1);
                iArr2[7] = ((iArr2[7] + ((int) (j28 >>> 32))) << 1) | (i22 >>> 31);
                return;
            }
            i11 = i12;
            i10 = i14;
        }
    }

    public static void M(int[] iArr, int[] iArr2, int i) {
        iArr2[i + 0] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
    }

    public static void M0(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (!V0(length, iArr2)) {
            int i = 0;
            if (N0(length, iArr2)) {
                System.arraycopy(iArr2, 0, iArr3, 0, length);
                return;
            }
            int[] iArr4 = new int[length];
            System.arraycopy(iArr2, 0, iArr4, 0, length);
            int[] iArr5 = new int[length];
            iArr5[0] = 1;
            int L0 = (1 & iArr4[0]) == 0 ? L0(iArr, iArr4, length, iArr5, 0) : 0;
            if (N0(length, iArr4)) {
                K0(iArr, L0, iArr5, iArr3);
                return;
            }
            int[] iArr6 = new int[length];
            System.arraycopy(iArr, 0, iArr6, 0, length);
            int[] iArr7 = new int[length];
            int i10 = length;
            while (true) {
                int i11 = i10 - 1;
                if (iArr4[i11] == 0 && iArr6[i11] == 0) {
                    i10 = i11;
                } else if (y0(i10, iArr4, iArr6)) {
                    b2(i10, iArr6, iArr4);
                    L0 = L0(iArr, iArr4, i10, iArr5, (b2(length, iArr7, iArr5) - i) + L0);
                    if (N0(i10, iArr4)) {
                        K0(iArr, L0, iArr5, iArr3);
                        return;
                    }
                } else {
                    b2(i10, iArr4, iArr6);
                    i = L0(iArr, iArr6, i10, iArr7, (b2(length, iArr5, iArr7) - L0) + i);
                    if (N0(i10, iArr6)) {
                        K0(iArr, i, iArr7, iArr3);
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
    }

    public static void M1(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[0]) & 4294967295L;
        int i = 10;
        int i10 = 0;
        int i11 = 4;
        while (true) {
            int i12 = i11 - 1;
            long j11 = ((long) iArr[i11]) & 4294967295L;
            long j12 = j11 * j11;
            int i13 = i - 1;
            iArr2[i13] = (i10 << 31) | ((int) (j12 >>> 33));
            i = i13 - 1;
            iArr2[i] = (int) (j12 >>> 1);
            int i14 = (int) j12;
            if (i12 <= 0) {
                long j13 = j10 * j10;
                long j14 = (((long) (i14 << 31)) & 4294967295L) | (j13 >>> 33);
                iArr2[0] = (int) j13;
                long j15 = ((long) iArr[1]) & 4294967295L;
                long j16 = j14 + (j15 * j10);
                int i15 = (int) j16;
                iArr2[1] = (i15 << 1) | (((int) (j13 >>> 32)) & 1);
                long j17 = (((long) iArr2[2]) & 4294967295L) + (j16 >>> 32);
                long j18 = ((long) iArr[2]) & 4294967295L;
                long j19 = j10;
                long j20 = ((long) iArr2[3]) & 4294967295L;
                long j21 = (j18 * j19) + j17;
                int i16 = (int) j21;
                iArr2[2] = (i15 >>> 31) | (i16 << 1);
                long a10 = a.a(j18, j15, j21 >>> 32, j20);
                long j22 = (((long) iArr2[4]) & 4294967295L) + (a10 >>> 32);
                long j23 = ((long) iArr[3]) & 4294967295L;
                long j24 = (((long) iArr2[5]) & 4294967295L) + (j22 >>> 32);
                long j25 = j22 & 4294967295L;
                long j26 = (((long) iArr2[6]) & 4294967295L) + (j24 >>> 32);
                long j27 = j24 & 4294967295L;
                long j28 = (j23 * j19) + (a10 & 4294967295L);
                int i17 = (int) j28;
                iArr2[3] = (i16 >>> 31) | (i17 << 1);
                long a11 = a.a(j23, j15, j28 >>> 32, j25);
                long a12 = a.a(j23, j18, a11 >>> 32, j27);
                long j29 = j26 + (a12 >>> 32);
                long j30 = a12 & 4294967295L;
                long j31 = ((long) iArr[4]) & 4294967295L;
                long j32 = (((long) iArr2[7]) & 4294967295L) + (j29 >>> 32);
                long j33 = (((long) iArr2[8]) & 4294967295L) + (j32 >>> 32);
                long j34 = (j19 * j31) + (a11 & 4294967295L);
                int i18 = (int) j34;
                iArr2[4] = (i17 >>> 31) | (i18 << 1);
                long a13 = a.a(j31, j15, j34 >>> 32, j30);
                long a14 = a.a(j31, j18, a13 >>> 32, j29 & 4294967295L);
                long a15 = a.a(j31, j23, a14 >>> 32, j32 & 4294967295L);
                long j35 = j33 + (a15 >>> 32);
                int i19 = (int) a13;
                iArr2[5] = (i19 << 1) | (i18 >>> 31);
                int i20 = (int) a14;
                iArr2[6] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) a15;
                iArr2[7] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j35;
                iArr2[8] = i23 | (i24 << 1);
                iArr2[9] = (i24 >>> 31) | ((iArr2[9] + ((int) (j35 >>> 32))) << 1);
                return;
            }
            i11 = i12;
            i10 = i14;
        }
    }

    public static void N(int[] iArr, int[] iArr2, int i) {
        iArr2[i + 0] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
    }

    public static boolean N0(int i, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < i; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void N1(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[0]) & 4294967295L;
        int i = 12;
        int i10 = 5;
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            long j11 = ((long) iArr[i10]) & 4294967295L;
            long j12 = j11 * j11;
            int i13 = i - 1;
            iArr2[i13] = (i11 << 31) | ((int) (j12 >>> 33));
            i = i13 - 1;
            iArr2[i] = (int) (j12 >>> 1);
            int i14 = (int) j12;
            if (i12 <= 0) {
                long j13 = j10 * j10;
                long j14 = (((long) (i14 << 31)) & 4294967295L) | (j13 >>> 33);
                iArr2[0] = (int) j13;
                long j15 = ((long) iArr[1]) & 4294967295L;
                long j16 = (j15 * j10) + j14;
                int i15 = (int) j16;
                iArr2[1] = (((int) (j13 >>> 32)) & 1) | (i15 << 1);
                long j17 = (((long) iArr2[2]) & 4294967295L) + (j16 >>> 32);
                long j18 = ((long) iArr[2]) & 4294967295L;
                long j19 = ((long) iArr2[3]) & 4294967295L;
                long j20 = ((long) iArr2[4]) & 4294967295L;
                long j21 = (j18 * j10) + j17;
                int i16 = (int) j21;
                iArr2[2] = (i15 >>> 31) | (i16 << 1);
                long a10 = a.a(j18, j15, j21 >>> 32, j19);
                long j22 = j20 + (a10 >>> 32);
                long j23 = ((long) iArr[3]) & 4294967295L;
                long j24 = (((long) iArr2[5]) & 4294967295L) + (j22 >>> 32);
                long j25 = j10;
                long j26 = (((long) iArr2[6]) & 4294967295L) + (j24 >>> 32);
                long j27 = j24 & 4294967295L;
                long j28 = (j23 * j25) + (a10 & 4294967295L);
                int i17 = (int) j28;
                iArr2[3] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                long a11 = a.a(j23, j15, j28 >>> 32, j22 & 4294967295L);
                long a12 = a.a(j23, j18, a11 >>> 32, j27);
                long j29 = j26 + (a12 >>> 32);
                long j30 = a12 & 4294967295L;
                long j31 = ((long) iArr[4]) & 4294967295L;
                long j32 = (((long) iArr2[7]) & 4294967295L) + (j29 >>> 32);
                long j33 = j29 & 4294967295L;
                long j34 = (((long) iArr2[8]) & 4294967295L) + (j32 >>> 32);
                long j35 = j32 & 4294967295L;
                long j36 = (j31 * j25) + (a11 & 4294967295L);
                int i19 = (int) j36;
                iArr2[4] = (i19 << 1) | i18;
                long a13 = a.a(j31, j15, j36 >>> 32, j30);
                long a14 = a.a(j31, j18, a13 >>> 32, j33);
                long j37 = j23;
                long a15 = a.a(j31, j37, a14 >>> 32, j35);
                long j38 = a14 & 4294967295L;
                long j39 = j34 + (a15 >>> 32);
                long j40 = ((long) iArr[5]) & 4294967295L;
                long j41 = (((long) iArr2[9]) & 4294967295L) + (j39 >>> 32);
                long j42 = j39 & 4294967295L;
                long j43 = (((long) iArr2[10]) & 4294967295L) + (j41 >>> 32);
                long j44 = j41 & 4294967295L;
                long j45 = (j25 * j40) + (a13 & 4294967295L);
                int i20 = (int) j45;
                iArr2[5] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                long a16 = a.a(j15, j40, j45 >>> 32, j38);
                long a17 = a.a(j40, j18, a16 >>> 32, a15 & 4294967295L);
                long a18 = a.a(j40, j37, a17 >>> 32, j42);
                long a19 = a.a(j40, j31, a18 >>> 32, j44);
                long j46 = j43 + (a19 >>> 32);
                int i22 = (int) a16;
                iArr2[6] = i21 | (i22 << 1);
                int i23 = (int) a17;
                iArr2[7] = (i22 >>> 31) | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) a18;
                iArr2[8] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) a19;
                iArr2[9] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j46;
                iArr2[10] = i28 | (i29 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j46 >>> 32))) << 1) | (i29 >>> 31);
                return;
            }
            i10 = i12;
            i11 = i14;
        }
    }

    public static void O(int[] iArr, int[] iArr2, int i) {
        iArr2[i + 0] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
        iArr2[i + 6] = iArr[6];
    }

    public static boolean O0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void O1(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[0]) & 4294967295L;
        int i = 14;
        int i10 = 6;
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            long j11 = ((long) iArr[i10]) & 4294967295L;
            long j12 = j11 * j11;
            int i13 = i - 1;
            iArr2[i13] = (i11 << 31) | ((int) (j12 >>> 33));
            i = i13 - 1;
            iArr2[i] = (int) (j12 >>> 1);
            int i14 = (int) j12;
            if (i12 <= 0) {
                long j13 = j10 * j10;
                long j14 = (((long) (i14 << 31)) & 4294967295L) | (j13 >>> 33);
                iArr2[0] = (int) j13;
                long j15 = ((long) iArr[1]) & 4294967295L;
                long j16 = (j15 * j10) + j14;
                int i15 = (int) j16;
                iArr2[1] = (((int) (j13 >>> 32)) & 1) | (i15 << 1);
                long j17 = (((long) iArr2[2]) & 4294967295L) + (j16 >>> 32);
                long j18 = ((long) iArr[2]) & 4294967295L;
                long j19 = ((long) iArr2[3]) & 4294967295L;
                long j20 = ((long) iArr2[4]) & 4294967295L;
                long j21 = (j18 * j10) + j17;
                int i16 = (int) j21;
                iArr2[2] = (i15 >>> 31) | (i16 << 1);
                long a10 = a.a(j18, j15, j21 >>> 32, j19);
                long j22 = j20 + (a10 >>> 32);
                long j23 = ((long) iArr[3]) & 4294967295L;
                long j24 = (((long) iArr2[5]) & 4294967295L) + (j22 >>> 32);
                long j25 = j10;
                long j26 = (((long) iArr2[6]) & 4294967295L) + (j24 >>> 32);
                long j27 = j24 & 4294967295L;
                long j28 = (j23 * j25) + (a10 & 4294967295L);
                int i17 = (int) j28;
                iArr2[3] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                long a11 = a.a(j23, j15, j28 >>> 32, j22 & 4294967295L);
                long a12 = a.a(j23, j18, a11 >>> 32, j27);
                long j29 = j26 + (a12 >>> 32);
                long j30 = a12 & 4294967295L;
                long j31 = ((long) iArr[4]) & 4294967295L;
                long j32 = (((long) iArr2[7]) & 4294967295L) + (j29 >>> 32);
                long j33 = j29 & 4294967295L;
                long j34 = (((long) iArr2[8]) & 4294967295L) + (j32 >>> 32);
                long j35 = j32 & 4294967295L;
                long j36 = (j31 * j25) + (a11 & 4294967295L);
                int i19 = (int) j36;
                iArr2[4] = (i19 << 1) | i18;
                long a13 = a.a(j31, j15, j36 >>> 32, j30);
                long a14 = a.a(j31, j18, a13 >>> 32, j33);
                long j37 = j23;
                long a15 = a.a(j31, j37, a14 >>> 32, j35);
                long j38 = a14 & 4294967295L;
                long j39 = j34 + (a15 >>> 32);
                long j40 = ((long) iArr[5]) & 4294967295L;
                long j41 = (((long) iArr2[9]) & 4294967295L) + (j39 >>> 32);
                long j42 = j39 & 4294967295L;
                long j43 = (((long) iArr2[10]) & 4294967295L) + (j41 >>> 32);
                long j44 = j41 & 4294967295L;
                long j45 = (j40 * j25) + (a13 & 4294967295L);
                int i20 = (int) j45;
                iArr2[5] = (i19 >>> 31) | (i20 << 1);
                long a16 = a.a(j40, j15, j45 >>> 32, j38);
                long a17 = a.a(j40, j18, a16 >>> 32, a15 & 4294967295L);
                long a18 = a.a(j40, j37, a17 >>> 32, j42);
                long j46 = a17 & 4294967295L;
                long a19 = a.a(j40, j31, a18 >>> 32, j44);
                long j47 = j43 + (a19 >>> 32);
                long j48 = a19 & 4294967295L;
                long j49 = ((long) iArr[6]) & 4294967295L;
                long j50 = (((long) iArr2[11]) & 4294967295L) + (j47 >>> 32);
                long j51 = (((long) iArr2[12]) & 4294967295L) + (j50 >>> 32);
                long j52 = j50 & 4294967295L;
                long j53 = (j25 * j49) + (a16 & 4294967295L);
                int i21 = (int) j53;
                iArr2[6] = (i20 >>> 31) | (i21 << 1);
                int i22 = i21 >>> 31;
                long a20 = a.a(j15, j49, j53 >>> 32, j46);
                long a21 = a.a(j49, j18, a20 >>> 32, a18 & 4294967295L);
                long a22 = a.a(j49, j23, a21 >>> 32, j48);
                long a23 = a.a(j49, j31, a22 >>> 32, j47 & 4294967295L);
                long a24 = a.a(j49, j40, a23 >>> 32, j52);
                long j54 = j51 + (a24 >>> 32);
                int i23 = (int) a20;
                iArr2[7] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) a21;
                iArr2[8] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) a22;
                iArr2[9] = i26 | (i27 << 1);
                int i28 = (int) a23;
                iArr2[10] = (i28 << 1) | (i27 >>> 31);
                int i29 = (int) a24;
                iArr2[11] = (i28 >>> 31) | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j54;
                iArr2[12] = i30 | (i31 << 1);
                iArr2[13] = (i31 >>> 31) | ((iArr2[13] + ((int) (j54 >>> 32))) << 1);
                return;
            }
            i10 = i12;
            i11 = i14;
        }
    }

    public static void P(int[] iArr, int[] iArr2, int i) {
        iArr2[i + 0] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
        iArr2[i + 5] = iArr[5];
        iArr2[i + 6] = iArr[6];
        iArr2[i + 7] = iArr[7];
    }

    public static boolean P0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void P1(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[0]) & 4294967295L;
        int i = 16;
        int i10 = 7;
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            long j11 = ((long) iArr[i10]) & 4294967295L;
            long j12 = j11 * j11;
            int i13 = i - 1;
            iArr2[i13] = (i11 << 31) | ((int) (j12 >>> 33));
            i = i13 - 1;
            iArr2[i] = (int) (j12 >>> 1);
            int i14 = (int) j12;
            if (i12 <= 0) {
                long j13 = j10 * j10;
                long j14 = (((long) (i14 << 31)) & 4294967295L) | (j13 >>> 33);
                iArr2[0] = (int) j13;
                long j15 = ((long) iArr[1]) & 4294967295L;
                long j16 = (j15 * j10) + j14;
                int i15 = (int) j16;
                iArr2[1] = (((int) (j13 >>> 32)) & 1) | (i15 << 1);
                long j17 = (((long) iArr2[2]) & 4294967295L) + (j16 >>> 32);
                long j18 = ((long) iArr[2]) & 4294967295L;
                long j19 = ((long) iArr2[3]) & 4294967295L;
                long j20 = ((long) iArr2[4]) & 4294967295L;
                long j21 = (j18 * j10) + j17;
                int i16 = (int) j21;
                iArr2[2] = (i15 >>> 31) | (i16 << 1);
                int i17 = i16 >>> 31;
                long a10 = a.a(j18, j15, j21 >>> 32, j19);
                long j22 = j20 + (a10 >>> 32);
                long j23 = ((long) iArr[3]) & 4294967295L;
                long j24 = (((long) iArr2[5]) & 4294967295L) + (j22 >>> 32);
                long j25 = j15;
                long j26 = (((long) iArr2[6]) & 4294967295L) + (j24 >>> 32);
                long j27 = j24 & 4294967295L;
                long j28 = (j23 * j10) + (a10 & 4294967295L);
                int i18 = (int) j28;
                iArr2[3] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                long a11 = a.a(j23, j25, j28 >>> 32, j22 & 4294967295L);
                long a12 = a.a(j23, j18, a11 >>> 32, j27);
                long j29 = j26 + (a12 >>> 32);
                long j30 = a12 & 4294967295L;
                long j31 = ((long) iArr[4]) & 4294967295L;
                long j32 = (((long) iArr2[7]) & 4294967295L) + (j29 >>> 32);
                long j33 = j29 & 4294967295L;
                long j34 = (((long) iArr2[8]) & 4294967295L) + (j32 >>> 32);
                long j35 = j32 & 4294967295L;
                long j36 = (j31 * j10) + (a11 & 4294967295L);
                int i20 = (int) j36;
                iArr2[4] = (i20 << 1) | i19;
                long a13 = a.a(j31, j25, j36 >>> 32, j30);
                long a14 = a.a(j31, j18, a13 >>> 32, j33);
                long j37 = j23;
                long a15 = a.a(j31, j37, a14 >>> 32, j35);
                long j38 = a14 & 4294967295L;
                long j39 = j34 + (a15 >>> 32);
                long j40 = ((long) iArr[5]) & 4294967295L;
                long j41 = (((long) iArr2[9]) & 4294967295L) + (j39 >>> 32);
                long j42 = j39 & 4294967295L;
                long j43 = (((long) iArr2[10]) & 4294967295L) + (j41 >>> 32);
                long j44 = j41 & 4294967295L;
                long j45 = (j40 * j10) + (a13 & 4294967295L);
                int i21 = (int) j45;
                iArr2[5] = (i20 >>> 31) | (i21 << 1);
                long a16 = a.a(j40, j25, j45 >>> 32, j38);
                long a17 = a.a(j40, j18, a16 >>> 32, a15 & 4294967295L);
                long a18 = a.a(j40, j37, a17 >>> 32, j42);
                long j46 = a17 & 4294967295L;
                long a19 = a.a(j40, j31, a18 >>> 32, j44);
                long j47 = j43 + (a19 >>> 32);
                long j48 = a19 & 4294967295L;
                long j49 = ((long) iArr[6]) & 4294967295L;
                long j50 = (((long) iArr2[11]) & 4294967295L) + (j47 >>> 32);
                long j51 = j18;
                long j52 = (((long) iArr2[12]) & 4294967295L) + (j50 >>> 32);
                long j53 = j50 & 4294967295L;
                long j54 = (j49 * j10) + (a16 & 4294967295L);
                int i22 = (int) j54;
                iArr2[6] = (i21 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                long a20 = a.a(j49, j25, j54 >>> 32, j46);
                long a21 = a.a(j49, j51, a20 >>> 32, a18 & 4294967295L);
                long a22 = a.a(j49, j23, a21 >>> 32, j48);
                long j55 = a21 & 4294967295L;
                long a23 = a.a(j49, j31, a22 >>> 32, j47 & 4294967295L);
                long j56 = j40;
                long a24 = a.a(j49, j56, a23 >>> 32, j53);
                long j57 = a23 & 4294967295L;
                long j58 = j52 + (a24 >>> 32);
                long j59 = a24 & 4294967295L;
                long j60 = ((long) iArr[7]) & 4294967295L;
                long j61 = (((long) iArr2[13]) & 4294967295L) + (j58 >>> 32);
                long j62 = (((long) iArr2[14]) & 4294967295L) + (j61 >>> 32);
                long j63 = j61 & 4294967295L;
                long j64 = (j10 * j60) + (a20 & 4294967295L);
                int i24 = (int) j64;
                iArr2[7] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                long a25 = a.a(j25, j60, j64 >>> 32, j55);
                long a26 = a.a(j60, j51, a25 >>> 32, a22 & 4294967295L);
                long a27 = a.a(j60, j23, a26 >>> 32, j57);
                long a28 = a.a(j60, j31, a27 >>> 32, j59);
                long j65 = j60;
                long a29 = a.a(j65, j56, a28 >>> 32, j58 & 4294967295L);
                long a30 = a.a(j65, j49, a29 >>> 32, j63);
                long j66 = j62 + (a30 >>> 32);
                int i26 = (int) a25;
                iArr2[8] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) a26;
                iArr2[9] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) a27;
                iArr2[10] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) a28;
                iArr2[11] = i31 | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) a29;
                iArr2[12] = i33 | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = (int) a30;
                iArr2[13] = i35 | (i36 << 1);
                int i37 = i36 >>> 31;
                int i38 = (int) j66;
                iArr2[14] = i37 | (i38 << 1);
                iArr2[15] = (i38 >>> 31) | ((iArr2[15] + ((int) (j66 >>> 32))) << 1);
                return;
            }
            i10 = i12;
            i11 = i14;
        }
    }

    public static void Q(int[] iArr, int[] iArr2, int i) {
        for (int i10 = 0; i10 < 10; i10++) {
            iArr2[i + i10] = iArr[0 + i10];
        }
    }

    public static boolean Q0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void Q1(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        N1(iArr, iArr2);
        long j10 = 4294967295L;
        long j11 = ((long) iArr3[6]) & 4294967295L;
        int i = 12;
        int i10 = 0;
        int i11 = 5;
        int i12 = 12;
        while (true) {
            int i13 = i11 - 1;
            long j12 = j10 & ((long) iArr3[i11 + 6]);
            long j13 = j12 * j12;
            int i14 = i - 1;
            iArr4[i12 + i14] = (i10 << 31) | ((int) (j13 >>> 33));
            i = i14 - 1;
            iArr4[i12 + i] = (int) (j13 >>> 1);
            i10 = (int) j13;
            if (i13 <= 0) {
                long j14 = j11 * j11;
                iArr4[12] = (int) j14;
                long j15 = ((long) iArr3[7]) & 4294967295L;
                long j16 = 4294967295L & ((long) iArr4[14]);
                long j17 = (j15 * j11) + ((((long) (i10 << 31)) & 4294967295L) | (j14 >>> 33));
                int i15 = (int) j17;
                iArr4[13] = (((int) (j14 >>> 32)) & 1) | (i15 << 1);
                long j18 = ((long) iArr3[8]) & 4294967295L;
                long j19 = ((long) iArr4[15]) & 4294967295L;
                long j20 = (j18 * j11) + j16 + (j17 >>> 32);
                int i16 = (int) j20;
                iArr4[14] = (i15 >>> 31) | (i16 << 1);
                long a10 = a.a(j18, j15, j20 >>> 32, j19);
                long j21 = (((long) iArr4[16]) & 4294967295L) + (a10 >>> 32);
                long j22 = ((long) iArr3[9]) & 4294967295L;
                long j23 = (((long) iArr4[17]) & 4294967295L) + (j21 >>> 32);
                long j24 = j15;
                long j25 = (((long) iArr4[18]) & 4294967295L) + (j23 >>> 32);
                long j26 = j23 & 4294967295L;
                long j27 = (j22 * j11) + (a10 & 4294967295L);
                int i17 = (int) j27;
                iArr4[15] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                long a11 = a.a(j22, j24, j27 >>> 32, j21 & 4294967295L);
                long a12 = a.a(j22, j18, a11 >>> 32, j26);
                long j28 = j25 + (a12 >>> 32);
                long j29 = ((long) iArr3[10]) & 4294967295L;
                long j30 = j22;
                long j31 = (((long) iArr4[19]) & 4294967295L) + (j28 >>> 32);
                long j32 = j31 & 4294967295L;
                long j33 = (j29 * j11) + (a11 & 4294967295L);
                int i19 = (int) j33;
                iArr4[16] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                long a13 = a.a(j29, j24, j33 >>> 32, a12 & 4294967295L);
                long a14 = a.a(j29, j18, a13 >>> 32, j28 & 4294967295L);
                long j34 = j30;
                long a15 = a.a(j29, j34, a14 >>> 32, j32);
                long j35 = a14 & 4294967295L;
                long j36 = (((long) iArr4[20]) & 4294967295L) + (j31 >>> 32) + (a15 >>> 32);
                long j37 = ((long) iArr3[11]) & 4294967295L;
                long j38 = j29;
                long j39 = (((long) iArr4[21]) & 4294967295L) + (j36 >>> 32);
                long j40 = j36 & 4294967295L;
                long j41 = (((long) iArr4[22]) & 4294967295L) + (j39 >>> 32);
                long j42 = (j11 * j37) + (a13 & 4294967295L);
                int i21 = (int) j42;
                iArr4[17] = i20 | (i21 << 1);
                long a16 = a.a(j37, j24, j42 >>> 32, j35);
                long a17 = a.a(j37, j18, a16 >>> 32, a15 & 4294967295L);
                long j43 = a17;
                long a18 = a.a(j37, j34, a17 >>> 32, j40);
                long a19 = a.a(j37, j38, a18 >>> 32, j39 & 4294967295L);
                long j44 = j41 + (a19 >>> 32);
                int i22 = (int) a16;
                iArr4[18] = (i21 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j43;
                iArr4[19] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) a18;
                iArr4[20] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) a19;
                iArr4[21] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j44;
                iArr4[22] = i29 | (i30 << 1);
                iArr4[23] = (i30 >>> 31) | ((iArr4[23] + ((int) (j44 >>> 32))) << 1);
                int z = z(iArr4, iArr4);
                int x10 = x(iArr4, 18, iArr4, 12, x(iArr4, 0, iArr4, 6, 0) + z) + z;
                int[] iArr5 = new int[6];
                b0(iArr3, iArr3, iArr5);
                int[] iArr6 = new int[12];
                N1(iArr5, iArr6);
                B(24, c2(12, iArr6, iArr4, 6) + x10, iArr4, 18);
                return;
            }
            j10 = 4294967295L;
            i12 = 12;
            i11 = i13;
        }
    }

    public static void R(long[] jArr, long[] jArr2, int i) {
        jArr2[i + 0] = jArr[0];
        jArr2[i + 1] = jArr[1];
    }

    public static boolean R0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int R1(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            long j11 = ((((long) iArr[i10]) & 4294967295L) - (4294967295L & ((long) iArr2[i10]))) + j10;
            iArr3[i10] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static void S(long[] jArr, long[] jArr2, int i) {
        jArr2[i + 0] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
    }

    public static boolean S0(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int S1(int[] iArr, int i, int[] iArr2, int i10, int[] iArr3) {
        long j10 = ((((long) iArr[i + 0]) & 4294967295L) - (((long) iArr2[i10 + 0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j10;
        long j11 = ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i10 + 1]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i10 + 2]) & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i10 + 3]) & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i10 + 4]) & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i10 + 5]) & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static void T(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean T0(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int T1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j10;
        long j11 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static void U(long[] jArr, long[] jArr2, int i) {
        jArr2[i + 0] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
    }

    public static int U0(int[] iArr) {
        int i = 0;
        for (int i10 = 0; i10 < 10; i10++) {
            i |= iArr[i10];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void U1(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    public static void V(long[] jArr, long[] jArr2, int i) {
        jArr2[i + 0] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
    }

    public static boolean V0(int i, int[] iArr) {
        for (int i10 = 0; i10 < i; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int V1(int[] iArr, int i, int[] iArr2, int i10, int[] iArr3) {
        long j10 = ((((long) iArr[i + 0]) & 4294967295L) - (((long) iArr2[i10 + 0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j10;
        long j11 = ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i10 + 1]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i10 + 2]) & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i10 + 3]) & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i10 + 4]) & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i10 + 5]) & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        long j16 = ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i10 + 6]) & 4294967295L)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        long j17 = ((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i10 + 7]) & 4294967295L)) + (j16 >> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static void W(long[] jArr, long[] jArr2, int i) {
        jArr2[i + 0] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
        jArr2[i + 5] = jArr[5];
        jArr2[i + 6] = jArr[6];
    }

    public static boolean W0(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int W1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j10;
        long j11 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static void X(long[] jArr, long[] jArr2, int i) {
        jArr2[i + 0] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
        jArr2[i + 5] = jArr[5];
        jArr2[i + 6] = jArr[6];
        jArr2[i + 7] = jArr[7];
        jArr2[i + 8] = jArr[8];
    }

    public static boolean X0(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int X1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j10;
        long j11 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int Y(int i, int[] iArr, int i10) {
        while (i10 < i) {
            int i11 = iArr[i10] - 1;
            iArr[i10] = i11;
            if (i11 != -1) {
                return 0;
            }
            i10++;
        }
        return -1;
    }

    public static boolean Y0(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int Y1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j10;
        long j11 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        long j16 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static void Z(byte[] bArr, int i, int[] iArr, int i10) {
        int a02 = a0(bArr, i + 0);
        int a03 = a0(bArr, i + 4);
        int a04 = a0(bArr, i + 8);
        int a05 = a0(bArr, i + 12);
        iArr[i10 + 0] = a02 & 67108863;
        iArr[i10 + 1] = ((a02 >>> 26) | (a03 << 6)) & 67108863;
        iArr[i10 + 2] = ((a04 << 12) | (a03 >>> 20)) & 33554431;
        iArr[i10 + 3] = ((a05 << 19) | (a04 >>> 13)) & 67108863;
        iArr[i10 + 4] = a05 >>> 7;
    }

    public static boolean Z0(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int Z1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j10;
        long j11 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        long j16 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        long j17 = ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L)) + (j16 >> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int a0(byte[] bArr, int i) {
        int i10 = i + 1;
        int i11 = i10 + 1;
        return (bArr[i11 + 1] << 24) | (bArr[i] & 255) | ((bArr[i10] & 255) << 8) | ((bArr[i11] & 255) << 16);
    }

    public static boolean a1(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int a2(int i, int i10, int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) - (((long) i10) & 4294967295L);
        iArr[0] = (int) j10;
        long j11 = ((4294967295L & ((long) iArr[1])) - 1) + (j10 >> 32);
        iArr[1] = (int) j11;
        if ((j11 >> 32) == 0) {
            return 0;
        }
        return Y(i, iArr, 2);
    }

    public static boolean b0(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 5;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i10 = iArr[6 + i] ^ LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            int i11 = Integer.MIN_VALUE ^ iArr2[0 + i];
            if (i10 < i11) {
                z = false;
                break;
            } else if (i10 > i11) {
                break;
            } else {
                i--;
            }
        }
        if (z) {
            S1(iArr, 6, iArr2, 0, iArr3);
        } else {
            S1(iArr2, 0, iArr, 6, iArr3);
        }
        return z;
    }

    public static boolean b1(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int b2(int i, int[] iArr, int[] iArr2) {
        long j10 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            long j11 = ((((long) iArr2[i10]) & 4294967295L) - (4294967295L & ((long) iArr[i10]))) + j10;
            iArr2[i10] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static boolean c0(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i = 7;
        while (true) {
            z = true;
            if (i < 0) {
                break;
            }
            int i10 = iArr[8 + i] ^ LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            int i11 = Integer.MIN_VALUE ^ iArr2[0 + i];
            if (i10 < i11) {
                z = false;
                break;
            } else if (i10 > i11) {
                break;
            } else {
                i--;
            }
        }
        if (z) {
            V1(iArr, 8, iArr2, 0, iArr3);
        } else {
            V1(iArr2, 0, iArr, 8, iArr3);
        }
        return z;
    }

    public static boolean c1(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int c2(int i, int[] iArr, int[] iArr2, int i10) {
        long j10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            int i12 = i10 + i11;
            long j11 = ((((long) iArr2[i12]) & 4294967295L) - (4294967295L & ((long) iArr[0 + i11]))) + j10;
            iArr2[i12] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static void d0(int[] iArr, int i, byte[] bArr, int i10) {
        int i11 = iArr[i + 0];
        int i12 = iArr[i + 1];
        int i13 = iArr[i + 2];
        int i14 = iArr[i + 3];
        int i15 = iArr[i + 4];
        e0((i12 << 26) | i11, bArr, i10 + 0);
        e0((i12 >>> 6) | (i13 << 20), bArr, i10 + 4);
        e0((i13 >>> 12) | (i14 << 13), bArr, i10 + 8);
        e0((i15 << 7) | (i14 >>> 19), bArr, i10 + 12);
    }

    public static boolean d1(long[] jArr) {
        for (int i = 0; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int d2(int[] iArr, int[] iArr2) {
        long j10 = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j10;
        long j11 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((((long) iArr2[4]) & 4294967295L) - (4294967295L & ((long) iArr[4]))) + (j13 >> 32);
        iArr2[4] = (int) j14;
        return (int) (j14 >> 32);
    }

    public static void e0(int i, byte[] bArr, int i10) {
        bArr[i10] = (byte) i;
        int i11 = i10 + 1;
        bArr[i11] = (byte) (i >>> 8);
        int i12 = i11 + 1;
        bArr[i12] = (byte) (i >>> 16);
        bArr[i12 + 1] = (byte) (i >>> 24);
    }

    public static boolean e1(int[] iArr) {
        return U0(iArr) != 0;
    }

    public static int e2(int[] iArr, int[] iArr2) {
        long j10 = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j10;
        long j11 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = ((((long) iArr2[5]) & 4294967295L) - (4294967295L & ((long) iArr[5]))) + (j14 >> 32);
        iArr2[5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static boolean f0(int i, int[] iArr, int[] iArr2) {
        for (int i10 = i - 1; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int f1(byte[] bArr, int i) {
        int i10 = i + 1;
        int i11 = i10 + 1;
        return (bArr[i11 + 1] << 24) | (bArr[i] & 255) | ((bArr[i10] & 255) << 8) | ((bArr[i11] & 255) << 16);
    }

    public static int f2(int[] iArr, int[] iArr2) {
        long j10 = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j10;
        long j11 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j15 >> 32);
        iArr2[6] = (int) j16;
        long j17 = ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7]))) + (j16 >> 32);
        iArr2[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static boolean g0(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long g1(byte[] bArr, int i) {
        return ((((long) f1(bArr, i + 4)) & 4294967295L) << 32) | (((long) f1(bArr, i)) & 4294967295L);
    }

    public static BigInteger g2(int i, int[] iArr) {
        byte[] bArr = new byte[(i << 2)];
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                I0(i11, bArr, ((i - 1) - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void h(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException(androidx.activity.result.d.a(cls, a.b.q("Interface can't be instantiated! Interface name: ")));
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException(androidx.activity.result.d.a(cls, a.b.q("Abstract class can't be instantiated! Class name: ")));
        }
    }

    public static boolean h0(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void h1(long j10, byte[] bArr, int i) {
        I0((int) (j10 >>> 32), bArr, i);
        I0((int) (j10 & 4294967295L), bArr, i + 4);
    }

    public static BigInteger h2(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i10 = iArr[i];
            if (i10 != 0) {
                I0(i10, bArr, (4 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int i(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            long j11 = (((long) iArr[i10]) & 4294967295L) + (4294967295L & ((long) iArr2[i10])) + j10;
            iArr3[i10] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static boolean i0(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger i2(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i10 = iArr[i];
            if (i10 != 0) {
                I0(i10, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void j(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static boolean j0(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger j2(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i10 = iArr[i];
            if (i10 != 0) {
                I0(i10, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int k(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static boolean k0(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static f k1(bh.c cVar, f fVar) {
        return ((bh.a) fVar.f13245a.o(fVar, "bc_endo", new bh.b(cVar, fVar))).f3025b;
    }

    public static BigInteger k2(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i10 = iArr[i];
            if (i10 != 0) {
                I0(i10, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int l(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int[] l0(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[((i + 31) >> 5)];
        int i10 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i10++;
        }
        return iArr;
    }

    public static void l1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[2]) & 4294967295L;
        long j13 = ((long) iArr2[3]) & 4294967295L;
        long j14 = ((long) iArr[0]) & 4294967295L;
        long j15 = (j14 * j10) + 0;
        iArr3[0] = (int) j15;
        char c10 = ' ';
        long j16 = (j14 * j11) + (j15 >>> 32);
        iArr3[1] = (int) j16;
        long j17 = (j14 * j12) + (j16 >>> 32);
        iArr3[2] = (int) j17;
        long j18 = (j14 * j13) + (j17 >>> 32);
        iArr3[3] = (int) j18;
        iArr3[4] = (int) (j18 >>> 32);
        for (int i10 = 4; i < i10; i10 = 4) {
            long j19 = ((long) iArr[i]) & 4294967295L;
            int i11 = i + 0;
            int i12 = i;
            long j20 = (j19 * j10) + (((long) iArr3[i11]) & 4294967295L) + 0;
            iArr3[i11] = (int) j20;
            int i13 = i12 + 1;
            long j21 = j10;
            long j22 = (j19 * j11) + (((long) iArr3[i13]) & 4294967295L) + (j20 >>> c10);
            iArr3[i13] = (int) j22;
            int i14 = i12 + 2;
            int i15 = i13;
            long j23 = (j19 * j12) + (((long) iArr3[i14]) & 4294967295L) + (j22 >>> 32);
            iArr3[i14] = (int) j23;
            c10 = ' ';
            int i16 = i12 + 3;
            long j24 = (j19 * j13) + (((long) iArr3[i16]) & 4294967295L) + (j23 >>> 32);
            iArr3[i16] = (int) j24;
            iArr3[i12 + 4] = (int) (j24 >>> 32);
            i = i15;
            j10 = j21;
            j11 = j11;
        }
    }

    public static BigInteger l2(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                h1(j10, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int m(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int[] m0(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[5];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static void m1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[3]) & 4294967295L;
        long j13 = ((long) iArr2[4]) & 4294967295L;
        long j14 = ((long) iArr2[2]) & 4294967295L;
        long j15 = ((long) iArr[0]) & 4294967295L;
        long j16 = (j15 * j10) + 0;
        iArr3[0] = (int) j16;
        long j17 = (j15 * j11) + (j16 >>> 32);
        iArr3[1] = (int) j17;
        long j18 = (j15 * j14) + (j17 >>> 32);
        iArr3[2] = (int) j18;
        long j19 = (j15 * j12) + (j18 >>> 32);
        iArr3[3] = (int) j19;
        long j20 = (j15 * j13) + (j19 >>> 32);
        iArr3[4] = (int) j20;
        iArr3[5] = (int) (j20 >>> 32);
        for (int i10 = 5; i < i10; i10 = 5) {
            long j21 = ((long) iArr[i]) & 4294967295L;
            int i11 = i + 0;
            long j22 = j10;
            long j23 = (j21 * j10) + (((long) iArr3[i11]) & 4294967295L) + 0;
            iArr3[i11] = (int) j23;
            int i12 = i + 1;
            long j24 = j11;
            long j25 = (j21 * j11) + (((long) iArr3[i12]) & 4294967295L) + (j23 >>> 32);
            iArr3[i12] = (int) j25;
            long j26 = j25 >>> 32;
            int i13 = i + 2;
            long j27 = (j21 * j14) + (((long) iArr3[i13]) & 4294967295L) + j26;
            iArr3[i13] = (int) j27;
            long j28 = j27 >>> 32;
            int i14 = i + 3;
            long j29 = (j21 * j12) + (((long) iArr3[i14]) & 4294967295L) + j28;
            iArr3[i14] = (int) j29;
            long j30 = j29 >>> 32;
            int i15 = i + 4;
            long j31 = (j21 * j13) + (((long) iArr3[i15]) & 4294967295L) + j30;
            iArr3[i15] = (int) j31;
            iArr3[i + 5] = (int) (j31 >>> 32);
            i = i12;
            j10 = j22;
            j11 = j24;
        }
    }

    public static BigInteger m2(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                h1(j10, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int n(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int[] n0(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[6];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static void n1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) iArr2[0]) & 4294967295L;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[3]) & 4294967295L;
        long j13 = ((long) iArr2[4]) & 4294967295L;
        long j14 = ((long) iArr2[2]) & 4294967295L;
        long j15 = ((long) iArr2[5]) & 4294967295L;
        long j16 = ((long) iArr[0]) & 4294967295L;
        long j17 = (j16 * j10) + 0;
        iArr3[0] = (int) j17;
        long j18 = (j16 * j11) + (j17 >>> 32);
        iArr3[1] = (int) j18;
        long j19 = (j16 * j14) + (j18 >>> 32);
        iArr3[2] = (int) j19;
        long j20 = (j16 * j12) + (j19 >>> 32);
        iArr3[3] = (int) j20;
        long j21 = (j16 * j13) + (j20 >>> 32);
        iArr3[4] = (int) j21;
        long j22 = (j16 * j15) + (j21 >>> 32);
        iArr3[5] = (int) j22;
        iArr3[6] = (int) (j22 >>> 32);
        int i = 1;
        for (int i10 = 6; i < i10; i10 = 6) {
            long j23 = ((long) iArr[i]) & 4294967295L;
            int i11 = i + 0;
            long j24 = j10;
            long j25 = (j23 * j10) + (((long) iArr3[i11]) & 4294967295L) + 0;
            iArr3[i11] = (int) j25;
            int i12 = i + 1;
            long j26 = j11;
            long j27 = (j23 * j11) + (((long) iArr3[i12]) & 4294967295L) + (j25 >>> 32);
            iArr3[i12] = (int) j27;
            int i13 = i + 2;
            long j28 = (j23 * j14) + (((long) iArr3[i13]) & 4294967295L) + (j27 >>> 32);
            iArr3[i13] = (int) j28;
            int i14 = i + 3;
            long j29 = (j23 * j12) + (((long) iArr3[i14]) & 4294967295L) + (j28 >>> 32);
            iArr3[i14] = (int) j29;
            int i15 = i + 4;
            long j30 = (j23 * j13) + (((long) iArr3[i15]) & 4294967295L) + (j29 >>> 32);
            iArr3[i15] = (int) j30;
            long j31 = j30 >>> 32;
            int i16 = i + 5;
            long j32 = (j23 * j15) + (((long) iArr3[i16]) & 4294967295L) + j31;
            iArr3[i16] = (int) j32;
            iArr3[i + 6] = (int) (j32 >>> 32);
            i = i12;
            j10 = j24;
            j11 = j26;
        }
    }

    public static void n2(int i, int[] iArr) {
        for (int i10 = 0; i10 < i; i10++) {
            iArr[i10] = 0;
        }
    }

    public static int o(int i, int i10, int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) i10) & 4294967295L);
        iArr[0] = (int) j10;
        long j11 = (4294967295L & ((long) iArr[1])) + 1 + (j10 >>> 32);
        iArr[1] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return G0(i, iArr, 2);
    }

    public static int[] o0(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[7];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static void o1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) iArr2[0]) & 4294967295L;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[3]) & 4294967295L;
        long j13 = ((long) iArr2[4]) & 4294967295L;
        long j14 = ((long) iArr2[2]) & 4294967295L;
        long j15 = ((long) iArr2[5]) & 4294967295L;
        long j16 = ((long) iArr2[6]) & 4294967295L;
        long j17 = ((long) iArr[0]) & 4294967295L;
        long j18 = (j17 * j10) + 0;
        iArr3[0] = (int) j18;
        long j19 = (j17 * j11) + (j18 >>> 32);
        iArr3[1] = (int) j19;
        long j20 = (j17 * j14) + (j19 >>> 32);
        iArr3[2] = (int) j20;
        long j21 = (j17 * j12) + (j20 >>> 32);
        iArr3[3] = (int) j21;
        long j22 = (j17 * j13) + (j21 >>> 32);
        iArr3[4] = (int) j22;
        long j23 = (j17 * j15) + (j22 >>> 32);
        iArr3[5] = (int) j23;
        long j24 = (j17 * j16) + (j23 >>> 32);
        iArr3[6] = (int) j24;
        iArr3[7] = (int) (j24 >>> 32);
        int i = 1;
        for (int i10 = 7; i < i10; i10 = 7) {
            long j25 = ((long) iArr[i]) & 4294967295L;
            int i11 = i + 0;
            long j26 = j10;
            long j27 = (j25 * j10) + (((long) iArr3[i11]) & 4294967295L) + 0;
            iArr3[i11] = (int) j27;
            int i12 = i + 1;
            long j28 = j11;
            long j29 = (j25 * j11) + (((long) iArr3[i12]) & 4294967295L) + (j27 >>> 32);
            iArr3[i12] = (int) j29;
            int i13 = i + 2;
            long j30 = (j25 * j14) + (((long) iArr3[i13]) & 4294967295L) + (j29 >>> 32);
            iArr3[i13] = (int) j30;
            int i14 = i + 3;
            long j31 = (j25 * j12) + (((long) iArr3[i14]) & 4294967295L) + (j30 >>> 32);
            iArr3[i14] = (int) j31;
            int i15 = i + 4;
            long j32 = (j25 * j13) + (((long) iArr3[i15]) & 4294967295L) + (j31 >>> 32);
            iArr3[i15] = (int) j32;
            int i16 = i + 5;
            long j33 = (j25 * j15) + (((long) iArr3[i16]) & 4294967295L) + (j32 >>> 32);
            iArr3[i16] = (int) j33;
            long j34 = j33 >>> 32;
            int i17 = i + 6;
            long j35 = (j25 * j16) + (((long) iArr3[i17]) & 4294967295L) + j34;
            iArr3[i17] = (int) j35;
            iArr3[i + 7] = (int) (j35 >>> 32);
            i = i12;
            j10 = j26;
            j11 = j28;
        }
    }

    public static void o2(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static int p(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            long j11 = (((long) iArr[i10]) & 4294967295L) + (((long) iArr2[i10]) & 4294967295L) + (4294967295L & ((long) iArr3[i10])) + j10;
            iArr3[i10] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int[] p0(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[8];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static void p1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) iArr2[0]) & 4294967295L;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[3]) & 4294967295L;
        long j13 = ((long) iArr2[4]) & 4294967295L;
        long j14 = ((long) iArr2[2]) & 4294967295L;
        long j15 = ((long) iArr2[5]) & 4294967295L;
        long j16 = ((long) iArr2[6]) & 4294967295L;
        long j17 = ((long) iArr2[7]) & 4294967295L;
        long j18 = ((long) iArr[0]) & 4294967295L;
        long j19 = (j18 * j10) + 0;
        iArr3[0] = (int) j19;
        long j20 = (j18 * j11) + (j19 >>> 32);
        iArr3[1] = (int) j20;
        long j21 = (j18 * j14) + (j20 >>> 32);
        iArr3[2] = (int) j21;
        long j22 = (j18 * j12) + (j21 >>> 32);
        iArr3[3] = (int) j22;
        long j23 = (j18 * j13) + (j22 >>> 32);
        iArr3[4] = (int) j23;
        long j24 = (j18 * j15) + (j23 >>> 32);
        iArr3[5] = (int) j24;
        long j25 = (j18 * j16) + (j24 >>> 32);
        iArr3[6] = (int) j25;
        long j26 = (j18 * j17) + (j25 >>> 32);
        iArr3[7] = (int) j26;
        iArr3[8] = (int) (j26 >>> 32);
        int i = 1;
        for (int i10 = 8; i < i10; i10 = 8) {
            long j27 = ((long) iArr[i]) & 4294967295L;
            int i11 = i + 0;
            long j28 = j10;
            long j29 = (j27 * j10) + (((long) iArr3[i11]) & 4294967295L) + 0;
            iArr3[i11] = (int) j29;
            int i12 = i + 1;
            long j30 = j11;
            long j31 = (j27 * j11) + (((long) iArr3[i12]) & 4294967295L) + (j29 >>> 32);
            iArr3[i12] = (int) j31;
            int i13 = i + 2;
            long j32 = (j27 * j14) + (((long) iArr3[i13]) & 4294967295L) + (j31 >>> 32);
            iArr3[i13] = (int) j32;
            int i14 = i + 3;
            long j33 = (j27 * j12) + (((long) iArr3[i14]) & 4294967295L) + (j32 >>> 32);
            iArr3[i14] = (int) j33;
            int i15 = i + 4;
            long j34 = (j27 * j13) + (((long) iArr3[i15]) & 4294967295L) + (j33 >>> 32);
            iArr3[i15] = (int) j34;
            int i16 = i + 5;
            long j35 = (j27 * j15) + (((long) iArr3[i16]) & 4294967295L) + (j34 >>> 32);
            iArr3[i16] = (int) j35;
            int i17 = i + 6;
            long j36 = (j27 * j16) + (((long) iArr3[i17]) & 4294967295L) + (j35 >>> 32);
            iArr3[i17] = (int) j36;
            long j37 = j36 >>> 32;
            int i18 = i + 7;
            long j38 = (j27 * j17) + (((long) iArr3[i18]) & 4294967295L) + j37;
            iArr3[i18] = (int) j38;
            iArr3[i + 8] = (int) (j38 >>> 32);
            i = i12;
            j10 = j28;
            j11 = j30;
        }
    }

    public static void p2(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
    }

    public static int q(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static long[] q0(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[((i + 63) >> 6)];
        int i10 = 0;
        while (bigInteger.signum() != 0) {
            jArr[i10] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i10++;
        }
        return jArr;
    }

    public static void q1(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr2;
        int[] iArr5 = iArr3;
        n1(iArr, iArr2, iArr3);
        long j10 = ((long) iArr4[6]) & 4294967295L;
        long j11 = ((long) iArr4[7]) & 4294967295L;
        long j12 = ((long) iArr4[8]) & 4294967295L;
        long j13 = ((long) iArr4[9]) & 4294967295L;
        long j14 = ((long) iArr4[10]) & 4294967295L;
        long j15 = ((long) iArr4[11]) & 4294967295L;
        long j16 = ((long) iArr[6]) & 4294967295L;
        long j17 = (j16 * j10) + 0;
        long j18 = j10;
        iArr5[12] = (int) j17;
        long j19 = (j16 * j11) + (j17 >>> 32);
        iArr5[13] = (int) j19;
        long j20 = (j16 * j12) + (j19 >>> 32);
        iArr5[14] = (int) j20;
        long j21 = (j16 * j13) + (j20 >>> 32);
        iArr5[15] = (int) j21;
        long j22 = (j16 * j14) + (j21 >>> 32);
        iArr5[16] = (int) j22;
        long j23 = (j16 * j15) + (j22 >>> 32);
        iArr5[17] = (int) j23;
        iArr5[18] = (int) (j23 >>> 32);
        int i = 1;
        int i10 = 1;
        int i11 = 12;
        while (i10 < 6) {
            i11 += i;
            long j24 = ((long) iArr[6 + i10]) & 4294967295L;
            int i12 = i11 + 0;
            long j25 = j24;
            long j26 = (j24 * j18) + (((long) iArr5[i12]) & 4294967295L) + 0;
            iArr5[i12] = (int) j26;
            int i13 = i11 + 1;
            long j27 = (j25 * j11) + (((long) iArr5[i13]) & 4294967295L) + (j26 >>> 32);
            iArr5[i13] = (int) j27;
            int i14 = i11 + 2;
            long j28 = j11;
            long j29 = (j25 * j12) + (((long) iArr5[i14]) & 4294967295L) + (j27 >>> 32);
            iArr5[i14] = (int) j29;
            int i15 = i11 + 3;
            long j30 = (j25 * j13) + (((long) iArr5[i15]) & 4294967295L) + (j29 >>> 32);
            iArr5[i15] = (int) j30;
            int i16 = i11 + 4;
            long j31 = (j25 * j14) + (((long) iArr5[i16]) & 4294967295L) + (j30 >>> 32);
            iArr5[i16] = (int) j31;
            int i17 = i11 + 5;
            long j32 = (j25 * j15) + (((long) iArr5[i17]) & 4294967295L) + (j31 >>> 32);
            iArr5[i17] = (int) j32;
            iArr5[i11 + 6] = (int) (j32 >>> 32);
            i10++;
            j11 = j28;
            i = 1;
        }
        int[] iArr6 = iArr;
        int z = z(iArr5, iArr5);
        boolean z10 = false;
        int x10 = x(iArr5, 18, iArr5, 12, x(iArr5, 0, iArr5, 6, 0) + z) + z;
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        int[] iArr9 = iArr2;
        if (b0(iArr6, iArr6, iArr7) != b0(iArr9, iArr9, iArr8)) {
            z10 = true;
        }
        int[] iArr10 = new int[12];
        n1(iArr7, iArr8, iArr10);
        B(24, x10 + (z10 ? w(12, iArr10, iArr5, 6) : c2(12, iArr10, iArr5, 6)), iArr5, 18);
    }

    public static void q2(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static int r(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static byte[] r0(int i, BigInteger bigInteger) {
        if (i == 2) {
            if (bigInteger.signum() == 0) {
                return f731s;
            }
            BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
            int bitLength = add.bitLength() - 1;
            byte[] bArr = new byte[bitLength];
            BigInteger xor = add.xor(bigInteger);
            int i10 = 1;
            while (i10 < bitLength) {
                if (xor.testBit(i10)) {
                    bArr[i10 - 1] = (byte) (bigInteger.testBit(i10) ? -1 : 1);
                    i10++;
                }
                i10++;
            }
            bArr[bitLength - 1] = 1;
            return bArr;
        } else if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        } else if (bigInteger.signum() == 0) {
            return f731s;
        } else {
            int bitLength2 = bigInteger.bitLength() + 1;
            byte[] bArr2 = new byte[bitLength2];
            int i11 = 1 << i;
            int i12 = i11 - 1;
            int i13 = i11 >>> 1;
            int i14 = 0;
            int i15 = 0;
            boolean z = false;
            while (i14 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i14) == z) {
                    i14++;
                } else {
                    bigInteger = bigInteger.shiftRight(i14);
                    int intValue = bigInteger.intValue() & i12;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i13) != 0;
                    if (z) {
                        intValue -= i11;
                    }
                    if (i15 > 0) {
                        i14--;
                    }
                    int i16 = i15 + i14;
                    bArr2[i16] = (byte) intValue;
                    i15 = i16 + 1;
                    i14 = i;
                }
            }
            if (bitLength2 <= i15) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i15];
            System.arraycopy(bArr2, 0, bArr3, 0, i15);
            return bArr3;
        }
    }

    public static void r1(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i10 = iArr2[0];
        int i11 = iArr[1];
        int i12 = iArr2[1];
        int i13 = iArr[2];
        int i14 = iArr2[2];
        int i15 = iArr[3];
        int i16 = iArr2[3];
        int i17 = iArr[4];
        int i18 = iArr2[4];
        int i19 = iArr[5];
        int i20 = iArr2[5];
        int i21 = iArr[6];
        int i22 = iArr2[6];
        int i23 = iArr[7];
        int i24 = iArr2[7];
        int i25 = iArr[8];
        int i26 = iArr2[8];
        int i27 = iArr[9];
        int i28 = i24;
        long j10 = (long) i;
        int i29 = i22;
        int i30 = iArr2[9];
        long j11 = (long) i10;
        long j12 = j10 * j11;
        int i31 = i10;
        long j13 = (long) i12;
        int i32 = i20;
        int i33 = i19;
        long j14 = (long) i11;
        long j15 = (j14 * j11) + (j10 * j13);
        int i34 = i12;
        long j16 = (long) i14;
        int i35 = i18;
        int i36 = i17;
        long j17 = (long) i13;
        long j18 = (j17 * j11) + (j14 * j13) + (j10 * j16);
        long j19 = ((j17 * j13) + (j14 * j16)) << 1;
        int i37 = i14;
        long j20 = (long) i16;
        long j21 = j13;
        long j22 = (long) i15;
        long a10 = a.a(j22, j11, j10 * j20, j19);
        long j23 = (j17 * j16) << 1;
        long j24 = j16;
        int i38 = i16;
        long j25 = (long) i35;
        long j26 = (long) i36;
        long a11 = a.a(j11, j26, (j22 * j21) + (j14 * j20) + (j10 * j25), j23);
        long j27 = (j22 * j24) + (j17 * j20) + (j14 * j25);
        long j28 = (j22 * j20) + (((j26 * j24) + (j17 * j25)) << 1);
        long j29 = (j20 * j26) + (j22 * j25);
        long j30 = (j26 * j25) << 1;
        long j31 = (long) i33;
        long j32 = (long) i32;
        int i39 = i29;
        long j33 = (long) i39;
        long j34 = j30;
        int i40 = i15;
        int i41 = i21;
        long j35 = (long) i41;
        long j36 = (j35 * j32) + (j31 * j33);
        long j37 = j29;
        int i42 = i39;
        long j38 = (long) i28;
        long j39 = j31 * j32;
        int i43 = i23;
        long j40 = (long) i43;
        long j41 = (j40 * j32) + (j35 * j33) + (j31 * j38);
        int i44 = i43;
        int i45 = i41;
        long j42 = (long) i26;
        long j43 = j33;
        long j44 = (long) i25;
        long j45 = j44;
        long j46 = j32;
        long a12 = a.a(j45, j46, j31 * j42, ((j40 * j33) + (j35 * j38)) << 1);
        long j47 = (j40 * j38) << 1;
        long j48 = j38;
        int i46 = i30;
        long j49 = (long) i46;
        long j50 = (j44 * j43) + (j35 * j42) + (j31 * j49);
        int i47 = i27;
        long j51 = j44;
        long j52 = (long) i47;
        long j53 = (j40 * j42) + (j35 * j49);
        long j54 = j51;
        long j55 = (j52 * j43) + (j54 * j48) + j53;
        long j56 = j12 - (j55 * 76);
        long j57 = j15 - (((j54 * j42) + (((j52 * j48) + (j40 * j49)) << 1)) * 38);
        long j58 = j18 - (((j42 * j52) + (j54 * j49)) * 38);
        long j59 = a10 - ((j52 * j49) * 76);
        long j60 = j28 - j36;
        long j61 = j37 - j41;
        int i48 = i40 + i25;
        int i49 = i38 + i26;
        int i50 = i36 + i47;
        long j62 = (((j26 * j21) + j27) << 1) - j39;
        long j63 = (long) (i + i33);
        long j64 = (long) (i31 + i32);
        long j65 = j63 * j64;
        long a13 = a.a(j32, j52, j50, j47);
        long j66 = (long) (i34 + i42);
        long j67 = j34 - a12;
        long j68 = (long) (i11 + i45);
        long j69 = (j68 * j64) + (j63 * j66);
        long j70 = (long) (i37 + i28);
        long j71 = (long) (i13 + i44);
        long j72 = (j71 * j64) + (j68 * j66) + (j63 * j70);
        long j73 = j71 * j66;
        long j74 = (long) i49;
        long j75 = j66;
        long j76 = (long) i48;
        long j77 = j76;
        long j78 = j64;
        long a14 = a.a(j77, j78, j63 * j74, (j73 + (j68 * j70)) << 1);
        long j79 = (j71 * j70) << 1;
        long j80 = j70;
        long j81 = (long) (i35 + i46);
        long j82 = (j76 * j75) + (j68 * j74) + (j63 * j81);
        long j83 = (long) i50;
        long j84 = j75 * j83;
        long j85 = (j84 + ((j76 * j80) + ((j71 * j74) + (j68 * j81)))) << 1;
        long j86 = (j74 * j83) + (j76 * j81);
        long j87 = (a14 - j59) + j67;
        long a15 = ((a.a(j64, j83, j82, j79) - a11) - a13) + (j87 >> 26);
        long j88 = ((((a15 >> 25) + j85) - j62) * 38) + j56;
        iArr3[0] = ((int) j88) & 67108863;
        long j89 = ((((j76 * j74) + (((j83 * j80) + (j71 * j81)) << 1)) - j60) * 38) + j57 + (j88 >> 26);
        iArr3[1] = ((int) j89) & 67108863;
        long j90 = j61;
        long j91 = ((j86 - j90) * 38) + j58 + (j89 >> 26);
        iArr3[2] = ((int) j91) & 33554431;
        long j92 = ((((j83 * j81) << 1) - j67) * 38) + j59 + (j91 >> 25);
        iArr3[3] = ((int) j92) & 67108863;
        long a16 = a.a(a13, 38, a11, j92 >> 26);
        iArr3[4] = ((int) a16) & 33554431;
        long j93 = (j65 - j56) + j62 + (a16 >> 25);
        iArr3[5] = ((int) j93) & 67108863;
        long j94 = (j69 - j57) + j60 + (j93 >> 26);
        iArr3[6] = ((int) j94) & 67108863;
        long j95 = (j72 - j58) + j90 + (j94 >> 26);
        iArr3[7] = ((int) j95) & 33554431;
        long j96 = (j95 >> 25) + ((long) (((int) j87) & 67108863));
        iArr3[8] = ((int) j96) & 67108863;
        iArr3[9] = (((int) a15) & 33554431) + ((int) (j96 >> 26));
    }

    public static int s(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int s1(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j10 = 4294967295L;
        long j11 = ((long) iArr2[0]) & 4294967295L;
        long j12 = ((long) iArr2[1]) & 4294967295L;
        long j13 = ((long) iArr2[2]) & 4294967295L;
        long j14 = ((long) iArr2[3]) & 4294967295L;
        long j15 = ((long) iArr2[4]) & 4294967295L;
        long j16 = 0;
        while (i < 5) {
            long j17 = ((long) iArr[i]) & j10;
            int i10 = i + 0;
            long j18 = j11;
            long j19 = (j17 * j11) + (((long) iArr3[i10]) & j10) + 0;
            iArr3[i10] = (int) j19;
            int i11 = i + 1;
            long j20 = j12;
            long j21 = (j17 * j12) + (((long) iArr3[i11]) & 4294967295L) + (j19 >>> 32);
            iArr3[i11] = (int) j21;
            int i12 = i + 2;
            int i13 = i11;
            long j22 = (j17 * j13) + (((long) iArr3[i12]) & 4294967295L) + (j21 >>> 32);
            iArr3[i12] = (int) j22;
            int i14 = i + 3;
            long j23 = (j17 * j14) + (((long) iArr3[i14]) & 4294967295L) + (j22 >>> 32);
            iArr3[i14] = (int) j23;
            long j24 = j23 >>> 32;
            int i15 = i + 4;
            long j25 = (j17 * j15) + (((long) iArr3[i15]) & 4294967295L) + j24;
            iArr3[i15] = (int) j25;
            int i16 = i + 5;
            long j26 = (j25 >>> 32) + (((long) iArr3[i16]) & 4294967295L) + j16;
            iArr3[i16] = (int) j26;
            j16 = j26 >>> 32;
            j10 = 4294967295L;
            j11 = j18;
            i = i13;
            j12 = j20;
            j13 = j13;
        }
        return (int) j16;
    }

    public static int t(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int t1(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j10 = 4294967295L;
        long j11 = ((long) iArr2[0]) & 4294967295L;
        long j12 = ((long) iArr2[1]) & 4294967295L;
        long j13 = ((long) iArr2[2]) & 4294967295L;
        long j14 = ((long) iArr2[3]) & 4294967295L;
        long j15 = ((long) iArr2[4]) & 4294967295L;
        long j16 = ((long) iArr2[5]) & 4294967295L;
        long j17 = 0;
        while (i < 6) {
            long j18 = j16;
            long j19 = ((long) iArr[i]) & j10;
            int i10 = i + 0;
            long j20 = j11;
            long j21 = (j19 * j11) + (((long) iArr3[i10]) & j10) + 0;
            iArr3[i10] = (int) j21;
            int i11 = i + 1;
            long j22 = (j19 * j12) + (((long) iArr3[i11]) & 4294967295L) + (j21 >>> 32);
            iArr3[i11] = (int) j22;
            int i12 = i + 2;
            long j23 = (j19 * j13) + (((long) iArr3[i12]) & 4294967295L) + (j22 >>> 32);
            iArr3[i12] = (int) j23;
            int i13 = i + 3;
            long j24 = (j19 * j14) + (((long) iArr3[i13]) & 4294967295L) + (j23 >>> 32);
            iArr3[i13] = (int) j24;
            int i14 = i + 4;
            long j25 = (j19 * j15) + (((long) iArr3[i14]) & 4294967295L) + (j24 >>> 32);
            iArr3[i14] = (int) j25;
            long j26 = j25 >>> 32;
            int i15 = i + 5;
            long j27 = (j19 * j18) + (((long) iArr3[i15]) & 4294967295L) + j26;
            iArr3[i15] = (int) j27;
            int i16 = i + 6;
            long j28 = (j27 >>> 32) + (((long) iArr3[i16]) & 4294967295L) + j17;
            iArr3[i16] = (int) j28;
            j17 = j28 >>> 32;
            i = i11;
            j10 = 4294967295L;
            j16 = j18;
            j11 = j20;
            j12 = j12;
        }
        return (int) j17;
    }

    public static int u(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int u1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) iArr2[1]) & 4294967295L;
        long j11 = ((long) iArr2[2]) & 4294967295L;
        long j12 = ((long) iArr2[3]) & 4294967295L;
        long j13 = ((long) iArr2[4]) & 4294967295L;
        long j14 = ((long) iArr2[5]) & 4294967295L;
        long j15 = ((long) iArr2[0]) & 4294967295L;
        long j16 = ((long) iArr2[6]) & 4294967295L;
        long j17 = 0;
        int i = 0;
        while (i < 7) {
            long j18 = j16;
            long j19 = ((long) iArr[i]) & 4294967295L;
            int i10 = i + 0;
            long j20 = j14;
            long j21 = (j19 * j15) + (((long) iArr3[i10]) & 4294967295L) + 0;
            iArr3[i10] = (int) j21;
            int i11 = i + 1;
            long j22 = j10;
            long j23 = (j19 * j10) + (((long) iArr3[i11]) & 4294967295L) + (j21 >>> 32);
            iArr3[i11] = (int) j23;
            int i12 = i + 2;
            long j24 = (j19 * j11) + (((long) iArr3[i12]) & 4294967295L) + (j23 >>> 32);
            iArr3[i12] = (int) j24;
            int i13 = i + 3;
            long j25 = (j19 * j12) + (((long) iArr3[i13]) & 4294967295L) + (j24 >>> 32);
            iArr3[i13] = (int) j25;
            int i14 = i + 4;
            long j26 = (j19 * j13) + (((long) iArr3[i14]) & 4294967295L) + (j25 >>> 32);
            iArr3[i14] = (int) j26;
            int i15 = i + 5;
            long j27 = (j19 * j20) + (((long) iArr3[i15]) & 4294967295L) + (j26 >>> 32);
            iArr3[i15] = (int) j27;
            int i16 = i + 6;
            long j28 = (j19 * j18) + (((long) iArr3[i16]) & 4294967295L) + (j27 >>> 32);
            iArr3[i16] = (int) j28;
            int i17 = i + 7;
            long j29 = (j28 >>> 32) + (((long) iArr3[i17]) & 4294967295L) + j17;
            iArr3[i17] = (int) j29;
            j17 = j29 >>> 32;
            i = i11;
            j16 = j18;
            j14 = j20;
            j11 = j11;
            j10 = j22;
        }
        return (int) j17;
    }

    public static int v(int i, int[] iArr, int[] iArr2) {
        long j10 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            long j11 = (((long) iArr[i10]) & 4294967295L) + (4294967295L & ((long) iArr2[i10])) + j10;
            iArr2[i10] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int v1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((long) iArr2[1]) & 4294967295L;
        long j11 = ((long) iArr2[2]) & 4294967295L;
        long j12 = ((long) iArr2[3]) & 4294967295L;
        long j13 = ((long) iArr2[4]) & 4294967295L;
        long j14 = ((long) iArr2[5]) & 4294967295L;
        long j15 = ((long) iArr2[0]) & 4294967295L;
        long j16 = ((long) iArr2[6]) & 4294967295L;
        long j17 = ((long) iArr2[7]) & 4294967295L;
        long j18 = 0;
        int i = 0;
        while (i < 8) {
            long j19 = j17;
            long j20 = ((long) iArr[i]) & 4294967295L;
            int i10 = i + 0;
            long j21 = j14;
            long j22 = (j20 * j15) + (((long) iArr3[i10]) & 4294967295L) + 0;
            iArr3[i10] = (int) j22;
            int i11 = i + 1;
            long j23 = j10;
            long j24 = (j20 * j10) + (((long) iArr3[i11]) & 4294967295L) + (j22 >>> 32);
            iArr3[i11] = (int) j24;
            int i12 = i + 2;
            long j25 = (j20 * j11) + (((long) iArr3[i12]) & 4294967295L) + (j24 >>> 32);
            iArr3[i12] = (int) j25;
            int i13 = i + 3;
            long j26 = (j20 * j12) + (((long) iArr3[i13]) & 4294967295L) + (j25 >>> 32);
            iArr3[i13] = (int) j26;
            int i14 = i + 4;
            long j27 = (j20 * j13) + (((long) iArr3[i14]) & 4294967295L) + (j26 >>> 32);
            iArr3[i14] = (int) j27;
            int i15 = i + 5;
            long j28 = (j20 * j21) + (((long) iArr3[i15]) & 4294967295L) + (j27 >>> 32);
            iArr3[i15] = (int) j28;
            int i16 = i + 6;
            long j29 = (j20 * j16) + (((long) iArr3[i16]) & 4294967295L) + (j28 >>> 32);
            iArr3[i16] = (int) j29;
            int i17 = i + 7;
            long j30 = (j20 * j19) + (((long) iArr3[i17]) & 4294967295L) + (j29 >>> 32);
            iArr3[i17] = (int) j30;
            int i18 = i + 8;
            long j31 = (j30 >>> 32) + (((long) iArr3[i18]) & 4294967295L) + j18;
            iArr3[i18] = (int) j31;
            j18 = j31 >>> 32;
            i = i11;
            j17 = j19;
            j14 = j21;
            j11 = j11;
            j10 = j23;
        }
        return (int) j18;
    }

    public static int w(int i, int[] iArr, int[] iArr2, int i10) {
        long j10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            int i12 = i10 + i11;
            long j11 = (((long) iArr[0 + i11]) & 4294967295L) + (4294967295L & ((long) iArr2[i12])) + j10;
            iArr2[i12] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int w0(int i, int[] iArr, int i10) {
        int i11 = 0;
        while (i11 < iArr.length && i >= iArr[i11]) {
            i11++;
        }
        return Math.max(2, Math.min(i10, i11 + 2));
    }

    public static int x(int[] iArr, int i, int[] iArr2, int i10, int i11) {
        int i12 = i10 + 0;
        long j10 = (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i12]) & 4294967295L) + (((long) i11) & 4294967295L);
        iArr2[i12] = (int) j10;
        int i13 = i10 + 1;
        long j11 = (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i13]) & 4294967295L) + (j10 >>> 32);
        iArr2[i13] = (int) j11;
        int i14 = i10 + 2;
        long j12 = (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i14]) & 4294967295L) + (j11 >>> 32);
        iArr2[i14] = (int) j12;
        int i15 = i10 + 3;
        long j13 = (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i15]) & 4294967295L) + (j12 >>> 32);
        iArr2[i15] = (int) j13;
        int i16 = i10 + 4;
        long j14 = (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L) + (j13 >>> 32);
        iArr2[i16] = (int) j14;
        int i17 = i10 + 5;
        long j15 = (((long) iArr[i + 5]) & 4294967295L) + (4294967295L & ((long) iArr2[i17])) + (j14 >>> 32);
        iArr2[i17] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int x0(int i) {
        return w0(i, f730c, 8);
    }

    public static int y(int[] iArr, int i, int[] iArr2, int i10, int i11) {
        int i12 = i10 + 0;
        long j10 = (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i12]) & 4294967295L) + (((long) i11) & 4294967295L);
        iArr2[i12] = (int) j10;
        int i13 = i10 + 1;
        long j11 = (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i13]) & 4294967295L) + (j10 >>> 32);
        iArr2[i13] = (int) j11;
        int i14 = i10 + 2;
        long j12 = (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i14]) & 4294967295L) + (j11 >>> 32);
        iArr2[i14] = (int) j12;
        int i15 = i10 + 3;
        long j13 = (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i15]) & 4294967295L) + (j12 >>> 32);
        iArr2[i15] = (int) j13;
        int i16 = i10 + 4;
        long j14 = (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L) + (j13 >>> 32);
        iArr2[i16] = (int) j14;
        int i17 = i10 + 5;
        long j15 = (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i17]) & 4294967295L) + (j14 >>> 32);
        iArr2[i17] = (int) j15;
        int i18 = i10 + 6;
        long j16 = (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i18]) & 4294967295L) + (j15 >>> 32);
        iArr2[i18] = (int) j16;
        int i19 = i10 + 7;
        long j17 = (((long) iArr[i + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i19])) + (j16 >>> 32);
        iArr2[i19] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static boolean y0(int i, int[] iArr, int[] iArr2) {
        for (int i10 = i - 1; i10 >= 0; i10--) {
            int i11 = iArr[i10] ^ LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            int i12 = Integer.MIN_VALUE ^ iArr2[i10];
            if (i11 < i12) {
                return false;
            }
            if (i11 > i12) {
                return true;
            }
        }
        return true;
    }

    public static void y1(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        E1(iArr, i);
        E1(iArr, -i);
    }

    public static int z(int[] iArr, int[] iArr2) {
        long j10 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[12]) & 4294967295L) + 0;
        int i = (int) j10;
        iArr[6] = i;
        iArr2[12] = i;
        long j11 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[13]) & 4294967295L) + (j10 >>> 32);
        int i10 = (int) j11;
        iArr[7] = i10;
        iArr2[13] = i10;
        long j12 = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[14]) & 4294967295L) + (j11 >>> 32);
        int i11 = (int) j12;
        iArr[8] = i11;
        iArr2[14] = i11;
        long j13 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[15]) & 4294967295L) + (j12 >>> 32);
        int i12 = (int) j13;
        iArr[9] = i12;
        iArr2[15] = i12;
        long j14 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L) + (j13 >>> 32);
        int i13 = (int) j14;
        iArr[10] = i13;
        iArr2[16] = i13;
        long j15 = (((long) iArr[11]) & 4294967295L) + (4294967295L & ((long) iArr2[17])) + (j14 >>> 32);
        int i14 = (int) j15;
        iArr[11] = i14;
        iArr2[17] = i14;
        return (int) (j15 >>> 32);
    }

    public static boolean z0(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            int i10 = iArr[i] ^ LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            int i11 = Integer.MIN_VALUE ^ iArr2[i];
            if (i10 < i11) {
                return false;
            }
            if (i10 > i11) {
                return true;
            }
        }
        return true;
    }

    public abstract void A1(Typeface typeface, boolean z);

    public abstract Object E(Class cls);

    public abstract boolean J(Object obj);

    public Object a(Class cls) {
        r8.b d10 = d(cls);
        if (d10 == null) {
            return null;
        }
        return d10.get();
    }

    public Set c(Class cls) {
        return (Set) e(cls).get();
    }

    public abstract f i1(int i);

    public abstract f j1(int i);

    public abstract oe.b s0(de.b bVar);

    public abstract Path t0(float f10, float f11, float f12, float f13);

    public abstract oe.a u0(de.b bVar, String str);

    public abstract int v0();

    public f w1(f fVar, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || fVar.j()) {
            return fVar.f13245a.l();
        }
        f x12 = x1(fVar, bigInteger.abs());
        if (signum <= 0) {
            x12 = x12.m();
        }
        xg.a.a(x12);
        return x12;
    }

    public abstract f x1(f fVar, BigInteger bigInteger);

    public abstract void z1(int i);
}
