package s7;

import r8.b;

public final class r<T> implements b<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f10973c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f10974a = f10973c;

    /* renamed from: b  reason: collision with root package name */
    public volatile b<T> f10975b;

    public r(b<T> bVar) {
        this.f10975b = bVar;
    }

    public final T get() {
        T t10 = this.f10974a;
        T t11 = f10973c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f10974a;
                if (t10 == t11) {
                    t10 = this.f10975b.get();
                    this.f10974a = t10;
                    this.f10975b = null;
                }
            }
        }
        return t10;
    }
}
