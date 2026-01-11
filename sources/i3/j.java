package i3;

import android.os.SystemClock;
import android.util.Log;
import b9.m;
import com.github.mikephil.charting.BuildConfig;
import d4.a;
import d4.d;
import i3.h;
import i3.k;
import i3.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public int A;
    public int B;
    public l C;
    public g3.h D;
    public b<R> E;
    public int F;
    public h G;
    public g H;
    public long I;
    public boolean J;
    public Object K;
    public Thread L;
    public g3.f M;
    public g3.f N;
    public Object O;
    public g3.a P;
    public com.bumptech.glide.load.data.d<?> Q;
    public volatile h R;
    public volatile boolean S;
    public volatile boolean T;
    public boolean U;

    /* renamed from: a  reason: collision with root package name */
    public final i<R> f6058a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final List<Throwable> f6059b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final d.a f6060c = new d.a();

    /* renamed from: s  reason: collision with root package name */
    public final e f6061s;

    /* renamed from: t  reason: collision with root package name */
    public final m0.c<j<?>> f6062t;

    /* renamed from: u  reason: collision with root package name */
    public final d<?> f6063u = new d<>();

    /* renamed from: v  reason: collision with root package name */
    public final f f6064v = new f();

    /* renamed from: w  reason: collision with root package name */
    public com.bumptech.glide.d f6065w;

    /* renamed from: x  reason: collision with root package name */
    public g3.f f6066x;

    /* renamed from: y  reason: collision with root package name */
    public com.bumptech.glide.g f6067y;
    public p z;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6068a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f6069b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f6070c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                g3.c[] r0 = g3.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6070c = r0
                r1 = 1
                g3.c r2 = g3.c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6070c     // Catch:{ NoSuchFieldError -> 0x001d }
                g3.c r3 = g3.c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                i3.j$h[] r2 = i3.j.h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f6069b = r2
                i3.j$h r3 = i3.j.h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f6069b     // Catch:{ NoSuchFieldError -> 0x0038 }
                i3.j$h r3 = i3.j.h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f6069b     // Catch:{ NoSuchFieldError -> 0x0043 }
                i3.j$h r4 = i3.j.h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f6069b     // Catch:{ NoSuchFieldError -> 0x004e }
                i3.j$h r4 = i3.j.h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f6069b     // Catch:{ NoSuchFieldError -> 0x0059 }
                i3.j$h r4 = i3.j.h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                i3.j$g[] r3 = i3.j.g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6068a = r3
                i3.j$g r4 = i3.j.g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f6068a     // Catch:{ NoSuchFieldError -> 0x0074 }
                i3.j$g r3 = i3.j.g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f6068a     // Catch:{ NoSuchFieldError -> 0x007e }
                i3.j$g r1 = i3.j.g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i3.j.a.<clinit>():void");
        }
    }

    public interface b<R> {
    }

    public final class c<Z> implements k.a<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final g3.a f6071a;

        public c(g3.a aVar) {
            this.f6071a = aVar;
        }
    }

    public static class d<Z> {

        /* renamed from: a  reason: collision with root package name */
        public g3.f f6073a;

        /* renamed from: b  reason: collision with root package name */
        public g3.k<Z> f6074b;

        /* renamed from: c  reason: collision with root package name */
        public v<Z> f6075c;
    }

    public interface e {
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6076a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6077b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6078c;

        public final boolean a() {
            return (this.f6078c || this.f6077b) && this.f6076a;
        }
    }

    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public j(e eVar, m0.c<j<?>> cVar) {
        this.f6061s = eVar;
        this.f6062t = cVar;
    }

    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int ordinal = this.f6067y.ordinal() - jVar.f6067y.ordinal();
        return ordinal == 0 ? this.F - jVar.F : ordinal;
    }

    public final void d() {
        this.H = g.SWITCH_TO_SOURCE_SERVICE;
        ((n) this.E).i(this);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<java.lang.Throwable>, java.util.ArrayList] */
    public final void e(g3.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, g3.a aVar) {
        dVar.b();
        r rVar = new r("Fetching data failed", Collections.singletonList(exc));
        Class<?> a10 = dVar.a();
        rVar.f6143b = fVar;
        rVar.f6144c = aVar;
        rVar.f6145s = a10;
        this.f6059b.add(rVar);
        if (Thread.currentThread() != this.L) {
            this.H = g.SWITCH_TO_SOURCE_SERVICE;
            ((n) this.E).i(this);
            return;
        }
        u();
    }

    public final d4.d h() {
        return this.f6060c;
    }

    public final void i(g3.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, g3.a aVar, g3.f fVar2) {
        this.M = fVar;
        this.O = obj;
        this.Q = dVar;
        this.P = aVar;
        this.N = fVar2;
        boolean z10 = false;
        if (fVar != ((ArrayList) this.f6058a.a()).get(0)) {
            z10 = true;
        }
        this.U = z10;
        if (Thread.currentThread() != this.L) {
            this.H = g.DECODE_DATA;
            ((n) this.E).i(this);
            return;
        }
        o();
    }

    public final <Data> w<R> k(com.bumptech.glide.load.data.d<?> dVar, Data data, g3.a aVar) throws r {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i = c4.f.f3234b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            w<R> l10 = l(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                r("Decoded result " + l10, elapsedRealtimeNanos, (String) null);
            }
            return l10;
        } finally {
            dVar.b();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.bumptech.glide.load.data.e<?>} */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e$a<?>>] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e$a<?>>] */
    /* JADX WARNING: type inference failed for: r4v4, types: [c4.b, s.a<g3.g<?>, java.lang.Object>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Data> i3.w<R> l(Data r9, g3.a r10) throws i3.r {
        /*
            r8 = this;
            i3.i<R> r0 = r8.f6058a
            java.lang.Class r1 = r9.getClass()
            i3.u r2 = r0.d(r1)
            g3.h r0 = r8.D
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 >= r3) goto L_0x0013
            goto L_0x0033
        L_0x0013:
            g3.a r1 = g3.a.RESOURCE_DISK_CACHE
            if (r10 == r1) goto L_0x0020
            i3.i<R> r1 = r8.f6058a
            boolean r1 = r1.f6057r
            if (r1 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r1 = 0
            goto L_0x0021
        L_0x0020:
            r1 = 1
        L_0x0021:
            g3.g<java.lang.Boolean> r3 = p3.m.i
            java.lang.Object r4 = r0.c(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x0035
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0033
            if (r1 == 0) goto L_0x0035
        L_0x0033:
            r4 = r0
            goto L_0x0049
        L_0x0035:
            g3.h r0 = new g3.h
            r0.<init>()
            g3.h r4 = r8.D
            r0.d(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            s.a<g3.g<?>, java.lang.Object> r4 = r0.f5237b
            r4.put(r3, r1)
            goto L_0x0033
        L_0x0049:
            com.bumptech.glide.d r0 = r8.f6065w
            com.bumptech.glide.h r0 = r0.f3517b
            com.bumptech.glide.load.data.f r0 = r0.f3530e
            monitor-enter(r0)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e$a<?>> r1 = r0.f3564a     // Catch:{ all -> 0x00a3 }
            java.lang.Class r3 = r9.getClass()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x00a3 }
            com.bumptech.glide.load.data.e$a r1 = (com.bumptech.glide.load.data.e.a) r1     // Catch:{ all -> 0x00a3 }
            if (r1 != 0) goto L_0x0083
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e$a<?>> r3 = r0.f3564a     // Catch:{ all -> 0x00a3 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x0068:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r5 == 0) goto L_0x0083
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00a3 }
            com.bumptech.glide.load.data.e$a r5 = (com.bumptech.glide.load.data.e.a) r5     // Catch:{ all -> 0x00a3 }
            java.lang.Class r6 = r5.a()     // Catch:{ all -> 0x00a3 }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x00a3 }
            boolean r6 = r6.isAssignableFrom(r7)     // Catch:{ all -> 0x00a3 }
            if (r6 == 0) goto L_0x0068
            r1 = r5
        L_0x0083:
            if (r1 != 0) goto L_0x0087
            com.bumptech.glide.load.data.e$a<?> r1 = com.bumptech.glide.load.data.f.f3563b     // Catch:{ all -> 0x00a3 }
        L_0x0087:
            com.bumptech.glide.load.data.e r9 = r1.b(r9)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r0)
            int r5 = r8.A     // Catch:{ all -> 0x009e }
            int r6 = r8.B     // Catch:{ all -> 0x009e }
            i3.j$c r7 = new i3.j$c     // Catch:{ all -> 0x009e }
            r7.<init>(r10)     // Catch:{ all -> 0x009e }
            r3 = r9
            i3.w r10 = r2.a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x009e }
            r9.b()
            return r10
        L_0x009e:
            r10 = move-exception
            r9.b()
            throw r10
        L_0x00a3:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.j.l(java.lang.Object, g3.a):i3.w");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: i3.v<R>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: i3.v<R>} */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.util.List<java.lang.Throwable>, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r13 = this;
            java.lang.String r0 = "DecodeJob"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "Retrieved data"
            long r1 = r13.I
            java.lang.String r3 = "data: "
            java.lang.StringBuilder r3 = a.a.d(r3)
            java.lang.Object r4 = r13.O
            r3.append(r4)
            java.lang.String r4 = ", cache key: "
            r3.append(r4)
            g3.f r4 = r13.M
            r3.append(r4)
            java.lang.String r4 = ", fetcher: "
            r3.append(r4)
            com.bumptech.glide.load.data.d<?> r4 = r13.Q
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r13.r(r0, r1, r3)
        L_0x0033:
            r0 = 0
            com.bumptech.glide.load.data.d<?> r1 = r13.Q     // Catch:{ r -> 0x003f }
            java.lang.Object r2 = r13.O     // Catch:{ r -> 0x003f }
            g3.a r3 = r13.P     // Catch:{ r -> 0x003f }
            i3.w r1 = r13.k(r1, r2, r3)     // Catch:{ r -> 0x003f }
            goto L_0x0050
        L_0x003f:
            r1 = move-exception
            g3.f r2 = r13.N
            g3.a r3 = r13.P
            r1.f6143b = r2
            r1.f6144c = r3
            r1.f6145s = r0
            java.util.List<java.lang.Throwable> r2 = r13.f6059b
            r2.add(r1)
            r1 = r0
        L_0x0050:
            if (r1 == 0) goto L_0x0160
            g3.a r2 = r13.P
            boolean r3 = r13.U
            boolean r4 = r1 instanceof i3.s
            if (r4 == 0) goto L_0x0060
            r4 = r1
            i3.s r4 = (i3.s) r4
            r4.a()
        L_0x0060:
            i3.j$d<?> r4 = r13.f6063u
            i3.v<Z> r4 = r4.f6075c
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x006a
            r4 = r6
            goto L_0x006b
        L_0x006a:
            r4 = r5
        L_0x006b:
            if (r4 == 0) goto L_0x0072
            i3.v r0 = i3.v.a(r1)
            r1 = r0
        L_0x0072:
            r13.w()
            i3.j$b<R> r4 = r13.E
            i3.n r4 = (i3.n) r4
            monitor-enter(r4)
            r4.F = r1     // Catch:{ all -> 0x015d }
            r4.G = r2     // Catch:{ all -> 0x015d }
            r4.N = r3     // Catch:{ all -> 0x015d }
            monitor-exit(r4)     // Catch:{ all -> 0x015d }
            monitor-enter(r4)
            d4.d$a r1 = r4.f6111b     // Catch:{ all -> 0x015a }
            r1.a()     // Catch:{ all -> 0x015a }
            boolean r1 = r4.M     // Catch:{ all -> 0x015a }
            if (r1 == 0) goto L_0x0095
            i3.w<?> r1 = r4.F     // Catch:{ all -> 0x015a }
            r1.d()     // Catch:{ all -> 0x015a }
            r4.f()     // Catch:{ all -> 0x015a }
            monitor-exit(r4)     // Catch:{ all -> 0x015a }
            goto L_0x00f9
        L_0x0095:
            i3.n$e r1 = r4.f6110a     // Catch:{ all -> 0x015a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x015a }
            if (r1 != 0) goto L_0x0152
            boolean r1 = r4.H     // Catch:{ all -> 0x015a }
            if (r1 != 0) goto L_0x014a
            i3.n$c r1 = r4.f6114t     // Catch:{ all -> 0x015a }
            i3.w<?> r8 = r4.F     // Catch:{ all -> 0x015a }
            boolean r9 = r4.B     // Catch:{ all -> 0x015a }
            g3.f r11 = r4.A     // Catch:{ all -> 0x015a }
            i3.q$a r12 = r4.f6112c     // Catch:{ all -> 0x015a }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x015a }
            i3.q r1 = new i3.q     // Catch:{ all -> 0x015a }
            r10 = 1
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x015a }
            r4.K = r1     // Catch:{ all -> 0x015a }
            r4.H = r6     // Catch:{ all -> 0x015a }
            i3.n$e r1 = r4.f6110a     // Catch:{ all -> 0x015a }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x015a }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x015a }
            java.util.List<i3.n$d> r1 = r1.f6126a     // Catch:{ all -> 0x015a }
            r2.<init>(r1)     // Catch:{ all -> 0x015a }
            int r1 = r2.size()     // Catch:{ all -> 0x015a }
            int r1 = r1 + r6
            r4.d(r1)     // Catch:{ all -> 0x015a }
            g3.f r1 = r4.A     // Catch:{ all -> 0x015a }
            i3.q<?> r3 = r4.K     // Catch:{ all -> 0x015a }
            monitor-exit(r4)     // Catch:{ all -> 0x015a }
            i3.o r7 = r4.f6115u
            i3.m r7 = (i3.m) r7
            r7.e(r4, r1, r3)
            java.util.Iterator r1 = r2.iterator()
        L_0x00dd:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00f6
            java.lang.Object r2 = r1.next()
            i3.n$d r2 = (i3.n.d) r2
            java.util.concurrent.Executor r3 = r2.f6125b
            i3.n$b r7 = new i3.n$b
            y3.g r2 = r2.f6124a
            r7.<init>(r2)
            r3.execute(r7)
            goto L_0x00dd
        L_0x00f6:
            r4.c()
        L_0x00f9:
            i3.j$h r1 = i3.j.h.ENCODE
            r13.G = r1
            i3.j$d<?> r1 = r13.f6063u     // Catch:{ all -> 0x0143 }
            i3.v<Z> r2 = r1.f6075c     // Catch:{ all -> 0x0143 }
            if (r2 == 0) goto L_0x0104
            r5 = r6
        L_0x0104:
            if (r5 == 0) goto L_0x012b
            i3.j$e r2 = r13.f6061s     // Catch:{ all -> 0x0143 }
            g3.h r3 = r13.D     // Catch:{ all -> 0x0143 }
            i3.m$c r2 = (i3.m.c) r2     // Catch:{ all -> 0x0124 }
            k3.a r2 = r2.a()     // Catch:{ all -> 0x0124 }
            g3.f r4 = r1.f6073a     // Catch:{ all -> 0x0124 }
            i3.g r5 = new i3.g     // Catch:{ all -> 0x0124 }
            g3.k<Z> r7 = r1.f6074b     // Catch:{ all -> 0x0124 }
            i3.v<Z> r8 = r1.f6075c     // Catch:{ all -> 0x0124 }
            r5.<init>(r7, r8, r3)     // Catch:{ all -> 0x0124 }
            r2.a(r4, r5)     // Catch:{ all -> 0x0124 }
            i3.v<Z> r1 = r1.f6075c     // Catch:{ all -> 0x0143 }
            r1.e()     // Catch:{ all -> 0x0143 }
            goto L_0x012b
        L_0x0124:
            r2 = move-exception
            i3.v<Z> r1 = r1.f6075c     // Catch:{ all -> 0x0143 }
            r1.e()     // Catch:{ all -> 0x0143 }
            throw r2     // Catch:{ all -> 0x0143 }
        L_0x012b:
            if (r0 == 0) goto L_0x0130
            r0.e()
        L_0x0130:
            i3.j$f r0 = r13.f6064v
            monitor-enter(r0)
            r0.f6077b = r6     // Catch:{ all -> 0x0140 }
            boolean r1 = r0.a()     // Catch:{ all -> 0x0140 }
            monitor-exit(r0)
            if (r1 == 0) goto L_0x0163
            r13.t()
            goto L_0x0163
        L_0x0140:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0143:
            r1 = move-exception
            if (r0 == 0) goto L_0x0149
            r0.e()
        L_0x0149:
            throw r1
        L_0x014a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x015a }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x015a }
            throw r0     // Catch:{ all -> 0x015a }
        L_0x0152:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x015a }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x015a }
            throw r0     // Catch:{ all -> 0x015a }
        L_0x015a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x015a }
            throw r0
        L_0x015d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x015d }
            throw r0
        L_0x0160:
            r13.u()
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.j.o():void");
    }

    public final h p() {
        int i = a.f6069b[this.G.ordinal()];
        if (i == 1) {
            return new x(this.f6058a, this);
        }
        if (i == 2) {
            return new e(this.f6058a, this);
        }
        if (i == 3) {
            return new b0(this.f6058a, this);
        }
        if (i == 4) {
            return null;
        }
        StringBuilder d10 = a.a.d("Unrecognized stage: ");
        d10.append(this.G);
        throw new IllegalStateException(d10.toString());
    }

    public final h q(h hVar) {
        int i = a.f6069b[hVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.J ? h.FINISHED : h.SOURCE;
            }
            if (i == 3 || i == 4) {
                return h.FINISHED;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unrecognized stage: " + hVar);
            } else if (this.C.b()) {
                return h.RESOURCE_CACHE;
            } else {
                return q(h.RESOURCE_CACHE);
            }
        } else if (this.C.a()) {
            return h.DATA_CACHE;
        } else {
            return q(h.DATA_CACHE);
        }
    }

    public final void r(String str, long j10, String str2) {
        StringBuilder c10 = m.c(str, " in ");
        c10.append(c4.f.a(j10));
        c10.append(", load key: ");
        c10.append(this.z);
        c10.append(str2 != null ? a8.a.c(", ", str2) : BuildConfig.FLAVOR);
        c10.append(", thread: ");
        c10.append(Thread.currentThread().getName());
        Log.v("DecodeJob", c10.toString());
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<java.lang.Throwable>, java.util.ArrayList] */
    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.Q;
        try {
            if (this.T) {
                s();
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            v();
            if (dVar != null) {
                dVar.b();
            }
        } catch (d e10) {
            throw e10;
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            throw th2;
        }
    }

    public final void s() {
        boolean a10;
        w();
        r rVar = new r("Failed to load resource", new ArrayList(this.f6059b));
        n nVar = (n) this.E;
        synchronized (nVar) {
            nVar.I = rVar;
        }
        synchronized (nVar) {
            nVar.f6111b.a();
            if (nVar.M) {
                nVar.f();
            } else if (nVar.f6110a.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!nVar.J) {
                nVar.J = true;
                g3.f fVar = nVar.A;
                n.e eVar = nVar.f6110a;
                Objects.requireNonNull(eVar);
                ArrayList arrayList = new ArrayList(eVar.f6126a);
                nVar.d(arrayList.size() + 1);
                ((m) nVar.f6115u).e(nVar, fVar, (q<?>) null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    n.d dVar = (n.d) it.next();
                    dVar.f6125b.execute(new n.a(dVar.f6124a));
                }
                nVar.c();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        f fVar2 = this.f6064v;
        synchronized (fVar2) {
            fVar2.f6078c = true;
            a10 = fVar2.a();
        }
        if (a10) {
            t();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List<m3.o$a<?>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<g3.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<java.lang.Throwable>, java.util.ArrayList] */
    public final void t() {
        f fVar = this.f6064v;
        synchronized (fVar) {
            fVar.f6077b = false;
            fVar.f6076a = false;
            fVar.f6078c = false;
        }
        d<?> dVar = this.f6063u;
        dVar.f6073a = null;
        dVar.f6074b = null;
        dVar.f6075c = null;
        i<R> iVar = this.f6058a;
        iVar.f6044c = null;
        iVar.f6045d = null;
        iVar.f6053n = null;
        iVar.g = null;
        iVar.f6050k = null;
        iVar.i = null;
        iVar.f6054o = null;
        iVar.f6049j = null;
        iVar.f6055p = null;
        iVar.f6042a.clear();
        iVar.f6051l = false;
        iVar.f6043b.clear();
        iVar.f6052m = false;
        this.S = false;
        this.f6065w = null;
        this.f6066x = null;
        this.D = null;
        this.f6067y = null;
        this.z = null;
        this.E = null;
        this.G = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.I = 0;
        this.T = false;
        this.K = null;
        this.f6059b.clear();
        this.f6062t.a(this);
    }

    public final void u() {
        this.L = Thread.currentThread();
        int i = c4.f.f3234b;
        this.I = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        while (!this.T && this.R != null && !(z10 = this.R.a())) {
            this.G = q(this.G);
            this.R = p();
            if (this.G == h.SOURCE) {
                this.H = g.SWITCH_TO_SOURCE_SERVICE;
                ((n) this.E).i(this);
                return;
            }
        }
        if ((this.G == h.FINISHED || this.T) && !z10) {
            s();
        }
    }

    public final void v() {
        int i = a.f6068a[this.H.ordinal()];
        if (i == 1) {
            this.G = q(h.INITIALIZE);
            this.R = p();
            u();
        } else if (i == 2) {
            u();
        } else if (i == 3) {
            o();
        } else {
            StringBuilder d10 = a.a.d("Unrecognized run reason: ");
            d10.append(this.H);
            throw new IllegalStateException(d10.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<java.lang.Throwable>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<java.lang.Throwable>, java.util.ArrayList] */
    public final void w() {
        Throwable th2;
        this.f6060c.a();
        if (this.S) {
            if (this.f6059b.isEmpty()) {
                th2 = null;
            } else {
                ? r02 = this.f6059b;
                th2 = (Throwable) r02.get(r02.size() - 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.S = true;
    }
}
