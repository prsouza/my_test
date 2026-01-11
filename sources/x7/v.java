package x7;

import java.util.Objects;
import w7.a;

public final /* synthetic */ class v implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f12986a;

    public /* synthetic */ v(x xVar) {
        this.f12986a = xVar;
    }

    public final void a(String str) {
        x xVar = this.f12986a;
        Objects.requireNonNull(xVar);
        long currentTimeMillis = System.currentTimeMillis() - xVar.f12992d;
        q qVar = xVar.g;
        qVar.f12963e.b(new r(qVar, currentTimeMillis, str));
    }
}
