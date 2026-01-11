package c2;

import androidx.work.impl.foreground.SystemForegroundService;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3118a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f3119b;

    public d(SystemForegroundService systemForegroundService, int i) {
        this.f3119b = systemForegroundService;
        this.f3118a = i;
    }

    public final void run() {
        this.f3119b.f2723t.cancel(this.f3118a);
    }
}
