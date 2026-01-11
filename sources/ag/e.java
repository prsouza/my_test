package ag;

import java.util.Objects;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final d[] f386d = new d[0];

    /* renamed from: a  reason: collision with root package name */
    public d[] f387a;

    /* renamed from: b  reason: collision with root package name */
    public int f388b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f389c;

    public e() {
        this(10);
    }

    public e(int i) {
        if (i >= 0) {
            this.f387a = i == 0 ? f386d : new d[i];
            this.f388b = 0;
            this.f389c = false;
            return;
        }
        throw new IllegalArgumentException("'initialCapacity' must not be negative");
    }

    public final void a(d dVar) {
        Objects.requireNonNull(dVar, "'element' cannot be null");
        d[] dVarArr = this.f387a;
        int length = dVarArr.length;
        boolean z = true;
        int i = this.f388b + 1;
        if (i <= length) {
            z = false;
        }
        if (this.f389c || z) {
            d[] dVarArr2 = new d[Math.max(dVarArr.length, (i >> 1) + i)];
            System.arraycopy(this.f387a, 0, dVarArr2, 0, this.f388b);
            this.f387a = dVarArr2;
            this.f389c = false;
        }
        this.f387a[this.f388b] = dVar;
        this.f388b = i;
    }

    public final d b(int i) {
        if (i < this.f388b) {
            return this.f387a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.f388b);
    }

    public final d[] c() {
        int i = this.f388b;
        if (i == 0) {
            return f386d;
        }
        d[] dVarArr = this.f387a;
        if (dVarArr.length == i) {
            this.f389c = true;
            return dVarArr;
        }
        d[] dVarArr2 = new d[i];
        System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
        return dVarArr2;
    }
}
