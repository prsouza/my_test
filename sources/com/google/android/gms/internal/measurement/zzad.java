package com.google.android.gms.internal.measurement;

import b9.m;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzad implements Iterator {
    public final /* synthetic */ zzae zza;
    private int zzb = 0;

    public zzad(zzae zzae) {
        this.zza = zzae;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza.zzc();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.zzb < this.zza.zzc()) {
            zzae zzae = this.zza;
            int i = this.zzb;
            this.zzb = i + 1;
            return zzae.zze(i);
        }
        throw new NoSuchElementException(m.b("Out of bounds index: ", this.zzb));
    }
}
