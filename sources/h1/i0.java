package h1;

import java.util.concurrent.atomic.AtomicBoolean;
import l1.e;

public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f5733a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final e0 f5734b;

    /* renamed from: c  reason: collision with root package name */
    public volatile e f5735c;

    public i0(e0 e0Var) {
        this.f5734b = e0Var;
    }

    public final e a() {
        this.f5734b.a();
        if (!this.f5733a.compareAndSet(false, true)) {
            return b();
        }
        if (this.f5735c == null) {
            this.f5735c = b();
        }
        return this.f5735c;
    }

    public final e b() {
        String c10 = c();
        e0 e0Var = this.f5734b;
        e0Var.a();
        e0Var.b();
        return e0Var.f5678d.m0().z(c10);
    }

    public abstract String c();

    public final void d(e eVar) {
        if (eVar == this.f5735c) {
            this.f5733a.set(false);
        }
    }
}
