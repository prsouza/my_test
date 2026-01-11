package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;

abstract class zzz<E> extends zzak<E> {
    private final int zza;
    private int zzb;

    public zzz(int i, int i10) {
        zzs.zzb(i10, i, "index");
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
