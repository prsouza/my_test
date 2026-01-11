package p002if;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import jf.c;
import p002if.r;
import uf.g;

/* renamed from: if.o  reason: invalid package */
public final class o extends z {

    /* renamed from: d  reason: collision with root package name */
    public static final t f6546d = t.f6581f.a("application/x-www-form-urlencoded");

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f6547b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f6548c;

    /* renamed from: if.o$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f6549a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f6550b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final Charset f6551c = null;

        /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r12v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
        public final a a(String str, String str2) {
            e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            e.D(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f6549a.add(r.b.a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f6551c, 91));
            this.f6550b.add(r.b.a(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f6551c, 91));
            return this;
        }

        public final o b() {
            return new o(this.f6549a, this.f6550b);
        }
    }

    public o(List<String> list, List<String> list2) {
        e.D(list, "encodedNames");
        e.D(list2, "encodedValues");
        this.f6547b = c.x(list);
        this.f6548c = c.x(list2);
    }

    public final long a() {
        return d((g) null, true);
    }

    public final t b() {
        return f6546d;
    }

    public final void c(g gVar) throws IOException {
        d(gVar, false);
    }

    public final long d(g gVar, boolean z) {
        uf.e eVar;
        if (z) {
            eVar = new uf.e();
        } else {
            e.B(gVar);
            eVar = gVar.b();
        }
        int size = this.f6547b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                eVar.y0(38);
            }
            eVar.D0(this.f6547b.get(i));
            eVar.y0(61);
            eVar.D0(this.f6548c.get(i));
        }
        if (!z) {
            return 0;
        }
        long j10 = eVar.f11952b;
        eVar.a();
        return j10;
    }
}
