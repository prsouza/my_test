package of;

import com.google.android.gms.common.internal.ImagesContract;
import fe.k;
import fe.o;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import mf.h;
import nf.i;
import p002if.a0;
import p002if.q;
import p002if.r;
import p002if.v;
import p002if.x;
import uf.b0;
import uf.c0;
import uf.g;
import uf.l;
import uf.z;

public final class b implements nf.d {

    /* renamed from: a  reason: collision with root package name */
    public int f9424a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9425b;

    /* renamed from: c  reason: collision with root package name */
    public q f9426c;

    /* renamed from: d  reason: collision with root package name */
    public final v f9427d;

    /* renamed from: e  reason: collision with root package name */
    public final h f9428e;

    /* renamed from: f  reason: collision with root package name */
    public final uf.h f9429f;
    public final g g;

    public abstract class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        public final l f9430a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9431b;

        public a() {
            this.f9430a = new l(b.this.f9429f.d());
        }

        public long I(uf.e eVar, long j10) {
            e6.e.D(eVar, "sink");
            try {
                return b.this.f9429f.I(eVar, j10);
            } catch (IOException e10) {
                b.this.f9428e.l();
                a();
                throw e10;
            }
        }

        public final void a() {
            b bVar = b.this;
            int i = bVar.f9424a;
            if (i != 6) {
                if (i == 5) {
                    b.i(bVar, this.f9430a);
                    b.this.f9424a = 6;
                    return;
                }
                StringBuilder d10 = a.a.d("state: ");
                d10.append(b.this.f9424a);
                throw new IllegalStateException(d10.toString());
            }
        }

