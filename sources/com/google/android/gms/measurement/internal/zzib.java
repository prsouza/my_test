package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class zzib implements zzlo {
    public final /* synthetic */ zzin zza;

    public zzib(zzin zzin) {
        this.zza = zzin;
    }

    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzG("auto", "_err", bundle, str);
        } else {
            this.zza.zzE("auto", "_err", bundle);
        }
    }
}
