package a2;

import b2.d;
import d2.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u1.p;

public abstract class c<T> implements z1.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f30a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public T f31b;

    /* renamed from: c  reason: collision with root package name */
    public d<T> f32c;

    /* renamed from: d  reason: collision with root package name */
    public a f33d;

    public interface a {
    }

    public c(d<T> dVar) {
        this.f32c = dVar;
    }

    public final void a(T t10) {
        this.f31b = t10;
        e(this.f33d, t10);
    }

    public abstract boolean b(o oVar);

    public abstract boolean c(T t10);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final void d(Iterable<o> iterable) {
        this.f30a.clear();
        for (o next : iterable) {
            if (b(next)) {
                this.f30a.add(next.f4293a);
            }
        }
        if (this.f30a.isEmpty()) {
            this.f32c.b(this);
        } else {
            d<T> dVar = this.f32c;
            synchronized (dVar.f2830c) {
                if (dVar.f2831d.add(this)) {
                    if (dVar.f2831d.size() == 1) {
                        dVar.f2832e = dVar.a();
                        p.c().a(d.f2827f, String.format("%s: initial state = %s", new Object[]{dVar.getClass().getSimpleName(), dVar.f2832e}), new Throwable[0]);
                        dVar.d();
                    }
                    a(dVar.f2832e);
                }
            }
        }
        e(this.f33d, this.f31b);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r10v3, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final void e(a aVar, T t10) {
        if (!this.f30a.isEmpty() && aVar != null) {
            if (t10 == null || c(t10)) {
                List<String> list = this.f30a;
                z1.d dVar = (z1.d) aVar;
                synchronized (dVar.f13769c) {
                    z1.c cVar = dVar.f13767a;
                    if (cVar != null) {
                        cVar.c(list);
                    }
                }
                return;
            }
            ? r10 = this.f30a;
            z1.d dVar2 = (z1.d) aVar;
            synchronized (dVar2.f13769c) {
                ArrayList arrayList = new ArrayList();
                Iterator it = r10.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (dVar2.a(str)) {
                        p.c().a(z1.d.f13766d, String.format("Constraints met for %s", new Object[]{str}), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                z1.c cVar2 = dVar2.f13767a;
                if (cVar2 != null) {
                    cVar2.d(arrayList);
                }
            }
        }
    }
}
