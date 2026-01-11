package com.google.android.gms.internal.common;

import java.util.Objects;

final class zzai<E> extends zzag<E> {
    public static final zzag<Object> zza = new zzai(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzai(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    public final E get(int i) {
        zzs.zza(i, this.zzc, "index");
        E e10 = this.zzb[i];
        Objects.requireNonNull(e10);
        return e10;
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return 0;
    }

    public final boolean zzf() {
        return false;
    }

    public final Object[] zzg() {
        return this.zzb;
    }
}
