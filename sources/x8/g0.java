package x8;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

@KeepForSdk
public final class g0 {

    /* renamed from: e  reason: collision with root package name */
    public static g0 f13042e;

    /* renamed from: a  reason: collision with root package name */
    public String f13043a = null;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f13044b = null;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f13045c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Queue<Intent> f13046d = new ArrayDeque();

    public static synchronized g0 a() {
        g0 g0Var;
        synchronized (g0.class) {
            if (f13042e == null) {
                f13042e = new g0();
            }
            g0Var = f13042e;
        }
        return g0Var;
    }

    public final boolean b(Context context) {
        if (this.f13045c == null) {
            this.f13045c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f13044b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f13045c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f13044b == null) {
            this.f13044b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f13044b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f13044b.booleanValue();
    }
}
