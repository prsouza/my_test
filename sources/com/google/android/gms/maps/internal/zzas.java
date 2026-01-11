package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzw;

public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zzb = zzb(zzw.zzb(parcel.readStrongBinder()));
        parcel2.writeNoException();
        zzc.zzc(parcel2, zzb);
        return true;
    }
}
