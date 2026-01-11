package ui;

import e6.e;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class d extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f12020a;

    /* renamed from: b  reason: collision with root package name */
    public int f12021b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12022c;

    public d(int i) {
        this.f12022c = i;
        this.f12020a = ByteBuffer.allocate(i);
    }

    public final byte[] a() {
        int i = this.f12021b;
        int i10 = this.f12022c;
        if (i < i10) {
            byte[] array = this.f12020a.array();
            e.C(array, "window.array()");
            return nd.d.H(array, 0, this.f12021b);
        }
        int i11 = (i - i10) % i10;
        byte[] array2 = this.f12020a.array();
        e.C(array2, "window.array()");
        byte[] H = nd.d.H(array2, i11, this.f12022c);
        byte[] array3 = this.f12020a.array();
        e.C(array3, "window.array()");
        return nd.d.J(H, nd.d.H(array3, 0, i11));
    }

    public final void write(int i) {
        this.f12021b++;
        this.f12020a.put((byte) i);
        if (this.f12020a.remaining() == 0) {
            this.f12020a.position(0);
        }
    }
}
