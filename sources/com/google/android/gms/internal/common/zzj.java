package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zzj<T> implements Iterator<T> {
    private T zza;
    private int zzb = 2;

    public final boolean hasNext() {
        int i = this.zzb;
        if (i != 4) {
            int i10 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i10 == 0) {
                return true;
            } else {
                if (i10 != 2) {
                    this.zzb = 4;
                    this.zza = zza();
                    if (this.zzb != 3) {
                        this.zzb = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final T next() {
        if (hasNext()) {
            this.zzb = 2;
            T t10 = this.zza;
            this.zza = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract T zza();

    public final T zzb() {
        this.zzb = 3;
        return null;
    }
}
