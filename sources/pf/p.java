package pf;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pf.d;
import uf.b0;
import uf.c0;
import uf.e;
import uf.h;
import uf.i;

public final class p implements Closeable {

    /* renamed from: t  reason: collision with root package name */
    public static final Logger f10002t;

    /* renamed from: u  reason: collision with root package name */
    public static final a f10003u = new a();

    /* renamed from: a  reason: collision with root package name */
    public final b f10004a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f10005b;

    /* renamed from: c  reason: collision with root package name */
    public final h f10006c;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f10007s;

    public static final class a {
        public final int a(int i, int i10, int i11) throws IOException {
            if ((i10 & 8) != 0) {
                i--;
            }
            if (i11 <= i) {
                return i - i11;
            }
            throw new IOException(androidx.activity.result.d.b("PROTOCOL_ERROR padding ", i11, " > remaining length ", i));
        }
    }

    public static final class b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        public int f10008a;

        /* renamed from: b  reason: collision with root package name */
        public int f10009b;

        /* renamed from: c  reason: collision with root package name */
        public int f10010c;

        /* renamed from: s  reason: collision with root package name */
        public int f10011s;

        /* renamed from: t  reason: collision with root package name */
        public int f10012t;

        /* renamed from: u  reason: collision with root package name */
        public final h f10013u;

        public b(h hVar) {
            this.f10013u = hVar;
        }

        public final long I(e eVar, long j10) throws IOException {
            int i;
            int readInt;
            e6.e.D(eVar, "sink");
            do {
                int i10 = this.f10011s;
                if (i10 == 0) {
                    this.f10013u.skip((long) this.f10012t);
                    this.f10012t = 0;
                    if ((this.f10009b & 4) != 0) {
                        return -1;
                    }
                    i = this.f10010c;
                    int t10 = jf.c.t(this.f10013u);
                    this.f10011s = t10;
                    this.f10008a = t10;
                    byte readByte = this.f10013u.readByte() & 255;
                    this.f10009b = this.f10013u.readByte() & 255;
                    a aVar = p.f10003u;
                    Logger logger = p.f10002t;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(e.f9950e.b(true, this.f10010c, this.f10008a, readByte, this.f10009b));
                    }
                    readInt = this.f10013u.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    this.f10010c = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long I = this.f10013u.I(eVar, Math.min(j10, (long) i10));
                    if (I == -1) {
                        return -1;
                    }
                    this.f10011s -= (int) I;
                    return I;
                }
            } while (readInt == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        public final void close() throws IOException {
        }

        public final c0 d() {
            return this.f10013u.d();
        }
    }

    public interface c {
        void a(int i, List list) throws IOException;

        void b();

        void d(boolean z, int i, List list);

        void e();

        void f(boolean z, int i, int i10);

        void g(boolean z, int i, h hVar, int i10) throws IOException;

        void i(int i, b bVar);

        void l(int i, b bVar, i iVar);

        void m(int i, long j10);

        void n(u uVar);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        e6.e.C(logger, "Logger.getLogger(Http2::class.java.name)");
        f10002t = logger;
    }

