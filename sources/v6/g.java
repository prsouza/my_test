package v6;

import aa.b;

public final class g<E> extends c<E> {

    /* renamed from: t  reason: collision with root package name */
    public static final c<Object> f12309t = new g(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f12310c;

    /* renamed from: s  reason: collision with root package name */
    public final transient int f12311s;

    public g(Object[] objArr, int i) {
        this.f12310c = objArr;
        this.f12311s = i;
    }

    public final int b(Object[] objArr) {
        System.arraycopy(this.f12310c, 0, objArr, 0, this.f12311s);
        return this.f12311s + 0;
    }

    public final Object[] d() {
        return this.f12310c;
    }

    public final int e() {
        return this.f12311s;
    }

    public final int g() {
        return 0;
    }

    public final E get(int i) {
        b.t(i, this.f12311s);
        return this.f12310c[i];
    }

    public final int size() {
        return this.f12311s;
    }
}
