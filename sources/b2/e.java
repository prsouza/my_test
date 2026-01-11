package b2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import u1.p;

public final class e extends d<z1.b> {

    /* renamed from: j  reason: collision with root package name */
    public static final String f2835j = p.e("NetworkStateTracker");
    public final ConnectivityManager g = ((ConnectivityManager) this.f2829b.getSystemService("connectivity"));

    /* renamed from: h  reason: collision with root package name */
    public b f2836h;
    public a i;

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                p.c().a(e.f2835j, "Network broadcast received", new Throwable[0]);
                e eVar = e.this;
                eVar.c(eVar.f());
            }
        }
    }

    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            p.c().a(e.f2835j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }

        public final void onLost(Network network) {
            p.c().a(e.f2835j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    public e(Context context, g2.a aVar) {
        super(context, aVar);
        if (g()) {
            this.f2836h = new b();
        } else {
            this.i = new a();
        }
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public final Object a() {
        return f();
    }

    public final void d() {
        if (g()) {
            try {
                p.c().a(f2835j, "Registering network callback", new Throwable[0]);
                this.g.registerDefaultNetworkCallback(this.f2836h);
            } catch (IllegalArgumentException | SecurityException e10) {
                p.c().b(f2835j, "Received exception while registering network callback", e10);
            }
        } else {
            p.c().a(f2835j, "Registering broadcast receiver", new Throwable[0]);
            this.f2829b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public final void e() {
        if (g()) {
            try {
                p.c().a(f2835j, "Unregistering network callback", new Throwable[0]);
                this.g.unregisterNetworkCallback(this.f2836h);
            } catch (IllegalArgumentException | SecurityException e10) {
                p.c().b(f2835j, "Received exception while unregistering network callback", e10);
            }
        } else {
            p.c().a(f2835j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f2829b.unregisterReceiver(this.i);
        }
    }

    public final z1.b f() {
        boolean z;
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        boolean z10 = true;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = this.g.getNetworkCapabilities(this.g.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                z = true;
                boolean isActiveNetworkMetered = this.g.isActiveNetworkMetered();
                if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
                    z10 = false;
                }
                return new z1.b(z11, z, isActiveNetworkMetered, z10);
            }
        } catch (SecurityException e10) {
            p.c().b(f2835j, "Unable to validate active network", e10);
        }
        z = false;
        boolean isActiveNetworkMetered2 = this.g.isActiveNetworkMetered();
        z10 = false;
        return new z1.b(z11, z, isActiveNetworkMetered2, z10);
    }
}
