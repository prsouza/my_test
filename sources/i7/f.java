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

public final class f extends c<Boolean> implements RandomAccess, z0 {

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f6257b;

    /* renamed from: c  reason: collision with root package name */
    public int f6258c;

    static {
        new f(new boolean[0], 0).f6238a = false;
    }

    public f() {
        this(new boolean[10], 0);
    }

    public final z.d B(int i) {
        if (i >= this.f6258c) {
            return new f(Arrays.copyOf(this.f6257b, i), this.f6258c);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i < 0 || i > (i10 = this.f6258c)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        boolean[] zArr = this.f6257b;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i10 - i);
        } else {
            boolean[] zArr2 = new boolean[o.a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f6257b, i, zArr2, i + 1, this.f6258c - i);
            this.f6257b = zArr2;
        }
        this.f6257b[i] = booleanValue;
        this.f6258c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        b();
        Charset charset = z.f6396a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i = fVar.f6258c;
        if (i == 0) {
            return false;
        }
        int i10 = this.f6258c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i10 >= i) {
            int i11 = i10 + i;
            boolean[] zArr = this.f6257b;
            if (i11 > zArr.length) {
                this.f6257b = Arrays.copyOf(zArr, i11);
            }
            System.arraycopy(fVar.f6257b, 0, this.f6257b, this.f6258c, fVar.f6258c);
            this.f6258c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(boolean z) {
        b();
        int i = this.f6258c;
        boolean[] zArr = this.f6257b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[o.a(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f6257b = zArr2;
        }
        boolean[] zArr3 = this.f6257b;
        int i10 = this.f6258c;
        this.f6258c = i10 + 1;
        zArr3[i10] = z;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.f6258c) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f6258c != fVar.f6258c) {
            return false;
        }
        boolean[] zArr = fVar.f6257b;
        for (int i = 0; i < this.f6258c; i++) {
            if (this.f6257b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i) {
        StringBuilder d10 = a.d("Index:", i, ", Size:");
        d10.append(this.f6258c);
        return d10.toString();
    }

    public final Object get(int i) {
        e(i);
        return Boolean.valueOf(this.f6257b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f6258c; i10++) {
            i = (i * 31) + z.a(this.f6257b[i10]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f6258c; i++) {
            if (obj.equals(Boolean.valueOf(this.f6257b[i]))) {
                boolean[] zArr = this.f6257b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f6258c - i) - 1);
                this.f6258c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i10) {
        b();
        if (i10 >= i) {
            boolean[] zArr = this.f6257b;
            System.arraycopy(zArr, i10, zArr, i, this.f6258c - i10);
            this.f6258c -= i10 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        e(i);
        boolean[] zArr = this.f6257b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f6258c;
    }

    public f(boolean[] zArr, int i) {
        this.f6257b = zArr;
        this.f6258c = i;
    }

    public final Object remove(int i) {
        b();
        e(i);
        boolean[] zArr = this.f6257b;
        boolean z = zArr[i];
        int i10 = this.f6258c;
        if (i < i10 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i10 - i) - 1);
        }
        this.f6258c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }
}
