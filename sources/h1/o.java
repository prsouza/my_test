package h1;

import l1.e;

public abstract class o extends i0 {
    public /* synthetic */ o(e0 e0Var) {
        super(e0Var);
    }

    public abstract void e(e eVar, Object obj);

    public final void f(Object obj) {
        e a10 = a();
        try {
            e(a10, obj);
            a10.n0();
        } finally {
            d(a10);
        }
    }

    public final long g(Object obj) {
        e a10 = a();
        try {
            e(a10, obj);
            return a10.n0();
        } finally {
            d(a10);
        }
    }
}
