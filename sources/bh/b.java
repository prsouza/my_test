package bh;

import xg.f;
import xg.k;
import xg.l;

public final class b implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f3026a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f3027b;

    public b(c cVar, f fVar) {
        this.f3026a = cVar;
        this.f3027b = fVar;
    }

    public final l a(l lVar) {
        a aVar = lVar instanceof a ? (a) lVar : null;
        c cVar = this.f3026a;
        if ((aVar == null || aVar.f3024a != cVar || aVar.f3025b == null) ? false : true) {
            return aVar;
        }
        f a10 = cVar.a().a(this.f3027b);
        a aVar2 = new a();
        aVar2.f3024a = this.f3026a;
        aVar2.f3025b = a10;
        return aVar2;
    }
}
