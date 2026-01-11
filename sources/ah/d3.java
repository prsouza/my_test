package ah;

import android.support.v4.media.b;
import xg.d;
import xg.e;
import xg.f;

public final class d3 extends f.b {
    public d3(d dVar, e eVar, e eVar2) {
        super(dVar, eVar, eVar2);
    }

    public d3(d dVar, e eVar, e eVar2, e[] eVarArr) {
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
            a3Var = (a3) c10.m().a(c10).a(a3Var10);
            if (a3Var.h()) {
                return new d3(dVar, a3Var, dVar.f13239c);
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
                return new d3(dVar, a3Var11, dVar.f13239c);
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
        return new d3(dVar, a3Var, a3Var3, new e[]{a3Var2});
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
        return new d3(this.f13245a, eVar, eVar2.a(eVar3), new e[]{eVar3});
    }

    public final f w() {
        if (j()) {
            return this;
        }
        d dVar = this.f13245a;
        e eVar = this.f13246b;
        if (eVar.h()) {
            return dVar.l();
        }
        e eVar2 = this.f13247c;
        e eVar3 = this.f13248d[0];
        boolean g = eVar3.g();
        e m10 = g ? eVar3 : eVar3.m();
        e a10 = g ? eVar2.m().a(eVar2) : eVar2.a(eVar3).i(eVar2);
        if (a10.h()) {
            return new d3(dVar, a10, dVar.f13239c);
        }
        e m11 = a10.m();
        e i = g ? a10 : a10.i(m10);
        e m12 = eVar2.a(eVar).m();
        if (!g) {
            eVar3 = m10.m();
        }
        return new d3(dVar, m11, m12.a(a10).a(m10).i(m12).a(eVar3).a(m11).a(i), new e[]{i});
    }

    public final f x(f fVar) {
        if (j()) {
            return fVar;
        }
        if (fVar.j()) {
            return w();
        }
        d dVar = this.f13245a;
        e eVar = this.f13246b;
        if (eVar.h()) {
            return fVar;
        }
        e eVar2 = fVar.f13246b;
        e h10 = fVar.h();
        if (eVar2.h() || !h10.g()) {
            return w().a(fVar);
        }
        e eVar3 = this.f13247c;
        e eVar4 = this.f13248d[0];
        e eVar5 = fVar.f13247c;
        e m10 = eVar.m();
        e m11 = eVar3.m();
        e m12 = eVar4.m();
        e a10 = m11.a(eVar3.i(eVar4));
        e b10 = eVar5.b();
        e j10 = b10.i(m12).a(m11).j(a10, m10, m12);
        e i = eVar2.i(m12);
        e m13 = i.a(a10).m();
        if (m13.h()) {
            return j10.h() ? fVar.w() : dVar.l();
        }
        if (j10.h()) {
            return new d3(dVar, j10, dVar.f13239c);
        }
        e i10 = j10.m().i(i);
        e i11 = j10.i(m13).i(m12);
        return new d3(dVar, i10, j10.a(m13).m().j(a10, b10, i11), new e[]{i11});
    }
}
