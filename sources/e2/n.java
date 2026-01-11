package e2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import d2.p;
import d2.q;
import f2.a;
import f2.c;
import g2.b;
import java.util.UUID;
import u1.h;
import u1.i;
import u1.v;

public final class n implements i {

    /* renamed from: a  reason: collision with root package name */
    public final g2.a f4570a;

    /* renamed from: b  reason: collision with root package name */
    public final c2.a f4571b;

    /* renamed from: c  reason: collision with root package name */
    public final p f4572c;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f4573a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ UUID f4574b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h f4575c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ Context f4576s;

        public a(c cVar, UUID uuid, h hVar, Context context) {
            this.f4573a = cVar;
            this.f4574b = uuid;
            this.f4575c = hVar;
            this.f4576s = context;
        }

        public final void run() {
            try {
                if (!(this.f4573a.f4914a instanceof a.b)) {
                    String uuid = this.f4574b.toString();
                    v f10 = ((q) n.this.f4572c).f(uuid);
                    if (f10 == null || f10.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    ((v1.c) n.this.f4571b).f(uuid, this.f4575c);
                    this.f4576s.startService(androidx.work.impl.foreground.a.b(this.f4576s, uuid, this.f4575c));
                }
                this.f4573a.j(null);
            } catch (Throwable th2) {
                this.f4573a.k(th2);
            }
        }
    }

    static {
        u1.p.e("WMFgUpdater");
    }

    public n(WorkDatabase workDatabase, c2.a aVar, g2.a aVar2) {
        this.f4571b = aVar;
        this.f4570a = aVar2;
        this.f4572c = workDatabase.w();
    }

    public final z6.a<Void> a(Context context, UUID uuid, h hVar) {
        c cVar = new c();
        ((b) this.f4570a).a(new a(cVar, uuid, hVar, context));
        return cVar;
    }
}
