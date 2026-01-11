package ag;

import java.io.IOException;

public final class h0 extends w {
    public h0(d dVar) {
        super(dVar);
    }

    public h0(e eVar) {
        super(eVar);
    }

    public h0(d[] dVarArr) {
        super(false, dVarArr);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.i(z, 49, this.f458a);
    }

    public final int l() throws IOException {
        int i = 0;
        for (d d10 : this.f458a) {
            i += d10.d().l();
        }
        return i + 2 + 2;
    }
}
