package uf;

import e6.e;
import java.io.IOException;

public abstract class k implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f11961a;

    public k(b0 b0Var) {
        e.D(b0Var, "delegate");
        this.f11961a = b0Var;
    }

    public void close() throws IOException {
        this.f11961a.close();
    }

    public final c0 d() {
        return this.f11961a.d();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f11961a + ')';
    }
}
