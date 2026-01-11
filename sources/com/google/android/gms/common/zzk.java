package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class zzk extends zzi {
    private static final WeakReference<byte[]> zza = new WeakReference<>((Object) null);
    private WeakReference<byte[]> zzb = zza;

    public zzk(byte[] bArr) {
        super(bArr);
    }

    public abstract byte[] zzb();

    public final byte[] zzf() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.zzb.get();
            if (bArr == null) {
                bArr = zzb();
                this.zzb = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
