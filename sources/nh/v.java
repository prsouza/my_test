package nh;

import android.support.v4.media.b;
import java.io.IOException;
import xh.c;

public final class v extends lh.a implements c {
    public final t G;
    public final int H;
    public final byte[] I;
    public final byte[] J;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final t f9140a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f9141b = null;

        /* renamed from: c  reason: collision with root package name */
        public byte[] f9142c = null;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f9143d = null;

        public a(t tVar) {
            this.f9140a = tVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v(nh.v.a r6) {
        /*
            r5 = this;
            nh.t r0 = r6.f9140a
            java.lang.String r1 = r0.f9131f
            r2 = 0
            r5.<init>(r2, r1)
            r5.G = r0
            int r1 = r0.g
            byte[] r3 = r6.f9143d
            if (r3 == 0) goto L_0x0064
            int r6 = r3.length
            int r0 = r1 + r1
            if (r6 != r0) goto L_0x0027
            r5.H = r2
            byte[] r6 = nh.w.f(r3, r2, r1)
            r5.I = r6
            int r6 = r1 + 0
            byte[] r6 = nh.w.f(r3, r6, r1)
            r5.J = r6
            goto L_0x009b
        L_0x0027:
            int r6 = r3.length
            int r0 = r1 + 4
            int r4 = r0 + r1
            if (r6 != r4) goto L_0x0042
            int r6 = android.support.v4.media.b.F(r3, r2)
            r5.H = r6
            r6 = 4
            byte[] r6 = nh.w.f(r3, r6, r1)
            r5.I = r6
            byte[] r6 = nh.w.f(r3, r0, r1)
            r5.J = r6
            goto L_0x009b
        L_0x0042:
            java.io.PrintStream r6 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.length
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r6.println(r0)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "public key has wrong size"
            r6.<init>(r0)
            throw r6
        L_0x0064:
            nh.e r0 = r0.f9126a
            if (r0 == 0) goto L_0x006d
            int r0 = r0.f9071a
            r5.H = r0
            goto L_0x006f
        L_0x006d:
            r5.H = r2
        L_0x006f:
            byte[] r0 = r6.f9141b
            if (r0 == 0) goto L_0x0081
            int r2 = r0.length
            if (r2 != r1) goto L_0x0079
            r5.I = r0
            goto L_0x0085
        L_0x0079:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "length of root must be equal to length of digest"
            r6.<init>(r0)
            throw r6
        L_0x0081:
            byte[] r0 = new byte[r1]
            r5.I = r0
        L_0x0085:
            byte[] r6 = r6.f9142c
            if (r6 == 0) goto L_0x0097
            int r0 = r6.length
            if (r0 != r1) goto L_0x008f
            r5.J = r6
            goto L_0x009b
        L_0x008f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "length of publicSeed must be equal to length of digest"
            r6.<init>(r0)
            throw r6
        L_0x0097:
            byte[] r6 = new byte[r1]
            r5.J = r6
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.v.<init>(nh.v$a):void");
    }

    public final byte[] getEncoded() throws IOException {
        byte[] bArr;
        int i = this.G.g;
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
}
