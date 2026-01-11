package pe;

import a.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final String f9888a;

    /* renamed from: b  reason: collision with root package name */
    public final e f9889b;

    /* renamed from: c  reason: collision with root package name */
    public final de.b<?> f9890c;

    public b(e eVar, de.b<?> bVar) {
        this.f9889b = eVar;
        this.f9890c = bVar;
        this.f9888a = ((f) eVar).f9908h + '<' + bVar.a() + '>';
    }

    public final int a(String str) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return this.f9889b.a(str);
    }

    public final String b() {
        return this.f9888a;
    }

    public final i c() {
        return this.f9889b.c();
    }

    public final int d() {
        return this.f9889b.d();
    }

    public final String e(int i) {
        return this.f9889b.e(i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null || !e.r(this.f9889b, bVar.f9889b) || !e.r(bVar.f9890c, this.f9890c)) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        return this.f9889b.f();
    }

    public final e g(int i) {
        return this.f9889b.g(i);
    }

    public final int hashCode() {
        return this.f9888a.hashCode() + (this.f9890c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder d10 = a.d("ContextDescriptor(kClass: ");
        d10.append(this.f9890c);
        d10.append(", original: ");
        d10.append(this.f9889b);
        d10.append(')');
        return d10.toString();
    }
}
