package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i == 1) {
            zzb((ProxyResponse) zzc.zza(parcel, ProxyResponse.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzc(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
