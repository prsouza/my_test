package io.sentry.transport;

import a8.a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public final class ReusableCountLatch {
    private final Sync sync;

    public static final class Sync extends AbstractQueuedSynchronizer {
        private static final long serialVersionUID = 5970133580157457018L;

        public Sync(int i) {
            setState(i);
        }

        /* access modifiers changed from: private */
        public void decrement() {
            releaseShared(1);
        }

        /* access modifiers changed from: private */
        public int getCount() {
            return getState();
        }

        /* access modifiers changed from: private */
        public void increment() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        public int tryAcquireShared(int i) {
            return getState() == 0 ? 1 : -1;
        }

        public boolean tryReleaseShared(int i) {
            int state;
            int i10;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i10 = state - 1;
            } while (!compareAndSetState(state, i10));
            return i10 == 0;
        }
    }

    public ReusableCountLatch() {
        this(0);
    }

    public ReusableCountLatch(int i) {
        if (i >= 0) {
            this.sync = new Sync(i);
            return;
        }
        throw new IllegalArgumentException(a.b("negative initial count '", i, "' is not allowed"));
    }

    public void decrement() {
        this.sync.decrement();
    }

    public int getCount() {
        return this.sync.getCount();
    }

    public void increment() {
        this.sync.increment();
    }

    public void waitTillZero() {
        this.sync.acquireSharedInterruptibly(1);
    }

    public boolean waitTillZero(long j10, TimeUnit timeUnit) {
        return this.sync.tryAcquireSharedNanos(1, timeUnit.toNanos(j10));
    }
}
