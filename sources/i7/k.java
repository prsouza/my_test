package i7;

import com.google.android.gms.common.api.Api;
import i7.a0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;

public final class k implements e1 {

    /* renamed from: a  reason: collision with root package name */
    public final j f6311a;

    /* renamed from: b  reason: collision with root package name */
    public int f6312b;

    /* renamed from: c  reason: collision with root package name */
    public int f6313c;

    /* renamed from: d  reason: collision with root package name */
    public int f6314d = 0;

    public k(j jVar) {
        Charset charset = z.f6396a;
        Objects.requireNonNull(jVar, "input");
        this.f6311a = jVar;
        jVar.f6304c = this;
    }

    public final boolean A() throws IOException {
        int i;
        if (this.f6311a.e() || (i = this.f6312b) == this.f6313c) {
            return false;
        }
        return this.f6311a.A(i);
    }

    public final int B() throws IOException {
        S(5);
        return this.f6311a.r();
    }

    public final void C(List<i> list) throws IOException {
        int x10;
        if ((this.f6312b & 7) == 2) {
            do {
                list.add(u());
                if (!this.f6311a.e()) {
                    x10 = this.f6311a.x();
                } else {
                    return;
                }
            } while (x10 == this.f6312b);
            this.f6314d = x10;
            return;
        }
        throw a0.d();
    }

