package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcl;
import io.sentry.protocol.App;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import s.a;

@DynamiteApi
public class AppMeasurementDynamiteService extends zzcb {
    @VisibleForTesting
    public zzgi zza = null;
    private final Map zzb = new a();

    @EnsuresNonNull({"scion"})
    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(zzcf zzcf, String str) {
        zzb();
        this.zza.zzv().zzV(zzcf, str);
    }

    public void beginAdUnitExposure(String str, long j10) throws RemoteException {
        zzb();
        this.zza.zzd().zzd(str, j10);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.zza.zzq().zzA(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzW((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j10) throws RemoteException {
        zzb();
        this.zza.zzd().zze(str, j10);
    }

    public void generateEventId(zzcf zzcf) throws RemoteException {
        zzb();
        long zzq = this.zza.zzv().zzq();
        zzb();
        this.zza.zzv().zzU(zzcf, zzq);
    }

    public void getAppInstanceId(zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzaA().zzp(new zzh(this, zzcf));
    }

    public void getCachedAppInstanceId(zzcf zzcf) throws RemoteException {
        zzb();
        zzc(zzcf, this.zza.zzq().zzo());
    }

    public void getConditionalUserProperties(String str, String str2, zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzaA().zzp(new zzl(this, zzcf, str, str2));
    }

    public void getCurrentScreenClass(zzcf zzcf) throws RemoteException {
        zzb();
        zzc(zzcf, this.zza.zzq().zzp());
    }

    public void getCurrentScreenName(zzcf zzcf) throws RemoteException {
        zzb();
        zzc(zzcf, this.zza.zzq().zzq());
    }

    public void getGmpAppId(zzcf zzcf) throws RemoteException {
        String str;
        zzb();
        zzin zzq = this.zza.zzq();
        if (zzq.zzs.zzw() != null) {
            str = zzq.zzs.zzw();
        } else {
            try {
                str = zzit.zzc(zzq.zzs.zzav(), "google_app_id", zzq.zzs.zzz());
            } catch (IllegalStateException e10) {
                zzq.zzs.zzaz().zzd().zzb("getGoogleAppId failed with exception", e10);
                str = null;
            }
        }
        zzc(zzcf, str);
    }

    public void getMaxUserProperties(String str, zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzq().zzh(str);
        zzb();
        this.zza.zzv().zzT(zzcf, 25);
    }

    public void getTestFlag(zzcf zzcf, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.zza.zzv().zzV(zzcf, this.zza.zzq().zzr());
        } else if (i == 1) {
            this.zza.zzv().zzU(zzcf, this.zza.zzq().zzm().longValue());
        } else if (i == 2) {
            zzlp zzv = this.zza.zzv();
            double doubleValue = this.zza.zzq().zzj().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcf.zzd(bundle);
            } catch (RemoteException e10) {
                zzv.zzs.zzaz().zzk().zzb("Error returning double value to wrapper", e10);
            }
        } else if (i == 3) {
            this.zza.zzv().zzT(zzcf, this.zza.zzq().zzl().intValue());
        } else if (i == 4) {
            this.zza.zzv().zzP(zzcf, this.zza.zzq().zzi().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzaA().zzp(new zzj(this, zzcf, str, str2, z));
    }

    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    public void initialize(IObjectWrapper iObjectWrapper, zzcl zzcl, long j10) throws RemoteException {
        zzgi zzgi = this.zza;
        if (zzgi == null) {
            this.zza = zzgi.zzp((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzcl, Long.valueOf(j10));
        } else {
            android.support.v4.media.a.g(zzgi, "Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzaA().zzp(new zzm(this, zzcf));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z10, long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzF(str, str2, bundle, z, z10, j10);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcf, long j10) throws RemoteException {
        Bundle bundle2;
        zzb();
        Preconditions.checkNotEmpty(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", App.TYPE);
        this.zza.zzaA().zzp(new zzi(this, zzcf, new zzav(str2, new zzat(bundle), App.TYPE, j10), str));
    }

    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Object obj;
        Object obj2;
        zzb();
        Object obj3 = null;
        if (iObjectWrapper == null) {
            obj = null;
        } else {
            obj = ObjectWrapper.unwrap(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            obj2 = null;
        } else {
            obj2 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            obj3 = ObjectWrapper.unwrap(iObjectWrapper3);
        }
        this.zza.zzaz().zzt(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10) throws RemoteException {
        zzb();
        zzim zzim = this.zza.zzq().zza;
        if (zzim != null) {
            this.zza.zzq().zzB();
            zzim.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        zzim zzim = this.zza.zzq().zza;
        if (zzim != null) {
            this.zza.zzq().zzB();
            zzim.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        zzim zzim = this.zza.zzq().zza;
        if (zzim != null) {
            this.zza.zzq().zzB();
            zzim.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        zzim zzim = this.zza.zzq().zza;
        if (zzim != null) {
            this.zza.zzq().zzB();
            zzim.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcf, long j10) throws RemoteException {
        zzb();
        zzim zzim = this.zza.zzq().zza;
        Bundle bundle = new Bundle();
        if (zzim != null) {
            this.zza.zzq().zzB();
            zzim.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e10) {
            this.zza.zzaz().zzk().zzb("Error returning bundle value to wrapper", e10);
        }
    }

    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzB();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzB();
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    public void performAction(Bundle bundle, zzcf zzcf, long j10) throws RemoteException {
        zzb();
        zzcf.zzd((Bundle) null);
    }

    public void registerOnMeasurementEventListener(zzci zzci) throws RemoteException {
        zzhj zzhj;
        zzb();
        synchronized (this.zzb) {
            zzhj = (zzhj) this.zzb.get(Integer.valueOf(zzci.zzd()));
            if (zzhj == null) {
                zzhj = new zzo(this, zzci);
                this.zzb.put(Integer.valueOf(zzci.zzd()), zzhj);
            }
        }
        this.zza.zzq().zzK(zzhj);
    }

    public void resetAnalyticsData(long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzL(j10);
    }

    public void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        zzb();
        if (bundle == null) {
            a.a.e(this.zza, "Conditional user property must not be null");
        } else {
            this.zza.zzq().zzR(bundle, j10);
        }
    }

    public void setConsent(Bundle bundle, long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzU(bundle, j10);
    }

    public void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzS(bundle, -20, j10);
    }

    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10) throws RemoteException {
        zzb();
        this.zza.zzs().zzw((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        zzin zzq = this.zza.zzq();
        zzq.zza();
        zzq.zzs.zzaA().zzp(new zzij(zzq, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        zzb();
        zzin zzq = this.zza.zzq();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        zzq.zzs.zzaA().zzp(new zzhn(zzq, bundle2));
    }

    public void setEventInterceptor(zzci zzci) throws RemoteException {
        zzb();
        zzn zzn = new zzn(this, zzci);
        if (this.zza.zzaA().zzs()) {
            this.zza.zzq().zzV(zzn);
        } else {
            this.zza.zzaA().zzp(new zzk(this, zzn));
        }
    }

    public void setInstanceIdProvider(zzck zzck) throws RemoteException {
        zzb();
    }

    public void setMeasurementEnabled(boolean z, long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzW(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j10) throws RemoteException {
        zzb();
    }

    public void setSessionTimeoutDuration(long j10) throws RemoteException {
        zzb();
        zzin zzq = this.zza.zzq();
        zzq.zzs.zzaA().zzp(new zzhr(zzq, j10));
    }

    public void setUserId(String str, long j10) throws RemoteException {
        zzb();
        zzin zzq = this.zza.zzq();
        if (str == null || !TextUtils.isEmpty(str)) {
            zzq.zzs.zzaA().zzp(new zzhp(zzq, str));
            zzq.zzZ((String) null, "_id", str, true, j10);
            return;
        }
        android.support.v4.media.a.g(zzq.zzs, "User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j10) throws RemoteException {
        zzb();
        this.zza.zzq().zzZ(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j10);
    }

    public void unregisterOnMeasurementEventListener(zzci zzci) throws RemoteException {
        zzhj zzhj;
        zzb();
        synchronized (this.zzb) {
            zzhj = (zzhj) this.zzb.remove(Integer.valueOf(zzci.zzd()));
        }
        if (zzhj == null) {
            zzhj = new zzo(this, zzci);
        }
        this.zza.zzq().zzab(zzhj);
    }
}
