package he;

import ge.q0;

public final /* synthetic */ class a implements q0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f5936a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f5937b;

    public /* synthetic */ a(b bVar, Runnable runnable) {
        this.f5936a = bVar;
        this.f5937b = runnable;
    }

    public final void e() {
        b bVar = this.f5936a;
        bVar.f5938b.removeCallbacks(this.f5937b);
    }
}
