package p002if;

import androidx.lifecycle.i0;
import e6.e;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import jf.c;
import l6.a2;
import p002if.d;
import p002if.n;

/* renamed from: if.v  reason: invalid package */
public final class v implements Cloneable, d.a {
    public static final List<w> O = c.l(w.HTTP_2, w.HTTP_1_1);
    public static final List<i> P = c.l(i.f6518e, i.f6519f);
    public static final b Q = new b();
    public final ProxySelector A;
    public final b B;
    public final SocketFactory C;
    public final SSLSocketFactory D;
    public final X509TrustManager E;
    public final List<i> F;
    public final List<w> G;
    public final HostnameVerifier H;
    public final f I;
    public final tf.c J;
    public final int K;
    public final int L;
    public final int M;
    public final i0 N;

    /* renamed from: a  reason: collision with root package name */
    public final l f6597a;

    /* renamed from: b  reason: collision with root package name */
    public final a2 f6598b;

    /* renamed from: c  reason: collision with root package name */
    public final List<s> f6599c;

    /* renamed from: s  reason: collision with root package name */
    public final List<s> f6600s;

    /* renamed from: t  reason: collision with root package name */
    public final n.b f6601t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f6602u;

    /* renamed from: v  reason: collision with root package name */
    public final b f6603v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f6604w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f6605x;

    /* renamed from: y  reason: collision with root package name */
    public final k f6606y;
    public final m z;

    /* renamed from: if.v$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public l f6607a = new l();

        /* renamed from: b  reason: collision with root package name */
        public a2 f6608b = new a2(1);

        /* renamed from: c  reason: collision with root package name */
        public final List<s> f6609c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List<s> f6610d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public jf.a f6611e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6612f;
        public aa.b g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f6613h;
        public boolean i;

        /* renamed from: j  reason: collision with root package name */
        public a.b f6614j;

        /* renamed from: k  reason: collision with root package name */
        public jc.b f6615k;

        /* renamed from: l  reason: collision with root package name */
        public b f6616l;

        /* renamed from: m  reason: collision with root package name */
        public SocketFactory f6617m;

        /* renamed from: n  reason: collision with root package name */
        public List<i> f6618n;

        /* renamed from: o  reason: collision with root package name */
        public List<? extends w> f6619o;

        /* renamed from: p  reason: collision with root package name */
        public tf.d f6620p;

        /* renamed from: q  reason: collision with root package name */
        public f f6621q;

        /* renamed from: r  reason: collision with root package name */
        public int f6622r;

        /* renamed from: s  reason: collision with root package name */
        public int f6623s;

        /* renamed from: t  reason: collision with root package name */
        public int f6624t;

        /* renamed from: u  reason: collision with root package name */
        public long f6625u;

