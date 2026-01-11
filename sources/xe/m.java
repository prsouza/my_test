package xe;

import p4.d;
import xd.l;
import yd.h;

public final class m extends h implements l<d, j> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f13215b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(d dVar) {
        super(1);
        this.f13215b = dVar;
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [java.util.HashMap, java.util.Map<java.lang.Integer, xd.l<p4.d, xe.p>>] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00a3, code lost:
        if (r2 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            p4.d r1 = (p4.d) r1
            java.lang.String r2 = "it"
            e6.e.D(r1, r2)
            xe.j r1 = new xe.j
            p4.d r2 = r0.f13215b
            int r4 = a.b.R(r2)
            p4.d r2 = r0.f13215b
            int r5 = a.b.R(r2)
            p4.d r2 = r0.f13215b
            long r6 = a.b.S(r2)
            p4.d r2 = r0.f13215b
            int r2 = a.b.R(r2)
            xe.i[] r3 = xe.i.values()
            int r8 = r3.length
            r9 = 0
            r10 = r9
        L_0x002c:
            if (r10 >= r8) goto L_0x00f3
            r11 = r3[r10]
            int r12 = r11.f13207a
            r13 = 1
            if (r12 != r2) goto L_0x0037
            r12 = r13
            goto L_0x0038
        L_0x0037:
            r12 = r9
        L_0x0038:
            if (r12 == 0) goto L_0x00ef
            r9 = 0
            r10 = 16
            r3 = r1
            r8 = r11
            r3.<init>(r4, r5, r6, r8, r9, r10)
            xe.b r2 = xe.c.f13183a
            int r3 = r1.f13208a
            java.util.Map<java.lang.Integer, xd.l<p4.d, xe.p>> r2 = r2.f13171a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            xd.l r2 = (xd.l) r2
            if (r2 == 0) goto L_0x00a6
            p4.b r3 = new p4.b
            r3.<init>()
            p4.d r4 = r0.f13215b
            byte[] r4 = a.b.I(r4)
            int r5 = r4.length
            k4.b r15 = r3.a(r4, r13)
            r18 = 0
            r22 = 0
            int r21 = r5 + 0
            int r5 = r3.f5820b
            int r6 = r3.f5821c
            m4.a r8 = r3.f5819a
            java.util.Objects.requireNonNull(r8)
            m4.a r17 = new m4.a
            h4.c$a r3 = h4.c.a.INTERN_FIELD_NAMES
            boolean r9 = r3.enabledIn(r5)
            int r10 = r8.f8471c
            h4.c$a r3 = h4.c.a.FAIL_ON_SYMBOL_HASH_OVERFLOW
            boolean r11 = r3.enabledIn(r5)
            java.util.concurrent.atomic.AtomicReference<m4.a$a> r3 = r8.f8470b
            java.lang.Object r3 = r3.get()
            r12 = r3
            m4.a$a r12 = (m4.a.C0156a) r12
            r7 = r17
            r7.<init>(r8, r9, r10, r11, r12)
            p4.d r3 = new p4.d
            r14 = r3
            r16 = r6
            r19 = r4
            r20 = r22
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r2 = r2.k(r3)
            xe.p r2 = (xe.p) r2
            if (r2 == 0) goto L_0x00a6
            goto L_0x00b2
        L_0x00a6:
            p4.d r2 = r0.f13215b
            xe.a r3 = new xe.a
            byte[] r2 = a.b.I(r2)
            r3.<init>(r2)
            r2 = r3
        L_0x00b2:
            r1.f13212e = r2
            xe.i r2 = r1.f13211d
            xe.i r3 = xe.i.NoCRC
            if (r2 == r3) goto L_0x00ee
            p4.d r2 = r0.f13215b
            byte[] r2 = a.b.I(r2)
            xe.i r3 = r1.f13211d
            int r3 = r3.ordinal()
            r4 = 2
            if (r3 == r13) goto L_0x00d3
            if (r3 == r4) goto L_0x00cc
            goto L_0x00e3
        L_0x00cc:
            ui.d r3 = new ui.d
            r4 = 4
            r3.<init>(r4)
            goto L_0x00d8
        L_0x00d3:
            ui.d r3 = new ui.d
            r3.<init>(r4)
        L_0x00d8:
            l6.b1.h(r1, r3)
            byte[] r3 = r3.a()
            boolean r13 = java.util.Arrays.equals(r3, r2)
        L_0x00e3:
            if (r13 == 0) goto L_0x00e6
            goto L_0x00ee
        L_0x00e6:
            xe.l r1 = new xe.l
            java.lang.String r2 = "wrong crc"
            r1.<init>(r2)
            throw r1
        L_0x00ee:
            return r1
        L_0x00ef:
            int r10 = r10 + 1
            goto L_0x002c
        L_0x00f3:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Array contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.m.k(java.lang.Object):java.lang.Object");
    }
}
