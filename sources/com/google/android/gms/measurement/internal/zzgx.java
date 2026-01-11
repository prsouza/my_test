package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class zzgx implements Callable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzha zzb;

    public zzgx(zzha zzha, String str) {
        this.zzb = zzha;
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.zzb.zza.zzA();
        return this.zzb.zza.zzi().zzu(this.zza);
    }
}
