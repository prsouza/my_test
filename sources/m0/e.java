package m0;

public final class e<T> extends d<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Object f8366c = new Object();

    public e(int i) {
        super(i);
    }

    public final boolean a(T t10) {
        boolean a10;
        synchronized (this.f8366c) {
            a10 = super.a(t10);
        }
        return a10;
    }

    public final T b() {
        T b10;
        synchronized (this.f8366c) {
            b10 = super.b();
        }
        return b10;
    }
}
