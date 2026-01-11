package com.google.android.gms.internal.maps;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.List;

public interface zzl extends IInterface {
    boolean zzA() throws RemoteException;

    double zzd() throws RemoteException;

    float zze() throws RemoteException;

    float zzf() throws RemoteException;

    int zzg() throws RemoteException;

    int zzh() throws RemoteException;

    int zzi() throws RemoteException;

    IObjectWrapper zzj() throws RemoteException;

    LatLng zzk() throws RemoteException;

    String zzl() throws RemoteException;

    List<PatternItem> zzm() throws RemoteException;

    void zzn() throws RemoteException;

    void zzo(LatLng latLng) throws RemoteException;

    void zzp(boolean z) throws RemoteException;

    void zzq(int i) throws RemoteException;

    void zzr(double d10) throws RemoteException;

    void zzs(int i) throws RemoteException;

    void zzt(List<PatternItem> list) throws RemoteException;

    void zzu(float f10) throws RemoteException;

    void zzv(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzw(boolean z) throws RemoteException;

    void zzx(float f10) throws RemoteException;

    boolean zzy(zzl zzl) throws RemoteException;

    boolean zzz() throws RemoteException;
}
