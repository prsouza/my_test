package ki;

import md.m;
import xd.l;
import yd.h;

public final class o extends h implements l<Throwable, m> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f7617b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(b bVar) {
        super(1);
        this.f7617b = bVar;
    }

    public final Object k(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f7617b.cancel();
        return m.f8555a;
    }
}
