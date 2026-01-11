package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzb;

public abstract class zzbg extends zzb implements zzbh {
    public zzbg() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb(zzac.zzb(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
