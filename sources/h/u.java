package h;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static u f5615d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5616a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f5617b;

    /* renamed from: c  reason: collision with root package name */
    public final a f5618c = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5619a;

        /* renamed from: b  reason: collision with root package name */
        public long f5620b;
    }

    public u(Context context, LocationManager locationManager) {
        this.f5616a = context;
        this.f5617b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.f5617b.isProviderEnabled(str)) {
                return this.f5617b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }
}
