package i7;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

public final class m implements u1 {

    /* renamed from: a  reason: collision with root package name */
    public final l f6323a;

    public m(l lVar) {
        Charset charset = z.f6396a;
        Objects.requireNonNull(lVar, "output");
        this.f6323a = lVar;
        lVar.f6319a = this;
    }

    public final void a(int i, boolean z) throws IOException {
        this.f6323a.D(i, z);
    }

    public final void b(int i, i iVar) throws IOException {
        this.f6323a.E(i, iVar);
    }

    public final void c(int i, double d10) throws IOException {
        l lVar = this.f6323a;
        Objects.requireNonNull(lVar);
        lVar.H(i, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i, int i10) throws IOException {
        this.f6323a.J(i, i10);
    }

    public final void e(int i, int i10) throws IOException {
        this.f6323a.F(i, i10);
    }

    public final void f(int i, long j10) throws IOException {
        this.f6323a.H(i, j10);
    }

    public final void g(int i, float f10) throws IOException {
        l lVar = this.f6323a;
        Objects.requireNonNull(lVar);
        lVar.F(i, Float.floatToRawIntBits(f10));
    }

    public final void h(int i, Object obj, f1 f1Var) throws IOException {
        l lVar = this.f6323a;
        lVar.P(i, 3);
        f1Var.b((q0) obj, lVar.f6319a);
        lVar.P(i, 4);
    }

    public final void i(int i, int i10) throws IOException {
        this.f6323a.J(i, i10);
    }

    public final void j(int i, long j10) throws IOException {
        this.f6323a.S(i, j10);
    }

    public final void k(int i, Object obj, f1 f1Var) throws IOException {
        this.f6323a.L(i, (q0) obj, f1Var);
    }

    public final void l(int i, Object obj) throws IOException {
        if (obj instanceof i) {
            this.f6323a.N(i, (i) obj);
        } else {
            this.f6323a.M(i, (q0) obj);
        }
    }

    public final void m(int i, int i10) throws IOException {
        this.f6323a.F(i, i10);
    }

    public final void n(int i, long j10) throws IOException {
        this.f6323a.H(i, j10);
    }

    public final void o(int i, int i10) throws IOException {
        this.f6323a.Q(i, (i10 >> 31) ^ (i10 << 1));
    }

    public final void p(int i, long j10) throws IOException {
        this.f6323a.S(i, l.B(j10));
    }

    public final void q(int i, int i10) throws IOException {
        this.f6323a.Q(i, i10);
    }

    public final void r(int i, long j10) throws IOException {
        this.f6323a.S(i, j10);
    }
}
