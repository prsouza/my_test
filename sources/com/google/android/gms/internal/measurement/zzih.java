package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.d;
import java.util.Objects;

final class zzih implements zzif {
    public volatile zzif zza;
    public volatile boolean zzb;
    public Object zzc;

    public zzih(zzif zzif) {
        Objects.requireNonNull(zzif);
        this.zza = zzif;
    }

    public final String toString() {
        Object obj = this.zza;
        if (obj == null) {
            String valueOf = String.valueOf(this.zzc);
            obj = d.b(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String obj2 = obj.toString();
        return d.b(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }

    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzif zzif = this.zza;
                    Objects.requireNonNull(zzif);
                    Object zza2 = zzif.zza();
                    this.zzc = zza2;
                    this.zzb = true;
                    this.zza = null;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
