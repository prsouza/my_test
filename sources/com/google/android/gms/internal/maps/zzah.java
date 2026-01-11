package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

public final class zzah extends zza implements zzaj {
    public zzah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public final Tile zzb(int i, int i10, int i11) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i10);
        zza.writeInt(i11);
        Parcel zzH = zzH(1, zza);
        Tile tile = (Tile) zzc.zza(zzH, Tile.CREATOR);
        zzH.recycle();
        return tile;
    }
}
