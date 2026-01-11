package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.d;
import java.io.Serializable;
import java.util.Objects;

final class zzig implements Serializable, zzif {
    public final zzif zza;
    public volatile transient boolean zzb;
    public transient Object zzc;

    public zzig(zzif zzif) {
        Objects.requireNonNull(zzif);
        this.zza = zzif;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            String valueOf = String.valueOf(this.zzc);
            obj = d.b(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.zza;
        }
        String valueOf2 = String.valueOf(obj);
        return d.b(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object zza2 = this.zza.zza();
                    this.zzc = zza2;
                    this.zzb = true;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
