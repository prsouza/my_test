package w9;

import md.m;
import xd.p;
import yd.h;
import yi.a;

public final class i extends h implements p<a, byte[], m> {

    /* renamed from: b  reason: collision with root package name */
    public static final i f12620b = new i();

    public i() {
        super(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        r3 = (r3 = r3.r()).f2759u;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
        /*
            r26 = this;
            r0 = r27
            yi.a r0 = (yi.a) r0
            r1 = r28
            byte[] r1 = (byte[]) r1
            java.lang.String r2 = "vm"
            e6.e.D(r0, r2)
            java.lang.String r2 = "$noName_1"
            e6.e.D(r1, r2)
            oi.a r1 = a.b.t(r0)
            wi.d r2 = wi.d.OP_DTN_SEND
            yi.b.a(r0, r2)
            b.k r2 = r0.b()
            r3 = 148(0x94, float:2.07E-43)
            b.j r2 = r2.r(r3)
            r4 = 0
            if (r2 != 0) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            b.b r2 = r2.r()
            if (r2 != 0) goto L_0x0032
        L_0x0030:
            r6 = r4
            goto L_0x0034
        L_0x0032:
            long r6 = r2.f2757s
        L_0x0034:
            b.k r2 = r0.b()
            b.j r2 = r2.r(r3)
            if (r2 != 0) goto L_0x003f
            goto L_0x0048
        L_0x003f:
            b.b r2 = r2.r()
            if (r2 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            long r4 = r2.f2758t
        L_0x0048:
            long r8 = c3.k.k(r0)
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            java.lang.String r10 = " max="
            if (r2 > 0) goto L_0x0153
            java.lang.String r2 = new java.lang.String
            byte[] r4 = e6.e.o(r0)
            java.nio.charset.Charset r5 = fe.a.f5086b
            r2.<init>(r4, r5)
            b.k r4 = r0.b()
            b.j r3 = r4.r(r3)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x006a
            goto L_0x007e
        L_0x006a:
            b.b r3 = r3.r()
            if (r3 != 0) goto L_0x0071
            goto L_0x007e
        L_0x0071:
            zb.t$c<java.lang.String> r3 = r3.f2759u
            if (r3 != 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            boolean r3 = r3.contains(r2)
            if (r3 != r5) goto L_0x007e
            r3 = r5
            goto L_0x007f
        L_0x007e:
            r3 = r4
        L_0x007f:
            if (r3 == 0) goto L_0x0138
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x012e, a -> 0x0124 }
            r3.<init>(r2)     // Catch:{ URISyntaxException -> 0x012e, a -> 0x0124 }
            e6.e.l(r3)     // Catch:{ URISyntaxException -> 0x012e, a -> 0x0124 }
            byte[] r2 = e6.e.o(r0)
            int r11 = r2.length
            long r11 = (long) r11
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x0108
            long r6 = java.lang.System.currentTimeMillis()
            t9.b r10 = r1.f9453d
            c3.r r10 = r10.a()
            c.c r11 = r1.f9454e
            qg.e r12 = c3.k.H(r10)
            java.net.URI r17 = r11.h(r12)
            java.net.URI r18 = jc.b.h()
            long r23 = r6 + r8
            xe.q r8 = new xe.q
            r12 = 0
            r13 = 0
            r15 = 0
            r21 = 0
            r25 = 1671(0x687, float:2.342E-42)
            r11 = r8
            r16 = r3
            r19 = r6
            r11.<init>(r12, r13, r15, r16, r17, r18, r19, r21, r23, r25)
            xe.f r3 = c3.k.I(r8)
            xe.j r8 = aa.b.i(r2)
            xe.i r9 = xe.i.NoCRC
            java.lang.String r11 = "type"
            e6.e.D(r9, r11)
            r8.f13211d = r9
            a.b.u(r3, r8, r5)
            qg.d r8 = c3.k.s(r10)
            r9 = 2
            java.lang.Integer[] r9 = new java.lang.Integer[r9]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r9[r4] = r10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r9[r5] = r4
            java.util.List r4 = a.b.o0(r9)
            ad.c.j(r3, r8, r6, r4)
            z9.e r4 = new z9.e
            r5 = 0
            r4.<init>(r1, r3, r5)
            ge.g.c(r4)
            r1 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r1
            long r5 = yi.b.g
            int r1 = r2.length
            long r1 = (long) r1
            java.lang.Long.signum(r5)
            long r5 = r5 * r1
            long r5 = r5 + r3
            yi.b.b(r0, r5)
            md.m r0 = md.m.f8555a
            return r0
        L_0x0108:
            wi.c r0 = new wi.c
            wi.a r1 = wi.a.InvalidOperand
            java.lang.String r3 = "exceeding maximum permitted buffer for dtn requested="
            java.lang.StringBuilder r3 = a.b.q(r3)
            int r2 = r2.length
            r3.append(r2)
            r3.append(r10)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            r0.<init>(r1, r2)
            throw r0
        L_0x0124:
            wi.c r0 = new wi.c
            wi.a r1 = wi.a.InvalidOperand
            java.lang.String r2 = "string operand does not conform to an EID"
            r0.<init>(r1, r2)
            throw r0
        L_0x012e:
            wi.c r0 = new wi.c
            wi.a r1 = wi.a.InvalidOperand
            java.lang.String r2 = "string operand does not conform to an URI"
            r0.<init>(r1, r2)
            throw r0
        L_0x0138:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DTN: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " is forbidden"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            wi.c r0 = y.c.n(r0)
            throw r0
        L_0x0153:
            wi.c r0 = new wi.c
            wi.a r1 = wi.a.InvalidOperand
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "exceeding maximum permitted lifetime for dtn requested="
            r2.append(r3)
            r2.append(r8)
            r2.append(r10)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
