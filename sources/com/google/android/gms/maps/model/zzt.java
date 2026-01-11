package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaj;

final class zzt implements TileProvider {
    public final /* synthetic */ TileOverlayOptions zza;
    private final zzaj zzb;

    public zzt(TileOverlayOptions tileOverlayOptions) {
        this.zza = tileOverlayOptions;
        this.zzb = tileOverlayOptions.zza;
    }

    public final Tile getTile(int i, int i10, int i11) {
        try {
            return this.zzb.zzb(i, i10, i11);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
