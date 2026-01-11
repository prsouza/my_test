package com.google.android.gms.internal.common;

final class zzaf extends zzag {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzag zzc;

    public zzaf(zzag zzag, int i, int i10) {
        this.zzc = zzag;
        this.zza = i;
        this.zzb = i10;
    }

    public final Object get(int i) {
        zzs.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final boolean zzf() {
        return true;
    }

    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    /* renamed from: zzh */
    public final zzag subList(int i, int i10) {
        zzs.zzc(i, i10, this.zzb);
        zzag zzag = this.zzc;
        int i11 = this.zza;
        return zzag.subList(i + i11, i10 + i11);
    }
}
