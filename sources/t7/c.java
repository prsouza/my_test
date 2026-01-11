package t7;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Locale;
import o7.a;
import v7.b;

public final class c implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public b f11432a;

    /* renamed from: b  reason: collision with root package name */
    public b f11433b;

    public final void a(int i, Bundle bundle) {
        b bVar;
        String format = String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i), bundle});
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", format, (Throwable) null);
        }
        String string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                bVar = this.f11432a;
            } else {
                bVar = this.f11433b;
            }
            if (bVar != null) {
                bVar.a(string, bundle2);
            }
        }
    }
}
