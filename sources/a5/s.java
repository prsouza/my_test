package a5;

import a5.a0;
import android.database.sqlite.SQLiteDatabase;
import java.util.Objects;

public final /* synthetic */ class s implements a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f114a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f115b;

    public /* synthetic */ s(a0 a0Var, long j10) {
        this.f114a = a0Var;
        this.f115b = j10;
    }

    public final Object apply(Object obj) {
        a0 a0Var = this.f114a;
        long j10 = this.f115b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Objects.requireNonNull(a0Var);
        String[] strArr = {String.valueOf(j10)};
        a0.B(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new l(a0Var));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }
}
