package s7;

import r8.a;
import r8.b;

public final class w<T> implements b<T>, a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f10981c = 0;

    /* renamed from: a  reason: collision with root package name */
    public a.C0207a<T> f10982a;

    /* renamed from: b  reason: collision with root package name */
    public volatile b<T> f10983b;

    public w(a.C0207a<T> aVar, b<T> bVar) {
        this.f10982a = aVar;
        this.f10983b = bVar;
    }

    public final void a(a.C0207a<T> aVar) {
        b<T> bVar;
        b<T> bVar2 = this.f10983b;
        v vVar = v.f10980a;
        if (bVar2 != vVar) {
            aVar.b(bVar2);
            return;
        }
        b<T> bVar3 = null;
        synchronized (this) {
            bVar = this.f10983b;
            if (bVar != vVar) {
                bVar3 = bVar;
            } else {
                this.f10982a = new u(this.f10982a, aVar);
            }
        }
        if (bVar3 != null) {
            aVar.b(bVar);
        }
    }

    public final T get() {
        return this.f10983b.get();
    }
}
