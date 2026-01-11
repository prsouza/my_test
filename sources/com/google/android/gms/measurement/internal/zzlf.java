package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzgc;
import java.util.ArrayList;
import java.util.List;

final class zzlf {
    public zzgc zza;
    public List zzb;
    public List zzc;
    public long zzd;
    public final /* synthetic */ zzli zze;

    public /* synthetic */ zzlf(zzli zzli, zzle zzle) {
        this.zze = zzli;
    }

    private static final long zzb(zzfs zzfs) {
        return ((zzfs.zzd() / 1000) / 60) / 60;
    }

    public final boolean zza(long j10, zzfs zzfs) {
        Preconditions.checkNotNull(zzfs);
        if (this.zzc == null) {
            this.zzc = new ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new ArrayList();
        }
        if (this.zzc.size() > 0 && zzb((zzfs) this.zzc.get(0)) != zzb(zzfs)) {
            return false;
        }
        long zzbz = this.zzd + ((long) zzfs.zzbz());
        this.zze.zzg();
        if (zzbz >= ((long) Math.max(0, ((Integer) zzel.zzh.zza((Object) null)).intValue()))) {
            return false;
        }
        this.zzd = zzbz;
        this.zzc.add(zzfs);
        this.zzb.add(Long.valueOf(j10));
        int size = this.zzc.size();
        this.zze.zzg();
        if (size >= Math.max(1, ((Integer) zzel.zzi.zza((Object) null)).intValue())) {
            return false;
        }
        return true;
    }
}
