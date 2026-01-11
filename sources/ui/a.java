package ui;

import e6.e;
import java.io.OutputStream;

public final class a extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f12016a;

    public a(OutputStream outputStream) {
        e.D(outputStream, "out");
        this.f12016a = outputStream;
    }

    public final void close() {
    }

    public final void write(int i) {
        this.f12016a.write(i);
    }
}
