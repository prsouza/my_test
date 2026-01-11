package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class QueuedThreadPoolExecutor extends ThreadPoolExecutor {
    private final ILogger logger;
    private final int maxQueueSize;
    private final ReusableCountLatch unfinishedTasksCount = new ReusableCountLatch();

    public static final class CancelledFuture<T> implements Future<T> {
        private CancelledFuture() {
        }

        public boolean cancel(boolean z) {
            return true;
        }

        public T get() {
            throw new CancellationException();
        }

        public T get(long j10, TimeUnit timeUnit) {
            throw new CancellationException();
        }

        public boolean isCancelled() {
            return true;
        }

        public boolean isDone() {
            return true;
        }
    }

    public QueuedThreadPoolExecutor(int i, int i10, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, ILogger iLogger) {
        super(i, i, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.maxQueueSize = i10;
        this.logger = iLogger;
    }

    private boolean isSchedulingAllowed() {
        return this.unfinishedTasksCount.getCount() < this.maxQueueSize;
    }

    public void afterExecute(Runnable runnable, Throwable th2) {
        try {
            super.afterExecute(runnable, th2);
        } finally {
            this.unfinishedTasksCount.decrement();
        }
    }

    public Future<?> submit(Runnable runnable) {
        if (isSchedulingAllowed()) {
            this.unfinishedTasksCount.increment();
            return super.submit(runnable);
        }
        this.logger.log(SentryLevel.WARNING, "Submit cancelled", new Object[0]);
        return new CancelledFuture();
    }

    public void waitTillIdle(long j10) {
        try {
            this.unfinishedTasksCount.waitTillZero(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.logger.log(SentryLevel.ERROR, "Failed to wait till idle", (Throwable) e10);
            Thread.currentThread().interrupt();
        }
    }
}
