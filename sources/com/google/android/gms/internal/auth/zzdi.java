package com.google.android.gms.internal.auth;

import androidx.appcompat.widget.d;
import java.util.Objects;

final class zzdi<T> implements zzdg<T> {
    public volatile zzdg<T> zza;
    public volatile boolean zzb;
    public T zzc;

    public zzdi(zzdg<T> zzdg) {
        Objects.requireNonNull(zzdg);
        this.zza = zzdg;
    }

    public final String toString() {
        Object obj = this.zza;
        if (obj == null) {
            String valueOf = String.valueOf(this.zzc);
            obj = d.b(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String valueOf2 = String.valueOf(obj);
        return d.b(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    public final T zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzdg<T> zzdg = this.zza;
                    Objects.requireNonNull(zzdg);
                    T zza2 = zzdg.zza();
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
