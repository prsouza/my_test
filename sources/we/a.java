package we;

import android.location.Location;
import bc.i;

public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Location f12662a;

    public a(Location location) {
        this.f12662a = location;
    }

    public final double a() {
        return this.f12662a.getLongitude();
    }

    public final double b() {
        return this.f12662a.getLatitude();
    }

    public final double c() {
        return this.f12662a.getAltitude();
    }

    public final float d() {
        return this.f12662a.getAccuracy();
    }

    public final long e() {
        return this.f12662a.getTime();
    }
}
