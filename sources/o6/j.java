package o6;

public final class j extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f9327b;

    public j(p pVar) {
        this.f9327b = pVar;
    }

    public final void a() {
        p pVar = this.f9327b;
        if (pVar.f9344n != null) {
            pVar.f9334b.e("Unbind from service.", new Object[0]);
            p pVar2 = this.f9327b;
            pVar2.f9333a.unbindService(pVar2.f9343m);
            p pVar3 = this.f9327b;
            pVar3.g = false;
            pVar3.f9344n = null;
            pVar3.f9343m = null;
        }
        this.f9327b.d();
    }
}
