package i7;

import i7.u1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public final class n1 extends l1<m1, m1> {
    public final void a(Object obj, int i, int i10) {
        ((m1) obj).b((i << 3) | 5, Integer.valueOf(i10));
    }

    public final void b(Object obj, int i, long j10) {
        ((m1) obj).b((i << 3) | 1, Long.valueOf(j10));
    }

    public final void c(Object obj, int i, Object obj2) {
        ((m1) obj).b((i << 3) | 3, (m1) obj2);
    }

    public final void d(Object obj, int i, i iVar) {
        ((m1) obj).b((i << 3) | 2, iVar);
    }

    public final void e(Object obj, int i, long j10) {
        ((m1) obj).b((i << 3) | 0, Long.valueOf(j10));
    }

    public final Object f(Object obj) {
        x xVar = (x) obj;
        m1 m1Var = xVar.unknownFields;
        if (m1Var != m1.f6324f) {
            return m1Var;
        }
        m1 m1Var2 = new m1();
        xVar.unknownFields = m1Var2;
        return m1Var2;
    }

    public final Object g(Object obj) {
        return ((x) obj).unknownFields;
    }

    public final int h(Object obj) {
        return ((m1) obj).a();
    }

    public final int i(Object obj) {
        m1 m1Var = (m1) obj;
        int i = m1Var.f6328d;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < m1Var.f6325a; i11++) {
            i10 += l.c(3, (i) m1Var.f6327c[i11]) + l.x(2, m1Var.f6326b[i11] >>> 3) + (l.w(1) * 2);
        }
        m1Var.f6328d = i10;
        return i10;
    }

    public final void j(Object obj) {
        ((x) obj).unknownFields.f6329e = false;
    }

    public final Object k(Object obj, Object obj2) {
        m1 m1Var = (m1) obj;
        m1 m1Var2 = (m1) obj2;
        if (m1Var2.equals(m1.f6324f)) {
            return m1Var;
        }
        int i = m1Var.f6325a + m1Var2.f6325a;
        int[] copyOf = Arrays.copyOf(m1Var.f6326b, i);
        System.arraycopy(m1Var2.f6326b, 0, copyOf, m1Var.f6325a, m1Var2.f6325a);
        Object[] copyOf2 = Arrays.copyOf(m1Var.f6327c, i);
        System.arraycopy(m1Var2.f6327c, 0, copyOf2, m1Var.f6325a, m1Var2.f6325a);
        return new m1(i, copyOf, copyOf2, true);
    }

    public final Object m() {
        return new m1();
    }

    public final void n(Object obj, Object obj2) {
        ((x) obj).unknownFields = (m1) obj2;
    }

    public final void o(Object obj, Object obj2) {
        ((x) obj).unknownFields = (m1) obj2;
    }

    public final void p() {
    }

    public final Object q(Object obj) {
        m1 m1Var = (m1) obj;
        m1Var.f6329e = false;
        return m1Var;
    }

    public final void r(Object obj, u1 u1Var) throws IOException {
        m1 m1Var = (m1) obj;
        Objects.requireNonNull(m1Var);
        m mVar = (m) u1Var;
        Objects.requireNonNull(mVar);
        if (u1.a.ASCENDING == u1.a.DESCENDING) {
            int i = m1Var.f6325a;
            while (true) {
                i--;
                if (i >= 0) {
                    mVar.l(m1Var.f6326b[i] >>> 3, m1Var.f6327c[i]);
                } else {
                    return;
                }
            }
        } else {
            for (int i10 = 0; i10 < m1Var.f6325a; i10++) {
                mVar.l(m1Var.f6326b[i10] >>> 3, m1Var.f6327c[i10]);
            }
        }
    }

    public final void s(Object obj, u1 u1Var) throws IOException {
        ((m1) obj).d(u1Var);
    }
}
