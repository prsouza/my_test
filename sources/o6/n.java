package o6;

public final class n extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f9330b;

    public n(o oVar) {
        this.f9330b = oVar;
    }

    public final void a() {
        p pVar = this.f9330b.f9331a;
        pVar.f9334b.e("unlinkToDeath", new Object[0]);
        pVar.f9344n.asBinder().unlinkToDeath(pVar.f9341k, 0);
        p pVar2 = this.f9330b.f9331a;
        pVar2.f9344n = null;
        pVar2.g = false;
    }
}
