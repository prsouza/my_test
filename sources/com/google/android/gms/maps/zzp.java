package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbg;
import com.google.android.gms.maps.model.Polyline;

final class zzp extends zzbg {
    public final /* synthetic */ GoogleMap.OnPolylineClickListener zza;

    public zzp(GoogleMap googleMap, GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        this.zza = onPolylineClickListener;
    }

    public final void zzb(zzad zzad) {
        this.zza.onPolylineClick(new Polyline(zzad));
    }
}
