package ag;

import java.io.IOException;

public final class d1 extends y {
    public d1(boolean z, int i, d dVar) {
        super(z, i, dVar);
    }

    public final void k(q qVar, boolean z) throws IOException {
        s p10 = this.f466c.d().p();
        qVar.m(z, (this.f465b || p10.o()) ? 160 : 128, this.f464a);
        if (this.f465b) {
            qVar.j(p10.l());
        }
        p10.k(qVar.b(), this.f465b);
    }

    public final int l() throws IOException {
        int l10 = this.f466c.d().p().l();
        if (this.f465b) {
            return v1.a(l10) + v1.b(this.f464a) + l10;
        }
        return v1.b(this.f464a) + (l10 - 1);
    }

    public final boolean o() {
        return this.f465b || this.f466c.d().p().o();
    }

    public final s p() {
        return this;
    }

    public final s q() {
        return this;
    }
}
