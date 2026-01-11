package uf;

import e6.e;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class l extends c0 {

    /* renamed from: e  reason: collision with root package name */
    public c0 f11962e;

    public l(c0 c0Var) {
        e.D(c0Var, "delegate");
        this.f11962e = c0Var;
    }

    public final c0 a() {
        return this.f11962e.a();
    }

    public final c0 b() {
        return this.f11962e.b();
    }

    public final long c() {
        return this.f11962e.c();
    }

    public final c0 d(long j10) {
        return this.f11962e.d(j10);
    }

    public final boolean e() {
        return this.f11962e.e();
    }

    public final void f() throws IOException {
        this.f11962e.f();
    }

    public final c0 g(long j10) {
        e.D(TimeUnit.MILLISECONDS, "unit");
        return this.f11962e.g(j10);
    }
}
