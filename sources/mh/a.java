package mh;

public final class a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: fh.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: fh.m} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a.b a(hg.b r8) throws java.io.IOException {
        /*
            jg.a r0 = r8.f5970b
            ag.n r0 = r0.f7256a
            ag.n r1 = bg.a.f3021w
            java.lang.String r2 = r0.f425a
            java.lang.String r1 = r1.f425a
            int r3 = r2.length()
            int r4 = r1.length()
            r5 = 1
            r6 = 0
            if (r3 <= r4) goto L_0x002a
            int r3 = r1.length()
            char r3 = r2.charAt(r3)
            r4 = 46
            if (r3 != r4) goto L_0x002a
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x002a
            r1 = r5
            goto L_0x002b
        L_0x002a:
            r1 = r6
        L_0x002b:
            if (r1 == 0) goto L_0x004d
            ag.d r0 = r8.k()
            ag.o r0 = ag.o.s(r0)
            jh.a r1 = new jh.a
            jg.a r8 = r8.f5970b
            java.util.HashMap r2 = mh.e.i
            ag.n r8 = r8.f7256a
            java.lang.Object r8 = r2.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            byte[] r0 = r0.f430a
            r1.<init>(r8, r0)
            return r1
        L_0x004d:
            ag.n r1 = bg.a.f3001a
            boolean r1 = r0.m(r1)
            if (r1 == 0) goto L_0x0071
            lh.b r0 = new lh.b
            ag.d r1 = r8.k()
            ag.o r1 = ag.o.s(r1)
            byte[] r1 = r1.f430a
            jg.a r8 = r8.f5970b
            ag.d r8 = r8.f7257b
            fh.h r8 = fh.h.j(r8)
            java.lang.String r8 = mh.e.d(r8)
            r0.<init>(r1, r8)
            return r0
        L_0x0071:
            ag.n r1 = bg.a.z
            boolean r1 = r0.m(r1)
            if (r1 == 0) goto L_0x00a4
            ih.a r0 = new ih.a
            ag.d r8 = r8.k()
            ag.o r8 = ag.o.s(r8)
            byte[] r8 = r8.f430a
            int r1 = r8.length
            int r1 = r1 / 2
            short[] r2 = new short[r1]
        L_0x008a:
            if (r6 == r1) goto L_0x00a0
            int r3 = r6 * 2
            byte r4 = r8[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r5
            byte r3 = r8[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r3 = r3 | r4
            short r3 = (short) r3
            r2[r6] = r3
            int r6 = r6 + 1
            goto L_0x008a
        L_0x00a0:
            r0.<init>(r2)
            return r0
        L_0x00a4:
            ag.n r1 = hg.a.f5968a
            boolean r1 = r0.m(r1)
            if (r1 == 0) goto L_0x00ee
            ag.d r0 = r8.k()
            ag.o r0 = ag.o.s(r0)
            byte[] r0 = r0.f430a
            ag.n0 r8 = r8.f5973t
            int r1 = android.support.v4.media.b.F(r0, r6)
            r2 = 4
            if (r1 != r5) goto L_0x00e4
            if (r8 == 0) goto L_0x00da
            byte[] r8 = r8.s()
            int r1 = r0.length
            byte[] r0 = xh.a.d(r0, r2, r1)
            int r1 = r8.length
            byte[] r8 = xh.a.d(r8, r2, r1)
            gh.g r0 = gh.g.W0(r0)
            gh.h r8 = gh.h.S0(r8)
            r0.L = r8
            return r0
        L_0x00da:
            int r8 = r0.length
            byte[] r8 = xh.a.d(r0, r2, r8)
            gh.g r8 = gh.g.W0(r8)
            return r8
        L_0x00e4:
            int r8 = r0.length
            byte[] r8 = xh.a.d(r0, r2, r8)
            gh.b r8 = gh.b.S0(r8)
            return r8
        L_0x00ee:
            ag.n r1 = bg.a.f3005e
            boolean r1 = r0.m(r1)
            java.lang.String r2 = "ClassNotFoundException processing BDS state: "
            r3 = 0
            if (r1 == 0) goto L_0x01ac
            jg.a r0 = r8.f5970b
            ag.d r0 = r0.f7257b
            fh.i r0 = fh.i.j(r0)
            jg.a r1 = r0.f5175c
            ag.n r1 = r1.f7256a
            ag.d r8 = r8.k()
            boolean r4 = r8 instanceof fh.m
            if (r4 == 0) goto L_0x0111
            r3 = r8
            fh.m r3 = (fh.m) r3
            goto L_0x011c
        L_0x0111:
            if (r8 == 0) goto L_0x011c
            fh.m r3 = new fh.m
            ag.t r8 = ag.t.r(r8)
            r3.<init>(r8)
        L_0x011c:
            nh.u$a r8 = new nh.u$a     // Catch:{ ClassNotFoundException -> 0x0196 }
            nh.t r4 = new nh.t     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r0 = r0.f5174b     // Catch:{ ClassNotFoundException -> 0x0196 }
            lg.b r5 = mh.e.a(r1)     // Catch:{ ClassNotFoundException -> 0x0196 }
            java.lang.String r5 = r5.c()     // Catch:{ ClassNotFoundException -> 0x0196 }
            ag.n r5 = nh.f.b(r5)     // Catch:{ ClassNotFoundException -> 0x0196 }
            r4.<init>(r0, r5)     // Catch:{ ClassNotFoundException -> 0x0196 }
            r8.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r0 = r3.f5191b     // Catch:{ ClassNotFoundException -> 0x0196 }
            r8.f9134b = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = r3.f5192c     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = xh.a.a(r0)     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = nh.w.b(r0)     // Catch:{ ClassNotFoundException -> 0x0196 }
            r8.f9136d = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = r3.f5193s     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = xh.a.a(r0)     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = nh.w.b(r0)     // Catch:{ ClassNotFoundException -> 0x0196 }
            r8.f9137e = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = r3.f5194t     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = xh.a.a(r0)     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = nh.w.b(r0)     // Catch:{ ClassNotFoundException -> 0x0196 }
            r8.f9138f = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = r3.f5195u     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = xh.a.a(r0)     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = nh.w.b(r0)     // Catch:{ ClassNotFoundException -> 0x0196 }
            r8.g = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            int r0 = r3.f5190a     // Catch:{ ClassNotFoundException -> 0x0196 }
            if (r0 == 0) goto L_0x0170
            int r0 = r3.f5196v     // Catch:{ ClassNotFoundException -> 0x0196 }
            r8.f9135c = r0     // Catch:{ ClassNotFoundException -> 0x0196 }
        L_0x0170:
            byte[] r0 = r3.f5197w     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = xh.a.a(r0)     // Catch:{ ClassNotFoundException -> 0x0196 }
            if (r0 == 0) goto L_0x0190
            byte[] r0 = r3.f5197w     // Catch:{ ClassNotFoundException -> 0x0196 }
            byte[] r0 = xh.a.a(r0)     // Catch:{ ClassNotFoundException -> 0x0196 }
            java.lang.Class<nh.a> r3 = nh.a.class
            java.lang.Object r0 = nh.w.e(r0, r3)     // Catch:{ ClassNotFoundException -> 0x0196 }
            nh.a r0 = (nh.a) r0     // Catch:{ ClassNotFoundException -> 0x0196 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ ClassNotFoundException -> 0x0196 }
            nh.a r3 = new nh.a     // Catch:{ ClassNotFoundException -> 0x0196 }
            r3.<init>(r0, r1)     // Catch:{ ClassNotFoundException -> 0x0196 }
            r8.f9139h = r3     // Catch:{ ClassNotFoundException -> 0x0196 }
        L_0x0190:
            nh.u r0 = new nh.u     // Catch:{ ClassNotFoundException -> 0x0196 }
            r0.<init>(r8)     // Catch:{ ClassNotFoundException -> 0x0196 }
            return r0
        L_0x0196:
            r8 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = a.a.d(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x01ac:
            ag.n r1 = fh.e.g
            boolean r0 = r0.m(r1)
            if (r0 == 0) goto L_0x027a
            jg.a r0 = r8.f5970b
            ag.d r0 = r0.f7257b
            fh.j r0 = fh.j.j(r0)
            jg.a r1 = r0.f5179s
            ag.n r1 = r1.f7256a
            ag.d r8 = r8.k()     // Catch:{ ClassNotFoundException -> 0x0264 }
            boolean r4 = r8 instanceof fh.k     // Catch:{ ClassNotFoundException -> 0x0264 }
            if (r4 == 0) goto L_0x01cc
            r3 = r8
            fh.k r3 = (fh.k) r3     // Catch:{ ClassNotFoundException -> 0x0264 }
            goto L_0x01d7
        L_0x01cc:
            if (r8 == 0) goto L_0x01d7
            fh.k r3 = new fh.k     // Catch:{ ClassNotFoundException -> 0x0264 }
            ag.t r8 = ag.t.r(r8)     // Catch:{ ClassNotFoundException -> 0x0264 }
            r3.<init>(r8)     // Catch:{ ClassNotFoundException -> 0x0264 }
        L_0x01d7:
            nh.p$a r8 = new nh.p$a     // Catch:{ ClassNotFoundException -> 0x0264 }
            nh.o r4 = new nh.o     // Catch:{ ClassNotFoundException -> 0x0264 }
            int r5 = r0.f5177b     // Catch:{ ClassNotFoundException -> 0x0264 }
            int r0 = r0.f5178c     // Catch:{ ClassNotFoundException -> 0x0264 }
            lg.b r6 = mh.e.a(r1)     // Catch:{ ClassNotFoundException -> 0x0264 }
            java.lang.String r6 = r6.c()     // Catch:{ ClassNotFoundException -> 0x0264 }
            ag.n r6 = nh.f.b(r6)     // Catch:{ ClassNotFoundException -> 0x0264 }
            r4.<init>(r5, r0, r6)     // Catch:{ ClassNotFoundException -> 0x0264 }
            r8.<init>(r4)     // Catch:{ ClassNotFoundException -> 0x0264 }
            long r6 = r3.f5181b     // Catch:{ ClassNotFoundException -> 0x0264 }
            r8.f9114b = r6     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = r3.f5183s     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = xh.a.a(r0)     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = nh.w.b(r0)     // Catch:{ ClassNotFoundException -> 0x0264 }
            r8.f9116d = r0     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = r3.f5184t     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = xh.a.a(r0)     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = nh.w.b(r0)     // Catch:{ ClassNotFoundException -> 0x0264 }
            r8.f9117e = r0     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = r3.f5185u     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = xh.a.a(r0)     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = nh.w.b(r0)     // Catch:{ ClassNotFoundException -> 0x0264 }
            r8.f9118f = r0     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = r3.f5186v     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = xh.a.a(r0)     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = nh.w.b(r0)     // Catch:{ ClassNotFoundException -> 0x0264 }
            r8.g = r0     // Catch:{ ClassNotFoundException -> 0x0264 }
            int r0 = r3.f5180a     // Catch:{ ClassNotFoundException -> 0x0264 }
            if (r0 == 0) goto L_0x022d
            long r6 = r3.f5182c     // Catch:{ ClassNotFoundException -> 0x0264 }
            r8.f9115c = r6     // Catch:{ ClassNotFoundException -> 0x0264 }
        L_0x022d:
            byte[] r0 = r3.f5187w     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = xh.a.a(r0)     // Catch:{ ClassNotFoundException -> 0x0264 }
            if (r0 == 0) goto L_0x025e
            byte[] r0 = r3.f5187w     // Catch:{ ClassNotFoundException -> 0x0264 }
            byte[] r0 = xh.a.a(r0)     // Catch:{ ClassNotFoundException -> 0x0264 }
            java.lang.Class<nh.b> r3 = nh.b.class
            java.lang.Object r0 = nh.w.e(r0, r3)     // Catch:{ ClassNotFoundException -> 0x0264 }
            nh.b r0 = (nh.b) r0     // Catch:{ ClassNotFoundException -> 0x0264 }
            nh.b r0 = r0.b(r1)     // Catch:{ ClassNotFoundException -> 0x0264 }
            long r3 = r0.f9060b     // Catch:{ ClassNotFoundException -> 0x0264 }
            r6 = 0
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x025c
            nh.b r1 = new nh.b     // Catch:{ ClassNotFoundException -> 0x0264 }
            r3 = 1
            long r5 = r3 << r5
            long r5 = r5 - r3
            r1.<init>(r0, r5)     // Catch:{ ClassNotFoundException -> 0x0264 }
            r8.f9119h = r1     // Catch:{ ClassNotFoundException -> 0x0264 }
            goto L_0x025e
        L_0x025c:
            r8.f9119h = r0     // Catch:{ ClassNotFoundException -> 0x0264 }
        L_0x025e:
            nh.p r0 = new nh.p     // Catch:{ ClassNotFoundException -> 0x0264 }
            r0.<init>(r8)     // Catch:{ ClassNotFoundException -> 0x0264 }
            return r0
        L_0x0264:
            r8 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = a.a.d(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x027a:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "algorithm identifier in private key not recognised"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.a.a(hg.b):a.b");
    }
}
