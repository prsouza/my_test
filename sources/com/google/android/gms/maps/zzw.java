package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzq;

final class zzw extends zzq {
    public final /* synthetic */ GoogleMap.OnCameraMoveCanceledListener zza;

    public zzw(GoogleMap googleMap, GoogleMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.zza = onCameraMoveCanceledListener;
    }

    public final void zzb() {
        this.zza.onCameraMoveCanceled();
    }
}
