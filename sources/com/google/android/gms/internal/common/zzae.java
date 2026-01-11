package com.google.android.gms.internal.common;

final class zzae<E> extends zzz<E> {
    private final zzag<E> zza;

    public zzae(zzag<E> zzag, int i) {
        super(zzag.size(), i);
        this.zza = zzag;
    }

    public final E zza(int i) {
        return this.zza.get(i);
    }
}
