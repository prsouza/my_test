package se;

import a.a;
import oe.b;
import pe.e;
import re.w0;
import yd.v;

public final class n implements b<m> {

    /* renamed from: a  reason: collision with root package name */
    public static final w0 f11121a;

    /* renamed from: b  reason: collision with root package name */
    public static final n f11122b = new n();

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0025  */
    static {
        /*
            se.n r0 = new se.n
            r0.<init>()
            f11122b = r0
            pe.d$i r0 = pe.d.i.f9901a
            java.lang.String r1 = "kotlinx.serialization.json.JsonLiteral"
            boolean r2 = fe.k.Z0(r1)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x007e
            java.util.Map<de.b<? extends java.lang.Object>, oe.b<? extends java.lang.Object>> r2 = re.x0.f10760a
            java.util.Map<de.b<? extends java.lang.Object>, oe.b<? extends java.lang.Object>> r2 = re.x0.f10760a
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0076
            java.lang.Object r3 = r2.next()
            de.b r3 = (de.b) r3
            java.lang.String r3 = r3.a()
            e6.e.B(r3)
            java.lang.String r3 = fe.k.W0(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "kotlin."
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            boolean r4 = fe.k.Y0(r1, r4)
            if (r4 != 0) goto L_0x0054
            boolean r4 = fe.k.Y0(r1, r3)
            if (r4 != 0) goto L_0x0054
            goto L_0x001f
        L_0x0054:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name "
            java.lang.String r4 = " there already exist "
            java.lang.StringBuilder r1 = androidx.activity.result.d.d(r2, r1, r4)
            java.lang.String r2 = fe.k.W0(r3)
            r1.append(r2)
            java.lang.String r2 = "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = fe.g.T0(r1)
            r0.<init>(r1)
            throw r0
        L_0x0076:
            re.w0 r2 = new re.w0
            r2.<init>(r1, r0)
            f11121a = r2
            return
        L_0x007e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Blank serial names are prohibited"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: se.n.<clinit>():void");
    }

    public final e a() {
        return f11121a;
    }

    public final Object b(qe.b bVar) {
        e6.e.D(bVar, "decoder");
        e n10 = jc.b.k(bVar).n();
        if (n10 instanceof m) {
            return (m) n10;
        }
        StringBuilder d10 = a.d("Unexpected JSON element, expected JsonLiteral, had ");
        d10.append(v.a(n10.getClass()));
        throw a.b.j(-1, d10.toString(), n10.toString());
    }
}
