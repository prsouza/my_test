package ki;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p002if.o;
import p002if.q;
import p002if.r;
import p002if.t;
import p002if.u;
import p002if.x;
import p002if.z;
import uf.g;

public final class x {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f7687l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f7688m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f7689a;

    /* renamed from: b  reason: collision with root package name */
    public final r f7690b;

    /* renamed from: c  reason: collision with root package name */
    public String f7691c;

    /* renamed from: d  reason: collision with root package name */
    public r.a f7692d;

    /* renamed from: e  reason: collision with root package name */
    public final x.a f7693e = new x.a();

    /* renamed from: f  reason: collision with root package name */
    public final q.a f7694f;
    public t g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7695h;
    public u.a i;

    /* renamed from: j  reason: collision with root package name */
    public o.a f7696j;

    /* renamed from: k  reason: collision with root package name */
    public z f7697k;

    public static class a extends z {

        /* renamed from: b  reason: collision with root package name */
        public final z f7698b;

        /* renamed from: c  reason: collision with root package name */
        public final t f7699c;

        public a(z zVar, t tVar) {
            this.f7698b = zVar;
            this.f7699c = tVar;
        }

        public final long a() throws IOException {
            return this.f7698b.a();
        }

        public final t b() {
            return this.f7699c;
        }

        public final void c(g gVar) throws IOException {
            this.f7698b.c(gVar);
        }
    }

    public x(String str, r rVar, String str2, q qVar, t tVar, boolean z, boolean z10, boolean z11) {
        this.f7689a = str;
        this.f7690b = rVar;
        this.f7691c = str2;
        this.g = tVar;
        this.f7695h = z;
        if (qVar != null) {
            this.f7694f = qVar.g();
        } else {
            this.f7694f = new q.a();
        }
        if (z10) {
            this.f7696j = new o.a();
        } else if (z11) {
            u.a aVar = new u.a();
            this.i = aVar;
            t tVar2 = u.g;
            Objects.requireNonNull(aVar);
            e.D(tVar2, "type");
            if (e.r(tVar2.f6583b, "multipart")) {
                aVar.f6593b = tVar2;
                return;
            }
            throw new IllegalArgumentException(("multipart != " + tVar2).toString());
        }
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final void a(String str, String str2, boolean z) {
        String str3 = str;
        if (z) {
            o.a aVar = this.f7696j;
            Objects.requireNonNull(aVar);
            e.D(str3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            aVar.f6549a.add(r.b.a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f6551c, 83));
            aVar.f6550b.add(r.b.a(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f6551c, 83));
            return;
        }
        this.f7696j.a(str3, str2);
    }

    public final void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.g = t.f6581f.a(str2);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(a8.a.c("Malformed content type: ", str2), e10);
            }
        } else {
            this.f7694f.a(str, str2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.util.List<if.u$b>, java.util.ArrayList] */
    public final void c(q qVar, z zVar) {
        u.a aVar = this.i;
        Objects.requireNonNull(aVar);
        e.D(zVar, "body");
        String str = null;
        boolean z = true;
        if ((qVar != null ? qVar.d("Content-Type") : null) == null) {
            if (qVar != null) {
                str = qVar.d("Content-Length");
            }
            if (str != null) {
                z = false;
            }
            if (z) {
                aVar.f6594c.add(new u.b(qVar, zVar));
                return;
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
    }

    public final void d(String str, String str2, boolean z) {
        String str3 = this.f7691c;
        String str4 = null;
        if (str3 != null) {
            r.a f10 = this.f7690b.f(str3);
            this.f7692d = f10;
            if (f10 != null) {
                this.f7691c = null;
            } else {
                StringBuilder d10 = a.a.d("Malformed URL. Base: ");
                d10.append(this.f7690b);
                d10.append(", Relative: ");
                d10.append(this.f7691c);
                throw new IllegalArgumentException(d10.toString());
            }
        }
        if (z) {
            r.a aVar = this.f7692d;
            Objects.requireNonNull(aVar);
            e.D(str, "encodedName");
            if (aVar.g == null) {
                aVar.g = new ArrayList();
            }
            List<String> list = aVar.g;
            e.B(list);
            list.add(r.b.a(str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211));
            List<String> list2 = aVar.g;
            e.B(list2);
            if (str2 != null) {
                str4 = r.b.a(str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211);
            }
            list2.add(str4);
            return;
        }
        r.a aVar2 = this.f7692d;
        Objects.requireNonNull(aVar2);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (aVar2.g == null) {
            aVar2.g = new ArrayList();
        }
        List<String> list3 = aVar2.g;
        e.B(list3);
        list3.add(r.b.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219));
        List<String> list4 = aVar2.g;
        e.B(list4);
        if (str2 != null) {
            str4 = r.b.a(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219);
        }
        list4.add(str4);
    }
}
