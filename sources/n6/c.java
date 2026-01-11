package n6;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8927a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f8928b = new AtomicBoolean(false);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized boolean a() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f8928b     // Catch:{ all -> 0x002f }
            boolean r0 = r0.get()     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0018
            monitor-enter(r3)     // Catch:{ all -> 0x002f }
            java.util.HashMap r0 = r3.f8927a     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = "assetOnlyUpdates"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0015 }
            r0.put(r1, r2)     // Catch:{ all -> 0x0015 }
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            goto L_0x0018
        L_0x0015:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x0018:
            java.util.HashMap r0 = r3.f8927a     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "assetOnlyUpdates"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x002f }
            boolean r1 = r0 instanceof java.lang.Boolean     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0027
            r0 = 0
            monitor-exit(r3)
            return r0
        L_0x0027:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002f }
            monitor-exit(r3)
            return r0
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.c.a():boolean");
    }
}
