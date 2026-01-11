package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzs;

final class zzv extends zzs {
    public final /* synthetic */ GoogleMap.OnCameraMoveListener zza;

    public zzv(GoogleMap googleMap, GoogleMap.OnCameraMoveListener onCameraMoveListener) {
        this.zza = onCameraMoveListener;
    }

    public final void zzb() {
        this.zza.onCameraMove();
    }
}
