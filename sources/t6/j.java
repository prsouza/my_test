package t6;

import java.util.concurrent.Executor;

public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f11414a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11415b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final c f11416c;

    public j(Executor executor, c cVar) {
        this.f11414a = executor;
        this.f11416c = cVar;
    }

    public final void a(q qVar) {
        if (qVar.d()) {
            synchronized (this.f11415b) {
                if (this.f11416c != null) {
                    this.f11414a.execute(new i(this, qVar));
                }
            }
        }
    }
}
