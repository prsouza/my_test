package mg;

import android.support.v4.media.b;
import xh.d;

public final class e extends b {

    /* renamed from: d  reason: collision with root package name */
    public int f8709d;

    /* renamed from: e  reason: collision with root package name */
    public int f8710e;

    /* renamed from: f  reason: collision with root package name */
    public int f8711f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public int f8712h;
    public int[] i = new int[80];

    /* renamed from: j  reason: collision with root package name */
    public int f8713j;

    public e() {
        reset();
    }

    public e(e eVar) {
        super(eVar);
        n(eVar);
    }

    public final d a() {
        return new e(this);
    }

    public final int b(byte[] bArr, int i10) {
        j();
        b.I0(this.f8709d, bArr, i10);
        b.I0(this.f8710e, bArr, i10 + 4);
        b.I0(this.f8711f, bArr, i10 + 8);
        b.I0(this.g, bArr, i10 + 12);
        b.I0(this.f8712h, bArr, i10 + 16);
        reset();
        return 20;
    }

    public final String c() {
        return "SHA-1";
    }

    public final int d() {
        return 20;
    }

    public final void e(d dVar) {
        e eVar = (e) dVar;
        i(eVar);
        n(eVar);
    }

    public final void k() {
        for (int i10 = 16; i10 < 80; i10++) {
            int[] iArr = this.i;
            int i11 = ((iArr[i10 - 3] ^ iArr[i10 - 8]) ^ iArr[i10 - 14]) ^ iArr[i10 - 16];
            iArr[i10] = (i11 >>> 31) | (i11 << 1);
        }
        int i12 = this.f8709d;
        int i13 = this.f8710e;
        int i14 = this.f8711f;
        int i15 = this.g;
        int i16 = this.f8712h;
        int i17 = 0;
        int i18 = 0;
        while (i17 < 4) {
            int i19 = ((i12 << 5) | (i12 >>> 27)) + ((i14 & i13) | ((~i13) & i15));
            int[] iArr2 = this.i;
            int i20 = i18 + 1;
            int a10 = androidx.appcompat.widget.d.a(i19, iArr2[i18], 1518500249, i16);
            int i21 = (i13 >>> 2) | (i13 << 30);
            int i22 = i20 + 1;
            int a11 = androidx.appcompat.widget.d.a(((a10 << 5) | (a10 >>> 27)) + ((i21 & i12) | ((~i12) & i14)), iArr2[i20], 1518500249, i15);
            int i23 = (i12 >>> 2) | (i12 << 30);
            int i24 = i22 + 1;
            int a12 = androidx.appcompat.widget.d.a(((a11 << 5) | (a11 >>> 27)) + ((i23 & a10) | ((~a10) & i21)), iArr2[i22], 1518500249, i14);
            i16 = (a10 >>> 2) | (a10 << 30);
            int i25 = i24 + 1;
            i13 = androidx.appcompat.widget.d.a(((a12 << 5) | (a12 >>> 27)) + ((i16 & a11) | ((~a11) & i23)), iArr2[i24], 1518500249, i21);
            i15 = (a11 >>> 2) | (a11 << 30);
            i12 = androidx.appcompat.widget.d.a(((i13 << 5) | (i13 >>> 27)) + ((i15 & a12) | ((~a12) & i16)), iArr2[i25], 1518500249, i23);
            i14 = (a12 >>> 2) | (a12 << 30);
            i17++;
            i18 = i25 + 1;
        }
        int i26 = 0;
        while (i26 < 4) {
            int[] iArr3 = this.i;
            int i27 = i18 + 1;
            int a13 = androidx.appcompat.widget.d.a(((i12 << 5) | (i12 >>> 27)) + ((i13 ^ i14) ^ i15), iArr3[i18], 1859775393, i16);
            int i28 = (i13 >>> 2) | (i13 << 30);
            int i29 = i27 + 1;
            int a14 = androidx.appcompat.widget.d.a(((a13 << 5) | (a13 >>> 27)) + ((i12 ^ i28) ^ i14), iArr3[i27], 1859775393, i15);
            int i30 = (i12 >>> 2) | (i12 << 30);
            int i31 = i29 + 1;
            int a15 = androidx.appcompat.widget.d.a(((a14 << 5) | (a14 >>> 27)) + ((a13 ^ i30) ^ i28), iArr3[i29], 1859775393, i14);
            i16 = (a13 >>> 2) | (a13 << 30);
            int i32 = i31 + 1;
            i13 = androidx.appcompat.widget.d.a(((a15 << 5) | (a15 >>> 27)) + ((a14 ^ i16) ^ i30), iArr3[i31], 1859775393, i28);
            i15 = (a14 >>> 2) | (a14 << 30);
            i12 = androidx.appcompat.widget.d.a(((i13 << 5) | (i13 >>> 27)) + ((a15 ^ i15) ^ i16), iArr3[i32], 1859775393, i30);
            i14 = (a15 >>> 2) | (a15 << 30);
            i26++;
            i18 = i32 + 1;
        }
        int i33 = 0;
        while (i33 < 4) {
            int i34 = i18 + 1;
            int a16 = androidx.appcompat.widget.d.a(o(i13, i14, i15) + ((i12 << 5) | (i12 >>> 27)), this.i[i18], -1894007588, i16);
            int i35 = (i13 >>> 2) | (i13 << 30);
            int i36 = i34 + 1;
            int a17 = androidx.appcompat.widget.d.a(o(i12, i35, i14) + ((a16 << 5) | (a16 >>> 27)), this.i[i34], -1894007588, i15);
            int i37 = (i12 >>> 2) | (i12 << 30);
            int i38 = i36 + 1;
            int a18 = androidx.appcompat.widget.d.a(o(a16, i37, i35) + ((a17 << 5) | (a17 >>> 27)), this.i[i36], -1894007588, i14);
            i16 = (a16 >>> 2) | (a16 << 30);
            int i39 = i38 + 1;
            i13 = androidx.appcompat.widget.d.a(o(a17, i16, i37) + ((a18 << 5) | (a18 >>> 27)), this.i[i38], -1894007588, i35);
            i15 = (a17 >>> 2) | (a17 << 30);
            i12 = androidx.appcompat.widget.d.a(o(a18, i15, i16) + ((i13 << 5) | (i13 >>> 27)), this.i[i39], -1894007588, i37);
            i14 = (a18 >>> 2) | (a18 << 30);
            i33++;
            i18 = i39 + 1;
        }
        int i40 = 0;
        while (i40 <= 3) {
            int[] iArr4 = this.i;
            int i41 = i18 + 1;
            int a19 = androidx.appcompat.widget.d.a(((i12 << 5) | (i12 >>> 27)) + ((i13 ^ i14) ^ i15), iArr4[i18], -899497514, i16);
            int i42 = (i13 >>> 2) | (i13 << 30);
            int i43 = i41 + 1;
            int a20 = androidx.appcompat.widget.d.a(((a19 << 5) | (a19 >>> 27)) + ((i12 ^ i42) ^ i14), iArr4[i41], -899497514, i15);
            int i44 = (i12 >>> 2) | (i12 << 30);
            int i45 = i43 + 1;
            int a21 = androidx.appcompat.widget.d.a(((a20 << 5) | (a20 >>> 27)) + ((a19 ^ i44) ^ i42), iArr4[i43], -899497514, i14);
            i16 = (a19 >>> 2) | (a19 << 30);
            int i46 = i45 + 1;
            i13 = androidx.appcompat.widget.d.a(((a21 << 5) | (a21 >>> 27)) + ((a20 ^ i16) ^ i44), iArr4[i45], -899497514, i42);
            i15 = (a20 >>> 2) | (a20 << 30);
            i12 = androidx.appcompat.widget.d.a(((i13 << 5) | (i13 >>> 27)) + ((a21 ^ i15) ^ i16), iArr4[i46], -899497514, i44);
            i14 = (a21 >>> 2) | (a21 << 30);
            i40++;
            i18 = i46 + 1;
        }
        this.f8709d += i12;
        this.f8710e += i13;
        this.f8711f += i14;
        this.g += i15;
        this.f8712h += i16;
        this.f8713j = 0;
        for (int i47 = 0; i47 < 16; i47++) {
            this.i[i47] = 0;
        }
    }

    public final void l(long j10) {
        if (this.f8713j > 14) {
            k();
        }
        int[] iArr = this.i;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    public final void m(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i12 + 1] & 255) | (bArr[i10] << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
        int[] iArr = this.i;
        int i14 = this.f8713j;
        iArr[i14] = i13;
        int i15 = i14 + 1;
        this.f8713j = i15;
        if (i15 == 16) {
            k();
        }
    }

    public final void n(e eVar) {
        this.f8709d = eVar.f8709d;
        this.f8710e = eVar.f8710e;
        this.f8711f = eVar.f8711f;
        this.g = eVar.g;
        this.f8712h = eVar.f8712h;
        int[] iArr = eVar.i;
        System.arraycopy(iArr, 0, this.i, 0, iArr.length);
        this.f8713j = eVar.f8713j;
    }

    public final int o(int i10, int i11, int i12) {
        return (i10 & i12) | (i10 & i11) | (i11 & i12);
    }

    public final void reset() {
        super.reset();
        this.f8709d = 1732584193;
        this.f8710e = -271733879;
        this.f8711f = -1732584194;
        this.g = 271733878;
        this.f8712h = -1009589776;
        this.f8713j = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.i;
            if (i10 != iArr.length) {
                iArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
