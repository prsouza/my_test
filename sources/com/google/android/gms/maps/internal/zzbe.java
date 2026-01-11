package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzz;

public abstract class zzbe extends zzb implements zzbf {
    public zzbe() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb(zzz.zzb(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
