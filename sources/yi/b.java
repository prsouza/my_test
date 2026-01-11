package yi;

import b.j;
import e6.e;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wi.a;
import wi.d;
import y.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f13676a = LoggerFactory.getLogger("Nodle Emulator ASM");

    /* renamed from: b  reason: collision with root package name */
    public static long f13677b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final long f13678c = (((long) 2) * 1);

    /* renamed from: d  reason: collision with root package name */
    public static final long f13679d = (((long) 3) * 1);

    /* renamed from: e  reason: collision with root package name */
    public static final long f13680e = (((long) 5) * 1);

    /* renamed from: f  reason: collision with root package name */
    public static final long f13681f = (((long) 8) * 1);
    public static final long g = (((long) 11) * 1);

    public static final j a(a aVar, d dVar) {
        e.D(aVar, "$this$assertHasPermission");
        e.D(dVar, "op");
        j r10 = aVar.b().r(dVar.f12715a);
        if (r10 != null) {
            return r10;
        }
        throw c.n(dVar.name());
    }

    public static final void b(a aVar, long j10) {
        e.D(aVar, "$this$updateGasCounter");
        long j11 = aVar.g - j10;
        aVar.g = j11;
        if (j11 <= 0) {
            throw new wi.c(a.GasTankEmpty, "gas tank empty");
        }
    }
}
