package z7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.io.IOException;
import z7.a0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13882a = new a();

    /* renamed from: z7.a$a  reason: collision with other inner class name */
    public static final class C0267a implements i8.d<a0.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0267a f13883a = new C0267a();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13884b = i8.c.a("pid");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13885c = i8.c.a("processName");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13886d = i8.c.a("reasonCode");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13887e = i8.c.a("importance");

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f13888f = i8.c.a("pss");
        public static final i8.c g = i8.c.a("rss");

        /* renamed from: h  reason: collision with root package name */
        public static final i8.c f13889h = i8.c.a("timestamp");
        public static final i8.c i = i8.c.a("traceFile");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.a aVar = (a0.a) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.e(f13884b, aVar.b());
            eVar.a(f13885c, aVar.c());
            eVar.e(f13886d, aVar.e());
            eVar.e(f13887e, aVar.a());
            eVar.c(f13888f, aVar.d());
            eVar.c(g, aVar.f());
            eVar.c(f13889h, aVar.g());
            eVar.a(i, aVar.h());
        }
    }

    public static final class b implements i8.d<a0.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13890a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13891b = i8.c.a("key");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13892c = i8.c.a(AppMeasurementSdk.ConditionalUserProperty.VALUE);

        public final void a(Object obj, Object obj2) throws IOException {
            a0.c cVar = (a0.c) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f13891b, cVar.a());
            eVar.a(f13892c, cVar.b());
        }
    }

    public static final class c implements i8.d<a0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f13893a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13894b = i8.c.a("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13895c = i8.c.a("gmpAppId");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13896d = i8.c.a("platform");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13897e = i8.c.a("installationUuid");

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f13898f = i8.c.a("buildVersion");
        public static final i8.c g = i8.c.a("displayVersion");

        /* renamed from: h  reason: collision with root package name */
        public static final i8.c f13899h = i8.c.a(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE);
        public static final i8.c i = i8.c.a("ndkPayload");

        public final void a(Object obj, Object obj2) throws IOException {
            a0 a0Var = (a0) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f13894b, a0Var.g());
            eVar.a(f13895c, a0Var.c());
            eVar.e(f13896d, a0Var.f());
            eVar.a(f13897e, a0Var.d());
            eVar.a(f13898f, a0Var.a());
            eVar.a(g, a0Var.b());
            eVar.a(f13899h, a0Var.h());
            eVar.a(i, a0Var.e());
        }
    }

    public static final class d implements i8.d<a0.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f13900a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13901b = i8.c.a("files");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13902c = i8.c.a("orgId");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.d dVar = (a0.d) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f13901b, dVar.a());
            eVar.a(f13902c, dVar.b());
        }
    }

    public static final class e implements i8.d<a0.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f13903a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13904b = i8.c.a("filename");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13905c = i8.c.a("contents");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.d.a aVar = (a0.d.a) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f13904b, aVar.b());
            eVar.a(f13905c, aVar.a());
        }
    }

    public static final class f implements i8.d<a0.e.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f13906a = new f();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13907b = i8.c.a("identifier");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13908c = i8.c.a("version");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13909d = i8.c.a("displayVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13910e = i8.c.a("organization");

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f13911f = i8.c.a("installationUuid");
        public static final i8.c g = i8.c.a("developmentPlatform");

        /* renamed from: h  reason: collision with root package name */
        public static final i8.c f13912h = i8.c.a("developmentPlatformVersion");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e.a aVar = (a0.e.a) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f13907b, aVar.d());
            eVar.a(f13908c, aVar.g());
            eVar.a(f13909d, aVar.c());
            eVar.a(f13910e, aVar.f());
            eVar.a(f13911f, aVar.e());
            eVar.a(g, aVar.a());
            eVar.a(f13912h, aVar.b());
        }
    }

    public static final class g implements i8.d<a0.e.a.C0270a> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f13913a = new g();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13914b = i8.c.a("clsId");

        public final void a(Object obj, Object obj2) throws IOException {
            i8.c cVar = f13914b;
            ((a0.e.a.C0270a) obj).a();
            ((i8.e) obj2).a(cVar, (Object) null);
        }
    }

    public static final class h implements i8.d<a0.e.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f13915a = new h();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13916b = i8.c.a("arch");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13917c = i8.c.a("model");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13918d = i8.c.a("cores");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13919e = i8.c.a("ram");

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f13920f = i8.c.a("diskSpace");
        public static final i8.c g = i8.c.a("simulator");

        /* renamed from: h  reason: collision with root package name */
        public static final i8.c f13921h = i8.c.a("state");
        public static final i8.c i = i8.c.a("manufacturer");

        /* renamed from: j  reason: collision with root package name */
        public static final i8.c f13922j = i8.c.a("modelClass");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e.c cVar = (a0.e.c) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.e(f13916b, cVar.a());
            eVar.a(f13917c, cVar.e());
            eVar.e(f13918d, cVar.b());
            eVar.c(f13919e, cVar.g());
            eVar.c(f13920f, cVar.c());
            eVar.f(g, cVar.i());
            eVar.e(f13921h, cVar.h());
            eVar.a(i, cVar.d());
            eVar.a(f13922j, cVar.f());
        }
    }

    public static final class i implements i8.d<a0.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f13923a = new i();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13924b = i8.c.a("generator");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13925c = i8.c.a("identifier");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13926d = i8.c.a("startedAt");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13927e = i8.c.a("endedAt");

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f13928f = i8.c.a("crashed");
        public static final i8.c g = i8.c.a(App.TYPE);

        /* renamed from: h  reason: collision with root package name */
        public static final i8.c f13929h = i8.c.a("user");
        public static final i8.c i = i8.c.a(OperatingSystem.TYPE);

        /* renamed from: j  reason: collision with root package name */
        public static final i8.c f13930j = i8.c.a(Device.TYPE);

        /* renamed from: k  reason: collision with root package name */
        public static final i8.c f13931k = i8.c.a("events");

        /* renamed from: l  reason: collision with root package name */
        public static final i8.c f13932l = i8.c.a("generatorType");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e eVar = (a0.e) obj;
            i8.e eVar2 = (i8.e) obj2;
            eVar2.a(f13924b, eVar.e());
            eVar2.a(f13925c, eVar.g().getBytes(a0.f13991a));
            eVar2.c(f13926d, eVar.i());
            eVar2.a(f13927e, eVar.c());
            eVar2.f(f13928f, eVar.k());
            eVar2.a(g, eVar.a());
            eVar2.a(f13929h, eVar.j());
            eVar2.a(i, eVar.h());
            eVar2.a(f13930j, eVar.b());
            eVar2.a(f13931k, eVar.d());
            eVar2.e(f13932l, eVar.f());
        }
    }

    public static final class j implements i8.d<a0.e.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f13933a = new j();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13934b = i8.c.a("execution");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13935c = i8.c.a("customAttributes");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13936d = i8.c.a("internalKeys");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13937e = i8.c.a("background");

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f13938f = i8.c.a("uiOrientation");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a aVar = (a0.e.d.a) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f13934b, aVar.c());
            eVar.a(f13935c, aVar.b());
            eVar.a(f13936d, aVar.d());
            eVar.a(f13937e, aVar.a());
            eVar.e(f13938f, aVar.e());
        }
    }

    public static final class k implements i8.d<a0.e.d.a.b.C0272a> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f13939a = new k();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13940b = i8.c.a("baseAddress");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13941c = i8.c.a("size");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13942d = i8.c.a(AppMeasurementSdk.ConditionalUserProperty.NAME);

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13943e = i8.c.a("uuid");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a.b.C0272a aVar = (a0.e.d.a.b.C0272a) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.c(f13940b, aVar.a());
            eVar.c(f13941c, aVar.c());
            eVar.a(f13942d, aVar.b());
            i8.c cVar = f13943e;
            String d10 = aVar.d();
            eVar.a(cVar, d10 != null ? d10.getBytes(a0.f13991a) : null);
        }
    }

    public static final class l implements i8.d<a0.e.d.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f13944a = new l();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13945b = i8.c.a("threads");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13946c = i8.c.a("exception");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13947d = i8.c.a("appExitInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13948e = i8.c.a("signal");

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f13949f = i8.c.a("binaries");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f13945b, bVar.e());
            eVar.a(f13946c, bVar.c());
            eVar.a(f13947d, bVar.a());
            eVar.a(f13948e, bVar.d());
            eVar.a(f13949f, bVar.b());
        }
    }

    public static final class m implements i8.d<a0.e.d.a.b.C0274b> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f13950a = new m();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13951b = i8.c.a("type");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13952c = i8.c.a("reason");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13953d = i8.c.a("frames");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13954e = i8.c.a("causedBy");

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f13955f = i8.c.a("overflowCount");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a.b.C0274b bVar = (a0.e.d.a.b.C0274b) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f13951b, bVar.e());
            eVar.a(f13952c, bVar.d());
            eVar.a(f13953d, bVar.b());
            eVar.a(f13954e, bVar.a());
            eVar.e(f13955f, bVar.c());
        }
    }

    public static final class n implements i8.d<a0.e.d.a.b.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f13956a = new n();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13957b = i8.c.a(AppMeasurementSdk.ConditionalUserProperty.NAME);

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13958c = i8.c.a("code");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13959d = i8.c.a("address");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a.b.c cVar = (a0.e.d.a.b.c) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f13957b, cVar.c());
            eVar.a(f13958c, cVar.b());
            eVar.c(f13959d, cVar.a());
        }
    }

    public static final class o implements i8.d<a0.e.d.a.b.C0277d> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f13960a = new o();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13961b = i8.c.a(AppMeasurementSdk.ConditionalUserProperty.NAME);

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13962c = i8.c.a("importance");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13963d = i8.c.a("frames");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a.b.C0277d dVar = (a0.e.d.a.b.C0277d) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f13961b, dVar.c());
            eVar.e(f13962c, dVar.b());
            eVar.a(f13963d, dVar.a());
        }
    }

    public static final class p implements i8.d<a0.e.d.a.b.C0277d.C0279b> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f13964a = new p();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13965b = i8.c.a("pc");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13966c = i8.c.a("symbol");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13967d = i8.c.a("file");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13968e = i8.c.a("offset");

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f13969f = i8.c.a("importance");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e.d.a.b.C0277d.C0279b bVar = (a0.e.d.a.b.C0277d.C0279b) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.c(f13965b, bVar.d());
            eVar.a(f13966c, bVar.e());
            eVar.a(f13967d, bVar.a());
            eVar.c(f13968e, bVar.c());
            eVar.e(f13969f, bVar.b());
        }
    }

    public static final class q implements i8.d<a0.e.d.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f13970a = new q();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13971b = i8.c.a("batteryLevel");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13972c = i8.c.a("batteryVelocity");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13973d = i8.c.a("proximityOn");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13974e = i8.c.a("orientation");

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f13975f = i8.c.a("ramUsed");
        public static final i8.c g = i8.c.a("diskUsed");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e.d.c cVar = (a0.e.d.c) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f13971b, cVar.a());
            eVar.e(f13972c, cVar.b());
            eVar.f(f13973d, cVar.f());
            eVar.e(f13974e, cVar.d());
            eVar.c(f13975f, cVar.e());
            eVar.c(g, cVar.c());
        }
    }

    public static final class r implements i8.d<a0.e.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f13976a = new r();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13977b = i8.c.a("timestamp");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13978c = i8.c.a("type");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13979d = i8.c.a(App.TYPE);

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13980e = i8.c.a(Device.TYPE);

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f13981f = i8.c.a("log");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e.d dVar = (a0.e.d) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.c(f13977b, dVar.d());
            eVar.a(f13978c, dVar.e());
            eVar.a(f13979d, dVar.a());
            eVar.a(f13980e, dVar.b());
            eVar.a(f13981f, dVar.c());
        }
    }

    public static final class s implements i8.d<a0.e.d.C0281d> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f13982a = new s();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13983b = i8.c.a("content");

        public final void a(Object obj, Object obj2) throws IOException {
            ((i8.e) obj2).a(f13983b, ((a0.e.d.C0281d) obj).a());
        }
    }

    public static final class t implements i8.d<a0.e.C0282e> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f13984a = new t();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13985b = i8.c.a("platform");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f13986c = i8.c.a("version");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f13987d = i8.c.a("buildVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f13988e = i8.c.a("jailbroken");

        public final void a(Object obj, Object obj2) throws IOException {
            a0.e.C0282e eVar = (a0.e.C0282e) obj;
            i8.e eVar2 = (i8.e) obj2;
            eVar2.e(f13985b, eVar.b());
            eVar2.a(f13986c, eVar.c());
            eVar2.a(f13987d, eVar.a());
            eVar2.f(f13988e, eVar.d());
        }
    }

    public static final class u implements i8.d<a0.e.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f13989a = new u();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f13990b = i8.c.a("identifier");

        public final void a(Object obj, Object obj2) throws IOException {
            ((i8.e) obj2).a(f13990b, ((a0.e.f) obj).a());
        }
    }

    public final void a(j8.a<?> aVar) {
        c cVar = c.f13893a;
        k8.e eVar = (k8.e) aVar;
        eVar.a(a0.class, cVar);
        eVar.a(b.class, cVar);
        i iVar = i.f13923a;
        eVar.a(a0.e.class, iVar);
        eVar.a(g.class, iVar);
        f fVar = f.f13906a;
        eVar.a(a0.e.a.class, fVar);
        eVar.a(h.class, fVar);
        g gVar = g.f13913a;
        eVar.a(a0.e.a.C0270a.class, gVar);
        eVar.a(i.class, gVar);
        u uVar = u.f13989a;
        eVar.a(a0.e.f.class, uVar);
        eVar.a(v.class, uVar);
        t tVar = t.f13984a;
        eVar.a(a0.e.C0282e.class, tVar);
        eVar.a(u.class, tVar);
        h hVar = h.f13915a;
        eVar.a(a0.e.c.class, hVar);
        eVar.a(j.class, hVar);
        r rVar = r.f13976a;
        eVar.a(a0.e.d.class, rVar);
        eVar.a(k.class, rVar);
        j jVar = j.f13933a;
        eVar.a(a0.e.d.a.class, jVar);
        eVar.a(l.class, jVar);
        l lVar = l.f13944a;
        eVar.a(a0.e.d.a.b.class, lVar);
        eVar.a(m.class, lVar);
        o oVar = o.f13960a;
        eVar.a(a0.e.d.a.b.C0277d.class, oVar);
        eVar.a(q.class, oVar);
        p pVar = p.f13964a;
        eVar.a(a0.e.d.a.b.C0277d.C0279b.class, pVar);
        eVar.a(r.class, pVar);
        m mVar = m.f13950a;
        eVar.a(a0.e.d.a.b.C0274b.class, mVar);
        eVar.a(o.class, mVar);
        C0267a aVar2 = C0267a.f13883a;
        eVar.a(a0.a.class, aVar2);
        eVar.a(c.class, aVar2);
        n nVar = n.f13956a;
        eVar.a(a0.e.d.a.b.c.class, nVar);
        eVar.a(p.class, nVar);
        k kVar = k.f13939a;
        eVar.a(a0.e.d.a.b.C0272a.class, kVar);
        eVar.a(n.class, kVar);
        b bVar = b.f13890a;
        eVar.a(a0.c.class, bVar);
        eVar.a(d.class, bVar);
        q qVar = q.f13970a;
        eVar.a(a0.e.d.c.class, qVar);
        eVar.a(s.class, qVar);
        s sVar = s.f13982a;
        eVar.a(a0.e.d.C0281d.class, sVar);
        eVar.a(t.class, sVar);
        d dVar = d.f13900a;
        eVar.a(a0.d.class, dVar);
        eVar.a(e.class, dVar);
        e eVar2 = e.f13903a;
        eVar.a(a0.d.a.class, eVar2);
        eVar.a(f.class, eVar2);
    }
}
