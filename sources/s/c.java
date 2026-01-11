package s;

import ge.g0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.slf4j.helpers.MessageFormatter;
import s.f;

public final class c<E> implements Collection<E>, Set<E> {

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f10807t = new int[0];

    /* renamed from: u  reason: collision with root package name */
    public static final Object[] f10808u = new Object[0];

    /* renamed from: v  reason: collision with root package name */
    public static Object[] f10809v;

    /* renamed from: w  reason: collision with root package name */
    public static int f10810w;

    /* renamed from: x  reason: collision with root package name */
    public static Object[] f10811x;

    /* renamed from: y  reason: collision with root package name */
    public static int f10812y;

    /* renamed from: a  reason: collision with root package name */
    public int[] f10813a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f10814b;

    /* renamed from: c  reason: collision with root package name */
    public int f10815c;

    /* renamed from: s  reason: collision with root package name */
    public f<E, E> f10816s;

    public c() {
        this(0);
    }

    public static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f10812y < 10) {
                    objArr[0] = f10811x;
                    objArr[1] = iArr;
                    for (int i10 = i - 1; i10 >= 2; i10--) {
                        objArr[i10] = null;
                    }
                    f10811x = objArr;
                    f10812y++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f10810w < 10) {
                    objArr[0] = f10809v;
                    objArr[1] = iArr;
                    for (int i11 = i - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f10809v = objArr;
                    f10810w++;
                }
            }
        }
    }

    public final boolean add(E e10) {
        int i;
        int i10;
        if (e10 == null) {
            i10 = g();
            i = 0;
        } else {
            int hashCode = e10.hashCode();
            i = hashCode;
            i10 = e(e10, hashCode);
        }
        if (i10 >= 0) {
            return false;
        }
        int i11 = ~i10;
        int i12 = this.f10815c;
        int[] iArr = this.f10813a;
        if (i12 >= iArr.length) {
            int i13 = 4;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.f10814b;
            b(i13);
            int[] iArr2 = this.f10813a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f10814b, 0, objArr.length);
            }
            d(iArr, objArr, this.f10815c);
        }
        int i14 = this.f10815c;
        if (i11 < i14) {
            int[] iArr3 = this.f10813a;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f10814b;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f10815c - i11);
        }
        this.f10813a[i11] = i;
        this.f10814b[i11] = e10;
        this.f10815c++;
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f10815c;
        int[] iArr = this.f10813a;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f10814b;
            b(size);
            int i = this.f10815c;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f10813a, 0, i);
                System.arraycopy(objArr, 0, this.f10814b, 0, this.f10815c);
            }
            d(iArr, objArr, this.f10815c);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final void b(int i) {
        if (i == 8) {
            synchronized (c.class) {
                Object[] objArr = f10811x;
                if (objArr != null) {
                    this.f10814b = objArr;
                    f10811x = (Object[]) objArr[0];
                    this.f10813a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f10812y--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f10809v;
                if (objArr2 != null) {
                    this.f10814b = objArr2;
                    f10809v = (Object[]) objArr2[0];
                    this.f10813a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f10810w--;
                    return;
                }
            }
        }
        this.f10813a = new int[i];
        this.f10814b = new Object[i];
    }

    public final void clear() {
        int i = this.f10815c;
        if (i != 0) {
            d(this.f10813a, this.f10814b, i);
            this.f10813a = f10807t;
            this.f10814b = f10808u;
            this.f10815c = 0;
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final int e(Object obj, int i) {
        int i10 = this.f10815c;
        if (i10 == 0) {
            return -1;
        }
        int j10 = g0.j(this.f10813a, i10, i);
        if (j10 < 0 || obj.equals(this.f10814b[j10])) {
            return j10;
        }
        int i11 = j10 + 1;
        while (i11 < i10 && this.f10813a[i11] == i) {
            if (obj.equals(this.f10814b[i11])) {
                return i11;
            }
            i11++;
        }
        int i12 = j10 - 1;
        while (i12 >= 0 && this.f10813a[i12] == i) {
            if (obj.equals(this.f10814b[i12])) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f10815c != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f10815c) {
                try {
                    if (!set.contains(this.f10814b[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g() {
        int i = this.f10815c;
        if (i == 0) {
            return -1;
        }
        int j10 = g0.j(this.f10813a, i, 0);
        if (j10 < 0 || this.f10814b[j10] == null) {
            return j10;
        }
        int i10 = j10 + 1;
        while (i10 < i && this.f10813a[i10] == 0) {
            if (this.f10814b[i10] == null) {
                return i10;
            }
            i10++;
        }
        int i11 = j10 - 1;
        while (i11 >= 0 && this.f10813a[i11] == 0) {
            if (this.f10814b[i11] == null) {
                return i11;
            }
            i11--;
        }
        return ~i10;
    }

    public final E h(int i) {
        E[] eArr = this.f10814b;
        E e10 = eArr[i];
        int i10 = this.f10815c;
        if (i10 <= 1) {
            d(this.f10813a, eArr, i10);
            this.f10813a = f10807t;
            this.f10814b = f10808u;
            this.f10815c = 0;
        } else {
            int[] iArr = this.f10813a;
            int i11 = 8;
            if (iArr.length <= 8 || i10 >= iArr.length / 3) {
                int i12 = i10 - 1;
                this.f10815c = i12;
                if (i < i12) {
                    int i13 = i + 1;
                    System.arraycopy(iArr, i13, iArr, i, i12 - i);
                    Object[] objArr = this.f10814b;
                    System.arraycopy(objArr, i13, objArr, i, this.f10815c - i);
                }
                this.f10814b[this.f10815c] = null;
            } else {
                if (i10 > 8) {
                    i11 = i10 + (i10 >> 1);
                }
                b(i11);
                this.f10815c--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f10813a, 0, i);
                    System.arraycopy(eArr, 0, this.f10814b, 0, i);
                }
                int i14 = this.f10815c;
                if (i < i14) {
                    int i15 = i + 1;
                    System.arraycopy(iArr, i15, this.f10813a, i, i14 - i);
                    System.arraycopy(eArr, i15, this.f10814b, i, this.f10815c - i);
                }
            }
        }
        return e10;
    }

    public final int hashCode() {
        int[] iArr = this.f10813a;
        int i = this.f10815c;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public final boolean isEmpty() {
        return this.f10815c <= 0;
    }

    public final Iterator<E> iterator() {
        if (this.f10816s == null) {
            this.f10816s = new b(this);
        }
        f<E, E> fVar = this.f10816s;
        if (fVar.f10823b == null) {
            fVar.f10823b = new f.c();
        }
        return fVar.f10823b.iterator();
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        h(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f10815c - 1; i >= 0; i--) {
            if (!collection.contains(this.f10814b[i])) {
                h(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f10815c;
    }

    public final Object[] toArray() {
        int i = this.f10815c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f10814b, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return MessageFormatter.DELIM_STR;
        }
        StringBuilder sb2 = new StringBuilder(this.f10815c * 14);
        sb2.append(MessageFormatter.DELIM_START);
        for (int i = 0; i < this.f10815c; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            Object obj = this.f10814b[i];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(MessageFormatter.DELIM_STOP);
        return sb2.toString();
    }

    public c(int i) {
        if (i == 0) {
            this.f10813a = f10807t;
            this.f10814b = f10808u;
        } else {
            b(i);
        }
        this.f10815c = 0;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f10815c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f10815c);
        }
        System.arraycopy(this.f10814b, 0, tArr, 0, this.f10815c);
        int length = tArr.length;
        int i = this.f10815c;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
