package ah;

import android.support.v4.media.b;
import xg.d;
import xg.e;
import xg.f;

public final class g3 extends f.b {
    public g3(d dVar, e eVar, e eVar2) {
        super(dVar, eVar, eVar2);
    }

    public g3(d dVar, e eVar, e eVar2, e[] eVarArr) {
        super(dVar, eVar, eVar2, eVarArr);
    }

    public final f a(f fVar) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        a3 a3Var;
        a3 a3Var2;
        a3 a3Var3;
        f fVar2 = fVar;
        if (j()) {
            return fVar2;
        }
        if (fVar.j()) {
            return this;
        }
        d dVar = this.f13245a;
        a3 a3Var4 = (a3) this.f13246b;
        a3 a3Var5 = (a3) fVar2.f13246b;
        if (a3Var4.h()) {
            return a3Var5.h() ? dVar.l() : fVar2.a(this);
        }
        a3 a3Var6 = (a3) this.f13247c;
        a3 a3Var7 = (a3) this.f13248d[0];
        a3 a3Var8 = (a3) fVar2.f13247c;
        a3 a3Var9 = (a3) fVar.h();
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[9];
        long[] jArr7 = new long[9];
        long[] e02 = a3Var7.g() ? null : v.e0(a3Var7.f477f);
        if (e02 == null) {
            jArr = a3Var5.f477f;
            jArr2 = a3Var8.f477f;
        } else {
            v.Z(a3Var5.f477f, e02, jArr5);
            v.Z(a3Var8.f477f, e02, jArr7);
            jArr2 = jArr7;
            jArr = jArr5;
        }
        long[] e03 = a3Var9.g() ? null : v.e0(a3Var9.f477f);
        long[] jArr8 = a3Var4.f477f;
        if (e03 == null) {
            jArr3 = a3Var6.f477f;
        } else {
            v.Z(jArr8, e03, jArr4);
            v.Z(a3Var6.f477f, e03, jArr6);
            jArr8 = jArr4;
            jArr3 = jArr6;
        }
        v.p(jArr3, jArr2, jArr6);
        v.p(jArr8, jArr, jArr7);
        if (b.d1(jArr7)) {
            return b.d1(jArr6) ? w() : dVar.l();
        }
        if (a3Var5.h()) {
            f n10 = n();
            a3 a3Var10 = (a3) n10.f13246b;
            e g = n10.g();
            e c10 = g.a(a3Var8).c(a3Var10);
            a3Var = (a3) c10.m().a(c10).a(a3Var10).b();
            if (a3Var.h()) {
                return new g3(dVar, a3Var, f3.f519m);
            }
            a3Var3 = (a3) c10.i(a3Var10.a(a3Var)).a(a3Var).a(g).c(a3Var).a(a3Var);
            a3Var2 = (a3) dVar.j(xg.b.f13229b);
        } else {
            v.s0(jArr7, jArr7);
            long[] e04 = v.e0(jArr6);
            v.Z(jArr8, e04, jArr4);
            v.Z(jArr, e04, jArr5);
            a3 a3Var11 = new a3(jArr4);
            v.U(jArr4, jArr5, jArr4);
            if (a3Var11.h()) {
                return new g3(dVar, a3Var11, f3.f519m);
            }
            a3 a3Var12 = new a3(jArr6);
            v.Z(jArr7, e04, jArr6);
            if (e03 != null) {
                long[] jArr9 = a3Var12.f477f;
                v.Z(jArr9, e03, jArr9);
            }
            long[] jArr10 = new long[18];
            v.p(jArr5, jArr7, jArr7);
            v.u0(jArr7, jArr10);
            v.p(a3Var6.f477f, a3Var7.f477f, jArr7);
            v.X(jArr7, a3Var12.f477f, jArr10);
            a3 a3Var13 = new a3(jArr7);
            v.h0(jArr10, jArr7);
            if (e02 != null) {
                long[] jArr11 = a3Var12.f477f;
                v.Z(jArr11, e02, jArr11);
            }
            a3Var = a3Var11;
            a3Var3 = a3Var13;
            a3Var2 = a3Var12;
        }
        return new g3(dVar, a3Var, a3Var3, new e[]{a3Var2});
    }

    public final boolean d() {
        e eVar = this.f13246b;
        if (!eVar.h() && this.f13247c.p() != eVar.p()) {
            return true;
        }
        return false;
    }

    public final e g() {
        e eVar = this.f13246b;
        e eVar2 = this.f13247c;
        if (j() || eVar.h()) {
            return eVar2;
        }
        e i = eVar2.a(eVar).i(eVar);
        e eVar3 = this.f13248d[0];
        return !eVar3.g() ? i.c(eVar3) : i;
    }

    public final f m() {
        if (j()) {
            return this;
        }
        e eVar = this.f13246b;
        if (eVar.h()) {
            return this;
        }
        e eVar2 = this.f13247c;
        e eVar3 = this.f13248d[0];
        return new g3(this.f13245a, eVar, eVar2.a(eVar3), new e[]{eVar3});
    }

    public final f w() {
        long[] jArr;
        if (j()) {
            return this;
        }
        d dVar = this.f13245a;
        a3 a3Var = (a3) this.f13246b;
        if (a3Var.h()) {
            return dVar.l();
        }
        a3 a3Var2 = (a3) this.f13247c;
        a3 a3Var3 = (a3) this.f13248d[0];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        long[] e02 = a3Var3.g() ? null : v.e0(a3Var3.f477f);
        long[] jArr4 = a3Var2.f477f;
        if (e02 == null) {
            jArr = a3Var3.f477f;
        } else {
            v.Z(jArr4, e02, jArr2);
            v.s0(a3Var3.f477f, jArr3);
            jArr4 = jArr2;
            jArr = jArr3;
        }
        long[] jArr5 = new long[9];
        v.s0(a3Var2.f477f, jArr5);
        v.s(jArr4, jArr, jArr5);
        if (b.d1(jArr5)) {
            return new g3(dVar, new a3(jArr5), f3.f519m);
        }
        long[] jArr6 = new long[18];
        v.X(jArr5, jArr4, jArr6);
        a3 a3Var4 = new a3(jArr2);
        v.s0(jArr5, jArr2);
        a3 a3Var5 = new a3(jArr5);
        if (e02 != null) {
            v.U(jArr5, jArr, jArr5);
        }
        long[] jArr7 = a3Var.f477f;
        if (e02 != null) {
            v.Z(jArr7, e02, jArr3);
            jArr7 = jArr3;
        }
        v.u0(jArr7, jArr6);
        v.h0(jArr6, jArr3);
        v.s(a3Var4.f477f, a3Var5.f477f, jArr3);
        return new g3(dVar, a3Var4, new a3(jArr3), new e[]{a3Var5});
    }

    public final f x(f fVar) {
        if (j()) {
            return fVar;
        }
        if (fVar.j()) {
            return w();
        }
        d dVar = this.f13245a;
        a3 a3Var = (a3) this.f13246b;
        if (a3Var.h()) {
            return fVar;
        }
        a3 a3Var2 = (a3) fVar.f13246b;
        a3 a3Var3 = (a3) fVar.h();
        if (a3Var2.h() || !a3Var3.g()) {
            return w().a(fVar);
        }
        a3 a3Var4 = (a3) this.f13247c;
        a3 a3Var5 = (a3) this.f13248d[0];
        a3 a3Var6 = (a3) fVar.f13247c;
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        v.s0(a3Var.f477f, jArr);
        v.s0(a3Var4.f477f, jArr2);
        v.s0(a3Var5.f477f, jArr3);
        v.U(a3Var4.f477f, a3Var5.f477f, jArr4);
        v.s(jArr3, jArr2, jArr4);
        long[] e02 = v.e0(jArr3);
        v.Z(a3Var6.f477f, e02, jArr3);
        v.p(jArr3, jArr2, jArr3);
        long[] jArr5 = new long[18];
        v.X(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[18];
        v.N(jArr, e02, jArr6);
        v.t(jArr5, jArr6, jArr5);
        v.h0(jArr5, jArr3);
        v.Z(a3Var2.f477f, e02, jArr);
        v.p(jArr, jArr4, jArr2);
        v.s0(jArr2, jArr2);
        if (b.d1(jArr2)) {
            return b.d1(jArr3) ? fVar.w() : dVar.l();
        }
        if (b.d1(jArr3)) {
            return new g3(dVar, new a3(jArr3), f3.f519m);
        }
        a3 a3Var7 = new a3();
        v.s0(jArr3, a3Var7.f477f);
        long[] jArr7 = a3Var7.f477f;
        v.U(jArr7, jArr, jArr7);
        a3 a3Var8 = new a3(jArr);
        v.U(jArr3, jArr2, jArr);
        long[] jArr8 = a3Var8.f477f;
        v.Z(jArr8, e02, jArr8);
        a3 a3Var9 = new a3(jArr2);
        v.p(jArr3, jArr2, jArr2);
        long[] jArr9 = a3Var9.f477f;
        v.s0(jArr9, jArr9);
        for (int i = 0; i < 18; i++) {
            jArr5[i] = 0;
        }
        v.X(a3Var9.f477f, jArr4, jArr5);
        v.u(a3Var6.f477f, jArr4);
        v.X(jArr4, a3Var8.f477f, jArr5);
        v.h0(jArr5, a3Var9.f477f);
        return new g3(dVar, a3Var7, a3Var9, new e[]{a3Var8});
    }
}
