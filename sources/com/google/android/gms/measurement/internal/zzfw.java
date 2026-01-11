package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import s.e;

final class zzfw extends e {
    public final /* synthetic */ zzfz zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfw(zzfz zzfz, int i) {
        super(20);
        this.zza = zzfz;
    }

    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfz.zzd(this.zza, str);
    }
}
