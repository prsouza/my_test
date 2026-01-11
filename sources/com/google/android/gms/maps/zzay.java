package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
final class zzay extends DeferredLifecycleHelper<zzax> {
    public OnDelegateCreatedListener<zzax> zza;
    private final Fragment zzb;
    private Activity zzc;
    private final List<OnStreetViewPanoramaReadyCallback> zzd = new ArrayList();

    @VisibleForTesting
    public zzay(Fragment fragment) {
        this.zzb = fragment;
    }

    public static /* synthetic */ void zza(zzay zzay, Activity activity) {
        zzay.zzc = activity;
        zzay.zzc();
    }

    public final void createDelegate(OnDelegateCreatedListener<zzax> onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((zzax) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.zzd.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void zzc() {
        if (this.zzc != null && this.zza != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.zzc);
                this.zza.onDelegateCreated(new zzax(this.zzb, zzca.zza(this.zzc, (MapsInitializer.Renderer) null).zzh(ObjectWrapper.wrap(this.zzc))));
                for (OnStreetViewPanoramaReadyCallback streetViewPanoramaAsync : this.zzd) {
                    ((zzax) getDelegate()).getStreetViewPanoramaAsync(streetViewPanoramaAsync);
                }
                this.zzd.clear();
            } catch (RemoteException e10) {
                throw new RuntimeRemoteException(e10);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
