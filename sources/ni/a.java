package ni;

import a.b;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import net.jpountz.lz4.LZ4FrameOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p4.d;
import si.c;
import si.e;
import xe.f;

public class a implements e {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f9147c = LoggerFactory.getLogger("ConvergenceSenderHTTP");

    /* renamed from: d  reason: collision with root package name */
    public static final a f9148d = null;

    /* renamed from: a  reason: collision with root package name */
    public final c f9149a;

    /* renamed from: b  reason: collision with root package name */
    public final URI f9150b;

    @rd.e(c = "io.nodle.dtn.cla.http.ConvergenceSenderHTTP", f = "ConvergenceSenderHTTP.kt", l = {74}, m = "parseResponse")
    /* renamed from: ni.a$a  reason: collision with other inner class name */
    public static final class C0173a extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f9151a;

        /* renamed from: b  reason: collision with root package name */
        public int f9152b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f9153c;

        /* renamed from: s  reason: collision with root package name */
        public a f9154s;

        /* renamed from: t  reason: collision with root package name */
        public d f9155t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0173a(a aVar, pd.d dVar) {
            super(dVar);
            this.f9153c = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9151a = obj;
            this.f9152b |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f9153c.c((InputStream) null, this);
        }
    }

    public a(c cVar, URI uri) {
        e6.e.D(cVar, "agent");
        this.f9149a = cVar;
        this.f9150b = uri;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object e(ni.a r11, java.util.List r12, pd.d r13) {
        /*
            boolean r0 = r13 instanceof ni.b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            ni.b r0 = (ni.b) r0
            int r1 = r0.f9157b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9157b = r1
            goto L_0x0018
        L_0x0013:
            ni.b r0 = new ni.b
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f9156a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f9157b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.net.HttpURLConnection r11 = r0.f9159s
            l6.b1.w(r13)     // Catch:{ Exception -> 0x002e }
            goto L_0x00ee
        L_0x002b:
            r12 = move-exception
            goto L_0x011e
        L_0x002e:
            r12 = move-exception
            goto L_0x00fc
        L_0x0031:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0039:
            l6.b1.w(r13)
            org.slf4j.Logger r13 = f9147c
            java.lang.String r2 = ">> trying to upload bundles "
            java.lang.StringBuilder r2 = a.b.q(r2)
            ni.c r9 = ni.c.f9160b
            r7 = 0
            r8 = 0
            r10 = 30
            java.lang.String r6 = ","
            r5 = r12
            java.lang.String r5 = nd.m.b1(r5, r6, r7, r8, r9, r10)
            r2.append(r5)
            java.lang.String r5 = " to "
            r2.append(r5)
            java.net.URI r5 = r11.f9150b
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r13.debug(r2)
            java.net.URL r13 = new java.net.URL
            java.net.URI r2 = r11.f9150b
            java.lang.String r2 = r2.toString()
            r13.<init>(r2)
            java.net.URLConnection r13 = r13.openConnection()
            java.lang.String r2 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            java.util.Objects.requireNonNull(r13, r2)
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13
            java.lang.String r2 = "POST"
            r13.setRequestMethod(r2)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            r13.setDoInput(r4)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            r13.setDoOutput(r4)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r13.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            r13.setReadTimeout(r2)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r5 = "application/octet-stream"
            r13.setRequestProperty(r2, r5)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            r13.setInstanceFollowRedirects(r4)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            r13.connect()     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            java.io.OutputStream r2 = r13.getOutputStream()     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            int r6 = nd.g.S0(r12)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
        L_0x00ac:
            boolean r6 = r12.hasNext()     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            if (r6 == 0) goto L_0x00c6
            java.lang.Object r6 = r12.next()     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            xe.f r6 = (xe.f) r6     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            java.lang.String r7 = "out"
            e6.e.C(r2, r7)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            l6.b1.g(r6, r2)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            md.m r6 = md.m.f8555a     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            r5.add(r6)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            goto L_0x00ac
        L_0x00c6:
            int r12 = r13.getResponseCode()     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            r2 = 202(0xca, float:2.83E-43)
            if (r12 == r2) goto L_0x00d9
            int r12 = r13.getResponseCode()     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r12 != r2) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r11 = r3
            goto L_0x00f0
        L_0x00d9:
            java.io.InputStream r12 = r13.getInputStream()     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            java.lang.String r2 = "connection.inputStream"
            e6.e.C(r12, r2)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            r0.f9159s = r13     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            r0.f9157b = r4     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            java.lang.Object r11 = r11.c(r12, r0)     // Catch:{ Exception -> 0x00f9, all -> 0x00f7 }
            if (r11 != r1) goto L_0x00ed
            return r1
        L_0x00ed:
            r11 = r13
        L_0x00ee:
            r13 = r11
            r11 = r4
        L_0x00f0:
            r13.disconnect()
            if (r11 == 0) goto L_0x0119
            r3 = r4
            goto L_0x0119
        L_0x00f7:
            r11 = move-exception
            goto L_0x0120
        L_0x00f9:
            r11 = move-exception
            r12 = r11
            r11 = r13
        L_0x00fc:
            org.slf4j.Logger r13 = f9147c     // Catch:{ all -> 0x002b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r0.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r1 = "error connecting to the endpoint: "
            r0.append(r1)     // Catch:{ all -> 0x002b }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x002b }
            r0.append(r12)     // Catch:{ all -> 0x002b }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x002b }
            r13.debug(r12)     // Catch:{ all -> 0x002b }
            r11.disconnect()
        L_0x0119:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            return r11
        L_0x011e:
            r13 = r11
            r11 = r12
        L_0x0120:
            r13.disconnect()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.a.e(ni.a, java.util.List, pd.d):java.lang.Object");
    }

    public final URI a() {
        return this.f9150b;
    }

    public final Object b(f fVar, pd.d<? super Boolean> dVar) {
        return d(b.n0(fVar), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[Catch:{ Exception -> 0x006e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.io.InputStream r8, pd.d<? super md.m> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ni.a.C0173a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ni.a$a r0 = (ni.a.C0173a) r0
            int r1 = r0.f9152b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9152b = r1
            goto L_0x0018
        L_0x0013:
            ni.a$a r0 = new ni.a$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f9151a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f9152b
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p4.d r8 = r0.f9155t
            ni.a r2 = r0.f9154s
            l6.b1.w(r9)     // Catch:{ Exception -> 0x006e }
            goto L_0x0040
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            l6.b1.w(r9)
            p4.b r9 = new p4.b     // Catch:{ Exception -> 0x006e }
            r9.<init>()     // Catch:{ Exception -> 0x006e }
            p4.d r8 = r9.c(r8)     // Catch:{ Exception -> 0x006e }
            r2 = r7
        L_0x0040:
            java.lang.String r9 = "parser"
            e6.e.C(r8, r9)     // Catch:{ Exception -> 0x006e }
            boolean r9 = r8.f9671u     // Catch:{ Exception -> 0x006e }
            if (r9 != 0) goto L_0x0085
            si.c r9 = r2.f9149a     // Catch:{ Exception -> 0x006e }
            xe.f r4 = xe.n.a(r8)     // Catch:{ Exception -> 0x006e }
            r0.f9154s = r2     // Catch:{ Exception -> 0x006e }
            r0.f9155t = r8     // Catch:{ Exception -> 0x006e }
            r0.f9152b = r3     // Catch:{ Exception -> 0x006e }
            jd.b r9 = (jd.b) r9     // Catch:{ Exception -> 0x006e }
            java.util.Objects.requireNonNull(r9)     // Catch:{ Exception -> 0x006e }
            jd.c r5 = new jd.c     // Catch:{ Exception -> 0x006e }
            r6 = 0
            r5.<init>(r9, r4, r6)     // Catch:{ Exception -> 0x006e }
            java.lang.Object r9 = r9.b(r4, r5, r0)     // Catch:{ Exception -> 0x006e }
            qd.a r4 = qd.a.COROUTINE_SUSPENDED     // Catch:{ Exception -> 0x006e }
            if (r9 != r4) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            md.m r9 = md.m.f8555a     // Catch:{ Exception -> 0x006e }
        L_0x006b:
            if (r9 != r1) goto L_0x0040
            return r1
        L_0x006e:
            r8 = move-exception
            org.slf4j.Logger r9 = f9147c
            java.lang.String r0 = "could not parse the response bundle: "
            java.lang.StringBuilder r0 = a.b.q(r0)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.debug(r8)
        L_0x0085:
            md.m r8 = md.m.f8555a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.a.c(java.io.InputStream, pd.d):java.lang.Object");
    }

    public Object d(List<f> list, pd.d<? super Boolean> dVar) {
        throw null;
    }
}
