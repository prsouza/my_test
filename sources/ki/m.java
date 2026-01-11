package ki;

import xd.l;
import yd.h;

public final class m extends h implements l<Throwable, md.m> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f7615b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(b bVar) {
        super(1);
        this.f7615b = bVar;
    }

    public final Object k(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f7615b.cancel();
        return md.m.f8555a;
    }
}
