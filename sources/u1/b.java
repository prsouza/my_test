package u1;

import a.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f11624a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f11625b;

    public b(boolean z) {
        this.f11625b = z;
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder d10 = a.d(this.f11625b ? "WM.task-" : "androidx.work-");
        d10.append(this.f11624a.incrementAndGet());
        return new Thread(runnable, d10.toString());
    }
}
