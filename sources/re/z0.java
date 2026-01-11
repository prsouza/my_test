package re;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import pe.e;
import pe.i;

public final class z0 implements e {

    /* renamed from: a  reason: collision with root package name */
    public final String f10766a;

    /* renamed from: b  reason: collision with root package name */
    public final e f10767b;

    public z0(e eVar) {
        e6.e.D(eVar, "original");
        this.f10767b = eVar;
        this.f10766a = eVar.b() + "?";
    }

    public final int a(String str) {
        e6.e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return this.f10767b.a(str);
    }

    public final String b() {
        return this.f10766a;
    }

    public final i c() {
        return this.f10767b.c();
    }

    public final int d() {
        return this.f10767b.d();
    }

    public final String e(int i) {
        return this.f10767b.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && !(e6.e.r(this.f10767b, ((z0) obj).f10767b) ^ true);
    }

    public final boolean f() {
        return true;
    }

    public final e g(int i) {
        return this.f10767b.g(i);
    }

    public final int hashCode() {
        return this.f10767b.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10767b);
        sb2.append('?');
        return sb2.toString();
    }
}
