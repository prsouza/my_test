package tb;

import android.app.Application;
import androidx.lifecycle.b;
import c3.k;
import e6.e;
import gb.f;
import gb.g;
import io.sentry.protocol.App;
import java.util.List;
import je.i;
import je.n;
import je.o;

public final class r extends b {

    /* renamed from: s  reason: collision with root package name */
    public final Application f11515s;

    /* renamed from: t  reason: collision with root package name */
    public final String f11516t = r.class.getSimpleName();

    /* renamed from: u  reason: collision with root package name */
    public final o f11517u;

    /* renamed from: v  reason: collision with root package name */
    public final n<g> f11518v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Application application) {
        super(application);
        e.D(application, App.TYPE);
        this.f11515s = application;
        o oVar = new o(new g((List) null, false, (f) null, 7, (k) null));
        this.f11517u = oVar;
        this.f11518v = new i(oVar);
    }
}
