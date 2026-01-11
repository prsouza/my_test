package e2;

import android.content.Context;
import androidx.work.ListenableWorker;
import d2.o;
import f2.c;
import u1.h;
import u1.i;
import u1.p;

public final class m implements Runnable {

    /* renamed from: v  reason: collision with root package name */
    public static final String f4559v = p.e("WorkForegroundRunnable");

    /* renamed from: a  reason: collision with root package name */
    public final c<Void> f4560a = new c<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f4561b;

    /* renamed from: c  reason: collision with root package name */
    public final o f4562c;

    /* renamed from: s  reason: collision with root package name */
    public final ListenableWorker f4563s;

    /* renamed from: t  reason: collision with root package name */
    public final i f4564t;

    /* renamed from: u  reason: collision with root package name */
    public final g2.a f4565u;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f4566a;

        public a(c cVar) {
            this.f4566a = cVar;
        }

        public final void run() {
            this.f4566a.l(m.this.f4563s.a());
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f4568a;

        public b(c cVar) {
            this.f4568a = cVar;
        }

        public final void run() {
            try {
                h hVar = (h) this.f4568a.get();
                if (hVar != null) {
                    p.c().a(m.f4559v, String.format("Updating notification for %s", new Object[]{m.this.f4562c.f4295c}), new Throwable[0]);
                    m mVar = m.this;
                    ListenableWorker listenableWorker = mVar.f4563s;
                    listenableWorker.f2628t = true;
                    mVar.f4560a.l(((n) mVar.f4564t).a(mVar.f4561b, listenableWorker.f2625b.f2634a, hVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{m.this.f4562c.f4295c}));
            } catch (Throwable th2) {
                m.this.f4560a.k(th2);
            }
        }
    }

    public m(Context context, o oVar, ListenableWorker listenableWorker, i iVar, g2.a aVar) {
        this.f4561b = context;
        this.f4562c = oVar;
        this.f4563s = listenableWorker;
        this.f4564t = iVar;
        this.f4565u = aVar;
    }

    public final void run() {
        if (!this.f4562c.f4307q || j0.a.a()) {
            this.f4560a.j(null);
            return;
        }
        c cVar = new c();
        ((g2.b) this.f4565u).f5229c.execute(new a(cVar));
        cVar.d(new b(cVar), ((g2.b) this.f4565u).f5229c);
    }
}
