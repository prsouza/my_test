package androidx.lifecycle;

import o.a;

public class j0<T> extends LiveData<T> {
    public j0(T t10) {
        super(t10);
    }

    public void j(T t10) {
        LiveData.a("setValue");
        this.g++;
        this.f2030e = t10;
        c((LiveData<T>.c) null);
    }

    public final void k(T t10) {
        boolean z;
        synchronized (this.f2026a) {
            z = this.f2031f == LiveData.f2025k;
            this.f2031f = t10;
        }
        if (z) {
            a.r2().t2(this.f2033j);
        }
    }

    public j0() {
    }
}
