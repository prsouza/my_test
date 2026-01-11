package l3;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class a implements ExecutorService {

    /* renamed from: b  reason: collision with root package name */
    public static final long f7765b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c  reason: collision with root package name */
    public static volatile int f7766c;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f7767a;

    /* renamed from: l3.a$a  reason: collision with other inner class name */
    public static final class C0142a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final String f7768a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7769b;

        /* renamed from: c  reason: collision with root package name */
        public int f7770c;

        /* renamed from: l3.a$a$a  reason: collision with other inner class name */
        public class C0143a extends Thread {
            public C0143a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public final void run() {
                Process.setThreadPriority(9);
                if (C0142a.this.f7769b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th2) {
                    Objects.requireNonNull(C0142a.this);
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                    }
                }
            }
        }

        public C0142a(String str, boolean z) {
            this.f7768a = str;
            this.f7769b = z;
        }

        public final synchronized Thread newThread(Runnable runnable) {
            C0143a aVar;
            aVar = new C0143a(runnable, "glide-" + this.f7768a + "-thread-" + this.f7770c);
            this.f7770c = this.f7770c + 1;
            return aVar;
        }
    }

    public a(ExecutorService executorService) {
        this.f7767a = executorService;
    }

    public static int a() {
        if (f7766c == 0) {
            f7766c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f7766c;
    }

    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f7767a.awaitTermination(j10, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f7767a.execute(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f7767a.invokeAll(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f7767a.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f7767a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f7767a.isTerminated();
    }

    public final void shutdown() {
        this.f7767a.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f7767a.shutdownNow();
    }

    public final Future<?> submit(Runnable runnable) {
        return this.f7767a.submit(runnable);
    }

    public final String toString() {
        return this.f7767a.toString();
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f7767a.invokeAll(collection, j10, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f7767a.invokeAny(collection, j10, timeUnit);
    }

    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f7767a.submit(runnable, t10);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f7767a.submit(callable);
    }
}
