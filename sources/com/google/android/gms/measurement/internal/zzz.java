package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

final class zzz extends zzkw {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzz(zzli zzli) {
        super(zzli);
    }

    private final zzt zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzt) this.zzc.get(num);
        }
        zzt zzt = new zzt(this, this.zza, (zzs) null);
        this.zzc.put(num, zzt);
        return zzt;
    }

    private final boolean zzf(int i, int i10) {
        zzt zzt = (zzt) this.zzc.get(Integer.valueOf(i));
        if (zzt == null) {
            return false;
        }
        return zzt.zze.get(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02fb, code lost:
        if (r5 != null) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0723, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0724, code lost:
        r29 = r2;
        r28 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x072b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x072c, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x074c, code lost:
        if (r11 != null) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0759, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x090d, code lost:
        if (r13 == null) goto L_0x0912;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0a3b, code lost:
        if (r7 != false) goto L_0x0a46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016c, code lost:
        if (r5 != null) goto L_0x016e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x072b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:239:0x0677] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0759  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0823  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x091a  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0a6c  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0b00  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01af A[Catch:{ SQLiteException -> 0x0221 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bd A[SYNTHETIC, Splitter:B:65:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0248  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zza(java.lang.String r66, java.util.List r67, java.util.List r68, java.lang.Long r69, java.lang.Long r70) {
        /*
            r65 = this;
            r10 = r65
            java.lang.String r11 = "current_results"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r66)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r67)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r68)
            r0 = r66
            r10.zza = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.zzb = r0
            s.a r0 = new s.a
            r0.<init>()
            r10.zzc = r0
            r0 = r69
            r10.zzd = r0
            r0 = r70
            r10.zze = r0
            java.util.Iterator r0 = r67.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzfs r1 = (com.google.android.gms.internal.measurement.zzfs) r1
            java.lang.String r1 = r1.zzh()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            r1 = r13
            goto L_0x0048
        L_0x0047:
            r1 = r12
        L_0x0048:
            com.google.android.gms.internal.measurement.zzoi.zzc()
            com.google.android.gms.measurement.internal.zzgi r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzaf r0 = r0.zzf()
            java.lang.String r2 = r10.zza
            com.google.android.gms.measurement.internal.zzek r3 = com.google.android.gms.measurement.internal.zzel.zzX
            boolean r14 = r0.zzs(r2, r3)
            com.google.android.gms.internal.measurement.zzoi.zzc()
            com.google.android.gms.measurement.internal.zzgi r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzaf r0 = r0.zzf()
            java.lang.String r2 = r10.zza
            com.google.android.gms.measurement.internal.zzek r3 = com.google.android.gms.measurement.internal.zzel.zzW
            boolean r15 = r0.zzs(r2, r3)
            if (r1 == 0) goto L_0x00af
            com.google.android.gms.measurement.internal.zzli r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzal r2 = r0.zzi()
            java.lang.String r3 = r10.zza
            r2.zzW()
            r2.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.zzh()     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x009b }
            r5[r12] = r3     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x00af
        L_0x009b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgi r2 = r2.zzs
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzey.zzn(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.zzc(r4, r3, r0)
        L_0x00af:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r9 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r7 = "data"
            java.lang.String r6 = "audience_id"
            if (r15 == 0) goto L_0x0179
            if (r14 == 0) goto L_0x0179
            com.google.android.gms.measurement.internal.zzli r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzal r2 = r0.zzi()
            java.lang.String r3 = r10.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            s.a r4 = new s.a
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r2.zzh()
            java.lang.String[] r18 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            r0[r12] = r3     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0150 }
            if (r0 == 0) goto L_0x014b
        L_0x00f1:
            byte[] r0 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x0150 }
            com.google.android.gms.internal.measurement.zzei r13 = com.google.android.gms.internal.measurement.zzej.zzc()     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.zzli r0 = com.google.android.gms.measurement.internal.zzlk.zzl(r13, r0)     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.zzei r0 = (com.google.android.gms.internal.measurement.zzei) r0     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.zzkc r0 = r0.zzaE()     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.zzej r0 = (com.google.android.gms.internal.measurement.zzej) r0     // Catch:{ IOException -> 0x012b }
            boolean r13 = r0.zzo()     // Catch:{ SQLiteException -> 0x0150 }
            if (r13 != 0) goto L_0x010c
            goto L_0x013d
        L_0x010c:
            int r13 = r5.getInt(r12)     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.Object r16 = r4.get(r13)     // Catch:{ SQLiteException -> 0x0150 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0150 }
            if (r16 != 0) goto L_0x0125
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0150 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0150 }
            r4.put(r13, r12)     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x0127
        L_0x0125:
            r12 = r16
        L_0x0127:
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x013d
        L_0x012b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgi r12 = r2.zzs     // Catch:{ SQLiteException -> 0x0150 }
            com.google.android.gms.measurement.internal.zzey r12 = r12.zzaz()     // Catch:{ SQLiteException -> 0x0150 }
            com.google.android.gms.measurement.internal.zzew r12 = r12.zzd()     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzey.zzn(r3)     // Catch:{ SQLiteException -> 0x0150 }
            r12.zzc(r9, r13, r0)     // Catch:{ SQLiteException -> 0x0150 }
        L_0x013d:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0150 }
            if (r0 != 0) goto L_0x0148
            r5.close()
            r12 = r4
            goto L_0x017a
        L_0x0148:
            r12 = 0
            r13 = 1
            goto L_0x00f1
        L_0x014b:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x016e
        L_0x0150:
            r0 = move-exception
            goto L_0x0157
        L_0x0152:
            r0 = move-exception
            r5 = 0
            goto L_0x0173
        L_0x0155:
            r0 = move-exception
            r5 = 0
        L_0x0157:
            com.google.android.gms.measurement.internal.zzgi r2 = r2.zzs     // Catch:{ all -> 0x0172 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch:{ all -> 0x0172 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x0172 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzey.zzn(r3)     // Catch:{ all -> 0x0172 }
            r2.zzc(r8, r3, r0)     // Catch:{ all -> 0x0172 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0172 }
            if (r5 == 0) goto L_0x0179
        L_0x016e:
            r5.close()
            goto L_0x0179
        L_0x0172:
            r0 = move-exception
        L_0x0173:
            if (r5 == 0) goto L_0x0178
            r5.close()
        L_0x0178:
            throw r0
        L_0x0179:
            r12 = r0
        L_0x017a:
            com.google.android.gms.measurement.internal.zzli r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzal r2 = r0.zzi()
            java.lang.String r3 = r10.zza
            r2.zzW()
            r2.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            android.database.sqlite.SQLiteDatabase r16 = r2.zzh()
            java.lang.String[] r18 = new java.lang.String[]{r6, r11}     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            r4 = 0
            r0[r4] = r3     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            java.lang.String r17 = "audience_filter_values"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0221 }
            if (r0 != 0) goto L_0x01bd
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0221 }
            r4.close()
            r13 = r0
            r18 = r6
            r19 = r7
            goto L_0x024c
        L_0x01bd:
            s.a r5 = new s.a     // Catch:{ SQLiteException -> 0x0221 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0221 }
        L_0x01c2:
            r13 = 0
            int r16 = r4.getInt(r13)     // Catch:{ SQLiteException -> 0x0221 }
            r13 = 1
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x0221 }
            com.google.android.gms.internal.measurement.zzgg r13 = com.google.android.gms.internal.measurement.zzgh.zzf()     // Catch:{ IOException -> 0x01ea }
            com.google.android.gms.internal.measurement.zzli r0 = com.google.android.gms.measurement.internal.zzlk.zzl(r13, r0)     // Catch:{ IOException -> 0x01ea }
            com.google.android.gms.internal.measurement.zzgg r0 = (com.google.android.gms.internal.measurement.zzgg) r0     // Catch:{ IOException -> 0x01ea }
            com.google.android.gms.internal.measurement.zzkc r0 = r0.zzaE()     // Catch:{ IOException -> 0x01ea }
            com.google.android.gms.internal.measurement.zzgh r0 = (com.google.android.gms.internal.measurement.zzgh) r0     // Catch:{ IOException -> 0x01ea }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0221 }
            r5.put(r13, r0)     // Catch:{ SQLiteException -> 0x0221 }
            r17 = r5
            r18 = r6
            r19 = r7
            goto L_0x0208
        L_0x01ea:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgi r13 = r2.zzs     // Catch:{ SQLiteException -> 0x0221 }
            com.google.android.gms.measurement.internal.zzey r13 = r13.zzaz()     // Catch:{ SQLiteException -> 0x0221 }
            com.google.android.gms.measurement.internal.zzew r13 = r13.zzd()     // Catch:{ SQLiteException -> 0x0221 }
            r17 = r5
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            r18 = r6
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzey.zzn(r3)     // Catch:{ SQLiteException -> 0x021d }
            r19 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x021b }
            r13.zzd(r5, r6, r7, r0)     // Catch:{ SQLiteException -> 0x021b }
        L_0x0208:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021b }
            if (r0 != 0) goto L_0x0214
            r4.close()
            r13 = r17
            goto L_0x024c
        L_0x0214:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x01c2
        L_0x021b:
            r0 = move-exception
            goto L_0x022f
        L_0x021d:
            r0 = move-exception
        L_0x021e:
            r19 = r7
            goto L_0x022f
        L_0x0221:
            r0 = move-exception
            r18 = r6
            goto L_0x021e
        L_0x0225:
            r0 = move-exception
            r5 = 0
            goto L_0x0afe
        L_0x0229:
            r0 = move-exception
            r18 = r6
            r19 = r7
            r4 = 0
        L_0x022f:
            com.google.android.gms.measurement.internal.zzgi r2 = r2.zzs     // Catch:{ all -> 0x0afc }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch:{ all -> 0x0afc }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x0afc }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzey.zzn(r3)     // Catch:{ all -> 0x0afc }
            r2.zzc(r5, r3, r0)     // Catch:{ all -> 0x0afc }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0afc }
            if (r4 == 0) goto L_0x024b
            r4.close()
        L_0x024b:
            r13 = r0
        L_0x024c:
            boolean r0 = r13.isEmpty()
            r7 = 2
            if (r0 == 0) goto L_0x025d
        L_0x0253:
            r12 = r8
            r30 = r9
            r28 = r18
            r29 = r19
            r13 = 0
            goto L_0x0583
        L_0x025d:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r13.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L_0x03d0
            java.lang.String r1 = r10.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            s.a r3 = new s.a
            r3.<init>()
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x027d
            goto L_0x03c7
        L_0x027d:
            com.google.android.gms.measurement.internal.zzli r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzal r4 = r0.zzi()
            r4.zzW()
            r4.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            s.a r0 = new s.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r4.zzh()
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02de }
            r16 = 0
            r6[r16] = r1     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02de }
            r16 = 1
            r6[r16] = r1     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02de }
            java.lang.String r7 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r7, r6)     // Catch:{ SQLiteException -> 0x02e2, all -> 0x02de }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x02dc }
            if (r6 == 0) goto L_0x02d7
        L_0x02ab:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02dc }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x02dc }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x02dc }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x02dc }
            if (r7 != 0) goto L_0x02c4
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02dc }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02dc }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x02dc }
        L_0x02c4:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02dc }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x02dc }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x02dc }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x02dc }
            if (r6 != 0) goto L_0x02ab
            goto L_0x02fd
        L_0x02d7:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x02dc }
            goto L_0x02fd
        L_0x02dc:
            r0 = move-exception
            goto L_0x02e4
        L_0x02de:
            r0 = move-exception
            r5 = 0
            goto L_0x03ca
        L_0x02e2:
            r0 = move-exception
            r5 = 0
        L_0x02e4:
            com.google.android.gms.measurement.internal.zzgi r4 = r4.zzs     // Catch:{ all -> 0x03c9 }
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzaz()     // Catch:{ all -> 0x03c9 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzd()     // Catch:{ all -> 0x03c9 }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzey.zzn(r1)     // Catch:{ all -> 0x03c9 }
            r4.zzc(r6, r1, r0)     // Catch:{ all -> 0x03c9 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x03c9 }
            if (r5 == 0) goto L_0x0300
        L_0x02fd:
            r5.close()
        L_0x0300:
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0308:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x03c7
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzgh r6 = (com.google.android.gms.internal.measurement.zzgh) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x03ba
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x0332
            goto L_0x03ba
        L_0x0332:
            com.google.android.gms.measurement.internal.zzli r5 = r10.zzf
            com.google.android.gms.measurement.internal.zzlk r5 = r5.zzu()
            r17 = r0
            java.util.List r0 = r6.zzk()
            java.util.List r0 = r5.zzq(r0, r7)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x03b6
            com.google.android.gms.internal.measurement.zzjy r5 = r6.zzbB()
            com.google.android.gms.internal.measurement.zzgg r5 = (com.google.android.gms.internal.measurement.zzgg) r5
            r5.zze()
            r5.zzb(r0)
            com.google.android.gms.measurement.internal.zzli r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzlk r0 = r0.zzu()
            r20 = r1
            java.util.List r1 = r6.zzn()
            java.util.List r0 = r0.zzq(r1, r7)
            r5.zzf()
            r5.zzd(r0)
            r0 = 0
        L_0x036b:
            int r1 = r6.zza()
            if (r0 >= r1) goto L_0x0389
            com.google.android.gms.internal.measurement.zzfq r1 = r6.zze(r0)
            int r1 = r1.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x0386
            r5.zzg(r0)
        L_0x0386:
            int r0 = r0 + 1
            goto L_0x036b
        L_0x0389:
            r0 = 0
        L_0x038a:
            int r1 = r6.zzc()
            if (r0 >= r1) goto L_0x03a8
            com.google.android.gms.internal.measurement.zzgj r1 = r6.zzi(r0)
            int r1 = r1.zzb()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x03a5
            r5.zzh(r0)
        L_0x03a5:
            int r0 = r0 + 1
            goto L_0x038a
        L_0x03a8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.internal.measurement.zzkc r1 = r5.zzaE()
            com.google.android.gms.internal.measurement.zzgh r1 = (com.google.android.gms.internal.measurement.zzgh) r1
            r3.put(r0, r1)
            goto L_0x03c1
        L_0x03b6:
            r0 = r17
            goto L_0x0308
        L_0x03ba:
            r17 = r0
            r20 = r1
            r3.put(r5, r6)
        L_0x03c1:
            r0 = r17
            r1 = r20
            goto L_0x0308
        L_0x03c7:
            r0 = r3
            goto L_0x03d1
        L_0x03c9:
            r0 = move-exception
        L_0x03ca:
            if (r5 == 0) goto L_0x03cf
            r5.close()
        L_0x03cf:
            throw r0
        L_0x03d0:
            r0 = r13
        L_0x03d1:
            java.util.Iterator r17 = r2.iterator()
        L_0x03d5:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0253
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r20 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzgh r1 = (com.google.android.gms.internal.measurement.zzgh) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            s.a r7 = new s.a
            r7.<init>()
            if (r1 == 0) goto L_0x043d
            int r2 = r1.zza()
            if (r2 != 0) goto L_0x0407
            goto L_0x043d
        L_0x0407:
            java.util.List r2 = r1.zzj()
            java.util.Iterator r2 = r2.iterator()
        L_0x040f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x043d
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzfq r3 = (com.google.android.gms.internal.measurement.zzfq) r3
            boolean r4 = r3.zzh()
            if (r4 == 0) goto L_0x040f
            int r4 = r3.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r21 = r3.zzg()
            if (r21 == 0) goto L_0x0438
            long r21 = r3.zzb()
            java.lang.Long r3 = java.lang.Long.valueOf(r21)
            goto L_0x0439
        L_0x0438:
            r3 = 0
        L_0x0439:
            r7.put(r4, r3)
            goto L_0x040f
        L_0x043d:
            s.a r4 = new s.a
            r4.<init>()
            if (r1 == 0) goto L_0x048d
            int r2 = r1.zzc()
            if (r2 != 0) goto L_0x044b
            goto L_0x048d
        L_0x044b:
            java.util.List r2 = r1.zzm()
            java.util.Iterator r2 = r2.iterator()
        L_0x0453:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x048d
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzgj r3 = (com.google.android.gms.internal.measurement.zzgj) r3
            boolean r21 = r3.zzi()
            if (r21 == 0) goto L_0x0453
            int r21 = r3.zza()
            if (r21 <= 0) goto L_0x0453
            int r21 = r3.zzb()
            r22 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            int r21 = r3.zza()
            r23 = r2
            int r2 = r21 + -1
            long r2 = r3.zzc(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.put(r0, r2)
            r0 = r22
            r2 = r23
            goto L_0x0453
        L_0x048d:
            r22 = r0
            if (r1 == 0) goto L_0x04e2
            r0 = 0
        L_0x0492:
            int r2 = r1.zzd()
            int r2 = r2 * 64
            if (r0 >= r2) goto L_0x04e2
            java.util.List r2 = r1.zzn()
            boolean r2 = com.google.android.gms.measurement.internal.zzlk.zzv(r2, r0)
            if (r2 == 0) goto L_0x04d0
            com.google.android.gms.measurement.internal.zzgi r2 = r10.zzs
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzj()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r21 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r23 = r9
            java.lang.String r9 = "Filter already evaluated. audience ID, filter ID"
            r2.zzc(r9, r3, r8)
            r6.set(r0)
            java.util.List r2 = r1.zzk()
            boolean r2 = com.google.android.gms.measurement.internal.zzlk.zzv(r2, r0)
            if (r2 == 0) goto L_0x04d4
            r5.set(r0)
            goto L_0x04db
        L_0x04d0:
            r21 = r8
            r23 = r9
        L_0x04d4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L_0x04db:
            int r0 = r0 + 1
            r8 = r21
            r9 = r23
            goto L_0x0492
        L_0x04e2:
            r21 = r8
            r23 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r13.get(r0)
            r8 = r1
            com.google.android.gms.internal.measurement.zzgh r8 = (com.google.android.gms.internal.measurement.zzgh) r8
            if (r15 == 0) goto L_0x0551
            if (r14 == 0) goto L_0x0551
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0551
            java.lang.Long r1 = r10.zze
            if (r1 == 0) goto L_0x0551
            java.lang.Long r1 = r10.zzd
            if (r1 != 0) goto L_0x0506
            goto L_0x0551
        L_0x0506:
            java.util.Iterator r0 = r0.iterator()
        L_0x050a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0551
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzej r1 = (com.google.android.gms.internal.measurement.zzej) r1
            int r2 = r1.zzb()
            java.lang.Long r3 = r10.zze
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.zzm()
            if (r1 == 0) goto L_0x0532
            java.lang.Long r1 = r10.zzd
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L_0x0532:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L_0x0543
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L_0x0543:
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L_0x050a
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r4.put(r1, r2)
            goto L_0x050a
        L_0x0551:
            com.google.android.gms.measurement.internal.zzt r0 = new com.google.android.gms.measurement.internal.zzt
            java.lang.String r3 = r10.zza
            r9 = 0
            r1 = r0
            r2 = r65
            r24 = r4
            r4 = r8
            r8 = 0
            r28 = r18
            r29 = r19
            r16 = r12
            r66 = r13
            r12 = r21
            r13 = r8
            r8 = r24
            r30 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map r1 = r10.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1.put(r2, r0)
            r13 = r66
            r8 = r12
            r12 = r16
            r0 = r22
            r9 = r30
            goto L_0x03d5
        L_0x0583:
            boolean r0 = r67.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L_0x058f
        L_0x058b:
            r25 = r11
            goto L_0x0819
        L_0x058f:
            com.google.android.gms.measurement.internal.zzv r2 = new com.google.android.gms.measurement.internal.zzv
            r2.<init>(r10, r13)
            s.a r3 = new s.a
            r3.<init>()
            java.util.Iterator r4 = r67.iterator()
        L_0x059d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x058b
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.measurement.zzfs r0 = (com.google.android.gms.internal.measurement.zzfs) r0
            java.lang.String r5 = r10.zza
            com.google.android.gms.internal.measurement.zzfs r5 = r2.zza(r5, r0)
            if (r5 == 0) goto L_0x0806
            com.google.android.gms.measurement.internal.zzli r6 = r10.zzf
            com.google.android.gms.measurement.internal.zzal r6 = r6.zzi()
            java.lang.String r7 = r10.zza
            java.lang.String r8 = r5.zzh()
            java.lang.String r9 = r0.zzh()
            com.google.android.gms.measurement.internal.zzar r9 = r6.zzn(r7, r9)
            if (r9 != 0) goto L_0x0606
            com.google.android.gms.measurement.internal.zzgi r9 = r6.zzs
            com.google.android.gms.measurement.internal.zzey r9 = r9.zzaz()
            com.google.android.gms.measurement.internal.zzew r9 = r9.zzk()
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzey.zzn(r7)
            com.google.android.gms.measurement.internal.zzgi r6 = r6.zzs
            com.google.android.gms.measurement.internal.zzet r6 = r6.zzj()
            java.lang.String r6 = r6.zzd(r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r9.zzc(r8, r14, r6)
            com.google.android.gms.measurement.internal.zzar r6 = new com.google.android.gms.measurement.internal.zzar
            r31 = r6
            java.lang.String r33 = r0.zzh()
            r34 = 1
            r36 = 1
            r38 = 1
            long r40 = r0.zzd()
            r42 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r32 = r7
            r31.<init>(r32, r33, r34, r36, r38, r40, r42, r44, r45, r46, r47)
            goto L_0x063b
        L_0x0606:
            com.google.android.gms.measurement.internal.zzar r6 = new com.google.android.gms.measurement.internal.zzar
            r48 = r6
            java.lang.String r0 = r9.zza
            r49 = r0
            java.lang.String r0 = r9.zzb
            r50 = r0
            long r7 = r9.zzc
            r14 = 1
            long r51 = r7 + r14
            long r7 = r9.zzd
            long r53 = r7 + r14
            long r7 = r9.zze
            long r55 = r7 + r14
            long r7 = r9.zzf
            r57 = r7
            long r7 = r9.zzg
            r59 = r7
            java.lang.Long r0 = r9.zzh
            r61 = r0
            java.lang.Long r0 = r9.zzi
            r62 = r0
            java.lang.Long r0 = r9.zzj
            r63 = r0
            java.lang.Boolean r0 = r9.zzk
            r64 = r0
            r48.<init>(r49, r50, r51, r53, r55, r57, r59, r61, r62, r63, r64)
        L_0x063b:
            com.google.android.gms.measurement.internal.zzli r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzal r0 = r0.zzi()
            r0.zzE(r6)
            long r7 = r6.zzc
            java.lang.String r9 = r5.zzh()
            java.lang.Object r0 = r3.get(r9)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x075d
            com.google.android.gms.measurement.internal.zzli r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzal r14 = r0.zzi()
            java.lang.String r15 = r10.zza
            r14.zzW()
            r14.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            s.a r13 = new s.a
            r13.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r14.zzh()
            r24 = r2
            r67 = r4
            r4 = r28
            r2 = r29
            java.lang.String[] r18 = new java.lang.String[]{r4, r2}     // Catch:{ SQLiteException -> 0x072e, all -> 0x072b }
            r25 = r11
            r11 = 2
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0723, all -> 0x072b }
            r17 = 0
            r0[r17] = r15     // Catch:{ SQLiteException -> 0x0723, all -> 0x072b }
            r17 = 1
            r0[r17] = r9     // Catch:{ SQLiteException -> 0x0723, all -> 0x072b }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=? AND event_name=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r11 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0723, all -> 0x072b }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x071f }
            if (r0 == 0) goto L_0x0712
        L_0x069e:
            r29 = r2
            r2 = 1
            byte[] r0 = r11.getBlob(r2)     // Catch:{ SQLiteException -> 0x070e }
            com.google.android.gms.internal.measurement.zzei r2 = com.google.android.gms.internal.measurement.zzej.zzc()     // Catch:{ IOException -> 0x06dd }
            com.google.android.gms.internal.measurement.zzli r0 = com.google.android.gms.measurement.internal.zzlk.zzl(r2, r0)     // Catch:{ IOException -> 0x06dd }
            com.google.android.gms.internal.measurement.zzei r0 = (com.google.android.gms.internal.measurement.zzei) r0     // Catch:{ IOException -> 0x06dd }
            com.google.android.gms.internal.measurement.zzkc r0 = r0.zzaE()     // Catch:{ IOException -> 0x06dd }
            com.google.android.gms.internal.measurement.zzej r0 = (com.google.android.gms.internal.measurement.zzej) r0     // Catch:{ IOException -> 0x06dd }
            r2 = 0
            int r16 = r11.getInt(r2)     // Catch:{ SQLiteException -> 0x070e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x070e }
            java.lang.Object r16 = r13.get(r2)     // Catch:{ SQLiteException -> 0x070e }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x070e }
            if (r16 != 0) goto L_0x06d1
            r28 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x070a }
            r4.<init>()     // Catch:{ SQLiteException -> 0x070a }
            r13.put(r2, r4)     // Catch:{ SQLiteException -> 0x070a }
            goto L_0x06d5
        L_0x06d1:
            r28 = r4
            r4 = r16
        L_0x06d5:
            r4.add(r0)     // Catch:{ SQLiteException -> 0x070a }
            r16 = r13
            r13 = r30
            goto L_0x06f5
        L_0x06dd:
            r0 = move-exception
            r28 = r4
            com.google.android.gms.measurement.internal.zzgi r2 = r14.zzs     // Catch:{ SQLiteException -> 0x070a }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch:{ SQLiteException -> 0x070a }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ SQLiteException -> 0x070a }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r15)     // Catch:{ SQLiteException -> 0x070a }
            r16 = r13
            r13 = r30
            r2.zzc(r13, r4, r0)     // Catch:{ SQLiteException -> 0x071d }
        L_0x06f5:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x071d }
            if (r0 != 0) goto L_0x0701
            r11.close()
            r0 = r16
            goto L_0x0751
        L_0x0701:
            r30 = r13
            r13 = r16
            r4 = r28
            r2 = r29
            goto L_0x069e
        L_0x070a:
            r0 = move-exception
        L_0x070b:
            r13 = r30
            goto L_0x0737
        L_0x070e:
            r0 = move-exception
        L_0x070f:
            r28 = r4
            goto L_0x070b
        L_0x0712:
            r29 = r2
            r28 = r4
            r13 = r30
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x071d }
            goto L_0x074e
        L_0x071d:
            r0 = move-exception
            goto L_0x0737
        L_0x071f:
            r0 = move-exception
            r29 = r2
            goto L_0x070f
        L_0x0723:
            r0 = move-exception
            r29 = r2
            r28 = r4
        L_0x0728:
            r13 = r30
            goto L_0x0736
        L_0x072b:
            r0 = move-exception
            r5 = 0
            goto L_0x0757
        L_0x072e:
            r0 = move-exception
            r29 = r2
            r28 = r4
            r25 = r11
            goto L_0x0728
        L_0x0736:
            r11 = 0
        L_0x0737:
            com.google.android.gms.measurement.internal.zzgi r2 = r14.zzs     // Catch:{ all -> 0x0755 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch:{ all -> 0x0755 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x0755 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzey.zzn(r15)     // Catch:{ all -> 0x0755 }
            r2.zzc(r12, r4, r0)     // Catch:{ all -> 0x0755 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0755 }
            if (r11 == 0) goto L_0x0751
        L_0x074e:
            r11.close()
        L_0x0751:
            r3.put(r9, r0)
            goto L_0x0765
        L_0x0755:
            r0 = move-exception
            r5 = r11
        L_0x0757:
            if (r5 == 0) goto L_0x075c
            r5.close()
        L_0x075c:
            throw r0
        L_0x075d:
            r24 = r2
            r67 = r4
            r25 = r11
            r13 = r30
        L_0x0765:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x076d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x080e
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Set r9 = r10.zzb
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto L_0x0797
            com.google.android.gms.measurement.internal.zzgi r4 = r10.zzs
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzaz()
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzj()
            r4.zzb(r1, r11)
            goto L_0x076d
        L_0x0797:
            java.lang.Object r9 = r0.get(r11)
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
            r11 = 1
        L_0x07a2:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x07f1
            java.lang.Object r11 = r9.next()
            com.google.android.gms.internal.measurement.zzej r11 = (com.google.android.gms.internal.measurement.zzej) r11
            com.google.android.gms.measurement.internal.zzw r15 = new com.google.android.gms.measurement.internal.zzw
            java.lang.String r14 = r10.zza
            r15.<init>(r10, r14, r4, r11)
            java.lang.Long r14 = r10.zzd
            r22 = r0
            java.lang.Long r0 = r10.zze
            int r11 = r11.zzb()
            boolean r21 = r10.zzf(r4, r11)
            r11 = r14
            r14 = r15
            r23 = r2
            r2 = r15
            r15 = r11
            r16 = r0
            r17 = r5
            r18 = r7
            r20 = r6
            boolean r11 = r14.zzd(r15, r16, r17, r18, r20, r21)
            if (r11 == 0) goto L_0x07e7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.measurement.internal.zzt r0 = r10.zzd(r0)
            r0.zzc(r2)
            r0 = r22
            r2 = r23
            goto L_0x07a2
        L_0x07e7:
            java.util.Set r0 = r10.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.add(r2)
            goto L_0x07f5
        L_0x07f1:
            r22 = r0
            r23 = r2
        L_0x07f5:
            if (r11 != 0) goto L_0x0800
            java.util.Set r0 = r10.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.add(r2)
        L_0x0800:
            r0 = r22
            r2 = r23
            goto L_0x076d
        L_0x0806:
            r24 = r2
            r67 = r4
            r25 = r11
            r13 = r30
        L_0x080e:
            r4 = r67
            r30 = r13
            r2 = r24
            r11 = r25
            r13 = 0
            goto L_0x059d
        L_0x0819:
            boolean r0 = r68.isEmpty()
            if (r0 == 0) goto L_0x0823
        L_0x081f:
            r11 = r28
            goto L_0x0a52
        L_0x0823:
            s.a r2 = new s.a
            r2.<init>()
            java.util.Iterator r3 = r68.iterator()
        L_0x082c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x081f
            java.lang.Object r0 = r3.next()
            r4 = r0
            com.google.android.gms.internal.measurement.zzgl r4 = (com.google.android.gms.internal.measurement.zzgl) r4
            java.lang.String r5 = r4.zzf()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x091e
            com.google.android.gms.measurement.internal.zzli r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzal r6 = r0.zzi()
            java.lang.String r7 = r10.zza
            r6.zzW()
            r6.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            s.a r8 = new s.a
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r13 = r6.zzh()
            r11 = r28
            r9 = r29
            java.lang.String[] r15 = new java.lang.String[]{r11, r9}     // Catch:{ SQLiteException -> 0x08f4, all -> 0x08f1 }
            r14 = 2
            java.lang.String[] r0 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x08f4, all -> 0x08f1 }
            r14 = 0
            r0[r14] = r7     // Catch:{ SQLiteException -> 0x08f4, all -> 0x08f1 }
            r14 = 1
            r0[r14] = r5     // Catch:{ SQLiteException -> 0x08f4, all -> 0x08f1 }
            java.lang.String r14 = "property_filters"
            java.lang.String r16 = "app_id=? AND property_name=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            android.database.Cursor r13 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x08f4, all -> 0x08f1 }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x08ed }
            if (r0 == 0) goto L_0x08e4
        L_0x0889:
            r14 = 1
            byte[] r0 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x08ed }
            com.google.android.gms.internal.measurement.zzer r15 = com.google.android.gms.internal.measurement.zzes.zzc()     // Catch:{ IOException -> 0x08c0 }
            com.google.android.gms.internal.measurement.zzli r0 = com.google.android.gms.measurement.internal.zzlk.zzl(r15, r0)     // Catch:{ IOException -> 0x08c0 }
            com.google.android.gms.internal.measurement.zzer r0 = (com.google.android.gms.internal.measurement.zzer) r0     // Catch:{ IOException -> 0x08c0 }
            com.google.android.gms.internal.measurement.zzkc r0 = r0.zzaE()     // Catch:{ IOException -> 0x08c0 }
            com.google.android.gms.internal.measurement.zzes r0 = (com.google.android.gms.internal.measurement.zzes) r0     // Catch:{ IOException -> 0x08c0 }
            r15 = 0
            int r16 = r13.getInt(r15)     // Catch:{ SQLiteException -> 0x08ed }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x08ed }
            java.lang.Object r16 = r8.get(r14)     // Catch:{ SQLiteException -> 0x08ed }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x08ed }
            if (r16 != 0) goto L_0x08b8
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x08ed }
            r15.<init>()     // Catch:{ SQLiteException -> 0x08ed }
            r8.put(r14, r15)     // Catch:{ SQLiteException -> 0x08ed }
            goto L_0x08ba
        L_0x08b8:
            r15 = r16
        L_0x08ba:
            r15.add(r0)     // Catch:{ SQLiteException -> 0x08ed }
            r67 = r3
            goto L_0x08d6
        L_0x08c0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgi r14 = r6.zzs     // Catch:{ SQLiteException -> 0x08ed }
            com.google.android.gms.measurement.internal.zzey r14 = r14.zzaz()     // Catch:{ SQLiteException -> 0x08ed }
            com.google.android.gms.measurement.internal.zzew r14 = r14.zzd()     // Catch:{ SQLiteException -> 0x08ed }
            java.lang.String r15 = "Failed to merge filter"
            r67 = r3
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzey.zzn(r7)     // Catch:{ SQLiteException -> 0x08eb }
            r14.zzc(r15, r3, r0)     // Catch:{ SQLiteException -> 0x08eb }
        L_0x08d6:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x08eb }
            if (r0 != 0) goto L_0x08e1
            r13.close()
            r0 = r8
            goto L_0x0912
        L_0x08e1:
            r3 = r67
            goto L_0x0889
        L_0x08e4:
            r67 = r3
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x08eb }
            goto L_0x090f
        L_0x08eb:
            r0 = move-exception
            goto L_0x08f8
        L_0x08ed:
            r0 = move-exception
            r67 = r3
            goto L_0x08f8
        L_0x08f1:
            r0 = move-exception
            r5 = 0
            goto L_0x0918
        L_0x08f4:
            r0 = move-exception
            r67 = r3
            r13 = 0
        L_0x08f8:
            com.google.android.gms.measurement.internal.zzgi r3 = r6.zzs     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()     // Catch:{ all -> 0x0916 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzey.zzn(r7)     // Catch:{ all -> 0x0916 }
            r3.zzc(r12, r6, r0)     // Catch:{ all -> 0x0916 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0916 }
            if (r13 == 0) goto L_0x0912
        L_0x090f:
            r13.close()
        L_0x0912:
            r2.put(r5, r0)
            goto L_0x0924
        L_0x0916:
            r0 = move-exception
            r5 = r13
        L_0x0918:
            if (r5 == 0) goto L_0x091d
            r5.close()
        L_0x091d:
            throw r0
        L_0x091e:
            r67 = r3
            r11 = r28
            r9 = r29
        L_0x0924:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x092c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0a4a
            java.lang.Object r5 = r3.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Set r6 = r10.zzb
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x0957
            com.google.android.gms.measurement.internal.zzgi r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzj()
            r0.zzb(r1, r7)
            goto L_0x0a4a
        L_0x0957:
            java.lang.Object r6 = r0.get(r7)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L_0x0962:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a39
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.measurement.zzes r7 = (com.google.android.gms.internal.measurement.zzes) r7
            com.google.android.gms.measurement.internal.zzgi r8 = r10.zzs
            com.google.android.gms.measurement.internal.zzey r8 = r8.zzaz()
            java.lang.String r8 = r8.zzq()
            r13 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r13)
            if (r8 == 0) goto L_0x09cc
            com.google.android.gms.measurement.internal.zzgi r8 = r10.zzs
            com.google.android.gms.measurement.internal.zzey r8 = r8.zzaz()
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzj()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r15 = r7.zzj()
            if (r15 == 0) goto L_0x099c
            int r15 = r7.zza()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x099d
        L_0x099c:
            r15 = 0
        L_0x099d:
            com.google.android.gms.measurement.internal.zzgi r13 = r10.zzs
            com.google.android.gms.measurement.internal.zzet r13 = r13.zzj()
            r68 = r0
            java.lang.String r0 = r7.zze()
            java.lang.String r0 = r13.zzf(r0)
            java.lang.String r13 = "Evaluating filter. audience, filter, property"
            r8.zzd(r13, r14, r15, r0)
            com.google.android.gms.measurement.internal.zzgi r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzj()
            com.google.android.gms.measurement.internal.zzli r8 = r10.zzf
            com.google.android.gms.measurement.internal.zzlk r8 = r8.zzu()
            java.lang.String r8 = r8.zzp(r7)
            java.lang.String r13 = "Filter definition"
            r0.zzb(r13, r8)
            goto L_0x09ce
        L_0x09cc:
            r68 = r0
        L_0x09ce:
            boolean r0 = r7.zzj()
            if (r0 == 0) goto L_0x0a0f
            int r0 = r7.zza()
            r8 = 256(0x100, float:3.59E-43)
            if (r0 <= r8) goto L_0x09dd
            goto L_0x0a0f
        L_0x09dd:
            com.google.android.gms.measurement.internal.zzy r0 = new com.google.android.gms.measurement.internal.zzy
            java.lang.String r8 = r10.zza
            r0.<init>(r10, r8, r5, r7)
            java.lang.Long r8 = r10.zzd
            java.lang.Long r13 = r10.zze
            int r7 = r7.zza()
            boolean r7 = r10.zzf(r5, r7)
            boolean r7 = r0.zzd(r8, r13, r4, r7)
            if (r7 == 0) goto L_0x0a05
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            com.google.android.gms.measurement.internal.zzt r8 = r10.zzd(r8)
            r8.zzc(r0)
            r0 = r68
            goto L_0x0962
        L_0x0a05:
            java.util.Set r0 = r10.zzb
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.add(r6)
            goto L_0x0a3b
        L_0x0a0f:
            com.google.android.gms.measurement.internal.zzgi r0 = r10.zzs
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzk()
            java.lang.String r6 = r10.zza
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzey.zzn(r6)
            boolean r8 = r7.zzj()
            if (r8 == 0) goto L_0x0a2e
            int r7 = r7.zza()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0a2f
        L_0x0a2e:
            r7 = 0
        L_0x0a2f:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r0.zzc(r8, r6, r7)
            goto L_0x0a3d
        L_0x0a39:
            r68 = r0
        L_0x0a3b:
            if (r7 != 0) goto L_0x0a46
        L_0x0a3d:
            java.util.Set r0 = r10.zzb
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        L_0x0a46:
            r0 = r68
            goto L_0x092c
        L_0x0a4a:
            r3 = r67
            r29 = r9
            r28 = r11
            goto L_0x082c
        L_0x0a52:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r0 = r10.zzc
            java.util.Set r0 = r0.keySet()
            java.util.Set r2 = r10.zzb
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0a66:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0afb
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map r3 = r10.zzc
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.zzt r3 = (com.google.android.gms.measurement.internal.zzt) r3
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.internal.measurement.zzfo r0 = r3.zza(r0)
            r1.add(r0)
            com.google.android.gms.measurement.internal.zzli r3 = r10.zzf
            com.google.android.gms.measurement.internal.zzal r3 = r3.zzi()
            java.lang.String r5 = r10.zza
            com.google.android.gms.internal.measurement.zzgh r0 = r0.zzd()
            r3.zzW()
            r3.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            byte[] r0 = r0.zzby()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r6.put(r11, r4)
            r4 = r25
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.zzh()     // Catch:{ SQLiteException -> 0x0ae2 }
            java.lang.String r7 = "audience_filter_values"
            r8 = 5
            r9 = 0
            long r6 = r0.insertWithOnConflict(r7, r9, r6, r8)     // Catch:{ SQLiteException -> 0x0ae0 }
            r12 = -1
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0af7
            com.google.android.gms.measurement.internal.zzgi r0 = r3.zzs     // Catch:{ SQLiteException -> 0x0ae0 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ SQLiteException -> 0x0ae0 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzd()     // Catch:{ SQLiteException -> 0x0ae0 }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzey.zzn(r5)     // Catch:{ SQLiteException -> 0x0ae0 }
            r0.zzb(r6, r7)     // Catch:{ SQLiteException -> 0x0ae0 }
            goto L_0x0af7
        L_0x0ae0:
            r0 = move-exception
            goto L_0x0ae4
        L_0x0ae2:
            r0 = move-exception
            r9 = 0
        L_0x0ae4:
            com.google.android.gms.measurement.internal.zzgi r3 = r3.zzs
            com.google.android.gms.measurement.internal.zzey r3 = r3.zzaz()
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzd()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzey.zzn(r5)
            java.lang.String r6 = "Error storing filter results. appId"
            r3.zzc(r6, r5, r0)
        L_0x0af7:
            r25 = r4
            goto L_0x0a66
        L_0x0afb:
            return r1
        L_0x0afc:
            r0 = move-exception
            r5 = r4
        L_0x0afe:
            if (r5 == 0) goto L_0x0b03
            r5.close()
        L_0x0b03:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzz.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    public final boolean zzb() {
        return false;
    }
}
