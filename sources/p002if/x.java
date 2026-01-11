package p002if;

import a.b;
import androidx.fragment.app.o;
import c3.k;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.c;
import md.f;
import nd.p;
import org.slf4j.helpers.MessageFormatter;
import p002if.q;
import p002if.r;

/* renamed from: if.x  reason: invalid package */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public c f6626a;

    /* renamed from: b  reason: collision with root package name */
    public final r f6627b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6628c;

    /* renamed from: d  reason: collision with root package name */
    public final q f6629d;

    /* renamed from: e  reason: collision with root package name */
    public final z f6630e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, Object> f6631f;

    public x(r rVar, String str, q qVar, z zVar, Map<Class<?>, ? extends Object> map) {
        e.D(str, "method");
        this.f6627b = rVar;
        this.f6628c = str;
        this.f6629d = qVar;
        this.f6630e = zVar;
        this.f6631f = map;
    }

    public final c a() {
        c cVar = this.f6626a;
        if (cVar != null) {
            return cVar;
        }
        c b10 = c.f6478n.b(this.f6629d);
        this.f6626a = b10;
        return b10;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Request{method=");
        d10.append(this.f6628c);
        d10.append(", url=");
        d10.append(this.f6627b);
        if (this.f6629d.f6560a.length / 2 != 0) {
            d10.append(", headers=[");
            int i = 0;
            for (Object next : this.f6629d) {
                int i10 = i + 1;
                if (i >= 0) {
                    f fVar = (f) next;
                    String str = (String) fVar.f8541a;
                    String str2 = (String) fVar.f8542b;
                    if (i > 0) {
                        d10.append(", ");
                    }
                    d10.append(str);
                    d10.append(':');
                    d10.append(str2);
                    i = i10;
                } else {
                    b.N0();
                    throw null;
                }
            }
            d10.append(']');
        }
        if (!this.f6631f.isEmpty()) {
            d10.append(", tags=");
            d10.append(this.f6631f);
        }
        d10.append(MessageFormatter.DELIM_STOP);
        String sb2 = d10.toString();
        e.C(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: if.x$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public r f6632a;

        /* renamed from: b  reason: collision with root package name */
        public String f6633b;

        /* renamed from: c  reason: collision with root package name */
        public q.a f6634c;

        /* renamed from: d  reason: collision with root package name */
        public z f6635d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f6636e;

        public a() {
            this.f6636e = new LinkedHashMap();
            this.f6633b = "GET";
            this.f6634c = new q.a();
        }

        public final x a() {
            Map map;
            r rVar = this.f6632a;
            if (rVar != null) {
                String str = this.f6633b;
                q c10 = this.f6634c.c();
                z zVar = this.f6635d;
                Map<Class<?>, Object> map2 = this.f6636e;
                byte[] bArr = c.f7250a;
                e.D(map2, "$this$toImmutableMap");
                if (map2.isEmpty()) {
                    map = p.f8967a;
                } else {
                    map = Collections.unmodifiableMap(new LinkedHashMap(map2));
                    e.C(map, "Collections.unmodifiableMap(LinkedHashMap(this))");
                }
                return new x(rVar, str, c10, zVar, map);
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final a b(String str, String str2) {
            e.D(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f6634c.e(str, str2);
            return this;
        }

        public final a c(String str, z zVar) {
            e.D(str, "method");
            boolean z = false;
            if (str.length() > 0) {
                if (zVar == null) {
                    if (e.r(str, "POST") || e.r(str, "PUT") || e.r(str, "PATCH") || e.r(str, "PROPPATCH") || e.r(str, "REPORT")) {
                        z = true;
                    }
                    if (!(!z)) {
                        throw new IllegalArgumentException(o.c("method ", str, " must have a request body.").toString());
                    }
                } else if (!k.D0(str)) {
                    throw new IllegalArgumentException(o.c("method ", str, " must not have a request body.").toString());
                }
                this.f6633b = str;
                this.f6635d = zVar;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public final <T> a d(Class<? super T> cls, T t10) {
            e.D(cls, "type");
            if (t10 == null) {
                this.f6636e.remove(cls);
            } else {
                if (this.f6636e.isEmpty()) {
                    this.f6636e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f6636e;
                Object cast = cls.cast(t10);
                e.B(cast);
                map.put(cls, cast);
            }
            return this;
        }

        public final a e(r rVar) {
            e.D(rVar, ImagesContract.URL);
            this.f6632a = rVar;
            return this;
        }

        public final a f(String str) {
            e.D(str, ImagesContract.URL);
            if (fe.k.d1(str, "ws:", true)) {
                StringBuilder d10 = a.a.d("http:");
                String substring = str.substring(3);
                e.C(substring, "(this as java.lang.String).substring(startIndex)");
                d10.append(substring);
                str = d10.toString();
            } else if (fe.k.d1(str, "wss:", true)) {
                StringBuilder d11 = a.a.d("https:");
                String substring2 = str.substring(4);
                e.C(substring2, "(this as java.lang.String).substring(startIndex)");
                d11.append(substring2);
                str = d11.toString();
            }
            e.D(str, "$this$toHttpUrl");
            r.a aVar = new r.a();
            aVar.d((r) null, str);
            this.f6632a = aVar.a();
            return this;
        }

        public a(x xVar) {
            Object obj;
            e.D(xVar, "request");
            this.f6636e = new LinkedHashMap();
            this.f6632a = xVar.f6627b;
            this.f6633b = xVar.f6628c;
            this.f6635d = xVar.f6630e;
            if (xVar.f6631f.isEmpty()) {
                obj = new LinkedHashMap();
            } else {
                obj = nd.x.y0(xVar.f6631f);
            }
            this.f6636e = (LinkedHashMap) obj;
            this.f6634c = xVar.f6629d.g();
        }
    }
}
