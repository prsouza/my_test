package ie;

import ah.v;
import e6.e;
import ie.b;
import java.util.ArrayList;
import le.g;
import le.h;
import le.r;
import le.x;
import md.m;
import y.c;

public final class l<E> extends a<E> {
    public l(xd.l<? super E, m> lVar) {
        super(lVar);
    }

    public final boolean i() {
        return false;
    }

    public final boolean l() {
        return false;
    }

    public final Object m(E e10) {
        q qVar;
        do {
            Object m10 = super.m(e10);
            r rVar = v.f621x;
            if (m10 == rVar) {
                return rVar;
            }
            if (m10 == v.f622y) {
                g gVar = this.f6421b;
                b.a aVar = new b.a(e10);
                while (true) {
                    h q10 = gVar.q();
                    if (!(q10 instanceof q)) {
                        if (q10.i(aVar, gVar)) {
                            qVar = null;
                            break;
                        }
                    } else {
                        qVar = (q) q10;
                        break;
                    }
                }
                if (qVar == null) {
                    return v.f621x;
                }
            } else if (m10 instanceof h) {
                return m10;
            } else {
                throw new IllegalStateException(e.a0("Invalid offerInternal result ", m10).toString());
            }
        } while (!(qVar instanceof h));
        return qVar;
    }

    public final boolean s() {
        return true;
    }

    public final boolean t() {
        return true;
    }

    public final void w(Object obj, h<?> hVar) {
        x xVar = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                s sVar = (s) obj;
                if (sVar instanceof b.a) {
                    xd.l<E, m> lVar = this.f6420a;
                    if (lVar != null) {
                        xVar = c.p(lVar, ((b.a) sVar).f6422s, (x) null);
                    }
                } else {
                    sVar.z(hVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    x xVar2 = null;
                    while (true) {
                        int i = size - 1;
                        s sVar2 = (s) arrayList.get(size);
                        if (sVar2 instanceof b.a) {
                            xd.l<E, m> lVar2 = this.f6420a;
                            xVar2 = lVar2 == null ? null : c.p(lVar2, ((b.a) sVar2).f6422s, xVar2);
                        } else {
                            sVar2.z(hVar);
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                    xVar = xVar2;
                }
            }
        }
        if (xVar != null) {
            throw xVar;
        }
    }
}
