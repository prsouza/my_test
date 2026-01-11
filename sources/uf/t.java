package uf;

import e6.e;

public final class t implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f11980a;

    /* renamed from: b  reason: collision with root package name */
    public w f11981b;

    /* renamed from: c  reason: collision with root package name */
    public int f11982c;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11983s;

    /* renamed from: t  reason: collision with root package name */
    public long f11984t;

    /* renamed from: u  reason: collision with root package name */
    public final h f11985u;

    public t(h hVar) {
        e.D(hVar, "upstream");
        this.f11985u = hVar;
        e b10 = hVar.b();
        this.f11980a = b10;
        w wVar = b10.f11951a;
        this.f11981b = wVar;
        this.f11982c = wVar != null ? wVar.f11994b : -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r6.f11994b) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long I(uf.e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            e6.e.D(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L_0x000f
            r5 = r4
            goto L_0x0010
        L_0x000f:
            r5 = r3
        L_0x0010:
            if (r5 == 0) goto L_0x0085
            boolean r5 = r8.f11983s
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0079
            uf.w r5 = r8.f11981b
            if (r5 == 0) goto L_0x002a
            uf.e r6 = r8.f11980a
            uf.w r6 = r6.f11951a
            if (r5 != r6) goto L_0x002b
            int r5 = r8.f11982c
            e6.e.B(r6)
            int r6 = r6.f11994b
            if (r5 != r6) goto L_0x002b
        L_0x002a:
            r3 = r4
        L_0x002b:
            if (r3 == 0) goto L_0x006d
            if (r2 != 0) goto L_0x0030
            return r0
        L_0x0030:
            uf.h r0 = r8.f11985u
            long r1 = r8.f11984t
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.v(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            uf.w r0 = r8.f11981b
            if (r0 != 0) goto L_0x0053
            uf.e r0 = r8.f11980a
            uf.w r0 = r0.f11951a
            if (r0 == 0) goto L_0x0053
            r8.f11981b = r0
            e6.e.B(r0)
            int r0 = r0.f11994b
            r8.f11982c = r0
        L_0x0053:
            uf.e r0 = r8.f11980a
            long r0 = r0.f11952b
            long r2 = r8.f11984t
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            uf.e r2 = r8.f11980a
            long r4 = r8.f11984t
            r3 = r9
            r6 = r10
            r2.w(r3, r4, r6)
            long r0 = r8.f11984t
            long r0 = r0 + r10
            r8.f11984t = r0
            return r10
        L_0x006d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0079:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0085:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = android.support.v4.media.a.d(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.t.I(uf.e, long):long");
    }

    public final void close() {
        this.f11983s = true;
    }

    public final c0 d() {
        return this.f11985u.d();
    }
}
