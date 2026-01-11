package c3;

import a.b;
import a8.a;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import c3.c;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class m extends SQLiteOpenHelper {

    /* renamed from: s  reason: collision with root package name */
    public static final Map<String, m> f3185s = new HashMap();

    /* renamed from: t  reason: collision with root package name */
    public static final b f3186t = b.f3b;

    /* renamed from: a  reason: collision with root package name */
    public File f3187a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3188b = true;

    /* renamed from: c  reason: collision with root package name */
    public n f3189c;

    public m(Context context, String str) {
        super(context, t(str), (SQLiteDatabase.CursorFactory) null, 3);
        this.f3187a = context.getDatabasePath(t(str));
        t.d(str);
    }

    public static void c(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (t.c(message) || !message.startsWith("Cursor window allocation of")) {
            throw runtimeException;
        }
        throw new l(message);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.String, c3.m>, java.util.HashMap] */
    public static synchronized m s(Context context, String str) {
        m mVar;
        synchronized (m.class) {
            String d10 = t.d(str);
            ? r12 = f3185s;
            mVar = (m) r12.get(d10);
            if (mVar == null) {
                mVar = new m(context.getApplicationContext(), d10);
                r12.put(d10, mVar);
            }
        }
        return mVar;
    }

    public static String t(String str) {
        return (t.c(str) || str.equals("$default_instance")) ? "com.amplitude.api" : a.c("com.amplitude.api_", str);
    }

    public final synchronized void A0(long j10) {
        B0("events", j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        if (r14 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0126, code lost:
        if (r14 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc A[Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c, all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0131 A[SYNTHETIC, Splitter:B:58:0x0131] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:45:0x00d2=Splitter:B:45:0x00d2, B:39:0x00b7=Splitter:B:39:0x00b7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<org.json.JSONObject> B(java.lang.String r20, long r21, long r23) throws org.json.JSONException {
        /*
            r19 = this;
            r1 = r19
            r2 = r21
            r4 = r23
            monitor-enter(r19)
            java.util.LinkedList r11 = new java.util.LinkedList     // Catch:{ all -> 0x0138 }
            r11.<init>()     // Catch:{ all -> 0x0138 }
            r12 = 0
            r13 = 1
            r14 = 0
            android.database.sqlite.SQLiteDatabase r0 = r19.getReadableDatabase()     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
            java.lang.String r6 = "id"
            java.lang.String r7 = "event"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0034
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
            r9.<init>()     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
            java.lang.String r10 = "id <= "
            r9.append(r10)     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
            r9.append(r2)     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
            java.lang.String r2 = r9.toString()     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
            r9 = r2
            goto L_0x0035
        L_0x0034:
            r9 = r14
        L_0x0035:
            r10 = 0
            r15 = 0
            r16 = 0
            java.lang.String r17 = "id ASC"
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
            java.lang.String r3 = ""
            r2.append(r3)     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
            r2.append(r4)     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
            java.lang.String r2 = r2.toString()     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
            r18 = r2
            goto L_0x0055
        L_0x0053:
            r18 = r14
        L_0x0055:
            r2 = r0
            r3 = r20
            r4 = r6
            r5 = r9
            r6 = r10
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00fd, StackOverflowError -> 0x00d1, IllegalStateException -> 0x00b6, RuntimeException -> 0x009c }
        L_0x0066:
            boolean r0 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0093, IllegalStateException -> 0x0090, RuntimeException -> 0x008e }
            if (r0 == 0) goto L_0x0089
            long r3 = r2.getLong(r12)     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0093, IllegalStateException -> 0x0090, RuntimeException -> 0x008e }
            java.lang.String r0 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0093, IllegalStateException -> 0x0090, RuntimeException -> 0x008e }
            boolean r5 = c3.t.c(r0)     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0093, IllegalStateException -> 0x0090, RuntimeException -> 0x008e }
            if (r5 == 0) goto L_0x007b
            goto L_0x0066
        L_0x007b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0093, IllegalStateException -> 0x0090, RuntimeException -> 0x008e }
            r5.<init>(r0)     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0093, IllegalStateException -> 0x0090, RuntimeException -> 0x008e }
            java.lang.String r0 = "event_id"
            r5.put(r0, r3)     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0093, IllegalStateException -> 0x0090, RuntimeException -> 0x008e }
            r11.add(r5)     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0093, IllegalStateException -> 0x0090, RuntimeException -> 0x008e }
            goto L_0x0066
        L_0x0089:
            r2.close()     // Catch:{ all -> 0x0138 }
            goto L_0x0129
        L_0x008e:
            r0 = move-exception
            goto L_0x009e
        L_0x0090:
            r0 = move-exception
            r14 = r2
            goto L_0x00b7
        L_0x0093:
            r0 = move-exception
            r14 = r2
            goto L_0x00d2
        L_0x0096:
            r0 = move-exception
            r14 = r2
            goto L_0x00fe
        L_0x0099:
            r0 = move-exception
            goto L_0x012e
        L_0x009c:
            r0 = move-exception
            r2 = r14
        L_0x009e:
            c3.p r3 = c3.p.a()     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x00b3 }
            r5[r12] = r20     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x00b3 }
            r3.b(r4, r0)     // Catch:{ all -> 0x00b3 }
            c(r0)     // Catch:{ all -> 0x00b3 }
            throw r14     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r0 = move-exception
            goto L_0x012f
        L_0x00b6:
            r0 = move-exception
        L_0x00b7:
            c3.p r2 = c3.p.a()     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x0099 }
            r4[r12] = r20     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0099 }
            r2.b(r3, r0)     // Catch:{ all -> 0x0099 }
            r1.b0(r0)     // Catch:{ all -> 0x0099 }
            if (r14 == 0) goto L_0x0129
        L_0x00cd:
            r14.close()     // Catch:{ all -> 0x0138 }
            goto L_0x0129
        L_0x00d1:
            r0 = move-exception
        L_0x00d2:
            a.b r2 = f3186t     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r4 = "getEvents from %s failed"
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x0099 }
            r5[r12] = r20     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x0099 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x0099 }
            android.util.Log.e(r3, r4, r0)     // Catch:{ all -> 0x0099 }
            c3.p r2 = c3.p.a()     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x0099 }
            r4[r12] = r20     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0099 }
            r2.b(r3, r0)     // Catch:{ all -> 0x0099 }
            r19.e()     // Catch:{ all -> 0x0099 }
            if (r14 == 0) goto L_0x0129
            goto L_0x00cd
        L_0x00fd:
            r0 = move-exception
        L_0x00fe:
            a.b r2 = f3186t     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r4 = "getEvents from %s failed"
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x0099 }
            r5[r12] = r20     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x0099 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x0099 }
            android.util.Log.e(r3, r4, r0)     // Catch:{ all -> 0x0099 }
            c3.p r2 = c3.p.a()     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x0099 }
            r4[r12] = r20     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0099 }
            r2.b(r3, r0)     // Catch:{ all -> 0x0099 }
            r19.e()     // Catch:{ all -> 0x0099 }
            if (r14 == 0) goto L_0x0129
            goto L_0x00cd
        L_0x0129:
            r19.close()     // Catch:{ all -> 0x0138 }
            monitor-exit(r19)
            return r11
        L_0x012e:
            r2 = r14
        L_0x012f:
            if (r2 == 0) goto L_0x0134
            r2.close()     // Catch:{ all -> 0x0138 }
        L_0x0134:
            r19.close()     // Catch:{ all -> 0x0138 }
            throw r0     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.m.B(java.lang.String, long, long):java.util.List");
    }

    public final synchronized void B0(String str, long j10) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.delete(str, "id <= " + j10, (String[]) null);
        } catch (SQLiteException e10) {
            b bVar = f3186t;
            String format = String.format("removeEvents from %s failed", new Object[]{str});
            Objects.requireNonNull(bVar);
            Log.e("com.amplitude.api.DatabaseHelper", format, e10);
            p.a().b(String.format("DB: Failed to removeEvents from table %s", new Object[]{str}), e10);
            e();
        } catch (StackOverflowError e11) {
            try {
                b bVar2 = f3186t;
                String format2 = String.format("removeEvents from %s failed", new Object[]{str});
                Objects.requireNonNull(bVar2);
                Log.e("com.amplitude.api.DatabaseHelper", format2, e11);
                p.a().b(String.format("DB: Failed to removeEvents from table %s", new Object[]{str}), e11);
                e();
            } catch (Throwable th2) {
                close();
                throw th2;
            }
        }
        close();
    }

    public final synchronized void C0(long j10) {
        z0("identifys", j10);
    }

    public final synchronized void D0(long j10) {
        B0("identifys", j10);
    }

    public final synchronized Long E(String str) {
        return (Long) a0("long_store", str);
    }

    public final void E0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        if (r4 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r4 == null) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long O(java.lang.String r10, long r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = -1
            r2 = 0
            r3 = 1
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r9.getReadableDatabase()     // Catch:{ SQLiteException -> 0x006e, StackOverflowError -> 0x0042 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x006e, StackOverflowError -> 0x0042 }
            r6.<init>()     // Catch:{ SQLiteException -> 0x006e, StackOverflowError -> 0x0042 }
            java.lang.String r7 = "SELECT id FROM "
            r6.append(r7)     // Catch:{ SQLiteException -> 0x006e, StackOverflowError -> 0x0042 }
            r6.append(r10)     // Catch:{ SQLiteException -> 0x006e, StackOverflowError -> 0x0042 }
            java.lang.String r7 = " LIMIT 1 OFFSET "
            r6.append(r7)     // Catch:{ SQLiteException -> 0x006e, StackOverflowError -> 0x0042 }
            r7 = 1
            long r11 = r11 - r7
            r6.append(r11)     // Catch:{ SQLiteException -> 0x006e, StackOverflowError -> 0x0042 }
            java.lang.String r11 = r6.toString()     // Catch:{ SQLiteException -> 0x006e, StackOverflowError -> 0x0042 }
            android.database.sqlite.SQLiteStatement r4 = r5.compileStatement(r11)     // Catch:{ SQLiteException -> 0x006e, StackOverflowError -> 0x0042 }
            long r0 = r4.simpleQueryForLong()     // Catch:{ SQLiteDoneException -> 0x002f }
            goto L_0x003a
        L_0x002f:
            r11 = move-exception
            a.b r12 = f3186t     // Catch:{ SQLiteException -> 0x006e, StackOverflowError -> 0x0042 }
            java.lang.String r5 = "com.amplitude.api.DatabaseHelper"
            java.util.Objects.requireNonNull(r12)     // Catch:{ SQLiteException -> 0x006e, StackOverflowError -> 0x0042 }
            android.util.Log.w(r5, r11)     // Catch:{ SQLiteException -> 0x006e, StackOverflowError -> 0x0042 }
        L_0x003a:
            if (r4 == 0) goto L_0x009a
        L_0x003c:
            r4.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x009a
        L_0x0040:
            r10 = move-exception
            goto L_0x009f
        L_0x0042:
            r11 = move-exception
            a.b r12 = f3186t     // Catch:{ all -> 0x0040 }
            java.lang.String r5 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r6 = "getNthEventId from %s failed"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0040 }
            r7[r2] = r10     // Catch:{ all -> 0x0040 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x0040 }
            java.util.Objects.requireNonNull(r12)     // Catch:{ all -> 0x0040 }
            android.util.Log.e(r5, r6, r11)     // Catch:{ all -> 0x0040 }
            c3.p r12 = c3.p.a()     // Catch:{ all -> 0x0040 }
            java.lang.String r5 = "DB: Failed to getNthEventId from table %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0040 }
            r3[r2] = r10     // Catch:{ all -> 0x0040 }
            java.lang.String r10 = java.lang.String.format(r5, r3)     // Catch:{ all -> 0x0040 }
            r12.b(r10, r11)     // Catch:{ all -> 0x0040 }
            r9.e()     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x009a
            goto L_0x003c
        L_0x006e:
            r11 = move-exception
            a.b r12 = f3186t     // Catch:{ all -> 0x0040 }
            java.lang.String r5 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r6 = "getNthEventId from %s failed"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0040 }
            r7[r2] = r10     // Catch:{ all -> 0x0040 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x0040 }
            java.util.Objects.requireNonNull(r12)     // Catch:{ all -> 0x0040 }
            android.util.Log.e(r5, r6, r11)     // Catch:{ all -> 0x0040 }
            c3.p r12 = c3.p.a()     // Catch:{ all -> 0x0040 }
            java.lang.String r5 = "DB: Failed to getNthEventId from table %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0040 }
            r3[r2] = r10     // Catch:{ all -> 0x0040 }
            java.lang.String r10 = java.lang.String.format(r5, r3)     // Catch:{ all -> 0x0040 }
            r12.b(r10, r11)     // Catch:{ all -> 0x0040 }
            r9.e()     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x009a
            goto L_0x003c
        L_0x009a:
            r9.close()     // Catch:{ all -> 0x00a8 }
            monitor-exit(r9)
            return r0
        L_0x009f:
            if (r4 == 0) goto L_0x00a4
            r4.close()     // Catch:{ all -> 0x00a8 }
        L_0x00a4:
            r9.close()     // Catch:{ all -> 0x00a8 }
            throw r10     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.m.O(java.lang.String, long):long");
    }

    public final synchronized long R(long j10) {
        return O("identifys", j10);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized long S() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.w()     // Catch:{ all -> 0x0013 }
            monitor-enter(r4)     // Catch:{ all -> 0x0013 }
            java.lang.String r2 = "identifys"
            long r2 = r4.y(r2)     // Catch:{ all -> 0x0010 }
            monitor-exit(r4)     // Catch:{ all -> 0x0013 }
            long r0 = r0 + r2
            monitor-exit(r4)
            return r0
        L_0x0010:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0013 }
            throw r0     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.m.S():long");
    }

    public final synchronized String T(String str) {
        return (String) a0("store", str);
    }

    public final synchronized long a(String str, String str2) {
        long j10;
        SQLiteException e10;
        StackOverflowError e11;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("event", str2);
            j10 = f0(writableDatabase, str, contentValues);
            if (j10 == -1) {
                try {
                    b bVar = f3186t;
                    String format = String.format("Insert into %s failed", new Object[]{str});
                    Objects.requireNonNull(bVar);
                    Log.w("com.amplitude.api.DatabaseHelper", format);
                } catch (SQLiteException e12) {
                    e10 = e12;
                } catch (StackOverflowError e13) {
                    e11 = e13;
                    try {
                        b bVar2 = f3186t;
                        String format2 = String.format("addEvent to %s failed", new Object[]{str});
                        Objects.requireNonNull(bVar2);
                        Log.e("com.amplitude.api.DatabaseHelper", format2, e11);
                        p.a().b(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e11);
                        e();
                        close();
                        return j10;
                    } catch (Throwable th2) {
                        close();
                        throw th2;
                    }
                }
            }
        } catch (SQLiteException e14) {
            e10 = e14;
            j10 = -1;
            b bVar3 = f3186t;
            String format3 = String.format("addEvent to %s failed", new Object[]{str});
            Objects.requireNonNull(bVar3);
            Log.e("com.amplitude.api.DatabaseHelper", format3, e10);
            p.a().b(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e10);
            e();
            close();
            return j10;
        } catch (StackOverflowError e15) {
            e11 = e15;
            j10 = -1;
            b bVar22 = f3186t;
            String format22 = String.format("addEvent to %s failed", new Object[]{str});
            Objects.requireNonNull(bVar22);
            Log.e("com.amplitude.api.DatabaseHelper", format22, e11);
            p.a().b(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e11);
            e();
            close();
            return j10;
        }
        close();
        return j10;
    }

    /* JADX WARNING: type inference failed for: r13v16, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r13v17, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d4, code lost:
        if (r3 != null) goto L_0x003b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a A[Catch:{ SQLiteException -> 0x00a9, StackOverflowError -> 0x007b, IllegalStateException -> 0x0062, RuntimeException -> 0x004b, all -> 0x0048, all -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8 A[Catch:{ SQLiteException -> 0x00a9, StackOverflowError -> 0x007b, IllegalStateException -> 0x0062, RuntimeException -> 0x004b, all -> 0x0048, all -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e1 A[SYNTHETIC, Splitter:B:45:0x00e1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Object a0(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r1 = 0
            r2 = 1
            android.database.sqlite.SQLiteDatabase r3 = r12.getReadableDatabase()     // Catch:{ SQLiteException -> 0x00a9, StackOverflowError -> 0x007b, IllegalStateException -> 0x0062, RuntimeException -> 0x004b, all -> 0x0048 }
            java.lang.String r4 = "key"
            java.lang.String r5 = "value"
            java.lang.String[] r5 = new java.lang.String[]{r4, r5}     // Catch:{ SQLiteException -> 0x00a9, StackOverflowError -> 0x007b, IllegalStateException -> 0x0062, RuntimeException -> 0x004b, all -> 0x0048 }
            java.lang.String r6 = "key = ?"
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00a9, StackOverflowError -> 0x007b, IllegalStateException -> 0x0062, RuntimeException -> 0x004b, all -> 0x0048 }
            r7[r1] = r14     // Catch:{ SQLiteException -> 0x00a9, StackOverflowError -> 0x007b, IllegalStateException -> 0x0062, RuntimeException -> 0x004b, all -> 0x0048 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r13
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00a9, StackOverflowError -> 0x007b, IllegalStateException -> 0x0062, RuntimeException -> 0x004b, all -> 0x0048 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0046, StackOverflowError -> 0x0044, IllegalStateException -> 0x0042, RuntimeException -> 0x0040 }
            if (r4 == 0) goto L_0x003b
            java.lang.String r4 = "store"
            boolean r4 = r13.equals(r4)     // Catch:{ SQLiteException -> 0x0046, StackOverflowError -> 0x0044, IllegalStateException -> 0x0042, RuntimeException -> 0x0040 }
            if (r4 == 0) goto L_0x0032
            java.lang.String r13 = r3.getString(r2)     // Catch:{ SQLiteException -> 0x0046, StackOverflowError -> 0x0044, IllegalStateException -> 0x0042, RuntimeException -> 0x0040 }
            goto L_0x003a
        L_0x0032:
            long r4 = r3.getLong(r2)     // Catch:{ SQLiteException -> 0x0046, StackOverflowError -> 0x0044, IllegalStateException -> 0x0042, RuntimeException -> 0x0040 }
            java.lang.Long r13 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x0046, StackOverflowError -> 0x0044, IllegalStateException -> 0x0042, RuntimeException -> 0x0040 }
        L_0x003a:
            r0 = r13
        L_0x003b:
            r3.close()     // Catch:{ all -> 0x00e8 }
            goto L_0x00d8
        L_0x0040:
            r13 = move-exception
            goto L_0x004d
        L_0x0042:
            r13 = move-exception
            goto L_0x0064
        L_0x0044:
            r4 = move-exception
            goto L_0x007e
        L_0x0046:
            r4 = move-exception
            goto L_0x00ac
        L_0x0048:
            r13 = move-exception
            goto L_0x00df
        L_0x004b:
            r13 = move-exception
            r3 = r0
        L_0x004d:
            c3.p r4 = c3.p.a()     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00dd }
            r2[r1] = r14     // Catch:{ all -> 0x00dd }
            java.lang.String r14 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00dd }
            r4.b(r14, r13)     // Catch:{ all -> 0x00dd }
            c(r13)     // Catch:{ all -> 0x00dd }
            throw r0     // Catch:{ all -> 0x00dd }
        L_0x0062:
            r13 = move-exception
            r3 = r0
        L_0x0064:
            c3.p r4 = c3.p.a()     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00dd }
            r2[r1] = r14     // Catch:{ all -> 0x00dd }
            java.lang.String r14 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00dd }
            r4.b(r14, r13)     // Catch:{ all -> 0x00dd }
            r12.b0(r13)     // Catch:{ all -> 0x00dd }
            if (r3 == 0) goto L_0x00d8
            goto L_0x003b
        L_0x007b:
            r3 = move-exception
            r4 = r3
            r3 = r0
        L_0x007e:
            a.b r5 = f3186t     // Catch:{ all -> 0x00dd }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r7 = "getValue from %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00dd }
            r8[r1] = r13     // Catch:{ all -> 0x00dd }
            java.lang.String r13 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00dd }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x00dd }
            android.util.Log.e(r6, r13, r4)     // Catch:{ all -> 0x00dd }
            c3.p r13 = c3.p.a()     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00dd }
            r2[r1] = r14     // Catch:{ all -> 0x00dd }
            java.lang.String r14 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00dd }
            r13.b(r14, r4)     // Catch:{ all -> 0x00dd }
            r12.e()     // Catch:{ all -> 0x00dd }
            if (r3 == 0) goto L_0x00d8
            goto L_0x003b
        L_0x00a9:
            r3 = move-exception
            r4 = r3
            r3 = r0
        L_0x00ac:
            a.b r5 = f3186t     // Catch:{ all -> 0x00dd }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r7 = "getValue from %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00dd }
            r8[r1] = r13     // Catch:{ all -> 0x00dd }
            java.lang.String r13 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00dd }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x00dd }
            android.util.Log.e(r6, r13, r4)     // Catch:{ all -> 0x00dd }
            c3.p r13 = c3.p.a()     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00dd }
            r2[r1] = r14     // Catch:{ all -> 0x00dd }
            java.lang.String r14 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00dd }
            r13.b(r14, r4)     // Catch:{ all -> 0x00dd }
            r12.e()     // Catch:{ all -> 0x00dd }
            if (r3 == 0) goto L_0x00d8
            goto L_0x003b
        L_0x00d8:
            r12.close()     // Catch:{ all -> 0x00e8 }
            monitor-exit(r12)
            return r0
        L_0x00dd:
            r13 = move-exception
            r0 = r3
        L_0x00df:
            if (r0 == 0) goto L_0x00e4
            r0.close()     // Catch:{ all -> 0x00e8 }
        L_0x00e4:
            r12.close()     // Catch:{ all -> 0x00e8 }
            throw r13     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.m.a0(java.lang.String, java.lang.String):java.lang.Object");
    }

    public final void b0(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (t.c(message) || !message.contains("Couldn't read") || !message.contains("CursorWindow")) {
            throw illegalStateException;
        }
        e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f2, code lost:
        if (r3.isOpen() != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f4, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011e, code lost:
        if (r3.isOpen() != false) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r10 = this;
            java.lang.String r0 = "DB: Failed to run databaseReset callback in delete"
            java.lang.String r1 = "databaseReset callback failed during delete"
            java.lang.String r2 = "com.amplitude.api.DatabaseHelper"
            r3 = 0
            r4 = 1
            r5 = 0
            r10.close()     // Catch:{ SecurityException -> 0x006c }
            java.io.File r6 = r10.f3187a     // Catch:{ SecurityException -> 0x006c }
            r6.delete()     // Catch:{ SecurityException -> 0x006c }
            c3.n r6 = r10.f3189c
            if (r6 == 0) goto L_0x00d6
            boolean r6 = r10.f3188b
            if (r6 == 0) goto L_0x00d6
            r10.f3188b = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0035 }
            c3.n r6 = r10.f3189c     // Catch:{ SQLiteException -> 0x0035 }
            c3.c$a r6 = (c3.c.a) r6     // Catch:{ SQLiteException -> 0x0035 }
            r6.a(r3)     // Catch:{ SQLiteException -> 0x0035 }
            r10.f3188b = r4
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00d6
        L_0x002e:
            r10.close()
            goto L_0x00d6
        L_0x0033:
            r0 = move-exception
            goto L_0x005c
        L_0x0035:
            r6 = move-exception
            a.b r7 = f3186t     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = java.lang.String.format(r1, r8)     // Catch:{ all -> 0x0033 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ all -> 0x0033 }
            android.util.Log.e(r2, r1, r6)     // Catch:{ all -> 0x0033 }
            c3.p r1 = c3.p.a()     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0033 }
            r1.b(r0, r6)     // Catch:{ all -> 0x0033 }
            r10.f3188b = r4
            if (r3 == 0) goto L_0x00d6
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00d6
            goto L_0x002e
        L_0x005c:
            r10.f3188b = r4
            if (r3 == 0) goto L_0x0069
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x0069
            r10.close()
        L_0x0069:
            throw r0
        L_0x006a:
            r6 = move-exception
            goto L_0x00d7
        L_0x006c:
            r6 = move-exception
            a.b r7 = f3186t     // Catch:{ all -> 0x006a }
            java.lang.String r8 = "delete failed"
            java.util.Objects.requireNonNull(r7)     // Catch:{ all -> 0x006a }
            android.util.Log.e(r2, r8, r6)     // Catch:{ all -> 0x006a }
            c3.p r6 = c3.p.a()     // Catch:{ all -> 0x006a }
            java.lang.String r7 = "DB: Failed to delete database"
            r6.b(r7, r3)     // Catch:{ all -> 0x006a }
            c3.n r6 = r10.f3189c
            if (r6 == 0) goto L_0x00d6
            boolean r6 = r10.f3188b
            if (r6 == 0) goto L_0x00d6
            r10.f3188b = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00a0 }
            c3.n r6 = r10.f3189c     // Catch:{ SQLiteException -> 0x00a0 }
            c3.c$a r6 = (c3.c.a) r6     // Catch:{ SQLiteException -> 0x00a0 }
            r6.a(r3)     // Catch:{ SQLiteException -> 0x00a0 }
            r10.f3188b = r4
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00d6
            goto L_0x002e
        L_0x009e:
            r0 = move-exception
            goto L_0x00c8
        L_0x00a0:
            r6 = move-exception
            a.b r7 = f3186t     // Catch:{ all -> 0x009e }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x009e }
            java.lang.String r1 = java.lang.String.format(r1, r8)     // Catch:{ all -> 0x009e }
            java.util.Objects.requireNonNull(r7)     // Catch:{ all -> 0x009e }
            android.util.Log.e(r2, r1, r6)     // Catch:{ all -> 0x009e }
            c3.p r1 = c3.p.a()     // Catch:{ all -> 0x009e }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x009e }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x009e }
            r1.b(r0, r6)     // Catch:{ all -> 0x009e }
            r10.f3188b = r4
            if (r3 == 0) goto L_0x00d6
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00d6
            goto L_0x002e
        L_0x00c8:
            r10.f3188b = r4
            if (r3 == 0) goto L_0x00d5
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x00d5
            r10.close()
        L_0x00d5:
            throw r0
        L_0x00d6:
            return
        L_0x00d7:
            c3.n r7 = r10.f3189c
            if (r7 == 0) goto L_0x012f
            boolean r7 = r10.f3188b
            if (r7 == 0) goto L_0x012f
            r10.f3188b = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00fa }
            c3.n r7 = r10.f3189c     // Catch:{ SQLiteException -> 0x00fa }
            c3.c$a r7 = (c3.c.a) r7     // Catch:{ SQLiteException -> 0x00fa }
            r7.a(r3)     // Catch:{ SQLiteException -> 0x00fa }
            r10.f3188b = r4
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x012f
        L_0x00f4:
            r10.close()
            goto L_0x012f
        L_0x00f8:
            r0 = move-exception
            goto L_0x0121
        L_0x00fa:
            r7 = move-exception
            a.b r8 = f3186t     // Catch:{ all -> 0x00f8 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = java.lang.String.format(r1, r9)     // Catch:{ all -> 0x00f8 }
            java.util.Objects.requireNonNull(r8)     // Catch:{ all -> 0x00f8 }
            android.util.Log.e(r2, r1, r7)     // Catch:{ all -> 0x00f8 }
            c3.p r1 = c3.p.a()     // Catch:{ all -> 0x00f8 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x00f8 }
            r1.b(r0, r7)     // Catch:{ all -> 0x00f8 }
            r10.f3188b = r4
            if (r3 == 0) goto L_0x012f
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x012f
            goto L_0x00f4
        L_0x0121:
            r10.f3188b = r4
            if (r3 == 0) goto L_0x012e
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x012e
            r10.close()
        L_0x012e:
            throw r0
        L_0x012f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.m.e():void");
    }

    public final synchronized long f(String str, String str2) {
        long j10;
        try {
            j10 = (long) getWritableDatabase().delete(str, "key=?", new String[]{str2});
            close();
        } catch (SQLiteException e10) {
            b bVar = f3186t;
            String format = String.format("deleteKey from %s failed", new Object[]{str});
            Objects.requireNonNull(bVar);
            Log.e("com.amplitude.api.DatabaseHelper", format, e10);
            p.a().b(String.format("DB: Failed to deleteKey: %s", new Object[]{str2}), e10);
            e();
            close();
            j10 = -1;
            return j10;
        } catch (StackOverflowError e11) {
            try {
                b bVar2 = f3186t;
                String format2 = String.format("deleteKey from %s failed", new Object[]{str});
                Objects.requireNonNull(bVar2);
                Log.e("com.amplitude.api.DatabaseHelper", format2, e11);
                p.a().b(String.format("DB: Failed to deleteKey: %s", new Object[]{str2}), e11);
                e();
                close();
                j10 = -1;
                return j10;
            } catch (Throwable th2) {
                close();
                throw th2;
            }
        }
        return j10;
    }

    public final synchronized long f0(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insert(str, (String) null, contentValues);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        n nVar = this.f3189c;
        if (nVar != null && this.f3188b) {
            try {
                this.f3188b = false;
                ((c.a) nVar).a(sQLiteDatabase);
            } catch (SQLiteException e10) {
                b bVar = f3186t;
                String format = String.format("databaseReset callback failed during onCreate", new Object[0]);
                Objects.requireNonNull(bVar);
                Log.e("com.amplitude.api.DatabaseHelper", format, e10);
                p.a().b(String.format("DB: Failed to run databaseReset callback during onCreate", new Object[0]), e10);
            } catch (Throwable th2) {
                this.f3188b = true;
                throw th2;
            }
            this.f3188b = true;
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        if (i > i10) {
            Objects.requireNonNull(f3186t);
            Log.e("com.amplitude.api.DatabaseHelper", "onUpgrade() with invalid oldVersion and newVersion");
            E0(sQLiteDatabase);
        } else if (i10 > 1) {
            if (i == 1) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
                if (i10 <= 2) {
                    return;
                }
            } else if (i != 2) {
                if (i != 3) {
                    Objects.requireNonNull(f3186t);
                    Log.e("com.amplitude.api.DatabaseHelper", "onUpgrade() with unknown oldVersion " + i);
                    E0(sQLiteDatabase);
                    return;
                }
                return;
            }
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        }
    }

    public final synchronized long p0(String str, Long l10) {
        long j10;
        if (l10 == null) {
            j10 = f("long_store", str);
        } else {
            j10 = x0("long_store", str, l10);
        }
        return j10;
    }

    public final synchronized long v0(String str, String str2) {
        long j10;
        if (str2 == null) {
            j10 = f("store", str);
        } else {
            j10 = x0("store", str, str2);
        }
        return j10;
    }

    public final synchronized long w() {
        return y("events");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized long w0(android.database.sqlite.SQLiteDatabase r3, java.lang.String r4, java.lang.String r5, java.lang.Object r6) throws android.database.sqlite.SQLiteException, java.lang.StackOverflowError {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "key"
            r0.put(r1, r5)     // Catch:{ all -> 0x003d }
            boolean r5 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x003d }
            if (r5 == 0) goto L_0x0017
            java.lang.String r5 = "value"
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x003d }
            r0.put(r5, r6)     // Catch:{ all -> 0x003d }
            goto L_0x001e
        L_0x0017:
            java.lang.String r5 = "value"
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x003d }
            r0.put(r5, r6)     // Catch:{ all -> 0x003d }
        L_0x001e:
            monitor-enter(r2)     // Catch:{ all -> 0x003d }
            r5 = 0
            r6 = 5
            long r3 = r3.insertWithOnConflict(r4, r5, r0, r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0038
            a.b r5 = f3186t     // Catch:{ all -> 0x003d }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r0 = "Insert failed"
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x003d }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x003d }
        L_0x0038:
            monitor-exit(r2)
            return r3
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            throw r3     // Catch:{ all -> 0x003d }
        L_0x003d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.m.w0(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.Object):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r2.isOpen() != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r2.isOpen() != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long x0(java.lang.String r8, java.lang.String r9, java.lang.Object r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.getWritableDatabase()     // Catch:{ SQLiteException -> 0x004d, StackOverflowError -> 0x001b }
            long r8 = r7.w0(r2, r8, r9, r10)     // Catch:{ SQLiteException -> 0x004d, StackOverflowError -> 0x001b }
            boolean r10 = r2.isOpen()     // Catch:{ all -> 0x0016 }
            if (r10 == 0) goto L_0x0083
            r7.close()     // Catch:{ all -> 0x0016 }
            goto L_0x0083
        L_0x0016:
            r8 = move-exception
            goto L_0x0091
        L_0x0019:
            r8 = move-exception
            goto L_0x0085
        L_0x001b:
            r10 = move-exception
            a.b r3 = f3186t     // Catch:{ all -> 0x0019 }
            java.lang.String r4 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r5 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0019 }
            r6[r0] = r8     // Catch:{ all -> 0x0019 }
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x0019 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0019 }
            android.util.Log.e(r4, r8, r10)     // Catch:{ all -> 0x0019 }
            c3.p r8 = c3.p.a()     // Catch:{ all -> 0x0019 }
            java.lang.String r3 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0019 }
            r1[r0] = r9     // Catch:{ all -> 0x0019 }
            java.lang.String r9 = java.lang.String.format(r3, r1)     // Catch:{ all -> 0x0019 }
            r8.b(r9, r10)     // Catch:{ all -> 0x0019 }
            r7.e()     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0081
            boolean r8 = r2.isOpen()     // Catch:{ all -> 0x0016 }
            if (r8 == 0) goto L_0x0081
            goto L_0x007e
        L_0x004d:
            r10 = move-exception
            a.b r3 = f3186t     // Catch:{ all -> 0x0019 }
            java.lang.String r4 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r5 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0019 }
            r6[r0] = r8     // Catch:{ all -> 0x0019 }
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x0019 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0019 }
            android.util.Log.e(r4, r8, r10)     // Catch:{ all -> 0x0019 }
            c3.p r8 = c3.p.a()     // Catch:{ all -> 0x0019 }
            java.lang.String r3 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0019 }
            r1[r0] = r9     // Catch:{ all -> 0x0019 }
            java.lang.String r9 = java.lang.String.format(r3, r1)     // Catch:{ all -> 0x0019 }
            r8.b(r9, r10)     // Catch:{ all -> 0x0019 }
            r7.e()     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0081
            boolean r8 = r2.isOpen()     // Catch:{ all -> 0x0016 }
            if (r8 == 0) goto L_0x0081
        L_0x007e:
            r7.close()     // Catch:{ all -> 0x0016 }
        L_0x0081:
            r8 = -1
        L_0x0083:
            monitor-exit(r7)
            return r8
        L_0x0085:
            if (r2 == 0) goto L_0x0090
            boolean r9 = r2.isOpen()     // Catch:{ all -> 0x0016 }
            if (r9 == 0) goto L_0x0090
            r7.close()     // Catch:{ all -> 0x0016 }
        L_0x0090:
            throw r8     // Catch:{ all -> 0x0016 }
        L_0x0091:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.m.x0(java.lang.String, java.lang.String, java.lang.Object):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0053, code lost:
        if (r2 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
        if (r2 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0088, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long y(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r8.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0059, StackOverflowError -> 0x002a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0059, StackOverflowError -> 0x002a }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0059, StackOverflowError -> 0x002a }
            java.lang.String r5 = "SELECT COUNT(*) FROM "
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0059, StackOverflowError -> 0x002a }
            r4.append(r9)     // Catch:{ SQLiteException -> 0x0059, StackOverflowError -> 0x002a }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0059, StackOverflowError -> 0x002a }
            android.database.sqlite.SQLiteStatement r2 = r3.compileStatement(r4)     // Catch:{ SQLiteException -> 0x0059, StackOverflowError -> 0x002a }
            long r0 = r2.simpleQueryForLong()     // Catch:{ SQLiteException -> 0x0059, StackOverflowError -> 0x002a }
            r2.close()     // Catch:{ all -> 0x0095 }
            r8.close()     // Catch:{ all -> 0x0095 }
            goto L_0x008a
        L_0x0028:
            r9 = move-exception
            goto L_0x008c
        L_0x002a:
            r3 = move-exception
            a.b r4 = f3186t     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r6 = "getNumberRows for %s failed"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x0028 }
            r7[r0] = r9     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x0028 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x0028 }
            android.util.Log.e(r5, r6, r3)     // Catch:{ all -> 0x0028 }
            c3.p r4 = c3.p.a()     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = "DB: Failed to getNumberRows for table %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0028 }
            r1[r0] = r9     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x0028 }
            r4.b(r9, r3)     // Catch:{ all -> 0x0028 }
            r8.e()     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0085
        L_0x0055:
            r2.close()     // Catch:{ all -> 0x0095 }
            goto L_0x0085
        L_0x0059:
            r3 = move-exception
            a.b r4 = f3186t     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r6 = "getNumberRows for %s failed"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x0028 }
            r7[r0] = r9     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x0028 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x0028 }
            android.util.Log.e(r5, r6, r3)     // Catch:{ all -> 0x0028 }
            c3.p r4 = c3.p.a()     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = "DB: Failed to getNumberRows for table %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0028 }
            r1[r0] = r9     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x0028 }
            r4.b(r9, r3)     // Catch:{ all -> 0x0028 }
            r8.e()     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0085
            goto L_0x0055
        L_0x0085:
            r8.close()     // Catch:{ all -> 0x0095 }
            r0 = 0
        L_0x008a:
            monitor-exit(r8)
            return r0
        L_0x008c:
            if (r2 == 0) goto L_0x0091
            r2.close()     // Catch:{ all -> 0x0095 }
        L_0x0091:
            r8.close()     // Catch:{ all -> 0x0095 }
            throw r9     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.m.y(java.lang.String):long");
    }

    public final synchronized void y0(long j10) {
        z0("events", j10);
    }

    public final synchronized void z0(String str, long j10) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.delete(str, "id = " + j10, (String[]) null);
        } catch (SQLiteException e10) {
            b bVar = f3186t;
            String format = String.format("removeEvent from %s failed", new Object[]{str});
            Objects.requireNonNull(bVar);
            Log.e("com.amplitude.api.DatabaseHelper", format, e10);
            p.a().b(String.format("DB: Failed to removeEvent from table %s", new Object[]{str}), e10);
            e();
        } catch (StackOverflowError e11) {
            try {
                b bVar2 = f3186t;
                String format2 = String.format("removeEvent from %s failed", new Object[]{str});
                Objects.requireNonNull(bVar2);
                Log.e("com.amplitude.api.DatabaseHelper", format2, e11);
                p.a().b(String.format("DB: Failed to removeEvent from table %s", new Object[]{str}), e11);
                e();
            } catch (Throwable th2) {
                close();
                throw th2;
            }
        }
        close();
    }
}
