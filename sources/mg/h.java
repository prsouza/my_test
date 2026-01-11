package mg;

import android.support.v4.media.b;
import xh.d;

public final class h extends d {
    public h() {
    }

    public h(h hVar) {
        super(hVar);
    }

    public final d a() {
        return new h(this);
    }

    public final int b(byte[] bArr, int i) {
        n();
        b.h1(this.f8701e, bArr, i);
        b.h1(this.f8702f, bArr, i + 8);
        b.h1(this.g, bArr, i + 16);
        b.h1(this.f8703h, bArr, i + 24);
        b.h1(this.i, bArr, i + 32);
        b.h1(this.f8704j, bArr, i + 40);
        reset();
        return 48;
    }

    public final String c() {
        return "SHA-384";
    }

    public final int d() {
        return 48;
    }

    public final void e(d dVar) {
        m((h) dVar);
    }

    public final void reset() {
        super.reset();
        this.f8701e = -3766243637369397544L;
        this.f8702f = 7105036623409894663L;
        this.g = -7973340178411365097L;
        this.f8703h = 1526699215303891257L;
        this.i = 7436329637833083697L;
        this.f8704j = -8163818279084223215L;
        this.f8705k = -2662702644619276377L;
        this.f8706l = 5167115440072839076L;
    }
}
