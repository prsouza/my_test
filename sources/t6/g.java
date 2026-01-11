package t6;

import java.util.concurrent.Executor;
import l6.t;

public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f11406a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11407b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final a f11408c;

    public g(Executor executor, a aVar) {
        this.f11406a = executor;
        this.f11408c = aVar;
    }

    public final void a(q qVar) {
        synchronized (this.f11407b) {
            if (this.f11408c != null) {
                this.f11406a.execute(new t(this, qVar));
            }
        }
    }
}
