package l6;

import android.os.Bundle;
import b8.b;
import java.util.Objects;
import m3.u;
import t6.a;
import t6.g;
import t6.q;
import x3.d;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8023a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8024b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8025c;

    public /* synthetic */ t(x xVar, Bundle bundle) {
        this.f8024b = xVar;
        this.f8025c = bundle;
    }

    public final void run() {
        switch (this.f8023a) {
            case 0:
                x xVar = (x) this.f8024b;
                g1 g1Var = xVar.g;
                Objects.requireNonNull(g1Var);
                if (((Boolean) g1Var.c(new d(g1Var, (Bundle) this.f8025c))).booleanValue()) {
                    u0 u0Var = xVar.f8079h;
                    Objects.requireNonNull(u0Var);
                    u uVar = u0.f8035k;
                    uVar.a("Run extractor loop", new Object[0]);
                    if (u0Var.f8043j.compareAndSet(false, true)) {
                        while (true) {
                            b bVar = null;
                            try {
                                bVar = u0Var.i.a();
                            } catch (t0 e10) {
                                u0.f8035k.c("Error while getting next extraction task: %s", e10.getMessage());
                                if (e10.f8026a >= 0) {
                                    ((v2) u0Var.f8042h.zza()).b(e10.f8026a);
                                    u0Var.a(e10.f8026a, e10);
                                }
                            }
                            if (bVar != null) {
                                try {
                                    if (bVar instanceof o0) {
                                        u0Var.f8037b.a((o0) bVar);
                                    } else if (bVar instanceof k2) {
                                        u0Var.f8038c.a((k2) bVar);
                                    } else if (bVar instanceof q1) {
                                        u0Var.f8039d.a((q1) bVar);
                                    } else if (bVar instanceof t1) {
                                        u0Var.f8040e.a((t1) bVar);
                                    } else if (bVar instanceof b2) {
                                        u0Var.f8041f.a((b2) bVar);
                                    } else if (bVar instanceof d2) {
                                        u0Var.g.a((d2) bVar);
                                    } else {
                                        u0.f8035k.c("Unknown task type: %s", bVar.getClass().getName());
                                    }
                                } catch (Exception e11) {
                                    u0.f8035k.c("Error during extraction task: %s", e11.getMessage());
                                    ((v2) u0Var.f8042h.zza()).b(bVar.f2904a);
                                    u0Var.a(bVar.f2904a, e11);
                                }
                            } else {
                                u0Var.f8043j.set(false);
                                return;
                            }
                        }
                    } else {
                        uVar.g("runLoop already looping; return", new Object[0]);
                        return;
                    }
                } else {
                    return;
                }
            default:
                synchronized (((g) this.f8025c).f11407b) {
                    a aVar = ((g) this.f8025c).f11408c;
                    if (aVar != null) {
                        aVar.a((q) this.f8024b);
                    }
                }
                return;
        }
    }

    public t(g gVar, q qVar) {
        this.f8025c = gVar;
        this.f8024b = qVar;
    }
}
