package i7;

import b9.m;
import c3.k;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

public abstract class i implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final f f6271b = new f(z.f6397b);

    /* renamed from: c  reason: collision with root package name */
    public static final d f6272c = (d.a() ? new g() : new b());

    /* renamed from: a  reason: collision with root package name */
    public int f6273a = 0;

    public static abstract class a implements Iterator {
        public final Object next() {
            return Byte.valueOf(((h) this).a());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b implements d {
        public final byte[] a(byte[] bArr, int i, int i10) {
            return Arrays.copyOfRange(bArr, i, i10 + i);
        }
    }

    public static final class c extends f {

        /* renamed from: t  reason: collision with root package name */
        public final int f6274t;

        /* renamed from: u  reason: collision with root package name */
        public final int f6275u;

        public c(byte[] bArr, int i, int i10) {
            super(bArr);
            i.d(i, i + i10, bArr.length);
            this.f6274t = i;
            this.f6275u = i10;
        }

        public final byte b(int i) {
            int i10 = this.f6275u;
            if (((i10 - (i + 1)) | i) >= 0) {
                return this.f6276s[this.f6274t + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(m.b("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(androidx.activity.result.d.b("Index > length: ", i, ", ", i10));
        }

        public final void g(byte[] bArr, int i) {
            System.arraycopy(this.f6276s, this.f6274t + 0, bArr, 0, i);
        }

        public final byte h(int i) {
            return this.f6276s[this.f6274t + i];
        }

        public final int p() {
            return this.f6274t;
        }

        public final int size() {
            return this.f6275u;
        }
    }

    public interface d {
        byte[] a(byte[] bArr, int i, int i10);
    }

    public static abstract class e extends i {
    }

    public static class f extends e {

        /* renamed from: s  reason: collision with root package name */
        public final byte[] f6276s;

        public f(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f6276s = bArr;
        }

        public byte b(int i) {
            return this.f6276s[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i) || size() != ((i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof f)) {
                return obj.equals(this);
            }
            f fVar = (f) obj;
            int i = this.f6273a;
            int i10 = fVar.f6273a;
            if (i != 0 && i10 != 0 && i != i10) {
                return false;
            }
            int size = size();
            if (size > fVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            } else if (0 + size <= fVar.size()) {
                byte[] bArr = this.f6276s;
                byte[] bArr2 = fVar.f6276s;
                int p10 = p() + size;
                int p11 = p();
                int p12 = fVar.p() + 0;
                while (p11 < p10) {
                    if (bArr[p11] != bArr2[p12]) {
                        return false;
                    }
                    p11++;
                    p12++;
                }
                return true;
            } else {
                throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + size + ", " + fVar.size());
            }
        }

        public void g(byte[] bArr, int i) {
            System.arraycopy(this.f6276s, 0, bArr, 0, i);
        }

        public byte h(int i) {
            return this.f6276s[i];
        }

        public final boolean i() {
            int p10 = p();
            return q1.e(this.f6276s, p10, size() + p10);
        }

        public final j j() {
            return j.f(this.f6276s, p(), size(), true);
        }

        public final int k(int i, int i10) {
            byte[] bArr = this.f6276s;
            int p10 = p() + 0;
            Charset charset = z.f6396a;
            for (int i11 = p10; i11 < p10 + i10; i11++) {
                i = (i * 31) + bArr[i11];
            }
            return i;
        }

        public final i l(int i) {
            int d10 = i.d(0, i, size());
            if (d10 == 0) {
                return i.f6271b;
            }
            return new c(this.f6276s, p() + 0, d10);
        }

        public final String n(Charset charset) {
            return new String(this.f6276s, p(), size(), charset);
        }

        public final void o(g gVar) throws IOException {
            gVar.a(this.f6276s, p(), size());
        }

        public int p() {
            return 0;
        }

        public int size() {
            return this.f6276s.length;
        }
    }

    public static final class g implements d {
        public final byte[] a(byte[] bArr, int i, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i, bArr2, 0, i10);
            return bArr2;
        }
    }

    public static int d(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a8.a.b("Beginning index: ", i, " < 0"));
        } else if (i10 < i) {
            throw new IndexOutOfBoundsException(androidx.activity.result.d.b("Beginning index larger than ending index: ", i, ", ", i10));
        } else {
            throw new IndexOutOfBoundsException(androidx.activity.result.d.b("End index: ", i10, " >= ", i11));
        }
    }

    public static i e(byte[] bArr, int i, int i10) {
        d(i, i + i10, bArr.length);
        return new f(f6272c.a(bArr, i, i10));
    }

    public abstract byte b(int i);

    public abstract boolean equals(Object obj);

    public abstract void g(byte[] bArr, int i);

    public abstract byte h(int i);

    public final int hashCode() {
        int i = this.f6273a;
        if (i == 0) {
            int size = size();
            i = k(size, size);
            if (i == 0) {
                i = 1;
            }
            this.f6273a = i;
        }
        return i;
    }

    public abstract boolean i();

    public final Iterator iterator() {
        return new h(this);
    }

    public abstract j j();

    public abstract int k(int i, int i10);

    public abstract i l(int i);

    public final byte[] m() {
        int size = size();
        if (size == 0) {
            return z.f6397b;
        }
        byte[] bArr = new byte[size];
        g(bArr, size);
        return bArr;
    }

    public abstract String n(Charset charset);

    public abstract void o(g gVar) throws IOException;

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = k.l0(this);
        } else {
            str = k.l0(l(47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
