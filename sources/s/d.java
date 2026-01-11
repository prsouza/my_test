package s;

import ge.g0;
import org.slf4j.helpers.MessageFormatter;

public final class d<E> implements Cloneable {

    /* renamed from: t  reason: collision with root package name */
    public static final Object f10817t = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f10818a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f10819b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f10820c;

    /* renamed from: s  reason: collision with root package name */
    public int f10821s;

    public d() {
        this(10);
    }

    public final void a(long j10, E e10) {
        int i = this.f10821s;
        if (i == 0 || j10 > this.f10819b[i - 1]) {
            if (this.f10818a && i >= this.f10819b.length) {
                d();
            }
            int i10 = this.f10821s;
            if (i10 >= this.f10819b.length) {
                int q10 = g0.q(i10 + 1);
                long[] jArr = new long[q10];
                Object[] objArr = new Object[q10];
                long[] jArr2 = this.f10819b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f10820c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f10819b = jArr;
                this.f10820c = objArr;
            }
            this.f10819b[i10] = j10;
            this.f10820c[i10] = e10;
            this.f10821s = i10 + 1;
            return;
        }
        i(j10, e10);
    }

    public final void b() {
        int i = this.f10821s;
        Object[] objArr = this.f10820c;
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = null;
        }
        this.f10821s = 0;
        this.f10818a = false;
    }

    /* renamed from: c */
    public final d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f10819b = (long[]) this.f10819b.clone();
            dVar.f10820c = (Object[]) this.f10820c.clone();
            return dVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void d() {
        int i = this.f10821s;
        long[] jArr = this.f10819b;
        Object[] objArr = this.f10820c;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            Object obj = objArr[i11];
            if (obj != f10817t) {
                if (i11 != i10) {
                    jArr[i10] = jArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        this.f10818a = false;
        this.f10821s = i10;
    }

    public final E g(long j10, E e10) {
        int k10 = g0.k(this.f10819b, this.f10821s, j10);
        if (k10 >= 0) {
            E[] eArr = this.f10820c;
            if (eArr[k10] != f10817t) {
                return eArr[k10];
            }
        }
        return e10;
    }

    public final long h(int i) {
        if (this.f10818a) {
            d();
        }
        return this.f10819b[i];
    }

    public final void i(long j10, E e10) {
        int k10 = g0.k(this.f10819b, this.f10821s, j10);
        if (k10 >= 0) {
            this.f10820c[k10] = e10;
            return;
        }
        int i = ~k10;
        int i10 = this.f10821s;
        if (i < i10) {
            Object[] objArr = this.f10820c;
            if (objArr[i] == f10817t) {
                this.f10819b[i] = j10;
                objArr[i] = e10;
                return;
            }
        }
        if (this.f10818a && i10 >= this.f10819b.length) {
            d();
            i = ~g0.k(this.f10819b, this.f10821s, j10);
        }
        int i11 = this.f10821s;
        if (i11 >= this.f10819b.length) {
            int q10 = g0.q(i11 + 1);
            long[] jArr = new long[q10];
            Object[] objArr2 = new Object[q10];
            long[] jArr2 = this.f10819b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f10820c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f10819b = jArr;
            this.f10820c = objArr2;
        }
        int i12 = this.f10821s;
        if (i12 - i != 0) {
            long[] jArr3 = this.f10819b;
            int i13 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i13, i12 - i);
            Object[] objArr4 = this.f10820c;
            System.arraycopy(objArr4, i, objArr4, i13, this.f10821s - i);
        }
        this.f10819b[i] = j10;
        this.f10820c[i] = e10;
        this.f10821s++;
    }

    public final int j() {
        if (this.f10818a) {
            d();
        }
        return this.f10821s;
    }

    public final E k(int i) {
        if (this.f10818a) {
            d();
        }
        return this.f10820c[i];
    }

    public final String toString() {
        if (j() <= 0) {
            return MessageFormatter.DELIM_STR;
        }
        StringBuilder sb2 = new StringBuilder(this.f10821s * 28);
        sb2.append(MessageFormatter.DELIM_START);
        for (int i = 0; i < this.f10821s; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i));
            sb2.append('=');
            Object k10 = k(i);
            if (k10 != this) {
                sb2.append(k10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(MessageFormatter.DELIM_STOP);
        return sb2.toString();
    }

    public d(int i) {
        this.f10818a = false;
        if (i == 0) {
            this.f10819b = g0.A;
            this.f10820c = g0.B;
            return;
        }
        int q10 = g0.q(i);
        this.f10819b = new long[q10];
        this.f10820c = new Object[q10];
    }
}