    public final void D(List<Double> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof n) {
            n nVar = (n) list;
            int i = this.f6312b & 7;
            if (i == 1) {
                do {
                    nVar.d(this.f6311a.k());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else if (i == 2) {
                int y10 = this.f6311a.y();
                U(y10);
                int d10 = this.f6311a.d() + y10;
                do {
                    nVar.d(this.f6311a.k());
                } while (this.f6311a.d() < d10);
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.f6311a.k()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else if (i10 == 2) {
                int y11 = this.f6311a.y();
                U(y11);
                int d11 = this.f6311a.d() + y11;
                do {
                    list.add(Double.valueOf(this.f6311a.k()));
                } while (this.f6311a.d() < d11);
            } else {
                throw a0.d();
            }
        }
    }

    public final <T> T E(f1<T> f1Var, p pVar) throws IOException {
        S(2);
        return P(f1Var, pVar);
    }

    public final void F(List<Long> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int i = this.f6312b & 7;
            if (i == 0) {
                do {
                    h0Var.d(this.f6311a.q());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else if (i == 2) {
                int d10 = this.f6311a.d() + this.f6311a.y();
                do {
                    h0Var.d(this.f6311a.q());
                } while (this.f6311a.d() < d10);
                R(d10);
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f6311a.q()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else if (i10 == 2) {
                int d11 = this.f6311a.d() + this.f6311a.y();
                do {
                    list.add(Long.valueOf(this.f6311a.q()));
                } while (this.f6311a.d() < d11);
                R(d11);
            } else {
                throw a0.d();
            }
        }
    }

    public final <T> void G(List<T> list, f1<T> f1Var, p pVar) throws IOException {
        int x10;
        int i = this.f6312b;
        if ((i & 7) == 3) {
            do {
                list.add(O(f1Var, pVar));
                if (!this.f6311a.e() && this.f6314d == 0) {
                    x10 = this.f6311a.x();
                } else {
                    return;
                }
            } while (x10 == i);
            this.f6314d = x10;
            return;
        }
        int i10 = a0.f6234a;
        throw new a0.a();
    }

    public final void H(List<Long> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int i = this.f6312b & 7;
            if (i == 1) {
                do {
                    h0Var.d(this.f6311a.s());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else if (i == 2) {
                int y10 = this.f6311a.y();
                U(y10);
                int d10 = this.f6311a.d() + y10;
                do {
                    h0Var.d(this.f6311a.s());
                } while (this.f6311a.d() < d10);
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f6311a.s()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else if (i10 == 2) {
                int y11 = this.f6311a.y();
                U(y11);
                int d11 = this.f6311a.d() + y11;
                do {
                    list.add(Long.valueOf(this.f6311a.s()));
                } while (this.f6311a.d() < d11);
            } else {
                throw a0.d();
            }
        }
    }

    public final <T> T I(f1<T> f1Var, p pVar) throws IOException {
        S(3);
        return O(f1Var, pVar);
    }

    public final long J() throws IOException {
        S(0);
        return this.f6311a.q();
    }

    public final String K() throws IOException {
        S(2);
        return this.f6311a.w();
    }

    public final void L(List<Long> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int i = this.f6312b & 7;
            if (i == 1) {
                do {
                    h0Var.d(this.f6311a.n());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else if (i == 2) {
                int y10 = this.f6311a.y();
                U(y10);
                int d10 = this.f6311a.d() + y10;
                do {
                    h0Var.d(this.f6311a.n());
                } while (this.f6311a.d() < d10);
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f6311a.n()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else if (i10 == 2) {
                int y11 = this.f6311a.y();
                U(y11);
                int d11 = this.f6311a.d() + y11;
                do {
                    list.add(Long.valueOf(this.f6311a.n()));
                } while (this.f6311a.d() < d11);
            } else {
                throw a0.d();
            }
        }
    }

    public final void M(List<Integer> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i = this.f6312b & 7;
            if (i == 0) {
                do {
                    yVar.d(this.f6311a.p());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else if (i == 2) {
                int d10 = this.f6311a.d() + this.f6311a.y();
                do {
                    yVar.d(this.f6311a.p());
                } while (this.f6311a.d() < d10);
                R(d10);
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f6311a.p()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else if (i10 == 2) {
                int d11 = this.f6311a.d() + this.f6311a.y();
                do {
                    list.add(Integer.valueOf(this.f6311a.p()));
                } while (this.f6311a.d() < d11);
                R(d11);
            } else {
                throw a0.d();
            }
        }
    }

    public final void N(List<Integer> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i = this.f6312b & 7;
            if (i == 0) {
                do {
                    yVar.d(this.f6311a.l());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else if (i == 2) {
                int d10 = this.f6311a.d() + this.f6311a.y();
                do {
                    yVar.d(this.f6311a.l());
                } while (this.f6311a.d() < d10);
                R(d10);
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f6311a.l()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else if (i10 == 2) {
                int d11 = this.f6311a.d() + this.f6311a.y();
                do {
                    list.add(Integer.valueOf(this.f6311a.l()));
                } while (this.f6311a.d() < d11);
                R(d11);
            } else {
                throw a0.d();
            }
        }
    }

    public final <T> T O(f1<T> f1Var, p pVar) throws IOException {
        int i = this.f6313c;
        this.f6313c = ((this.f6312b >>> 3) << 3) | 4;
        try {
            T i10 = f1Var.i();
            f1Var.d(i10, this, pVar);
            f1Var.e(i10);
            if (this.f6312b == this.f6313c) {
                return i10;
            }
            throw a0.g();
        } finally {
            this.f6313c = i;
        }
    }

    public final <T> T P(f1<T> f1Var, p pVar) throws IOException {
        int y10 = this.f6311a.y();
        j jVar = this.f6311a;
        if (jVar.f6302a < jVar.f6303b) {
            int h10 = jVar.h(y10);
            T i = f1Var.i();
            this.f6311a.f6302a++;
            f1Var.d(i, this, pVar);
            f1Var.e(i);
            this.f6311a.a(0);
            j jVar2 = this.f6311a;
            jVar2.f6302a--;
            jVar2.g(h10);
            return i;
        }
        throw new a0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void Q(List<String> list, boolean z) throws IOException {
        int x10;
        int x11;
        if ((this.f6312b & 7) != 2) {
            throw a0.d();
        } else if (!(list instanceof f0) || z) {
            do {
                list.add(z ? K() : m());
                if (!this.f6311a.e()) {
                    x10 = this.f6311a.x();
                } else {
                    return;
                }
            } while (x10 == this.f6312b);
            this.f6314d = x10;
        } else {
            f0 f0Var = (f0) list;
            do {
                f0Var.T(u());
                if (!this.f6311a.e()) {
                    x11 = this.f6311a.x();
                } else {
                    return;
                }
            } while (x11 == this.f6312b);
            this.f6314d = x11;
        }
    }

    public final void R(int i) throws IOException {
        if (this.f6311a.d() != i) {
            throw a0.h();
        }
    }

    public final void S(int i) throws IOException {
        if ((this.f6312b & 7) != i) {
            throw a0.d();
        }
    }

    public final void T(int i) throws IOException {
        if ((i & 3) != 0) {
            throw a0.g();
        }
    }

    public final void U(int i) throws IOException {
        if ((i & 7) != 0) {
            throw a0.g();
        }
    }

    public final int a() {
        return this.f6312b;
    }

    public final void b(List<Integer> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i = this.f6312b & 7;
            if (i == 0) {
                do {
                    yVar.d(this.f6311a.t());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else if (i == 2) {
                int d10 = this.f6311a.d() + this.f6311a.y();
                do {
                    yVar.d(this.f6311a.t());
                } while (this.f6311a.d() < d10);
                R(d10);
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f6311a.t()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else if (i10 == 2) {
                int d11 = this.f6311a.d() + this.f6311a.y();
                do {
                    list.add(Integer.valueOf(this.f6311a.t()));
                } while (this.f6311a.d() < d11);
                R(d11);
            } else {
                throw a0.d();
            }
        }
    }

    public final int c() throws IOException {
        S(0);
        return this.f6311a.l();
    }

    public final long d() throws IOException {
        S(0);
        return this.f6311a.z();
    }

    public final void e(List<Integer> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i = this.f6312b & 7;
            if (i == 2) {
                int y10 = this.f6311a.y();
                T(y10);
                int d10 = this.f6311a.d() + y10;
                do {
                    yVar.d(this.f6311a.m());
                } while (this.f6311a.d() < d10);
            } else if (i == 5) {
                do {
                    yVar.d(this.f6311a.m());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 2) {
                int y11 = this.f6311a.y();
                T(y11);
                int d11 = this.f6311a.d() + y11;
                do {
                    list.add(Integer.valueOf(this.f6311a.m()));
                } while (this.f6311a.d() < d11);
            } else if (i10 == 5) {
                do {
                    list.add(Integer.valueOf(this.f6311a.m()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else {
                throw a0.d();
            }
        }
    }

    public final long f() throws IOException {
        S(1);
        return this.f6311a.n();
    }

    public final void g(List<Integer> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i = this.f6312b & 7;
            if (i == 2) {
                int y10 = this.f6311a.y();
                T(y10);
                int d10 = this.f6311a.d() + y10;
                do {
                    yVar.d(this.f6311a.r());
                } while (this.f6311a.d() < d10);
            } else if (i == 5) {
                do {
                    yVar.d(this.f6311a.r());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 2) {
                int y11 = this.f6311a.y();
                T(y11);
                int d11 = this.f6311a.d() + y11;
                do {
                    list.add(Integer.valueOf(this.f6311a.r()));
                } while (this.f6311a.d() < d11);
            } else if (i10 == 5) {
                do {
                    list.add(Integer.valueOf(this.f6311a.r()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else {
                throw a0.d();
            }
        }
    }

    public final int h() throws IOException {
        S(0);
        return this.f6311a.t();
    }

    public final void i(List<Long> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int i = this.f6312b & 7;
            if (i == 0) {
                do {
                    h0Var.d(this.f6311a.u());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else if (i == 2) {
                int d10 = this.f6311a.d() + this.f6311a.y();
                do {
                    h0Var.d(this.f6311a.u());
                } while (this.f6311a.d() < d10);
                R(d10);
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f6311a.u()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else if (i10 == 2) {
                int d11 = this.f6311a.d() + this.f6311a.y();
                do {
                    list.add(Long.valueOf(this.f6311a.u()));
                } while (this.f6311a.d() < d11);
                R(d11);
            } else {
                throw a0.d();
            }
        }
    }

    public final long j() throws IOException {
        S(0);
        return this.f6311a.u();
    }

    public final void k(List<Integer> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i = this.f6312b & 7;
            if (i == 0) {
                do {
                    yVar.d(this.f6311a.y());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else if (i == 2) {
                int d10 = this.f6311a.d() + this.f6311a.y();
                do {
                    yVar.d(this.f6311a.y());
                } while (this.f6311a.d() < d10);
                R(d10);
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f6311a.y()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else if (i10 == 2) {
                int d11 = this.f6311a.d() + this.f6311a.y();
                do {
                    list.add(Integer.valueOf(this.f6311a.y()));
                } while (this.f6311a.d() < d11);
                R(d11);
            } else {
                throw a0.d();
            }
        }
    }

    public final void l(List<Boolean> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof f) {
            f fVar = (f) list;
            int i = this.f6312b & 7;
            if (i == 0) {
                do {
                    fVar.d(this.f6311a.i());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else if (i == 2) {
                int d10 = this.f6311a.d() + this.f6311a.y();
                do {
                    fVar.d(this.f6311a.i());
                } while (this.f6311a.d() < d10);
                R(d10);
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f6311a.i()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else if (i10 == 2) {
                int d11 = this.f6311a.d() + this.f6311a.y();
                do {
                    list.add(Boolean.valueOf(this.f6311a.i()));
                } while (this.f6311a.d() < d11);
                R(d11);
            } else {
                throw a0.d();
            }
        }
    }

    public final String m() throws IOException {
        S(2);
        return this.f6311a.v();
    }

    public final int n() throws IOException {
        S(5);
        return this.f6311a.m();
    }

    public final boolean o() throws IOException {
        S(0);
        return this.f6311a.i();
    }

    public final int p() throws IOException {
        int i = this.f6314d;
        if (i != 0) {
            this.f6312b = i;
            this.f6314d = 0;
        } else {
            this.f6312b = this.f6311a.x();
        }
        int i10 = this.f6312b;
        return (i10 == 0 || i10 == this.f6313c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i10 >>> 3;
    }

    public final void q(List<String> list) throws IOException {
        Q(list, false);
    }

    public final long r() throws IOException {
        S(1);
        return this.f6311a.s();
    }

    public final double readDouble() throws IOException {
        S(1);
        return this.f6311a.k();
    }

    public final float readFloat() throws IOException {
        S(5);
        return this.f6311a.o();
    }

    public final void s(List<Long> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int i = this.f6312b & 7;
            if (i == 0) {
                do {
                    h0Var.d(this.f6311a.z());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else if (i == 2) {
                int d10 = this.f6311a.d() + this.f6311a.y();
                do {
                    h0Var.d(this.f6311a.z());
                } while (this.f6311a.d() < d10);
                R(d10);
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f6311a.z()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else if (i10 == 2) {
                int d11 = this.f6311a.d() + this.f6311a.y();
                do {
                    list.add(Long.valueOf(this.f6311a.z()));
                } while (this.f6311a.d() < d11);
                R(d11);
            } else {
                throw a0.d();
            }
        }
    }

    public final void t(List<String> list) throws IOException {
        Q(list, true);
    }

    public final i u() throws IOException {
        S(2);
        return this.f6311a.j();
    }

    public final <T> void v(List<T> list, f1<T> f1Var, p pVar) throws IOException {
        int x10;
        int i = this.f6312b;
        if ((i & 7) == 2) {
            do {
                list.add(P(f1Var, pVar));
                if (!this.f6311a.e() && this.f6314d == 0) {
                    x10 = this.f6311a.x();
                } else {
                    return;
                }
            } while (x10 == i);
            this.f6314d = x10;
            return;
        }
        int i10 = a0.f6234a;
        throw new a0.a();
    }

    public final void w(List<Float> list) throws IOException {
        int x10;
        int x11;
        if (list instanceof v) {
            v vVar = (v) list;
            int i = this.f6312b & 7;
            if (i == 2) {
                int y10 = this.f6311a.y();
                T(y10);
                int d10 = this.f6311a.d() + y10;
                do {
                    vVar.d(this.f6311a.o());
                } while (this.f6311a.d() < d10);
            } else if (i == 5) {
                do {
                    vVar.d(this.f6311a.o());
                    if (!this.f6311a.e()) {
                        x11 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x11 == this.f6312b);
                this.f6314d = x11;
            } else {
                throw a0.d();
            }
        } else {
            int i10 = this.f6312b & 7;
            if (i10 == 2) {
                int y11 = this.f6311a.y();
                T(y11);
                int d11 = this.f6311a.d() + y11;
                do {
                    list.add(Float.valueOf(this.f6311a.o()));
                } while (this.f6311a.d() < d11);
            } else if (i10 == 5) {
                do {
                    list.add(Float.valueOf(this.f6311a.o()));
                    if (!this.f6311a.e()) {
                        x10 = this.f6311a.x();
                    } else {
                        return;
                    }
                } while (x10 == this.f6312b);
                this.f6314d = x10;
            } else {
                throw a0.d();
            }
        }
    }

    public final int x() throws IOException {
        S(0);
        return this.f6311a.y();
    }

    public final <K, V> void y() throws IOException {
        S(2);
        this.f6311a.h(this.f6311a.y());
        throw null;
    }

    public final int z() throws IOException {
        S(0);
        return this.f6311a.p();
    }
}
