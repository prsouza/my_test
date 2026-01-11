package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zzis extends zziu {
    public final /* synthetic */ zzjb zza;
    private int zzb = 0;
    private final int zzc;

    public zzis(zzjb zzjb) {
        this.zza = zzjb;
        this.zzc = zzjb.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
