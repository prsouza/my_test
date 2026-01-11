package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzoi;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s.a;

final class zzt {
    public final /* synthetic */ zzz zza;
    private String zzb;
    private boolean zzc;
    private zzgh zzd;
    /* access modifiers changed from: private */
    public BitSet zze;
    private BitSet zzf;
    private Map zzg;
    private Map zzh;

    public /* synthetic */ zzt(zzz zzz, String str, zzs zzs) {
        this.zza = zzz;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new a();
        this.zzh = new a();
    }

    public final zzfo zza(int i) {
        ArrayList arrayList;
        List list;
        zzfn zzb2 = zzfo.zzb();
        zzb2.zza(i);
        zzb2.zzc(this.zzc);
        zzgh zzgh = this.zzd;
        if (zzgh != null) {
            zzb2.zzd(zzgh);
        }
        zzgg zzf2 = zzgh.zzf();
        zzf2.zzb(zzlk.zzr(this.zze));
        zzf2.zzd(zzlk.zzr(this.zzf));
        Map map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.zzg.keySet()) {
                int intValue2 = intValue.intValue();
                Long l10 = (Long) this.zzg.get(Integer.valueOf(intValue2));
                if (l10 != null) {
                    zzfp zzc2 = zzfq.zzc();
                    zzc2.zzb(intValue2);
                    zzc2.zza(l10.longValue());
                    arrayList2.add((zzfq) zzc2.zzaE());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzf2.zza(arrayList);
        }
        Map map2 = this.zzh;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.zzh.keySet()) {
                zzgi zzd2 = zzgj.zzd();
                zzd2.zzb(num.intValue());
                List list2 = (List) this.zzh.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzd2.zza(list2);
                }
                arrayList3.add((zzgj) zzd2.zzaE());
            }
            list = arrayList3;
        }
        zzf2.zzc(list);
        zzb2.zzb(zzf2);
        return (zzfo) zzb2.zzaE();
    }

    public final void zzc(zzx zzx) {
        int zza2 = zzx.zza();
        Boolean bool = zzx.zzd;
        if (bool != null) {
            this.zzf.set(zza2, bool.booleanValue());
        }
        Boolean bool2 = zzx.zze;
        if (bool2 != null) {
            this.zze.set(zza2, bool2.booleanValue());
        }
        if (zzx.zzf != null) {
            Map map = this.zzg;
            Integer valueOf = Integer.valueOf(zza2);
            Long l10 = (Long) map.get(valueOf);
            long longValue = zzx.zzf.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.zzg.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (zzx.zzg != null) {
            Map map2 = this.zzh;
            Integer valueOf2 = Integer.valueOf(zza2);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.zzh.put(valueOf2, list);
            }
            if (zzx.zzc()) {
                list.clear();
            }
            zzoi.zzc();
            zzaf zzf2 = this.zza.zzs.zzf();
            String str = this.zzb;
            zzek zzek = zzel.zzX;
            if (zzf2.zzs(str, zzek) && zzx.zzb()) {
                list.clear();
            }
            zzoi.zzc();
            if (this.zza.zzs.zzf().zzs(this.zzb, zzek)) {
                Long valueOf3 = Long.valueOf(zzx.zzg.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(zzx.zzg.longValue() / 1000));
        }
    }

    public /* synthetic */ zzt(zzz zzz, String str, zzgh zzgh, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzs zzs) {
        this.zza = zzz;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zzgh;
    }
}
