package a5;

import a5.a0;
import android.database.Cursor;
import x4.f;

public final /* synthetic */ class k implements a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f102a;

    public /* synthetic */ k(long j10) {
        this.f102a = j10;
    }

    public final Object apply(Object obj) {
        long j10 = this.f102a;
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new f(cursor.getLong(0), j10);
    }
}
