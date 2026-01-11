package zi;

import java.io.InputStream;
import java.net.HttpURLConnection;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;

public final class a {

    @e(c = "io.nodle.sdk.core.actions.sync.CheckInboxKt", f = "checkInbox.kt", l = {42}, m = "checkInbox")
    /* renamed from: zi.a$a  reason: collision with other inner class name */
    public static final class C0287a extends c {

        /* renamed from: a  reason: collision with root package name */
        public HttpURLConnection f14477a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f14478b;

        /* renamed from: c  reason: collision with root package name */
        public int f14479c;

        public C0287a(d<? super C0287a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14478b = obj;
            this.f14479c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return a.b((oi.a) null, this);
        }
    }

    @e(c = "io.nodle.sdk.core.actions.sync.CheckInboxKt", f = "checkInbox.kt", l = {60}, m = "parseResponse")
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public oi.a f14480a;

        /* renamed from: b  reason: collision with root package name */
        public p4.d f14481b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f14482c;

        /* renamed from: s  reason: collision with root package name */
        public int f14483s;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14482c = obj;
            this.f14483s |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return a.a((oi.a) null, (InputStream) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046 A[Catch:{ Exception -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(oi.a r7, java.io.InputStream r8, pd.d<? super md.m> r9) {
        /*
            boolean r0 = r9 instanceof zi.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            zi.a$b r0 = (zi.a.b) r0
            int r1 = r0.f14483s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14483s = r1
            goto L_0x0018
        L_0x0013:
            zi.a$b r0 = new zi.a$b
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f14482c
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f14483s
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p4.d r7 = r0.f14481b
            oi.a r8 = r0.f14480a
            l6.b1.w(r9)     // Catch:{ Exception -> 0x0069 }
            goto L_0x0042
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            l6.b1.w(r9)
            p4.b r9 = new p4.b     // Catch:{ Exception -> 0x0069 }
            r9.<init>()     // Catch:{ Exception -> 0x0069 }
            p4.d r8 = r9.c(r8)     // Catch:{ Exception -> 0x0069 }
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x0042:
            boolean r9 = r7.f9671u     // Catch:{ Exception -> 0x0069 }
            if (r9 != 0) goto L_0x007b
            c.c r9 = r8.f9454e     // Catch:{ Exception -> 0x0069 }
            xe.f r2 = xe.n.a(r7)     // Catch:{ Exception -> 0x0069 }
            r0.f14480a = r8     // Catch:{ Exception -> 0x0069 }
            r0.f14481b = r7     // Catch:{ Exception -> 0x0069 }
            r0.f14483s = r3     // Catch:{ Exception -> 0x0069 }
            java.util.Objects.requireNonNull(r9)     // Catch:{ Exception -> 0x0069 }
            jd.c r4 = new jd.c     // Catch:{ Exception -> 0x0069 }
            r5 = 0
            r4.<init>(r9, r2, r5)     // Catch:{ Exception -> 0x0069 }
            java.lang.Object r9 = r9.b(r2, r4, r0)     // Catch:{ Exception -> 0x0069 }
            qd.a r2 = qd.a.COROUTINE_SUSPENDED     // Catch:{ Exception -> 0x0069 }
            if (r9 != r2) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            md.m r9 = md.m.f8555a     // Catch:{ Exception -> 0x0069 }
        L_0x0066:
            if (r9 != r1) goto L_0x0042
            return r1
        L_0x0069:
            r7 = move-exception
            ni.a r8 = ni.a.f9148d
            org.slf4j.Logger r8 = ni.a.f9147c
            java.lang.String r7 = r7.getMessage()
            java.lang.String r9 = "could not parse the response bundle: "
            java.lang.String r7 = e6.e.a0(r9, r7)
            r8.debug(r7)
        L_0x007b:
            md.m r7 = md.m.f8555a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zi.a.a(oi.a, java.io.InputStream, pd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(oi.a r7, pd.d<? super md.m> r8) {
        /*
            boolean r0 = r8 instanceof zi.a.C0287a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            zi.a$a r0 = (zi.a.C0287a) r0
            int r1 = r0.f14479c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14479c = r1
            goto L_0x0018
        L_0x0013:
            zi.a$a r0 = new zi.a$a
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f14478b
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f14479c
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.net.HttpURLConnection r7 = r0.f14477a
            l6.b1.w(r8)     // Catch:{ Exception -> 0x002d }
            goto L_0x00c4
        L_0x002a:
            r8 = move-exception
            goto L_0x00e5
        L_0x002d:
            r8 = move-exception
            goto L_0x00ce
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            l6.b1.w(r8)
            ni.a r8 = ni.a.f9148d
            org.slf4j.Logger r8 = ni.a.f9147c
            c.c r2 = r7.f9454e
            java.net.URI r2 = ah.v.j(r2)
            java.lang.String r4 = ">> checking inbox "
            java.lang.String r2 = e6.e.a0(r4, r2)
            r8.debug(r2)
            java.net.URL r8 = new java.net.URL
            c.c r2 = r7.f9454e
            java.net.URI r2 = ah.v.j(r2)
            java.lang.String r2 = r2.toString()
            r8.<init>(r2)
            java.net.URLConnection r8 = r8.openConnection()
            java.lang.String r2 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            java.util.Objects.requireNonNull(r8, r2)
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8
            java.lang.String r2 = "POST"
            r8.setRequestMethod(r2)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r8.setDoInput(r3)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r8.setDoOutput(r3)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r8.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r8.setReadTimeout(r2)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r4 = "application/octet-stream"
            r8.setRequestProperty(r2, r4)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r8.setInstanceFollowRedirects(r3)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r8.connect()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            java.io.OutputStream r2 = r8.getOutputStream()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            xe.f r4 = ad.c.i(r7)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            java.lang.String r5 = "out"
            e6.e.C(r2, r5)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            l6.b1.g(r4, r2)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            xe.f r4 = ad.c.u(r7)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            l6.b1.g(r4, r2)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            int r2 = r8.getResponseCode()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r4 = 202(0xca, float:2.83E-43)
            if (r2 == r4) goto L_0x00af
            int r2 = r8.getResponseCode()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 != r4) goto L_0x00c3
        L_0x00af:
            java.io.InputStream r2 = r8.getInputStream()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            java.lang.String r4 = "connection.inputStream"
            e6.e.C(r2, r4)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r0.f14477a = r8     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r0.f14479c = r3     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            java.lang.Object r7 = a(r7, r2, r0)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            if (r7 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r7 = r8
        L_0x00c4:
            r7.disconnect()
            goto L_0x00e2
        L_0x00c8:
            r7 = move-exception
            goto L_0x00e8
        L_0x00ca:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x00ce:
            ni.a r0 = ni.a.f9148d     // Catch:{ all -> 0x002a }
            org.slf4j.Logger r0 = ni.a.f9147c     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "error connecting to the endpoint: "
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x002a }
            java.lang.String r8 = e6.e.a0(r1, r8)     // Catch:{ all -> 0x002a }
            r0.debug(r8)     // Catch:{ all -> 0x002a }
            r7.disconnect()
        L_0x00e2:
            md.m r7 = md.m.f8555a
            return r7
        L_0x00e5:
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x00e8:
            r8.disconnect()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zi.a.b(oi.a, pd.d):java.lang.Object");
    }
}
