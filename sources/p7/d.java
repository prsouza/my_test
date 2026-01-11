package p7;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import t7.c;

public final class d implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f9709a;

    public d(e eVar) {
        this.f9709a = eVar;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        if (str != null && !str.equals(AppMeasurement.CRASH_ORIGIN) && (!a.f9700a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
            bundle2.putLong("timestampInMillis", j10);
            bundle2.putBundle("params", bundle);
            ((c) this.f9709a.f9710a).a(3, bundle2);
        }
    }
}
