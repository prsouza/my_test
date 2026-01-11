package t6;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f11412a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f11413b;

    public i(j jVar, q qVar) {
        this.f11413b = jVar;
        this.f11412a = qVar;
    }

    public final void run() {
        synchronized (this.f11413b.f11415b) {
            c cVar = this.f11413b.f11416c;
            if (cVar != null) {
                cVar.onSuccess(this.f11412a.c());
            }
        }
    }
}
