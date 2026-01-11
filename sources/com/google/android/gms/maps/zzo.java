package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzaa;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbe;
import com.google.android.gms.maps.model.Polygon;

final class zzo extends zzbe {
    public final /* synthetic */ GoogleMap.OnPolygonClickListener zza;

    public zzo(GoogleMap googleMap, GoogleMap.OnPolygonClickListener onPolygonClickListener) {
        this.zza = onPolygonClickListener;
    }

    public final void zzb(zzaa zzaa) {
        this.zza.onPolygonClick(new Polygon(zzaa));
    }
}
