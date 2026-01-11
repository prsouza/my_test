package com.google.android.gms.location;

import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaj extends LocationCallback {
    public final /* synthetic */ TaskCompletionSource zza;
    public final /* synthetic */ FusedLocationProviderClient zzb;

    public zzaj(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        this.zzb = fusedLocationProviderClient;
        this.zza = taskCompletionSource;
    }

    public final void onLocationAvailability(LocationAvailability locationAvailability) {
    }

    public final void onLocationResult(LocationResult locationResult) {
        this.zza.trySetResult(locationResult.getLastLocation());
        this.zzb.removeLocationUpdates((LocationCallback) this);
    }
}
