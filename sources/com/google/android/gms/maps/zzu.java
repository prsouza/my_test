package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;

final class zzu extends com.google.android.gms.maps.internal.zzu {
    public final /* synthetic */ GoogleMap.OnCameraMoveStartedListener zza;

    public zzu(GoogleMap googleMap, GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.zza = onCameraMoveStartedListener;
    }

    public final void zzb(int i) {
        this.zza.onCameraMoveStarted(i);
    }
}
