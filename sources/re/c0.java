package re;

import b9.m;
import c3.k;
import e6.e;
import oe.b;
import oe.f;
import qe.a;

public abstract class c0<K, V, R> implements b<R> {

    /* renamed from: a  reason: collision with root package name */
    public final b<K> f10681a;

    /* renamed from: b  reason: collision with root package name */
    public final b<V> f10682b;

    public c0(b bVar, b bVar2, k kVar) {
        this.f10681a = bVar;
        this.f10682b = bVar2;
    }

    public final R b(qe.b bVar) {
        e.D(bVar, "decoder");
        a B = bVar.B(a());
        B.l();
        Object obj = g1.f10700a;
        Object obj2 = g1.f10700a;
        Object obj3 = obj2;
        while (true) {
            int k10 = B.k(a());
            if (k10 == -1) {
                B.j(a());
                Object obj4 = g1.f10700a;
                Object obj5 = g1.f10700a;
                if (obj2 == obj5) {
                    throw new f("Element 'key' is missing");
                } else if (obj3 != obj5) {
                    return c(obj2, obj3);
                } else {
                    throw new f("Element 'value' is missing");
                }
            } else if (k10 == 0) {
                obj2 = B.u(a(), 0, this.f10681a);
            } else if (k10 == 1) {
                obj3 = B.u(a(), 1, this.f10682b);
            } else {
                throw new f(m.b("Invalid index: ", k10));
            }
        }
    }

    public abstract R c(K k10, V v10);
}
