package com.google.android.gms.internal.auth;

import androidx.appcompat.widget.d;

final class zzdf<T> extends zzde<T> {
    private final T zza;

    public zzdf(T t10) {
        this.zza = t10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdf) {
            return this.zza.equals(((zzdf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return d.b(new StringBuilder(valueOf.length() + 13), "Optional.of(", valueOf, ")");
    }

    public final T zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return true;
    }
}
