package a5;

import a5.a0;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import x4.c;

public final /* synthetic */ class x implements a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f127a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.a f128b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f129c;

    public /* synthetic */ x(String str, c.a aVar, long j10) {
        this.f127a = str;
        this.f128b = aVar;
        this.f129c = j10;
    }

    public final Object apply(Object obj) {
        String str = this.f127a;
        c.a aVar = this.f128b;
        long j10 = this.f129c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!((Boolean) a0.B(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.getNumber())}), y.f130b)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(aVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.getNumber())});
        }
        return null;
    }
}
