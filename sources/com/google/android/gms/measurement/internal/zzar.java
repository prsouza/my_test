package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzar {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final Long zzh;
    public final Long zzi;
    public final Long zzj;
    public final Boolean zzk;

    public zzar(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        long j15 = j10;
        long j16 = j11;
        long j17 = j12;
        long j18 = j14;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        boolean z = true;
        Preconditions.checkArgument(j15 >= 0);
        Preconditions.checkArgument(j16 >= 0);
        Preconditions.checkArgument(j17 >= 0);
        Preconditions.checkArgument(j18 < 0 ? false : z);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j15;
        this.zzd = j16;
        this.zze = j17;
        this.zzf = j13;
        this.zzg = j18;
        this.zzh = l10;
        this.zzi = l11;
        this.zzj = l12;
        this.zzk = bool;
    }

    public final zzar zza(Long l10, Long l11, Boolean bool) {
        return new zzar(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final zzar zzb(long j10, long j11) {
        return new zzar(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j10, Long.valueOf(j11), this.zzi, this.zzj, this.zzk);
    }

    public final zzar zzc(long j10) {
        return new zzar(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j10, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
