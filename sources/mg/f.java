package mg;

import android.support.v4.media.b;
import xh.d;

public final class f extends b {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f8714n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d  reason: collision with root package name */
    public int f8715d;

    /* renamed from: e  reason: collision with root package name */
    public int f8716e;

    /* renamed from: f  reason: collision with root package name */
    public int f8717f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public int f8718h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f8719j;

    /* renamed from: k  reason: collision with root package name */
    public int f8720k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f8721l = new int[64];

    /* renamed from: m  reason: collision with root package name */
    public int f8722m;

    public f() {
        reset();
    }

    public f(f fVar) {
        super(fVar);
        q(fVar);
    }

    public final d a() {
        return new f(this);
    }

    public final int b(byte[] bArr, int i10) {
        j();
        b.I0(this.f8715d, bArr, i10);
        b.I0(this.f8716e, bArr, i10 + 4);
        b.I0(this.f8717f, bArr, i10 + 8);
        b.I0(this.g, bArr, i10 + 12);
        b.I0(this.f8718h, bArr, i10 + 16);
        b.I0(this.i, bArr, i10 + 20);
        b.I0(this.f8719j, bArr, i10 + 24);
        reset();
        return 28;
    }

    public final String c() {
        return "SHA-224";
    }

    public final int d() {
        return 28;
    }

    public final void e(d dVar) {
        q((f) dVar);
    }

    public final void k() {
        for (int i10 = 16; i10 <= 63; i10++) {
            int[] iArr = this.f8721l;
            int i11 = iArr[i10 - 2];
            int i12 = ((i11 >>> 10) ^ (((i11 >>> 17) | (i11 << 15)) ^ ((i11 >>> 19) | (i11 << 13)))) + iArr[i10 - 7];
            int i13 = iArr[i10 - 15];
            iArr[i10] = i12 + ((i13 >>> 3) ^ (((i13 >>> 7) | (i13 << 25)) ^ ((i13 >>> 18) | (i13 << 14)))) + iArr[i10 - 16];
        }
        int i14 = this.f8715d;
        int i15 = this.f8716e;
        int i16 = this.f8717f;
        int i17 = this.g;
        int i18 = this.f8718h;
        int i19 = this.i;
        int i20 = this.f8719j;
        int i21 = this.f8720k;
        int i22 = 0;
        int i23 = 0;
        while (i22 < 8) {
            int p10 = p(i18) + ((i19 & i18) ^ ((~i18) & i20));
            int[] iArr2 = f8714n;
            int i24 = p10 + iArr2[i23] + this.f8721l[i23] + i21;
            int i25 = i17 + i24;
            int n10 = n(i14, i15, i16) + o(i14) + i24;
            int i26 = i23 + 1;
            int p11 = p(i25) + (((~i25) & i19) ^ (i18 & i25)) + iArr2[i26] + this.f8721l[i26] + i20;
            int i27 = i16 + p11;
            int n11 = n(n10, i14, i15) + o(n10) + p11;
            int i28 = i26 + 1;
            int p12 = p(i27) + ((i25 & i27) ^ ((~i27) & i18)) + iArr2[i28] + this.f8721l[i28] + i19;
            int i29 = i15 + p12;
            int n12 = n(n11, n10, i14) + o(n11) + p12;
            int i30 = i28 + 1;
            int p13 = p(i29) + ((i27 & i29) ^ ((~i29) & i25)) + iArr2[i30] + this.f8721l[i30] + i18;
            int i31 = i14 + p13;
            int n13 = n(n12, n11, n10) + o(n12) + p13;
            int i32 = i30 + 1;
            int p14 = p(i31) + ((i29 & i31) ^ ((~i31) & i27)) + iArr2[i32] + this.f8721l[i32] + i25;
            int i33 = n10 + p14;
            int n14 = p14 + n(n13, n12, n11) + o(n13);
            int i34 = i32 + 1;
            int p15 = p(i33) + ((i31 & i33) ^ ((~i33) & i29)) + iArr2[i34] + this.f8721l[i34] + i27;
            i20 = n11 + p15;
            i16 = n(n14, n13, n12) + o(n14) + p15;
            int i35 = i34 + 1;
            int p16 = p(i20) + ((i33 & i20) ^ ((~i20) & i31)) + iArr2[i35] + this.f8721l[i35] + i29;
            int i36 = n12 + p16;
            int n15 = p16 + n(i16, n14, n13) + o(i16);
            int i37 = i35 + 1;
            int p17 = p(i36) + ((i20 & i36) ^ ((~i36) & i33)) + iArr2[i37] + this.f8721l[i37] + i31;
            int i38 = n13 + p17;
            int n16 = n(n15, i16, n14) + o(n15) + p17;
            i23 = i37 + 1;
            i22++;
            i21 = i33;
            i17 = n14;
            int i39 = n15;
            i18 = i38;
            i14 = n16;
            i19 = i36;
            i15 = i39;
        }
        this.f8715d += i14;
        this.f8716e += i15;
        this.f8717f += i16;
        this.g += i17;
        this.f8718h += i18;
        this.i += i19;
        this.f8719j += i20;
        this.f8720k += i21;
        this.f8722m = 0;
        for (int i40 = 0; i40 < 16; i40++) {
            this.f8721l[i40] = 0;
        }
    }

    public final void l(long j10) {
        if (this.f8722m > 14) {
            k();
        }
        int[] iArr = this.f8721l;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) (j10 & -1);
    }

    public final void m(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i12 + 1] & 255) | (bArr[i10] << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
        int[] iArr = this.f8721l;
        int i14 = this.f8722m;
        iArr[i14] = i13;
        int i15 = i14 + 1;
        this.f8722m = i15;
        if (i15 == 16) {
            k();
        }
    }

    public final int n(int i10, int i11, int i12) {
        return ((i10 & i12) ^ (i10 & i11)) ^ (i11 & i12);
    }

    public final int o(int i10) {
        return ((i10 << 10) | (i10 >>> 22)) ^ (((i10 >>> 2) | (i10 << 30)) ^ ((i10 >>> 13) | (i10 << 19)));
    }

    public final int p(int i10) {
        return ((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)));
    }

    public final void q(f fVar) {
        i(fVar);
        this.f8715d = fVar.f8715d;
        this.f8716e = fVar.f8716e;
        this.f8717f = fVar.f8717f;
        this.g = fVar.g;
        this.f8718h = fVar.f8718h;
        this.i = fVar.i;
        this.f8719j = fVar.f8719j;
        this.f8720k = fVar.f8720k;
        int[] iArr = fVar.f8721l;
        System.arraycopy(iArr, 0, this.f8721l, 0, iArr.length);
        this.f8722m = fVar.f8722m;
    }

    public final void reset() {
        super.reset();
        this.f8715d = -1056596264;
        this.f8716e = 914150663;
        this.f8717f = 812702999;
        this.g = -150054599;
        this.f8718h = -4191439;
        this.i = 1750603025;
        this.f8719j = 1694076839;
        this.f8720k = -1090891868;
        this.f8722m = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f8721l;
            if (i10 != iArr.length) {
                iArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
