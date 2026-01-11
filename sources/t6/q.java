package t6;

public final class q<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11422a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final l f11423b = new l();

    /* renamed from: c  reason: collision with root package name */
    public boolean f11424c;

    /* renamed from: d  reason: collision with root package name */
    public Object f11425d;

    /* renamed from: e  reason: collision with root package name */
    public Exception f11426e;

    public final q a(a<ResultT> aVar) {
        this.f11423b.a(new g(e.f11404a, aVar));
        g();
        return this;
    }

    public final Exception b() {
        Exception exc;
        synchronized (this.f11422a) {
            exc = this.f11426e;
        }
        return exc;
    }

    public final ResultT c() {
        ResultT resultt;
        synchronized (this.f11422a) {
            if (this.f11424c) {
                Exception exc = this.f11426e;
                if (exc == null) {
                    resultt = this.f11425d;
                } else {
                    throw new d(exc);
                }
            } else {
                throw new IllegalStateException("Task is not yet complete");
            }
        }
        return resultt;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.f11422a) {
            z = false;
            if (this.f11424c && this.f11426e == null) {
                z = true;
            }
        }
        return z;
    }

    public final void e(Exception exc) {
        synchronized (this.f11422a) {
            if (!this.f11424c) {
                this.f11424c = true;
                this.f11426e = exc;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.f11423b.b(this);
    }

    public final void f(Object obj) {
        synchronized (this.f11422a) {
            if (!this.f11424c) {
                this.f11424c = true;
                this.f11425d = obj;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.f11423b.b(this);
    }

    public final void g() {
        synchronized (this.f11422a) {
            if (this.f11424c) {
                this.f11423b.b(this);
            }
        }
    }
}
