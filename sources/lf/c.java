package lf;

import a.a;
import ah.v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import lf.d;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8281a;

    /* renamed from: b  reason: collision with root package name */
    public a f8282b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f8283c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f8284d;

    /* renamed from: e  reason: collision with root package name */
    public final d f8285e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8286f;

    public c(d dVar, String str) {
        e.D(dVar, "taskRunner");
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f8285e = dVar;
        this.f8286f = str;
    }

    public final void a() {
        byte[] bArr = jf.c.f7250a;
        synchronized (this.f8285e) {
            if (b()) {
                this.f8285e.e(this);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<lf.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List<lf.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<lf.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.List<lf.a>, java.util.ArrayList] */
    public final boolean b() {
        a aVar = this.f8282b;
        if (aVar != null && aVar.f8279d) {
            this.f8284d = true;
        }
        boolean z = false;
        for (int size = this.f8283c.size() - 1; size >= 0; size--) {
            if (((a) this.f8283c.get(size)).f8279d) {
                a aVar2 = (a) this.f8283c.get(size);
                d.b bVar = d.f8288j;
                if (d.i.isLoggable(Level.FINE)) {
                    v.n(aVar2, this, "canceled");
                }
                this.f8283c.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(lf.a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            e6.e.D(r3, r0)
            lf.d r0 = r2.f8285e
            monitor-enter(r0)
            boolean r1 = r2.f8281a     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0040
            boolean r4 = r3.f8279d     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0026
            lf.d$b r4 = lf.d.f8288j     // Catch:{ all -> 0x004e }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x004e }
            java.util.logging.Logger r4 = lf.d.i     // Catch:{ all -> 0x004e }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x004e }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0024
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            ah.v.n(r3, r2, r4)     // Catch:{ all -> 0x004e }
        L_0x0024:
            monitor-exit(r0)
            return
        L_0x0026:
            lf.d$b r4 = lf.d.f8288j     // Catch:{ all -> 0x004e }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x004e }
            java.util.logging.Logger r4 = lf.d.i     // Catch:{ all -> 0x004e }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x004e }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            ah.v.n(r3, r2, r4)     // Catch:{ all -> 0x004e }
        L_0x003a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x004e }
            r3.<init>()     // Catch:{ all -> 0x004e }
            throw r3     // Catch:{ all -> 0x004e }
        L_0x0040:
            r1 = 0
            boolean r3 = r2.d(r3, r4, r1)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x004c
            lf.d r3 = r2.f8285e     // Catch:{ all -> 0x004e }
            r3.e(r2)     // Catch:{ all -> 0x004e }
        L_0x004c:
            monitor-exit(r0)
            return
        L_0x004e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.c.c(lf.a, long):void");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<lf.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r14v1, types: [java.util.List<lf.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.util.List<lf.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r12v2, types: [java.util.List<lf.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.util.List<lf.a>, java.util.ArrayList] */
    public final boolean d(a aVar, long j10, boolean z) {
        String str;
        e.D(aVar, "task");
        c cVar = aVar.f8276a;
        if (cVar != this) {
            if (cVar == null) {
                aVar.f8276a = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long nanoTime = this.f8285e.g.nanoTime();
        long j11 = nanoTime + j10;
        int indexOf = this.f8283c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f8277b <= j11) {
                d.b bVar = d.f8288j;
                if (d.i.isLoggable(Level.FINE)) {
                    v.n(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f8283c.remove(indexOf);
        }
        aVar.f8277b = j11;
        d.b bVar2 = d.f8288j;
        if (d.i.isLoggable(Level.FINE)) {
            if (z) {
                StringBuilder d10 = a.d("run again after ");
                d10.append(v.G(j11 - nanoTime));
                str = d10.toString();
            } else {
                StringBuilder d11 = a.d("scheduled after ");
                d11.append(v.G(j11 - nanoTime));
                str = d11.toString();
            }
            v.n(aVar, this, str);
        }
        Iterator it = this.f8283c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((a) it.next()).f8277b - nanoTime > j10) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f8283c.size();
        }
        this.f8283c.add(i, aVar);
        if (i == 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        byte[] bArr = jf.c.f7250a;
        synchronized (this.f8285e) {
            this.f8281a = true;
            if (b()) {
                this.f8285e.e(this);
            }
        }
    }

    public final String toString() {
        return this.f8286f;
    }
}
