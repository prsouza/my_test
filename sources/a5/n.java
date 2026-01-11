package a5;

import a5.a0;
import a9.c;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import e6.e;
import io.nodle.cash.R;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import t4.q;
import ye.a;

public final /* synthetic */ class n implements a0.a, ScopeCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f106a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f107b;

    public /* synthetic */ n(Object obj, Object obj2) {
        this.f106a = obj;
        this.f107b = obj2;
    }

    public final Object apply(Object obj) {
        a0 a0Var = (a0) this.f106a;
        Long t10 = a0Var.t((SQLiteDatabase) obj, (q) this.f107b);
        if (t10 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) a0.B(a0Var.s().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{t10.toString()}), z.f132a);
    }

    public final void run(Scope scope) {
        String str = (String) this.f106a;
        c cVar = (c) this.f107b;
        e.D(str, "$sentryScopeName");
        e.D(cVar, "this$0");
        e.D(scope, "scope");
        scope.setTag("Scope", str);
        scope.setTag("NodleKey", (String) cVar.a("devkey", "default"));
        scope.setTag("App Name", a.a((Context) cVar.f176b));
        a.d((Context) cVar.f176b);
        String str2 = Build.MODEL;
        scope.setTag("Phone Model", str2);
        scope.setContexts("DevKey", (String) cVar.a("devkey", "default"));
        scope.setContexts("NodleSdk Version", ((Context) cVar.f176b).getString(R.string.gitSHA));
        scope.setContexts("App Name", a.a((Context) cVar.f176b));
        a.d((Context) cVar.f176b);
        scope.setContexts("Phone Model", str2);
        Integer c10 = a.c((Context) cVar.f176b);
        if (c10 != null) {
            scope.setContexts("Battery", (Number) Integer.valueOf(c10.intValue()));
        }
    }
}
