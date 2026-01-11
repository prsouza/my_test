package p002if;

import e6.e;
import java.io.Closeable;
import java.util.Objects;
import mf.c;
import org.slf4j.helpers.MessageFormatter;
import p002if.q;

/* renamed from: if.a0  reason: invalid package */
public final class a0 implements Closeable {
    public final long A;
    public final c B;

    /* renamed from: a  reason: collision with root package name */
    public final x f6452a;

    /* renamed from: b  reason: collision with root package name */
    public final w f6453b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6454c;

    /* renamed from: s  reason: collision with root package name */
    public final int f6455s;

    /* renamed from: t  reason: collision with root package name */
    public final p f6456t;

    /* renamed from: u  reason: collision with root package name */
    public final q f6457u;

    /* renamed from: v  reason: collision with root package name */
    public final b0 f6458v;

    /* renamed from: w  reason: collision with root package name */
    public final a0 f6459w;

    /* renamed from: x  reason: collision with root package name */
    public final a0 f6460x;

    /* renamed from: y  reason: collision with root package name */
    public final a0 f6461y;
    public final long z;

    public a0(x xVar, w wVar, String str, int i, p pVar, q qVar, b0 b0Var, a0 a0Var, a0 a0Var2, a0 a0Var3, long j10, long j11, c cVar) {
        this.f6452a = xVar;
        this.f6453b = wVar;
        this.f6454c = str;
        this.f6455s = i;
        this.f6456t = pVar;
        this.f6457u = qVar;
        this.f6458v = b0Var;
        this.f6459w = a0Var;
        this.f6460x = a0Var2;
        this.f6461y = a0Var3;
        this.z = j10;
        this.A = j11;
        this.B = cVar;
    }

    public static String a(a0 a0Var, String str) {
        Objects.requireNonNull(a0Var);
        String d10 = a0Var.f6457u.d(str);
        if (d10 != null) {
            return d10;
        }
        return null;
    }

    public final boolean c() {
        int i = this.f6455s;
        return 200 <= i && 299 >= i;
    }

    public final void close() {
        b0 b0Var = this.f6458v;
        if (b0Var != null) {
            b0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Response{protocol=");
        d10.append(this.f6453b);
        d10.append(", code=");
        d10.append(this.f6455s);
        d10.append(", message=");
        d10.append(this.f6454c);
        d10.append(", url=");
        d10.append(this.f6452a.f6627b);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }

    /* renamed from: if.a0$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public x f6462a;

        /* renamed from: b  reason: collision with root package name */
        public w f6463b;

        /* renamed from: c  reason: collision with root package name */
        public int f6464c;

        /* renamed from: d  reason: collision with root package name */
        public String f6465d;

        /* renamed from: e  reason: collision with root package name */
        public p f6466e;

        /* renamed from: f  reason: collision with root package name */
        public q.a f6467f;
        public b0 g;

        /* renamed from: h  reason: collision with root package name */
        public a0 f6468h;
        public a0 i;

        /* renamed from: j  reason: collision with root package name */
        public a0 f6469j;

        /* renamed from: k  reason: collision with root package name */
        public long f6470k;

        /* renamed from: l  reason: collision with root package name */
        public long f6471l;

        /* renamed from: m  reason: collision with root package name */
        public c f6472m;

        public a() {
            this.f6464c = -1;
            this.f6467f = new q.a();
        }

        public final a0 a() {
            int i10 = this.f6464c;
            if (i10 >= 0) {
                x xVar = this.f6462a;
                if (xVar != null) {
                    w wVar = this.f6463b;
                    if (wVar != null) {
                        String str = this.f6465d;
                        if (str != null) {
                            return new a0(xVar, wVar, str, i10, this.f6466e, this.f6467f.c(), this.g, this.f6468h, this.i, this.f6469j, this.f6470k, this.f6471l, this.f6472m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder d10 = a.a.d("code < 0: ");
            d10.append(this.f6464c);
            throw new IllegalStateException(d10.toString().toString());
        }

        public final a b(a0 a0Var) {
            c("cacheResponse", a0Var);
            this.i = a0Var;
            return this;
        }

        public final void c(String str, a0 a0Var) {
            if (a0Var != null) {
                boolean z = true;
                if (a0Var.f6458v == null) {
                    if (a0Var.f6459w == null) {
                        if (a0Var.f6460x == null) {
                            if (a0Var.f6461y != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException(a8.a.c(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(a8.a.c(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(a8.a.c(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(a8.a.c(str, ".body != null").toString());
            }
        }

        public final a d(q qVar) {
            this.f6467f = qVar.g();
            return this;
        }

        public final a e(String str) {
            e.D(str, "message");
            this.f6465d = str;
            return this;
        }

        public final a f(w wVar) {
            e.D(wVar, "protocol");
            this.f6463b = wVar;
            return this;
        }

        public final a g(x xVar) {
            e.D(xVar, "request");
            this.f6462a = xVar;
            return this;
        }

        public a(a0 a0Var) {
            e.D(a0Var, "response");
            this.f6462a = a0Var.f6452a;
            this.f6463b = a0Var.f6453b;
            this.f6464c = a0Var.f6455s;
            this.f6465d = a0Var.f6454c;
            this.f6466e = a0Var.f6456t;
            this.f6467f = a0Var.f6457u.g();
            this.g = a0Var.f6458v;
            this.f6468h = a0Var.f6459w;
            this.i = a0Var.f6460x;
            this.f6469j = a0Var.f6461y;
            this.f6470k = a0Var.z;
            this.f6471l = a0Var.A;
            this.f6472m = a0Var.B;
        }
    }
}
