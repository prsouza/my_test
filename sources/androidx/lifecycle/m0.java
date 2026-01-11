package androidx.lifecycle;

import e6.e;
import ge.n1;
import ge.o0;
import ge.z;
import java.util.Objects;
import le.l;
import me.c;
import pd.f;

public final class m0 extends z {

    /* renamed from: b  reason: collision with root package name */
    public final k f2140b = new k();

    public final void p0(f fVar, Runnable runnable) {
        e.D(fVar, "context");
        e.D(runnable, "block");
        k kVar = this.f2140b;
        Objects.requireNonNull(kVar);
        c cVar = o0.f5433a;
        n1 w02 = l.f8259a.w0();
        if (w02.v0(fVar) || kVar.a()) {
            w02.p0(fVar, new j(kVar, runnable));
        } else {
            kVar.c(runnable);
        }
    }

    public final boolean v0(f fVar) {
        e.D(fVar, "context");
        c cVar = o0.f5433a;
        if (l.f8259a.w0().v0(fVar)) {
            return true;
        }
        return !this.f2140b.a();
    }
}
