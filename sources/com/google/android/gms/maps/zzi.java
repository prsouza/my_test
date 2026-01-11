package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzba;

final class zzi extends zzba {
    public final /* synthetic */ GoogleMap.OnMyLocationClickListener zza;

    public zzi(GoogleMap googleMap, GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        this.zza = onMyLocationClickListener;
    }

    public final void zzb(Location location) {
        this.zza.onMyLocationClick(location);
    }
}
