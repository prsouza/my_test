package a5;

import a5.a0;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h1.c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import t4.m;
import t4.q;

public final /* synthetic */ class v implements a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f122a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f123b;

    public /* synthetic */ v(a0 a0Var, q qVar) {
        this.f122a = a0Var;
        this.f123b = qVar;
    }

    public final Object apply(Object obj) {
        a0 a0Var = this.f122a;
        q qVar = this.f123b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Objects.requireNonNull(a0Var);
        ArrayList arrayList = new ArrayList();
        Long t10 = a0Var.t(sQLiteDatabase, qVar);
        if (t10 != null) {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            a0.B(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{t10.toString()}, (String) null, (String) null, (String) null, String.valueOf(a0Var.f67s.c())), new t(a0Var, arrayList, qVar));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb2.append(((j) arrayList.get(i)).b());
            if (i < arrayList.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        a0.B(sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb2.toString(), (String[]) null, (String) null, (String) null, (String) null), new c0(hashMap, 1));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            j jVar = (j) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(jVar.b()))) {
                m.a j10 = jVar.a().j();
                for (a0.b bVar : (Set) hashMap.get(Long.valueOf(jVar.b()))) {
                    j10.b(bVar.f69a, bVar.f70b);
                }
                listIterator.set(new b(jVar.b(), jVar.c(), j10.c()));
            }
        }
        return arrayList;
    }
}
