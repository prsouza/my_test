package re;

import e6.e;
import oe.b;

public abstract class a<Element, Collection, Builder> implements b<Collection> {
    public Collection b(qe.b bVar) {
        e.D(bVar, "decoder");
        return e(bVar);
    }

    public abstract Builder c();

    public abstract int d(Builder builder);

    public final Object e(qe.b bVar) {
        e.D(bVar, "decoder");
        Object c10 = c();
        int d10 = d(c10);
        qe.a B = bVar.B(a());
        B.l();
        while (true) {
            int k10 = B.k(a());
            if (k10 == -1) {
                B.j(a());
                return h(c10);
            }
            f(B, k10 + d10, c10, true);
        }
    }

    public abstract void f(qe.a aVar, int i, Builder builder, boolean z);

    public abstract Builder g(Collection collection);

    public abstract Collection h(Builder builder);
}
