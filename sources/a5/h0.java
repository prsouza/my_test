package a5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

public final class h0 extends SQLiteOpenHelper {

    /* renamed from: c  reason: collision with root package name */
    public static final String f88c;

    /* renamed from: s  reason: collision with root package name */
    public static int f89s = 5;

    /* renamed from: t  reason: collision with root package name */
    public static final c0 f90t;

    /* renamed from: u  reason: collision with root package name */
    public static final d0 f91u;

    /* renamed from: v  reason: collision with root package name */
    public static final e0 f92v;

    /* renamed from: w  reason: collision with root package name */
    public static final f0 f93w;

    /* renamed from: x  reason: collision with root package name */
    public static final g0 f94x;

    /* renamed from: y  reason: collision with root package name */
    public static final List<a> f95y;

    /* renamed from: a  reason: collision with root package name */
    public final int f96a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f97b = false;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder d10 = a.a.d("INSERT INTO global_log_event_state VALUES (");
        d10.append(System.currentTimeMillis());
        d10.append(")");
        f88c = d10.toString();
        c0 c0Var = c0.f79a;
        f90t = c0Var;
        d0 d0Var = d0.f80a;
        f91u = d0Var;
        e0 e0Var = e0.f82a;
        f92v = e0Var;
        f0 f0Var = f0.f84a;
        f93w = f0Var;
        g0 g0Var = g0.f86a;
        f94x = g0Var;
        f95y = Arrays.asList(new a[]{c0Var, d0Var, e0Var, f0Var, g0Var});
    }

    public h0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f96a = i;
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        if (!this.f97b) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void c(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        List<a> list = f95y;
        if (i10 <= list.size()) {
            while (i < i10) {
                f95y.get(i).a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i10 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f97b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.f96a;
        a(sQLiteDatabase);
        c(sQLiteDatabase, 0, i);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        a(sQLiteDatabase);
        c(sQLiteDatabase, 0, i10);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        a(sQLiteDatabase);
        c(sQLiteDatabase, i, i10);
    }
}
