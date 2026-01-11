package a5;

import a5.a0;
import android.database.sqlite.SQLiteDatabase;
import androidx.lifecycle.k0;
import e6.e;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import java.util.Objects;
import qb.k;
import qb.t;
import w7.a;
import w7.b;
import w7.c;

public final /* synthetic */ class o implements a0.a, b, k0, ScopeCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f108a;

    public /* synthetic */ o(Object obj) {
        this.f108a = obj;
    }

    public final Object apply(Object obj) {
        a0 a0Var = (a0) this.f108a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Objects.requireNonNull(a0Var);
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + a0Var.f65b.a()).execute();
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List<w7.a>, java.util.ArrayList] */
    public final void b(a aVar) {
        t7.b bVar = (t7.b) this.f108a;
        synchronized (bVar) {
            if (bVar.f11430b instanceof c) {
                bVar.f11431c.add(aVar);
            }
            bVar.f11430b.b(aVar);
        }
    }

    public final void d(Object obj) {
        t tVar = (t) obj;
        k.a aVar = k.f10366y;
        Objects.requireNonNull((k) this.f108a);
    }

    public final void run(Scope scope) {
        ac.b bVar = (ac.b) this.f108a;
        e.D(bVar, "this$0");
        e.D(scope, "scope");
        scope.setTag("CoroutineName", bVar.f296a);
    }
}
