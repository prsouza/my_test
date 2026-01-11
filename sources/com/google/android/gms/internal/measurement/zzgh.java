package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgh extends zzkc implements zzlk {
    /* access modifiers changed from: private */
    public static final zzgh zza;
    /* access modifiers changed from: private */
    public zzki zze = zzkc.zzbE();
    /* access modifiers changed from: private */
    public zzki zzf = zzkc.zzbE();
    private zzkj zzg = zzkc.zzbG();
    private zzkj zzh = zzkc.zzbG();

    static {
        zzgh zzgh = new zzgh();
        zza = zzgh;
        zzkc.zzbM(zzgh.class, zzgh);
    }

    private zzgh() {
    }

    public static zzgg zzf() {
        return (zzgg) zza.zzbA();
    }

    public static zzgh zzh() {
        return zza;
    }

    public static /* synthetic */ void zzo(zzgh zzgh, Iterable iterable) {
        zzki zzki = zzgh.zze;
        if (!zzki.zzc()) {
            zzgh.zze = zzkc.zzbF(zzki);
        }
        zzil.zzbw(iterable, zzgh.zze);
    }

    public static /* synthetic */ void zzq(zzgh zzgh, Iterable iterable) {
        zzki zzki = zzgh.zzf;
        if (!zzki.zzc()) {
            zzgh.zzf = zzkc.zzbF(zzki);
        }
        zzil.zzbw(iterable, zzgh.zzf);
    }

    public static /* synthetic */ void zzs(zzgh zzgh, Iterable iterable) {
        zzgh.zzw();
        zzil.zzbw(iterable, zzgh.zzg);
    }

    public static /* synthetic */ void zzt(zzgh zzgh, int i) {
        zzgh.zzw();
        zzgh.zzg.remove(i);
    }

    public static /* synthetic */ void zzu(zzgh zzgh, Iterable iterable) {
        zzgh.zzx();
        zzil.zzbw(iterable, zzgh.zzh);
    }

    public static /* synthetic */ void zzv(zzgh zzgh, int i) {
        zzgh.zzx();
        zzgh.zzh.remove(i);
    }

    private final void zzw() {
        zzkj zzkj = this.zzg;
        if (!zzkj.zzc()) {
            this.zzg = zzkc.zzbH(zzkj);
        }
    }

    private final void zzx() {
        zzkj zzkj = this.zzh;
        if (!zzkj.zzc()) {
            this.zzh = zzkc.zzbH(zzkj);
        }
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzfq zze(int i) {
        return (zzfq) this.zzg.get(i);
    }

    public final zzgj zzi(int i) {
        return (zzgj) this.zzh.get(i);
    }

    public final List zzj() {
        return this.zzg;
    }

    public final List zzk() {
        return this.zzf;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzkc.zzbL(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zzfq.class, "zzh", zzgj.class});
        } else if (i10 == 3) {
            return new zzgh();
        } else {
            if (i10 == 4) {
                return new zzgg((zzfj) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final List zzm() {
        return this.zzh;
    }

    public final List zzn() {
        return this.zze;
    }
}
