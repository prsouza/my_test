package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzo;

final class zzx extends zzo {
    public final /* synthetic */ GoogleMap.OnCameraIdleListener zza;

    public zzx(GoogleMap googleMap, GoogleMap.OnCameraIdleListener onCameraIdleListener) {
        this.zza = onCameraIdleListener;
    }

    public final void zzb() {
        this.zza.onCameraIdle();
    }
}
