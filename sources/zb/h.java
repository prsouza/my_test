package zb;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import zb.n;

public abstract class h implements Iterable<Byte>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final d f14304b = new d(t.f14378b);

    /* renamed from: c  reason: collision with root package name */
    public static final b f14305c;

    /* renamed from: a  reason: collision with root package name */
    public int f14306a = 0;

    public static final class a implements b {
        public final byte[] a(byte[] bArr, int i, int i10) {
            return Arrays.copyOfRange(bArr, i, i10 + i);
        }
    }

    public interface b {
        byte[] a(byte[] bArr, int i, int i10);
    }

    public static abstract class c extends h {
        public final Iterator iterator() {
            return new g(this);
        }
    }

    public static class d extends c {

        /* renamed from: s  reason: collision with root package name */
        public final byte[] f14307s;

        public d(byte[] bArr) {
            this.f14307s = bArr;
        }

        public final int b(int i, int i10) {
            byte[] bArr = this.f14307s;
            Charset charset = t.f14377a;
            for (int i11 = 0; i11 < 0 + i10; i11++) {
                i = (i * 31) + bArr[i11];
            }
            return i;
        }

        public final void e(android.support.v4.media.b bVar) {
            byte[] bArr = this.f14307s;
            ((n.b) bVar).Y2(bArr, bArr.length);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || this.f14307s.length != ((h) obj).size()) {
                return false;
            }
            byte[] bArr = this.f14307s;
            if (bArr.length == 0) {
                return true;
            }
            if (!(obj instanceof d)) {
                return obj.equals(this);
            }
            d dVar = (d) obj;
            int i = this.f14306a;
            int i10 = dVar.f14306a;
            if (i != 0 && i10 != 0 && i != i10) {
                return false;
            }
            int length = bArr.length;
            byte[] bArr2 = dVar.f14307s;
            if (length <= bArr2.length) {
                int i11 = length + 0;
                if (i11 <= bArr2.length) {
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < i11) {
                        if (bArr[i12] != bArr2[i13]) {
                            return false;
                        }
                        i12++;
                        i13++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + length + ", " + dVar.f14307s.length);
            }
            throw new IllegalArgumentException("Length too large: " + length + this.f14307s.length);
        }

        public final void g(byte[] bArr, int i) {
            System.arraycopy(this.f14307s, 0, bArr, 0, i);
        }

        public final byte h(int i) {
            return this.f14307s[i];
        }

        public final int size() {
            return this.f14307s.length;
        }
    }

    public static final class e implements b {
        public final byte[] a(byte[] bArr, int i, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i, bArr2, 0, i10);
            return bArr2;
        }
    }

    static {
        boolean z;
        b bVar;
        try {
            Class.forName("android.content.Context");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (z) {
            bVar = new e();
        } else {
            bVar = new a();
        }
        f14305c = bVar;
    }

    public static h d(byte[] bArr) {
        return new d(f14305c.a(bArr, 0, bArr.length));
    }

    public abstract int b(int i, int i10);

    public abstract void e(android.support.v4.media.b bVar);

    public abstract boolean equals(Object obj);

    public abstract void g(byte[] bArr, int i);

    public abstract byte h(int i);

    public final int hashCode() {
        int i = this.f14306a;
        if (i == 0) {
            int size = size();
            i = b(size, size);
            if (i == 0) {
                i = 1;
            }
            this.f14306a = i;
        }
        return i;
    }

    public final byte[] i() {
        int size = size();
        if (size == 0) {
            return t.f14378b;
        }
        byte[] bArr = new byte[size];
        g(bArr, size);
        return bArr;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public Iterator iterator() {
        return new g(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }
}
