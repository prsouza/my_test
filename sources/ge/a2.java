package ge;

import le.q;
import pd.d;

public final class a2<U, T extends U> extends q<T> implements Runnable {

    /* renamed from: s  reason: collision with root package name */
    public final long f5365s;

    public a2(long j10, d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f5365s = j10;
    }

    public final String W() {
        return super.W() + "(timeMillis=" + this.f5365s + ')';
    }

    public final void run() {
        long j10 = this.f5365s;
        u(new z1("Timed out waiting for " + j10 + " ms", this));
    }
}
