package h1;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l1.e;

public final class u {

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f5765l = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Integer> f5766a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f5767b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Set<String>> f5768c;

    /* renamed from: d  reason: collision with root package name */
    public final e0 f5769d;

    /* renamed from: e  reason: collision with root package name */
    public AtomicBoolean f5770e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f5771f = false;
    public volatile e g;

    /* renamed from: h  reason: collision with root package name */
    public final b f5772h;
    public final p.b<c, d> i = new p.b<>();

    /* renamed from: j  reason: collision with root package name */
    public final Object f5773j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public a f5774k = new a();

    public class a implements Runnable {
        public a() {
        }

        /* JADX INFO: finally extract failed */
        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor o4 = u.this.f5769d.o(new b3.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", (Object) null));
            while (o4.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(o4.getInt(0)));
                } catch (Throwable th2) {
                    o4.close();
                    throw th2;
                }
            }
            o4.close();
            if (!hashSet.isEmpty()) {
                u.this.g.x();
            }
            return hashSet;
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                h1.u r0 = h1.u.this
                h1.e0 r0 = r0.f5769d
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.i
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r0.lock()
                r1 = 0
                r2 = 0
                r3 = 1
                h1.u r4 = h1.u.this     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                boolean r4 = r4.b()     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                if (r4 != 0) goto L_0x0021
                r0.unlock()
                h1.u r0 = h1.u.this
                java.util.Objects.requireNonNull(r0)
                return
            L_0x0021:
                h1.u r4 = h1.u.this     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f5770e     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                boolean r4 = r4.compareAndSet(r3, r1)     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                if (r4 != 0) goto L_0x0034
                r0.unlock()
                h1.u r0 = h1.u.this
                java.util.Objects.requireNonNull(r0)
                return
            L_0x0034:
                h1.u r4 = h1.u.this     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                h1.e0 r4 = r4.f5769d     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                boolean r4 = r4.j()     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                if (r4 == 0) goto L_0x0047
                r0.unlock()
                h1.u r0 = h1.u.this
                java.util.Objects.requireNonNull(r0)
                return
            L_0x0047:
                h1.u r4 = h1.u.this     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                h1.e0 r4 = r4.f5769d     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                l1.b r4 = r4.f5678d     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                l1.a r4 = r4.m0()     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                r4.c0()     // Catch:{ IllegalStateException -> 0x0078, SQLiteException -> 0x0076 }
                java.util.Set r5 = r11.a()     // Catch:{ all -> 0x006d }
                r4.Y()     // Catch:{ all -> 0x006b }
                r4.h()     // Catch:{ IllegalStateException -> 0x0069, SQLiteException -> 0x0067 }
            L_0x005e:
                r0.unlock()
                h1.u r0 = h1.u.this
                java.util.Objects.requireNonNull(r0)
                goto L_0x0082
            L_0x0067:
                r4 = move-exception
                goto L_0x007a
            L_0x0069:
                r4 = move-exception
                goto L_0x007a
            L_0x006b:
                r6 = move-exception
                goto L_0x006f
            L_0x006d:
                r6 = move-exception
                r5 = r2
            L_0x006f:
                r4.h()     // Catch:{ IllegalStateException -> 0x0069, SQLiteException -> 0x0067 }
                throw r6     // Catch:{ IllegalStateException -> 0x0069, SQLiteException -> 0x0067 }
            L_0x0073:
                r1 = move-exception
                goto L_0x00e5
            L_0x0076:
                r4 = move-exception
                goto L_0x0079
            L_0x0078:
                r4 = move-exception
            L_0x0079:
                r5 = r2
            L_0x007a:
                java.lang.String r6 = "ROOM"
                java.lang.String r7 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r6, r7, r4)     // Catch:{ all -> 0x0073 }
                goto L_0x005e
            L_0x0082:
                if (r5 == 0) goto L_0x00e4
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x00e4
                h1.u r0 = h1.u.this
                p.b<h1.u$c, h1.u$d> r0 = r0.i
                monitor-enter(r0)
                h1.u r4 = h1.u.this     // Catch:{ all -> 0x00e1 }
                p.b<h1.u$c, h1.u$d> r4 = r4.i     // Catch:{ all -> 0x00e1 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00e1 }
            L_0x0097:
                r6 = r4
                p.b$e r6 = (p.b.e) r6     // Catch:{ all -> 0x00e1 }
                boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00e1 }
                if (r7 == 0) goto L_0x00df
                java.lang.Object r6 = r6.next()     // Catch:{ all -> 0x00e1 }
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x00e1 }
                java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x00e1 }
                h1.u$d r6 = (h1.u.d) r6     // Catch:{ all -> 0x00e1 }
                int[] r7 = r6.f5780a     // Catch:{ all -> 0x00e1 }
                int r7 = r7.length     // Catch:{ all -> 0x00e1 }
                r8 = r1
                r9 = r2
            L_0x00b1:
                if (r8 >= r7) goto L_0x00d7
                int[] r10 = r6.f5780a     // Catch:{ all -> 0x00e1 }
                r10 = r10[r8]     // Catch:{ all -> 0x00e1 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00e1 }
                boolean r10 = r5.contains(r10)     // Catch:{ all -> 0x00e1 }
                if (r10 == 0) goto L_0x00d4
                if (r7 != r3) goto L_0x00c6
                java.util.Set<java.lang.String> r9 = r6.f5783d     // Catch:{ all -> 0x00e1 }
                goto L_0x00d4
            L_0x00c6:
                if (r9 != 0) goto L_0x00cd
                java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x00e1 }
                r9.<init>(r7)     // Catch:{ all -> 0x00e1 }
            L_0x00cd:
                java.lang.String[] r10 = r6.f5781b     // Catch:{ all -> 0x00e1 }
                r10 = r10[r8]     // Catch:{ all -> 0x00e1 }
                r9.add(r10)     // Catch:{ all -> 0x00e1 }
            L_0x00d4:
                int r8 = r8 + 1
                goto L_0x00b1
            L_0x00d7:
                if (r9 == 0) goto L_0x0097
                h1.u$c r6 = r6.f5782c     // Catch:{ all -> 0x00e1 }
                r6.a(r9)     // Catch:{ all -> 0x00e1 }
                goto L_0x0097
            L_0x00df:
                monitor-exit(r0)     // Catch:{ all -> 0x00e1 }
                goto L_0x00e4
            L_0x00e1:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00e1 }
                throw r1
            L_0x00e4:
                return
            L_0x00e5:
                r0.unlock()
                h1.u r0 = h1.u.this
                java.util.Objects.requireNonNull(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: h1.u.a.run():void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f5776a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f5777b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f5778c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5779d;

        public b(int i) {
            long[] jArr = new long[i];
            this.f5776a = jArr;
            boolean[] zArr = new boolean[i];
            this.f5777b = zArr;
            this.f5778c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        public final int[] a() {
            synchronized (this) {
                if (!this.f5779d) {
                    return null;
                }
                int length = this.f5776a.length;
                for (int i = 0; i < length; i++) {
                    int i10 = 1;
                    boolean z = this.f5776a[i] > 0;
                    boolean[] zArr = this.f5777b;
                    if (z != zArr[i]) {
                        int[] iArr = this.f5778c;
                        if (!z) {
                            i10 = 2;
                        }
                        iArr[i] = i10;
                    } else {
                        this.f5778c[i] = 0;
                    }
                    zArr[i] = z;
                }
                this.f5779d = false;
                int[] iArr2 = (int[]) this.f5778c.clone();
                return iArr2;
            }
        }
    }

    public static abstract class c {
        public abstract void a(Set<String> set);
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f5780a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f5781b;

        /* renamed from: c  reason: collision with root package name */
        public final c f5782c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f5783d;
    }

    public u(e0 e0Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f5769d = e0Var;
        this.f5772h = new b(strArr.length);
        this.f5766a = new HashMap<>();
        this.f5768c = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f5767b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f5766a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f5767b[i10] = str2.toLowerCase(locale);
            } else {
                this.f5767b[i10] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.f5766a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f5766a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public static void a(StringBuilder sb2, String str, String str2) {
        e.b(sb2, "`", "room_table_modification_trigger_", str, "_");
        sb2.append(str2);
        sb2.append("`");
    }

    public final boolean b() {
        if (!this.f5769d.n()) {
            return false;
        }
        if (!this.f5771f) {
            this.f5769d.f5678d.m0();
        }
        if (this.f5771f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void c(l1.a aVar, int i10) {
        aVar.q("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f5767b[i10];
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = f5765l;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            a(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            e.b(sb2, str, "` BEGIN UPDATE ", "room_table_modification_log", " SET ");
            e.b(sb2, "invalidated", " = 1", " WHERE ", "table_id");
            sb2.append(" = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            aVar.q(sb2.toString());
        }
    }

    public final void d(l1.a aVar) {
        if (!aVar.M()) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f5769d.i.readLock();
                readLock.lock();
                try {
                    synchronized (this.f5773j) {
                        int[] a10 = this.f5772h.a();
                        if (a10 != null) {
                            int length = a10.length;
                            if (aVar.U()) {
                                aVar.c0();
                            } else {
                                aVar.i();
                            }
                            int i10 = 0;
                            while (i10 < length) {
                                try {
                                    int i11 = a10[i10];
                                    if (i11 == 1) {
                                        c(aVar, i10);
                                    } else if (i11 == 2) {
                                        String str = this.f5767b[i10];
                                        StringBuilder sb2 = new StringBuilder();
                                        String[] strArr = f5765l;
                                        for (int i12 = 0; i12 < 3; i12++) {
                                            String str2 = strArr[i12];
                                            sb2.setLength(0);
                                            sb2.append("DROP TRIGGER IF EXISTS ");
                                            a(sb2, str, str2);
                                            aVar.q(sb2.toString());
                                        }
                                    }
                                    i10++;
                                } finally {
                                    aVar.h();
                                }
                            }
                            aVar.Y();
                            aVar.h();
                            readLock.unlock();
                        }
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
            }
        }
    }
}
