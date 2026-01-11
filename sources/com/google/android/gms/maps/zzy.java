package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzak;
import com.google.android.gms.maps.model.LatLng;

final class zzy extends zzak {
    public final /* synthetic */ GoogleMap.OnMapClickListener zza;

    public zzy(GoogleMap googleMap, GoogleMap.OnMapClickListener onMapClickListener) {
        this.zza = onMapClickListener;
    }

    public final void zzb(LatLng latLng) {
        this.zza.onMapClick(latLng);
    }
}
