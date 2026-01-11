package y3;

import y3.d;

public final class i implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final d f13464a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13465b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f13466c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f13467d;

    /* renamed from: e  reason: collision with root package name */
    public d.a f13468e;

    /* renamed from: f  reason: collision with root package name */
    public d.a f13469f;
    public boolean g;

    public i(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f13468e = aVar;
        this.f13469f = aVar;
        this.f13465b = obj;
        this.f13464a = dVar;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f13465b) {
            if (!this.f13467d.a()) {
                if (!this.f13466c.a()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(y3.c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof y3.i
            r1 = 0
            if (r0 == 0) goto L_0x002e
            y3.i r4 = (y3.i) r4
            y3.c r0 = r3.f13466c
            if (r0 != 0) goto L_0x0010
            y3.c r0 = r4.f13466c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            y3.c r0 = r3.f13466c
            y3.c r2 = r4.f13466c
            boolean r0 = r0.b(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            y3.c r0 = r3.f13467d
            if (r0 != 0) goto L_0x0023
            y3.c r4 = r4.f13467d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            y3.c r0 = r3.f13467d
            y3.c r4 = r4.f13467d
            boolean r4 = r0.b(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.i.b(y3.c):boolean");
    }

    public final boolean c(c cVar) {
        boolean z;
        boolean z10;
        synchronized (this.f13465b) {
            d dVar = this.f13464a;
            z = false;
            if (dVar != null) {
                if (!dVar.c(this)) {
                    z10 = false;
                    if (z10 && cVar.equals(this.f13466c) && this.f13468e != d.a.PAUSED) {
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
        synchronized (this.f13465b) {
            this.g = false;
            d.a aVar = d.a.CLEARED;
            this.f13468e = aVar;
            this.f13469f = aVar;
            this.f13467d.clear();
            this.f13466c.clear();
        }
    }

    public final boolean d(c cVar) {
        boolean z;
        boolean z10;
        synchronized (this.f13465b) {
            d dVar = this.f13464a;
            z = false;
            if (dVar != null) {
                if (!dVar.d(this)) {
                    z10 = false;
                    if (z10 && (cVar.equals(this.f13466c) || this.f13468e != d.a.SUCCESS)) {
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
        synchronized (this.f13465b) {
            d dVar = this.f13464a;
            z = false;
            if (dVar != null) {
                if (!dVar.e(this)) {
                    z10 = false;
                    if (z10 && cVar.equals(this.f13466c) && !a()) {
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
        synchronized (this.f13465b) {
            z = this.f13468e == d.a.CLEARED;
        }
        return z;
    }

    public final d g() {
        d g8;
        synchronized (this.f13465b) {
            d dVar = this.f13464a;
            g8 = dVar != null ? dVar.g() : this;
        }
        return g8;
    }

    public final void h() {
        synchronized (this.f13465b) {
            if (!this.f13469f.isComplete()) {
                this.f13469f = d.a.PAUSED;
                this.f13467d.h();
            }
            if (!this.f13468e.isComplete()) {
                this.f13468e = d.a.PAUSED;
                this.f13466c.h();
            }
        }
    }

    public final void i() {
        d.a aVar;
        d.a aVar2;
        synchronized (this.f13465b) {
            this.g = true;
            try {
                if (!(this.f13468e == d.a.SUCCESS || this.f13469f == (aVar2 = d.a.RUNNING))) {
                    this.f13469f = aVar2;
                    this.f13467d.i();
                }
                if (this.g && this.f13468e != (aVar = d.a.RUNNING)) {
                    this.f13468e = aVar;
                    this.f13466c.i();
                }
            } finally {
                this.g = false;
            }
        }
    }

    public final boolean isRunning() {
        boolean z;
        synchronized (this.f13465b) {
            z = this.f13468e == d.a.RUNNING;
        }
        return z;
    }

    public final boolean j() {
        boolean z;
        synchronized (this.f13465b) {
            z = this.f13468e == d.a.SUCCESS;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(y3.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f13465b
            monitor-enter(r0)
            y3.c r1 = r2.f13466c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            y3.d$a r3 = y3.d.a.FAILED     // Catch:{ all -> 0x001e }
            r2.f13469f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            y3.d$a r3 = y3.d.a.FAILED     // Catch:{ all -> 0x001e }
            r2.f13468e = r3     // Catch:{ all -> 0x001e }
            y3.d r3 = r2.f13464a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.k(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.i.k(y3.c):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(y3.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f13465b
            monitor-enter(r0)
            y3.c r1 = r2.f13467d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            y3.d$a r3 = y3.d.a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f13469f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            y3.d$a r3 = y3.d.a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f13468e = r3     // Catch:{ all -> 0x002b }
            y3.d r3 = r2.f13464a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.l(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            y3.d$a r3 = r2.f13469f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.isComplete()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            y3.c r3 = r2.f13467d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.i.l(y3.c):void");
    }
}
