package t6;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final q f11420a = new q();

    public final boolean a(Exception exc) {
        q qVar = this.f11420a;
        synchronized (qVar.f11422a) {
            if (qVar.f11424c) {
                return false;
            }
            qVar.f11424c = true;
            qVar.f11426e = exc;
            qVar.f11423b.b(qVar);
            return true;
        }
    }

    public final boolean b(Object obj) {
        q qVar = this.f11420a;
        synchronized (qVar.f11422a) {
            if (qVar.f11424c) {
                return false;
            }
            qVar.f11424c = true;
            qVar.f11425d = obj;
            qVar.f11423b.b(qVar);
            return true;
        }
    }
}
