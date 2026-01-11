package a5;

import a5.a0;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import d5.a;
import t4.q;

public final /* synthetic */ class r implements a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f112a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f113b;

    public /* synthetic */ r(long j10, q qVar) {
        this.f112a = j10;
        this.f113b = qVar;
    }

    public final Object apply(Object obj) {
        long j10 = this.f112a;
        q qVar = this.f113b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{qVar.b(), String.valueOf(a.a(qVar.d()))}) < 1) {
            contentValues.put("backend_name", qVar.b());
            contentValues.put("priority", Integer.valueOf(a.a(qVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
