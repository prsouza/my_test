package androidx.lifecycle;

import ad.c;
import e6.e;
import ge.d0;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import pd.f;

public final class g implements Closeable, d0 {

    /* renamed from: a  reason: collision with root package name */
    public final f f2112a;

    public g(f fVar) {
        e.D(fVar, "context");
        this.f2112a = fVar;
    }

    public final void close() {
        c.y(this.f2112a, (CancellationException) null);
    }

    public final f f() {
        return this.f2112a;
    }
}
