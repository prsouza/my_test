package tc;

import androidx.fragment.app.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import h1.s;
import io.sentry.protocol.SentryRuntime;
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;
import tc.j;

public final class f extends qc.a<c, b> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f11537d = new a();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11538b = true;

    /* renamed from: c  reason: collision with root package name */
    public final h f11539c;

    public static final class a {
    }

    public static final class b {
        public b(j.a aVar) {
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f11540a;

        /* renamed from: b  reason: collision with root package name */
        public final a f11541b;

        public static abstract class a {

            /* renamed from: tc.f$c$a$a  reason: collision with other inner class name */
            public static final class C0224a extends a {
            }

            public static final class b extends a {

                /* renamed from: a  reason: collision with root package name */
                public final j.a f11542a;

                public b(j.a aVar) {
                    e.D(aVar, "call");
                    this.f11542a = aVar;
                }
            }
        }

        public c(d dVar, a aVar) {
            this.f11540a = dVar;
            this.f11541b = aVar;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Object f11543a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f11544b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, Object> f11545c;

        public d(Object obj, Object obj2, Map<String, ? extends Object> map) {
            this.f11543a = obj;
            this.f11544b = obj2;
            this.f11545c = map;
        }
    }

    static {
        new f();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f() {
        super("ExtrinsicsDecoder");
        p pVar = p.f11564b;
        h hVar = p.f11563a;
        e.D(hVar, "signedExtrasType");
        this.f11539c = hVar;
    }

    public final Object a(ca.b bVar, kc.a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        ed.d.f4804v.g(bVar);
        byte b10 = bVar.b();
        byte b11 = g.f11546a;
        boolean z = false;
        if (((byte) (b10 & g.f11546a)) != ((byte) 0)) {
            z = true;
        }
        if (z) {
            qc.a<?, ?> a10 = aVar.f7497a.a("Address");
            if (a10 != null) {
                a10.a(bVar, aVar);
                g(aVar).a(bVar, aVar);
                this.f11539c.a(bVar, aVar);
            } else {
                f("Address");
                throw null;
            }
        }
        return new b(j.f11552d.a(bVar, aVar));
    }

    public final void b(ca.c cVar, kc.a aVar, Object obj) {
        byte[] bArr;
        byte[] bArr2;
        c cVar2 = (c) obj;
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(cVar2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c.a aVar2 = cVar2.f11541b;
        if (aVar2 instanceof c.a.b) {
            bArr = ad.c.A0(j.f11552d, aVar, ((c.a.b) aVar2).f11542a);
        } else if (aVar2 instanceof c.a.C0224a) {
            Objects.requireNonNull((c.a.C0224a) aVar2);
            bArr = null;
        } else {
            throw new md.e();
        }
        d dVar = cVar2.f11540a;
        boolean z = dVar != null;
        byte intValue = (byte) ((BigInteger) ((s) aVar.f7498b.f8014s).f5761a).intValue();
        if (z) {
            byte b10 = g.f11546a;
            intValue = (byte) (intValue | g.f11546a);
        }
        if (!z) {
            bArr2 = new byte[0];
        } else if (dVar != null) {
            qc.a<?, ?> a10 = aVar.f7497a.a("Address");
            if (a10 != null) {
                bArr2 = nd.d.J(nd.d.J(ad.c.x(a10, aVar, dVar.f11543a), ad.c.x(g(aVar), aVar, dVar.f11544b)), ad.c.x(this.f11539c, aVar, dVar.f11545c));
            } else {
                f("Address");
                throw null;
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        b.f11532a.b(cVar, aVar, nd.d.J(nd.d.J(new byte[]{intValue}, bArr2), bArr));
    }

    public final boolean d() {
        return this.f11538b;
    }

    public final boolean e(Object obj) {
        return obj instanceof c;
    }

    public final Void f(String str) {
        throw new sc.a(o.c("Cannot resolve ", str, " type, which is required to work with Extrinsic"));
    }

    public final qc.a<?, ?> g(kc.a aVar) {
        e.D(aVar, SentryRuntime.TYPE);
        qc.a<?, ?> a10 = aVar.f7497a.a("ExtrinsicSignature");
        if (a10 != null) {
            return a10;
        }
        f("ExtrinsicSignature");
        throw null;
    }

    public f(h hVar) {
        super("ExtrinsicsDecoder");
        this.f11539c = hVar;
    }
}
