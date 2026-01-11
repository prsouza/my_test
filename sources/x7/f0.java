package x7;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class f0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12916a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f12917b;

    public class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f12918a;

        public a(Runnable runnable) {
            this.f12918a = runnable;
        }

        public final void a() {
            this.f12918a.run();
        }
    }

    public f0(String str, AtomicLong atomicLong) {
        this.f12916a = str;
        this.f12917b = atomicLong;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        newThread.setName(this.f12916a + this.f12917b.getAndIncrement());
        return newThread;
    }
}
