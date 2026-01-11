package se;

import ad.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import de.i;
import de.j;
import de.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import oe.b;
import pe.e;
import re.d1;
import re.e0;
import yd.v;
import yd.w;
import yd.y;

public final class r implements b<q> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11128a = a.f11131c;

    /* renamed from: b  reason: collision with root package name */
    public static final r f11129b = new r();

    public static final class a implements e {

        /* renamed from: b  reason: collision with root package name */
        public static final String f11130b = "kotlinx.serialization.json.JsonObject";

        /* renamed from: c  reason: collision with root package name */
        public static final a f11131c = new a();

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f11132a;

        public a() {
            j.a aVar = j.f4455c;
            i b10 = v.b(String.class);
            k kVar = k.INVARIANT;
            j jVar = new j(kVar, b10);
            j jVar2 = new j(kVar, v.b(e.class));
            w wVar = v.f13623a;
            de.b a10 = v.a(HashMap.class);
            List asList = Arrays.asList(new j[]{jVar, jVar2});
            Objects.requireNonNull(wVar);
            this.f11132a = c.o0(new y(a10, asList)).a();
        }

        public final int a(String str) {
            e6.e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            return this.f11132a.a(str);
        }

        public final String b() {
            return f11130b;
        }

        public final pe.i c() {
            return this.f11132a.c();
        }

        public final int d() {
            return this.f11132a.d();
        }

        public final String e(int i) {
            return this.f11132a.e(i);
        }

        public final boolean f() {
            return this.f11132a.f();
        }

        public final e g(int i) {
            return this.f11132a.g(i);
        }
    }

    public final e a() {
        return f11128a;
    }

    public final Object b(qe.b bVar) {
        e6.e.D(bVar, "decoder");
        jc.b.k(bVar);
        return new q((Map) new e0(d1.f10686b, k.f11115b).b(bVar));
    }
}
