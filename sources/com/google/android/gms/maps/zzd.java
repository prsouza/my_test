package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzx;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzag;
import com.google.android.gms.maps.model.Marker;

final class zzd extends zzag {
    public final /* synthetic */ GoogleMap.OnInfoWindowLongClickListener zza;

    public zzd(GoogleMap googleMap, GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.zza = onInfoWindowLongClickListener;
    }

    public final void zzb(zzx zzx) {
        this.zza.onInfoWindowLongClick(new Marker(zzx));
    }
}
