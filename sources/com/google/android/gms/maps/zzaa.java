package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzc;

final class zzaa extends zzc {
    private final GoogleMap.CancelableCallback zza;

    public zzaa(GoogleMap.CancelableCallback cancelableCallback) {
        this.zza = cancelableCallback;
    }

    public final void zzb() {
        this.zza.onCancel();
    }

    public final void zzc() {
        this.zza.onFinish();
    }
}
