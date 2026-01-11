package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.fragment.app.m;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzg extends zza implements zzi {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    public final IObjectWrapper zzd() throws RemoteException {
        return m.b(zzH(4, zza()));
    }

    public final IObjectWrapper zze(float f10) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f10);
        return m.b(zzH(5, zza));
    }

    public final IObjectWrapper zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return m.b(zzH(2, zza));
    }

    public final IObjectWrapper zzg(Bitmap bitmap) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, bitmap);
        return m.b(zzH(6, zza));
    }

    public final IObjectWrapper zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return m.b(zzH(3, zza));
    }

    public final IObjectWrapper zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return m.b(zzH(7, zza));
    }

    public final IObjectWrapper zzj(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        return m.b(zzH(1, zza));
    }
}
