package re;

import ah.v;
import md.i;
import md.m;
import oe.b;
import pe.e;
import pe.f;
import xd.l;
import yd.h;

public final class f1<A, B, C> implements b<i<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a  reason: collision with root package name */
    public final f f10693a = ((f) v.y("kotlin.Triple", new e[0], new a(this)));

    /* renamed from: b  reason: collision with root package name */
    public final b<A> f10694b;

    /* renamed from: c  reason: collision with root package name */
    public final b<B> f10695c;

    /* renamed from: d  reason: collision with root package name */
    public final b<C> f10696d;

    public static final class a extends h implements l<pe.a, m> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f1 f10697b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f1 f1Var) {
            super(1);
            this.f10697b = f1Var;
        }

        public final Object k(Object obj) {
            pe.a aVar = (pe.a) obj;
            e6.e.D(aVar, "$receiver");
            pe.a.a(aVar, "first", this.f10697b.f10694b.a());
            pe.a.a(aVar, "second", this.f10697b.f10695c.a());
            pe.a.a(aVar, "third", this.f10697b.f10696d.a());
            return m.f8555a;
        }
    }

    public f1(b<A> bVar, b<B> bVar2, b<C> bVar3) {
        this.f10694b = bVar;
        this.f10695c = bVar2;
        this.f10696d = bVar3;
    }

    public final e a() {
        return this.f10693a;
    }

    public final Object b(qe.b bVar) {
        e6.e.D(bVar, "decoder");
        qe.a B = bVar.B(this.f10693a);
        B.l();
        Object obj = g1.f10700a;
        Object obj2 = g1.f10700a;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int k10 = B.k(this.f10693a);
            if (k10 == -1) {
                B.j(this.f10693a);
                Object obj5 = g1.f10700a;
                Object obj6 = g1.f10700a;
                if (obj2 == obj6) {
                    throw new oe.f("Element 'first' is missing");
                } else if (obj3 == obj6) {
                    throw new oe.f("Element 'second' is missing");
                } else if (obj4 != obj6) {
                    return new i(obj2, obj3, obj4);
                } else {
                    throw new oe.f("Element 'third' is missing");
                }
            } else if (k10 == 0) {
                obj2 = B.u(this.f10693a, 0, this.f10694b);
            } else if (k10 == 1) {
                obj3 = B.u(this.f10693a, 1, this.f10695c);
            } else if (k10 == 2) {
                obj4 = B.u(this.f10693a, 2, this.f10696d);
            } else {
                throw new oe.f(b9.m.b("Unexpected index ", k10));
            }
        }
    }
}
