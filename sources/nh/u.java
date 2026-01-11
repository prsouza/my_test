package nh;

import android.support.v4.media.b;
import java.io.IOException;
import xh.c;

public final class u extends lh.a implements c {
    public final t G;
    public final byte[] H;
    public final byte[] I;
    public final byte[] J;
    public final byte[] K;
    public volatile a L;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final t f9133a;

        /* renamed from: b  reason: collision with root package name */
        public int f9134b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f9135c = -1;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f9136d = null;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f9137e = null;

        /* renamed from: f  reason: collision with root package name */
        public byte[] f9138f = null;
        public byte[] g = null;

        /* renamed from: h  reason: collision with root package name */
        public a f9139h = null;

        public a(t tVar) {
            this.f9133a = tVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(nh.u.a r11) {
        /*
            r10 = this;
            nh.t r0 = r11.f9133a
            java.lang.String r1 = r0.f9131f
            r2 = 1
            r10.<init>(r2, r1)
            r10.G = r0
            int r1 = r0.g
            byte[] r3 = r11.f9136d
            if (r3 == 0) goto L_0x001e
            int r4 = r3.length
            if (r4 != r1) goto L_0x0016
            r10.H = r3
            goto L_0x0022
        L_0x0016:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of secretKeySeed needs to be equal size of digest"
            r11.<init>(r0)
            throw r11
        L_0x001e:
            byte[] r4 = new byte[r1]
            r10.H = r4
        L_0x0022:
            byte[] r4 = r11.f9137e
            if (r4 == 0) goto L_0x0034
            int r5 = r4.length
            if (r5 != r1) goto L_0x002c
            r10.I = r4
            goto L_0x0038
        L_0x002c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of secretKeyPRF needs to be equal size of digest"
            r11.<init>(r0)
            throw r11
        L_0x0034:
            byte[] r4 = new byte[r1]
            r10.I = r4
        L_0x0038:
            byte[] r4 = r11.f9138f
            if (r4 == 0) goto L_0x004a
            int r5 = r4.length
            if (r5 != r1) goto L_0x0042
            r10.J = r4
            goto L_0x004e
        L_0x0042:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of publicSeed needs to be equal size of digest"
            r11.<init>(r0)
            throw r11
        L_0x004a:
            byte[] r5 = new byte[r1]
            r10.J = r5
        L_0x004e:
            byte[] r5 = r11.g
            if (r5 == 0) goto L_0x0060
            int r6 = r5.length
            if (r6 != r1) goto L_0x0058
            r10.K = r5
            goto L_0x0064
        L_0x0058:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of root needs to be equal size of digest"
            r11.<init>(r0)
            throw r11
        L_0x0060:
            byte[] r1 = new byte[r1]
            r10.K = r1
        L_0x0064:
            nh.a r1 = r11.f9139h
            if (r1 == 0) goto L_0x0069
            goto L_0x00a1
        L_0x0069:
            int r1 = r11.f9134b
            int r5 = r0.f9127b
            int r5 = r2 << r5
            int r6 = r5 + -2
            if (r1 >= r6) goto L_0x00a4
            if (r4 == 0) goto L_0x00a4
            if (r3 == 0) goto L_0x00a4
            nh.a r1 = new nh.a
            nh.i$a r5 = new nh.i$a
            r5.<init>()
            nh.i r6 = new nh.i
            r6.<init>(r5)
            int r5 = r11.f9134b
            nh.j r7 = r0.a()
            int r8 = r0.f9127b
            int r0 = r0.f9128c
            int r9 = r2 << r8
            int r9 = r9 - r2
            r1.<init>((nh.j) r7, (int) r8, (int) r0, (int) r9)
            r1.a(r4, r3, r6)
        L_0x0096:
            int r0 = r1.f9057x
            if (r0 >= r5) goto L_0x00a1
            r1.b(r4, r3, r6)
            r0 = 0
            r1.f9058y = r0
            goto L_0x0096
        L_0x00a1:
            r10.L = r1
            goto L_0x00ba
        L_0x00a4:
            nh.a r3 = new nh.a
            int r5 = r5 - r2
            nh.j r4 = r0.a()
            int r6 = r0.f9127b
            int r0 = r0.f9128c
            r3.<init>((nh.j) r4, (int) r6, (int) r0, (int) r1)
            r3.z = r5
            r3.f9057x = r1
            r3.f9058y = r2
            r10.L = r3
        L_0x00ba:
            int r11 = r11.f9135c
            if (r11 < 0) goto L_0x00cd
            nh.a r0 = r10.L
            int r0 = r0.z
            if (r11 != r0) goto L_0x00c5
            goto L_0x00cd
        L_0x00c5:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxIndex set but not reflected in state"
            r11.<init>(r0)
            throw r11
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.u.<init>(nh.u$a):void");
    }

    public final byte[] S0() {
        byte[] c10;
        synchronized (this) {
            int i = this.G.g;
            byte[] bArr = new byte[(i + 4 + i + i + i)];
            b.I0(this.L.f9057x, bArr, 0);
            w.d(bArr, this.H, 4);
            int i10 = 4 + i;
            w.d(bArr, this.I, i10);
            int i11 = i10 + i;
            w.d(bArr, this.J, i11);
            w.d(bArr, this.K, i11 + i);
            try {
                c10 = xh.a.c(bArr, w.i(this.L));
            } catch (IOException e10) {
                throw new RuntimeException("error serializing bds state: " + e10.getMessage());
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
