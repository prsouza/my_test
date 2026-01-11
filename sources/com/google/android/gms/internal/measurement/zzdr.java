package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzdr extends zzdt {
    public final /* synthetic */ Long zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ Bundle zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ boolean zzf;
    public final /* synthetic */ zzee zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdr(zzee zzee, Long l10, String str, String str2, Bundle bundle, boolean z, boolean z10) {
        super(zzee, true);
        this.zzg = zzee;
        this.zza = l10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z;
        this.zzf = z10;
    }

    public final void zza() throws RemoteException {
        long j10;
        Long l10 = this.zza;
        if (l10 == null) {
            j10 = this.zzh;
        } else {
            j10 = l10.longValue();
        }
        ((zzcc) Preconditions.checkNotNull(this.zzg.zzj)).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j10);
    }
}
