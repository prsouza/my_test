package com.google.android.gms.measurement.internal;

import android.support.v4.media.a;
import android.util.Log;

final class zzev implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ Object zzd;
    public final /* synthetic */ Object zze;
    public final /* synthetic */ zzey zzf;

    public zzev(zzey zzey, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzey;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    public final void run() {
        zzfn zzm = this.zzf.zzs.zzm();
        if (zzm.zzx()) {
            zzey zzey = this.zzf;
            if (zzey.zza == 0) {
                if (zzey.zzs.zzf().zzy()) {
                    zzey zzey2 = this.zzf;
                    zzey2.zzs.zzax();
                    zzey2.zza = 'C';
                } else {
                    zzey zzey3 = this.zzf;
                    zzey3.zzs.zzax();
                    zzey3.zza = 'c';
                }
            }
            zzey zzey4 = this.zzf;
            if (zzey4.zzb < 0) {
                zzey4.zzs.zzf().zzh();
                zzey4.zzb = 61000;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            zzey zzey5 = this.zzf;
            char zza2 = zzey5.zza;
            long zzb2 = zzey5.zzb;
            String zzo = zzey.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("2");
            sb2.append(charAt);
            sb2.append(zza2);
            sb2.append(zzb2);
            String e10 = a.e(sb2, ":", zzo);
            if (e10.length() > 1024) {
                e10 = this.zzb.substring(0, 1024);
            }
            zzfl zzfl = zzm.zzb;
            if (zzfl != null) {
                zzfl.zzb(e10, 1);
                return;
            }
            return;
        }
        Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
    }
}
