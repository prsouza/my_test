package zb;

import a8.a;
import androidx.fragment.app.o;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import zb.t;

public final class s extends d<Integer> implements t.b, RandomAccess {

    /* renamed from: s  reason: collision with root package name */
    public static final s f14374s;

    /* renamed from: b  reason: collision with root package name */
    public int[] f14375b;

    /* renamed from: c  reason: collision with root package name */
    public int f14376c;

    static {
        s sVar = new s(new int[10], 0);
        f14374s = sVar;
        sVar.f14277a = false;
    }

    public s() {
        this(new int[10], 0);
    }

    public s(int[] iArr, int i) {
        this.f14375b = iArr;
        this.f14376c = i;
    }

    public final void add(int i, Object obj) {
        d(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        Objects.requireNonNull(collection);
        if (!(collection instanceof s)) {
            return super.addAll(collection);
        }
        s sVar = (s) collection;
        int i = sVar.f14376c;
        if (i == 0) {
            return false;
        }
        int i10 = this.f14376c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i10 >= i) {
            int i11 = i10 + i;
            int[] iArr = this.f14375b;
            if (i11 > iArr.length) {
                this.f14375b = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(sVar.f14375b, 0, this.f14375b, this.f14376c, sVar.f14376c);
            this.f14376c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(int i, int i10) {
        int i11;
        b();
        if (i < 0 || i > (i11 = this.f14376c)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int[] iArr = this.f14375b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i11 - i);
        } else {
            int[] iArr2 = new int[o.a(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f14375b, i, iArr2, i + 1, this.f14376c - i);
            this.f14375b = iArr2;
        }
        this.f14375b[i] = i10;
        this.f14376c++;
        this.modCount++;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.f14376c) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return super.equals(obj);
        }
        s sVar = (s) obj;
        if (this.f14376c != sVar.f14376c) {
            return false;
        }
        int[] iArr = sVar.f14375b;
        for (int i = 0; i < this.f14376c; i++) {
            if (this.f14375b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int g(int i) {
        e(i);
        return this.f14375b[i];
    }

    public final Object get(int i) {
        e(i);
        return Integer.valueOf(this.f14375b[i]);
    }

    public final String h(int i) {
        StringBuilder d10 = a.d("Index:", i, ", Size:");
        d10.append(this.f14376c);
        return d10.toString();
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f14376c; i10++) {
            i = (i * 31) + this.f14375b[i10];
        }
        return i;
    }

    /* renamed from: i */
    public final t.b c(int i) {
        if (i >= this.f14376c) {
            return new s(Arrays.copyOf(this.f14375b, i), this.f14376c);
        }
        throw new IllegalArgumentException();
    }

    public final Object remove(int i) {
        b();
        e(i);
        int[] iArr = this.f14375b;
        int i10 = iArr[i];
        System.arraycopy(iArr, i + 1, iArr, i, this.f14376c - i);
        this.f14376c--;
        this.modCount++;
        return Integer.valueOf(i10);
    }

    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f14376c; i++) {
            if (obj.equals(Integer.valueOf(this.f14375b[i]))) {
                int[] iArr = this.f14375b;
                System.arraycopy(iArr, i + 1, iArr, i, this.f14376c - i);
                this.f14376c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        e(i);
        int[] iArr = this.f14375b;
        int i10 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i10);
    }

    public final int size() {
        return this.f14376c;
    }
}
