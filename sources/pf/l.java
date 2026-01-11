package pf;

import java.util.List;
import lf.a;

public final class l extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f9990e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f9991f;
    public final /* synthetic */ List g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str, f fVar, int i, List list) {
        super(str, true);
        this.f9990e = fVar;
        this.f9991f = i;
        this.g = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r3 = this;
            pf.f r0 = r3.f9990e
            ge.g0 r0 = r0.A
            java.util.List r1 = r3.g
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "requestHeaders"
            e6.e.D(r1, r0)
            pf.f r0 = r3.f9990e     // Catch:{ IOException -> 0x002e }
            pf.r r0 = r0.N     // Catch:{ IOException -> 0x002e }
            int r1 = r3.f9991f     // Catch:{ IOException -> 0x002e }
            pf.b r2 = pf.b.CANCEL     // Catch:{ IOException -> 0x002e }
            r0.w(r1, r2)     // Catch:{ IOException -> 0x002e }
            pf.f r0 = r3.f9990e     // Catch:{ IOException -> 0x002e }
            monitor-enter(r0)     // Catch:{ IOException -> 0x002e }
            pf.f r1 = r3.f9990e     // Catch:{ all -> 0x002b }
            java.util.Set<java.lang.Integer> r1 = r1.P     // Catch:{ all -> 0x002b }
            int r2 = r3.f9991f     // Catch:{ all -> 0x002b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x002b }
            r1.remove(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            goto L_0x002e
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            throw r1     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.l.a():long");
    }
}
