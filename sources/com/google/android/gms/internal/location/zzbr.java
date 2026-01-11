package com.google.android.gms.internal.location;

final class zzbr extends zzbs {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzbs zzc;

    public zzbr(zzbs zzbs, int i, int i10) {
        this.zzc = zzbs;
        this.zza = i;
        this.zzb = i10;
    }

    public final Object get(int i) {
        zzbm.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final boolean zzf() {
        return true;
    }

    /* renamed from: zzh */
    public final zzbs subList(int i, int i10) {
        zzbm.zzc(i, i10, this.zzb);
        zzbs zzbs = this.zzc;
        int i11 = this.zza;
        return zzbs.subList(i + i11, i10 + i11);
    }
}
