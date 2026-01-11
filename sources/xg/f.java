package xg;

import java.math.BigInteger;
import java.util.Hashtable;
import xg.d;
import xg.e;

public abstract class f {

    /* renamed from: f  reason: collision with root package name */
    public static final e[] f13244f = new e[0];

    /* renamed from: a  reason: collision with root package name */
    public d f13245a;

    /* renamed from: b  reason: collision with root package name */
    public e f13246b;

    /* renamed from: c  reason: collision with root package name */
    public e f13247c;

    /* renamed from: d  reason: collision with root package name */
    public e[] f13248d;

    /* renamed from: e  reason: collision with root package name */
    public Hashtable f13249e;

    public class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13250a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f13251b;

        public a(boolean z, boolean z10) {
            this.f13250a = z;
            this.f13251b = z10;
        }

        public final l a(l lVar) {
            o oVar = lVar instanceof o ? (o) lVar : null;
            if (oVar == null) {
                oVar = new o();
            }
            if (oVar.f13268a) {
                return oVar;
            }
            if (!oVar.f13269b) {
                if (this.f13250a || f.this.p()) {
                    oVar.f13269b = true;
                } else {
                    oVar.f13268a = true;
                    return oVar;
                }
            }
            if (this.f13251b && !oVar.f13270c) {
                if (!f.this.q()) {
                    oVar.f13268a = true;
                    return oVar;
                }
                oVar.f13270c = true;
            }
            return oVar;
        }
    }

    public static abstract class b extends f {
        public b(d dVar, e eVar, e eVar2) {
            super(dVar, eVar, eVar2);
        }

        public b(d dVar, e eVar, e eVar2, e[] eVarArr) {
            super(dVar, eVar, eVar2, eVarArr);
        }

        public final boolean p() {
            e eVar;
            e eVar2;
            d dVar = this.f13245a;
            e eVar3 = this.f13246b;
            e eVar4 = dVar.f13238b;
            e eVar5 = dVar.f13239c;
            int i = dVar.f13242f;
            if (i == 6) {
                e eVar6 = this.f13248d[0];
                boolean g = eVar6.g();
                if (eVar3.h()) {
                    e m10 = this.f13247c.m();
                    if (!g) {
                        eVar5 = eVar5.i(eVar6.m());
                    }
                    return m10.equals(eVar5);
                }
                e eVar7 = this.f13247c;
                e m11 = eVar3.m();
                if (g) {
                    eVar2 = a8.a.f(eVar7, eVar7, eVar4);
                    eVar = m11.m().a(eVar5);
                } else {
                    e m12 = eVar6.m();
                    e m13 = m12.m();
                    eVar2 = eVar7.a(eVar6).j(eVar7, eVar4, m12);
                    eVar = m11.n(eVar5, m13);
                }
                return eVar2.i(m11).equals(eVar);
            }
            e eVar8 = this.f13247c;
            e i10 = eVar8.a(eVar3).i(eVar8);
            if (i != 0) {
                if (i == 1) {
                    e eVar9 = this.f13248d[0];
                    if (!eVar9.g()) {
                        e i11 = eVar9.i(eVar9.m());
                        i10 = i10.i(eVar9);
                        eVar4 = eVar4.i(eVar9);
                        eVar5 = eVar5.i(i11);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return i10.equals(eVar3.a(eVar4).i(eVar3.m()).a(eVar5));
        }

        public final boolean q() {
            BigInteger bigInteger = this.f13245a.f13241e;
            if (b.f13230c.equals(bigInteger)) {
                return ((e.a) n().c()).t() != 0;
            }
            if (!b.f13232e.equals(bigInteger)) {
                return f.super.q();
            }
            f n10 = n();
            e c10 = n10.c();
            d dVar = this.f13245a;
            e s10 = ((d.a) dVar).s(c10.a(dVar.f13238b));
            if (s10 == null) {
                return false;
            }
            if (n10.k()) {
                if (((e.a) c10.i(s10).a(n10.g())).t() == 0) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("point not in normal form");
        }

        public final f r(e eVar) {
            if (j()) {
                return this;
            }
            int e10 = e();
            if (e10 == 5) {
                e eVar2 = this.f13246b;
                e eVar3 = this.f13247c;
                return this.f13245a.f(eVar2, eVar3.a(eVar2).c(eVar).a(eVar2.i(eVar)), this.f13248d);
            } else if (e10 != 6) {
                return f.super.r(eVar);
            } else {
                e eVar4 = this.f13246b;
                e eVar5 = this.f13247c;
                e eVar6 = this.f13248d[0];
                e i = eVar4.i(eVar.m());
                e a10 = eVar5.a(eVar4).a(i);
                e i10 = eVar6.i(eVar);
                return this.f13245a.f(i, a10, new e[]{i10});
            }
        }

        public final f s(e eVar) {
            if (j()) {
                return this;
            }
            int e10 = e();
            if (e10 != 5 && e10 != 6) {
                return f.super.s(eVar);
            }
            e eVar2 = this.f13246b;
            return this.f13245a.f(eVar2, this.f13247c.a(eVar2).i(eVar).a(eVar2), this.f13248d);
        }

        public final f t(f fVar) {
            return fVar.j() ? this : a(fVar.m());
        }

        public final b y(int i) {
            f fVar;
            if (j()) {
                return this;
            }
            d dVar = this.f13245a;
            int i10 = dVar.f13242f;
            e eVar = this.f13246b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                e eVar2 = this.f13247c;
                e eVar3 = this.f13248d[0];
                fVar = dVar.f(eVar.o(i), eVar2.o(i), new e[]{eVar3.o(i)});
                return (b) fVar;
            }
            fVar = dVar.e(eVar.o(i), this.f13247c.o(i));
            return (b) fVar;
        }
    }

    public static abstract class c extends f {
        public c(d dVar, e eVar, e eVar2) {
            super(dVar, eVar, eVar2);
        }

        public c(d dVar, e eVar, e eVar2, e[] eVarArr) {
            super(dVar, eVar, eVar2, eVarArr);
        }

        public final boolean d() {
            if (k()) {
                return g().p();
            }
            throw new IllegalStateException("point not in normal form");
        }

        public final boolean p() {
            e eVar = this.f13246b;
            e eVar2 = this.f13247c;
            d dVar = this.f13245a;
            e eVar3 = dVar.f13238b;
            e eVar4 = dVar.f13239c;
            e m10 = eVar2.m();
            int e10 = e();
            if (e10 != 0) {
                if (e10 == 1) {
                    e eVar5 = this.f13248d[0];
                    if (!eVar5.g()) {
                        e m11 = eVar5.m();
                        e i = eVar5.i(m11);
                        m10 = m10.i(eVar5);
                        eVar3 = eVar3.i(m11);
                        eVar4 = eVar4.i(i);
                    }
                } else if (e10 == 2 || e10 == 3 || e10 == 4) {
                    e eVar6 = this.f13248d[0];
                    if (!eVar6.g()) {
                        e m12 = eVar6.m();
                        e m13 = m12.m();
                        e i10 = m12.i(m13);
                        eVar3 = eVar3.i(m13);
                        eVar4 = eVar4.i(i10);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return m10.equals(eVar.m().a(eVar3).i(eVar).a(eVar4));
        }

        public final f t(f fVar) {
            return fVar.j() ? this : a(fVar.m());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(xg.d r7, xg.e r8, xg.e r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0007
        L_0x0005:
            int r1 = r7.f13242f
        L_0x0007:
            if (r1 == 0) goto L_0x0041
            r2 = 5
            if (r1 == r2) goto L_0x0041
            java.math.BigInteger r2 = xg.b.f13229b
            xg.e r2 = r7.j(r2)
            r3 = 1
            if (r1 == r3) goto L_0x003c
            r4 = 2
            if (r1 == r4) goto L_0x003c
            r5 = 3
            if (r1 == r5) goto L_0x0033
            r5 = 4
            if (r1 == r5) goto L_0x002a
            r4 = 6
            if (r1 != r4) goto L_0x0022
            goto L_0x003c
        L_0x0022:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "unknown coordinate system"
            r7.<init>(r8)
            throw r7
        L_0x002a:
            xg.e[] r1 = new xg.e[r4]
            r1[r0] = r2
            xg.e r0 = r7.f13238b
            r1[r3] = r0
            goto L_0x0043
        L_0x0033:
            xg.e[] r1 = new xg.e[r5]
            r1[r0] = r2
            r1[r3] = r2
            r1[r4] = r2
            goto L_0x0043
        L_0x003c:
            xg.e[] r1 = new xg.e[r3]
            r1[r0] = r2
            goto L_0x0043
        L_0x0041:
            xg.e[] r1 = f13244f
        L_0x0043:
            r6.<init>(r7, r8, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.f.<init>(xg.d, xg.e, xg.e):void");
    }

    public f(d dVar, e eVar, e eVar2, e[] eVarArr) {
        this.f13249e = null;
        this.f13245a = dVar;
        this.f13246b = eVar;
        this.f13247c = eVar2;
        this.f13248d = eVarArr;
    }

    public abstract f a(f fVar);

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(xg.f r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            xg.d r1 = r8.f13245a
            xg.d r2 = r9.f13245a
            r3 = 1
            if (r1 != 0) goto L_0x000d
            r4 = r3
            goto L_0x000e
        L_0x000d:
            r4 = r0
        L_0x000e:
            if (r2 != 0) goto L_0x0012
            r5 = r3
            goto L_0x0013
        L_0x0012:
            r5 = r0
        L_0x0013:
            boolean r6 = r8.j()
            boolean r7 = r9.j()
            if (r6 != 0) goto L_0x0068
            if (r7 == 0) goto L_0x0020
            goto L_0x0068
        L_0x0020:
            if (r4 == 0) goto L_0x0025
            if (r5 == 0) goto L_0x0025
            goto L_0x002b
        L_0x0025:
            if (r4 == 0) goto L_0x002d
            xg.f r9 = r9.n()
        L_0x002b:
            r1 = r8
            goto L_0x004e
        L_0x002d:
            if (r5 == 0) goto L_0x0034
            xg.f r1 = r8.n()
            goto L_0x004e
        L_0x0034:
            boolean r2 = r1.i(r2)
            if (r2 != 0) goto L_0x003b
            return r0
        L_0x003b:
            r2 = 2
            xg.f[] r4 = new xg.f[r2]
            r4[r0] = r8
            xg.f r9 = r1.m(r9)
            r4[r3] = r9
            r9 = 0
            r1.n(r4, r0, r2, r9)
            r1 = r4[r0]
            r9 = r4[r3]
        L_0x004e:
            xg.e r2 = r1.f13246b
            xg.e r4 = r9.f13246b
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0067
            xg.e r1 = r1.g()
            xg.e r9 = r9.g()
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L_0x0067
            r0 = r3
        L_0x0067:
            return r0
        L_0x0068:
            if (r6 == 0) goto L_0x0077
            if (r7 == 0) goto L_0x0077
            if (r4 != 0) goto L_0x0076
            if (r5 != 0) goto L_0x0076
            boolean r9 = r1.i(r2)
            if (r9 == 0) goto L_0x0077
        L_0x0076:
            r0 = r3
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.f.b(xg.f):boolean");
    }

    public final e c() {
        if (k()) {
            return this.f13246b;
        }
        throw new IllegalStateException("point not in normal form");
    }

    public abstract boolean d();

    public final int e() {
        d dVar = this.f13245a;
        if (dVar == null) {
            return 0;
        }
        return dVar.f13242f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return b((f) obj);
    }

    public final byte[] f(boolean z) {
        if (j()) {
            return new byte[1];
        }
        f n10 = n();
        byte[] d10 = n10.f13246b.d();
        if (z) {
            byte[] bArr = new byte[(d10.length + 1)];
            bArr[0] = (byte) (n10.d() ? 3 : 2);
            System.arraycopy(d10, 0, bArr, 1, d10.length);
            return bArr;
        }
        byte[] d11 = n10.g().d();
        byte[] bArr2 = new byte[(d10.length + d11.length + 1)];
        bArr2[0] = 4;
        System.arraycopy(d10, 0, bArr2, 1, d10.length);
        System.arraycopy(d11, 0, bArr2, d10.length + 1, d11.length);
        return bArr2;
    }

    public e g() {
        return this.f13247c;
    }

    public e h() {
        e[] eVarArr = this.f13248d;
        if (eVarArr.length <= 0) {
            return null;
        }
        return eVarArr[0];
    }

    public final int hashCode() {
        int i;
        d dVar = this.f13245a;
        if (dVar == null) {
            i = 0;
        } else {
            i = ~dVar.hashCode();
        }
        if (j()) {
            return i;
        }
        f n10 = n();
        return (i ^ (n10.f13246b.hashCode() * 17)) ^ (n10.g().hashCode() * 257);
    }

    public final boolean i(boolean z, boolean z10) {
        if (j()) {
            return true;
        }
        return !((o) this.f13245a.o(this, "bc_validity", new a(z, z10))).f13268a;
    }

    public final boolean j() {
        if (!(this.f13246b == null || this.f13247c == null)) {
            e[] eVarArr = this.f13248d;
            if (eVarArr.length <= 0 || !eVarArr[0].h()) {
                return false;
            }
        }
        return true;
    }

    public final boolean k() {
        int e10 = e();
        return e10 == 0 || e10 == 5 || j() || this.f13248d[0].g();
    }

    public final f l(BigInteger bigInteger) {
        android.support.v4.media.b bVar;
        d dVar = this.f13245a;
        synchronized (dVar) {
            if (dVar.f13243h == null) {
                dVar.f13243h = dVar.c();
            }
            bVar = dVar.f13243h;
        }
        return bVar.w1(this, bigInteger);
    }

    public abstract f m();

    public final f n() {
        int e10;
        if (j() || (e10 = e()) == 0 || e10 == 5) {
            return this;
        }
        e h10 = h();
        return h10.g() ? this : o(h10.f());
    }

    public final f o(e eVar) {
        int e10 = e();
        if (e10 != 1) {
            if (e10 == 2 || e10 == 3 || e10 == 4) {
                e m10 = eVar.m();
                return this.f13245a.e(this.f13246b.i(m10), this.f13247c.i(m10.i(eVar)));
            } else if (e10 != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return this.f13245a.e(this.f13246b.i(eVar), this.f13247c.i(eVar));
    }

    public abstract boolean p();

    public boolean q() {
        BigInteger bigInteger;
        if (b.f13229b.equals(this.f13245a.f13241e) || (bigInteger = this.f13245a.f13240d) == null) {
            return true;
        }
        BigInteger abs = bigInteger.abs();
        f l10 = this.f13245a.l();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                l10 = this;
            }
            f fVar = this;
            for (int i = 1; i < bitLength; i++) {
                fVar = fVar.w();
                if (abs.testBit(i)) {
                    l10 = l10.a(fVar);
                }
            }
        }
        if (bigInteger.signum() < 0) {
            l10 = l10.m();
        }
        if (l10.j()) {
            return true;
        }
        return false;
    }

    public f r(e eVar) {
        if (j()) {
            return this;
        }
        return this.f13245a.f(this.f13246b.i(eVar), this.f13247c, this.f13248d);
    }

    public f s(e eVar) {
        if (j()) {
            return this;
        }
        return this.f13245a.f(this.f13246b, this.f13247c.i(eVar), this.f13248d);
    }

    public abstract f t(f fVar);

    public final String toString() {
        if (j()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(this.f13246b);
        stringBuffer.append(',');
        stringBuffer.append(this.f13247c);
        for (e append : this.f13248d) {
            stringBuffer.append(',');
            stringBuffer.append(append);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public f u() {
        return x(this);
    }

    public final f v(int i) {
        if (i >= 0) {
            f fVar = this;
            while (true) {
                i--;
                if (i < 0) {
                    return fVar;
                }
                fVar = fVar.w();
            }
        } else {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
    }

    public abstract f w();

    public f x(f fVar) {
        return w().a(fVar);
    }
}
