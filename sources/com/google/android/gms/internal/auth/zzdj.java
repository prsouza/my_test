package com.google.android.gms.internal.auth;

import androidx.appcompat.widget.d;
import java.io.Serializable;
import java.util.Arrays;

final class zzdj<T> implements Serializable, zzdg {
    public final T zza;

    public zzdj(T t10) {
        this.zza = t10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdj)) {
            return false;
        }
        T t10 = this.zza;
        T t11 = ((zzdj) obj).zza;
        if (t10 == t11 || t10.equals(t11)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return d.b(new StringBuilder(valueOf.length() + 22), "Suppliers.ofInstance(", valueOf, ")");
    }

    public final T zza() {
        return this.zza;
    }
}
