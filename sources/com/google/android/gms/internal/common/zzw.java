package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;

abstract class zzw extends zzj<String> {
    public final CharSequence zzb;
    public final zzo zzc;
    public final boolean zzd;
    public int zze = 0;
    public int zzf;

    public zzw(zzx zzx, CharSequence charSequence) {
        this.zzc = zzx.zza;
        this.zzd = zzx.zzb;
        this.zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = charSequence;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        int zzd2;
        int i;
        int i10 = this.zze;
        while (true) {
            int i11 = this.zze;
            if (i11 != -1) {
                zzd2 = zzd(i11);
                if (zzd2 == -1) {
                    zzd2 = this.zzb.length();
                    this.zze = -1;
                    i = -1;
                } else {
                    i = zzc(zzd2);
                    this.zze = i;
                }
                if (i == i10) {
                    int i12 = i + 1;
                    this.zze = i12;
                    if (i12 > this.zzb.length()) {
                        this.zze = -1;
                    }
                } else {
                    if (i10 < zzd2) {
                        this.zzb.charAt(i10);
                    }
                    if (i10 < zzd2) {
                        this.zzb.charAt(zzd2 - 1);
                    }
                    if (!this.zzd || i10 != zzd2) {
                        int i13 = this.zzf;
                    } else {
                        i10 = this.zze;
                    }
                }
            } else {
                zzb();
                return null;
            }
        }
        int i132 = this.zzf;
        if (i132 == 1) {
            zzd2 = this.zzb.length();
            this.zze = -1;
            if (zzd2 > i10) {
                this.zzb.charAt(zzd2 - 1);
            }
        } else {
            this.zzf = i132 - 1;
        }
        return this.zzb.subSequence(i10, zzd2).toString();
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
