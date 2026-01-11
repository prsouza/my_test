package v6;

import c3.k;
import java.util.Objects;

public final class j<E> extends e<E> {

    /* renamed from: s  reason: collision with root package name */
    public final transient E f12332s;

    /* renamed from: t  reason: collision with root package name */
    public transient int f12333t;

    public j(E e10) {
        Objects.requireNonNull(e10);
        this.f12332s = e10;
    }

    public final int b(Object[] objArr) {
        objArr[0] = this.f12332s;
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.f12332s.equals(obj);
    }

    /* renamed from: h */
    public final k<E> iterator() {
        return new f(this.f12332s);
    }

    public final int hashCode() {
        int i = this.f12333t;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f12332s.hashCode();
        this.f12333t = hashCode;
        return hashCode;
    }

    public final c<E> l() {
        E e10 = this.f12332s;
        a aVar = c.f12295b;
        Object[] objArr = {e10};
        for (int i = 0; i < 1; i++) {
            k.R(objArr[i], i);
        }
        return c.i(objArr, 1);
    }

    public final boolean m() {
        return this.f12333t != 0;
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f12332s.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }

    public j(E e10, int i) {
        this.f12332s = e10;
        this.f12333t = i;
    }
}
