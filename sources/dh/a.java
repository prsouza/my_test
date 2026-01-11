package dh;

import com.google.android.gms.common.api.Api;
import mg.j;
import xh.h;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4493a = h.b("SigEd25519 no Ed25519 collisions");

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4494b = {-19, -1, -1, -1, -1, -1, -1, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4495c = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4496d = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f4497e = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f4498f = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    public static final int[] g = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f4499h = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    public static final Object i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static b[] f4500j = null;

    /* renamed from: k  reason: collision with root package name */
    public static int[] f4501k = null;

    /* renamed from: dh.a$a  reason: collision with other inner class name */
    public static class C0065a {

        /* renamed from: a  reason: collision with root package name */
        public int[] f4502a = new int[10];

        /* renamed from: b  reason: collision with root package name */
        public int[] f4503b = new int[10];

        /* renamed from: c  reason: collision with root package name */
        public int[] f4504c = new int[10];

        /* renamed from: d  reason: collision with root package name */
        public int[] f4505d = new int[10];

        /* renamed from: e  reason: collision with root package name */
        public int[] f4506e = new int[10];
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int[] f4507a = new int[10];

        /* renamed from: b  reason: collision with root package name */
        public int[] f4508b = new int[10];

        /* renamed from: c  reason: collision with root package name */
        public int[] f4509c = new int[10];

        /* renamed from: d  reason: collision with root package name */
        public int[] f4510d = new int[10];
    }

    public static boolean a(byte[] bArr) {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[0 + i10] = c(bArr, (i10 * 4) + 0);
        }
        iArr[7] = iArr[7] & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        return !android.support.v4.media.b.D0(iArr, f4494b);
    }

    public static int b(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        return ((bArr[i11 + 1] & 255) << 16) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
    }

    public static int c(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        return (bArr[i12 + 1] << 24) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
    }

    public static void d(byte[] bArr, int[] iArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[0 + i10] = c(bArr, (i10 * 4) + 0);
        }
    }

    public static void e(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        int i12 = i11 + 1;
        bArr[i12] = (byte) (i10 >>> 8);
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i10 >>> 16);
        bArr[i13 + 1] = (byte) (i10 >>> 24);
    }

    public static void f(long j10, byte[] bArr, int i10) {
        e((int) j10, bArr, i10);
        int i11 = (int) (j10 >>> 32);
        int i12 = i10 + 4;
        bArr[i12] = (byte) i11;
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        bArr[i13 + 1] = (byte) (i11 >>> 16);
    }

    public static int g(C0065a aVar, byte[] bArr) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        android.support.v4.media.b.C1(aVar.f4504c, iArr3, iArr4);
        android.support.v4.media.b.J1(iArr4, 3, iArr4);
        android.support.v4.media.b.r1(iArr4, iArr3, iArr2);
        android.support.v4.media.b.r1(aVar.f4502a, iArr2, iArr);
        android.support.v4.media.b.r1(aVar.f4503b, iArr2, iArr2);
        android.support.v4.media.b.y1(iArr);
        android.support.v4.media.b.y1(iArr2);
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        android.support.v4.media.b.K1(iArr, iArr6);
        android.support.v4.media.b.K1(iArr2, iArr7);
        android.support.v4.media.b.r1(iArr6, iArr7, iArr5);
        android.support.v4.media.b.U1(iArr7, iArr6, iArr7);
        android.support.v4.media.b.r1(iArr5, f4498f, iArr5);
        iArr5[0] = iArr5[0] + 1;
        android.support.v4.media.b.U1(iArr5, iArr7, iArr5);
        android.support.v4.media.b.y1(iArr5);
        int U0 = android.support.v4.media.b.U0(iArr5);
        android.support.v4.media.b.d0(iArr2, 0, bArr, 0);
        android.support.v4.media.b.d0(iArr2, 5, bArr, 16);
        bArr[31] = (byte) (((iArr[0] & 1) << 7) | bArr[31]);
        return U0;
    }

    public static byte[] h(int[] iArr, int i10) {
        int i11;
        int[] iArr2 = new int[16];
        int i12 = 0;
        int i13 = 8;
        int i14 = 16;
        int i15 = 0;
        while (true) {
            i13--;
            if (i13 < 0) {
                break;
            }
            int i16 = iArr[i13];
            int i17 = i14 - 1;
            iArr2[i17] = (i15 << 16) | (i16 >>> 16);
            i14 = i17 - 1;
            iArr2[i14] = i16;
            i15 = i16;
        }
        byte[] bArr = new byte[253];
        int i18 = 1 << i10;
        int i19 = i18 - 1;
        int i20 = i18 >>> 1;
        int i21 = 0;
        int i22 = 0;
        while (i12 < 16) {
            int i23 = iArr2[i12];
            while (i11 < 16) {
                int i24 = i23 >>> i11;
                if ((i24 & 1) == i22) {
                    i11++;
                } else {
                    int i25 = (i24 & i19) + i22;
                    int i26 = i25 & i20;
                    int i27 = i25 - (i26 << 1);
                    i22 = i26 >>> (i10 - 1);
                    bArr[(i12 << 4) + i11] = (byte) i27;
                    i11 += i10;
                }
            }
            i12++;
            i21 = i11 - 16;
        }
        return bArr;
    }

    public static void i(byte[] bArr, byte[] bArr2, byte b10, byte[] bArr3, int i10, byte[] bArr4) {
        if (b10 == 0) {
            j jVar = new j();
            byte[] bArr5 = new byte[64];
            jVar.update(bArr, 0, 32);
            jVar.b(bArr5, 0);
            byte[] bArr6 = new byte[32];
            q(bArr5, bArr6);
            jVar.update(bArr5, 32, 32);
            jVar.update(bArr3, 0, i10);
            jVar.b(bArr5, 0);
            byte[] r10 = r(bArr5);
            byte[] bArr7 = new byte[32];
            s(r10, bArr7);
            jVar.update(bArr7, 0, 32);
            jVar.update(bArr2, 0, 32);
            jVar.update(bArr3, 0, i10);
            jVar.b(bArr5, 0);
            byte[] r11 = r(bArr5);
            int[] iArr = new int[16];
            d(r10, iArr);
            int[] iArr2 = new int[8];
            d(r11, iArr2);
            int[] iArr3 = new int[8];
            d(bArr6, iArr3);
            android.support.v4.media.b.v1(iArr2, iArr3, iArr);
            byte[] bArr8 = new byte[64];
            for (int i11 = 0; i11 < 16; i11++) {
                e(iArr[i11], bArr8, i11 * 4);
            }
            byte[] r12 = r(bArr8);
            System.arraycopy(bArr7, 0, bArr4, 0, 32);
            System.arraycopy(r12, 0, bArr4, 32, 32);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    public static void j(boolean z, b bVar, C0065a aVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int[] iArr9 = aVar.f4505d;
        int[] iArr10 = new int[10];
        int[] iArr11 = new int[10];
        int[] iArr12 = aVar.f4506e;
        if (z) {
            iArr2 = iArr11;
            iArr = iArr7;
            iArr4 = iArr8;
            iArr3 = iArr10;
        } else {
            iArr3 = iArr11;
            iArr4 = iArr7;
            iArr = iArr8;
            iArr2 = iArr10;
        }
        android.support.v4.media.b.D(aVar.f4503b, aVar.f4502a, iArr6, iArr5);
        android.support.v4.media.b.D(bVar.f4508b, bVar.f4507a, iArr, iArr4);
        android.support.v4.media.b.r1(iArr5, iArr7, iArr5);
        android.support.v4.media.b.r1(iArr6, iArr8, iArr6);
        android.support.v4.media.b.r1(aVar.f4505d, aVar.f4506e, iArr7);
        android.support.v4.media.b.r1(iArr7, bVar.f4510d, iArr7);
        android.support.v4.media.b.r1(iArr7, g, iArr7);
        android.support.v4.media.b.r1(aVar.f4504c, bVar.f4509c, iArr8);
        android.support.v4.media.b.j(iArr8, iArr8, iArr8);
        android.support.v4.media.b.D(iArr6, iArr5, iArr12, iArr9);
        android.support.v4.media.b.D(iArr8, iArr7, iArr3, iArr2);
        android.support.v4.media.b.H(iArr3);
        android.support.v4.media.b.r1(iArr9, iArr10, aVar.f4502a);
        android.support.v4.media.b.r1(iArr11, iArr12, aVar.f4503b);
        android.support.v4.media.b.r1(iArr10, iArr11, aVar.f4504c);
    }

    public static void k(boolean z, b bVar, b bVar2, b bVar3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        b bVar4 = bVar;
        b bVar5 = bVar2;
        b bVar6 = bVar3;
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int[] iArr9 = new int[10];
        int[] iArr10 = new int[10];
        int[] iArr11 = new int[10];
        int[] iArr12 = new int[10];
        if (z) {
            iArr4 = iArr7;
            iArr3 = iArr8;
            iArr2 = iArr10;
            iArr = iArr11;
        } else {
            iArr3 = iArr7;
            iArr4 = iArr8;
            iArr = iArr10;
            iArr2 = iArr11;
        }
        android.support.v4.media.b.D(bVar4.f4508b, bVar4.f4507a, iArr6, iArr5);
        android.support.v4.media.b.D(bVar5.f4508b, bVar5.f4507a, iArr4, iArr3);
        android.support.v4.media.b.r1(iArr5, iArr7, iArr5);
        android.support.v4.media.b.r1(iArr6, iArr8, iArr6);
        android.support.v4.media.b.r1(bVar4.f4510d, bVar5.f4510d, iArr7);
        android.support.v4.media.b.r1(iArr7, g, iArr7);
        android.support.v4.media.b.r1(bVar4.f4509c, bVar5.f4509c, iArr8);
        android.support.v4.media.b.j(iArr8, iArr8, iArr8);
        android.support.v4.media.b.D(iArr6, iArr5, iArr12, iArr9);
        android.support.v4.media.b.D(iArr8, iArr7, iArr2, iArr);
        android.support.v4.media.b.H(iArr2);
        android.support.v4.media.b.r1(iArr9, iArr10, bVar6.f4507a);
        int[] iArr13 = iArr11;
        android.support.v4.media.b.r1(iArr13, iArr12, bVar6.f4508b);
        android.support.v4.media.b.r1(iArr10, iArr13, bVar6.f4509c);
        android.support.v4.media.b.r1(iArr9, iArr12, bVar6.f4510d);
    }

    public static b l(C0065a aVar) {
        b bVar = new b();
        android.support.v4.media.b.Q(aVar.f4502a, bVar.f4507a, 0);
        android.support.v4.media.b.Q(aVar.f4503b, bVar.f4508b, 0);
        android.support.v4.media.b.Q(aVar.f4504c, bVar.f4509c, 0);
        android.support.v4.media.b.r1(aVar.f4505d, aVar.f4506e, bVar.f4510d);
        return bVar;
    }

    public static void m(C0065a aVar) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = aVar.f4505d;
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = aVar.f4506e;
        android.support.v4.media.b.K1(aVar.f4502a, iArr);
        android.support.v4.media.b.K1(aVar.f4503b, iArr2);
        android.support.v4.media.b.K1(aVar.f4504c, iArr3);
        android.support.v4.media.b.j(iArr3, iArr3, iArr3);
        android.support.v4.media.b.D(iArr, iArr2, iArr7, iArr6);
        android.support.v4.media.b.j(aVar.f4502a, aVar.f4503b, iArr4);
        android.support.v4.media.b.K1(iArr4, iArr4);
        android.support.v4.media.b.U1(iArr7, iArr4, iArr4);
        android.support.v4.media.b.j(iArr3, iArr6, iArr5);
        android.support.v4.media.b.H(iArr5);
        android.support.v4.media.b.r1(iArr4, iArr5, aVar.f4502a);
        android.support.v4.media.b.r1(iArr6, iArr7, aVar.f4503b);
        android.support.v4.media.b.r1(iArr5, iArr6, aVar.f4504c);
    }

    public static b[] n(b bVar, int i10) {
        b bVar2 = new b();
        k(false, bVar, bVar, bVar2);
        b[] bVarArr = new b[i10];
        b bVar3 = new b();
        android.support.v4.media.b.Q(bVar.f4507a, bVar3.f4507a, 0);
        android.support.v4.media.b.Q(bVar.f4508b, bVar3.f4508b, 0);
        android.support.v4.media.b.Q(bVar.f4509c, bVar3.f4509c, 0);
        android.support.v4.media.b.Q(bVar.f4510d, bVar3.f4510d, 0);
        bVarArr[0] = bVar3;
        for (int i11 = 1; i11 < i10; i11++) {
            b bVar4 = bVarArr[i11 - 1];
            b bVar5 = new b();
            bVarArr[i11] = bVar5;
            k(false, bVar4, bVar2, bVar5);
        }
        return bVarArr;
    }

    public static void o(C0065a aVar) {
        android.support.v4.media.b.o2(aVar.f4502a);
        android.support.v4.media.b.B1(aVar.f4503b);
        android.support.v4.media.b.B1(aVar.f4504c);
        android.support.v4.media.b.o2(aVar.f4505d);
        android.support.v4.media.b.B1(aVar.f4506e);
    }

    public static void p() {
        int i10;
        synchronized (i) {
            if (f4501k == null) {
                b bVar = new b();
                int[] iArr = f4496d;
                android.support.v4.media.b.Q(iArr, bVar.f4507a, 0);
                int[] iArr2 = f4497e;
                android.support.v4.media.b.Q(iArr2, bVar.f4508b, 0);
                android.support.v4.media.b.B1(bVar.f4509c);
                android.support.v4.media.b.r1(bVar.f4507a, bVar.f4508b, bVar.f4510d);
                f4500j = n(bVar, 32);
                C0065a aVar = new C0065a();
                android.support.v4.media.b.Q(iArr, aVar.f4502a, 0);
                android.support.v4.media.b.Q(iArr2, aVar.f4503b, 0);
                android.support.v4.media.b.B1(aVar.f4504c);
                android.support.v4.media.b.Q(aVar.f4502a, aVar.f4505d, 0);
                android.support.v4.media.b.Q(aVar.f4503b, aVar.f4506e, 0);
                f4501k = new int[1920];
                int i11 = 0;
                for (int i12 = 0; i12 < 8; i12++) {
                    b[] bVarArr = new b[4];
                    b bVar2 = new b();
                    android.support.v4.media.b.o2(bVar2.f4507a);
                    android.support.v4.media.b.B1(bVar2.f4508b);
                    android.support.v4.media.b.B1(bVar2.f4509c);
                    android.support.v4.media.b.o2(bVar2.f4510d);
                    int i13 = 0;
                    while (true) {
                        i10 = 1;
                        if (i13 >= 4) {
                            break;
                        }
                        k(true, bVar2, l(aVar), bVar2);
                        m(aVar);
                        bVarArr[i13] = l(aVar);
                        if (i12 + i13 != 10) {
                            while (i10 < 8) {
                                m(aVar);
                                i10++;
                            }
                        }
                        i13++;
                    }
                    b[] bVarArr2 = new b[8];
                    bVarArr2[0] = bVar2;
                    int i14 = 0;
                    int i15 = 1;
                    while (i14 < 3) {
                        int i16 = i10 << i14;
                        int i17 = 0;
                        while (i17 < i16) {
                            b bVar3 = bVarArr2[i15 - i16];
                            b bVar4 = bVarArr[i14];
                            b bVar5 = new b();
                            bVarArr2[i15] = bVar5;
                            k(false, bVar3, bVar4, bVar5);
                            i17++;
                            i15++;
                        }
                        i14++;
                        i10 = 1;
                    }
                    for (int i18 = 0; i18 < 8; i18++) {
                        b bVar6 = bVarArr2[i18];
                        int[] iArr3 = new int[10];
                        int[] iArr4 = new int[10];
                        int[] iArr5 = bVar6.f4509c;
                        android.support.v4.media.b.j(iArr5, iArr5, iArr3);
                        int[] iArr6 = new int[10];
                        int[] iArr7 = new int[10];
                        android.support.v4.media.b.C1(iArr3, iArr6, iArr7);
                        android.support.v4.media.b.J1(iArr7, 3, iArr7);
                        android.support.v4.media.b.r1(iArr7, iArr6, iArr4);
                        android.support.v4.media.b.r1(bVar6.f4507a, iArr4, iArr3);
                        android.support.v4.media.b.r1(bVar6.f4508b, iArr4, iArr4);
                        int[] iArr8 = new int[10];
                        int[] iArr9 = new int[10];
                        int[] iArr10 = new int[10];
                        android.support.v4.media.b.D(iArr4, iArr3, iArr8, iArr9);
                        android.support.v4.media.b.r1(iArr3, iArr4, iArr10);
                        android.support.v4.media.b.r1(iArr10, f4499h, iArr10);
                        android.support.v4.media.b.y1(iArr8);
                        android.support.v4.media.b.y1(iArr9);
                        android.support.v4.media.b.Q(iArr8, f4501k, i11);
                        int i19 = i11 + 10;
                        android.support.v4.media.b.Q(iArr9, f4501k, i19);
                        int i20 = i19 + 10;
                        android.support.v4.media.b.Q(iArr10, f4501k, i20);
                        i11 = i20 + 10;
                    }
                }
            }
        }
    }

    public static void q(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        bArr2[31] = (byte) (bArr2[31] & Byte.MAX_VALUE);
        bArr2[31] = (byte) (bArr2[31] | 64);
    }

    public static byte[] r(byte[] bArr) {
        byte[] bArr2 = bArr;
        long b10 = ((long) (b(bArr2, 4) << 4)) & 4294967295L;
        long c10 = ((long) c(bArr2, 7)) & 4294967295L;
        long b11 = ((long) (b(bArr2, 11) << 4)) & 4294967295L;
        long c11 = ((long) c(bArr2, 14)) & 4294967295L;
        long b12 = ((long) (b(bArr2, 18) << 4)) & 4294967295L;
        long c12 = ((long) c(bArr2, 21)) & 4294967295L;
        long b13 = ((long) (b(bArr2, 25) << 4)) & 4294967295L;
        long c13 = ((long) c(bArr2, 28)) & 4294967295L;
        long c14 = ((long) c(bArr2, 49)) & 4294967295L;
        long b14 = ((long) (b(bArr2, 53) << 4)) & 4294967295L;
        long c15 = ((long) c(bArr2, 56)) & 4294967295L;
        long b15 = ((long) (b(bArr2, 60) << 4)) & 4294967295L;
        long j10 = ((long) bArr2[63]) & 255;
        long b16 = (((long) (b(bArr2, 46) << 4)) & 4294967295L) - (j10 * 5343);
        long j11 = b15 + (c15 >> 28);
        long j12 = c15 & 268435455;
        long j13 = c13 - (j11 * -50998291);
        long b17 = ((((long) (b(bArr2, 32) << 4)) & 4294967295L) - (j10 * -50998291)) - (j11 * 19280294);
        long c16 = ((((long) c(bArr2, 35)) & 4294967295L) - (j10 * 19280294)) - (j11 * 127719000);
        long c17 = ((((long) c(bArr2, 42)) & 4294967295L) - (j10 * -6428113)) - (j11 * 5343);
        long j14 = b13 - (j12 * -50998291);
        long b18 = (((((long) (b(bArr2, 39) << 4)) & 4294967295L) - (j10 * 127719000)) - (j11 * -6428113)) - (j12 * 5343);
        long j15 = b14 + (c14 >> 28);
        long j16 = c14 & 268435455;
        long j17 = (c16 - (j12 * -6428113)) - (j15 * 5343);
        long j18 = ((b17 - (j12 * 127719000)) - (j15 * -6428113)) - (j16 * 5343);
        long j19 = b16 + (c17 >> 28);
        long j20 = (c17 & 268435455) + (b18 >> 28);
        long j21 = b11 - (j20 * -50998291);
        long j22 = (c11 - (j19 * -50998291)) - (j20 * 19280294);
        long j23 = ((b12 - (j16 * -50998291)) - (j19 * 19280294)) - (j20 * 127719000);
        long j24 = (((j14 - (j15 * 19280294)) - (j16 * 127719000)) - (j19 * -6428113)) - (j20 * 5343);
        long j25 = (b18 & 268435455) + (j17 >> 28);
        long j26 = j17 & 268435455;
        long j27 = c10 - (j25 * -50998291);
        long j28 = j21 - (j25 * 19280294);
        long j29 = j22 - (j25 * 127719000);
        long j30 = ((((c12 - (j15 * -50998291)) - (j16 * 19280294)) - (j19 * 127719000)) - (j20 * -6428113)) - (j25 * 5343);
        long j31 = j26 + (j18 >> 28);
        long j32 = j27 - (j31 * 19280294);
        long j33 = j28 - (j31 * 127719000);
        long j34 = j29 - (j31 * -6428113);
        long j35 = (j23 - (j25 * -6428113)) - (j31 * 5343);
        long j36 = ((((j13 - (j12 * 19280294)) - (j15 * 127719000)) - (j16 * -6428113)) - (j19 * 5343)) + (j24 >> 28);
        long j37 = j36 & 268435455;
        long j38 = j37 >>> 27;
        long j39 = (j18 & 268435455) + (j36 >> 28) + j38;
        long c18 = (((long) c(bArr2, 0)) & 4294967295L) - (j39 * -50998291);
        long j40 = ((b10 - (j31 * -50998291)) - (j39 * 19280294)) + (c18 >> 28);
        long j41 = c18 & 268435455;
        long j42 = (j32 - (j39 * 127719000)) + (j40 >> 28);
        long j43 = (j33 - (j39 * -6428113)) + (j42 >> 28);
        long j44 = (j34 - (j39 * 5343)) + (j43 >> 28);
        long j45 = j35 + (j44 >> 28);
        long j46 = j44 & 268435455;
        long j47 = j30 + (j45 >> 28);
        long j48 = (j24 & 268435455) + (j47 >> 28);
        long j49 = j37 + (j48 >> 28);
        long j50 = (j49 >> 28) - j38;
        long j51 = j41 + (j50 & -50998291);
        long j52 = (j40 & 268435455) + (j50 & 19280294) + (j51 >> 28);
        long j53 = (j42 & 268435455) + (j50 & 127719000) + (j52 >> 28);
        long j54 = (j43 & 268435455) + (j50 & -6428113) + (j53 >> 28);
        long j55 = j46 + (j50 & 5343) + (j54 >> 28);
        long j56 = (j45 & 268435455) + (j55 >> 28);
        long j57 = (j47 & 268435455) + (j56 >> 28);
        long j58 = (j48 & 268435455) + (j57 >> 28);
        byte[] bArr3 = new byte[32];
        f((j51 & 268435455) | ((j52 & 268435455) << 28), bArr3, 0);
        f(((j54 & 268435455) << 28) | (j53 & 268435455), bArr3, 7);
        f((j55 & 268435455) | ((j56 & 268435455) << 28), bArr3, 14);
        f((j57 & 268435455) | ((j58 & 268435455) << 28), bArr3, 21);
        e((int) ((j49 & 268435455) + (j58 >> 28)), bArr3, 28);
        return bArr3;
    }

    public static void s(byte[] bArr, byte[] bArr2) {
        C0065a aVar = new C0065a();
        p();
        o(aVar);
        int i10 = 8;
        int[] iArr = new int[8];
        d(bArr, iArr);
        int i11 = 0;
        int i12 = 1;
        int[] iArr2 = f4495c;
        long j10 = 4294967295L;
        long j11 = ((long) (-((~iArr[0]) & 1 & 1))) & 4294967295L;
        long j12 = 0;
        int i13 = 0;
        while (i13 < 8) {
            long j13 = (((long) iArr[i13]) & j10) + (((long) iArr2[i13]) & j11) + j12;
            iArr[i13] = (int) j13;
            j12 = j13 >>> 32;
            i13++;
            j10 = 4294967295L;
        }
        int i14 = 8;
        int i15 = 1;
        while (true) {
            i14--;
            if (i14 < 0) {
                break;
            }
            int i16 = iArr[i14];
            iArr[i14] = (i15 << 31) | (i16 >>> 1);
            i15 = i16;
        }
        for (int i17 = 0; i17 < 8; i17++) {
            int i18 = iArr[i17];
            int i19 = ((i18 >>> 7) ^ i18) & 11141290;
            int i20 = i18 ^ (i19 ^ (i19 << 7));
            int i21 = ((i20 >>> 14) ^ i20) & 52428;
            int i22 = i20 ^ (i21 ^ (i21 << 14));
            int i23 = ((i22 >>> 4) ^ i22) & 15728880;
            int i24 = i22 ^ (i23 ^ (i23 << 4));
            int i25 = ((i24 >>> 8) ^ i24) & 65280;
            iArr[i17] = i24 ^ (i25 ^ (i25 << 8));
        }
        int i26 = 10;
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int i27 = 28;
        while (true) {
            int i28 = i11;
            while (i28 < i10) {
                int i29 = iArr[i28] >>> i27;
                int i30 = (i29 >>> 3) & i12;
                int i31 = (i29 ^ (-i30)) & 7;
                int i32 = i28 * 8 * 3 * i26;
                int i33 = i11;
                while (i33 < i10) {
                    int i34 = ((i33 ^ i31) - 1) >> 31;
                    android.support.v4.media.b.I(i34, f4501k, i32, iArr3);
                    int i35 = i32 + i26;
                    android.support.v4.media.b.I(i34, f4501k, i35, iArr4);
                    int i36 = i35 + i26;
                    android.support.v4.media.b.I(i34, f4501k, i36, iArr5);
                    i32 = i36 + i26;
                    i33++;
                    i10 = 8;
                }
                int i37 = 0 - i30;
                for (int i38 = i11; i38 < i26; i38++) {
                    int i39 = iArr3[i38];
                    int i40 = iArr4[i38];
                    int i41 = (i39 ^ i40) & i37;
                    iArr3[i38] = i39 ^ i41;
                    iArr4[i38] = i40 ^ i41;
                }
                for (int i42 = i11; i42 < i26; i42++) {
                    iArr5[i42] = (iArr5[i42] ^ i37) - i37;
                }
                int[] iArr6 = new int[i26];
                int[] iArr7 = new int[i26];
                int[] iArr8 = new int[i26];
                int[] iArr9 = aVar.f4505d;
                int[] iArr10 = new int[i26];
                int[] iArr11 = new int[i26];
                int[] iArr12 = aVar.f4506e;
                android.support.v4.media.b.D(aVar.f4503b, aVar.f4502a, iArr7, iArr6);
                android.support.v4.media.b.r1(iArr6, iArr4, iArr6);
                android.support.v4.media.b.r1(iArr7, iArr3, iArr7);
                android.support.v4.media.b.r1(aVar.f4505d, aVar.f4506e, iArr8);
                android.support.v4.media.b.r1(iArr8, iArr5, iArr8);
                android.support.v4.media.b.D(iArr7, iArr6, iArr12, iArr9);
                android.support.v4.media.b.D(aVar.f4504c, iArr8, iArr11, iArr10);
                android.support.v4.media.b.H(iArr11);
                android.support.v4.media.b.r1(iArr9, iArr10, aVar.f4502a);
                android.support.v4.media.b.r1(iArr11, iArr12, aVar.f4503b);
                android.support.v4.media.b.r1(iArr10, iArr11, aVar.f4504c);
                i28++;
                i10 = 8;
                i11 = 0;
                i26 = 10;
                i12 = 1;
            }
            i27 -= 4;
            if (i27 < 0) {
                break;
            }
            byte[] bArr3 = bArr2;
            m(aVar);
            i10 = 8;
            i11 = 0;
            i26 = 10;
            i12 = 1;
        }
        if (g(aVar, bArr2) == 0) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean t(byte[] r17, byte[] r18, byte[] r19, int r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 32
            byte[] r4 = xh.a.d(r0, r2, r3)
            r5 = 64
            byte[] r0 = xh.a.d(r0, r3, r5)
            boolean r6 = a(r4)
            r7 = 1
            if (r6 != 0) goto L_0x001a
            goto L_0x0189
        L_0x001a:
            r6 = 8
            int[] r8 = new int[r6]
            d(r0, r8)
            int[] r9 = f4495c
            boolean r8 = android.support.v4.media.b.D0(r8, r9)
            r8 = r8 ^ r7
            if (r8 != 0) goto L_0x002c
            goto L_0x0189
        L_0x002c:
            r8 = 10
            int[] r9 = new int[r8]
            int[] r10 = new int[r8]
            byte[] r11 = xh.a.d(r1, r2, r3)
            boolean r12 = a(r11)
            r13 = 5
            r14 = 7
            if (r12 != 0) goto L_0x0040
            goto L_0x00ce
        L_0x0040:
            r12 = 31
            byte r15 = r11[r12]
            r15 = r15 & 128(0x80, float:1.794E-43)
            int r15 = r15 >>> r14
            byte r16 = r11[r12]
            r14 = r16 & 127(0x7f, float:1.78E-43)
            byte r14 = (byte) r14
            r11[r12] = r14
            android.support.v4.media.b.Z(r11, r2, r10, r2)
            r12 = 16
            android.support.v4.media.b.Z(r11, r12, r10, r13)
            r11 = 9
            r12 = r10[r11]
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r14
            r10[r11] = r12
            int[] r11 = new int[r8]
            int[] r12 = new int[r8]
            android.support.v4.media.b.K1(r10, r11)
            int[] r14 = f4498f
            android.support.v4.media.b.r1(r14, r11, r12)
            r14 = r11[r2]
            int r14 = r14 + -1
            r11[r2] = r14
            r14 = r12[r2]
            int r14 = r14 + r7
            r12[r2] = r14
            int[] r14 = new int[r8]
            int[] r13 = new int[r8]
            android.support.v4.media.b.r1(r11, r12, r14)
            android.support.v4.media.b.K1(r12, r13)
            android.support.v4.media.b.r1(r14, r13, r14)
            android.support.v4.media.b.K1(r13, r13)
            android.support.v4.media.b.r1(r13, r14, r13)
            int[] r6 = new int[r8]
            int[] r3 = new int[r8]
            android.support.v4.media.b.C1(r13, r6, r3)
            android.support.v4.media.b.r1(r3, r14, r3)
            int[] r13 = new int[r8]
            android.support.v4.media.b.K1(r3, r13)
            android.support.v4.media.b.r1(r13, r12, r13)
            android.support.v4.media.b.U1(r13, r11, r6)
            android.support.v4.media.b.y1(r6)
            boolean r12 = android.support.v4.media.b.e1(r6)
            if (r12 == 0) goto L_0x00ac
            android.support.v4.media.b.Q(r3, r9, r2)
            goto L_0x00bd
        L_0x00ac:
            android.support.v4.media.b.j(r13, r11, r6)
            android.support.v4.media.b.y1(r6)
            boolean r6 = android.support.v4.media.b.e1(r6)
            if (r6 == 0) goto L_0x00bf
            int[] r6 = android.support.v4.media.b.f728a
            android.support.v4.media.b.r1(r3, r6, r9)
        L_0x00bd:
            r3 = r7
            goto L_0x00c0
        L_0x00bf:
            r3 = r2
        L_0x00c0:
            if (r3 != 0) goto L_0x00c3
            goto L_0x00ce
        L_0x00c3:
            android.support.v4.media.b.y1(r9)
            if (r15 != r7) goto L_0x00d0
            boolean r3 = android.support.v4.media.b.e1(r9)
            if (r3 == 0) goto L_0x00d0
        L_0x00ce:
            r3 = r2
            goto L_0x00e7
        L_0x00d0:
            r3 = r9[r2]
            r3 = r3 & r7
            if (r15 == r3) goto L_0x00d7
            r3 = r7
            goto L_0x00d8
        L_0x00d7:
            r3 = r2
        L_0x00d8:
            r3 = r3 ^ r7
            if (r3 == 0) goto L_0x00e6
            r3 = r2
        L_0x00dc:
            if (r3 >= r8) goto L_0x00e6
            r6 = r9[r3]
            int r6 = -r6
            r9[r3] = r6
            int r3 = r3 + 1
            goto L_0x00dc
        L_0x00e6:
            r3 = r7
        L_0x00e7:
            if (r3 != 0) goto L_0x00eb
            goto L_0x0189
        L_0x00eb:
            mg.j r3 = new mg.j
            r3.<init>()
            byte[] r5 = new byte[r5]
            r6 = 32
            r3.update(r4, r2, r6)
            r3.update(r1, r2, r6)
            r1 = r19
            r6 = r20
            r3.update(r1, r2, r6)
            r3.b(r5, r2)
            byte[] r1 = r(r5)
            r3 = 8
            int[] r5 = new int[r3]
            d(r0, r5)
            int[] r0 = new int[r3]
            d(r1, r0)
            dh.a$a r1 = new dh.a$a
            r1.<init>()
            p()
            r3 = 7
            byte[] r3 = h(r5, r3)
            r5 = 5
            byte[] r0 = h(r0, r5)
            dh.a$b r5 = new dh.a$b
            r5.<init>()
            int[] r6 = r5.f4507a
            android.support.v4.media.b.Q(r9, r6, r2)
            int[] r6 = r5.f4508b
            android.support.v4.media.b.Q(r10, r6, r2)
            int[] r6 = r5.f4509c
            android.support.v4.media.b.B1(r6)
            int[] r6 = r5.f4507a
            int[] r8 = r5.f4508b
            int[] r9 = r5.f4510d
            android.support.v4.media.b.r1(r6, r8, r9)
            r6 = 8
            dh.a$b[] r5 = n(r5, r6)
            o(r1)
            r6 = 252(0xfc, float:3.53E-43)
        L_0x014e:
            byte r8 = r3[r6]
            if (r8 == 0) goto L_0x0162
            int r9 = r8 >> 31
            r8 = r8 ^ r9
            int r8 = r8 >>> r7
            if (r9 == 0) goto L_0x015a
            r9 = r7
            goto L_0x015b
        L_0x015a:
            r9 = r2
        L_0x015b:
            dh.a$b[] r10 = f4500j
            r8 = r10[r8]
            j(r9, r8, r1)
        L_0x0162:
            byte r8 = r0[r6]
            if (r8 == 0) goto L_0x0174
            int r9 = r8 >> 31
            r8 = r8 ^ r9
            int r8 = r8 >>> r7
            if (r9 == 0) goto L_0x016e
            r9 = r7
            goto L_0x016f
        L_0x016e:
            r9 = r2
        L_0x016f:
            r8 = r5[r8]
            j(r9, r8, r1)
        L_0x0174:
            int r6 = r6 + -1
            r8 = 32
            if (r6 >= 0) goto L_0x018a
            byte[] r0 = new byte[r8]
            int r1 = g(r1, r0)
            if (r1 == 0) goto L_0x0189
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L_0x0189
            r2 = r7
        L_0x0189:
            return r2
        L_0x018a:
            m(r1)
            goto L_0x014e
        */
        throw new UnsupportedOperationException("Method not decompiled: dh.a.t(byte[], byte[], byte[], int):boolean");
    }
}
