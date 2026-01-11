package com.google.android.gms.location;

import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzz implements zzan {
    private final TaskCompletionSource zza;

    public zzz(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zza() {
        this.zza.trySetResult(null);
    }
}
