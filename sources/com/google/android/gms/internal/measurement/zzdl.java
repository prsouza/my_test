package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzdl extends zzdt {
    public final /* synthetic */ zzbz zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzee zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdl(zzee zzee, zzbz zzbz, int i) {
        super(zzee, true);
        this.zzc = zzee;
        this.zza = zzbz;
        this.zzb = i;
    }

    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zzc.zzj)).getTestFlag(this.zza, this.zzb);
    }

    public final void zzb() {
        this.zza.zzd((Bundle) null);
    }
}
