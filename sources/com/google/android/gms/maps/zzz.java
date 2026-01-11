package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzao;
import com.google.android.gms.maps.model.LatLng;

final class zzz extends zzao {
    public final /* synthetic */ GoogleMap.OnMapLongClickListener zza;

    public zzz(GoogleMap googleMap, GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        this.zza = onMapLongClickListener;
    }

    public final void zzb(LatLng latLng) {
        this.zza.onMapLongClick(latLng);
    }
}
