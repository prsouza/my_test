package com.google.android.gms.internal.measurement;

import b9.m;
import java.util.List;

public final class zzbc extends zzaw {
    public zzbc() {
        this.zza.add(zzbl.AND);
        this.zza.add(zzbl.NOT);
        this.zza.add(zzbl.OR);
    }

    public final zzap zza(String str, zzg zzg, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 1) {
            zzap zzb = zzg.zzb((zzap) m.a(zzbl.AND, 2, list, 0));
            if (!zzb.zzg().booleanValue()) {
                return zzb;
            }
            return zzg.zzb((zzap) list.get(1));
        } else if (ordinal == 47) {
            return new zzaf(Boolean.valueOf(!zzg.zzb((zzap) m.a(zzbl.NOT, 1, list, 0)).zzg().booleanValue()));
        } else {
            if (ordinal != 50) {
                return super.zzb(str);
            }
            zzap zzb2 = zzg.zzb((zzap) m.a(zzbl.OR, 2, list, 0));
            if (zzb2.zzg().booleanValue()) {
                return zzb2;
            }
            return zzg.zzb((zzap) list.get(1));
        }
    }
}
