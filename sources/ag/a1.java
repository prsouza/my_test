package ag;

import java.io.IOException;

public final class a1 extends t {

    /* renamed from: b  reason: collision with root package name */
    public int f370b = -1;

    public a1(e eVar) {
        super(eVar);
    }

    public a1(d[] dVarArr) {
        super(dVarArr);
    }

    public final void k(q qVar, boolean z) throws IOException {
        if (z) {
            qVar.d(48);
        }
        y0 b10 = qVar.b();
        int length = this.f445a.length;
        int i = 0;
        if (this.f370b >= 0 || length > 16) {
            qVar.j(v());
            while (i < length) {
                this.f445a[i].d().p().k(b10, true);
                i++;
            }
            return;
        }
        s[] sVarArr = new s[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            s p10 = this.f445a[i11].d().p();
            sVarArr[i11] = p10;
            i10 += p10.l();
        }
        this.f370b = i10;
        qVar.j(i10);
        while (i < length) {
            sVarArr[i].k(b10, true);
            i++;
        }
    }

    public final int l() throws IOException {
        int v10 = v();
        return v1.a(v10) + 1 + v10;
    }

    public final s p() {
        return this;
    }

    public final s q() {
        return this;
    }

    public final int v() throws IOException {
        if (this.f370b < 0) {
            int i = 0;
            for (d d10 : this.f445a) {
                i += d10.d().p().l();
            }
            this.f370b = i;
        }
        return this.f370b;
    }
}
