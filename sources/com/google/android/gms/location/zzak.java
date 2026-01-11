package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzak extends zzap {
    public final /* synthetic */ ListenerHolder zza;
    public final /* synthetic */ FusedLocationProviderClient zzb;

    public zzak(FusedLocationProviderClient fusedLocationProviderClient, ListenerHolder listenerHolder) {
        this.zzb = fusedLocationProviderClient;
        this.zza = listenerHolder;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        zzaz zzaz = (zzaz) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (zza()) {
            zzal zzal = new zzal(this.zzb, taskCompletionSource);
            try {
                ListenerHolder.ListenerKey listenerKey = this.zza.getListenerKey();
                if (listenerKey != null) {
                    zzaz.zzH(listenerKey, zzal);
                }
            } catch (RuntimeException e10) {
                taskCompletionSource.trySetException(e10);
            }
        }
    }
}
