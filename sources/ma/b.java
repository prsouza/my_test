package ma;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import h1.e;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f8511b = (b.class.getCanonicalName() + ".KEY");

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f8512a;

    public b(Context context) {
        this.f8512a = context.getSharedPreferences("LOCATION_STORE", 0);
    }

    public final String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        e.b(sb2, f8511b, "_", str, "_");
        sb2.append(str2);
        return sb2.toString();
    }

    public final void b(String str, Location location) {
        SharedPreferences.Editor edit = this.f8512a.edit();
        edit.putString(a(str, "PROVIDER"), location.getProvider());
        edit.putLong(a(str, "LATITUDE"), Double.doubleToLongBits(location.getLatitude()));
        edit.putLong(a(str, "LONGITUDE"), Double.doubleToLongBits(location.getLongitude()));
        edit.putFloat(a(str, "ACCURACY"), location.getAccuracy());
        edit.putLong(a(str, "ALTITUDE"), Double.doubleToLongBits(location.getAltitude()));
        edit.putFloat(a(str, "SPEED"), location.getSpeed());
        edit.putLong(a(str, "TIME"), location.getTime());
        edit.putFloat(a(str, "BEARING"), location.getBearing());
        edit.apply();
    }
}
