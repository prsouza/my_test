package m1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import l1.b;

public final class b implements l1.b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8372a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8373b;

    /* renamed from: c  reason: collision with root package name */
    public final b.a f8374c;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8375s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f8376t = new Object();

    /* renamed from: u  reason: collision with root package name */
    public a f8377u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f8378v;

    public static class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        public final a[] f8379a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a f8380b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8381c;

        /* renamed from: m1.b$a$a  reason: collision with other inner class name */
        public class C0151a implements DatabaseErrorHandler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b.a f8382a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a[] f8383b;

            public C0151a(b.a aVar, a[] aVarArr) {
                this.f8382a = aVar;
                this.f8383b = aVarArr;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
                r4 = r1.iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
                if (r4.hasNext() != false) goto L_0x004b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
                r0.a((java.lang.String) r4.next().second);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
                r0.a(r4.getPath());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
                throw r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
                if (r1 != null) goto L_0x0041;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003b */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
            /* JADX WARNING: Removed duplicated region for block: B:6:0x0039 A[ExcHandler: all (r2v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
              PHI: (r1v11 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r1v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:4:0x0034, B:7:0x003b, B:8:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:4:0x0034] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                /*
                    r3 = this;
                    l1.b$a r0 = r3.f8382a
                    m1.a[] r1 = r3.f8383b
                    m1.a r4 = m1.b.a.c(r1, r4)
                    java.util.Objects.requireNonNull(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Corruption reported by sqlite on database: "
                    r1.append(r2)
                    java.lang.String r2 = r4.getPath()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SupportSQLite"
                    android.util.Log.e(r2, r1)
                    boolean r1 = r4.isOpen()
                    if (r1 != 0) goto L_0x0033
                    java.lang.String r4 = r4.getPath()
                    r0.a(r4)
                    goto L_0x0082
                L_0x0033:
                    r1 = 0
                    java.util.List r1 = r4.o()     // Catch:{ SQLiteException -> 0x003b, all -> 0x0039 }
                    goto L_0x003b
                L_0x0039:
                    r2 = move-exception
                    goto L_0x003f
                L_0x003b:
                    r4.close()     // Catch:{ IOException -> 0x0061, all -> 0x0039 }
                    goto L_0x0061
                L_0x003f:
                    if (r1 == 0) goto L_0x0059
                    java.util.Iterator r4 = r1.iterator()
                L_0x0045:
                    boolean r1 = r4.hasNext()
                    if (r1 == 0) goto L_0x0060
                    java.lang.Object r1 = r4.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.a(r1)
                    goto L_0x0045
                L_0x0059:
                    java.lang.String r4 = r4.getPath()
                    r0.a(r4)
                L_0x0060:
                    throw r2
                L_0x0061:
                    if (r1 == 0) goto L_0x007b
                    java.util.Iterator r4 = r1.iterator()
                L_0x0067:
                    boolean r1 = r4.hasNext()
                    if (r1 == 0) goto L_0x0082
                    java.lang.Object r1 = r4.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.a(r1)
                    goto L_0x0067
                L_0x007b:
                    java.lang.String r4 = r4.getPath()
                    r0.a(r4)
                L_0x0082:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: m1.b.a.C0151a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public a(Context context, String str, a[] aVarArr, b.a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f7760a, new C0151a(aVar, aVarArr));
            this.f8380b = aVar;
            this.f8379a = aVarArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
            if ((r1.f8370a == r3) == false) goto L_0x000e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static m1.a c(m1.a[] r2, android.database.sqlite.SQLiteDatabase r3) {
            /*
                r0 = 0
                r1 = r2[r0]
                if (r1 == 0) goto L_0x000e
                android.database.sqlite.SQLiteDatabase r1 = r1.f8370a
                if (r1 != r3) goto L_0x000b
                r1 = 1
                goto L_0x000c
            L_0x000b:
                r1 = r0
            L_0x000c:
                if (r1 != 0) goto L_0x0015
            L_0x000e:
                m1.a r1 = new m1.a
                r1.<init>(r3)
                r2[r0] = r1
            L_0x0015:
                r2 = r2[r0]
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: m1.b.a.c(m1.a[], android.database.sqlite.SQLiteDatabase):m1.a");
        }

        public final a a(SQLiteDatabase sQLiteDatabase) {
            return c(this.f8379a, sQLiteDatabase);
        }

        public final synchronized void close() {
            super.close();
            this.f8379a[0] = null;
        }

        public final synchronized l1.a e() {
            this.f8381c = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (this.f8381c) {
                close();
                return e();
            }
            return a(writableDatabase);
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            b.a aVar = this.f8380b;
            a(sQLiteDatabase);
            aVar.b();
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f8380b.c(a(sQLiteDatabase));
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
            this.f8381c = true;
            this.f8380b.d(a(sQLiteDatabase), i, i10);
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f8381c) {
                this.f8380b.e(a(sQLiteDatabase));
            }
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
            this.f8381c = true;
            this.f8380b.f(a(sQLiteDatabase), i, i10);
        }
    }

    public b(Context context, String str, b.a aVar, boolean z) {
        this.f8372a = context;
        this.f8373b = str;
        this.f8374c = aVar;
        this.f8375s = z;
    }

    public final a a() {
        a aVar;
        synchronized (this.f8376t) {
            if (this.f8377u == null) {
                a[] aVarArr = new a[1];
                if (this.f8373b == null || !this.f8375s) {
                    this.f8377u = new a(this.f8372a, this.f8373b, aVarArr, this.f8374c);
                } else {
                    this.f8377u = new a(this.f8372a, new File(this.f8372a.getNoBackupFilesDir(), this.f8373b).getAbsolutePath(), aVarArr, this.f8374c);
                }
                this.f8377u.setWriteAheadLoggingEnabled(this.f8378v);
            }
            aVar = this.f8377u;
        }
        return aVar;
    }

    public final void close() {
        a().close();
    }

    public final String getDatabaseName() {
        return this.f8373b;
    }

    public final l1.a m0() {
        return a().e();
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f8376t) {
            a aVar = this.f8377u;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f8378v = z;
        }
    }
}
