package ce;

import java.util.Iterator;

public class a implements Iterable<Integer>, zd.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f3430a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3431b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3432c;

    public a(int i, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i11 != Integer.MIN_VALUE) {
            this.f3430a = i;
            if (i11 > 0) {
                if (i < i10) {
                    int i12 = i10 % i11;
                    int i13 = i % i11;
                    int i14 = ((i12 < 0 ? i12 + i11 : i12) - (i13 < 0 ? i13 + i11 : i13)) % i11;
                    i10 -= i14 < 0 ? i14 + i11 : i14;
                }
            } else if (i11 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i > i10) {
                int i15 = -i11;
                int i16 = i % i15;
                int i17 = i10 % i15;
                int i18 = ((i16 < 0 ? i16 + i15 : i16) - (i17 < 0 ? i17 + i15 : i17)) % i15;
                i10 += i18 < 0 ? i18 + i15 : i18;
            }
            this.f3431b = i10;
            this.f3432c = i11;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.f3430a == aVar.f3430a && this.f3431b == aVar.f3431b && this.f3432c == aVar.f3432c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f3430a * 31) + this.f3431b) * 31) + this.f3432c;
    }

    public boolean isEmpty() {
        if (this.f3432c > 0) {
            if (this.f3430a > this.f3431b) {
                return true;
            }
        } else if (this.f3430a < this.f3431b) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new b(this.f3430a, this.f3431b, this.f3432c);
    }

    public String toString() {
        int i;
        StringBuilder sb2;
        if (this.f3432c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f3430a);
            sb2.append("..");
            sb2.append(this.f3431b);
            sb2.append(" step ");
            i = this.f3432c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f3430a);
            sb2.append(" downTo ");
            sb2.append(this.f3431b);
            sb2.append(" step ");
            i = -this.f3432c;
        }
        sb2.append(i);
        return sb2.toString();
    }
}
