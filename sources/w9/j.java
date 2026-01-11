package w9;

import a.b;
import c3.k;
import ch.hsr.geohash.GeoHash;
import com.github.mikephil.charting.utils.Utils;
import e6.e;
import hf.f;
import java.nio.ByteBuffer;
import md.m;
import wi.d;
import xd.p;
import yd.h;
import yi.a;
import ze.c;

public final class j extends h implements p<a, byte[], m> {

    /* renamed from: b  reason: collision with root package name */
    public static final j f12621b = new j();

    public j() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        double d10;
        a aVar = (a) obj;
        e.D(aVar, "vm");
        e.D((byte[]) obj2, "$noName_1");
        oi.a t10 = b.t(aVar);
        yi.b.a(aVar, d.OP_LOCATION);
        long k10 = k.k(aVar);
        if (k10 <= ((long) b.F(aVar))) {
            int i = (int) k10;
            ByteBuffer u10 = e.u(aVar, i);
            c a10 = ((f) t10.f9452c).d().a();
            double d11 = Utils.DOUBLE_EPSILON;
            if (a10 == null) {
                d10 = 0.0d;
            } else {
                d10 = ((aj.f) a10).f675b;
            }
            if (a10 != null) {
                d11 = ((aj.f) a10).f676c;
            }
            String base32 = GeoHash.withCharacterPrecision(d10, d11, i).toBase32();
            e.C(base32, "withCharacterPrecision(l…ision.toInt()).toBase32()");
            byte[] bytes = base32.getBytes(fe.a.f5086b);
            e.C(bytes, "this as java.lang.String).getBytes(charset)");
            u10.put(bytes);
            long j10 = yi.b.f13680e;
            Long.signum(j10);
            yi.b.b(aVar, (j10 * k10) + ((long) 50));
            return m.f8555a;
        }
        throw new wi.c(wi.a.MissingPermission, "precision is not permitted: requested=" + k10 + " limit=" + b.F(aVar));
    }
}
