package androidx.lifecycle;

import androidx.fragment.app.o;
import androidx.lifecycle.r;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f2025k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f2026a;

    /* renamed from: b  reason: collision with root package name */
    public p.b<k0<? super T>, LiveData<T>.c> f2027b;

    /* renamed from: c  reason: collision with root package name */
    public int f2028c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2029d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f2030e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f2031f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2032h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public final a f2033j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements y {

        /* renamed from: t  reason: collision with root package name */
        public final a0 f2034t;

        public LifecycleBoundObserver(a0 a0Var, k0<? super T> k0Var) {
            super(k0Var);
            this.f2034t = a0Var;
        }

        public final void c(a0 a0Var, r.b bVar) {
            r.c b10 = this.f2034t.getLifecycle().b();
            if (b10 == r.c.DESTROYED) {
                LiveData.this.i(this.f2037a);
                return;
            }
            r.c cVar = null;
            while (cVar != b10) {
                f(this.f2034t.getLifecycle().b().isAtLeast(r.c.STARTED));
                cVar = b10;
                b10 = this.f2034t.getLifecycle().b();
            }
        }

        public final void h() {
            this.f2034t.getLifecycle().c(this);
        }

        public final boolean i(a0 a0Var) {
            return this.f2034t == a0Var;
        }

        public final boolean j() {
            return this.f2034t.getLifecycle().b().isAtLeast(r.c.STARTED);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            Object obj;
            synchronized (LiveData.this.f2026a) {
                obj = LiveData.this.f2031f;
                LiveData.this.f2031f = LiveData.f2025k;
            }
            LiveData.this.j(obj);
        }
    }

    public class b extends LiveData<T>.c {
        public b(LiveData liveData, k0<? super T> k0Var) {
            super(k0Var);
        }

        public final boolean j() {
            return true;
        }
    }

    public abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final k0<? super T> f2037a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2038b;

        /* renamed from: c  reason: collision with root package name */
        public int f2039c = -1;

        public c(k0<? super T> k0Var) {
            this.f2037a = k0Var;
        }

        public final void f(boolean z) {
            if (z != this.f2038b) {
                this.f2038b = z;
                LiveData liveData = LiveData.this;
                int i = z ? 1 : -1;
                int i10 = liveData.f2028c;
                liveData.f2028c = i + i10;
                if (!liveData.f2029d) {
                    liveData.f2029d = true;
                    while (true) {
                        try {
                            int i11 = liveData.f2028c;
                            if (i10 == i11) {
                                break;
                            }
                            boolean z10 = i10 == 0 && i11 > 0;
                            boolean z11 = i10 > 0 && i11 == 0;
                            if (z10) {
                                liveData.g();
                            } else if (z11) {
                                liveData.h();
                            }
                            i10 = i11;
                        } finally {
                            liveData.f2029d = false;
                        }
                    }
                }
                if (this.f2038b) {
                    LiveData.this.c(this);
                }
            }
        }

        public void h() {
        }

        public boolean i(a0 a0Var) {
            return false;
        }

        public abstract boolean j();
    }

    public LiveData(T t10) {
        this.f2026a = new Object();
        this.f2027b = new p.b<>();
        this.f2028c = 0;
        this.f2031f = f2025k;
        this.f2033j = new a();
        this.f2030e = t10;
        this.g = 0;
    }

    public static void a(String str) {
        if (!o.a.r2().s2()) {
            throw new IllegalStateException(o.c("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.f2038b) {
            if (!cVar.j()) {
                cVar.f(false);
                return;
            }
            int i10 = cVar.f2039c;
            int i11 = this.g;
            if (i10 < i11) {
                cVar.f2039c = i11;
                cVar.f2037a.d(this.f2030e);
            }
        }
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.f2032h) {
            this.i = true;
            return;
        }
        this.f2032h = true;
        do {
            this.i = false;
            if (cVar == null) {
                p.b<K, V>.d d10 = this.f2027b.d();
                while (d10.hasNext()) {
                    b((c) ((Map.Entry) d10.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                b(cVar);
                cVar = null;
            }
        } while (this.i);
        this.f2032h = false;
    }

    public final T d() {
        T t10 = this.f2030e;
        if (t10 != f2025k) {
            return t10;
        }
        return null;
    }

    public final void e(a0 a0Var, k0<? super T> k0Var) {
        a("observe");
        if (a0Var.getLifecycle().b() != r.c.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(a0Var, k0Var);
            c g8 = this.f2027b.g(k0Var, lifecycleBoundObserver);
            if (g8 != null && !g8.i(a0Var)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (g8 == null) {
                a0Var.getLifecycle().a(lifecycleBoundObserver);
            }
        }
    }

    public final void f(k0<? super T> k0Var) {
        a("observeForever");
        b bVar = new b(this, k0Var);
        c g8 = this.f2027b.g(k0Var, bVar);
        if (g8 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (g8 == null) {
            bVar.f(true);
        }
    }

    public void g() {
    }

    public void h() {
    }

    public void i(k0<? super T> k0Var) {
        a("removeObserver");
        c h10 = this.f2027b.h(k0Var);
        if (h10 != null) {
            h10.h();
            h10.f(false);
        }
    }

    public void j(T t10) {
        a("setValue");
        this.g++;
        this.f2030e = t10;
        c((LiveData<T>.c) null);
    }

    public LiveData() {
        this.f2026a = new Object();
        this.f2027b = new p.b<>();
        this.f2028c = 0;
        Object obj = f2025k;
        this.f2031f = obj;
        this.f2033j = new a();
        this.f2030e = obj;
        this.g = -1;
    }
}
