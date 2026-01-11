package ab;

import android.content.Context;
import android.util.Log;
import c3.k;
import ge.d0;
import ge.g0;
import ge.g1;
import ge.j1;
import ge.o0;
import ge.v1;
import io.nodle.cash.R;
import java.util.concurrent.CancellationException;
import je.h;
import je.l;
import je.o;
import l6.b1;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import rd.i;
import xd.p;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f215a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final ne.c f216b = ((ne.c) g0.i());

    /* renamed from: c  reason: collision with root package name */
    public static final ne.c f217c = ((ne.c) g0.i());

    /* renamed from: d  reason: collision with root package name */
    public static final ne.c f218d = ((ne.c) g0.i());

    /* renamed from: e  reason: collision with root package name */
    public static final ne.c f219e = ((ne.c) g0.i());

    /* renamed from: f  reason: collision with root package name */
    public static j1 f220f = ((j1) ad.c.b());
    public static j1 g = ((j1) ad.c.b());

    /* renamed from: h  reason: collision with root package name */
    public static j1 f221h = ((j1) ad.c.b());
    public static j1 i = ((j1) ad.c.b());

    /* renamed from: j  reason: collision with root package name */
    public static v1 f222j;

    /* renamed from: k  reason: collision with root package name */
    public static v1 f223k;

    /* renamed from: l  reason: collision with root package name */
    public static v1 f224l;

    /* renamed from: m  reason: collision with root package name */
    public static final o f225m = new o(new md.f(h.NONE, null));

    /* renamed from: n  reason: collision with root package name */
    public static final h<String> f226n = ((l) g0.h(0, 7));

    /* renamed from: o  reason: collision with root package name */
    public static String f227o;

    /* renamed from: p  reason: collision with root package name */
    public static b f228p = b.NONE;

    /* renamed from: q  reason: collision with root package name */
    public static String f229q;

    /* renamed from: r  reason: collision with root package name */
    public static String f230r;

    /* renamed from: s  reason: collision with root package name */
    public static String f231s;

    /* renamed from: t  reason: collision with root package name */
    public static a f232t = a.NONE;

    @rd.e(c = "io.nodle.cash.domain.manager.FlashManager$setActionText$1", f = "FlashManager.kt", l = {129, 134}, m = "invokeSuspend")
    public static final class a extends i implements p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f233a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f234b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f235c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ a f236s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ boolean f237t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, a aVar, boolean z, pd.d<? super a> dVar) {
            super(2, dVar);
            this.f234b = str;
            this.f235c = str2;
            this.f236s = aVar;
            this.f237t = z;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            return new a(this.f234b, this.f235c, this.f236s, this.f237t, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                qd.a r0 = qd.a.COROUTINE_SUSPENDED
                int r1 = r6.f233a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x001d
                if (r1 == r4) goto L_0x0019
                if (r1 != r3) goto L_0x0011
                l6.b1.w(r7)
                goto L_0x004f
            L_0x0011:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0019:
                l6.b1.w(r7)
                goto L_0x002b
            L_0x001d:
                l6.b1.w(r7)
                ne.c r7 = ab.f.f218d
                r6.f233a = r4
                java.lang.Object r7 = ((ne.c) r7).b((java.lang.Object) null, r6)
                if (r7 != r0) goto L_0x002b
                return r0
            L_0x002b:
                ab.f r7 = ab.f.f215a
                java.lang.String r7 = r6.f234b
                ab.f.a(r7)
                java.lang.String r7 = r6.f235c
                ab.f.f231s = r7
                ab.a r7 = r6.f236s
                ab.f.f232t = r7
                java.lang.String r7 = ab.f.f230r
                if (r7 == 0) goto L_0x005a
                boolean r7 = r6.f237t
                if (r7 == 0) goto L_0x005a
                ab.f r7 = ab.f.f215a
                r4 = 3000(0xbb8, double:1.482E-320)
                r6.f233a = r3
                java.lang.Object r7 = c3.k.f0(r4, r6)
                if (r7 != r0) goto L_0x004f
                return r0
            L_0x004f:
                ab.f r7 = ab.f.f215a
                ab.f.a(r2)
                ab.f.f231s = r2
                ab.a r7 = ab.a.NONE
                ab.f.f232t = r7
            L_0x005a:
                ne.c r7 = ab.f.f218d
                boolean r0 = r7.c()
                if (r0 == 0) goto L_0x0065
                r7.a(r2)
            L_0x0065:
                md.m r7 = md.m.f8555a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ab.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @rd.e(c = "io.nodle.cash.domain.manager.FlashManager", f = "FlashManager.kt", l = {205}, m = "setAlert")
    public static final class b extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public f f238a;

        /* renamed from: b  reason: collision with root package name */
        public String f239b;

        /* renamed from: c  reason: collision with root package name */
        public String f240c;

        /* renamed from: s  reason: collision with root package name */
        public a f241s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f242t;

        /* renamed from: u  reason: collision with root package name */
        public /* synthetic */ Object f243u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ f f244v;

        /* renamed from: w  reason: collision with root package name */
        public int f245w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar, pd.d<? super b> dVar) {
            super(dVar);
            this.f244v = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f243u = obj;
            this.f245w |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f244v.i((String) null, (String) null, (a) null, false, false, this);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.manager.FlashManager$setDevice$1", f = "FlashManager.kt", l = {239}, m = "invokeSuspend")
    public static final class c extends i implements p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public ne.c f246a;

        /* renamed from: b  reason: collision with root package name */
        public String f247b;

        /* renamed from: c  reason: collision with root package name */
        public int f248c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ String f249s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, pd.d<? super c> dVar) {
            super(2, dVar);
            this.f249s = str;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            return new c(this.f249s, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            ne.c cVar;
            String str;
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f248c;
            if (i == 0) {
                b1.w(obj);
                cVar = f.f219e;
                String str2 = this.f249s;
                this.f246a = cVar;
                this.f247b = str2;
                this.f248c = 1;
                if (cVar.b((Object) null, this) == aVar) {
                    return aVar;
                }
                str = str2;
            } else if (i == 1) {
                str = this.f247b;
                cVar = this.f246a;
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                f fVar = f.f215a;
                Log.d("f", "Device: " + str);
                ge.g.b(k.j(o0.f5433a), (pd.f) null, new d(str, (pd.d<? super d>) null), 3);
                return m.f8555a;
            } finally {
                cVar.a((Object) null);
            }
        }
    }

    @rd.e(c = "io.nodle.cash.domain.manager.FlashManager", f = "FlashManager.kt", l = {160}, m = "setMain")
    public static final class d extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public f f250a;

        /* renamed from: b  reason: collision with root package name */
        public String f251b;

        /* renamed from: c  reason: collision with root package name */
        public b f252c;

        /* renamed from: s  reason: collision with root package name */
        public boolean f253s;

        /* renamed from: t  reason: collision with root package name */
        public /* synthetic */ Object f254t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ f f255u;

        /* renamed from: v  reason: collision with root package name */
        public int f256v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(f fVar, pd.d<? super d> dVar) {
            super(dVar);
            this.f255u = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f254t = obj;
            this.f256v |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f255u.l((String) null, (b) null, false, false, this);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.manager.FlashManager$setMainText$1", f = "FlashManager.kt", l = {105, 109}, m = "invokeSuspend")
    public static final class e extends i implements p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f257a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f258b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f259c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ boolean f260s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, b bVar, boolean z, pd.d<? super e> dVar) {
            super(2, dVar);
            this.f258b = str;
            this.f259c = bVar;
            this.f260s = z;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            return new e(this.f258b, this.f259c, this.f260s, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((e) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                qd.a r0 = qd.a.COROUTINE_SUSPENDED
                int r1 = r6.f257a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x001d
                if (r1 == r4) goto L_0x0019
                if (r1 != r3) goto L_0x0011
                l6.b1.w(r7)
                goto L_0x004b
            L_0x0011:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0019:
                l6.b1.w(r7)
                goto L_0x002b
            L_0x001d:
                l6.b1.w(r7)
                ne.c r7 = ab.f.f216b
                r6.f257a = r4
                java.lang.Object r7 = ((ne.c) r7).b((java.lang.Object) null, r6)
                if (r7 != r0) goto L_0x002b
                return r0
            L_0x002b:
                ab.f r7 = ab.f.f215a
                java.lang.String r7 = r6.f258b
                ab.f.b(r7)
                ab.b r7 = r6.f259c
                ab.f.f228p = r7
                java.lang.String r7 = ab.f.f227o
                if (r7 == 0) goto L_0x0054
                boolean r7 = r6.f260s
                if (r7 == 0) goto L_0x0054
                ab.f r7 = ab.f.f215a
                r4 = 3000(0xbb8, double:1.482E-320)
                r6.f257a = r3
                java.lang.Object r7 = c3.k.f0(r4, r6)
                if (r7 != r0) goto L_0x004b
                return r0
            L_0x004b:
                ab.f r7 = ab.f.f215a
                ab.f.b(r2)
                ab.b r7 = ab.b.NONE
                ab.f.f228p = r7
            L_0x0054:
                ne.c r7 = ab.f.f216b
                boolean r0 = r7.c()
                if (r0 == 0) goto L_0x005f
                r7.a(r2)
            L_0x005f:
                md.m r7 = md.m.f8555a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ab.f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @rd.e(c = "io.nodle.cash.domain.manager.FlashManager", f = "FlashManager.kt", l = {174}, m = "setSub")
    /* renamed from: ab.f$f  reason: collision with other inner class name */
    public static final class C0002f extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public f f261a;

        /* renamed from: b  reason: collision with root package name */
        public String f262b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f263c;

        /* renamed from: s  reason: collision with root package name */
        public /* synthetic */ Object f264s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ f f265t;

        /* renamed from: u  reason: collision with root package name */
        public int f266u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0002f(f fVar, pd.d<? super C0002f> dVar) {
            super(dVar);
            this.f265t = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f264s = obj;
            this.f266u |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f265t.n((String) null, false, false, this);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.manager.FlashManager$setSubText$1", f = "FlashManager.kt", l = {118, 121}, m = "invokeSuspend")
    public static final class g extends i implements p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f267a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f268b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f269c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z, pd.d<? super g> dVar) {
            super(2, dVar);
            this.f268b = str;
            this.f269c = z;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            return new g(this.f268b, this.f269c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((g) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                qd.a r0 = qd.a.COROUTINE_SUSPENDED
                int r1 = r6.f267a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x001d
                if (r1 == r4) goto L_0x0019
                if (r1 != r3) goto L_0x0011
                l6.b1.w(r7)
                goto L_0x0047
            L_0x0011:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0019:
                l6.b1.w(r7)
                goto L_0x002b
            L_0x001d:
                l6.b1.w(r7)
                ne.c r7 = ab.f.f217c
                r6.f267a = r4
                java.lang.Object r7 = ((ne.c) r7).b((java.lang.Object) null, r6)
                if (r7 != r0) goto L_0x002b
                return r0
            L_0x002b:
                ab.f r7 = ab.f.f215a
                java.lang.String r7 = r6.f268b
                ab.f.c(r7)
                java.lang.String r7 = ab.f.f229q
                if (r7 == 0) goto L_0x004c
                boolean r7 = r6.f269c
                if (r7 == 0) goto L_0x004c
                ab.f r7 = ab.f.f215a
                r4 = 3000(0xbb8, double:1.482E-320)
                r6.f267a = r3
                java.lang.Object r7 = c3.k.f0(r4, r6)
                if (r7 != r0) goto L_0x0047
                return r0
            L_0x0047:
                ab.f r7 = ab.f.f215a
                ab.f.c(r2)
            L_0x004c:
                ne.c r7 = ab.f.f217c
                boolean r0 = r7.c()
                if (r0 == 0) goto L_0x0057
                r7.a(r2)
            L_0x0057:
                md.m r7 = md.m.f8555a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ab.f.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(String str) {
        f230r = str;
        androidx.fragment.app.m.g("Alert: ", str, "f");
        ge.g.b(k.j(o0.f5433a), (pd.f) null, new c(str, (pd.d<? super c>) null), 3);
    }

    public static final void b(String str) {
        f227o = str;
        androidx.fragment.app.m.g("Main: ", str, "f");
        ge.g.b(k.j(o0.f5433a), (pd.f) null, new e(str, (pd.d<? super e>) null), 3);
    }

    public static final void c(String str) {
        f229q = str;
        androidx.fragment.app.m.g("Sub: ", str, "f");
        ge.g.b(k.j(o0.f5433a), (pd.f) null, new g(str, (pd.d<? super g>) null), 3);
    }

    public final void d() {
        Log.d("f", "Cancel immediate!");
        ne.c cVar = f216b;
        if (cVar.c()) {
            cVar.a((Object) null);
        }
        v1 v1Var = f222j;
        if (v1Var != null) {
            v1Var.c((CancellationException) null);
        }
        ne.c cVar2 = f217c;
        if (cVar2.c()) {
            cVar2.a((Object) null);
        }
        v1 v1Var2 = f223k;
        if (v1Var2 != null) {
            v1Var2.c((CancellationException) null);
        }
        ne.c cVar3 = f218d;
        if (cVar3.c()) {
            cVar3.a((Object) null);
        }
        v1 v1Var3 = f224l;
        if (v1Var3 != null) {
            v1Var3.c((CancellationException) null);
        }
    }

    public final void e() {
        ne.c cVar = f218d;
        if (cVar.c()) {
            cVar.a((Object) null);
        }
        h((String) null, (String) null, a.NONE, true);
    }

    public final void f() {
        ne.c cVar = f216b;
        if (cVar.c()) {
            cVar.a((Object) null);
        }
        m((String) null, b.NONE, true);
    }

    public final String g(Context context, long j10) {
        if (j10 == 0) {
            return null;
        }
        if (j10 == 1) {
            return context.getString(R.string.pendingRewardSingular);
        }
        if (2 <= j10 && j10 <= 10) {
            return context.getString(R.string.pendingRewardPlural, new Object[]{String.valueOf(j10)});
        }
        return context.getString(R.string.pendingRewardPlural, new Object[]{"10+"});
    }

    public final g1 h(String str, String str2, a aVar, boolean z) {
        return ge.g.b(k.j(o0.f5433a.plus(f221h)), (pd.f) null, new a(str, str2, aVar, z, (pd.d<? super a>) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.String r5, java.lang.String r6, ab.a r7, boolean r8, boolean r9, pd.d<? super md.m> r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof ab.f.b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            ab.f$b r0 = (ab.f.b) r0
            int r1 = r0.f245w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f245w = r1
            goto L_0x0018
        L_0x0013:
            ab.f$b r0 = new ab.f$b
            r0.<init>(r4, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f243u
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f245w
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            boolean r9 = r0.f242t
            ab.a r7 = r0.f241s
            java.lang.String r6 = r0.f240c
            java.lang.String r5 = r0.f239b
            ab.f r8 = r0.f238a
            l6.b1.w(r10)
            goto L_0x0059
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            l6.b1.w(r10)
            if (r8 == 0) goto L_0x0041
            r4.d()
        L_0x0041:
            ge.v1 r8 = f224l
            if (r8 == 0) goto L_0x0058
            r0.f238a = r4
            r0.f239b = r5
            r0.f240c = r6
            r0.f241s = r7
            r0.f242t = r9
            r0.f245w = r3
            java.lang.Object r8 = r8.t(r0)
            if (r8 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r8 = r4
        L_0x0059:
            ge.g1 r5 = r8.h(r5, r6, r7, r9)
            ge.v1 r5 = (ge.v1) r5
            f224l = r5
            md.m r5 = md.m.f8555a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.f.i(java.lang.String, java.lang.String, ab.a, boolean, boolean, pd.d):java.lang.Object");
    }

    public final g1 k(String str) {
        return ge.g.b(k.j(o0.f5433a.plus(i)), (pd.f) null, new c(str, (pd.d<? super c>) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.String r5, ab.b r6, boolean r7, boolean r8, pd.d<? super md.m> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof ab.f.d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ab.f$d r0 = (ab.f.d) r0
            int r1 = r0.f256v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f256v = r1
            goto L_0x0018
        L_0x0013:
            ab.f$d r0 = new ab.f$d
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f254t
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f256v
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            boolean r8 = r0.f253s
            ab.b r6 = r0.f252c
            java.lang.String r5 = r0.f251b
            ab.f r7 = r0.f250a
            l6.b1.w(r9)
            goto L_0x0055
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            l6.b1.w(r9)
            if (r7 == 0) goto L_0x003f
            r4.d()
        L_0x003f:
            ge.v1 r7 = f222j
            if (r7 == 0) goto L_0x0054
            r0.f250a = r4
            r0.f251b = r5
            r0.f252c = r6
            r0.f253s = r8
            r0.f256v = r3
            java.lang.Object r7 = r7.t(r0)
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r7 = r4
        L_0x0055:
            ge.g1 r5 = r7.m(r5, r6, r8)
            ge.v1 r5 = (ge.v1) r5
            f222j = r5
            md.m r5 = md.m.f8555a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.f.l(java.lang.String, ab.b, boolean, boolean, pd.d):java.lang.Object");
    }

    public final g1 m(String str, b bVar, boolean z) {
        return ge.g.b(k.j(o0.f5433a.plus(f220f)), (pd.f) null, new e(str, bVar, z, (pd.d<? super e>) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(java.lang.String r5, boolean r6, boolean r7, pd.d<? super md.m> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof ab.f.C0002f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ab.f$f r0 = (ab.f.C0002f) r0
            int r1 = r0.f266u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f266u = r1
            goto L_0x0018
        L_0x0013:
            ab.f$f r0 = new ab.f$f
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f264s
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f266u
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            boolean r7 = r0.f263c
            java.lang.String r5 = r0.f262b
            ab.f r6 = r0.f261a
            l6.b1.w(r8)
            goto L_0x0051
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            l6.b1.w(r8)
            if (r6 == 0) goto L_0x003d
            r4.d()
        L_0x003d:
            ge.v1 r6 = f223k
            if (r6 == 0) goto L_0x0050
            r0.f261a = r4
            r0.f262b = r5
            r0.f263c = r7
            r0.f266u = r3
            java.lang.Object r6 = r6.t(r0)
            if (r6 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r6 = r4
        L_0x0051:
            ge.g1 r5 = r6.o(r5, r7)
            ge.v1 r5 = (ge.v1) r5
            f223k = r5
            md.m r5 = md.m.f8555a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.f.n(java.lang.String, boolean, boolean, pd.d):java.lang.Object");
    }

    public final g1 o(String str, boolean z) {
        return ge.g.b(k.j(o0.f5433a.plus(g)), (pd.f) null, new g(str, z, (pd.d<? super g>) null), 3);
    }
}
