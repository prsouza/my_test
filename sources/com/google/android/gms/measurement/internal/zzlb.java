package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

final class zzlb implements Callable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzli zzb;

    public zzlb(zzli zzli, zzp zzp) {
        this.zzb = zzli;
        this.zza = zzp;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzah zzh = this.zzb.zzh((String) Preconditions.checkNotNull(this.zza.zza));
        zzag zzag = zzag.ANALYTICS_STORAGE;
        if (zzh.zzi(zzag) && zzah.zzb(this.zza.zzv).zzi(zzag)) {
            return this.zzb.zzd(this.zza).zzu();
        }
        this.zzb.zzaz().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
