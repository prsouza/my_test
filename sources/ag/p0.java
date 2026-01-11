package ag;

import java.io.IOException;

public final class p0 implements d, q1 {

    /* renamed from: a  reason: collision with root package name */
    public x f431a;

    public p0(x xVar) {
        this.f431a = xVar;
    }

    public final s d() {
        try {
            return e();
        } catch (IOException e10) {
            throw new r("unable to get DER object", e10);
        } catch (IllegalArgumentException e11) {
            throw new r("unable to get DER object", e11);
        }
    }

    public final s e() throws IOException {
        try {
            return new j1(this.f431a.c());
        } catch (IllegalArgumentException e10) {
            throw new g(e10.getMessage(), e10);
        }
    }
}
