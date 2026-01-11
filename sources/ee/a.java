package ee;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<d<T>> f4815a;

    public a(d<? extends T> dVar) {
        this.f4815a = new AtomicReference<>(dVar);
    }

    public final Iterator<T> iterator() {
        d andSet = this.f4815a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
