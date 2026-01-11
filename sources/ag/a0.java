package ag;

public final class a0 extends a {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f369s = 0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a0(int r5, ag.e r6) {
        /*
            r4 = this;
            r0 = 0
            r4.f369s = r0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
        L_0x0008:
            int r2 = r6.f388b
            if (r0 == r2) goto L_0x0036
            ag.d r2 = r6.b(r0)     // Catch:{ IOException -> 0x001e }
            ag.m r2 = (ag.m) r2     // Catch:{ IOException -> 0x001e }
            java.lang.String r3 = "BER"
            byte[] r2 = r2.i(r3)     // Catch:{ IOException -> 0x001e }
            r1.write(r2)     // Catch:{ IOException -> 0x001e }
            int r0 = r0 + 1
            goto L_0x0008
        L_0x001e:
            r5 = move-exception
            ag.r r6 = new ag.r
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "malformed object: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0, r5)
            throw r6
        L_0x0036:
            byte[] r6 = r1.toByteArray()
            r0 = 1
            r4.<init>(r0, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.a0.<init>(int, ag.e):void");
    }

    public final void k(q qVar, boolean z) {
        int i = 96;
        switch (this.f369s) {
            case 0:
                if (!this.f366a) {
                    i = 64;
                }
                int i10 = this.f367b;
                byte[] bArr = this.f368c;
                qVar.m(z, i, i10);
                qVar.d(128);
                qVar.e(bArr, 0, bArr.length);
                qVar.d(0);
                qVar.d(0);
                return;
            default:
                if (!this.f366a) {
                    i = 64;
                }
                qVar.g(z, i, this.f367b, this.f368c);
                return;
        }
    }

    public a0(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }
}
