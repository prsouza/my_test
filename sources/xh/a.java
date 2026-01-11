package xh;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a {

    /* renamed from: xh.a$a  reason: collision with other inner class name */
    public static class C0254a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T[] f13288a;

        /* renamed from: b  reason: collision with root package name */
        public int f13289b = 0;

        public C0254a(T[] tArr) {
            this.f13288a = tArr;
        }

        public final boolean hasNext() {
            return this.f13289b < this.f13288a.length;
        }

        public final T next() {
            int i = this.f13289b;
            T[] tArr = this.f13288a;
            if (i != tArr.length) {
                this.f13289b = i + 1;
                return tArr[i];
            }
            StringBuilder d10 = a.a.d("Out of elements: ");
            d10.append(this.f13289b);
            throw new NoSuchElementException(d10.toString());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static short[] b(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            return (byte[]) bArr.clone();
        }
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] d(byte[] bArr, int i, int i10) {
        int i11 = i10 - i;
        if (i11 >= 0) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i11));
            return bArr2;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ");
        stringBuffer.append(i10);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int e(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static int f(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    public static int g(int[] iArr, int i) {
        if (iArr == null) {
            return 0;
        }
        int i10 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ iArr[0 + i];
        }
    }

    public static int h(long[] jArr, int i) {
        if (jArr == null) {
            return 0;
        }
        int i10 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i10;
            }
            long j10 = jArr[0 + i];
            i10 = (((i10 * 257) ^ ((int) j10)) * 257) ^ ((int) (j10 >>> 32));
        }
    }

    public static int i(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArr[length] & 255);
        }
    }

    public static int j(short[][] sArr) {
        int i = 0;
        for (int i10 = 0; i10 != sArr.length; i10++) {
            i = (i * 257) + i(sArr[i10]);
        }
        return i;
    }
}
