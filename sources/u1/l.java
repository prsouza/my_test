package u1;

import f2.c;
import java.util.concurrent.CancellationException;
import md.m;
import yd.h;

public final class l extends h implements xd.l<Throwable, m> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m<Object> f11644b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(m<Object> mVar) {
        super(1);
        this.f11644b = mVar;
    }

    public final Object k(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (th2 == null) {
            if (!this.f11644b.f11646b.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th2 instanceof CancellationException) {
            this.f11644b.f11646b.cancel(true);
        } else {
            c<R> cVar = this.f11644b.f11646b;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            cVar.k(th2);
        }
        return m.f8555a;
    }
}
