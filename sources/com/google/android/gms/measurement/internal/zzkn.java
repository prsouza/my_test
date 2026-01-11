package com.google.android.gms.measurement.internal;

final class zzkn {
    public final /* synthetic */ zzkr zza;
    private zzkm zzb;

    public zzkn(zzkr zzkr) {
        this.zza = zzkr;
    }

    public final void zza(long j10) {
        this.zzb = new zzkm(this, this.zza.zzs.zzaw().currentTimeMillis(), j10);
        this.zza.zzd.postDelayed(this.zzb, 2000);
    }

    public final void zzb() {
        this.zza.zzg();
        zzkm zzkm = this.zzb;
        if (zzkm != null) {
            this.zza.zzd.removeCallbacks(zzkm);
        }
        this.zza.zzs.zzm().zzl.zza(false);
    }
}
