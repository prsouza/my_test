package i3;

import g3.f;
import i3.q;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6021a = false;

    /* renamed from: b  reason: collision with root package name */
    public final Map<f, a> f6022b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue<q<?>> f6023c = new ReferenceQueue<>();

    /* renamed from: d  reason: collision with root package name */
    public q.a f6024d;

    public static final class a extends WeakReference<q<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final f f6025a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6026b;

        /* renamed from: c  reason: collision with root package name */
        public w<?> f6027c;

        public a(f fVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z) {
            super(qVar, referenceQueue);
            w<Z> wVar;
            Objects.requireNonNull(fVar, "Argument must not be null");
            this.f6025a = fVar;
            if (!qVar.f6134a || !z) {
                wVar = null;
            } else {
                wVar = qVar.f6136c;
                Objects.requireNonNull(wVar, "Argument must not be null");
            }
            this.f6027c = wVar;
            this.f6026b = qVar.f6134a;
        }
    }

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a());
        newSingleThreadExecutor.execute(new b(this));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.HashMap, java.util.Map<g3.f, i3.c$a>] */
    public final synchronized void a(f fVar, q<?> qVar) {
        a aVar = (a) this.f6022b.put(fVar, new a(fVar, qVar, this.f6023c, this.f6021a));
        if (aVar != null) {
            aVar.f6027c = null;
            aVar.clear();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<g3.f, i3.c$a>] */
    public final void b(a aVar) {
        synchronized (this) {
            this.f6022b.remove(aVar.f6025a);
            if (aVar.f6026b) {
                w<?> wVar = aVar.f6027c;
                if (wVar != null) {
                    this.f6024d.a(aVar.f6025a, new q(wVar, true, false, aVar.f6025a, this.f6024d));
                }
            }
        }
    }
}
