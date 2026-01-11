package nh;

import java.io.IOException;
import xh.c;

public final class p extends hh.a implements c {
    public final o G;
    public final byte[] H;
    public final byte[] I;
    public final byte[] J;
    public final byte[] K;
    public volatile long L;
    public volatile b M;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final o f9113a;

        /* renamed from: b  reason: collision with root package name */
        public long f9114b = 0;

        /* renamed from: c  reason: collision with root package name */
        public long f9115c = -1;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f9116d = null;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f9117e = null;

        /* renamed from: f  reason: collision with root package name */
        public byte[] f9118f = null;
        public byte[] g = null;

        /* renamed from: h  reason: collision with root package name */
        public b f9119h = null;

        public a(o oVar) {
            this.f9113a = oVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(nh.p.a r8) {
        /*
            r7 = this;
            nh.o r1 = r8.f9113a
            nh.t r0 = r1.f9110b
            java.lang.String r2 = r0.f9131f
            r3 = 1
            r7.<init>(r3, r2)
            r7.G = r1
            int r0 = r0.g
            long r2 = r8.f9114b
            r7.L = r2
            byte[] r5 = r8.f9116d
            if (r5 == 0) goto L_0x0024
            int r2 = r5.length
            if (r2 != r0) goto L_0x001c
            r7.H = r5
            goto L_0x0028
        L_0x001c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of secretKeySeed needs to be equal size of digest"
            r8.<init>(r0)
            throw r8
        L_0x0024:
            byte[] r2 = new byte[r0]
            r7.H = r2
        L_0x0028:
            byte[] r2 = r8.f9117e
            if (r2 == 0) goto L_0x003a
            int r3 = r2.length
            if (r3 != r0) goto L_0x0032
            r7.I = r2
            goto L_0x003e
        L_0x0032:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of secretKeyPRF needs to be equal size of digest"
            r8.<init>(r0)
            throw r8
        L_0x003a:
            byte[] r2 = new byte[r0]
            r7.I = r2
        L_0x003e:
            byte[] r4 = r8.f9118f
            if (r4 == 0) goto L_0x0050
            int r2 = r4.length
            if (r2 != r0) goto L_0x0048
            r7.J = r4
            goto L_0x0054
        L_0x0048:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of publicSeed needs to be equal size of digest"
            r8.<init>(r0)
            throw r8
        L_0x0050:
            byte[] r2 = new byte[r0]
            r7.J = r2
        L_0x0054:
            byte[] r2 = r8.g
            if (r2 == 0) goto L_0x0066
            int r3 = r2.length
            if (r3 != r0) goto L_0x005e
            r7.K = r2
            goto L_0x006a
        L_0x005e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of root needs to be equal size of digest"
            r8.<init>(r0)
            throw r8
        L_0x0066:
            byte[] r0 = new byte[r0]
            r7.K = r0
        L_0x006a:
            nh.b r0 = r8.f9119h
            if (r0 == 0) goto L_0x006f
            goto L_0x0090
        L_0x006f:
            long r2 = r8.f9114b
            int r0 = r1.f9111c
            boolean r0 = nh.w.g(r0, r2)
            if (r0 == 0) goto L_0x0086
            if (r4 == 0) goto L_0x0086
            if (r5 == 0) goto L_0x0086
            nh.b r6 = new nh.b
            long r2 = r8.f9114b
            r0 = r6
            r0.<init>(r1, r2, r4, r5)
            goto L_0x0090
        L_0x0086:
            nh.b r0 = new nh.b
            long r1 = r8.f9115c
            r3 = 1
            long r1 = r1 + r3
            r0.<init>(r1)
        L_0x0090:
            r7.M = r0
            long r0 = r8.f9115c
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x00ab
            nh.b r8 = r7.M
            long r2 = r8.f9060b
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x00a3
            goto L_0x00ab
        L_0x00a3:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxIndex set but not reflected in state"
            r8.<init>(r0)
            throw r8
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.p.<init>(nh.p$a):void");
    }

    public final byte[] S0() {
        byte[] c10;
        synchronized (this) {
            o oVar = this.G;
            int i = oVar.f9110b.g;
            int i10 = (oVar.f9111c + 7) / 8;
            byte[] bArr = new byte[(i10 + i + i + i + i)];
            w.d(bArr, w.j(this.L, i10), 0);
            int i11 = i10 + 0;
            w.d(bArr, this.H, i11);
            int i12 = i11 + i;
            w.d(bArr, this.I, i12);
            int i13 = i12 + i;
            w.d(bArr, this.J, i13);
            w.d(bArr, this.K, i13 + i);
            try {
                c10 = xh.a.c(bArr, w.i(this.M));
            } catch (IOException e10) {
                throw new IllegalStateException("error serializing bds state: " + e10.getMessage(), e10);
            }
        }
        return c10;
    }

    public final byte[] getEncoded() throws IOException {
        byte[] S0;
        synchronized (this) {
            S0 = S0();
        }
        return S0;
    }
}
