package nh;

import android.support.v4.media.b;
import java.io.IOException;
import xh.c;

public final class q extends hh.a implements c {
    public final o G;
    public final int H;
    public final byte[] I;
    public final byte[] J;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final o f9120a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f9121b = null;

        /* renamed from: c  reason: collision with root package name */
        public byte[] f9122c = null;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f9123d = null;

        public a(o oVar) {
            this.f9120a = oVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(nh.q.a r6) {
        /*
            r5 = this;
            nh.o r0 = r6.f9120a
            nh.t r1 = r0.f9110b
            java.lang.String r2 = r1.f9131f
            r3 = 0
            r5.<init>(r3, r2)
            r5.G = r0
            int r1 = r1.g
            byte[] r2 = r6.f9123d
            if (r2 == 0) goto L_0x004b
            int r6 = r2.length
            int r0 = r1 + r1
            if (r6 != r0) goto L_0x0028
            r5.H = r3
            byte[] r6 = nh.w.f(r2, r3, r1)
            r5.I = r6
            int r6 = r1 + 0
            byte[] r6 = nh.w.f(r2, r6, r1)
            r5.J = r6
            goto L_0x0082
        L_0x0028:
            int r6 = r2.length
            int r0 = r1 + 4
            int r4 = r0 + r1
            if (r6 != r4) goto L_0x0043
            int r6 = android.support.v4.media.b.F(r2, r3)
            r5.H = r6
            r6 = 4
            byte[] r6 = nh.w.f(r2, r6, r1)
            r5.I = r6
            byte[] r6 = nh.w.f(r2, r0, r1)
            r5.J = r6
            goto L_0x0082
        L_0x0043:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "public key has wrong size"
            r6.<init>(r0)
            throw r6
        L_0x004b:
            nh.d r0 = r0.f9109a
            if (r0 == 0) goto L_0x0054
            int r0 = r0.f9068a
            r5.H = r0
            goto L_0x0056
        L_0x0054:
            r5.H = r3
        L_0x0056:
            byte[] r0 = r6.f9121b
            if (r0 == 0) goto L_0x0068
            int r2 = r0.length
            if (r2 != r1) goto L_0x0060
            r5.I = r0
            goto L_0x006c
        L_0x0060:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "length of root must be equal to length of digest"
            r6.<init>(r0)
            throw r6
        L_0x0068:
            byte[] r0 = new byte[r1]
            r5.I = r0
        L_0x006c:
            byte[] r6 = r6.f9122c
            if (r6 == 0) goto L_0x007e
            int r0 = r6.length
            if (r0 != r1) goto L_0x0076
            r5.J = r6
            goto L_0x0082
        L_0x0076:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "length of publicSeed must be equal to length of digest"
            r6.<init>(r0)
            throw r6
        L_0x007e:
            byte[] r6 = new byte[r1]
            r5.J = r6
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.q.<init>(nh.q$a):void");
    }

    public final byte[] S0() {
        byte[] bArr;
        int i = this.G.f9110b.g;
        int i10 = 0;
        int i11 = this.H;
        if (i11 != 0) {
            bArr = new byte[(i + 4 + i)];
            b.I0(i11, bArr, 0);
            i10 = 4;
        } else {
            bArr = new byte[(i + i)];
        }
        w.d(bArr, this.I, i10);
        w.d(bArr, this.J, i10 + i);
        return bArr;
    }

    public final byte[] getEncoded() throws IOException {
        return S0();
    }
}
