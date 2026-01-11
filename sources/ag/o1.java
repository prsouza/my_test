package ag;

import java.io.IOException;

public final class o1 extends y {
    public o1(boolean z, int i, d dVar) {
        super(z, i, dVar);
    }

    public final void k(q qVar, boolean z) throws IOException {
        s q10 = this.f466c.d().q();
        qVar.m(z, (this.f465b || q10.o()) ? 160 : 128, this.f464a);
        if (this.f465b) {
            qVar.j(q10.l());
        }
        qVar.c().l(q10, this.f465b);
    }

    public final int l() throws IOException {
        int l10 = this.f466c.d().q().l();
        if (this.f465b) {
            return v1.a(l10) + v1.b(this.f464a) + l10;
        }
        return v1.b(this.f464a) + (l10 - 1);
    }

    public final boolean o() {
        return this.f465b || this.f466c.d().q().o();
    }

    public final s q() {
        return this;
    }
}
