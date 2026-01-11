package t4;

import a5.a0;
import android.database.sqlite.SQLiteDatabase;
import h1.c;
import java.util.List;
import q4.b;
import q4.h;

public final /* synthetic */ class s implements h, a0.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ s f11388a = new s();

    public final Object apply(Object obj) {
        b bVar = a0.f63u;
        return (List) a0.B(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), c.f5660c);
    }

    public final void b(Exception exc) {
    }
}
