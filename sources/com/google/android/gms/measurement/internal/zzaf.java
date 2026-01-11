package com.google.android.gms.measurement.internal;

import a.a;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class zzaf extends zzhb {
    private Boolean zza;
    private zzae zzb = zzad.zza;
    private Boolean zzc;

    public zzaf(zzgi zzgi) {
        super(zzgi);
    }

    public static final long zzA() {
        return ((Long) zzel.zzC.zza((Object) null)).longValue();
    }

    private final String zzB(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, BuildConfig.FLAVOR});
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.zzs.zzaz().zzd().zzb("Could not find SystemProperties class", e10);
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e11) {
            this.zzs.zzaz().zzd().zzb("Could not find SystemProperties.get() method", e11);
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e12) {
            this.zzs.zzaz().zzd().zzb("Could not access SystemProperties.get()", e12);
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e13) {
            this.zzs.zzaz().zzd().zzb("SystemProperties.get() threw an exception", e13);
            return BuildConfig.FLAVOR;
        }
    }

    public static final long zzz() {
        return ((Long) zzel.zzc.zza((Object) null)).longValue();
    }

    public final double zza(String str, zzek zzek) {
        if (str == null) {
            return ((Double) zzek.zza((Object) null)).doubleValue();
        }
        String zza2 = this.zzb.zza(str, zzek.zzb());
        if (TextUtils.isEmpty(zza2)) {
            return ((Double) zzek.zza((Object) null)).doubleValue();
        }
        try {
            return ((Double) zzek.zza(Double.valueOf(Double.parseDouble(zza2)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzek.zza((Object) null)).doubleValue();
        }
    }

    public final int zzb(String str) {
        return zzf(str, zzel.zzG, 500, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
    }

    public final int zzc() {
        zzlp zzv = this.zzs.zzv();
        Boolean zzj = zzv.zzs.zzt().zzj();
        if (zzv.zzm() < 201500) {
            return (zzj == null || zzj.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int zzd(String str) {
        return zzf(str, zzel.zzH, 25, 100);
    }

    public final int zze(String str, zzek zzek) {
        if (str == null) {
            return ((Integer) zzek.zza((Object) null)).intValue();
        }
        String zza2 = this.zzb.zza(str, zzek.zzb());
        if (TextUtils.isEmpty(zza2)) {
            return ((Integer) zzek.zza((Object) null)).intValue();
        }
        try {
            return ((Integer) zzek.zza(Integer.valueOf(Integer.parseInt(zza2)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzek.zza((Object) null)).intValue();
        }
    }

    public final int zzf(String str, zzek zzek, int i, int i10) {
        return Math.max(Math.min(zze(str, zzek), i10), i);
    }

    public final long zzh() {
        this.zzs.zzax();
        return 61000;
    }

    public final long zzi(String str, zzek zzek) {
        if (str == null) {
            return ((Long) zzek.zza((Object) null)).longValue();
        }
        String zza2 = this.zzb.zza(str, zzek.zzb());
        if (TextUtils.isEmpty(zza2)) {
            return ((Long) zzek.zza((Object) null)).longValue();
        }
        try {
            return ((Long) zzek.zza(Long.valueOf(Long.parseLong(zza2)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzek.zza((Object) null)).longValue();
        }
    }

    @VisibleForTesting
    public final Bundle zzj() {
        try {
            if (this.zzs.zzav().getPackageManager() == null) {
                this.zzs.zzaz().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzs.zzav()).getApplicationInfo(this.zzs.zzav().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.zzs.zzaz().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.zzs.zzaz().zzd().zzb("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean zzk(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzj = zzj();
        if (zzj == null) {
            a.e(this.zzs, "Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!zzj.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(zzj.getBoolean(str));
        }
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", BuildConfig.FLAVOR);
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", BuildConfig.FLAVOR);
    }

    public final String zzn() {
        this.zzs.zzax();
        return "FA";
    }

    public final String zzo(String str, zzek zzek) {
        if (str == null) {
            return (String) zzek.zza((Object) null);
        }
        return (String) zzek.zza(this.zzb.zza(str, zzek.zzb()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026 A[SYNTHETIC, Splitter:B:8:0x0026] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzp(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzj()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            com.google.android.gms.measurement.internal.zzgi r4 = r3.zzs
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            a.a.e(r4, r0)
            goto L_0x001a
        L_0x0014:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x001c
        L_0x001a:
            r4 = r1
            goto L_0x0024
        L_0x001c:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0024:
            if (r4 == 0) goto L_0x0050
            com.google.android.gms.measurement.internal.zzgi r0 = r3.zzs     // Catch:{ NotFoundException -> 0x0040 }
            android.content.Context r0 = r0.zzav()     // Catch:{ NotFoundException -> 0x0040 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0040 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0040 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0040 }
            if (r4 != 0) goto L_0x003b
            return r1
        L_0x003b:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0040 }
            return r4
        L_0x0040:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzgi r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzd()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zzb(r2, r4)
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaf.zzp(java.lang.String):java.util.List");
    }

    public final void zzq(zzae zzae) {
        this.zzb = zzae;
    }

    public final boolean zzr() {
        Boolean zzk = zzk("google_analytics_adid_collection_enabled");
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzs(String str, zzek zzek) {
        if (str == null) {
            return ((Boolean) zzek.zza((Object) null)).booleanValue();
        }
        String zza2 = this.zzb.zza(str, zzek.zzb());
        if (TextUtils.isEmpty(zza2)) {
            return ((Boolean) zzek.zza((Object) null)).booleanValue();
        }
        return ((Boolean) zzek.zza(Boolean.valueOf("1".equals(zza2)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean zzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzv() {
        this.zzs.zzax();
        Boolean zzk = zzk("firebase_analytics_collection_deactivated");
        return zzk != null && zzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzx() {
        if (this.zza == null) {
            Boolean zzk = zzk("app_measurement_lite");
            this.zza = zzk;
            if (zzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzs.zzN();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    ApplicationInfo applicationInfo = this.zzs.zzav().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(myProcessName)) {
                            z = true;
                        }
                        this.zzc = Boolean.valueOf(z);
                    }
                    if (this.zzc == null) {
                        this.zzc = Boolean.TRUE;
                        this.zzs.zzaz().zzd().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
