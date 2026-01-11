package com.google.android.gms.internal.auth;

final class zzfd extends zzfe {
    private zzfd() {
        super((zzfb) null);
    }

    public /* synthetic */ zzfd(zzfb zzfb) {
        super((zzfb) null);
    }

    public final void zza(Object obj, long j10) {
        ((zzeu) zzgz.zzf(obj, j10)).zzb();
    }

    public final <E> void zzb(Object obj, Object obj2, long j10) {
        zzeu zzeu = (zzeu) zzgz.zzf(obj, j10);
        zzeu zzeu2 = (zzeu) zzgz.zzf(obj2, j10);
        int size = zzeu.size();
        int size2 = zzeu2.size();
        if (size > 0 && size2 > 0) {
            if (!zzeu.zzc()) {
                zzeu = zzeu.zzd(size2 + size);
            }
            zzeu.addAll(zzeu2);
        }
        if (size > 0) {
            zzeu2 = zzeu;
        }
        zzgz.zzp(obj, j10, zzeu2);
    }
}
