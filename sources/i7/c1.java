package i7;

import a8.a;
import androidx.fragment.app.o;
import i7.z;
import java.util.Arrays;
import java.util.RandomAccess;

public final class c1<E> extends c<E> implements RandomAccess {

    /* renamed from: s  reason: collision with root package name */
    public static final c1<Object> f6241s;

    /* renamed from: b  reason: collision with root package name */
    public E[] f6242b;

    /* renamed from: c  reason: collision with root package name */
    public int f6243c;

    static {
        c1<Object> c1Var = new c1<>(new Object[0], 0);
        f6241s = c1Var;
        c1Var.f6238a = false;
    }

    public c1(E[] eArr, int i) {
        this.f6242b = eArr;
        this.f6243c = i;
    }

    public final z.d B(int i) {
        if (i >= this.f6243c) {
            return new c1(Arrays.copyOf(this.f6242b, i), this.f6243c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean add(E e10) {
        b();
        int i = this.f6243c;
        E[] eArr = this.f6242b;
        if (i == eArr.length) {
            this.f6242b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f6242b;
        int i10 = this.f6243c;
        this.f6243c = i10 + 1;
        eArr2[i10] = e10;
        this.modCount++;
        return true;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f6243c) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    public final String e(int i) {
        StringBuilder d10 = a.d("Index:", i, ", Size:");
        d10.append(this.f6243c);
        return d10.toString();
    }

    public final E get(int i) {
        d(i);
        return this.f6242b[i];
    }

    public final E remove(int i) {
        b();
        d(i);
        E[] eArr = this.f6242b;
        E e10 = eArr[i];
        int i10 = this.f6243c;
        if (i < i10 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i10 - i) - 1);
        }
        this.f6243c--;
        this.modCount++;
        return e10;
    }

    public final E set(int i, E e10) {
        b();
        d(i);
        E[] eArr = this.f6242b;
        E e11 = eArr[i];
        eArr[i] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f6243c;
    }

    public final void add(int i, E e10) {
        int i10;
        b();
        if (i < 0 || i > (i10 = this.f6243c)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        E[] eArr = this.f6242b;
        if (i10 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i10 - i);
        } else {
            E[] eArr2 = new Object[o.a(i10, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f6242b, i, eArr2, i + 1, this.f6243c - i);
            this.f6242b = eArr2;
        }
        this.f6242b[i] = e10;
        this.f6243c++;
        this.modCount++;
    }
}