        public final c0 d() {
            return this.f9430a;
        }
    }

    /* renamed from: of.b$b  reason: collision with other inner class name */
    public final class C0183b implements z {

        /* renamed from: a  reason: collision with root package name */
        public final l f9433a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9434b;

        public C0183b() {
            this.f9433a = new l(b.this.g.d());
        }

        public final void H(uf.e eVar, long j10) {
            e6.e.D(eVar, "source");
            if (!(!this.f9434b)) {
                throw new IllegalStateException("closed".toString());
            } else if (j10 != 0) {
                b.this.g.n(j10);
                b.this.g.j0("\r\n");
                b.this.g.H(eVar, j10);
                b.this.g.j0("\r\n");
            }
        }

        public final synchronized void close() {
            if (!this.f9434b) {
                this.f9434b = true;
                b.this.g.j0("0\r\n\r\n");
                b.i(b.this, this.f9433a);
                b.this.f9424a = 3;
            }
        }

        public final c0 d() {
            return this.f9433a;
        }

        public final synchronized void flush() {
            if (!this.f9434b) {
                b.this.g.flush();
            }
        }
    }

    public final class c extends a {

        /* renamed from: s  reason: collision with root package name */
        public long f9436s = -1;

        /* renamed from: t  reason: collision with root package name */
        public boolean f9437t = true;

        /* renamed from: u  reason: collision with root package name */
        public final r f9438u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ b f9439v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, r rVar) {
            super();
            e6.e.D(rVar, ImagesContract.URL);
            this.f9439v = bVar;
            this.f9438u = rVar;
        }

        public final long I(uf.e eVar, long j10) {
            e6.e.D(eVar, "sink");
            boolean z = true;
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(android.support.v4.media.a.d("byteCount < 0: ", j10).toString());
            } else if (!(!this.f9431b)) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f9437t) {
                return -1;
            } else {
                long j11 = this.f9436s;
                if (j11 == 0 || j11 == -1) {
                    if (j11 != -1) {
                        this.f9439v.f9429f.F();
                    }
                    try {
                        this.f9436s = this.f9439v.f9429f.q0();
                        String F = this.f9439v.f9429f.F();
                        if (F != null) {
                            String obj = o.D1(F).toString();
                            if (this.f9436s >= 0) {
                                if (obj.length() <= 0) {
                                    z = false;
                                }
                                if (!z || k.d1(obj, ";", false)) {
                                    if (this.f9436s == 0) {
                                        this.f9437t = false;
                                        b bVar = this.f9439v;
                                        bVar.f9426c = bVar.f9425b.a();
                                        v vVar = this.f9439v.f9427d;
                                        e6.e.B(vVar);
                                        p002if.k kVar = vVar.f6606y;
                                        r rVar = this.f9438u;
                                        q qVar = this.f9439v.f9426c;
                                        e6.e.B(qVar);
                                        nf.e.b(kVar, rVar, qVar);
                                        a();
                                    }
                                    if (!this.f9437t) {
                                        return -1;
                                    }
                                }
                            }
                            throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.f9436s + obj + '\"');
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    } catch (NumberFormatException e10) {
                        throw new ProtocolException(e10.getMessage());
                    }
                }
                long I = super.I(eVar, Math.min(j10, this.f9436s));
                if (I != -1) {
                    this.f9436s -= I;
                    return I;
                }
                this.f9439v.f9428e.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
        }

        public final void close() {
            if (!this.f9431b) {
                if (this.f9437t) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (!jf.c.h(this)) {
                        this.f9439v.f9428e.l();
                        a();
                    }
                }
                this.f9431b = true;
            }
        }
    }

    public final class d extends a {

        /* renamed from: s  reason: collision with root package name */
        public long f9440s;

        public d(long j10) {
            super();
            this.f9440s = j10;
            if (j10 == 0) {
                a();
            }
        }

        public final long I(uf.e eVar, long j10) {
            e6.e.D(eVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(android.support.v4.media.a.d("byteCount < 0: ", j10).toString());
            } else if (!this.f9431b) {
                long j11 = this.f9440s;
                if (j11 == 0) {
                    return -1;
                }
                long I = super.I(eVar, Math.min(j11, j10));
                if (I != -1) {
                    long j12 = this.f9440s - I;
                    this.f9440s = j12;
                    if (j12 == 0) {
                        a();
                    }
                    return I;
                }
                b.this.f9428e.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final void close() {
            if (!this.f9431b) {
                if (this.f9440s != 0) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (!jf.c.h(this)) {
                        b.this.f9428e.l();
                        a();
                    }
                }
                this.f9431b = true;
            }
        }
    }

    public final class e implements z {

        /* renamed from: a  reason: collision with root package name */
        public final l f9442a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9443b;

        public e() {
            this.f9442a = new l(b.this.g.d());
        }

        public final void H(uf.e eVar, long j10) {
            e6.e.D(eVar, "source");
            if (!this.f9443b) {
                jf.c.c(eVar.f11952b, 0, j10);
                b.this.g.H(eVar, j10);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public final void close() {
            if (!this.f9443b) {
                this.f9443b = true;
                b.i(b.this, this.f9442a);
                b.this.f9424a = 3;
            }
        }

        public final c0 d() {
            return this.f9442a;
        }

        public final void flush() {
            if (!this.f9443b) {
                b.this.g.flush();
            }
        }
    }

    public final class f extends a {

        /* renamed from: s  reason: collision with root package name */
        public boolean f9445s;

        public f(b bVar) {
            super();
        }

        public final long I(uf.e eVar, long j10) {
            e6.e.D(eVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(android.support.v4.media.a.d("byteCount < 0: ", j10).toString());
            } else if (!(!this.f9431b)) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f9445s) {
                return -1;
            } else {
                long I = super.I(eVar, j10);
                if (I != -1) {
                    return I;
                }
                this.f9445s = true;
                a();
                return -1;
            }
        }

        public final void close() {
            if (!this.f9431b) {
                if (!this.f9445s) {
                    a();
                }
                this.f9431b = true;
            }
        }
    }

    public b(v vVar, h hVar, uf.h hVar2, g gVar) {
        e6.e.D(hVar, "connection");
        this.f9427d = vVar;
        this.f9428e = hVar;
        this.f9429f = hVar2;
        this.g = gVar;
        this.f9425b = new a(hVar2);
    }

    public static final void i(b bVar, l lVar) {
        Objects.requireNonNull(bVar);
        c0 c0Var = lVar.f11962e;
        lVar.f11962e = c0.f11945d;
        c0Var.a();
        c0Var.b();
    }

    public final long a(a0 a0Var) {
        if (!nf.e.a(a0Var)) {
            return 0;
        }
        if (k.Y0("chunked", a0.a(a0Var, "Transfer-Encoding"))) {
            return -1;
        }
        return jf.c.k(a0Var);
    }

    public final void b() {
        this.g.flush();
    }

    public final b0 c(a0 a0Var) {
        if (!nf.e.a(a0Var)) {
            return j(0);
        }
        boolean z = true;
        if (k.Y0("chunked", a0.a(a0Var, "Transfer-Encoding"))) {
            r rVar = a0Var.f6452a.f6627b;
            if (this.f9424a != 4) {
                z = false;
            }
            if (z) {
                this.f9424a = 5;
                return new c(this, rVar);
            }
            StringBuilder d10 = a.a.d("state: ");
            d10.append(this.f9424a);
            throw new IllegalStateException(d10.toString().toString());
        }
        long k10 = jf.c.k(a0Var);
        if (k10 != -1) {
            return j(k10);
        }
        if (this.f9424a != 4) {
            z = false;
        }
        if (z) {
            this.f9424a = 5;
            this.f9428e.l();
            return new f(this);
        }
        StringBuilder d11 = a.a.d("state: ");
        d11.append(this.f9424a);
        throw new IllegalStateException(d11.toString().toString());
    }

    public final void cancel() {
        Socket socket = this.f9428e.f8644b;
        if (socket != null) {
            jf.c.e(socket);
        }
    }

    public final void d() {
        this.g.flush();
    }

    public final void e(x xVar) {
        Proxy.Type type = this.f9428e.f8657q.f6494b.type();
        e6.e.C(type, "connection.route().proxy.type()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xVar.f6628c);
        sb2.append(' ');
        r rVar = xVar.f6627b;
        if (!rVar.f6564a && type == Proxy.Type.HTTP) {
            sb2.append(rVar);
        } else {
            String b10 = rVar.b();
            String d10 = rVar.d();
            if (d10 != null) {
                b10 = b10 + '?' + d10;
            }
            sb2.append(b10);
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        e6.e.C(sb3, "StringBuilder().apply(builderAction).toString()");
        k(xVar.f6629d, sb3);
    }

    public final a0.a f(boolean z) {
        int i = this.f9424a;
        boolean z10 = true;
        if (!(i == 1 || i == 3)) {
            z10 = false;
        }
        if (z10) {
            try {
                i.a aVar = i.f9022d;
                a aVar2 = this.f9425b;
                String W = aVar2.f9423b.W(aVar2.f9422a);
                aVar2.f9422a -= (long) W.length();
                i a10 = aVar.a(W);
                a0.a aVar3 = new a0.a();
                aVar3.f(a10.f9023a);
                aVar3.f6464c = a10.f9024b;
                aVar3.e(a10.f9025c);
                aVar3.d(this.f9425b.a());
                if (z && a10.f9024b == 100) {
                    return null;
                }
                if (a10.f9024b == 100) {
                    this.f9424a = 3;
                    return aVar3;
                }
                this.f9424a = 4;
                return aVar3;
            } catch (EOFException e10) {
                throw new IOException(a8.a.c("unexpected end of stream on ", this.f9428e.f8657q.f6493a.f6443a.g()), e10);
            }
        } else {
            StringBuilder d10 = a.a.d("state: ");
            d10.append(this.f9424a);
            throw new IllegalStateException(d10.toString().toString());
        }
    }

    public final z g(x xVar, long j10) {
        boolean z = true;
        if (k.Y0("chunked", xVar.f6629d.d("Transfer-Encoding"))) {
            if (this.f9424a != 1) {
                z = false;
            }
            if (z) {
                this.f9424a = 2;
                return new C0183b();
            }
            StringBuilder d10 = a.a.d("state: ");
            d10.append(this.f9424a);
            throw new IllegalStateException(d10.toString().toString());
        } else if (j10 != -1) {
            if (this.f9424a != 1) {
                z = false;
            }
            if (z) {
                this.f9424a = 2;
                return new e();
            }
            StringBuilder d11 = a.a.d("state: ");
            d11.append(this.f9424a);
            throw new IllegalStateException(d11.toString().toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final h h() {
        return this.f9428e;
    }

    public final b0 j(long j10) {
        if (this.f9424a == 4) {
            this.f9424a = 5;
            return new d(j10);
        }
        StringBuilder d10 = a.a.d("state: ");
        d10.append(this.f9424a);
        throw new IllegalStateException(d10.toString().toString());
    }

    public final void k(q qVar, String str) {
        e6.e.D(qVar, "headers");
        e6.e.D(str, "requestLine");
        if (this.f9424a == 0) {
            this.g.j0(str).j0("\r\n");
            int length = qVar.f6560a.length / 2;
            for (int i = 0; i < length; i++) {
                this.g.j0(qVar.e(i)).j0(": ").j0(qVar.h(i)).j0("\r\n");
            }
            this.g.j0("\r\n");
            this.f9424a = 1;
            return;
        }
        StringBuilder d10 = a.a.d("state: ");
        d10.append(this.f9424a);
        throw new IllegalStateException(d10.toString().toString());
    }
}
