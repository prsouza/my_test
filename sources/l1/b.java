package l1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

public interface b extends Closeable {

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7760a;

        public a(int i) {
            this.f7760a = i;
        }

        public final void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e10) {
                    Log.w("SupportSQLite", "delete failed: ", e10);
                }
            }
        }

        public abstract void b();

        public abstract void c(a aVar);

        public abstract void d(a aVar, int i, int i10);

        public abstract void e(a aVar);

        public abstract void f(a aVar, int i, int i10);
    }

    /* renamed from: l1.b$b  reason: collision with other inner class name */
    public static class C0141b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f7761a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7762b;

        /* renamed from: c  reason: collision with root package name */
        public final a f7763c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f7764d;

        public C0141b(Context context, String str, a aVar, boolean z) {
            this.f7761a = context;
            this.f7762b = str;
            this.f7763c = aVar;
            this.f7764d = z;
        }
    }

    public interface c {
        b a(C0141b bVar);
    }

    void close();

    String getDatabaseName();

    a m0();

    void setWriteAheadLoggingEnabled(boolean z);
}
