package md;

import ad.c;
import e6.e;
import java.io.Serializable;
import xd.a;

public final class h<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public a<? extends T> f8544a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f8545b = c.X;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8546c = this;

    public h(a aVar) {
        this.f8544a = aVar;
    }

    public final T a() {
        T t10;
        T t11 = this.f8545b;
        T t12 = c.X;
        if (t11 != t12) {
            return t11;
        }
        synchronized (this.f8546c) {
            t10 = this.f8545b;
            if (t10 == t12) {
                a aVar = this.f8544a;
                e.B(aVar);
                t10 = aVar.c();
                this.f8545b = t10;
                this.f8544a = null;
            }
        }
        return t10;
    }

    public final String toString() {
        return this.f8545b != c.X ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
