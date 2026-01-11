package o6;

import java.util.Iterator;
import t6.m;

public final class i extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f9325b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f9326c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(p pVar, m mVar, f fVar) {
        super(mVar);
        this.f9326c = pVar;
        this.f9325b = fVar;
    }

    public final void a() {
        p pVar = this.f9326c;
        f fVar = this.f9325b;
        if (pVar.f9344n == null && !pVar.g) {
            pVar.f9334b.e("Initiate binding to the service.", new Object[0]);
            pVar.f9336d.add(fVar);
            o oVar = new o(pVar);
            pVar.f9343m = oVar;
            pVar.g = true;
            if (!pVar.f9333a.bindService(pVar.f9339h, oVar, 1)) {
                pVar.f9334b.e("Failed to bind to the service.", new Object[0]);
                pVar.g = false;
                Iterator it = pVar.f9336d.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).b(new q());
                }
                pVar.f9336d.clear();
            }
        } else if (pVar.g) {
            pVar.f9334b.e("Waiting to bind to the service.", new Object[0]);
            pVar.f9336d.add(fVar);
        } else {
            fVar.run();
        }
    }
}
