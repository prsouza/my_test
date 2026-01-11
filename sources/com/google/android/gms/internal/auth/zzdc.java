package com.google.android.gms.internal.auth;

final class zzdc<T> extends zzde<T> {
    public static final zzdc<Object> zza = new zzdc<>();

    private zzdc() {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    public final T zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean zzb() {
        return false;
    }
}
