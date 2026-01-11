package kg;

import ag.m;
import ag.n;
import xg.d;

public final class a extends m implements g {

    /* renamed from: a  reason: collision with root package name */
    public d f7531a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f7532b;

    /* renamed from: c  reason: collision with root package name */
    public n f7533c = null;

    public a(d dVar, byte[] bArr) {
        n nVar;
        this.f7531a = dVar;
        this.f7532b = xh.a.a(bArr);
        if (xg.a.g(this.f7531a)) {
            nVar = g.f7548j;
        } else if (xg.a.f(this.f7531a)) {
            nVar = g.f7549k;
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        this.f7533c = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ag.s d() {
        /*
            r4 = this;
            ag.e r0 = new ag.e
            r1 = 3
            r0.<init>(r1)
            ag.n r1 = r4.f7533c
            ag.n r2 = kg.g.f7548j
            boolean r1 = r1.m(r2)
            if (r1 == 0) goto L_0x0048
            xg.d r1 = r4.f7531a
            xg.e r1 = r1.f13238b
            c3.k r2 = kg.e.f7545a
            int r3 = r1.e()
            int r3 = r3 + 7
            int r3 = r3 / 8
            java.math.BigInteger r1 = r1.q()
            byte[] r1 = r2.s0(r1, r3)
            ag.w0 r3 = new ag.w0
            r3.<init>((byte[]) r1)
            r0.a(r3)
            xg.d r1 = r4.f7531a
            xg.e r1 = r1.f13239c
            int r3 = r1.e()
            int r3 = r3 + 7
            int r3 = r3 / 8
            java.math.BigInteger r1 = r1.q()
            byte[] r1 = r2.s0(r1, r3)
            ag.w0 r2 = new ag.w0
            r2.<init>((byte[]) r1)
            goto L_0x0089
        L_0x0048:
            ag.n r1 = r4.f7533c
            ag.n r2 = kg.g.f7549k
            boolean r1 = r1.m(r2)
            if (r1 == 0) goto L_0x008c
            xg.d r1 = r4.f7531a
            xg.e r1 = r1.f13238b
            c3.k r2 = kg.e.f7545a
            int r3 = r1.e()
            int r3 = r3 + 7
            int r3 = r3 / 8
            java.math.BigInteger r1 = r1.q()
            byte[] r1 = r2.s0(r1, r3)
            ag.w0 r3 = new ag.w0
            r3.<init>((byte[]) r1)
            r0.a(r3)
            xg.d r1 = r4.f7531a
            xg.e r1 = r1.f13239c
            int r3 = r1.e()
            int r3 = r3 + 7
            int r3 = r3 / 8
            java.math.BigInteger r1 = r1.q()
            byte[] r1 = r2.s0(r1, r3)
            ag.w0 r2 = new ag.w0
            r2.<init>((byte[]) r1)
        L_0x0089:
            r0.a(r2)
        L_0x008c:
            byte[] r1 = r4.f7532b
            if (r1 == 0) goto L_0x0098
            ag.n0 r2 = new ag.n0
            r2.<init>((byte[]) r1)
            r0.a(r2)
        L_0x0098:
            ag.a1 r1 = new ag.a1
            r1.<init>((ag.e) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.a.d():ag.s");
    }
}
