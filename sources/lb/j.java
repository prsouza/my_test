package lb;

import e6.e;
import gb.f;
import lb.k;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f8192a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f8193b;

    public /* synthetic */ j(k.a aVar, f fVar) {
        this.f8192a = aVar;
        this.f8193b = fVar;
    }

    public final void run() {
        k.a aVar = this.f8192a;
        f fVar = this.f8193b;
        e.D(aVar, "$holder");
        e.D(fVar, "$notifState");
        if (aVar.f8198w.isShown()) {
            fVar.f5326h.c();
        }
    }
}
