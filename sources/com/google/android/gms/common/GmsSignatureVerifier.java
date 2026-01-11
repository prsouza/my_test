package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;

@ShowFirstParty
@KeepForSdk
public class GmsSignatureVerifier {
    private static final zzz zza;
    private static final zzz zzb;

    static {
        zzx zzx = new zzx();
        zzx.zzd("com.google.android.gms");
        zzx.zza(204200000);
        zzk zzk = zzm.zzd;
        zzx.zzc(zzag.zzn(zzk.zzf(), zzm.zzb.zzf()));
        zzk zzk2 = zzm.zzc;
        zzx.zzb(zzag.zzn(zzk2.zzf(), zzm.zza.zzf()));
        zza = zzx.zze();
        zzx zzx2 = new zzx();
        zzx2.zzd("com.android.vending");
        zzx2.zza(82240000);
        zzx2.zzc(zzag.zzm(zzk.zzf()));
        zzx2.zzb(zzag.zzm(zzk2.zzf()));
        zzb = zzx2.zze();
    }
}
