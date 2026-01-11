package v;

import t.b;
import t.g;
import v.d;
import v.e;

public final class a extends i {

    /* renamed from: t0  reason: collision with root package name */
    public int f12023t0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f12024u0 = true;

    /* renamed from: v0  reason: collision with root package name */
    public int f12025v0 = 0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f12026w0 = false;

    public final boolean B() {
        return this.f12026w0;
    }

    public final boolean C() {
        return this.f12026w0;
    }

    public final boolean U() {
        int i;
        int i10;
        int i11;
        int i12 = 0;
        boolean z = true;
        while (true) {
            i = this.f12106s0;
            if (i12 >= i) {
                break;
            }
            e eVar = this.f12105r0[i12];
            if ((this.f12024u0 || eVar.d()) && ((((i10 = this.f12023t0) == 0 || i10 == 1) && !eVar.B()) || (((i11 = this.f12023t0) == 2 || i11 == 3) && !eVar.C()))) {
                z = false;
            }
            i12++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i13 = 0;
        boolean z10 = false;
        for (int i14 = 0; i14 < this.f12106s0; i14++) {
            e eVar2 = this.f12105r0[i14];
            if (this.f12024u0 || eVar2.d()) {
                if (!z10) {
                    int i15 = this.f12023t0;
                    if (i15 == 0) {
                        i13 = eVar2.h(d.b.LEFT).c();
                    } else if (i15 == 1) {
                        i13 = eVar2.h(d.b.RIGHT).c();
                    } else if (i15 == 2) {
                        i13 = eVar2.h(d.b.TOP).c();
                    } else if (i15 == 3) {
                        i13 = eVar2.h(d.b.BOTTOM).c();
                    }
                    z10 = true;
                }
                int i16 = this.f12023t0;
                if (i16 == 0) {
                    i13 = Math.min(i13, eVar2.h(d.b.LEFT).c());
                } else if (i16 == 1) {
                    i13 = Math.max(i13, eVar2.h(d.b.RIGHT).c());
                } else if (i16 == 2) {
                    i13 = Math.min(i13, eVar2.h(d.b.TOP).c());
                } else if (i16 == 3) {
                    i13 = Math.max(i13, eVar2.h(d.b.BOTTOM).c());
                }
            }
        }
        int i17 = i13 + this.f12025v0;
        int i18 = this.f12023t0;
        if (i18 == 0 || i18 == 1) {
            J(i17, i17);
        } else {
            K(i17, i17);
        }
        this.f12026w0 = true;
        return true;
    }

    public final int V() {
        int i = this.f12023t0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public final void c(t.d dVar, boolean z) {
        d[] dVarArr;
        boolean z10;
        int i;
        int i10;
        d[] dVarArr2 = this.R;
        dVarArr2[0] = this.J;
        dVarArr2[2] = this.K;
        dVarArr2[1] = this.L;
        dVarArr2[3] = this.M;
        int i11 = 0;
        while (true) {
            dVarArr = this.R;
            if (i11 >= dVarArr.length) {
                break;
            }
            dVarArr[i11].i = dVar.l(dVarArr[i11]);
            i11++;
        }
        int i12 = this.f12023t0;
        if (i12 >= 0 && i12 < 4) {
            d dVar2 = dVarArr[i12];
            if (!this.f12026w0) {
                U();
            }
            if (this.f12026w0) {
                this.f12026w0 = false;
                int i13 = this.f12023t0;
                if (i13 == 0 || i13 == 1) {
                    dVar.e(this.J.i, this.f12051a0);
                    dVar.e(this.L.i, this.f12051a0);
                } else if (i13 == 2 || i13 == 3) {
                    dVar.e(this.K.i, this.b0);
                    dVar.e(this.M.i, this.b0);
                }
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= this.f12106s0) {
                        z10 = false;
                        break;
                    }
                    e eVar = this.f12105r0[i14];
                    if ((this.f12024u0 || eVar.d()) && ((((i10 = this.f12023t0) == 0 || i10 == 1) && eVar.U[0] == e.b.MATCH_CONSTRAINT && eVar.J.f12047f != null && eVar.L.f12047f != null) || ((i10 == 2 || i10 == 3) && eVar.U[1] == e.b.MATCH_CONSTRAINT && eVar.K.f12047f != null && eVar.M.f12047f != null))) {
                        z10 = true;
                    } else {
                        i14++;
                    }
                }
                z10 = true;
                boolean z11 = this.J.e() || this.L.e();
                boolean z12 = this.K.e() || this.M.e();
                boolean z13 = !z10 && (((i = this.f12023t0) == 0 && z11) || ((i == 2 && z12) || ((i == 1 && z11) || (i == 3 && z12))));
                int i15 = 5;
                if (!z13) {
                    i15 = 4;
                }
                for (int i16 = 0; i16 < this.f12106s0; i16++) {
                    e eVar2 = this.f12105r0[i16];
                    if (this.f12024u0 || eVar2.d()) {
                        g l10 = dVar.l(eVar2.R[this.f12023t0]);
                        d[] dVarArr3 = eVar2.R;
                        int i17 = this.f12023t0;
                        dVarArr3[i17].i = l10;
                        int i18 = (dVarArr3[i17].f12047f == null || dVarArr3[i17].f12047f.f12045d != this) ? 0 : dVarArr3[i17].g + 0;
                        if (i17 == 0 || i17 == 2) {
                            b m10 = dVar.m();
                            g n10 = dVar.n();
                            n10.f11193s = 0;
                            m10.e(dVar2.i, l10, n10, this.f12025v0 - i18);
                            dVar.c(m10);
                        } else {
                            b m11 = dVar.m();
                            g n11 = dVar.n();
                            n11.f11193s = 0;
                            m11.d(dVar2.i, l10, n11, this.f12025v0 + i18);
                            dVar.c(m11);
                        }
                        dVar.d(dVar2.i, l10, this.f12025v0 + i18, i15);
                    }
                }
                int i19 = this.f12023t0;
                if (i19 == 0) {
                    dVar.d(this.L.i, this.J.i, 0, 8);
                    dVar.d(this.J.i, this.V.L.i, 0, 4);
                    dVar.d(this.J.i, this.V.J.i, 0, 0);
                } else if (i19 == 1) {
                    dVar.d(this.J.i, this.L.i, 0, 8);
                    dVar.d(this.J.i, this.V.J.i, 0, 4);
                    dVar.d(this.J.i, this.V.L.i, 0, 0);
                } else if (i19 == 2) {
                    dVar.d(this.M.i, this.K.i, 0, 8);
                    dVar.d(this.K.i, this.V.M.i, 0, 4);
                    dVar.d(this.K.i, this.V.K.i, 0, 0);
                } else if (i19 == 3) {
                    dVar.d(this.K.i, this.M.i, 0, 8);
                    dVar.d(this.K.i, this.V.K.i, 0, 4);
                    dVar.d(this.K.i, this.V.M.i, 0, 0);
                }
            }
        }
    }

    public final boolean d() {
        return true;
    }

    public final String toString() {
        String e10 = android.support.v4.media.a.e(a.a.d("[Barrier] "), this.f12066j0, " {");
        for (int i = 0; i < this.f12106s0; i++) {
            e eVar = this.f12105r0[i];
            if (i > 0) {
                e10 = a8.a.c(e10, ", ");
            }
            StringBuilder d10 = a.a.d(e10);
            d10.append(eVar.f12066j0);
            e10 = d10.toString();
        }
        return a8.a.c(e10, "}");
    }
}
