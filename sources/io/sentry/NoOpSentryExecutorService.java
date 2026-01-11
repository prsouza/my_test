package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

final class NoOpSentryExecutorService implements ISentryExecutorService {
    private static final NoOpSentryExecutorService instance = new NoOpSentryExecutorService();

    private NoOpSentryExecutorService() {
    }

    public static ISentryExecutorService getInstance() {
        return instance;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object lambda$submit$0() {
        return null;
    }

    public void close(long j10) {
    }

    public Future<?> submit(Runnable runnable) {
        return new FutureTask(g.f6884a);
    }
}
