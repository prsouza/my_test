package mg;

import android.support.v4.media.b;
import xh.d;

public final class g extends b {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f8723n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d  reason: collision with root package name */
    public int f8724d;

    /* renamed from: e  reason: collision with root package name */
    public int f8725e;

    /* renamed from: f  reason: collision with root package name */
    public int f8726f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public int f8727h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f8728j;

    /* renamed from: k  reason: collision with root package name */
    public int f8729k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f8730l = new int[64];

    /* renamed from: m  reason: collision with root package name */
    public int f8731m;

    public g() {
        reset();
    }

    public g(g gVar) {
        super(gVar);
        p(gVar);
    }

    public static int n(int i10) {
        return ((i10 << 10) | (i10 >>> 22)) ^ (((i10 >>> 2) | (i10 << 30)) ^ ((i10 >>> 13) | (i10 << 19)));
    }

    public static int o(int i10) {
        return ((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)));
    }

    public final d a() {
        return new g(this);
    }

    public final int b(byte[] bArr, int i10) {
        j();
        b.I0(this.f8724d, bArr, i10);
        b.I0(this.f8725e, bArr, i10 + 4);
        b.I0(this.f8726f, bArr, i10 + 8);
        b.I0(this.g, bArr, i10 + 12);
        b.I0(this.f8727h, bArr, i10 + 16);
        b.I0(this.i, bArr, i10 + 20);
        b.I0(this.f8728j, bArr, i10 + 24);
        b.I0(this.f8729k, bArr, i10 + 28);
        reset();
        return 32;
    }

    public final String c() {
        return "SHA-256";
    }

    public final int d() {
        return 32;
    }

    public final void e(d dVar) {
        p((g) dVar);
    }

    public final void k() {
        for (int i10 = 16; i10 <= 63; i10++) {
            int[] iArr = this.f8730l;
            int i11 = iArr[i10 - 2];
            int i12 = ((i11 >>> 10) ^ (((i11 >>> 17) | (i11 << 15)) ^ ((i11 >>> 19) | (i11 << 13)))) + iArr[i10 - 7];
            int i13 = iArr[i10 - 15];
            iArr[i10] = i12 + ((i13 >>> 3) ^ (((i13 >>> 7) | (i13 << 25)) ^ ((i13 >>> 18) | (i13 << 14)))) + iArr[i10 - 16];
        }
        int i14 = this.f8724d;
        int i15 = this.f8725e;
        int i16 = this.f8726f;
        int i17 = this.g;
        int i18 = this.f8727h;
        int i19 = this.i;
        int i20 = this.f8728j;
        int i21 = this.f8729k;
        int i22 = 0;
        int i23 = 0;
        while (i22 < 8) {
            int o4 = o(i18) + ((i19 & i18) ^ ((~i18) & i20));
            int[] iArr2 = f8723n;
            int i24 = o4 + iArr2[i23] + this.f8730l[i23] + i21;
            int i25 = i17 + i24;
            int n10 = n(i14) + (((i14 ^ i15) & i16) | (i14 & i15)) + i24;
            int i26 = i23 + 1;
            int o10 = o(i25) + (((~i25) & i19) ^ (i18 & i25)) + iArr2[i26] + this.f8730l[i26] + i20;
            int i27 = i16 + o10;
            int n11 = n(n10) + ((n10 & i14) | ((n10 ^ i14) & i15)) + o10;
            int i28 = i26 + 1;
            int o11 = o(i27) + ((i25 & i27) ^ ((~i27) & i18)) + iArr2[i28] + this.f8730l[i28] + i19;
            int i29 = i15 + o11;
            int n12 = n(n11) + ((n11 & n10) | ((n11 ^ n10) & i14)) + o11;
            int i30 = i28 + 1;
            int o12 = o(i29) + ((i27 & i29) ^ ((~i29) & i25)) + iArr2[i30] + this.f8730l[i30] + i18;
            int i31 = i14 + o12;
            int n13 = n(n12) + ((n12 & n11) | ((n12 ^ n11) & n10)) + o12;
            int i32 = i30 + 1;
            int o13 = o(i31) + ((i29 & i31) ^ ((~i31) & i27)) + iArr2[i32] + this.f8730l[i32] + i25;
            i21 = n10 + o13;
            i17 = n(n13) + ((n13 & n12) | ((n13 ^ n12) & n11)) + o13;
            int i33 = i32 + 1;
            int o14 = o(i21) + ((i31 & i21) ^ ((~i21) & i29)) + iArr2[i33] + this.f8730l[i33] + i27;
            int i34 = n11 + o14;
            i16 = n(i17) + ((i17 & n13) | ((i17 ^ n13) & n12)) + o14;
            int i35 = i33 + 1;
            int o15 = o(i34) + ((i21 & i34) ^ ((~i34) & i31)) + iArr2[i35] + this.f8730l[i35] + i29;
            i19 = n12 + o15;
            i15 = n(i16) + ((i16 & i17) | ((i16 ^ i17) & n13)) + o15;
            int i36 = i35 + 1;
            int o16 = o(i19) + ((i34 & i19) ^ ((~i19) & i21)) + iArr2[i36] + this.f8730l[i36] + i31;
            i18 = n13 + o16;
            i14 = n(i15) + ((i15 & i16) | ((i15 ^ i16) & i17)) + o16;
            i23 = i36 + 1;
            i22++;
            i20 = i34;
        }
        this.f8724d += i14;
        this.f8725e += i15;
        this.f8726f += i16;
        this.g += i17;
        this.f8727h += i18;
        this.i += i19;
        this.f8728j += i20;
        this.f8729k += i21;
        this.f8731m = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            this.f8730l[i37] = 0;
        }
    }

    public final void l(long j10) {
        if (this.f8731m > 14) {
            k();
        }
        int[] iArr = this.f8730l;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) (j10 & -1);
    }

    public final void m(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i12 + 1] & 255) | (bArr[i10] << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
        int[] iArr = this.f8730l;
        int i14 = this.f8731m;
        iArr[i14] = i13;
        int i15 = i14 + 1;
        this.f8731m = i15;
        if (i15 == 16) {
            k();
        }
    }

    public final void p(g gVar) {
        i(gVar);
        this.f8724d = gVar.f8724d;
        this.f8725e = gVar.f8725e;
        this.f8726f = gVar.f8726f;
        this.g = gVar.g;
        this.f8727h = gVar.f8727h;
        this.i = gVar.i;
        this.f8728j = gVar.f8728j;
        this.f8729k = gVar.f8729k;
        int[] iArr = gVar.f8730l;
        System.arraycopy(iArr, 0, this.f8730l, 0, iArr.length);
        this.f8731m = gVar.f8731m;
    }

    public final void reset() {
        super.reset();
        this.f8724d = 1779033703;
        this.f8725e = -1150833019;
        this.f8726f = 1013904242;
        this.g = -1521486534;
        this.f8727h = 1359893119;
        this.i = -1694144372;
        this.f8728j = 528734635;
        this.f8729k = 1541459225;
        this.f8731m = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f8730l;
            if (i10 != iArr.length) {
                iArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
