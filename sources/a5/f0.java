package a5;

import a5.h0;
import android.database.sqlite.SQLiteDatabase;

public final /* synthetic */ class f0 implements h0.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f0 f84a = new f0();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = h0.f88c;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }
}
