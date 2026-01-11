package nd;

import java.util.Iterator;
import zd.a;

public final class s<T> implements Iterable<r<? extends T>>, a {

    /* renamed from: a  reason: collision with root package name */
    public final xd.a<Iterator<T>> f8971a;

    public s(xd.a<? extends Iterator<? extends T>> aVar) {
        this.f8971a = aVar;
    }

    public final Iterator<r<T>> iterator() {
        return new t(this.f8971a.c());
    }
}
