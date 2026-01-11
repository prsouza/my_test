package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzhd extends ContentObserver {
    public final /* synthetic */ zzhe zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzhd(zzhe zzhe, Handler handler) {
        super((Handler) null);
        this.zza = zzhe;
    }

    public final void onChange(boolean z) {
        this.zza.zzf();
    }
}
