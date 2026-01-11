package com.google.android.gms.common.api.internal;

final class zzc implements Runnable {
    public final /* synthetic */ LifecycleCallback zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzd zzc;

    public zzc(zzd zzd, LifecycleCallback lifecycleCallback, String str) {
        this.zzc = zzd;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    public final void run() {
        zzd zzd = this.zzc;
        if (zzd.zzc > 0) {
            this.zza.onCreate(zzd.zzd != null ? zzd.zzd.getBundle(this.zzb) : null);
        }
        if (this.zzc.zzc >= 2) {
            this.zza.onStart();
        }
        if (this.zzc.zzc >= 3) {
            this.zza.onResume();
        }
        if (this.zzc.zzc >= 4) {
            this.zza.onStop();
        }
        if (this.zzc.zzc >= 5) {
            this.zza.onDestroy();
        }
    }
}
