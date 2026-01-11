package gh;

import a9.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public final class b extends f {
    public final int F;
    public final boolean G;
    public List<g> H;
    public List<i> I;
    public final long J;
    public long K = 0;

    public b(int i, List<g> list, List<i> list2, long j10, long j11, boolean z) {
        super(true);
        this.F = i;
        this.H = Collections.unmodifiableList(list);
        this.I = Collections.unmodifiableList(list2);
        this.K = j10;
        this.J = j11;
        this.G = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static gh.b S0(java.lang.Object r11) throws java.io.IOException {
        /*
            boolean r0 = r11 instanceof gh.b
            if (r0 == 0) goto L_0x0007
            gh.b r11 = (gh.b) r11
            return r11
        L_0x0007:
            boolean r0 = r11 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0059
            r0 = r11
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0051
            int r3 = r0.readInt()
            long r6 = r0.readLong()
            long r8 = r0.readLong()
            boolean r10 = r0.readBoolean()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 0
            r1 = r0
        L_0x0030:
            if (r1 >= r3) goto L_0x003c
            gh.g r2 = gh.g.W0(r11)
            r4.add(r2)
            int r1 = r1 + 1
            goto L_0x0030
        L_0x003c:
            int r1 = r3 + -1
            if (r0 >= r1) goto L_0x004a
            gh.i r1 = gh.i.a(r11)
            r5.add(r1)
            int r0 = r0 + 1
            goto L_0x003c
        L_0x004a:
            gh.b r11 = new gh.b
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r8, r10)
            return r11
        L_0x0051:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "unknown version for hss private key"
            r11.<init>(r0)
            throw r11
        L_0x0059:
            boolean r0 = r11 instanceof byte[]
            if (r0 == 0) goto L_0x007c
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0075 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0075 }
            byte[] r11 = (byte[]) r11     // Catch:{ all -> 0x0075 }
            r2.<init>(r11)     // Catch:{ all -> 0x0075 }
            r1.<init>(r2)     // Catch:{ all -> 0x0075 }
            gh.b r11 = S0(r1)     // Catch:{ all -> 0x0072 }
            r1.close()
            return r11
        L_0x0072:
            r11 = move-exception
            r0 = r1
            goto L_0x0076
        L_0x0075:
            r11 = move-exception
        L_0x0076:
            if (r0 == 0) goto L_0x007b
            r0.close()
        L_0x007b:
            throw r11
        L_0x007c:
            boolean r0 = r11 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x008b
            java.io.InputStream r11 = (java.io.InputStream) r11
            byte[] r11 = zh.a.a(r11)
            gh.b r11 = S0(r11)
            return r11
        L_0x008b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot parse "
            java.lang.String r11 = androidx.fragment.app.m.c(r1, r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.b.S0(java.lang.Object):gh.b");
    }

    public final Object clone() throws CloneNotSupportedException {
        try {
            return S0(getEncoded());
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.F == bVar.F && this.G == bVar.G && this.J == bVar.J && this.K == bVar.K && this.H.equals(bVar.H)) {
            return this.I.equals(bVar.I);
        }
        return false;
    }

    public final synchronized byte[] getEncoded() throws IOException {
        c l10;
        l10 = c.l();
        l10.m(0);
        l10.m(this.F);
        long j10 = this.K;
        l10.m((int) (j10 >>> 32));
        l10.m((int) j10);
        long j11 = this.J;
        l10.m((int) (j11 >>> 32));
        l10.m((int) j11);
        ((ByteArrayOutputStream) l10.f176b).write(this.G ? 1 : 0);
        for (g j12 : this.H) {
            l10.j(j12);
        }
        for (i j13 : this.I) {
            l10.j(j13);
        }
        return l10.i();
    }

    public final int hashCode() {
        int hashCode = this.H.hashCode();
        int hashCode2 = this.I.hashCode();
        long j10 = this.J;
        long j11 = this.K;
        return ((((hashCode2 + ((hashCode + (((this.F * 31) + (this.G ? 1 : 0)) * 31)) * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }
}
