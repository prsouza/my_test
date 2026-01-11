package ge;

import a.a;
import java.util.concurrent.Future;
import md.m;

public final class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Future<?> f5402a;

    public h(Future<?> future) {
        this.f5402a = future;
    }

    public final void a(Throwable th2) {
        if (th2 != null) {
            this.f5402a.cancel(false);
        }
    }

    public final Object k(Object obj) {
        if (((Throwable) obj) != null) {
            this.f5402a.cancel(false);
        }
        return m.f8555a;
    }

    public final String toString() {
        StringBuilder d10 = a.d("CancelFutureOnCancel[");
        d10.append(this.f5402a);
        d10.append(']');
        return d10.toString();
    }
}
