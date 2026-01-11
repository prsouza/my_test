package ge;

import a.b;
import ad.c;
import ah.v;
import ge.a0;
import le.q;
import le.t;
import pd.d;
import pd.e;
import pd.f;
import pd.h;
import qd.a;
import xd.p;

public final class g {
    public static final void a(f fVar, Throwable th2) {
        try {
            int i = a0.f5362d;
            a0 a0Var = (a0) fVar.get(a0.a.f5363a);
            if (a0Var == null) {
                b0.a(fVar, th2);
            } else {
                a0Var.handleException(fVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                b.D(runtimeException, th2);
                th2 = runtimeException;
            }
            b0.a(fVar, th2);
        }
    }

    public static g1 b(d0 d0Var, f fVar, p pVar, int i) {
        v1 v1Var;
        if ((i & 1) != 0) {
            fVar = h.f9881a;
        }
        e0 e0Var = (i & 2) != 0 ? e0.DEFAULT : null;
        f c10 = y.c(d0Var, fVar);
        if (e0Var.isLazy()) {
            v1Var = new m1(c10, pVar);
        } else {
            v1Var = new v1(c10, true);
        }
        e0Var.invoke(pVar, v1Var, v1Var);
        return v1Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ge.t} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object c(xd.p r8) throws java.lang.InterruptedException {
        /*
            pd.h r0 = pd.h.f9881a
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            pd.e$a r2 = pd.e.a.f9879a
            java.util.Objects.requireNonNull(r0)
            r3 = 0
            ge.y1 r4 = ge.y1.f5472a
            ge.u0 r4 = ge.y1.a()
            r5 = 1
            pd.f r0 = ge.y.a(r0, r4, r5)
            me.c r6 = ge.o0.f5433a
            if (r0 == r6) goto L_0x0025
            pd.f$a r2 = r0.get(r2)
            if (r2 != 0) goto L_0x0025
            pd.f r0 = r0.plus(r6)
        L_0x0025:
            ge.e r2 = new ge.e
            r2.<init>(r0, r1, r4)
            ge.e0 r0 = ge.e0.DEFAULT
            r0.invoke(r8, r2, r2)
            ge.u0 r8 = r2.f5383s     // Catch:{ all -> 0x008e }
            r0 = 0
            if (r8 != 0) goto L_0x0035
            goto L_0x003a
        L_0x0035:
            int r1 = ge.u0.f5452t     // Catch:{ all -> 0x008e }
            r8.z0(r0)     // Catch:{ all -> 0x008e }
        L_0x003a:
            boolean r8 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x007a
            ge.u0 r8 = r2.f5383s     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x004a
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x004e
        L_0x004a:
            long r6 = r8.B0()     // Catch:{ all -> 0x0083 }
        L_0x004e:
            java.lang.Object r8 = r2.L()     // Catch:{ all -> 0x0083 }
            boolean r8 = r8 instanceof ge.b1     // Catch:{ all -> 0x0083 }
            r8 = r8 ^ r5
            if (r8 == 0) goto L_0x0076
            ge.u0 r8 = r2.f5383s     // Catch:{ all -> 0x008e }
            if (r8 != 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            int r1 = ge.u0.f5452t     // Catch:{ all -> 0x008e }
            r8.w0(r0)     // Catch:{ all -> 0x008e }
        L_0x0061:
            java.lang.Object r8 = r2.L()
            java.lang.Object r8 = a.b.R0(r8)
            boolean r0 = r8 instanceof ge.t
            if (r0 == 0) goto L_0x0070
            r3 = r8
            ge.t r3 = (ge.t) r3
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            return r8
        L_0x0073:
            java.lang.Throwable r8 = r3.f5447a
            throw r8
        L_0x0076:
            java.util.concurrent.locks.LockSupport.parkNanos(r2, r6)     // Catch:{ all -> 0x0083 }
            goto L_0x003a
        L_0x007a:
            java.lang.InterruptedException r8 = new java.lang.InterruptedException     // Catch:{ all -> 0x0083 }
            r8.<init>()     // Catch:{ all -> 0x0083 }
            r2.u(r8)     // Catch:{ all -> 0x0083 }
            throw r8     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r8 = move-exception
            ge.u0 r1 = r2.f5383s     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008d
            int r2 = ge.u0.f5452t     // Catch:{ all -> 0x008e }
            r1.w0(r0)     // Catch:{ all -> 0x008e }
        L_0x008d:
            throw r8     // Catch:{ all -> 0x008e }
        L_0x008e:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.g.c(xd.p):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    public static final Object d(f fVar, p pVar, d dVar) {
        f fVar2;
        Object obj;
        f context = dVar.getContext();
        if (!y.b(fVar)) {
            fVar2 = context.plus(fVar);
        } else {
            fVar2 = y.a(context, fVar, false);
        }
        c.G(fVar2);
        if (fVar2 == context) {
            q qVar = new q(fVar2, dVar);
            obj = aa.b.n0(qVar, qVar, pVar);
        } else {
            e.a aVar = e.a.f9879a;
            if (e6.e.r(fVar2.get(aVar), context.get(aVar))) {
                c2 c2Var = new c2(fVar2, dVar);
                Object b10 = t.b(fVar2, (Object) null);
                try {
                    Object n02 = aa.b.n0(c2Var, c2Var, pVar);
                    t.a(fVar2, b10);
                    obj = n02;
                } catch (Throwable th2) {
                    t.a(fVar2, b10);
                    throw th2;
                }
            } else {
                l0 l0Var = new l0(fVar2, dVar);
                v.z0(pVar, l0Var, l0Var);
                obj = l0Var.n0();
            }
        }
        a aVar2 = a.COROUTINE_SUSPENDED;
        return obj;
    }
}
