package l6;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import n6.c;
import o6.w;

public final class w1 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f8073a;

    /* renamed from: b  reason: collision with root package name */
    public final w f8074b;

    /* renamed from: c  reason: collision with root package name */
    public final g1 f8075c;

    /* renamed from: d  reason: collision with root package name */
    public final w f8076d;

    /* renamed from: e  reason: collision with root package name */
    public final x0 f8077e;

    /* renamed from: f  reason: collision with root package name */
    public final c f8078f;
    public final y1 g;

    public w1(a0 a0Var, w wVar, g1 g1Var, w wVar2, x0 x0Var, c cVar, y1 y1Var) {
        this.f8073a = a0Var;
        this.f8074b = wVar;
        this.f8075c = g1Var;
        this.f8076d = wVar2;
        this.f8077e = x0Var;
        this.f8078f = cVar;
        this.g = y1Var;
    }

    public final void a(t1 t1Var) {
        File p10 = this.f8073a.p(t1Var.f2905b, t1Var.f8027c, t1Var.f8028d);
        a0 a0Var = this.f8073a;
        String str = t1Var.f2905b;
        int i = t1Var.f8027c;
        long j10 = t1Var.f8028d;
        Objects.requireNonNull(a0Var);
        File file = new File(new File(a0Var.f(str, i, j10), "_slices"), "_metadata");
        if (!p10.exists() || !file.exists()) {
            throw new t0(String.format("Cannot find pack files to move for pack %s.", new Object[]{t1Var.f2905b}), t1Var.f2904a);
        }
        File n10 = this.f8073a.n(t1Var.f2905b, t1Var.f8027c, t1Var.f8028d);
        n10.mkdirs();
        if (p10.renameTo(n10)) {
            new File(this.f8073a.n(t1Var.f2905b, t1Var.f8027c, t1Var.f8028d), "merge.tmp").delete();
            File o4 = this.f8073a.o(t1Var.f2905b, t1Var.f8027c, t1Var.f8028d);
            o4.mkdirs();
            if (file.renameTo(o4)) {
                if (this.f8078f.a()) {
                    try {
                        this.g.b(t1Var.f2905b, t1Var.f8027c, t1Var.f8028d, t1Var.f8029e);
                        ((Executor) this.f8076d.zza()).execute(new v1(this, t1Var));
                    } catch (IOException e10) {
                        throw new t0(String.format("Could not write asset pack version tag for pack %s: %s", new Object[]{t1Var.f2905b, e10.getMessage()}), t1Var.f2904a);
                    }
                } else {
                    a0 a0Var2 = this.f8073a;
                    Objects.requireNonNull(a0Var2);
                    ((Executor) this.f8076d.zza()).execute(new u1(a0Var2));
                }
                g1 g1Var = this.f8075c;
                String str2 = t1Var.f2905b;
                int i10 = t1Var.f8027c;
                long j11 = t1Var.f8028d;
                Objects.requireNonNull(g1Var);
                g1Var.c(new z0(g1Var, str2, i10, j11));
                this.f8077e.a(t1Var.f2905b);
                ((v2) this.f8074b.zza()).c(t1Var.f2904a, t1Var.f2905b);
                return;
            }
            throw new t0("Cannot move metadata files to final location.", t1Var.f2904a);
        }
        throw new t0("Cannot move merged pack files to final location.", t1Var.f2904a);
    }
}
