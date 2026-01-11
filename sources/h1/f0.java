package h1;

import android.database.Cursor;
import l1.b;

public final class f0 extends b.a {

    /* renamed from: b  reason: collision with root package name */
    public m f5699b;

    /* renamed from: c  reason: collision with root package name */
    public final a f5700c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5701d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5702e;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f5703a;

        public a(int i) {
            this.f5703a = i;
        }

        public abstract void a(l1.a aVar);

        public abstract void b(l1.a aVar);

        public abstract void c(l1.a aVar);

        public abstract void d(l1.a aVar);

        public abstract void e();

        public abstract void f(l1.a aVar);

        public abstract b g(l1.a aVar);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f5704a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5705b;

        public b(boolean z, String str) {
            this.f5704a = z;
            this.f5705b = str;
        }
    }

    public f0(m mVar, a aVar, String str, String str2) {
        super(aVar.f5703a);
        this.f5699b = mVar;
        this.f5700c = aVar;
        this.f5701d = str;
        this.f5702e = str2;
    }

    public final void b() {
    }

    /* JADX INFO: finally extract failed */
    public final void c(l1.a aVar) {
        m1.a aVar2 = (m1.a) aVar;
        Cursor o02 = aVar2.o0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (o02.moveToFirst() && o02.getInt(0) == 0) {
                z = true;
            }
            o02.close();
            this.f5700c.a(aVar2);
            if (!z) {
                b g = this.f5700c.g(aVar2);
                if (!g.f5704a) {
                    StringBuilder d10 = a.a.d("Pre-packaged database has an invalid schema: ");
                    d10.append(g.f5705b);
                    throw new IllegalStateException(d10.toString());
                }
            }
            g(aVar2);
            this.f5700c.c(aVar2);
        } catch (Throwable th2) {
            o02.close();
            throw th2;
        }
    }

    public final void d(l1.a aVar, int i, int i10) {
        f(aVar, i, i10);
    }

    /* JADX INFO: finally extract failed */
    public final void e(l1.a aVar) {
        m1.a aVar2 = (m1.a) aVar;
        Cursor o02 = aVar2.o0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = o02.moveToFirst() && o02.getInt(0) != 0;
            o02.close();
            if (z) {
                Cursor k10 = aVar2.k(new b3.b("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", (Object) null));
                try {
                    String string = k10.moveToFirst() ? k10.getString(0) : null;
                    k10.close();
                    if (!this.f5701d.equals(string) && !this.f5702e.equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th2) {
                    k10.close();
                    throw th2;
                }
            } else {
                b g = this.f5700c.g(aVar2);
                if (g.f5704a) {
                    this.f5700c.e();
                    g(aVar2);
                } else {
                    StringBuilder d10 = a.a.d("Pre-packaged database has an invalid schema: ");
                    d10.append(g.f5705b);
                    throw new IllegalStateException(d10.toString());
                }
            }
            this.f5700c.d(aVar2);
            this.f5699b = null;
        } catch (Throwable th3) {
            o02.close();
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(l1.a r12, int r13, int r14) {
        /*
            r11 = this;
            h1.m r0 = r11.f5699b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00bd
            h1.e0$d r0 = r0.f5750d
            java.util.Objects.requireNonNull(r0)
            if (r13 != r14) goto L_0x0013
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x007a
        L_0x0013:
            if (r14 <= r13) goto L_0x0017
            r3 = r1
            goto L_0x0018
        L_0x0017:
            r3 = r2
        L_0x0018:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r13
        L_0x001e:
            if (r3 == 0) goto L_0x0023
            if (r5 >= r14) goto L_0x0079
            goto L_0x0025
        L_0x0023:
            if (r5 <= r14) goto L_0x0079
        L_0x0025:
            java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, i1.b>> r6 = r0.f5697a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r7)
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            r7 = 0
            if (r6 != 0) goto L_0x0035
            goto L_0x0077
        L_0x0035:
            if (r3 == 0) goto L_0x003c
            java.util.NavigableSet r8 = r6.descendingKeySet()
            goto L_0x0040
        L_0x003c:
            java.util.Set r8 = r6.keySet()
        L_0x0040:
            java.util.Iterator r8 = r8.iterator()
        L_0x0044:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0074
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r3 == 0) goto L_0x005b
            if (r9 > r14) goto L_0x0061
            if (r9 <= r5) goto L_0x0061
            goto L_0x005f
        L_0x005b:
            if (r9 < r14) goto L_0x0061
            if (r9 >= r5) goto L_0x0061
        L_0x005f:
            r10 = r1
            goto L_0x0062
        L_0x0061:
            r10 = r2
        L_0x0062:
            if (r10 == 0) goto L_0x0044
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r6.get(r5)
            i1.b r5 = (i1.b) r5
            r4.add(r5)
            r6 = r1
            r5 = r9
            goto L_0x0075
        L_0x0074:
            r6 = r2
        L_0x0075:
            if (r6 != 0) goto L_0x001e
        L_0x0077:
            r0 = r7
            goto L_0x007a
        L_0x0079:
            r0 = r4
        L_0x007a:
            if (r0 == 0) goto L_0x00bd
            h1.f0$a r2 = r11.f5700c
            r2.f(r12)
            java.util.Iterator r0 = r0.iterator()
        L_0x0085:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0095
            java.lang.Object r2 = r0.next()
            i1.b r2 = (i1.b) r2
            r2.a(r12)
            goto L_0x0085
        L_0x0095:
            h1.f0$a r0 = r11.f5700c
            h1.f0$b r0 = r0.g(r12)
            boolean r2 = r0.f5704a
            if (r2 == 0) goto L_0x00a8
            h1.f0$a r0 = r11.f5700c
            r0.e()
            r11.g(r12)
            goto L_0x00be
        L_0x00a8:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Migration didn't properly handle: "
            java.lang.StringBuilder r13 = a.a.d(r13)
            java.lang.String r14 = r0.f5705b
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x00bd:
            r1 = r2
        L_0x00be:
            if (r1 != 0) goto L_0x00f9
            h1.m r0 = r11.f5699b
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r0.a(r13, r14)
            if (r0 != 0) goto L_0x00d5
            h1.f0$a r13 = r11.f5700c
            r13.b(r12)
            h1.f0$a r13 = r11.f5700c
            r13.a(r12)
            goto L_0x00f9
        L_0x00d5:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = " to "
            r0.append(r13)
            r0.append(r14)
            java.lang.String r13 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.f0.f(l1.a, int, int):void");
    }

    public final void g(l1.a aVar) {
        m1.a aVar2 = (m1.a) aVar;
        aVar2.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f5701d;
        aVar2.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }
}
