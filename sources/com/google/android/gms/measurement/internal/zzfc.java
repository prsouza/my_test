package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

final class zzfc implements Runnable {
    private final zzfa zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    public /* synthetic */ zzfc(String str, zzfa zzfa, int i, Throwable th2, byte[] bArr, Map map, zzfb zzfb) {
        Preconditions.checkNotNull(zzfa);
        this.zza = zzfa;
        this.zzb = i;
        this.zzc = th2;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
