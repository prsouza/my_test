package com.google.android.gms.measurement.internal;

abstract class zzkw extends zzkv {
    private boolean zza;

    public zzkw(zzli zzli) {
        super(zzli);
        this.zzf.zzL();
    }

    public final void zzW() {
        if (!zzY()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzX() {
        if (!this.zza) {
            zzb();
            this.zzf.zzG();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean zzY() {
        return this.zza;
    }

    public abstract boolean zzb();
}
