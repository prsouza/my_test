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

public final class n extends c<Double> implements RandomAccess, z0 {

    /* renamed from: b  reason: collision with root package name */
    public double[] f6330b;

    /* renamed from: c  reason: collision with root package name */
    public int f6331c;

    static {
        new n(new double[0], 0).f6238a = false;
    }

    public n() {
        this(new double[10], 0);
    }

    public final z.d B(int i) {
        if (i >= this.f6331c) {
            return new n(Arrays.copyOf(this.f6330b, i), this.f6331c);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        b();
        if (i < 0 || i > (i10 = this.f6331c)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        double[] dArr = this.f6330b;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i10 - i);
        } else {
            double[] dArr2 = new double[o.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f6330b, i, dArr2, i + 1, this.f6331c - i);
            this.f6330b = dArr2;
        }
        this.f6330b[i] = doubleValue;
        this.f6331c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        b();
        Charset charset = z.f6396a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i = nVar.f6331c;
        if (i == 0) {
            return false;
        }
        int i10 = this.f6331c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i10 >= i) {
            int i11 = i10 + i;
            double[] dArr = this.f6330b;
            if (i11 > dArr.length) {
                this.f6330b = Arrays.copyOf(dArr, i11);
            }
            System.arraycopy(nVar.f6330b, 0, this.f6330b, this.f6331c, nVar.f6331c);
            this.f6331c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(double d10) {
        b();
        int i = this.f6331c;
        double[] dArr = this.f6330b;
        if (i == dArr.length) {
            double[] dArr2 = new double[o.a(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f6330b = dArr2;
        }
        double[] dArr3 = this.f6330b;
        int i10 = this.f6331c;
        this.f6331c = i10 + 1;
        dArr3[i10] = d10;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.f6331c) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.f6331c != nVar.f6331c) {
            return false;
        }
        double[] dArr = nVar.f6330b;
        for (int i = 0; i < this.f6331c; i++) {
            if (Double.doubleToLongBits(this.f6330b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i) {
        StringBuilder d10 = a.d("Index:", i, ", Size:");
        d10.append(this.f6331c);
        return d10.toString();
    }

    public final Object get(int i) {
        e(i);
        return Double.valueOf(this.f6330b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f6331c; i10++) {
            i = (i * 31) + z.b(Double.doubleToLongBits(this.f6330b[i10]));
        }
        return i;
    }

    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f6331c; i++) {
            if (obj.equals(Double.valueOf(this.f6330b[i]))) {
                double[] dArr = this.f6330b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f6331c - i) - 1);
                this.f6331c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i10) {
        b();
        if (i10 >= i) {
            double[] dArr = this.f6330b;
            System.arraycopy(dArr, i10, dArr, i, this.f6331c - i10);
            this.f6331c -= i10 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        b();
        e(i);
        double[] dArr = this.f6330b;
        double d10 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.f6331c;
    }

    public n(double[] dArr, int i) {
        this.f6330b = dArr;
        this.f6331c = i;
    }

    public final Object remove(int i) {
        b();
        e(i);
        double[] dArr = this.f6330b;
        double d10 = dArr[i];
        int i10 = this.f6331c;
        if (i < i10 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i10 - i) - 1);
        }
        this.f6331c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    public final boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }
}
