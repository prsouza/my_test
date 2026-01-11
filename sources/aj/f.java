package aj;

import a.b;
import e6.e;
import ji.l;
import ze.c;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f674a;

    /* renamed from: b  reason: collision with root package name */
    public final double f675b;

    /* renamed from: c  reason: collision with root package name */
    public final double f676c;

    /* renamed from: d  reason: collision with root package name */
    public final double f677d;

    /* renamed from: e  reason: collision with root package name */
    public final float f678e;

    /* renamed from: f  reason: collision with root package name */
    public final long f679f;

    public f(String str, double d10, double d11, double d12, float f10, long j10) {
        e.D(str, "key");
        this.f674a = str;
        this.f675b = d10;
        this.f676c = d11;
        this.f677d = d12;
        this.f678e = f10;
        this.f679f = j10;
    }

    public final l a() {
        l.a r10 = l.r();
        r10.n(this.f679f);
        r10.o(this.f675b);
        r10.p(this.f676c);
        r10.l(this.f677d);
        r10.m(this.f678e);
        return (l) r10.i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return e.r(this.f674a, fVar.f674a) && e.r(Double.valueOf(this.f675b), Double.valueOf(fVar.f675b)) && e.r(Double.valueOf(this.f676c), Double.valueOf(fVar.f676c)) && e.r(Double.valueOf(this.f677d), Double.valueOf(fVar.f677d)) && e.r(Float.valueOf(this.f678e), Float.valueOf(fVar.f678e)) && this.f679f == fVar.f679f;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f675b);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f676c);
        int i10 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f677d);
        int i11 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        int floatToIntBits = Float.floatToIntBits(this.f678e);
        long j10 = this.f679f;
        return ((int) (j10 ^ (j10 >>> 32))) + ((floatToIntBits + ((i11 + ((i10 + ((i + (this.f674a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = b.q("LOIImpl(key=");
        q10.append(this.f674a);
        q10.append(", latitude=");
        q10.append(this.f675b);
        q10.append(", longitude=");
        q10.append(this.f676c);
        q10.append(", altitude=");
        q10.append(this.f677d);
        q10.append(", accuracy=");
        q10.append(this.f678e);
        q10.append(", geotime=");
        q10.append(this.f679f);
        q10.append(')');
        return q10.toString();
    }
}
