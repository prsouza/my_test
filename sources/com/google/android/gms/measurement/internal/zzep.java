package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzof;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

public final class zzep extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn = 0;
    private String zzo = null;

    public zzep(zzgi zzgi, long j10) {
        super(zzgi);
        this.zzg = j10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0172 A[Catch:{ IllegalStateException -> 0x01c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017b A[Catch:{ IllegalStateException -> 0x01c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a3 A[Catch:{ IllegalStateException -> 0x01c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0233  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd() {
        /*
            r11 = this;
            com.google.android.gms.measurement.internal.zzgi r0 = r11.zzs
            android.content.Context r0 = r0.zzav()
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.zzgi r1 = r11.zzs
            android.content.Context r1 = r1.zzav()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r6 = "unknown"
            if (r1 != 0) goto L_0x0033
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzaz()
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzd()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzey.zzn(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.zzb(r9, r8)
            goto L_0x0083
        L_0x0033:
            java.lang.String r6 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0038 }
            goto L_0x004b
        L_0x0038:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzaz()
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzd()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzey.zzn(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.zzb(r9, r8)
        L_0x004b:
            if (r6 != 0) goto L_0x0050
            java.lang.String r6 = "manual_install"
            goto L_0x0059
        L_0x0050:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0059
            r6 = r4
        L_0x0059:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.Context r7 = r7.zzav()     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r7 == 0) goto L_0x0083
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r9 != 0) goto L_0x007a
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0085 }
            goto L_0x007b
        L_0x007a:
            r8 = r2
        L_0x007b:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0080 }
            int r3 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0080 }
            goto L_0x009b
        L_0x0080:
            r7 = r2
            r2 = r8
            goto L_0x0086
        L_0x0083:
            r8 = r2
            goto L_0x009b
        L_0x0085:
            r7 = r2
        L_0x0086:
            com.google.android.gms.measurement.internal.zzgi r8 = r11.zzs
            com.google.android.gms.measurement.internal.zzey r8 = r8.zzaz()
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzd()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzey.zzn(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.zzc(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x009b:
            r11.zza = r0
            r11.zzd = r6
            r11.zzb = r2
            r11.zzc = r3
            r11.zze = r8
            r2 = 0
            r11.zzf = r2
            com.google.android.gms.measurement.internal.zzgi r2 = r11.zzs
            java.lang.String r2 = r2.zzw()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00c6
            com.google.android.gms.measurement.internal.zzgi r2 = r11.zzs
            java.lang.String r2 = r2.zzx()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00c6
            r2 = r3
            goto L_0x00c7
        L_0x00c6:
            r2 = r5
        L_0x00c7:
            com.google.android.gms.measurement.internal.zzgi r6 = r11.zzs
            int r6 = r6.zza()
            switch(r6) {
                case 0: goto L_0x0140;
                case 1: goto L_0x0130;
                case 2: goto L_0x0128;
                case 3: goto L_0x0118;
                case 4: goto L_0x0108;
                case 5: goto L_0x0100;
                case 6: goto L_0x00f0;
                case 7: goto L_0x00e0;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzaz()
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzi()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.zza(r8)
            goto L_0x0147
        L_0x00e0:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzaz()
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzi()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.zza(r8)
            goto L_0x0147
        L_0x00f0:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzaz()
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzl()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.zza(r8)
            goto L_0x0147
        L_0x0100:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs
            java.lang.String r8 = "App measurement disabled via the init parameters"
            androidx.activity.result.d.g(r7, r8)
            goto L_0x0147
        L_0x0108:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzaz()
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzi()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.zza(r8)
            goto L_0x0147
        L_0x0118:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzaz()
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzi()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.zza(r8)
            goto L_0x0147
        L_0x0128:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            androidx.activity.result.d.g(r7, r8)
            goto L_0x0147
        L_0x0130:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzaz()
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzi()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.zza(r8)
            goto L_0x0147
        L_0x0140:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs
            java.lang.String r8 = "App measurement collection enabled"
            androidx.activity.result.d.g(r7, r8)
        L_0x0147:
            r11.zzk = r4
            r11.zzl = r4
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs
            r7.zzax()
            if (r2 == 0) goto L_0x015a
            com.google.android.gms.measurement.internal.zzgi r2 = r11.zzs
            java.lang.String r2 = r2.zzw()
            r11.zzl = r2
        L_0x015a:
            com.google.android.gms.measurement.internal.zzgi r2 = r11.zzs     // Catch:{ IllegalStateException -> 0x01c2 }
            android.content.Context r2 = r2.zzav()     // Catch:{ IllegalStateException -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzgi r7 = r11.zzs     // Catch:{ IllegalStateException -> 0x01c2 }
            java.lang.String r7 = r7.zzz()     // Catch:{ IllegalStateException -> 0x01c2 }
            java.lang.String r8 = "google_app_id"
            java.lang.String r2 = com.google.android.gms.measurement.internal.zzit.zzc(r2, r8, r7)     // Catch:{ IllegalStateException -> 0x01c2 }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01c2 }
            if (r3 == r7) goto L_0x0173
            r4 = r2
        L_0x0173:
            r11.zzk = r4     // Catch:{ IllegalStateException -> 0x01c2 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01c2 }
            if (r2 != 0) goto L_0x01a1
            com.google.android.gms.measurement.internal.zzgi r2 = r11.zzs     // Catch:{ IllegalStateException -> 0x01c2 }
            android.content.Context r2 = r2.zzav()     // Catch:{ IllegalStateException -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzgi r3 = r11.zzs     // Catch:{ IllegalStateException -> 0x01c2 }
            java.lang.String r3 = r3.zzz()     // Catch:{ IllegalStateException -> 0x01c2 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ IllegalStateException -> 0x01c2 }
            android.content.res.Resources r4 = r2.getResources()     // Catch:{ IllegalStateException -> 0x01c2 }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x01c2 }
            if (r7 != 0) goto L_0x0195
            goto L_0x0199
        L_0x0195:
            java.lang.String r3 = com.google.android.gms.measurement.internal.zzga.zza(r2)     // Catch:{ IllegalStateException -> 0x01c2 }
        L_0x0199:
            java.lang.String r2 = "admob_app_id"
            java.lang.String r2 = com.google.android.gms.measurement.internal.zzga.zzb(r2, r4, r3)     // Catch:{ IllegalStateException -> 0x01c2 }
            r11.zzl = r2     // Catch:{ IllegalStateException -> 0x01c2 }
        L_0x01a1:
            if (r6 != 0) goto L_0x01d6
            com.google.android.gms.measurement.internal.zzgi r2 = r11.zzs     // Catch:{ IllegalStateException -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch:{ IllegalStateException -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzj()     // Catch:{ IllegalStateException -> 0x01c2 }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r4 = r11.zza     // Catch:{ IllegalStateException -> 0x01c2 }
            java.lang.String r6 = r11.zzk     // Catch:{ IllegalStateException -> 0x01c2 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x01c2 }
            if (r6 == 0) goto L_0x01bc
            java.lang.String r6 = r11.zzl     // Catch:{ IllegalStateException -> 0x01c2 }
            goto L_0x01be
        L_0x01bc:
            java.lang.String r6 = r11.zzk     // Catch:{ IllegalStateException -> 0x01c2 }
        L_0x01be:
            r2.zzc(r3, r4, r6)     // Catch:{ IllegalStateException -> 0x01c2 }
            goto L_0x01d6
        L_0x01c2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgi r3 = r11.zzs
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzey.zzn(r0)
            java.lang.String r4 = "Fetching Google App Id failed with exception. appId"
            r3.zzc(r4, r0, r2)
        L_0x01d6:
            r0 = 0
            r11.zzh = r0
            com.google.android.gms.measurement.internal.zzgi r0 = r11.zzs
            r0.zzax()
            com.google.android.gms.measurement.internal.zzgi r0 = r11.zzs
            com.google.android.gms.measurement.internal.zzaf r0 = r0.zzf()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.zzp(r2)
            if (r0 != 0) goto L_0x01ed
            goto L_0x0222
        L_0x01ed:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0203
            com.google.android.gms.measurement.internal.zzgi r0 = r11.zzs
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzl()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.zza(r2)
            goto L_0x0224
        L_0x0203:
            java.util.Iterator r2 = r0.iterator()
        L_0x0207:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0222
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.zzgi r4 = r11.zzs
            com.google.android.gms.measurement.internal.zzlp r4 = r4.zzv()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.zzab(r6, r3)
            if (r3 != 0) goto L_0x0207
            goto L_0x0224
        L_0x0222:
            r11.zzh = r0
        L_0x0224:
            if (r1 == 0) goto L_0x0233
            com.google.android.gms.measurement.internal.zzgi r0 = r11.zzs
            android.content.Context r0 = r0.zzav()
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r0)
            r11.zzj = r0
            return
        L_0x0233:
            r11.zzj = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzep.zzd():void");
    }

    public final boolean zzf() {
        return true;
    }

    public final int zzh() {
        zza();
        return this.zzj;
    }

    public final int zzi() {
        zza();
        return this.zzc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0259  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzp zzj(java.lang.String r37) {
        /*
            r36 = this;
            r1 = r36
            r36.zzg()
            com.google.android.gms.measurement.internal.zzp r33 = new com.google.android.gms.measurement.internal.zzp
            java.lang.String r3 = r36.zzl()
            java.lang.String r4 = r36.zzm()
            r36.zza()
            java.lang.String r5 = r1.zzb
            r36.zza()
            int r0 = r1.zzc
            long r6 = (long) r0
            r36.zza()
            java.lang.String r0 = r1.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r8 = r1.zzd
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzaf r0 = r0.zzf()
            r0.zzh()
            r36.zza()
            r36.zzg()
            long r9 = r1.zzf
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r2 = 0
            if (r0 != 0) goto L_0x00c6
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzlp r9 = r0.zzv()
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs
            android.content.Context r0 = r0.zzav()
            com.google.android.gms.measurement.internal.zzgi r10 = r1.zzs
            android.content.Context r10 = r10.zzav()
            java.lang.String r10 = r10.getPackageName()
            r9.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = com.google.android.gms.measurement.internal.zzlp.zzF()
            r15 = -1
            if (r14 != 0) goto L_0x006f
            com.google.android.gms.measurement.internal.zzgi r0 = r9.zzs
            java.lang.String r9 = "Could not get MD5 instance"
            a.a.e(r0, r9)
            goto L_0x00b1
        L_0x006f:
            if (r13 == 0) goto L_0x00c3
            boolean r10 = r9.zzag(r0, r10)     // Catch:{ NameNotFoundException -> 0x00b3 }
            if (r10 != 0) goto L_0x00c3
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x00b3 }
            com.google.android.gms.measurement.internal.zzgi r10 = r9.zzs     // Catch:{ NameNotFoundException -> 0x00b3 }
            android.content.Context r10 = r10.zzav()     // Catch:{ NameNotFoundException -> 0x00b3 }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00b3 }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r10, r13)     // Catch:{ NameNotFoundException -> 0x00b3 }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00b3 }
            if (r0 == 0) goto L_0x00a2
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x00b3 }
            if (r10 <= 0) goto L_0x00a2
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00b3 }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00b3 }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00b3 }
            long r9 = com.google.android.gms.measurement.internal.zzlp.zzp(r0)     // Catch:{ NameNotFoundException -> 0x00b3 }
            r11 = r9
            goto L_0x00c3
        L_0x00a2:
            com.google.android.gms.measurement.internal.zzgi r0 = r9.zzs     // Catch:{ NameNotFoundException -> 0x00b3 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ NameNotFoundException -> 0x00b3 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzk()     // Catch:{ NameNotFoundException -> 0x00b3 }
            java.lang.String r10 = "Could not get signatures"
            r0.zza(r10)     // Catch:{ NameNotFoundException -> 0x00b3 }
        L_0x00b1:
            r11 = r15
            goto L_0x00c3
        L_0x00b3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgi r9 = r9.zzs
            com.google.android.gms.measurement.internal.zzey r9 = r9.zzaz()
            com.google.android.gms.measurement.internal.zzew r9 = r9.zzd()
            java.lang.String r10 = "Package name not found"
            r9.zzb(r10, r0)
        L_0x00c3:
            r1.zzf = r11
            goto L_0x00c7
        L_0x00c6:
            r11 = r9
        L_0x00c7:
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs
            boolean r14 = r0.zzJ()
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzfn r0 = r0.zzm()
            boolean r0 = r0.zzk
            r9 = 1
            r15 = r0 ^ 1
            r36.zzg()
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs
            boolean r0 = r0.zzJ()
            r10 = 0
            if (r0 != 0) goto L_0x00e5
            goto L_0x0110
        L_0x00e5:
            com.google.android.gms.internal.measurement.zzpv.zzc()
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzaf r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzek r13 = com.google.android.gms.measurement.internal.zzel.zzab
            boolean r0 = r0.zzs(r10, r13)
            if (r0 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs
            java.lang.String r2 = "Disabled IID for tests."
            androidx.activity.result.d.g(r0, r2)
            goto L_0x0110
        L_0x00fe:
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs     // Catch:{ ClassNotFoundException -> 0x0161 }
            android.content.Context r0 = r0.zzav()     // Catch:{ ClassNotFoundException -> 0x0161 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0161 }
            java.lang.String r13 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r13)     // Catch:{ ClassNotFoundException -> 0x0161 }
            if (r0 != 0) goto L_0x0113
        L_0x0110:
            r16 = r10
            goto L_0x0164
        L_0x0113:
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0152 }
            java.lang.Class<android.content.Context> r13 = android.content.Context.class
            r10[r2] = r13     // Catch:{ Exception -> 0x0152 }
            java.lang.String r13 = "getInstance"
            java.lang.reflect.Method r10 = r0.getDeclaredMethod(r13, r10)     // Catch:{ Exception -> 0x0152 }
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0152 }
            com.google.android.gms.measurement.internal.zzgi r13 = r1.zzs     // Catch:{ Exception -> 0x0152 }
            android.content.Context r13 = r13.zzav()     // Catch:{ Exception -> 0x0152 }
            r9[r2] = r13     // Catch:{ Exception -> 0x0152 }
            r13 = 0
            java.lang.Object r9 = r10.invoke(r13, r9)     // Catch:{ Exception -> 0x0152 }
            if (r9 != 0) goto L_0x0131
            goto L_0x0161
        L_0x0131:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r13 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0142 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r10, r13)     // Catch:{ Exception -> 0x0142 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0142 }
            java.lang.Object r0 = r0.invoke(r9, r2)     // Catch:{ Exception -> 0x0142 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0142 }
            goto L_0x0162
        L_0x0142:
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzl()
            java.lang.String r2 = "Failed to retrieve Firebase Instance Id"
            r0.zza(r2)
            goto L_0x0161
        L_0x0152:
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzm()
            java.lang.String r2 = "Failed to obtain Firebase Analytics instance"
            r0.zza(r2)
        L_0x0161:
            r0 = 0
        L_0x0162:
            r16 = r0
        L_0x0164:
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs
            com.google.android.gms.measurement.internal.zzfn r2 = r0.zzm()
            com.google.android.gms.measurement.internal.zzfj r2 = r2.zzc
            long r9 = r2.zza()
            r17 = 0
            int r2 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x017d
            long r9 = r0.zzc
            r20 = r9
            r19 = r14
            goto L_0x0187
        L_0x017d:
            r19 = r14
            long r13 = r0.zzc
            long r9 = java.lang.Math.min(r13, r9)
            r20 = r9
        L_0x0187:
            r36.zza()
            int r0 = r1.zzj
            com.google.android.gms.measurement.internal.zzgi r2 = r1.zzs
            com.google.android.gms.measurement.internal.zzaf r2 = r2.zzf()
            boolean r22 = r2.zzr()
            com.google.android.gms.measurement.internal.zzgi r2 = r1.zzs
            com.google.android.gms.measurement.internal.zzfn r2 = r2.zzm()
            r2.zzg()
            android.content.SharedPreferences r2 = r2.zza()
            java.lang.String r9 = "deferred_analytics_collection"
            r10 = 0
            boolean r23 = r2.getBoolean(r9, r10)
            r36.zza()
            java.lang.String r14 = r1.zzl
            com.google.android.gms.measurement.internal.zzgi r2 = r1.zzs
            com.google.android.gms.measurement.internal.zzaf r2 = r2.zzf()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.zzk(r9)
            if (r2 != 0) goto L_0x01bf
            r2 = 0
            goto L_0x01c9
        L_0x01bf:
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
        L_0x01c9:
            r25 = r2
            long r9 = r1.zzg
            java.util.List r13 = r1.zzh
            com.google.android.gms.measurement.internal.zzgi r2 = r1.zzs
            com.google.android.gms.measurement.internal.zzfn r2 = r2.zzm()
            com.google.android.gms.measurement.internal.zzah r2 = r2.zzc()
            java.lang.String r30 = r2.zzh()
            java.lang.String r2 = r1.zzi
            if (r2 != 0) goto L_0x0204
            com.google.android.gms.measurement.internal.zzgi r2 = r1.zzs
            com.google.android.gms.measurement.internal.zzaf r2 = r2.zzf()
            r17 = r9
            com.google.android.gms.measurement.internal.zzek r9 = com.google.android.gms.measurement.internal.zzel.zzaN
            r10 = 0
            boolean r2 = r2.zzs(r10, r9)
            if (r2 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.zzgi r2 = r1.zzs
            com.google.android.gms.measurement.internal.zzlp r2 = r2.zzv()
            java.lang.String r2 = r2.zzC()
            r1.zzi = r2
            goto L_0x0206
        L_0x01ff:
            java.lang.String r2 = ""
            r1.zzi = r2
            goto L_0x0206
        L_0x0204:
            r17 = r9
        L_0x0206:
            java.lang.String r2 = r1.zzi
            com.google.android.gms.internal.measurement.zzpp.zzc()
            com.google.android.gms.measurement.internal.zzgi r9 = r1.zzs
            com.google.android.gms.measurement.internal.zzaf r9 = r9.zzf()
            com.google.android.gms.measurement.internal.zzek r10 = com.google.android.gms.measurement.internal.zzel.zzaI
            r24 = r2
            r2 = 0
            boolean r9 = r9.zzs(r2, r10)
            if (r9 == 0) goto L_0x0259
            r36.zzg()
            long r9 = r1.zzn
            r26 = 0
            int r2 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r2 != 0) goto L_0x022c
            r27 = r13
            r26 = r14
            goto L_0x024f
        L_0x022c:
            com.google.android.gms.measurement.internal.zzgi r2 = r1.zzs
            com.google.android.gms.common.util.Clock r2 = r2.zzaw()
            long r9 = r2.currentTimeMillis()
            r27 = r13
            r26 = r14
            long r13 = r1.zzn
            long r9 = r9 - r13
            java.lang.String r2 = r1.zzm
            if (r2 == 0) goto L_0x024f
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x024f
            java.lang.String r2 = r1.zzo
            if (r2 != 0) goto L_0x024f
            r36.zzo()
        L_0x024f:
            java.lang.String r2 = r1.zzm
            if (r2 != 0) goto L_0x0256
            r36.zzo()
        L_0x0256:
            java.lang.String r2 = r1.zzm
            goto L_0x025d
        L_0x0259:
            r27 = r13
            r26 = r14
        L_0x025d:
            r32 = r2
            r9 = 61000(0xee48, double:3.0138E-319)
            r34 = r17
            r17 = 0
            r29 = 0
            r31 = r24
            r2 = r33
            r28 = r27
            r13 = r37
            r24 = r26
            r14 = r19
            r19 = r20
            r21 = r0
            r26 = r34
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzep.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzp");
    }

    public final String zzk() {
        zza();
        return this.zzl;
    }

    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzm() {
        zzof.zzc();
        if (this.zzs.zzf().zzs((String) null, zzel.zzal)) {
            zzg();
        }
        zza();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    public final List zzn() {
        return this.zzh;
    }

    public final void zzo() {
        String str;
        zzg();
        if (!this.zzs.zzm().zzc().zzi(zzag.ANALYTICS_STORAGE)) {
            this.zzs.zzaz().zzc().zza("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            this.zzs.zzv().zzG().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        zzew zzc2 = this.zzs.zzaz().zzc();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        zzc2.zza(String.format("Resetting session stitching token to %s", objArr));
        this.zzm = str;
        this.zzn = this.zzs.zzaw().currentTimeMillis();
    }

    public final boolean zzp(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
