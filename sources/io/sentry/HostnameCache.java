package io.sentry;

import a.b;
import io.sentry.util.Objects;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

final class HostnameCache {
    private static final long GET_HOSTNAME_TIMEOUT = TimeUnit.SECONDS.toMillis(1);
    private static final long HOSTNAME_CACHE_DURATION = TimeUnit.HOURS.toMillis(5);
    private static HostnameCache INSTANCE;
    private final long cacheDuration;
    private final ExecutorService executorService;
    private volatile long expirationTimestamp;
    private final Callable<InetAddress> getLocalhost;
    private volatile String hostname;
    private final AtomicBoolean updateRunning;

    public static final class HostnameCacheThreadFactory implements ThreadFactory {
        private int cnt;

        private HostnameCacheThreadFactory() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder q10 = b.q("SentryHostnameCache-");
            int i = this.cnt;
            this.cnt = i + 1;
            q10.append(i);
            Thread thread = new Thread(runnable, q10.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private HostnameCache() {
        this(HOSTNAME_CACHE_DURATION);
    }

    public HostnameCache(long j10) {
        this(j10, d.f6883a);
    }

    public HostnameCache(long j10, Callable<InetAddress> callable) {
        this.updateRunning = new AtomicBoolean(false);
        this.executorService = Executors.newSingleThreadExecutor(new HostnameCacheThreadFactory());
        this.cacheDuration = j10;
        this.getLocalhost = (Callable) Objects.requireNonNull(callable, "getLocalhost is required");
        updateCache();
    }

    public static HostnameCache getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HostnameCache();
        }
        return INSTANCE;
    }

    private void handleCacheUpdateFailure() {
        this.expirationTimestamp = TimeUnit.SECONDS.toMillis(1) + System.currentTimeMillis();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public /* synthetic */ Void lambda$updateCache$1() {
        try {
            this.hostname = this.getLocalhost.call().getCanonicalHostName();
            this.expirationTimestamp = System.currentTimeMillis() + this.cacheDuration;
            this.updateRunning.set(false);
            return null;
        } catch (Throwable th2) {
            this.updateRunning.set(false);
            throw th2;
        }
    }

    private void updateCache() {
        try {
            this.executorService.submit(new c(this, 0)).get(GET_HOSTNAME_TIMEOUT, TimeUnit.MILLISECONDS);
            return;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
        }
        handleCacheUpdateFailure();
    }

    public void close() {
        this.executorService.shutdown();
    }

    public String getHostname() {
        if (this.expirationTimestamp < System.currentTimeMillis() && this.updateRunning.compareAndSet(false, true)) {
            updateCache();
        }
        return this.hostname;
    }

    public boolean isClosed() {
        return this.executorService.isShutdown();
    }
}
