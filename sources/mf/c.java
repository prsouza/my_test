package mf;

import e6.e;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import nf.d;
import p002if.a0;
import p002if.n;
import p002if.x;
import pf.v;
import uf.b0;
import uf.j;
import uf.k;
import uf.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8600a;

    /* renamed from: b  reason: collision with root package name */
    public final h f8601b;

    /* renamed from: c  reason: collision with root package name */
    public final e f8602c;

    /* renamed from: d  reason: collision with root package name */
    public final n f8603d;

    /* renamed from: e  reason: collision with root package name */
    public final d f8604e;

    /* renamed from: f  reason: collision with root package name */
    public final d f8605f;

    public final class a extends j {

        /* renamed from: b  reason: collision with root package name */
        public boolean f8606b;

        /* renamed from: c  reason: collision with root package name */
        public long f8607c;

        /* renamed from: s  reason: collision with root package name */
        public boolean f8608s;

        /* renamed from: t  reason: collision with root package name */
        public final long f8609t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ c f8610u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, z zVar, long j10) {
            super(zVar);
            e.D(zVar, "delegate");
            this.f8610u = cVar;
            this.f8609t = j10;
        }

        public final void H(uf.e eVar, long j10) throws IOException {
            e.D(eVar, "source");
            if (!this.f8608s) {
                long j11 = this.f8609t;
                if (j11 == -1 || this.f8607c + j10 <= j11) {
                    try {
                        this.f11960a.H(eVar, j10);
                        this.f8607c += j10;
                    } catch (IOException e10) {
                        throw a(e10);
                    }
                } else {
                    StringBuilder d10 = a.a.d("expected ");
                    d10.append(this.f8609t);
                    d10.append(" bytes but received ");
                    d10.append(this.f8607c + j10);
                    throw new ProtocolException(d10.toString());
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f8606b) {
                return e10;
            }
            this.f8606b = true;
            return this.f8610u.a(false, true, e10);
        }

        public final void close() throws IOException {
            if (!this.f8608s) {
                this.f8608s = true;
                long j10 = this.f8609t;
                if (j10 == -1 || this.f8607c == j10) {
                    try {
                        super.close();
                        a((IOException) null);
                    } catch (IOException e10) {
                        throw a(e10);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    public final class b extends k {

        /* renamed from: b  reason: collision with root package name */
        public long f8611b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8612c = true;

        /* renamed from: s  reason: collision with root package name */
        public boolean f8613s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f8614t;

        /* renamed from: u  reason: collision with root package name */
        public final long f8615u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ c f8616v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, b0 b0Var, long j10) {
            super(b0Var);
            e.D(b0Var, "delegate");
            this.f8616v = cVar;
            this.f8615u = j10;
            if (j10 == 0) {
                a((IOException) null);
            }
        }

        public final long I(uf.e eVar, long j10) throws IOException {
            e.D(eVar, "sink");
            if (!this.f8614t) {
                try {
                    long I = this.f11961a.I(eVar, j10);
                    if (this.f8612c) {
                        this.f8612c = false;
                        c cVar = this.f8616v;
                        n nVar = cVar.f8603d;
                        e eVar2 = cVar.f8602c;
                        Objects.requireNonNull(nVar);
                        e.D(eVar2, "call");
                    }
                    if (I == -1) {
                        a((IOException) null);
                        return -1;
                    }
                    long j11 = this.f8611b + I;
                    long j12 = this.f8615u;
                    if (j12 != -1) {
                        if (j11 > j12) {
                            throw new ProtocolException("expected " + this.f8615u + " bytes but received " + j11);
                        }
                    }
                    this.f8611b = j11;
                    if (j11 == j12) {
                        a((IOException) null);
                    }
                    return I;
                } catch (IOException e10) {
                    throw a(e10);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f8613s) {
                return e10;
            }
            this.f8613s = true;
            if (e10 == null && this.f8612c) {
                this.f8612c = false;
                c cVar = this.f8616v;
                n nVar = cVar.f8603d;
                e eVar = cVar.f8602c;
                Objects.requireNonNull(nVar);
                e.D(eVar, "call");
            }
            return this.f8616v.a(true, false, e10);
        }

        public final void close() throws IOException {
            if (!this.f8614t) {
                this.f8614t = true;
                try {
                    super.close();
                    a((IOException) null);
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
        }
    }

    public c(e eVar, n nVar, d dVar, d dVar2) {
        e.D(nVar, "eventListener");
        this.f8602c = eVar;
        this.f8603d = nVar;
        this.f8604e = dVar;
        this.f8605f = dVar2;
        this.f8601b = dVar2.h();
    }

    public final <E extends IOException> IOException a(boolean z, boolean z10, IOException iOException) {
        if (iOException != null) {
            e(iOException);
        }
        if (z10) {
            if (iOException != null) {
                this.f8603d.b(this.f8602c, iOException);
            } else {
                n nVar = this.f8603d;
                e eVar = this.f8602c;
                Objects.requireNonNull(nVar);
                e.D(eVar, "call");
            }
        }
        if (z) {
            if (iOException != null) {
                this.f8603d.c(this.f8602c, iOException);
            } else {
                n nVar2 = this.f8603d;
                e eVar2 = this.f8602c;
                Objects.requireNonNull(nVar2);
                e.D(eVar2, "call");
            }
        }
        return this.f8602c.i(this, z10, z, iOException);
    }

    public final z b(x xVar) throws IOException {
        this.f8600a = false;
        p002if.z zVar = xVar.f6630e;
        e.B(zVar);
        long a10 = zVar.a();
        n nVar = this.f8603d;
        e eVar = this.f8602c;
        Objects.requireNonNull(nVar);
        e.D(eVar, "call");
        return new a(this, this.f8605f.g(xVar, a10), a10);
    }

    public final a0.a c(boolean z) throws IOException {
        try {
            a0.a f10 = this.f8605f.f(z);
            if (f10 != null) {
                f10.f6472m = this;
            }
            return f10;
        } catch (IOException e10) {
            this.f8603d.c(this.f8602c, e10);
            e(e10);
            throw e10;
        }
    }

    public final void d() {
        n nVar = this.f8603d;
        e eVar = this.f8602c;
        Objects.requireNonNull(nVar);
        e.D(eVar, "call");
    }

    public final void e(IOException iOException) {
        this.f8604e.c(iOException);
        h h10 = this.f8605f.h();
        e eVar = this.f8602c;
        synchronized (h10) {
            e.D(eVar, "call");
            if (iOException instanceof v) {
                if (((v) iOException).f10054a == pf.b.REFUSED_STREAM) {
                    int i = h10.f8653m + 1;
                    h10.f8653m = i;
                    if (i > 1) {
                        h10.i = true;
                        h10.f8651k++;
                    }
                } else if (((v) iOException).f10054a != pf.b.CANCEL || !eVar.B) {
                    h10.i = true;
                    h10.f8651k++;
                }
            } else if (!h10.j() || (iOException instanceof pf.a)) {
                h10.i = true;
                if (h10.f8652l == 0) {
                    h10.d(eVar.E, h10.f8657q, iOException);
                    h10.f8651k++;
                }
            }
        }
    }
}
