package ra;

import de.h;
import e6.e;
import java.util.Objects;
import qa.f;
import ub.c;
import yd.j;
import yd.v;

public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ h<Object>[] f10635e;

    /* renamed from: a  reason: collision with root package name */
    public final c f10636a;

    /* renamed from: b  reason: collision with root package name */
    public final c f10637b;

    /* renamed from: c  reason: collision with root package name */
    public final qa.c f10638c;

    /* renamed from: d  reason: collision with root package name */
    public final qa.c f10639d;

    static {
        Class<g> cls = g.class;
        j jVar = new j(cls, "lastSavedTransaction", "getLastSavedTransaction()J");
        Objects.requireNonNull(v.f13623a);
        f10635e = new h[]{jVar, new j(cls, "firstSavedTransaction", "getFirstSavedTransaction()J")};
    }

    public g(f fVar, c cVar, c cVar2) {
        e.D(cVar2, "transactionDao");
        this.f10636a = cVar;
        this.f10637b = cVar2;
        this.f10638c = new qa.c(fVar, qa.e.LAST_CACHED_TRANSACTION_TIME);
        this.f10639d = new qa.c(fVar, qa.e.FIRST_CACHED_TRANSACTION_TIME);
    }
}
