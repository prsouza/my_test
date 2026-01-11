package uf;

import e6.e;
import java.io.IOException;

public abstract class j implements z {

    /* renamed from: a  reason: collision with root package name */
    public final z f11960a;

    public j(z zVar) {
        e.D(zVar, "delegate");
        this.f11960a = zVar;
    }

    public void close() throws IOException {
        this.f11960a.close();
    }

    public final c0 d() {
        return this.f11960a.d();
    }

    public void flush() throws IOException {
        this.f11960a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f11960a + ')';
    }
}
