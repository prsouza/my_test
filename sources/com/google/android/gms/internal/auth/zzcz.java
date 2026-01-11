package com.google.android.gms.internal.auth;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzcz<T> {
    private static final Object zza = new Object();
    public static final /* synthetic */ int zzd = 0;
    private static volatile zzcy zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicReference<Collection<zzcz<?>>> zzg = new AtomicReference<>();
    private static final zzdb zzh = new zzdb(zzcr.zza, (byte[]) null);
    private static final AtomicInteger zzi = new AtomicInteger();
    public final zzcx zzb;
    public final String zzc;
    private final T zzj;
    private volatile int zzk = -1;
    private volatile T zzl;
    private final boolean zzm;

    public /* synthetic */ zzcz(zzcx zzcx, String str, Object obj, boolean z, zzct zzct) {
        if (zzcx.zzb != null) {
            this.zzb = zzcx;
            this.zzc = str;
            this.zzj = obj;
            this.zzm = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void zzd() {
        zzi.incrementAndGet();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void zze(android.content.Context r3) {
        /*
            com.google.android.gms.internal.auth.zzcy r0 = zze
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = zza
            monitor-enter(r0)
            com.google.android.gms.internal.auth.zzcy r1 = zze     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0040
            monitor-enter(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.auth.zzcy r1 = zze     // Catch:{ all -> 0x003d }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0015
            r3 = r2
        L_0x0015:
            if (r1 == 0) goto L_0x001d
            android.content.Context r1 = r1.zza()     // Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x003b
        L_0x001d:
            com.google.android.gms.internal.auth.zzcg.zzd()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.auth.zzda.zzc()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.auth.zzcn.zze()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.auth.zzcs r1 = new com.google.android.gms.internal.auth.zzcs     // Catch:{ all -> 0x003d }
            r1.<init>(r3)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.auth.zzdg r1 = com.google.android.gms.internal.auth.zzdk.zza(r1)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.auth.zzcd r2 = new com.google.android.gms.internal.auth.zzcd     // Catch:{ all -> 0x003d }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x003d }
            zze = r2     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicInteger r3 = zzi     // Catch:{ all -> 0x003d }
            r3.incrementAndGet()     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r3
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcz.zze(android.content.Context):void");
    }

    public abstract T zza(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T zzb() {
        /*
            r7 = this;
            boolean r0 = r7.zzm
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = r7.zzc
            java.lang.String r1 = "flagName must not be null"
            java.util.Objects.requireNonNull(r0, r1)
        L_0x000b:
            java.util.concurrent.atomic.AtomicInteger r0 = zzi
            int r0 = r0.get()
            int r1 = r7.zzk
            if (r1 >= r0) goto L_0x0119
            monitor-enter(r7)
            int r1 = r7.zzk     // Catch:{ all -> 0x0116 }
            if (r1 >= r0) goto L_0x0114
            com.google.android.gms.internal.auth.zzcy r1 = zze     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x010e
            com.google.android.gms.internal.auth.zzcx r2 = r7.zzb     // Catch:{ all -> 0x0116 }
            boolean r2 = r2.zzf     // Catch:{ all -> 0x0116 }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.auth.zzcn r2 = com.google.android.gms.internal.auth.zzcn.zza(r2)     // Catch:{ all -> 0x0116 }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.zzb(r3)     // Catch:{ all -> 0x0116 }
            r3 = 0
            if (r2 == 0) goto L_0x006c
            java.util.regex.Pattern r4 = com.google.android.gms.internal.auth.zzcb.zzc     // Catch:{ all -> 0x0116 }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x0116 }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x006a
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.zzc()     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0116 }
            int r6 = r5.length()     // Catch:{ all -> 0x0116 }
            if (r6 == 0) goto L_0x0061
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0116 }
            goto L_0x0067
        L_0x0061:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0116 }
            r5.<init>(r4)     // Catch:{ all -> 0x0116 }
            r4 = r5
        L_0x0067:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x0116 }
        L_0x006a:
            r2 = r3
            goto L_0x00b3
        L_0x006c:
            com.google.android.gms.internal.auth.zzcx r2 = r7.zzb     // Catch:{ all -> 0x0116 }
            android.net.Uri r2 = r2.zzb     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x0097
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.auth.zzcx r4 = r7.zzb     // Catch:{ all -> 0x0116 }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x0116 }
            boolean r2 = com.google.android.gms.internal.auth.zzcp.zza(r2, r4)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x0095
            com.google.android.gms.internal.auth.zzcx r2 = r7.zzb     // Catch:{ all -> 0x0116 }
            boolean r2 = r2.zzh     // Catch:{ all -> 0x0116 }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x0116 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.auth.zzcx r4 = r7.zzb     // Catch:{ all -> 0x0116 }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.auth.zzcg r2 = com.google.android.gms.internal.auth.zzcg.zza(r2, r4)     // Catch:{ all -> 0x0116 }
            goto L_0x00a3
        L_0x0095:
            r2 = r3
            goto L_0x00a3
        L_0x0097:
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.auth.zzcx r4 = r7.zzb     // Catch:{ all -> 0x0116 }
            java.lang.String r4 = r4.zza     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.auth.zzda r2 = com.google.android.gms.internal.auth.zzda.zza(r2, r3)     // Catch:{ all -> 0x0116 }
        L_0x00a3:
            if (r2 == 0) goto L_0x006a
            java.lang.String r4 = r7.zzc()     // Catch:{ all -> 0x0116 }
            java.lang.Object r2 = r2.zzb(r4)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x006a
            java.lang.Object r2 = r7.zza(r2)     // Catch:{ all -> 0x0116 }
        L_0x00b3:
            if (r2 == 0) goto L_0x00b6
            goto L_0x00de
        L_0x00b6:
            com.google.android.gms.internal.auth.zzcx r2 = r7.zzb     // Catch:{ all -> 0x0116 }
            boolean r2 = r2.zze     // Catch:{ all -> 0x0116 }
            if (r2 != 0) goto L_0x00d9
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.auth.zzcn r2 = com.google.android.gms.internal.auth.zzcn.zza(r2)     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.auth.zzcx r4 = r7.zzb     // Catch:{ all -> 0x0116 }
            boolean r4 = r4.zze     // Catch:{ all -> 0x0116 }
            if (r4 == 0) goto L_0x00cc
            r4 = r3
            goto L_0x00ce
        L_0x00cc:
            java.lang.String r4 = r7.zzc     // Catch:{ all -> 0x0116 }
        L_0x00ce:
            java.lang.String r2 = r2.zzb(r4)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x00d9
            java.lang.Object r2 = r7.zza(r2)     // Catch:{ all -> 0x0116 }
            goto L_0x00da
        L_0x00d9:
            r2 = r3
        L_0x00da:
            if (r2 != 0) goto L_0x00de
            T r2 = r7.zzj     // Catch:{ all -> 0x0116 }
        L_0x00de:
            com.google.android.gms.internal.auth.zzdg r1 = r1.zzb()     // Catch:{ all -> 0x0116 }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.auth.zzde r1 = (com.google.android.gms.internal.auth.zzde) r1     // Catch:{ all -> 0x0116 }
            boolean r4 = r1.zzb()     // Catch:{ all -> 0x0116 }
            if (r4 == 0) goto L_0x0109
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.auth.zzco r1 = (com.google.android.gms.internal.auth.zzco) r1     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.auth.zzcx r2 = r7.zzb     // Catch:{ all -> 0x0116 }
            android.net.Uri r4 = r2.zzb     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = r2.zzd     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = r7.zzc     // Catch:{ all -> 0x0116 }
            java.lang.String r1 = r1.zza(r4, r3, r2, r5)     // Catch:{ all -> 0x0116 }
            if (r1 != 0) goto L_0x0105
            T r2 = r7.zzj     // Catch:{ all -> 0x0116 }
            goto L_0x0109
        L_0x0105:
            java.lang.Object r2 = r7.zza(r1)     // Catch:{ all -> 0x0116 }
        L_0x0109:
            r7.zzl = r2     // Catch:{ all -> 0x0116 }
            r7.zzk = r0     // Catch:{ all -> 0x0116 }
            goto L_0x0114
        L_0x010e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0116 }
            r0.<init>(r2)     // Catch:{ all -> 0x0116 }
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x0114:
            monitor-exit(r7)     // Catch:{ all -> 0x0116 }
            goto L_0x0119
        L_0x0116:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0116 }
            throw r0
        L_0x0119:
            T r0 = r7.zzl
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcz.zzb():java.lang.Object");
    }

    public final String zzc() {
        String str = this.zzb.zzd;
        return this.zzc;
    }
}
