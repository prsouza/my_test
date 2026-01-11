package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.measurement.zzne;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class zzkd extends zzkw {
    public final zzfj zza;
    public final zzfj zzb;
    public final zzfj zzc;
    public final zzfj zzd;
    public final zzfj zze;
    private final Map zzg = new HashMap();
    private String zzh;
    private boolean zzi;
    private long zzj;

    public zzkd(zzli zzli) {
        super(zzli);
        zzfn zzm = this.zzs.zzm();
        Objects.requireNonNull(zzm);
        this.zza = new zzfj(zzm, "last_delete_stale", 0);
        zzfn zzm2 = this.zzs.zzm();
        Objects.requireNonNull(zzm2);
        this.zzb = new zzfj(zzm2, "backoff", 0);
        zzfn zzm3 = this.zzs.zzm();
        Objects.requireNonNull(zzm3);
        this.zzc = new zzfj(zzm3, "last_upload", 0);
        zzfn zzm4 = this.zzs.zzm();
        Objects.requireNonNull(zzm4);
        this.zzd = new zzfj(zzm4, "last_upload_attempt", 0);
        zzfn zzm5 = this.zzs.zzm();
        Objects.requireNonNull(zzm5);
        this.zze = new zzfj(zzm5, "midnight_offset", 0);
    }

    @Deprecated
    public final Pair zza(String str) {
        zzkc zzkc;
        zzg();
        long elapsedRealtime = this.zzs.zzaw().elapsedRealtime();
        zzne.zzc();
        if (this.zzs.zzf().zzs((String) null, zzel.zzar)) {
            zzkc zzkc2 = (zzkc) this.zzg.get(str);
            if (zzkc2 != null && elapsedRealtime < zzkc2.zzc) {
                return new Pair(zzkc2.zza, Boolean.valueOf(zzkc2.zzb));
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            long zzi2 = this.zzs.zzf().zzi(str, zzel.zza) + elapsedRealtime;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzav());
                if (advertisingIdInfo == null) {
                    return new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
                }
                String id2 = advertisingIdInfo.getId();
                if (id2 != null) {
                    zzkc = new zzkc(id2, advertisingIdInfo.isLimitAdTrackingEnabled(), zzi2);
                } else {
                    zzkc = new zzkc(BuildConfig.FLAVOR, advertisingIdInfo.isLimitAdTrackingEnabled(), zzi2);
                }
                this.zzg.put(str, zzkc);
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                return new Pair(zzkc.zza, Boolean.valueOf(zzkc.zzb));
            } catch (Exception e10) {
                this.zzs.zzaz().zzc().zzb("Unable to get advertising id", e10);
                zzkc = new zzkc(BuildConfig.FLAVOR, false, zzi2);
            }
        } else {
            String str2 = this.zzh;
            if (str2 != null && elapsedRealtime < this.zzj) {
                return new Pair(str2, Boolean.valueOf(this.zzi));
            }
            this.zzj = this.zzs.zzf().zzi(str, zzel.zza) + elapsedRealtime;
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            try {
                AdvertisingIdClient.Info advertisingIdInfo2 = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzav());
                if (advertisingIdInfo2 == null) {
                    return new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
                }
                this.zzh = BuildConfig.FLAVOR;
                String id3 = advertisingIdInfo2.getId();
                if (id3 != null) {
                    this.zzh = id3;
                }
                this.zzi = advertisingIdInfo2.isLimitAdTrackingEnabled();
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                return new Pair(this.zzh, Boolean.valueOf(this.zzi));
            } catch (Exception e11) {
                this.zzs.zzaz().zzc().zzb("Unable to get advertising id", e11);
                this.zzh = BuildConfig.FLAVOR;
            }
        }
    }

    public final boolean zzb() {
        return false;
    }

    public final Pair zzd(String str, zzah zzah) {
        if (zzah.zzi(zzag.AD_STORAGE)) {
            return zza(str);
        }
        return new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
    }

    @Deprecated
    public final String zzf(String str) {
        zzg();
        String str2 = (String) zza(str).first;
        MessageDigest zzF = zzlp.zzF();
        if (zzF == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, zzF.digest(str2.getBytes()))});
    }
}
