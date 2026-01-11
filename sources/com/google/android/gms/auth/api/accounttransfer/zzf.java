package com.google.android.gms.auth.api.accounttransfer;

final class zzf extends zzj<DeviceMetaData> {
    public final /* synthetic */ zzg zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzf(zzg zzg, zzk zzk) {
        super(zzk);
        this.zza = zzg;
    }

    public final void zzc(DeviceMetaData deviceMetaData) {
        this.zza.zzb.setResult(deviceMetaData);
    }
}
