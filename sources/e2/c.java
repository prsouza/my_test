package e2;

import androidx.work.impl.WorkDatabase;
import d2.p;
import d2.q;
import java.util.LinkedList;
import u1.s;
import u1.v;
import v1.b;
import v1.d;
import v1.j;
import v1.m;

public abstract class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final b f4536a = new b();

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    public final void a(j jVar, String str) {
        boolean z;
        WorkDatabase workDatabase = jVar.f12152x;
        p w6 = workDatabase.w();
        d2.b r10 = workDatabase.r();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = false;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            q qVar = (q) w6;
            v f10 = qVar.f(str2);
            if (!(f10 == v.SUCCEEDED || f10 == v.FAILED)) {
                qVar.o(v.CANCELLED, str2);
            }
            linkedList.addAll(((d2.c) r10).a(str2));
        }
        v1.c cVar = jVar.A;
        synchronized (cVar.z) {
            u1.p.c().a(v1.c.A, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            cVar.f12137x.add(str);
            m mVar = (m) cVar.f12134u.remove(str);
            if (mVar != null) {
                z = true;
            }
            if (mVar == null) {
                mVar = (m) cVar.f12135v.remove(str);
            }
            v1.c.c(str, mVar);
            if (z) {
                cVar.h();
            }
        }
        for (d b10 : jVar.z) {
            b10.b(str);
        }
    }

    public abstract void b();

    public final void run() {
        try {
            b();
            this.f4536a.a(s.f11653a);
        } catch (Throwable th2) {
            this.f4536a.a(new s.b.a(th2));
        }
    }
}
