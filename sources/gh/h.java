package gh;

import a9.c;
import java.io.IOException;
import java.util.Arrays;
import xh.a;

public final class h extends f {
    public final j F;
    public final d G;
    public final byte[] H;
    public final byte[] I;

    public h(j jVar, d dVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.F = jVar;
        this.G = dVar;
        this.H = a.a(bArr2);
        this.I = a.a(bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static gh.h S0(java.lang.Object r4) throws java.io.IOException {
        /*
            boolean r0 = r4 instanceof gh.h
            if (r0 == 0) goto L_0x0007
            gh.h r4 = (gh.h) r4
            return r4
        L_0x0007:
            boolean r0 = r4 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0031
            java.io.DataInputStream r4 = (java.io.DataInputStream) r4
            int r0 = r4.readInt()
            gh.j r0 = gh.j.a(r0)
            int r1 = r4.readInt()
            gh.d r1 = gh.d.a(r1)
            r2 = 16
            byte[] r2 = new byte[r2]
            r4.readFully(r2)
            int r3 = r0.f5511b
            byte[] r3 = new byte[r3]
            r4.readFully(r3)
            gh.h r4 = new gh.h
            r4.<init>(r0, r1, r3, r2)
            return r4
        L_0x0031:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0054
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x004d }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x004d }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x004d }
            r2.<init>(r4)     // Catch:{ all -> 0x004d }
            r1.<init>(r2)     // Catch:{ all -> 0x004d }
            gh.h r4 = S0(r1)     // Catch:{ all -> 0x004a }
            r1.close()
            return r4
        L_0x004a:
            r4 = move-exception
            r0 = r1
            goto L_0x004e
        L_0x004d:
            r4 = move-exception
        L_0x004e:
            if (r0 == 0) goto L_0x0053
            r0.close()
        L_0x0053:
            throw r4
        L_0x0054:
            boolean r0 = r4 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x0063
            java.io.InputStream r4 = (java.io.InputStream) r4
            byte[] r4 = zh.a.a(r4)
            gh.h r4 = S0(r4)
            return r4
        L_0x0063:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot parse "
            java.lang.String r4 = androidx.fragment.app.m.c(r1, r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.h.S0(java.lang.Object):gh.h");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.F.equals(hVar.F) && this.G.equals(hVar.G) && Arrays.equals(this.H, hVar.H)) {
            return Arrays.equals(this.I, hVar.I);
        }
        return false;
    }

    public final byte[] getEncoded() throws IOException {
        c l10 = c.l();
        l10.m(this.F.f5510a);
        l10.m(this.G.f5493a);
        l10.k(this.H);
        l10.k(this.I);
        return l10.i();
    }

    public final int hashCode() {
        int hashCode = this.G.hashCode();
        int e10 = a.e(this.H);
        return a.e(this.I) + ((e10 + ((hashCode + (this.F.hashCode() * 31)) * 31)) * 31);
    }
}
