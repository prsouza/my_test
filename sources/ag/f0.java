package ag;

import java.io.IOException;

public final class f0 extends t {
    public f0() {
    }

    public f0(e eVar) {
        super(eVar);
    }

    public final void k(q qVar, boolean z) throws IOException {
        qVar.i(z, 48, this.f445a);
    }

    public final int l() throws IOException {
        int i = 0;
        for (d d10 : this.f445a) {
            i += d10.d().l();
        }
        return i + 2 + 2;
    }
}
