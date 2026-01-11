package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzeb extends zzdt {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ zzbz zzb;
    public final /* synthetic */ zzed zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzeb(zzed zzed, Activity activity, zzbz zzbz) {
        super(zzed.zza, true);
        this.zzc = zzed;
        this.zza = activity;
        this.zzb = zzbz;
    }

    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zzc.zza.zzj)).onActivitySaveInstanceState(ObjectWrapper.wrap(this.zza), this.zzb, this.zzi);
    }
}
