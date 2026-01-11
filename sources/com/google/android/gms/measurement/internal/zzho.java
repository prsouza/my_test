package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final /* synthetic */ class zzho implements Runnable {
    public final /* synthetic */ zzin zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzho(zzin zzin, Bundle bundle, long j10) {
        this.zza = zzin;
        this.zzb = bundle;
        this.zzc = j10;
    }

    public final void run() {
        this.zza.zzC(this.zzb, this.zzc);
    }
}
