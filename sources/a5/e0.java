package a5;

import a5.h0;
import android.database.sqlite.SQLiteDatabase;

public final /* synthetic */ class e0 implements h0.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ e0 f82a = new e0();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = h0.f88c;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
