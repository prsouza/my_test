package c2;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3115a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Notification f3116b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f3117c;

    public c(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.f3117c = systemForegroundService;
        this.f3115a = i;
        this.f3116b = notification;
    }

    public final void run() {
        this.f3117c.f2723t.notify(this.f3115a, this.f3116b);
    }
}
