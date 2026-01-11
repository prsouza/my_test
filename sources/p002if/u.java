package p002if;

import e6.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p002if.t;
import uf.g;
import uf.i;

/* renamed from: if.u  reason: invalid package */
public final class u extends z {

    /* renamed from: f  reason: collision with root package name */
    public static final t f6585f;
    public static final t g;

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f6586h = {(byte) 58, (byte) 32};
    public static final byte[] i = {(byte) 13, (byte) 10};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f6587j;

    /* renamed from: b  reason: collision with root package name */
    public final t f6588b;

    /* renamed from: c  reason: collision with root package name */
    public long f6589c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final i f6590d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b> f6591e;

    /* renamed from: if.u$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final i f6592a;

        /* renamed from: b  reason: collision with root package name */
        public t f6593b = u.f6585f;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f6594c = new ArrayList();

        public a() {
            String uuid = UUID.randomUUID().toString();
            e.C(uuid, "UUID.randomUUID().toString()");
            this.f6592a = i.f11956t.b(uuid);
        }
    }

    /* renamed from: if.u$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final q f6595a;

        /* renamed from: b  reason: collision with root package name */
        public final z f6596b;

        public b(q qVar, z zVar) {
            this.f6595a = qVar;
            this.f6596b = zVar;
        }
    }

    static {
        t.a aVar = t.f6581f;
        f6585f = aVar.a("multipart/mixed");
        aVar.a("multipart/alternative");
        aVar.a("multipart/digest");
        aVar.a("multipart/parallel");
        g = aVar.a("multipart/form-data");
        byte b10 = (byte) 45;
        f6587j = new byte[]{b10, b10};
    }

    public u(i iVar, t tVar, List<b> list) {
        e.D(iVar, "boundaryByteString");
        e.D(tVar, "type");
        this.f6590d = iVar;
        this.f6591e = list;
        t.a aVar = t.f6581f;
        this.f6588b = aVar.a(tVar + "; boundary=" + iVar.r());
    }

    public final long a() throws IOException {
        long j10 = this.f6589c;
        if (j10 != -1) {
            return j10;
        }
        long d10 = d((g) null, true);
        this.f6589c = d10;
        return d10;
    }

    public final t b() {
        return this.f6588b;
    }

    public final void c(g gVar) throws IOException {
        d(gVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: uf.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: uf.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: uf.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: uf.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: uf.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d(uf.g r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            uf.e r13 = new uf.e
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<if.u$b> r1 = r12.f6591e
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00a9
            java.util.List<if.u$b> r6 = r12.f6591e
            java.lang.Object r6 = r6.get(r5)
            if.u$b r6 = (p002if.u.b) r6
            if.q r7 = r6.f6595a
            if.z r6 = r6.f6596b
            e6.e.B(r13)
            byte[] r8 = f6587j
            r13.Q(r8)
            uf.i r8 = r12.f6590d
            r13.e0(r8)
            byte[] r8 = i
            r13.Q(r8)
            if (r7 == 0) goto L_0x005c
            java.lang.String[] r8 = r7.f6560a
            int r8 = r8.length
            int r8 = r8 / 2
            r9 = r2
        L_0x003c:
            if (r9 >= r8) goto L_0x005c
            java.lang.String r10 = r7.e(r9)
            uf.g r10 = r13.j0(r10)
            byte[] r11 = f6586h
            uf.g r10 = r10.Q(r11)
            java.lang.String r11 = r7.h(r9)
            uf.g r10 = r10.j0(r11)
            byte[] r11 = i
            r10.Q(r11)
            int r9 = r9 + 1
            goto L_0x003c
        L_0x005c:
            if.t r7 = r6.b()
            if (r7 == 0) goto L_0x0073
            java.lang.String r8 = "Content-Type: "
            uf.g r8 = r13.j0(r8)
            java.lang.String r7 = r7.f6582a
            uf.g r7 = r8.j0(r7)
            byte[] r8 = i
            r7.Q(r8)
        L_0x0073:
            long r7 = r6.a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008d
            java.lang.String r9 = "Content-Length: "
            uf.g r9 = r13.j0(r9)
            uf.g r9 = r9.l0(r7)
            byte[] r10 = i
            r9.Q(r10)
            goto L_0x0096
        L_0x008d:
            if (r14 == 0) goto L_0x0096
            e6.e.B(r0)
            r0.a()
            return r9
        L_0x0096:
            byte[] r9 = i
            r13.Q(r9)
            if (r14 == 0) goto L_0x009f
            long r3 = r3 + r7
            goto L_0x00a2
        L_0x009f:
            r6.c(r13)
        L_0x00a2:
            r13.Q(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a9:
            e6.e.B(r13)
            byte[] r1 = f6587j
            r13.Q(r1)
            uf.i r2 = r12.f6590d
            r13.e0(r2)
            r13.Q(r1)
            byte[] r1 = i
            r13.Q(r1)
            if (r14 == 0) goto L_0x00c9
            e6.e.B(r0)
            long r13 = r0.f11952b
            long r3 = r3 + r13
            r0.a()
        L_0x00c9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002if.u.d(uf.g, boolean):long");
    }
}
