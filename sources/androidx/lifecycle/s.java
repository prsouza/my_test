package androidx.lifecycle;

import androidx.lifecycle.r;
import e6.e;
import ge.g1;
import java.util.concurrent.CancellationException;

public final /* synthetic */ class s implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f2172a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g1 f2173b;

    public /* synthetic */ s(t tVar, g1 g1Var) {
        this.f2172a = tVar;
        this.f2173b = g1Var;
    }

    public final void c(a0 a0Var, r.b bVar) {
        t tVar = this.f2172a;
        g1 g1Var = this.f2173b;
        e.D(tVar, "this$0");
        e.D(g1Var, "$parentJob");
        if (a0Var.getLifecycle().b() == r.c.DESTROYED) {
            g1Var.c((CancellationException) null);
            tVar.a();
        } else if (a0Var.getLifecycle().b().compareTo(tVar.f2181b) < 0) {
            tVar.f2182c.f2127a = true;
        } else {
            k kVar = tVar.f2182c;
            if (kVar.f2127a) {
                if (!kVar.f2128b) {
                    kVar.f2127a = false;
                    kVar.b();
                    return;
                }
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
        }
    }
}
