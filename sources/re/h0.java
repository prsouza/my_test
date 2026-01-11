package re;

import a8.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fe.k;
import pe.e;
import pe.i;
import pe.j;

public abstract class h0 implements e {

    /* renamed from: a  reason: collision with root package name */
    public final int f10703a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final e f10704b;

    public h0(e eVar) {
        this.f10704b = eVar;
    }

    public final int a(String str) {
        e6.e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Integer f1 = k.f1(str);
        if (f1 != null) {
            return f1.intValue();
        }
        throw new IllegalArgumentException(a.c(str, " is not a valid list index"));
    }

    public final i c() {
        return j.b.f9919a;
    }

    public final int d() {
        return this.f10703a;
    }

    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return e6.e.r(this.f10704b, h0Var.f10704b) && e6.e.r(b(), h0Var.b());
    }

    public final boolean f() {
        return false;
    }

    public final e g(int i) {
        if (i >= 0) {
            return this.f10704b;
        }
        StringBuilder d10 = a.d("Illegal index ", i, ", ");
        d10.append(b());
        d10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(d10.toString().toString());
    }

    public final int hashCode() {
        return b().hashCode() + (this.f10704b.hashCode() * 31);
    }

    public final String toString() {
        return b() + '(' + this.f10704b + ')';
    }
}
