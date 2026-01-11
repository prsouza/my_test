package mf;

import android.support.v4.media.a;
import e6.e;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import lf.c;
import lf.d;
import mf.e;
import p002if.d0;
import qf.h;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f8659a;

    /* renamed from: b  reason: collision with root package name */
    public final c f8660b;

    /* renamed from: c  reason: collision with root package name */
    public final i f8661c;

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentLinkedQueue<h> f8662d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8663e = 5;

    public j(d dVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        e.D(dVar, "taskRunner");
        e.D(timeUnit, "timeUnit");
        this.f8659a = timeUnit.toNanos(5);
        this.f8660b = dVar.f();
        this.f8661c = new i(this, a.e(new StringBuilder(), jf.c.g, " ConnectionPool"));
        this.f8662d = new ConcurrentLinkedQueue<>();
    }

    public final boolean a(p002if.a aVar, e eVar, List<d0> list, boolean z) {
        e.D(aVar, "address");
        e.D(eVar, "call");
        Iterator<h> it = this.f8662d.iterator();
        while (it.hasNext()) {
            h next = it.next();
            e.C(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.j()) {
                    }
                }
                if (next.h(aVar, list)) {
                    eVar.b(next);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List, java.util.List<java.lang.ref.Reference<mf.e>>, java.util.ArrayList] */
    public final int b(h hVar, long j10) {
        byte[] bArr = jf.c.f7250a;
        ? r02 = hVar.f8655o;
        int i = 0;
        while (i < r02.size()) {
            Reference reference = (Reference) r02.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder d10 = a.a.d("A connection to ");
                d10.append(hVar.f8657q.f6493a.f6443a);
                d10.append(" was leaked. ");
                d10.append("Did you forget to close a response body?");
                String sb2 = d10.toString();
                h.a aVar = h.f10446c;
                h.f10444a.k(sb2, ((e.b) reference).f8638a);
                r02.remove(i);
                hVar.i = true;
                if (r02.isEmpty()) {
                    hVar.f8656p = j10 - this.f8659a;
                    return 0;
                }
            }
        }
        return r02.size();
    }
}
