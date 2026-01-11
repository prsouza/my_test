package ge;

import a.b;
import e6.e;
import me.g;
import pd.d;

public abstract class m0<T> extends g {

    /* renamed from: c  reason: collision with root package name */
    public int f5430c;

    public m0(int i) {
        this.f5430c = i;
    }

    public void a(Object obj, Throwable th2) {
    }

    public abstract d<T> b();

    public Throwable c(Object obj) {
        t tVar = obj instanceof t ? (t) obj : null;
        if (tVar == null) {
            return null;
        }
        return tVar.f5447a;
    }

    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(Throwable th2, Throwable th3) {
        if (th2 != null || th3 != null) {
            if (!(th2 == null || th3 == null)) {
                b.D(th2, th3);
            }
            if (th2 == null) {
                th2 = th3;
            }
            e.B(th2);
            g.a(b().getContext(), new f0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
        }
    }

    public abstract Object h();

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r4.n0() != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        if (r4.n0() != false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            me.h r0 = r10.f8581b
            pd.d r1 = r10.b()     // Catch:{ all -> 0x0095 }
            le.e r1 = (le.e) r1     // Catch:{ all -> 0x0095 }
            pd.d<T> r2 = r1.f8238t     // Catch:{ all -> 0x0095 }
            java.lang.Object r1 = r1.f8240v     // Catch:{ all -> 0x0095 }
            pd.f r3 = r2.getContext()     // Catch:{ all -> 0x0095 }
            java.lang.Object r1 = le.t.b(r3, r1)     // Catch:{ all -> 0x0095 }
            le.r r4 = le.t.f8267a     // Catch:{ all -> 0x0095 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            ge.c2 r4 = ge.y.d(r2, r3, r1)     // Catch:{ all -> 0x0095 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            pd.f r6 = r2.getContext()     // Catch:{ all -> 0x0040 }
            java.lang.Object r7 = r10.h()     // Catch:{ all -> 0x0040 }
            java.lang.Throwable r8 = r10.c(r7)     // Catch:{ all -> 0x0040 }
            if (r8 != 0) goto L_0x0042
            int r9 = r10.f5430c     // Catch:{ all -> 0x0040 }
            boolean r9 = a.b.l0(r9)     // Catch:{ all -> 0x0040 }
            if (r9 == 0) goto L_0x0042
            int r9 = ge.g1.f5400e     // Catch:{ all -> 0x0040 }
            ge.g1$b r9 = ge.g1.b.f5401a     // Catch:{ all -> 0x0040 }
            pd.f$a r6 = r6.get(r9)     // Catch:{ all -> 0x0040 }
            ge.g1 r6 = (ge.g1) r6     // Catch:{ all -> 0x0040 }
            goto L_0x0043
        L_0x0040:
            r2 = move-exception
            goto L_0x0089
        L_0x0042:
            r6 = r5
        L_0x0043:
            if (r6 == 0) goto L_0x005a
            boolean r9 = r6.a()     // Catch:{ all -> 0x0040 }
            if (r9 != 0) goto L_0x005a
            java.util.concurrent.CancellationException r6 = r6.S()     // Catch:{ all -> 0x0040 }
            r10.a(r7, r6)     // Catch:{ all -> 0x0040 }
            java.lang.Object r6 = l6.b1.k(r6)     // Catch:{ all -> 0x0040 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0040 }
            goto L_0x006b
        L_0x005a:
            if (r8 == 0) goto L_0x0064
            java.lang.Object r6 = l6.b1.k(r8)     // Catch:{ all -> 0x0040 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0040 }
            goto L_0x006b
        L_0x0064:
            java.lang.Object r6 = r10.e(r7)     // Catch:{ all -> 0x0040 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0040 }
        L_0x006b:
            md.m r2 = md.m.f8555a     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0075
            boolean r4 = r4.n0()     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x0078
        L_0x0075:
            le.t.a(r3, r1)     // Catch:{ all -> 0x0095 }
        L_0x0078:
            r0.a()     // Catch:{ all -> 0x007c }
            goto L_0x0081
        L_0x007c:
            r0 = move-exception
            java.lang.Object r2 = l6.b1.k(r0)
        L_0x0081:
            java.lang.Throwable r0 = md.g.a(r2)
            r10.f(r5, r0)
            goto L_0x00a8
        L_0x0089:
            if (r4 == 0) goto L_0x0091
            boolean r4 = r4.n0()     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x0094
        L_0x0091:
            le.t.a(r3, r1)     // Catch:{ all -> 0x0095 }
        L_0x0094:
            throw r2     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r1 = move-exception
            r0.a()     // Catch:{ all -> 0x009c }
            md.m r0 = md.m.f8555a     // Catch:{ all -> 0x009c }
            goto L_0x00a1
        L_0x009c:
            r0 = move-exception
            java.lang.Object r0 = l6.b1.k(r0)
        L_0x00a1:
            java.lang.Throwable r0 = md.g.a(r0)
            r10.f(r1, r0)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.m0.run():void");
    }
}
