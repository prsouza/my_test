package uf;

import java.io.IOException;
import java.util.zip.Inflater;

public final class n implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public int f11968a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11969b;

    /* renamed from: c  reason: collision with root package name */
    public final h f11970c;

    /* renamed from: s  reason: collision with root package name */
    public final Inflater f11971s;

    public n(h hVar, Inflater inflater) {
        this.f11970c = hVar;
        this.f11971s = inflater;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long I(uf.e r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            e6.e.D(r9, r0)
        L_0x0005:
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto L_0x000e
            r4 = r3
            goto L_0x000f
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 == 0) goto L_0x00d0
            boolean r4 = r8.f11969b
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x00c4
            if (r2 != 0) goto L_0x001a
            goto L_0x0091
        L_0x001a:
            uf.w r2 = r9.f0(r3)     // Catch:{ DataFormatException -> 0x00bd }
            int r3 = r2.f11995c     // Catch:{ DataFormatException -> 0x00bd }
            int r3 = 8192 - r3
            long r3 = (long) r3     // Catch:{ DataFormatException -> 0x00bd }
            long r3 = java.lang.Math.min(r10, r3)     // Catch:{ DataFormatException -> 0x00bd }
            int r3 = (int) r3     // Catch:{ DataFormatException -> 0x00bd }
            java.util.zip.Inflater r4 = r8.f11971s     // Catch:{ DataFormatException -> 0x00bd }
            boolean r4 = r4.needsInput()     // Catch:{ DataFormatException -> 0x00bd }
            if (r4 != 0) goto L_0x0031
            goto L_0x0053
        L_0x0031:
            uf.h r4 = r8.f11970c     // Catch:{ DataFormatException -> 0x00bd }
            boolean r4 = r4.J()     // Catch:{ DataFormatException -> 0x00bd }
            if (r4 == 0) goto L_0x003a
            goto L_0x0053
        L_0x003a:
            uf.h r4 = r8.f11970c     // Catch:{ DataFormatException -> 0x00bd }
            uf.e r4 = r4.b()     // Catch:{ DataFormatException -> 0x00bd }
            uf.w r4 = r4.f11951a     // Catch:{ DataFormatException -> 0x00bd }
            e6.e.B(r4)     // Catch:{ DataFormatException -> 0x00bd }
            int r5 = r4.f11995c     // Catch:{ DataFormatException -> 0x00bd }
            int r6 = r4.f11994b     // Catch:{ DataFormatException -> 0x00bd }
            int r5 = r5 - r6
            r8.f11968a = r5     // Catch:{ DataFormatException -> 0x00bd }
            java.util.zip.Inflater r7 = r8.f11971s     // Catch:{ DataFormatException -> 0x00bd }
            byte[] r4 = r4.f11993a     // Catch:{ DataFormatException -> 0x00bd }
            r7.setInput(r4, r6, r5)     // Catch:{ DataFormatException -> 0x00bd }
        L_0x0053:
            java.util.zip.Inflater r4 = r8.f11971s     // Catch:{ DataFormatException -> 0x00bd }
            byte[] r5 = r2.f11993a     // Catch:{ DataFormatException -> 0x00bd }
            int r6 = r2.f11995c     // Catch:{ DataFormatException -> 0x00bd }
            int r3 = r4.inflate(r5, r6, r3)     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = r8.f11968a     // Catch:{ DataFormatException -> 0x00bd }
            if (r4 != 0) goto L_0x0062
            goto L_0x0074
        L_0x0062:
            java.util.zip.Inflater r5 = r8.f11971s     // Catch:{ DataFormatException -> 0x00bd }
            int r5 = r5.getRemaining()     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = r4 - r5
            int r5 = r8.f11968a     // Catch:{ DataFormatException -> 0x00bd }
            int r5 = r5 - r4
            r8.f11968a = r5     // Catch:{ DataFormatException -> 0x00bd }
            uf.h r5 = r8.f11970c     // Catch:{ DataFormatException -> 0x00bd }
            long r6 = (long) r4     // Catch:{ DataFormatException -> 0x00bd }
            r5.skip(r6)     // Catch:{ DataFormatException -> 0x00bd }
        L_0x0074:
            if (r3 <= 0) goto L_0x0082
            int r4 = r2.f11995c     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = r4 + r3
            r2.f11995c = r4     // Catch:{ DataFormatException -> 0x00bd }
            long r4 = r9.f11952b     // Catch:{ DataFormatException -> 0x00bd }
            long r2 = (long) r3     // Catch:{ DataFormatException -> 0x00bd }
            long r4 = r4 + r2
            r9.f11952b = r4     // Catch:{ DataFormatException -> 0x00bd }
            goto L_0x0092
        L_0x0082:
            int r3 = r2.f11994b     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = r2.f11995c     // Catch:{ DataFormatException -> 0x00bd }
            if (r3 != r4) goto L_0x0091
            uf.w r3 = r2.a()     // Catch:{ DataFormatException -> 0x00bd }
            r9.f11951a = r3     // Catch:{ DataFormatException -> 0x00bd }
            uf.x.b(r2)     // Catch:{ DataFormatException -> 0x00bd }
        L_0x0091:
            r2 = r0
        L_0x0092:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0097
            return r2
        L_0x0097:
            java.util.zip.Inflater r0 = r8.f11971s
            boolean r0 = r0.finished()
            if (r0 != 0) goto L_0x00ba
            java.util.zip.Inflater r0 = r8.f11971s
            boolean r0 = r0.needsDictionary()
            if (r0 == 0) goto L_0x00a8
            goto L_0x00ba
        L_0x00a8:
            uf.h r0 = r8.f11970c
            boolean r0 = r0.J()
            if (r0 != 0) goto L_0x00b2
            goto L_0x0005
        L_0x00b2:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.String r10 = "source exhausted prematurely"
            r9.<init>(r10)
            throw r9
        L_0x00ba:
            r9 = -1
            return r9
        L_0x00bd:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r9)
            throw r10
        L_0x00c4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00d0:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = android.support.v4.media.a.d(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.n.I(uf.e, long):long");
    }

    public final void close() throws IOException {
        if (!this.f11969b) {
            this.f11971s.end();
            this.f11969b = true;
            this.f11970c.close();
        }
    }

    public final c0 d() {
        return this.f11970c.d();
    }
}
