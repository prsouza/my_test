package mg;

import android.support.v4.media.b;
import xh.d;

public final class j extends d {
    public j() {
    }

    public j(j jVar) {
        super(jVar);
    }

    public final d a() {
        return new j(this);
    }

    public final int b(byte[] bArr, int i) {
        n();
        b.h1(this.f8701e, bArr, i);
        b.h1(this.f8702f, bArr, i + 8);
        b.h1(this.g, bArr, i + 16);
        b.h1(this.f8703h, bArr, i + 24);
        b.h1(this.i, bArr, i + 32);
        b.h1(this.f8704j, bArr, i + 40);
        b.h1(this.f8705k, bArr, i + 48);
        b.h1(this.f8706l, bArr, i + 56);
        reset();
        return 64;
    }

    public final String c() {
        return "SHA-512";
    }

    public final int d() {
        return 64;
    }

    public final void e(d dVar) {
        m((j) dVar);
    }

    public final void reset() {
        super.reset();
        this.f8701e = 7640891576956012808L;
        this.f8702f = -4942790177534073029L;
        this.g = 4354685564936845355L;
        this.f8703h = -6534734903238641935L;
        this.i = 5840696475078001361L;
        this.f8704j = -7276294671716946913L;
        this.f8705k = 2270897969802886507L;
        this.f8706l = 6620516959819538809L;
    }
}
