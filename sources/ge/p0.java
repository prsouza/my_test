package ge;

import a.a;
import java.util.concurrent.Future;

public final class p0 implements q0 {

    /* renamed from: a  reason: collision with root package name */
    public final Future<?> f5436a;

    public p0(Future<?> future) {
        this.f5436a = future;
    }

    public final void e() {
        this.f5436a.cancel(false);
    }

    public final String toString() {
        StringBuilder d10 = a.d("DisposableFutureHandle[");
        d10.append(this.f5436a);
        d10.append(']');
        return d10.toString();
    }
}
