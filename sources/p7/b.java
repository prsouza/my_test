package p7;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhf;
import java.util.HashSet;
import t7.c;

public final class b implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f9706a;

    public b(c cVar) {
        this.f9706a = cVar;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        if (this.f9706a.f9707a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            HashSet hashSet = a.f9700a;
            String zza = zzhf.zza(str2);
            if (zza != null) {
                str2 = zza;
            }
            bundle2.putString("events", str2);
            ((c) this.f9706a.f9708b).a(2, bundle2);
        }
    }
}
