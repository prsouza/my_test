package uf;

import e6.e;
import java.io.OutputStream;

public final class f extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f11954a;

    public f(e eVar) {
        this.f11954a = eVar;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        return this.f11954a + ".outputStream()";
    }

    public final void write(int i) {
        this.f11954a.y0(i);
    }

    public final void write(byte[] bArr, int i, int i10) {
        e.D(bArr, "data");
        this.f11954a.w0(bArr, i, i10);
    }
}
