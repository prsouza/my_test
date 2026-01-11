package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;

final class zzed extends zzee {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public /* synthetic */ zzed(byte[] bArr, int i, int i10, boolean z, zzec zzec) {
        super((zzec) null);
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i) throws zzew {
        int i10 = this.zze;
        this.zze = 0;
        int i11 = this.zzc + this.zzd;
        this.zzc = i11;
        if (i11 > 0) {
            this.zzd = i11;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i10;
    }
}
