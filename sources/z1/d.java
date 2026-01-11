package z1;

import a2.b;
import a2.c;
import a2.e;
import a2.f;
import a2.g;
import a2.h;
import android.content.Context;
import d2.o;
import g2.a;
import u1.p;

public final class d implements c.a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f13766d = p.e("WorkConstraintsTracker");

    /* renamed from: a  reason: collision with root package name */
    public final c f13767a;

    /* renamed from: b  reason: collision with root package name */
    public final c<?>[] f13768b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f13769c = new Object();

    public d(Context context, a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f13767a = cVar;
        this.f13768b = new c[]{new a2.a(applicationContext, aVar), new b(applicationContext, aVar), new h(applicationContext, aVar), new a2.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final boolean a(String str) {
        synchronized (this.f13769c) {
            for (c<?> cVar : this.f13768b) {
                T t10 = cVar.f31b;
                if (t10 != null && cVar.c(t10) && cVar.f30a.contains(str)) {
                    p.c().a(f13766d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void b(Iterable<o> iterable) {
        synchronized (this.f13769c) {
            for (c<?> cVar : this.f13768b) {
                if (cVar.f33d != null) {
                    cVar.f33d = null;
                    cVar.e((c.a) null, cVar.f31b);
                }
            }
            for (c<?> d10 : this.f13768b) {
                d10.d(iterable);
            }
            for (c<?> cVar2 : this.f13768b) {
                if (cVar2.f33d != this) {
                    cVar2.f33d = this;
                    cVar2.e(this, cVar2.f31b);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final void c() {
        synchronized (this.f13769c) {
            for (c<?> cVar : this.f13768b) {
                if (!cVar.f30a.isEmpty()) {
                    cVar.f30a.clear();
                    cVar.f32c.b(cVar);
                }
            }
        }
    }
}
