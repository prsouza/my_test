package x8;

import a9.c;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import c9.d;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e6.e;
import h1.i;
import io.nodle.cash.R;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import ye.a;

public final /* synthetic */ class k implements Continuation, ScopeCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f13073a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13074b;

    public /* synthetic */ k(Object obj, Object obj2) {
        this.f13073a = obj;
        this.f13074b = obj2;
    }

    public final void run(Scope scope) {
        String str = (String) this.f13073a;
        c cVar = (c) this.f13074b;
        e.D(str, "$devKey");
        e.D(cVar, "this$0");
        e.D(scope, "scope");
        scope.setTag("Scope", "Nodle");
        scope.setTag("NodleKey", str);
        scope.setTag("App Name", a.a((Context) cVar.f176b));
        a.d((Context) cVar.f176b);
        String str2 = Build.MODEL;
        scope.setTag("Phone Model", str2);
        scope.setContexts("DevKey", str);
        scope.setContexts("NodleSdk Version", ((Context) cVar.f176b).getString(R.string.gitSHA));
        scope.setContexts("App Name", a.a((Context) cVar.f176b));
        a.d((Context) cVar.f176b);
        scope.setContexts("Phone Model", str2);
        Integer c10 = a.c((Context) cVar.f176b);
        if (c10 != null) {
            scope.setContexts("Battery", (Number) Integer.valueOf(c10.intValue()));
        }
    }

    public final Object then(Task task) {
        return (!PlatformVersion.isAtLeastO() || ((Integer) task.getResult()).intValue() != 402) ? task : m.a((Context) this.f13073a, (Intent) this.f13074b).continueWith(d.f3279a, i.f5729b);
    }
}
