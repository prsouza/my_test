package m1;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import b3.b;
import java.io.IOException;
import java.util.List;
import l1.d;
import l1.e;

public final class a implements l1.a {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f8369b = new String[0];

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteDatabase f8370a;

    /* renamed from: m1.a$a  reason: collision with other inner class name */
    public class C0150a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f8371a;

        public C0150a(d dVar) {
            this.f8371a = dVar;
        }

        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f8371a.c(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f8370a = sQLiteDatabase;
    }

    public final boolean M() {
        return this.f8370a.inTransaction();
    }

    public final boolean U() {
        return this.f8370a.isWriteAheadLoggingEnabled();
    }

    public final void Y() {
        this.f8370a.setTransactionSuccessful();
    }

    public final void Z(String str, Object[] objArr) throws SQLException {
        this.f8370a.execSQL(str, objArr);
    }

    public final void c0() {
        this.f8370a.beginTransactionNonExclusive();
    }

    public final void close() throws IOException {
        this.f8370a.close();
    }

    public final String getPath() {
        return this.f8370a.getPath();
    }

    public final void h() {
        this.f8370a.endTransaction();
    }

    public final void i() {
        this.f8370a.beginTransaction();
    }

    public final boolean isOpen() {
        return this.f8370a.isOpen();
    }

    public final Cursor k(d dVar) {
        return this.f8370a.rawQueryWithFactory(new C0150a(dVar), dVar.a(), f8369b, (String) null);
    }

    public final List<Pair<String, String>> o() {
        return this.f8370a.getAttachedDbs();
    }

    public final Cursor o0(String str) {
        return k(new b(str, (Object) null));
    }

    public final void q(String str) throws SQLException {
        this.f8370a.execSQL(str);
    }

    public final e z(String str) {
        return new e(this.f8370a.compileStatement(str));
    }
}
