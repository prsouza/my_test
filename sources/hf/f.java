package hf;

import android.content.Context;
import h1.b0;
import h1.e0;
import io.nodle.sdk.core.database.SdkDatabase;

public final class f implements ze.f {

    /* renamed from: a  reason: collision with root package name */
    public final SdkDatabase f5949a;

    /* renamed from: b  reason: collision with root package name */
    public final md.h f5950b;

    /* renamed from: c  reason: collision with root package name */
    public final md.h f5951c;

    /* renamed from: d  reason: collision with root package name */
    public final md.h f5952d;

    /* renamed from: e  reason: collision with root package name */
    public final md.h f5953e;

    /* renamed from: f  reason: collision with root package name */
    public final md.h f5954f;
    public final md.h g;

    /* renamed from: h  reason: collision with root package name */
    public final md.h f5955h;
    public final md.h i;

    /* renamed from: j  reason: collision with root package name */
    public final md.h f5956j;

    public static final class a extends yd.h implements xd.a<b> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f5957b = new a();

        public a() {
            super(0);
        }

        public final Object c() {
            return new b();
        }
    }

    public static final class b extends yd.h implements xd.a<a> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f5958b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(0);
            this.f5958b = fVar;
        }

        public final Object c() {
            return new a(this.f5958b.f5949a.r());
        }
    }

    public static final class c extends yd.h implements xd.a<i> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f5959b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(f fVar) {
            super(0);
            this.f5959b = fVar;
        }

        public final Object c() {
            return new i(this.f5959b.f5949a.s());
        }
    }

    public static final class d extends yd.h implements xd.a<c> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f5960b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(f fVar) {
            super(0);
            this.f5960b = fVar;
        }

        public final Object c() {
            return new c(this.f5960b.f5949a.t());
        }
    }

    public static final class e extends yd.h implements xd.a<d> {

        /* renamed from: b  reason: collision with root package name */
        public static final e f5961b = new e();

        public e() {
            super(0);
        }

        public final Object c() {
            return new d();
        }
    }

    /* renamed from: hf.f$f  reason: collision with other inner class name */
    public static final class C0101f extends yd.h implements xd.a<e> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f5962b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0101f(f fVar) {
            super(0);
            this.f5962b = fVar;
        }

        public final Object c() {
            return new e(this.f5962b.f5949a.u());
        }
    }

    public static final class g extends yd.h implements xd.a<h> {

        /* renamed from: b  reason: collision with root package name */
        public static final g f5963b = new g();

        public g() {
            super(0);
        }

        public final Object c() {
            return new h();
        }
    }

    public static final class h extends yd.h implements xd.a<g> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f5964b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(f fVar) {
            super(0);
            this.f5964b = fVar;
        }

        public final Object c() {
            return new g(this.f5964b.f5949a.v());
        }
    }

    public static final class i extends yd.h implements xd.a<j> {

        /* renamed from: b  reason: collision with root package name */
        public static final i f5965b = new i();

        public i() {
            super(0);
        }

        public final Object c() {
            return new j();
        }
    }

    public f(Context context, boolean z) {
        e0 e0Var;
        Class cls = SdkDatabase.class;
        e6.e.D(context, "context");
        if (z) {
            e0.a aVar = new e0.a(context, cls, (String) null);
            aVar.a(cj.a.f3470a, cj.b.f3471a, cj.c.f3472a, cj.d.f3473a);
            aVar.c();
            e0Var = aVar.b();
        } else {
            e0.a a10 = b0.a(context, cls, "nodle-db");
            a10.a(cj.a.f3470a, cj.b.f3471a, cj.c.f3472a, cj.d.f3473a);
            a10.c();
            e0Var = a10.b();
        }
        this.f5949a = (SdkDatabase) e0Var;
        this.f5950b = new md.h(new b(this));
        this.f5951c = new md.h(new C0101f(this));
        this.f5952d = new md.h(new h(this));
        this.f5953e = new md.h(new d(this));
        this.f5954f = new md.h(new c(this));
        this.g = new md.h(g.f5963b);
        this.f5955h = new md.h(e.f5961b);
        this.i = new md.h(a.f5957b);
        this.f5956j = new md.h(i.f5965b);
    }

    public final ze.g a() {
        return (ze.g) this.f5952d.a();
    }

    public final ze.b b() {
        return (ze.b) this.f5950b.a();
    }

    public final h c() {
        return (h) this.g.a();
    }

    public final ze.d d() {
        return (ze.d) this.f5953e.a();
    }

    public final ze.e e() {
        return (ze.e) this.f5951c.a();
    }
}
