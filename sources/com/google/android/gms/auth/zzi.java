package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zze;
import java.io.IOException;
import java.util.List;

final class zzi implements zzk<List<AccountChangeEvent>> {
    public final /* synthetic */ AccountChangeEventsRequest zza;

    public zzi(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = accountChangeEventsRequest;
    }

    public final /* bridge */ /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        AccountChangeEventsResponse zzh = zze.zzb(iBinder).zzh(this.zza);
        Object unused = zzl.zzi(zzh);
        return zzh.getEvents();
    }
}
