package y3;

import a4.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import c4.e;
import c4.f;
import c4.j;
import com.bumptech.glide.c;
import d4.d;
import i3.m;
import i3.w;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import m3.l;
import z3.g;

public final class h<R> implements c, g, g {
    public static final boolean D = Log.isLoggable("Request", 2);
    public int A;
    public boolean B;
    public RuntimeException C;

    /* renamed from: a  reason: collision with root package name */
    public final String f13441a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f13442b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f13443c;

    /* renamed from: d  reason: collision with root package name */
    public final e<R> f13444d;

    /* renamed from: e  reason: collision with root package name */
    public final d f13445e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f13446f;
    public final com.bumptech.glide.d g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f13447h;
    public final Class<R> i;

    /* renamed from: j  reason: collision with root package name */
    public final a<?> f13448j;

    /* renamed from: k  reason: collision with root package name */
    public final int f13449k;

    /* renamed from: l  reason: collision with root package name */
    public final int f13450l;

    /* renamed from: m  reason: collision with root package name */
    public final com.bumptech.glide.g f13451m;

    /* renamed from: n  reason: collision with root package name */
    public final z3.h<R> f13452n;

    /* renamed from: o  reason: collision with root package name */
    public final List<e<R>> f13453o;

    /* renamed from: p  reason: collision with root package name */
    public final b<? super R> f13454p;

    /* renamed from: q  reason: collision with root package name */
    public final Executor f13455q;

    /* renamed from: r  reason: collision with root package name */
    public w<R> f13456r;

    /* renamed from: s  reason: collision with root package name */
    public m.d f13457s;

    /* renamed from: t  reason: collision with root package name */
    public long f13458t;

    /* renamed from: u  reason: collision with root package name */
    public volatile m f13459u;

