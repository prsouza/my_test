package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzad implements zzae {
    private final CountDownLatch zza = new CountDownLatch(1);

    private zzad() {
    }

    public final void onCanceled() {
        this.zza.countDown();
    }

    public final void onFailure(Exception exc) {
        this.zza.countDown();
    }

    public final void onSuccess(Object obj) {
        this.zza.countDown();
    }

    public final void zza() throws InterruptedException {
        this.zza.await();
    }

    public final boolean zzb(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.zza.await(j10, timeUnit);
    }

    public /* synthetic */ zzad(zzac zzac) {
    }
}
