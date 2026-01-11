package te;

import e6.e;
import fe.p;
import pe.c;
import pe.i;
import pe.j;
import qe.a;
import qe.b;
import se.d;

public final class n implements d, b, a {

    /* renamed from: a  reason: collision with root package name */
    public final android.support.v4.media.b f11597a;

    /* renamed from: b  reason: collision with root package name */
    public int f11598b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final c f11599c;

    /* renamed from: d  reason: collision with root package name */
    public final se.a f11600d;

    /* renamed from: e  reason: collision with root package name */
    public final p f11601e;

    /* renamed from: f  reason: collision with root package name */
    public final h f11602f;

    public n(se.a aVar, p pVar, h hVar) {
        e.D(aVar, "json");
        e.D(pVar, "mode");
        e.D(hVar, "reader");
        this.f11600d = aVar;
        this.f11601e = pVar;
        this.f11602f = hVar;
        c cVar = aVar.f11102a;
        this.f11597a = cVar.f11577k;
        this.f11599c = cVar;
    }

    public final float A() {
        try {
            float parseFloat = Float.parseFloat(this.f11602f.h());
            if (!this.f11600d.f11102a.f11576j) {
                if (!(!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                    a.b.O0(this.f11602f, Float.valueOf(parseFloat));
                    throw null;
                }
            }
            return parseFloat;
        } catch (Throwable unused) {
            h.d(this.f11602f, "Failed to parse 'float'");
            throw null;
        }
    }

    public final a B(pe.e eVar) {
        p pVar;
        e.D(eVar, "descriptor");
        se.a aVar = this.f11600d;
        e.D(aVar, "$this$switchMode");
        i c10 = eVar.c();
        if (c10 instanceof c) {
            pVar = p.POLY_OBJ;
        } else if (e.r(c10, j.b.f9919a)) {
            pVar = p.LIST;
        } else if (e.r(c10, j.c.f9920a)) {
            pe.e g = eVar.g(0);
            i c11 = g.c();
            if ((c11 instanceof pe.d) || e.r(c11, i.b.f9917a)) {
                pVar = p.MAP;
            } else if (aVar.f11102a.f11572d) {
                pVar = p.LIST;
            } else {
                throw a.b.h(g);
            }
        } else {
            pVar = p.OBJ;
        }
        if (pVar.begin != 0) {
            h hVar = this.f11602f;
            if (hVar.f11581b == pVar.beginTc) {
                hVar.g();
            } else {
                StringBuilder d10 = a.a.d("Expected '");
                d10.append(pVar.begin);
                d10.append(", kind: ");
                d10.append(eVar.c());
                d10.append('\'');
                hVar.c(d10.toString(), hVar.f11582c);
                throw null;
            }
        }
        int i = m.f11595a[pVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new n(this.f11600d, pVar, this.f11602f);
        }
        if (this.f11601e == pVar) {
            return this;
        }
        return new n(this.f11600d, pVar, this.f11602f);
    }

    public final long C(pe.e eVar, int i) {
        e.D(eVar, "descriptor");
        return a();
    }

    public final double D() {
        try {
            double parseDouble = Double.parseDouble(this.f11602f.h());
            if (!this.f11600d.f11102a.f11576j) {
                if (!(!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                    a.b.O0(this.f11602f, Double.valueOf(parseDouble));
                    throw null;
                }
            }
            return parseDouble;
        } catch (Throwable unused) {
            h.d(this.f11602f, "Failed to parse 'double'");
            throw null;
        }
    }

    public final long a() {
        try {
            return Long.parseLong(this.f11602f.h());
        } catch (Throwable unused) {
            h.d(this.f11602f, "Failed to parse 'long'");
            throw null;
        }
    }

    public final boolean b() {
        if (this.f11599c.f11571c) {
            return o.a(this.f11602f.h());
        }
        h hVar = this.f11602f;
        if (hVar.f11581b == 0) {
            return o.a(hVar.i(true));
        }
        hVar.c("Expected start of the unquoted boolean literal.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", hVar.f11582c);
        throw null;
    }

    public final boolean c() {
        return this.f11602f.f11581b != 10;
    }

    public final boolean d(pe.e eVar, int i) {
        e.D(eVar, "descriptor");
        return b();
    }

    public final <T> T e(oe.a<T> aVar) {
        e.D(aVar, "deserializer");
        return aa.b.D(this, aVar);
    }

    public final char f() {
        try {
            return p.E1(this.f11602f.h());
        } catch (Throwable unused) {
            h.d(this.f11602f, "Failed to parse 'char'");
            throw null;
        }
    }

    public final byte g(pe.e eVar, int i) {
        e.D(eVar, "descriptor");
        return q();
    }

    public final String h(pe.e eVar, int i) {
        e.D(eVar, "descriptor");
        return z();
    }

    public final float i(pe.e eVar, int i) {
        e.D(eVar, "descriptor");
        return A();
    }

    public final void j(pe.e eVar) {
        e.D(eVar, "descriptor");
        p pVar = this.f11601e;
        if (pVar.end != 0) {
            h hVar = this.f11602f;
            if (hVar.f11581b == pVar.endTc) {
                hVar.g();
                return;
            }
            StringBuilder d10 = a.a.d("Expected '");
            d10.append(this.f11601e.end);
            d10.append('\'');
            hVar.c(d10.toString(), hVar.f11582c);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        if (r10.a(r11) == -3) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x00b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int k(pe.e r15) {
        /*
            r14 = this;
            java.lang.String r0 = "descriptor"
            e6.e.D(r15, r0)
            te.h r0 = r14.f11602f
            byte r1 = r0.f11581b
            r2 = 0
            r3 = 4
            r4 = 0
            r5 = -1
            r6 = 1
            if (r1 != r3) goto L_0x0025
            int r7 = r14.f11598b
            if (r7 == r5) goto L_0x0016
            r7 = r6
            goto L_0x0017
        L_0x0016:
            r7 = r4
        L_0x0017:
            int r8 = r0.f11580a
            if (r7 == 0) goto L_0x001f
            r0.g()
            goto L_0x0025
        L_0x001f:
            java.lang.String r15 = "Unexpected leading comma"
            r0.c(r15, r8)
            throw r2
        L_0x0025:
            te.p r0 = r14.f11601e
            int[] r7 = te.m.f11596b
            int r0 = r0.ordinal()
            r0 = r7[r0]
            java.lang.String r7 = "Unexpected trailing comma"
            if (r0 == r6) goto L_0x01c4
            r8 = 2
            r9 = 5
            if (r0 == r8) goto L_0x0179
            r8 = 3
            if (r0 == r8) goto L_0x016b
            if (r1 != r3) goto L_0x004b
            te.h r0 = r14.f11602f
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0045
            goto L_0x004b
        L_0x0045:
            te.h r15 = r14.f11602f
            te.h.d(r15, r7)
            throw r2
        L_0x004b:
            te.h r0 = r14.f11602f
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x01ec
            int r0 = r14.f11598b
            int r0 = r0 + r6
            r14.f11598b = r0
            java.lang.String r0 = r14.z()
            te.h r1 = r14.f11602f
            byte r8 = r1.f11581b
            if (r8 != r9) goto L_0x0163
            r1.g()
            int r1 = r15.a(r0)
            r8 = -3
            if (r1 == r8) goto L_0x00b7
            te.c r10 = r14.f11599c
            boolean r10 = r10.g
            if (r10 == 0) goto L_0x00b4
            pe.e r10 = r15.g(r1)
            te.h r11 = r14.f11602f
            byte r11 = r11.f11581b
            r12 = 10
            if (r11 != r12) goto L_0x0085
            boolean r11 = r10.f()
            if (r11 != 0) goto L_0x0085
            goto L_0x00ad
        L_0x0085:
            pe.i r11 = r10.c()
            pe.i$b r12 = pe.i.b.f9917a
            boolean r11 = e6.e.r(r11, r12)
            if (r11 == 0) goto L_0x00af
            te.h r11 = r14.f11602f
            te.c r12 = r14.f11599c
            boolean r12 = r12.f11571c
            byte r13 = r11.f11581b
            if (r13 == r6) goto L_0x00a1
            if (r12 == 0) goto L_0x009f
            if (r13 == 0) goto L_0x00a1
        L_0x009f:
            r11 = r2
            goto L_0x00a5
        L_0x00a1:
            java.lang.String r11 = r11.i(r4)
        L_0x00a5:
            if (r11 == 0) goto L_0x00af
            int r10 = r10.a(r11)
            if (r10 != r8) goto L_0x00af
        L_0x00ad:
            r8 = r6
            goto L_0x00b0
        L_0x00af:
            r8 = r4
        L_0x00b0:
            if (r8 == 0) goto L_0x00b4
            r1 = r4
            goto L_0x00b8
        L_0x00b4:
            r4 = r1
            goto L_0x01f8
        L_0x00b7:
            r1 = r6
        L_0x00b8:
            if (r1 == 0) goto L_0x00dd
            te.c r1 = r14.f11599c
            boolean r1 = r1.f11570b
            if (r1 == 0) goto L_0x00c1
            goto L_0x00dd
        L_0x00c1:
            te.h r15 = r14.f11602f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Encountered an unknown key '"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            te.h.d(r15, r0)
            throw r2
        L_0x00dd:
            te.h r0 = r14.f11602f
            byte r1 = r0.f11581b
            r8 = 8
            r10 = 6
            if (r1 == r10) goto L_0x00ec
            if (r1 == r8) goto L_0x00ec
            r0.g()
            goto L_0x0148
        L_0x00ec:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x00f1:
            byte r1 = r0.f11581b
            switch(r1) {
                case 6: goto L_0x0137;
                case 7: goto L_0x0117;
                case 8: goto L_0x0137;
                case 9: goto L_0x00f7;
                default: goto L_0x00f6;
            }
        L_0x00f6:
            goto L_0x013e
        L_0x00f7:
            java.lang.Object r1 = nd.m.c1(r11)
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            if (r1 != r8) goto L_0x010c
            int r1 = r11.size()
            int r1 = r1 + r5
            r11.remove(r1)
            goto L_0x013e
        L_0x010c:
            int r15 = r0.f11580a
            java.lang.String r0 = r0.g
            java.lang.String r1 = "found ] instead of }"
            te.d r15 = a.b.j(r15, r1, r0)
            throw r15
        L_0x0117:
            java.lang.Object r1 = nd.m.c1(r11)
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            if (r1 != r10) goto L_0x012c
            int r1 = r11.size()
            int r1 = r1 + r5
            r11.remove(r1)
            goto L_0x013e
        L_0x012c:
            int r15 = r0.f11580a
            java.lang.String r0 = r0.g
            java.lang.String r1 = "found } instead of ]"
            te.d r15 = a.b.j(r15, r1, r0)
            throw r15
        L_0x0137:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r11.add(r1)
        L_0x013e:
            r0.g()
            boolean r1 = r11.isEmpty()
            r1 = r1 ^ r6
            if (r1 != 0) goto L_0x00f1
        L_0x0148:
            te.h r0 = r14.f11602f
            byte r1 = r0.f11581b
            if (r1 != r3) goto L_0x004b
            r0.g()
            te.h r0 = r14.f11602f
            boolean r1 = r0.f()
            te.h r8 = r14.f11602f
            int r8 = r8.f11580a
            if (r1 == 0) goto L_0x015f
            goto L_0x004b
        L_0x015f:
            r0.c(r7, r8)
            throw r2
        L_0x0163:
            int r15 = r1.f11582c
            java.lang.String r0 = "Expected ':'"
            r1.c(r0, r15)
            throw r2
        L_0x016b:
            int r15 = r14.f11598b
            int r15 = r15 + r6
            r14.f11598b = r15
            if (r15 == 0) goto L_0x01f8
            if (r15 == r6) goto L_0x0176
            goto L_0x01ec
        L_0x0176:
            r4 = r6
            goto L_0x01f8
        L_0x0179:
            if (r1 == r3) goto L_0x0190
            int r15 = r14.f11598b
            int r15 = r15 % r8
            if (r15 != r6) goto L_0x0190
            te.h r15 = r14.f11602f
            r0 = 7
            byte r10 = r15.f11581b
            if (r10 != r0) goto L_0x0188
            goto L_0x0190
        L_0x0188:
            int r0 = r15.f11582c
            java.lang.String r1 = "Expected end of the object or comma"
            r15.c(r1, r0)
            throw r2
        L_0x0190:
            int r15 = r14.f11598b
            int r15 = r15 % r8
            if (r15 != 0) goto L_0x01a7
            te.h r15 = r14.f11602f
            byte r0 = r15.f11581b
            if (r0 != r9) goto L_0x019f
            r15.g()
            goto L_0x01a7
        L_0x019f:
            int r0 = r15.f11582c
            java.lang.String r1 = "Expected ':' after the key"
            r15.c(r1, r0)
            throw r2
        L_0x01a7:
            te.h r15 = r14.f11602f
            boolean r15 = r15.f()
            if (r15 != 0) goto L_0x01bd
            te.h r15 = r14.f11602f
            if (r1 == r3) goto L_0x01b4
            r4 = r6
        L_0x01b4:
            int r0 = r15.f11580a
            if (r4 == 0) goto L_0x01b9
            goto L_0x01ec
        L_0x01b9:
            r15.c(r7, r0)
            throw r2
        L_0x01bd:
            int r15 = r14.f11598b
            int r4 = r15 + 1
            r14.f11598b = r4
            goto L_0x01f8
        L_0x01c4:
            if (r1 == r3) goto L_0x01db
            int r15 = r14.f11598b
            if (r15 == r5) goto L_0x01db
            te.h r15 = r14.f11602f
            r0 = 9
            byte r8 = r15.f11581b
            if (r8 != r0) goto L_0x01d3
            goto L_0x01db
        L_0x01d3:
            int r0 = r15.f11582c
            java.lang.String r1 = "Expected end of the array or comma"
            r15.c(r1, r0)
            throw r2
        L_0x01db:
            te.h r15 = r14.f11602f
            boolean r15 = r15.f()
            if (r15 != 0) goto L_0x01f2
            te.h r15 = r14.f11602f
            if (r1 == r3) goto L_0x01e8
            r4 = r6
        L_0x01e8:
            int r0 = r15.f11580a
            if (r4 == 0) goto L_0x01ee
        L_0x01ec:
            r4 = r5
            goto L_0x01f8
        L_0x01ee:
            r15.c(r7, r0)
            throw r2
        L_0x01f2:
            int r15 = r14.f11598b
            int r4 = r15 + 1
            r14.f11598b = r4
        L_0x01f8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: te.n.k(pe.e):int");
    }

    public final void l() {
    }

    public final se.a m() {
        return this.f11600d;
    }

    public final se.e n() {
        return new g(this.f11600d.f11102a, this.f11602f).a();
    }

    public final int o() {
        try {
            return Integer.parseInt(this.f11602f.h());
        } catch (Throwable unused) {
            h.d(this.f11602f, "Failed to parse 'int'");
            throw null;
        }
    }

    public final android.support.v4.media.b p() {
        return this.f11597a;
    }

    public final byte q() {
        try {
            return Byte.parseByte(this.f11602f.h());
        } catch (Throwable unused) {
            h.d(this.f11602f, "Failed to parse 'byte'");
            throw null;
        }
    }

    public final char r(pe.e eVar, int i) {
        e.D(eVar, "descriptor");
        return f();
    }

    public final double s(pe.e eVar, int i) {
        e.D(eVar, "descriptor");
        return D();
    }

    public final short t(pe.e eVar, int i) {
        e.D(eVar, "descriptor");
        return y();
    }

    public final Object u(pe.e eVar, int i, oe.a aVar) {
        e.D(eVar, "descriptor");
        e.D(aVar, "deserializer");
        return aa.b.D(this, aVar);
    }

    public final int v(pe.e eVar, int i) {
        e.D(eVar, "descriptor");
        return o();
    }

    public final void w() {
        h hVar = this.f11602f;
        if (hVar.f11581b == 10) {
            hVar.g();
        } else {
            hVar.c("Expected 'null' literal", hVar.f11582c);
            throw null;
        }
    }

    public final int x(pe.e eVar) {
        e.D(eVar, "enumDescriptor");
        return jc.b.t(eVar, z());
    }

    public final short y() {
        try {
            return Short.parseShort(this.f11602f.h());
        } catch (Throwable unused) {
            h.d(this.f11602f, "Failed to parse 'short'");
            throw null;
        }
    }

    public final String z() {
        if (this.f11599c.f11571c) {
            return this.f11602f.h();
        }
        return this.f11602f.j();
    }
}
