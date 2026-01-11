package l6;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.u;
import o6.w;
import t.e;

public final class u0 {

    /* renamed from: k  reason: collision with root package name */
    public static final u f8035k = new u("ExtractorLooper");

    /* renamed from: a  reason: collision with root package name */
    public final g1 f8036a;

    /* renamed from: b  reason: collision with root package name */
    public final p0 f8037b;

    /* renamed from: c  reason: collision with root package name */
    public final l2 f8038c;

    /* renamed from: d  reason: collision with root package name */
    public final r1 f8039d;

    /* renamed from: e  reason: collision with root package name */
    public final w1 f8040e;

    /* renamed from: f  reason: collision with root package name */
    public final c2 f8041f;
    public final e2 g;

    /* renamed from: h  reason: collision with root package name */
    public final w f8042h;
    public final i1 i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f8043j = new AtomicBoolean(false);

    public u0(g1 g1Var, w wVar, p0 p0Var, l2 l2Var, r1 r1Var, w1 w1Var, c2 c2Var, e2 e2Var, i1 i1Var) {
        this.f8036a = g1Var;
        this.f8042h = wVar;
        this.f8037b = p0Var;
        this.f8038c = l2Var;
        this.f8039d = r1Var;
        this.f8040e = w1Var;
        this.f8041f = c2Var;
        this.g = e2Var;
        this.i = i1Var;
    }

    public final void a(int i10, Exception exc) {
        g1 g1Var;
        try {
            g1Var = this.f8036a;
            Objects.requireNonNull(g1Var);
            g1Var.f7869f.lock();
            g1Var.b(i10).f7816c.f7804d = 5;
            g1Var.f7869f.unlock();
            g1 g1Var2 = this.f8036a;
            Objects.requireNonNull(g1Var2);
            g1Var2.c(new e(g1Var2, i10));
        } catch (t0 unused) {
            f8035k.c("Error during error handling: %s", exc.getMessage());
        } catch (Throwable th2) {
            g1Var.f7869f.unlock();
            throw th2;
        }
    }
}
