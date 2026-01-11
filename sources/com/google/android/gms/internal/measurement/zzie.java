package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.d;

final class zzie extends zzid {
    private final Object zza;

    public zzie(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzie) {
            return this.zza.equals(((zzie) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return d.b(new StringBuilder(obj.length() + 13), "Optional.of(", obj, ")");
    }

    public final Object zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return true;
    }
}
