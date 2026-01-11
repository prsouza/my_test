package ge;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import le.c;
import md.m;
import pd.f;

public final class y0 extends x0 implements j0 {

    /* renamed from: b  reason: collision with root package name */
    public final Executor f5471b;

    public y0(Executor executor) {
        this.f5471b = executor;
        Method method = c.f8234a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null) {
                Method method2 = c.f8234a;
                if (method2 != null) {
                    method2.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void close() {
        Executor executor = this.f5471b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y0) && ((y0) obj).f5471b == this.f5471b;
    }

    public final void f(long j10, k<? super m> kVar) {
        Executor executor = this.f5471b;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = w0(scheduledExecutorService, new u1(this, kVar), ((l) kVar).f5413t, j10);
        }
        if (scheduledFuture != null) {
            ((l) kVar).i(new h(scheduledFuture));
        } else {
            h0.f5403w.f(j10, kVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5471b);
    }

    public final void p0(f fVar, Runnable runnable) {
        try {
            this.f5471b.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            ad.c.y(fVar, cancellationException);
            o0.f5434b.p0(fVar, runnable);
        }
    }

    public final q0 s(long j10, Runnable runnable, f fVar) {
        Executor executor = this.f5471b;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = w0(scheduledExecutorService, runnable, fVar, j10);
        }
        if (scheduledFuture != null) {
            return new p0(scheduledFuture);
        }
        return h0.f5403w.s(j10, runnable, fVar);
    }

    public final String toString() {
        return this.f5471b.toString();
    }

    public final ScheduledFuture<?> w0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, f fVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            ad.c.y(fVar, cancellationException);
            return null;
        }
    }
}
