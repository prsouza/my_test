package ag;

import java.io.IOException;

public final class k0 implements d, q1 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f414a;

    /* renamed from: b  reason: collision with root package name */
    public int f415b;

    /* renamed from: c  reason: collision with root package name */
    public x f416c;

    public k0(boolean z, int i, x xVar) {
        this.f414a = z;
        this.f415b = i;
        this.f416c = xVar;
    }

    public final s d() {
        try {
            return e();
        } catch (IOException e10) {
            throw new r(e10.getMessage());
        }
    }

    public final s e() throws IOException {
        return this.f416c.b(this.f414a, this.f415b);
    }
}
