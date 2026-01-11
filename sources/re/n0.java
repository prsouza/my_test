package re;

import a8.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fe.k;
import pe.e;
import pe.i;
import pe.j;

public abstract class n0 implements e {

    /* renamed from: a  reason: collision with root package name */
    public final int f10728a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final String f10729b;

    /* renamed from: c  reason: collision with root package name */
    public final e f10730c;

    /* renamed from: d  reason: collision with root package name */
    public final e f10731d;

    public n0(String str, e eVar, e eVar2) {
        this.f10729b = str;
        this.f10730c = eVar;
        this.f10731d = eVar2;
    }

    public final int a(String str) {
        e6.e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Integer f1 = k.f1(str);
        if (f1 != null) {
            return f1.intValue();
        }
        throw new IllegalArgumentException(a.c(str, " is not a valid map index"));
    }

    public final String b() {
        return this.f10729b;
    }

    public final i c() {
        return j.c.f9920a;
    }

    public final int d() {
        return this.f10728a;
    }

    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return !(e6.e.r(this.f10729b, n0Var.f10729b) ^ true) && !(e6.e.r(this.f10730c, n0Var.f10730c) ^ true) && !(e6.e.r(this.f10731d, n0Var.f10731d) ^ true);
    }

    public final boolean f() {
        return false;
    }

    public final e g(int i) {
        if (i >= 0) {
            int i10 = i % 2;
            if (i10 == 0) {
                return this.f10730c;
            }
            if (i10 == 1) {
                return this.f10731d;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        throw new IllegalArgumentException(android.support.v4.media.a.e(a.d("Illegal index ", i, ", "), this.f10729b, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        int hashCode = this.f10730c.hashCode();
        return this.f10731d.hashCode() + ((hashCode + (this.f10729b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return this.f10729b + '(' + this.f10730c + ", " + this.f10731d + ')';
    }
}
