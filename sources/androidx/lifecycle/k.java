package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2127a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2128b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2129c;

    /* renamed from: d  reason: collision with root package name */
    public final Queue<Runnable> f2130d = new ArrayDeque();

    public final boolean a() {
        return this.f2128b || !this.f2127a;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Queue<java.lang.Runnable>, java.util.ArrayDeque] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.Queue<java.lang.Runnable>, java.util.ArrayDeque] */
    public final void b() {
        if (!this.f2129c) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    if (!(this.f2130d.isEmpty() ^ z)) {
                        break;
                    } else if (!a()) {
                        break;
                    } else {
                        Runnable runnable = (Runnable) this.f2130d.poll();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                this.f2129c = z;
            } finally {
                this.f2129c = z;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Queue<java.lang.Runnable>, java.util.ArrayDeque] */
    public final void c(Runnable runnable) {
        if (this.f2130d.offer(runnable)) {
            b();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }
}
