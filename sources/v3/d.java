package v3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.j;
import java.util.Objects;
import v3.b;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12262a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f12263b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12264c;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12265s;

    /* renamed from: t  reason: collision with root package name */
    public final a f12266t = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            d dVar = d.this;
            boolean z = dVar.f12264c;
            dVar.f12264c = dVar.h(context);
            if (z != d.this.f12264c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder d10 = a.a.d("connectivity changed, isConnected: ");
                    d10.append(d.this.f12264c);
                    Log.d("ConnectivityMonitor", d10.toString());
                }
                d dVar2 = d.this;
                b.a aVar = dVar2.f12263b;
                boolean z10 = dVar2.f12264c;
                j.b bVar = (j.b) aVar;
                Objects.requireNonNull(bVar);
                if (z10) {
                    synchronized (j.this) {
                        bVar.f3548a.b();
                    }
                }
            }
        }
    }

    public d(Context context, b.a aVar) {
        this.f12262a = context.getApplicationContext();
        this.f12263b = aVar;
    }

    public final boolean h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Objects.requireNonNull(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
            }
            return true;
        }
    }

    public final void onDestroy() {
    }

    public final void onStart() {
        if (!this.f12265s) {
            this.f12264c = h(this.f12262a);
            try {
                this.f12262a.registerReceiver(this.f12266t, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f12265s = true;
            } catch (SecurityException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e10);
                }
            }
        }
    }

    public final void onStop() {
        if (this.f12265s) {
            this.f12262a.unregisterReceiver(this.f12266t);
            this.f12265s = false;
        }
    }
}
