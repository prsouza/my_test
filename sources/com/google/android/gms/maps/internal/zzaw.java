package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

public abstract class zzaw extends zzb implements zzax {
    public zzaw() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zzb = zzb();
        parcel2.writeNoException();
        zzc.zzc(parcel2, zzb);
        return true;
    }
}
