package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
final class zzae extends DeferredLifecycleHelper<zzad> {
    public OnDelegateCreatedListener<zzad> zza;
    private final Fragment zzb;
    private Activity zzc;
    private final List<OnMapReadyCallback> zzd = new ArrayList();

    @VisibleForTesting
    public zzae(Fragment fragment) {
        this.zzb = fragment;
    }

    public static /* synthetic */ void zza(zzae zzae, Activity activity) {
        zzae.zzc = activity;
        zzae.zzc();
    }

    public final void createDelegate(OnDelegateCreatedListener<zzad> onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((zzad) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.zzd.add(onMapReadyCallback);
        }
    }

    public final void zzc() {
        if (this.zzc != null && this.zza != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.zzc);
                IMapFragmentDelegate zzf = zzca.zza(this.zzc, (MapsInitializer.Renderer) null).zzf(ObjectWrapper.wrap(this.zzc));
                if (zzf != null) {
                    this.zza.onDelegateCreated(new zzad(this.zzb, zzf));
                    for (OnMapReadyCallback mapAsync : this.zzd) {
                        ((zzad) getDelegate()).getMapAsync(mapAsync);
                    }
                    this.zzd.clear();
                }
            } catch (RemoteException e10) {
                throw new RuntimeRemoteException(e10);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
