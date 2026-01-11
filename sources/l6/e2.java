package l6;

import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;
import o6.w;

public final class e2 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f7834a;

    /* renamed from: b  reason: collision with root package name */
    public final w f7835b;

    /* renamed from: c  reason: collision with root package name */
    public final g1 f7836c;

    /* renamed from: d  reason: collision with root package name */
    public final w f7837d;

    /* renamed from: e  reason: collision with root package name */
    public final x0 f7838e;

    public e2(a0 a0Var, w wVar, g1 g1Var, w wVar2, x0 x0Var) {
        this.f7834a = a0Var;
        this.f7835b = wVar;
        this.f7836c = g1Var;
        this.f7837d = wVar2;
        this.f7838e = x0Var;
    }

    public final void a(d2 d2Var) {
        File n10 = this.f7834a.n(d2Var.f2905b, d2Var.f7817c, d2Var.f7819e);
        if (n10.exists()) {
            File n11 = this.f7834a.n(d2Var.f2905b, d2Var.f7818d, d2Var.f7819e);
            n11.mkdirs();
            if (n10.renameTo(n11)) {
                ((Executor) this.f7837d.zza()).execute(new w(this, d2Var, 1));
                g1 g1Var = this.f7836c;
                String str = d2Var.f2905b;
                int i = d2Var.f7818d;
                long j10 = d2Var.f7819e;
                Objects.requireNonNull(g1Var);
                g1Var.c(new z0(g1Var, str, i, j10));
                this.f7838e.a(d2Var.f2905b);
                ((v2) this.f7835b.zza()).c(d2Var.f2904a, d2Var.f2905b);
                return;
            }
            throw new t0(String.format("Cannot promote pack %s from %s to %s", new Object[]{d2Var.f2905b, n10.getAbsolutePath(), n11.getAbsolutePath()}), d2Var.f2904a);
        }
        throw new t0(String.format("Cannot find pack files to promote for pack %s at %s", new Object[]{d2Var.f2905b, n10.getAbsolutePath()}), d2Var.f2904a);
    }
}
