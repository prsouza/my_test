package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class zzv extends zzw {
    private final Callable<String> zzd;

    public /* synthetic */ zzv(Callable callable, zzu zzu) {
        super(false, (String) null, (Throwable) null);
        this.zzd = callable;
    }

    public final String zza() {
        try {
            return this.zzd.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
