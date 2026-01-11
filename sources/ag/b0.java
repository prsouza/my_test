package ag;

import java.io.IOException;

public final class b0 implements d, q1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f374a;

    /* renamed from: b  reason: collision with root package name */
    public final x f375b;

    public b0(int i, x xVar) {
        this.f374a = i;
        this.f375b = xVar;
    }

    public final s d() {
        try {
            return e();
        } catch (IOException e10) {
            throw new r(e10.getMessage(), e10);
        }
    }

    public final s e() throws IOException {
        return new a0(this.f374a, this.f375b.c());
    }
}
