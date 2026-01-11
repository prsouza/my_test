package i3;

import android.os.SystemClock;
import android.util.Log;
import c4.g;
import d4.a;
import e6.e;
import g3.l;
import i3.c;
import i3.j;
import i3.q;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k3.a;
import k3.f;
import k3.h;
import k3.i;
import y3.g;

public final class m implements o, i.a, q.a {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f6087h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final t f6088a;

    /* renamed from: b  reason: collision with root package name */
    public final e f6089b;

    /* renamed from: c  reason: collision with root package name */
    public final i f6090c;

    /* renamed from: d  reason: collision with root package name */
    public final b f6091d;

    /* renamed from: e  reason: collision with root package name */
    public final z f6092e;

    /* renamed from: f  reason: collision with root package name */
    public final a f6093f;
    public final c g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final j.e f6094a;

        /* renamed from: b  reason: collision with root package name */
        public final m0.c<j<?>> f6095b = ((a.c) d4.a.a(150, new C0104a()));

        /* renamed from: c  reason: collision with root package name */
        public int f6096c;

        /* renamed from: i3.m$a$a  reason: collision with other inner class name */
        public class C0104a implements a.b<j<?>> {
            public C0104a() {
            }

            public final Object a() {
                a aVar = a.this;
                return new j(aVar.f6094a, aVar.f6095b);
            }
        }

        public a(j.e eVar) {
            this.f6094a = eVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final l3.a f6098a;

        /* renamed from: b  reason: collision with root package name */
        public final l3.a f6099b;

        /* renamed from: c  reason: collision with root package name */
        public final l3.a f6100c;

        /* renamed from: d  reason: collision with root package name */
        public final l3.a f6101d;

        /* renamed from: e  reason: collision with root package name */
        public final o f6102e;

        /* renamed from: f  reason: collision with root package name */
        public final q.a f6103f;
        public final m0.c<n<?>> g = ((a.c) d4.a.a(150, new a()));

        public class a implements a.b<n<?>> {
            public a() {
            }

            public final Object a() {
                b bVar = b.this;
                return new n(bVar.f6098a, bVar.f6099b, bVar.f6100c, bVar.f6101d, bVar.f6102e, bVar.f6103f, bVar.g);
            }
        }

        public b(l3.a aVar, l3.a aVar2, l3.a aVar3, l3.a aVar4, o oVar, q.a aVar5) {
            this.f6098a = aVar;
            this.f6099b = aVar2;
            this.f6100c = aVar3;
            this.f6101d = aVar4;
            this.f6102e = oVar;
            this.f6103f = aVar5;
        }
    }

    public static class c implements j.e {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0130a f6105a;

        /* renamed from: b  reason: collision with root package name */
        public volatile k3.a f6106b;

        public c(a.C0130a aVar) {
            this.f6105a = aVar;
        }

        public final k3.a a() {
            if (this.f6106b == null) {
                synchronized (this) {
                    if (this.f6106b == null) {
                        k3.d dVar = (k3.d) this.f6105a;
                        f fVar = (f) dVar.f7409b;
                        File cacheDir = fVar.f7415a.getCacheDir();
                        k3.e eVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.f7416b != null) {
                            cacheDir = new File(cacheDir, fVar.f7416b);
                        }
                        if (cacheDir != null) {
                            if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
                                eVar = new k3.e(cacheDir, dVar.f7408a);
                            }
                        }
                        this.f6106b = eVar;
                    }
                    if (this.f6106b == null) {
                        this.f6106b = new k3.b();
                    }
                }
            }
            return this.f6106b;
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final n<?> f6107a;

        /* renamed from: b  reason: collision with root package name */
        public final g f6108b;

