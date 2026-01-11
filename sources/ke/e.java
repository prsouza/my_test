package ke;

import aa.b;
import c3.k;
import ge.d0;
import ge.e0;
import ge.y;
import ie.d;
import ie.n;
import ie.p;
import java.util.ArrayList;
import md.m;
import pd.f;
import pd.h;
import qd.a;
import xd.l;

public abstract class e<T> implements je.e {

    /* renamed from: a  reason: collision with root package name */
    public final f f7512a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7513b;

    /* renamed from: c  reason: collision with root package name */
    public final d f7514c;

    public e(f fVar, int i, d dVar) {
        this.f7512a = fVar;
        this.f7513b = i;
        this.f7514c = dVar;
    }

    public Object b(je.f<? super T> fVar, pd.d<? super m> dVar) {
        Object d02 = k.d0(new c(fVar, this, (pd.d<? super c>) null), dVar);
        return d02 == a.COROUTINE_SUSPENDED ? d02 : m.f8555a;
    }

    public String c() {
        return null;
    }

    public abstract Object d(n<? super T> nVar, pd.d<? super m> dVar);

    public p<T> e(d0 d0Var) {
        f fVar = this.f7512a;
        int i = this.f7513b;
        if (i == -3) {
            i = -2;
        }
        d dVar = this.f7514c;
        e0 e0Var = e0.ATOMIC;
        d dVar2 = new d(this, (pd.d<? super d>) null);
        ie.m mVar = new ie.m(y.c(d0Var, fVar), b.c(i, dVar, 4));
        e0Var.invoke(dVar2, mVar, mVar);
        return mVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c10 = c();
        if (c10 != null) {
            arrayList.add(c10);
        }
        f fVar = this.f7512a;
        if (fVar != h.f9881a) {
            arrayList.add(e6.e.a0("context=", fVar));
        }
        int i = this.f7513b;
        if (i != -3) {
            arrayList.add(e6.e.a0("capacity=", Integer.valueOf(i)));
        }
        d dVar = this.f7514c;
        if (dVar != d.SUSPEND) {
            arrayList.add(e6.e.a0("onBufferOverflow=", dVar));
        }
        return getClass().getSimpleName() + '[' + nd.m.b1(arrayList, ", ", (CharSequence) null, (CharSequence) null, (l) null, 62) + ']';
    }
}
