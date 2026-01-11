package s;

import ge.g0;
import java.util.ConcurrentModificationException;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public class g<K, V> {

    /* renamed from: s  reason: collision with root package name */
    public static Object[] f10837s;

    /* renamed from: t  reason: collision with root package name */
    public static int f10838t;

    /* renamed from: u  reason: collision with root package name */
    public static Object[] f10839u;

    /* renamed from: v  reason: collision with root package name */
    public static int f10840v;

    /* renamed from: a  reason: collision with root package name */
    public int[] f10841a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f10842b;

    /* renamed from: c  reason: collision with root package name */
    public int f10843c;

    public g() {
        this.f10841a = g0.z;
        this.f10842b = g0.B;
        this.f10843c = 0;
    }

    private void a(int i) {
        Class<g> cls = g.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f10839u;
                if (objArr != null) {
                    this.f10842b = objArr;
                    f10839u = (Object[]) objArr[0];
                    this.f10841a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f10840v--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f10837s;
                if (objArr2 != null) {
                    this.f10842b = objArr2;
                    f10837s = (Object[]) objArr2[0];
                    this.f10841a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f10838t--;
                    return;
                }
            }
        }
        this.f10841a = new int[i];
        this.f10842b = new Object[(i << 1)];
    }

    public static void d(int[] iArr, Object[] objArr, int i) {
        Class<g> cls = g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f10840v < 10) {
                    objArr[0] = f10839u;
                    objArr[1] = iArr;
                    for (int i10 = (i << 1) - 1; i10 >= 2; i10--) {
                        objArr[i10] = null;
                    }
                    f10839u = objArr;
                    f10840v++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f10838t < 10) {
                    objArr[0] = f10837s;
                    objArr[1] = iArr;
                    for (int i11 = (i << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f10837s = objArr;
                    f10838t++;
                }
            }
        }
    }

    public final void c(int i) {
        int i10 = this.f10843c;
        int[] iArr = this.f10841a;
        if (iArr.length < i) {
            Object[] objArr = this.f10842b;
            a(i);
            if (this.f10843c > 0) {
                System.arraycopy(iArr, 0, this.f10841a, 0, i10);
                System.arraycopy(objArr, 0, this.f10842b, 0, i10 << 1);
            }
            d(iArr, objArr, i10);
        }
        if (this.f10843c != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f10843c;
        if (i > 0) {
            int[] iArr = this.f10841a;
            Object[] objArr = this.f10842b;
            this.f10841a = g0.z;
            this.f10842b = g0.B;
            this.f10843c = 0;
            d(iArr, objArr, i);
        }
        if (this.f10843c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final int e(Object obj, int i) {
        int i10 = this.f10843c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int j10 = g0.j(this.f10841a, i10, i);
            if (j10 < 0 || obj.equals(this.f10842b[j10 << 1])) {
                return j10;
            }
            int i11 = j10 + 1;
            while (i11 < i10 && this.f10841a[i11] == i) {
                if (obj.equals(this.f10842b[i11 << 1])) {
                    return i11;
                }
                i11++;
            }
            int i12 = j10 - 1;
            while (i12 >= 0 && this.f10841a[i12] == i) {
                if (obj.equals(this.f10842b[i12 << 1])) {
                    return i12;
                }
                i12--;
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f10843c != gVar.f10843c) {
                return false;
            }
            int i = 0;
            while (i < this.f10843c) {
                try {
                    Object i10 = i(i);
                    Object m10 = m(i);
                    Object orDefault = gVar.getOrDefault(i10, (Object) null);
                    if (m10 == null) {
                        if (orDefault != null || !gVar.containsKey(i10)) {
                            return false;
                        }
                    } else if (!m10.equals(orDefault)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f10843c != map.size()) {
                return false;
            }
            int i11 = 0;
            while (i11 < this.f10843c) {
                try {
                    Object i12 = i(i11);
                    Object m11 = m(i11);
                    Object obj2 = map.get(i12);
                    if (m11 == null) {
                        if (obj2 != null || !map.containsKey(i12)) {
                            return false;
                        }
                    } else if (!m11.equals(obj2)) {
                        return false;
                    }
                    i11++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public final int g() {
        int i = this.f10843c;
        if (i == 0) {
            return -1;
        }
        try {
            int j10 = g0.j(this.f10841a, i, 0);
            if (j10 < 0 || this.f10842b[j10 << 1] == null) {
                return j10;
            }
            int i10 = j10 + 1;
            while (i10 < i && this.f10841a[i10] == 0) {
                if (this.f10842b[i10 << 1] == null) {
                    return i10;
                }
                i10++;
            }
            int i11 = j10 - 1;
            while (i11 >= 0 && this.f10841a[i11] == 0) {
                if (this.f10842b[i11 << 1] == null) {
                    return i11;
                }
                i11--;
            }
            return ~i10;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final V getOrDefault(Object obj, V v10) {
        int f10 = f(obj);
        return f10 >= 0 ? this.f10842b[(f10 << 1) + 1] : v10;
    }

    public final int h(Object obj) {
        int i = this.f10843c * 2;
        Object[] objArr = this.f10842b;
        if (obj == null) {
            for (int i10 = 1; i10 < i; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f10841a;
        Object[] objArr = this.f10842b;
        int i = this.f10843c;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i) {
            Object obj = objArr[i10];
            i12 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public final K i(int i) {
        return this.f10842b[i << 1];
    }

    public final boolean isEmpty() {
        return this.f10843c <= 0;
    }

    public void j(g<? extends K, ? extends V> gVar) {
        int i = gVar.f10843c;
        c(this.f10843c + i);
        if (this.f10843c != 0) {
            for (int i10 = 0; i10 < i; i10++) {
                put(gVar.i(i10), gVar.m(i10));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f10841a, 0, this.f10841a, 0, i);
            System.arraycopy(gVar.f10842b, 0, this.f10842b, 0, i << 1);
            this.f10843c = i;
        }
    }

    public V k(int i) {
        V[] vArr = this.f10842b;
        int i10 = i << 1;
        V v10 = vArr[i10 + 1];
        int i11 = this.f10843c;
        int i12 = 0;
        if (i11 <= 1) {
            d(this.f10841a, vArr, i11);
            this.f10841a = g0.z;
            this.f10842b = g0.B;
        } else {
            int i13 = i11 - 1;
            int[] iArr = this.f10841a;
            int i14 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (i < i13) {
                    int i15 = i + 1;
                    int i16 = i13 - i;
                    System.arraycopy(iArr, i15, iArr, i, i16);
                    Object[] objArr = this.f10842b;
                    System.arraycopy(objArr, i15 << 1, objArr, i10, i16 << 1);
                }
                Object[] objArr2 = this.f10842b;
                int i17 = i13 << 1;
                objArr2[i17] = null;
                objArr2[i17 + 1] = null;
            } else {
                if (i11 > 8) {
                    i14 = i11 + (i11 >> 1);
                }
                a(i14);
                if (i11 == this.f10843c) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f10841a, 0, i);
                        System.arraycopy(vArr, 0, this.f10842b, 0, i10);
                    }
                    if (i < i13) {
                        int i18 = i + 1;
                        int i19 = i13 - i;
                        System.arraycopy(iArr, i18, this.f10841a, i, i19);
                        System.arraycopy(vArr, i18 << 1, this.f10842b, i10, i19 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i12 = i13;
        }
        if (i11 == this.f10843c) {
            this.f10843c = i12;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i, V v10) {
        int i10 = (i << 1) + 1;
        V[] vArr = this.f10842b;
        V v11 = vArr[i10];
        vArr[i10] = v10;
        return v11;
    }

    public final V m(int i) {
        return this.f10842b[(i << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i;
        int i10;
        int i11 = this.f10843c;
        if (k10 == null) {
            i10 = g();
            i = 0;
        } else {
            int hashCode = k10.hashCode();
            i = hashCode;
            i10 = e(k10, hashCode);
        }
        if (i10 >= 0) {
            int i12 = (i10 << 1) + 1;
            V[] vArr = this.f10842b;
            V v11 = vArr[i12];
            vArr[i12] = v10;
            return v11;
        }
        int i13 = ~i10;
        int[] iArr = this.f10841a;
        if (i11 >= iArr.length) {
            int i14 = 4;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.f10842b;
            a(i14);
            if (i11 == this.f10843c) {
                int[] iArr2 = this.f10841a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f10842b, 0, objArr.length);
                }
                d(iArr, objArr, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr3 = this.f10841a;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr2 = this.f10842b;
            System.arraycopy(objArr2, i13 << 1, objArr2, i15 << 1, (this.f10843c - i13) << 1);
        }
        int i16 = this.f10843c;
        if (i11 == i16) {
            int[] iArr4 = this.f10841a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i;
                Object[] objArr3 = this.f10842b;
                int i17 = i13 << 1;
                objArr3[i17] = k10;
                objArr3[i17 + 1] = v10;
                this.f10843c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v10) {
        V orDefault = getOrDefault(k10, (Object) null);
        return orDefault == null ? put(k10, v10) : orDefault;
    }

    public final V remove(Object obj) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return k(f10);
        }
        return null;
    }

    public final V replace(K k10, V v10) {
        int f10 = f(k10);
        if (f10 >= 0) {
            return l(f10, v10);
        }
        return null;
    }

    public final int size() {
        return this.f10843c;
    }

    public final String toString() {
        if (isEmpty()) {
            return MessageFormatter.DELIM_STR;
        }
        StringBuilder sb2 = new StringBuilder(this.f10843c * 28);
        sb2.append(MessageFormatter.DELIM_START);
        for (int i = 0; i < this.f10843c; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            Object i10 = i(i);
            if (i10 != this) {
                sb2.append(i10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object m10 = m(i);
            if (m10 != this) {
                sb2.append(m10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(MessageFormatter.DELIM_STOP);
        return sb2.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 < 0) {
            return false;
        }
        Object m10 = m(f10);
        if (obj2 != m10 && (obj2 == null || !obj2.equals(m10))) {
            return false;
        }
        k(f10);
        return true;
    }

    public final boolean replace(K k10, V v10, V v11) {
        int f10 = f(k10);
        if (f10 < 0) {
            return false;
        }
        V m10 = m(f10);
        if (m10 != v10 && (v10 == null || !v10.equals(m10))) {
            return false;
        }
        l(f10, v11);
        return true;
    }

    public g(int i) {
        if (i == 0) {
            this.f10841a = g0.z;
            this.f10842b = g0.B;
        } else {
            a(i);
        }
        this.f10843c = 0;
    }
}
