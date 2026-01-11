package se;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import de.j;
import de.k;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import oe.b;
import pe.e;
import pe.i;
import yd.v;
import yd.w;
import yd.y;

public final class c implements b<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11104a = a.f11107c;

    /* renamed from: b  reason: collision with root package name */
    public static final c f11105b = new c();

    public static final class a implements e {

        /* renamed from: b  reason: collision with root package name */
        public static final String f11106b = "kotlinx.serialization.json.JsonArray";

        /* renamed from: c  reason: collision with root package name */
        public static final a f11107c = new a();

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f11108a;

        public a() {
            j.a aVar = j.f4455c;
            j jVar = new j(k.INVARIANT, v.b(e.class));
            w wVar = v.f13623a;
            de.b a10 = v.a(List.class);
            List singletonList = Collections.singletonList(jVar);
            Objects.requireNonNull(wVar);
            this.f11108a = ad.c.o0(new y(a10, singletonList)).a();
        }

        public final int a(String str) {
            e6.e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            return this.f11108a.a(str);
        }

        public final String b() {
            return f11106b;
        }

        public final i c() {
            return this.f11108a.c();
        }

        public final int d() {
            return this.f11108a.d();
        }

        public final String e(int i) {
            return this.f11108a.e(i);
        }

        public final boolean f() {
            return this.f11108a.f();
        }

        public final e g(int i) {
            return this.f11108a.g(i);
        }
    }

    public final e a() {
        return f11104a;
    }

    public final Object b(qe.b bVar) {
        e6.e.D(bVar, "decoder");
        jc.b.k(bVar);
        return new b((List) new re.e(k.f11115b).b(bVar));
    }
}
