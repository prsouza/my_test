package ag;

import a.a;
import java.io.IOException;
import java.io.InputStream;

public final class x0 implements p {

    /* renamed from: a  reason: collision with root package name */
    public p1 f463a;

    public x0(p1 p1Var) {
        this.f463a = p1Var;
    }

    public final InputStream b() {
        return this.f463a;
    }

    public final s d() {
        try {
            return new w0(this.f463a.c());
        } catch (IOException e10) {
            StringBuilder d10 = a.d("IOException converting stream to byte array: ");
            d10.append(e10.getMessage());
            throw new r(d10.toString(), e10);
        }
    }

    public final s e() throws IOException {
        return new w0(this.f463a.c());
    }
}
