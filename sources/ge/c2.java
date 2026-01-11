package ge;

import ad.c;
import le.q;
import le.t;
import md.f;
import pd.d;

public final class c2<T> extends q<T> {

    /* renamed from: s  reason: collision with root package name */
    public ThreadLocal<f<pd.f, Object>> f5379s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c2(pd.f r3, pd.d<? super T> r4) {
        /*
            r2 = this;
            ge.d2 r0 = ge.d2.f5381a
            pd.f$a r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000c
            pd.f r3 = r3.plus(r0)
        L_0x000c:
            r2.<init>(r3, r4)
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2.f5379s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.c2.<init>(pd.f, pd.d):void");
    }

    public final void k0(Object obj) {
        f fVar = this.f5379s.get();
        c2<?> c2Var = null;
        if (fVar != null) {
            t.a((pd.f) fVar.f8541a, fVar.f8542b);
            this.f5379s.set(c2Var);
        }
        Object j02 = c.j0(obj);
        d<T> dVar = this.f8264c;
        pd.f context = dVar.getContext();
        Object b10 = t.b(context, c2Var);
        if (b10 != t.f8267a) {
            c2Var = y.d(dVar, context, b10);
        }
        try {
            this.f8264c.resumeWith(j02);
        } finally {
            if (c2Var == null || c2Var.n0()) {
                t.a(context, b10);
            }
        }
    }

    public final boolean n0() {
        if (this.f5379s.get() == null) {
            return false;
        }
        this.f5379s.set((Object) null);
        return true;
    }
}
