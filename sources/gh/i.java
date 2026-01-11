package gh;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import xh.c;

public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public final int f5502a;

    /* renamed from: b  reason: collision with root package name */
    public final e f5503b;

    /* renamed from: c  reason: collision with root package name */
    public final j f5504c;

    /* renamed from: s  reason: collision with root package name */
    public final byte[][] f5505s;

    public i(int i, e eVar, j jVar, byte[][] bArr) {
        this.f5502a = i;
        this.f5503b = eVar;
        this.f5504c = jVar;
        this.f5505s = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static gh.i a(java.lang.Object r7) throws java.io.IOException {
        /*
            boolean r0 = r7 instanceof gh.i
            if (r0 == 0) goto L_0x0007
            gh.i r7 = (gh.i) r7
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0039
            r0 = r7
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r1 = r0.readInt()
            gh.e r7 = gh.e.a(r7)
            int r2 = r0.readInt()
            gh.j r2 = gh.j.a(r2)
            int r3 = r2.f5512c
            byte[][] r4 = new byte[r3][]
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0033
            int r6 = r2.f5511b
            byte[] r6 = new byte[r6]
            r4[r5] = r6
            r6 = r4[r5]
            r0.readFully(r6)
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0033:
            gh.i r0 = new gh.i
            r0.<init>(r1, r7, r2, r4)
            return r0
        L_0x0039:
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L_0x005c
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0055 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0055 }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x0055 }
            r2.<init>(r7)     // Catch:{ all -> 0x0055 }
            r1.<init>(r2)     // Catch:{ all -> 0x0055 }
            gh.i r7 = a(r1)     // Catch:{ all -> 0x0052 }
            r1.close()
            return r7
        L_0x0052:
            r7 = move-exception
            r0 = r1
            goto L_0x0056
        L_0x0055:
            r7 = move-exception
        L_0x0056:
            if (r0 == 0) goto L_0x005b
            r0.close()
        L_0x005b:
            throw r7
        L_0x005c:
            boolean r0 = r7 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x006b
            java.io.InputStream r7 = (java.io.InputStream) r7
            byte[] r7 = zh.a.a(r7)
            gh.i r7 = a(r7)
            return r7
        L_0x006b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot parse "
            java.lang.String r7 = androidx.fragment.app.m.c(r1, r7)
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.i.a(java.lang.Object):gh.i");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f5502a != iVar.f5502a) {
            return false;
        }
        e eVar = this.f5503b;
        if (eVar == null ? iVar.f5503b != null : !eVar.equals(iVar.f5503b)) {
            return false;
        }
        j jVar = this.f5504c;
        if (jVar == null ? iVar.f5504c == null : jVar.equals(iVar.f5504c)) {
            return Arrays.deepEquals(this.f5505s, iVar.f5505s);
        }
        return false;
    }

    public final byte[] getEncoded() throws IOException {
        a9.c l10 = a9.c.l();
        l10.m(this.f5502a);
        l10.k(this.f5503b.getEncoded());
        l10.m(this.f5504c.f5510a);
        try {
            for (byte[] write : this.f5505s) {
                ((ByteArrayOutputStream) l10.f176b).write(write);
            }
            return l10.i();
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public final int hashCode() {
        int i = this.f5502a * 31;
        e eVar = this.f5503b;
        int i10 = 0;
        int hashCode = (i + (eVar != null ? eVar.hashCode() : 0)) * 31;
        j jVar = this.f5504c;
        if (jVar != null) {
            i10 = jVar.hashCode();
        }
        return Arrays.deepHashCode(this.f5505s) + ((hashCode + i10) * 31);
    }
}