    /* renamed from: v  reason: collision with root package name */
    public a f13460v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f13461w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f13462x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f13463y;
    public int z;

    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public h(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, com.bumptech.glide.g gVar, z3.h hVar, List list, d dVar2, m mVar) {
        com.bumptech.glide.d dVar3 = dVar;
        b<?> bVar = a4.a.f57b;
        e.a aVar2 = e.f3231a;
        this.f13441a = D ? String.valueOf(hashCode()) : null;
        this.f13442b = new d.a();
        this.f13443c = obj;
        this.f13446f = context;
        this.g = dVar3;
        this.f13447h = obj2;
        this.i = cls;
        this.f13448j = aVar;
        this.f13449k = i10;
        this.f13450l = i11;
        this.f13451m = gVar;
        this.f13452n = hVar;
        this.f13444d = null;
        this.f13453o = list;
        this.f13445e = dVar2;
        this.f13459u = mVar;
        this.f13454p = bVar;
        this.f13455q = aVar2;
        this.f13460v = a.PENDING;
        if (this.C == null && dVar3.f3522h.a(c.C0038c.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f13443c) {
            z10 = this.f13460v == a.COMPLETE;
        }
        return z10;
    }

    public final boolean b(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        boolean z10;
        c cVar2 = cVar;
        if (!(cVar2 instanceof h)) {
            return false;
        }
        synchronized (this.f13443c) {
            i10 = this.f13449k;
            i11 = this.f13450l;
            obj = this.f13447h;
            cls = this.i;
            aVar = this.f13448j;
            gVar = this.f13451m;
            List<e<R>> list = this.f13453o;
            size = list != null ? list.size() : 0;
        }
        h hVar = (h) cVar2;
        synchronized (hVar.f13443c) {
            i12 = hVar.f13449k;
            i13 = hVar.f13450l;
            obj2 = hVar.f13447h;
            cls2 = hVar.i;
            aVar2 = hVar.f13448j;
            gVar2 = hVar.f13451m;
            List<e<R>> list2 = hVar.f13453o;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i10 == i12 && i11 == i13) {
            char[] cArr = j.f3244a;
            if (obj == null) {
                z10 = obj2 == null;
            } else if (obj instanceof l) {
                z10 = ((l) obj).a();
            } else {
                z10 = obj.equals(obj2);
            }
            if (z10 && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    public final void c(int i10, int i11) {
        Object obj;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        a aVar;
        g3.h hVar;
        int i13 = i10;
        int i14 = i11;
        this.f13442b.a();
        Object obj2 = this.f13443c;
        synchronized (obj2) {
            try {
                boolean z13 = D;
                if (z13) {
                    n("Got onSizeReady in " + f.a(this.f13458t));
                }
                if (this.f13460v == a.WAITING_FOR_SIZE) {
                    a aVar2 = a.RUNNING;
                    this.f13460v = aVar2;
                    float f10 = this.f13448j.f13426b;
                    if (i13 != Integer.MIN_VALUE) {
                        i13 = Math.round(((float) i13) * f10);
                    }
                    this.z = i13;
                    if (i14 == Integer.MIN_VALUE) {
                        i12 = i14;
                    } else {
                        i12 = Math.round(f10 * ((float) i14));
                    }
                    this.A = i12;
                    if (z13) {
                        n("finished setup for calling load in " + f.a(this.f13458t));
                    }
                    m mVar = this.f13459u;
                    com.bumptech.glide.d dVar = this.g;
                    Object obj3 = this.f13447h;
                    a<?> aVar3 = this.f13448j;
                    g3.f fVar = aVar3.A;
                    int i15 = this.z;
                    int i16 = this.A;
                    Class<?> cls = aVar3.H;
                    Class<R> cls2 = this.i;
                    com.bumptech.glide.g gVar = this.f13451m;
                    i3.l lVar = aVar3.f13427c;
                    Map<Class<?>, g3.l<?>> map = aVar3.G;
                    boolean z14 = aVar3.B;
                    a aVar4 = aVar2;
                    boolean z15 = aVar3.N;
                    g3.h hVar2 = aVar3.F;
                    Object obj4 = obj2;
                    try {
                        z10 = aVar3.f13433x;
                        z11 = aVar3.L;
                        z12 = aVar3.O;
                        aVar = aVar4;
                        hVar = hVar2;
                        obj = obj4;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        throw th;
                    }
                    try {
                        m.d b10 = mVar.b(dVar, obj3, fVar, i15, i16, cls, cls2, gVar, lVar, map, z14, z15, hVar, z10, z11, z12, aVar3.M, this, this.f13455q);
                        try {
                            this.f13457s = b10;
                            if (this.f13460v != aVar) {
                                this.f13457s = null;
                            }
                            if (z13) {
                                n("finished onSizeReady in " + f.a(this.f13458t));
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            while (true) {
                                break;
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        r5.f13459u.f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f13443c
            monitor-enter(r0)
            r5.d()     // Catch:{ all -> 0x0043 }
            d4.d$a r1 = r5.f13442b     // Catch:{ all -> 0x0043 }
            r1.a()     // Catch:{ all -> 0x0043 }
            y3.h$a r1 = r5.f13460v     // Catch:{ all -> 0x0043 }
            y3.h$a r2 = y3.h.a.CLEARED     // Catch:{ all -> 0x0043 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            return
        L_0x0013:
            r5.e()     // Catch:{ all -> 0x0043 }
            i3.w<R> r1 = r5.f13456r     // Catch:{ all -> 0x0043 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f13456r = r3     // Catch:{ all -> 0x0043 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            y3.d r3 = r5.f13445e     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.c(r5)     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            if (r3 == 0) goto L_0x0038
            z3.h<R> r3 = r5.f13452n     // Catch:{ all -> 0x0043 }
            android.graphics.drawable.Drawable r4 = r5.k()     // Catch:{ all -> 0x0043 }
            r3.f(r4)     // Catch:{ all -> 0x0043 }
        L_0x0038:
            r5.f13460v = r2     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0042
            i3.m r0 = r5.f13459u
            r0.f(r1)
        L_0x0042:
            return
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.h.clear():void");
    }

    public final void d() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public final void e() {
        d();
        this.f13442b.a();
        this.f13452n.b(this);
        m.d dVar = this.f13457s;
        if (dVar != null) {
            synchronized (m.this) {
                dVar.f6107a.g(dVar.f6108b);
            }
            this.f13457s = null;
        }
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f13443c) {
            z10 = this.f13460v == a.CLEARED;
        }
        return z10;
    }

    public final Drawable g() {
        int i10;
        if (this.f13463y == null) {
            a<?> aVar = this.f13448j;
            Drawable drawable = aVar.D;
            this.f13463y = drawable;
            if (drawable == null && (i10 = aVar.E) > 0) {
                this.f13463y = m(i10);
            }
        }
        return this.f13463y;
    }

    public final void h() {
        synchronized (this.f13443c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f13443c
            monitor-enter(r0)
            r6.d()     // Catch:{ all -> 0x00b1 }
            d4.d$a r1 = r6.f13442b     // Catch:{ all -> 0x00b1 }
            r1.a()     // Catch:{ all -> 0x00b1 }
            int r1 = c4.f.f3234b     // Catch:{ all -> 0x00b1 }
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00b1 }
            r6.f13458t = r1     // Catch:{ all -> 0x00b1 }
            java.lang.Object r1 = r6.f13447h     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x003e
            int r1 = r6.f13449k     // Catch:{ all -> 0x00b1 }
            int r2 = r6.f13450l     // Catch:{ all -> 0x00b1 }
            boolean r1 = c4.j.j(r1, r2)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x0029
            int r1 = r6.f13449k     // Catch:{ all -> 0x00b1 }
            r6.z = r1     // Catch:{ all -> 0x00b1 }
            int r1 = r6.f13450l     // Catch:{ all -> 0x00b1 }
            r6.A = r1     // Catch:{ all -> 0x00b1 }
        L_0x0029:
            android.graphics.drawable.Drawable r1 = r6.g()     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x0031
            r1 = 5
            goto L_0x0032
        L_0x0031:
            r1 = 3
        L_0x0032:
            i3.r r2 = new i3.r     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00b1 }
            r6.o(r2, r1)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
            return
        L_0x003e:
            y3.h$a r1 = r6.f13460v     // Catch:{ all -> 0x00b1 }
            y3.h$a r2 = y3.h.a.RUNNING     // Catch:{ all -> 0x00b1 }
            if (r1 == r2) goto L_0x00a9
            y3.h$a r3 = y3.h.a.COMPLETE     // Catch:{ all -> 0x00b1 }
            r4 = 0
            if (r1 != r3) goto L_0x0052
            i3.w<R> r1 = r6.f13456r     // Catch:{ all -> 0x00b1 }
            g3.a r2 = g3.a.MEMORY_CACHE     // Catch:{ all -> 0x00b1 }
            r6.p(r1, r2, r4)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
            return
        L_0x0052:
            y3.h$a r1 = y3.h.a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00b1 }
            r6.f13460v = r1     // Catch:{ all -> 0x00b1 }
            int r3 = r6.f13449k     // Catch:{ all -> 0x00b1 }
            int r5 = r6.f13450l     // Catch:{ all -> 0x00b1 }
            boolean r3 = c4.j.j(r3, r5)     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x0068
            int r3 = r6.f13449k     // Catch:{ all -> 0x00b1 }
            int r5 = r6.f13450l     // Catch:{ all -> 0x00b1 }
            r6.c(r3, r5)     // Catch:{ all -> 0x00b1 }
            goto L_0x006d
        L_0x0068:
            z3.h<R> r3 = r6.f13452n     // Catch:{ all -> 0x00b1 }
            r3.a(r6)     // Catch:{ all -> 0x00b1 }
        L_0x006d:
            y3.h$a r3 = r6.f13460v     // Catch:{ all -> 0x00b1 }
            if (r3 == r2) goto L_0x0073
            if (r3 != r1) goto L_0x0089
        L_0x0073:
            y3.d r1 = r6.f13445e     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x007d
            boolean r1 = r1.e(r6)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x007e
        L_0x007d:
            r4 = 1
        L_0x007e:
            if (r4 == 0) goto L_0x0089
            z3.h<R> r1 = r6.f13452n     // Catch:{ all -> 0x00b1 }
            android.graphics.drawable.Drawable r2 = r6.k()     // Catch:{ all -> 0x00b1 }
            r1.d(r2)     // Catch:{ all -> 0x00b1 }
        L_0x0089:
            boolean r1 = D     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x00a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r1.<init>()     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00b1 }
            long r2 = r6.f13458t     // Catch:{ all -> 0x00b1 }
            double r2 = c4.f.a(r2)     // Catch:{ all -> 0x00b1 }
            r1.append(r2)     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b1 }
            r6.n(r1)     // Catch:{ all -> 0x00b1 }
        L_0x00a7:
            monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
            return
        L_0x00a9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00b1 }
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.h.i():void");
    }

    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f13443c) {
            a aVar = this.f13460v;
            if (aVar != a.RUNNING) {
                if (aVar != a.WAITING_FOR_SIZE) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f13443c) {
            z10 = this.f13460v == a.COMPLETE;
        }
        return z10;
    }

    public final Drawable k() {
        int i10;
        if (this.f13462x == null) {
            a<?> aVar = this.f13448j;
            Drawable drawable = aVar.f13431v;
            this.f13462x = drawable;
            if (drawable == null && (i10 = aVar.f13432w) > 0) {
                this.f13462x = m(i10);
            }
        }
        return this.f13462x;
    }

    public final boolean l() {
        d dVar = this.f13445e;
        return dVar == null || !dVar.g().a();
    }

    public final Drawable m(int i10) {
        Resources.Theme theme = this.f13448j.J;
        if (theme == null) {
            theme = this.f13446f.getTheme();
        }
        com.bumptech.glide.d dVar = this.g;
        return r3.a.a(dVar, dVar, i10, theme);
    }

    public final void n(String str) {
        StringBuilder c10 = b9.m.c(str, " this: ");
        c10.append(this.f13441a);
        Log.v("Request", c10.toString());
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084 A[Catch:{ all -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d A[Catch:{ all -> 0x0092 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(i3.r r5, int r6) {
        /*
            r4 = this;
            d4.d$a r0 = r4.f13442b
            r0.a()
            java.lang.Object r0 = r4.f13443c
            monitor-enter(r0)
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0096 }
            com.bumptech.glide.d r1 = r4.g     // Catch:{ all -> 0x0096 }
            int r1 = r1.i     // Catch:{ all -> 0x0096 }
            if (r1 > r6) goto L_0x0048
            java.lang.String r6 = "Glide"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r2.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = "Load failed for "
            r2.append(r3)     // Catch:{ all -> 0x0096 }
            java.lang.Object r3 = r4.f13447h     // Catch:{ all -> 0x0096 }
            r2.append(r3)     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = " with size ["
            r2.append(r3)     // Catch:{ all -> 0x0096 }
            int r3 = r4.z     // Catch:{ all -> 0x0096 }
            r2.append(r3)     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch:{ all -> 0x0096 }
            int r3 = r4.A     // Catch:{ all -> 0x0096 }
            r2.append(r3)     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = "]"
            r2.append(r3)     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0096 }
            android.util.Log.w(r6, r2, r5)     // Catch:{ all -> 0x0096 }
            r6 = 4
            if (r1 > r6) goto L_0x0048
            r5.e()     // Catch:{ all -> 0x0096 }
        L_0x0048:
            r5 = 0
            r4.f13457s = r5     // Catch:{ all -> 0x0096 }
            y3.h$a r5 = y3.h.a.FAILED     // Catch:{ all -> 0x0096 }
            r4.f13460v = r5     // Catch:{ all -> 0x0096 }
            r5 = 1
            r4.B = r5     // Catch:{ all -> 0x0096 }
            r6 = 0
            java.util.List<y3.e<R>> r1 = r4.f13453o     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0071
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0092 }
            r2 = r6
        L_0x005c:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0092 }
            if (r3 == 0) goto L_0x0072
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0092 }
            y3.e r3 = (y3.e) r3     // Catch:{ all -> 0x0092 }
            r4.l()     // Catch:{ all -> 0x0092 }
            boolean r3 = r3.b()     // Catch:{ all -> 0x0092 }
            r2 = r2 | r3
            goto L_0x005c
        L_0x0071:
            r2 = r6
        L_0x0072:
            y3.e<R> r1 = r4.f13444d     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0080
            r4.l()     // Catch:{ all -> 0x0092 }
            boolean r1 = r1.b()     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r5 = r6
        L_0x0081:
            r5 = r5 | r2
            if (r5 != 0) goto L_0x0087
            r4.r()     // Catch:{ all -> 0x0092 }
        L_0x0087:
            r4.B = r6     // Catch:{ all -> 0x0096 }
            y3.d r5 = r4.f13445e     // Catch:{ all -> 0x0096 }
            if (r5 == 0) goto L_0x0090
            r5.k(r4)     // Catch:{ all -> 0x0096 }
        L_0x0090:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return
        L_0x0092:
            r5 = move-exception
            r4.B = r6     // Catch:{ all -> 0x0096 }
            throw r5     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.h.o(i3.r, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r6.f13459u.f(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(i3.w<?> r7, g3.a r8, boolean r9) {
        /*
            r6 = this;
            d4.d$a r9 = r6.f13442b
            r9.a()
            r9 = 0
            java.lang.Object r0 = r6.f13443c     // Catch:{ all -> 0x00c6 }
            monitor-enter(r0)     // Catch:{ all -> 0x00c6 }
            r6.f13457s = r9     // Catch:{ all -> 0x00b8 }
            r1 = 5
            if (r7 != 0) goto L_0x0030
            i3.r r7 = new i3.r     // Catch:{ all -> 0x00b8 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r8.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r8.append(r2)     // Catch:{ all -> 0x00b8 }
            java.lang.Class<R> r2 = r6.i     // Catch:{ all -> 0x00b8 }
            r8.append(r2)     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = " inside, but instead got null."
            r8.append(r2)     // Catch:{ all -> 0x00b8 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00b8 }
            r7.<init>(r8)     // Catch:{ all -> 0x00b8 }
            r6.o(r7, r1)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            return
        L_0x0030:
            java.lang.Object r2 = r7.get()     // Catch:{ all -> 0x00b8 }
            if (r2 == 0) goto L_0x0065
            java.lang.Class<R> r3 = r6.i     // Catch:{ all -> 0x00b8 }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00b8 }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00b8 }
            if (r3 != 0) goto L_0x0043
            goto L_0x0065
        L_0x0043:
            y3.d r1 = r6.f13445e     // Catch:{ all -> 0x00b8 }
            if (r1 == 0) goto L_0x0050
            boolean r1 = r1.d(r6)     // Catch:{ all -> 0x00b8 }
            if (r1 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1 = 0
            goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0060
            r6.f13456r = r9     // Catch:{ all -> 0x00b4 }
            y3.h$a r8 = y3.h.a.COMPLETE     // Catch:{ all -> 0x00b4 }
            r6.f13460v = r8     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
        L_0x005a:
            i3.m r8 = r6.f13459u
            r8.f(r7)
            return
        L_0x0060:
            r6.q(r7, r2, r8)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            return
        L_0x0065:
            r6.f13456r = r9     // Catch:{ all -> 0x00b4 }
            i3.r r8 = new i3.r     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r9.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "Expected to receive an object of "
            r9.append(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.Class<R> r3 = r6.i     // Catch:{ all -> 0x00b4 }
            r9.append(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = " but instead got "
            r9.append(r3)     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x0084
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x00b4 }
            goto L_0x0086
        L_0x0084:
            java.lang.String r3 = ""
        L_0x0086:
            r9.append(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "{"
            r9.append(r3)     // Catch:{ all -> 0x00b4 }
            r9.append(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "} inside Resource{"
            r9.append(r3)     // Catch:{ all -> 0x00b4 }
            r9.append(r7)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "}."
            r9.append(r3)     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x00a3
            java.lang.String r2 = ""
            goto L_0x00a5
        L_0x00a3:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x00a5:
            r9.append(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00b4 }
            r8.<init>(r9)     // Catch:{ all -> 0x00b4 }
            r6.o(r8, r1)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x005a
        L_0x00b4:
            r8 = move-exception
            r9 = r7
            r7 = r6
            goto L_0x00bd
        L_0x00b8:
            r7 = move-exception
            r8 = r6
        L_0x00ba:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x00bd:
            monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
            throw r8     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r8 = move-exception
            goto L_0x00c8
        L_0x00c1:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x00ba
        L_0x00c6:
            r8 = move-exception
            r7 = r6
        L_0x00c8:
            if (r9 == 0) goto L_0x00cf
            i3.m r7 = r7.f13459u
            r7.f(r9)
        L_0x00cf:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.h.p(i3.w, g3.a, boolean):void");
    }

    /* JADX INFO: finally extract failed */
    public final void q(w wVar, Object obj, g3.a aVar) {
        boolean z10;
        l();
        this.f13460v = a.COMPLETE;
        this.f13456r = wVar;
        if (this.g.i <= 3) {
            StringBuilder d10 = a.a.d("Finished loading ");
            d10.append(obj.getClass().getSimpleName());
            d10.append(" from ");
            d10.append(aVar);
            d10.append(" for ");
            d10.append(this.f13447h);
            d10.append(" with size [");
            d10.append(this.z);
            d10.append("x");
            d10.append(this.A);
            d10.append("] in ");
            d10.append(f.a(this.f13458t));
            d10.append(" ms");
            Log.d("Glide", d10.toString());
        }
        boolean z11 = true;
        this.B = true;
        try {
            List<e<R>> list = this.f13453o;
            if (list != null) {
                z10 = false;
                for (e<R> a10 : list) {
                    z10 |= a10.a();
                }
            } else {
                z10 = false;
            }
            e<R> eVar = this.f13444d;
            if (eVar == null || !eVar.a()) {
                z11 = false;
            }
            if (!z11 && !z10) {
                Objects.requireNonNull(this.f13454p);
                this.f13452n.g(obj);
            }
            this.B = false;
            d dVar = this.f13445e;
            if (dVar != null) {
                dVar.l(this);
            }
        } catch (Throwable th2) {
            this.B = false;
            throw th2;
        }
    }

    public final void r() {
        int i10;
        d dVar = this.f13445e;
        if (dVar == null || dVar.e(this)) {
            Drawable drawable = null;
            if (this.f13447h == null) {
                drawable = g();
            }
            if (drawable == null) {
                if (this.f13461w == null) {
                    a<?> aVar = this.f13448j;
                    Drawable drawable2 = aVar.f13429t;
                    this.f13461w = drawable2;
                    if (drawable2 == null && (i10 = aVar.f13430u) > 0) {
                        this.f13461w = m(i10);
                    }
                }
                drawable = this.f13461w;
            }
            if (drawable == null) {
                drawable = k();
            }
            this.f13452n.c(drawable);
        }
    }
}
