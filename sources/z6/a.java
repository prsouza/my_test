package z6;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface a<V> extends Future<V> {
    void d(Runnable runnable, Executor executor);
}
