package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzdh extends zzdt {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzbz zzb;
    public final /* synthetic */ zzee zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdh(zzee zzee, Bundle bundle, zzbz zzbz) {
        super(zzee, true);
        this.zzc = zzee;
        this.zza = bundle;
        this.zzb = zzbz;
    }

    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zzc.zzj)).performAction(this.zza, this.zzb, this.zzh);
    }

    public final void zzb() {
        this.zzb.zzd((Bundle) null);
    }
}
