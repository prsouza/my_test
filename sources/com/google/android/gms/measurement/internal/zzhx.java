package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.activity.result.d;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

final class zzhx implements Runnable {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzin zzb;

    public zzhx(zzin zzin, Bundle bundle) {
        this.zzb = zzin;
        this.zza = bundle;
    }

    public final void run() {
        zzin zzin = this.zzb;
        Bundle bundle = this.zza;
        zzin.zzg();
        zzin.zza();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        if (!zzin.zzs.zzJ()) {
            d.g(zzin.zzs, "Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzll zzll = new zzll(checkNotEmpty, 0, (Object) null, BuildConfig.FLAVOR);
        try {
            zzab zzab = r4;
            zzab zzab2 = new zzab(bundle.getString("app_id"), BuildConfig.FLAVOR, zzll, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), (zzav) null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), (zzav) null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzin.zzs.zzv().zzz(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), BuildConfig.FLAVOR, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true));
            zzin.zzs.zzt().zzE(zzab);
        } catch (IllegalArgumentException unused) {
        }
    }
}
