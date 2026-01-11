package com.google.android.gms.internal.measurement;

import b9.m;
import java.util.List;

public final class zzbi extends zzaw {
    public zzbi() {
        this.zza.add(zzbl.ADD);
        this.zza.add(zzbl.DIVIDE);
        this.zza.add(zzbl.MODULUS);
        this.zza.add(zzbl.MULTIPLY);
        this.zza.add(zzbl.NEGATE);
        this.zza.add(zzbl.POST_DECREMENT);
        this.zza.add(zzbl.POST_INCREMENT);
        this.zza.add(zzbl.PRE_DECREMENT);
        this.zza.add(zzbl.PRE_INCREMENT);
        this.zza.add(zzbl.SUBTRACT);
    }

    public final zzap zza(String str, zzg zzg, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 0) {
            zzap zzb = zzg.zzb((zzap) m.a(zzbl, 2, list, 0));
            zzap zzb2 = zzg.zzb((zzap) list.get(1));
            if ((zzb instanceof zzal) || (zzb instanceof zzat) || (zzb2 instanceof zzal) || (zzb2 instanceof zzat)) {
                return new zzat(String.valueOf(zzb.zzi()).concat(String.valueOf(zzb2.zzi())));
            }
            return new zzah(Double.valueOf(zzb2.zzh().doubleValue() + zzb.zzh().doubleValue()));
        } else if (ordinal == 21) {
            return new zzah(Double.valueOf(zzg.zzb((zzap) m.a(zzbl.DIVIDE, 2, list, 0)).zzh().doubleValue() / zzg.zzb((zzap) list.get(1)).zzh().doubleValue()));
        } else {
            if (ordinal == 59) {
                zzap zzb3 = zzg.zzb((zzap) m.a(zzbl.SUBTRACT, 2, list, 0));
                zzah zzah = new zzah(Double.valueOf(-zzg.zzb((zzap) list.get(1)).zzh().doubleValue()));
                return new zzah(Double.valueOf(zzah.zzh().doubleValue() + zzb3.zzh().doubleValue()));
            } else if (ordinal == 52 || ordinal == 53) {
                zzh.zzh(str, 2, list);
                zzap zzb4 = zzg.zzb((zzap) list.get(0));
                zzg.zzb((zzap) list.get(1));
                return zzb4;
            } else if (ordinal == 55 || ordinal == 56) {
                zzh.zzh(str, 1, list);
                return zzg.zzb((zzap) list.get(0));
            } else {
                switch (ordinal) {
                    case 44:
                        return new zzah(Double.valueOf(zzg.zzb((zzap) m.a(zzbl.MODULUS, 2, list, 0)).zzh().doubleValue() % zzg.zzb((zzap) list.get(1)).zzh().doubleValue()));
                    case 45:
                        return new zzah(Double.valueOf(zzg.zzb((zzap) m.a(zzbl.MULTIPLY, 2, list, 0)).zzh().doubleValue() * zzg.zzb((zzap) list.get(1)).zzh().doubleValue()));
                    case 46:
                        return new zzah(Double.valueOf(-zzg.zzb((zzap) m.a(zzbl.NEGATE, 1, list, 0)).zzh().doubleValue()));
                    default:
                        return super.zzb(str);
                }
            }
        }
    }
}
