package v;

import t.d;
import v.e;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static boolean[] f12107a = new boolean[3];

    public static void a(f fVar, d dVar, e eVar) {
        eVar.f12075o = -1;
        eVar.f12077p = -1;
        e.b bVar = fVar.U[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.U[0] == e.b.MATCH_PARENT) {
            int i = eVar.J.g;
            int r10 = fVar.r() - eVar.L.g;
            d dVar2 = eVar.J;
            dVar2.i = dVar.l(dVar2);
            d dVar3 = eVar.L;
            dVar3.i = dVar.l(dVar3);
            dVar.e(eVar.J.i, i);
            dVar.e(eVar.L.i, r10);
            eVar.f12075o = 2;
            eVar.f12051a0 = i;
            int i10 = r10 - i;
            eVar.W = i10;
            int i11 = eVar.f12056d0;
            if (i10 < i11) {
                eVar.W = i11;
            }
        }
        if (fVar.U[1] != bVar2 && eVar.U[1] == e.b.MATCH_PARENT) {
            int i12 = eVar.K.g;
            int k10 = fVar.k() - eVar.M.g;
            d dVar4 = eVar.K;
            dVar4.i = dVar.l(dVar4);
            d dVar5 = eVar.M;
            dVar5.i = dVar.l(dVar5);
            dVar.e(eVar.K.i, i12);
            dVar.e(eVar.M.i, k10);
            if (eVar.f12054c0 > 0 || eVar.f12064i0 == 8) {
                d dVar6 = eVar.N;
                dVar6.i = dVar.l(dVar6);
                dVar.e(eVar.N.i, eVar.f12054c0 + i12);
            }
            eVar.f12077p = 2;
            eVar.b0 = i12;
            int i13 = k10 - i12;
            eVar.X = i13;
            int i14 = eVar.f12058e0;
            if (i13 < i14) {
                eVar.X = i14;
            }
        }
    }

    public static final boolean b(int i, int i10) {
        return (i & i10) == i10;
    }
}
