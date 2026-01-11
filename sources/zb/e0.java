package zb;

import java.util.ArrayList;
import java.util.List;
import zb.t;

public final class e0<E> extends d<E> {

    /* renamed from: c  reason: collision with root package name */
    public static final e0<Object> f14282c;

    /* renamed from: b  reason: collision with root package name */
    public final List<E> f14283b;

    static {
        e0<Object> e0Var = new e0<>(new ArrayList(10));
        f14282c = e0Var;
        e0Var.f14277a = false;
    }

    public e0(List<E> list) {
        this.f14283b = list;
    }

    public final void add(int i, E e10) {
        b();
        this.f14283b.add(i, e10);
        this.modCount++;
    }

    public final t.c c(int i) {
        if (i >= this.f14283b.size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f14283b);
            return new e0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        return this.f14283b.get(i);
    }

    public final E remove(int i) {
        b();
        E remove = this.f14283b.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e10) {
        b();
        E e11 = this.f14283b.set(i, e10);
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f14283b.size();
    }
}
