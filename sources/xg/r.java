package xg;

public final class r implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13277a;

    public r(int i) {
        this.f13277a = i;
    }

    public final l a(l lVar) {
        q qVar = lVar instanceof q ? (q) lVar : null;
        if (qVar == null || qVar.f13272b != this.f13277a) {
            q qVar2 = new q();
            qVar2.f13271a = 0;
            qVar2.f13272b = this.f13277a;
            if (qVar != null) {
                qVar2.f13273c = qVar.f13273c;
                qVar2.f13274d = qVar.f13274d;
                qVar2.f13275e = qVar.f13275e;
                qVar2.f13276f = qVar.f13276f;
            }
            return qVar2;
        }
        qVar.f13271a = 0;
        return qVar;
    }
}
