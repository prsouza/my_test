package com.google.android.gms.measurement.internal;

final class zzjl extends zzao {
    public final /* synthetic */ zzkb zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzjl(zzkb zzkb, zzhd zzhd) {
        super(zzhd);
        this.zza = zzkb;
    }

    public final void zzc() {
        zzkb zzkb = this.zza;
        zzkb.zzg();
        if (zzkb.zzL()) {
            zzkb.zzs.zzaz().zzj().zza("Inactivity, disconnecting from the service");
            zzkb.zzs();
        }
    }
}
