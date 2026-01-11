package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzcs extends zzdt {
    public final /* synthetic */ Boolean zza;
    public final /* synthetic */ zzee zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcs(zzee zzee, Boolean bool) {
        super(zzee, true);
        this.zzb = zzee;
        this.zza = bool;
    }

    public final void zza() throws RemoteException {
        if (this.zza != null) {
            ((zzcc) Preconditions.checkNotNull(this.zzb.zzj)).setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
        } else {
            ((zzcc) Preconditions.checkNotNull(this.zzb.zzj)).clearMeasurementEnabled(this.zzh);
        }
    }
}
