package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzpm;
import com.google.android.gms.internal.measurement.zzpp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s.a;

public final class zzli implements zzhd {
    private static volatile zzli zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zziu zzD;
    private String zzE;
    private final zzlo zzF = new zzld(this);
    @VisibleForTesting
    public long zza;
    private final zzfz zzc;
    private final zzfe zzd;
    private zzal zze;
    private zzfg zzf;
    private zzku zzg;
    private zzz zzh;
    private final zzlk zzi;
    private zzis zzj;
    private zzkd zzk;
    private final zzkx zzl;
    private zzfq zzm;
    /* access modifiers changed from: private */
    public final zzgi zzn;
    private boolean zzo = false;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;

    public zzli(zzlj zzlj, zzgi zzgi) {
        Preconditions.checkNotNull(zzlj);
        this.zzn = zzgi.zzp(zzlj.zza, (zzcl) null, (Long) null);
        this.zzA = -1;
        this.zzl = new zzkx(this);
        zzlk zzlk = new zzlk(this);
        zzlk.zzX();
        this.zzi = zzlk;
        zzfe zzfe = new zzfe(this);
        zzfe.zzX();
        this.zzd = zzfe;
        zzfz zzfz = new zzfz(this);
        zzfz.zzX();
        this.zzc = zzfz;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaA().zzp(new zzky(this, zzlj));
    }

    @VisibleForTesting
    public static final void zzZ(zzfr zzfr, int i, String str) {
        List zzp2 = zzfr.zzp();
        int i10 = 0;
        while (i10 < zzp2.size()) {
            if (!"_err".equals(((zzfw) zzp2.get(i10)).zzg())) {
                i10++;
            } else {
                return;
            }
        }
        zzfv zze2 = zzfw.zze();
        zze2.zzj("_err");
        zze2.zzi(Long.valueOf((long) i).longValue());
        zzfv zze3 = zzfw.zze();
        zze3.zzj("_ev");
        zze3.zzk(str);
        zzfr.zzf((zzfw) zze2.zzaE());
        zzfr.zzf((zzfw) zze3.zzaE());
    }

    @VisibleForTesting
    public static final void zzaa(zzfr zzfr, String str) {
        List zzp2 = zzfr.zzp();
        for (int i = 0; i < zzp2.size(); i++) {
            if (str.equals(((zzfw) zzp2.get(i)).zzg())) {
                zzfr.zzh(i);
                return;
            }
        }
    }

    private final zzp zzab(String str) {
        String str2 = str;
        zzal zzal = this.zze;
        zzak(zzal);
        zzg zzj2 = zzal.zzj(str2);
        if (zzj2 == null || TextUtils.isEmpty(zzj2.zzw())) {
            zzaz().zzc().zzb("No app data available; dropping", str2);
            return null;
        }
        Boolean zzac = zzac(zzj2);
        if (zzac == null || zzac.booleanValue()) {
            zzg zzg2 = zzj2;
            return new zzp(str, zzj2.zzy(), zzj2.zzw(), zzj2.zzb(), zzj2.zzv(), zzj2.zzm(), zzj2.zzj(), (String) null, zzj2.zzaj(), false, zzj2.zzx(), zzg2.zza(), 0, 0, zzg2.zzai(), false, zzg2.zzr(), zzg2.zzq(), zzg2.zzk(), zzg2.zzC(), (String) null, zzh(str).zzh(), BuildConfig.FLAVOR, (String) null);
        }
        zzaz().zzd().zzb("App version does not match; dropping. appId", zzey.zzn(str));
        return null;
    }

