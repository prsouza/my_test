package t;

import c3.k;
import l6.a0;
import l6.c1;
import l6.d1;
import l6.f1;
import l6.g1;
import l6.t0;

public final class e implements f1 {

    /* renamed from: a  reason: collision with root package name */
    public int f11184a;

    /* renamed from: b  reason: collision with root package name */
    public Object f11185b;

    public /* synthetic */ e(int i) {
        this.f11185b = new Object[256];
    }

    public /* synthetic */ e(g1 g1Var, int i) {
        this.f11185b = g1Var;
        this.f11184a = i;
    }

    public final Object a() {
        int i = this.f11184a;
        if (i <= 0) {
            return null;
        }
        int i10 = i - 1;
        Object obj = this.f11185b;
        Object obj2 = ((Object[]) obj)[i10];
        ((Object[]) obj)[i10] = null;
        this.f11184a = i - 1;
        return obj2;
    }

    public final boolean b(Object obj) {
        int i = this.f11184a;
        Object[] objArr = (Object[]) this.f11185b;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.f11184a = i + 1;
        return true;
    }

    public final Object zza() {
        g1 g1Var = (g1) this.f11185b;
        int i = this.f11184a;
        d1 b10 = g1Var.b(i);
        c1 c1Var = b10.f7816c;
        if (k.h1(c1Var.f7804d)) {
            g1Var.f7864a.c(c1Var.f7801a, b10.f7815b, c1Var.f7802b);
            c1 c1Var2 = b10.f7816c;
            int i10 = c1Var2.f7804d;
            if (i10 != 5 && i10 != 6) {
                return null;
            }
            a0 a0Var = g1Var.f7864a;
            String str = c1Var2.f7801a;
            int i11 = b10.f7815b;
            long j10 = c1Var2.f7802b;
            if (!a0Var.n(str, i11, j10).exists()) {
                return null;
            }
            a0.j(a0Var.n(str, i11, j10));
            return null;
        }
        throw new t0(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }
}
