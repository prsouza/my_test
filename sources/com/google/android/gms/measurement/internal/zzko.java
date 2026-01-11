package com.google.android.gms.measurement.internal;

final class zzko extends zzao {
    public final /* synthetic */ zzkp zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzko(zzkp zzkp, zzhd zzhd) {
        super(zzhd);
        this.zza = zzkp;
    }

    public final void zzc() {
        zzkp zzkp = this.zza;
        zzkp.zzc.zzg();
        zzkp.zzd(false, false, zzkp.zzc.zzs.zzaw().elapsedRealtime());
        zzkp.zzc.zzs.zzd().zzf(zzkp.zzc.zzs.zzaw().elapsedRealtime());
    }
}
