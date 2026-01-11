package i3;

import d4.a;
import d4.d;
import g3.f;
import i3.j;
import i3.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import y3.g;
import y3.h;

public final class n<R> implements j.b<R>, a.d {
    public static final c O = new c();
    public f A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public w<?> F;
    public g3.a G;
    public boolean H;
    public r I;
    public boolean J;
    public q<?> K;
    public j<R> L;
    public volatile boolean M;
    public boolean N;

    /* renamed from: a  reason: collision with root package name */
    public final e f6110a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final d.a f6111b = new d.a();

    /* renamed from: c  reason: collision with root package name */
    public final q.a f6112c;

    /* renamed from: s  reason: collision with root package name */
    public final m0.c<n<?>> f6113s;

    /* renamed from: t  reason: collision with root package name */
    public final c f6114t;

    /* renamed from: u  reason: collision with root package name */
    public final o f6115u;

    /* renamed from: v  reason: collision with root package name */
    public final l3.a f6116v;

    /* renamed from: w  reason: collision with root package name */
    public final l3.a f6117w;

    /* renamed from: x  reason: collision with root package name */
    public final l3.a f6118x;

    /* renamed from: y  reason: collision with root package name */
    public final l3.a f6119y;
    public final AtomicInteger z = new AtomicInteger();

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final g f6120a;

        public a(g gVar) {
            this.f6120a = gVar;
        }

        public final void run() {
            h hVar = (h) this.f6120a;
            hVar.f13442b.a();
            synchronized (hVar.f13443c) {
                synchronized (n.this) {
                    if (n.this.f6110a.f6126a.contains(new d(this.f6120a, c4.e.f3232b))) {
                        n nVar = n.this;
                        g gVar = this.f6120a;
                        Objects.requireNonNull(nVar);
                        try {
                            ((h) gVar).o(nVar.I, 5);
                        } catch (Throwable th2) {
                            throw new d(th2);
                        }
                    }
                    n.this.c();
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final g f6122a;

        public b(g gVar) {
            this.f6122a = gVar;
        }

        public final void run() {
            h hVar = (h) this.f6122a;
            hVar.f13442b.a();
            synchronized (hVar.f13443c) {
                synchronized (n.this) {
                    if (n.this.f6110a.f6126a.contains(new d(this.f6122a, c4.e.f3232b))) {
                        n.this.K.a();
                        n nVar = n.this;
                        g gVar = this.f6122a;
                        Objects.requireNonNull(nVar);
                        try {
                            ((h) gVar).p(nVar.K, nVar.G, nVar.N);
                            n.this.g(this.f6122a);
                        } catch (Throwable th2) {
                            throw new d(th2);
                        }
                    }
                    n.this.c();
                }
            }
        }
    }

    public static class c {
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final g f6124a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f6125b;

        public d(g gVar, Executor executor) {
            this.f6124a = gVar;
            this.f6125b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f6124a.equals(((d) obj).f6124a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f6124a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {

        /* renamed from: a  reason: collision with root package name */
        public final List<d> f6126a = new ArrayList(2);

        public final boolean isEmpty() {
            return this.f6126a.isEmpty();
        }

        public final Iterator<d> iterator() {
            return this.f6126a.iterator();
        }
    }

    public n(l3.a aVar, l3.a aVar2, l3.a aVar3, l3.a aVar4, o oVar, q.a aVar5, m0.c<n<?>> cVar) {
        c cVar2 = O;
        this.f6116v = aVar;
        this.f6117w = aVar2;
        this.f6118x = aVar3;
        this.f6119y = aVar4;
        this.f6115u = oVar;
        this.f6112c = aVar5;
        this.f6113s = cVar;
        this.f6114t = cVar2;
    }

    public final synchronized void a(g gVar, Executor executor) {
        this.f6111b.a();
        this.f6110a.f6126a.add(new d(gVar, executor));
        boolean z10 = true;
        if (this.H) {
            d(1);
            executor.execute(new b(gVar));
        } else if (this.J) {
            d(1);
            executor.execute(new a(gVar));
        } else {
            if (this.M) {
                z10 = false;
            }
            aa.b.r(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    public final void b() {
        if (!e()) {
            this.M = true;
            j<R> jVar = this.L;
            jVar.T = true;
            h hVar = jVar.R;
            if (hVar != null) {
                hVar.cancel();
            }
            o oVar = this.f6115u;
            f fVar = this.A;
            m mVar = (m) oVar;
            synchronized (mVar) {
                t tVar = mVar.f6088a;
                Objects.requireNonNull(tVar);
                Map b10 = tVar.b(this.E);
                if (equals(b10.get(fVar))) {
                    b10.remove(fVar);
                }
            }
        }
    }

    public final void c() {
        q<?> qVar;
        synchronized (this) {
            this.f6111b.a();
            aa.b.r(e(), "Not yet complete!");
            int decrementAndGet = this.z.decrementAndGet();
            aa.b.r(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                qVar = this.K;
                f();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.e();
        }
    }

    public final synchronized void d(int i) {
        q<?> qVar;
        aa.b.r(e(), "Not yet complete!");
        if (this.z.getAndAdd(i) == 0 && (qVar = this.K) != null) {
            qVar.a();
        }
    }

    public final boolean e() {
        return this.J || this.H || this.M;
    }

    public final synchronized void f() {
        boolean a10;
        if (this.A != null) {
            this.f6110a.f6126a.clear();
            this.A = null;
            this.K = null;
            this.F = null;
            this.J = false;
            this.M = false;
            this.H = false;
            this.N = false;
            j<R> jVar = this.L;
            j.f fVar = jVar.f6064v;
            synchronized (fVar) {
                fVar.f6076a = true;
                a10 = fVar.a();
            }
            if (a10) {
                jVar.t();
            }
            this.L = null;
            this.I = null;
            this.G = null;
            this.f6113s.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void g(g gVar) {
        boolean z10;
        this.f6111b.a();
        this.f6110a.f6126a.remove(new d(gVar, c4.e.f3232b));
        if (this.f6110a.isEmpty()) {
            b();
            if (!this.H) {
                if (!this.J) {
                    z10 = false;
                    if (z10 && this.z.get() == 0) {
                        f();
                    }
                }
            }
            z10 = true;
            f();
        }
    }

    public final d4.d h() {
        return this.f6111b;
    }

    public final void i(j<?> jVar) {
        l3.a aVar;
        if (this.C) {
            aVar = this.f6118x;
        } else {
            aVar = this.D ? this.f6119y : this.f6117w;
        }
        aVar.execute(jVar);
    }
}
