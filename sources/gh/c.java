package gh;

import java.io.IOException;

public final class c extends f {
    public final int F;
    public final h G;

    public c(int i, h hVar) {
        super(false);
        this.F = i;
        this.G = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static gh.c S0(java.lang.Object r3) throws java.io.IOException {
        /*
            boolean r0 = r3 instanceof gh.c
            if (r0 == 0) goto L_0x0007
            gh.c r3 = (gh.c) r3
            return r3
        L_0x0007:
            boolean r0 = r3 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x001c
            r0 = r3
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r0 = r0.readInt()
            gh.h r3 = gh.h.S0(r3)
            gh.c r1 = new gh.c
            r1.<init>(r0, r3)
            return r1
        L_0x001c:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L_0x003f
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0038 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0038 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0038 }
            r2.<init>(r3)     // Catch:{ all -> 0x0038 }
            r1.<init>(r2)     // Catch:{ all -> 0x0038 }
            gh.c r3 = S0(r1)     // Catch:{ all -> 0x0035 }
            r1.close()
            return r3
        L_0x0035:
            r3 = move-exception
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r3 = move-exception
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()
        L_0x003e:
            throw r3
        L_0x003f:
            boolean r0 = r3 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x004e
            java.io.InputStream r3 = (java.io.InputStream) r3
            byte[] r3 = zh.a.a(r3)
            gh.c r3 = S0(r3)
            return r3
        L_0x004e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot parse "
            java.lang.String r3 = androidx.fragment.app.m.c(r1, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.c.S0(java.lang.Object):gh.c");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.F != cVar.F) {
            return false;
        }
        return this.G.equals(cVar.G);
    }

    public final byte[] getEncoded() throws IOException {
        a9.c l10 = a9.c.l();
        l10.m(this.F);
        l10.k(this.G.getEncoded());
        return l10.i();
    }

    public final int hashCode() {
        return this.G.hashCode() + (this.F * 31);
    }
}
