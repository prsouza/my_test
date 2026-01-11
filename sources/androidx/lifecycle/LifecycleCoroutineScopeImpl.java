package androidx.lifecycle;

import ad.c;
import androidx.lifecycle.r;
import e6.e;
import java.util.concurrent.CancellationException;
import pd.f;

public final class LifecycleCoroutineScopeImpl extends v implements y {

    /* renamed from: a  reason: collision with root package name */
    public final r f2023a;

    /* renamed from: b  reason: collision with root package name */
    public final f f2024b;

    public LifecycleCoroutineScopeImpl(r rVar, f fVar) {
        e.D(fVar, "coroutineContext");
        this.f2023a = rVar;
        this.f2024b = fVar;
        if (rVar.b() == r.c.DESTROYED) {
            c.y(fVar, (CancellationException) null);
        }
    }

    public final void c(a0 a0Var, r.b bVar) {
        if (this.f2023a.b().compareTo(r.c.DESTROYED) <= 0) {
            this.f2023a.c(this);
            c.y(this.f2024b, (CancellationException) null);
        }
    }

    public final f f() {
        return this.f2024b;
    }

    public final r h() {
        return this.f2023a;
    }
}
