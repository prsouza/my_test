package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c1.a;
import com.google.android.gms.measurement.internal.zzfr;

public final class AppMeasurementReceiver extends a implements zzfr.zza {
    private zzfr zza;

    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    public void doStartService(Context context, Intent intent) {
        a.startWakefulService(context, intent);
    }

    public void onReceive(Context context, Intent intent) {
        if (this.zza == null) {
            this.zza = new zzfr(this);
        }
        this.zza.zza(context, intent);
    }
}
