package nd;

import java.util.Iterator;
import zd.a;

public abstract class v implements Iterator<Long>, a {
    public abstract long a();

    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
