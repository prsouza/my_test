package ch.hsr.geohash;

import a.b;
import java.io.Serializable;

public class WGS84Point implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final double f3468a;

    /* renamed from: b  reason: collision with root package name */
    public final double f3469b;

    public WGS84Point(double d10, double d11) {
        this.f3469b = d10;
        this.f3468a = d11;
        if (Math.abs(d10) > 90.0d || Math.abs(d11) > 180.0d) {
            throw new IllegalArgumentException("The supplied coordinates " + this + " are out of range.");
        }
    }

    public WGS84Point(WGS84Point wGS84Point) {
        this(wGS84Point.f3469b, wGS84Point.f3468a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WGS84Point)) {
            return false;
        }
        WGS84Point wGS84Point = (WGS84Point) obj;
        return this.f3469b == wGS84Point.f3469b && this.f3468a == wGS84Point.f3468a;
    }

    public double getLatitude() {
        return this.f3469b;
    }

    public double getLongitude() {
        return this.f3468a;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f3469b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f3468a);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 1302) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        StringBuilder q10 = b.q("(");
        q10.append(this.f3469b);
        q10.append(",");
        q10.append(this.f3468a);
        q10.append(")");
        return String.format(q10.toString(), new Object[0]);
    }
}
