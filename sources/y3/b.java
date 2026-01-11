package y3;

import y3.d;

public final class b implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13435a;

    /* renamed from: b  reason: collision with root package name */
    public final d f13436b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f13437c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f13438d;

    /* renamed from: e  reason: collision with root package name */
    public d.a f13439e;

    /* renamed from: f  reason: collision with root package name */
    public d.a f13440f;

    public b(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f13439e = aVar;
        this.f13440f = aVar;
        this.f13435a = obj;
        this.f13436b = dVar;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f13435a) {
            if (!this.f13437c.a()) {
                if (!this.f13438d.a()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final boolean b(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        if (!this.f13437c.b(bVar.f13437c) || !this.f13438d.b(bVar.f13438d)) {
            return false;
        }
        return true;
    }

    public final boolean c(c cVar) {
        boolean z;
        boolean z10;
        synchronized (this.f13435a) {
            d dVar = this.f13436b;
            z = false;
            if (dVar != null) {
                if (!dVar.c(this)) {
                    z10 = false;
                    if (z10 && m(cVar)) {
                        z = true;
                    }
                }
            }
            z10 = true;
            z = true;
        }
        return z;
    }

    public final void clear() {
        synchronized (this.f13435a) {
            d.a aVar = d.a.CLEARED;
            this.f13439e = aVar;
            this.f13437c.clear();
            if (this.f13440f != aVar) {
                this.f13440f = aVar;
                this.f13438d.clear();
            }
        }
    }

    public final boolean d(c cVar) {
        boolean z;
        boolean z10;
        synchronized (this.f13435a) {
            d dVar = this.f13436b;
            z = false;
            if (dVar != null) {
                if (!dVar.d(this)) {
                    z10 = false;
                    if (z10 && m(cVar)) {
                        z = true;
                    }
                }
            }
            z10 = true;
            z = true;
        }
        return z;
    }

    public final boolean e(c cVar) {
        boolean z;
        boolean z10;
        synchronized (this.f13435a) {
            d dVar = this.f13436b;
            z = false;
            if (dVar != null) {
                if (!dVar.e(this)) {
                    z10 = false;
                    if (z10 && m(cVar)) {
                        z = true;
                    }
                }
            }
            z10 = true;
            z = true;
        }
        return z;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.f13435a) {
            d.a aVar = this.f13439e;
            d.a aVar2 = d.a.CLEARED;
            z = aVar == aVar2 && this.f13440f == aVar2;
        }
        return z;
    }

    public final d g() {
        d g;
        synchronized (this.f13435a) {
            d dVar = this.f13436b;
            g = dVar != null ? dVar.g() : this;
        }
        return g;
    }

    public final void h() {
        synchronized (this.f13435a) {
            d.a aVar = this.f13439e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar == aVar2) {
                this.f13439e = d.a.PAUSED;
                this.f13437c.h();
            }
            if (this.f13440f == aVar2) {
                this.f13440f = d.a.PAUSED;
                this.f13438d.h();
            }
        }
    }

    public final void i() {
        synchronized (this.f13435a) {
            d.a aVar = this.f13439e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar != aVar2) {
                this.f13439e = aVar2;
                this.f13437c.i();
            }
        }
    }

    public final boolean isRunning() {
        boolean z;
        synchronized (this.f13435a) {
            d.a aVar = this.f13439e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar != aVar2) {
                if (this.f13440f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final boolean j() {
        boolean z;
        synchronized (this.f13435a) {
            d.a aVar = this.f13439e;
            d.a aVar2 = d.a.SUCCESS;
            if (aVar != aVar2) {
                if (this.f13440f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(y3.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f13435a
            monitor-enter(r0)
            y3.c r1 = r2.f13438d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            y3.d$a r3 = y3.d.a.FAILED     // Catch:{ all -> 0x002b }
            r2.f13439e = r3     // Catch:{ all -> 0x002b }
            y3.d$a r3 = r2.f13440f     // Catch:{ all -> 0x002b }
            y3.d$a r1 = y3.d.a.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f13440f = r1     // Catch:{ all -> 0x002b }
            y3.c r3 = r2.f13438d     // Catch:{ all -> 0x002b }
            r3.i()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            y3.d$a r3 = y3.d.a.FAILED     // Catch:{ all -> 0x002b }
            r2.f13440f = r3     // Catch:{ all -> 0x002b }
            y3.d r3 = r2.f13436b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.k(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.b.k(y3.c):void");
    }

    public final void l(c cVar) {
        synchronized (this.f13435a) {
            if (cVar.equals(this.f13437c)) {
                this.f13439e = d.a.SUCCESS;
            } else if (cVar.equals(this.f13438d)) {
                this.f13440f = d.a.SUCCESS;
            }
            d dVar = this.f13436b;
            if (dVar != null) {
                dVar.l(this);
            }
        }
    }

    public final boolean m(c cVar) {
        return cVar.equals(this.f13437c) || (this.f13439e == d.a.FAILED && cVar.equals(this.f13438d));
    }
}
