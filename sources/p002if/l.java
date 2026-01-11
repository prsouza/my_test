package p002if;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ThreadPoolExecutor;
import mf.e;

/* renamed from: if.l  reason: invalid package */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f6541a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<e.a> f6542b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<e.a> f6543c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<e> f6544d = new ArrayDeque<>();

    public final <T> void a(Deque<T> deque, T t10) {
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        c();
    }

    public final void b(e.a aVar) {
        e6.e.D(aVar, "call");
        aVar.f8635a.decrementAndGet();
        a(this.f6543c, aVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean c() {
        /*
            r15 = this;
            byte[] r0 = jf.c.f7250a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r15)
            java.util.ArrayDeque<mf.e$a> r1 = r15.f6542b     // Catch:{ all -> 0x00ea }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ea }
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            e6.e.C(r1, r2)     // Catch:{ all -> 0x00ea }
        L_0x0013:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00ea }
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00ea }
            mf.e$a r2 = (mf.e.a) r2     // Catch:{ all -> 0x00ea }
            java.util.ArrayDeque<mf.e$a> r3 = r15.f6543c     // Catch:{ all -> 0x00ea }
            int r3 = r3.size()     // Catch:{ all -> 0x00ea }
            r4 = 64
            if (r3 < r4) goto L_0x002a
            goto L_0x0045
        L_0x002a:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f8635a     // Catch:{ all -> 0x00ea }
            int r3 = r3.get()     // Catch:{ all -> 0x00ea }
            r4 = 5
            if (r3 < r4) goto L_0x0034
            goto L_0x0013
        L_0x0034:
            r1.remove()     // Catch:{ all -> 0x00ea }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f8635a     // Catch:{ all -> 0x00ea }
            r3.incrementAndGet()     // Catch:{ all -> 0x00ea }
            r0.add(r2)     // Catch:{ all -> 0x00ea }
            java.util.ArrayDeque<mf.e$a> r3 = r15.f6543c     // Catch:{ all -> 0x00ea }
            r3.add(r2)     // Catch:{ all -> 0x00ea }
            goto L_0x0013
        L_0x0045:
            monitor-enter(r15)     // Catch:{ all -> 0x00ea }
            java.util.ArrayDeque<mf.e$a> r1 = r15.f6543c     // Catch:{ all -> 0x00e7 }
            int r1 = r1.size()     // Catch:{ all -> 0x00e7 }
            java.util.ArrayDeque<mf.e> r2 = r15.f6544d     // Catch:{ all -> 0x00e7 }
            int r2 = r2.size()     // Catch:{ all -> 0x00e7 }
            int r1 = r1 + r2
            monitor-exit(r15)     // Catch:{ all -> 0x00ea }
            r2 = 0
            if (r1 <= 0) goto L_0x0059
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r1 = r2
        L_0x005a:
            monitor-exit(r15)
            int r3 = r0.size()
            r4 = r2
        L_0x0060:
            if (r4 >= r3) goto L_0x00e6
            java.lang.Object r5 = r0.get(r4)
            mf.e$a r5 = (mf.e.a) r5
            monitor-enter(r15)
            java.util.concurrent.ThreadPoolExecutor r6 = r15.f6541a     // Catch:{ all -> 0x00e3 }
            if (r6 != 0) goto L_0x009f
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00e3 }
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 60
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00e3 }
            java.util.concurrent.SynchronousQueue r13 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00e3 }
            r13.<init>()     // Catch:{ all -> 0x00e3 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            r7.<init>()     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = jf.c.g     // Catch:{ all -> 0x00e3 }
            r7.append(r14)     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = " Dispatcher"
            r7.append(r14)     // Catch:{ all -> 0x00e3 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00e3 }
            java.lang.String r14 = "name"
            e6.e.D(r7, r14)     // Catch:{ all -> 0x00e3 }
            jf.b r14 = new jf.b     // Catch:{ all -> 0x00e3 }
            r14.<init>(r7, r2)     // Catch:{ all -> 0x00e3 }
            r7 = r6
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch:{ all -> 0x00e3 }
            r15.f6541a = r6     // Catch:{ all -> 0x00e3 }
        L_0x009f:
            java.util.concurrent.ThreadPoolExecutor r6 = r15.f6541a     // Catch:{ all -> 0x00e3 }
            e6.e.B(r6)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r15)
            java.util.Objects.requireNonNull(r5)
            mf.e r7 = mf.e.this
            if.v r7 = r7.E
            if.l r7 = r7.f6597a
            byte[] r7 = jf.c.f7250a
            r6.execute(r5)     // Catch:{ RejectedExecutionException -> 0x00b6 }
            goto L_0x00d6
        L_0x00b4:
            r0 = move-exception
            goto L_0x00d9
        L_0x00b6:
            r6 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00b4 }
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch:{ all -> 0x00b4 }
            r7.initCause(r6)     // Catch:{ all -> 0x00b4 }
            mf.e r6 = mf.e.this     // Catch:{ all -> 0x00b4 }
            r6.j(r7)     // Catch:{ all -> 0x00b4 }
            if.e r6 = r5.f8636b     // Catch:{ all -> 0x00b4 }
            ki.r$a r6 = (ki.r.a) r6     // Catch:{ all -> 0x00b4 }
            r6.a(r7)     // Catch:{ all -> 0x00b4 }
            mf.e r6 = mf.e.this
            if.v r6 = r6.E
            if.l r6 = r6.f6597a
            r6.b(r5)
        L_0x00d6:
            int r4 = r4 + 1
            goto L_0x0060
        L_0x00d9:
            mf.e r1 = mf.e.this
            if.v r1 = r1.E
            if.l r1 = r1.f6597a
            r1.b(r5)
            throw r0
        L_0x00e3:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x00e6:
            return r1
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00ea }
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p002if.l.c():boolean");
    }
}
