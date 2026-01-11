package ge;

import a.b;
import e6.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class k1 extends v implements q0, b1 {

    /* renamed from: s  reason: collision with root package name */
    public l1 f5409s;

    public final boolean a() {
        return true;
    }

    public final void e() {
        boolean z;
        l1 y10 = y();
        do {
            Object L = y10.L();
            if (L instanceof k1) {
                if (L == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l1.f5416a;
                    t0 t0Var = b.f10x;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(y10, L, t0Var)) {
                            if (atomicReferenceFieldUpdater.get(y10) != L) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else if ((L instanceof b1) && ((b1) L).g() != null) {
                u();
                return;
            } else {
                return;
            }
        } while (!z);
    }

    public final o1 g() {
        return null;
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + g0.o(this) + "[job@" + g0.o(y()) + ']';
    }

    public final l1 y() {
        l1 l1Var = this.f5409s;
        if (l1Var != null) {
            return l1Var;
        }
        e.c0("job");
        throw null;
    }
}
