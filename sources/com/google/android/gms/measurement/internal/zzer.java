package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.a;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzer extends zzf {
    private final zzeq zza;
    private boolean zzb;

    public zzer(zzgi zzgi) {
        super(zzgi);
        Context zzav = this.zzs.zzav();
        this.zzs.zzf();
        this.zza = new zzeq(this, zzav, "google_app_measurement_local.db");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r3v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v8, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7 A[SYNTHETIC, Splitter:B:47:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x011d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzq(int r14, byte[] r15) {
        /*
            r13 = this;
            r13.zzg()
            boolean r0 = r13.zzb
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r2 = "type"
            r0.put(r2, r14)
            java.lang.String r14 = "entry"
            r0.put(r14, r15)
            com.google.android.gms.measurement.internal.zzgi r14 = r13.zzs
            r14.zzf()
            r14 = 5
            r15 = r14
            r2 = r1
        L_0x0024:
            if (r1 >= r14) goto L_0x0133
            r14 = 1
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r13.zzh()     // Catch:{ SQLiteFullException -> 0x00fe, SQLiteDatabaseLockedException -> 0x00ec, SQLiteException -> 0x00c3, all -> 0x00bf }
            if (r4 != 0) goto L_0x0031
            r13.zzb = r14     // Catch:{ SQLiteFullException -> 0x00bd, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00b9 }
            return r2
        L_0x0031:
            r4.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bd, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00b9 }
            java.lang.String r5 = "select count(1) from messages"
            android.database.Cursor r5 = r4.rawQuery(r5, r3)     // Catch:{ SQLiteFullException -> 0x00bd, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00b9 }
            r6 = 0
            if (r5 == 0) goto L_0x004f
            boolean r8 = r5.moveToFirst()     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            if (r8 == 0) goto L_0x004f
            long r6 = r5.getLong(r2)     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            goto L_0x004f
        L_0x0049:
            r14 = move-exception
            goto L_0x00ad
        L_0x004b:
            r14 = move-exception
            goto L_0x00b0
        L_0x004d:
            r14 = move-exception
            goto L_0x00b4
        L_0x004f:
            r8 = 100000(0x186a0, double:4.94066E-319)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            java.lang.String r11 = "messages"
            if (r10 < 0) goto L_0x009a
            com.google.android.gms.measurement.internal.zzgi r10 = r13.zzs     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            com.google.android.gms.measurement.internal.zzey r10 = r10.zzaz()     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            com.google.android.gms.measurement.internal.zzew r10 = r10.zzd()     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            java.lang.String r12 = "Data loss, local db full"
            r10.zza(r12)     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            long r8 = r8 - r6
            r6 = 1
            long r8 = r8 + r6
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            java.lang.String r6 = java.lang.Long.toString(r8)     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            r14[r2] = r6     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            java.lang.String r2 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r14 = r4.delete(r11, r2, r14)     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            long r6 = (long) r14     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x009a
            com.google.android.gms.measurement.internal.zzgi r14 = r13.zzs     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            com.google.android.gms.measurement.internal.zzey r14 = r14.zzaz()     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            com.google.android.gms.measurement.internal.zzew r14 = r14.zzd()     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            java.lang.String r2 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r10 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            java.lang.Long r12 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            long r8 = r8 - r6
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            r14.zzd(r2, r10, r12, r6)     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
        L_0x009a:
            r4.insertOrThrow(r11, r3, r0)     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            r4.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            r4.endTransaction()     // Catch:{ SQLiteFullException -> 0x004d, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004b, all -> 0x0049 }
            if (r5 == 0) goto L_0x00a8
            r5.close()
        L_0x00a8:
            r4.close()
            r14 = 1
            return r14
        L_0x00ad:
            r3 = r5
            goto L_0x0128
        L_0x00b0:
            r3 = r5
            goto L_0x00ba
        L_0x00b2:
            r3 = r5
            goto L_0x00ed
        L_0x00b4:
            r3 = r5
            goto L_0x0100
        L_0x00b6:
            r14 = move-exception
            goto L_0x0128
        L_0x00b9:
            r14 = move-exception
        L_0x00ba:
            r2 = r3
            r3 = r4
            goto L_0x00c5
        L_0x00bd:
            r14 = move-exception
            goto L_0x0100
        L_0x00bf:
            r14 = move-exception
            r4 = r3
            goto L_0x0128
        L_0x00c3:
            r14 = move-exception
            r2 = r3
        L_0x00c5:
            if (r3 == 0) goto L_0x00d0
            boolean r4 = r3.inTransaction()     // Catch:{ all -> 0x00ea }
            if (r4 == 0) goto L_0x00d0
            r3.endTransaction()     // Catch:{ all -> 0x00ea }
        L_0x00d0:
            com.google.android.gms.measurement.internal.zzgi r4 = r13.zzs     // Catch:{ all -> 0x00ea }
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzaz()     // Catch:{ all -> 0x00ea }
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzd()     // Catch:{ all -> 0x00ea }
            java.lang.String r5 = "Error writing entry to local database"
            r4.zzb(r5, r14)     // Catch:{ all -> 0x00ea }
            r14 = 1
            r13.zzb = r14     // Catch:{ all -> 0x00ea }
            if (r2 == 0) goto L_0x00e7
            r2.close()
        L_0x00e7:
            if (r3 == 0) goto L_0x011d
            goto L_0x011a
        L_0x00ea:
            r14 = move-exception
            goto L_0x0126
        L_0x00ec:
            r4 = r3
        L_0x00ed:
            long r5 = (long) r15
            android.os.SystemClock.sleep(r5)     // Catch:{ all -> 0x00b6 }
            int r15 = r15 + 20
            if (r3 == 0) goto L_0x00f8
            r3.close()
        L_0x00f8:
            if (r4 == 0) goto L_0x011d
            r4.close()
            goto L_0x011d
        L_0x00fe:
            r14 = move-exception
            r4 = r3
        L_0x0100:
            com.google.android.gms.measurement.internal.zzgi r2 = r13.zzs     // Catch:{ all -> 0x0123 }
            com.google.android.gms.measurement.internal.zzey r2 = r2.zzaz()     // Catch:{ all -> 0x0123 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzd()     // Catch:{ all -> 0x0123 }
            java.lang.String r5 = "Error writing entry; local database full"
            r2.zzb(r5, r14)     // Catch:{ all -> 0x0123 }
            r14 = 1
            r13.zzb = r14     // Catch:{ all -> 0x0123 }
            if (r3 == 0) goto L_0x0117
            r3.close()
        L_0x0117:
            if (r4 == 0) goto L_0x011d
            r3 = r4
        L_0x011a:
            r3.close()
        L_0x011d:
            int r1 = r1 + 1
            r2 = 0
            r14 = 5
            goto L_0x0024
        L_0x0123:
            r14 = move-exception
            r2 = r3
            r3 = r4
        L_0x0126:
            r4 = r3
            r3 = r2
        L_0x0128:
            if (r3 == 0) goto L_0x012d
            r3.close()
        L_0x012d:
            if (r4 == 0) goto L_0x0132
            r4.close()
        L_0x0132:
            throw r14
        L_0x0133:
            com.google.android.gms.measurement.internal.zzgi r14 = r13.zzs
            java.lang.String r15 = "Failed to write entry to local database"
            androidx.activity.result.d.g(r14, r15)
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzer.zzq(int, byte[]):boolean");
    }

    public final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    public final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:59|60|61|62) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:74|75|76|77) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:46|47|48|49|196) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1.zzs.zzaz().zzd().zza("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r1.zzs.zzaz().zzd().zza("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r12.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r1.zzs.zzaz().zzd().zza("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r12.recycle();
        r0 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x012c */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01d8 A[SYNTHETIC, Splitter:B:123:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01fc A[SYNTHETIC, Splitter:B:149:0x01fc] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x01db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0248 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0248 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0248 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzi(int r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "rowid"
            java.lang.String r3 = "Error reading entries from local database"
            r22.zzg()
            boolean r0 = r1.zzb
            r4 = 0
            if (r0 == 0) goto L_0x000f
            return r4
        L_0x000f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r0 = r22.zzl()
            if (r0 == 0) goto L_0x0262
            r6 = 5
            r7 = 0
            r9 = r6
            r8 = r7
        L_0x001e:
            if (r8 >= r6) goto L_0x025a
            r10 = 1
            android.database.sqlite.SQLiteDatabase r15 = r22.zzh()     // Catch:{ SQLiteFullException -> 0x022c, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x01f7, all -> 0x01f4 }
            if (r15 != 0) goto L_0x002a
            r1.zzb = r10     // Catch:{ SQLiteFullException -> 0x01ef, SQLiteDatabaseLockedException -> 0x01eb, SQLiteException -> 0x01e6, all -> 0x01e3 }
            return r4
        L_0x002a:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01ef, SQLiteDatabaseLockedException -> 0x01eb, SQLiteException -> 0x01e6, all -> 0x01e3 }
            java.lang.String r0 = "3"
            java.lang.String r12 = "messages"
            java.lang.String[] r13 = new java.lang.String[]{r2}     // Catch:{ all -> 0x01d3 }
            java.lang.String r14 = "type=?"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x01d3 }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid desc"
            java.lang.String r19 = "1"
            r11 = r15
            r23 = r15
            r15 = r0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01cf }
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x01cb }
            r20 = -1
            if (r0 == 0) goto L_0x005b
            long r12 = r11.getLong(r7)     // Catch:{ all -> 0x01cb }
            r11.close()     // Catch:{ SQLiteFullException -> 0x01c7, SQLiteDatabaseLockedException -> 0x01c4, SQLiteException -> 0x01c0, all -> 0x01bb }
            goto L_0x0060
        L_0x005b:
            r11.close()     // Catch:{ SQLiteFullException -> 0x01c7, SQLiteDatabaseLockedException -> 0x01c4, SQLiteException -> 0x01c0, all -> 0x01bb }
            r12 = r20
        L_0x0060:
            int r0 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01c7, SQLiteDatabaseLockedException -> 0x01c4, SQLiteException -> 0x01c0, all -> 0x01bb }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteFullException -> 0x01c7, SQLiteDatabaseLockedException -> 0x01c4, SQLiteException -> 0x01c0, all -> 0x01bb }
            r11[r7] = r12     // Catch:{ SQLiteFullException -> 0x01c7, SQLiteDatabaseLockedException -> 0x01c4, SQLiteException -> 0x01c0, all -> 0x01bb }
            r14 = r0
            r15 = r11
            goto L_0x0073
        L_0x0071:
            r14 = r4
            r15 = r14
        L_0x0073:
            java.lang.String r0 = "type"
            java.lang.String r11 = "entry"
            java.lang.String[] r13 = new java.lang.String[]{r2, r0, r11}     // Catch:{ SQLiteFullException -> 0x01c7, SQLiteDatabaseLockedException -> 0x01c4, SQLiteException -> 0x01c0, all -> 0x01bb }
            java.lang.String r12 = "messages"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid asc"
            r0 = 100
            java.lang.String r19 = java.lang.Integer.toString(r0)     // Catch:{ SQLiteFullException -> 0x01c7, SQLiteDatabaseLockedException -> 0x01c4, SQLiteException -> 0x01c0, all -> 0x01bb }
            r11 = r23
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteFullException -> 0x01c7, SQLiteDatabaseLockedException -> 0x01c4, SQLiteException -> 0x01c0, all -> 0x01bb }
        L_0x008f:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            if (r0 == 0) goto L_0x016f
            long r20 = r11.getLong(r7)     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            int r0 = r11.getInt(r10)     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            r12 = 2
            byte[] r13 = r11.getBlob(r12)     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            if (r0 != 0) goto L_0x00d9
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            int r0 = r13.length     // Catch:{ ParseException -> 0x00c2 }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x00c2 }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x00c2 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzav> r0 = com.google.android.gms.measurement.internal.zzav.CREATOR     // Catch:{ ParseException -> 0x00c2 }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x00c2 }
            com.google.android.gms.measurement.internal.zzav r0 = (com.google.android.gms.measurement.internal.zzav) r0     // Catch:{ ParseException -> 0x00c2 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            if (r0 == 0) goto L_0x008f
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            goto L_0x008f
        L_0x00c0:
            r0 = move-exception
            goto L_0x00d5
        L_0x00c2:
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs     // Catch:{ all -> 0x00c0 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ all -> 0x00c0 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzd()     // Catch:{ all -> 0x00c0 }
            java.lang.String r13 = "Failed to load event from local database"
            r0.zza(r13)     // Catch:{ all -> 0x00c0 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            goto L_0x008f
        L_0x00d5:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            throw r0     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
        L_0x00d9:
            if (r0 != r10) goto L_0x0111
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            int r0 = r13.length     // Catch:{ ParseException -> 0x00f4 }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x00f4 }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x00f4 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzll> r0 = com.google.android.gms.measurement.internal.zzll.CREATOR     // Catch:{ ParseException -> 0x00f4 }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x00f4 }
            com.google.android.gms.measurement.internal.zzll r0 = (com.google.android.gms.measurement.internal.zzll) r0     // Catch:{ ParseException -> 0x00f4 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            goto L_0x0107
        L_0x00f2:
            r0 = move-exception
            goto L_0x010d
        L_0x00f4:
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzd()     // Catch:{ all -> 0x00f2 }
            java.lang.String r13 = "Failed to load user property from local database"
            r0.zza(r13)     // Catch:{ all -> 0x00f2 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            r0 = r4
        L_0x0107:
            if (r0 == 0) goto L_0x008f
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            goto L_0x008f
        L_0x010d:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            throw r0     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
        L_0x0111:
            if (r0 != r12) goto L_0x014a
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            int r0 = r13.length     // Catch:{ ParseException -> 0x012c }
            r12.unmarshall(r13, r7, r0)     // Catch:{ ParseException -> 0x012c }
            r12.setDataPosition(r7)     // Catch:{ ParseException -> 0x012c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzab> r0 = com.google.android.gms.measurement.internal.zzab.CREATOR     // Catch:{ ParseException -> 0x012c }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ ParseException -> 0x012c }
            com.google.android.gms.measurement.internal.zzab r0 = (com.google.android.gms.measurement.internal.zzab) r0     // Catch:{ ParseException -> 0x012c }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            goto L_0x013f
        L_0x012a:
            r0 = move-exception
            goto L_0x0146
        L_0x012c:
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs     // Catch:{ all -> 0x012a }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ all -> 0x012a }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzd()     // Catch:{ all -> 0x012a }
            java.lang.String r13 = "Failed to load conditional user property from local database"
            r0.zza(r13)     // Catch:{ all -> 0x012a }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            r0 = r4
        L_0x013f:
            if (r0 == 0) goto L_0x008f
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            goto L_0x008f
        L_0x0146:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            throw r0     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
        L_0x014a:
            r12 = 3
            if (r0 != r12) goto L_0x015e
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzk()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            java.lang.String r12 = "Skipping app launch break"
            r0.zza(r12)     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            goto L_0x008f
        L_0x015e:
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzd()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            java.lang.String r12 = "Unknown record type in local database"
            r0.zza(r12)     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            goto L_0x008f
        L_0x016f:
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            java.lang.String r12 = java.lang.Long.toString(r20)     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            r0[r7] = r12     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0, all -> 0x01aa }
            java.lang.String r12 = "messages"
            java.lang.String r13 = "rowid <= ?"
            r14 = r23
            int r0 = r14.delete(r12, r13, r0)     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ed, SQLiteException -> 0x01a5, all -> 0x01a3 }
            int r12 = r5.size()     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ed, SQLiteException -> 0x01a5, all -> 0x01a3 }
            if (r0 >= r12) goto L_0x0196
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ed, SQLiteException -> 0x01a5, all -> 0x01a3 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ed, SQLiteException -> 0x01a5, all -> 0x01a3 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzd()     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ed, SQLiteException -> 0x01a5, all -> 0x01a3 }
            java.lang.String r12 = "Fewer entries removed from local database than expected"
            r0.zza(r12)     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ed, SQLiteException -> 0x01a5, all -> 0x01a3 }
        L_0x0196:
            r14.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ed, SQLiteException -> 0x01a5, all -> 0x01a3 }
            r14.endTransaction()     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ed, SQLiteException -> 0x01a5, all -> 0x01a3 }
            r11.close()
            r14.close()
            return r5
        L_0x01a3:
            r0 = move-exception
            goto L_0x01ad
        L_0x01a5:
            r0 = move-exception
            goto L_0x01e9
        L_0x01a7:
            r0 = move-exception
            goto L_0x01f2
        L_0x01aa:
            r0 = move-exception
            r14 = r23
        L_0x01ad:
            r4 = r11
            goto L_0x024f
        L_0x01b0:
            r0 = move-exception
            r14 = r23
            goto L_0x01e9
        L_0x01b4:
            r14 = r23
            goto L_0x01ed
        L_0x01b7:
            r0 = move-exception
            r14 = r23
            goto L_0x01f2
        L_0x01bb:
            r0 = move-exception
            r14 = r23
            goto L_0x024f
        L_0x01c0:
            r0 = move-exception
            r14 = r23
            goto L_0x01e8
        L_0x01c4:
            r14 = r23
            goto L_0x01ec
        L_0x01c7:
            r0 = move-exception
            r14 = r23
            goto L_0x01f1
        L_0x01cb:
            r0 = move-exception
            r14 = r23
            goto L_0x01d6
        L_0x01cf:
            r0 = move-exception
            r14 = r23
            goto L_0x01d5
        L_0x01d3:
            r0 = move-exception
            r14 = r15
        L_0x01d5:
            r11 = r4
        L_0x01d6:
            if (r11 == 0) goto L_0x01db
            r11.close()     // Catch:{ SQLiteFullException -> 0x01e1, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x01df, all -> 0x01dc }
        L_0x01db:
            throw r0     // Catch:{ SQLiteFullException -> 0x01e1, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x01df, all -> 0x01dc }
        L_0x01dc:
            r0 = move-exception
            goto L_0x024f
        L_0x01df:
            r0 = move-exception
            goto L_0x01e8
        L_0x01e1:
            r0 = move-exception
            goto L_0x01f1
        L_0x01e3:
            r0 = move-exception
            goto L_0x024e
        L_0x01e6:
            r0 = move-exception
            r14 = r15
        L_0x01e8:
            r11 = r4
        L_0x01e9:
            r15 = r14
            goto L_0x01fa
        L_0x01eb:
            r14 = r15
        L_0x01ec:
            r11 = r4
        L_0x01ed:
            r15 = r14
            goto L_0x021e
        L_0x01ef:
            r0 = move-exception
            r14 = r15
        L_0x01f1:
            r11 = r4
        L_0x01f2:
            r15 = r14
            goto L_0x022f
        L_0x01f4:
            r0 = move-exception
            r14 = r4
            goto L_0x024f
        L_0x01f7:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x01fa:
            if (r15 == 0) goto L_0x0205
            boolean r12 = r15.inTransaction()     // Catch:{ all -> 0x024c }
            if (r12 == 0) goto L_0x0205
            r15.endTransaction()     // Catch:{ all -> 0x024c }
        L_0x0205:
            com.google.android.gms.measurement.internal.zzgi r12 = r1.zzs     // Catch:{ all -> 0x024c }
            com.google.android.gms.measurement.internal.zzey r12 = r12.zzaz()     // Catch:{ all -> 0x024c }
            com.google.android.gms.measurement.internal.zzew r12 = r12.zzd()     // Catch:{ all -> 0x024c }
            r12.zzb(r3, r0)     // Catch:{ all -> 0x024c }
            r1.zzb = r10     // Catch:{ all -> 0x024c }
            if (r11 == 0) goto L_0x0219
            r11.close()
        L_0x0219:
            if (r15 == 0) goto L_0x0248
            goto L_0x0245
        L_0x021c:
            r11 = r4
            r15 = r11
        L_0x021e:
            long r12 = (long) r9
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x024c }
            int r9 = r9 + 20
            if (r11 == 0) goto L_0x0229
            r11.close()
        L_0x0229:
            if (r15 == 0) goto L_0x0248
            goto L_0x0245
        L_0x022c:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x022f:
            com.google.android.gms.measurement.internal.zzgi r12 = r1.zzs     // Catch:{ all -> 0x024c }
            com.google.android.gms.measurement.internal.zzey r12 = r12.zzaz()     // Catch:{ all -> 0x024c }
            com.google.android.gms.measurement.internal.zzew r12 = r12.zzd()     // Catch:{ all -> 0x024c }
            r12.zzb(r3, r0)     // Catch:{ all -> 0x024c }
            r1.zzb = r10     // Catch:{ all -> 0x024c }
            if (r11 == 0) goto L_0x0243
            r11.close()
        L_0x0243:
            if (r15 == 0) goto L_0x0248
        L_0x0245:
            r15.close()
        L_0x0248:
            int r8 = r8 + 1
            goto L_0x001e
        L_0x024c:
            r0 = move-exception
            r4 = r11
        L_0x024e:
            r14 = r15
        L_0x024f:
            if (r4 == 0) goto L_0x0254
            r4.close()
        L_0x0254:
            if (r14 == 0) goto L_0x0259
            r14.close()
        L_0x0259:
            throw r0
        L_0x025a:
            com.google.android.gms.measurement.internal.zzgi r0 = r1.zzs
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            android.support.v4.media.a.g(r0, r2)
            return r4
        L_0x0262:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzer.zzi(int):java.util.List");
    }

    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh != null && (delete = zzh.delete("messages", (String) null, (String[]) null)) > 0) {
                this.zzs.zzaz().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            this.zzs.zzaz().zzd().zzb("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    public final boolean zzl() {
        Context zzav = this.zzs.zzav();
        this.zzs.zzf();
        return zzav.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean zzm() {
        zzg();
        if (!this.zzb && zzl()) {
            int i = 5;
            int i10 = 0;
            while (i10 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase zzh = zzh();
                    if (zzh == null) {
                        this.zzb = true;
                        return false;
                    }
                    zzh.beginTransaction();
                    zzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    zzh.setTransactionSuccessful();
                    zzh.endTransaction();
                    zzh.close();
                    return true;
                } catch (SQLiteFullException e10) {
                    this.zzs.zzaz().zzd().zzb("Error deleting app launch break from local database", e10);
                    this.zzb = true;
                    if (sQLiteDatabase == null) {
                        i10++;
                    }
                    sQLiteDatabase.close();
                    i10++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i);
                    i += 20;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i10++;
                    } else {
                        i10++;
                    }
                } catch (SQLiteException e11) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    this.zzs.zzaz().zzd().zzb("Error deleting app launch break from local database", e11);
                    this.zzb = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i10++;
                    } else {
                        i10++;
                    }
                } catch (Throwable th2) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th2;
                }
            }
            a.g(this.zzs, "Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzab zzab) {
        byte[] zzao = this.zzs.zzv().zzao(zzab);
        if (zzao.length <= 131072) {
            return zzq(2, zzao);
        }
        this.zzs.zzaz().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzav zzav) {
        Parcel obtain = Parcel.obtain();
        zzaw.zza(zzav, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(0, marshall);
        }
        this.zzs.zzaz().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzll zzll) {
        Parcel obtain = Parcel.obtain();
        zzlm.zza(zzll, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(1, marshall);
        }
        this.zzs.zzaz().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
