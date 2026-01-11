package s8;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f10996a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10997b;

    public /* synthetic */ d(e eVar, boolean z) {
        this.f10996a = eVar;
        this.f10997b = z;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.HashSet, java.util.Set<t8.a>] */
    /* JADX WARNING: type inference failed for: r2v13, types: [java.util.HashSet, java.util.Set<t8.a>] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r6 = this;
            s8.e r0 = r6.f10996a
            boolean r1 = r6.f10997b
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r2 = s8.e.f10998m
            monitor-enter(r2)
            k7.d r3 = r0.f11000a     // Catch:{ all -> 0x00e1 }
            r3.a()     // Catch:{ all -> 0x00e1 }
            android.content.Context r3 = r3.f7453a     // Catch:{ all -> 0x00e1 }
            i3.t r3 = i3.t.a(r3)     // Catch:{ all -> 0x00e1 }
            u8.c r4 = r0.f11002c     // Catch:{ all -> 0x00da }
            u8.d r4 = r4.c()     // Catch:{ all -> 0x00da }
            if (r3 == 0) goto L_0x0020
            r3.c()     // Catch:{ all -> 0x00e1 }
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x00e1 }
            boolean r3 = r4.h()     // Catch:{ g -> 0x00d5 }
            if (r3 != 0) goto L_0x0045
            r3 = r4
            u8.a r3 = (u8.a) r3     // Catch:{ g -> 0x00d5 }
            u8.c$a r3 = r3.f11729c     // Catch:{ g -> 0x00d5 }
            u8.c$a r5 = u8.c.a.UNREGISTERED     // Catch:{ g -> 0x00d5 }
            if (r3 != r5) goto L_0x0032
            r3 = 1
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            if (r3 == 0) goto L_0x0036
            goto L_0x0045
        L_0x0036:
            if (r1 != 0) goto L_0x0040
            s8.m r1 = r0.f11003d     // Catch:{ g -> 0x00d5 }
            boolean r1 = r1.d(r4)     // Catch:{ g -> 0x00d5 }
            if (r1 == 0) goto L_0x00d9
        L_0x0040:
            u8.d r1 = r0.c(r4)     // Catch:{ g -> 0x00d5 }
            goto L_0x0049
        L_0x0045:
            u8.d r1 = r0.j(r4)     // Catch:{ g -> 0x00d5 }
        L_0x0049:
            monitor-enter(r2)
            k7.d r3 = r0.f11000a     // Catch:{ all -> 0x00d2 }
            r3.a()     // Catch:{ all -> 0x00d2 }
            android.content.Context r3 = r3.f7453a     // Catch:{ all -> 0x00d2 }
            i3.t r3 = i3.t.a(r3)     // Catch:{ all -> 0x00d2 }
            u8.c r5 = r0.f11002c     // Catch:{ all -> 0x00cb }
            r5.b(r1)     // Catch:{ all -> 0x00cb }
            if (r3 == 0) goto L_0x005f
            r3.c()     // Catch:{ all -> 0x00d2 }
        L_0x005f:
            monitor-exit(r2)     // Catch:{ all -> 0x00d2 }
            monitor-enter(r0)
            java.util.Set<t8.a> r2 = r0.f11008k     // Catch:{ all -> 0x00c8 }
            int r2 = r2.size()     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x008e
            u8.a r4 = (u8.a) r4     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = r4.f11728b     // Catch:{ all -> 0x00c8 }
            r3 = r1
            u8.a r3 = (u8.a) r3     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = r3.f11728b     // Catch:{ all -> 0x00c8 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x00c8 }
            if (r2 != 0) goto L_0x008e
            java.util.Set<t8.a> r2 = r0.f11008k     // Catch:{ all -> 0x00c8 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00c8 }
        L_0x007e:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00c8 }
            if (r3 == 0) goto L_0x008e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00c8 }
            t8.a r3 = (t8.a) r3     // Catch:{ all -> 0x00c8 }
            r3.a()     // Catch:{ all -> 0x00c8 }
            goto L_0x007e
        L_0x008e:
            monitor-exit(r0)
            boolean r2 = r1.j()
            if (r2 == 0) goto L_0x00a2
            r2 = r1
            u8.a r2 = (u8.a) r2
            java.lang.String r2 = r2.f11728b
            monitor-enter(r0)
            r0.f11007j = r2     // Catch:{ all -> 0x009f }
            monitor-exit(r0)
            goto L_0x00a2
        L_0x009f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00a2:
            boolean r2 = r1.h()
            if (r2 == 0) goto L_0x00b3
            s8.g r1 = new s8.g
            s8.g$a r2 = s8.g.a.BAD_CONFIG
            r1.<init>()
            r0.k(r1)
            goto L_0x00d9
        L_0x00b3:
            boolean r2 = r1.i()
            if (r2 == 0) goto L_0x00c4
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.k(r1)
            goto L_0x00d9
        L_0x00c4:
            r0.l(r1)
            goto L_0x00d9
        L_0x00c8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00cb:
            r0 = move-exception
            if (r3 == 0) goto L_0x00d1
            r3.c()     // Catch:{ all -> 0x00d2 }
        L_0x00d1:
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d2 }
            throw r0
        L_0x00d5:
            r1 = move-exception
            r0.k(r1)
        L_0x00d9:
            return
        L_0x00da:
            r0 = move-exception
            if (r3 == 0) goto L_0x00e0
            r3.c()     // Catch:{ all -> 0x00e1 }
        L_0x00e0:
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.d.run():void");
    }
}
