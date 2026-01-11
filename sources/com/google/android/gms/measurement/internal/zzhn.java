package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final /* synthetic */ class zzhn implements Runnable {
    public final /* synthetic */ zzin zza;
    public final /* synthetic */ Bundle zzb;

    public /* synthetic */ zzhn(zzin zzin, Bundle bundle) {
        this.zza = zzin;
        this.zzb = bundle;
    }

    public final void run() {
        this.zza.zzD(this.zzb);
    }
}
