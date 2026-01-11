package a5;

import a5.h0;
import android.database.sqlite.SQLiteDatabase;

public final /* synthetic */ class g0 implements h0.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ g0 f86a = new g0();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = h0.f88c;
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(h0.f88c);
    }
}
