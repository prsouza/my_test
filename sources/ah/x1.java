package ah;

import a8.a;
import xg.b;
import xg.d;
import xg.e;
import xg.f;

public final class x1 extends f.b {
    public x1(d dVar, e eVar, e eVar2) {
        super(dVar, eVar, eVar2);
    }

    public x1(d dVar, e eVar, e eVar2, e[] eVarArr) {
        super(dVar, eVar, eVar2, eVarArr);
    }

    public final f a(f fVar) {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        e eVar6;
        if (j()) {
            return fVar;
        }
        if (fVar.j()) {
            return this;
        }
        d dVar = this.f13245a;
        e eVar7 = this.f13246b;
        e eVar8 = fVar.f13246b;
        if (eVar7.h()) {
            return eVar8.h() ? dVar.l() : fVar.a(this);
        }
        e eVar9 = this.f13247c;
        e eVar10 = this.f13248d[0];
        e eVar11 = fVar.f13247c;
        e h10 = fVar.h();
        boolean g = eVar10.g();
        if (!g) {
            eVar2 = eVar8.i(eVar10);
            eVar = eVar11.i(eVar10);
        } else {
            eVar2 = eVar8;
            eVar = eVar11;
        }
        boolean g8 = h10.g();
        if (!g8) {
            eVar7 = eVar7.i(h10);
            eVar3 = eVar9.i(h10);
        } else {
            eVar3 = eVar9;
        }
        e a10 = eVar3.a(eVar);
        e a11 = eVar7.a(eVar2);
        if (a11.h()) {
            return a10.h() ? w() : dVar.l();
        }
        if (eVar8.h()) {
            f n10 = n();
            e eVar12 = n10.f13246b;
            e g10 = n10.g();
            e c10 = g10.a(eVar11).c(eVar12);
            eVar5 = a.f(c10, c10, eVar12).a(dVar.f13238b);
            if (eVar5.h()) {
                return new x1(dVar, eVar5, dVar.f13239c.l());
            }
            eVar4 = c10.i(eVar12.a(eVar5)).a(eVar5).a(g10).c(eVar5).a(eVar5);
            eVar6 = dVar.j(b.f13229b);
        } else {
            e m10 = a11.m();
            e i = a10.i(eVar7);
            e i10 = a10.i(eVar2);
            e i11 = i.i(i10);
            if (i11.h()) {
                return new x1(dVar, i11, dVar.f13239c.l());
            }
            e i12 = a10.i(m10);
            if (!g8) {
                i12 = i12.i(h10);
            }
            eVar4 = i10.a(m10).n(i12, eVar9.a(eVar10));
            eVar5 = i11;
            eVar6 = !g ? i12.i(eVar10) : i12;
        }
        return new x1(dVar, eVar5, eVar4, new e[]{eVar6});
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
        return new x1(this.f13245a, eVar, eVar2.a(eVar3), new e[]{eVar3});
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
        e i = g ? eVar2 : eVar2.i(eVar3);
        e m10 = g ? eVar3 : eVar3.m();
        e eVar4 = dVar.f13238b;
        if (!g) {
            eVar4 = eVar4.i(m10);
        }
        e f10 = a.f(eVar2, i, eVar4);
        if (f10.h()) {
            return new x1(dVar, f10, dVar.f13239c.l());
        }
        e m11 = f10.m();
        e i10 = g ? f10 : f10.i(m10);
        if (!g) {
            eVar = eVar.i(eVar3);
        }
        return new x1(dVar, m11, eVar.n(f10, i).a(m11).a(i10), new e[]{i10});
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
        e a10 = dVar.f13238b.i(m12).a(m11).a(eVar3.i(eVar4));
        e b10 = eVar5.b();
        e j10 = dVar.f13238b.a(b10).i(m12).a(m11).j(a10, m10, m12);
        e i = eVar2.i(m12);
        e m13 = i.a(a10).m();
        if (m13.h()) {
            return j10.h() ? fVar.w() : dVar.l();
        }
        if (j10.h()) {
            return new x1(dVar, j10, dVar.f13239c.l());
        }
        e i10 = j10.m().i(i);
        e i11 = j10.i(m13).i(m12);
        return new x1(dVar, i10, j10.a(m13).m().j(a10, b10, i11), new e[]{i11});
    }
}
