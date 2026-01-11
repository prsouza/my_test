package a5;

import a5.a0;
import android.database.Cursor;
import java.util.List;
import java.util.Objects;
import q4.b;
import t4.h;
import t4.l;
import t4.m;
import t4.q;

public final /* synthetic */ class t implements a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f116a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f117b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f118c;

    public /* synthetic */ t(a0 a0Var, List list, q qVar) {
        this.f116a = a0Var;
        this.f117b = list;
        this.f118c = qVar;
    }

    public final Object apply(Object obj) {
        b bVar;
        b bVar2;
        a0 a0Var = this.f116a;
        List list = this.f117b;
        q qVar = this.f118c;
        Cursor cursor = (Cursor) obj;
        Objects.requireNonNull(a0Var);
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            m.a a10 = m.a();
            a10.f(cursor.getString(1));
            a10.e(cursor.getLong(2));
            a10.g(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                if (string == null) {
                    bVar2 = a0.f63u;
                } else {
                    bVar2 = new b(string);
                }
                ((h.b) a10).f11359c = new l(bVar2, cursor.getBlob(5));
            } else {
                String string2 = cursor.getString(4);
                if (string2 == null) {
                    bVar = a0.f63u;
                } else {
                    bVar = new b(string2);
                }
                ((h.b) a10).f11359c = new l(bVar, (byte[]) a0.B(a0Var.s().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, (String) null, (String) null, "sequence_num"), h1.b.f5654s));
            }
            if (!cursor.isNull(6)) {
                ((h.b) a10).f11358b = Integer.valueOf(cursor.getInt(6));
            }
            list.add(new b(j10, qVar, a10.c()));
        }
        return null;
    }
}
