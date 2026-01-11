package v6;

import java.util.Iterator;

public abstract class k<E> implements Iterator<E> {
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
