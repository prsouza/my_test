package gh;

import a.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;
import lg.c;

public final class g extends f {
    public static a P;
    public static a[] Q;
    public final byte[] F;
    public final j G;
    public final d H;
    public final int I;
    public final byte[] J;
    public int K;
    public h L;
    public int M;
    public Map<a, byte[]> N = new WeakHashMap();
    public c O;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f5501a;

        public a(int i) {
            this.f5501a = i;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).f5501a == this.f5501a;
        }

        public final int hashCode() {
            return this.f5501a;
        }
    }

    static {
        a aVar = new a(1);
        P = aVar;
        a[] aVarArr = new a[129];
        Q = aVarArr;
        aVarArr[1] = aVar;
        int i = 2;
        while (true) {
            a[] aVarArr2 = Q;
            if (i < aVarArr2.length) {
                aVarArr2[i] = new a(i);
                i++;
            } else {
                return;
            }
        }
    }

    public g(j jVar, d dVar, int i, byte[] bArr, int i10, byte[] bArr2) {
        super(true);
        this.G = jVar;
        this.H = dVar;
        this.K = i;
        this.F = xh.a.a(bArr);
        this.I = i10;
        this.J = xh.a.a(bArr2);
        this.M = 1 << (jVar.f5512c + 1);
        this.O = (c) a.a(jVar.f5513d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static gh.g W0(java.lang.Object r8) throws java.io.IOException {
        /*
            boolean r0 = r8 instanceof gh.g
            if (r0 == 0) goto L_0x0007
            gh.g r8 = (gh.g) r8
            return r8
        L_0x0007:
            boolean r0 = r8 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0071
            java.io.DataInputStream r8 = (java.io.DataInputStream) r8
            int r0 = r8.readInt()
            if (r0 != 0) goto L_0x0069
            int r0 = r8.readInt()
            gh.j r2 = gh.j.a(r0)
            int r0 = r8.readInt()
            gh.d r3 = gh.d.a(r0)
            r0 = 16
            byte[] r5 = new byte[r0]
            r8.readFully(r5)
            int r4 = r8.readInt()
            int r6 = r8.readInt()
            int r0 = r8.readInt()
            if (r0 < 0) goto L_0x0061
            int r1 = r8.available()
            if (r0 > r1) goto L_0x004a
            byte[] r7 = new byte[r0]
            r8.readFully(r7)
            gh.g r8 = new gh.g
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x004a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "secret length exceeded "
            java.lang.StringBuilder r1 = a.a.d(r1)
            int r8 = r8.available()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x0061:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "secret length less than zero"
            r8.<init>(r0)
            throw r8
        L_0x0069:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "expected version 0 lms private key"
            r8.<init>(r0)
            throw r8
        L_0x0071:
            boolean r0 = r8 instanceof byte[]
            if (r0 == 0) goto L_0x0094
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x008d }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x008d }
            byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x008d }
            r2.<init>(r8)     // Catch:{ all -> 0x008d }
            r1.<init>(r2)     // Catch:{ all -> 0x008d }
            gh.g r8 = W0(r1)     // Catch:{ all -> 0x008a }
            r1.close()
            return r8
        L_0x008a:
            r8 = move-exception
            r0 = r1
            goto L_0x008e
        L_0x008d:
            r8 = move-exception
        L_0x008e:
            if (r0 == 0) goto L_0x0093
            r0.close()
        L_0x0093:
            throw r8
        L_0x0094:
            boolean r0 = r8 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x00a3
            java.io.InputStream r8 = (java.io.InputStream) r8
            byte[] r8 = zh.a.a(r8)
            gh.g r8 = W0(r8)
            return r8
        L_0x00a3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot parse "
            java.lang.String r8 = androidx.fragment.app.m.c(r1, r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.g.W0(java.lang.Object):gh.g");
    }

    public final byte[] S0(int i) {
        int i10 = i;
        int i11 = 1 << this.G.f5512c;
        boolean z = false;
        if (i10 >= i11) {
            b.K(V0(), this.O);
            b.Q0(i10, this.O);
            c cVar = this.O;
            cVar.f((byte) 16777090);
            cVar.f((byte) -32126);
            d dVar = this.H;
            byte[] V0 = V0();
            int i12 = i10 - i11;
            byte[] a10 = xh.a.a(this.J);
            lg.b a11 = a.a(dVar.f5497e);
            a9.c l10 = a9.c.l();
            l10.k(V0);
            l10.m(i12);
            ((ByteArrayOutputStream) l10.f176b).write((byte) 128);
            ((ByteArrayOutputStream) l10.f176b).write((byte) 32896);
            while (((ByteArrayOutputStream) l10.f176b).size() < 22) {
                ((ByteArrayOutputStream) l10.f176b).write(0);
            }
            byte[] i13 = l10.i();
            a11.update(i13, 0, i13.length);
            lg.b a12 = a.a(dVar.f5497e);
            a9.c l11 = a9.c.l();
            l11.k(V0);
            l11.m(i12);
            int d10 = a12.d() + 23;
            while (((ByteArrayOutputStream) l11.f176b).size() < d10) {
                ((ByteArrayOutputStream) l11.f176b).write(0);
            }
            byte[] i14 = l11.i();
            lg.b a13 = a.a(dVar.f5497e);
            int i15 = dVar.f5496d;
            int i16 = dVar.f5494b;
            int i17 = (1 << dVar.f5495c) - 1;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i15) {
                boolean z10 = i19 < i15 + -1 ? true : z;
                if (i14.length >= a13.d()) {
                    a13.update(V0, 0, V0.length);
                    a13.f((byte) (i12 >>> 24));
                    a13.f((byte) (i12 >>> 16));
                    a13.f((byte) (i12 >>> 8));
                    a13.f((byte) i12);
                    a13.f((byte) (i18 >>> 8));
                    a13.f((byte) i18);
                    a13.f((byte) -1);
                    a13.update(a10, 0, a10.length);
                    a13.b(i14, 23);
                    if (z10) {
                        i18++;
                    }
                    short s10 = (short) i19;
                    i14[20] = (byte) (s10 >>> 8);
                    i14[21] = (byte) s10;
                    for (int i20 = 0; i20 < i17; i20++) {
                        i14[22] = (byte) i20;
                        a12.update(i14, 0, i14.length);
                        a12.b(i14, 23);
                    }
                    a11.update(i14, 23, i16);
                    i19++;
                    z = false;
                } else {
                    throw new IllegalArgumentException("target length is less than digest size.");
                }
            }
            int d11 = a11.d();
            byte[] bArr = new byte[d11];
            a11.b(bArr, 0);
            this.O.update(bArr, 0, d11);
            byte[] bArr2 = new byte[this.O.d()];
            this.O.b(bArr2, 0);
            return bArr2;
        }
        int i21 = i10 * 2;
        byte[] T0 = T0(i21);
        byte[] T02 = T0(i21 + 1);
        b.K(V0(), this.O);
        b.Q0(i10, this.O);
        c cVar2 = this.O;
        cVar2.f((byte) 16777091);
        cVar2.f((byte) -31869);
        this.O.update(T0, 0, T0.length);
        this.O.update(T02, 0, T02.length);
        byte[] bArr3 = new byte[this.O.d()];
        this.O.b(bArr3, 0);
        return bArr3;
    }

    public final byte[] T0(int i) {
        if (i >= this.M) {
            return S0(i);
        }
        return U0(i < 129 ? Q[i] : new a(i));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<gh.g$a, byte[]>, java.util.WeakHashMap] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map<gh.g$a, byte[]>, java.util.WeakHashMap] */
    public final byte[] U0(a aVar) {
        synchronized (this.N) {
            byte[] bArr = (byte[]) this.N.get(aVar);
            if (bArr != null) {
                return bArr;
            }
            byte[] S0 = S0(aVar.f5501a);
            this.N.put(aVar, S0);
            return S0;
        }
    }

    public final byte[] V0() {
        return xh.a.a(this.F);
    }

    public final h X0() {
        h hVar;
        synchronized (this) {
            if (this.L == null) {
                this.L = new h(this.G, this.H, U0(P), this.F);
            }
            hVar = this.L;
        }
        return hVar;
    }

    public final boolean equals(Object obj) {
        h hVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.K != gVar.K || this.I != gVar.I || !Arrays.equals(this.F, gVar.F)) {
            return false;
        }
        j jVar = this.G;
        if (jVar == null ? gVar.G != null : !jVar.equals(gVar.G)) {
            return false;
        }
        d dVar = this.H;
        if (dVar == null ? gVar.H != null : !dVar.equals(gVar.H)) {
            return false;
        }
        if (!Arrays.equals(this.J, gVar.J)) {
            return false;
        }
        h hVar2 = this.L;
        if (hVar2 == null || (hVar = gVar.L) == null) {
            return true;
        }
        return hVar2.equals(hVar);
    }

    public final byte[] getEncoded() throws IOException {
        a9.c l10 = a9.c.l();
        l10.m(0);
        l10.m(this.G.f5510a);
        l10.m(this.H.f5493a);
        l10.k(this.F);
        l10.m(this.K);
        l10.m(this.I);
        l10.m(this.J.length);
        l10.k(this.J);
        return l10.i();
    }

    public final int hashCode() {
        int e10 = (xh.a.e(this.F) + (this.K * 31)) * 31;
        j jVar = this.G;
        int i = 0;
        int hashCode = (e10 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        d dVar = this.H;
        int e11 = (xh.a.e(this.J) + ((((hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.I) * 31)) * 31;
        h hVar = this.L;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return e11 + i;
    }
}
