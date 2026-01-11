package ui;

import java.io.OutputStream;

public final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f12017a;

    /* renamed from: b  reason: collision with root package name */
    public final OutputStream f12018b;

    public b(OutputStream outputStream, OutputStream outputStream2) {
        this.f12017a = outputStream;
        this.f12018b = outputStream2;
    }

    public final void write(int i) {
        this.f12017a.write(i);
        this.f12018b.write(i);
    }
}
