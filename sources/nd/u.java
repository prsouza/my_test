package nd;

import java.util.Iterator;
import zd.a;

public abstract class u implements Iterator<Integer>, a {
    public abstract int a();

    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
