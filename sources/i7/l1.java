package i7;

import java.io.IOException;

public abstract class l1<T, B> {
    public abstract void a(B b10, int i, int i10);

    public abstract void b(B b10, int i, long j10);

    public abstract void c(B b10, int i, T t10);

    public abstract void d(B b10, int i, i iVar);

    public abstract void e(B b10, int i, long j10);

    public abstract B f(Object obj);

    public abstract T g(Object obj);

    public abstract int h(T t10);

    public abstract int i(T t10);

    public abstract void j(Object obj);

    public abstract T k(T t10, T t11);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[LOOP:0: B:16:0x002f->B:19:0x003c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(B r7, i7.e1 r8) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r8.a()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 == r2) goto L_0x0059
            r3 = 2
            if (r0 == r3) goto L_0x0051
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x0028
            if (r0 == r3) goto L_0x0026
            r3 = 5
            if (r0 != r3) goto L_0x0021
            int r8 = r8.n()
            r6.a(r7, r1, r8)
            return r2
        L_0x0021:
            i7.a0$a r7 = i7.a0.d()
            throw r7
        L_0x0026:
            r7 = 0
            return r7
        L_0x0028:
            java.lang.Object r0 = r6.m()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x002f:
            int r4 = r8.p()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x003e
            boolean r4 = r6.l(r0, r8)
            if (r4 != 0) goto L_0x002f
        L_0x003e:
            int r8 = r8.a()
            if (r3 != r8) goto L_0x004c
            java.lang.Object r8 = r6.q(r0)
            r6.c(r7, r1, r8)
            return r2
        L_0x004c:
            i7.a0 r7 = i7.a0.a()
            throw r7
        L_0x0051:
            i7.i r8 = r8.u()
            r6.d(r7, r1, r8)
            return r2
        L_0x0059:
            long r3 = r8.f()
            r6.b(r7, r1, r3)
            return r2
        L_0x0061:
            long r3 = r8.J()
            r6.e(r7, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.l1.l(java.lang.Object, i7.e1):boolean");
    }

    public abstract B m();

    public abstract void n(Object obj, B b10);

    public abstract void o(Object obj, T t10);

    public abstract void p();

    public abstract T q(B b10);

    public abstract void r(T t10, u1 u1Var) throws IOException;

    public abstract void s(T t10, u1 u1Var) throws IOException;
}
