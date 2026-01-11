package ge;

public class j1 extends l1 implements r {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5407b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j1(g1 g1Var) {
        super(true);
        l1 y10;
        boolean z = true;
        P(g1Var);
        o K = K();
        p pVar = K instanceof p ? (p) K : null;
        l1 y11 = pVar == null ? null : pVar.y();
        if (y11 == null) {
            z = false;
        } else {
            while (true) {
                if (!y11.H()) {
                    o K2 = y11.K();
                    p pVar2 = K2 instanceof p ? (p) K2 : null;
                    if (pVar2 == null) {
                        y10 = null;
                        continue;
                    } else {
                        y10 = pVar2.y();
                        continue;
                    }
                    if (y11 == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            z = false;
        }
        this.f5407b = z;
    }

    public final boolean H() {
        return this.f5407b;
    }

    public final boolean I() {
        return true;
    }
}
