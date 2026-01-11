package c2;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.a;
import d2.o;
import d2.q;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f3112a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f3113b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f3114c;

    public b(a aVar, WorkDatabase workDatabase, String str) {
        this.f3114c = aVar;
        this.f3112a = workDatabase;
        this.f3113b = str;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, d2.o>] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.Set<d2.o>, java.util.HashSet] */
    public final void run() {
        o h10 = ((q) this.f3112a.w()).h(this.f3113b);
        if (h10 != null && h10.b()) {
            synchronized (this.f3114c.f2731s) {
                this.f3114c.f2734v.put(this.f3113b, h10);
                this.f3114c.f2735w.add(h10);
                a aVar = this.f3114c;
                aVar.f2736x.b(aVar.f2735w);
            }
        }
    }
}
