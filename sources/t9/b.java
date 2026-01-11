package t9;

import e6.e;
import io.nodle.sdk.NodleContext;
import ze.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final NodleContext f11442a;

    /* renamed from: b  reason: collision with root package name */
    public final f f11443b;

    /* renamed from: c  reason: collision with root package name */
    public a f11444c;

    public b(NodleContext nodleContext, f fVar) {
        e.D(nodleContext, "ctx");
        this.f11442a = nodleContext;
        this.f11443b = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0080, code lost:
        if ((!(r0 > r4 + ((long) r3) && r3 > 0)) == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c3.r a() {
        /*
            r10 = this;
            t9.a r0 = r10.f11444c
            if (r0 != 0) goto L_0x0041
            ze.f r0 = r10.f11443b
            hf.f r0 = (hf.f) r0
            md.h r0 = r0.f5954f
            java.lang.Object r0 = r0.a()
            ze.l r0 = (ze.l) r0
            ze.k r0 = r0.a()
            if (r0 != 0) goto L_0x0018
            r0 = 0
            goto L_0x0041
        L_0x0018:
            t9.a r1 = new t9.a
            bf.a r2 = bf.a.f2992a
            aj.r r0 = (aj.r) r0
            java.lang.String r2 = r0.f708a
            byte[] r2 = bf.a.b(r2)
            java.lang.String r3 = r0.f709b
            byte[] r3 = bf.a.b(r3)
            long r4 = r0.f710c
            int r0 = r0.f711d
            c3.r r6 = new c3.r
            qg.e r7 = new qg.e
            r7.<init>(r3)
            qg.d r3 = new qg.d
            r3.<init>((byte[]) r2)
            r6.<init>(r7, r3)
            r1.<init>(r6, r4, r0)
            r0 = r1
        L_0x0041:
            r10.f11444c = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r0 = r0 / r2
            io.nodle.sdk.NodleContext r2 = r10.f11442a
            m2.a r2 = r2.getSdkConfig()
            java.lang.String r3 = "<this>"
            e6.e.D(r2, r3)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            a9.c r2 = (a9.c) r2
            java.lang.String r4 = "id.expire-sec"
            java.lang.Object r2 = r2.a(r4, r3)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (int) r2
            t9.a r3 = r10.f11444c
            if (r3 == 0) goto L_0x0082
            long r4 = r3.f11440b
            int r3 = r3.f11441c
            long r6 = (long) r3
            long r4 = r4 + r6
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r5 = 1
            if (r4 <= 0) goto L_0x007e
            if (r3 <= 0) goto L_0x007e
            r3 = r5
            goto L_0x007f
        L_0x007e:
            r3 = 0
        L_0x007f:
            r3 = r3 ^ r5
            if (r3 != 0) goto L_0x00f2
        L_0x0082:
            t9.a r3 = new t9.a
            pi.f r4 = pi.f.f10072b
            og.a r4 = pi.f.f10071a
            qg.d r5 = new qg.d
            java.security.SecureRandom r4 = r4.f9446a
            r5.<init>((java.security.SecureRandom) r4)
            qg.e r4 = r5.S0()
            c3.r r6 = new c3.r
            r6.<init>(r4, r5)
            r3.<init>(r6, r0, r2)
            r10.f11444c = r3
            ze.f r0 = r10.f11443b
            hf.f r0 = (hf.f) r0
            md.h r0 = r0.f5954f
            java.lang.Object r0 = r0.a()
            ze.l r0 = (ze.l) r0
            t9.a r1 = r10.f11444c
            e6.e.B(r1)
            ze.f r2 = r10.f11443b
            hf.f r2 = (hf.f) r2
            md.h r2 = r2.f5956j
            java.lang.Object r2 = r2.a()
            hf.j r2 = (hf.j) r2
            java.lang.String r3 = "userKeyPairFactory"
            e6.e.D(r2, r3)
            bf.a r2 = bf.a.f2992a
            c3.r r2 = r1.f11439a
            java.lang.Object r2 = r2.f3216b
            a.b r2 = (a.b) r2
            java.lang.String r3 = "null cannot be cast to non-null type org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters"
            java.util.Objects.requireNonNull(r2, r3)
            qg.d r2 = (qg.d) r2
            byte[] r2 = r2.F
            byte[] r2 = xh.a.a(r2)
            java.lang.String r3 = "keyPair.private as Ed255…ateKeyParameters).encoded"
            e6.e.C(r2, r3)
            java.lang.String r5 = bf.a.a(r2)
            byte[] r2 = r1.a()
            java.lang.String r6 = bf.a.a(r2)
            long r7 = r1.f11440b
            int r9 = r1.f11441c
            aj.r r1 = new aj.r
            r4 = r1
            r4.<init>(r5, r6, r7, r9)
            r0.b(r1)
        L_0x00f2:
            t9.a r0 = r10.f11444c
            e6.e.B(r0)
            c3.r r0 = r0.f11439a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.b.a():c3.r");
    }
}
