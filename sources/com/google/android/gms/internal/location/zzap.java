package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

final class zzap implements ListenerHolder.Notifier<LocationCallback> {
    public final /* synthetic */ LocationResult zza;

    public zzap(zzar zzar, LocationResult locationResult) {
        this.zza = locationResult;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationResult(this.zza);
    }

    public final void onNotifyListenerFailed() {
    }
}
