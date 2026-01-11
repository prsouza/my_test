package v6;

import aa.b;
import ah.v;
import c3.k;
import java.util.Arrays;
import java.util.Set;

public abstract class e<E> extends b<E> implements Set<E> {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f12305c = 0;

    /* renamed from: b  reason: collision with root package name */
    public transient c<E> f12306b;

    public static int j(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        b.q(z, "collection too large");
        return 1073741824;
    }

    public static <E> e<E> k(int i, Object... objArr) {
        if (i == 0) {
            return i.f12326x;
        }
        boolean z = false;
        if (i == 1) {
            return new j(objArr[0]);
        }
        int j10 = j(i);
        Object[] objArr2 = new Object[j10];
        int i10 = j10 - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i; i13++) {
            Object obj = objArr[i13];
            k.R(obj, i13);
            int hashCode = obj.hashCode();
            int q02 = v.q0(hashCode);
            while (true) {
                int i14 = q02 & i10;
                Object obj2 = objArr2[i14];
                if (obj2 == null) {
                    objArr[i12] = obj;
                    objArr2[i14] = obj;
                    i11 += hashCode;
                    i12++;
                    break;
                } else if (obj2.equals(obj)) {
                    break;
                } else {
                    q02++;
                }
            }
        }
        Arrays.fill(objArr, i12, i, (Object) null);
        if (i12 == 1) {
            return new j(objArr[0], i11);
        }
        if (j(i12) < j10 / 2) {
            return k(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            z = true;
        }
        if (z) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new i(objArr, i11, objArr2, i10, i12);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof e) && m() && ((e) obj).m() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return e6.e.P(this);
    }

    public c<E> i() {
        c<E> cVar = this.f12306b;
        if (cVar != null) {
            return cVar;
        }
        c<E> l10 = l();
        this.f12306b = l10;
        return l10;
    }

    public c<E> l() {
        Object[] array = toArray();
        a aVar = c.f12295b;
        return c.i(array, array.length);
    }

    public boolean m() {
        return this instanceof i;
    }
}
