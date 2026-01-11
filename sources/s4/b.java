package s4;

import io.sentry.protocol.Device;
import java.io.IOException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f10861a = new b();

    public static final class a implements i8.d<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10862a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f10863b = i8.c.a("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f10864c = i8.c.a("model");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f10865d = i8.c.a("hardware");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f10866e = i8.c.a(Device.TYPE);

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f10867f = i8.c.a("product");
        public static final i8.c g = i8.c.a("osBuild");

        /* renamed from: h  reason: collision with root package name */
        public static final i8.c f10868h = i8.c.a("manufacturer");
        public static final i8.c i = i8.c.a("fingerprint");

        /* renamed from: j  reason: collision with root package name */
        public static final i8.c f10869j = i8.c.a("locale");

        /* renamed from: k  reason: collision with root package name */
        public static final i8.c f10870k = i8.c.a("country");

        /* renamed from: l  reason: collision with root package name */
        public static final i8.c f10871l = i8.c.a("mccMnc");

        /* renamed from: m  reason: collision with root package name */
        public static final i8.c f10872m = i8.c.a("applicationBuild");

        public final void a(Object obj, Object obj2) throws IOException {
            a aVar = (a) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f10863b, aVar.l());
            eVar.a(f10864c, aVar.i());
            eVar.a(f10865d, aVar.e());
            eVar.a(f10866e, aVar.c());
            eVar.a(f10867f, aVar.k());
            eVar.a(g, aVar.j());
            eVar.a(f10868h, aVar.g());
            eVar.a(i, aVar.d());
            eVar.a(f10869j, aVar.f());
            eVar.a(f10870k, aVar.b());
            eVar.a(f10871l, aVar.h());
            eVar.a(f10872m, aVar.a());
        }
    }

    /* renamed from: s4.b$b  reason: collision with other inner class name */
    public static final class C0213b implements i8.d<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0213b f10873a = new C0213b();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f10874b = i8.c.a("logRequest");

        public final void a(Object obj, Object obj2) throws IOException {
            ((i8.e) obj2).a(f10874b, ((j) obj).a());
        }
    }

    public static final class c implements i8.d<k> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f10875a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f10876b = i8.c.a("clientType");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f10877c = i8.c.a("androidClientInfo");

        public final void a(Object obj, Object obj2) throws IOException {
            k kVar = (k) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f10876b, kVar.b());
            eVar.a(f10877c, kVar.a());
        }
    }

    public static final class d implements i8.d<l> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f10878a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f10879b = i8.c.a("eventTimeMs");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f10880c = i8.c.a("eventCode");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f10881d = i8.c.a("eventUptimeMs");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f10882e = i8.c.a("sourceExtension");

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f10883f = i8.c.a("sourceExtensionJsonProto3");
        public static final i8.c g = i8.c.a("timezoneOffsetSeconds");

        /* renamed from: h  reason: collision with root package name */
        public static final i8.c f10884h = i8.c.a("networkConnectionInfo");

        public final void a(Object obj, Object obj2) throws IOException {
            l lVar = (l) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.c(f10879b, lVar.b());
            eVar.a(f10880c, lVar.a());
            eVar.c(f10881d, lVar.c());
            eVar.a(f10882e, lVar.e());
            eVar.a(f10883f, lVar.f());
            eVar.c(g, lVar.g());
            eVar.a(f10884h, lVar.d());
        }
    }

    public static final class e implements i8.d<m> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f10885a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f10886b = i8.c.a("requestTimeMs");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f10887c = i8.c.a("requestUptimeMs");

        /* renamed from: d  reason: collision with root package name */
        public static final i8.c f10888d = i8.c.a("clientInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final i8.c f10889e = i8.c.a("logSource");

        /* renamed from: f  reason: collision with root package name */
        public static final i8.c f10890f = i8.c.a("logSourceName");
        public static final i8.c g = i8.c.a("logEvent");

        /* renamed from: h  reason: collision with root package name */
        public static final i8.c f10891h = i8.c.a("qosTier");

        public final void a(Object obj, Object obj2) throws IOException {
            m mVar = (m) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.c(f10886b, mVar.f());
            eVar.c(f10887c, mVar.g());
            eVar.a(f10888d, mVar.a());
            eVar.a(f10889e, mVar.c());
            eVar.a(f10890f, mVar.d());
            eVar.a(g, mVar.b());
            eVar.a(f10891h, mVar.e());
        }
    }

    public static final class f implements i8.d<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f10892a = new f();

        /* renamed from: b  reason: collision with root package name */
        public static final i8.c f10893b = i8.c.a("networkType");

        /* renamed from: c  reason: collision with root package name */
        public static final i8.c f10894c = i8.c.a("mobileSubtype");

        public final void a(Object obj, Object obj2) throws IOException {
            o oVar = (o) obj;
            i8.e eVar = (i8.e) obj2;
            eVar.a(f10893b, oVar.b());
            eVar.a(f10894c, oVar.a());
        }
    }

    public final void a(j8.a<?> aVar) {
        C0213b bVar = C0213b.f10873a;
        k8.e eVar = (k8.e) aVar;
        eVar.a(j.class, bVar);
        eVar.a(d.class, bVar);
        e eVar2 = e.f10885a;
        eVar.a(m.class, eVar2);
        eVar.a(g.class, eVar2);
        c cVar = c.f10875a;
        eVar.a(k.class, cVar);
        eVar.a(e.class, cVar);
        a aVar2 = a.f10862a;
        eVar.a(a.class, aVar2);
        eVar.a(c.class, aVar2);
        d dVar = d.f10878a;
        eVar.a(l.class, dVar);
        eVar.a(f.class, dVar);
        f fVar = f.f10892a;
        eVar.a(o.class, fVar);
        eVar.a(i.class, fVar);
    }
}
