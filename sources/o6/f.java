package o6;

import t6.m;

public abstract class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final m f9321a;

    public f() {
        this.f9321a = null;
    }

    public f(m mVar) {
        this.f9321a = mVar;
    }

    public abstract void a();

    public final void b(Exception exc) {
        m mVar = this.f9321a;
        if (mVar != null) {
            mVar.a(exc);
        }
    }

    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            b(e10);
        }
    }
}
