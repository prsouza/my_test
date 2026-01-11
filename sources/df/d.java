package df;

import java.io.Serializable;

public abstract class d implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final c f4482a;

    public d(c cVar) {
        if (cVar != null) {
            this.f4482a = cVar;
            return;
        }
        throw new IllegalArgumentException("field cannot be null");
    }

    public abstract d a(d dVar);

    public abstract d b(d dVar, int i);

    public abstract d c();

    public abstract d d(d dVar);

    public abstract d e();

    public abstract d f();

    public abstract d g(d dVar);

    public final byte[] h() {
        return this.f4482a.f4481w.a(this);
    }
}
