package s;

import ge.g0;
import org.slf4j.helpers.MessageFormatter;

public final class h<E> implements Cloneable {

    /* renamed from: s  reason: collision with root package name */
    public static final Object f10844s = new Object();

    /* renamed from: a  reason: collision with root package name */
    public int[] f10845a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f10846b;

    /* renamed from: c  reason: collision with root package name */
    public int f10847c;

    public h() {
        int p10 = g0.p(10);
        this.f10845a = new int[p10];
        this.f10846b = new Object[p10];
    }

    public final void a(int i, E e10) {
        int i10 = this.f10847c;
        if (i10 == 0 || i > this.f10845a[i10 - 1]) {
            if (i10 >= this.f10845a.length) {
                int p10 = g0.p(i10 + 1);
                int[] iArr = new int[p10];
                Object[] objArr = new Object[p10];
                int[] iArr2 = this.f10845a;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f10846b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f10845a = iArr;
                this.f10846b = objArr;
            }
            this.f10845a[i10] = i;
            this.f10846b[i10] = e10;
            this.f10847c = i10 + 1;
            return;
        }
        g(i, e10);
    }

    /* renamed from: b */
    public final h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f10845a = (int[]) this.f10845a.clone();
            hVar.f10846b = (Object[]) this.f10846b.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final E c(int i, E e10) {
        int j10 = g0.j(this.f10845a, this.f10847c, i);
        if (j10 >= 0) {
            E[] eArr = this.f10846b;
            if (eArr[j10] != f10844s) {
                return eArr[j10];
            }
        }
        return e10;
    }

    public final int d(int i) {
        return this.f10845a[i];
    }

    public final void g(int i, E e10) {
        int j10 = g0.j(this.f10845a, this.f10847c, i);
        if (j10 >= 0) {
            this.f10846b[j10] = e10;
            return;
        }
        int i10 = ~j10;
        int i11 = this.f10847c;
        if (i10 < i11) {
            Object[] objArr = this.f10846b;
            if (objArr[i10] == f10844s) {
                this.f10845a[i10] = i;
                objArr[i10] = e10;
                return;
            }
        }
        if (i11 >= this.f10845a.length) {
            int p10 = g0.p(i11 + 1);
            int[] iArr = new int[p10];
            Object[] objArr2 = new Object[p10];
            int[] iArr2 = this.f10845a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f10846b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f10845a = iArr;
            this.f10846b = objArr2;
        }
        int i12 = this.f10847c - i10;
        if (i12 != 0) {
            int[] iArr3 = this.f10845a;
            int i13 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i13, i12);
            Object[] objArr4 = this.f10846b;
            System.arraycopy(objArr4, i10, objArr4, i13, this.f10847c - i10);
        }
        this.f10845a[i10] = i;
        this.f10846b[i10] = e10;
        this.f10847c++;
    }

    public final int h() {
        return this.f10847c;
    }

    public final E i(int i) {
        return this.f10846b[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return MessageFormatter.DELIM_STR;
        }
        StringBuilder sb2 = new StringBuilder(this.f10847c * 28);
        sb2.append(MessageFormatter.DELIM_START);
        for (int i = 0; i < this.f10847c; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i));
            sb2.append('=');
            Object i10 = i(i);
            if (i10 != this) {
                sb2.append(i10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(MessageFormatter.DELIM_STOP);
        return sb2.toString();
    }
}
