package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

final class zzo extends zzp<Void> {
    public zzo(int i, int i10, Bundle bundle) {
        super(i, 2, bundle);
    }

    public final void zza(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zzd(null);
        } else {
            zzc(new zzq(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    public final boolean zzb() {
        return true;
    }
}
