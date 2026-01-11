package ag;

import java.io.IOException;

public final class g extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public Throwable f396a;

    public g(String str) {
        super(str);
    }

    public g(String str, Throwable th2) {
        super(str);
        this.f396a = th2;
    }

    public final Throwable getCause() {
        return this.f396a;
    }
}
