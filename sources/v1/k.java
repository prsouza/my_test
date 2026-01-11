package v1;

import f2.c;
import u1.p;
import z6.a;

public final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f12154a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f12155b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f12156c;

    public k(m mVar, a aVar, c cVar) {
        this.f12156c = mVar;
        this.f12154a = aVar;
        this.f12155b = cVar;
    }

    public final void run() {
        try {
            this.f12154a.get();
            p.c().a(m.I, String.format("Starting work for %s", new Object[]{this.f12156c.f12164t.f4295c}), new Throwable[0]);
            m mVar = this.f12156c;
            mVar.G = mVar.f12165u.f();
            this.f12155b.l(this.f12156c.G);
        } catch (Throwable th2) {
            this.f12155b.k(th2);
        }
    }
}
