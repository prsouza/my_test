package ag;

import java.io.IOException;

public final class n1 extends w {

    /* renamed from: c  reason: collision with root package name */
    public int f429c = -1;

    public n1() {
    }

    public n1(d dVar) {
        super(dVar);
    }

    public n1(e eVar) {
        super(eVar);
    }

    public n1(boolean z, d[] dVarArr) {
        super(z, dVarArr);
    }

    public final void k(q qVar, boolean z) throws IOException {
        if (z) {
            qVar.d(49);
        }
        q c10 = qVar.c();
        int length = this.f458a.length;
        int i = 0;
        if (this.f429c >= 0 || length > 16) {
            qVar.j(u());
            while (i < length) {
                c10.l(this.f458a[i].d(), true);
                i++;
            }
            return;
        }
        s[] sVarArr = new s[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            s q10 = this.f458a[i11].d().q();
            sVarArr[i11] = q10;
            i10 += q10.l();
        }
        this.f429c = i10;
        qVar.j(i10);
        while (i < length) {
            c10.l(sVarArr[i], true);
            i++;
        }
    }

    public final int l() throws IOException {
        int u10 = u();
        return v1.a(u10) + 1 + u10;
    }

    public final s q() {
        return this;
    }

    public final int u() throws IOException {
        if (this.f429c < 0) {
            int i = 0;
            for (d d10 : this.f458a) {
                i += d10.d().q().l();
            }
            this.f429c = i;
        }
        return this.f429c;
    }
}
