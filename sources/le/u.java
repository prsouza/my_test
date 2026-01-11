package le;

import e6.e;
import java.lang.Comparable;
import java.util.Arrays;
import le.v;

public class u<T extends v & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    public T[] f8271a;

    public final void a(T t10) {
        t10.h(this);
        T[] tArr = this.f8271a;
        if (tArr == null) {
            tArr = new v[4];
            this.f8271a = tArr;
        } else if (this._size >= tArr.length) {
            T[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            e.C(copyOf, "copyOf(this, newSize)");
            tArr = (v[]) copyOf;
            this.f8271a = tArr;
        }
        int i = this._size;
        this._size = i + 1;
        tArr[i] = t10;
        t10.d(i);
        f(i);
    }

    public final T b() {
        T[] tArr = this.f8271a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final boolean c() {
        return this._size == 0;
    }

    public final T d(int i) {
        T[] tArr = this.f8271a;
        e.B(tArr);
        this._size--;
        if (i < this._size) {
            g(i, this._size);
            int i10 = (i - 1) / 2;
            if (i > 0) {
                T t10 = tArr[i];
                e.B(t10);
                T t11 = tArr[i10];
                e.B(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    g(i, i10);
                    f(i10);
                }
            }
            while (true) {
                int i11 = (i * 2) + 1;
                if (i11 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f8271a;
                e.B(tArr2);
                int i12 = i11 + 1;
                if (i12 < this._size) {
                    T t12 = tArr2[i12];
                    e.B(t12);
                    T t13 = tArr2[i11];
                    e.B(t13);
                    if (((Comparable) t12).compareTo(t13) < 0) {
                        i11 = i12;
                    }
                }
                T t14 = tArr2[i];
                e.B(t14);
                T t15 = tArr2[i11];
                e.B(t15);
                if (((Comparable) t14).compareTo(t15) <= 0) {
                    break;
                }
                g(i, i11);
                i = i11;
            }
        }
        T t16 = tArr[this._size];
        e.B(t16);
        t16.h((u<?>) null);
        t16.d(-1);
        tArr[this._size] = null;
        return t16;
    }

    public final T e() {
        T d10;
        synchronized (this) {
            d10 = this._size > 0 ? d(0) : null;
        }
        return d10;
    }

    public final void f(int i) {
        while (i > 0) {
            T[] tArr = this.f8271a;
            e.B(tArr);
            int i10 = (i - 1) / 2;
            T t10 = tArr[i10];
            e.B(t10);
            T t11 = tArr[i];
            e.B(t11);
            if (((Comparable) t10).compareTo(t11) > 0) {
                g(i, i10);
                i = i10;
            } else {
                return;
            }
        }
    }

    public final void g(int i, int i10) {
        T[] tArr = this.f8271a;
        e.B(tArr);
        T t10 = tArr[i10];
        e.B(t10);
        T t11 = tArr[i];
        e.B(t11);
        tArr[i] = t10;
        tArr[i10] = t11;
        t10.d(i);
        t11.d(i10);
    }
}
