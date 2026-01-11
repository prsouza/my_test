package rd;

import pd.d;
import yd.e;
import yd.v;

public abstract class i extends c implements e<Object> {
    private final int arity;

    public i(int i, d<Object> dVar) {
        super(dVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String a10 = v.f13623a.a(this);
        e6.e.C(a10, "renderLambdaToString(this)");
        return a10;
    }

    public i(int i) {
        this(i, (d<Object>) null);
    }
}
