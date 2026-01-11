package io.sentry;

import java.util.concurrent.Future;

interface ISentryExecutorService {
    void close(long j10);

    Future<?> submit(Runnable runnable);
}
