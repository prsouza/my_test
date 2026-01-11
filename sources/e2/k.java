package e2;

import androidx.work.impl.WorkDatabase;
import d2.q;
import u1.p;
import u1.v;
import v1.c;
import v1.j;

public final class k implements Runnable {

    /* renamed from: s  reason: collision with root package name */
    public static final String f4553s = p.e("StopWorkRunnable");

    /* renamed from: a  reason: collision with root package name */
    public final j f4554a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4555b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4556c;

    public k(j jVar, String str, boolean z) {
        this.f4554a = jVar;
        this.f4555b = str;
        this.f4556c = z;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    public final void run() {
        boolean containsKey;
        boolean z;
        j jVar = this.f4554a;
        WorkDatabase workDatabase = jVar.f12152x;
        c cVar = jVar.A;
        d2.p w6 = workDatabase.w();
        workDatabase.c();
        try {
            String str = this.f4555b;
            synchronized (cVar.z) {
                containsKey = cVar.f12134u.containsKey(str);
            }
            if (this.f4556c) {
                z = this.f4554a.A.i(this.f4555b);
            } else {
                if (!containsKey) {
                    q qVar = (q) w6;
                    if (qVar.f(this.f4555b) == v.RUNNING) {
                        qVar.o(v.ENQUEUED, this.f4555b);
                    }
                }
                z = this.f4554a.A.j(this.f4555b);
            }
            p.c().a(f4553s, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f4555b, Boolean.valueOf(z)}), new Throwable[0]);
            workDatabase.p();
            workDatabase.l();
        } catch (Throwable th2) {
            workDatabase.l();
            throw th2;
        }
    }
}
