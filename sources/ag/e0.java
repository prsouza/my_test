package ag;

import a.a;
import java.io.IOException;
import java.io.InputStream;

public final class e0 implements p {

    /* renamed from: a  reason: collision with root package name */
    public x f390a;

    public e0(x xVar) {
        this.f390a = xVar;
    }

    public final InputStream b() {
        return new l0(this.f390a);
    }

    public final s d() {
        try {
            return e();
        } catch (IOException e10) {
            StringBuilder d10 = a.d("IOException converting stream to byte array: ");
            d10.append(e10.getMessage());
            throw new r(d10.toString(), e10);
        }
    }

    public final s e() throws IOException {
        return new d0(zh.a.a(b()));
    }
}
