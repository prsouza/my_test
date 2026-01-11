package ag;

import java.io.IOException;

public final class m1 extends t {

    /* renamed from: b  reason: collision with root package name */
    public int f423b = -1;

    public m1() {
    }

    public m1(e eVar) {
        super(eVar);
    }

    public m1(d[] dVarArr) {
        super(dVarArr);
    }

    public final void k(q qVar, boolean z) throws IOException {
        if (z) {
            qVar.d(48);
        }
        q c10 = qVar.c();
        int length = this.f445a.length;
        int i = 0;
        if (this.f423b >= 0 || length > 16) {
            qVar.j(v());
            while (i < length) {
                c10.l(this.f445a[i].d(), true);
                i++;
            }
            return;
        }
        s[] sVarArr = new s[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            s q10 = this.f445a[i11].d().q();
            sVarArr[i11] = q10;
            i10 += q10.l();
        }
        this.f423b = i10;
        qVar.j(i10);
        while (i < length) {
            c10.l(sVarArr[i], true);
            i++;
        }
    }

    public final int l() throws IOException {
        int v10 = v();
        return v1.a(v10) + 1 + v10;
    }

    public final s q() {
        return this;
    }

    public final int v() throws IOException {
        if (this.f423b < 0) {
            int i = 0;
            for (d d10 : this.f445a) {
                i += d10.d().q().l();
            }
            this.f423b = i;
        }
        return this.f423b;
    }
}
