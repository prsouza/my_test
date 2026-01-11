package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.zzbq;

final class zzad extends zzae {
    public final /* synthetic */ zzbq zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzad(zzaf zzaf, GoogleApiClient googleApiClient, zzbq zzbq) {
        super(googleApiClient);
        this.zza = zzbq;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).zzw(this.zza, this);
    }
}
