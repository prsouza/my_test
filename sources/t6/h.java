package t6;

import java.util.concurrent.Executor;
import l6.w;

public final class h implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f11409a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11410b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final b f11411c;

    public h(Executor executor, b bVar) {
        this.f11409a = executor;
        this.f11411c = bVar;
    }

    public final void a(q qVar) {
        if (!qVar.d()) {
            synchronized (this.f11410b) {
                if (this.f11411c != null) {
                    this.f11409a.execute(new w(this, qVar));
                }
            }
        }
    }
}
