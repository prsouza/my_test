package rd;

import pd.d;
import yd.e;
import yd.v;

public abstract class h extends g implements e<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final int f10674a = 2;

    public h(d dVar) {
        super(dVar);
    }

    public final int getArity() {
        return this.f10674a;
    }

    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String a10 = v.f13623a.a(this);
        e6.e.C(a10, "renderLambdaToString(this)");
        return a10;
    }
}
