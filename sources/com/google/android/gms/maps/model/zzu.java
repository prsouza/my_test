package com.google.android.gms.maps.model;

import com.google.android.gms.internal.maps.zzai;

final class zzu extends zzai {
    public final /* synthetic */ TileProvider zza;

    public zzu(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.zza = tileProvider;
    }

    public final Tile zzb(int i, int i10, int i11) {
        return this.zza.getTile(i, i10, i11);
    }
}
