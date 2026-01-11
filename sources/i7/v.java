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

public final class v extends c<Float> implements RandomAccess, z0 {

    /* renamed from: b  reason: collision with root package name */
    public float[] f6385b;

    /* renamed from: c  reason: collision with root package name */
    public int f6386c;

    static {
        new v(new float[0], 0).f6238a = false;
    }

    public v() {
        this(new float[10], 0);
    }

    public final z.d B(int i) {
        if (i >= this.f6386c) {
            return new v(Arrays.copyOf(this.f6385b, i), this.f6386c);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, Object obj) {
        int i10;
        float floatValue = ((Float) obj).floatValue();
        b();
        if (i < 0 || i > (i10 = this.f6386c)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        float[] fArr = this.f6385b;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i10 - i);
        } else {
            float[] fArr2 = new float[o.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f6385b, i, fArr2, i + 1, this.f6386c - i);
            this.f6385b = fArr2;
        }
        this.f6385b[i] = floatValue;
        this.f6386c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        b();
        Charset charset = z.f6396a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof v)) {
            return super.addAll(collection);
        }
        v vVar = (v) collection;
        int i = vVar.f6386c;
        if (i == 0) {
            return false;
        }
        int i10 = this.f6386c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i10 >= i) {
            int i11 = i10 + i;
            float[] fArr = this.f6385b;
            if (i11 > fArr.length) {
                this.f6385b = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(vVar.f6385b, 0, this.f6385b, this.f6386c, vVar.f6386c);
            this.f6386c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(float f10) {
        b();
        int i = this.f6386c;
        float[] fArr = this.f6385b;
        if (i == fArr.length) {
            float[] fArr2 = new float[o.a(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f6385b = fArr2;
        }
        float[] fArr3 = this.f6385b;
        int i10 = this.f6386c;
        this.f6386c = i10 + 1;
        fArr3[i10] = f10;
    }

    public final void e(int i) {
        if (i < 0 || i >= this.f6386c) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return super.equals(obj);
        }
        v vVar = (v) obj;
        if (this.f6386c != vVar.f6386c) {
            return false;
        }
        float[] fArr = vVar.f6385b;
        for (int i = 0; i < this.f6386c; i++) {
            if (Float.floatToIntBits(this.f6385b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i) {
        StringBuilder d10 = a.d("Index:", i, ", Size:");
        d10.append(this.f6386c);
        return d10.toString();
    }

    public final Object get(int i) {
        e(i);
        return Float.valueOf(this.f6385b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f6386c; i10++) {
            i = (i * 31) + Float.floatToIntBits(this.f6385b[i10]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        b();
        for (int i = 0; i < this.f6386c; i++) {
            if (obj.equals(Float.valueOf(this.f6385b[i]))) {
                float[] fArr = this.f6385b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f6386c - i) - 1);
                this.f6386c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i10) {
        b();
        if (i10 >= i) {
            float[] fArr = this.f6385b;
            System.arraycopy(fArr, i10, fArr, i, this.f6386c - i10);
            this.f6386c -= i10 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        e(i);
        float[] fArr = this.f6385b;
        float f10 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f6386c;
    }

    public v(float[] fArr, int i) {
        this.f6385b = fArr;
        this.f6386c = i;
    }

    public final Object remove(int i) {
        b();
        e(i);
        float[] fArr = this.f6385b;
        float f10 = fArr[i];
        int i10 = this.f6386c;
        if (i < i10 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i10 - i) - 1);
        }
        this.f6386c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }
}
