package md;

import e6.e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import jc.b;
import nd.f;
import nd.y;

public final class k implements Collection<j>, zd.a {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f8551a;

    public static final class a extends y {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f8552a;

        /* renamed from: b  reason: collision with root package name */
        public int f8553b;

        public a(byte[] bArr) {
            e.D(bArr, "array");
            this.f8552a = bArr;
        }

        public final boolean hasNext() {
            return this.f8553b < this.f8552a.length;
        }
    }

    public /* synthetic */ k(byte[] bArr) {
        this.f8551a = bArr;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends j> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return f.K(this.f8551a, ((j) obj).f8550a);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        boolean z;
        e.D(collection, "elements");
        byte[] bArr = this.f8551a;
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof j) || !f.K(bArr, ((j) next).f8550a)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        byte[] bArr = this.f8551a;
        if ((obj instanceof k) && e.r(bArr, ((k) obj).f8551a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8551a);
    }

    public final boolean isEmpty() {
        return this.f8551a.length == 0;
    }

    public final Iterator<j> iterator() {
        return new a(this.f8551a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f8551a.length;
    }

    public final Object[] toArray() {
        return b.z(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        e.D(tArr, "array");
        return b.A(this, tArr);
    }

    public final String toString() {
        byte[] bArr = this.f8551a;
        StringBuilder d10 = a.a.d("UByteArray(storage=");
        d10.append(Arrays.toString(bArr));
        d10.append(')');
        return d10.toString();
    }
}
