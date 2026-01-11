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

public final class h0 extends c<Long> implements RandomAccess, z0 {

    /* renamed from: b  reason: collision with root package name */
    public long[] f6269b;

    /* renamed from: c  reason: collision with root package name */
    public int f6270c;

    static {
        new h0(new long[0], 0).f6238a = false;
    }

    public h0() {
        this(new long[10], 0);
    }

    public final z.d B(int i) {
        if (i >= this.f6270c) {
            return new h0(Arrays.copyOf(this.f6269b, i), this.f6270c);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        b();
        if (i < 0 || i > (i10 = this.f6270c)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        long[] jArr = this.f6269b;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i10 - i);
        } else {
            long[] jArr2 = new long[o.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f6269b, i, jArr2, i + 1, this.f6270c - i);
            this.f6269b = jArr2;
        }
        this.f6269b[i] = longValue;
        this.f6270c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        b();
        Charset charset = z.f6396a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof h0)) {
            return super.addAll(collection);
        }
        h0 h0Var = (h0) collection;
        int i = h0Var.f6270c;
        if (i == 0) {
            return false;
        }
        int i10 = this.f6270c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i10 >= i) {
            int i11 = i10 + i;
            long[] jArr = this.f6269b;
            if (i11 > jArr.length) {
                this.f6269b = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(h0Var.f6269b, 0, this.f6269b, this.f6270c, h0Var.f6270c);
            this.f6270c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(long j10) {
        b();
        int i = this.f6270c;
        long[] jArr = this.f6269b;
        if (i == jArr.length) {
            long[] jArr2 = new long[o.a(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f6269b = jArr2;
        }
        long[] jArr3 = this.f6269b;
        int i10 = this.f6270c;
        this.f6270c = i10 + 1;
        jArr3[i10] = j10;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.f6270c) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        if (this.f6270c != h0Var.f6270c) {
            return false;
        }
        long[] jArr = h0Var.f6269b;
        for (int i = 0; i < this.f6270c; i++) {
            if (this.f6269b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final long g(int i) {
        e(i);
        return this.f6269b[i];
    }

    public final Object get(int i) {
        return Long.valueOf(g(i));
    }

    public final String h(int i) {
        StringBuilder d10 = a.d("Index:", i, ", Size:");
        d10.append(this.f6270c);
        return d10.toString();
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f6270c; i10++) {
            i = (i * 31) + z.b(this.f6269b[i10]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f6270c; i++) {
            if (obj.equals(Long.valueOf(this.f6269b[i]))) {
                long[] jArr = this.f6269b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f6270c - i) - 1);
                this.f6270c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i10) {
        b();
        if (i10 >= i) {
            long[] jArr = this.f6269b;
            System.arraycopy(jArr, i10, jArr, i, this.f6270c - i10);
            this.f6270c -= i10 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        e(i);
        long[] jArr = this.f6269b;
        long j10 = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f6270c;
    }

    public h0(long[] jArr, int i) {
        this.f6269b = jArr;
        this.f6270c = i;
    }

    public final Object remove(int i) {
        b();
        e(i);
        long[] jArr = this.f6269b;
        long j10 = jArr[i];
        int i10 = this.f6270c;
        if (i < i10 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i10 - i) - 1);
        }
        this.f6270c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    public final boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
