package androidx.lifecycle;

import androidx.lifecycle.r;
import e6.e;
import ge.g1;
import java.util.concurrent.CancellationException;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final r f2180a;

    /* renamed from: b  reason: collision with root package name */
    public final r.c f2181b;

    /* renamed from: c  reason: collision with root package name */
    public final k f2182c;

    /* renamed from: d  reason: collision with root package name */
    public final s f2183d;

    public t(r rVar, r.c cVar, k kVar, g1 g1Var) {
        e.D(rVar, "lifecycle");
        e.D(cVar, "minState");
        e.D(kVar, "dispatchQueue");
        this.f2180a = rVar;
        this.f2181b = cVar;
        this.f2182c = kVar;
        s sVar = new s(this, g1Var);
        this.f2183d = sVar;
        if (rVar.b() == r.c.DESTROYED) {
            g1Var.c((CancellationException) null);
            a();
            return;
        }
        rVar.a(sVar);
    }

    public final void a() {
        this.f2180a.c(this.f2183d);
        k kVar = this.f2182c;
        kVar.f2128b = true;
        kVar.b();
    }
}
