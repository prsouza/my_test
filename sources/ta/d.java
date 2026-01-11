package ta;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import java.io.IOException;
import nf.f;
import p002if.a0;
import p002if.s;

public final class d implements s {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11450a;

    public d(Context context) {
        this.f11450a = context;
    }

    public final a0 a(s.a aVar) throws IOException {
        if (b()) {
            f fVar = (f) aVar;
            return fVar.b(fVar.f9016f);
        }
        throw new c();
    }

    public final boolean b() {
        Context context = this.f11450a;
        ConnectivityManager connectivityManager = null;
        Object systemService = context != null ? context.getSystemService("connectivity") : null;
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        }
        if (connectivityManager == null) {
            return true;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (!(networkCapabilities != null && networkCapabilities.hasCapability(12)) || !networkCapabilities.hasCapability(16)) {
            return false;
        }
        return true;
    }
}
