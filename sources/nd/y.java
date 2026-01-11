package nd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import md.j;
import md.k;
import zd.a;

public abstract class y implements Iterator<j>, a {
    public final Object next() {
        k.a aVar = (k.a) this;
        int i = aVar.f8553b;
        byte[] bArr = aVar.f8552a;
        if (i < bArr.length) {
            aVar.f8553b = i + 1;
            return new j(bArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(aVar.f8553b));
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