    public p(h hVar, boolean z) {
        this.f10006c = hVar;
        this.f10007s = z;
        b bVar = new b(hVar);
        this.f10004a = bVar;
        this.f10005b = new d.a(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b6, code lost:
        throw new java.io.IOException(b9.m.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r11));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r17, pf.p.c r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = "handler"
            e6.e.D(r1, r2)
            r2 = 0
            uf.h r3 = r0.f10006c     // Catch:{ EOFException -> 0x02cf }
            r4 = 9
            r3.i0(r4)     // Catch:{ EOFException -> 0x02cf }
            uf.h r3 = r0.f10006c
            int r3 = jf.c.t(r3)
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r10) goto L_0x02c3
            uf.h r4 = r0.f10006c
            byte r4 = r4.readByte()
            r11 = r4 & 255(0xff, float:3.57E-43)
            uf.h r4 = r0.f10006c
            byte r4 = r4.readByte()
            r12 = r4 & 255(0xff, float:3.57E-43)
            uf.h r4 = r0.f10006c
            int r4 = r4.readInt()
            r13 = 2147483647(0x7fffffff, float:NaN)
            r14 = r4 & r13
            java.util.logging.Logger r15 = f10002t
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r4 = r15.isLoggable(r4)
            if (r4 == 0) goto L_0x004e
            pf.e r4 = pf.e.f9950e
            r5 = 1
            r6 = r14
            r7 = r3
            r8 = r11
            r9 = r12
            java.lang.String r4 = r4.b(r5, r6, r7, r8, r9)
            r15.fine(r4)
        L_0x004e:
            r4 = 4
            if (r17 == 0) goto L_0x006d
            if (r11 != r4) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Expected a SETTINGS frame but was "
            java.lang.StringBuilder r2 = a.a.d(r2)
            pf.e r3 = pf.e.f9950e
            java.lang.String r3 = r3.a(r11)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006d:
            r5 = 5
            r6 = 8
            r7 = 1
            switch(r11) {
                case 0: goto L_0x0280;
                case 1: goto L_0x024a;
                case 2: goto L_0x022b;
                case 3: goto L_0x01f2;
                case 4: goto L_0x0152;
                case 5: goto L_0x0122;
                case 6: goto L_0x00f4;
                case 7: goto L_0x00ab;
                case 8: goto L_0x007c;
                default: goto L_0x0074;
            }
        L_0x0074:
            uf.h r1 = r0.f10006c
            long r2 = (long) r3
            r1.skip(r2)
            goto L_0x02c2
        L_0x007c:
            if (r3 != r4) goto L_0x009f
            uf.h r2 = r0.f10006c
            int r2 = r2.readInt()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            byte[] r5 = jf.c.f7250a
            long r5 = (long) r2
            long r2 = r5 & r3
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0097
            r1.m(r14, r2)
            goto L_0x02c2
        L_0x0097:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "windowSizeIncrement was 0"
            r1.<init>(r2)
            throw r1
        L_0x009f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r2 = b9.m.b(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x00ab:
            if (r3 < r6) goto L_0x00e8
            if (r14 != 0) goto L_0x00e0
            uf.h r2 = r0.f10006c
            int r2 = r2.readInt()
            uf.h r4 = r0.f10006c
            int r4 = r4.readInt()
            int r3 = r3 - r6
            pf.b$a r5 = pf.b.Companion
            pf.b r5 = r5.a(r4)
            if (r5 == 0) goto L_0x00d4
            uf.i r4 = uf.i.f11955s
            if (r3 <= 0) goto L_0x00cf
            uf.h r4 = r0.f10006c
            long r8 = (long) r3
            uf.i r4 = r4.p(r8)
        L_0x00cf:
            r1.l(r2, r5, r4)
            goto L_0x02c2
        L_0x00d4:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r2 = b9.m.b(r2, r4)
            r1.<init>(r2)
            throw r1
        L_0x00e0:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x00e8:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY length < 8: "
            java.lang.String r2 = b9.m.b(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x00f4:
            if (r3 != r6) goto L_0x0116
            if (r14 != 0) goto L_0x010e
            uf.h r3 = r0.f10006c
            int r3 = r3.readInt()
            uf.h r4 = r0.f10006c
            int r4 = r4.readInt()
            r5 = r12 & 1
            if (r5 == 0) goto L_0x0109
            r2 = r7
        L_0x0109:
            r1.f(r2, r3, r4)
            goto L_0x02c2
        L_0x010e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x0116:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING length != 8: "
            java.lang.String r2 = b9.m.b(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x0122:
            if (r14 == 0) goto L_0x014a
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0132
            uf.h r2 = r0.f10006c
            byte r2 = r2.readByte()
            byte[] r4 = jf.c.f7250a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x0132:
            uf.h r4 = r0.f10006c
            int r4 = r4.readInt()
            r4 = r4 & r13
            pf.p$a r5 = f10003u
            int r3 = r3 + -4
            int r3 = r5.a(r3, r12, r2)
            java.util.List r2 = r0.e(r3, r2, r12, r14)
            r1.a(r4, r2)
            goto L_0x02c2
        L_0x014a:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x0152:
            if (r14 != 0) goto L_0x01ea
            r6 = r12 & 1
            if (r6 == 0) goto L_0x0167
            if (r3 != 0) goto L_0x015f
            r18.b()
            goto L_0x02c2
        L_0x015f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r1.<init>(r2)
            throw r1
        L_0x0167:
            int r6 = r3 % 6
            if (r6 != 0) goto L_0x01de
            pf.u r6 = new pf.u
            r6.<init>()
            ce.c r2 = ad.c.C0(r2, r3)
            r3 = 6
            ce.a r2 = ad.c.y0(r2, r3)
            int r3 = r2.f3430a
            int r8 = r2.f3431b
            int r2 = r2.f3432c
            if (r2 < 0) goto L_0x0184
            if (r3 > r8) goto L_0x01d9
            goto L_0x0186
        L_0x0184:
            if (r3 < r8) goto L_0x01d9
        L_0x0186:
            uf.h r9 = r0.f10006c
            short r9 = r9.readShort()
            r11 = 65535(0xffff, float:9.1834E-41)
            byte[] r12 = jf.c.f7250a
            r9 = r9 & r11
            uf.h r11 = r0.f10006c
            int r11 = r11.readInt()
            r12 = 2
            if (r9 == r12) goto L_0x01c5
            r12 = 3
            if (r9 == r12) goto L_0x01c3
            if (r9 == r4) goto L_0x01b7
            if (r9 == r5) goto L_0x01a3
            goto L_0x01d2
        L_0x01a3:
            if (r11 < r10) goto L_0x01ab
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            if (r11 > r12) goto L_0x01ab
            goto L_0x01d2
        L_0x01ab:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r2 = b9.m.b(r2, r11)
            r1.<init>(r2)
            throw r1
        L_0x01b7:
            r9 = 7
            if (r11 < 0) goto L_0x01bb
            goto L_0x01d2
        L_0x01bb:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r1.<init>(r2)
            throw r1
        L_0x01c3:
            r9 = r4
            goto L_0x01d2
        L_0x01c5:
            if (r11 == 0) goto L_0x01d2
            if (r11 != r7) goto L_0x01ca
            goto L_0x01d2
        L_0x01ca:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r1.<init>(r2)
            throw r1
        L_0x01d2:
            r6.c(r9, r11)
            if (r3 == r8) goto L_0x01d9
            int r3 = r3 + r2
            goto L_0x0186
        L_0x01d9:
            r1.n(r6)
            goto L_0x02c2
        L_0x01de:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r2 = b9.m.b(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x01ea:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x01f2:
            if (r3 != r4) goto L_0x021d
            if (r14 == 0) goto L_0x0215
            uf.h r2 = r0.f10006c
            int r2 = r2.readInt()
            pf.b$a r3 = pf.b.Companion
            pf.b r3 = r3.a(r2)
            if (r3 == 0) goto L_0x0209
            r1.i(r14, r3)
            goto L_0x02c2
        L_0x0209:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r3 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r2 = b9.m.b(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x0215:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x021d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM length: "
            java.lang.String r4 = " != 4"
            java.lang.String r2 = a8.a.b(r2, r3, r4)
            r1.<init>(r2)
            throw r1
        L_0x022b:
            if (r3 != r5) goto L_0x023c
            if (r14 == 0) goto L_0x0234
            r0.f(r1, r14)
            goto L_0x02c2
        L_0x0234:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x023c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY length: "
            java.lang.String r4 = " != 5"
            java.lang.String r2 = a8.a.b(r2, r3, r4)
            r1.<init>(r2)
            throw r1
        L_0x024a:
            if (r14 == 0) goto L_0x0278
            r4 = r12 & 1
            if (r4 == 0) goto L_0x0252
            r4 = r7
            goto L_0x0253
        L_0x0252:
            r4 = r2
        L_0x0253:
            r5 = r12 & 8
            if (r5 == 0) goto L_0x0261
            uf.h r2 = r0.f10006c
            byte r2 = r2.readByte()
            byte[] r5 = jf.c.f7250a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x0261:
            r5 = r12 & 32
            if (r5 == 0) goto L_0x026a
            r0.f(r1, r14)
            int r3 = r3 + -5
        L_0x026a:
            pf.p$a r5 = f10003u
            int r3 = r5.a(r3, r12, r2)
            java.util.List r2 = r0.e(r3, r2, r12, r14)
            r1.d(r4, r14, r2)
            goto L_0x02c2
        L_0x0278:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x0280:
            if (r14 == 0) goto L_0x02ba
            r4 = r12 & 1
            if (r4 == 0) goto L_0x0288
            r4 = r7
            goto L_0x0289
        L_0x0288:
            r4 = r2
        L_0x0289:
            r5 = r12 & 32
            if (r5 == 0) goto L_0x028f
            r5 = r7
            goto L_0x0290
        L_0x028f:
            r5 = r2
        L_0x0290:
            if (r5 != 0) goto L_0x02b2
            r5 = r12 & 8
            if (r5 == 0) goto L_0x02a0
            uf.h r2 = r0.f10006c
            byte r2 = r2.readByte()
            byte[] r5 = jf.c.f7250a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x02a0:
            pf.p$a r5 = f10003u
            int r3 = r5.a(r3, r12, r2)
            uf.h r5 = r0.f10006c
            r1.g(r4, r14, r5, r3)
            uf.h r1 = r0.f10006c
            long r2 = (long) r2
            r1.skip(r2)
            goto L_0x02c2
        L_0x02b2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r1.<init>(r2)
            throw r1
        L_0x02ba:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x02c2:
            return r7
        L_0x02c3:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR: "
            java.lang.String r2 = b9.m.b(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x02cf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.p.a(boolean, pf.p$c):boolean");
    }

    public final void c(c cVar) throws IOException {
        e6.e.D(cVar, "handler");
        if (!this.f10007s) {
            h hVar = this.f10006c;
            i iVar = e.f9946a;
            i p10 = hVar.p((long) iVar.f11959c.length);
            Logger logger = f10002t;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder d10 = a.a.d("<< CONNECTION ");
                d10.append(p10.i());
                logger.fine(jf.c.i(d10.toString(), new Object[0]));
            }
            if (!e6.e.r(iVar, p10)) {
                StringBuilder d11 = a.a.d("Expected a connection header but was ");
                d11.append(p10.r());
                throw new IOException(d11.toString());
            }
        } else if (!a(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public final void close() throws IOException {
        this.f10006c.close();
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List<pf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.util.List<pf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.List<pf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v25, types: [java.util.List<pf.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v30, types: [java.util.List<pf.c>, java.util.ArrayList] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<pf.c> e(int r3, int r4, int r5, int r6) throws java.io.IOException {
        /*
            r2 = this;
            pf.p$b r0 = r2.f10004a
            r0.f10011s = r3
            r0.f10008a = r3
            r0.f10012t = r4
            r0.f10009b = r5
            r0.f10010c = r6
            pf.d$a r3 = r2.f10005b
        L_0x000e:
            uf.v r4 = r3.f9933b
            boolean r4 = r4.J()
            if (r4 != 0) goto L_0x0131
            uf.v r4 = r3.f9933b
            byte r4 = r4.readByte()
            byte[] r5 = jf.c.f7250a
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x0129
            r6 = r4 & 128(0x80, float:1.794E-43)
            r0 = 1
            if (r6 != r5) goto L_0x007c
            r5 = 127(0x7f, float:1.78E-43)
            int r4 = r3.f(r4, r5)
            int r4 = r4 - r0
            if (r4 < 0) goto L_0x003c
            pf.d r5 = pf.d.f9931c
            pf.c[] r5 = pf.d.f9929a
            int r5 = r5.length
            int r5 = r5 - r0
            if (r4 > r5) goto L_0x003c
            r5 = r0
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            if (r5 == 0) goto L_0x004b
            pf.d r5 = pf.d.f9931c
            pf.c[] r5 = pf.d.f9929a
            r4 = r5[r4]
            java.util.List<pf.c> r5 = r3.f9932a
            r5.add(r4)
            goto L_0x000e
        L_0x004b:
            pf.d r5 = pf.d.f9931c
            pf.c[] r5 = pf.d.f9929a
            int r5 = r5.length
            int r5 = r4 - r5
            int r6 = r3.f9935d
            int r6 = r6 + r0
            int r6 = r6 + r5
            if (r6 < 0) goto L_0x0068
            pf.c[] r5 = r3.f9934c
            int r1 = r5.length
            if (r6 >= r1) goto L_0x0068
            java.util.List<pf.c> r4 = r3.f9932a
            r5 = r5[r6]
            e6.e.B(r5)
            r4.add(r5)
            goto L_0x000e
        L_0x0068:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r5 = "Header index too large "
            java.lang.StringBuilder r5 = a.a.d(r5)
            int r4 = r4 + r0
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L_0x007c:
            r5 = 64
            if (r4 != r5) goto L_0x0097
            pf.d r4 = pf.d.f9931c
            uf.i r5 = r3.e()
            r4.a(r5)
            uf.i r4 = r3.e()
            pf.c r6 = new pf.c
            r6.<init>((uf.i) r5, (uf.i) r4)
            r3.d(r6)
            goto L_0x000e
        L_0x0097:
            r6 = r4 & 64
            if (r6 != r5) goto L_0x00b4
            r5 = 63
            int r4 = r3.f(r4, r5)
            int r4 = r4 - r0
            uf.i r4 = r3.c(r4)
            uf.i r5 = r3.e()
            pf.c r6 = new pf.c
            r6.<init>((uf.i) r4, (uf.i) r5)
            r3.d(r6)
            goto L_0x000e
        L_0x00b4:
            r5 = r4 & 32
            r6 = 32
            if (r5 != r6) goto L_0x00ee
            r5 = 31
            int r4 = r3.f(r4, r5)
            r3.f9938h = r4
            if (r4 < 0) goto L_0x00d9
            int r5 = r3.g
            if (r4 > r5) goto L_0x00d9
            int r5 = r3.f9937f
            if (r4 >= r5) goto L_0x000e
            if (r4 != 0) goto L_0x00d3
            r3.a()
            goto L_0x000e
        L_0x00d3:
            int r5 = r5 - r4
            r3.b(r5)
            goto L_0x000e
        L_0x00d9:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Invalid dynamic table size update "
            java.lang.StringBuilder r5 = a.a.d(r5)
            int r3 = r3.f9938h
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00ee:
            r5 = 16
            if (r4 == r5) goto L_0x0110
            if (r4 != 0) goto L_0x00f5
            goto L_0x0110
        L_0x00f5:
            r5 = 15
            int r4 = r3.f(r4, r5)
            int r4 = r4 - r0
            uf.i r4 = r3.c(r4)
            uf.i r5 = r3.e()
            java.util.List<pf.c> r6 = r3.f9932a
            pf.c r0 = new pf.c
            r0.<init>((uf.i) r4, (uf.i) r5)
            r6.add(r0)
            goto L_0x000e
        L_0x0110:
            pf.d r4 = pf.d.f9931c
            uf.i r5 = r3.e()
            r4.a(r5)
            uf.i r4 = r3.e()
            java.util.List<pf.c> r6 = r3.f9932a
            pf.c r0 = new pf.c
            r0.<init>((uf.i) r5, (uf.i) r4)
            r6.add(r0)
            goto L_0x000e
        L_0x0129:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x0131:
            pf.d$a r3 = r2.f10005b
            java.util.List<pf.c> r4 = r3.f9932a
            java.util.List r4 = nd.m.j1(r4)
            java.util.List<pf.c> r3 = r3.f9932a
            r3.clear()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.p.e(int, int, int, int):java.util.List");
    }

    public final void f(c cVar, int i) throws IOException {
        this.f10006c.readInt();
        this.f10006c.readByte();
        byte[] bArr = jf.c.f7250a;
        cVar.e();
    }
}
