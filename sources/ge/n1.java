package ge;

import le.l;
import me.c;

public abstract class n1 extends z {
    public String toString() {
        String x02 = x0();
        if (x02 != null) {
            return x02;
        }
        return getClass().getSimpleName() + '@' + g0.o(this);
    }

    public abstract n1 w0();

    public final String x0() {
        n1 n1Var;
        c cVar = o0.f5433a;
        n1 n1Var2 = l.f8259a;
        if (this == n1Var2) {
            return "Dispatchers.Main";
        }
        try {
            n1Var = n1Var2.w0();
        } catch (UnsupportedOperationException unused) {
            n1Var = null;
        }
        if (this == n1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
