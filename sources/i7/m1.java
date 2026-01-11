package i7;

import i7.a0;
import i7.u1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public final class m1 {

    /* renamed from: f  reason: collision with root package name */
    public static final m1 f6324f = new m1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f6325a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f6326b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f6327c;

    /* renamed from: d  reason: collision with root package name */
    public int f6328d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6329e;

    public m1() {
        this(0, new int[8], new Object[8], true);
    }

    public static void c(int i, Object obj, u1 u1Var) throws IOException {
        int i10 = i >>> 3;
        int i11 = i & 7;
        if (i11 == 0) {
            ((m) u1Var).j(i10, ((Long) obj).longValue());
        } else if (i11 == 1) {
            ((m) u1Var).f(i10, ((Long) obj).longValue());
        } else if (i11 == 2) {
            ((m) u1Var).b(i10, (i) obj);
        } else if (i11 == 3) {
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar);
            u1.a aVar = u1.a.ASCENDING;
            mVar.f6323a.P(i10, 3);
            ((m1) obj).d(u1Var);
            mVar.f6323a.P(i10, 4);
        } else if (i11 == 5) {
            ((m) u1Var).e(i10, ((Integer) obj).intValue());
        } else {
            int i12 = a0.f6234a;
            throw new RuntimeException(new a0.a());
        }
    }

    public final int a() {
        int i;
        int i10 = this.f6328d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f6325a; i12++) {
            int i13 = this.f6326b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                i = l.z(i14, ((Long) this.f6327c[i12]).longValue());
            } else if (i15 == 1) {
                ((Long) this.f6327c[i12]).longValue();
                i = l.h(i14);
            } else if (i15 == 2) {
                i = l.c(i14, (i) this.f6327c[i12]);
            } else if (i15 == 3) {
                i11 = ((m1) this.f6327c[i12]).a() + (l.w(i14) * 2) + i11;
            } else if (i15 == 5) {
                ((Integer) this.f6327c[i12]).intValue();
                i = l.g(i14);
            } else {
                int i16 = a0.f6234a;
                throw new IllegalStateException(new a0.a());
            }
            i11 = i + i11;
        }
        this.f6328d = i11;
        return i11;
    }

    public final void b(int i, Object obj) {
        if (this.f6329e) {
            int i10 = this.f6325a;
            int[] iArr = this.f6326b;
            if (i10 == iArr.length) {
                int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
                this.f6326b = Arrays.copyOf(iArr, i11);
                this.f6327c = Arrays.copyOf(this.f6327c, i11);
            }
            int[] iArr2 = this.f6326b;
            int i12 = this.f6325a;
            iArr2[i12] = i;
            this.f6327c[i12] = obj;
            this.f6325a = i12 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(u1 u1Var) throws IOException {
        if (this.f6325a != 0) {
            Objects.requireNonNull((m) u1Var);
            u1.a aVar = u1.a.ASCENDING;
            for (int i = 0; i < this.f6325a; i++) {
                c(this.f6326b[i], this.f6327c[i], u1Var);
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        int i = this.f6325a;
        if (i == m1Var.f6325a) {
            int[] iArr = this.f6326b;
            int[] iArr2 = m1Var.f6326b;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    z = true;
                    break;
                } else if (iArr[i10] != iArr2[i10]) {
                    z = false;
                    break;
                } else {
                    i10++;
                }
            }
            if (z) {
                Object[] objArr = this.f6327c;
                Object[] objArr2 = m1Var.f6327c;
                int i11 = this.f6325a;
                int i12 = 0;
                while (true) {
                    if (i12 >= i11) {
                        z10 = true;
                        break;
                    } else if (!objArr[i12].equals(objArr2[i12])) {
                        z10 = false;
                        break;
                    } else {
                        i12++;
                    }
                }
                return z10;
            }
        }
    }

    public final int hashCode() {
        int i = this.f6325a;
        int i10 = (527 + i) * 31;
        int[] iArr = this.f6326b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f6327c;
        int i15 = this.f6325a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }

    public m1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f6328d = -1;
        this.f6325a = i;
        this.f6326b = iArr;
        this.f6327c = objArr;
        this.f6329e = z;
    }
}
