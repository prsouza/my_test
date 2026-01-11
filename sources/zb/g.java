package zb;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class g implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f14285a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f14286b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f14287c;

    public g(h hVar) {
        this.f14287c = hVar;
        this.f14286b = hVar.size();
    }

    public final boolean hasNext() {
        return this.f14285a < this.f14286b;
    }

    public final Object next() {
        try {
            h hVar = this.f14287c;
            int i = this.f14285a;
            this.f14285a = i + 1;
            return Byte.valueOf(hVar.h(i));
        } catch (IndexOutOfBoundsException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
