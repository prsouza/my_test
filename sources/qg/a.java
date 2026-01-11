package qg;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.math.BigInteger;
import java.util.Objects;
import xg.b;
import xg.d;
import xg.f;

public final class a implements b {

    /* renamed from: f  reason: collision with root package name */
    public final d f10447f;
    public final f g;

    /* renamed from: h  reason: collision with root package name */
    public final BigInteger f10448h;

    public a(d dVar, f fVar, BigInteger bigInteger) {
        Objects.requireNonNull(dVar, "curve");
        Objects.requireNonNull(bigInteger, GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
        this.f10447f = dVar;
        Objects.requireNonNull(fVar, "Point cannot be null");
        f n10 = xg.a.e(dVar, fVar).n();
        if (n10.j()) {
            throw new IllegalArgumentException("Point at infinity");
        } else if (n10.i(false, true)) {
            this.g = n10;
            this.f10448h = bigInteger;
            xh.a.a((byte[]) null);
        } else {
            throw new IllegalArgumentException("Point not on curve");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10447f.i(aVar.f10447f) && this.g.b(aVar.g) && this.f10448h.equals(aVar.f10448h);
    }

    public final int hashCode() {
        return ((((this.f10447f.hashCode() ^ 1028) * 257) ^ this.g.hashCode()) * 257) ^ this.f10448h.hashCode();
    }
}
