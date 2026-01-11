package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import e2.f;
import g2.b;
import u1.p;
import v1.j;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2673a = p.e("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f2674a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f2675b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f2676c;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f2674a = intent;
            this.f2675b = context;
            this.f2676c = pendingResult;
        }

        public final void run() {
            try {
                boolean booleanExtra = this.f2674a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f2674a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f2674a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f2674a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                p.c().a(ConstraintProxyUpdateReceiver.f2673a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                f.a(this.f2675b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                f.a(this.f2675b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                f.a(this.f2675b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                f.a(this.f2675b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f2676c.finish();
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            p.c().a(f2673a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
            return;
        }
        ((b) j.s2(context).f12153y).a(new a(intent, context, goAsync()));
    }
}
