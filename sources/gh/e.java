package gh;

import java.io.IOException;
import java.util.Arrays;
import xh.c;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public final d f5498a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5499b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f5500c;

    public e(d dVar, byte[] bArr, byte[] bArr2) {
        this.f5498a = dVar;
        this.f5499b = bArr;
        this.f5500c = bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static gh.e a(java.lang.Object r4) throws java.io.IOException {
        /*
            boolean r0 = r4 instanceof gh.e
            if (r0 == 0) goto L_0x0007
            gh.e r4 = (gh.e) r4
            return r4
        L_0x0007:
            boolean r0 = r4 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x002c
            java.io.DataInputStream r4 = (java.io.DataInputStream) r4
            int r0 = r4.readInt()
            gh.d r0 = gh.d.a(r0)
            int r1 = r0.f5494b
            byte[] r1 = new byte[r1]
            r4.readFully(r1)
            int r2 = r0.f5496d
            int r3 = r0.f5494b
            int r2 = r2 * r3
            byte[] r2 = new byte[r2]
            r4.readFully(r2)
            gh.e r4 = new gh.e
            r4.<init>(r0, r1, r2)
            return r4
        L_0x002c:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x004f
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0048 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0048 }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x0048 }
            r2.<init>(r4)     // Catch:{ all -> 0x0048 }
            r1.<init>(r2)     // Catch:{ all -> 0x0048 }
            gh.e r4 = a(r1)     // Catch:{ all -> 0x0045 }
            r1.close()
            return r4
        L_0x0045:
            r4 = move-exception
            r0 = r1
            goto L_0x0049
        L_0x0048:
            r4 = move-exception
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()
        L_0x004e:
            throw r4
        L_0x004f:
            boolean r0 = r4 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x005e
            java.io.InputStream r4 = (java.io.InputStream) r4
            byte[] r4 = zh.a.a(r4)
            gh.e r4 = a(r4)
            return r4
        L_0x005e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot parse "
            java.lang.String r4 = androidx.fragment.app.m.c(r1, r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.e.a(java.lang.Object):gh.e");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        d dVar = this.f5498a;
        if (dVar == null ? eVar.f5498a != null : !dVar.equals(eVar.f5498a)) {
            return false;
        }
        if (!Arrays.equals(this.f5499b, eVar.f5499b)) {
            return false;
        }
        return Arrays.equals(this.f5500c, eVar.f5500c);
    }

    public final byte[] getEncoded() throws IOException {
        a9.c l10 = a9.c.l();
        l10.m(this.f5498a.f5493a);
        l10.k(this.f5499b);
        l10.k(this.f5500c);
        return l10.i();
    }

    public final int hashCode() {
        d dVar = this.f5498a;
        int hashCode = dVar != null ? dVar.hashCode() : 0;
        return Arrays.hashCode(this.f5500c) + ((Arrays.hashCode(this.f5499b) + (hashCode * 31)) * 31);
    }
}
