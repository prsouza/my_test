package fa;

import java.io.Closeable;

public final class c implements Closeable, CharSequence {

    /* renamed from: a  reason: collision with root package name */
    public final b f5046a = new b(1024);

    public final char charAt(int i) {
        int i10 = i * 2;
        byte a10 = this.f5046a.a(i10);
        return (char) ((this.f5046a.a(i10 + 1) & 255) | (a10 << 8));
    }

    public final void close() {
        this.f5046a.close();
    }

    public final int length() {
        return this.f5046a.f5044a.position() / 2;
    }

    public final CharSequence subSequence(int i, int i10) {
        if (i == 0 && i10 == length()) {
            return this;
        }
        return a.a(this, i, i10, d.RESTRICT);
    }

    public final String toString() {
        throw new UnsupportedOperationException();
    }
}
