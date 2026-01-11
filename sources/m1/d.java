package m1;

import android.database.sqlite.SQLiteProgram;
import l1.c;

public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteProgram f8384a;

    public d(SQLiteProgram sQLiteProgram) {
        this.f8384a = sQLiteProgram;
    }

    public final void D(int i) {
        this.f8384a.bindNull(i);
    }

    public final void G(int i, double d10) {
        this.f8384a.bindDouble(i, d10);
    }

    public final void X(int i, long j10) {
        this.f8384a.bindLong(i, j10);
    }

    public final void close() {
        this.f8384a.close();
    }

    public final void g0(int i, byte[] bArr) {
        this.f8384a.bindBlob(i, bArr);
    }

    public final void r(int i, String str) {
        this.f8384a.bindString(i, str);
    }
}
