package com.google.android.gms.tasks;

import java.util.concurrent.TimeoutException;

public final /* synthetic */ class zzy implements Runnable {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzy(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        this.zza.trySetException(new TimeoutException());
    }
}
