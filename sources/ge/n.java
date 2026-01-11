package ge;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import le.e;
import md.m;

public final class n extends i1 {

    /* renamed from: t  reason: collision with root package name */
    public final l<?> f5432t;

    public n(l<?> lVar) {
        this.f5432t = lVar;
    }

    public final /* bridge */ /* synthetic */ Object k(Object obj) {
        x((Throwable) obj);
        return m.f8555a;
    }

    public final void x(Throwable th2) {
        boolean z;
        l<?> lVar = this.f5432t;
        l1 y10 = y();
        Objects.requireNonNull(lVar);
        CancellationException S = y10.S();
        if (!lVar.w()) {
            z = false;
        } else {
            z = ((e) lVar.f5412s).n(S);
        }
        if (!z) {
            lVar.l(S);
            lVar.r();
        }
    }
}
