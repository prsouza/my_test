package pf;

import e6.e;
import ge.g0;
import java.util.Objects;
import lf.a;

public final class m extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f9992e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f9993f;
    public final /* synthetic */ b g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(String str, f fVar, int i, b bVar) {
        super(str, true);
        this.f9992e = fVar;
        this.f9993f = i;
        this.g = bVar;
    }

    public final long a() {
        g0 g0Var = this.f9992e.A;
        b bVar = this.g;
        Objects.requireNonNull(g0Var);
        e.D(bVar, "errorCode");
        synchronized (this.f9992e) {
            this.f9992e.P.remove(Integer.valueOf(this.f9993f));
        }
        return -1;
    }
}
