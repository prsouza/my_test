package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
final class zzah extends DeferredLifecycleHelper<zzag> {
    public OnDelegateCreatedListener<zzag> zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final GoogleMapOptions zzd;
    private final List<OnMapReadyCallback> zze = new ArrayList();

    @VisibleForTesting
    public zzah(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.zzb = viewGroup;
        this.zzc = context;
        this.zzd = googleMapOptions;
    }

    public final void createDelegate(OnDelegateCreatedListener<zzag> onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzb();
    }

    public final void zza(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((zzag) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.zze.add(onMapReadyCallback);
        }
    }

    public final void zzb() {
        if (this.zza != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.zzc);
                IMapViewDelegate zzg = zzca.zza(this.zzc, (MapsInitializer.Renderer) null).zzg(ObjectWrapper.wrap(this.zzc), this.zzd);
                if (zzg != null) {
                    this.zza.onDelegateCreated(new zzag(this.zzb, zzg));
                    for (OnMapReadyCallback mapAsync : this.zze) {
                        ((zzag) getDelegate()).getMapAsync(mapAsync);
                    }
                    this.zze.clear();
                }
            } catch (RemoteException e10) {
                throw new RuntimeRemoteException(e10);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
