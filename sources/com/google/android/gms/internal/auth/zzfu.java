package com.google.android.gms.internal.auth;

import java.io.IOException;

final class zzfu<T> implements zzgb<T> {
    private final zzfq zza;
    private final zzgp<?, ?> zzb;
    private final zzeh<?> zzc;

    private zzfu(zzgp<?, ?> zzgp, zzeh<?> zzeh, zzfq zzfq) {
        this.zzb = zzgp;
        zzeh.zzc(zzfq);
        this.zzc = zzeh;
        this.zza = zzfq;
    }

    public static <T> zzfu<T> zzb(zzgp<?, ?> zzgp, zzeh<?> zzeh, zzfq zzfq) {
        return new zzfu<>(zzgp, zzeh, zzfq);
    }

    public final int zza(T t10) {
        return this.zzb.zza(t10).hashCode();
    }

    public final T zzd() {
        return ((zzeo) ((zzeq) this.zza).zzj(5, (Object) null, (Object) null)).zzg();
    }

    public final void zze(T t10) {
        this.zzb.zze(t10);
        this.zzc.zzb(t10);
    }

    public final void zzf(T t10, T t11) {
        zzgd.zzf(this.zzb, t10, t11);
    }

    public final void zzg(T t10, byte[] bArr, int i, int i10, zzdp zzdp) throws IOException {
        zzeq zzeq = (zzeq) t10;
        if (zzeq.zzc == zzgq.zza()) {
            zzeq.zzc = zzgq.zzc();
        }
        zzep zzep = (zzep) t10;
        throw null;
    }

    public final boolean zzh(T t10, T t11) {
        return this.zzb.zza(t10).equals(this.zzb.zza(t11));
    }

    public final boolean zzi(T t10) {
        this.zzc.zza(t10);
        throw null;
    }
}
