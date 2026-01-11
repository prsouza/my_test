package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import u1.p;
import v1.j;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2677a = p.e("RescheduleReceiver");

    public final void onReceive(Context context, Intent intent) {
        p.c().a(f2677a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        try {
            j s22 = j.s2(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Objects.requireNonNull(s22);
            synchronized (j.G) {
                s22.D = goAsync;
                if (s22.C) {
                    goAsync.finish();
                    s22.D = null;
                }
            }
        } catch (IllegalStateException e10) {
            p.c().b(f2677a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
