package d9;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class a<T> implements Future<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f4372a;

    public a(T t10) {
        this.f4372a = t10;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        return this.f4372a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final T get(long j10, TimeUnit timeUnit) {
        return this.f4372a;
    }
}
