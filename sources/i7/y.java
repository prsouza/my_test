package i7;

import a8.a;
import androidx.fragment.app.o;
import com.google.android.gms.common.api.Api;
import i7.z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class y extends c<Integer> implements RandomAccess, z0 {

    /* renamed from: b  reason: collision with root package name */
    public int[] f6394b;

    /* renamed from: c  reason: collision with root package name */
    public int f6395c;

    static {
        new y(new int[0], 0).f6238a = false;
    }

    public y() {
        this(new int[10], 0);
    }

    public final z.d B(int i) {
        if (i >= this.f6395c) {
            return new y(Arrays.copyOf(this.f6394b, i), this.f6395c);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i < 0 || i > (i10 = this.f6395c)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int[] iArr = this.f6394b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i10 - i);
        } else {
            int[] iArr2 = new int[o.a(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f6394b, i, iArr2, i + 1, this.f6395c - i);
            this.f6394b = iArr2;
        }
        this.f6394b[i] = intValue;
        this.f6395c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        Charset charset = z.f6396a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof y)) {
            return super.addAll(collection);
        }
        y yVar = (y) collection;
        int i = yVar.f6395c;
        if (i == 0) {
            return false;
        }
        int i10 = this.f6395c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i10 >= i) {
            int i11 = i10 + i;
            int[] iArr = this.f6394b;
            if (i11 > iArr.length) {
                this.f6394b = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(yVar.f6394b, 0, this.f6394b, this.f6395c, yVar.f6395c);
            this.f6395c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(int i) {
        b();
        int i10 = this.f6395c;
        int[] iArr = this.f6394b;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[o.a(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f6394b = iArr2;
        }
        int[] iArr3 = this.f6394b;
        int i11 = this.f6395c;
        this.f6395c = i11 + 1;
        iArr3[i11] = i;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.f6395c) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return super.equals(obj);
        }
        y yVar = (y) obj;
        if (this.f6395c != yVar.f6395c) {
            return false;
        }
        int[] iArr = yVar.f6394b;
        for (int i = 0; i < this.f6395c; i++) {
            if (this.f6394b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int g(int i) {
        e(i);
        return this.f6394b[i];
    }

    public final Object get(int i) {
        return Integer.valueOf(g(i));
    }

    public final String h(int i) {
        StringBuilder d10 = a.d("Index:", i, ", Size:");
        d10.append(this.f6395c);
        return d10.toString();
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f6395c; i10++) {
            i = (i * 31) + this.f6394b[i10];
        }
        return i;
    }

    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f6395c; i++) {
            if (obj.equals(Integer.valueOf(this.f6394b[i]))) {
                int[] iArr = this.f6394b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f6395c - i) - 1);
                this.f6395c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i10) {
        b();
        if (i10 >= i) {
            int[] iArr = this.f6394b;
            System.arraycopy(iArr, i10, iArr, i, this.f6395c - i10);
            this.f6395c -= i10 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        e(i);
        int[] iArr = this.f6394b;
        int i10 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i10);
    }

    public final int size() {
        return this.f6395c;
    }

    public y(int[] iArr, int i) {
        this.f6394b = iArr;
        this.f6395c = i;
    }

    public final Object remove(int i) {
        b();
        e(i);
        int[] iArr = this.f6394b;
        int i10 = iArr[i];
        int i11 = this.f6395c;
        if (i < i11 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i11 - i) - 1);
        }
        this.f6395c--;
        this.modCount++;
        return Integer.valueOf(i10);
    }

    public final boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
