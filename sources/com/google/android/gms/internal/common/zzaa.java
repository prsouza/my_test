package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Objects;

class zzaa<E> extends zzab<E> {
    public Object[] zza = new Object[4];
    public int zzb = 0;
    public boolean zzc;

    public zzaa(int i) {
    }

    private final void zzb(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            int i10 = length + (length >> 1) + 1;
            if (i10 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i10 = highestOneBit + highestOneBit;
            }
            if (i10 < 0) {
                i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(objArr, i10);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzaa<E> zza(E e10) {
        Objects.requireNonNull(e10);
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = e10;
        return this;
    }
}
