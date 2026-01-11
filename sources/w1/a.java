package w1;

import d2.o;
import u1.p;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f12542a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f12543b;

    public a(b bVar, o oVar) {
        this.f12543b = bVar;
        this.f12542a = oVar;
    }

    public final void run() {
        p.c().a(b.f12544d, String.format("Scheduling work %s", new Object[]{this.f12542a.f4293a}), new Throwable[0]);
        this.f12543b.f12545a.e(this.f12542a);
    }
}
