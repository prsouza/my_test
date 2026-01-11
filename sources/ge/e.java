package ge;

import java.util.concurrent.locks.LockSupport;
import pd.f;

public final class e<T> extends a<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Thread f5382c;

    /* renamed from: s  reason: collision with root package name */
    public final u0 f5383s;

    public e(f fVar, Thread thread, u0 u0Var) {
        super(fVar, true);
        this.f5382c = thread;
        this.f5383s = u0Var;
    }

    public final void s(Object obj) {
        if (!e6.e.r(Thread.currentThread(), this.f5382c)) {
            LockSupport.unpark(this.f5382c);
        }
    }
}
