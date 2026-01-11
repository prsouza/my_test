package pd;

import e6.e;
import pd.f;
import pd.f.a;
import xd.l;

public abstract class b<B extends f.a, E extends B> implements f.b<E> {

    /* renamed from: a  reason: collision with root package name */
    public final l<f.a, E> f9873a;

    /* renamed from: b  reason: collision with root package name */
    public final f.b<?> f9874b;

    public b(f.b<B> bVar, l<? super f.a, ? extends E> lVar) {
        e.D(bVar, "baseKey");
        this.f9873a = lVar;
        this.f9874b = bVar instanceof b ? ((b) bVar).f9874b : bVar;
    }
}
