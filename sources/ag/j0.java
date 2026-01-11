package ag;

import a.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Objects;

public final class j0 extends y {
    public j0(boolean z, int i, d dVar) {
        super(z, i, dVar);
    }

    public final void k(q qVar, boolean z) throws IOException {
        Enumeration enumeration;
        qVar.m(z, 160, this.f464a);
        qVar.d(128);
        if (!this.f465b) {
            d dVar = this.f466c;
            if (dVar instanceof o) {
                enumeration = dVar instanceof d0 ? ((d0) dVar).t() : new d0(((o) dVar).f430a).t();
            } else if (dVar instanceof t) {
                enumeration = ((t) dVar).t();
            } else if (dVar instanceof w) {
                w wVar = (w) dVar;
                Objects.requireNonNull(wVar);
                enumeration = new v(wVar);
            } else {
                StringBuilder d10 = a.d("not implemented: ");
                d10.append(this.f466c.getClass().getName());
                throw new g(d10.toString());
            }
            qVar.f(enumeration);
        } else {
            qVar.l(this.f466c.d(), true);
        }
        qVar.d(0);
        qVar.d(0);
    }

    public final int l() throws IOException {
        int l10 = this.f466c.d().l();
        if (this.f465b) {
            return v1.a(l10) + v1.b(this.f464a) + l10;
        }
        return v1.b(this.f464a) + (l10 - 1);
    }

    public final boolean o() {
        return this.f465b || this.f466c.d().o();
    }
}
