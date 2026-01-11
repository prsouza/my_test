package le;

import ge.g;
import pd.f;
import xd.l;
import y.c;
import yd.h;

public final class m extends h implements l<Throwable, md.m> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l<Object, md.m> f8260b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8261c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ f f8262s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(l<Object, md.m> lVar, Object obj, f fVar) {
        super(1);
        this.f8260b = lVar;
        this.f8261c = obj;
        this.f8262s = fVar;
    }

    public final Object k(Object obj) {
        Throwable th2 = (Throwable) obj;
        l<Object, md.m> lVar = this.f8260b;
        Object obj2 = this.f8261c;
        f fVar = this.f8262s;
        x p10 = c.p(lVar, obj2, (x) null);
        if (p10 != null) {
            g.a(fVar, p10);
        }
        return md.m.f8555a;
    }
}
