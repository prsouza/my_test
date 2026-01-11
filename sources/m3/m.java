package m3;

import c4.g;
import java.util.Objects;
import m3.n;

public final class m extends g<n.a<Object>, Object> {
    public m() {
        super(500);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Queue<m3.n$a<?>>, java.util.ArrayDeque] */
    public final void c(Object obj, Object obj2) {
        n.a aVar = (n.a) obj;
        Objects.requireNonNull(aVar);
        ? r22 = n.a.f8422d;
        synchronized (r22) {
            r22.offer(aVar);
        }
    }
}
