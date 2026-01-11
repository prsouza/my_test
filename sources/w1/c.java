package w1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import d2.o;
import e2.h;
import g2.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import u1.p;
import u1.v;
import v1.a;
import v1.d;
import v1.j;

public final class c implements d, z1.c, a {

    /* renamed from: x  reason: collision with root package name */
    public static final String f12548x = p.e("GreedyScheduler");

    /* renamed from: a  reason: collision with root package name */
    public final Context f12549a;

    /* renamed from: b  reason: collision with root package name */
    public final j f12550b;

    /* renamed from: c  reason: collision with root package name */
    public final z1.d f12551c;

    /* renamed from: s  reason: collision with root package name */
    public final Set<o> f12552s = new HashSet();

    /* renamed from: t  reason: collision with root package name */
    public b f12553t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12554u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f12555v;

    /* renamed from: w  reason: collision with root package name */
    public Boolean f12556w;

    public c(Context context, androidx.work.a aVar, g2.a aVar2, j jVar) {
        this.f12549a = context;
        this.f12550b = jVar;
        this.f12551c = new z1.d(context, aVar2, this);
        this.f12553t = new b(this, aVar.f2646e);
        this.f12555v = new Object();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set<d2.o>, java.util.HashSet] */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.Set<d2.o>, java.util.HashSet] */
    public final void a(String str, boolean z) {
        synchronized (this.f12555v) {
            Iterator it = this.f12552s.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o oVar = (o) it.next();
                if (oVar.f4293a.equals(str)) {
                    p.c().a(f12548x, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f12552s.remove(oVar);
                    this.f12551c.b(this.f12552s);
                    break;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Map<java.lang.String, java.lang.Runnable>, java.util.HashMap] */
    public final void b(String str) {
        Runnable runnable;
        if (this.f12556w == null) {
            this.f12556w = Boolean.valueOf(h.a(this.f12549a, this.f12550b.f12151w));
        }
        if (!this.f12556w.booleanValue()) {
            p.c().d(f12548x, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f12554u) {
            this.f12550b.A.b(this);
            this.f12554u = true;
        }
        p.c().a(f12548x, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        b bVar = this.f12553t;
        if (!(bVar == null || (runnable = (Runnable) bVar.f12547c.remove(str)) == null)) {
            ((Handler) bVar.f12546b.f7785a).removeCallbacks(runnable);
        }
        this.f12550b.w2(str);
    }

    public final void c(List<String> list) {
        for (String next : list) {
            p.c().a(f12548x, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f12550b.w2(next);
        }
    }

    public final void d(List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            p.c().a(f12548x, String.format("Constraints met: Scheduling work ID %s", new Object[]{str}), new Throwable[0]);
            j jVar = this.f12550b;
            ((b) jVar.f12153y).a(new e2.j(jVar, str, (WorkerParameters.a) null));
        }
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [java.util.Map<java.lang.String, java.lang.Runnable>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r9v11, types: [java.util.Map<java.lang.String, java.lang.Runnable>, java.util.HashMap] */
    public final void e(o... oVarArr) {
        if (this.f12556w == null) {
            this.f12556w = Boolean.valueOf(h.a(this.f12549a, this.f12550b.f12151w));
        }
        if (!this.f12556w.booleanValue()) {
            p.c().d(f12548x, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f12554u) {
            this.f12550b.A.b(this);
            this.f12554u = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (o oVar : oVarArr) {
            long a10 = oVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (oVar.f4294b == v.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    b bVar = this.f12553t;
                    if (bVar != null) {
                        Runnable runnable = (Runnable) bVar.f12547c.remove(oVar.f4293a);
                        if (runnable != null) {
                            ((Handler) bVar.f12546b.f7785a).removeCallbacks(runnable);
                        }
                        a aVar = new a(bVar, oVar);
                        bVar.f12547c.put(oVar.f4293a, aVar);
                        ((Handler) bVar.f12546b.f7785a).postDelayed(aVar, oVar.a() - System.currentTimeMillis());
                    }
                } else if (oVar.b()) {
                    int i = Build.VERSION.SDK_INT;
                    u1.c cVar = oVar.f4300j;
                    if (cVar.f11628c) {
                        p.c().a(f12548x, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{oVar}), new Throwable[0]);
                    } else if (i < 24 || !cVar.a()) {
                        hashSet.add(oVar);
                        hashSet2.add(oVar.f4293a);
                    } else {
                        p.c().a(f12548x, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{oVar}), new Throwable[0]);
                    }
                } else {
                    p.c().a(f12548x, String.format("Starting work for %s", new Object[]{oVar.f4293a}), new Throwable[0]);
                    j jVar = this.f12550b;
                    ((b) jVar.f12153y).a(new e2.j(jVar, oVar.f4293a, (WorkerParameters.a) null));
                }
            }
        }
        synchronized (this.f12555v) {
            if (!hashSet.isEmpty()) {
                p.c().a(f12548x, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)}), new Throwable[0]);
                this.f12552s.addAll(hashSet);
                this.f12551c.b(this.f12552s);
            }
        }
    }

    public final boolean f() {
        return false;
    }
}
