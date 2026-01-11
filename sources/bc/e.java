package bc;

import pd.d;

public abstract class e implements f {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object c(bc.e r8, long r9, pd.d r11) {
        /*
            boolean r0 = r11 instanceof bc.c
            if (r0 == 0) goto L_0x0013
            r0 = r11
            bc.c r0 = (bc.c) r0
            int r1 = r0.f2958c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2958c = r1
            goto L_0x0018
        L_0x0013:
            bc.c r0 = new bc.c
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f2956a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f2958c
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            l6.b1.w(r11)
            goto L_0x00b7
        L_0x0028:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0030:
            l6.b1.w(r11)
            ld.a$a r8 = (ld.a.C0147a) r8
            bc.i r11 = r8.a()
            if (r11 != 0) goto L_0x00c2
            r11 = 7
            r2 = 0
            r4 = 0
            ie.e r11 = aa.b.c(r2, r4, r11)
            bc.d r5 = new bc.d
            r5.<init>(r8, r11, r4)
            r0.f2958c = r3
            r6 = 0
            int r8 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00ba
            ge.a2 r8 = new ge.a2
            r8.<init>(r9, r0)
            pd.d<T> r9 = r8.f8264c
            pd.f r9 = r9.getContext()
            ge.j0 r9 = c3.k.n0(r9)
            long r10 = r8.f5365s
            pd.f r0 = r8.f5361b
            ge.q0 r9 = r9.s(r10, r8, r0)
            ge.s0 r10 = new ge.s0
            r10.<init>(r9)
            r8.Q(r10)
            r9 = 2
            yd.x.a(r5, r9)     // Catch:{ all -> 0x0077 }
            java.lang.Object r9 = r5.invoke(r8, r8)     // Catch:{ all -> 0x0077 }
            goto L_0x007e
        L_0x0077:
            r9 = move-exception
            ge.t r10 = new ge.t
            r10.<init>(r9)
            r9 = r10
        L_0x007e:
            qd.a r10 = qd.a.COROUTINE_SUSPENDED
            if (r9 != r10) goto L_0x0083
            goto L_0x008b
        L_0x0083:
            java.lang.Object r11 = r8.V(r9)
            le.r r0 = a.b.f5s
            if (r11 != r0) goto L_0x008d
        L_0x008b:
            r11 = r10
            goto L_0x00b4
        L_0x008d:
            boolean r10 = r11 instanceof ge.t
            if (r10 == 0) goto L_0x00af
            ge.t r11 = (ge.t) r11
            java.lang.Throwable r10 = r11.f5447a
            boolean r11 = r10 instanceof ge.z1
            if (r11 == 0) goto L_0x00a2
            r11 = r10
            ge.z1 r11 = (ge.z1) r11
            ge.g1 r11 = r11.f5477a
            if (r11 == r8) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r3 = r2
        L_0x00a2:
            if (r3 != 0) goto L_0x00ae
            boolean r8 = r9 instanceof ge.t
            if (r8 != 0) goto L_0x00a9
            goto L_0x00b3
        L_0x00a9:
            ge.t r9 = (ge.t) r9
            java.lang.Throwable r8 = r9.f5447a
            throw r8
        L_0x00ae:
            throw r10
        L_0x00af:
            java.lang.Object r9 = a.b.R0(r11)
        L_0x00b3:
            r11 = r9
        L_0x00b4:
            if (r11 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            bc.i r11 = (bc.i) r11
            goto L_0x00c2
        L_0x00ba:
            ge.z1 r8 = new ge.z1
            java.lang.String r9 = "Timed out immediately"
            r8.<init>(r9, r4)
            throw r8
        L_0x00c2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.e.c(bc.e, long, pd.d):java.lang.Object");
    }

    public final Object b(long j10, d dVar) {
        return c(this, j10, dVar);
    }
}
