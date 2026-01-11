package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzcv extends zzdt {
    public final /* synthetic */ zzee zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcv(zzee zzee) {
        super(zzee, true);
        this.zza = zzee;
    }

    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zza.zzj)).resetAnalyticsData(this.zzh);
    }
}
