package p9;

import i2.a0;
import i2.j;
import i2.z;
import x9.a;

public final class r implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f9807a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f9808b;

    public r(a aVar, z zVar) {
        this.f9807a = aVar;
        this.f9808b = zVar;
    }

    public final <T> z<T> create(j jVar, a<T> aVar) {
        if (aVar.equals(this.f9807a)) {
            return this.f9808b;
        }
        return null;
    }
}
