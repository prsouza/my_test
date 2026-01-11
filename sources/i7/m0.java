package i7;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class m0 implements l0 {
    public final Object a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        k0 k0Var2 = (k0) obj2;
        if (!k0Var2.isEmpty()) {
            if (!k0Var.f6316a) {
                k0Var = k0Var.isEmpty() ? new k0() : new k0(k0Var);
            }
            k0Var.c();
            if (!k0Var2.isEmpty()) {
                k0Var.putAll(k0Var2);
            }
        }
        return k0Var;
    }

    public final int b(int i, Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        j0 j0Var = (j0) obj2;
        if (k0Var.isEmpty()) {
            return 0;
        }
        Iterator it = k0Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        Objects.requireNonNull(j0Var);
        l.w(i);
        throw null;
    }

    public final boolean c(Object obj) {
        return !((k0) obj).f6316a;
    }

    public final Object d(Object obj) {
        ((k0) obj).f6316a = false;
        return obj;
    }

    public final void e(Object obj) {
        Objects.requireNonNull((j0) obj);
    }

    public final Object f() {
        k0 k0Var = k0.f6315b;
        return k0Var.isEmpty() ? new k0() : new k0(k0Var);
    }

    public final Map<?, ?> g(Object obj) {
        return (k0) obj;
    }

    public final Map<?, ?> h(Object obj) {
        return (k0) obj;
    }
}
