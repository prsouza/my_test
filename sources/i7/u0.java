package i7;

import i7.c0;
import i7.t;
import i7.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public final class u0<T> implements f1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f6381a;

    /* renamed from: b  reason: collision with root package name */
    public final l1<?, ?> f6382b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6383c;

    /* renamed from: d  reason: collision with root package name */
    public final q<?> f6384d;

    public u0(l1<?, ?> l1Var, q<?> qVar, q0 q0Var) {
        this.f6382b = l1Var;
        this.f6383c = qVar.e(q0Var);
        this.f6384d = qVar;
        this.f6381a = q0Var;
    }

    public final void a(T t10, T t11) {
        l1<?, ?> l1Var = this.f6382b;
        Class<?> cls = g1.f6262a;
        l1Var.o(t10, l1Var.k(l1Var.g(t10), l1Var.g(t11)));
        if (this.f6383c) {
            g1.A(this.f6384d, t10, t11);
        }
    }

    public final void b(T t10, u1 u1Var) throws IOException {
        Iterator<Map.Entry<?, Object>> k10 = this.f6384d.c(t10).k();
        while (k10.hasNext()) {
            Map.Entry next = k10.next();
            t.b bVar = (t.b) next.getKey();
            if (bVar.m() == t1.MESSAGE) {
                bVar.f();
                bVar.n();
                if (next instanceof c0.b) {
                    bVar.getNumber();
                    ((m) u1Var).l(0, ((c0.b) next).f6239a.getValue().b());
                } else {
                    bVar.getNumber();
                    ((m) u1Var).l(0, next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        l1<?, ?> l1Var = this.f6382b;
        l1Var.r(l1Var.g(t10), u1Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: i7.x$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(T r10, byte[] r11, int r12, int r13, i7.e.a r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            i7.x r0 = (i7.x) r0
            i7.m1 r1 = r0.unknownFields
            i7.m1 r2 = i7.m1.f6324f
            if (r1 != r2) goto L_0x0010
            i7.m1 r1 = new i7.m1
            r1.<init>()
            r0.unknownFields = r1
        L_0x0010:
            i7.x$c r10 = (i7.x.c) r10
            r10.w()
            r10 = 0
            r0 = r10
        L_0x0017:
            if (r12 >= r13) goto L_0x0097
            int r4 = i7.e.t(r11, r12, r14)
            int r2 = r14.f6252a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x004a
            r12 = r2 & 7
            if (r12 != r3) goto L_0x0045
            i7.q<?> r12 = r9.f6384d
            i7.p r0 = r14.f6255d
            i7.q0 r3 = r9.f6381a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.b(r0, r3, r5)
            r0 = r12
            i7.x$e r0 = (i7.x.e) r0
            if (r0 != 0) goto L_0x0042
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = i7.e.r(r2, r3, r4, r5, r6, r7)
            goto L_0x0017
        L_0x0042:
            i7.b1 r11 = i7.b1.f6235c
            throw r10
        L_0x0045:
            int r12 = i7.e.w(r2, r11, r4, r13, r14)
            goto L_0x0017
        L_0x004a:
            r12 = 0
            r2 = r10
        L_0x004c:
            if (r4 >= r13) goto L_0x008d
            int r4 = i7.e.t(r11, r4, r14)
            int r5 = r14.f6252a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x006e
            r8 = 3
            if (r6 == r8) goto L_0x005e
            goto L_0x0083
        L_0x005e:
            if (r0 != 0) goto L_0x006b
            if (r7 != r3) goto L_0x0083
            int r4 = i7.e.a(r11, r4, r14)
            java.lang.Object r2 = r14.f6254c
            i7.i r2 = (i7.i) r2
            goto L_0x004c
        L_0x006b:
            i7.b1 r11 = i7.b1.f6235c
            throw r10
        L_0x006e:
            if (r7 != 0) goto L_0x0083
            int r4 = i7.e.t(r11, r4, r14)
            int r12 = r14.f6252a
            i7.q<?> r0 = r9.f6384d
            i7.p r5 = r14.f6255d
            i7.q0 r6 = r9.f6381a
            java.lang.Object r0 = r0.b(r5, r6, r12)
            i7.x$e r0 = (i7.x.e) r0
            goto L_0x004c
        L_0x0083:
            r6 = 12
            if (r5 != r6) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            int r4 = i7.e.w(r5, r11, r4, r13, r14)
            goto L_0x004c
        L_0x008d:
            if (r2 == 0) goto L_0x0095
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.b(r12, r2)
        L_0x0095:
            r12 = r4
            goto L_0x0017
        L_0x0097:
            if (r12 != r13) goto L_0x009a
            return
        L_0x009a:
            i7.a0 r10 = i7.a0.g()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.u0.c(java.lang.Object, byte[], int, int, i7.e$a):void");
    }

    public final void d(T t10, e1 e1Var, p pVar) throws IOException {
        l1<?, ?> l1Var = this.f6382b;
        q<?> qVar = this.f6384d;
        Object f10 = l1Var.f(t10);
        t<?> d10 = qVar.d(t10);
        do {
            try {
                if (e1Var.p() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                l1Var.n(t10, f10);
            }
        } while (k(e1Var, pVar, qVar, d10, l1Var, f10));
    }

    public final void e(T t10) {
        this.f6382b.j(t10);
        this.f6384d.f(t10);
    }

    public final boolean f(T t10) {
        return this.f6384d.c(t10).i();
    }

    public final boolean g(T t10, T t11) {
        if (!this.f6382b.g(t10).equals(this.f6382b.g(t11))) {
            return false;
        }
        if (this.f6383c) {
            return this.f6384d.c(t10).equals(this.f6384d.c(t11));
        }
        return true;
    }

    public final int h(T t10) {
        l1<?, ?> l1Var = this.f6382b;
        int i = l1Var.i(l1Var.g(t10)) + 0;
        if (!this.f6383c) {
            return i;
        }
        t<?> c10 = this.f6384d.c(t10);
        int i10 = 0;
        for (int i11 = 0; i11 < c10.f6356a.e(); i11++) {
            i10 += c10.g(c10.f6356a.d(i11));
        }
        for (Map.Entry<T, Object> g : c10.f6356a.f()) {
            i10 += c10.g(g);
        }
        return i + i10;
    }

    public final T i() {
        return ((x.a) this.f6381a.h()).l();
    }

    public final int j(T t10) {
        int hashCode = this.f6382b.g(t10).hashCode();
        return this.f6383c ? (hashCode * 53) + this.f6384d.c(t10).hashCode() : hashCode;
    }

    public final <UT, UB, ET extends t.b<ET>> boolean k(e1 e1Var, p pVar, q<ET> qVar, t<ET> tVar, l1<UT, UB> l1Var, UB ub2) throws IOException {
        int a10 = e1Var.a();
        if (a10 == 11) {
            int i = 0;
            Object obj = null;
            i iVar = null;
            while (e1Var.p() != Integer.MAX_VALUE) {
                int a11 = e1Var.a();
                if (a11 == 16) {
                    i = e1Var.x();
                    obj = qVar.b(pVar, this.f6381a, i);
                } else if (a11 == 26) {
                    if (obj != null) {
                        qVar.h(obj);
                    } else {
                        iVar = e1Var.u();
                    }
                } else if (!e1Var.A()) {
                    break;
                }
            }
            if (e1Var.a() == 12) {
                if (iVar != null) {
                    if (obj != null) {
                        qVar.i(obj);
                    } else {
                        l1Var.d(ub2, i, iVar);
                    }
                }
                return true;
            }
            throw a0.a();
        } else if ((a10 & 7) != 2) {
            return e1Var.A();
        } else {
            Object b10 = qVar.b(pVar, this.f6381a, a10 >>> 3);
            if (b10 == null) {
                return l1Var.l(ub2, e1Var);
            }
            qVar.h(b10);
            return true;
        }
    }
}
