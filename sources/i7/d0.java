package i7;

public class d0 {

    /* renamed from: a  reason: collision with root package name */
    public volatile q0 f6246a;

    /* renamed from: b  reason: collision with root package name */
    public volatile i f6247b;

    static {
        p.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i7.q0 a(i7.q0 r2) {
        /*
            r1 = this;
            i7.q0 r0 = r1.f6246a
            if (r0 == 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            monitor-enter(r1)
            i7.q0 r0 = r1.f6246a     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001a
        L_0x000c:
            r1.f6246a = r2     // Catch:{ a0 -> 0x0013 }
            i7.i$f r0 = i7.i.f6271b     // Catch:{ a0 -> 0x0013 }
            r1.f6247b = r0     // Catch:{ a0 -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f6246a = r2     // Catch:{ all -> 0x001d }
            i7.i$f r2 = i7.i.f6271b     // Catch:{ all -> 0x001d }
            r1.f6247b = r2     // Catch:{ all -> 0x001d }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x001a:
            i7.q0 r2 = r1.f6246a
            return r2
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.d0.a(i7.q0):i7.q0");
    }

    public final i b() {
        if (this.f6247b != null) {
            return this.f6247b;
        }
        synchronized (this) {
            if (this.f6247b != null) {
                i iVar = this.f6247b;
                return iVar;
            }
            if (this.f6246a == null) {
                this.f6247b = i.f6271b;
            } else {
                this.f6247b = this.f6246a.i();
            }
            i iVar2 = this.f6247b;
            return iVar2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        q0 q0Var = this.f6246a;
        q0 q0Var2 = d0Var.f6246a;
        if (q0Var == null && q0Var2 == null) {
            return b().equals(d0Var.b());
        }
        if (q0Var != null && q0Var2 != null) {
            return q0Var.equals(q0Var2);
        }
        if (q0Var != null) {
            return q0Var.equals(d0Var.a(q0Var.c()));
        }
        return a(q0Var2.c()).equals(q0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
