package me;

import e6.e;
import ge.x0;
import java.util.Objects;
import java.util.concurrent.Executor;
import le.f;
import le.s;
import pd.h;
import y.c;

public final class b extends x0 implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static final b f8575b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final f f8576c;

    static {
        k kVar = k.f8589b;
        int i = s.f8266a;
        if (64 >= i) {
            i = 64;
        }
        boolean z = false;
        int p02 = c.p0("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        Objects.requireNonNull(kVar);
        if (p02 >= 1) {
            z = true;
        }
        if (z) {
            f8576c = new f(kVar, p02);
            return;
        }
        throw new IllegalArgumentException(e.a0("Expected positive parallelism level, but got ", Integer.valueOf(p02)).toString());
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public final void execute(Runnable runnable) {
        p0(h.f9881a, runnable);
    }

    public final void p0(pd.f fVar, Runnable runnable) {
        f8576c.p0(fVar, runnable);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