    private final Boolean zzac(zzg zzg2) {
        try {
            if (zzg2.zzb() != -2147483648L) {
                if (zzg2.zzb() == ((long) Wrappers.packageManager(this.zzn.zzav()).getPackageInfo(zzg2.zzt(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzav()).getPackageInfo(zzg2.zzt(), 0).versionName;
                String zzw2 = zzg2.zzw();
                if (zzw2 != null && zzw2.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzad() {
        zzaA().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzaz().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzaz().zzj().zza("Stopping uploading service(s)");
        List<Runnable> list = this.zzq;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) Preconditions.checkNotNull(this.zzq)).clear();
        }
    }

    @VisibleForTesting
    private final void zzae(zzgb zzgb, long j10, boolean z) {
        zzln zzln;
        String str = true != z ? "_lte" : "_se";
        zzal zzal = this.zze;
        zzak(zzal);
        zzln zzp2 = zzal.zzp(zzgb.zzaq(), str);
        if (zzp2 == null || zzp2.zze == null) {
            zzln = new zzln(zzgb.zzaq(), "auto", str, zzaw().currentTimeMillis(), Long.valueOf(j10));
        } else {
            zzln = new zzln(zzgb.zzaq(), "auto", str, zzaw().currentTimeMillis(), Long.valueOf(((Long) zzp2.zze).longValue() + j10));
        }
        zzgk zzd2 = zzgl.zzd();
        zzd2.zzf(str);
        zzd2.zzg(zzaw().currentTimeMillis());
        zzd2.zze(((Long) zzln.zze).longValue());
        zzgl zzgl = (zzgl) zzd2.zzaE();
        int zza2 = zzlk.zza(zzgb, str);
        if (zza2 >= 0) {
            zzgb.zzan(zza2, zzgl);
        } else {
            zzgb.zzm(zzgl);
        }
        if (j10 > 0) {
            zzal zzal2 = this.zze;
            zzak(zzal2);
            zzal2.zzL(zzln);
            zzaz().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzln.zze);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0237  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzaf() {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.zzgf r1 = r20.zzaA()
            r1.zzg()
            r20.zzB()
            long r1 = r0.zza
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004e
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            com.google.android.gms.common.util.Clock r5 = r20.zzaw()
            long r5 = r5.elapsedRealtime()
            long r7 = r0.zza
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.zzey r3 = r20.zzaz()
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzj()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.zzb(r2, r1)
            com.google.android.gms.measurement.internal.zzfg r1 = r20.zzm()
            r1.zzc()
            com.google.android.gms.measurement.internal.zzku r1 = r0.zzg
            zzak(r1)
            r1.zza()
            return
        L_0x004c:
            r0.zza = r3
        L_0x004e:
            com.google.android.gms.measurement.internal.zzgi r1 = r0.zzn
            boolean r1 = r1.zzM()
            if (r1 == 0) goto L_0x0254
            boolean r1 = r20.zzah()
            if (r1 != 0) goto L_0x005e
            goto L_0x0254
        L_0x005e:
            com.google.android.gms.common.util.Clock r1 = r20.zzaw()
            long r1 = r1.currentTimeMillis()
            r20.zzg()
            com.google.android.gms.measurement.internal.zzek r5 = com.google.android.gms.measurement.internal.zzel.zzz
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.zzal r5 = r0.zze
            zzak(r5)
            boolean r5 = r5.zzH()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.zzal r5 = r0.zze
            zzak(r5)
            boolean r5 = r5.zzG()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00d3
            com.google.android.gms.measurement.internal.zzaf r5 = r20.zzg()
            java.lang.String r5 = r5.zzl()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00bf
            r20.zzg()
            com.google.android.gms.measurement.internal.zzek r5 = com.google.android.gms.measurement.internal.zzel.zzu
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00bf:
            r20.zzg()
            com.google.android.gms.measurement.internal.zzek r5 = com.google.android.gms.measurement.internal.zzel.zzt
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00d3:
            r20.zzg()
            com.google.android.gms.measurement.internal.zzek r5 = com.google.android.gms.measurement.internal.zzel.zzs
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        L_0x00e6:
            com.google.android.gms.measurement.internal.zzkd r5 = r0.zzk
            com.google.android.gms.measurement.internal.zzfj r5 = r5.zzc
            long r13 = r5.zza()
            com.google.android.gms.measurement.internal.zzkd r5 = r0.zzk
            com.google.android.gms.measurement.internal.zzfj r5 = r5.zzd
            long r15 = r5.zza()
            com.google.android.gms.measurement.internal.zzal r5 = r0.zze
            zzak(r5)
            r17 = r10
            long r9 = r5.zzd()
            com.google.android.gms.measurement.internal.zzal r5 = r0.zze
            zzak(r5)
            r18 = r7
            long r6 = r5.zze()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
        L_0x0114:
            r7 = r3
            goto L_0x018e
        L_0x0117:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r9 = r1 - r9
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r1, r9)
            long r7 = r5 + r18
            if (r17 == 0) goto L_0x013c
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x013c
            long r7 = java.lang.Math.min(r5, r1)
            long r7 = r7 + r11
        L_0x013c:
            com.google.android.gms.measurement.internal.zzlk r13 = r0.zzi
            zzak(r13)
            boolean r13 = r13.zzw(r1, r11)
            if (r13 != 0) goto L_0x0149
            long r7 = r1 + r11
        L_0x0149:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018e
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x018e
            r1 = 0
        L_0x0152:
            r20.zzg()
            r2 = 20
            com.google.android.gms.measurement.internal.zzek r5 = com.google.android.gms.measurement.internal.zzel.zzB
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11 = 0
            int r5 = java.lang.Math.max(r11, r5)
            int r2 = java.lang.Math.min(r2, r5)
            if (r1 >= r2) goto L_0x0114
            r20.zzg()
            com.google.android.gms.measurement.internal.zzek r2 = com.google.android.gms.measurement.internal.zzel.zzA
            java.lang.Object r2 = r2.zza(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            r12 = 1
            long r12 = r12 << r1
            long r5 = r5 * r12
            long r7 = r7 + r5
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x018e
            int r1 = r1 + 1
            goto L_0x0152
        L_0x018e:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0237
            com.google.android.gms.measurement.internal.zzfe r1 = r0.zzd
            zzak(r1)
            boolean r1 = r1.zza()
            if (r1 == 0) goto L_0x021a
            com.google.android.gms.measurement.internal.zzkd r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzfj r1 = r1.zzb
            long r1 = r1.zza()
            r20.zzg()
            com.google.android.gms.measurement.internal.zzek r5 = com.google.android.gms.measurement.internal.zzel.zzq
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzlk r9 = r0.zzi
            zzak(r9)
            boolean r9 = r9.zzw(r1, r5)
            if (r9 != 0) goto L_0x01c9
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x01c9:
            com.google.android.gms.measurement.internal.zzfg r1 = r20.zzm()
            r1.zzc()
            com.google.android.gms.common.util.Clock r1 = r20.zzaw()
            long r1 = r1.currentTimeMillis()
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0200
            r20.zzg()
            com.google.android.gms.measurement.internal.zzek r1 = com.google.android.gms.measurement.internal.zzel.zzv
            r2 = 0
            java.lang.Object r1 = r1.zza(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.zzkd r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzfj r1 = r1.zzc
            com.google.android.gms.common.util.Clock r2 = r20.zzaw()
            long r2 = r2.currentTimeMillis()
            r1.zzb(r2)
        L_0x0200:
            com.google.android.gms.measurement.internal.zzey r1 = r20.zzaz()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzj()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.zzb(r3, r2)
            com.google.android.gms.measurement.internal.zzku r1 = r0.zzg
            zzak(r1)
            r1.zzd(r7)
            return
        L_0x021a:
            com.google.android.gms.measurement.internal.zzey r1 = r20.zzaz()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzj()
            java.lang.String r2 = "No network"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfg r1 = r20.zzm()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzku r1 = r0.zzg
            zzak(r1)
            r1.zza()
            return
        L_0x0237:
            com.google.android.gms.measurement.internal.zzey r1 = r20.zzaz()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzj()
            java.lang.String r2 = "Next upload time is 0"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfg r1 = r20.zzm()
            r1.zzc()
            com.google.android.gms.measurement.internal.zzku r1 = r0.zzg
            zzak(r1)
            r1.zza()
            return
        L_0x0254:
            com.google.android.gms.measurement.internal.zzey r1 = r20.zzaz()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzj()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfg r1 = r20.zzm()
            r1.zzc()
            com.google.android.gms.measurement.internal.zzku r1 = r0.zzg
            zzak(r1)
            r1.zza()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzli.zzaf():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0b7e, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.zzaf.zzA() + r8)) goto L_0x0b80;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03a7 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x046b A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04c5 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x081f A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0868 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x088b A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0902 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0904 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x090c A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0938 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0b6e A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0bf5 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0c11 A[Catch:{ SQLiteException -> 0x0c29 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x01e4=Splitter:B:69:0x01e4, B:420:0x0d05=Splitter:B:420:0x0d05} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzag(java.lang.String r42, long r43) {
        /*
            r41 = this;
            r1 = r41
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            com.google.android.gms.measurement.internal.zzal r4 = r1.zze
            zzak(r4)
            r4.zzw()
            com.google.android.gms.measurement.internal.zzlf r4 = new com.google.android.gms.measurement.internal.zzlf     // Catch:{ all -> 0x0d17 }
            r12 = 0
            r4.<init>(r1, r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzal r5 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r5)     // Catch:{ all -> 0x0d17 }
            r6 = 0
            long r9 = r1.zzA     // Catch:{ all -> 0x0d17 }
            r7 = r43
            r11 = r4
            r5.zzU(r6, r7, r9, r11)     // Catch:{ all -> 0x0d17 }
            java.util.List r5 = r4.zzc     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0d05
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x002e
            goto L_0x0d05
        L_0x002e:
            com.google.android.gms.internal.measurement.zzgc r5 = r4.zza     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzjy r5 = r5.zzbB()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgb r5 = (com.google.android.gms.internal.measurement.zzgb) r5     // Catch:{ all -> 0x0d17 }
            r5.zzr()     // Catch:{ all -> 0x0d17 }
            r10 = r12
            r13 = r10
            r8 = 0
            r9 = 0
            r11 = -1
            r14 = -1
            r15 = 0
        L_0x0040:
            java.util.List r12 = r4.zzc     // Catch:{ all -> 0x0d17 }
            int r12 = r12.size()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "_fr"
            java.lang.String r7 = "_et"
            r16 = r15
            java.lang.String r15 = "_e"
            r17 = r2
            r18 = r3
            if (r8 >= r12) goto L_0x0543
            java.util.List r3 = r4.zzc     // Catch:{ all -> 0x0d17 }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r3 = (com.google.android.gms.internal.measurement.zzfs) r3     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzjy r3 = r3.zzbB()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfr r3 = (com.google.android.gms.internal.measurement.zzfr) r3     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfz r12 = r1.zzc     // Catch:{ all -> 0x0d17 }
            zzak(r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r2 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r2.zzy()     // Catch:{ all -> 0x0d17 }
            r20 = r9
            java.lang.String r9 = r3.zzo()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r12.zzr(r2, r9)     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = "_err"
            if (r2 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.zzey r2 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzk()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.zzgc r7 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzey.zzn(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzgi r12 = r1.zzn     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzet r12 = r12.zzj()     // Catch:{ all -> 0x0d17 }
            java.lang.String r15 = r3.zzo()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.zzd(r15)     // Catch:{ all -> 0x0d17 }
            r2.zzc(r6, r7, r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfz r2 = r1.zzc     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r6 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.zzy()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.zzp(r6)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.zzfz r2 = r1.zzc     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r6 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.zzy()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.zzs(r6)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x00c3
            goto L_0x00e8
        L_0x00c3:
            java.lang.String r2 = r3.zzo()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.zzlp r21 = r41.zzv()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzlo r2 = r1.zzF     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r6 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r23 = r6.zzy()     // Catch:{ all -> 0x0d17 }
            r24 = 11
            java.lang.String r25 = "_ev"
            java.lang.String r26 = r3.zzo()     // Catch:{ all -> 0x0d17 }
            r27 = 0
            r22 = r2
            r21.zzN(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0d17 }
        L_0x00e8:
            r7 = r8
            r23 = r10
            r15 = r16
            r9 = r20
            r10 = r5
            r5 = -1
            goto L_0x0538
        L_0x00f3:
            java.lang.String r2 = r3.zzo()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = com.google.android.gms.measurement.internal.zzhf.zza(r18)     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x016d
            r2 = r18
            r3.zzi(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzey r12 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r12 = r12.zzj()     // Catch:{ all -> 0x0d17 }
            r18 = r2
            java.lang.String r2 = "Renaming ad_impression to _ai"
            r12.zza(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzey r2 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r2.zzq()     // Catch:{ all -> 0x0d17 }
            r12 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r12)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x016d
            r2 = 0
        L_0x0125:
            int r12 = r3.zza()     // Catch:{ all -> 0x0d17 }
            if (r2 >= r12) goto L_0x016d
            java.lang.String r12 = "ad_platform"
            com.google.android.gms.internal.measurement.zzfw r21 = r3.zzn(r2)     // Catch:{ all -> 0x0d17 }
            r22 = r8
            java.lang.String r8 = r21.zzg()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.internal.measurement.zzfw r8 = r3.zzn(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r8.zzh()     // Catch:{ all -> 0x0d17 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0d17 }
            if (r8 != 0) goto L_0x0168
            java.lang.String r8 = "admob"
            com.google.android.gms.internal.measurement.zzfw r12 = r3.zzn(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.zzh()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r8.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.measurement.internal.zzey r8 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzl()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "AdMob ad impression logged from app. Potentially duplicative."
            r8.zza(r12)     // Catch:{ all -> 0x0d17 }
        L_0x0168:
            int r2 = r2 + 1
            r8 = r22
            goto L_0x0125
        L_0x016d:
            r22 = r8
            com.google.android.gms.measurement.internal.zzfz r2 = r1.zzc     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r8 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r8.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r3.zzo()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.zzq(r8, r12)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = "_c"
            if (r2 != 0) goto L_0x01db
            com.google.android.gms.measurement.internal.zzlk r12 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r12)     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r3.zzo()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)     // Catch:{ all -> 0x0d17 }
            r21 = r11
            int r11 = r12.hashCode()     // Catch:{ all -> 0x0d17 }
            r23 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r11 == r10) goto L_0x01be
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r11 == r10) goto L_0x01b4
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r10) goto L_0x01aa
            goto L_0x01c8
        L_0x01aa:
            java.lang.String r10 = "_ui"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 1
            goto L_0x01c9
        L_0x01b4:
            java.lang.String r10 = "_ug"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 2
            goto L_0x01c9
        L_0x01be:
            java.lang.String r10 = "_in"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 0
            goto L_0x01c9
        L_0x01c8:
            r10 = -1
        L_0x01c9:
            if (r10 == 0) goto L_0x01df
            r11 = 1
            if (r10 == r11) goto L_0x01df
            r11 = 2
            if (r10 == r11) goto L_0x01df
            r25 = r5
            r24 = r7
            r7 = r13
            r19 = r14
            r2 = 0
            goto L_0x03a5
        L_0x01db:
            r23 = r10
            r21 = r11
        L_0x01df:
            r24 = r7
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x01e4:
            int r7 = r3.zza()     // Catch:{ all -> 0x0d17 }
            r25 = r5
            java.lang.String r5 = "_r"
            if (r10 >= r7) goto L_0x024b
            com.google.android.gms.internal.measurement.zzfw r7 = r3.zzn(r10)     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.zzg()     // Catch:{ all -> 0x0d17 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x0219
            com.google.android.gms.internal.measurement.zzfw r5 = r3.zzn(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzjy r5 = r5.zzbB()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfv r5 = (com.google.android.gms.internal.measurement.zzfv) r5     // Catch:{ all -> 0x0d17 }
            r7 = r13
            r19 = r14
            r13 = 1
            r5.zzi(r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r5 = r5.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d17 }
            r3.zzk(r10, r5)     // Catch:{ all -> 0x0d17 }
            r11 = 1
            goto L_0x0243
        L_0x0219:
            r7 = r13
            r19 = r14
            com.google.android.gms.internal.measurement.zzfw r13 = r3.zzn(r10)     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r13.zzg()     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.equals(r13)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0243
            com.google.android.gms.internal.measurement.zzfw r5 = r3.zzn(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzjy r5 = r5.zzbB()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfv r5 = (com.google.android.gms.internal.measurement.zzfv) r5     // Catch:{ all -> 0x0d17 }
            r12 = 1
            r5.zzi(r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r5 = r5.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d17 }
            r3.zzk(r10, r5)     // Catch:{ all -> 0x0d17 }
            r12 = 1
        L_0x0243:
            int r10 = r10 + 1
            r13 = r7
            r14 = r19
            r5 = r25
            goto L_0x01e4
        L_0x024b:
            r7 = r13
            r19 = r14
            if (r11 != 0) goto L_0x027c
            if (r2 == 0) goto L_0x027c
            com.google.android.gms.measurement.internal.zzey r10 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r10 = r10.zzj()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.zzgi r13 = r1.zzn     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzet r13 = r13.zzj()     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = r3.zzo()     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r13.zzd(r14)     // Catch:{ all -> 0x0d17 }
            r10.zzb(r11, r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfv r10 = com.google.android.gms.internal.measurement.zzfw.zze()     // Catch:{ all -> 0x0d17 }
            r10.zzj(r8)     // Catch:{ all -> 0x0d17 }
            r13 = 1
            r10.zzi(r13)     // Catch:{ all -> 0x0d17 }
            r3.zze(r10)     // Catch:{ all -> 0x0d17 }
        L_0x027c:
            if (r12 != 0) goto L_0x02a8
            com.google.android.gms.measurement.internal.zzey r10 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r10 = r10.zzj()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.zzgi r12 = r1.zzn     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzet r12 = r12.zzj()     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r3.zzo()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.zzd(r13)     // Catch:{ all -> 0x0d17 }
            r10.zzb(r11, r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfv r10 = com.google.android.gms.internal.measurement.zzfw.zze()     // Catch:{ all -> 0x0d17 }
            r10.zzj(r5)     // Catch:{ all -> 0x0d17 }
            r11 = 1
            r10.zzi(r11)     // Catch:{ all -> 0x0d17 }
            r3.zze(r10)     // Catch:{ all -> 0x0d17 }
        L_0x02a8:
            com.google.android.gms.measurement.internal.zzal r10 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r10)     // Catch:{ all -> 0x0d17 }
            long r27 = r41.zza()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r11 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r29 = r11.zzy()     // Catch:{ all -> 0x0d17 }
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r26 = r10
            com.google.android.gms.measurement.internal.zzaj r10 = r26.zzl(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d17 }
            long r10 = r10.zze     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzaf r12 = r41.zzg()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r13 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r13.zzy()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzek r14 = com.google.android.gms.measurement.internal.zzel.zzn     // Catch:{ all -> 0x0d17 }
            int r12 = r12.zze(r13, r14)     // Catch:{ all -> 0x0d17 }
            long r12 = (long) r12     // Catch:{ all -> 0x0d17 }
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x02e2
            zzaa(r3, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x02e4
        L_0x02e2:
            r16 = 1
        L_0x02e4:
            java.lang.String r5 = r3.zzo()     // Catch:{ all -> 0x0d17 }
            boolean r5 = com.google.android.gms.measurement.internal.zzlp.zzai(r5)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x03a5
            if (r2 == 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.zzal r5 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r5)     // Catch:{ all -> 0x0d17 }
            long r27 = r41.zza()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r10 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r29 = r10.zzy()     // Catch:{ all -> 0x0d17 }
            r30 = 0
            r31 = 0
            r32 = 1
            r33 = 0
            r34 = 0
            r26 = r5
            com.google.android.gms.measurement.internal.zzaj r5 = r26.zzl(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d17 }
            long r10 = r5.zzc     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzaf r5 = r41.zzg()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r12 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.zzy()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzek r13 = com.google.android.gms.measurement.internal.zzel.zzm     // Catch:{ all -> 0x0d17 }
            int r5 = r5.zze(r12, r13)     // Catch:{ all -> 0x0d17 }
            long r12 = (long) r5     // Catch:{ all -> 0x0d17 }
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.zzey r5 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzk()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzgc r11 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzey.zzn(r11)     // Catch:{ all -> 0x0d17 }
            r5.zzb(r10, r11)     // Catch:{ all -> 0x0d17 }
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = -1
        L_0x0341:
            int r13 = r3.zza()     // Catch:{ all -> 0x0d17 }
            if (r10 >= r13) goto L_0x036b
            com.google.android.gms.internal.measurement.zzfw r13 = r3.zzn(r10)     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = r13.zzg()     // Catch:{ all -> 0x0d17 }
            boolean r14 = r8.equals(r14)     // Catch:{ all -> 0x0d17 }
            if (r14 == 0) goto L_0x035d
            com.google.android.gms.internal.measurement.zzjy r5 = r13.zzbB()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfv r5 = (com.google.android.gms.internal.measurement.zzfv) r5     // Catch:{ all -> 0x0d17 }
            r12 = r10
            goto L_0x0368
        L_0x035d:
            java.lang.String r13 = r13.zzg()     // Catch:{ all -> 0x0d17 }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x0368
            r11 = 1
        L_0x0368:
            int r10 = r10 + 1
            goto L_0x0341
        L_0x036b:
            if (r11 == 0) goto L_0x0374
            if (r5 == 0) goto L_0x0373
            r3.zzh(r12)     // Catch:{ all -> 0x0d17 }
            goto L_0x03a5
        L_0x0373:
            r5 = 0
        L_0x0374:
            if (r5 == 0) goto L_0x038e
            com.google.android.gms.internal.measurement.zzjy r5 = r5.zzau()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfv r5 = (com.google.android.gms.internal.measurement.zzfv) r5     // Catch:{ all -> 0x0d17 }
            r5.zzj(r9)     // Catch:{ all -> 0x0d17 }
            r9 = 10
            r5.zzi(r9)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r5 = r5.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d17 }
            r3.zzk(r12, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x03a5
        L_0x038e:
            com.google.android.gms.measurement.internal.zzey r5 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzd()     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzgc r10 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = r10.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzey.zzn(r10)     // Catch:{ all -> 0x0d17 }
            r5.zzb(r9, r10)     // Catch:{ all -> 0x0d17 }
        L_0x03a5:
            if (r2 == 0) goto L_0x045e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0d17 }
            java.util.List r5 = r3.zzp()     // Catch:{ all -> 0x0d17 }
            r2.<init>(r5)     // Catch:{ all -> 0x0d17 }
            r5 = 0
            r9 = -1
            r10 = -1
        L_0x03b3:
            int r11 = r2.size()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r5 >= r11) goto L_0x03e3
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r11 = (com.google.android.gms.internal.measurement.zzfw) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.zzg()     // Catch:{ all -> 0x0d17 }
            boolean r11 = r13.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x03cf
            r9 = r5
            goto L_0x03e0
        L_0x03cf:
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r11 = (com.google.android.gms.internal.measurement.zzfw) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.zzg()     // Catch:{ all -> 0x0d17 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x03e0
            r10 = r5
        L_0x03e0:
            int r5 = r5 + 1
            goto L_0x03b3
        L_0x03e3:
            r5 = -1
            if (r9 != r5) goto L_0x03e8
            goto L_0x045f
        L_0x03e8:
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.zzw()     // Catch:{ all -> 0x0d17 }
            if (r5 != 0) goto L_0x0419
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.zzu()     // Catch:{ all -> 0x0d17 }
            if (r5 != 0) goto L_0x0419
            com.google.android.gms.measurement.internal.zzey r2 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzl()     // Catch:{ all -> 0x0d17 }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.zza(r5)     // Catch:{ all -> 0x0d17 }
            r3.zzh(r9)     // Catch:{ all -> 0x0d17 }
            zzaa(r3, r8)     // Catch:{ all -> 0x0d17 }
            r2 = 18
            zzZ(r3, r2, r13)     // Catch:{ all -> 0x0d17 }
            goto L_0x045e
        L_0x0419:
            r5 = -1
            if (r10 != r5) goto L_0x041d
            goto L_0x0445
        L_0x041d:
            java.lang.Object r2 = r2.get(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r2 = (com.google.android.gms.internal.measurement.zzfw) r2     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r2.zzh()     // Catch:{ all -> 0x0d17 }
            int r10 = r2.length()     // Catch:{ all -> 0x0d17 }
            r11 = 3
            if (r10 != r11) goto L_0x0445
            r10 = 0
        L_0x042f:
            int r11 = r2.length()     // Catch:{ all -> 0x0d17 }
            if (r10 >= r11) goto L_0x045f
            int r11 = r2.codePointAt(r10)     // Catch:{ all -> 0x0d17 }
            boolean r13 = java.lang.Character.isLetter(r11)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x0445
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0d17 }
            int r10 = r10 + r11
            goto L_0x042f
        L_0x0445:
            com.google.android.gms.measurement.internal.zzey r2 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzl()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.zza(r10)     // Catch:{ all -> 0x0d17 }
            r3.zzh(r9)     // Catch:{ all -> 0x0d17 }
            zzaa(r3, r8)     // Catch:{ all -> 0x0d17 }
            r2 = 19
            zzZ(r3, r2, r12)     // Catch:{ all -> 0x0d17 }
            goto L_0x045f
        L_0x045e:
            r5 = -1
        L_0x045f:
            java.lang.String r2 = r3.zzo()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0d17 }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04c5
            com.google.android.gms.measurement.internal.zzlk r2 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r2 = r3.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r2 = com.google.android.gms.measurement.internal.zzlk.zzB(r2, r6)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x04c0
            if (r7 == 0) goto L_0x04b4
            long r10 = r7.zzc()     // Catch:{ all -> 0x0d17 }
            long r12 = r3.zzc()     // Catch:{ all -> 0x0d17 }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0d17 }
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x04b4
            com.google.android.gms.internal.measurement.zzjy r2 = r7.zzau()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfr r2 = (com.google.android.gms.internal.measurement.zzfr) r2     // Catch:{ all -> 0x0d17 }
            boolean r6 = r1.zzai(r3, r2)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x04a7
            r6 = r19
            r10 = r25
            r10.zzT(r6, r2)     // Catch:{ all -> 0x0d17 }
            r11 = r21
            r2 = 0
            r13 = 0
            goto L_0x04af
        L_0x04a7:
            r6 = r19
            r10 = r25
            r2 = r3
            r13 = r7
            r11 = r20
        L_0x04af:
            r23 = r2
            r14 = r6
            goto L_0x0524
        L_0x04b4:
            r6 = r19
            r10 = r25
            r23 = r3
            r14 = r6
            r13 = r7
            r11 = r20
            goto L_0x0524
        L_0x04c0:
            r6 = r19
            r10 = r25
            goto L_0x051f
        L_0x04c5:
            r6 = r19
            r10 = r25
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r3.zzo()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x051f
            com.google.android.gms.measurement.internal.zzlk r2 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r2 = r3.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d17 }
            r11 = r24
            com.google.android.gms.internal.measurement.zzfw r2 = com.google.android.gms.measurement.internal.zzlk.zzB(r2, r11)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x051f
            if (r23 == 0) goto L_0x0518
            long r11 = r23.zzc()     // Catch:{ all -> 0x0d17 }
            long r13 = r3.zzc()     // Catch:{ all -> 0x0d17 }
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0d17 }
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0518
            com.google.android.gms.internal.measurement.zzjy r2 = r23.zzau()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfr r2 = (com.google.android.gms.internal.measurement.zzfr) r2     // Catch:{ all -> 0x0d17 }
            boolean r7 = r1.zzai(r2, r3)     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x0511
            r8 = r21
            r10.zzT(r8, r2)     // Catch:{ all -> 0x0d17 }
            r14 = r6
            r2 = 0
            r23 = 0
            goto L_0x0516
        L_0x0511:
            r8 = r21
            r2 = r3
            r14 = r20
        L_0x0516:
            r13 = r2
            goto L_0x0523
        L_0x0518:
            r8 = r21
            r13 = r3
            r11 = r8
            r14 = r20
            goto L_0x0524
        L_0x051f:
            r8 = r21
            r14 = r6
            r13 = r7
        L_0x0523:
            r11 = r8
        L_0x0524:
            java.util.List r2 = r4.zzc     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r6 = r3.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r6 = (com.google.android.gms.internal.measurement.zzfs) r6     // Catch:{ all -> 0x0d17 }
            r7 = r22
            r2.set(r7, r6)     // Catch:{ all -> 0x0d17 }
            int r9 = r20 + 1
            r10.zzk(r3)     // Catch:{ all -> 0x0d17 }
            r15 = r16
        L_0x0538:
            int r8 = r7 + 1
            r5 = r10
            r2 = r17
            r3 = r18
            r10 = r23
            goto L_0x0040
        L_0x0543:
            r10 = r5
            r11 = r7
            r20 = r9
            r2 = 0
            r7 = r2
            r5 = 0
        L_0x054b:
            if (r5 >= r9) goto L_0x059b
            com.google.android.gms.internal.measurement.zzfs r12 = r10.zze(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r12.zzh()     // Catch:{ all -> 0x0d17 }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x056e
            com.google.android.gms.measurement.internal.zzlk r13 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r13 = com.google.android.gms.measurement.internal.zzlk.zzB(r12, r6)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x056e
            r10.zzA(r5)     // Catch:{ all -> 0x0d17 }
            int r9 = r9 + -1
            int r5 = r5 + -1
            goto L_0x0598
        L_0x056e:
            com.google.android.gms.measurement.internal.zzlk r13 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r12 = com.google.android.gms.measurement.internal.zzlk.zzB(r12, r11)     // Catch:{ all -> 0x0d17 }
            if (r12 == 0) goto L_0x0598
            boolean r13 = r12.zzw()     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x0588
            long r12 = r12.zzd()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d17 }
            goto L_0x0589
        L_0x0588:
            r12 = 0
        L_0x0589:
            if (r12 == 0) goto L_0x0598
            long r13 = r12.longValue()     // Catch:{ all -> 0x0d17 }
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0598
            long r12 = r12.longValue()     // Catch:{ all -> 0x0d17 }
            long r7 = r7 + r12
        L_0x0598:
            r12 = 1
            int r5 = r5 + r12
            goto L_0x054b
        L_0x059b:
            r5 = 0
            r1.zzae(r10, r7, r5)     // Catch:{ all -> 0x0d17 }
            java.util.List r5 = r10.zzas()     // Catch:{ all -> 0x0d17 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0d17 }
        L_0x05a7:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = "_se"
            if (r6 == 0) goto L_0x05cd
            java.lang.String r6 = "_s"
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r11 = (com.google.android.gms.internal.measurement.zzfs) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.zzh()     // Catch:{ all -> 0x0d17 }
            boolean r6 = r6.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x05a7
            com.google.android.gms.measurement.internal.zzal r5 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r10.zzaq()     // Catch:{ all -> 0x0d17 }
            r5.zzA(r6, r9)     // Catch:{ all -> 0x0d17 }
        L_0x05cd:
            java.lang.String r5 = "_sid"
            int r5 = com.google.android.gms.measurement.internal.zzlk.zza(r10, r5)     // Catch:{ all -> 0x0d17 }
            if (r5 < 0) goto L_0x05da
            r5 = 1
            r1.zzae(r10, r7, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x05fa
        L_0x05da:
            int r5 = com.google.android.gms.measurement.internal.zzlk.zza(r10, r9)     // Catch:{ all -> 0x0d17 }
            if (r5 < 0) goto L_0x05fa
            r10.zzB(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzey r5 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzd()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzgc r7 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzey.zzn(r7)     // Catch:{ all -> 0x0d17 }
            r5.zzb(r6, r7)     // Catch:{ all -> 0x0d17 }
        L_0x05fa:
            com.google.android.gms.measurement.internal.zzlk r5 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzgi r6 = r5.zzs     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzey r6 = r6.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r6 = r6.zzj()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r6.zza(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzli r6 = r5.zzf     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfz r6 = r6.zzc     // Catch:{ all -> 0x0d17 }
            zzak(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r10.zzaq()     // Catch:{ all -> 0x0d17 }
            boolean r6 = r6.zzn(r7)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.zzli r6 = r5.zzf     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzal r6 = r6.zze     // Catch:{ all -> 0x0d17 }
            zzak(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r10.zzaq()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzg r6 = r6.zzj(r7)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            boolean r6 = r6.zzai()     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.zzgi r6 = r5.zzs     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzap r6 = r6.zzg()     // Catch:{ all -> 0x0d17 }
            boolean r6 = r6.zze()     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.zzgi r6 = r5.zzs     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzey r6 = r6.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r6 = r6.zzc()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Turning off ad personalization due to account type"
            r6.zza(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgk r6 = com.google.android.gms.internal.measurement.zzgl.zzd()     // Catch:{ all -> 0x0d17 }
            r7 = r17
            r6.zzf(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzgi r5 = r5.zzs     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzap r5 = r5.zzg()     // Catch:{ all -> 0x0d17 }
            long r8 = r5.zza()     // Catch:{ all -> 0x0d17 }
            r6.zzg(r8)     // Catch:{ all -> 0x0d17 }
            r8 = 1
            r6.zze(r8)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r5 = r6.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgl r5 = (com.google.android.gms.internal.measurement.zzgl) r5     // Catch:{ all -> 0x0d17 }
            r6 = 0
        L_0x0673:
            int r8 = r10.zzb()     // Catch:{ all -> 0x0d17 }
            if (r6 >= r8) goto L_0x068e
            com.google.android.gms.internal.measurement.zzgl r8 = r10.zzap(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r8.zzf()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x068b
            r10.zzan(r6, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x0691
        L_0x068b:
            int r6 = r6 + 1
            goto L_0x0673
        L_0x068e:
            r10.zzm(r5)     // Catch:{ all -> 0x0d17 }
        L_0x0691:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10.zzaj(r5)     // Catch:{ all -> 0x0d17 }
            r5 = -9223372036854775808
            r10.zzR(r5)     // Catch:{ all -> 0x0d17 }
            r5 = 0
        L_0x069f:
            int r6 = r10.zza()     // Catch:{ all -> 0x0d17 }
            if (r5 >= r6) goto L_0x06d2
            com.google.android.gms.internal.measurement.zzfs r6 = r10.zze(r5)     // Catch:{ all -> 0x0d17 }
            long r7 = r6.zzd()     // Catch:{ all -> 0x0d17 }
            long r11 = r10.zzd()     // Catch:{ all -> 0x0d17 }
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x06bc
            long r7 = r6.zzd()     // Catch:{ all -> 0x0d17 }
            r10.zzaj(r7)     // Catch:{ all -> 0x0d17 }
        L_0x06bc:
            long r7 = r6.zzd()     // Catch:{ all -> 0x0d17 }
            long r11 = r10.zzc()     // Catch:{ all -> 0x0d17 }
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x06cf
            long r6 = r6.zzd()     // Catch:{ all -> 0x0d17 }
            r10.zzR(r6)     // Catch:{ all -> 0x0d17 }
        L_0x06cf:
            int r5 = r5 + 1
            goto L_0x069f
        L_0x06d2:
            r10.zzz()     // Catch:{ all -> 0x0d17 }
            r10.zzo()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzz r5 = r1.zzh     // Catch:{ all -> 0x0d17 }
            zzak(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.String r21 = r10.zzaq()     // Catch:{ all -> 0x0d17 }
            java.util.List r22 = r10.zzas()     // Catch:{ all -> 0x0d17 }
            java.util.List r23 = r10.zzat()     // Catch:{ all -> 0x0d17 }
            long r6 = r10.zzd()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r24 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d17 }
            long r6 = r10.zzc()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r25 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d17 }
            r20 = r5
            java.util.List r5 = r20.zza(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0d17 }
            r10.zzf(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzaf r5 = r41.zzg()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r6 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.zzy()     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.zzw(r6)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0a51
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0d17 }
            r5.<init>()     // Catch:{ all -> 0x0d17 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0d17 }
            r6.<init>()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzlp r7 = r41.zzv()     // Catch:{ all -> 0x0d17 }
            java.security.SecureRandom r7 = r7.zzG()     // Catch:{ all -> 0x0d17 }
            r8 = 0
        L_0x0725:
            int r9 = r10.zza()     // Catch:{ all -> 0x0d17 }
            if (r8 >= r9) goto L_0x0a17
            com.google.android.gms.internal.measurement.zzfs r9 = r10.zze(r8)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzjy r9 = r9.zzbB()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfr r9 = (com.google.android.gms.internal.measurement.zzfr) r9     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r9.zzo()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r11 == 0) goto L_0x07c8
            com.google.android.gms.measurement.internal.zzlk r11 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r11)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r11 = r9.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r11 = (com.google.android.gms.internal.measurement.zzfs) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzlk.zzC(r11, r14)     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0d17 }
            java.lang.Object r14 = r5.get(r11)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzar r14 = (com.google.android.gms.measurement.internal.zzar) r14     // Catch:{ all -> 0x0d17 }
            if (r14 != 0) goto L_0x077c
            com.google.android.gms.measurement.internal.zzal r14 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r14)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r15 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r15 = r15.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r17 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0d17 }
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzar r14 = r14.zzn(r15, r2)     // Catch:{ all -> 0x0d17 }
            if (r14 == 0) goto L_0x077c
            r5.put(r11, r14)     // Catch:{ all -> 0x0d17 }
        L_0x077c:
            if (r14 == 0) goto L_0x07bb
            java.lang.Long r2 = r14.zzi     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x07bb
            java.lang.Long r2 = r14.zzj     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x079a
            long r2 = r2.longValue()     // Catch:{ all -> 0x0d17 }
            r17 = 1
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x079a
            com.google.android.gms.measurement.internal.zzlk r2 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = r14.zzj     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzlk.zzz(r9, r13, r2)     // Catch:{ all -> 0x0d17 }
        L_0x079a:
            java.lang.Boolean r2 = r14.zzk     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x07b2
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x07b2
            com.google.android.gms.measurement.internal.zzlk r2 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            r2 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzlk.zzz(r9, r12, r11)     // Catch:{ all -> 0x0d17 }
        L_0x07b2:
            com.google.android.gms.internal.measurement.zzkc r2 = r9.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d17 }
            r6.add(r2)     // Catch:{ all -> 0x0d17 }
        L_0x07bb:
            r10.zzT(r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x07be:
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a0b
        L_0x07c8:
            com.google.android.gms.measurement.internal.zzfz r2 = r1.zzc     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r3 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r3 = r3.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r11 = r2.zza(r3, r11)     // Catch:{ all -> 0x0d17 }
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0d17 }
            if (r14 != 0) goto L_0x07f9
            long r2 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x07e4 }
            goto L_0x07fb
        L_0x07e4:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.zzgi r2 = r2.zzs     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzk()     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzey.zzn(r3)     // Catch:{ all -> 0x0d17 }
            r2.zzc(r14, r3, r11)     // Catch:{ all -> 0x0d17 }
        L_0x07f9:
            r2 = 0
        L_0x07fb:
            com.google.android.gms.measurement.internal.zzlp r11 = r41.zzv()     // Catch:{ all -> 0x0d17 }
            long r14 = r9.zzc()     // Catch:{ all -> 0x0d17 }
            long r14 = r11.zzr(r14, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r11 = r9.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r11 = (com.google.android.gms.internal.measurement.zzfs) r11     // Catch:{ all -> 0x0d17 }
            r44 = r12
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0d17 }
            r17 = r2
            java.lang.String r2 = "_dbg"
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0d17 }
            if (r3 != 0) goto L_0x0853
            java.util.List r3 = r11.zzi()     // Catch:{ all -> 0x0d17 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d17 }
        L_0x0827:
            boolean r11 = r3.hasNext()     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x0853
            java.lang.Object r11 = r3.next()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r11 = (com.google.android.gms.internal.measurement.zzfw) r11     // Catch:{ all -> 0x0d17 }
            r22 = r3
            java.lang.String r3 = r11.zzg()     // Catch:{ all -> 0x0d17 }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0d17 }
            if (r3 == 0) goto L_0x0850
            long r2 = r11.zzd()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d17 }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x084e
            goto L_0x0853
        L_0x084e:
            r2 = 1
            goto L_0x0866
        L_0x0850:
            r3 = r22
            goto L_0x0827
        L_0x0853:
            com.google.android.gms.measurement.internal.zzfz r2 = r1.zzc     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r3 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r3 = r3.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r9.zzo()     // Catch:{ all -> 0x0d17 }
            int r2 = r2.zzc(r3, r11)     // Catch:{ all -> 0x0d17 }
        L_0x0866:
            if (r2 > 0) goto L_0x088b
            com.google.android.gms.measurement.internal.zzey r3 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzk()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r9.zzo()     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d17 }
            r3.zzc(r11, r12, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r2 = r9.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d17 }
            r6.add(r2)     // Catch:{ all -> 0x0d17 }
            r10.zzT(r8, r9)     // Catch:{ all -> 0x0d17 }
            goto L_0x07be
        L_0x088b:
            java.lang.String r3 = r9.zzo()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzar r3 = (com.google.android.gms.measurement.internal.zzar) r3     // Catch:{ all -> 0x0d17 }
            if (r3 != 0) goto L_0x08eb
            com.google.android.gms.measurement.internal.zzal r3 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r3)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r11 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r9.zzo()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzar r3 = r3.zzn(r11, r12)     // Catch:{ all -> 0x0d17 }
            if (r3 != 0) goto L_0x08eb
            com.google.android.gms.measurement.internal.zzey r3 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzk()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzgc r12 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.zzy()     // Catch:{ all -> 0x0d17 }
            r22 = r14
            java.lang.String r14 = r9.zzo()     // Catch:{ all -> 0x0d17 }
            r3.zzc(r11, r12, r14)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzar r3 = new com.google.android.gms.measurement.internal.zzar     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r11 = r4.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r25 = r11.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.String r26 = r9.zzo()     // Catch:{ all -> 0x0d17 }
            r27 = 1
            r29 = 1
            r31 = 1
            long r33 = r9.zzc()     // Catch:{ all -> 0x0d17 }
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r24 = r3
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch:{ all -> 0x0d17 }
            goto L_0x08ed
        L_0x08eb:
            r22 = r14
        L_0x08ed:
            com.google.android.gms.measurement.internal.zzlk r11 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r11)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r11 = r9.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r11 = (com.google.android.gms.internal.measurement.zzfs) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "_eid"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzlk.zzC(r11, r12)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x0904
            r12 = 1
            goto L_0x0905
        L_0x0904:
            r12 = 0
        L_0x0905:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0d17 }
            r14 = 1
            if (r2 != r14) goto L_0x0938
            com.google.android.gms.internal.measurement.zzkc r2 = r9.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d17 }
            r6.add(r2)     // Catch:{ all -> 0x0d17 }
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x0933
            java.lang.Long r2 = r3.zzi     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x0927
            java.lang.Long r2 = r3.zzj     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x0927
            java.lang.Boolean r2 = r3.zzk     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x0933
        L_0x0927:
            r2 = 0
            com.google.android.gms.measurement.internal.zzar r3 = r3.zza(r2, r2, r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r9.zzo()     // Catch:{ all -> 0x0d17 }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0933:
            r10.zzT(r8, r9)     // Catch:{ all -> 0x0d17 }
            goto L_0x07be
        L_0x0938:
            int r14 = r7.nextInt(r2)     // Catch:{ all -> 0x0d17 }
            if (r14 != 0) goto L_0x097a
            com.google.android.gms.measurement.internal.zzlk r11 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r11)     // Catch:{ all -> 0x0d17 }
            long r14 = (long) r2     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzlk.zzz(r9, r13, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r11 = r9.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r11 = (com.google.android.gms.internal.measurement.zzfs) r11     // Catch:{ all -> 0x0d17 }
            r6.add(r11)     // Catch:{ all -> 0x0d17 }
            boolean r11 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x095f
            r11 = 0
            com.google.android.gms.measurement.internal.zzar r3 = r3.zza(r11, r2, r11)     // Catch:{ all -> 0x0d17 }
        L_0x095f:
            java.lang.String r2 = r9.zzo()     // Catch:{ all -> 0x0d17 }
            long r11 = r9.zzc()     // Catch:{ all -> 0x0d17 }
            r14 = r22
            com.google.android.gms.measurement.internal.zzar r3 = r3.zzb(r11, r14)     // Catch:{ all -> 0x0d17 }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d17 }
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a08
        L_0x097a:
            r14 = r22
            r22 = r7
            java.lang.Long r7 = r3.zzh     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x098f
            long r17 = r7.longValue()     // Catch:{ all -> 0x0d17 }
            r24 = r4
            r26 = r5
            r25 = r10
            r23 = r11
            goto L_0x09a5
        L_0x098f:
            com.google.android.gms.measurement.internal.zzlp r7 = r41.zzv()     // Catch:{ all -> 0x0d17 }
            r25 = r10
            r23 = r11
            long r10 = r9.zzb()     // Catch:{ all -> 0x0d17 }
            r24 = r4
            r26 = r5
            r4 = r17
            long r17 = r7.zzr(r10, r4)     // Catch:{ all -> 0x0d17 }
        L_0x09a5:
            int r4 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x09ee
            com.google.android.gms.measurement.internal.zzlk r4 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r4)     // Catch:{ all -> 0x0d17 }
            r4 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d17 }
            r10 = r44
            com.google.android.gms.measurement.internal.zzlk.zzz(r9, r10, r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzlk r7 = r1.zzi     // Catch:{ all -> 0x0d17 }
            zzak(r7)     // Catch:{ all -> 0x0d17 }
            long r10 = (long) r2     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzlk.zzz(r9, r13, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r7 = r9.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r7 = (com.google.android.gms.internal.measurement.zzfs) r7     // Catch:{ all -> 0x0d17 }
            r6.add(r7)     // Catch:{ all -> 0x0d17 }
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x09dc
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d17 }
            r10 = 0
            com.google.android.gms.measurement.internal.zzar r3 = r3.zza(r10, r2, r7)     // Catch:{ all -> 0x0d17 }
        L_0x09dc:
            java.lang.String r2 = r9.zzo()     // Catch:{ all -> 0x0d17 }
            long r10 = r9.zzc()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzar r3 = r3.zzb(r10, r14)     // Catch:{ all -> 0x0d17 }
            r7 = r26
            r7.put(r2, r3)     // Catch:{ all -> 0x0d17 }
            goto L_0x0a06
        L_0x09ee:
            r7 = r26
            r4 = 1
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x0a06
            java.lang.String r2 = r9.zzo()     // Catch:{ all -> 0x0d17 }
            r11 = r23
            r10 = 0
            com.google.android.gms.measurement.internal.zzar r3 = r3.zza(r11, r10, r10)     // Catch:{ all -> 0x0d17 }
            r7.put(r2, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0a06:
            r2 = r25
        L_0x0a08:
            r2.zzT(r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x0a0b:
            int r8 = r8 + 1
            r10 = r2
            r5 = r7
            r7 = r22
            r4 = r24
            r2 = 0
            goto L_0x0725
        L_0x0a17:
            r24 = r4
            r7 = r5
            r2 = r10
            int r3 = r6.size()     // Catch:{ all -> 0x0d17 }
            int r4 = r2.zza()     // Catch:{ all -> 0x0d17 }
            if (r3 >= r4) goto L_0x0a2b
            r2.zzr()     // Catch:{ all -> 0x0d17 }
            r2.zzg(r6)     // Catch:{ all -> 0x0d17 }
        L_0x0a2b:
            java.util.Set r3 = r7.entrySet()     // Catch:{ all -> 0x0d17 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d17 }
        L_0x0a33:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0d17 }
            if (r4 == 0) goto L_0x0a4e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0d17 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzal r5 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzar r4 = (com.google.android.gms.measurement.internal.zzar) r4     // Catch:{ all -> 0x0d17 }
            r5.zzE(r4)     // Catch:{ all -> 0x0d17 }
            goto L_0x0a33
        L_0x0a4e:
            r3 = r24
            goto L_0x0a53
        L_0x0a51:
            r2 = r10
            r3 = r4
        L_0x0a53:
            com.google.android.gms.internal.measurement.zzgc r4 = r3.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r4 = r4.zzy()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzal r5 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzg r5 = r5.zzj(r4)     // Catch:{ all -> 0x0d17 }
            if (r5 != 0) goto L_0x0a7c
            com.google.android.gms.measurement.internal.zzey r5 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzd()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzgc r7 = r3.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzey.zzn(r7)     // Catch:{ all -> 0x0d17 }
            r5.zzb(r6, r7)     // Catch:{ all -> 0x0d17 }
            goto L_0x0ad8
        L_0x0a7c:
            int r6 = r2.zza()     // Catch:{ all -> 0x0d17 }
            if (r6 <= 0) goto L_0x0ad8
            long r6 = r5.zzn()     // Catch:{ all -> 0x0d17 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0a90
            r2.zzac(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0a93
        L_0x0a90:
            r2.zzv()     // Catch:{ all -> 0x0d17 }
        L_0x0a93:
            long r8 = r5.zzp()     // Catch:{ all -> 0x0d17 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0a9e
            goto L_0x0a9f
        L_0x0a9e:
            r6 = r8
        L_0x0a9f:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0aa7
            r2.zzad(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0aaa
        L_0x0aa7:
            r2.zzw()     // Catch:{ all -> 0x0d17 }
        L_0x0aaa:
            r5.zzE()     // Catch:{ all -> 0x0d17 }
            long r6 = r5.zzo()     // Catch:{ all -> 0x0d17 }
            int r6 = (int) r6     // Catch:{ all -> 0x0d17 }
            r2.zzJ(r6)     // Catch:{ all -> 0x0d17 }
            long r6 = r2.zzd()     // Catch:{ all -> 0x0d17 }
            r5.zzac(r6)     // Catch:{ all -> 0x0d17 }
            long r6 = r2.zzc()     // Catch:{ all -> 0x0d17 }
            r5.zzaa(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r5.zzs()     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0acd
            r2.zzX(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0ad0
        L_0x0acd:
            r2.zzs()     // Catch:{ all -> 0x0d17 }
        L_0x0ad0:
            com.google.android.gms.measurement.internal.zzal r6 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r6)     // Catch:{ all -> 0x0d17 }
            r6.zzD(r5)     // Catch:{ all -> 0x0d17 }
        L_0x0ad8:
            int r5 = r2.zza()     // Catch:{ all -> 0x0d17 }
            if (r5 <= 0) goto L_0x0c5c
            com.google.android.gms.measurement.internal.zzgi r5 = r1.zzn     // Catch:{ all -> 0x0d17 }
            r5.zzax()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfz r5 = r1.zzc     // Catch:{ all -> 0x0d17 }
            zzak(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r6 = r3.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.zzy()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfe r5 = r5.zze(r6)     // Catch:{ all -> 0x0d17 }
            r6 = -1
            if (r5 == 0) goto L_0x0b05
            boolean r8 = r5.zzs()     // Catch:{ all -> 0x0d17 }
            if (r8 != 0) goto L_0x0afd
            goto L_0x0b05
        L_0x0afd:
            long r8 = r5.zzc()     // Catch:{ all -> 0x0d17 }
            r2.zzL(r8)     // Catch:{ all -> 0x0d17 }
            goto L_0x0b2c
        L_0x0b05:
            com.google.android.gms.internal.measurement.zzgc r5 = r3.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r5 = r5.zzG()     // Catch:{ all -> 0x0d17 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0b15
            r2.zzL(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0b2c
        L_0x0b15:
            com.google.android.gms.measurement.internal.zzey r5 = r41.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzk()     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzgc r9 = r3.zza     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = r9.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzey.zzn(r9)     // Catch:{ all -> 0x0d17 }
            r5.zzb(r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x0b2c:
            com.google.android.gms.measurement.internal.zzal r5 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkc r2 = r2.zzaE()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r2 = (com.google.android.gms.internal.measurement.zzgc) r2     // Catch:{ all -> 0x0d17 }
            r5.zzg()     // Catch:{ all -> 0x0d17 }
            r5.zzW()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r2.zzy()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)     // Catch:{ all -> 0x0d17 }
            boolean r8 = r2.zzbh()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.Preconditions.checkState(r8)     // Catch:{ all -> 0x0d17 }
            r5.zzz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzgi r8 = r5.zzs     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.util.Clock r8 = r8.zzaw()     // Catch:{ all -> 0x0d17 }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x0d17 }
            long r10 = r2.zzm()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzgi r12 = r5.zzs     // Catch:{ all -> 0x0d17 }
            r12.zzf()     // Catch:{ all -> 0x0d17 }
            long r12 = com.google.android.gms.measurement.internal.zzaf.zzA()     // Catch:{ all -> 0x0d17 }
            long r12 = r8 - r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x0b80
            long r10 = r2.zzm()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzgi r12 = r5.zzs     // Catch:{ all -> 0x0d17 }
            r12.zzf()     // Catch:{ all -> 0x0d17 }
            long r12 = com.google.android.gms.measurement.internal.zzaf.zzA()     // Catch:{ all -> 0x0d17 }
            long r12 = r12 + r8
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0ba3
        L_0x0b80:
            com.google.android.gms.measurement.internal.zzgi r10 = r5.zzs     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzey r10 = r10.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r10 = r10.zzk()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r2.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzey.zzn(r12)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0d17 }
            long r13 = r2.zzm()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0d17 }
            r10.zzd(r11, r12, r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x0ba3:
            byte[] r8 = r2.zzby()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzli r9 = r5.zzf     // Catch:{ IOException -> 0x0c43 }
            com.google.android.gms.measurement.internal.zzlk r9 = r9.zzi     // Catch:{ IOException -> 0x0c43 }
            zzak(r9)     // Catch:{ IOException -> 0x0c43 }
            byte[] r8 = r9.zzy(r8)     // Catch:{ IOException -> 0x0c43 }
            com.google.android.gms.measurement.internal.zzgi r9 = r5.zzs     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzey r9 = r9.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r9 = r9.zzj()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0d17 }
            r9.zzb(r10, r11)     // Catch:{ all -> 0x0d17 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0d17 }
            r9.<init>()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r2.zzy()     // Catch:{ all -> 0x0d17 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r2.zzm()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d17 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0d17 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d17 }
            boolean r8 = r2.zzbn()     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x0c02
            java.lang.String r8 = "retry_count"
            int r10 = r2.zze()     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0d17 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d17 }
        L_0x0c02:
            android.database.sqlite.SQLiteDatabase r8 = r5.zzh()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0c29 }
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0c5c
            com.google.android.gms.measurement.internal.zzgi r6 = r5.zzs     // Catch:{ SQLiteException -> 0x0c29 }
            com.google.android.gms.measurement.internal.zzey r6 = r6.zzaz()     // Catch:{ SQLiteException -> 0x0c29 }
            com.google.android.gms.measurement.internal.zzew r6 = r6.zzd()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r2.zzy()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzey.zzn(r8)     // Catch:{ SQLiteException -> 0x0c29 }
            r6.zzb(r7, r8)     // Catch:{ SQLiteException -> 0x0c29 }
            goto L_0x0c5c
        L_0x0c29:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzgi r5 = r5.zzs     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzd()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r2 = r2.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzey.zzn(r2)     // Catch:{ all -> 0x0d17 }
            r5.zzc(r7, r2, r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0c5c
        L_0x0c43:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzgi r5 = r5.zzs     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzd()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r2 = r2.zzy()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzey.zzn(r2)     // Catch:{ all -> 0x0d17 }
            r5.zzc(r7, r2, r6)     // Catch:{ all -> 0x0d17 }
        L_0x0c5c:
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            java.util.List r3 = r3.zzb     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x0d17 }
            r2.zzg()     // Catch:{ all -> 0x0d17 }
            r2.zzW()     // Catch:{ all -> 0x0d17 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0d17 }
            r6 = 0
        L_0x0c74:
            int r7 = r3.size()     // Catch:{ all -> 0x0d17 }
            if (r6 >= r7) goto L_0x0c91
            if (r6 == 0) goto L_0x0c81
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0d17 }
        L_0x0c81:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d17 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d17 }
            r5.append(r7)     // Catch:{ all -> 0x0d17 }
            int r6 = r6 + 1
            goto L_0x0c74
        L_0x0c91:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0d17 }
            android.database.sqlite.SQLiteDatabase r6 = r2.zzh()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0d17 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0d17 }
            int r6 = r3.size()     // Catch:{ all -> 0x0d17 }
            if (r5 == r6) goto L_0x0cc6
            com.google.android.gms.measurement.internal.zzgi r2 = r2.zzs     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d17 }
            int r3 = r3.size()     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d17 }
            r2.zzc(r6, r5, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0cc6:
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            android.database.sqlite.SQLiteDatabase r3 = r2.zzh()     // Catch:{ all -> 0x0d17 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0cde }
            r6 = 0
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cde }
            r6 = 1
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cde }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r3.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0cde }
            goto L_0x0cf3
        L_0x0cde:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzgi r2 = r2.zzs     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x0d17 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r4)     // Catch:{ all -> 0x0d17 }
            r2.zzc(r5, r4, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0cf3:
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            r2.zzC()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze
            zzak(r2)
            r2.zzx()
            r2 = 1
            return r2
        L_0x0d05:
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x0d17 }
            zzak(r2)     // Catch:{ all -> 0x0d17 }
            r2.zzC()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze
            zzak(r2)
            r2.zzx()
            r2 = 0
            return r2
        L_0x0d17:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzal r3 = r1.zze
            zzak(r3)
            r3.zzx()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzli.zzag(java.lang.String, long):boolean");
    }

    private final boolean zzah() {
        zzaA().zzg();
        zzB();
        zzal zzal = this.zze;
        zzak(zzal);
        if (zzal.zzF()) {
            return true;
        }
        zzal zzal2 = this.zze;
        zzak(zzal2);
        return !TextUtils.isEmpty(zzal2.zzr());
    }

    private final boolean zzai(zzfr zzfr, zzfr zzfr2) {
        String str;
        Preconditions.checkArgument("_e".equals(zzfr.zzo()));
        zzak(this.zzi);
        zzfw zzB2 = zzlk.zzB((zzfs) zzfr.zzaE(), "_sc");
        String str2 = null;
        if (zzB2 == null) {
            str = null;
        } else {
            str = zzB2.zzh();
        }
        zzak(this.zzi);
        zzfw zzB3 = zzlk.zzB((zzfs) zzfr2.zzaE(), "_pc");
        if (zzB3 != null) {
            str2 = zzB3.zzh();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfr.zzo()));
        zzak(this.zzi);
        zzfw zzB4 = zzlk.zzB((zzfs) zzfr.zzaE(), "_et");
        if (zzB4 == null || !zzB4.zzw() || zzB4.zzd() <= 0) {
            return true;
        }
        long zzd2 = zzB4.zzd();
        zzak(this.zzi);
        zzfw zzB5 = zzlk.zzB((zzfs) zzfr2.zzaE(), "_et");
        if (zzB5 != null && zzB5.zzd() > 0) {
            zzd2 += zzB5.zzd();
        }
        zzak(this.zzi);
        zzlk.zzz(zzfr2, "_et", Long.valueOf(zzd2));
        zzak(this.zzi);
        zzlk.zzz(zzfr, "_fr", 1L);
        return true;
    }

    private static final boolean zzaj(zzp zzp2) {
        return !TextUtils.isEmpty(zzp2.zzb) || !TextUtils.isEmpty(zzp2.zzq);
    }

    private static final zzkw zzak(zzkw zzkw) {
        if (zzkw == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (zzkw.zzY()) {
            return zzkw;
        } else {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzkw.getClass())));
        }
    }

    public static zzli zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzli.class) {
                if (zzb == null) {
                    zzb = new zzli((zzlj) Preconditions.checkNotNull(new zzlj(context)), (zzgi) null);
                }
            }
        }
        return zzb;
    }

    public static /* bridge */ /* synthetic */ void zzy(zzli zzli, zzlj zzlj) {
        zzli.zzaA().zzg();
        zzli.zzm = new zzfq(zzli);
        zzal zzal = new zzal(zzli);
        zzal.zzX();
        zzli.zze = zzal;
        zzli.zzg().zzq((zzae) Preconditions.checkNotNull(zzli.zzc));
        zzkd zzkd = new zzkd(zzli);
        zzkd.zzX();
        zzli.zzk = zzkd;
        zzz zzz2 = new zzz(zzli);
        zzz2.zzX();
        zzli.zzh = zzz2;
        zzis zzis = new zzis(zzli);
        zzis.zzX();
        zzli.zzj = zzis;
        zzku zzku = new zzku(zzli);
        zzku.zzX();
        zzli.zzg = zzku;
        zzli.zzf = new zzfg(zzli);
        if (zzli.zzr != zzli.zzs) {
            zzli.zzaz().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzli.zzr), Integer.valueOf(zzli.zzs));
        }
        zzli.zzo = true;
    }

    @VisibleForTesting
    public final void zzA() {
        zzaA().zzg();
        zzB();
        if (!this.zzp) {
            this.zzp = true;
            if (zzY()) {
                FileChannel fileChannel = this.zzx;
                zzaA().zzg();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    zzaz().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            zzaz().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e10) {
                        zzaz().zzd().zzb("Failed to read from channel", e10);
                    }
                }
                int zzi2 = this.zzn.zzh().zzi();
                zzaA().zzg();
                if (i > zzi2) {
                    zzaz().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi2));
                } else if (i < zzi2) {
                    FileChannel fileChannel2 = this.zzx;
                    zzaA().zzg();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        zzaz().zzd().zza("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(zzi2);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                zzaz().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            zzaz().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi2));
                            return;
                        } catch (IOException e11) {
                            zzaz().zzd().zzb("Failed to write to channel", e11);
                        }
                    }
                    zzaz().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi2));
                }
            }
        }
    }

    public final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void zzC(zzg zzg2) {
        a aVar;
        a aVar2;
        zzaA().zzg();
        if (!TextUtils.isEmpty(zzg2.zzy()) || !TextUtils.isEmpty(zzg2.zzr())) {
            zzkx zzkx = this.zzl;
            Uri.Builder builder = new Uri.Builder();
            String zzy2 = zzg2.zzy();
            if (TextUtils.isEmpty(zzy2)) {
                zzy2 = zzg2.zzr();
            }
            a aVar3 = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) zzel.zzd.zza((Object) null)).encodedAuthority((String) zzel.zze.zza((Object) null)).path("config/app/".concat(String.valueOf(zzy2))).appendQueryParameter("platform", "android");
            zzkx.zzs.zzf().zzh();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(61000)).appendQueryParameter("runtime_version", "0");
            zzpg.zzc();
            if (!zzkx.zzs.zzf().zzs(zzg2.zzt(), zzel.zzaA)) {
                builder.appendQueryParameter("app_instance_id", zzg2.zzu());
            }
            String uri = builder.build().toString();
            try {
                String str = (String) Preconditions.checkNotNull(zzg2.zzt());
                URL url = new URL(uri);
                zzaz().zzj().zzb("Fetching remote configuration", str);
                zzfz zzfz = this.zzc;
                zzak(zzfz);
                zzfe zze2 = zzfz.zze(str);
                zzfz zzfz2 = this.zzc;
                zzak(zzfz2);
                String zzh2 = zzfz2.zzh(str);
                if (zze2 != null) {
                    if (!TextUtils.isEmpty(zzh2)) {
                        aVar2 = new a();
                        aVar2.put("If-Modified-Since", zzh2);
                    } else {
                        aVar2 = null;
                    }
                    zzpg.zzc();
                    if (zzg().zzs((String) null, zzel.zzaM)) {
                        zzfz zzfz3 = this.zzc;
                        zzak(zzfz3);
                        String zzf2 = zzfz3.zzf(str);
                        if (!TextUtils.isEmpty(zzf2)) {
                            if (aVar2 == null) {
                                aVar2 = new a();
                            }
                            aVar3 = aVar2;
                            aVar3.put("If-None-Match", zzf2);
                        }
                    }
                    aVar = aVar2;
                    this.zzt = true;
                    zzfe zzfe = this.zzd;
                    zzak(zzfe);
                    zzla zzla = new zzla(this);
                    zzfe.zzg();
                    zzfe.zzW();
                    Preconditions.checkNotNull(url);
                    Preconditions.checkNotNull(zzla);
                    zzfe.zzs.zzaA().zzo(new zzfd(zzfe, str, url, (byte[]) null, aVar, zzla));
                }
                aVar = aVar3;
                this.zzt = true;
                zzfe zzfe2 = this.zzd;
                zzak(zzfe2);
                zzla zzla2 = new zzla(this);
                zzfe2.zzg();
                zzfe2.zzW();
                Preconditions.checkNotNull(url);
                Preconditions.checkNotNull(zzla2);
                zzfe2.zzs.zzaA().zzo(new zzfd(zzfe2, str, url, (byte[]) null, aVar, zzla2));
            } catch (MalformedURLException unused) {
                zzaz().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzey.zzn(zzg2.zzt()), uri);
            }
        } else {
            zzH((String) Preconditions.checkNotNull(zzg2.zzt()), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    public final void zzD(zzav zzav, zzp zzp2) {
        zzav zzav2;
        List<zzab> list;
        List<zzab> list2;
        List<zzab> list3;
        String str;
        zzp zzp3 = zzp2;
        Preconditions.checkNotNull(zzp2);
        Preconditions.checkNotEmpty(zzp3.zza);
        zzaA().zzg();
        zzB();
        String str2 = zzp3.zza;
        zzav zzav3 = zzav;
        long j10 = zzav3.zzd;
        zzpm.zzc();
        zziu zziu = null;
        if (zzg().zzs((String) null, zzel.zzat)) {
            zzez zzb2 = zzez.zzb(zzav);
            zzaA().zzg();
            if (!(this.zzD == null || (str = this.zzE) == null || !str.equals(str2))) {
                zziu = this.zzD;
            }
            zzlp.zzK(zziu, zzb2.zzd, false);
            zzav3 = zzb2.zza();
        }
        zzak(this.zzi);
        if (zzlk.zzA(zzav3, zzp3)) {
            if (!zzp3.zzh) {
                zzd(zzp3);
                return;
            }
            List list4 = zzp3.zzt;
            if (list4 == null) {
                zzav2 = zzav3;
            } else if (list4.contains(zzav3.zza)) {
                Bundle zzc2 = zzav3.zzb.zzc();
                zzc2.putLong("ga_safelisted", 1);
                zzav2 = new zzav(zzav3.zza, new zzat(zzc2), zzav3.zzc, zzav3.zzd);
            } else {
                zzaz().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzav3.zza, zzav3.zzc);
                return;
            }
            zzal zzal = this.zze;
            zzak(zzal);
            zzal.zzw();
            try {
                zzal zzal2 = this.zze;
                zzak(zzal2);
                Preconditions.checkNotEmpty(str2);
                zzal2.zzg();
                zzal2.zzW();
                int i = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
                if (i < 0) {
                    zzal2.zzs.zzaz().zzk().zzc("Invalid time querying timed out conditional properties", zzey.zzn(str2), Long.valueOf(j10));
                    list = Collections.emptyList();
                } else {
                    list = zzal2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
                }
                for (zzab zzab : list) {
                    if (zzab != null) {
                        zzaz().zzj().zzd("User property timed out", zzab.zza, this.zzn.zzj().zzf(zzab.zzc.zzb), zzab.zzc.zza());
                        zzav zzav4 = zzab.zzg;
                        if (zzav4 != null) {
                            zzX(new zzav(zzav4, j10), zzp3);
                        }
                        zzal zzal3 = this.zze;
                        zzak(zzal3);
                        zzal3.zza(str2, zzab.zzc.zzb);
                    }
                }
                zzal zzal4 = this.zze;
                zzak(zzal4);
                Preconditions.checkNotEmpty(str2);
                zzal4.zzg();
                zzal4.zzW();
                if (i < 0) {
                    zzal4.zzs.zzaz().zzk().zzc("Invalid time querying expired conditional properties", zzey.zzn(str2), Long.valueOf(j10));
                    list2 = Collections.emptyList();
                } else {
                    list2 = zzal4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzab zzab2 : list2) {
                    if (zzab2 != null) {
                        zzaz().zzj().zzd("User property expired", zzab2.zza, this.zzn.zzj().zzf(zzab2.zzc.zzb), zzab2.zzc.zza());
                        zzal zzal5 = this.zze;
                        zzak(zzal5);
                        zzal5.zzA(str2, zzab2.zzc.zzb);
                        zzav zzav5 = zzab2.zzk;
                        if (zzav5 != null) {
                            arrayList.add(zzav5);
                        }
                        zzal zzal6 = this.zze;
                        zzak(zzal6);
                        zzal6.zza(str2, zzab2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzX(new zzav((zzav) it.next(), j10), zzp3);
                }
                zzal zzal7 = this.zze;
                zzak(zzal7);
                String str3 = zzav2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzal7.zzg();
                zzal7.zzW();
                if (i < 0) {
                    zzal7.zzs.zzaz().zzk().zzd("Invalid time querying triggered conditional properties", zzey.zzn(str2), zzal7.zzs.zzj().zzd(str3), Long.valueOf(j10));
                    list3 = Collections.emptyList();
                } else {
                    list3 = zzal7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (zzab zzab3 : list3) {
                    if (zzab3 != null) {
                        zzll zzll = zzab3.zzc;
                        zzln zzln = new zzln((String) Preconditions.checkNotNull(zzab3.zza), zzab3.zzb, zzll.zzb, j10, Preconditions.checkNotNull(zzll.zza()));
                        zzal zzal8 = this.zze;
                        zzak(zzal8);
                        if (zzal8.zzL(zzln)) {
                            zzaz().zzj().zzd("User property triggered", zzab3.zza, this.zzn.zzj().zzf(zzln.zzc), zzln.zze);
                        } else {
                            zzaz().zzd().zzd("Too many active user properties, ignoring", zzey.zzn(zzab3.zza), this.zzn.zzj().zzf(zzln.zzc), zzln.zze);
                        }
                        zzav zzav6 = zzab3.zzi;
                        if (zzav6 != null) {
                            arrayList2.add(zzav6);
                        }
                        zzab3.zzc = new zzll(zzln);
                        zzab3.zze = true;
                        zzal zzal9 = this.zze;
                        zzak(zzal9);
                        zzal9.zzK(zzab3);
                    }
                }
                zzX(zzav2, zzp3);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzX(new zzav((zzav) it2.next(), j10), zzp3);
                }
                zzal zzal10 = this.zze;
                zzak(zzal10);
                zzal10.zzC();
            } finally {
                zzal zzal11 = this.zze;
                zzak(zzal11);
                zzal11.zzx();
            }
        }
    }

    public final void zzE(zzav zzav, String str) {
        zzav zzav2 = zzav;
        String str2 = str;
        zzal zzal = this.zze;
        zzak(zzal);
        zzg zzj2 = zzal.zzj(str2);
        if (zzj2 == null || TextUtils.isEmpty(zzj2.zzw())) {
            zzaz().zzc().zzb("No app data available; dropping event", str2);
            return;
        }
        Boolean zzac = zzac(zzj2);
        if (zzac == null) {
            if (!"_ui".equals(zzav2.zza)) {
                zzaz().zzk().zzb("Could not find package. appId", zzey.zzn(str));
            }
        } else if (!zzac.booleanValue()) {
            zzaz().zzd().zzb("App version does not match; dropping event. appId", zzey.zzn(str));
            return;
        }
        zzp zzp2 = r2;
        zzg zzg2 = zzj2;
        zzp zzp3 = new zzp(str, zzj2.zzy(), zzj2.zzw(), zzj2.zzb(), zzj2.zzv(), zzj2.zzm(), zzj2.zzj(), (String) null, zzj2.zzaj(), false, zzg2.zzx(), zzg2.zza(), 0, 0, zzg2.zzai(), false, zzg2.zzr(), zzg2.zzq(), zzg2.zzk(), zzg2.zzC(), (String) null, zzh(str2).zzh(), BuildConfig.FLAVOR, (String) null);
        zzF(zzav2, zzp2);
    }

    public final void zzF(zzav zzav, zzp zzp2) {
        Preconditions.checkNotEmpty(zzp2.zza);
        zzez zzb2 = zzez.zzb(zzav);
        zzlp zzv2 = zzv();
        Bundle bundle = zzb2.zzd;
        zzal zzal = this.zze;
        zzak(zzal);
        zzv2.zzL(bundle, zzal.zzi(zzp2.zza));
        zzv().zzM(zzb2, zzg().zzd(zzp2.zza));
        zzav zza2 = zzb2.zza();
        if ("_cmp".equals(zza2.zza) && "referrer API v2".equals(zza2.zzb.zzg("_cis"))) {
            String zzg2 = zza2.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(zzg2)) {
                zzV(new zzll("_lgclid", zza2.zzd, zzg2, "auto"), zzp2);
            }
        }
        zzD(zza2, zzp2);
    }

    public final void zzG() {
        this.zzs++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0104 A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012b A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0151 A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0181 A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0185 A[Catch:{ all -> 0x0196, all -> 0x01a0 }] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzH(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.zzgf r0 = r8.zzaA()
            r0.zzg()
            r8.zzB()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            r0 = 0
            if (r12 != 0) goto L_0x0012
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x01a0 }
        L_0x0012:
            com.google.android.gms.measurement.internal.zzey r1 = r8.zzaz()     // Catch:{ all -> 0x01a0 }
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzj()     // Catch:{ all -> 0x01a0 }
            int r2 = r12.length     // Catch:{ all -> 0x01a0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01a0 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.zzb(r3, r2)     // Catch:{ all -> 0x01a0 }
            com.google.android.gms.measurement.internal.zzal r1 = r8.zze     // Catch:{ all -> 0x01a0 }
            zzak(r1)     // Catch:{ all -> 0x01a0 }
            r1.zzw()     // Catch:{ all -> 0x01a0 }
            com.google.android.gms.measurement.internal.zzal r1 = r8.zze     // Catch:{ all -> 0x0196 }
            zzak(r1)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzg r1 = r1.zzj(r9)     // Catch:{ all -> 0x0196 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r10 == r3) goto L_0x0042
            r3 = 204(0xcc, float:2.86E-43)
            if (r10 == r3) goto L_0x0042
            if (r10 != r4) goto L_0x0046
            r10 = r4
        L_0x0042:
            if (r11 != 0) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x0046:
            r3 = r0
        L_0x0047:
            if (r1 != 0) goto L_0x005c
            com.google.android.gms.measurement.internal.zzey r10 = r8.zzaz()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzew r10 = r10.zzk()     // Catch:{ all -> 0x0196 }
            java.lang.String r11 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzey.zzn(r9)     // Catch:{ all -> 0x0196 }
            r10.zzb(r11, r9)     // Catch:{ all -> 0x0196 }
            goto L_0x0188
        L_0x005c:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00ba
            if (r10 != r5) goto L_0x0063
            goto L_0x00ba
        L_0x0063:
            com.google.android.gms.common.util.Clock r12 = r8.zzaw()     // Catch:{ all -> 0x0196 }
            long r12 = r12.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            r1.zzV(r12)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzal r12 = r8.zze     // Catch:{ all -> 0x0196 }
            zzak(r12)     // Catch:{ all -> 0x0196 }
            r12.zzD(r1)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzey r12 = r8.zzaz()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzew r12 = r12.zzj()     // Catch:{ all -> 0x0196 }
            java.lang.String r13 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0196 }
            r12.zzc(r13, r1, r11)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzfz r11 = r8.zzc     // Catch:{ all -> 0x0196 }
            zzak(r11)     // Catch:{ all -> 0x0196 }
            r11.zzl(r9)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzkd r9 = r8.zzk     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzfj r9 = r9.zzd     // Catch:{ all -> 0x0196 }
            com.google.android.gms.common.util.Clock r11 = r8.zzaw()     // Catch:{ all -> 0x0196 }
            long r11 = r11.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            r9.zzb(r11)     // Catch:{ all -> 0x0196 }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x00a6
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x00b5
        L_0x00a6:
            com.google.android.gms.measurement.internal.zzkd r9 = r8.zzk     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzfj r9 = r9.zzb     // Catch:{ all -> 0x0196 }
            com.google.android.gms.common.util.Clock r10 = r8.zzaw()     // Catch:{ all -> 0x0196 }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            r9.zzb(r10)     // Catch:{ all -> 0x0196 }
        L_0x00b5:
            r8.zzaf()     // Catch:{ all -> 0x0196 }
            goto L_0x0188
        L_0x00ba:
            r11 = 0
            if (r13 == 0) goto L_0x00c6
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r3 = r13.get(r3)     // Catch:{ all -> 0x0196 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0196 }
            goto L_0x00c7
        L_0x00c6:
            r3 = r11
        L_0x00c7:
            if (r3 == 0) goto L_0x00d6
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x0196 }
            if (r6 != 0) goto L_0x00d6
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0196 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0196 }
            goto L_0x00d7
        L_0x00d6:
            r3 = r11
        L_0x00d7:
            com.google.android.gms.internal.measurement.zzpg.zzc()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzaf r6 = r8.zzg()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzek r7 = com.google.android.gms.measurement.internal.zzel.zzaM     // Catch:{ all -> 0x0196 }
            boolean r6 = r6.zzs(r11, r7)     // Catch:{ all -> 0x0196 }
            if (r6 == 0) goto L_0x0101
            if (r13 == 0) goto L_0x00f1
            java.lang.String r6 = "ETag"
            java.lang.Object r13 = r13.get(r6)     // Catch:{ all -> 0x0196 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x0196 }
            goto L_0x00f2
        L_0x00f1:
            r13 = r11
        L_0x00f2:
            if (r13 == 0) goto L_0x0101
            boolean r6 = r13.isEmpty()     // Catch:{ all -> 0x0196 }
            if (r6 != 0) goto L_0x0101
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x0196 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0196 }
            goto L_0x0102
        L_0x0101:
            r13 = r11
        L_0x0102:
            if (r10 == r5) goto L_0x0120
            if (r10 != r4) goto L_0x0107
            goto L_0x0120
        L_0x0107:
            com.google.android.gms.measurement.internal.zzfz r11 = r8.zzc     // Catch:{ all -> 0x0196 }
            zzak(r11)     // Catch:{ all -> 0x0196 }
            boolean r11 = r11.zzt(r9, r12, r3, r13)     // Catch:{ all -> 0x0196 }
            if (r11 != 0) goto L_0x013c
            com.google.android.gms.measurement.internal.zzal r9 = r8.zze     // Catch:{ all -> 0x01a0 }
            zzak(r9)     // Catch:{ all -> 0x01a0 }
        L_0x0117:
            r9.zzx()     // Catch:{ all -> 0x01a0 }
            r8.zzt = r0
            r8.zzad()
            return
        L_0x0120:
            com.google.android.gms.measurement.internal.zzfz r12 = r8.zzc     // Catch:{ all -> 0x0196 }
            zzak(r12)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.internal.measurement.zzfe r12 = r12.zze(r9)     // Catch:{ all -> 0x0196 }
            if (r12 != 0) goto L_0x013c
            com.google.android.gms.measurement.internal.zzfz r12 = r8.zzc     // Catch:{ all -> 0x0196 }
            zzak(r12)     // Catch:{ all -> 0x0196 }
            boolean r11 = r12.zzt(r9, r11, r11, r11)     // Catch:{ all -> 0x0196 }
            if (r11 != 0) goto L_0x013c
            com.google.android.gms.measurement.internal.zzal r9 = r8.zze     // Catch:{ all -> 0x01a0 }
            zzak(r9)     // Catch:{ all -> 0x01a0 }
            goto L_0x0117
        L_0x013c:
            com.google.android.gms.common.util.Clock r11 = r8.zzaw()     // Catch:{ all -> 0x0196 }
            long r11 = r11.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            r1.zzM(r11)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzal r11 = r8.zze     // Catch:{ all -> 0x0196 }
            zzak(r11)     // Catch:{ all -> 0x0196 }
            r11.zzD(r1)     // Catch:{ all -> 0x0196 }
            if (r10 != r5) goto L_0x015f
            com.google.android.gms.measurement.internal.zzey r10 = r8.zzaz()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzew r10 = r10.zzl()     // Catch:{ all -> 0x0196 }
            java.lang.String r11 = "Config not found. Using empty config. appId"
            r10.zzb(r11, r9)     // Catch:{ all -> 0x0196 }
            goto L_0x0170
        L_0x015f:
            com.google.android.gms.measurement.internal.zzey r9 = r8.zzaz()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzew r9 = r9.zzj()     // Catch:{ all -> 0x0196 }
            java.lang.String r11 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0196 }
            r9.zzc(r11, r10, r2)     // Catch:{ all -> 0x0196 }
        L_0x0170:
            com.google.android.gms.measurement.internal.zzfe r9 = r8.zzd     // Catch:{ all -> 0x0196 }
            zzak(r9)     // Catch:{ all -> 0x0196 }
            boolean r9 = r9.zza()     // Catch:{ all -> 0x0196 }
            if (r9 == 0) goto L_0x0185
            boolean r9 = r8.zzah()     // Catch:{ all -> 0x0196 }
            if (r9 == 0) goto L_0x0185
            r8.zzW()     // Catch:{ all -> 0x0196 }
            goto L_0x0188
        L_0x0185:
            r8.zzaf()     // Catch:{ all -> 0x0196 }
        L_0x0188:
            com.google.android.gms.measurement.internal.zzal r9 = r8.zze     // Catch:{ all -> 0x0196 }
            zzak(r9)     // Catch:{ all -> 0x0196 }
            r9.zzC()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzal r9 = r8.zze     // Catch:{ all -> 0x01a0 }
            zzak(r9)     // Catch:{ all -> 0x01a0 }
            goto L_0x0117
        L_0x0196:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzal r10 = r8.zze     // Catch:{ all -> 0x01a0 }
            zzak(r10)     // Catch:{ all -> 0x01a0 }
            r10.zzx()     // Catch:{ all -> 0x01a0 }
            throw r9     // Catch:{ all -> 0x01a0 }
        L_0x01a0:
            r9 = move-exception
            r8.zzt = r0
            r8.zzad()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzli.zzH(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void zzI(boolean z) {
        zzaf();
    }

    /* JADX INFO: finally extract failed */
    @VisibleForTesting
    public final void zzJ(int i, Throwable th2, byte[] bArr, String str) {
        zzal zzal;
        zzaA().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                this.zzu = false;
                zzad();
                throw th3;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            zzaz().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th2);
            this.zzk.zzd.zzb(zzaw().currentTimeMillis());
            if (i == 503 || i == 429) {
                this.zzk.zzb.zzb(zzaw().currentTimeMillis());
            }
            zzal zzal2 = this.zze;
            zzak(zzal2);
            zzal2.zzy(list);
            zzaf();
            this.zzu = false;
            zzad();
        }
        if (th2 == null) {
            try {
                this.zzk.zzc.zzb(zzaw().currentTimeMillis());
                this.zzk.zzd.zzb(0);
                zzaf();
                zzaz().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzal zzal3 = this.zze;
                zzak(zzal3);
                zzal3.zzw();
                try {
                    for (Long l10 : list) {
                        try {
                            zzal = this.zze;
                            zzak(zzal);
                            long longValue = l10.longValue();
                            zzal.zzg();
                            zzal.zzW();
                            if (zzal.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e10) {
                            zzal.zzs.zzaz().zzd().zzb("Failed to delete a bundle in a queue table", e10);
                            throw e10;
                        } catch (SQLiteException e11) {
                            List list2 = this.zzz;
                            if (list2 == null || !list2.contains(l10)) {
                                throw e11;
                            }
                        }
                    }
                    zzal zzal4 = this.zze;
                    zzak(zzal4);
                    zzal4.zzC();
                    zzal zzal5 = this.zze;
                    zzak(zzal5);
                    zzal5.zzx();
                    this.zzz = null;
                    zzfe zzfe = this.zzd;
                    zzak(zzfe);
                    if (!zzfe.zza() || !zzah()) {
                        this.zzA = -1;
                        zzaf();
                    } else {
                        zzW();
                    }
                    this.zza = 0;
                } catch (Throwable th4) {
                    zzal zzal6 = this.zze;
                    zzak(zzal6);
                    zzal6.zzx();
                    throw th4;
                }
            } catch (SQLiteException e12) {
                zzaz().zzd().zzb("Database error while trying to delete uploaded bundles", e12);
                this.zza = zzaw().elapsedRealtime();
                zzaz().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
            this.zzu = false;
            zzad();
        }
        zzaz().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th2);
        this.zzk.zzd.zzb(zzaw().currentTimeMillis());
        this.zzk.zzb.zzb(zzaw().currentTimeMillis());
        zzal zzal22 = this.zze;
        zzak(zzal22);
        zzal22.zzy(list);
        zzaf();
        this.zzu = false;
        zzad();
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x03ca A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03f6 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x040d A[SYNTHETIC, Splitter:B:128:0x040d] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04d3 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0537 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b9 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e4 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021a A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0239 A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x023f A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x024e A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0565 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025e A[Catch:{ SQLiteException -> 0x01cd, all -> 0x0565 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzK(com.google.android.gms.measurement.internal.zzp r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.zzgf r8 = r23.zzaA()
            r8.zzg()
            r23.zzB()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r24)
            java.lang.String r8 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            boolean r8 = zzaj(r24)
            if (r8 == 0) goto L_0x056f
            com.google.android.gms.measurement.internal.zzal r8 = r1.zze
            zzak(r8)
            java.lang.String r9 = r2.zza
            com.google.android.gms.measurement.internal.zzg r8 = r8.zzj(r9)
            r9 = 0
            if (r8 == 0) goto L_0x005e
            java.lang.String r11 = r8.zzy()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r2.zzb
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x005e
            r8.zzM(r9)
            com.google.android.gms.measurement.internal.zzal r11 = r1.zze
            zzak(r11)
            r11.zzD(r8)
            com.google.android.gms.measurement.internal.zzfz r8 = r1.zzc
            zzak(r8)
            java.lang.String r11 = r2.zza
            r8.zzm(r11)
        L_0x005e:
            boolean r8 = r2.zzh
            if (r8 != 0) goto L_0x0066
            r23.zzd(r24)
            return
        L_0x0066:
            long r11 = r2.zzm
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0074
            com.google.android.gms.common.util.Clock r8 = r23.zzaw()
            long r11 = r8.currentTimeMillis()
        L_0x0074:
            com.google.android.gms.measurement.internal.zzgi r8 = r1.zzn
            com.google.android.gms.measurement.internal.zzap r8 = r8.zzg()
            r8.zzd()
            int r8 = r2.zzn
            r15 = 1
            if (r8 == 0) goto L_0x009c
            if (r8 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.zzey r13 = r23.zzaz()
            com.google.android.gms.measurement.internal.zzew r13 = r13.zzk()
            java.lang.String r14 = r2.zza
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzey.zzn(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.zzc(r9, r14, r8)
            r8 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.zzal r9 = r1.zze
            zzak(r9)
            r9.zzw()
            com.google.android.gms.measurement.internal.zzal r9 = r1.zze     // Catch:{ all -> 0x0565 }
            zzak(r9)     // Catch:{ all -> 0x0565 }
            java.lang.String r10 = r2.zza     // Catch:{ all -> 0x0565 }
            java.lang.String r13 = "_npa"
            com.google.android.gms.measurement.internal.zzln r9 = r9.zzp(r10, r13)     // Catch:{ all -> 0x0565 }
            if (r9 == 0) goto L_0x00c5
            java.lang.String r10 = "auto"
            java.lang.String r13 = r9.zzb     // Catch:{ all -> 0x0565 }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x0565 }
            if (r10 == 0) goto L_0x00be
            goto L_0x00c5
        L_0x00be:
            r21 = r3
            r22 = r4
            r4 = r15
            r3 = 0
            goto L_0x0119
        L_0x00c5:
            java.lang.Boolean r10 = r2.zzr     // Catch:{ all -> 0x0565 }
            if (r10 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.zzll r10 = new com.google.android.gms.measurement.internal.zzll     // Catch:{ all -> 0x0565 }
            java.lang.String r14 = "_npa"
            java.lang.Boolean r13 = r2.zzr     // Catch:{ all -> 0x0565 }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x0565 }
            if (r15 == r13) goto L_0x00d8
            r19 = 0
            goto L_0x00da
        L_0x00d8:
            r19 = 1
        L_0x00da:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0565 }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 1
            r13 = r10
            r3 = 0
            r4 = r15
            r15 = r11
            r17 = r19
            r18 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0565 }
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r9.zze     // Catch:{ all -> 0x0565 }
            java.lang.Long r13 = r10.zzd     // Catch:{ all -> 0x0565 }
            boolean r9 = r9.equals(r13)     // Catch:{ all -> 0x0565 }
            if (r9 != 0) goto L_0x0119
        L_0x00fd:
            r1.zzV(r10, r2)     // Catch:{ all -> 0x0565 }
            goto L_0x0119
        L_0x0101:
            r21 = r3
            r22 = r4
            r4 = r15
            r3 = 0
            if (r9 == 0) goto L_0x0119
            com.google.android.gms.measurement.internal.zzll r9 = new com.google.android.gms.measurement.internal.zzll     // Catch:{ all -> 0x0565 }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r9
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0565 }
            r1.zzO(r9, r2)     // Catch:{ all -> 0x0565 }
        L_0x0119:
            com.google.android.gms.measurement.internal.zzal r9 = r1.zze     // Catch:{ all -> 0x0565 }
            zzak(r9)     // Catch:{ all -> 0x0565 }
            java.lang.String r10 = r2.zza     // Catch:{ all -> 0x0565 }
            java.lang.Object r10 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)     // Catch:{ all -> 0x0565 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzg r9 = r9.zzj(r10)     // Catch:{ all -> 0x0565 }
            if (r9 == 0) goto L_0x01e2
            com.google.android.gms.measurement.internal.zzlp r13 = r23.zzv()     // Catch:{ all -> 0x0565 }
            java.lang.String r14 = r2.zzb     // Catch:{ all -> 0x0565 }
            java.lang.String r15 = r9.zzy()     // Catch:{ all -> 0x0565 }
            java.lang.String r10 = r2.zzq     // Catch:{ all -> 0x0565 }
            java.lang.String r3 = r9.zzr()     // Catch:{ all -> 0x0565 }
            boolean r3 = r13.zzan(r14, r15, r10, r3)     // Catch:{ all -> 0x0565 }
            if (r3 == 0) goto L_0x01e2
            com.google.android.gms.measurement.internal.zzey r3 = r23.zzaz()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzk()     // Catch:{ all -> 0x0565 }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r9.zzt()     // Catch:{ all -> 0x0565 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzey.zzn(r13)     // Catch:{ all -> 0x0565 }
            r3.zzb(r10, r13)     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzal r3 = r1.zze     // Catch:{ all -> 0x0565 }
            zzak(r3)     // Catch:{ all -> 0x0565 }
            java.lang.String r9 = r9.zzt()     // Catch:{ all -> 0x0565 }
            r3.zzW()     // Catch:{ all -> 0x0565 }
            r3.zzg()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)     // Catch:{ all -> 0x0565 }
            android.database.sqlite.SQLiteDatabase r10 = r3.zzh()     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01cd }
            r14 = 0
            r13[r14] = r9     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r14 = "events"
            int r14 = r10.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cd }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01e1
            com.google.android.gms.measurement.internal.zzgi r0 = r3.zzs     // Catch:{ SQLiteException -> 0x01cd }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ SQLiteException -> 0x01cd }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzj()     // Catch:{ SQLiteException -> 0x01cd }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01cd }
            r0.zzc(r10, r9, r13)     // Catch:{ SQLiteException -> 0x01cd }
            goto L_0x01e1
        L_0x01cd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgi r3 = r3.zzs     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()     // Catch:{ all -> 0x0565 }
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzey.zzn(r9)     // Catch:{ all -> 0x0565 }
            r3.zzc(r10, r9, r0)     // Catch:{ all -> 0x0565 }
        L_0x01e1:
            r9 = 0
        L_0x01e2:
            if (r9 == 0) goto L_0x0239
            long r13 = r9.zzb()     // Catch:{ all -> 0x0565 }
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01fc
            long r13 = r9.zzb()     // Catch:{ all -> 0x0565 }
            r3 = r5
            long r4 = r2.zzj     // Catch:{ all -> 0x0565 }
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01fd
            r0 = 1
            goto L_0x01fe
        L_0x01fc:
            r3 = r5
        L_0x01fd:
            r0 = 0
        L_0x01fe:
            java.lang.String r4 = r9.zzw()     // Catch:{ all -> 0x0565 }
            long r13 = r9.zzb()     // Catch:{ all -> 0x0565 }
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x0216
            if (r4 == 0) goto L_0x0216
            java.lang.String r5 = r2.zzc     // Catch:{ all -> 0x0565 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0565 }
            if (r5 != 0) goto L_0x0216
            r15 = 1
            goto L_0x0217
        L_0x0216:
            r15 = 0
        L_0x0217:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x023a
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0565 }
            r0.<init>()     // Catch:{ all -> 0x0565 }
            java.lang.String r5 = "_pv"
            r0.putString(r5, r4)     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzav r4 = new com.google.android.gms.measurement.internal.zzav     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzat r15 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0565 }
            r15.<init>(r0)     // Catch:{ all -> 0x0565 }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r4
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0565 }
            r1.zzD(r4, r2)     // Catch:{ all -> 0x0565 }
            goto L_0x023a
        L_0x0239:
            r3 = r5
        L_0x023a:
            r23.zzd(r24)     // Catch:{ all -> 0x0565 }
            if (r8 != 0) goto L_0x024e
            com.google.android.gms.measurement.internal.zzal r0 = r1.zze     // Catch:{ all -> 0x0565 }
            zzak(r0)     // Catch:{ all -> 0x0565 }
            java.lang.String r4 = r2.zza     // Catch:{ all -> 0x0565 }
            java.lang.String r5 = "_f"
            com.google.android.gms.measurement.internal.zzar r0 = r0.zzn(r4, r5)     // Catch:{ all -> 0x0565 }
            r15 = 0
            goto L_0x025c
        L_0x024e:
            com.google.android.gms.measurement.internal.zzal r0 = r1.zze     // Catch:{ all -> 0x0565 }
            zzak(r0)     // Catch:{ all -> 0x0565 }
            java.lang.String r4 = r2.zza     // Catch:{ all -> 0x0565 }
            java.lang.String r5 = "_v"
            com.google.android.gms.measurement.internal.zzar r0 = r0.zzn(r4, r5)     // Catch:{ all -> 0x0565 }
            r15 = 1
        L_0x025c:
            if (r0 != 0) goto L_0x0537
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r11 / r4
            r13 = 1
            long r8 = r8 + r13
            long r8 = r8 * r4
            java.lang.String r4 = "_dac"
            java.lang.String r5 = "_et"
            java.lang.String r14 = "_r"
            java.lang.String r13 = "_c"
            if (r15 != 0) goto L_0x04ed
            com.google.android.gms.measurement.internal.zzll r0 = new com.google.android.gms.measurement.internal.zzll     // Catch:{ all -> 0x0565 }
            java.lang.String r15 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0565 }
            java.lang.String r18 = "auto"
            r8 = r13
            r13 = r0
            r9 = r14
            r14 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0565 }
            r1.zzV(r0, r2)     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzgf r0 = r23.zzaA()     // Catch:{ all -> 0x0565 }
            r0.zzg()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzfq r0 = r1.zzm     // Catch:{ all -> 0x0565 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0565 }
            r13 = r0
            com.google.android.gms.measurement.internal.zzfq r13 = (com.google.android.gms.measurement.internal.zzfq) r13     // Catch:{ all -> 0x0565 }
            java.lang.String r0 = r2.zza     // Catch:{ all -> 0x0565 }
            if (r0 == 0) goto L_0x0389
            boolean r14 = r0.isEmpty()     // Catch:{ all -> 0x0565 }
            if (r14 == 0) goto L_0x02a2
            goto L_0x0389
        L_0x02a2:
            com.google.android.gms.measurement.internal.zzgi r14 = r13.zza     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzgf r14 = r14.zzaA()     // Catch:{ all -> 0x0565 }
            r14.zzg()     // Catch:{ all -> 0x0565 }
            boolean r14 = r13.zza()     // Catch:{ all -> 0x0565 }
            if (r14 != 0) goto L_0x02c2
            com.google.android.gms.measurement.internal.zzgi r0 = r13.zza     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzi()     // Catch:{ all -> 0x0565 }
            java.lang.String r3 = "Install Referrer Reporter is not available"
            r0.zza(r3)     // Catch:{ all -> 0x0565 }
            goto L_0x0398
        L_0x02c2:
            com.google.android.gms.measurement.internal.zzfp r14 = new com.google.android.gms.measurement.internal.zzfp     // Catch:{ all -> 0x0565 }
            r14.<init>(r13, r0)     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzgi r0 = r13.zza     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzgf r0 = r0.zzaA()     // Catch:{ all -> 0x0565 }
            r0.zzg()     // Catch:{ all -> 0x0565 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0565 }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x0565 }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x0565 }
            java.lang.String r10 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r3, r10)     // Catch:{ all -> 0x0565 }
            r0.setComponent(r15)     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzgi r10 = r13.zza     // Catch:{ all -> 0x0565 }
            android.content.Context r10 = r10.zzav()     // Catch:{ all -> 0x0565 }
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch:{ all -> 0x0565 }
            if (r10 != 0) goto L_0x02fe
            com.google.android.gms.measurement.internal.zzgi r0 = r13.zza     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzm()     // Catch:{ all -> 0x0565 }
            java.lang.String r3 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.zza(r3)     // Catch:{ all -> 0x0565 }
            goto L_0x0398
        L_0x02fe:
            r15 = 0
            java.util.List r10 = r10.queryIntentServices(r0, r15)     // Catch:{ all -> 0x0565 }
            if (r10 == 0) goto L_0x0379
            boolean r17 = r10.isEmpty()     // Catch:{ all -> 0x0565 }
            if (r17 != 0) goto L_0x0379
            java.lang.Object r10 = r10.get(r15)     // Catch:{ all -> 0x0565 }
            android.content.pm.ResolveInfo r10 = (android.content.pm.ResolveInfo) r10     // Catch:{ all -> 0x0565 }
            android.content.pm.ServiceInfo r10 = r10.serviceInfo     // Catch:{ all -> 0x0565 }
            if (r10 == 0) goto L_0x0398
            java.lang.String r15 = r10.packageName     // Catch:{ all -> 0x0565 }
            java.lang.String r10 = r10.name     // Catch:{ all -> 0x0565 }
            if (r10 == 0) goto L_0x0369
            boolean r3 = r3.equals(r15)     // Catch:{ all -> 0x0565 }
            if (r3 == 0) goto L_0x0369
            boolean r3 = r13.zza()     // Catch:{ all -> 0x0565 }
            if (r3 == 0) goto L_0x0369
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x0565 }
            r3.<init>(r0)     // Catch:{ all -> 0x0565 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ RuntimeException -> 0x0354 }
            com.google.android.gms.measurement.internal.zzgi r10 = r13.zza     // Catch:{ RuntimeException -> 0x0354 }
            android.content.Context r10 = r10.zzav()     // Catch:{ RuntimeException -> 0x0354 }
            r15 = 1
            boolean r0 = r0.bindService(r10, r3, r14, r15)     // Catch:{ RuntimeException -> 0x0354 }
            com.google.android.gms.measurement.internal.zzgi r3 = r13.zza     // Catch:{ RuntimeException -> 0x0354 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()     // Catch:{ RuntimeException -> 0x0354 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzj()     // Catch:{ RuntimeException -> 0x0354 }
            java.lang.String r14 = "Install Referrer Service is"
            java.lang.String r15 = "available"
            java.lang.String r16 = "not available"
            r10 = 1
            if (r10 == r0) goto L_0x0350
            r15 = r16
        L_0x0350:
            r3.zzb(r14, r15)     // Catch:{ RuntimeException -> 0x0354 }
            goto L_0x0398
        L_0x0354:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgi r3 = r13.zza     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()     // Catch:{ all -> 0x0565 }
            java.lang.String r13 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0565 }
            r3.zzb(r13, r0)     // Catch:{ all -> 0x0565 }
            goto L_0x0398
        L_0x0369:
            com.google.android.gms.measurement.internal.zzgi r0 = r13.zza     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzk()     // Catch:{ all -> 0x0565 }
            java.lang.String r3 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.zza(r3)     // Catch:{ all -> 0x0565 }
            goto L_0x0398
        L_0x0379:
            com.google.android.gms.measurement.internal.zzgi r0 = r13.zza     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzi()     // Catch:{ all -> 0x0565 }
            java.lang.String r3 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.zza(r3)     // Catch:{ all -> 0x0565 }
            goto L_0x0398
        L_0x0389:
            com.google.android.gms.measurement.internal.zzgi r0 = r13.zza     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzm()     // Catch:{ all -> 0x0565 }
            java.lang.String r3 = "Install Referrer Reporter was called with invalid app package name"
            r0.zza(r3)     // Catch:{ all -> 0x0565 }
        L_0x0398:
            com.google.android.gms.measurement.internal.zzgf r0 = r23.zzaA()     // Catch:{ all -> 0x0565 }
            r0.zzg()     // Catch:{ all -> 0x0565 }
            r23.zzB()     // Catch:{ all -> 0x0565 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0565 }
            r3.<init>()     // Catch:{ all -> 0x0565 }
            r13 = 1
            r3.putLong(r8, r13)     // Catch:{ all -> 0x0565 }
            r3.putLong(r9, r13)     // Catch:{ all -> 0x0565 }
            r8 = 0
            r3.putLong(r7, r8)     // Catch:{ all -> 0x0565 }
            r3.putLong(r6, r8)     // Catch:{ all -> 0x0565 }
            r15 = r22
            r3.putLong(r15, r8)     // Catch:{ all -> 0x0565 }
            r14 = r21
            r3.putLong(r14, r8)     // Catch:{ all -> 0x0565 }
            r8 = 1
            r3.putLong(r5, r8)     // Catch:{ all -> 0x0565 }
            boolean r0 = r2.zzp     // Catch:{ all -> 0x0565 }
            if (r0 == 0) goto L_0x03cd
            r3.putLong(r4, r8)     // Catch:{ all -> 0x0565 }
        L_0x03cd:
            java.lang.String r0 = r2.zza     // Catch:{ all -> 0x0565 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0565 }
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzal r0 = r1.zze     // Catch:{ all -> 0x0565 }
            zzak(r0)     // Catch:{ all -> 0x0565 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch:{ all -> 0x0565 }
            r0.zzg()     // Catch:{ all -> 0x0565 }
            r0.zzW()     // Catch:{ all -> 0x0565 }
            java.lang.String r5 = "first_open_count"
            long r8 = r0.zzc(r4, r5)     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzn     // Catch:{ all -> 0x0565 }
            android.content.Context r0 = r0.zzav()     // Catch:{ all -> 0x0565 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0565 }
            if (r0 != 0) goto L_0x040d
            com.google.android.gms.measurement.internal.zzey r0 = r23.zzaz()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzd()     // Catch:{ all -> 0x0565 }
            java.lang.String r5 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r4)     // Catch:{ all -> 0x0565 }
            r0.zzb(r5, r4)     // Catch:{ all -> 0x0565 }
            r22 = r6
        L_0x0409:
            r4 = 0
            goto L_0x04cf
        L_0x040d:
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzn     // Catch:{ NameNotFoundException -> 0x041d }
            android.content.Context r0 = r0.zzav()     // Catch:{ NameNotFoundException -> 0x041d }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x041d }
            r5 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x041d }
            goto L_0x0430
        L_0x041d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzey r5 = r23.zzaz()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzd()     // Catch:{ all -> 0x0565 }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzey.zzn(r4)     // Catch:{ all -> 0x0565 }
            r5.zzc(r13, r10, r0)     // Catch:{ all -> 0x0565 }
            r0 = 0
        L_0x0430:
            if (r0 == 0) goto L_0x048e
            r21 = r14
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x0565 }
            r17 = 0
            int r5 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x0488
            r22 = r6
            long r5 = r0.lastUpdateTime     // Catch:{ all -> 0x0565 }
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0468
            com.google.android.gms.measurement.internal.zzaf r0 = r23.zzg()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzek r5 = com.google.android.gms.measurement.internal.zzel.zzac     // Catch:{ all -> 0x0565 }
            r6 = 0
            boolean r0 = r0.zzs(r6, r5)     // Catch:{ all -> 0x0565 }
            if (r0 == 0) goto L_0x0462
            r13 = 0
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0460
            r13 = 1
            r3.putLong(r7, r13)     // Catch:{ all -> 0x0565 }
            r0 = 0
            r8 = 0
            goto L_0x046a
        L_0x0460:
            r0 = 0
            goto L_0x046a
        L_0x0462:
            r13 = 1
            r3.putLong(r7, r13)     // Catch:{ all -> 0x0565 }
            goto L_0x0460
        L_0x0468:
            r6 = 0
            r0 = 1
        L_0x046a:
            com.google.android.gms.measurement.internal.zzll r5 = new com.google.android.gms.measurement.internal.zzll     // Catch:{ all -> 0x0565 }
            java.lang.String r14 = "_fi"
            r7 = 1
            if (r7 == r0) goto L_0x0474
            r16 = 0
            goto L_0x0476
        L_0x0474:
            r16 = 1
        L_0x0476:
            java.lang.Long r17 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0565 }
            java.lang.String r18 = "auto"
            r13 = r5
            r7 = r21
            r6 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0565 }
            r1.zzV(r5, r2)     // Catch:{ all -> 0x0565 }
            goto L_0x0492
        L_0x0488:
            r22 = r6
            r6 = r15
            r7 = r21
            goto L_0x0492
        L_0x048e:
            r22 = r6
            r7 = r14
            r6 = r15
        L_0x0492:
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzn     // Catch:{ NameNotFoundException -> 0x04a2 }
            android.content.Context r0 = r0.zzav()     // Catch:{ NameNotFoundException -> 0x04a2 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x04a2 }
            r5 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x04a2 }
            goto L_0x04b5
        L_0x04a2:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzey r5 = r23.zzaz()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzd()     // Catch:{ all -> 0x0565 }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r4)     // Catch:{ all -> 0x0565 }
            r5.zzc(r13, r4, r0)     // Catch:{ all -> 0x0565 }
            r0 = 0
        L_0x04b5:
            if (r0 == 0) goto L_0x0409
            int r4 = r0.flags     // Catch:{ all -> 0x0565 }
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x04c2
            r4 = 1
            r3.putLong(r6, r4)     // Catch:{ all -> 0x0565 }
        L_0x04c2:
            int r0 = r0.flags     // Catch:{ all -> 0x0565 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0409
            r4 = 1
            r3.putLong(r7, r4)     // Catch:{ all -> 0x0565 }
            goto L_0x0409
        L_0x04cf:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x04d8
            r4 = r22
            r3.putLong(r4, r8)     // Catch:{ all -> 0x0565 }
        L_0x04d8:
            com.google.android.gms.measurement.internal.zzav r0 = new com.google.android.gms.measurement.internal.zzav     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzat r15 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0565 }
            r15.<init>(r3)     // Catch:{ all -> 0x0565 }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0565 }
            r1.zzF(r0, r2)     // Catch:{ all -> 0x0565 }
            goto L_0x0554
        L_0x04ed:
            r6 = r13
            r3 = r14
            com.google.android.gms.measurement.internal.zzll r0 = new com.google.android.gms.measurement.internal.zzll     // Catch:{ all -> 0x0565 }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0565 }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0565 }
            r1.zzV(r0, r2)     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzgf r0 = r23.zzaA()     // Catch:{ all -> 0x0565 }
            r0.zzg()     // Catch:{ all -> 0x0565 }
            r23.zzB()     // Catch:{ all -> 0x0565 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0565 }
            r0.<init>()     // Catch:{ all -> 0x0565 }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x0565 }
            r0.putLong(r3, r7)     // Catch:{ all -> 0x0565 }
            r0.putLong(r5, r7)     // Catch:{ all -> 0x0565 }
            boolean r3 = r2.zzp     // Catch:{ all -> 0x0565 }
            if (r3 == 0) goto L_0x0522
            r0.putLong(r4, r7)     // Catch:{ all -> 0x0565 }
        L_0x0522:
            com.google.android.gms.measurement.internal.zzav r3 = new com.google.android.gms.measurement.internal.zzav     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzat r15 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0565 }
            r15.<init>(r0)     // Catch:{ all -> 0x0565 }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0565 }
            r1.zzF(r3, r2)     // Catch:{ all -> 0x0565 }
            goto L_0x0554
        L_0x0537:
            boolean r0 = r2.zzi     // Catch:{ all -> 0x0565 }
            if (r0 == 0) goto L_0x0554
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0565 }
            r0.<init>()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzav r3 = new com.google.android.gms.measurement.internal.zzav     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzat r15 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0565 }
            r15.<init>(r0)     // Catch:{ all -> 0x0565 }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0565 }
            r1.zzF(r3, r2)     // Catch:{ all -> 0x0565 }
        L_0x0554:
            com.google.android.gms.measurement.internal.zzal r0 = r1.zze     // Catch:{ all -> 0x0565 }
            zzak(r0)     // Catch:{ all -> 0x0565 }
            r0.zzC()     // Catch:{ all -> 0x0565 }
            com.google.android.gms.measurement.internal.zzal r0 = r1.zze
            zzak(r0)
            r0.zzx()
            return
        L_0x0565:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze
            zzak(r2)
            r2.zzx()
            throw r0
        L_0x056f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzli.zzK(com.google.android.gms.measurement.internal.zzp):void");
    }

    public final void zzL() {
        this.zzr++;
    }

    public final void zzM(zzab zzab) {
        zzp zzab2 = zzab((String) Preconditions.checkNotNull(zzab.zza));
        if (zzab2 != null) {
            zzN(zzab, zzab2);
        }
    }

    public final void zzN(zzab zzab, zzp zzp2) {
        Preconditions.checkNotNull(zzab);
        Preconditions.checkNotEmpty(zzab.zza);
        Preconditions.checkNotNull(zzab.zzc);
        Preconditions.checkNotEmpty(zzab.zzc.zzb);
        zzaA().zzg();
        zzB();
        if (zzaj(zzp2)) {
            if (zzp2.zzh) {
                zzal zzal = this.zze;
                zzak(zzal);
                zzal.zzw();
                try {
                    zzd(zzp2);
                    String str = (String) Preconditions.checkNotNull(zzab.zza);
                    zzal zzal2 = this.zze;
                    zzak(zzal2);
                    zzab zzk2 = zzal2.zzk(str, zzab.zzc.zzb);
                    if (zzk2 != null) {
                        zzaz().zzc().zzc("Removing conditional user property", zzab.zza, this.zzn.zzj().zzf(zzab.zzc.zzb));
                        zzal zzal3 = this.zze;
                        zzak(zzal3);
                        zzal3.zza(str, zzab.zzc.zzb);
                        if (zzk2.zze) {
                            zzal zzal4 = this.zze;
                            zzak(zzal4);
                            zzal4.zzA(str, zzab.zzc.zzb);
                        }
                        zzav zzav = zzab.zzk;
                        if (zzav != null) {
                            zzat zzat = zzav.zzb;
                            zzX((zzav) Preconditions.checkNotNull(zzv().zzz(str, ((zzav) Preconditions.checkNotNull(zzab.zzk)).zza, zzat != null ? zzat.zzc() : null, zzk2.zzb, zzab.zzk.zzd, true, true)), zzp2);
                        }
                    } else {
                        zzaz().zzk().zzc("Conditional user property doesn't exist", zzey.zzn(zzab.zza), this.zzn.zzj().zzf(zzab.zzc.zzb));
                    }
                    zzal zzal5 = this.zze;
                    zzak(zzal5);
                    zzal5.zzC();
                } finally {
                    zzal zzal6 = this.zze;
                    zzak(zzal6);
                    zzal6.zzx();
                }
            } else {
                zzd(zzp2);
            }
        }
    }

    public final void zzO(zzll zzll, zzp zzp2) {
        zzaA().zzg();
        zzB();
        if (zzaj(zzp2)) {
            if (!zzp2.zzh) {
                zzd(zzp2);
            } else if (!"_npa".equals(zzll.zzb) || zzp2.zzr == null) {
                zzaz().zzc().zzb("Removing user property", this.zzn.zzj().zzf(zzll.zzb));
                zzal zzal = this.zze;
                zzak(zzal);
                zzal.zzw();
                try {
                    zzd(zzp2);
                    zzne.zzc();
                    if (this.zzn.zzf().zzs((String) null, zzel.zzan) && this.zzn.zzf().zzs((String) null, zzel.zzap) && "_id".equals(zzll.zzb)) {
                        zzal zzal2 = this.zze;
                        zzak(zzal2);
                        zzal2.zzA((String) Preconditions.checkNotNull(zzp2.zza), "_lair");
                    }
                    zzal zzal3 = this.zze;
                    zzak(zzal3);
                    zzal3.zzA((String) Preconditions.checkNotNull(zzp2.zza), zzll.zzb);
                    zzal zzal4 = this.zze;
                    zzak(zzal4);
                    zzal4.zzC();
                    zzaz().zzc().zzb("User property removed", this.zzn.zzj().zzf(zzll.zzb));
                } finally {
                    zzal zzal5 = this.zze;
                    zzak(zzal5);
                    zzal5.zzx();
                }
            } else {
                zzaz().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzV(new zzll("_npa", zzaw().currentTimeMillis(), Long.valueOf(true != zzp2.zzr.booleanValue() ? 0 : 1), "auto"), zzp2);
            }
        }
    }

    @VisibleForTesting
    public final void zzP(zzp zzp2) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzal zzal = this.zze;
        zzak(zzal);
        String str = (String) Preconditions.checkNotNull(zzp2.zza);
        Preconditions.checkNotEmpty(str);
        zzal.zzg();
        zzal.zzW();
        try {
            SQLiteDatabase zzh2 = zzal.zzh();
            String[] strArr = {str};
            int delete = zzh2.delete("apps", "app_id=?", strArr) + zzh2.delete("events", "app_id=?", strArr) + zzh2.delete("user_attributes", "app_id=?", strArr) + zzh2.delete("conditional_properties", "app_id=?", strArr) + zzh2.delete("raw_events", "app_id=?", strArr) + zzh2.delete("raw_events_metadata", "app_id=?", strArr) + zzh2.delete("queue", "app_id=?", strArr) + zzh2.delete("audience_filter_values", "app_id=?", strArr) + zzh2.delete("main_event_params", "app_id=?", strArr) + zzh2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzal.zzs.zzaz().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            zzal.zzs.zzaz().zzd().zzc("Error resetting analytics data. appId, error", zzey.zzn(str), e10);
        }
        if (zzp2.zzh) {
            zzK(zzp2);
        }
    }

    public final void zzQ(String str, zziu zziu) {
        zzaA().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zziu != null) {
            this.zzE = str;
            this.zzD = zziu;
        }
    }

    public final void zzR() {
        zzaA().zzg();
        zzal zzal = this.zze;
        zzak(zzal);
        zzal.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzaw().currentTimeMillis());
        }
        zzaf();
    }

    public final void zzS(zzab zzab) {
        zzp zzab2 = zzab((String) Preconditions.checkNotNull(zzab.zza));
        if (zzab2 != null) {
            zzT(zzab, zzab2);
        }
    }

    public final void zzT(zzab zzab, zzp zzp2) {
        Preconditions.checkNotNull(zzab);
        Preconditions.checkNotEmpty(zzab.zza);
        Preconditions.checkNotNull(zzab.zzb);
        Preconditions.checkNotNull(zzab.zzc);
        Preconditions.checkNotEmpty(zzab.zzc.zzb);
        zzaA().zzg();
        zzB();
        if (zzaj(zzp2)) {
            if (!zzp2.zzh) {
                zzd(zzp2);
                return;
            }
            zzab zzab2 = new zzab(zzab);
            boolean z = false;
            zzab2.zze = false;
            zzal zzal = this.zze;
            zzak(zzal);
            zzal.zzw();
            try {
                zzal zzal2 = this.zze;
                zzak(zzal2);
                zzab zzk2 = zzal2.zzk((String) Preconditions.checkNotNull(zzab2.zza), zzab2.zzc.zzb);
                if (zzk2 != null && !zzk2.zzb.equals(zzab2.zzb)) {
                    zzaz().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzab2.zzc.zzb), zzab2.zzb, zzk2.zzb);
                }
                if (zzk2 != null && zzk2.zze) {
                    zzab2.zzb = zzk2.zzb;
                    zzab2.zzd = zzk2.zzd;
                    zzab2.zzh = zzk2.zzh;
                    zzab2.zzf = zzk2.zzf;
                    zzab2.zzi = zzk2.zzi;
                    zzab2.zze = true;
                    zzll zzll = zzab2.zzc;
                    zzab2.zzc = new zzll(zzll.zzb, zzk2.zzc.zzc, zzll.zza(), zzk2.zzc.zzf);
                } else if (TextUtils.isEmpty(zzab2.zzf)) {
                    zzll zzll2 = zzab2.zzc;
                    zzab2.zzc = new zzll(zzll2.zzb, zzab2.zzd, zzll2.zza(), zzab2.zzc.zzf);
                    zzab2.zze = true;
                    z = true;
                }
                if (zzab2.zze) {
                    zzll zzll3 = zzab2.zzc;
                    zzln zzln = new zzln((String) Preconditions.checkNotNull(zzab2.zza), zzab2.zzb, zzll3.zzb, zzll3.zzc, Preconditions.checkNotNull(zzll3.zza()));
                    zzal zzal3 = this.zze;
                    zzak(zzal3);
                    if (zzal3.zzL(zzln)) {
                        zzaz().zzc().zzd("User property updated immediately", zzab2.zza, this.zzn.zzj().zzf(zzln.zzc), zzln.zze);
                    } else {
                        zzaz().zzd().zzd("(2)Too many active user properties, ignoring", zzey.zzn(zzab2.zza), this.zzn.zzj().zzf(zzln.zzc), zzln.zze);
                    }
                    if (z && zzab2.zzi != null) {
                        zzX(new zzav(zzab2.zzi, zzab2.zzd), zzp2);
                    }
                }
                zzal zzal4 = this.zze;
                zzak(zzal4);
                if (zzal4.zzK(zzab2)) {
                    zzaz().zzc().zzd("Conditional property added", zzab2.zza, this.zzn.zzj().zzf(zzab2.zzc.zzb), zzab2.zzc.zza());
                } else {
                    zzaz().zzd().zzd("Too many conditional properties, ignoring", zzey.zzn(zzab2.zza), this.zzn.zzj().zzf(zzab2.zzc.zzb), zzab2.zzc.zza());
                }
                zzal zzal5 = this.zze;
                zzak(zzal5);
                zzal5.zzC();
            } finally {
                zzal zzal6 = this.zze;
                zzak(zzal6);
                zzal6.zzx();
            }
        }
    }

    public final void zzU(String str, zzah zzah) {
        zzaA().zzg();
        zzB();
        this.zzB.put(str, zzah);
        zzal zzal = this.zze;
        zzak(zzal);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzah);
        zzal.zzg();
        zzal.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzah.zzh());
        try {
            if (zzal.zzh().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                zzal.zzs.zzaz().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzey.zzn(str));
            }
        } catch (SQLiteException e10) {
            zzal.zzs.zzaz().zzd().zzc("Error storing consent setting. appId, error", zzey.zzn(str), e10);
        }
    }

    public final void zzV(zzll zzll, zzp zzp2) {
        long j10;
        zzll zzll2 = zzll;
        zzp zzp3 = zzp2;
        zzaA().zzg();
        zzB();
        if (zzaj(zzp2)) {
            if (!zzp3.zzh) {
                zzd(zzp3);
                return;
            }
            int zzl2 = zzv().zzl(zzll2.zzb);
            int i = 0;
            if (zzl2 != 0) {
                zzlp zzv2 = zzv();
                String str = zzll2.zzb;
                zzg();
                String zzD2 = zzv2.zzD(str, 24, true);
                String str2 = zzll2.zzb;
                zzv().zzN(this.zzF, zzp3.zza, zzl2, "_ev", zzD2, str2 != null ? str2.length() : 0);
                return;
            }
            int zzd2 = zzv().zzd(zzll2.zzb, zzll.zza());
            if (zzd2 != 0) {
                zzlp zzv3 = zzv();
                String str3 = zzll2.zzb;
                zzg();
                String zzD3 = zzv3.zzD(str3, 24, true);
                Object zza2 = zzll.zza();
                if (zza2 != null && ((zza2 instanceof String) || (zza2 instanceof CharSequence))) {
                    i = zza2.toString().length();
                }
                zzv().zzN(this.zzF, zzp3.zza, zzd2, "_ev", zzD3, i);
                return;
            }
            Object zzB2 = zzv().zzB(zzll2.zzb, zzll.zza());
            if (zzB2 != null) {
                if ("_sid".equals(zzll2.zzb)) {
                    long j11 = zzll2.zzc;
                    String str4 = zzll2.zzf;
                    String str5 = (String) Preconditions.checkNotNull(zzp3.zza);
                    zzal zzal = this.zze;
                    zzak(zzal);
                    zzln zzp4 = zzal.zzp(str5, "_sno");
                    if (zzp4 != null) {
                        Object obj = zzp4.zze;
                        if (obj instanceof Long) {
                            j10 = ((Long) obj).longValue();
                            zzV(new zzll("_sno", j11, Long.valueOf(j10 + 1), str4), zzp3);
                        }
                    }
                    if (zzp4 != null) {
                        zzaz().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzp4.zze);
                    }
                    zzal zzal2 = this.zze;
                    zzak(zzal2);
                    zzar zzn2 = zzal2.zzn(str5, "_s");
                    if (zzn2 != null) {
                        j10 = zzn2.zzc;
                        zzaz().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(j10));
                    } else {
                        j10 = 0;
                    }
                    zzV(new zzll("_sno", j11, Long.valueOf(j10 + 1), str4), zzp3);
                }
                zzln zzln = new zzln((String) Preconditions.checkNotNull(zzp3.zza), (String) Preconditions.checkNotNull(zzll2.zzf), zzll2.zzb, zzll2.zzc, zzB2);
                zzaz().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzln.zzc), zzB2);
                zzal zzal3 = this.zze;
                zzak(zzal3);
                zzal3.zzw();
                try {
                    zzne.zzc();
                    if (this.zzn.zzf().zzs((String) null, zzel.zzan) && "_id".equals(zzln.zzc)) {
                        if (this.zzn.zzf().zzs((String) null, zzel.zzaq)) {
                            zzal zzal4 = this.zze;
                            zzak(zzal4);
                            zzln zzp5 = zzal4.zzp(zzp3.zza, "_id");
                            if (zzp5 != null && !zzln.zze.equals(zzp5.zze)) {
                                zzal zzal5 = this.zze;
                                zzak(zzal5);
                                zzal5.zzA(zzp3.zza, "_lair");
                            }
                        } else {
                            zzal zzal6 = this.zze;
                            zzak(zzal6);
                            zzal6.zzA(zzp3.zza, "_lair");
                        }
                    }
                    zzd(zzp3);
                    zzal zzal7 = this.zze;
                    zzak(zzal7);
                    boolean zzL = zzal7.zzL(zzln);
                    zzal zzal8 = this.zze;
                    zzak(zzal8);
                    zzal8.zzC();
                    if (!zzL) {
                        zzaz().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzln.zzc), zzln.zze);
                        zzv().zzN(this.zzF, zzp3.zza, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    zzal zzal9 = this.zze;
                    zzak(zzal9);
                    zzal9.zzx();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:278|279) */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0281, code lost:
        r8 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        r8 = r8.subList(0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0314, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0315, code lost:
        r2 = r0;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:?, code lost:
        zzaz().zzd().zzc("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.zzey.zzn(r6), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06a0, code lost:
        if (r12 != null) goto L_0x067a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06cc, code lost:
        r1.zzv = r3;
        zzad();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06d1, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0129, code lost:
        if (r11 != null) goto L_0x0108;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:278:0x061d */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ad A[SYNTHETIC, Splitter:B:152:0x02ad] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02b6 A[Catch:{ all -> 0x04fa, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04b5 A[Catch:{ all -> 0x04fa, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04c5 A[Catch:{ all -> 0x04fa, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04d4 A[Catch:{ all -> 0x04fa, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0635 A[Catch:{ all -> 0x04fa, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x06aa A[Catch:{ all -> 0x04fa, all -> 0x06c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x06c2 A[SYNTHETIC, Splitter:B:319:0x06c2] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x04ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0134 A[Catch:{ all -> 0x012f, all -> 0x06ca }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:149:0x0294=Splitter:B:149:0x0294, B:309:0x06a4=Splitter:B:309:0x06a4, B:292:0x067a=Splitter:B:292:0x067a, B:180:0x031c=Splitter:B:180:0x031c, B:278:0x061d=Splitter:B:278:0x061d, B:138:0x027e=Splitter:B:138:0x027e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzW() {
        /*
            r26 = this;
            r1 = r26
            com.google.android.gms.measurement.internal.zzgf r2 = r26.zzaA()
            r2.zzg()
            r26.zzB()
            r2 = 1
            r1.zzv = r2
            r3 = 0
            com.google.android.gms.measurement.internal.zzgi r4 = r1.zzn     // Catch:{ all -> 0x06ca }
            r4.zzax()     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzgi r4 = r1.zzn     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzkb r4 = r4.zzt()     // Catch:{ all -> 0x06ca }
            java.lang.Boolean r4 = r4.zzj()     // Catch:{ all -> 0x06ca }
            if (r4 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.zzey r2 = r26.zzaz()     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzk()     // Catch:{ all -> 0x06ca }
            java.lang.String r4 = "Upload data called on the client side before use of service was decided"
            r2.zza(r4)     // Catch:{ all -> 0x06ca }
            r1.zzv = r3
        L_0x0030:
            r26.zzad()
            return
        L_0x0034:
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x06ca }
            if (r4 == 0) goto L_0x004a
            com.google.android.gms.measurement.internal.zzey r2 = r26.zzaz()     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x06ca }
            java.lang.String r4 = "Upload called in the client side when service should be used"
            r2.zza(r4)     // Catch:{ all -> 0x06ca }
            r1.zzv = r3
            goto L_0x0030
        L_0x004a:
            long r4 = r1.zza     // Catch:{ all -> 0x06ca }
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0058
            r26.zzaf()     // Catch:{ all -> 0x06ca }
            r1.zzv = r3
            goto L_0x0030
        L_0x0058:
            com.google.android.gms.measurement.internal.zzgf r4 = r26.zzaA()     // Catch:{ all -> 0x06ca }
            r4.zzg()     // Catch:{ all -> 0x06ca }
            java.util.List r4 = r1.zzy     // Catch:{ all -> 0x06ca }
            if (r4 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.zzey r2 = r26.zzaz()     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzj()     // Catch:{ all -> 0x06ca }
            java.lang.String r4 = "Uploading requested multiple times"
            r2.zza(r4)     // Catch:{ all -> 0x06ca }
            r1.zzv = r3
            goto L_0x0030
        L_0x0073:
            com.google.android.gms.measurement.internal.zzfe r4 = r1.zzd     // Catch:{ all -> 0x06ca }
            zzak(r4)     // Catch:{ all -> 0x06ca }
            boolean r4 = r4.zza()     // Catch:{ all -> 0x06ca }
            if (r4 != 0) goto L_0x0091
            com.google.android.gms.measurement.internal.zzey r2 = r26.zzaz()     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzj()     // Catch:{ all -> 0x06ca }
            java.lang.String r4 = "Network not connected, ignoring upload request"
            r2.zza(r4)     // Catch:{ all -> 0x06ca }
            r26.zzaf()     // Catch:{ all -> 0x06ca }
            r1.zzv = r3
            goto L_0x0030
        L_0x0091:
            com.google.android.gms.common.util.Clock r4 = r26.zzaw()     // Catch:{ all -> 0x06ca }
            long r4 = r4.currentTimeMillis()     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzaf r8 = r26.zzg()     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzek r9 = com.google.android.gms.measurement.internal.zzel.zzP     // Catch:{ all -> 0x06ca }
            r10 = 0
            int r8 = r8.zze(r10, r9)     // Catch:{ all -> 0x06ca }
            r26.zzg()     // Catch:{ all -> 0x06ca }
            long r11 = com.google.android.gms.measurement.internal.zzaf.zzz()     // Catch:{ all -> 0x06ca }
            long r11 = r4 - r11
            r9 = r3
        L_0x00ae:
            if (r9 >= r8) goto L_0x00b9
            boolean r13 = r1.zzag(r10, r11)     // Catch:{ all -> 0x06ca }
            if (r13 == 0) goto L_0x00b9
            int r9 = r9 + 1
            goto L_0x00ae
        L_0x00b9:
            com.google.android.gms.measurement.internal.zzkd r8 = r1.zzk     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzfj r8 = r8.zzc     // Catch:{ all -> 0x06ca }
            long r8 = r8.zza()     // Catch:{ all -> 0x06ca }
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.zzey r6 = r26.zzaz()     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzew r6 = r6.zzc()     // Catch:{ all -> 0x06ca }
            java.lang.String r7 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r8 = r4 - r8
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x06ca }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x06ca }
            r6.zzb(r7, r8)     // Catch:{ all -> 0x06ca }
        L_0x00dc:
            com.google.android.gms.measurement.internal.zzal r6 = r1.zze     // Catch:{ all -> 0x06ca }
            zzak(r6)     // Catch:{ all -> 0x06ca }
            java.lang.String r6 = r6.zzr()     // Catch:{ all -> 0x06ca }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x06ca }
            r8 = -1
            if (r7 != 0) goto L_0x0639
            long r11 = r1.zzA     // Catch:{ all -> 0x06ca }
            int r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0138
            com.google.android.gms.measurement.internal.zzal r7 = r1.zze     // Catch:{ all -> 0x06ca }
            zzak(r7)     // Catch:{ all -> 0x06ca }
            android.database.sqlite.SQLiteDatabase r11 = r7.zzh()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            java.lang.String r12 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r11.rawQuery(r12, r10)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            boolean r12 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0111 }
            if (r12 != 0) goto L_0x010c
        L_0x0108:
            r11.close()     // Catch:{ all -> 0x06ca }
            goto L_0x012c
        L_0x010c:
            long r8 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0111 }
            goto L_0x0108
        L_0x0111:
            r0 = move-exception
            r12 = r0
            goto L_0x011a
        L_0x0114:
            r0 = move-exception
            r2 = r0
            goto L_0x0132
        L_0x0117:
            r0 = move-exception
            r12 = r0
            r11 = r10
        L_0x011a:
            com.google.android.gms.measurement.internal.zzgi r7 = r7.zzs     // Catch:{ all -> 0x012f }
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzaz()     // Catch:{ all -> 0x012f }
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzd()     // Catch:{ all -> 0x012f }
            java.lang.String r13 = "Error querying raw events"
            r7.zzb(r13, r12)     // Catch:{ all -> 0x012f }
            if (r11 == 0) goto L_0x012c
            goto L_0x0108
        L_0x012c:
            r1.zzA = r8     // Catch:{ all -> 0x06ca }
            goto L_0x0138
        L_0x012f:
            r0 = move-exception
            r2 = r0
            r10 = r11
        L_0x0132:
            if (r10 == 0) goto L_0x0137
            r10.close()     // Catch:{ all -> 0x06ca }
        L_0x0137:
            throw r2     // Catch:{ all -> 0x06ca }
        L_0x0138:
            com.google.android.gms.measurement.internal.zzaf r7 = r26.zzg()     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzek r8 = com.google.android.gms.measurement.internal.zzel.zzf     // Catch:{ all -> 0x06ca }
            int r7 = r7.zze(r6, r8)     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzaf r8 = r26.zzg()     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzek r9 = com.google.android.gms.measurement.internal.zzel.zzg     // Catch:{ all -> 0x06ca }
            int r8 = r8.zze(r6, r9)     // Catch:{ all -> 0x06ca }
            int r8 = java.lang.Math.max(r3, r8)     // Catch:{ all -> 0x06ca }
            com.google.android.gms.measurement.internal.zzal r9 = r1.zze     // Catch:{ all -> 0x06ca }
            zzak(r9)     // Catch:{ all -> 0x06ca }
            r9.zzg()     // Catch:{ all -> 0x06ca }
            r9.zzW()     // Catch:{ all -> 0x06ca }
            if (r7 <= 0) goto L_0x015f
            r11 = r2
            goto L_0x0160
        L_0x015f:
            r11 = r3
        L_0x0160:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r11)     // Catch:{ all -> 0x06ca }
            if (r8 <= 0) goto L_0x0167
            r11 = r2
            goto L_0x0168
        L_0x0167:
            r11 = r3
        L_0x0168:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r11)     // Catch:{ all -> 0x06ca }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)     // Catch:{ all -> 0x06ca }
            android.database.sqlite.SQLiteDatabase r12 = r9.zzh()     // Catch:{ SQLiteException -> 0x028f, all -> 0x028a }
            java.lang.String r13 = "rowid"
            java.lang.String r14 = "data"
            java.lang.String r15 = "retry_count"
            java.lang.String[] r14 = new java.lang.String[]{r13, r14, r15}     // Catch:{ SQLiteException -> 0x028f, all -> 0x028a }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x028f, all -> 0x028a }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x028f, all -> 0x028a }
            java.lang.String r13 = "queue"
            java.lang.String r16 = "app_id=?"
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x028f, all -> 0x028a }
            r7 = r15
            r15 = r16
            r16 = r7
            android.database.Cursor r7 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x028f, all -> 0x028a }
            boolean r12 = r7.moveToFirst()     // Catch:{ SQLiteException -> 0x0285 }
            if (r12 != 0) goto L_0x01ae
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x01a8 }
            r7.close()     // Catch:{ all -> 0x06ca }
            r20 = r4
            goto L_0x02b0
        L_0x01a8:
            r0 = move-exception
            r2 = r0
            r20 = r4
            goto L_0x0294
        L_0x01ae:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0285 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0285 }
            r13 = r3
        L_0x01b4:
            long r14 = r7.getLong(r3)     // Catch:{ SQLiteException -> 0x0285 }
            byte[] r10 = r7.getBlob(r2)     // Catch:{ IOException -> 0x0257 }
            com.google.android.gms.measurement.internal.zzli r2 = r9.zzf     // Catch:{ IOException -> 0x0257 }
            com.google.android.gms.measurement.internal.zzlk r2 = r2.zzi     // Catch:{ IOException -> 0x0257 }
            zzak(r2)     // Catch:{ IOException -> 0x0257 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0241 }
            r3.<init>(r10)     // Catch:{ IOException -> 0x0241 }
            java.util.zip.GZIPInputStream r10 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0241 }
            r10.<init>(r3)     // Catch:{ IOException -> 0x0241 }
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0241 }
            r11.<init>()     // Catch:{ IOException -> 0x0241 }
            r20 = r4
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x023f }
        L_0x01d8:
            int r5 = r10.read(r4)     // Catch:{ IOException -> 0x023f }
            if (r5 > 0) goto L_0x0236
            r10.close()     // Catch:{ IOException -> 0x023f }
            r3.close()     // Catch:{ IOException -> 0x023f }
            byte[] r2 = r11.toByteArray()     // Catch:{ IOException -> 0x023f }
            boolean r3 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x0283 }
            if (r3 != 0) goto L_0x01f4
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x0283 }
            int r3 = r3 + r13
            if (r3 <= r8) goto L_0x01f4
            goto L_0x027e
        L_0x01f4:
            com.google.android.gms.internal.measurement.zzgb r3 = com.google.android.gms.internal.measurement.zzgc.zzu()     // Catch:{ IOException -> 0x0220 }
            com.google.android.gms.internal.measurement.zzli r3 = com.google.android.gms.measurement.internal.zzlk.zzl(r3, r2)     // Catch:{ IOException -> 0x0220 }
            com.google.android.gms.internal.measurement.zzgb r3 = (com.google.android.gms.internal.measurement.zzgb) r3     // Catch:{ IOException -> 0x0220 }
            r4 = 2
            boolean r5 = r7.isNull(r4)     // Catch:{ SQLiteException -> 0x0283 }
            if (r5 != 0) goto L_0x020c
            int r5 = r7.getInt(r4)     // Catch:{ SQLiteException -> 0x0283 }
            r3.zzag(r5)     // Catch:{ SQLiteException -> 0x0283 }
        L_0x020c:
            int r2 = r2.length     // Catch:{ SQLiteException -> 0x0283 }
            int r13 = r13 + r2
            com.google.android.gms.internal.measurement.zzkc r2 = r3.zzaE()     // Catch:{ SQLiteException -> 0x0283 }
            com.google.android.gms.internal.measurement.zzgc r2 = (com.google.android.gms.internal.measurement.zzgc) r2     // Catch:{ SQLiteException -> 0x0283 }
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x0283 }
            android.util.Pair r2 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0283 }
            r12.add(r2)     // Catch:{ SQLiteException -> 0x0283 }
            goto L_0x026e
        L_0x0220:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzgi r3 = r9.zzs     // Catch:{ SQLiteException -> 0x0283 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()     // Catch:{ SQLiteException -> 0x0283 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()     // Catch:{ SQLiteException -> 0x0283 }
            java.lang.String r4 = "Failed to merge queued bundle. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzey.zzn(r6)     // Catch:{ SQLiteException -> 0x0283 }
            r3.zzc(r4, r5, r2)     // Catch:{ SQLiteException -> 0x0283 }
            goto L_0x026e
        L_0x0236:
            r22 = r3
            r3 = 0
            r11.write(r4, r3, r5)     // Catch:{ IOException -> 0x023f }
            r3 = r22
            goto L_0x01d8
        L_0x023f:
            r0 = move-exception
            goto L_0x0244
        L_0x0241:
            r0 = move-exception
            r20 = r4
        L_0x0244:
            r3 = r0
            com.google.android.gms.measurement.internal.zzgi r2 = r2.zzs     // Catch:{ IOException -> 0x0255 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch:{ IOException -> 0x0255 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ IOException -> 0x0255 }
            java.lang.String r4 = "Failed to ungzip content"
            r2.zzb(r4, r3)     // Catch:{ IOException -> 0x0255 }
            throw r3     // Catch:{ IOException -> 0x0255 }
        L_0x0255:
            r0 = move-exception
            goto L_0x025a
        L_0x0257:
            r0 = move-exception
            r20 = r4
        L_0x025a:
            r2 = r0
            com.google.android.gms.measurement.internal.zzgi r3 = r9.zzs     // Catch:{ SQLiteException -> 0x0283 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()     // Catch:{ SQLiteException -> 0x0283 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()     // Catch:{ SQLiteException -> 0x0283 }
            java.lang.String r4 = "Failed to unzip queued bundle. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzey.zzn(r6)     // Catch:{ SQLiteException -> 0x0283 }
            r3.zzc(r4, r5, r2)     // Catch:{ SQLiteException -> 0x0283 }
        L_0x026e:
            boolean r2 = r7.moveToNext()     // Catch:{ SQLiteException -> 0x0283 }
            if (r2 == 0) goto L_0x027e
            if (r13 <= r8) goto L_0x0277
            goto L_0x027e
        L_0x0277:
            r4 = r20
            r2 = 1
            r3 = 0
            r10 = 0
            goto L_0x01b4
        L_0x027e:
            r7.close()     // Catch:{ all -> 0x06c6 }
            r8 = r12
            goto L_0x02b0
        L_0x0283:
            r0 = move-exception
            goto L_0x0288
        L_0x0285:
            r0 = move-exception
            r20 = r4
        L_0x0288:
            r2 = r0
            goto L_0x0294
        L_0x028a:
            r0 = move-exception
            r2 = r0
            r10 = 0
            goto L_0x0633
        L_0x028f:
            r0 = move-exception
            r20 = r4
            r2 = r0
            r7 = 0
        L_0x0294:
            com.google.android.gms.measurement.internal.zzgi r3 = r9.zzs     // Catch:{ all -> 0x0630 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()     // Catch:{ all -> 0x0630 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()     // Catch:{ all -> 0x0630 }
            java.lang.String r4 = "Error querying bundles. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzey.zzn(r6)     // Catch:{ all -> 0x0630 }
            r3.zzc(r4, r5, r2)     // Catch:{ all -> 0x0630 }
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0630 }
            if (r7 == 0) goto L_0x02b0
            r7.close()     // Catch:{ all -> 0x06c6 }
        L_0x02b0:
            boolean r2 = r8.isEmpty()     // Catch:{ all -> 0x06c6 }
            if (r2 != 0) goto L_0x06b8
            com.google.android.gms.measurement.internal.zzah r2 = r1.zzh(r6)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzag r3 = com.google.android.gms.measurement.internal.zzag.AD_STORAGE     // Catch:{ all -> 0x06c6 }
            boolean r2 = r2.zzi(r3)     // Catch:{ all -> 0x06c6 }
            if (r2 == 0) goto L_0x031c
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x06c6 }
        L_0x02c6:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x06c6 }
            if (r3 == 0) goto L_0x02e5
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x06c6 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x06c6 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.internal.measurement.zzgc r3 = (com.google.android.gms.internal.measurement.zzgc) r3     // Catch:{ all -> 0x06c6 }
            java.lang.String r4 = r3.zzK()     // Catch:{ all -> 0x06c6 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x06c6 }
            if (r4 != 0) goto L_0x02c6
            java.lang.String r2 = r3.zzK()     // Catch:{ all -> 0x06c6 }
            goto L_0x02e6
        L_0x02e5:
            r2 = 0
        L_0x02e6:
            if (r2 == 0) goto L_0x031c
            r3 = 0
        L_0x02e9:
            int r4 = r8.size()     // Catch:{ all -> 0x06c6 }
            if (r3 >= r4) goto L_0x031c
            java.lang.Object r4 = r8.get(r3)     // Catch:{ all -> 0x06c6 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x06c6 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.internal.measurement.zzgc r4 = (com.google.android.gms.internal.measurement.zzgc) r4     // Catch:{ all -> 0x06c6 }
            java.lang.String r5 = r4.zzK()     // Catch:{ all -> 0x06c6 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x0304
            goto L_0x0319
        L_0x0304:
            java.lang.String r4 = r4.zzK()     // Catch:{ all -> 0x06c6 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x06c6 }
            if (r4 != 0) goto L_0x0319
            r4 = 0
            java.util.List r8 = r8.subList(r4, r3)     // Catch:{ all -> 0x0314 }
            goto L_0x031c
        L_0x0314:
            r0 = move-exception
            r2 = r0
            r3 = r4
            goto L_0x06cc
        L_0x0319:
            int r3 = r3 + 1
            goto L_0x02e9
        L_0x031c:
            com.google.android.gms.internal.measurement.zzfz r2 = com.google.android.gms.internal.measurement.zzga.zza()     // Catch:{ all -> 0x06c6 }
            int r3 = r8.size()     // Catch:{ all -> 0x06c6 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x06c6 }
            int r5 = r8.size()     // Catch:{ all -> 0x06c6 }
            r4.<init>(r5)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzaf r5 = r26.zzg()     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzt(r6)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x0345
            com.google.android.gms.measurement.internal.zzah r5 = r1.zzh(r6)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzag r7 = com.google.android.gms.measurement.internal.zzag.AD_STORAGE     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzi(r7)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x0345
            r5 = 1
            goto L_0x0346
        L_0x0345:
            r5 = 0
        L_0x0346:
            com.google.android.gms.measurement.internal.zzah r7 = r1.zzh(r6)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzag r9 = com.google.android.gms.measurement.internal.zzag.AD_STORAGE     // Catch:{ all -> 0x06c6 }
            boolean r7 = r7.zzi(r9)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzah r9 = r1.zzh(r6)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzag r10 = com.google.android.gms.measurement.internal.zzag.ANALYTICS_STORAGE     // Catch:{ all -> 0x06c6 }
            boolean r9 = r9.zzi(r10)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.internal.measurement.zzpp.zzc()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzaf r10 = r26.zzg()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzek r11 = com.google.android.gms.measurement.internal.zzel.zzaH     // Catch:{ all -> 0x06c6 }
            r12 = 0
            boolean r10 = r10.zzs(r12, r11)     // Catch:{ all -> 0x06c6 }
            r11 = 0
        L_0x0369:
            if (r11 >= r3) goto L_0x04ff
            java.lang.Object r12 = r8.get(r11)     // Catch:{ all -> 0x06c6 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x06c6 }
            java.lang.Object r12 = r12.first     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.internal.measurement.zzgc r12 = (com.google.android.gms.internal.measurement.zzgc) r12     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.internal.measurement.zzjy r12 = r12.zzbB()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.internal.measurement.zzgb r12 = (com.google.android.gms.internal.measurement.zzgb) r12     // Catch:{ all -> 0x06c6 }
            java.lang.Object r13 = r8.get(r11)     // Catch:{ all -> 0x06c6 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x06c6 }
            java.lang.Object r13 = r13.second     // Catch:{ all -> 0x06c6 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x06c6 }
            r4.add(r13)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzaf r13 = r26.zzg()     // Catch:{ all -> 0x06c6 }
            r13.zzh()     // Catch:{ all -> 0x06c6 }
            r13 = 61000(0xee48, double:3.0138E-319)
            r12.zzam(r13)     // Catch:{ all -> 0x06c6 }
            r13 = r20
            r12.zzal(r13)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzgi r15 = r1.zzn     // Catch:{ all -> 0x06c6 }
            r15.zzax()     // Catch:{ all -> 0x06c6 }
            r15 = 0
            r12.zzah(r15)     // Catch:{ all -> 0x04fa }
            if (r5 != 0) goto L_0x03a8
            r12.zzq()     // Catch:{ all -> 0x06c6 }
        L_0x03a8:
            if (r7 != 0) goto L_0x03b0
            r12.zzx()     // Catch:{ all -> 0x06c6 }
            r12.zzt()     // Catch:{ all -> 0x06c6 }
        L_0x03b0:
            if (r9 != 0) goto L_0x03b5
            r12.zzn()     // Catch:{ all -> 0x06c6 }
        L_0x03b5:
            com.google.android.gms.internal.measurement.zzpg.zzc()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzaf r15 = r26.zzg()     // Catch:{ all -> 0x06c6 }
            r20 = r5
            com.google.android.gms.measurement.internal.zzek r5 = com.google.android.gms.measurement.internal.zzel.zzaC     // Catch:{ all -> 0x06c6 }
            boolean r5 = r15.zzs(r6, r5)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x03d4
            com.google.android.gms.measurement.internal.zzfz r5 = r1.zzc     // Catch:{ all -> 0x06c6 }
            zzak(r5)     // Catch:{ all -> 0x06c6 }
            java.util.Set r5 = r5.zzk(r6)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x03d4
            r12.zzi(r5)     // Catch:{ all -> 0x06c6 }
        L_0x03d4:
            com.google.android.gms.measurement.internal.zzaf r5 = r26.zzg()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzek r15 = com.google.android.gms.measurement.internal.zzel.zzaE     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzs(r6, r15)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x03fc
            com.google.android.gms.measurement.internal.zzfz r5 = r1.zzc     // Catch:{ all -> 0x06c6 }
            zzak(r5)     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzv(r6)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x03ee
            r12.zzp()     // Catch:{ all -> 0x06c6 }
        L_0x03ee:
            com.google.android.gms.measurement.internal.zzfz r5 = r1.zzc     // Catch:{ all -> 0x06c6 }
            zzak(r5)     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzy(r6)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x03fc
            r12.zzu()     // Catch:{ all -> 0x06c6 }
        L_0x03fc:
            com.google.android.gms.measurement.internal.zzaf r5 = r26.zzg()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzek r15 = com.google.android.gms.measurement.internal.zzel.zzaF     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzs(r6, r15)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x041f
            com.google.android.gms.measurement.internal.zzfz r5 = r1.zzc     // Catch:{ all -> 0x06c6 }
            zzak(r5)     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzz(r6)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x041f
            java.lang.String r5 = "_id"
            int r5 = com.google.android.gms.measurement.internal.zzlk.zza(r12, r5)     // Catch:{ all -> 0x06c6 }
            r15 = -1
            if (r5 == r15) goto L_0x041f
            r12.zzB(r5)     // Catch:{ all -> 0x06c6 }
        L_0x041f:
            com.google.android.gms.measurement.internal.zzaf r5 = r26.zzg()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzek r15 = com.google.android.gms.measurement.internal.zzel.zzaG     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzs(r6, r15)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x0439
            com.google.android.gms.measurement.internal.zzfz r5 = r1.zzc     // Catch:{ all -> 0x06c6 }
            zzak(r5)     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzx(r6)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x0439
            r12.zzq()     // Catch:{ all -> 0x06c6 }
        L_0x0439:
            com.google.android.gms.measurement.internal.zzaf r5 = r26.zzg()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzek r15 = com.google.android.gms.measurement.internal.zzel.zzaJ     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzs(r6, r15)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x04a4
            com.google.android.gms.measurement.internal.zzfz r5 = r1.zzc     // Catch:{ all -> 0x06c6 }
            zzak(r5)     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzu(r6)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x04a4
            r12.zzn()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzaf r5 = r26.zzg()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzek r15 = com.google.android.gms.measurement.internal.zzel.zzaK     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzs(r6, r15)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x04a4
            java.util.Map r5 = r1.zzC     // Catch:{ all -> 0x06c6 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzlh r5 = (com.google.android.gms.measurement.internal.zzlh) r5     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x048e
            r21 = r7
            r15 = r8
            long r7 = r5.zzb     // Catch:{ all -> 0x06c6 }
            r22 = r5
            com.google.android.gms.measurement.internal.zzaf r5 = r26.zzg()     // Catch:{ all -> 0x06c6 }
            r23 = r9
            com.google.android.gms.measurement.internal.zzek r9 = com.google.android.gms.measurement.internal.zzel.zzR     // Catch:{ all -> 0x06c6 }
            long r24 = r5.zzi(r6, r9)     // Catch:{ all -> 0x06c6 }
            long r7 = r7 + r24
            com.google.android.gms.common.util.Clock r5 = r26.zzaw()     // Catch:{ all -> 0x06c6 }
            long r24 = r5.elapsedRealtime()     // Catch:{ all -> 0x06c6 }
            int r5 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r5 >= 0) goto L_0x048b
            goto L_0x0493
        L_0x048b:
            r5 = r22
            goto L_0x049e
        L_0x048e:
            r21 = r7
            r15 = r8
            r23 = r9
        L_0x0493:
            com.google.android.gms.measurement.internal.zzlh r5 = new com.google.android.gms.measurement.internal.zzlh     // Catch:{ all -> 0x06c6 }
            r7 = 0
            r5.<init>((com.google.android.gms.measurement.internal.zzli) r1)     // Catch:{ all -> 0x06c6 }
            java.util.Map r7 = r1.zzC     // Catch:{ all -> 0x06c6 }
            r7.put(r6, r5)     // Catch:{ all -> 0x06c6 }
        L_0x049e:
            java.lang.String r5 = r5.zza     // Catch:{ all -> 0x06c6 }
            r12.zzS(r5)     // Catch:{ all -> 0x06c6 }
            goto L_0x04a9
        L_0x04a4:
            r21 = r7
            r15 = r8
            r23 = r9
        L_0x04a9:
            com.google.android.gms.measurement.internal.zzaf r5 = r26.zzg()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzek r7 = com.google.android.gms.measurement.internal.zzel.zzaL     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzs(r6, r7)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x04c3
            com.google.android.gms.measurement.internal.zzfz r5 = r1.zzc     // Catch:{ all -> 0x06c6 }
            zzak(r5)     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzw(r6)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x04c3
            r12.zzy()     // Catch:{ all -> 0x06c6 }
        L_0x04c3:
            if (r10 != 0) goto L_0x04c8
            r12.zzy()     // Catch:{ all -> 0x06c6 }
        L_0x04c8:
            com.google.android.gms.measurement.internal.zzaf r5 = r26.zzg()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzek r7 = com.google.android.gms.measurement.internal.zzel.zzU     // Catch:{ all -> 0x06c6 }
            boolean r5 = r5.zzs(r6, r7)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x04ea
            com.google.android.gms.internal.measurement.zzkc r5 = r12.zzaE()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.internal.measurement.zzgc r5 = (com.google.android.gms.internal.measurement.zzgc) r5     // Catch:{ all -> 0x06c6 }
            byte[] r5 = r5.zzby()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzlk r7 = r1.zzi     // Catch:{ all -> 0x06c6 }
            zzak(r7)     // Catch:{ all -> 0x06c6 }
            long r7 = r7.zzd(r5)     // Catch:{ all -> 0x06c6 }
            r12.zzK(r7)     // Catch:{ all -> 0x06c6 }
        L_0x04ea:
            r2.zza(r12)     // Catch:{ all -> 0x06c6 }
            int r11 = r11 + 1
            r8 = r15
            r5 = r20
            r7 = r21
            r9 = r23
            r20 = r13
            goto L_0x0369
        L_0x04fa:
            r0 = move-exception
            r2 = r0
            r3 = r15
            goto L_0x06cc
        L_0x04ff:
            r13 = r20
            com.google.android.gms.measurement.internal.zzey r5 = r26.zzaz()     // Catch:{ all -> 0x06c6 }
            java.lang.String r5 = r5.zzq()     // Catch:{ all -> 0x06c6 }
            r7 = 2
            boolean r5 = android.util.Log.isLoggable(r5, r7)     // Catch:{ all -> 0x06c6 }
            if (r5 == 0) goto L_0x0521
            com.google.android.gms.measurement.internal.zzlk r5 = r1.zzi     // Catch:{ all -> 0x06c6 }
            zzak(r5)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.internal.measurement.zzkc r7 = r2.zzaE()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.internal.measurement.zzga r7 = (com.google.android.gms.internal.measurement.zzga) r7     // Catch:{ all -> 0x06c6 }
            java.lang.String r5 = r5.zzm(r7)     // Catch:{ all -> 0x06c6 }
            r12 = r5
            goto L_0x0522
        L_0x0521:
            r12 = 0
        L_0x0522:
            com.google.android.gms.measurement.internal.zzlk r5 = r1.zzi     // Catch:{ all -> 0x06c6 }
            zzak(r5)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.internal.measurement.zzkc r5 = r2.zzaE()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.internal.measurement.zzga r5 = (com.google.android.gms.internal.measurement.zzga) r5     // Catch:{ all -> 0x06c6 }
            byte[] r15 = r5.zzby()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzkx r5 = r1.zzl     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.internal.measurement.zzpg.zzc()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzgi r7 = r5.zzs     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzaf r7 = r7.zzf()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzek r8 = com.google.android.gms.measurement.internal.zzel.zzaD     // Catch:{ all -> 0x06c6 }
            boolean r7 = r7.zzs(r6, r8)     // Catch:{ all -> 0x06c6 }
            if (r7 == 0) goto L_0x0594
            com.google.android.gms.measurement.internal.zzli r5 = r5.zzf     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzfz r5 = r5.zzc     // Catch:{ all -> 0x06c6 }
            zzak(r5)     // Catch:{ all -> 0x06c6 }
            java.lang.String r5 = r5.zzi(r6)     // Catch:{ all -> 0x06c6 }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x06c6 }
            if (r7 != 0) goto L_0x058a
            com.google.android.gms.measurement.internal.zzek r7 = com.google.android.gms.measurement.internal.zzel.zzp     // Catch:{ all -> 0x06c6 }
            r8 = 0
            java.lang.Object r7 = r7.zza(r8)     // Catch:{ all -> 0x06c6 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x06c6 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x06c6 }
            android.net.Uri$Builder r8 = r7.buildUpon()     // Catch:{ all -> 0x06c6 }
            java.lang.String r7 = r7.getAuthority()     // Catch:{ all -> 0x06c6 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x06c6 }
            r9.<init>()     // Catch:{ all -> 0x06c6 }
            r9.append(r5)     // Catch:{ all -> 0x06c6 }
            java.lang.String r5 = "."
            r9.append(r5)     // Catch:{ all -> 0x06c6 }
            r9.append(r7)     // Catch:{ all -> 0x06c6 }
            java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x06c6 }
            r8.authority(r5)     // Catch:{ all -> 0x06c6 }
            android.net.Uri r5 = r8.build()     // Catch:{ all -> 0x06c6 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x06c6 }
            goto L_0x059d
        L_0x058a:
            com.google.android.gms.measurement.internal.zzek r5 = com.google.android.gms.measurement.internal.zzel.zzp     // Catch:{ all -> 0x06c6 }
            r7 = 0
            java.lang.Object r5 = r5.zza(r7)     // Catch:{ all -> 0x06c6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x06c6 }
            goto L_0x059d
        L_0x0594:
            com.google.android.gms.measurement.internal.zzek r5 = com.google.android.gms.measurement.internal.zzel.zzp     // Catch:{ all -> 0x06c6 }
            r7 = 0
            java.lang.Object r5 = r5.zza(r7)     // Catch:{ all -> 0x06c6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x06c6 }
        L_0x059d:
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x061d }
            r7.<init>(r5)     // Catch:{ MalformedURLException -> 0x061d }
            boolean r8 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x061d }
            r9 = 1
            r8 = r8 ^ r9
            com.google.android.gms.common.internal.Preconditions.checkArgument(r8)     // Catch:{ MalformedURLException -> 0x061d }
            java.util.List r8 = r1.zzy     // Catch:{ MalformedURLException -> 0x061d }
            if (r8 == 0) goto L_0x05bd
            com.google.android.gms.measurement.internal.zzey r4 = r26.zzaz()     // Catch:{ MalformedURLException -> 0x061d }
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzd()     // Catch:{ MalformedURLException -> 0x061d }
            java.lang.String r8 = "Set uploading progress before finishing the previous upload"
            r4.zza(r8)     // Catch:{ MalformedURLException -> 0x061d }
            goto L_0x05c4
        L_0x05bd:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x061d }
            r8.<init>(r4)     // Catch:{ MalformedURLException -> 0x061d }
            r1.zzy = r8     // Catch:{ MalformedURLException -> 0x061d }
        L_0x05c4:
            com.google.android.gms.measurement.internal.zzkd r4 = r1.zzk     // Catch:{ MalformedURLException -> 0x061d }
            com.google.android.gms.measurement.internal.zzfj r4 = r4.zzd     // Catch:{ MalformedURLException -> 0x061d }
            r4.zzb(r13)     // Catch:{ MalformedURLException -> 0x061d }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x05d8
            r3 = 0
            com.google.android.gms.internal.measurement.zzgc r2 = r2.zzb(r3)     // Catch:{  }
            java.lang.String r4 = r2.zzy()     // Catch:{ MalformedURLException -> 0x061d }
        L_0x05d8:
            com.google.android.gms.measurement.internal.zzey r2 = r26.zzaz()     // Catch:{ MalformedURLException -> 0x061d }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzj()     // Catch:{ MalformedURLException -> 0x061d }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r8 = r15.length     // Catch:{ MalformedURLException -> 0x061d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x061d }
            r2.zzd(r3, r4, r8, r12)     // Catch:{ MalformedURLException -> 0x061d }
            r2 = 1
            r1.zzu = r2     // Catch:{ MalformedURLException -> 0x061d }
            com.google.android.gms.measurement.internal.zzfe r12 = r1.zzd     // Catch:{ MalformedURLException -> 0x061d }
            zzak(r12)     // Catch:{ MalformedURLException -> 0x061d }
            com.google.android.gms.measurement.internal.zzkz r2 = new com.google.android.gms.measurement.internal.zzkz     // Catch:{ MalformedURLException -> 0x061d }
            r2.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x061d }
            r12.zzg()     // Catch:{ MalformedURLException -> 0x061d }
            r12.zzW()     // Catch:{ MalformedURLException -> 0x061d }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ MalformedURLException -> 0x061d }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r15)     // Catch:{ MalformedURLException -> 0x061d }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ MalformedURLException -> 0x061d }
            com.google.android.gms.measurement.internal.zzgi r3 = r12.zzs     // Catch:{ MalformedURLException -> 0x061d }
            com.google.android.gms.measurement.internal.zzgf r3 = r3.zzaA()     // Catch:{ MalformedURLException -> 0x061d }
            com.google.android.gms.measurement.internal.zzfd r4 = new com.google.android.gms.measurement.internal.zzfd     // Catch:{ MalformedURLException -> 0x061d }
            r16 = 0
            r11 = r4
            r13 = r6
            r14 = r7
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ MalformedURLException -> 0x061d }
            r3.zzo(r4)     // Catch:{ MalformedURLException -> 0x061d }
            goto L_0x06b8
        L_0x061d:
            com.google.android.gms.measurement.internal.zzey r2 = r26.zzaz()     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x06c6 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r6)     // Catch:{ all -> 0x06c6 }
            r2.zzc(r3, r4, r5)     // Catch:{ all -> 0x06c6 }
            goto L_0x06b8
        L_0x0630:
            r0 = move-exception
            r2 = r0
            r10 = r7
        L_0x0633:
            if (r10 == 0) goto L_0x0638
            r10.close()     // Catch:{ all -> 0x06c6 }
        L_0x0638:
            throw r2     // Catch:{ all -> 0x06c6 }
        L_0x0639:
            r13 = r4
            r7 = r10
            r1.zzA = r8     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x06c6 }
            zzak(r2)     // Catch:{ all -> 0x06c6 }
            r26.zzg()     // Catch:{ all -> 0x06c6 }
            long r3 = com.google.android.gms.measurement.internal.zzaf.zzz()     // Catch:{ all -> 0x06c6 }
            long r4 = r13 - r3
            r2.zzg()     // Catch:{ all -> 0x06c6 }
            r2.zzW()     // Catch:{ all -> 0x06c6 }
            android.database.sqlite.SQLiteDatabase r3 = r2.zzh()     // Catch:{ SQLiteException -> 0x068e, all -> 0x068a }
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x068e, all -> 0x068a }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x068e, all -> 0x068a }
            r5 = 0
            r6[r5] = r4     // Catch:{ SQLiteException -> 0x068e, all -> 0x068a }
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r12 = r3.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x068e, all -> 0x068a }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0687 }
            if (r3 != 0) goto L_0x067e
            com.google.android.gms.measurement.internal.zzgi r3 = r2.zzs     // Catch:{ SQLiteException -> 0x0687 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()     // Catch:{ SQLiteException -> 0x0687 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzj()     // Catch:{ SQLiteException -> 0x0687 }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r3.zza(r4)     // Catch:{ SQLiteException -> 0x0687 }
        L_0x067a:
            r12.close()     // Catch:{ all -> 0x06c6 }
            goto L_0x06a3
        L_0x067e:
            r3 = 0
            java.lang.String r10 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x0687 }
            r12.close()     // Catch:{ all -> 0x06c6 }
            goto L_0x06a4
        L_0x0687:
            r0 = move-exception
            r3 = r0
            goto L_0x0691
        L_0x068a:
            r0 = move-exception
            r2 = r0
            r10 = r7
            goto L_0x06c0
        L_0x068e:
            r0 = move-exception
            r3 = r0
            r12 = r7
        L_0x0691:
            com.google.android.gms.measurement.internal.zzgi r2 = r2.zzs     // Catch:{ all -> 0x06bd }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch:{ all -> 0x06bd }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x06bd }
            java.lang.String r4 = "Error selecting expired configs"
            r2.zzb(r4, r3)     // Catch:{ all -> 0x06bd }
            if (r12 == 0) goto L_0x06a3
            goto L_0x067a
        L_0x06a3:
            r10 = r7
        L_0x06a4:
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x06c6 }
            if (r2 != 0) goto L_0x06b8
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x06c6 }
            zzak(r2)     // Catch:{ all -> 0x06c6 }
            com.google.android.gms.measurement.internal.zzg r2 = r2.zzj(r10)     // Catch:{ all -> 0x06c6 }
            if (r2 == 0) goto L_0x06b8
            r1.zzC(r2)     // Catch:{ all -> 0x06c6 }
        L_0x06b8:
            r2 = 0
            r1.zzv = r2
            goto L_0x0030
        L_0x06bd:
            r0 = move-exception
            r2 = r0
            r10 = r12
        L_0x06c0:
            if (r10 == 0) goto L_0x06c5
            r10.close()     // Catch:{ all -> 0x06c6 }
        L_0x06c5:
            throw r2     // Catch:{ all -> 0x06c6 }
        L_0x06c6:
            r0 = move-exception
            r2 = r0
            r3 = 0
            goto L_0x06cc
        L_0x06ca:
            r0 = move-exception
            r2 = r0
        L_0x06cc:
            r1.zzv = r3
            r26.zzad()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzli.zzW():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x075e, code lost:
        if (r14.size() == 0) goto L_0x0760;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02e5 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x032f A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0332 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0392 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0526 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0565 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x05de A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x062b A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0638 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0645 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x066f A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0680 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x06c1 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x06dc A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0763 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0784 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x07f1 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x07fe A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0817 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x08b0 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x08d0 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0962 A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0a0e A[Catch:{ SQLiteException -> 0x0a29 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0a24  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x096e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017c A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0192 A[SYNTHETIC, Splitter:B:51:0x0192] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020d A[Catch:{ NumberFormatException -> 0x0748, all -> 0x0aa5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzX(com.google.android.gms.measurement.internal.zzav r35, com.google.android.gms.measurement.internal.zzp r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r36)
            java.lang.String r8 = r3.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.zzgf r10 = r34.zzaA()
            r10.zzg()
            r34.zzB()
            java.lang.String r10 = r3.zza
            com.google.android.gms.measurement.internal.zzlk r11 = r1.zzi
            zzak(r11)
            boolean r11 = com.google.android.gms.measurement.internal.zzlk.zzA(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.zzh
            if (r11 == 0) goto L_0x0ab0
            com.google.android.gms.measurement.internal.zzfz r11 = r1.zzc
            zzak(r11)
            java.lang.String r12 = r2.zza
            boolean r11 = r11.zzr(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.zzey r3 = r34.zzaz()
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzk()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r10)
            com.google.android.gms.measurement.internal.zzgi r5 = r1.zzn
            com.google.android.gms.measurement.internal.zzet r5 = r5.zzj()
            java.lang.String r6 = r2.zza
            java.lang.String r5 = r5.zzd(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.zzc(r6, r4, r5)
            com.google.android.gms.measurement.internal.zzfz r3 = r1.zzc
            zzak(r3)
            boolean r3 = r3.zzp(r10)
            if (r3 != 0) goto L_0x0097
            com.google.android.gms.measurement.internal.zzfz r3 = r1.zzc
            zzak(r3)
            boolean r3 = r3.zzs(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.zza
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzlp r11 = r34.zzv()
            com.google.android.gms.measurement.internal.zzlo r12 = r1.zzF
            r14 = 11
            java.lang.String r2 = r2.zza
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.zzN(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze
            zzak(r2)
            com.google.android.gms.measurement.internal.zzg r2 = r2.zzj(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.zzl()
            long r5 = r2.zzc()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.common.util.Clock r5 = r34.zzaw()
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.zzg()
            com.google.android.gms.measurement.internal.zzek r5 = com.google.android.gms.measurement.internal.zzel.zzy
            java.lang.Object r5 = r5.zza(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzey r3 = r34.zzaz()
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzc()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.zza(r4)
            r1.zzC(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.zzez r2 = com.google.android.gms.measurement.internal.zzez.zzb(r35)
            com.google.android.gms.measurement.internal.zzlp r11 = r34.zzv()
            com.google.android.gms.measurement.internal.zzaf r12 = r34.zzg()
            int r12 = r12.zzd(r10)
            r11.zzM(r2, r12)
            com.google.android.gms.measurement.internal.zzav r2 = r2.zza()
            com.google.android.gms.measurement.internal.zzey r11 = r34.zzaz()
            java.lang.String r11 = r11.zzq()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.zzey r11 = r34.zzaz()
            com.google.android.gms.measurement.internal.zzew r11 = r11.zzj()
            com.google.android.gms.measurement.internal.zzgi r12 = r1.zzn
            com.google.android.gms.measurement.internal.zzet r12 = r12.zzj()
            java.lang.String r12 = r12.zzc(r2)
            java.lang.String r13 = "Logging event"
            r11.zzb(r13, r12)
        L_0x011c:
            com.google.android.gms.measurement.internal.zzal r11 = r1.zze
            zzak(r11)
            r11.zzw()
            r1.zzd(r3)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.internal.measurement.zzne.zzc()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzaf r11 = r34.zzg()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzek r12 = com.google.android.gms.measurement.internal.zzel.zzan     // Catch:{ all -> 0x0aa5 }
            boolean r11 = r11.zzs(r14, r12)     // Catch:{ all -> 0x0aa5 }
            if (r11 != 0) goto L_0x014e
            com.google.android.gms.measurement.internal.zzaf r11 = r34.zzg()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzek r12 = com.google.android.gms.measurement.internal.zzel.zzao     // Catch:{ all -> 0x0aa5 }
            boolean r11 = r11.zzs(r14, r12)     // Catch:{ all -> 0x0aa5 }
            if (r11 == 0) goto L_0x014e
            com.google.android.gms.measurement.internal.zzal r11 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r11)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r12 = r3.zza     // Catch:{ all -> 0x0aa5 }
            java.lang.String r13 = "_lair"
            r11.zzA(r12, r13)     // Catch:{ all -> 0x0aa5 }
        L_0x014e:
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.zza     // Catch:{ all -> 0x0aa5 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r12 = "refund"
            r28 = r8
            if (r11 != 0) goto L_0x0171
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0aa5 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0aa5 }
            if (r9 != 0) goto L_0x0171
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0aa5 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0aa5 }
            if (r9 == 0) goto L_0x016f
            goto L_0x0171
        L_0x016f:
            r9 = 0
            goto L_0x0172
        L_0x0171:
            r9 = 1
        L_0x0172:
            java.lang.String r11 = "_iap"
            java.lang.String r13 = r2.zza     // Catch:{ all -> 0x0aa5 }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0aa5 }
            if (r11 != 0) goto L_0x0186
            if (r9 == 0) goto L_0x0180
            r9 = 1
            goto L_0x0186
        L_0x0180:
            r33 = r4
            r8 = r15
        L_0x0183:
            r4 = 2
            goto L_0x031c
        L_0x0186:
            com.google.android.gms.measurement.internal.zzat r11 = r2.zzb     // Catch:{ all -> 0x0aa5 }
            java.lang.String r13 = "currency"
            java.lang.String r11 = r11.zzg(r13)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x01fb
            com.google.android.gms.measurement.internal.zzat r9 = r2.zzb     // Catch:{ all -> 0x0aa5 }
            java.lang.Double r9 = r9.zzd(r13)     // Catch:{ all -> 0x0aa5 }
            double r17 = r9.doubleValue()     // Catch:{ all -> 0x0aa5 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r9 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x01b9
            com.google.android.gms.measurement.internal.zzat r9 = r2.zzb     // Catch:{ all -> 0x0aa5 }
            java.lang.Long r9 = r9.zze(r13)     // Catch:{ all -> 0x0aa5 }
            r21 = r15
            long r14 = r9.longValue()     // Catch:{ all -> 0x0aa5 }
            double r13 = (double) r14     // Catch:{ all -> 0x0aa5 }
            double r17 = r13 * r19
            goto L_0x01bb
        L_0x01b9:
            r21 = r15
        L_0x01bb:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x01d5
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x01d5
            long r13 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0aa5 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0aa5 }
            if (r9 == 0) goto L_0x0207
            long r13 = -r13
            goto L_0x0207
        L_0x01d5:
            com.google.android.gms.measurement.internal.zzey r2 = r34.zzaz()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzk()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r10)     // Catch:{ all -> 0x0aa5 }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0aa5 }
            r2.zzc(r3, r4, r5)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r2)     // Catch:{ all -> 0x0aa5 }
            r2.zzC()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze
            zzak(r2)
            r2.zzx()
            return
        L_0x01fb:
            r21 = r15
            com.google.android.gms.measurement.internal.zzat r9 = r2.zzb     // Catch:{ all -> 0x0aa5 }
            java.lang.Long r9 = r9.zze(r13)     // Catch:{ all -> 0x0aa5 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0aa5 }
        L_0x0207:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0aa5 }
            if (r9 != 0) goto L_0x0316
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0aa5 }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0aa5 }
            if (r11 == 0) goto L_0x0316
            java.lang.String r11 = "_ltv_"
            java.lang.String r9 = r11.concat(r9)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzal r11 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r11)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzln r11 = r11.zzp(r10, r9)     // Catch:{ all -> 0x0aa5 }
            if (r11 == 0) goto L_0x0261
            java.lang.Object r11 = r11.zze     // Catch:{ all -> 0x0aa5 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0aa5 }
            if (r12 != 0) goto L_0x0233
            goto L_0x0261
        L_0x0233:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0aa5 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzln r18 = new com.google.android.gms.measurement.internal.zzln     // Catch:{ all -> 0x0aa5 }
            java.lang.String r15 = r2.zzc     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.common.util.Clock r17 = r34.zzaw()     // Catch:{ all -> 0x0aa5 }
            long r19 = r17.currentTimeMillis()     // Catch:{ all -> 0x0aa5 }
            long r11 = r11 + r13
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0aa5 }
            r11 = r18
            r12 = r10
            r14 = 0
            r13 = r15
            r8 = r14
            r15 = 0
            r14 = r9
            r9 = r21
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0aa5 }
            r33 = r4
            r8 = r9
            r9 = r18
            r4 = 2
            goto L_0x02da
        L_0x0261:
            r15 = r21
            r8 = 0
            com.google.android.gms.measurement.internal.zzal r11 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r11)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzaf r12 = r34.zzg()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzek r8 = com.google.android.gms.measurement.internal.zzel.zzD     // Catch:{ all -> 0x0aa5 }
            int r8 = r12.zze(r10, r8)     // Catch:{ all -> 0x0aa5 }
            int r8 = r8 + -1
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch:{ all -> 0x0aa5 }
            r11.zzg()     // Catch:{ all -> 0x0aa5 }
            r11.zzW()     // Catch:{ all -> 0x0aa5 }
            android.database.sqlite.SQLiteDatabase r12 = r11.zzh()     // Catch:{ SQLiteException -> 0x02a4 }
            r21 = r15
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x02a0 }
            r16 = 0
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x02a0 }
            r16 = 1
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x02a0 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x02a0 }
            r33 = r4
            r4 = 2
            r15[r4] = r8     // Catch:{ SQLiteException -> 0x029e }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12.execSQL(r8, r15)     // Catch:{ SQLiteException -> 0x029e }
            goto L_0x02be
        L_0x029e:
            r0 = move-exception
            goto L_0x02aa
        L_0x02a0:
            r0 = move-exception
            r33 = r4
            goto L_0x02a9
        L_0x02a4:
            r0 = move-exception
            r33 = r4
            r21 = r15
        L_0x02a9:
            r4 = 2
        L_0x02aa:
            r8 = r0
            com.google.android.gms.measurement.internal.zzgi r11 = r11.zzs     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzey r11 = r11.zzaz()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzew r11 = r11.zzd()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzey.zzn(r10)     // Catch:{ all -> 0x0aa5 }
            r11.zzc(r12, r15, r8)     // Catch:{ all -> 0x0aa5 }
        L_0x02be:
            com.google.android.gms.measurement.internal.zzln r18 = new com.google.android.gms.measurement.internal.zzln     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = r2.zzc     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.common.util.Clock r11 = r34.zzaw()     // Catch:{ all -> 0x0aa5 }
            long r15 = r11.currentTimeMillis()     // Catch:{ all -> 0x0aa5 }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0aa5 }
            r11 = r18
            r12 = r10
            r13 = r8
            r14 = r9
            r8 = r21
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0aa5 }
            r9 = r18
        L_0x02da:
            com.google.android.gms.measurement.internal.zzal r11 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r11)     // Catch:{ all -> 0x0aa5 }
            boolean r11 = r11.zzL(r9)     // Catch:{ all -> 0x0aa5 }
            if (r11 != 0) goto L_0x031c
            com.google.android.gms.measurement.internal.zzey r11 = r34.zzaz()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzew r11 = r11.zzd()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzey.zzn(r10)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzgi r14 = r1.zzn     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzet r14 = r14.zzj()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r15 = r9.zzc     // Catch:{ all -> 0x0aa5 }
            java.lang.String r14 = r14.zzf(r15)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r9 = r9.zze     // Catch:{ all -> 0x0aa5 }
            r11.zzd(r12, r13, r14, r9)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzlp r11 = r34.zzv()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzlo r12 = r1.zzF     // Catch:{ all -> 0x0aa5 }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.zzN(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0aa5 }
            goto L_0x031c
        L_0x0316:
            r33 = r4
            r8 = r21
            goto L_0x0183
        L_0x031c:
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0aa5 }
            boolean r9 = com.google.android.gms.measurement.internal.zzlp.zzai(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0aa5 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0aa5 }
            r34.zzv()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzat r11 = r2.zzb     // Catch:{ all -> 0x0aa5 }
            if (r11 != 0) goto L_0x0332
            r16 = 0
            goto L_0x0352
        L_0x0332:
            com.google.android.gms.measurement.internal.zzas r12 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x0aa5 }
            r12.<init>(r11)     // Catch:{ all -> 0x0aa5 }
            r16 = 0
        L_0x0339:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0aa5 }
            if (r13 == 0) goto L_0x0352
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r13 = r11.zzf(r13)     // Catch:{ all -> 0x0aa5 }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0aa5 }
            if (r14 == 0) goto L_0x0339
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0aa5 }
            int r13 = r13.length     // Catch:{ all -> 0x0aa5 }
            long r13 = (long) r13     // Catch:{ all -> 0x0aa5 }
            long r16 = r16 + r13
            goto L_0x0339
        L_0x0352:
            r22 = 1
            long r15 = r16 + r22
            com.google.android.gms.measurement.internal.zzal r11 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r11)     // Catch:{ all -> 0x0aa5 }
            long r12 = r34.zza()     // Catch:{ all -> 0x0aa5 }
            r17 = 1
            r20 = 0
            r21 = 0
            r30 = r5
            r4 = 0
            r14 = r10
            r18 = r9
            r19 = r20
            r20 = r8
            com.google.android.gms.measurement.internal.zzaj r11 = r11.zzm(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0aa5 }
            long r12 = r11.zzb     // Catch:{ all -> 0x0aa5 }
            r34.zzg()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzek r14 = com.google.android.gms.measurement.internal.zzel.zzj     // Catch:{ all -> 0x0aa5 }
            r15 = 0
            java.lang.Object r14 = r14.zza(r15)     // Catch:{ all -> 0x0aa5 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0aa5 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0aa5 }
            r31 = r6
            r16 = r7
            long r6 = (long) r14     // Catch:{ all -> 0x0aa5 }
            long r12 = r12 - r6
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r17 = 1000(0x3e8, double:4.94E-321)
            if (r6 <= 0) goto L_0x03c0
            long r12 = r12 % r17
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x03af
            com.google.android.gms.measurement.internal.zzey r2 = r34.zzaz()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r10)     // Catch:{ all -> 0x0aa5 }
            long r5 = r11.zzb     // Catch:{ all -> 0x0aa5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0aa5 }
            r2.zzc(r3, r4, r5)     // Catch:{ all -> 0x0aa5 }
        L_0x03af:
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r2)     // Catch:{ all -> 0x0aa5 }
            r2.zzC()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze
            zzak(r2)
            r2.zzx()
            return
        L_0x03c0:
            if (r9 == 0) goto L_0x041b
            long r6 = r11.zza     // Catch:{ all -> 0x0aa5 }
            r34.zzg()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzek r12 = com.google.android.gms.measurement.internal.zzel.zzl     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r12 = r12.zza(r15)     // Catch:{ all -> 0x0aa5 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0aa5 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0aa5 }
            long r12 = (long) r12     // Catch:{ all -> 0x0aa5 }
            long r6 = r6 - r12
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x041b
            long r6 = r6 % r17
            int r3 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x03f6
            com.google.android.gms.measurement.internal.zzey r3 = r34.zzaz()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzey.zzn(r10)     // Catch:{ all -> 0x0aa5 }
            long r6 = r11.zza     // Catch:{ all -> 0x0aa5 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0aa5 }
            r3.zzc(r4, r5, r6)     // Catch:{ all -> 0x0aa5 }
        L_0x03f6:
            com.google.android.gms.measurement.internal.zzlp r11 = r34.zzv()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzlo r12 = r1.zzF     // Catch:{ all -> 0x0aa5 }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.zza     // Catch:{ all -> 0x0aa5 }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.zzN(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r2)     // Catch:{ all -> 0x0aa5 }
            r2.zzC()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze
            zzak(r2)
            r2.zzx()
            return
        L_0x041b:
            r6 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x0469
            long r7 = r11.zzd     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzaf r12 = r34.zzg()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r13 = r3.zza     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzek r14 = com.google.android.gms.measurement.internal.zzel.zzk     // Catch:{ all -> 0x0aa5 }
            int r12 = r12.zze(r13, r14)     // Catch:{ all -> 0x0aa5 }
            int r12 = java.lang.Math.min(r6, r12)     // Catch:{ all -> 0x0aa5 }
            r13 = 0
            int r12 = java.lang.Math.max(r13, r12)     // Catch:{ all -> 0x0aa5 }
            long r12 = (long) r12     // Catch:{ all -> 0x0aa5 }
            long r7 = r7 - r12
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0469
            int r2 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0458
            com.google.android.gms.measurement.internal.zzey r2 = r34.zzaz()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r10)     // Catch:{ all -> 0x0aa5 }
            long r5 = r11.zzd     // Catch:{ all -> 0x0aa5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0aa5 }
            r2.zzc(r3, r4, r5)     // Catch:{ all -> 0x0aa5 }
        L_0x0458:
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r2)     // Catch:{ all -> 0x0aa5 }
            r2.zzC()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze
            zzak(r2)
            r2.zzx()
            return
        L_0x0469:
            com.google.android.gms.measurement.internal.zzat r7 = r2.zzb     // Catch:{ all -> 0x0aa5 }
            android.os.Bundle r7 = r7.zzc()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzlp r8 = r34.zzv()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r11 = "_o"
            java.lang.String r12 = r2.zzc     // Catch:{ all -> 0x0aa5 }
            r8.zzO(r7, r11, r12)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzlp r8 = r34.zzv()     // Catch:{ all -> 0x0aa5 }
            boolean r8 = r8.zzae(r10)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r14 = "_r"
            if (r8 == 0) goto L_0x049a
            com.google.android.gms.measurement.internal.zzlp r8 = r34.zzv()     // Catch:{ all -> 0x0aa5 }
            java.lang.Long r11 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r12 = "_dbg"
            r8.zzO(r7, r12, r11)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzlp r8 = r34.zzv()     // Catch:{ all -> 0x0aa5 }
            r8.zzO(r7, r14, r11)     // Catch:{ all -> 0x0aa5 }
        L_0x049a:
            java.lang.String r8 = "_s"
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0aa5 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0aa5 }
            if (r8 == 0) goto L_0x04c2
            com.google.android.gms.measurement.internal.zzal r8 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0aa5 }
            r12 = r16
            com.google.android.gms.measurement.internal.zzln r8 = r8.zzp(r11, r12)     // Catch:{ all -> 0x0aa5 }
            if (r8 == 0) goto L_0x04c2
            java.lang.Object r11 = r8.zze     // Catch:{ all -> 0x0aa5 }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0aa5 }
            if (r11 == 0) goto L_0x04c2
            com.google.android.gms.measurement.internal.zzlp r11 = r34.zzv()     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r8 = r8.zze     // Catch:{ all -> 0x0aa5 }
            r11.zzO(r7, r12, r8)     // Catch:{ all -> 0x0aa5 }
        L_0x04c2:
            com.google.android.gms.measurement.internal.zzal r8 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r8)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch:{ all -> 0x0aa5 }
            r8.zzg()     // Catch:{ all -> 0x0aa5 }
            r8.zzW()     // Catch:{ all -> 0x0aa5 }
            android.database.sqlite.SQLiteDatabase r11 = r8.zzh()     // Catch:{ SQLiteException -> 0x0506 }
            com.google.android.gms.measurement.internal.zzgi r12 = r8.zzs     // Catch:{ SQLiteException -> 0x0506 }
            com.google.android.gms.measurement.internal.zzaf r12 = r12.zzf()     // Catch:{ SQLiteException -> 0x0506 }
            com.google.android.gms.measurement.internal.zzek r13 = com.google.android.gms.measurement.internal.zzel.zzo     // Catch:{ SQLiteException -> 0x0506 }
            int r12 = r12.zze(r10, r13)     // Catch:{ SQLiteException -> 0x0506 }
            int r6 = java.lang.Math.min(r6, r12)     // Catch:{ SQLiteException -> 0x0506 }
            r13 = 0
            int r6 = java.lang.Math.max(r13, r6)     // Catch:{ SQLiteException -> 0x0502 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0502 }
            r12 = 2
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0502 }
            r12[r13] = r10     // Catch:{ SQLiteException -> 0x0502 }
            r16 = 1
            r12[r16] = r6     // Catch:{ SQLiteException -> 0x0502 }
            java.lang.String r6 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            r4 = r31
            int r5 = r11.delete(r4, r6, r12)     // Catch:{ SQLiteException -> 0x0500 }
            long r5 = (long) r5
            goto L_0x0520
        L_0x0500:
            r0 = move-exception
            goto L_0x050a
        L_0x0502:
            r0 = move-exception
            r4 = r31
            goto L_0x050a
        L_0x0506:
            r0 = move-exception
            r4 = r31
            r13 = 0
        L_0x050a:
            r5 = r0
            com.google.android.gms.measurement.internal.zzgi r6 = r8.zzs     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzey r6 = r6.zzaz()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzew r6 = r6.zzd()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzey.zzn(r10)     // Catch:{ all -> 0x0aa5 }
            r6.zzc(r8, r11, r5)     // Catch:{ all -> 0x0aa5 }
            r5 = 0
        L_0x0520:
            r11 = 0
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x053b
            com.google.android.gms.measurement.internal.zzey r8 = r34.zzaz()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzk()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzey.zzn(r10)     // Catch:{ all -> 0x0aa5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0aa5 }
            r8.zzc(r11, r12, r5)     // Catch:{ all -> 0x0aa5 }
        L_0x053b:
            com.google.android.gms.measurement.internal.zzaq r5 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzgi r12 = r1.zzn     // Catch:{ all -> 0x0aa5 }
            java.lang.String r6 = r2.zzc     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = r2.zza     // Catch:{ all -> 0x0aa5 }
            long r2 = r2.zzd     // Catch:{ all -> 0x0aa5 }
            r18 = 0
            r11 = r5
            r31 = r13
            r13 = r6
            r6 = r14
            r14 = r10
            r32 = r4
            r4 = r15
            r15 = r8
            r16 = r2
            r20 = r7
            r11.<init>((com.google.android.gms.measurement.internal.zzgi) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r2)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r3 = r5.zzb     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzar r2 = r2.zzn(r10, r3)     // Catch:{ all -> 0x0aa5 }
            if (r2 != 0) goto L_0x05de
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r2)     // Catch:{ all -> 0x0aa5 }
            long r2 = r2.zzf(r10)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzaf r7 = r34.zzg()     // Catch:{ all -> 0x0aa5 }
            int r7 = r7.zzb(r10)     // Catch:{ all -> 0x0aa5 }
            long r7 = (long) r7     // Catch:{ all -> 0x0aa5 }
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x05c0
            if (r9 == 0) goto L_0x05c0
            com.google.android.gms.measurement.internal.zzey r2 = r34.zzaz()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r10)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzgi r6 = r1.zzn     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzet r6 = r6.zzj()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r5 = r5.zzb     // Catch:{ all -> 0x0aa5 }
            java.lang.String r5 = r6.zzd(r5)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzaf r6 = r34.zzg()     // Catch:{ all -> 0x0aa5 }
            int r6 = r6.zzb(r10)     // Catch:{ all -> 0x0aa5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0aa5 }
            r2.zzd(r3, r4, r5, r6)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzlp r11 = r34.zzv()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzlo r12 = r1.zzF     // Catch:{ all -> 0x0aa5 }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.zzN(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze
            zzak(r2)
            r2.zzx()
            return
        L_0x05c0:
            com.google.android.gms.measurement.internal.zzar r2 = new com.google.android.gms.measurement.internal.zzar     // Catch:{ all -> 0x0aa5 }
            java.lang.String r13 = r5.zzb     // Catch:{ all -> 0x0aa5 }
            long r7 = r5.zzd     // Catch:{ all -> 0x0aa5 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r7
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0aa5 }
            goto L_0x05ec
        L_0x05de:
            com.google.android.gms.measurement.internal.zzgi r3 = r1.zzn     // Catch:{ all -> 0x0aa5 }
            long r7 = r2.zzf     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzaq r5 = r5.zza(r3, r7)     // Catch:{ all -> 0x0aa5 }
            long r7 = r5.zzd     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzar r2 = r2.zzc(r7)     // Catch:{ all -> 0x0aa5 }
        L_0x05ec:
            com.google.android.gms.measurement.internal.zzal r3 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r3)     // Catch:{ all -> 0x0aa5 }
            r3.zzE(r2)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzgf r2 = r34.zzaA()     // Catch:{ all -> 0x0aa5 }
            r2.zzg()     // Catch:{ all -> 0x0aa5 }
            r34.zzB()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r36)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r2 = r5.zza     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r2 = r5.zza     // Catch:{ all -> 0x0aa5 }
            r3 = r36
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x0aa5 }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.internal.measurement.zzgb r2 = com.google.android.gms.internal.measurement.zzgc.zzu()     // Catch:{ all -> 0x0aa5 }
            r7 = 1
            r2.zzae(r7)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = "android"
            r2.zzaa(r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0aa5 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa5 }
            if (r8 != 0) goto L_0x0630
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0aa5 }
            r2.zzE(r8)     // Catch:{ all -> 0x0aa5 }
        L_0x0630:
            java.lang.String r8 = r3.zzd     // Catch:{ all -> 0x0aa5 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa5 }
            if (r8 != 0) goto L_0x063d
            java.lang.String r8 = r3.zzd     // Catch:{ all -> 0x0aa5 }
            r2.zzG(r8)     // Catch:{ all -> 0x0aa5 }
        L_0x063d:
            java.lang.String r8 = r3.zzc     // Catch:{ all -> 0x0aa5 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa5 }
            if (r8 != 0) goto L_0x064a
            java.lang.String r8 = r3.zzc     // Catch:{ all -> 0x0aa5 }
            r2.zzH(r8)     // Catch:{ all -> 0x0aa5 }
        L_0x064a:
            com.google.android.gms.internal.measurement.zzpp.zzc()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzaf r8 = r34.zzg()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzek r9 = com.google.android.gms.measurement.internal.zzel.zzaH     // Catch:{ all -> 0x0aa5 }
            boolean r8 = r8.zzs(r4, r9)     // Catch:{ all -> 0x0aa5 }
            if (r8 == 0) goto L_0x0666
            java.lang.String r8 = r3.zzx     // Catch:{ all -> 0x0aa5 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa5 }
            if (r8 != 0) goto L_0x0666
            java.lang.String r8 = r3.zzx     // Catch:{ all -> 0x0aa5 }
            r2.zzai(r8)     // Catch:{ all -> 0x0aa5 }
        L_0x0666:
            long r8 = r3.zzj     // Catch:{ all -> 0x0aa5 }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x0673
            int r8 = (int) r8     // Catch:{ all -> 0x0aa5 }
            r2.zzI(r8)     // Catch:{ all -> 0x0aa5 }
        L_0x0673:
            long r8 = r3.zze     // Catch:{ all -> 0x0aa5 }
            r2.zzW(r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = r3.zzb     // Catch:{ all -> 0x0aa5 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa5 }
            if (r8 != 0) goto L_0x0685
            java.lang.String r8 = r3.zzb     // Catch:{ all -> 0x0aa5 }
            r2.zzV(r8)     // Catch:{ all -> 0x0aa5 }
        L_0x0685:
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzah r8 = r1.zzh(r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r9 = r3.zzv     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.zzb(r9)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzah r8 = r8.zzc(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = r8.zzh()     // Catch:{ all -> 0x0aa5 }
            r2.zzM(r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = r2.zzar()     // Catch:{ all -> 0x0aa5 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa5 }
            if (r8 == 0) goto L_0x06b9
            java.lang.String r8 = r3.zzq     // Catch:{ all -> 0x0aa5 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa5 }
            if (r8 != 0) goto L_0x06b9
            java.lang.String r8 = r3.zzq     // Catch:{ all -> 0x0aa5 }
            r2.zzC(r8)     // Catch:{ all -> 0x0aa5 }
        L_0x06b9:
            long r8 = r3.zzf     // Catch:{ all -> 0x0aa5 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x06c4
            r2.zzN(r8)     // Catch:{ all -> 0x0aa5 }
        L_0x06c4:
            long r8 = r3.zzs     // Catch:{ all -> 0x0aa5 }
            r2.zzQ(r8)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzlk r8 = r1.zzi     // Catch:{ all -> 0x0aa5 }
            zzak(r8)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzli r9 = r8.zzf     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzgi r9 = r9.zzn     // Catch:{ all -> 0x0aa5 }
            android.content.Context r9 = r9.zzav()     // Catch:{ all -> 0x0aa5 }
            java.util.Map r9 = com.google.android.gms.measurement.internal.zzel.zzc(r9)     // Catch:{ all -> 0x0aa5 }
            if (r9 == 0) goto L_0x0760
            int r10 = r9.size()     // Catch:{ all -> 0x0aa5 }
            if (r10 != 0) goto L_0x06e4
            goto L_0x0760
        L_0x06e4:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0aa5 }
            r14.<init>()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzek r10 = com.google.android.gms.measurement.internal.zzel.zzO     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r10 = r10.zza(r4)     // Catch:{ all -> 0x0aa5 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0aa5 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0aa5 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0aa5 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0aa5 }
        L_0x06fd:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0aa5 }
            if (r11 == 0) goto L_0x075a
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0aa5 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0aa5 }
            java.lang.String r13 = "measurement.id."
            boolean r12 = r12.startsWith(r13)     // Catch:{ all -> 0x0aa5 }
            if (r12 == 0) goto L_0x06fd
            java.lang.Object r11 = r11.getValue()     // Catch:{ NumberFormatException -> 0x0748 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x0748 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0748 }
            if (r11 == 0) goto L_0x06fd
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x0748 }
            r14.add(r11)     // Catch:{ NumberFormatException -> 0x0748 }
            int r11 = r14.size()     // Catch:{ NumberFormatException -> 0x0748 }
            if (r11 < r10) goto L_0x06fd
            com.google.android.gms.measurement.internal.zzgi r11 = r8.zzs     // Catch:{ NumberFormatException -> 0x0748 }
            com.google.android.gms.measurement.internal.zzey r11 = r11.zzaz()     // Catch:{ NumberFormatException -> 0x0748 }
            com.google.android.gms.measurement.internal.zzew r11 = r11.zzk()     // Catch:{ NumberFormatException -> 0x0748 }
            java.lang.String r12 = "Too many experiment IDs. Number of IDs"
            int r13 = r14.size()     // Catch:{ NumberFormatException -> 0x0748 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x0748 }
            r11.zzb(r12, r13)     // Catch:{ NumberFormatException -> 0x0748 }
            goto L_0x075a
        L_0x0748:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.zzgi r12 = r8.zzs     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzey r12 = r12.zzaz()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzew r12 = r12.zzk()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r13 = "Experiment ID NumberFormatException"
            r12.zzb(r13, r11)     // Catch:{ all -> 0x0aa5 }
            goto L_0x06fd
        L_0x075a:
            int r8 = r14.size()     // Catch:{ all -> 0x0aa5 }
            if (r8 != 0) goto L_0x0761
        L_0x0760:
            r14 = r4
        L_0x0761:
            if (r14 == 0) goto L_0x0766
            r2.zzh(r14)     // Catch:{ all -> 0x0aa5 }
        L_0x0766:
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzah r8 = r1.zzh(r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r9 = r3.zzv     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.zzb(r9)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzah r8 = r8.zzc(r9)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzag r9 = com.google.android.gms.measurement.internal.zzag.AD_STORAGE     // Catch:{ all -> 0x0aa5 }
            boolean r10 = r8.zzi(r9)     // Catch:{ all -> 0x0aa5 }
            if (r10 == 0) goto L_0x07ae
            com.google.android.gms.measurement.internal.zzkd r10 = r1.zzk     // Catch:{ all -> 0x0aa5 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0aa5 }
            android.util.Pair r10 = r10.zzd(r11, r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0aa5 }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x0aa5 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0aa5 }
            if (r11 != 0) goto L_0x07ae
            boolean r11 = r3.zzo     // Catch:{ all -> 0x0aa5 }
            if (r11 == 0) goto L_0x07ae
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0aa5 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0aa5 }
            r2.zzaf(r11)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r10 = r10.second     // Catch:{ all -> 0x0aa5 }
            if (r10 == 0) goto L_0x07ae
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0aa5 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0aa5 }
            r2.zzY(r10)     // Catch:{ all -> 0x0aa5 }
        L_0x07ae:
            com.google.android.gms.measurement.internal.zzgi r10 = r1.zzn     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzap r10 = r10.zzg()     // Catch:{ all -> 0x0aa5 }
            r10.zzu()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r10 = android.os.Build.MODEL     // Catch:{ all -> 0x0aa5 }
            r2.zzO(r10)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzgi r10 = r1.zzn     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzap r10 = r10.zzg()     // Catch:{ all -> 0x0aa5 }
            r10.zzu()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r10 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0aa5 }
            r2.zzZ(r10)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzgi r10 = r1.zzn     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzap r10 = r10.zzg()     // Catch:{ all -> 0x0aa5 }
            long r10 = r10.zzb()     // Catch:{ all -> 0x0aa5 }
            int r10 = (int) r10     // Catch:{ all -> 0x0aa5 }
            r2.zzak(r10)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzgi r10 = r1.zzn     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzap r10 = r10.zzg()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r10 = r10.zzc()     // Catch:{ all -> 0x0aa5 }
            r2.zzao(r10)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzaf r10 = r34.zzg()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzek r11 = com.google.android.gms.measurement.internal.zzel.zzah     // Catch:{ all -> 0x0aa5 }
            boolean r10 = r10.zzs(r4, r11)     // Catch:{ all -> 0x0aa5 }
            if (r10 != 0) goto L_0x07f6
            long r12 = r3.zzl     // Catch:{ all -> 0x0aa5 }
            r2.zzD(r12)     // Catch:{ all -> 0x0aa5 }
        L_0x07f6:
            com.google.android.gms.measurement.internal.zzgi r10 = r1.zzn     // Catch:{ all -> 0x0aa5 }
            boolean r10 = r10.zzJ()     // Catch:{ all -> 0x0aa5 }
            if (r10 == 0) goto L_0x080a
            r2.zzaq()     // Catch:{ all -> 0x0aa5 }
            boolean r10 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0aa5 }
            if (r10 != 0) goto L_0x080a
            r2.zzP(r4)     // Catch:{ all -> 0x0aa5 }
        L_0x080a:
            com.google.android.gms.measurement.internal.zzal r10 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r10)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r12 = r3.zza     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzg r10 = r10.zzj(r12)     // Catch:{ all -> 0x0aa5 }
            if (r10 != 0) goto L_0x0887
            com.google.android.gms.measurement.internal.zzg r10 = new com.google.android.gms.measurement.internal.zzg     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzgi r12 = r1.zzn     // Catch:{ all -> 0x0aa5 }
            java.lang.String r13 = r3.zza     // Catch:{ all -> 0x0aa5 }
            r10.<init>(r12, r13)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r12 = r1.zzw(r8)     // Catch:{ all -> 0x0aa5 }
            r10.zzI(r12)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r12 = r3.zzk     // Catch:{ all -> 0x0aa5 }
            r10.zzW(r12)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r12 = r3.zzb     // Catch:{ all -> 0x0aa5 }
            r10.zzX(r12)     // Catch:{ all -> 0x0aa5 }
            boolean r9 = r8.zzi(r9)     // Catch:{ all -> 0x0aa5 }
            if (r9 == 0) goto L_0x0842
            com.google.android.gms.measurement.internal.zzkd r9 = r1.zzk     // Catch:{ all -> 0x0aa5 }
            java.lang.String r12 = r3.zza     // Catch:{ all -> 0x0aa5 }
            java.lang.String r9 = r9.zzf(r12)     // Catch:{ all -> 0x0aa5 }
            r10.zzaf(r9)     // Catch:{ all -> 0x0aa5 }
        L_0x0842:
            r12 = 0
            r10.zzab(r12)     // Catch:{ all -> 0x0aa5 }
            r10.zzac(r12)     // Catch:{ all -> 0x0aa5 }
            r10.zzaa(r12)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r9 = r3.zzc     // Catch:{ all -> 0x0aa5 }
            r10.zzK(r9)     // Catch:{ all -> 0x0aa5 }
            long r12 = r3.zzj     // Catch:{ all -> 0x0aa5 }
            r10.zzL(r12)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r9 = r3.zzd     // Catch:{ all -> 0x0aa5 }
            r10.zzJ(r9)     // Catch:{ all -> 0x0aa5 }
            long r12 = r3.zze     // Catch:{ all -> 0x0aa5 }
            r10.zzY(r12)     // Catch:{ all -> 0x0aa5 }
            long r12 = r3.zzf     // Catch:{ all -> 0x0aa5 }
            r10.zzT(r12)     // Catch:{ all -> 0x0aa5 }
            boolean r9 = r3.zzh     // Catch:{ all -> 0x0aa5 }
            r10.zzad(r9)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzaf r9 = r34.zzg()     // Catch:{ all -> 0x0aa5 }
            boolean r9 = r9.zzs(r4, r11)     // Catch:{ all -> 0x0aa5 }
            if (r9 != 0) goto L_0x087a
            long r11 = r3.zzl     // Catch:{ all -> 0x0aa5 }
            r10.zzH(r11)     // Catch:{ all -> 0x0aa5 }
        L_0x087a:
            long r11 = r3.zzs     // Catch:{ all -> 0x0aa5 }
            r10.zzU(r11)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzal r9 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r9)     // Catch:{ all -> 0x0aa5 }
            r9.zzD(r10)     // Catch:{ all -> 0x0aa5 }
        L_0x0887:
            com.google.android.gms.measurement.internal.zzag r9 = com.google.android.gms.measurement.internal.zzag.ANALYTICS_STORAGE     // Catch:{ all -> 0x0aa5 }
            boolean r8 = r8.zzi(r9)     // Catch:{ all -> 0x0aa5 }
            if (r8 == 0) goto L_0x08a6
            java.lang.String r8 = r10.zzu()     // Catch:{ all -> 0x0aa5 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa5 }
            if (r8 != 0) goto L_0x08a6
            java.lang.String r8 = r10.zzu()     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aa5 }
            r2.zzF(r8)     // Catch:{ all -> 0x0aa5 }
        L_0x08a6:
            java.lang.String r8 = r10.zzx()     // Catch:{ all -> 0x0aa5 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0aa5 }
            if (r8 != 0) goto L_0x08bd
            java.lang.String r8 = r10.zzx()     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aa5 }
            r2.zzU(r8)     // Catch:{ all -> 0x0aa5 }
        L_0x08bd:
            com.google.android.gms.measurement.internal.zzal r8 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r3 = r3.zza     // Catch:{ all -> 0x0aa5 }
            java.util.List r3 = r8.zzu(r3)     // Catch:{ all -> 0x0aa5 }
            r13 = r31
        L_0x08ca:
            int r8 = r3.size()     // Catch:{ all -> 0x0aa5 }
            if (r13 >= r8) goto L_0x0900
            com.google.android.gms.internal.measurement.zzgk r8 = com.google.android.gms.internal.measurement.zzgl.zzd()     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzln r9 = (com.google.android.gms.measurement.internal.zzln) r9     // Catch:{ all -> 0x0aa5 }
            java.lang.String r9 = r9.zzc     // Catch:{ all -> 0x0aa5 }
            r8.zzf(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzln r9 = (com.google.android.gms.measurement.internal.zzln) r9     // Catch:{ all -> 0x0aa5 }
            long r9 = r9.zzd     // Catch:{ all -> 0x0aa5 }
            r8.zzg(r9)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzlk r9 = r1.zzi     // Catch:{ all -> 0x0aa5 }
            zzak(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r10 = r3.get(r13)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzln r10 = (com.google.android.gms.measurement.internal.zzln) r10     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r10 = r10.zze     // Catch:{ all -> 0x0aa5 }
            r9.zzu(r8, r10)     // Catch:{ all -> 0x0aa5 }
            r2.zzl(r8)     // Catch:{ all -> 0x0aa5 }
            int r13 = r13 + 1
            goto L_0x08ca
        L_0x0900:
            com.google.android.gms.measurement.internal.zzal r3 = r1.zze     // Catch:{ IOException -> 0x0a5b }
            zzak(r3)     // Catch:{ IOException -> 0x0a5b }
            com.google.android.gms.internal.measurement.zzkc r8 = r2.zzaE()     // Catch:{ IOException -> 0x0a5b }
            com.google.android.gms.internal.measurement.zzgc r8 = (com.google.android.gms.internal.measurement.zzgc) r8     // Catch:{ IOException -> 0x0a5b }
            r3.zzg()     // Catch:{ IOException -> 0x0a5b }
            r3.zzW()     // Catch:{ IOException -> 0x0a5b }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ IOException -> 0x0a5b }
            java.lang.String r9 = r8.zzy()     // Catch:{ IOException -> 0x0a5b }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)     // Catch:{ IOException -> 0x0a5b }
            byte[] r9 = r8.zzby()     // Catch:{ IOException -> 0x0a5b }
            com.google.android.gms.measurement.internal.zzli r10 = r3.zzf     // Catch:{ IOException -> 0x0a5b }
            com.google.android.gms.measurement.internal.zzlk r10 = r10.zzi     // Catch:{ IOException -> 0x0a5b }
            zzak(r10)     // Catch:{ IOException -> 0x0a5b }
            long r10 = r10.zzd(r9)     // Catch:{ IOException -> 0x0a5b }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0a5b }
            r12.<init>()     // Catch:{ IOException -> 0x0a5b }
            java.lang.String r13 = r8.zzy()     // Catch:{ IOException -> 0x0a5b }
            r14 = r30
            r12.put(r14, r13)     // Catch:{ IOException -> 0x0a5b }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0a5b }
            r15 = r33
            r12.put(r15, r13)     // Catch:{ IOException -> 0x0a5b }
            java.lang.String r13 = "metadata"
            r12.put(r13, r9)     // Catch:{ IOException -> 0x0a5b }
            android.database.sqlite.SQLiteDatabase r9 = r3.zzh()     // Catch:{ SQLiteException -> 0x0a41 }
            java.lang.String r13 = "raw_events_metadata"
            r7 = 4
            r9.insertWithOnConflict(r13, r4, r12, r7)     // Catch:{ SQLiteException -> 0x0a41 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r2)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzat r3 = r5.zzf     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzas r7 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x0aa5 }
            r7.<init>(r3)     // Catch:{ all -> 0x0aa5 }
        L_0x095c:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x0aa5 }
            if (r3 == 0) goto L_0x096e
            java.lang.String r3 = r7.next()     // Catch:{ all -> 0x0aa5 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0aa5 }
            if (r3 == 0) goto L_0x095c
        L_0x096c:
            r13 = 1
            goto L_0x09b0
        L_0x096e:
            com.google.android.gms.measurement.internal.zzfz r3 = r1.zzc     // Catch:{ all -> 0x0aa5 }
            zzak(r3)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r6 = r5.zza     // Catch:{ all -> 0x0aa5 }
            java.lang.String r7 = r5.zzb     // Catch:{ all -> 0x0aa5 }
            boolean r3 = r3.zzq(r6, r7)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzal r6 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r6)     // Catch:{ all -> 0x0aa5 }
            long r17 = r34.zza()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r7 = r5.zza     // Catch:{ all -> 0x0aa5 }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r16 = r6
            r19 = r7
            com.google.android.gms.measurement.internal.zzaj r6 = r16.zzl(r17, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0aa5 }
            if (r3 == 0) goto L_0x09ae
            long r6 = r6.zze     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzaf r3 = r34.zzg()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = r5.zza     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzek r9 = com.google.android.gms.measurement.internal.zzel.zzn     // Catch:{ all -> 0x0aa5 }
            int r3 = r3.zze(r8, r9)     // Catch:{ all -> 0x0aa5 }
            long r8 = (long) r3     // Catch:{ all -> 0x0aa5 }
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x09ae
            goto L_0x096c
        L_0x09ae:
            r13 = r31
        L_0x09b0:
            r2.zzg()     // Catch:{ all -> 0x0aa5 }
            r2.zzW()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r3 = r5.zza     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzli r3 = r2.zzf     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzlk r3 = r3.zzi     // Catch:{ all -> 0x0aa5 }
            zzak(r3)     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.internal.measurement.zzfs r3 = r3.zzj(r5)     // Catch:{ all -> 0x0aa5 }
            byte[] r3 = r3.zzby()     // Catch:{ all -> 0x0aa5 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0aa5 }
            r6.<init>()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r7 = r5.zza     // Catch:{ all -> 0x0aa5 }
            r6.put(r14, r7)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.zzb     // Catch:{ all -> 0x0aa5 }
            r6.put(r7, r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r7 = "timestamp"
            long r8 = r5.zzd     // Catch:{ all -> 0x0aa5 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0aa5 }
            r6.put(r7, r8)     // Catch:{ all -> 0x0aa5 }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0aa5 }
            r6.put(r15, r7)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r7 = "data"
            r6.put(r7, r3)     // Catch:{ all -> 0x0aa5 }
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0aa5 }
            r6.put(r3, r7)     // Catch:{ all -> 0x0aa5 }
            android.database.sqlite.SQLiteDatabase r3 = r2.zzh()     // Catch:{ SQLiteException -> 0x0a29 }
            r7 = r32
            long r3 = r3.insert(r7, r4, r6)     // Catch:{ SQLiteException -> 0x0a29 }
            r6 = -1
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0a24
            com.google.android.gms.measurement.internal.zzgi r3 = r2.zzs     // Catch:{ SQLiteException -> 0x0a29 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()     // Catch:{ SQLiteException -> 0x0a29 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()     // Catch:{ SQLiteException -> 0x0a29 }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.zza     // Catch:{ SQLiteException -> 0x0a29 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzey.zzn(r6)     // Catch:{ SQLiteException -> 0x0a29 }
            r3.zzb(r4, r6)     // Catch:{ SQLiteException -> 0x0a29 }
            goto L_0x0a72
        L_0x0a24:
            r3 = 0
            r1.zza = r3     // Catch:{ all -> 0x0aa5 }
            goto L_0x0a72
        L_0x0a29:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzgi r2 = r2.zzs     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.zza     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzey.zzn(r5)     // Catch:{ all -> 0x0aa5 }
            r2.zzc(r4, r5, r3)     // Catch:{ all -> 0x0aa5 }
            goto L_0x0a72
        L_0x0a41:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.zzgi r3 = r3.zzs     // Catch:{ IOException -> 0x0a5b }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()     // Catch:{ IOException -> 0x0a5b }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()     // Catch:{ IOException -> 0x0a5b }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r8.zzy()     // Catch:{ IOException -> 0x0a5b }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzey.zzn(r6)     // Catch:{ IOException -> 0x0a5b }
            r3.zzc(r5, r6, r4)     // Catch:{ IOException -> 0x0a5b }
            throw r4     // Catch:{ IOException -> 0x0a5b }
        L_0x0a5b:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzey r4 = r34.zzaz()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzd()     // Catch:{ all -> 0x0aa5 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.zzaq()     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzey.zzn(r2)     // Catch:{ all -> 0x0aa5 }
            r4.zzc(r5, r2, r3)     // Catch:{ all -> 0x0aa5 }
        L_0x0a72:
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze     // Catch:{ all -> 0x0aa5 }
            zzak(r2)     // Catch:{ all -> 0x0aa5 }
            r2.zzC()     // Catch:{ all -> 0x0aa5 }
            com.google.android.gms.measurement.internal.zzal r2 = r1.zze
            zzak(r2)
            r2.zzx()
            r34.zzaf()
            com.google.android.gms.measurement.internal.zzey r2 = r34.zzaz()
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzj()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.zzb(r4, r3)
            return
        L_0x0aa5:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzal r3 = r1.zze
            zzak(r3)
            r3.zzx()
            throw r2
        L_0x0ab0:
            r1.zzd(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzli.zzX(com.google.android.gms.measurement.internal.zzav, com.google.android.gms.measurement.internal.zzp):void");
    }

    @VisibleForTesting
    public final boolean zzY() {
        zzaA().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock == null || !fileLock.isValid()) {
            this.zze.zzs.zzf();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.zzn.zzav().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.zzx = channel;
                FileLock tryLock = channel.tryLock();
                this.zzw = tryLock;
                if (tryLock != null) {
                    zzaz().zzj().zza("Storage concurrent access okay");
                    return true;
                }
                zzaz().zzd().zza("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e10) {
                zzaz().zzd().zzb("Failed to acquire storage lock", e10);
                return false;
            } catch (IOException e11) {
                zzaz().zzd().zzb("Failed to access storage lock file", e11);
                return false;
            } catch (OverlappingFileLockException e12) {
                zzaz().zzk().zzb("Storage lock already acquired", e12);
                return false;
            }
        } else {
            zzaz().zzj().zza("Storage concurrent access okay");
            return true;
        }
    }

    public final long zza() {
        long currentTimeMillis = zzaw().currentTimeMillis();
        zzkd zzkd = this.zzk;
        zzkd.zzW();
        zzkd.zzg();
        long zza2 = zzkd.zze.zza();
        if (zza2 == 0) {
            zza2 = ((long) zzkd.zzs.zzv().zzG().nextInt(86400000)) + 1;
            zzkd.zze.zzb(zza2);
        }
        return ((((currentTimeMillis + zza2) / 1000) / 60) / 60) / 24;
    }

    public final zzgf zzaA() {
        return ((zzgi) Preconditions.checkNotNull(this.zzn)).zzaA();
    }

    public final Context zzav() {
        return this.zzn.zzav();
    }

    public final Clock zzaw() {
        return ((zzgi) Preconditions.checkNotNull(this.zzn)).zzaw();
    }

    public final zzaa zzax() {
        throw null;
    }

    public final zzey zzaz() {
        return ((zzgi) Preconditions.checkNotNull(this.zzn)).zzaz();
    }

    public final zzg zzd(zzp zzp2) {
        zzaA().zzg();
        zzB();
        Preconditions.checkNotNull(zzp2);
        Preconditions.checkNotEmpty(zzp2.zza);
        zzpg.zzc();
        if (zzg().zzs(zzp2.zza, zzel.zzaJ) && !zzp2.zzw.isEmpty()) {
            this.zzC.put(zzp2.zza, new zzlh(this, zzp2.zzw));
        }
        zzal zzal = this.zze;
        zzak(zzal);
        zzg zzj2 = zzal.zzj(zzp2.zza);
        zzah zzc2 = zzh(zzp2.zza).zzc(zzah.zzb(zzp2.zzv));
        zzag zzag = zzag.AD_STORAGE;
        String zzf2 = zzc2.zzi(zzag) ? this.zzk.zzf(zzp2.zza) : BuildConfig.FLAVOR;
        if (zzj2 == null) {
            zzj2 = new zzg(this.zzn, zzp2.zza);
            if (zzc2.zzi(zzag.ANALYTICS_STORAGE)) {
                zzj2.zzI(zzw(zzc2));
            }
            if (zzc2.zzi(zzag)) {
                zzj2.zzaf(zzf2);
            }
        } else if (zzc2.zzi(zzag) && zzf2 != null && !zzf2.equals(zzj2.zzA())) {
            zzj2.zzaf(zzf2);
            zzne.zzc();
            zzaf zzg2 = zzg();
            zzek zzek = zzel.zzan;
            if (!zzg2.zzs((String) null, zzek) || !zzg().zzs((String) null, zzel.zzas)) {
                zzj2.zzI(zzw(zzc2));
            } else if (!"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzp2.zza, zzc2).first)) {
                zzj2.zzI(zzw(zzc2));
            }
            zzne.zzc();
            if (zzg().zzs((String) null, zzek) && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzp2.zza, zzc2).first)) {
                zzal zzal2 = this.zze;
                zzak(zzal2);
                if (zzal2.zzp(zzp2.zza, "_id") != null) {
                    zzal zzal3 = this.zze;
                    zzak(zzal3);
                    if (zzal3.zzp(zzp2.zza, "_lair") == null) {
                        zzln zzln = new zzln(zzp2.zza, "auto", "_lair", zzaw().currentTimeMillis(), 1L);
                        zzal zzal4 = this.zze;
                        zzak(zzal4);
                        zzal4.zzL(zzln);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzj2.zzu()) && zzc2.zzi(zzag.ANALYTICS_STORAGE)) {
            zzj2.zzI(zzw(zzc2));
        }
        zzj2.zzX(zzp2.zzb);
        zzj2.zzF(zzp2.zzq);
        if (!TextUtils.isEmpty(zzp2.zzk)) {
            zzj2.zzW(zzp2.zzk);
        }
        long j10 = zzp2.zze;
        if (j10 != 0) {
            zzj2.zzY(j10);
        }
        if (!TextUtils.isEmpty(zzp2.zzc)) {
            zzj2.zzK(zzp2.zzc);
        }
        zzj2.zzL(zzp2.zzj);
        String str = zzp2.zzd;
        if (str != null) {
            zzj2.zzJ(str);
        }
        zzj2.zzT(zzp2.zzf);
        zzj2.zzad(zzp2.zzh);
        if (!TextUtils.isEmpty(zzp2.zzg)) {
            zzj2.zzZ(zzp2.zzg);
        }
        if (!zzg().zzs((String) null, zzel.zzah)) {
            zzj2.zzH(zzp2.zzl);
        }
        zzj2.zzG(zzp2.zzo);
        zzj2.zzae(zzp2.zzr);
        zzj2.zzU(zzp2.zzs);
        zzpp.zzc();
        if (zzg().zzs((String) null, zzel.zzaH)) {
            zzj2.zzah(zzp2.zzx);
        }
        zznz.zzc();
        if (zzg().zzs((String) null, zzel.zzaz)) {
            zzj2.zzag(zzp2.zzt);
        } else {
            zznz.zzc();
            if (zzg().zzs((String) null, zzel.zzay)) {
                zzj2.zzag((List) null);
            }
        }
        if (zzj2.zzak()) {
            zzal zzal5 = this.zze;
            zzak(zzal5);
            zzal5.zzD(zzj2);
        }
        return zzj2;
    }

    public final zzz zzf() {
        zzz zzz2 = this.zzh;
        zzak(zzz2);
        return zzz2;
    }

    public final zzaf zzg() {
        return ((zzgi) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    public final zzah zzh(String str) {
        String str2;
        zzah zzah = zzah.zza;
        zzaA().zzg();
        zzB();
        zzah zzah2 = (zzah) this.zzB.get(str);
        if (zzah2 != null) {
            return zzah2;
        }
        zzal zzal = this.zze;
        zzak(zzal);
        Preconditions.checkNotNull(str);
        zzal.zzg();
        zzal.zzW();
        Cursor cursor = null;
        try {
            Cursor rawQuery = zzal.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            zzah zzb2 = zzah.zzb(str2);
            zzU(str, zzb2);
            return zzb2;
        } catch (SQLiteException e10) {
            zzal.zzs.zzaz().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e10);
            throw e10;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final zzal zzi() {
        zzal zzal = this.zze;
        zzak(zzal);
        return zzal;
    }

    public final zzet zzj() {
        return this.zzn.zzj();
    }

    public final zzfe zzl() {
        zzfe zzfe = this.zzd;
        zzak(zzfe);
        return zzfe;
    }

    public final zzfg zzm() {
        zzfg zzfg = this.zzf;
        if (zzfg != null) {
            return zzfg;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfz zzo() {
        zzfz zzfz = this.zzc;
        zzak(zzfz);
        return zzfz;
    }

    public final zzgi zzq() {
        return this.zzn;
    }

    public final zzis zzr() {
        zzis zzis = this.zzj;
        zzak(zzis);
        return zzis;
    }

    public final zzkd zzs() {
        return this.zzk;
    }

    public final zzlk zzu() {
        zzlk zzlk = this.zzi;
        zzak(zzlk);
        return zzlk;
    }

    public final zzlp zzv() {
        return ((zzgi) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    public final String zzw(zzah zzah) {
        if (!zzah.zzi(zzag.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzv().zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final String zzx(zzp zzp2) {
        try {
            return (String) zzaA().zzh(new zzlb(this, zzp2)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzaz().zzd().zzc("Failed to get app instance id. appId", zzey.zzn(zzp2.zza), e10);
            return null;
        }
    }

    public final void zzz(Runnable runnable) {
        zzaA().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
