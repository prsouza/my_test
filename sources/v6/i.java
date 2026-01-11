package v6;

import ah.v;

public final class i<E> extends e<E> {

    /* renamed from: x  reason: collision with root package name */
    public static final i<Object> f12326x = new i(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: s  reason: collision with root package name */
    public final transient Object[] f12327s;

    /* renamed from: t  reason: collision with root package name */
    public final transient Object[] f12328t;

    /* renamed from: u  reason: collision with root package name */
    public final transient int f12329u;

    /* renamed from: v  reason: collision with root package name */
    public final transient int f12330v;

    /* renamed from: w  reason: collision with root package name */
    public final transient int f12331w;

    public i(Object[] objArr, int i, Object[] objArr2, int i10, int i11) {
        this.f12327s = objArr;
        this.f12328t = objArr2;
        this.f12329u = i10;
        this.f12330v = i;
        this.f12331w = i11;
    }

    public final int b(Object[] objArr) {
        System.arraycopy(this.f12327s, 0, objArr, 0, this.f12331w);
        return this.f12331w + 0;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f12328t;
        if (obj == null || objArr == null) {
            return false;
        }
        int q02 = v.q0(obj.hashCode());
        while (true) {
            int i = q02 & this.f12329u;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            q02 = i + 1;
        }
    }

    public final Object[] d() {
        return this.f12327s;
    }

    public final int e() {
        return this.f12331w;
    }

    public final int g() {
        return 0;
    }

    /* renamed from: h */
    public final k<E> iterator() {
        return i().listIterator(0);
    }

    public final int hashCode() {
        return this.f12330v;
    }

    public final c<E> l() {
        return c.i(this.f12327s, this.f12331w);
    }

    public final int size() {
        return this.f12331w;
    }
}
