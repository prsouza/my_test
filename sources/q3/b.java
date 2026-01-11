package q3;

import i3.w;
import java.util.Objects;

public final class b implements w<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f10299a;

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.f10299a = bArr;
    }

    public final int b() {
        return this.f10299a.length;
    }

    public final Class<byte[]> c() {
        return byte[].class;
    }

    public final void d() {
    }

    public final Object get() {
        return this.f10299a;
    }
}
