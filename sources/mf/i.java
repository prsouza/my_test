package mf;

import lf.a;

public final class i extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j f8658e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str) {
        super(str, true);
        this.f8658e = jVar;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List<java.lang.ref.Reference<mf.e>>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0077, code lost:
        r1 = r6.f8645c;
        e6.e.B(r1);
        jf.c.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r0.f8662d.isEmpty() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        r0.f8660b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r13 = this;
            mf.j r0 = r13.f8658e
            long r1 = java.lang.System.nanoTime()
            java.util.concurrent.ConcurrentLinkedQueue<mf.h> r3 = r0.f8662d
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = 0
            r6 = -9223372036854775808
            r7 = r6
            r6 = r5
            r5 = r4
        L_0x0013:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x003f
            java.lang.Object r9 = r3.next()
            mf.h r9 = (mf.h) r9
            java.lang.String r10 = "connection"
            e6.e.C(r9, r10)
            monitor-enter(r9)
            int r10 = r0.b(r9, r1)     // Catch:{ all -> 0x003c }
            if (r10 <= 0) goto L_0x002e
            int r5 = r5 + 1
            goto L_0x003a
        L_0x002e:
            int r4 = r4 + 1
            long r10 = r9.f8656p     // Catch:{ all -> 0x003c }
            long r10 = r1 - r10
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x003a
            r6 = r9
            r7 = r10
        L_0x003a:
            monitor-exit(r9)
            goto L_0x0013
        L_0x003c:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x003f:
            long r9 = r0.f8659a
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0054
            int r3 = r0.f8663e
            if (r4 <= r3) goto L_0x004a
            goto L_0x0054
        L_0x004a:
            if (r4 <= 0) goto L_0x004e
            long r9 = r9 - r7
            goto L_0x008c
        L_0x004e:
            if (r5 <= 0) goto L_0x0051
            goto L_0x008c
        L_0x0051:
            r9 = -1
            goto L_0x008c
        L_0x0054:
            e6.e.B(r6)
            monitor-enter(r6)
            java.util.List<java.lang.ref.Reference<mf.e>> r3 = r6.f8655o     // Catch:{ all -> 0x008d }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x008d }
            r4 = 1
            r3 = r3 ^ r4
            r9 = 0
            if (r3 == 0) goto L_0x0066
            monitor-exit(r6)
            goto L_0x008c
        L_0x0066:
            long r11 = r6.f8656p     // Catch:{ all -> 0x008d }
            long r11 = r11 + r7
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x006f
            monitor-exit(r6)
            goto L_0x008c
        L_0x006f:
            r6.i = r4     // Catch:{ all -> 0x008d }
            java.util.concurrent.ConcurrentLinkedQueue<mf.h> r1 = r0.f8662d     // Catch:{ all -> 0x008d }
            r1.remove(r6)     // Catch:{ all -> 0x008d }
            monitor-exit(r6)
            java.net.Socket r1 = r6.f8645c
            e6.e.B(r1)
            jf.c.e(r1)
            java.util.concurrent.ConcurrentLinkedQueue<mf.h> r1 = r0.f8662d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x008c
            lf.c r0 = r0.f8660b
            r0.a()
        L_0x008c:
            return r9
        L_0x008d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.i.a():long");
    }
}
