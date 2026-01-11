package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzr;
import java.util.List;

final class zzfx implements zzr {
    public final /* synthetic */ zzfz zza;

    public zzfx(zzfz zzfz) {
        this.zza = zzfz;
    }

    public final void zza(int i, String str, List list, boolean z, boolean z10) {
        zzew zzew;
        int i10 = i - 1;
        if (i10 == 0) {
            zzew = this.zza.zzs.zzaz().zzc();
        } else if (i10 != 1) {
            if (i10 == 3) {
                zzew = this.zza.zzs.zzaz().zzj();
            } else if (i10 != 4) {
                zzew = this.zza.zzs.zzaz().zzi();
            } else if (z) {
                zzew = this.zza.zzs.zzaz().zzm();
            } else if (!z10) {
                zzew = this.zza.zzs.zzaz().zzl();
            } else {
                zzew = this.zza.zzs.zzaz().zzk();
            }
        } else if (z) {
            zzew = this.zza.zzs.zzaz().zzh();
        } else if (!z10) {
            zzew = this.zza.zzs.zzaz().zze();
        } else {
            zzew = this.zza.zzs.zzaz().zzd();
        }
        int size = list.size();
        if (size == 1) {
            zzew.zzb(str, list.get(0));
        } else if (size == 2) {
            zzew.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzew.zza(str);
        } else {
            zzew.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
