package a5;

import a5.a0;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d5.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import t4.m;
import t4.q;
import x4.c;

public final /* synthetic */ class u implements a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f120b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f121c;

    public /* synthetic */ u(a0 a0Var, m mVar, q qVar) {
        this.f119a = a0Var;
        this.f120b = mVar;
        this.f121c = qVar;
    }

    public final Object apply(Object obj) {
        long j10;
        a0 a0Var = this.f119a;
        m mVar = this.f120b;
        q qVar = this.f121c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (a0Var.s().compileStatement("PRAGMA page_size").simpleQueryForLong() * a0Var.s().compileStatement("PRAGMA page_count").simpleQueryForLong() >= a0Var.f67s.e()) {
            a0Var.f(1, c.a.CACHE_FULL, mVar.h());
            return -1L;
        }
        Long t10 = a0Var.t(sQLiteDatabase, qVar);
        if (t10 != null) {
            j10 = t10.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", qVar.b());
            contentValues.put("priority", Integer.valueOf(a.a(qVar.d())));
            contentValues.put("next_request_ms", 0);
            if (qVar.c() != null) {
                contentValues.put("extras", Base64.encodeToString(qVar.c(), 0));
            }
            j10 = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        int d10 = a0Var.f67s.d();
        byte[] bArr = mVar.e().f11380b;
        boolean z = bArr.length <= d10;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(j10));
        contentValues2.put("transport_name", mVar.h());
        contentValues2.put("timestamp_ms", Long.valueOf(mVar.f()));
        contentValues2.put("uptime_ms", Long.valueOf(mVar.i()));
        contentValues2.put("payload_encoding", mVar.e().f11379a.f10302a);
        contentValues2.put("code", mVar.d());
        contentValues2.put("num_attempts", 0);
        contentValues2.put("inline", Boolean.valueOf(z));
        contentValues2.put("payload", z ? bArr : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
        if (!z) {
            int ceil = (int) Math.ceil(((double) bArr.length) / ((double) d10));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (i - 1) * d10, Math.min(i * d10, bArr.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert));
                contentValues3.put("sequence_num", Integer.valueOf(i));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
            }
        }
        for (Map.Entry next : Collections.unmodifiableMap(mVar.c()).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert));
            contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) next.getKey());
            contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
        }
        return Long.valueOf(insert);
    }
}
