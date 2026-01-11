package re;

import a.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import pe.d;
import pe.e;
import pe.i;

public final class w0 implements e {

    /* renamed from: a  reason: collision with root package name */
    public final String f10758a;

    /* renamed from: b  reason: collision with root package name */
    public final d f10759b;

    public w0(String str, d dVar) {
        this.f10758a = str;
        this.f10759b = dVar;
    }

    public final int a(String str) {
        e6.e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        h();
        throw null;
    }

    public final String b() {
        return this.f10758a;
    }

    public final i c() {
        return this.f10759b;
    }

    public final int d() {
        return 0;
    }

    public final String e(int i) {
        h();
        throw null;
    }

    public final boolean f() {
        return false;
    }

    public final e g(int i) {
        h();
        throw null;
    }

    public final Void h() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        StringBuilder d10 = a.d("PrimitiveDescriptor(");
        d10.append(this.f10758a);
        d10.append(')');
        return d10.toString();
    }
}
