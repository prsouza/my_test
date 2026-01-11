package ag;

import java.io.IOException;

public final class b1 extends w {

    /* renamed from: c  reason: collision with root package name */
    public int f376c = -1;

    public b1() {
    }

    public b1(d[] dVarArr) {
        super(true, dVarArr);
    }

    public final void k(q qVar, boolean z) throws IOException {
        if (z) {
            qVar.d(49);
        }
        y0 b10 = qVar.b();
        int length = this.f458a.length;
        int i = 0;
        if (this.f376c >= 0 || length > 16) {
            qVar.j(u());
            while (i < length) {
                this.f458a[i].d().p().k(b10, true);
                i++;
            }
            return;
        }
        s[] sVarArr = new s[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            s p10 = this.f458a[i11].d().p();
            sVarArr[i11] = p10;
            i10 += p10.l();
        }
        this.f376c = i10;
        qVar.j(i10);
        while (i < length) {
            sVarArr[i].k(b10, true);
            i++;
        }
    }

    public final int l() throws IOException {
        int u10 = u();
        return v1.a(u10) + 1 + u10;
    }

    public final s p() {
        return this.f459b ? this : super.p();
    }

    public final s q() {
        return this;
    }

    public final int u() throws IOException {
        if (this.f376c < 0) {
            int i = 0;
            for (d d10 : this.f458a) {
                i += d10.d().p().l();
            }
            this.f376c = i;
        }
        return this.f376c;
    }
}
