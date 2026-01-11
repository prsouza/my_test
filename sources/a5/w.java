package a5;

import a5.a0;
import aa.b;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import x4.a;
import x4.c;
import x4.d;
import x4.e;
import x4.f;

public final /* synthetic */ class w implements a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f124a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f125b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f126c;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3) {
        this.f124a = obj;
        this.f125b = obj2;
        this.f126c = obj3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r1v17, types: [java.util.List<x4.d>, java.util.ArrayList] */
    public final Object apply(Object obj) {
        a0 a0Var = (a0) this.f124a;
        Map map = (Map) this.f125b;
        a.C0251a aVar = (a.C0251a) this.f126c;
        Cursor cursor = (Cursor) obj;
        Objects.requireNonNull(a0Var);
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            int i = cursor.getInt(1);
            c.a aVar2 = c.a.REASON_UNKNOWN;
            if (i != aVar2.getNumber()) {
                c.a aVar3 = c.a.MESSAGE_TOO_OLD;
                if (i != aVar3.getNumber()) {
                    aVar3 = c.a.CACHE_FULL;
                    if (i != aVar3.getNumber()) {
                        aVar3 = c.a.PAYLOAD_TOO_BIG;
                        if (i != aVar3.getNumber()) {
                            aVar3 = c.a.MAX_RETRIES_REACHED;
                            if (i != aVar3.getNumber()) {
                                aVar3 = c.a.INVALID_PAYLOD;
                                if (i != aVar3.getNumber()) {
                                    aVar3 = c.a.SERVER_ERROR;
                                    if (i != aVar3.getNumber()) {
                                        b.A("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
                                    }
                                }
                            }
                        }
                    }
                }
                aVar2 = aVar3;
            }
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            int i10 = c.f12788c;
            ((List) map.get(string)).add(new c(j10, aVar2));
        }
        for (Map.Entry entry : map.entrySet()) {
            int i11 = d.f12791c;
            new ArrayList();
            aVar.f12784b.add(new d((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
        }
        long a10 = a0Var.f65b.a();
        SQLiteDatabase s10 = a0Var.s();
        s10.beginTransaction();
        try {
            f fVar = (f) a0.B(s10.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new k(a10));
            s10.setTransactionSuccessful();
            s10.endTransaction();
            aVar.f12783a = fVar;
            aVar.f12785c = new x4.b(new e(a0Var.s().compileStatement("PRAGMA page_size").simpleQueryForLong() * a0Var.s().compileStatement("PRAGMA page_count").simpleQueryForLong(), e.f81a.f58b));
            aVar.f12786d = a0Var.f68t.get();
            return new a(aVar.f12783a, Collections.unmodifiableList(aVar.f12784b), aVar.f12785c, aVar.f12786d);
        } catch (Throwable th2) {
            s10.endTransaction();
            throw th2;
        }
    }
}