        public a() {
            byte[] bArr = c.f7250a;
            this.f6611e = new jf.a();
            this.f6612f = true;
            aa.b bVar = b.g;
            this.g = bVar;
            this.f6613h = true;
            this.i = true;
            this.f6614j = k.f6540h;
            this.f6615k = m.i;
            this.f6616l = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            e.C(socketFactory, "SocketFactory.getDefault()");
            this.f6617m = socketFactory;
            b bVar2 = v.Q;
            this.f6618n = v.P;
            this.f6619o = v.O;
            this.f6620p = tf.d.f11606a;
            this.f6621q = f.f6496c;
            this.f6622r = 10000;
            this.f6623s = 10000;
            this.f6624t = 10000;
            this.f6625u = 1024;
        }
    }

    /* renamed from: if.v$b */
    public static final class b {
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v(p002if.v.a r6) {
        /*
            r5 = this;
            r5.<init>()
            if.l r0 = r6.f6607a
            r5.f6597a = r0
            l6.a2 r0 = r6.f6608b
            r5.f6598b = r0
            java.util.List<if.s> r0 = r6.f6609c
            java.util.List r0 = jf.c.x(r0)
            r5.f6599c = r0
            java.util.List<if.s> r0 = r6.f6610d
            java.util.List r0 = jf.c.x(r0)
            r5.f6600s = r0
            jf.a r0 = r6.f6611e
            r5.f6601t = r0
            boolean r0 = r6.f6612f
            r5.f6602u = r0
            aa.b r0 = r6.g
            r5.f6603v = r0
            boolean r0 = r6.f6613h
            r5.f6604w = r0
            boolean r0 = r6.i
            r5.f6605x = r0
            a.b r0 = r6.f6614j
            r5.f6606y = r0
            jc.b r0 = r6.f6615k
            r5.z = r0
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
            if (r0 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            sf.a r0 = sf.a.f11135a
        L_0x0040:
            r5.A = r0
            if.b r0 = r6.f6616l
            r5.B = r0
            javax.net.SocketFactory r0 = r6.f6617m
            r5.C = r0
            java.util.List<if.i> r0 = r6.f6618n
            r5.F = r0
            java.util.List<? extends if.w> r1 = r6.f6619o
            r5.G = r1
            tf.d r1 = r6.f6620p
            r5.H = r1
            r1 = 0
            int r2 = r6.f6622r
            r5.K = r2
            int r2 = r6.f6623s
            r5.L = r2
            int r2 = r6.f6624t
            r5.M = r2
            androidx.lifecycle.i0 r2 = new androidx.lifecycle.i0
            r3 = 1
            r2.<init>((int) r3)
            r5.N = r2
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0076
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0076
            goto L_0x008c
        L_0x0076:
            java.util.Iterator r0 = r0.iterator()
        L_0x007a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008c
            java.lang.Object r2 = r0.next()
            if.i r2 = (p002if.i) r2
            boolean r2 = r2.f6520a
            if (r2 == 0) goto L_0x007a
            r0 = r1
            goto L_0x008d
        L_0x008c:
            r0 = r3
        L_0x008d:
            r2 = 0
            if (r0 == 0) goto L_0x009b
            r5.D = r2
            r5.J = r2
            r5.E = r2
            if.f r6 = p002if.f.f6496c
            r5.I = r6
            goto L_0x00c3
        L_0x009b:
            qf.h$a r0 = qf.h.f10446c
            qf.h r0 = qf.h.f10444a
            javax.net.ssl.X509TrustManager r0 = r0.n()
            r5.E = r0
            qf.h r4 = qf.h.f10444a
            e6.e.B(r0)
            javax.net.ssl.SSLSocketFactory r4 = r4.m(r0)
            r5.D = r4
            qf.h r4 = qf.h.f10444a
            tf.c r0 = r4.b(r0)
            r5.J = r0
            if.f r6 = r6.f6621q
            e6.e.B(r0)
            if.f r6 = r6.a(r0)
            r5.I = r6
        L_0x00c3:
            java.util.List<if.s> r6 = r5.f6599c
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            java.util.Objects.requireNonNull(r6, r0)
            boolean r6 = r6.contains(r2)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x019b
            java.util.List<if.s> r6 = r5.f6600s
            java.util.Objects.requireNonNull(r6, r0)
            boolean r6 = r6.contains(r2)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0182
            java.util.List<if.i> r6 = r5.F
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00ea
            goto L_0x0100
        L_0x00ea:
            java.util.Iterator r6 = r6.iterator()
        L_0x00ee:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r6.next()
            if.i r0 = (p002if.i) r0
            boolean r0 = r0.f6520a
            if (r0 == 0) goto L_0x00ee
            r6 = r1
            goto L_0x0101
        L_0x0100:
            r6 = r3
        L_0x0101:
            if (r6 == 0) goto L_0x0151
            javax.net.ssl.SSLSocketFactory r6 = r5.D
            if (r6 != 0) goto L_0x0109
            r6 = r3
            goto L_0x010a
        L_0x0109:
            r6 = r1
        L_0x010a:
            java.lang.String r0 = "Check failed."
            if (r6 == 0) goto L_0x0147
            tf.c r6 = r5.J
            if (r6 != 0) goto L_0x0114
            r6 = r3
            goto L_0x0115
        L_0x0114:
            r6 = r1
        L_0x0115:
            if (r6 == 0) goto L_0x013d
            javax.net.ssl.X509TrustManager r6 = r5.E
            if (r6 != 0) goto L_0x011c
            r1 = r3
        L_0x011c:
            if (r1 == 0) goto L_0x0133
            if.f r6 = r5.I
            if.f r1 = p002if.f.f6496c
            boolean r6 = e6.e.r(r6, r1)
            if (r6 == 0) goto L_0x0129
            goto L_0x015d
        L_0x0129:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0133:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x013d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0147:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0151:
            javax.net.ssl.SSLSocketFactory r6 = r5.D
            if (r6 == 0) goto L_0x0176
            tf.c r6 = r5.J
            if (r6 == 0) goto L_0x016a
            javax.net.ssl.X509TrustManager r6 = r5.E
            if (r6 == 0) goto L_0x015e
        L_0x015d:
            return
        L_0x015e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "x509TrustManager == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x016a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "certificateChainCleaner == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0176:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "sslSocketFactory == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0182:
            java.lang.String r6 = "Null network interceptor: "
            java.lang.StringBuilder r6 = a.a.d(r6)
            java.util.List<if.s> r0 = r5.f6600s
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L_0x019b:
            java.lang.String r6 = "Null interceptor: "
            java.lang.StringBuilder r6 = a.a.d(r6)
            java.util.List<if.s> r0 = r5.f6599c
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p002if.v.<init>(if.v$a):void");
    }

    public final d a(x xVar) {
        return new mf.e(this, xVar, false);
    }

    public final Object clone() {
        return super.clone();
    }

    public v() {
        this(new a());
    }
}