        public d(g gVar, n<?> nVar) {
            this.f6108b = gVar;
            this.f6107a = nVar;
        }
    }

    public m(i iVar, a.C0130a aVar, l3.a aVar2, l3.a aVar3, l3.a aVar4, l3.a aVar5) {
        this.f6090c = iVar;
        c cVar = new c(aVar);
        c cVar2 = new c();
        this.g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f6024d = this;
            }
        }
        this.f6089b = new e();
        this.f6088a = new t();
        this.f6091d = new b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f6093f = new a(cVar);
        this.f6092e = new z();
        ((h) iVar).f7417d = this;
    }

    public static void d(String str, long j10, g3.f fVar) {
        StringBuilder c10 = b9.m.c(str, " in ");
        c10.append(c4.f.a(j10));
        c10.append("ms, key: ");
        c10.append(fVar);
        Log.v("Engine", c10.toString());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<g3.f, i3.c$a>] */
    public final void a(g3.f fVar, q<?> qVar) {
        c cVar = this.g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f6022b.remove(fVar);
            if (aVar != null) {
                aVar.f6027c = null;
                aVar.clear();
            }
        }
        if (qVar.f6134a) {
            w wVar = (w) ((h) this.f6090c).d(fVar, qVar);
        } else {
            this.f6092e.a(qVar, false);
        }
    }

    public final <R> d b(com.bumptech.glide.d dVar, Object obj, g3.f fVar, int i, int i10, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, l lVar, Map<Class<?>, l<?>> map, boolean z, boolean z10, g3.h hVar, boolean z11, boolean z12, boolean z13, boolean z14, g gVar2, Executor executor) {
        long j10;
        if (f6087h) {
            int i11 = c4.f.f3234b;
            j10 = SystemClock.elapsedRealtimeNanos();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        Objects.requireNonNull(this.f6089b);
        p pVar = new p(obj, fVar, i, i10, map, cls, cls2, hVar);
        synchronized (this) {
            q<?> c10 = c(pVar, z11, j11);
            if (c10 == null) {
                d g8 = g(dVar, obj, fVar, i, i10, cls, cls2, gVar, lVar, map, z, z10, hVar, z11, z12, z13, z14, gVar2, executor, pVar, j11);
                return g8;
            }
            ((y3.h) gVar2).p(c10, g3.a.MEMORY_CACHE, false);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<g3.f, i3.c$a>] */
    public final q<?> c(p pVar, boolean z, long j10) {
        q<?> qVar;
        Y y10;
        q<?> qVar2;
        if (!z) {
            return null;
        }
        c cVar = this.g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f6022b.get(pVar);
            if (aVar == null) {
                qVar = null;
            } else {
                qVar = (q) aVar.get();
                if (qVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (qVar != null) {
            qVar.a();
        }
        if (qVar != null) {
            if (f6087h) {
                d("Loaded resource from active resources", j10, pVar);
            }
            return qVar;
        }
        h hVar = (h) this.f6090c;
        synchronized (hVar) {
            g.a remove = hVar.f3235a.remove(pVar);
            if (remove == null) {
                y10 = null;
            } else {
                hVar.f3237c -= (long) remove.f3239b;
                y10 = remove.f3238a;
            }
        }
        w wVar = (w) y10;
        if (wVar == null) {
            qVar2 = null;
        } else if (wVar instanceof q) {
            qVar2 = (q) wVar;
        } else {
            qVar2 = new q<>(wVar, true, true, pVar, this);
        }
        if (qVar2 != null) {
            qVar2.a();
            this.g.a(pVar, qVar2);
        }
        if (qVar2 == null) {
            return null;
        }
        if (f6087h) {
            d("Loaded resource from cache", j10, pVar);
        }
        return qVar2;
    }

    public final synchronized void e(n<?> nVar, g3.f fVar, q<?> qVar) {
        if (qVar != null) {
            if (qVar.f6134a) {
                this.g.a(fVar, qVar);
            }
        }
        t tVar = this.f6088a;
        Objects.requireNonNull(tVar);
        Map b10 = tVar.b(nVar.E);
        if (nVar.equals(b10.get(fVar))) {
            b10.remove(fVar);
        }
    }

    public final void f(w<?> wVar) {
        if (wVar instanceof q) {
            ((q) wVar).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* JADX WARNING: type inference failed for: r15v5, types: [m0.c<i3.n<?>>, d4.a$c] */
    /* JADX WARNING: type inference failed for: r14v0, types: [d4.a$c, m0.c<i3.j<?>>] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> i3.m.d g(com.bumptech.glide.d r17, java.lang.Object r18, g3.f r19, int r20, int r21, java.lang.Class<?> r22, java.lang.Class<R> r23, com.bumptech.glide.g r24, i3.l r25, java.util.Map<java.lang.Class<?>, g3.l<?>> r26, boolean r27, boolean r28, g3.h r29, boolean r30, boolean r31, boolean r32, boolean r33, y3.g r34, java.util.concurrent.Executor r35, i3.p r36, long r37) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r24
            r7 = r25
            r8 = r29
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            i3.t r15 = r1.f6088a
            java.util.Map r15 = r15.b(r9)
            java.lang.Object r15 = r15.get(r12)
            i3.n r15 = (i3.n) r15
            if (r15 == 0) goto L_0x003c
            r15.a(r10, r11)
            boolean r0 = f6087h
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "Added to existing load"
            d(r0, r13, r12)
        L_0x0036:
            i3.m$d r0 = new i3.m$d
            r0.<init>(r10, r15)
            return r0
        L_0x003c:
            i3.m$b r15 = r1.f6091d
            m0.c<i3.n<?>> r15 = r15.g
            java.lang.Object r15 = r15.b()
            i3.n r15 = (i3.n) r15
            java.lang.String r13 = "Argument must not be null"
            java.util.Objects.requireNonNull(r15, r13)
            monitor-enter(r15)
            r15.A = r12     // Catch:{ all -> 0x0111 }
            r13 = r30
            r15.B = r13     // Catch:{ all -> 0x0111 }
            r13 = r31
            r15.C = r13     // Catch:{ all -> 0x0111 }
            r13 = r32
            r15.D = r13     // Catch:{ all -> 0x0111 }
            r15.E = r9     // Catch:{ all -> 0x0111 }
            monitor-exit(r15)
            i3.m$a r13 = r1.f6093f
            m0.c<i3.j<?>> r14 = r13.f6095b
            java.lang.Object r14 = r14.b()
            i3.j r14 = (i3.j) r14
            java.lang.String r10 = "Argument must not be null"
            java.util.Objects.requireNonNull(r14, r10)
            int r10 = r13.f6096c
            int r11 = r10 + 1
            r13.f6096c = r11
            i3.i<R> r11 = r14.f6058a
            i3.j$e r13 = r14.f6061s
            r11.f6044c = r0
            r11.f6045d = r2
            r11.f6053n = r3
            r11.f6046e = r4
            r11.f6047f = r5
            r11.f6055p = r7
            r1 = r22
            r11.g = r1
            r11.f6048h = r13
            r1 = r23
            r11.f6050k = r1
            r11.f6054o = r6
            r11.i = r8
            r1 = r26
            r11.f6049j = r1
            r1 = r27
            r11.f6056q = r1
            r1 = r28
            r11.f6057r = r1
            r14.f6065w = r0
            r14.f6066x = r3
            r14.f6067y = r6
            r14.z = r12
            r14.A = r4
            r14.B = r5
            r14.C = r7
            r14.J = r9
            r14.D = r8
            r14.E = r15
            r14.F = r10
            i3.j$g r0 = i3.j.g.INITIALIZE
            r14.H = r0
            r14.K = r2
            r1 = r16
            i3.t r0 = r1.f6088a
            java.util.Objects.requireNonNull(r0)
            boolean r2 = r15.E
            java.util.Map r0 = r0.b(r2)
            r0.put(r12, r15)
            r0 = r34
            r2 = r35
            r15.a(r0, r2)
            monitor-enter(r15)
            r15.L = r14     // Catch:{ all -> 0x010e }
            i3.j$h r2 = i3.j.h.INITIALIZE     // Catch:{ all -> 0x010e }
            i3.j$h r2 = r14.q(r2)     // Catch:{ all -> 0x010e }
            i3.j$h r3 = i3.j.h.RESOURCE_CACHE     // Catch:{ all -> 0x010e }
            if (r2 == r3) goto L_0x00e3
            i3.j$h r3 = i3.j.h.DATA_CACHE     // Catch:{ all -> 0x010e }
            if (r2 != r3) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r2 = 0
            goto L_0x00e4
        L_0x00e3:
            r2 = 1
        L_0x00e4:
            if (r2 == 0) goto L_0x00e9
            l3.a r2 = r15.f6116v     // Catch:{ all -> 0x010e }
            goto L_0x00f9
        L_0x00e9:
            boolean r2 = r15.C     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x00f0
            l3.a r2 = r15.f6118x     // Catch:{ all -> 0x010e }
            goto L_0x00f9
        L_0x00f0:
            boolean r2 = r15.D     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x00f7
            l3.a r2 = r15.f6119y     // Catch:{ all -> 0x010e }
            goto L_0x00f9
        L_0x00f7:
            l3.a r2 = r15.f6117w     // Catch:{ all -> 0x010e }
        L_0x00f9:
            r2.execute(r14)     // Catch:{ all -> 0x010e }
            monitor-exit(r15)
            boolean r2 = f6087h
            if (r2 == 0) goto L_0x0108
            java.lang.String r2 = "Started new load"
            r3 = r37
            d(r2, r3, r12)
        L_0x0108:
            i3.m$d r2 = new i3.m$d
            r2.<init>(r0, r15)
            return r2
        L_0x010e:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0111:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.m.g(com.bumptech.glide.d, java.lang.Object, g3.f, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.g, i3.l, java.util.Map, boolean, boolean, g3.h, boolean, boolean, boolean, boolean, y3.g, java.util.concurrent.Executor, i3.p, long):i3.m$d");
    }
}
