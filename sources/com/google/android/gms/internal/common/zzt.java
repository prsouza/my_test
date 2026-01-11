package com.google.android.gms.internal.common;

final class zzt extends zzw {
    public final /* synthetic */ zzu zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzt(zzu zzu, zzx zzx, CharSequence charSequence) {
        super(zzx, charSequence);
        this.zza = zzu;
    }

    public final int zzc(int i) {
        return i + 1;
    }

    public final int zzd(int i) {
        zzo zzo = this.zza.zza;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzs.zzb(i, length, "index");
        while (i < length) {
            if (zzo.zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
