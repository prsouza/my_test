package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class zzld implements zzlo {
    public final /* synthetic */ zzli zza;

    public zzld(zzli zzli) {
        this.zza = zzli;
    }

    public final void zza(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            zzli zzli = this.zza;
            if (zzli.zzn != null) {
                zzli.zzn.zzaz().zzd().zzb("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.zza.zzaA().zzp(new zzlc(this, str, "_err", bundle));
    }
}
