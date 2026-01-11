package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.fragment.app.m;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class zzb extends zza implements ICameraUpdateFactoryDelegate {
    public zzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final IObjectWrapper newCameraPosition(CameraPosition cameraPosition) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, cameraPosition);
        return m.b(zzH(7, zza));
    }

    public final IObjectWrapper newLatLng(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        return m.b(zzH(8, zza));
    }

    public final IObjectWrapper newLatLngBounds(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, latLngBounds);
        zza.writeInt(i);
        return m.b(zzH(10, zza));
    }

    public final IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i, int i10, int i11) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, latLngBounds);
        zza.writeInt(i);
        zza.writeInt(i10);
        zza.writeInt(i11);
        return m.b(zzH(11, zza));
    }

    public final IObjectWrapper newLatLngZoom(LatLng latLng, float f10) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, latLng);
        zza.writeFloat(f10);
        return m.b(zzH(9, zza));
    }

    public final IObjectWrapper scrollBy(float f10, float f11) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zza.writeFloat(f11);
        return m.b(zzH(3, zza));
    }

    public final IObjectWrapper zoomBy(float f10) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f10);
        return m.b(zzH(5, zza));
    }

    public final IObjectWrapper zoomByWithFocus(float f10, int i, int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zza.writeInt(i);
        zza.writeInt(i10);
        return m.b(zzH(6, zza));
    }

    public final IObjectWrapper zoomIn() throws RemoteException {
        return m.b(zzH(1, zza()));
    }

    public final IObjectWrapper zoomOut() throws RemoteException {
        return m.b(zzH(2, zza()));
    }

    public final IObjectWrapper zoomTo(float f10) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f10);
        return m.b(zzH(4, zza));
    }
}
