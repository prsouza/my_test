package a5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b5.b;
import h1.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import t4.m;
import t4.q;
import x4.a;
import x4.c;

public final class a0 implements d, b5.b, c {

    /* renamed from: u  reason: collision with root package name */
    public static final q4.b f63u = new q4.b("proto");

    /* renamed from: a  reason: collision with root package name */
    public final h0 f64a;

    /* renamed from: b  reason: collision with root package name */
    public final c5.a f65b;

    /* renamed from: c  reason: collision with root package name */
    public final c5.a f66c;

    /* renamed from: s  reason: collision with root package name */
    public final e f67s;

    /* renamed from: t  reason: collision with root package name */
    public final v4.a<String> f68t;

    public interface a<T, U> {
        U apply(T t10);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f69a;

        /* renamed from: b  reason: collision with root package name */
        public final String f70b;

        public b(String str, String str2) {
            this.f69a = str;
            this.f70b = str2;
        }
    }

    public a0(c5.a aVar, c5.a aVar2, e eVar, h0 h0Var, v4.a<String> aVar3) {
        this.f64a = h0Var;
        this.f65b = aVar;
        this.f66c = aVar2;
        this.f67s = eVar;
        this.f68t = aVar3;
    }

    public static <T> T B(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static String y(Iterable<j> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<j> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public final Iterable<j> N(q qVar) {
        return (Iterable) w(new v(this, qVar));
    }

    public final Iterable<q> P() {
        SQLiteDatabase s10 = s();
        s10.beginTransaction();
        try {
            List list = (List) B(s10.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), c.f5660c);
            s10.setTransactionSuccessful();
            return list;
        } finally {
            s10.endTransaction();
        }
    }

    public final j V(q qVar, m mVar) {
        aa.b.B("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", qVar.d(), mVar.h(), qVar.b());
        long longValue = ((Long) w(new u(this, mVar, qVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new b(longValue, qVar, mVar);
    }

    public final <T> T a(b.a<T> aVar) {
        SQLiteDatabase s10 = s();
        h1.b bVar = h1.b.f5653c;
        long a10 = this.f66c.a();
        while (true) {
            try {
                s10.beginTransaction();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f66c.a() >= ((long) this.f67s.a()) + a10) {
                    bVar.apply(e10);
                    break;
                }
                SystemClock.sleep(50);
            }
        }
        try {
            T a11 = aVar.a();
            s10.setTransactionSuccessful();
            return a11;
        } finally {
            s10.endTransaction();
        }
    }

    public final x4.a c() {
        int i = x4.a.f12778e;
        a.C0251a aVar = new a.C0251a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase s10 = s();
        s10.beginTransaction();
        try {
            x4.a aVar2 = (x4.a) B(s10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new w(this, hashMap, aVar));
            s10.setTransactionSuccessful();
            return aVar2;
        } finally {
            s10.endTransaction();
        }
    }

    public final void close() {
        this.f64a.close();
    }

    public final void e() {
        w(new o(this));
    }

    public final void f(long j10, c.a aVar, String str) {
        w(new x(str, aVar, j10));
    }

    public final void h0(Iterable<j> iterable) {
        Cursor rawQuery;
        if (iterable.iterator().hasNext()) {
            StringBuilder d10 = a.a.d("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            d10.append(y(iterable));
            String sb2 = d10.toString();
            SQLiteDatabase s10 = s();
            s10.beginTransaction();
            try {
                s10.compileStatement(sb2).execute();
                rawQuery = s10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (String[]) null);
                Objects.requireNonNull(this);
                while (rawQuery.moveToNext()) {
                    int i = rawQuery.getInt(0);
                    f((long) i, c.a.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                s10.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                s10.setTransactionSuccessful();
                s10.endTransaction();
            } catch (Throwable th2) {
                s10.endTransaction();
                throw th2;
            }
        }
    }

    public final int j() {
        return ((Integer) w(new s(this, this.f65b.a() - this.f67s.b()))).intValue();
    }

    /* JADX INFO: finally extract failed */
    public final long k0(q qVar) {
        Long l10;
        Cursor rawQuery = s().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{qVar.b(), String.valueOf(d5.a.a(qVar.d()))});
        try {
            if (rawQuery.moveToNext()) {
                l10 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l10 = 0L;
            }
            rawQuery.close();
            return l10.longValue();
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public final void m(Iterable<j> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder d10 = a.a.d("DELETE FROM events WHERE _id in ");
            d10.append(y(iterable));
            s().compileStatement(d10.toString()).execute();
        }
    }

    public final SQLiteDatabase s() {
        h0 h0Var = this.f64a;
        Objects.requireNonNull(h0Var);
        long a10 = this.f66c.a();
        while (true) {
            try {
                SQLiteDatabase writableDatabase = h0Var.getWritableDatabase();
                SQLiteDatabase sQLiteDatabase = writableDatabase;
                return writableDatabase;
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f66c.a() < ((long) this.f67s.a()) + a10) {
                    SystemClock.sleep(50);
                } else {
                    throw new b5.a("Timed out while trying to open db.", e10);
                }
            }
        }
    }

    public final Long t(SQLiteDatabase sQLiteDatabase, q qVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{qVar.b(), String.valueOf(d5.a.a(qVar.d()))}));
        if (qVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(qVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        Long l10 = null;
        try {
            if (query.moveToNext()) {
                l10 = Long.valueOf(query.getLong(0));
            }
            return l10;
        } finally {
            query.close();
        }
    }

    public final void t0(q qVar, long j10) {
        w(new r(j10, qVar));
    }

    public final boolean u0(q qVar) {
        return ((Boolean) w(new n(this, qVar))).booleanValue();
    }

    public final <T> T w(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase s10 = s();
        s10.beginTransaction();
        try {
            T apply = aVar.apply(s10);
            s10.setTransactionSuccessful();
            return apply;
        } finally {
            s10.endTransaction();
        }
    }
}
