package a5;

import a5.h0;
import android.database.sqlite.SQLiteDatabase;

public final /* synthetic */ class d0 implements h0.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d0 f80a = new d0();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = h0.f88c;
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
