package com.google.android.gms.internal.location;

import java.util.NoSuchElementException;

abstract class zzbo<E> extends zzbv<E> {
    private final int zza;
    private int zzb;

    public zzbo(int i, int i10) {
        zzbm.zzb(i10, i, "index");
        this.zza = i;
        this.zzb = i10;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.zzb;
            this.zzb = i + 1;
            return zza(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.zzb;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.zzb - 1;
            this.zzb = i;
            return zza(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract E zza(int i);
}
