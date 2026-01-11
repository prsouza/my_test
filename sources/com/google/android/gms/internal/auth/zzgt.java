package com.google.android.gms.internal.auth;

import java.util.Iterator;

final class zzgt implements Iterator<String> {
    public final Iterator<String> zza;
    public final /* synthetic */ zzgu zzb;

    public zzgt(zzgu zzgu) {
        this.zzb = zzgu;
        this.zza = zzgu.zza.iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
