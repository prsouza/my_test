package nd;

import java.util.Iterator;
import xd.a;
import yd.h;

public final class l extends h implements a<Iterator<Object>> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Iterable<Object> f8964b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Iterable<Object> iterable) {
        super(0);
        this.f8964b = iterable;
    }

    public final Object c() {
        return this.f8964b.iterator();
    }
}
