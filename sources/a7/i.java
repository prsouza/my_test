package a7;

import h7.a0;
import h7.c0;
import i7.x;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Objects;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final c0.b f150a;

    public i(c0.b bVar) {
        this.f150a = bVar;
    }

    public static int e() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b10 = 0;
        while (b10 == 0) {
            secureRandom.nextBytes(bArr);
            b10 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b10;
    }

    public static i f(h hVar) {
        c0 c0Var = hVar.f149a;
        Objects.requireNonNull(c0Var);
        x.a aVar = (x.a) c0Var.o(x.f.NEW_BUILDER);
        aVar.n(c0Var);
        return new i((c0.b) aVar);
    }

    @Deprecated
    public final synchronized int a(a0 a0Var) throws GeneralSecurityException {
        c0.c d10;
        d10 = d(a0Var);
        c0.b bVar = this.f150a;
        bVar.m();
        c0.y((c0) bVar.f6389b, d10);
        return d10.C();
    }

    public final synchronized h b() throws GeneralSecurityException {
        return h.a((c0) this.f150a.k());
    }

    public final synchronized boolean c(int i) {
        for (T C : Collections.unmodifiableList(((c0) this.f150a.f6389b).B())) {
            if (C.C() == i) {
                return true;
            }
        }
        return false;
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized h7.c0.c d(h7.a0 r5) throws java.security.GeneralSecurityException {
        /*
            r4 = this;
            monitor-enter(r4)
            h7.y r0 = a7.q.e(r5)     // Catch:{ all -> 0x0059 }
            monitor-enter(r4)     // Catch:{ all -> 0x0059 }
            int r1 = e()     // Catch:{ all -> 0x0056 }
        L_0x000a:
            boolean r2 = r4.c(r1)     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0015
            int r1 = e()     // Catch:{ all -> 0x0056 }
            goto L_0x000a
        L_0x0015:
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            h7.i0 r5 = r5.B()     // Catch:{ all -> 0x0059 }
            h7.i0 r2 = h7.i0.UNKNOWN_PREFIX     // Catch:{ all -> 0x0059 }
            if (r5 != r2) goto L_0x0020
            h7.i0 r5 = h7.i0.TINK     // Catch:{ all -> 0x0059 }
        L_0x0020:
            h7.c0$c$a r2 = h7.c0.c.G()     // Catch:{ all -> 0x0059 }
            r2.m()     // Catch:{ all -> 0x0059 }
            MessageType r3 = r2.f6389b     // Catch:{ all -> 0x0059 }
            h7.c0$c r3 = (h7.c0.c) r3     // Catch:{ all -> 0x0059 }
            h7.c0.c.x(r3, r0)     // Catch:{ all -> 0x0059 }
            r2.m()     // Catch:{ all -> 0x0059 }
            MessageType r0 = r2.f6389b     // Catch:{ all -> 0x0059 }
            h7.c0$c r0 = (h7.c0.c) r0     // Catch:{ all -> 0x0059 }
            h7.c0.c.A(r0, r1)     // Catch:{ all -> 0x0059 }
            h7.z r0 = h7.z.ENABLED     // Catch:{ all -> 0x0059 }
            r2.m()     // Catch:{ all -> 0x0059 }
            MessageType r1 = r2.f6389b     // Catch:{ all -> 0x0059 }
            h7.c0$c r1 = (h7.c0.c) r1     // Catch:{ all -> 0x0059 }
            h7.c0.c.z(r1, r0)     // Catch:{ all -> 0x0059 }
            r2.m()     // Catch:{ all -> 0x0059 }
            MessageType r0 = r2.f6389b     // Catch:{ all -> 0x0059 }
            h7.c0$c r0 = (h7.c0.c) r0     // Catch:{ all -> 0x0059 }
            h7.c0.c.y(r0, r5)     // Catch:{ all -> 0x0059 }
            i7.x r5 = r2.k()     // Catch:{ all -> 0x0059 }
            h7.c0$c r5 = (h7.c0.c) r5     // Catch:{ all -> 0x0059 }
            monitor-exit(r4)
            return r5
        L_0x0056:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            throw r5     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.i.d(h7.a0):h7.c0$c");
    }
}
