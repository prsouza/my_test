package p8;

import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9713a;

    public /* synthetic */ b(g gVar) {
        this.f9713a = gVar;
    }

    public final Object call() {
        g gVar = this.f9713a;
        synchronized (gVar) {
            gVar.f9720a.get().h(System.currentTimeMillis(), gVar.f9722c.get().a());
        }
        return null;
    }
}
