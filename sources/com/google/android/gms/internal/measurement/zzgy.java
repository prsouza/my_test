package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzgy extends ContentObserver {
    public zzgy(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        zzgz.zzk.set(true);
    }
}
