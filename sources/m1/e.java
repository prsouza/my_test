package m1;

import android.database.sqlite.SQLiteStatement;

public final class e extends d implements l1.e {

    /* renamed from: b  reason: collision with root package name */
    public final SQLiteStatement f8385b;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f8385b = sQLiteStatement;
    }

    public final long n0() {
        return this.f8385b.executeInsert();
    }

    public final int x() {
        return this.f8385b.executeUpdateDelete();
    }
}
