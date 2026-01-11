package com.google.android.gms.measurement.internal;

public final /* synthetic */ class zzhp implements Runnable {
    public final /* synthetic */ zzin zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzhp(zzin zzin, String str) {
        this.zza = zzin;
        this.zzb = str;
    }

    public final void run() {
        zzin zzin = this.zza;
        if (zzin.zzs.zzh().zzp(this.zzb)) {
            zzin.zzs.zzh().zzo();
        }
    }
}
