package androidx.lifecycle;

import androidx.fragment.app.o;
import androidx.lifecycle.r;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p.b;

public final class b0 extends r {

    /* renamed from: b  reason: collision with root package name */
    public p.a<z, a> f2083b = new p.a<>();

    /* renamed from: c  reason: collision with root package name */
    public r.c f2084c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference<a0> f2085d;

    /* renamed from: e  reason: collision with root package name */
    public int f2086e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2087f = false;
    public boolean g = false;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<r.c> f2088h = new ArrayList<>();
    public final boolean i;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public r.c f2089a;

        /* renamed from: b  reason: collision with root package name */
        public y f2090b;

        /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.p>>>, java.util.HashMap] */
        public a(z zVar, r.c cVar) {
            y yVar;
            Map<Class<?>, Integer> map = e0.f2103a;
            boolean z = zVar instanceof y;
            boolean z10 = zVar instanceof o;
            if (z && z10) {
                yVar = new FullLifecycleObserverAdapter((o) zVar, (y) zVar);
            } else if (z10) {
                yVar = new FullLifecycleObserverAdapter((o) zVar, (y) null);
            } else if (z) {
                yVar = (y) zVar;
            } else {
                Class<?> cls = zVar.getClass();
                if (e0.c(cls) == 2) {
                    List list = (List) e0.f2104b.get(cls);
                    if (list.size() == 1) {
                        yVar = new SingleGeneratedAdapterObserver(e0.a((Constructor) list.get(0), zVar));
                    } else {
                        p[] pVarArr = new p[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            pVarArr[i] = e0.a((Constructor) list.get(i), zVar);
                        }
                        yVar = new CompositeGeneratedAdaptersObserver(pVarArr);
                    }
                } else {
                    yVar = new ReflectiveGenericLifecycleObserver(zVar);
                }
            }
            this.f2090b = yVar;
            this.f2089a = cVar;
        }

        public final void a(a0 a0Var, r.b bVar) {
            r.c targetState = bVar.getTargetState();
            this.f2089a = b0.g(this.f2089a, targetState);
            this.f2090b.c(a0Var, bVar);
            this.f2089a = targetState;
        }
    }

    public b0(a0 a0Var) {
        this.f2085d = new WeakReference<>(a0Var);
        this.f2084c = r.c.INITIALIZED;
        this.i = true;
    }

    public static r.c g(r.c cVar, r.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    public final void a(z zVar) {
        a0 a0Var;
        e("addObserver");
        r.c cVar = this.f2084c;
        r.c cVar2 = r.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = r.c.INITIALIZED;
        }
        a aVar = new a(zVar, cVar2);
        if (this.f2083b.g(zVar, aVar) == null && (a0Var = this.f2085d.get()) != null) {
            boolean z = this.f2086e != 0 || this.f2087f;
            r.c d10 = d(zVar);
            this.f2086e++;
            while (aVar.f2089a.compareTo(d10) < 0 && this.f2083b.contains(zVar)) {
                j(aVar.f2089a);
                r.b upFrom = r.b.upFrom(aVar.f2089a);
                if (upFrom != null) {
                    aVar.a(a0Var, upFrom);
                    i();
                    d10 = d(zVar);
                } else {
                    StringBuilder d11 = a.a.d("no event up from ");
                    d11.append(aVar.f2089a);
                    throw new IllegalStateException(d11.toString());
                }
            }
            if (!z) {
                l();
            }
            this.f2086e--;
        }
    }

    public final r.c b() {
        return this.f2084c;
    }

    public final void c(z zVar) {
        e("removeObserver");
        this.f2083b.h(zVar);
    }

    public final r.c d(z zVar) {
        p.a<z, a> aVar = this.f2083b;
        r.c cVar = null;
        b.c<K, V> cVar2 = aVar.contains(zVar) ? aVar.f9466t.get(zVar).f9474s : null;
        r.c cVar3 = cVar2 != null ? ((a) cVar2.f9472b).f2089a : null;
        if (!this.f2088h.isEmpty()) {
            ArrayList<r.c> arrayList = this.f2088h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return g(g(this.f2084c, cVar3), cVar);
    }

    public final void e(String str) {
        if (this.i && !o.a.r2().s2()) {
            throw new IllegalStateException(o.c("Method ", str, " must be called on the main thread"));
        }
    }

    public final void f(r.b bVar) {
        e("handleLifecycleEvent");
        h(bVar.getTargetState());
    }

    public final void h(r.c cVar) {
        r.c cVar2 = this.f2084c;
        if (cVar2 != cVar) {
            if (cVar2 == r.c.INITIALIZED && cVar == r.c.DESTROYED) {
                StringBuilder d10 = a.a.d("no event down from ");
                d10.append(this.f2084c);
                throw new IllegalStateException(d10.toString());
            }
            this.f2084c = cVar;
            if (this.f2087f || this.f2086e != 0) {
                this.g = true;
                return;
            }
            this.f2087f = true;
            l();
            this.f2087f = false;
            if (this.f2084c == r.c.DESTROYED) {
                this.f2083b = new p.a<>();
            }
        }
    }

    public final void i() {
        ArrayList<r.c> arrayList = this.f2088h;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void j(r.c cVar) {
        this.f2088h.add(cVar);
    }

    public final void k(r.c cVar) {
        e("setCurrentState");
        h(cVar);
    }

    public final void l() {
        r.c cVar;
        a0 a0Var = this.f2085d.get();
        if (a0Var != null) {
            while (true) {
                p.a<z, a> aVar = this.f2083b;
                boolean z = true;
                if (!(aVar.f9470s == 0 || (((a) aVar.f9467a.getValue()).f2089a == (cVar = ((a) this.f2083b.f9468b.getValue()).f2089a) && this.f2084c == cVar))) {
                    z = false;
                }
                if (!z) {
                    this.g = false;
                    if (this.f2084c.compareTo(((a) this.f2083b.f9467a.f9472b).f2089a) < 0) {
                        p.a<z, a> aVar2 = this.f2083b;
                        b.C0184b bVar = new b.C0184b(aVar2.f9468b, aVar2.f9467a);
                        aVar2.f9469c.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.g) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            a aVar3 = (a) entry.getValue();
                            while (aVar3.f2089a.compareTo(this.f2084c) > 0 && !this.g && this.f2083b.contains((z) entry.getKey())) {
                                r.b downFrom = r.b.downFrom(aVar3.f2089a);
                                if (downFrom != null) {
                                    j(downFrom.getTargetState());
                                    aVar3.a(a0Var, downFrom);
                                    i();
                                } else {
                                    StringBuilder d10 = a.a.d("no event down from ");
                                    d10.append(aVar3.f2089a);
                                    throw new IllegalStateException(d10.toString());
                                }
                            }
                        }
                    }
                    b.c<K, V> cVar2 = this.f2083b.f9468b;
                    if (!this.g && cVar2 != null && this.f2084c.compareTo(((a) cVar2.f9472b).f2089a) > 0) {
                        b<K, V>.d d11 = this.f2083b.d();
                        while (d11.hasNext() && !this.g) {
                            Map.Entry entry2 = (Map.Entry) d11.next();
                            a aVar4 = (a) entry2.getValue();
                            while (aVar4.f2089a.compareTo(this.f2084c) < 0 && !this.g && this.f2083b.contains((z) entry2.getKey())) {
                                j(aVar4.f2089a);
                                r.b upFrom = r.b.upFrom(aVar4.f2089a);
                                if (upFrom != null) {
                                    aVar4.a(a0Var, upFrom);
                                    i();
                                } else {
                                    StringBuilder d12 = a.a.d("no event up from ");
                                    d12.append(aVar4.f2089a);
                                    throw new IllegalStateException(d12.toString());
                                }
                            }
                        }
                    }
                } else {
                    this.g = false;
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
