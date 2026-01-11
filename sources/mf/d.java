package mf;

import com.google.android.gms.common.internal.ImagesContract;
import e6.e;
import java.io.IOException;
import mf.l;
import p002if.a;
import p002if.d0;
import p002if.n;
import p002if.r;
import pf.b;
import pf.v;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public l.a f8617a;

    /* renamed from: b  reason: collision with root package name */
    public l f8618b;

    /* renamed from: c  reason: collision with root package name */
    public int f8619c;

    /* renamed from: d  reason: collision with root package name */
    public int f8620d;

    /* renamed from: e  reason: collision with root package name */
    public int f8621e;

    /* renamed from: f  reason: collision with root package name */
    public d0 f8622f;
    public final j g;

    /* renamed from: h  reason: collision with root package name */
    public final a f8623h;
    public final e i;

    /* renamed from: j  reason: collision with root package name */
    public final n f8624j;

    public d(j jVar, a aVar, e eVar, n nVar) {
        e.D(jVar, "connectionPool");
        e.D(nVar, "eventListener");
        this.g = jVar;
        this.f8623h = aVar;
        this.i = eVar;
        this.f8624j = nVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r2v31, types: [java.util.List<if.d0>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r8v8, types: [java.util.List<if.d0>, java.util.ArrayList] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02f6 A[SYNTHETIC] */
    public final mf.h a(int r15, int r16, int r17, boolean r18, boolean r19) throws java.io.IOException {
        /*
            r14 = this;
            r1 = r14
        L_0x0001:
            mf.e r0 = r1.i
            boolean r0 = r0.B
            if (r0 != 0) goto L_0x033c
            mf.e r0 = r1.i
            mf.h r2 = r0.f8631v
            r0 = 0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0059
            monitor-enter(r2)
            boolean r5 = r2.i     // Catch:{ all -> 0x0056 }
            if (r5 != 0) goto L_0x0024
            if.d0 r5 = r2.f8657q     // Catch:{ all -> 0x0056 }
            if.a r5 = r5.f6493a     // Catch:{ all -> 0x0056 }
            if.r r5 = r5.f6443a     // Catch:{ all -> 0x0056 }
            boolean r5 = r14.b(r5)     // Catch:{ all -> 0x0056 }
            if (r5 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r3
            goto L_0x002a
        L_0x0024:
            mf.e r5 = r1.i     // Catch:{ all -> 0x0056 }
            java.net.Socket r5 = r5.k()     // Catch:{ all -> 0x0056 }
        L_0x002a:
            monitor-exit(r2)
            mf.e r6 = r1.i
            mf.h r6 = r6.f8631v
            if (r6 == 0) goto L_0x0044
            if (r5 != 0) goto L_0x0034
            r0 = r4
        L_0x0034:
            if (r0 == 0) goto L_0x0038
            goto L_0x02c7
        L_0x0038:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0044:
            if (r5 == 0) goto L_0x0049
            jf.c.e(r5)
        L_0x0049:
            if.n r2 = r1.f8624j
            mf.e r5 = r1.i
            java.util.Objects.requireNonNull(r2)
            java.lang.String r2 = "call"
            e6.e.D(r5, r2)
            goto L_0x0059
        L_0x0056:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0059:
            r1.f8619c = r0
            r1.f8620d = r0
            r1.f8621e = r0
            mf.j r2 = r1.g
            if.a r5 = r1.f8623h
            mf.e r6 = r1.i
            boolean r2 = r2.a(r5, r6, r3, r0)
            if (r2 == 0) goto L_0x007b
            mf.e r0 = r1.i
            mf.h r2 = r0.f8631v
            e6.e.B(r2)
            if.n r0 = r1.f8624j
            mf.e r3 = r1.i
            r0.a(r3, r2)
            goto L_0x02c7
        L_0x007b:
            if.d0 r2 = r1.f8622f
            if (r2 == 0) goto L_0x0082
            r1.f8622f = r3
            goto L_0x0095
        L_0x0082:
            mf.l$a r2 = r1.f8617a
            if (r2 == 0) goto L_0x0098
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0098
            mf.l$a r0 = r1.f8617a
            e6.e.B(r0)
            if.d0 r2 = r0.b()
        L_0x0095:
            r5 = r3
            goto L_0x026e
        L_0x0098:
            mf.l r2 = r1.f8618b
            if (r2 != 0) goto L_0x00ad
            mf.l r2 = new mf.l
            if.a r5 = r1.f8623h
            mf.e r6 = r1.i
            if.v r7 = r6.E
            androidx.lifecycle.i0 r7 = r7.N
            if.n r8 = r1.f8624j
            r2.<init>(r5, r7, r6, r8)
            r1.f8618b = r2
        L_0x00ad:
            boolean r5 = r2.a()
            if (r5 == 0) goto L_0x0336
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00b8:
            boolean r6 = r2.b()
            if (r6 == 0) goto L_0x0232
            boolean r6 = r2.b()
            java.lang.String r7 = "No route to "
            if (r6 == 0) goto L_0x0211
            java.util.List<? extends java.net.Proxy> r6 = r2.f8666a
            int r8 = r2.f8667b
            int r9 = r8 + 1
            r2.f8667b = r9
            java.lang.Object r6 = r6.get(r8)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2.f8668c = r8
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.DIRECT
            if (r9 == r10) goto L_0x0134
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r9 != r10) goto L_0x00ec
            goto L_0x0134
        L_0x00ec:
            java.net.SocketAddress r9 = r6.address()
            boolean r10 = r9 instanceof java.net.InetSocketAddress
            if (r10 == 0) goto L_0x0119
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9
            java.lang.String r10 = "$this$socketHost"
            e6.e.D(r9, r10)
            java.net.InetAddress r10 = r9.getAddress()
            if (r10 == 0) goto L_0x010b
            java.lang.String r10 = r10.getHostAddress()
            java.lang.String r11 = "address.hostAddress"
            e6.e.C(r10, r11)
            goto L_0x0114
        L_0x010b:
            java.lang.String r10 = r9.getHostName()
            java.lang.String r11 = "hostName"
            e6.e.C(r10, r11)
        L_0x0114:
            int r9 = r9.getPort()
            goto L_0x013c
        L_0x0119:
            java.lang.String r0 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.StringBuilder r0 = a.a.d(r0)
            java.lang.Class r2 = r9.getClass()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0134:
            if.a r9 = r2.f8670e
            if.r r9 = r9.f6443a
            java.lang.String r10 = r9.f6568e
            int r9 = r9.f6569f
        L_0x013c:
            r11 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r9) goto L_0x01ef
            if (r11 < r9) goto L_0x01ef
            java.net.Proxy$Type r7 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r7 != r11) goto L_0x0153
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r10, r9)
            r8.add(r7)
            goto L_0x0195
        L_0x0153:
            if.n r7 = r2.f8672h
            if.d r11 = r2.g
            java.util.Objects.requireNonNull(r7)
            java.lang.String r7 = "call"
            e6.e.D(r11, r7)
            java.lang.String r11 = "domainName"
            e6.e.D(r10, r11)
            if.a r11 = r2.f8670e
            if.m r11 = r11.f6446d
            java.util.List r11 = r11.b(r10)
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x01d1
            if.n r10 = r2.f8672h
            if.d r12 = r2.g
            java.util.Objects.requireNonNull(r10)
            e6.e.D(r12, r7)
            java.util.Iterator r7 = r11.iterator()
        L_0x0180:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0195
            java.lang.Object r10 = r7.next()
            java.net.InetAddress r10 = (java.net.InetAddress) r10
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r10, r9)
            r8.add(r11)
            goto L_0x0180
        L_0x0195:
            java.util.List<? extends java.net.InetSocketAddress> r7 = r2.f8668c
            java.util.Iterator r7 = r7.iterator()
        L_0x019b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01c9
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            if.d0 r9 = new if.d0
            if.a r10 = r2.f8670e
            r9.<init>(r10, r6, r8)
            androidx.lifecycle.i0 r8 = r2.f8671f
            monitor-enter(r8)
            java.lang.Object r10 = r8.f2124a     // Catch:{ all -> 0x01c6 }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x01c6 }
            boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x01c6 }
            monitor-exit(r8)
            if (r10 == 0) goto L_0x01c2
            java.util.List<if.d0> r8 = r2.f8669d
            r8.add(r9)
            goto L_0x019b
        L_0x01c2:
            r5.add(r9)
            goto L_0x019b
        L_0x01c6:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x01c9:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x00b8
            goto L_0x0232
        L_0x01d1:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            if.a r2 = r2.f8670e
            if.m r2 = r2.f6446d
            r3.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x01ef:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r10)
            r3 = 58
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0211:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = a.a.d(r7)
            if.a r4 = r2.f8670e
            if.r r4 = r4.f6443a
            java.lang.String r4 = r4.f6568e
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<? extends java.net.Proxy> r2 = r2.f8666a
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0232:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0242
            java.util.List<if.d0> r6 = r2.f8669d
            nd.i.U0(r5, r6)
            java.util.List<if.d0> r2 = r2.f8669d
            r2.clear()
        L_0x0242:
            mf.l$a r2 = new mf.l$a
            r2.<init>(r5)
            r1.f8617a = r2
            mf.e r6 = r1.i
            boolean r6 = r6.B
            if (r6 != 0) goto L_0x032e
            mf.j r6 = r1.g
            if.a r7 = r1.f8623h
            mf.e r8 = r1.i
            boolean r0 = r6.a(r7, r8, r5, r0)
            if (r0 == 0) goto L_0x026a
            mf.e r0 = r1.i
            mf.h r2 = r0.f8631v
            e6.e.B(r2)
            if.n r0 = r1.f8624j
            mf.e r3 = r1.i
            r0.a(r3, r2)
            goto L_0x02c7
        L_0x026a:
            if.d0 r2 = r2.b()
        L_0x026e:
            mf.h r13 = new mf.h
            mf.j r0 = r1.g
            r13.<init>(r0, r2)
            mf.e r0 = r1.i
            r0.D = r13
            mf.e r11 = r1.i     // Catch:{ all -> 0x0328 }
            if.n r12 = r1.f8624j     // Catch:{ all -> 0x0328 }
            r6 = r13
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r6.c(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0328 }
            mf.e r0 = r1.i
            r0.D = r3
            mf.e r0 = r1.i
            if.v r0 = r0.E
            androidx.lifecycle.i0 r3 = r0.N
            if.d0 r0 = r13.f8657q
            monitor-enter(r3)
            java.lang.String r6 = "route"
            e6.e.D(r0, r6)     // Catch:{ all -> 0x0325 }
            java.lang.Object r6 = r3.f2124a     // Catch:{ all -> 0x0325 }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x0325 }
            r6.remove(r0)     // Catch:{ all -> 0x0325 }
            monitor-exit(r3)
            mf.j r0 = r1.g
            if.a r3 = r1.f8623h
            mf.e r6 = r1.i
            boolean r0 = r0.a(r3, r6, r5, r4)
            if (r0 == 0) goto L_0x02cb
            mf.e r0 = r1.i
            mf.h r0 = r0.f8631v
            e6.e.B(r0)
            r1.f8622f = r2
            java.net.Socket r2 = r13.f8645c
            e6.e.B(r2)
            jf.c.e(r2)
            if.n r2 = r1.f8624j
            mf.e r3 = r1.i
            r2.a(r3, r0)
            r2 = r0
        L_0x02c7:
            r0 = r19
            r13 = r2
            goto L_0x02f0
        L_0x02cb:
            monitor-enter(r13)
            mf.j r0 = r1.g     // Catch:{ all -> 0x0322 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0322 }
            byte[] r2 = jf.c.f7250a     // Catch:{ all -> 0x0322 }
            java.util.concurrent.ConcurrentLinkedQueue<mf.h> r2 = r0.f8662d     // Catch:{ all -> 0x0322 }
            r2.add(r13)     // Catch:{ all -> 0x0322 }
            lf.c r2 = r0.f8660b     // Catch:{ all -> 0x0322 }
            mf.i r0 = r0.f8661c     // Catch:{ all -> 0x0322 }
            r5 = 0
            r2.c(r0, r5)     // Catch:{ all -> 0x0322 }
            mf.e r0 = r1.i     // Catch:{ all -> 0x0322 }
            r0.b(r13)     // Catch:{ all -> 0x0322 }
            monitor-exit(r13)
            if.n r0 = r1.f8624j
            mf.e r2 = r1.i
            r0.a(r2, r13)
            r0 = r19
        L_0x02f0:
            boolean r2 = r13.i(r0)
            if (r2 == 0) goto L_0x02f7
            return r13
        L_0x02f7:
            r13.l()
            if.d0 r2 = r1.f8622f
            if (r2 == 0) goto L_0x0300
            goto L_0x0001
        L_0x0300:
            mf.l$a r2 = r1.f8617a
            if (r2 == 0) goto L_0x0309
            boolean r2 = r2.a()
            goto L_0x030a
        L_0x0309:
            r2 = r4
        L_0x030a:
            if (r2 == 0) goto L_0x030e
            goto L_0x0001
        L_0x030e:
            mf.l r2 = r1.f8618b
            if (r2 == 0) goto L_0x0316
            boolean r4 = r2.a()
        L_0x0316:
            if (r4 == 0) goto L_0x031a
            goto L_0x0001
        L_0x031a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
        L_0x0322:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0325:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0328:
            r0 = move-exception
            mf.e r2 = r1.i
            r2.D = r3
            throw r0
        L_0x032e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0336:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x033c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.d.a(int, int, int, boolean, boolean):mf.h");
    }

    public final boolean b(r rVar) {
        e.D(rVar, ImagesContract.URL);
        r rVar2 = this.f8623h.f6443a;
        return rVar.f6569f == rVar2.f6569f && e.r(rVar.f6568e, rVar2.f6568e);
    }

    public final void c(IOException iOException) {
        e.D(iOException, "e");
        this.f8622f = null;
        if ((iOException instanceof v) && ((v) iOException).f10054a == b.REFUSED_STREAM) {
            this.f8619c++;
        } else if (iOException instanceof pf.a) {
            this.f8620d++;
        } else {
            this.f8621e++;
        }
    }
}
